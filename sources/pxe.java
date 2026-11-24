// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pxe {
    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case nm7.u0 /* 58 */:
                    case nm7.v0 /* 59 */:
                    case nm7.w0 /* 60 */:
                    case nm7.x0 /* 61 */:
                    case nm7.y0 /* 62 */:
                    case nm7.z0 /* 63 */:
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case nm7.b1 /* 91 */:
                            case nm7.c1 /* 92 */:
                            case nm7.d1 /* 93 */:
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }
}
