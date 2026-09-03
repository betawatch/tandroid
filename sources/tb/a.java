package tb;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import p2.g;
import pb.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(g gVar, StringBuilder sb, int i10, boolean z4) {
        while (i10 > 1) {
            if (gVar.d() < 11) {
                throw ob.c.a();
            }
            int f10 = gVar.f(11);
            sb.append(f(f10 / 45));
            sb.append(f(f10 % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (gVar.d() < 6) {
                throw ob.c.a();
            }
            sb.append(f(gVar.f(6)));
        }
        if (z4) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i11 = length + 1;
                        if (sb.charAt(i11) == '%') {
                            sb.deleteCharAt(i11);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(g gVar, StringBuilder sb, int i10, pb.c cVar, ArrayList arrayList) {
        Charset forName;
        boolean z4;
        byte b10;
        if (i10 * 8 > gVar.d()) {
            throw ob.c.a();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gVar.f(8);
        }
        if (cVar == null) {
            Charset charset = h.b;
            boolean z10 = true;
            if (i10 <= 2 || !(((b10 = bArr[0]) == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2))) {
                boolean z11 = charset != null;
                boolean z12 = i10 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                boolean z13 = z11;
                int i13 = 0;
                boolean z14 = true;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i15 < i10 && (z10 || z13 || z14)) {
                    Charset charset2 = charset;
                    byte b11 = bArr[i15];
                    boolean z15 = z10;
                    int i24 = b11 & 255;
                    if (z14) {
                        if (i16 <= 0) {
                            z4 = z14;
                            if ((b11 & 128) != 0) {
                                if ((b11 & 64) != 0) {
                                    int i25 = i16 + 1;
                                    if ((b11 & 32) == 0) {
                                        i18++;
                                    } else {
                                        i25 = i16 + 2;
                                        if ((b11 & 16) == 0) {
                                            i19++;
                                        } else {
                                            i16 += 3;
                                            if ((b11 & 8) == 0) {
                                                i20++;
                                            }
                                        }
                                    }
                                    i16 = i25;
                                }
                            }
                        } else if ((b11 & 128) != 0) {
                            i16--;
                            if (z15) {
                                if (i24 > 127 && i24 < 160) {
                                    z15 = false;
                                } else if (i24 > 159 && (i24 < 192 || i24 == 215 || i24 == 247)) {
                                    i21++;
                                }
                            }
                            if (z13) {
                                if (i17 > 0) {
                                    if (i24 >= 64 && i24 != 127 && i24 <= 252) {
                                        i17--;
                                    }
                                    z13 = false;
                                } else {
                                    if (i24 != 128 && i24 != 160 && i24 <= 239) {
                                        if (i24 <= 160 || i24 >= 224) {
                                            if (i24 > 127) {
                                                i17++;
                                                int i26 = i22 + 1;
                                                if (i26 > i13) {
                                                    i13 = i26;
                                                    i22 = i13;
                                                } else {
                                                    i22 = i26;
                                                }
                                            } else {
                                                i22 = 0;
                                            }
                                            i23 = 0;
                                        } else {
                                            i14++;
                                            int i27 = i23 + 1;
                                            if (i27 > i11) {
                                                i11 = i27;
                                                i23 = i11;
                                            } else {
                                                i23 = i27;
                                            }
                                            i22 = 0;
                                        }
                                    }
                                    z13 = false;
                                }
                            }
                            i15++;
                            charset = charset2;
                            z10 = z15;
                        }
                        z14 = false;
                        if (z15) {
                        }
                        if (z13) {
                        }
                        i15++;
                        charset = charset2;
                        z10 = z15;
                    } else {
                        z4 = z14;
                    }
                    z14 = z4;
                    if (z15) {
                    }
                    if (z13) {
                    }
                    i15++;
                    charset = charset2;
                    z10 = z15;
                }
                Charset charset3 = charset;
                boolean z16 = z10;
                boolean z17 = z14;
                boolean z18 = (!z17 || i16 <= 0) ? z17 : false;
                boolean z19 = (!z13 || i17 <= 0) ? z13 : false;
                if (!z18 || (!z12 && i18 + i19 + i20 <= 0)) {
                    if (!z19 || (!h.d && i11 < 3 && i13 < 3)) {
                        if (z16 && z19) {
                            if ((i11 != 2 || i14 != 2) && i21 * 10 < i10) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z16) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z19) {
                            forName = z18 ? StandardCharsets.UTF_8 : h.a;
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
            forName = Charset.forName(cVar.name());
        }
        sb.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(g gVar, StringBuilder sb, int i10) {
        if (h.c == null) {
            throw ob.c.a();
        }
        if (i10 * 13 > gVar.d()) {
            throw ob.c.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int f10 = gVar.f(13);
            int i12 = (f10 % 96) | ((f10 / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & 255);
            bArr[i11 + 1] = (byte) (i13 & 255);
            i11 += 2;
            i10--;
        }
        sb.append(new String(bArr, h.c));
    }

    public static void d(g gVar, StringBuilder sb, int i10) {
        if (h.b == null) {
            throw ob.c.a();
        }
        if (i10 * 13 > gVar.d()) {
            throw ob.c.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int f10 = gVar.f(13);
            int i12 = (f10 % 192) | ((f10 / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb.append(new String(bArr, h.b));
    }

    public static void e(g gVar, StringBuilder sb, int i10) {
        while (i10 >= 3) {
            if (gVar.d() < 10) {
                throw ob.c.a();
            }
            int f10 = gVar.f(10);
            if (f10 >= 1000) {
                throw ob.c.a();
            }
            sb.append(f(f10 / 100));
            sb.append(f((f10 / 10) % 10));
            sb.append(f(f10 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (gVar.d() < 7) {
                throw ob.c.a();
            }
            int f11 = gVar.f(7);
            if (f11 >= 100) {
                throw ob.c.a();
            }
            sb.append(f(f11 / 10));
            sb.append(f(f11 % 10));
            return;
        }
        if (i10 == 1) {
            if (gVar.d() < 4) {
                throw ob.c.a();
            }
            int f12 = gVar.f(4);
            if (f12 >= 10) {
                throw ob.c.a();
            }
            sb.append(f(f12));
        }
    }

    public static char f(int i10) {
        char[] cArr = a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw ob.c.a();
    }
}
