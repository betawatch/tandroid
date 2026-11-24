// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class xcd {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aka a(k74 k74Var, boolean z) {
        aka akaVar;
        boolean z2;
        int i;
        long j;
        int i2;
        int i3;
        long j2;
        boolean z3;
        int[] iArr;
        long length = k74Var.getLength();
        long j3 = -1;
        long j4 = 4096;
        if (length != -1 && length <= 4096) {
            j4 = length;
        }
        int i4 = (int) j4;
        xu7 xu7Var = new xu7(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            xu7Var.K(8);
            if (!k74Var.d(xu7Var.a, i5, 8, true)) {
                break;
            }
            long C = xu7Var.C();
            int m = xu7Var.m();
            if (C == 1) {
                k74Var.b(8, 8, xu7Var.a);
                i2 = 16;
                xu7Var.M(16);
                i = i6;
                j = xu7Var.u();
            } else {
                if (C == 0) {
                    long length2 = k74Var.getLength();
                    if (length2 != j3) {
                        C = (length2 - k74Var.f()) + 8;
                    }
                }
                i = i6;
                j = C;
                i2 = 8;
            }
            long j5 = i2;
            if (j < j5) {
                akaVar = null;
                if (m != 1718773093 || i2 != 8) {
                    return new wx(m, j, i2);
                }
                j = j5;
            } else {
                akaVar = null;
            }
            int i7 = i + i2;
            if (m == 1836019574 || m == 1970628964) {
                i4 += (int) j;
                i3 = m;
                if (length != -1 && i4 > length) {
                    i4 = (int) length;
                }
                if (i3 == 1836019574) {
                    i6 = i7;
                    j3 = -1;
                    i5 = 0;
                }
            } else {
                i3 = m;
            }
            if (i3 != 1953653099 && i3 != 1835297121 && i3 != 1835626086) {
                if (i3 == 1836019558 || i3 == 1836475768) {
                    z2 = true;
                    break;
                }
                if (i3 == 1835295092) {
                    z4 = true;
                }
                if (i3 == 1937007212 && j > 1000000) {
                    break;
                }
                j2 = length;
                if ((i7 + j) - j5 >= i4) {
                    break;
                }
                int i8 = (int) (j - j5);
                i6 = i7 + i8;
                if (i3 == 1718909296) {
                    if (i8 < 8) {
                        return new wx(i3, i8, 8);
                    }
                    xu7Var.K(i8);
                    int i9 = 0;
                    k74Var.b(0, i8, xu7Var.a);
                    int m2 = xu7Var.m();
                    int i10 = m2 >>> 8;
                    int[] iArr2 = a;
                    if (i10 != 3368816) {
                        for (int i11 = 0; i11 < 29; i11++) {
                            if (iArr2[i11] != m2) {
                            }
                        }
                        xu7Var.O(4);
                        int a2 = xu7Var.a() / 4;
                        if (!z4 || a2 <= 0) {
                            z3 = z4;
                            iArr = akaVar;
                        } else {
                            int[] iArr3 = new int[a2];
                            int i12 = 0;
                            while (i12 < a2) {
                                int m3 = xu7Var.m();
                                iArr3[i12] = m3;
                                if ((m3 >>> 8) != 3368816) {
                                    for (int i13 = i9; i13 < 29; i13++) {
                                        if (iArr2[i13] != m3) {
                                        }
                                    }
                                    i12++;
                                    i9 = 0;
                                }
                                iArr = iArr3;
                                z3 = true;
                                break;
                            }
                            iArr = iArr3;
                            z3 = z4;
                        }
                        if (z3) {
                            return new dd(iArr, m2);
                        }
                        z4 = z3;
                    }
                    z4 = true;
                    xu7Var.O(4);
                    int a22 = xu7Var.a() / 4;
                    if (z4) {
                    }
                    z3 = z4;
                    iArr = akaVar;
                    if (z3) {
                    }
                } else if (i8 != 0) {
                    k74Var.g(i8);
                }
            } else {
                j2 = length;
                i6 = i7;
            }
            length = j2;
            j3 = -1;
            i5 = 0;
        }
        akaVar = null;
        z2 = false;
        return !z4 ? o5f.d : z != z2 ? z2 ? gn5.c : gn5.d : akaVar;
    }
}
