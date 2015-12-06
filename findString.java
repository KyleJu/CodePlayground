    public static void main(String[] args) {
        String s = "dajfpodafkadfjaso";
        String[] str = {"dafka", "dfjdf", "dfaas"};
        Arrays.sort(str);
        boolean[] memo = new boolean[str.length];
        Arrays.fill(memo, false);
        int range =5;
        for (int i =0; i + range < s.length(); i++) {
            String subs = s.substring(i,i+range);              // I can use a rolling sum here
            if (Arrays.binarySearch(str, subs) >=0) {
                System.out.println(str[Arrays.binarySearch(str, subs)]);
            }

        }
