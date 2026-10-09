package sc;

import androidx.car.app.navigation.model.Maneuver;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.b;
        String str = this.a;
        if (i13 >= i14) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    public final char b() {
        int i10;
        int i11;
        int i12 = this.c + 1;
        this.c = i12;
        int i13 = this.b;
        if (i12 == i13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        char c10 = this.g[i12];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int a2 = a(i12);
                            this.c++;
                            if (a2 < 128) {
                                return (char) a2;
                            }
                            if (a2 < 192 || a2 > 247) {
                                return '?';
                            }
                            if (a2 <= 223) {
                                i10 = a2 & 31;
                                i11 = 1;
                            } else if (a2 <= 239) {
                                i10 = a2 & 15;
                                i11 = 2;
                            } else {
                                i10 = a2 & 7;
                                i11 = 3;
                            }
                            for (int i14 = 0; i14 < i11; i14++) {
                                int i15 = this.c;
                                int i16 = i15 + 1;
                                this.c = i16;
                                if (i16 == i13 || this.g[i16] != '\\') {
                                    return '?';
                                }
                                int i17 = i15 + 2;
                                this.c = i17;
                                int a10 = a(i17);
                                this.c++;
                                if ((a10 & 192) != 128) {
                                    return '?';
                                }
                                i10 = (i10 << 6) + (a10 & 63);
                            }
                            return (char) i10;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    return c10;
            }
        }
        return c10;
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        char c11;
        char c12;
        while (true) {
            i10 = this.c;
            i11 = this.b;
            if (i10 >= i11 || this.g[i10] != ' ') {
                break;
            }
            this.c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.d = i10;
        this.c = i10 + 1;
        while (true) {
            i12 = this.c;
            if (i12 >= i11 || (c12 = this.g[i12]) == '=' || c12 == ' ') {
                break;
            }
            this.c = i12 + 1;
        }
        String str = this.a;
        if (i12 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.e = i12;
        if (this.g[i12] == ' ') {
            while (true) {
                i13 = this.c;
                if (i13 >= i11 || (c11 = this.g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.c = i13 + 1;
            }
            if (this.g[i13] != '=' || i13 == i11) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.c++;
        while (true) {
            int i14 = this.c;
            if (i14 >= i11 || this.g[i14] != ' ') {
                break;
            }
            this.c = i14 + 1;
        }
        int i15 = this.e;
        int i16 = this.d;
        if (i15 - i16 > 4) {
            char[] cArr = this.g;
            if (cArr[i16 + 3] == '.' && (((c10 = cArr[i16]) == 'O' || c10 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                this.d = i16 + 4;
            }
        }
        char[] cArr2 = this.g;
        int i17 = this.d;
        return new String(cArr2, i17, i15 - i17);
    }
}
