package w7;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class e8 {
    public static boolean a(int i10, CharSequence charSequence) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i10);
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
                    case zs.v0 /* 58 */:
                    case zs.w0 /* 59 */:
                    case zs.x0 /* 60 */:
                    case zs.y0 /* 61 */:
                    case zs.z0 /* 62 */:
                    case zs.A0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case zs.c1 /* 91 */:
                            case zs.d1 /* 92 */:
                            case zs.e1 /* 93 */:
                            case zs.f1 /* 94 */:
                            case zs.g1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case zs.H1 /* 123 */:
                                    case zs.I1 /* 124 */:
                                    case zs.J1 /* 125 */:
                                    case zs.K1 /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int c(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
