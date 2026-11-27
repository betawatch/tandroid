// default package

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class wm7 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};

    public static void a(sj0 sj0Var, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (sj0Var.d() < 11) {
                throw lo4.a();
            }
            int f = sj0Var.f(11);
            sb.append(f(f / 45));
            sb.append(f(f % 45));
            i -= 2;
        }
        if (i == 1) {
            if (sj0Var.d() < 6) {
                throw lo4.a();
            }
            sb.append(f(sj0Var.f(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(sj0 sj0Var, StringBuilder sb, int i, jk1 jk1Var, ArrayList arrayList) {
        Charset forName;
        boolean z;
        byte b;
        if ((i << 3) > sj0Var.d()) {
            throw lo4.a();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) sj0Var.f(8);
        }
        if (jk1Var == null) {
            Charset charset = bdb.b;
            boolean z2 = true;
            if (i <= 2 || !(((b = bArr[0]) == -2 && bArr[1] == -1) || (b == -1 && bArr[1] == -2))) {
                boolean z3 = charset != null;
                boolean z4 = i > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z5 = z3;
                boolean z6 = true;
                while (i6 < i && (z2 || z5 || z6)) {
                    Charset charset2 = charset;
                    byte b2 = bArr[i6];
                    boolean z7 = z2;
                    int i15 = b2 & 255;
                    if (z6) {
                        if (i7 <= 0) {
                            z = z6;
                            if ((b2 & 128) != 0) {
                                if ((b2 & 64) != 0) {
                                    int i16 = i7 + 1;
                                    if ((b2 & 32) == 0) {
                                        i9++;
                                    } else {
                                        i16 = i7 + 2;
                                        if ((b2 & 16) == 0) {
                                            i10++;
                                        } else {
                                            i7 += 3;
                                            if ((b2 & 8) == 0) {
                                                i11++;
                                            }
                                        }
                                    }
                                    i7 = i16;
                                }
                            }
                        } else if ((b2 & 128) != 0) {
                            i7--;
                            if (z7) {
                                if (i15 > 127 && i15 < 160) {
                                    z7 = false;
                                } else if (i15 > 159 && (i15 < 192 || i15 == 215 || i15 == 247)) {
                                    i12++;
                                }
                            }
                            if (z5) {
                                if (i8 > 0) {
                                    if (i15 >= 64 && i15 != 127 && i15 <= 252) {
                                        i8--;
                                    }
                                    z5 = false;
                                } else {
                                    if (i15 != 128 && i15 != 160 && i15 <= 239) {
                                        if (i15 <= 160 || i15 >= 224) {
                                            if (i15 > 127) {
                                                i8++;
                                                int i17 = i13 + 1;
                                                if (i17 > i4) {
                                                    i4 = i17;
                                                    i13 = i4;
                                                } else {
                                                    i13 = i17;
                                                }
                                            } else {
                                                i13 = 0;
                                            }
                                            i14 = 0;
                                        } else {
                                            i5++;
                                            int i18 = i14 + 1;
                                            if (i18 > i2) {
                                                i2 = i18;
                                                i14 = i2;
                                            } else {
                                                i14 = i18;
                                            }
                                            i13 = 0;
                                        }
                                    }
                                    z5 = false;
                                }
                            }
                            i6++;
                            charset = charset2;
                            z2 = z7;
                        }
                        z6 = false;
                        if (z7) {
                        }
                        if (z5) {
                        }
                        i6++;
                        charset = charset2;
                        z2 = z7;
                    } else {
                        z = z6;
                    }
                    z6 = z;
                    if (z7) {
                    }
                    if (z5) {
                    }
                    i6++;
                    charset = charset2;
                    z2 = z7;
                }
                Charset charset3 = charset;
                boolean z8 = z2;
                boolean z9 = z6;
                boolean z10 = (!z9 || i7 <= 0) ? z9 : false;
                boolean z11 = (!z5 || i8 <= 0) ? z5 : false;
                if (!z10 || (!z4 && i9 + i10 + i11 <= 0)) {
                    if (!z11 || (!bdb.d && i2 < 3 && i4 < 3)) {
                        if (z8) {
                            if (!z11) {
                                forName = StandardCharsets.ISO_8859_1;
                            } else if ((i2 != 2 || i5 != 2) && i12 * 10 < i) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (!z11) {
                            forName = z10 ? StandardCharsets.UTF_8 : bdb.a;
                        }
                    }
                    forName = charset3;
                } else {
                    forName = StandardCharsets.UTF_8;
                }
            } else {
                forName = StandardCharsets.UTF_16;
            }
        } else {
            forName = Charset.forName(jk1Var.name());
        }
        sb.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(sj0 sj0Var, StringBuilder sb, int i) {
        if (bdb.c == null) {
            throw lo4.a();
        }
        if (i * 13 > sj0Var.d()) {
            throw lo4.a();
        }
        byte[] bArr = new byte[i << 1];
        int i2 = 0;
        while (i > 0) {
            int f = sj0Var.f(13);
            int i3 = ((f / 96) << 8) | (f % 96);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & jn7.d4);
            bArr[i2 + 1] = (byte) (i4 & jn7.d4);
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, bdb.c));
    }

    public static void d(sj0 sj0Var, StringBuilder sb, int i) {
        if (bdb.b == null) {
            throw lo4.a();
        }
        if (i * 13 > sj0Var.d()) {
            throw lo4.a();
        }
        byte[] bArr = new byte[i << 1];
        int i2 = 0;
        while (i > 0) {
            int f = sj0Var.f(13);
            int i3 = ((f / jn7.V2) << 8) | (f % jn7.V2);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, bdb.b));
    }

    public static void e(sj0 sj0Var, StringBuilder sb, int i) {
        while (i >= 3) {
            if (sj0Var.d() < 10) {
                throw lo4.a();
            }
            int f = sj0Var.f(10);
            if (f >= 1000) {
                throw lo4.a();
            }
            sb.append(f(f / 100));
            sb.append(f((f / 10) % 10));
            sb.append(f(f % 10));
            i -= 3;
        }
        if (i == 2) {
            if (sj0Var.d() < 7) {
                throw lo4.a();
            }
            int f2 = sj0Var.f(7);
            if (f2 >= 100) {
                throw lo4.a();
            }
            sb.append(f(f2 / 10));
            sb.append(f(f2 % 10));
            return;
        }
        if (i == 1) {
            if (sj0Var.d() < 4) {
                throw lo4.a();
            }
            int f3 = sj0Var.f(4);
            if (f3 >= 10) {
                throw lo4.a();
            }
            sb.append(f(f3));
        }
    }

    public static char f(int i) {
        if (i < 45) {
            return a[i];
        }
        throw lo4.a();
    }
}
