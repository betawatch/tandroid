// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ub3 {
    public static final pe3 a;

    static {
        String str;
        pe3 pe3Var;
        int i = ifb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            jd3 jd3Var = up3.a;
            ie5 ie5Var = vi6.a;
            ie5 ie5Var2 = ie5Var.e;
            pe3Var = ie5Var;
            if (ie5Var == null) {
                pe3Var = tb3.w;
            }
        } else {
            pe3Var = tb3.w;
        }
        a = pe3Var;
    }
}
