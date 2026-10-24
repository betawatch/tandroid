package w7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class o9 {
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
