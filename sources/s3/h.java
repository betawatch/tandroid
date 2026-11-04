package s3;

import b8.te;
import b8.xb;
import d2.r0;
import d2.s0;
import d2.u0;
import g2.n0;
import g2.y;
import g9.f0;
import g9.i0;
import g9.s1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends te {
    public static final s0.b b = new s0.b(13);
    public final g a;

    public h(g gVar) {
        this.a = gVar;
    }

    public static a d(y yVar, int i3, int i10) {
        int v;
        String concat;
        int A = yVar.A();
        Charset s6 = s(A);
        int i11 = i3 - 1;
        byte[] bArr = new byte[i11];
        yVar.k(0, i11, bArr);
        if (i10 == 2) {
            concat = "image/" + xb.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c2 = xb.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            concat = c2.indexOf(47) == -1 ? "image/".concat(c2) : c2;
        }
        int i12 = bArr[v + 1] & 255;
        int i13 = v + 2;
        int u10 = u(i13, A, bArr);
        String str = new String(bArr, i13, u10 - i13, s6);
        int r5 = r(A) + u10;
        return new a(i12, concat, str, i11 <= r5 ? n0.b : Arrays.copyOfRange(bArr, r5, i11));
    }

    public static c e(y yVar, int i3, int i10, boolean z10, int i11, g gVar) {
        int i12 = yVar.b;
        int v = v(i12, yVar.a);
        String str = new String(yVar.a, i12, v - i12, StandardCharsets.ISO_8859_1);
        yVar.N(v + 1);
        int m10 = yVar.m();
        int m11 = yVar.m();
        long C = yVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = yVar.C();
        long j10 = C2 == 4294967295L ? -1L : C2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i3;
        while (yVar.b < i13) {
            i h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, m10, m11, C, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d f(y yVar, int i3, int i10, boolean z10, int i11, g gVar) {
        int i12 = yVar.b;
        int v = v(i12, yVar.a);
        String str = new String(yVar.a, i12, v - i12, StandardCharsets.ISO_8859_1);
        yVar.N(v + 1);
        int A = yVar.A();
        boolean z11 = (A & 2) != 0;
        boolean z12 = (A & 1) != 0;
        int A2 = yVar.A();
        String[] strArr = new String[A2];
        for (int i13 = 0; i13 < A2; i13++) {
            int i14 = yVar.b;
            int v10 = v(i14, yVar.a);
            strArr[i13] = new String(yVar.a, i14, v10 - i14, StandardCharsets.ISO_8859_1);
            yVar.N(v10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i3;
        while (yVar.b < i15) {
            i h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e g(int i3, y yVar) {
        if (i3 < 4) {
            return null;
        }
        int A = yVar.A();
        Charset s6 = s(A);
        byte[] bArr = new byte[3];
        yVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i3 - 4;
        byte[] bArr2 = new byte[i10];
        yVar.k(0, i10, bArr2);
        int u10 = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u10, s6);
        int r5 = r(A) + u10;
        return new e(str, str2, l(bArr2, r5, u(r5, A, bArr2), s6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [s3.i] */
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
    /* JADX WARN: Type inference failed for: r1v28, types: [g2.y] */
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
    public static i h(int i3, y yVar, boolean z10, int i10, g gVar) {
        int E;
        int i11;
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        y yVar2;
        Throwable th2;
        y yVar3;
        ?? r122;
        y yVar4;
        r0 bVar;
        int i15 = i3;
        int A = yVar.A();
        int A2 = yVar.A();
        int A3 = yVar.A();
        int A4 = i15 >= 3 ? yVar.A() : 0;
        if (i15 == 4) {
            E = yVar.E();
            if (!z10) {
                E = (((E >> 24) & hs.e4) << 21) | (E & hs.e4) | (((E >> 8) & hs.e4) << 7) | (((E >> 16) & hs.e4) << 14);
            }
        } else {
            E = i15 == 3 ? yVar.E() : yVar.D();
        }
        int i16 = E;
        int H = i15 >= 3 ? yVar.H() : 0;
        if (A == 0 && A2 == 0 && A3 == 0 && A4 == 0 && i16 == 0 && H == 0) {
            yVar.N(yVar.c);
            return null;
        }
        int i17 = yVar.b + i16;
        if (i17 > yVar.c) {
            g2.a.l("Id3Decoder", "Frame size exceeds remaining tag data");
            yVar.N(yVar.c);
            return null;
        }
        if (gVar != null) {
            boolean d = gVar.d(i15, A, A2, A3, A4);
            i15 = i15;
            r12 = A;
            i11 = A2;
            if (!d) {
                yVar.N(i17);
                return null;
            }
        } else {
            i11 = A2;
            r12 = A;
        }
        if (i15 == 3) {
            z11 = (H & 128) != 0;
            z14 = (H & 64) != 0;
            z15 = false;
            z13 = (H & 32) != 0;
            z12 = z11;
        } else if (i15 == 4) {
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
            g2.a.l("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            yVar.N(i17);
            return null;
        }
        if (z13) {
            i16--;
            yVar.O(1);
        }
        if (z12) {
            i16 -= 4;
            yVar.O(4);
        }
        if (z15) {
            i16 = w(i16, yVar);
        }
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                yVar3 = yVar;
            }
        } catch (Exception e10) {
            e = e10;
            int i18 = i16;
            i16 = i11;
            i11 = i18;
            i12 = r12;
            i13 = A3;
            i14 = A4;
            yVar2 = yVar;
            th2 = null;
            yVar2.N(i17);
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
            yVar2 = yVar;
            th2 = null;
            yVar2.N(i17);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i11 == 88 && A3 == 88 && (i15 == 2 || A4 == 88)) {
            bVar = o(i16, yVar);
        } else if (r12 == 84) {
            bVar = m(i16, yVar, t(i15, r12, i11, A3, A4));
        } else if (r12 == 87 && i11 == 88 && A3 == 88 && (i15 == 2 || A4 == 88)) {
            bVar = q(i16, yVar);
        } else if (r12 == 87) {
            bVar = p(i16, yVar, t(i15, r12, i11, A3, A4));
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
                    yVar2 = yVar;
                    yVar2.N(i17);
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
                    yVar2 = yVar;
                    yVar2.N(i17);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (r12 == 71 && i11 == 69 && A3 == 79 && (A4 == 66 || i15 == 2)) {
                    bVar = i(i16, yVar);
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
                        i15 = i3;
                        yVar4 = yVar;
                        if (i12 != 77) {
                        }
                        String t10 = t(i15, i12, i16, i13, i14);
                        byte[] bArr = new byte[i11];
                        yVar4.k(0, i11, bArr);
                        bVar = new b(t10, bArr);
                        r12 = yVar4;
                        r12.N(i17);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                        }
                        return r122;
                    }
                    if (r12 == 80 && i11 == 73 && A3 == 67) {
                        bVar = d(yVar, i16, i15);
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
                                bVar = e(yVar, i11, i15, z10, i10, gVar);
                                i15 = i3;
                                r12 = yVar;
                            } catch (Exception e14) {
                                e = e14;
                                i15 = i3;
                                yVar2 = yVar;
                                yVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                i15 = i3;
                                yVar2 = yVar;
                                yVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th4) {
                                th = th4;
                                yVar3 = yVar;
                                yVar3.N(i17);
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
                                    i15 = i3;
                                    y yVar5 = yVar;
                                    bVar = f(yVar5, i11, i15, z10, i10, gVar);
                                    r12 = yVar5;
                                } else {
                                    i15 = i3;
                                    yVar4 = yVar;
                                    if (i12 != 77 && i16 == 76 && i13 == 76 && i14 == 84) {
                                        bVar = j(i11, yVar4);
                                        r12 = yVar4;
                                    } else {
                                        String t102 = t(i15, i12, i16, i13, i14);
                                        byte[] bArr2 = new byte[i11];
                                        yVar4.k(0, i11, bArr2);
                                        bVar = new b(t102, bArr2);
                                        r12 = yVar4;
                                    }
                                }
                            } catch (Exception e16) {
                                e = e16;
                                yVar2 = r12;
                                yVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e17) {
                                e = e17;
                                yVar2 = r12;
                                yVar2.N(i17);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th5) {
                                th = th5;
                                yVar3 = r12;
                                yVar3.N(i17);
                                throw th;
                            }
                        }
                        r12.N(i17);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                            g2.a.m("Id3Decoder", "Failed to decode frame: id=" + t(i15, i12, i16, i13, i14) + ", frameSize=" + i11, e);
                        }
                        return r122;
                    }
                    bVar = g(i16, yVar);
                }
                int i22 = i16;
                i16 = i11;
                i11 = i22;
                i12 = r12;
                i13 = A3;
                i14 = A4;
                r12 = yVar;
                r12.N(i17);
                r122 = bVar;
                e = th2;
                if (r122 == 0) {
                }
                return r122;
            }
            bVar = k(i16, yVar);
        }
        int i23 = i16;
        i16 = i11;
        i11 = i23;
        i12 = r12;
        i13 = A3;
        i14 = A4;
        r12 = yVar;
        th2 = null;
        r12.N(i17);
        r122 = bVar;
        e = th2;
        if (r122 == 0) {
        }
        return r122;
    }

    public static f i(int i3, y yVar) {
        int A = yVar.A();
        Charset s6 = s(A);
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        int v = v(0, bArr);
        String n4 = u0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i11 = v + 1;
        int u10 = u(i11, A, bArr);
        String l10 = l(bArr, i11, u10, s6);
        int r5 = r(A) + u10;
        int u11 = u(r5, A, bArr);
        String l11 = l(bArr, r5, u11, s6);
        int r9 = r(A) + u11;
        return new f(n4, i10 <= r9 ? n0.b : Arrays.copyOfRange(bArr, r9, i10), l10, l11);
    }

    public static l j(int i3, y yVar) {
        int H = yVar.H();
        int D = yVar.D();
        int D2 = yVar.D();
        int A = yVar.A();
        int A2 = yVar.A();
        c4.f fVar = new c4.f();
        fVar.I(yVar);
        int i10 = ((i3 - 10) * 8) / (A + A2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int j10 = fVar.j(A);
            int j11 = fVar.j(A2);
            iArr[i11] = j10;
            iArr2[i11] = j11;
        }
        return new l(H, D, D2, iArr, iArr2);
    }

    public static m k(int i3, y yVar) {
        byte[] bArr = new byte[i3];
        yVar.k(0, i3, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i10 = v + 1;
        return new m(str, i3 <= i10 ? n0.b : Arrays.copyOfRange(bArr, i10, i3));
    }

    public static String l(byte[] bArr, int i3, int i10, Charset charset) {
        return (i10 <= i3 || i10 > bArr.length) ? "" : new String(bArr, i3, i10 - i3, charset);
    }

    public static n m(int i3, y yVar, String str) {
        if (i3 < 1) {
            return null;
        }
        int A = yVar.A();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        return new n(str, null, n(A, 0, bArr));
    }

    public static s1 n(int i3, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return i0.u("");
        }
        f0 p10 = i0.p();
        int u10 = u(i10, i3, bArr);
        while (i10 < u10) {
            p10.c(new String(bArr, i10, u10 - i10, s(i3)));
            i10 = r(i3) + u10;
            u10 = u(i10, i3, bArr);
        }
        s1 f10 = p10.f();
        return f10.isEmpty() ? i0.u("") : f10;
    }

    public static n o(int i3, y yVar) {
        if (i3 < 1) {
            return null;
        }
        int A = yVar.A();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        return new n("TXXX", new String(bArr, 0, u10, s(A)), n(A, r(A) + u10, bArr));
    }

    public static o p(int i3, y yVar, String str) {
        byte[] bArr = new byte[i3];
        yVar.k(0, i3, bArr);
        return new o(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o q(int i3, y yVar) {
        if (i3 < 1) {
            return null;
        }
        int A = yVar.A();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        String str = new String(bArr, 0, u10, s(A));
        int r5 = r(A) + u10;
        return new o("WXXX", str, l(bArr, r5, v(r5, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i3) {
        return (i3 == 0 || i3 == 3) ? 1 : 2;
    }

    public static Charset s(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t(int i3, int i10, int i11, int i12, int i13) {
        return i3 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int u(int i3, int i10, byte[] bArr) {
        int v = v(i3, bArr);
        if (i10 == 0 || i10 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if ((v - i3) % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(v + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i3, byte[] bArr) {
        while (i3 < bArr.length) {
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
        return bArr.length;
    }

    public static int w(int i3, y yVar) {
        byte[] bArr = yVar.a;
        int i10 = yVar.b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i3) {
                return i3;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i3 - (i11 - i10)) - 2);
                i3--;
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
    public static boolean x(y yVar, int i3, int i10, boolean z10) {
        int D;
        long D2;
        int i11;
        int i12;
        int i13 = yVar.b;
        while (true) {
            try {
                boolean z11 = true;
                if (yVar.a() < i10) {
                    yVar.N(i13);
                    return true;
                }
                if (i3 >= 3) {
                    D = yVar.m();
                    D2 = yVar.C();
                    i11 = yVar.H();
                } else {
                    D = yVar.D();
                    D2 = yVar.D();
                    i11 = 0;
                }
                if (D == 0 && D2 == 0 && i11 == 0) {
                    yVar.N(i13);
                    return true;
                }
                if (i3 == 4 && !z10) {
                    if ((8421504 & D2) != 0) {
                        yVar.N(i13);
                        return false;
                    }
                    D2 = (((D2 >> 24) & 255) << 21) | (D2 & 255) | (((D2 >> 8) & 255) << 7) | (((D2 >> 16) & 255) << 14);
                }
                if (i3 == 4) {
                    i12 = (i11 & 64) != 0 ? 1 : 0;
                } else {
                    if (i3 == 3) {
                        i12 = (i11 & 32) != 0 ? 1 : 0;
                    } else {
                        i12 = 0;
                        z11 = false;
                    }
                    if (z11) {
                        i12 += 4;
                    }
                    if (D2 < i12) {
                        yVar.N(i13);
                        return false;
                    }
                    if (yVar.a() < D2) {
                        yVar.N(i13);
                        return false;
                    }
                    yVar.O((int) D2);
                }
            } catch (Throwable th2) {
                yVar.N(i13);
                throw th2;
            }
        }
    }

    @Override // b8.te
    public final s0 b(n3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 c(int i3, byte[] bArr) {
        df.a aVar;
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i3);
        boolean z10 = false;
        if (yVar.a() < 10) {
            g2.a.l("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int D = yVar.D();
            if (D == 4801587) {
                int A = yVar.A();
                yVar.O(1);
                int A2 = yVar.A();
                int z11 = yVar.z();
                if (A == 2) {
                    if ((A2 & 64) != 0) {
                        g2.a.l("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    aVar = new df.a(A, A >= 4 && (A2 & 128) != 0, z11);
                } else {
                    if (A == 3) {
                        if ((A2 & 64) != 0) {
                            int m10 = yVar.m();
                            yVar.O(m10);
                            z11 -= m10 + 4;
                        }
                    } else if (A == 4) {
                        if ((A2 & 64) != 0) {
                            int z12 = yVar.z();
                            yVar.O(z12 - 4);
                            z11 -= z12;
                        }
                        if ((A2 & 16) != 0) {
                            z11 -= 10;
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.o(A, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    aVar = new df.a(A, A >= 4 && (A2 & 128) != 0, z11);
                }
                if (aVar != null) {
                    return null;
                }
                int i10 = aVar.a;
                int i11 = yVar.b;
                int i12 = i10 == 2 ? 6 : 10;
                int i13 = aVar.c;
                if (aVar.b) {
                    i13 = w(i13, yVar);
                }
                yVar.M(i11 + i13);
                if (!x(yVar, i10, i12, false)) {
                    if (i10 != 4 || !x(yVar, 4, i12, true)) {
                        com.google.android.recaptcha.internal.a.o(i10, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z10 = true;
                }
                while (yVar.a() >= i12) {
                    i h = h(i10, yVar, z10, i12, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new s0(arrayList);
            }
            g2.a.l("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(D))));
        }
        aVar = null;
        if (aVar != null) {
        }
    }
}
