// default package

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sl5 extends iwe {
    public static final zo4 b = new zo4((byte) 12);
    public static final zo4 c = new zo4((byte) 13);
    public final ql5 a;

    public sl5(ql5 ql5Var) {
        this.a = ql5Var;
    }

    public static ip d(yw7 yw7Var, int i, int i2) {
        int v;
        String concat;
        int A = yw7Var.A();
        Charset s = s(A);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        yw7Var.k(0, i3, bArr);
        if (i2 == 2) {
            concat = "image/" + vod.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c2 = vod.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            concat = c2.indexOf(47) == -1 ? "image/".concat(c2) : c2;
        }
        int i4 = bArr[v + 1] & 255;
        int i5 = v + 2;
        int u = u(i5, A, bArr);
        String str = new String(bArr, i5, u - i5, s);
        int r = r(A) + u;
        return new ip(i4, concat, str, i3 <= r ? hac.b : Arrays.copyOfRange(bArr, r, i3));
    }

    public static rk1 e(yw7 yw7Var, int i, int i2, boolean z, int i3, ql5 ql5Var) {
        int i4 = yw7Var.b;
        int v = v(i4, yw7Var.a);
        String str = new String(yw7Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        yw7Var.N(v + 1);
        int m = yw7Var.m();
        int m2 = yw7Var.m();
        if (m > m2) {
            return null;
        }
        long C = yw7Var.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = yw7Var.C();
        long j = C2 == 4294967295L ? -1L : C2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (yw7Var.b < i5) {
            tl5 h = h(i2, yw7Var, z, i3, ql5Var);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new rk1(str, m, m2, C, j, (tl5[]) arrayList.toArray(new tl5[0]));
    }

    public static tk1 f(yw7 yw7Var, int i, int i2, boolean z, int i3, ql5 ql5Var) {
        int i4 = yw7Var.b;
        int v = v(i4, yw7Var.a);
        String str = new String(yw7Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        yw7Var.N(v + 1);
        int A = yw7Var.A();
        boolean z2 = (A & 2) != 0;
        boolean z3 = (A & 1) != 0;
        int A2 = yw7Var.A();
        String[] strArr = new String[A2];
        for (int i5 = 0; i5 < A2; i5++) {
            int i6 = yw7Var.b;
            int v2 = v(i6, yw7Var.a);
            strArr[i5] = new String(yw7Var.a, i6, v2 - i6, StandardCharsets.ISO_8859_1);
            yw7Var.N(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (yw7Var.b < i7) {
            tl5 h = h(i2, yw7Var, z, i3, ql5Var);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new tk1(str, z2, z3, strArr, (tl5[]) arrayList.toArray(new tl5[0]));
    }

    public static wn2 g(int i, yw7 yw7Var) {
        if (i < 4) {
            return null;
        }
        int A = yw7Var.A();
        Charset s = s(A);
        byte[] bArr = new byte[3];
        yw7Var.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yw7Var.k(0, i2, bArr2);
        int u = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u, s);
        int r = r(A) + u;
        return new wn2(str, str2, l(bArr2, r, u(r, A, bArr2), s));
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0195, code lost:
    
        if (r5 == 67) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0247  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [tl5] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [yw7] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [yw7] */
    /* JADX WARN: Type inference failed for: r1v8, types: [yw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tl5 h(int i, yw7 yw7Var, boolean z, int i2, ql5 ql5Var) {
        int E;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        Throwable th;
        ?? r12;
        yw7 yw7Var2;
        Object ij0Var;
        int i7 = i;
        int A = yw7Var.A();
        int A2 = yw7Var.A();
        int A3 = yw7Var.A();
        int A4 = i7 >= 3 ? yw7Var.A() : 0;
        if (i7 == 4) {
            E = yw7Var.E();
            if (!z) {
                E = (((E >> 24) & nm7.d4) << 21) | (E & nm7.d4) | (((E >> 8) & nm7.d4) << 7) | (((E >> 16) & nm7.d4) << 14);
            }
        } else {
            E = i7 == 3 ? yw7Var.E() : yw7Var.D();
        }
        int i8 = E;
        int H = i7 >= 3 ? yw7Var.H() : 0;
        if (A == 0 && A2 == 0 && A3 == 0 && A4 == 0 && i8 == 0 && H == 0) {
            yw7Var.N(yw7Var.c);
            return null;
        }
        int i9 = yw7Var.b + i8;
        if (i9 > yw7Var.c) {
            ncd.f("Id3Decoder", "Frame size exceeds remaining tag data");
            yw7Var.N(yw7Var.c);
            return null;
        }
        if (ql5Var != null) {
            boolean e = ql5Var.e(i7, A, A2, A3, A4);
            i7 = i7;
            r1 = A;
            i3 = A2;
            if (!e) {
                yw7Var.N(i9);
                return null;
            }
        } else {
            i3 = A2;
            r1 = A;
        }
        if (i7 == 3) {
            z2 = (H & 128) != 0;
            z5 = (H & 64) != 0;
            z6 = false;
            z4 = (H & 32) != 0;
            z3 = z2;
        } else if (i7 == 4) {
            boolean z7 = (H & 64) != 0;
            boolean z8 = (H & 8) != 0;
            z5 = (H & 4) != 0;
            z6 = (H & 2) != 0;
            z3 = (H & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            ncd.f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            yw7Var.N(i9);
            return null;
        }
        if (z4) {
            i8--;
            yw7Var.O(1);
        }
        if (z3) {
            i8 -= 4;
            yw7Var.O(4);
        }
        if (z6) {
            i8 = w(i8, yw7Var);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                r1 = yw7Var;
            }
        } catch (Exception | OutOfMemoryError e2) {
            e = e2;
            int i10 = i8;
            i8 = i3;
            i3 = i10;
            i4 = r1;
            i5 = A3;
            i6 = A4;
            r1 = yw7Var;
            th = null;
        }
        if (r1 == 84 && i3 == 88 && A3 == 88 && (i7 == 2 || A4 == 88)) {
            ij0Var = o(i8, yw7Var);
        } else if (r1 == 84) {
            ij0Var = m(i8, yw7Var, t(i7, r1, i3, A3, A4));
        } else if (r1 == 87 && i3 == 88 && A3 == 88 && (i7 == 2 || A4 == 88)) {
            ij0Var = q(i8, yw7Var);
        } else if (r1 == 87) {
            ij0Var = p(i8, yw7Var, t(i7, r1, i3, A3, A4));
        } else {
            if (r1 != 80 || i3 != 82 || A3 != 73 || A4 != 86) {
                th = null;
                try {
                } catch (Exception | OutOfMemoryError e3) {
                    e = e3;
                    int i11 = i8;
                    i8 = i3;
                    i3 = i11;
                    i4 = r1;
                    i5 = A3;
                    i6 = A4;
                    r1 = yw7Var;
                }
                if (r1 == 71 && i3 == 69 && A3 == 79 && (A4 == 66 || i7 == 2)) {
                    ij0Var = i(i8, yw7Var);
                } else {
                    if (i7 != 2) {
                        if (r1 == 65) {
                            if (i3 == 80) {
                                if (A3 == 73) {
                                }
                            }
                        }
                        if (r1 == 67) {
                        }
                        if (r1 != 67) {
                        }
                        int i12 = i8;
                        i8 = i3;
                        i3 = i12;
                        i4 = r1;
                        i5 = A3;
                        i6 = A4;
                        if (i4 != 67) {
                        }
                        i7 = i;
                        yw7Var2 = yw7Var;
                        if (i4 != 77) {
                        }
                        String t = t(i7, i4, i8, i5, i6);
                        byte[] bArr = new byte[i3];
                        yw7Var2.k(0, i3, bArr);
                        ij0Var = new ij0(t, bArr);
                        r1 = yw7Var2;
                        r1.N(i9);
                        r12 = ij0Var;
                        e = th;
                        if (r12 == 0) {
                        }
                        return r12;
                    }
                    if (r1 == 80 && i3 == 73 && A3 == 67) {
                        ij0Var = d(yw7Var, i8, i7);
                    }
                    if (r1 == 67 || i3 != 79 || A3 != 77 || (A4 != 77 && i7 != 2)) {
                        if (r1 != 67 && i3 == 72 && A3 == 65 && A4 == 80) {
                            int i13 = i8;
                            i8 = i3;
                            i3 = i13;
                            i4 = r1;
                            i5 = A3;
                            i6 = A4;
                            try {
                                ij0Var = e(yw7Var, i3, i7, z, i2, ql5Var);
                                i7 = i;
                                r1 = yw7Var;
                            } catch (Exception e4) {
                                e = e4;
                                i7 = i;
                                r1 = yw7Var;
                                r1.N(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e5) {
                                e = e5;
                                i7 = i;
                                r1 = yw7Var;
                                r1.N(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th3) {
                                th = th3;
                                r1 = yw7Var;
                                r1.N(i9);
                                throw th;
                            }
                        } else {
                            int i122 = i8;
                            i8 = i3;
                            i3 = i122;
                            i4 = r1;
                            i5 = A3;
                            i6 = A4;
                            try {
                                if (i4 != 67 && i8 == 84 && i5 == 79 && i6 == 67) {
                                    i7 = i;
                                    yw7 yw7Var3 = yw7Var;
                                    ij0Var = f(yw7Var3, i3, i7, z, i2, ql5Var);
                                    r1 = yw7Var3;
                                } else {
                                    i7 = i;
                                    yw7Var2 = yw7Var;
                                    if (i4 != 77 && i8 == 76 && i5 == 76 && i6 == 84) {
                                        ij0Var = j(i3, yw7Var2);
                                        r1 = yw7Var2;
                                    } else {
                                        String t2 = t(i7, i4, i8, i5, i6);
                                        byte[] bArr2 = new byte[i3];
                                        yw7Var2.k(0, i3, bArr2);
                                        ij0Var = new ij0(t2, bArr2);
                                        r1 = yw7Var2;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                r1.N(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e7) {
                                e = e7;
                                r1.N(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th4) {
                                th = th4;
                                r1.N(i9);
                                throw th;
                            }
                        }
                        r1.N(i9);
                        r12 = ij0Var;
                        e = th;
                        if (r12 == 0) {
                            ncd.g("Id3Decoder", "Failed to decode frame: id=" + t(i7, i4, i8, i5, i6) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    ij0Var = g(i8, yw7Var);
                }
                int i14 = i8;
                i8 = i3;
                i3 = i14;
                i4 = r1;
                i5 = A3;
                i6 = A4;
                r1 = yw7Var;
                r1.N(i9);
                r12 = ij0Var;
                e = th;
                if (r12 == 0) {
                }
                return r12;
            }
            ij0Var = k(i8, yw7Var);
        }
        int i15 = i8;
        i8 = i3;
        i3 = i15;
        i4 = r1;
        i5 = A3;
        i6 = A4;
        r1 = yw7Var;
        th = null;
        r1.N(i9);
        r12 = ij0Var;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    public static lu4 i(int i, yw7 yw7Var) {
        int A = yw7Var.A();
        Charset s = s(A);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yw7Var.k(0, i2, bArr);
        int v = v(0, bArr);
        String n = wf7.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i3 = v + 1;
        int u = u(i3, A, bArr);
        String l = l(bArr, i3, u, s);
        int r = r(A) + u;
        int u2 = u(r, A, bArr);
        String l2 = l(bArr, r, u2, s);
        int r2 = r(A) + u2;
        return new lu4(n, i2 <= r2 ? hac.b : Arrays.copyOfRange(bArr, r2, i2), l, l2);
    }

    public static fg7 j(int i, yw7 yw7Var) {
        int H = yw7Var.H();
        int D = yw7Var.D();
        int D2 = yw7Var.D();
        int A = yw7Var.A();
        int A2 = yw7Var.A();
        ye1 ye1Var = new ye1();
        ye1Var.k(yw7Var);
        int i2 = ((i - 10) << 3) / (A + A2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int f = ye1Var.f(A);
            int f2 = ye1Var.f(A2);
            iArr[i3] = f;
            iArr2[i3] = f2;
        }
        return new fg7(H, D, D2, iArr, iArr2);
    }

    public static ol8 k(int i, yw7 yw7Var) {
        byte[] bArr = new byte[i];
        yw7Var.k(0, i, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i2 = v + 1;
        return new ol8(str, i <= i2 ? hac.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String l(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static ojb m(int i, yw7 yw7Var, String str) {
        if (i < 1) {
            return null;
        }
        int A = yw7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yw7Var.k(0, i2, bArr);
        return new ojb(str, null, n(A, 0, bArr));
    }

    public static y79 n(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return mo5.u("");
        }
        jo5 p = mo5.p();
        int u = u(i2, i, bArr);
        while (i2 < u) {
            p.c(new String(bArr, i2, u - i2, s(i)));
            i2 = r(i) + u;
            u = u(i2, i, bArr);
        }
        y79 f = p.f();
        return f.isEmpty() ? mo5.u("") : f;
    }

    public static ojb o(int i, yw7 yw7Var) {
        if (i < 1) {
            return null;
        }
        int A = yw7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yw7Var.k(0, i2, bArr);
        int u = u(0, A, bArr);
        return new ojb("TXXX", new String(bArr, 0, u, s(A)), n(A, r(A) + u, bArr));
    }

    public static t8c p(int i, yw7 yw7Var, String str) {
        byte[] bArr = new byte[i];
        yw7Var.k(0, i, bArr);
        return new t8c(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static t8c q(int i, yw7 yw7Var) {
        if (i < 1) {
            return null;
        }
        int A = yw7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yw7Var.k(0, i2, bArr);
        int u = u(0, A, bArr);
        String str = new String(bArr, 0, u, s(A));
        int r = r(A) + u;
        return new t8c("WXXX", str, l(bArr, r, v(r, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(int i, int i2, byte[] bArr) {
        int v = v(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if ((v - i) % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(v + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(int i, yw7 yw7Var) {
        byte[] bArr = yw7Var.a;
        int i2 = yw7Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007a, code lost:
    
        if ((r10 & 128) == 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x0039, B:22:0x0041, B:27:0x0063, B:30:0x006a, B:34:0x0082, B:35:0x0084, B:37:0x0089, B:41:0x0097, B:47:0x0071, B:50:0x0078, B:54:0x0020), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x0039, B:22:0x0041, B:27:0x0063, B:30:0x006a, B:34:0x0082, B:35:0x0084, B:37:0x0089, B:41:0x0097, B:47:0x0071, B:50:0x0078, B:54:0x0020), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0092->B:24:0x0092 BREAK  A[LOOP:0: B:2:0x0006->B:41:0x0097], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(yw7 yw7Var, int i, int i2, boolean z) {
        int D;
        long D2;
        int i3;
        int i4;
        int i5 = yw7Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (yw7Var.a() >= i2) {
                    if (i >= 3) {
                        D = yw7Var.m();
                        D2 = yw7Var.C();
                        i3 = yw7Var.H();
                    } else {
                        D = yw7Var.D();
                        D2 = yw7Var.D();
                        i3 = 0;
                    }
                    if (D == 0 && D2 == 0 && i3 == 0) {
                        break;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & D2) != 0) {
                            break;
                        }
                        D2 = (((D2 >> 24) & 255) << 21) | (D2 & 255) | (((D2 >> 8) & 255) << 7) | (((D2 >> 16) & 255) << 14);
                    }
                    if (i == 4) {
                        i4 = (i3 & 64) != 0 ? 1 : 0;
                        if ((i3 & 1) != 0) {
                            if (z2) {
                                i4 += 4;
                            }
                            if (D2 < i4 || yw7Var.a() < D2) {
                                break;
                                break;
                            }
                            yw7Var.O((int) D2);
                        }
                        z2 = false;
                        if (z2) {
                        }
                        if (D2 < i4) {
                            break;
                        }
                        yw7Var.O((int) D2);
                    } else {
                        if (i == 3) {
                            i4 = (i3 & 32) != 0 ? 1 : 0;
                        } else {
                            i4 = 0;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (D2 < i4) {
                        }
                    }
                } else {
                    break;
                }
            } finally {
                yw7Var.N(i5);
            }
        }
        return false;
    }

    @Override // iwe
    public final nf7 b(pf7 pf7Var, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nf7 c(int i, byte[] bArr) {
        rl5 rl5Var;
        ArrayList arrayList = new ArrayList();
        yw7 yw7Var = new yw7(i, bArr);
        boolean z = false;
        if (yw7Var.a() < 10) {
            ncd.f("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int D = yw7Var.D();
            if (D != 4801587) {
                ncd.f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(D))));
            } else {
                int A = yw7Var.A();
                if (A >= 2 && A <= 4) {
                    yw7Var.O(1);
                    int A2 = yw7Var.A();
                    int z2 = yw7Var.z();
                    if (A == 2) {
                        if ((A2 & 64) != 0) {
                            ncd.f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        }
                    } else if (A == 3) {
                        if ((A2 & 64) != 0) {
                            int m = yw7Var.m();
                            yw7Var.O(m);
                            z2 -= m + 4;
                        }
                    } else if (A == 4) {
                        if ((A2 & 64) != 0) {
                            int z3 = yw7Var.z();
                            yw7Var.O(z3 - 4);
                            z2 -= z3;
                        }
                        if ((A2 & 16) != 0) {
                            z2 -= 10;
                        }
                    }
                    rl5Var = new rl5(A, z2, A < 4 && (A2 & 128) != 0);
                    if (rl5Var != null) {
                        return null;
                    }
                    short s = rl5Var.a;
                    int i2 = yw7Var.b;
                    int i3 = s == 2 ? 6 : 10;
                    int i4 = rl5Var.c;
                    if (rl5Var.b) {
                        i4 = w(i4, yw7Var);
                    }
                    yw7Var.M(i2 + i4);
                    if (!x(yw7Var, s, i3, false)) {
                        if (s != 4 || !x(yw7Var, 4, i3, true)) {
                            b10.o(s, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                            return null;
                        }
                        z = true;
                    }
                    while (yw7Var.a() >= i3) {
                        tl5 h = h(s, yw7Var, z, i3, this.a);
                        if (h != null) {
                            arrayList.add(h);
                        }
                    }
                    return new nf7(arrayList);
                }
                b10.o(A, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
            }
        }
        rl5Var = null;
        if (rl5Var != null) {
        }
    }
}
