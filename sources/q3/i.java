package q3;

import b2.o0;
import b2.p0;
import b2.r0;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.v;
import e9.a1;
import e9.f0;
import e9.i0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.js0;
import v7.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i extends w7.l {
    public static final js0 b = new js0(13);
    public final g a;

    public i(g gVar) {
        this.a = gVar;
    }

    public static a d(v vVar, int i10, int i11) {
        int v;
        String concat;
        int x10 = vVar.x();
        Charset s10 = s(x10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        vVar.h(0, i12, bArr);
        if (i11 == 2) {
            concat = "image/" + r6.b(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String b10 = r6.b(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            concat = b10.indexOf(47) == -1 ? "image/".concat(b10) : b10;
        }
        int i13 = bArr[v + 1] & 255;
        int i14 = v + 2;
        int u10 = u(i14, x10, bArr);
        String str = new String(bArr, i14, u10 - i14, s10);
        int r10 = r(x10) + u10;
        return new a(i13, concat, str, i12 <= r10 ? d0.b : Arrays.copyOfRange(bArr, r10, i12));
    }

    public static c e(v vVar, int i10, int i11, boolean z10, int i12, g gVar) {
        int i13 = vVar.b;
        int v = v(i13, vVar.a);
        String str = new String(vVar.a, i13, v - i13, StandardCharsets.ISO_8859_1);
        vVar.J(v + 1);
        int j3 = vVar.j();
        int j10 = vVar.j();
        long z11 = vVar.z();
        if (z11 == 4294967295L) {
            z11 = -1;
        }
        long z12 = vVar.z();
        long j11 = z12 == 4294967295L ? -1L : z12;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (vVar.b < i14) {
            j h = h(i11, vVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, j3, j10, z11, j11, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(v vVar, int i10, int i11, boolean z10, int i12, g gVar) {
        int i13 = vVar.b;
        int v = v(i13, vVar.a);
        String str = new String(vVar.a, i13, v - i13, StandardCharsets.ISO_8859_1);
        vVar.J(v + 1);
        int x10 = vVar.x();
        boolean z11 = (x10 & 2) != 0;
        boolean z12 = (x10 & 1) != 0;
        int x11 = vVar.x();
        String[] strArr = new String[x11];
        for (int i14 = 0; i14 < x11; i14++) {
            int i15 = vVar.b;
            int v9 = v(i15, vVar.a);
            strArr[i14] = new String(vVar.a, i15, v9 - i15, StandardCharsets.ISO_8859_1);
            vVar.J(v9 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (vVar.b < i16) {
            j h = h(i11, vVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, v vVar) {
        if (i10 < 4) {
            return null;
        }
        int x10 = vVar.x();
        Charset s10 = s(x10);
        byte[] bArr = new byte[3];
        vVar.h(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        vVar.h(0, i11, bArr2);
        int u10 = u(0, x10, bArr2);
        String str2 = new String(bArr2, 0, u10, s10);
        int r10 = r(x10) + u10;
        return new e(str, str2, l(bArr2, r10, u(r10, x10, bArr2), s10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [q3.j] */
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
    /* JADX WARN: Type inference failed for: r1v28, types: [e2.v] */
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
    public static j h(int i10, v vVar, boolean z10, int i11, g gVar) {
        int B;
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
        v vVar2;
        Throwable th2;
        v vVar3;
        ?? r122;
        v vVar4;
        o0 bVar;
        int i16 = i10;
        int x10 = vVar.x();
        int x11 = vVar.x();
        int x12 = vVar.x();
        int x13 = i16 >= 3 ? vVar.x() : 0;
        if (i16 == 4) {
            B = vVar.B();
            if (!z10) {
                B = (((B >> 24) & 255) << 21) | (B & 255) | (((B >> 8) & 255) << 7) | (((B >> 16) & 255) << 14);
            }
        } else {
            B = i16 == 3 ? vVar.B() : vVar.A();
        }
        int i17 = B;
        int D = i16 >= 3 ? vVar.D() : 0;
        if (x10 == 0 && x11 == 0 && x12 == 0 && x13 == 0 && i17 == 0 && D == 0) {
            vVar.J(vVar.c);
            return null;
        }
        int i18 = vVar.b + i17;
        if (i18 > vVar.c) {
            e2.a.n("Id3Decoder", "Frame size exceeds remaining tag data");
            vVar.J(vVar.c);
            return null;
        }
        if (gVar != null) {
            boolean b10 = gVar.b(i16, x10, x11, x12, x13);
            i16 = i16;
            r12 = x10;
            i12 = x11;
            if (!b10) {
                vVar.J(i18);
                return null;
            }
        } else {
            i12 = x11;
            r12 = x10;
        }
        if (i16 == 3) {
            z11 = (D & 128) != 0;
            z14 = (D & 64) != 0;
            z15 = false;
            z13 = (D & 32) != 0;
            z12 = z11;
        } else if (i16 == 4) {
            boolean z16 = (D & 64) != 0;
            boolean z17 = (D & 8) != 0;
            z14 = (D & 4) != 0;
            z15 = (D & 2) != 0;
            z12 = (D & 1) != 0;
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
            e2.a.n("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            vVar.J(i18);
            return null;
        }
        if (z13) {
            i17--;
            vVar.K(1);
        }
        if (z12) {
            i17 -= 4;
            vVar.K(4);
        }
        if (z15) {
            i17 = w(i17, vVar);
        }
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                vVar3 = vVar;
            }
        } catch (Exception e) {
            e = e;
            int i19 = i17;
            i17 = i12;
            i12 = i19;
            i13 = r12;
            i14 = x12;
            i15 = x13;
            vVar2 = vVar;
            th2 = null;
            vVar2.J(i18);
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
            i14 = x12;
            i15 = x13;
            vVar2 = vVar;
            th2 = null;
            vVar2.J(i18);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i12 == 88 && x12 == 88 && (i16 == 2 || x13 == 88)) {
            bVar = o(i17, vVar);
        } else if (r12 == 84) {
            bVar = m(i17, vVar, t(i16, r12, i12, x12, x13));
        } else if (r12 == 87 && i12 == 88 && x12 == 88 && (i16 == 2 || x13 == 88)) {
            bVar = q(i17, vVar);
        } else if (r12 == 87) {
            bVar = p(i17, vVar, t(i16, r12, i12, x12, x13));
        } else {
            if (r12 != 80 || i12 != 82 || x12 != 73 || x13 != 86) {
                th2 = null;
                try {
                } catch (Exception e10) {
                    e = e10;
                    int i20 = i17;
                    i17 = i12;
                    i12 = i20;
                    i13 = r12;
                    i14 = x12;
                    i15 = x13;
                    vVar2 = vVar;
                    vVar2.J(i18);
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
                    i14 = x12;
                    i15 = x13;
                    vVar2 = vVar;
                    vVar2.J(i18);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (r12 == 71 && i12 == 69 && x12 == 79 && (x13 == 66 || i16 == 2)) {
                    bVar = i(i17, vVar);
                } else {
                    if (i16 != 2) {
                        if (r12 == 65) {
                            if (i12 == 80) {
                                if (x12 == 73) {
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
                        i14 = x12;
                        i15 = x13;
                        if (i13 != 67) {
                        }
                        i16 = i10;
                        vVar4 = vVar;
                        if (i13 != 77) {
                        }
                        String t10 = t(i16, i13, i17, i14, i15);
                        byte[] bArr = new byte[i12];
                        vVar4.h(0, i12, bArr);
                        bVar = new b(t10, bArr);
                        r12 = vVar4;
                        r12.J(i18);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                        }
                        return r122;
                    }
                    if (r12 == 80 && i12 == 73 && x12 == 67) {
                        bVar = d(vVar, i17, i16);
                    }
                    if (r12 == 67 || i12 != 79 || x12 != 77 || (x13 != 77 && i16 != 2)) {
                        if (r12 != 67 && i12 == 72 && x12 == 65 && x13 == 80) {
                            int i22 = i17;
                            i17 = i12;
                            i12 = i22;
                            i13 = r12;
                            i14 = x12;
                            i15 = x13;
                            try {
                                bVar = e(vVar, i12, i16, z10, i11, gVar);
                                i16 = i10;
                                r12 = vVar;
                            } catch (Exception e12) {
                                e = e12;
                                i16 = i10;
                                vVar2 = vVar;
                                vVar2.J(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e13) {
                                e = e13;
                                i16 = i10;
                                vVar2 = vVar;
                                vVar2.J(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th4) {
                                th = th4;
                                vVar3 = vVar;
                                vVar3.J(i18);
                                throw th;
                            }
                        } else {
                            int i212 = i17;
                            i17 = i12;
                            i12 = i212;
                            i13 = r12;
                            i14 = x12;
                            i15 = x13;
                            try {
                                if (i13 != 67 && i17 == 84 && i14 == 79 && i15 == 67) {
                                    i16 = i10;
                                    v vVar5 = vVar;
                                    bVar = f(vVar5, i12, i16, z10, i11, gVar);
                                    r12 = vVar5;
                                } else {
                                    i16 = i10;
                                    vVar4 = vVar;
                                    if (i13 != 77 && i17 == 76 && i14 == 76 && i15 == 84) {
                                        bVar = j(i12, vVar4);
                                        r12 = vVar4;
                                    } else {
                                        String t102 = t(i16, i13, i17, i14, i15);
                                        byte[] bArr2 = new byte[i12];
                                        vVar4.h(0, i12, bArr2);
                                        bVar = new b(t102, bArr2);
                                        r12 = vVar4;
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                                vVar2 = r12;
                                vVar2.J(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                vVar2 = r12;
                                vVar2.J(i18);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th5) {
                                th = th5;
                                vVar3 = r12;
                                vVar3.J(i18);
                                throw th;
                            }
                        }
                        r12.J(i18);
                        r122 = bVar;
                        e = th2;
                        if (r122 == 0) {
                            e2.a.o("Id3Decoder", "Failed to decode frame: id=" + t(i16, i13, i17, i14, i15) + ", frameSize=" + i12, e);
                        }
                        return r122;
                    }
                    bVar = g(i17, vVar);
                }
                int i23 = i17;
                i17 = i12;
                i12 = i23;
                i13 = r12;
                i14 = x12;
                i15 = x13;
                r12 = vVar;
                r12.J(i18);
                r122 = bVar;
                e = th2;
                if (r122 == 0) {
                }
                return r122;
            }
            bVar = k(i17, vVar);
        }
        int i24 = i17;
        i17 = i12;
        i12 = i24;
        i13 = r12;
        i14 = x12;
        i15 = x13;
        r12 = vVar;
        th2 = null;
        r12.J(i18);
        r122 = bVar;
        e = th2;
        if (r122 == 0) {
        }
        return r122;
    }

    public static f i(int i10, v vVar) {
        int x10 = vVar.x();
        Charset s10 = s(x10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        int v = v(0, bArr);
        String n10 = r0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i12 = v + 1;
        int u10 = u(i12, x10, bArr);
        String l4 = l(bArr, i12, u10, s10);
        int r10 = r(x10) + u10;
        int u11 = u(r10, x10, bArr);
        String l10 = l(bArr, r10, u11, s10);
        int r11 = r(x10) + u11;
        return new f(n10, i11 <= r11 ? d0.b : Arrays.copyOfRange(bArr, r11, i11), l4, l10);
    }

    public static m j(int i10, v vVar) {
        int D = vVar.D();
        int A = vVar.A();
        int A2 = vVar.A();
        int x10 = vVar.x();
        int x11 = vVar.x();
        a4.h hVar = new a4.h();
        hVar.p(vVar);
        int i11 = ((i10 - 10) * 8) / (x10 + x11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = hVar.i(x10);
            int i14 = hVar.i(x11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new m(D, A, A2, iArr, iArr2);
    }

    public static n k(int i10, v vVar) {
        byte[] bArr = new byte[i10];
        vVar.h(0, i10, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i11 = v + 1;
        return new n(str, i10 <= i11 ? d0.b : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String l(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static o m(int i10, v vVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int x10 = vVar.x();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        return new o(str, null, n(x10, 0, bArr));
    }

    public static a1 n(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return i0.z("");
        }
        f0 u10 = i0.u();
        int u11 = u(i11, i10, bArr);
        while (i11 < u11) {
            u10.b(new String(bArr, i11, u11 - i11, s(i10)));
            i11 = r(i10) + u11;
            u11 = u(i11, i10, bArr);
        }
        a1 i12 = u10.i();
        return i12.isEmpty() ? i0.z("") : i12;
    }

    public static o o(int i10, v vVar) {
        if (i10 < 1) {
            return null;
        }
        int x10 = vVar.x();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        int u10 = u(0, x10, bArr);
        return new o("TXXX", new String(bArr, 0, u10, s(x10)), n(x10, r(x10) + u10, bArr));
    }

    public static p p(int i10, v vVar, String str) {
        byte[] bArr = new byte[i10];
        vVar.h(0, i10, bArr);
        return new p(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p q(int i10, v vVar) {
        if (i10 < 1) {
            return null;
        }
        int x10 = vVar.x();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        int u10 = u(0, x10, bArr);
        String str = new String(bArr, 0, u10, s(x10));
        int r10 = r(x10) + u10;
        return new p("WXXX", str, l(bArr, r10, v(r10, bArr), StandardCharsets.ISO_8859_1));
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

    public static int w(int i10, v vVar) {
        byte[] bArr = vVar.a;
        int i11 = vVar.b;
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
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(v vVar, int i10, int i11, boolean z10) {
        int A;
        long A2;
        int i12;
        int i13;
        int i14 = vVar.b;
        while (true) {
            try {
                boolean z11 = true;
                if (vVar.a() < i11) {
                    vVar.J(i14);
                    return true;
                }
                if (i10 >= 3) {
                    A = vVar.j();
                    A2 = vVar.z();
                    i12 = vVar.D();
                } else {
                    A = vVar.A();
                    A2 = vVar.A();
                    i12 = 0;
                }
                if (A == 0 && A2 == 0 && i12 == 0) {
                    vVar.J(i14);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & A2) != 0) {
                        vVar.J(i14);
                        return false;
                    }
                    A2 = (((A2 >> 24) & 255) << 21) | (A2 & 255) | (((A2 >> 8) & 255) << 7) | (((A2 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i13 = (i12 & 64) != 0 ? 1 : 0;
                } else {
                    if (i10 == 3) {
                        i13 = (i12 & 32) != 0 ? 1 : 0;
                    } else {
                        i13 = 0;
                    }
                    z11 = false;
                    if (z11) {
                        i13 += 4;
                    }
                    if (A2 < i13) {
                        vVar.J(i14);
                        return false;
                    }
                    if (vVar.a() < A2) {
                        vVar.J(i14);
                        return false;
                    }
                    vVar.K((int) A2);
                }
            } catch (Throwable th2) {
                vVar.J(i14);
                throw th2;
            }
        }
    }

    @Override // w7.l
    public final p0 b(l3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p0 c(int i10, byte[] bArr) {
        h hVar;
        ArrayList arrayList = new ArrayList();
        v vVar = new v(bArr, i10);
        boolean z10 = false;
        if (vVar.a() < 10) {
            e2.a.n("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int A = vVar.A();
            if (A == 4801587) {
                int x10 = vVar.x();
                vVar.K(1);
                int x11 = vVar.x();
                int w10 = vVar.w();
                if (x10 == 2) {
                    if ((x11 & 64) != 0) {
                        e2.a.n("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    hVar = new h(x10, x10 >= 4 && (x11 & 128) != 0, w10);
                } else {
                    if (x10 == 3) {
                        if ((x11 & 64) != 0) {
                            int j3 = vVar.j();
                            vVar.K(j3);
                            w10 -= j3 + 4;
                        }
                    } else if (x10 == 4) {
                        if ((x11 & 64) != 0) {
                            int w11 = vVar.w();
                            vVar.K(w11 - 4);
                            w10 -= w11;
                        }
                        if ((x11 & 16) != 0) {
                            w10 -= 10;
                        }
                    } else {
                        e2.l(x10, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    hVar = new h(x10, x10 >= 4 && (x11 & 128) != 0, w10);
                }
                if (hVar != null) {
                    return null;
                }
                int i11 = hVar.a;
                int i12 = vVar.b;
                int i13 = i11 == 2 ? 6 : 10;
                int i14 = hVar.b;
                if (hVar.c) {
                    i14 = w(i14, vVar);
                }
                vVar.I(i12 + i14);
                if (!x(vVar, i11, i13, false)) {
                    if (i11 != 4 || !x(vVar, 4, i13, true)) {
                        e2.l(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z10 = true;
                }
                while (vVar.a() >= i13) {
                    j h = h(i11, vVar, z10, i13, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new p0(arrayList);
            }
            e2.a.n("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(A))));
        }
        hVar = null;
        if (hVar != null) {
        }
    }
}
