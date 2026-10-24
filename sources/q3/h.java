package q3;

import b2.s0;
import b2.t0;
import b2.v0;
import e2.m0;
import e2.x;
import e9.k0;
import e9.n0;
import e9.x1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.web.d0;
import v7.s6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class h extends w7.m {
    public static final d0 b = new d0(4);
    public final g a;

    public h(g gVar) {
        this.a = gVar;
    }

    public static a d(x xVar, int i10, int i11) {
        int v;
        String concat;
        int A = xVar.A();
        Charset s10 = s(A);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        xVar.k(0, i12, bArr);
        if (i11 == 2) {
            concat = "image/" + s6.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c10 = s6.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            concat = c10.indexOf(47) == -1 ? "image/".concat(c10) : c10;
        }
        int i13 = bArr[v + 1] & 255;
        int i14 = v + 2;
        int u10 = u(i14, A, bArr);
        String str = new String(bArr, i14, u10 - i14, s10);
        int r10 = r(A) + u10;
        return new a(i13, concat, str, i12 <= r10 ? m0.b : Arrays.copyOfRange(bArr, r10, i12));
    }

    public static c e(x xVar, int i10, int i11, boolean z10, int i12, g gVar) {
        int i13 = xVar.b;
        int v = v(i13, xVar.a);
        String str = new String(xVar.a, i13, v - i13, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int m10 = xVar.m();
        int m11 = xVar.m();
        long C = xVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = xVar.C();
        long j10 = C2 == 4294967295L ? -1L : C2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (xVar.b < i14) {
            i h = h(i11, xVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, m10, m11, C, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d f(x xVar, int i10, int i11, boolean z10, int i12, g gVar) {
        int i13 = xVar.b;
        int v = v(i13, xVar.a);
        String str = new String(xVar.a, i13, v - i13, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int A = xVar.A();
        boolean z11 = (A & 2) != 0;
        boolean z12 = (A & 1) != 0;
        int A2 = xVar.A();
        String[] strArr = new String[A2];
        for (int i14 = 0; i14 < A2; i14++) {
            int i15 = xVar.b;
            int v10 = v(i15, xVar.a);
            strArr[i14] = new String(xVar.a, i15, v10 - i15, StandardCharsets.ISO_8859_1);
            xVar.N(v10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (xVar.b < i16) {
            i h = h(i11, xVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e g(int i10, x xVar) {
        if (i10 < 4) {
            return null;
        }
        int A = xVar.A();
        Charset s10 = s(A);
        byte[] bArr = new byte[3];
        xVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        xVar.k(0, i11, bArr2);
        int u10 = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u10, s10);
        int r10 = r(A) + u10;
        return new e(str, str2, l(bArr2, r10, u(r10, A, bArr2), s10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [q3.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [e2.x] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i h(int i10, x xVar, boolean z10, int i11, g gVar) {
        int E;
        int i12;
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        int i15;
        x xVar2;
        Throwable th2;
        x xVar3;
        ?? r122;
        x xVar4;
        s0 bVar;
        int i16 = i10;
        int A = xVar.A();
        int A2 = xVar.A();
        int A3 = xVar.A();
        int A4 = i16 >= 3 ? xVar.A() : 0;
        if (i16 == 4) {
            E = xVar.E();
            if (!z10) {
                E = (((E >> 24) & 255) << 21) | (E & 255) | (((E >> 8) & 255) << 7) | (((E >> 16) & 255) << 14);
            }
        } else {
            E = i16 == 3 ? xVar.E() : xVar.D();
        }
        int i17 = E;
        int H = i16 >= 3 ? xVar.H() : 0;
        if (A == 0 && A2 == 0 && A3 == 0 && A4 == 0 && i17 == 0 && H == 0) {
            xVar.N(xVar.c);
            return null;
        }
        int i18 = xVar.b + i17;
        if (i18 > xVar.c) {
            e2.a.l("Id3Decoder", "Frame size exceeds remaining tag data");
            xVar.N(xVar.c);
            return null;
        }
        if (gVar != null) {
            boolean b10 = gVar.b(i16, A, A2, A3, A4);
            i16 = i16;
            r12 = A;
            i12 = A2;
            if (!b10) {
                xVar.N(i18);
                return null;
            }
        } else {
            i12 = A2;
            r12 = A;
        }
        if (i16 == 3) {
            z11 = (H & 128) != 0;
            z14 = (H & 64) != 0;
            z15 = false;
            z13 = (H & 32) != 0;
            z12 = z11;
        } else if (i16 == 4) {
            boolean z16 = (H & 64) != 0;
            boolean z17 = (H & 8) != 0;
            z14 = (H & 4) != 0;
            z15 = (H & 2) != 0;
            z12 = (H & 1) != 0;
            boolean z18 = z17;
            z13 = z16;
            z11 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z14) {
            e2.a.l("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            xVar.N(i18);
            return null;
        }
        if (z13) {
            i17--;
            xVar.O(1);
        }
        if (z12) {
            i17 -= 4;
            xVar.O(4);
        }
        if (z15) {
            i17 = w(i17, xVar);
        }
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                xVar3 = xVar;
            }
        } catch (Exception e) {
            e = e;
            int i19 = i17;
            i17 = i12;
            i12 = i19;
            i13 = r12;
            i14 = A3;
            i15 = A4;
            xVar2 = xVar;
            th2 = null;
            xVar2.N(i18);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        } catch (OutOfMemoryError e7) {
            e = e7;
            int i192 = i17;
            i17 = i12;
            i12 = i192;
            i13 = r12;
            i14 = A3;
            i15 = A4;
            xVar2 = xVar;
            th2 = null;
            xVar2.N(i18);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i12 == 88 && A3 == 88 && (i16 == 2 || A4 == 88)) {
            bVar = o(i17, xVar);
        } else if (r12 == 84) {
            bVar = m(i17, xVar, t(i16, r12, i12, A3, A4));
        } else if (r12 == 87 && i12 == 88 && A3 == 88 && (i16 == 2 || A4 == 88)) {
            bVar = q(i17, xVar);
        } else if (r12 == 87) {
            bVar = p(i17, xVar, t(i16, r12, i12, A3, A4));
        } else {
            if (r12 != 80 || i12 != 82 || A3 != 73 || A4 != 86) {
                th2 = null;
                try {
                } catch (Exception e10) {
                    e = e10;
                    int i20 = i17;
                    i17 = i12;
                    i12 = i20;
                    i13 = r12;
                    i14 = A3;
                    i15 = A4;
                    xVar2 = xVar;
                    xVar2.N(i18);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    int i202 = i17;
                    i17 = i12;
                    i12 = i202;
                    i13 = r12;
                    i14 = A3;
                    i15 = A4;
                    xVar2 = xVar;
                    xVar2.N(i18);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (r12 == 71 && i12 == 69 && A3 == 79 && (A4 == 66 || i16 == 2)) {
                    bVar = i(i17, xVar);
                } else {
                    if (i16 != 2) {
                        if (r12 == 65) {
                            if (i12 == 80) {
                                if (A3 == 73) {
                                }
                            }
                        }
                        if (r12 == 67) {
                        }
                        if (r12 != 67) {
                        }
                        int i21 = i17;
                        i17 = i12;
                        i12 = i21;
                        i13 = r12;
                        i14 = A3;
                        i15 = A4;
                        if (i13 != 67) {
                        }
                        i16 = i10;
                        xVar4 = xVar;
                        if (i13 != 77) {
                        }
                        String t10 = t(i16, i13, i17, i14, i15);
                        byte[] bArr = new byte[i12];
                        xVar4.k(0, i12, bArr);
                        bVar = new b(t10, bArr);
                        r12 = xVar4;
                        r12.N(i18);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                        }
                        return r122;
                    }
                    if (r12 == 80 && i12 == 73 && A3 == 67) {
                        bVar = d(xVar, i17, i16);
                    }
                    if (r12 == 67 || i12 != 79 || A3 != 77 || (A4 != 77 && i16 != 2)) {
                        if (r12 != 67 && i12 == 72 && A3 == 65 && A4 == 80) {
                            int i22 = i17;
                            i17 = i12;
                            i12 = i22;
                            i13 = r12;
                            i14 = A3;
                            i15 = A4;
                            try {
                                bVar = e(xVar, i12, i16, z10, i11, gVar);
                                i16 = i10;
                                r12 = xVar;
                            } catch (Exception e12) {
                                e = e12;
                                i16 = i10;
                                xVar2 = xVar;
                                xVar2.N(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e13) {
                                e = e13;
                                i16 = i10;
                                xVar2 = xVar;
                                xVar2.N(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th4) {
                                th = th4;
                                xVar3 = xVar;
                                xVar3.N(i18);
                                throw th;
                            }
                        } else {
                            int i212 = i17;
                            i17 = i12;
                            i12 = i212;
                            i13 = r12;
                            i14 = A3;
                            i15 = A4;
                            try {
                                if (i13 != 67 && i17 == 84 && i14 == 79 && i15 == 67) {
                                    i16 = i10;
                                    x xVar5 = xVar;
                                    bVar = f(xVar5, i12, i16, z10, i11, gVar);
                                    r12 = xVar5;
                                } else {
                                    i16 = i10;
                                    xVar4 = xVar;
                                    if (i13 != 77 && i17 == 76 && i14 == 76 && i15 == 84) {
                                        bVar = j(i12, xVar4);
                                        r12 = xVar4;
                                    } else {
                                        String t102 = t(i16, i13, i17, i14, i15);
                                        byte[] bArr2 = new byte[i12];
                                        xVar4.k(0, i12, bArr2);
                                        bVar = new b(t102, bArr2);
                                        r12 = xVar4;
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                                xVar2 = r12;
                                xVar2.N(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                xVar2 = r12;
                                xVar2.N(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th5) {
                                th = th5;
                                xVar3 = r12;
                                xVar3.N(i18);
                                throw th;
                            }
                        }
                        r12.N(i18);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                            e2.a.m("Id3Decoder", "Failed to decode frame: id=" + t(i16, i13, i17, i14, i15) + ", frameSize=" + i12, e);
                        }
                        return r122;
                    }
                    bVar = g(i17, xVar);
                }
                int i23 = i17;
                i17 = i12;
                i12 = i23;
                i13 = r12;
                i14 = A3;
                i15 = A4;
                r12 = xVar;
                r12.N(i18);
                r122 = bVar;
                e = th2;
                if (r122 == 0) {
                }
                return r122;
            }
            bVar = k(i17, xVar);
        }
        int i24 = i17;
        i17 = i12;
        i12 = i24;
        i13 = r12;
        i14 = A3;
        i15 = A4;
        r12 = xVar;
        th2 = null;
        r12.N(i18);
        r122 = bVar;
        e = th2;
        if (r122 == 0) {
        }
        return r122;
    }

    public static f i(int i10, x xVar) {
        int A = xVar.A();
        Charset s10 = s(A);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        int v = v(0, bArr);
        String n10 = v0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i12 = v + 1;
        int u10 = u(i12, A, bArr);
        String l4 = l(bArr, i12, u10, s10);
        int r10 = r(A) + u10;
        int u11 = u(r10, A, bArr);
        String l10 = l(bArr, r10, u11, s10);
        int r11 = r(A) + u11;
        return new f(n10, i11 <= r11 ? m0.b : Arrays.copyOfRange(bArr, r11, i11), l4, l10);
    }

    public static l j(int i10, x xVar) {
        int H = xVar.H();
        int D = xVar.D();
        int D2 = xVar.D();
        int A = xVar.A();
        int A2 = xVar.A();
        a4.g gVar = new a4.g();
        gVar.l(xVar);
        int i11 = ((i10 - 10) * 8) / (A + A2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int g10 = gVar.g(A);
            int g11 = gVar.g(A2);
            iArr[i12] = g10;
            iArr2[i12] = g11;
        }
        return new l(H, D, D2, iArr, iArr2);
    }

    public static m k(int i10, x xVar) {
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i11 = v + 1;
        return new m(str, i10 <= i11 ? m0.b : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String l(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static n m(int i10, x xVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int A = xVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        return new n(str, null, n(A, 0, bArr));
    }

    public static x1 n(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return n0.y("");
        }
        k0 t10 = n0.t();
        int u10 = u(i11, i10, bArr);
        while (i11 < u10) {
            t10.c(new String(bArr, i11, u10 - i11, s(i10)));
            i11 = r(i10) + u10;
            u10 = u(i11, i10, bArr);
        }
        x1 f7 = t10.f();
        return f7.isEmpty() ? n0.y("") : f7;
    }

    public static n o(int i10, x xVar) {
        if (i10 < 1) {
            return null;
        }
        int A = xVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        int u10 = u(0, A, bArr);
        return new n("TXXX", new String(bArr, 0, u10, s(A)), n(A, r(A) + u10, bArr));
    }

    public static o p(int i10, x xVar, String str) {
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        return new o(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o q(int i10, x xVar) {
        if (i10 < 1) {
            return null;
        }
        int A = xVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        int u10 = u(0, A, bArr);
        String str = new String(bArr, 0, u10, s(A));
        int r10 = r(A) + u10;
        return new o("WXXX", str, l(bArr, r10, v(r10, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset s(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int u(int i10, int i11, byte[] bArr) {
        int v = v(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if ((v - i10) % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(v + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int w(int i10, x xVar) {
        byte[] bArr = xVar.a;
        int i11 = xVar.b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(x xVar, int i10, int i11, boolean z10) {
        int D;
        long D2;
        int i12;
        int i13;
        int i14 = xVar.b;
        while (true) {
            try {
                boolean z11 = true;
                if (xVar.a() < i11) {
                    xVar.N(i14);
                    return true;
                }
                if (i10 >= 3) {
                    D = xVar.m();
                    D2 = xVar.C();
                    i12 = xVar.H();
                } else {
                    D = xVar.D();
                    D2 = xVar.D();
                    i12 = 0;
                }
                if (D == 0 && D2 == 0 && i12 == 0) {
                    xVar.N(i14);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & D2) != 0) {
                        xVar.N(i14);
                        return false;
                    }
                    D2 = (((D2 >> 24) & 255) << 21) | (D2 & 255) | (((D2 >> 8) & 255) << 7) | (((D2 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i13 = (i12 & 64) != 0 ? 1 : 0;
                } else {
                    if (i10 == 3) {
                        i13 = (i12 & 32) != 0 ? 1 : 0;
                    } else {
                        i13 = 0;
                        z11 = false;
                    }
                    if (z11) {
                        i13 += 4;
                    }
                    if (D2 < i13) {
                        xVar.N(i14);
                        return false;
                    }
                    if (xVar.a() < D2) {
                        xVar.N(i14);
                        return false;
                    }
                    xVar.O((int) D2);
                }
            } catch (Throwable th2) {
                xVar.N(i14);
                throw th2;
            }
        }
    }

    @Override // w7.m
    public final t0 b(l3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t0 c(int i10, byte[] bArr) {
        af.a aVar;
        ArrayList arrayList = new ArrayList();
        x xVar = new x(bArr, i10);
        boolean z10 = false;
        if (xVar.a() < 10) {
            e2.a.l("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int D = xVar.D();
            if (D == 4801587) {
                int A = xVar.A();
                xVar.O(1);
                int A2 = xVar.A();
                int z11 = xVar.z();
                if (A == 2) {
                    if ((A2 & 64) != 0) {
                        e2.a.l("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    aVar = new af.a(A, A >= 4 && (A2 & 128) != 0, z11);
                } else {
                    if (A == 3) {
                        if ((A2 & 64) != 0) {
                            int m10 = xVar.m();
                            xVar.O(m10);
                            z11 -= m10 + 4;
                        }
                    } else if (A == 4) {
                        if ((A2 & 64) != 0) {
                            int z12 = xVar.z();
                            xVar.O(z12 - 4);
                            z11 -= z12;
                        }
                        if ((A2 & 16) != 0) {
                            z11 -= 10;
                        }
                    } else {
                        a1.g.x(A, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    aVar = new af.a(A, A >= 4 && (A2 & 128) != 0, z11);
                }
                if (aVar != null) {
                    return null;
                }
                int i11 = aVar.a;
                int i12 = xVar.b;
                int i13 = i11 == 2 ? 6 : 10;
                int i14 = aVar.c;
                if (aVar.b) {
                    i14 = w(i14, xVar);
                }
                xVar.M(i12 + i14);
                if (!x(xVar, i11, i13, false)) {
                    if (i11 != 4 || !x(xVar, 4, i13, true)) {
                        a1.g.x(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z10 = true;
                }
                while (xVar.a() >= i13) {
                    i h = h(i11, xVar, z10, i13, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new t0(arrayList);
            }
            e2.a.l("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(D))));
        }
        aVar = null;
        if (aVar != null) {
        }
    }
}
