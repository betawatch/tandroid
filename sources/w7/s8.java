package w7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class s8 {
    public static String a(String str) {
        if (d(str)) {
            return null;
        }
        return "American Express".equalsIgnoreCase(str) ? "American Express" : "MasterCard".equalsIgnoreCase(str) ? "MasterCard" : "Diners Club".equalsIgnoreCase(str) ? "Diners Club" : "Discover".equalsIgnoreCase(str) ? "Discover" : "JCB".equalsIgnoreCase(str) ? "JCB" : "Visa".equalsIgnoreCase(str) ? "Visa" : "Unknown";
    }

    public static String b(String str) {
        if (d(str)) {
            return null;
        }
        return "credit".equalsIgnoreCase(str) ? "credit" : "debit".equalsIgnoreCase(str) ? "debit" : "prepaid".equalsIgnoreCase(str) ? "prepaid" : "unknown";
    }

    public static boolean c(String str, String... strArr) {
        if (str != null) {
            for (String str2 : strArr) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String e(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }
}
