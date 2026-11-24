// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ose {
    public static boolean a(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case nm7.u0 /* 58 */:
                    case nm7.v0 /* 59 */:
                    case nm7.w0 /* 60 */:
                    case nm7.x0 /* 61 */:
                    case nm7.y0 /* 62 */:
                    case nm7.z0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case nm7.b1 /* 91 */:
                            case nm7.c1 /* 92 */:
                            case nm7.d1 /* 93 */:
                            case nm7.e1 /* 94 */:
                            case nm7.f1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case nm7.G1 /* 123 */:
                                    case nm7.H1 /* 124 */:
                                    case nm7.I1 /* 125 */:
                                    case nm7.J1 /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c, String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int c(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }
}
