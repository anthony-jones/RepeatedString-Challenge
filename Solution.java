public static long repeatedString(String s, long n) {
        long multiplier = n / s.length();
        long remainder = n % s.length();
        long count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        count *= multiplier;
        String substring = s.substring(0, (int) (remainder));
        System.out.println(substring);
        for(int j = 0; j < substring.length(); j++){
            if(s.charAt(j) == 'a'){
                count++;
            }
        }
        return count;
}
