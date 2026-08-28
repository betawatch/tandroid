package pb;

import com.google.android.exoplayer2.upstream.w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import lb.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(w wVar, StringBuilder sb2, int i9, boolean z10) {
        while (i9 > 1) {
            if (wVar.d() < 11) {
                throw kb.c.a();
            }
            int e10 = wVar.e(11);
            sb2.append(f(e10 / 45));
            sb2.append(f(e10 % 45));
            i9 -= 2;
        }
        if (i9 == 1) {
            if (wVar.d() < 6) {
                throw kb.c.a();
            }
            sb2.append(f(wVar.e(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
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
    public static void b(w wVar, StringBuilder sb2, int i9, lb.c cVar, ArrayList arrayList) {
        Charset forName;
        boolean z10;
        byte b10;
        if (i9 * 8 > wVar.d()) {
            throw kb.c.a();
        }
        byte[] bArr = new byte[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) wVar.e(8);
        }
        if (cVar == null) {
            Charset charset = h.b;
            boolean z11 = true;
            if (i9 <= 2 || !(((b10 = bArr[0]) == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2))) {
                boolean z12 = charset != null;
                boolean z13 = i9 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                boolean z14 = z12;
                int i12 = 0;
                boolean z15 = true;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i14 < i9 && (z11 || z14 || z15)) {
                    Charset charset2 = charset;
                    byte b11 = bArr[i14];
                    boolean z16 = z11;
                    int i23 = b11 & 255;
                    if (z15) {
                        if (i15 <= 0) {
                            z10 = z15;
                            if ((b11 & 128) != 0) {
                                if ((b11 & 64) != 0) {
                                    int i24 = i15 + 1;
                                    if ((b11 & 32) == 0) {
                                        i17++;
                                    } else {
                                        i24 = i15 + 2;
                                        if ((b11 & 16) == 0) {
                                            i18++;
                                        } else {
                                            i15 += 3;
                                            if ((b11 & 8) == 0) {
                                                i19++;
                                            }
                                        }
                                    }
                                    i15 = i24;
                                }
                            }
                        } else if ((b11 & 128) != 0) {
                            i15--;
                            if (z16) {
                                if (i23 > 127 && i23 < 160) {
                                    z16 = false;
                                } else if (i23 > 159 && (i23 < 192 || i23 == 215 || i23 == 247)) {
                                    i20++;
                                }
                            }
                            if (z14) {
                                if (i16 > 0) {
                                    if (i23 >= 64 && i23 != 127 && i23 <= 252) {
                                        i16--;
                                    }
                                    z14 = false;
                                } else {
                                    if (i23 != 128 && i23 != 160 && i23 <= 239) {
                                        if (i23 <= 160 || i23 >= 224) {
                                            if (i23 > 127) {
                                                i16++;
                                                int i25 = i21 + 1;
                                                if (i25 > i12) {
                                                    i12 = i25;
                                                    i21 = i12;
                                                } else {
                                                    i21 = i25;
                                                }
                                            } else {
                                                i21 = 0;
                                            }
                                            i22 = 0;
                                        } else {
                                            i13++;
                                            int i26 = i22 + 1;
                                            if (i26 > i10) {
                                                i10 = i26;
                                                i22 = i10;
                                            } else {
                                                i22 = i26;
                                            }
                                            i21 = 0;
                                        }
                                    }
                                    z14 = false;
                                }
                            }
                            i14++;
                            charset = charset2;
                            z11 = z16;
                        }
                        z15 = false;
                        if (z16) {
                        }
                        if (z14) {
                        }
                        i14++;
                        charset = charset2;
                        z11 = z16;
                    } else {
                        z10 = z15;
                    }
                    z15 = z10;
                    if (z16) {
                    }
                    if (z14) {
                    }
                    i14++;
                    charset = charset2;
                    z11 = z16;
                }
                Charset charset3 = charset;
                boolean z17 = z11;
                boolean z18 = z15;
                boolean z19 = (!z18 || i15 <= 0) ? z18 : false;
                boolean z20 = (!z14 || i16 <= 0) ? z14 : false;
                if (!z19 || (!z13 && i17 + i18 + i19 <= 0)) {
                    if (!z20 || (!h.d && i10 < 3 && i12 < 3)) {
                        if (z17 && z20) {
                            if ((i10 != 2 || i13 != 2) && i20 * 10 < i9) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z17) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z20) {
                            forName = z19 ? StandardCharsets.UTF_8 : h.a;
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
        sb2.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(w wVar, StringBuilder sb2, int i9) {
        if (h.c == null) {
            throw kb.c.a();
        }
        if (i9 * 13 > wVar.d()) {
            throw kb.c.a();
        }
        byte[] bArr = new byte[i9 * 2];
        int i10 = 0;
        while (i9 > 0) {
            int e10 = wVar.e(13);
            int i11 = (e10 % 96) | ((e10 / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) ((i12 >> 8) & 255);
            bArr[i10 + 1] = (byte) (i12 & 255);
            i10 += 2;
            i9--;
        }
        sb2.append(new String(bArr, h.c));
    }

    public static void d(w wVar, StringBuilder sb2, int i9) {
        if (h.b == null) {
            throw kb.c.a();
        }
        if (i9 * 13 > wVar.d()) {
            throw kb.c.a();
        }
        byte[] bArr = new byte[i9 * 2];
        int i10 = 0;
        while (i9 > 0) {
            int e10 = wVar.e(13);
            int i11 = (e10 % 192) | ((e10 / 192) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i9--;
        }
        sb2.append(new String(bArr, h.b));
    }

    public static void e(w wVar, StringBuilder sb2, int i9) {
        while (i9 >= 3) {
            if (wVar.d() < 10) {
                throw kb.c.a();
            }
            int e10 = wVar.e(10);
            if (e10 >= 1000) {
                throw kb.c.a();
            }
            sb2.append(f(e10 / 100));
            sb2.append(f((e10 / 10) % 10));
            sb2.append(f(e10 % 10));
            i9 -= 3;
        }
        if (i9 == 2) {
            if (wVar.d() < 7) {
                throw kb.c.a();
            }
            int e11 = wVar.e(7);
            if (e11 >= 100) {
                throw kb.c.a();
            }
            sb2.append(f(e11 / 10));
            sb2.append(f(e11 % 10));
            return;
        }
        if (i9 == 1) {
            if (wVar.d() < 4) {
                throw kb.c.a();
            }
            int e12 = wVar.e(4);
            if (e12 >= 10) {
                throw kb.c.a();
            }
            sb2.append(f(e12));
        }
    }

    public static char f(int i9) {
        char[] cArr = a;
        if (i9 < cArr.length) {
            return cArr[i9];
        }
        throw kb.c.a();
    }
}
