package rc;

import javax.security.auth.x500.X500Principal;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public e(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final int a(int i7) {
        int i10;
        int i11;
        int i12 = i7 + 1;
        int i13 = this.b;
        String str = this.a;
        if (i12 >= i13) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.g;
        char c10 = cArr[i7];
        if (c10 >= '0' && c10 <= '9') {
            i10 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i10 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i10 = c10 - '7';
        }
        char c11 = cArr[i12];
        if (c11 >= '0' && c11 <= '9') {
            i11 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i11 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i11 = c11 - '7';
        }
        return (i10 << 4) + i11;
    }

    public final char b() {
        int i7;
        int i10;
        int i11 = this.c + 1;
        this.c = i11;
        int i12 = this.b;
        if (i11 == i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        char c10 = this.g[i11];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case qs.w0 /* 59 */:
                        case qs.x0 /* 60 */:
                        case qs.y0 /* 61 */:
                        case qs.z0 /* 62 */:
                            break;
                        default:
                            int a10 = a(i11);
                            this.c++;
                            if (a10 < 128) {
                                return (char) a10;
                            }
                            if (a10 < 192 || a10 > 247) {
                                return '?';
                            }
                            if (a10 <= 223) {
                                i7 = a10 & 31;
                                i10 = 1;
                            } else if (a10 <= 239) {
                                i7 = a10 & 15;
                                i10 = 2;
                            } else {
                                i7 = a10 & 7;
                                i10 = 3;
                            }
                            for (int i13 = 0; i13 < i10; i13++) {
                                int i14 = this.c;
                                int i15 = i14 + 1;
                                this.c = i15;
                                if (i15 == i12 || this.g[i15] != '\\') {
                                    return '?';
                                }
                                int i16 = i14 + 2;
                                this.c = i16;
                                int a11 = a(i16);
                                this.c++;
                                if ((a11 & qs.W2) != 128) {
                                    return '?';
                                }
                                i7 = (i7 << 6) + (a11 & 63);
                            }
                            return (char) i7;
                    }
                case '*':
                case '+':
                case ',':
                    return c10;
            }
        }
        return c10;
    }

    public final String c() {
        int i7;
        int i10;
        int i11;
        char c10;
        int i12;
        char c11;
        char c12;
        while (true) {
            i7 = this.c;
            i10 = this.b;
            if (i7 >= i10 || this.g[i7] != ' ') {
                break;
            }
            this.c = i7 + 1;
        }
        if (i7 == i10) {
            return null;
        }
        this.d = i7;
        this.c = i7 + 1;
        while (true) {
            i11 = this.c;
            if (i11 >= i10 || (c12 = this.g[i11]) == '=' || c12 == ' ') {
                break;
            }
            this.c = i11 + 1;
        }
        String str = this.a;
        if (i11 >= i10) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.e = i11;
        if (this.g[i11] == ' ') {
            while (true) {
                i12 = this.c;
                if (i12 >= i10 || (c11 = this.g[i12]) == '=' || c11 != ' ') {
                    break;
                }
                this.c = i12 + 1;
            }
            if (this.g[i12] != '=' || i12 == i10) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.c++;
        while (true) {
            int i13 = this.c;
            if (i13 >= i10 || this.g[i13] != ' ') {
                break;
            }
            this.c = i13 + 1;
        }
        int i14 = this.e;
        int i15 = this.d;
        if (i14 - i15 > 4) {
            char[] cArr = this.g;
            if (cArr[i15 + 3] == '.' && (((c10 = cArr[i15]) == 'O' || c10 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                this.d = i15 + 4;
            }
        }
        char[] cArr2 = this.g;
        int i16 = this.d;
        return new String(cArr2, i16, i14 - i16);
    }
}
