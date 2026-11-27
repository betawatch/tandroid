// default package

import j$.util.Objects;
import java.math.RoundingMode;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class s3d {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, oc1.AUDIO_CONTENT_SAMPLING_RATE, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, jn7.w1, 128, jn7.V2, jn7.A3, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, TLObject.FLAG_12, 6144, 7680};
    public static final int[] d = {8000, oc1.AUDIO_CONTENT_SAMPLING_RATE, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (i4 | ((b3 & 60) >> 2)) + 1;
            z = true;
            return !z ? (i3 << 4) / 14 : i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (i2 | ((b2 & 240) >> 4)) + 1;
        if (!z) {
        }
    }

    public static int b(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static zd1 c(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zd1(bArr.length, bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        zd1 zd1Var = new zd1(copyOf.length, copyOf);
        if (copyOf[0] == 31) {
            zd1 zd1Var2 = new zd1(copyOf.length, copyOf);
            while (zd1Var2.b() >= 16) {
                zd1Var2.n(2);
                int f2 = zd1Var2.f(14) & 16383;
                int min = Math.min(8 - zd1Var.d, 14);
                int i4 = zd1Var.d;
                int i5 = (8 - i4) - min;
                int i6 = (65280 >> i4) | ((1 << i5) - 1);
                byte[] bArr3 = zd1Var.b;
                int i7 = zd1Var.c;
                byte b5 = (byte) (bArr3[i7] & i6);
                bArr3[i7] = b5;
                int i8 = 14 - min;
                bArr3[i7] = (byte) (b5 | ((f2 >>> i8) << i5));
                int i9 = i7 + 1;
                while (true) {
                    bArr2 = zd1Var.b;
                    if (i8 > 8) {
                        bArr2[i9] = (byte) (f2 >>> (i8 - 8));
                        i8 -= 8;
                        i9++;
                    }
                }
                int i10 = 8 - i8;
                byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (b6 | ((f2 & ((1 << i8) - 1)) << i10));
                zd1Var.n(14);
                zd1Var.a();
            }
        }
        zd1Var.j(copyOf.length, copyOf);
        return zd1Var;
    }

    public static int d(int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 0;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & TLObject.FLAG_12) != 0) {
            i3++;
        }
        if ((i2 & TLObject.FLAG_13) != 0) {
            i3 += 2;
        }
        if ((i2 & TLObject.FLAG_14) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    public static boolean e(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0232, code lost:
    
        if ((r0.f(12) & 256) != 0) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yr3 f(byte[] bArr) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        String str;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        zd1 c2 = c(bArr);
        c2.n(40);
        int f2 = c2.f(2);
        if (c2.e()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        c2.n(i3);
        int f3 = c2.f(i2) + 1;
        boolean e2 = c2.e();
        if (e2) {
            i6 = c2.f(2);
            i5 = (c2.f(3) + 1) << 9;
            if (c2.e()) {
                c2.n(36);
            }
            int f4 = c2.f(3) + 1;
            int f5 = c2.f(3) + 1;
            if (f4 != 1 || f5 != 1) {
                throw hy7.d("Multiple audio presentations or assets not supported");
            }
            int i18 = f2 + 1;
            int f6 = c2.f(i18);
            for (int i19 = 0; i19 < i18; i19++) {
                if (((f6 >> i19) & 1) == 1) {
                    c2.n(8);
                }
            }
            i4 = 0;
            z = c2.e();
            if (z) {
                c2.n(2);
                int f7 = (c2.f(2) + 1) << 2;
                int f8 = c2.f(2) + 1;
                iArr = new int[f8];
                for (int i20 = 0; i20 < f8; i20++) {
                    iArr[i20] = d(c2.f(f7));
                }
                c2.n(i2);
                c2.n(12);
                if (e2) {
                    i7 = -2147483647;
                    str = null;
                    i8 = -1;
                } else {
                    if (c2.e()) {
                        c2.n(4);
                    }
                    if (c2.e()) {
                        c2.n(24);
                    }
                    if (c2.e()) {
                        c2.o(c2.f(10) + 1);
                    }
                    int i21 = 5;
                    c2.n(5);
                    i7 = d[c2.f(4)];
                    int f9 = c2.f(8) + 1;
                    if (c2.e()) {
                        int e3 = f9 > 2 ? c2.e() : i4;
                        int e4 = f9 > 6 ? c2.e() : i4;
                        if (c2.e()) {
                            i12 = 1;
                            i17 = (c2.f(2) + 1) << 2;
                            c2.n(i17);
                        } else {
                            i12 = 1;
                            i17 = i4;
                        }
                        i11 = 6;
                        int f10 = c2.f(3);
                        int[] iArr2 = new int[f10];
                        for (int i22 = i4; i22 < f10; i22++) {
                            iArr2[i22] = c2.f(i17);
                        }
                        int i23 = i4;
                        while (i23 < f10) {
                            int d2 = d(iArr2[i23]);
                            int i24 = i21;
                            int f11 = c2.f(i21) + 1;
                            int i25 = i4;
                            while (i25 < d2) {
                                c2.n(Integer.bitCount(c2.f(f11)) * 5);
                                i25++;
                                iArr2 = iArr2;
                            }
                            i23++;
                            i21 = i24;
                        }
                        i10 = i21;
                        i14 = e3;
                        i13 = e4;
                    } else {
                        i10 = 5;
                        i11 = 6;
                        i12 = 1;
                        c2.n(3);
                        int i26 = i4;
                        i13 = i26 == true ? 1 : 0;
                        i14 = i26;
                    }
                    boolean e5 = c2.e();
                    if (e5) {
                        c2.n(8);
                    }
                    if (c2.e()) {
                        c2.n(i10);
                    }
                    if (e5 && i14 != 0) {
                        c2.n(8);
                    }
                    if (z && c2.e()) {
                        iArr.getClass();
                        c2.n(7);
                        if (c2.f(2) < 3) {
                            c2.n(3);
                        } else {
                            c2.n(8);
                        }
                        boolean e6 = c2.e();
                        int length = iArr.length;
                        int i27 = i4;
                        while (i27 < length) {
                            int i28 = iArr[i27];
                            if (e6) {
                                c2.n(i28 * 6);
                                i16 = i11;
                            } else {
                                i16 = i11;
                                c2.n(i16);
                            }
                            i27++;
                            i11 = i16;
                        }
                        int i29 = i11;
                        int[] iArr3 = new int[3];
                        iArr3[i4] = f9;
                        if (i13 != 0) {
                            iArr3[i12] = i29;
                            i15 = 2;
                        } else {
                            i15 = i12;
                        }
                        if (i14 != 0) {
                            iArr3[i15] = 2;
                            i15++;
                        }
                        int length2 = iArr.length;
                        for (int i30 = i4; i30 < length2; i30++) {
                            int i31 = iArr[i30];
                            for (int i32 = i4; i32 < i15; i32++) {
                                int i33 = iArr3[i32];
                                int i34 = i4;
                                while (i34 < i33) {
                                    c2.n(Integer.bitCount(c2.f(i31)) * 6);
                                    i34++;
                                    iArr3 = iArr3;
                                }
                            }
                        }
                    }
                    int f12 = c2.f(2);
                    String str2 = "audio/vnd.dts.hd";
                    if (f12 != 0) {
                        if (f12 != i12) {
                            if (f12 != 2) {
                                throw hy7.a("Unsupported coding mode in DTS HD header: " + f12, null);
                            }
                            str2 = "audio/vnd.dts.hd;profile=lbr";
                        }
                        i8 = f9;
                        str = str2;
                    }
                }
                int i35 = i7;
                if (e2) {
                    j = -9223372036854775807L;
                } else {
                    if (i6 == 0) {
                        i9 = 32000;
                    } else if (i6 == 1) {
                        i9 = 44100;
                    } else {
                        if (i6 != 2) {
                            throw hy7.a("Unsupported reference clock code in DTS HD header: " + i6, null);
                        }
                        i9 = 48000;
                    }
                    long j2 = i9;
                    String str3 = gcc.a;
                    j = gcc.b0(i5, 1000000L, j2, RoundingMode.DOWN);
                }
                return new yr3(str, i8, i35, f3, j);
            }
        } else {
            i4 = 0;
            z = false;
            i5 = 0;
            i6 = -1;
        }
        iArr = null;
        c2.n(i2);
        c2.n(12);
        if (e2) {
        }
        int i352 = i7;
        if (e2) {
        }
        return new yr3(str, i8, i352, f3, j);
    }

    public static int g(zd1 zd1Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zd1Var.e(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zd1Var.f(iArr[i2]) + i4;
    }

    public static ko4 h(f84 f84Var, int i2, ko4 ko4Var) {
        ey7 ey7Var = new ey7(i2);
        if (f84Var.d(ey7Var.a, 0, i2, true)) {
            f84Var.h();
            int i3 = ey7Var.i();
            if (b(i3) == 1) {
                if (ey7Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    ey7Var.k(0, 10, bArr);
                    int a2 = a(bArr);
                    if (a2 > 0 && ey7Var.c >= a2 + 4) {
                        ey7Var.N(a2);
                        i3 = ey7Var.i();
                    }
                }
            }
            if (b(i3) == 2 && ey7Var.a() >= 7) {
                int i4 = ey7Var.b;
                byte[] bArr2 = new byte[7];
                ey7Var.k(0, 7, bArr2);
                ey7Var.N(i4);
                zd1 c2 = c(bArr2);
                c2.n(42);
                int f2 = c2.f(c2.e() ? 12 : 8) + 1;
                if (f2 > 0 && ey7Var.a() >= f2) {
                    byte[] bArr3 = new byte[f2];
                    ey7Var.k(0, f2, bArr3);
                    String str = f(bArr3).a;
                    if (str == null) {
                        str = "audio/vnd.dts.hd";
                    }
                    if (Objects.equals(ko4Var.t, str)) {
                        return ko4Var;
                    }
                    jo4 a3 = ko4Var.a();
                    a3.s = dg7.n(str);
                    return new ko4(a3);
                }
            }
        }
        return ko4Var;
    }
}
