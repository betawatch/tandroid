package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class r6 {
    public static boolean a(String str, String str2) {
        int i10;
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            while (i10 < length) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                i10 = (charAt == charAt2 || ((c10 = (char) ((charAt | ' ') + (-97))) < 26 && c10 == ((char) ((charAt2 | ' ') + (-97))))) ? i10 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
