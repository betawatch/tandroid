package t3;

import a8.ga;
import c8.ca;
import e2.p0;
import e2.q0;
import e2.s0;
import h2.m0;
import h2.x;
import h9.f0;
import h9.i0;
import h9.t1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h extends ca {
    public static final s0.b b = new s0.b(17);
    public final g a;

    public h(g gVar) {
        this.a = gVar;
    }

    public static a d(x xVar, int i7, int i10) {
        int v;
        String concat;
        int A = xVar.A();
        Charset s5 = s(A);
        int i11 = i7 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        if (i10 == 2) {
            concat = "image/" + ga.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c10 = ga.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            concat = c10.indexOf(47) == -1 ? "image/".concat(c10) : c10;
        }
        int i12 = bArr[v + 1] & 255;
        int i13 = v + 2;
        int u10 = u(i13, A, bArr);
        String str = new String(bArr, i13, u10 - i13, s5);
        int r10 = r(A) + u10;
        return new a(i12, concat, str, i11 <= r10 ? m0.b : Arrays.copyOfRange(bArr, r10, i11));
    }

    public static c e(x xVar, int i7, int i10, boolean z9, int i11, g gVar) {
        int i12 = xVar.b;
        int v = v(i12, xVar.a);
        String str = new String(xVar.a, i12, v - i12, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int m10 = xVar.m();
        int m11 = xVar.m();
        long C = xVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = xVar.C();
        long j3 = C2 == 4294967295L ? -1L : C2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i7;
        while (xVar.b < i13) {
            i h = h(i10, xVar, z9, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, m10, m11, C, j3, (i[]) arrayList.toArray(new i[0]));
    }

    public static d f(x xVar, int i7, int i10, boolean z9, int i11, g gVar) {
        int i12 = xVar.b;
        int v = v(i12, xVar.a);
        String str = new String(xVar.a, i12, v - i12, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int A = xVar.A();
        boolean z10 = (A & 2) != 0;
        boolean z11 = (A & 1) != 0;
        int A2 = xVar.A();
        String[] strArr = new String[A2];
        for (int i13 = 0; i13 < A2; i13++) {
            int i14 = xVar.b;
            int v10 = v(i14, xVar.a);
            strArr[i13] = new String(xVar.a, i14, v10 - i14, StandardCharsets.ISO_8859_1);
            xVar.N(v10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i7;
        while (xVar.b < i15) {
            i h = h(i10, xVar, z9, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z10, z11, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e g(int i7, x xVar) {
        if (i7 < 4) {
            return null;
        }
        int A = xVar.A();
        Charset s5 = s(A);
        byte[] bArr = new byte[3];
        xVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i7 - 4;
        byte[] bArr2 = new byte[i10];
        xVar.k(0, i10, bArr2);
        int u10 = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u10, s5);
        int r10 = r(A) + u10;
        return new e(str, str2, l(bArr2, r10, u(r10, A, bArr2), s5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [t3.i] */
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
    /* JADX WARN: Type inference failed for: r1v28, types: [h2.x] */
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
    public static i h(int i7, x xVar, boolean z9, int i10, g gVar) {
        int E;
        int i11;
        ?? r12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        x xVar2;
        Throwable th2;
        x xVar3;
        ?? r122;
        x xVar4;
        p0 bVar;
        int i15 = i7;
        int A = xVar.A();
        int A2 = xVar.A();
        int A3 = xVar.A();
        int A4 = i15 >= 3 ? xVar.A() : 0;
        if (i15 == 4) {
            E = xVar.E();
            if (!z9) {
                E = (((E >> 24) & qs.e4) << 21) | (E & qs.e4) | (((E >> 8) & qs.e4) << 7) | (((E >> 16) & qs.e4) << 14);
            }
        } else {
            E = i15 == 3 ? xVar.E() : xVar.D();
        }
        int i16 = E;
        int H = i15 >= 3 ? xVar.H() : 0;
        if (A == 0 && A2 == 0 && A3 == 0 && A4 == 0 && i16 == 0 && H == 0) {
            xVar.N(xVar.c);
            return null;
        }
        int i17 = xVar.b + i16;
        if (i17 > xVar.c) {
            h2.a.l("Id3Decoder", "Frame size exceeds remaining tag data");
            xVar.N(xVar.c);
            return null;
        }
        if (gVar != null) {
            boolean b10 = gVar.b(i15, A, A2, A3, A4);
            i15 = i15;
            r12 = A;
            i11 = A2;
            if (!b10) {
                xVar.N(i17);
                return null;
            }
        } else {
            i11 = A2;
            r12 = A;
        }
        if (i15 == 3) {
            z10 = (H & 128) != 0;
            z13 = (H & 64) != 0;
            z14 = false;
            z12 = (H & 32) != 0;
            z11 = z10;
        } else if (i15 == 4) {
            boolean z15 = (H & 64) != 0;
            boolean z16 = (H & 8) != 0;
            z13 = (H & 4) != 0;
            z14 = (H & 2) != 0;
            z11 = (H & 1) != 0;
            boolean z17 = z16;
            z12 = z15;
            z10 = z17;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z10 || z13) {
            h2.a.l("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            xVar.N(i17);
            return null;
        }
        if (z12) {
            i16--;
            xVar.O(1);
        }
        if (z11) {
            i16 -= 4;
            xVar.O(4);
        }
        if (z14) {
            i16 = w(i16, xVar);
        }
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                xVar3 = xVar;
            }
        } catch (Exception e10) {
            e = e10;
            int i18 = i16;
            i16 = i11;
            i11 = i18;
            i12 = r12;
            i13 = A3;
            i14 = A4;
            xVar2 = xVar;
            th2 = null;
            xVar2.N(i17);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        } catch (OutOfMemoryError e11) {
            e = e11;
            int i182 = i16;
            i16 = i11;
            i11 = i182;
            i12 = r12;
            i13 = A3;
            i14 = A4;
            xVar2 = xVar;
            th2 = null;
            xVar2.N(i17);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i11 == 88 && A3 == 88 && (i15 == 2 || A4 == 88)) {
            bVar = o(i16, xVar);
        } else if (r12 == 84) {
            bVar = m(i16, xVar, t(i15, r12, i11, A3, A4));
        } else if (r12 == 87 && i11 == 88 && A3 == 88 && (i15 == 2 || A4 == 88)) {
            bVar = q(i16, xVar);
        } else if (r12 == 87) {
            bVar = p(i16, xVar, t(i15, r12, i11, A3, A4));
        } else {
            if (r12 != 80 || i11 != 82 || A3 != 73 || A4 != 86) {
                th2 = null;
                try {
                } catch (Exception e12) {
                    e = e12;
                    int i19 = i16;
                    i16 = i11;
                    i11 = i19;
                    i12 = r12;
                    i13 = A3;
                    i14 = A4;
                    xVar2 = xVar;
                    xVar2.N(i17);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                } catch (OutOfMemoryError e13) {
                    e = e13;
                    int i192 = i16;
                    i16 = i11;
                    i11 = i192;
                    i12 = r12;
                    i13 = A3;
                    i14 = A4;
                    xVar2 = xVar;
                    xVar2.N(i17);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (r12 == 71 && i11 == 69 && A3 == 79 && (A4 == 66 || i15 == 2)) {
                    bVar = i(i16, xVar);
                } else {
                    if (i15 != 2) {
                        if (r12 == 65) {
                            if (i11 == 80) {
                                if (A3 == 73) {
                                }
                            }
                        }
                        if (r12 == 67) {
                        }
                        if (r12 != 67) {
                        }
                        int i20 = i16;
                        i16 = i11;
                        i11 = i20;
                        i12 = r12;
                        i13 = A3;
                        i14 = A4;
                        if (i12 != 67) {
                        }
                        i15 = i7;
                        xVar4 = xVar;
                        if (i12 != 77) {
                        }
                        String t6 = t(i15, i12, i16, i13, i14);
                        byte[] bArr = new byte[i11];
                        xVar4.k(0, i11, bArr);
                        bVar = new b(t6, bArr);
                        r12 = xVar4;
                        r12.N(i17);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                        }
                        return r122;
                    }
                    if (r12 == 80 && i11 == 73 && A3 == 67) {
                        bVar = d(xVar, i16, i15);
                    }
                    if (r12 == 67 || i11 != 79 || A3 != 77 || (A4 != 77 && i15 != 2)) {
                        if (r12 != 67 && i11 == 72 && A3 == 65 && A4 == 80) {
                            int i21 = i16;
                            i16 = i11;
                            i11 = i21;
                            i12 = r12;
                            i13 = A3;
                            i14 = A4;
                            try {
                                bVar = e(xVar, i11, i15, z9, i10, gVar);
                                i15 = i7;
                                r12 = xVar;
                            } catch (Exception e14) {
                                e = e14;
                                i15 = i7;
                                xVar2 = xVar;
                                xVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                i15 = i7;
                                xVar2 = xVar;
                                xVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th4) {
                                th = th4;
                                xVar3 = xVar;
                                xVar3.N(i17);
                                throw th;
                            }
                        } else {
                            int i202 = i16;
                            i16 = i11;
                            i11 = i202;
                            i12 = r12;
                            i13 = A3;
                            i14 = A4;
                            try {
                                if (i12 != 67 && i16 == 84 && i13 == 79 && i14 == 67) {
                                    i15 = i7;
                                    x xVar5 = xVar;
                                    bVar = f(xVar5, i11, i15, z9, i10, gVar);
                                    r12 = xVar5;
                                } else {
                                    i15 = i7;
                                    xVar4 = xVar;
                                    if (i12 != 77 && i16 == 76 && i13 == 76 && i14 == 84) {
                                        bVar = j(i11, xVar4);
                                        r12 = xVar4;
                                    } else {
                                        String t62 = t(i15, i12, i16, i13, i14);
                                        byte[] bArr2 = new byte[i11];
                                        xVar4.k(0, i11, bArr2);
                                        bVar = new b(t62, bArr2);
                                        r12 = xVar4;
                                    }
                                }
                            } catch (Exception e16) {
                                e = e16;
                                xVar2 = r12;
                                xVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e17) {
                                e = e17;
                                xVar2 = r12;
                                xVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th5) {
                                th = th5;
                                xVar3 = r12;
                                xVar3.N(i17);
                                throw th;
                            }
                        }
                        r12.N(i17);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                            h2.a.m("Id3Decoder", "Failed to decode frame: id=" + t(i15, i12, i16, i13, i14) + ", frameSize=" + i11, e);
                        }
                        return r122;
                    }
                    bVar = g(i16, xVar);
                }
                int i22 = i16;
                i16 = i11;
                i11 = i22;
                i12 = r12;
                i13 = A3;
                i14 = A4;
                r12 = xVar;
                r12.N(i17);
                r122 = bVar;
                e = th2;
                if (r122 == 0) {
                }
                return r122;
            }
            bVar = k(i16, xVar);
        }
        int i23 = i16;
        i16 = i11;
        i11 = i23;
        i12 = r12;
        i13 = A3;
        i14 = A4;
        r12 = xVar;
        th2 = null;
        r12.N(i17);
        r122 = bVar;
        e = th2;
        if (r122 == 0) {
        }
        return r122;
    }

    public static f i(int i7, x xVar) {
        int A = xVar.A();
        Charset s5 = s(A);
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int v = v(0, bArr);
        String n10 = s0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i11 = v + 1;
        int u10 = u(i11, A, bArr);
        String l10 = l(bArr, i11, u10, s5);
        int r10 = r(A) + u10;
        int u11 = u(r10, A, bArr);
        String l11 = l(bArr, r10, u11, s5);
        int r11 = r(A) + u11;
        return new f(n10, i10 <= r11 ? m0.b : Arrays.copyOfRange(bArr, r11, i10), l10, l11);
    }

    public static l j(int i7, x xVar) {
        int H = xVar.H();
        int D = xVar.D();
        int D2 = xVar.D();
        int A = xVar.A();
        int A2 = xVar.A();
        d4.f fVar = new d4.f();
        fVar.I(xVar);
        int i10 = ((i7 - 10) * 8) / (A + A2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int j3 = fVar.j(A);
            int j10 = fVar.j(A2);
            iArr[i11] = j3;
            iArr2[i11] = j10;
        }
        return new l(H, D, D2, iArr, iArr2);
    }

    public static m k(int i7, x xVar) {
        byte[] bArr = new byte[i7];
        xVar.k(0, i7, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i10 = v + 1;
        return new m(str, i7 <= i10 ? m0.b : Arrays.copyOfRange(bArr, i10, i7));
    }

    public static String l(byte[] bArr, int i7, int i10, Charset charset) {
        return (i10 <= i7 || i10 > bArr.length) ? "" : new String(bArr, i7, i10 - i7, charset);
    }

    public static n m(int i7, x xVar, String str) {
        if (i7 < 1) {
            return null;
        }
        int A = xVar.A();
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        return new n(str, null, n(A, 0, bArr));
    }

    public static t1 n(int i7, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return i0.u("");
        }
        f0 p10 = i0.p();
        int u10 = u(i10, i7, bArr);
        while (i10 < u10) {
            p10.c(new String(bArr, i10, u10 - i10, s(i7)));
            i10 = r(i7) + u10;
            u10 = u(i10, i7, bArr);
        }
        t1 f10 = p10.f();
        return f10.isEmpty() ? i0.u("") : f10;
    }

    public static n o(int i7, x xVar) {
        if (i7 < 1) {
            return null;
        }
        int A = xVar.A();
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        return new n("TXXX", new String(bArr, 0, u10, s(A)), n(A, r(A) + u10, bArr));
    }

    public static o p(int i7, x xVar, String str) {
        byte[] bArr = new byte[i7];
        xVar.k(0, i7, bArr);
        return new o(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o q(int i7, x xVar) {
        if (i7 < 1) {
            return null;
        }
        int A = xVar.A();
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        String str = new String(bArr, 0, u10, s(A));
        int r10 = r(A) + u10;
        return new o("WXXX", str, l(bArr, r10, v(r10, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static Charset s(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t(int i7, int i10, int i11, int i12, int i13) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int u(int i7, int i10, byte[] bArr) {
        int v = v(i7, bArr);
        if (i10 == 0 || i10 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if ((v - i7) % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(v + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i7, byte[] bArr) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int w(int i7, x xVar) {
        byte[] bArr = xVar.a;
        int i10 = xVar.b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i7) {
                return i7;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i7 - (i11 - i10)) - 2);
                i7--;
            }
            i11 = i12;
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
    public static boolean x(x xVar, int i7, int i10, boolean z9) {
        int D;
        long D2;
        int i11;
        int i12;
        int i13 = xVar.b;
        while (true) {
            try {
                boolean z10 = true;
                if (xVar.a() < i10) {
                    xVar.N(i13);
                    return true;
                }
                if (i7 >= 3) {
                    D = xVar.m();
                    D2 = xVar.C();
                    i11 = xVar.H();
                } else {
                    D = xVar.D();
                    D2 = xVar.D();
                    i11 = 0;
                }
                if (D == 0 && D2 == 0 && i11 == 0) {
                    xVar.N(i13);
                    return true;
                }
                if (i7 == 4 && !z9) {
                    if ((8421504 & D2) != 0) {
                        xVar.N(i13);
                        return false;
                    }
                    D2 = (((D2 >> 24) & 255) << 21) | (D2 & 255) | (((D2 >> 8) & 255) << 7) | (((D2 >> 16) & 255) << 14);
                }
                if (i7 == 4) {
                    i12 = (i11 & 64) != 0 ? 1 : 0;
                } else {
                    if (i7 == 3) {
                        i12 = (i11 & 32) != 0 ? 1 : 0;
                    } else {
                        i12 = 0;
                        z10 = false;
                    }
                    if (z10) {
                        i12 += 4;
                    }
                    if (D2 < i12) {
                        xVar.N(i13);
                        return false;
                    }
                    if (xVar.a() < D2) {
                        xVar.N(i13);
                        return false;
                    }
                    xVar.O((int) D2);
                }
            } catch (Throwable th2) {
                xVar.N(i13);
                throw th2;
            }
        }
    }

    @Override // c8.ca
    public final q0 b(o3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0 c(int i7, byte[] bArr) {
        gf.a aVar;
        ArrayList arrayList = new ArrayList();
        x xVar = new x(bArr, i7);
        boolean z9 = false;
        if (xVar.a() < 10) {
            h2.a.l("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int D = xVar.D();
            if (D == 4801587) {
                int A = xVar.A();
                xVar.O(1);
                int A2 = xVar.A();
                int z10 = xVar.z();
                if (A == 2) {
                    if ((A2 & 64) != 0) {
                        h2.a.l("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    aVar = new gf.a(A, A >= 4 && (A2 & 128) != 0, z10);
                } else {
                    if (A == 3) {
                        if ((A2 & 64) != 0) {
                            int m10 = xVar.m();
                            xVar.O(m10);
                            z10 -= m10 + 4;
                        }
                    } else if (A == 4) {
                        if ((A2 & 64) != 0) {
                            int z11 = xVar.z();
                            xVar.O(z11 - 4);
                            z10 -= z11;
                        }
                        if ((A2 & 16) != 0) {
                            z10 -= 10;
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.o(A, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    aVar = new gf.a(A, A >= 4 && (A2 & 128) != 0, z10);
                }
                if (aVar != null) {
                    return null;
                }
                int i10 = aVar.a;
                int i11 = xVar.b;
                int i12 = i10 == 2 ? 6 : 10;
                int i13 = aVar.c;
                if (aVar.b) {
                    i13 = w(i13, xVar);
                }
                xVar.M(i11 + i13);
                if (!x(xVar, i10, i12, false)) {
                    if (i10 != 4 || !x(xVar, 4, i12, true)) {
                        com.google.android.recaptcha.internal.a.o(i10, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z9 = true;
                }
                while (xVar.a() >= i12) {
                    i h = h(i10, xVar, z9, i12, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new q0(arrayList);
            }
            h2.a.l("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(D))));
        }
        aVar = null;
        if (aVar != null) {
        }
    }
}
