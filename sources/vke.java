// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class vke {
    public static ga4 a(long j, int i, long j2, float f, float f2, float f3, float f4, fa4 fa4Var) {
        float f5 = f4 - f3;
        float max = Math.max(f, f3);
        float min = Math.min(f2, f4);
        if (f5 <= 0.0f || max >= min) {
            return null;
        }
        float f6 = f2 - f;
        if (min - max >= Math.min(f6, f5) / 2.0f) {
            return new ga4(j, i, j2, max - f, min - f, f6, f5, fa4Var);
        }
        return null;
    }

    public static String b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.indexOf(58) > 0 ? str.substring(0, str.indexOf(58)).toLowerCase() : "";
        String lowerCase2 = str.toLowerCase();
        if (str.startsWith("@") || lowerCase.equals("tg")) {
            return "in_app";
        }
        if (!lowerCase.equals("http") && !lowerCase.equals("https") && !lowerCase.equals("tonsite")) {
            return null;
        }
        String str2 = lowerCase2.substring(lowerCase.length() + 1).replaceFirst("^//", "").split("[/?#:]", 2)[0];
        return (str2.equals("telegra.ph") || str2.equals("te.legra.ph") || str2.equals("graph.org")) ? "iv" : (str2.equals("telegram.org") && lowerCase2.matches(".*telegram\\.org/(faq|privacy|blog).*")) ? "iv" : !z ? "external" : "in_app";
    }
}
