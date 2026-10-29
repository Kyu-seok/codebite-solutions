class ListCoder {
    public String pack(List<String> messages) {
        StringBuilder sb = new StringBuilder();

        for (String message : messages) {
            sb.append(message.length());
            sb.append("#");
            sb.append(message);
        }

        return sb.toString();
    }

    public List<String> unpack(String blob) {
        List<String> messages = new ArrayList<>();

        int i = 0;

        while (i < blob.length()) {
            int j = blob.indexOf("#", i);
            int size = Integer.parseInt(blob.substring(i, j));
            i = j + 1;
            String message = blob.substring(i, i + size);
            i += size;

            messages.add(message);
        }

        return messages;
    }
}
