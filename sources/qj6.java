// default package

import android.util.LongSparseArray;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qj6 implements j74 {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public mj6 A;
    public pj6 B;
    public boolean C;
    public int D;
    public long E;
    public final SparseArray F;
    public boolean G;
    public long H;
    public int I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public long R;
    public boolean S;
    public long T;
    public boolean U;
    public byte V;
    public long W;
    public long X;
    public int Y;
    public int Z;
    public final fa3 a;
    public int[] a0;
    public final c9c b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final LongSparseArray d;
    public int d0;
    public final boolean e;
    public int e0;
    public final boolean f;
    public boolean f0;
    public final boolean g;
    public long g0;
    public final sab h;
    public int h0;
    public final xu7 i;
    public int i0;
    public final xu7 j;
    public int j0;
    public final xu7 k;
    public boolean k0;
    public final xu7 l;
    public boolean l0;
    public final xu7 m;
    public boolean m0;
    public final xu7 n;
    public short n0;
    public final xu7 o;
    public byte o0;
    public final xu7 p;
    public boolean p0;
    public final xu7 q;
    public l74 q0;
    public final xu7 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = g8c.a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        oo1.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        oo1.q(kk7.J2, hashMap, "htc_video_rotA-180", kk7.s4, "htc_video_rotA-270");
        w0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public qj6(sab sabVar, int i) {
        fa3 fa3Var = new fa3();
        this.u = -1L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        this.L = -1;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.R = -1L;
        this.T = -9223372036854775807L;
        this.a = fa3Var;
        fa3Var.d = new pj4(this, (byte) 13);
        this.h = sabVar;
        this.F = new SparseArray();
        this.e = (i & 1) == 0;
        this.g = (i & 2) == 0;
        this.f = true;
        this.b = new c9c();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new xu7(4);
        this.l = new xu7(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new xu7(4);
        this.i = new xu7(yad.a);
        this.j = new xu7(4);
        this.n = new xu7();
        this.o = new xu7();
        this.p = new xu7(8);
        this.q = new xu7();
        this.r = new xu7();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] j(long j, String str, long j2) {
        gre.f(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = g8c.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // j74
    public final int b(k74 k74Var, m11 m11Var) {
        int i = 0;
        this.U = false;
        boolean z = true;
        while (z) {
            if (this.U) {
                return 0;
            }
            ja3 ja3Var = (ja3) k74Var;
            boolean a = this.a.a(ja3Var);
            if (a) {
                long j = ja3Var.d;
                if (this.Q) {
                    this.R = j;
                    m11Var.a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j2 = this.R;
                    if (j2 != -1) {
                        m11Var.a = j2;
                        this.R = -1L;
                        return 1;
                    }
                }
                long j3 = ((ja3) k74Var).d;
                if (this.M) {
                    this.O = j3;
                    m11Var.a = this.N;
                    this.M = false;
                    return 1;
                }
                if (this.C) {
                    long j4 = this.O;
                    if (j4 != -1) {
                        m11Var.a = j4;
                        this.O = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            z = a;
        }
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return -1;
            }
            pj6 pj6Var = (pj6) sparseArray.valueAt(i);
            pj6Var.d0.getClass();
            g2c g2cVar = pj6Var.W;
            if (g2cVar != null) {
                g2cVar.a(pj6Var.d0, pj6Var.l);
            }
            i++;
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        dd ddVar = new dd((byte) 16);
        xu7 xu7Var = (xu7) ddVar.c;
        ja3 ja3Var = (ja3) k74Var;
        long j = ja3Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        ja3Var.d(xu7Var.a, 0, 4, false);
        long C = xu7Var.C();
        ddVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i2 = ddVar.b + 1;
                ddVar.b = i2;
                if (i2 == i) {
                    break;
                }
                ja3Var.d(xu7Var.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xu7Var.a[0] & 255);
            } else {
                long n0 = ddVar.n0(ja3Var);
                long j3 = ddVar.b;
                if (n0 != Long.MIN_VALUE && (j == -1 || j3 + n0 < j)) {
                    while (true) {
                        long j4 = ddVar.b;
                        long j5 = j3 + n0;
                        if (j4 < j5) {
                            if (ddVar.n0(ja3Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long n02 = ddVar.n0(ja3Var);
                            if (n02 < 0 || n02 > 2147483647L) {
                                break;
                            }
                            if (n02 != 0) {
                                int i3 = (int) n02;
                                ja3Var.a(i3, false);
                                ddVar.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.T = -9223372036854775807L;
        this.V = (byte) 0;
        fa3 fa3Var = this.a;
        fa3Var.e = (byte) 0;
        fa3Var.b.clear();
        c9c c9cVar = fa3Var.c;
        c9cVar.a = false;
        c9cVar.b = 0;
        c9c c9cVar2 = this.b;
        c9cVar2.a = false;
        c9cVar2.b = 0;
        o();
        this.G = false;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        if (!this.C) {
            this.F.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            g2c g2cVar = ((pj6) sparseArray.valueAt(i)).W;
            if (g2cVar != null) {
                g2cVar.b = false;
                g2cVar.c = 0;
            }
            i++;
        }
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        if (this.g) {
            l74Var = new xf4(l74Var, this.h);
        }
        this.q0 = l74Var;
    }

    public final void g(int i) {
        if (this.G) {
            return;
        }
        throw av7.a("Element " + i + " must be in a Cues", null);
    }

    public final void h(int i) {
        if (this.B != null) {
            return;
        }
        throw av7.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(pj6 pj6Var, long j, int i, int i2, int i3) {
        byte[] j2;
        int i4;
        int i5;
        g2c g2cVar = pj6Var.W;
        if (g2cVar != null) {
            g2cVar.b(pj6Var.d0, j, i, i2, i3, pj6Var.l);
        } else {
            if ("S_TEXT/UTF8".equals(pj6Var.c) || "S_TEXT/ASS".equals(pj6Var.c) || "S_TEXT/SSA".equals(pj6Var.c) || "S_TEXT/WEBVTT".equals(pj6Var.c)) {
                if (this.Z > 1) {
                    lad.f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.X;
                    if (j3 == -9223372036854775807L) {
                        lad.f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = pj6Var.c;
                        xu7 xu7Var = this.o;
                        byte[] bArr = xu7Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                j2 = j(j3, "%01d:%02d:%02d:%02d", 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                j2 = j(j3, "%02d:%02d:%02d.%03d", 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                j2 = j(j3, "%02d:%02d:%02d,%03d", 1000L);
                                i4 = 19;
                                break;
                            default:
                                sc8.e();
                                return;
                        }
                        System.arraycopy(j2, 0, bArr, i4, j2.length);
                        int i6 = xu7Var.b;
                        while (true) {
                            if (i6 < xu7Var.c) {
                                if (xu7Var.a[i6] == 0) {
                                    xu7Var.M(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        pj6Var.d0.e(xu7Var.c, xu7Var);
                        i5 = i2 + xu7Var.c;
                        if ((i & TLObject.FLAG_28) != 0) {
                            int i7 = this.Z;
                            xu7 xu7Var2 = this.r;
                            if (i7 > 1) {
                                xu7Var2.K(0);
                            } else {
                                int i8 = xu7Var2.c;
                                pj6Var.d0.b(xu7Var2, i8, 2);
                                i5 += i8;
                            }
                        }
                        pj6Var.d0.a(j, i, i5, i3, pj6Var.l);
                    }
                }
            }
            i5 = i2;
            if ((i & TLObject.FLAG_28) != 0) {
            }
            pj6Var.d0.a(j, i, i5, i3, pj6Var.l);
        }
        this.U = true;
    }

    public final mj6 k(int i) {
        mj6 mj6Var = this.A;
        if (mj6Var != null) {
            return mj6Var;
        }
        throw av7.a("Element " + i + " must be in an EditionEntry", null);
    }

    public final void l() {
        if (!this.z) {
            return;
        }
        if (this.P != -1 && !this.S) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                l74 l74Var = this.q0;
                l74Var.getClass();
                l74Var.z();
                this.z = false;
                return;
            }
            if (((pj6) sparseArray.valueAt(i)).X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void m() {
        if (this.C) {
            return;
        }
        if (this.e && this.N != -1) {
            this.M = true;
            return;
        }
        l74 l74Var = this.q0;
        l74Var.getClass();
        l74Var.g0(new oc0(this.x));
        this.C = true;
    }

    public final void n(ja3 ja3Var, int i) {
        xu7 xu7Var = this.k;
        if (xu7Var.c >= i) {
            return;
        }
        byte[] bArr = xu7Var.a;
        if (bArr.length < i) {
            xu7Var.c(Math.max(bArr.length << 1, i));
        }
        byte[] bArr2 = xu7Var.a;
        int i2 = xu7Var.c;
        ja3Var.c(bArr2, i2, i - i2, false);
        xu7Var.M(i);
    }

    public final void o() {
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = (short) 0;
        this.o0 = (byte) 0;
        this.p0 = false;
        this.n.K(0);
    }

    public final long p(long j) {
        long j2 = this.v;
        if (j2 == -9223372036854775807L) {
            throw av7.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        String str = g8c.a;
        return g8c.b0(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(pj6 pj6Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        ?? r29;
        boolean z2;
        ld7 a;
        boolean z3;
        long j6 = 0;
        int i = 1;
        boolean z4 = false;
        if (!pj6Var.Y) {
            LongSparseArray longSparseArray = this.d;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    mj6 mj6Var = (mj6) longSparseArray.valueAt(i2);
                    long j7 = mj6Var.e;
                    if (j7 == 0 || j7 == pj6Var.e) {
                        long j8 = mj6Var.b;
                        String str = g8c.a;
                        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
                            j8 /= 1000000;
                        }
                        long j9 = j8;
                        long j10 = mj6Var.c;
                        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                            j10 /= 1000000;
                        }
                        arrayList.add(new kj1(j9, j10, mj6Var.d, mj6Var.f != null ? new sw5(mj6Var.g, mj6Var.f) : null));
                    }
                }
                if (!arrayList.isEmpty()) {
                    fm4 fm4Var = pj6Var.e0;
                    fm4Var.getClass();
                    em4 a2 = fm4Var.a();
                    ld7 ld7Var = pj6Var.e0.m;
                    a2.l = ld7Var != null ? ld7Var.a((jd7[]) arrayList.toArray(new ij1[0])) : new ld7(arrayList);
                    pj6Var.e0 = new fm4(a2);
                    pj6Var.Y = true;
                }
            }
        }
        long j11 = this.x;
        long j12 = this.u;
        long j13 = this.t;
        if (pj6Var.f != 2) {
            return;
        }
        List list = (List) this.F.get(pj6Var.d);
        if (pj6Var.Z || list == null || list.isEmpty()) {
            return;
        }
        if (list.isEmpty()) {
            j = -9223372036854775807L;
            z3 = false;
        } else {
            int min = Math.min(list.size(), 20);
            double d = 0.0d;
            j = -9223372036854775807L;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 >= min) {
                    z = z4;
                    break;
                }
                long j14 = j6;
                nj6 nj6Var = (nj6) list.get(i3);
                boolean z5 = z4;
                long j15 = j11;
                long j16 = nj6Var.a;
                z = z5;
                int i5 = i;
                long j17 = nj6Var.c;
                long j18 = j12;
                long j19 = nj6Var.b;
                if (j16 > 10000000) {
                    break;
                }
                if (i3 < list.size() - i5) {
                    nj6 nj6Var2 = (nj6) list.get(i3 + 1);
                    j3 = j13;
                    j4 = (nj6Var2.b + nj6Var2.c) - (j19 + j17);
                    j5 = nj6Var2.a - j16;
                } else {
                    j3 = j13;
                    j4 = (j18 + j3) - (j19 + j17);
                    j5 = j15 - j16;
                }
                if (j5 > j14) {
                    double d2 = j4 / j5;
                    if (d2 > d) {
                        i4 = i3;
                        d = d2;
                    }
                }
                i3++;
                z4 = z ? 1 : 0;
                j6 = j14;
                j11 = j15;
                j12 = j18;
                j13 = j3;
                i = 1;
            }
            z3 = z;
            if (i4 != -1) {
                j2 = ((nj6) list.get(i4)).a;
                r29 = z;
                if (j2 == j) {
                    fm4 fm4Var2 = pj6Var.e0;
                    fm4Var2.getClass();
                    ld7 ld7Var2 = fm4Var2.m;
                    lnb lnbVar = new lnb(j2);
                    if (ld7Var2 == null) {
                        z2 = true;
                        jd7[] jd7VarArr = new jd7[1];
                        jd7VarArr[r29] = lnbVar;
                        a = new ld7(jd7VarArr);
                    } else {
                        z2 = true;
                        jd7[] jd7VarArr2 = new jd7[1];
                        jd7VarArr2[r29] = lnbVar;
                        a = ld7Var2.a(jd7VarArr2);
                    }
                    em4 a3 = pj6Var.e0.a();
                    a3.l = a;
                    pj6Var.e0 = new fm4(a3);
                    pj6Var.Z = z2;
                    return;
                }
                return;
            }
        }
        j2 = j;
        r29 = z3;
        if (j2 == j) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v64, types: [int, short] */
    public final int r(ja3 ja3Var, pj6 pj6Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        short s;
        if ("S_TEXT/UTF8".equals(pj6Var.c)) {
            s(ja3Var, r0, i);
            int i3 = this.i0;
            o();
            return i3;
        }
        if ("S_TEXT/ASS".equals(pj6Var.c) || "S_TEXT/SSA".equals(pj6Var.c)) {
            s(ja3Var, t0, i);
            int i4 = this.i0;
            o();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(pj6Var.c)) {
            s(ja3Var, u0, i);
            int i5 = this.i0;
            o();
            return i5;
        }
        if (pj6Var.X) {
            pj6Var.e0.getClass();
            fm4 h = bzc.h(ja3Var, i, pj6Var.e0);
            pj6Var.e0 = h;
            pj6Var.d0.g(h);
            pj6Var.X = false;
            l();
        }
        wxb wxbVar = pj6Var.d0;
        boolean z2 = this.k0;
        xu7 xu7Var = this.n;
        int i6 = 2;
        if (!z2) {
            boolean z3 = pj6Var.j;
            xu7 xu7Var2 = this.k;
            if (z3) {
                this.d0 &= -1073741825;
                if (!this.l0) {
                    ja3Var.c(xu7Var2.a, 0, 1, false);
                    this.h0++;
                    byte b = xu7Var2.a[0];
                    if ((b & 128) == 128) {
                        throw av7.a("Extension bit is set in signal byte", null);
                    }
                    this.o0 = b;
                    this.l0 = true;
                }
                byte b2 = this.o0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.d0 |= TLObject.FLAG_30;
                    if (!this.p0) {
                        xu7 xu7Var3 = this.p;
                        ja3Var.c(xu7Var3.a, 0, 8, false);
                        this.h0 += 8;
                        this.p0 = true;
                        xu7Var2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        xu7Var2.N(0);
                        wxbVar.b(xu7Var2, 1, 1);
                        this.i0++;
                        xu7Var3.N(0);
                        wxbVar.b(xu7Var3, 8, 1);
                        this.i0 += 8;
                    }
                    if (z4) {
                        if (!this.m0) {
                            ja3Var.c(xu7Var2.a, 0, 1, false);
                            this.h0++;
                            xu7Var2.N(0);
                            this.n0 = xu7Var2.A();
                            this.m0 = true;
                        }
                        int i7 = this.n0 << 2;
                        xu7Var2.K(i7);
                        ja3Var.c(xu7Var2.a, 0, i7, false);
                        this.h0 += i7;
                        short s2 = (short) ((this.n0 / 2) + 1);
                        int i8 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.s;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.s = ByteBuffer.allocate(i8);
                        }
                        this.s.position(0);
                        this.s.putShort(s2);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            s = this.n0;
                            if (i9 >= s) {
                                break;
                            }
                            int E = xu7Var2.E();
                            int i11 = i9 % 2;
                            int i12 = i6;
                            ByteBuffer byteBuffer2 = this.s;
                            int i13 = E - i10;
                            if (i11 == 0) {
                                byteBuffer2.putShort((short) i13);
                            } else {
                                byteBuffer2.putInt(i13);
                            }
                            i9++;
                            i10 = E;
                            i6 = i12;
                        }
                        i2 = i6;
                        int i14 = (i - this.h0) - i10;
                        int i15 = s % 2;
                        ByteBuffer byteBuffer3 = this.s;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.s.putInt(0);
                        }
                        byte[] array = this.s.array();
                        xu7 xu7Var4 = this.q;
                        xu7Var4.L(i8, array);
                        wxbVar.b(xu7Var4, i8, 1);
                        this.i0 += i8;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr = pj6Var.k;
                if (bArr != null) {
                    xu7Var.L(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(pj6Var.c) ? z : pj6Var.h > 0) {
                this.d0 |= TLObject.FLAG_28;
                this.r.K(0);
                int i16 = (xu7Var.c + i) - this.h0;
                xu7Var2.K(4);
                byte[] bArr2 = xu7Var2.a;
                bArr2[0] = (byte) ((i16 >> 24) & kk7.d4);
                bArr2[1] = (byte) ((i16 >> 16) & kk7.d4);
                bArr2[i2] = (byte) ((i16 >> 8) & kk7.d4);
                bArr2[3] = (byte) (i16 & kk7.d4);
                wxbVar.b(xu7Var2, 4, i2);
                this.i0 += 4;
            }
            this.k0 = true;
        }
        int i17 = i + xu7Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(pj6Var.c) && !"V_MPEGH/ISO/HEVC".equals(pj6Var.c)) {
            if (pj6Var.W != null) {
                gre.p(xu7Var.c == 0);
                pj6Var.W.c(ja3Var);
            }
            while (true) {
                int i18 = this.h0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int a = xu7Var.a();
                if (a > 0) {
                    f2 = Math.min(i19, a);
                    wxbVar.e(f2, xu7Var);
                } else {
                    f2 = wxbVar.f(ja3Var, i19, false);
                }
                this.h0 += f2;
                this.i0 += f2;
            }
        } else {
            xu7 xu7Var5 = this.j;
            byte[] bArr3 = xu7Var5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = pj6Var.f0;
            int i21 = 4 - i20;
            while (this.h0 < i17) {
                int i22 = this.j0;
                if (i22 == 0) {
                    int min = Math.min(i20, xu7Var.a());
                    ja3Var.c(bArr3, i21 + min, i20 - min, false);
                    if (min > 0) {
                        xu7Var.k(i21, min, bArr3);
                    }
                    this.h0 += i20;
                    xu7Var5.N(0);
                    this.j0 = xu7Var5.E();
                    xu7 xu7Var6 = this.i;
                    xu7Var6.N(0);
                    wxbVar.e(4, xu7Var6);
                    this.i0 += 4;
                } else {
                    int a2 = xu7Var.a();
                    if (a2 > 0) {
                        f = Math.min(i22, a2);
                        wxbVar.e(f, xu7Var);
                    } else {
                        f = wxbVar.f(ja3Var, i22, false);
                    }
                    this.h0 += f;
                    this.i0 += f;
                    this.j0 -= f;
                }
            }
        }
        if ("A_VORBIS".equals(pj6Var.c)) {
            xu7 xu7Var7 = this.l;
            xu7Var7.N(0);
            wxbVar.e(4, xu7Var7);
            this.i0 += 4;
        }
        int i23 = this.i0;
        o();
        return i23;
    }

    public final void s(ja3 ja3Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        xu7 xu7Var = this.o;
        byte[] bArr2 = xu7Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            xu7Var.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ja3Var.c(xu7Var.a, bArr.length, i, false);
        xu7Var.N(0);
        xu7Var.M(length);
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
