package w7;

import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    case at.v0 /* 58 */:
                    case at.w0 /* 59 */:
                    case at.x0 /* 60 */:
                    case at.y0 /* 61 */:
                    case at.z0 /* 62 */:
                    case at.A0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case at.c1 /* 91 */:
                            case at.d1 /* 92 */:
                            case at.e1 /* 93 */:
                            case at.f1 /* 94 */:
                            case at.g1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case at.H1 /* 123 */:
                                    case at.I1 /* 124 */:
                                    case at.J1 /* 125 */:
                                    case at.K1 /* 126 */:
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
