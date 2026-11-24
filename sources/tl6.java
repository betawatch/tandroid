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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tl6 implements s84 {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public pl6 A;
    public sl6 B;
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
    public final rb3 a;
    public int[] a0;
    public final dbc b;
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
    public final tcb h;
    public int h0;
    public final yw7 i;
    public int i0;
    public final yw7 j;
    public int j0;
    public final yw7 k;
    public boolean k0;
    public final yw7 l;
    public boolean l0;
    public final yw7 m;
    public boolean m0;
    public final yw7 n;
    public short n0;
    public final yw7 o;
    public byte o0;
    public final yw7 p;
    public boolean p0;
    public final yw7 q;
    public u84 q0;
    public final yw7 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = hac.a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        aq1.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        aq1.q(nm7.J2, hashMap, "htc_video_rotA-180", nm7.s4, "htc_video_rotA-270");
        w0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public tl6(tcb tcbVar, int i) {
        rb3 rb3Var = new rb3();
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
        this.a = rb3Var;
        rb3Var.d = new k44(this, (byte) 15);
        this.h = tcbVar;
        this.F = new SparseArray();
        this.e = (i & 1) == 0;
        this.g = (i & 2) == 0;
        this.f = true;
        this.b = new dbc();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new yw7(4);
        this.l = new yw7(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new yw7(4);
        this.i = new yw7(add.a);
        this.j = new yw7(4);
        this.n = new yw7();
        this.o = new yw7();
        this.p = new yw7(8);
        this.q = new yw7();
        this.r = new yw7();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] j(long j, String str, long j2) {
        jte.f(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = hac.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        int i = 0;
        this.U = false;
        boolean z = true;
        while (z) {
            if (this.U) {
                return 0;
            }
            vb3 vb3Var = (vb3) t84Var;
            boolean a = this.a.a(vb3Var);
            if (a) {
                long j = vb3Var.d;
                if (this.Q) {
                    this.R = j;
                    u21Var.a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j2 = this.R;
                    if (j2 != -1) {
                        u21Var.a = j2;
                        this.R = -1L;
                        return 1;
                    }
                }
                long j3 = ((vb3) t84Var).d;
                if (this.M) {
                    this.O = j3;
                    u21Var.a = this.N;
                    this.M = false;
                    return 1;
                }
                if (this.C) {
                    long j4 = this.O;
                    if (j4 != -1) {
                        u21Var.a = j4;
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
            sl6 sl6Var = (sl6) sparseArray.valueAt(i);
            sl6Var.d0.getClass();
            g4c g4cVar = sl6Var.W;
            if (g4cVar != null) {
                g4cVar.a(sl6Var.d0, sl6Var.l);
            }
            i++;
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        de deVar = new de((byte) 16);
        yw7 yw7Var = (yw7) deVar.c;
        vb3 vb3Var = (vb3) t84Var;
        long j = vb3Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        vb3Var.d(yw7Var.a, 0, 4, false);
        long C = yw7Var.C();
        deVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i2 = deVar.b + 1;
                deVar.b = i2;
                if (i2 == i) {
                    break;
                }
                vb3Var.d(yw7Var.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (yw7Var.a[0] & 255);
            } else {
                long o0 = deVar.o0(vb3Var);
                long j3 = deVar.b;
                if (o0 != Long.MIN_VALUE && (j == -1 || j3 + o0 < j)) {
                    while (true) {
                        long j4 = deVar.b;
                        long j5 = j3 + o0;
                        if (j4 < j5) {
                            if (deVar.o0(vb3Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long o02 = deVar.o0(vb3Var);
                            if (o02 < 0 || o02 > 2147483647L) {
                                break;
                            }
                            if (o02 != 0) {
                                int i3 = (int) o02;
                                vb3Var.a(i3, false);
                                deVar.b += i3;
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

    @Override // s84
    public final void d(long j, long j2) {
        this.T = -9223372036854775807L;
        this.V = (byte) 0;
        rb3 rb3Var = this.a;
        rb3Var.e = (byte) 0;
        rb3Var.b.clear();
        dbc dbcVar = rb3Var.c;
        dbcVar.a = false;
        dbcVar.b = 0;
        dbc dbcVar2 = this.b;
        dbcVar2.a = false;
        dbcVar2.b = 0;
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
            g4c g4cVar = ((sl6) sparseArray.valueAt(i)).W;
            if (g4cVar != null) {
                g4cVar.b = false;
                g4cVar.c = 0;
            }
            i++;
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        if (this.g) {
            u84Var = new yh4(u84Var, this.h);
        }
        this.q0 = u84Var;
    }

    public final void g(int i) {
        if (this.G) {
            return;
        }
        throw bx7.a("Element " + i + " must be in a Cues", null);
    }

    public final void h(int i) {
        if (this.B != null) {
            return;
        }
        throw bx7.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(sl6 sl6Var, long j, int i, int i2, int i3) {
        byte[] j2;
        int i4;
        int i5;
        g4c g4cVar = sl6Var.W;
        if (g4cVar != null) {
            g4cVar.b(sl6Var.d0, j, i, i2, i3, sl6Var.l);
        } else {
            if ("S_TEXT/UTF8".equals(sl6Var.c) || "S_TEXT/ASS".equals(sl6Var.c) || "S_TEXT/SSA".equals(sl6Var.c) || "S_TEXT/WEBVTT".equals(sl6Var.c)) {
                if (this.Z > 1) {
                    ncd.f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.X;
                    if (j3 == -9223372036854775807L) {
                        ncd.f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = sl6Var.c;
                        yw7 yw7Var = this.o;
                        byte[] bArr = yw7Var.a;
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
                                i98.g();
                                return;
                        }
                        System.arraycopy(j2, 0, bArr, i4, j2.length);
                        int i6 = yw7Var.b;
                        while (true) {
                            if (i6 < yw7Var.c) {
                                if (yw7Var.a[i6] == 0) {
                                    yw7Var.M(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        sl6Var.d0.e(yw7Var.c, yw7Var);
                        i5 = i2 + yw7Var.c;
                        if ((i & TLObject.FLAG_28) != 0) {
                            int i7 = this.Z;
                            yw7 yw7Var2 = this.r;
                            if (i7 > 1) {
                                yw7Var2.K(0);
                            } else {
                                int i8 = yw7Var2.c;
                                sl6Var.d0.b(yw7Var2, i8, 2);
                                i5 += i8;
                            }
                        }
                        sl6Var.d0.a(j, i, i5, i3, sl6Var.l);
                    }
                }
            }
            i5 = i2;
            if ((i & TLObject.FLAG_28) != 0) {
            }
            sl6Var.d0.a(j, i, i5, i3, sl6Var.l);
        }
        this.U = true;
    }

    public final pl6 k(int i) {
        pl6 pl6Var = this.A;
        if (pl6Var != null) {
            return pl6Var;
        }
        throw bx7.a("Element " + i + " must be in an EditionEntry", null);
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
                u84 u84Var = this.q0;
                u84Var.getClass();
                u84Var.B();
                this.z = false;
                return;
            }
            if (((sl6) sparseArray.valueAt(i)).X) {
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
        u84 u84Var = this.q0;
        u84Var.getClass();
        u84Var.f0(new od0(this.x));
        this.C = true;
    }

    public final void n(vb3 vb3Var, int i) {
        yw7 yw7Var = this.k;
        if (yw7Var.c >= i) {
            return;
        }
        byte[] bArr = yw7Var.a;
        if (bArr.length < i) {
            yw7Var.c(Math.max(bArr.length << 1, i));
        }
        byte[] bArr2 = yw7Var.a;
        int i2 = yw7Var.c;
        vb3Var.c(bArr2, i2, i - i2, false);
        yw7Var.M(i);
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
            throw bx7.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        String str = hac.a;
        return hac.b0(j, j2, 1000L, RoundingMode.DOWN);
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
    public final void q(sl6 sl6Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        ?? r29;
        boolean z2;
        nf7 a;
        boolean z3;
        long j6 = 0;
        int i = 1;
        boolean z4 = false;
        if (!sl6Var.Y) {
            LongSparseArray longSparseArray = this.d;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    pl6 pl6Var = (pl6) longSparseArray.valueAt(i2);
                    long j7 = pl6Var.e;
                    if (j7 == 0 || j7 == sl6Var.e) {
                        long j8 = pl6Var.b;
                        String str = hac.a;
                        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
                            j8 /= 1000000;
                        }
                        long j9 = j8;
                        long j10 = pl6Var.c;
                        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                            j10 /= 1000000;
                        }
                        arrayList.add(new sk1(j9, j10, pl6Var.d, pl6Var.f != null ? new sy5(pl6Var.g, pl6Var.f) : null));
                    }
                }
                if (!arrayList.isEmpty()) {
                    go4 go4Var = sl6Var.e0;
                    go4Var.getClass();
                    fo4 a2 = go4Var.a();
                    nf7 nf7Var = sl6Var.e0.m;
                    a2.l = nf7Var != null ? nf7Var.a((lf7[]) arrayList.toArray(new qk1[0])) : new nf7(arrayList);
                    sl6Var.e0 = new go4(a2);
                    sl6Var.Y = true;
                }
            }
        }
        long j11 = this.x;
        long j12 = this.u;
        long j13 = this.t;
        if (sl6Var.f != 2) {
            return;
        }
        List list = (List) this.F.get(sl6Var.d);
        if (sl6Var.Z || list == null || list.isEmpty()) {
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
                ql6 ql6Var = (ql6) list.get(i3);
                boolean z5 = z4;
                long j15 = j11;
                long j16 = ql6Var.a;
                z = z5;
                int i5 = i;
                long j17 = ql6Var.c;
                long j18 = j12;
                long j19 = ql6Var.b;
                if (j16 > 10000000) {
                    break;
                }
                if (i3 < list.size() - i5) {
                    ql6 ql6Var2 = (ql6) list.get(i3 + 1);
                    j3 = j13;
                    j4 = (ql6Var2.b + ql6Var2.c) - (j19 + j17);
                    j5 = ql6Var2.a - j16;
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
                j2 = ((ql6) list.get(i4)).a;
                r29 = z;
                if (j2 == j) {
                    go4 go4Var2 = sl6Var.e0;
                    go4Var2.getClass();
                    nf7 nf7Var2 = go4Var2.m;
                    mpb mpbVar = new mpb(j2);
                    if (nf7Var2 == null) {
                        z2 = true;
                        lf7[] lf7VarArr = new lf7[1];
                        lf7VarArr[r29] = mpbVar;
                        a = new nf7(lf7VarArr);
                    } else {
                        z2 = true;
                        lf7[] lf7VarArr2 = new lf7[1];
                        lf7VarArr2[r29] = mpbVar;
                        a = nf7Var2.a(lf7VarArr2);
                    }
                    fo4 a3 = sl6Var.e0.a();
                    a3.l = a;
                    sl6Var.e0 = new go4(a3);
                    sl6Var.Z = z2;
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
    public final int r(vb3 vb3Var, sl6 sl6Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        short s;
        if ("S_TEXT/UTF8".equals(sl6Var.c)) {
            s(vb3Var, r0, i);
            int i3 = this.i0;
            o();
            return i3;
        }
        if ("S_TEXT/ASS".equals(sl6Var.c) || "S_TEXT/SSA".equals(sl6Var.c)) {
            s(vb3Var, t0, i);
            int i4 = this.i0;
            o();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(sl6Var.c)) {
            s(vb3Var, u0, i);
            int i5 = this.i0;
            o();
            return i5;
        }
        if (sl6Var.X) {
            sl6Var.e0.getClass();
            go4 h = c1d.h(vb3Var, i, sl6Var.e0);
            sl6Var.e0 = h;
            sl6Var.d0.g(h);
            sl6Var.X = false;
            l();
        }
        yzb yzbVar = sl6Var.d0;
        boolean z2 = this.k0;
        yw7 yw7Var = this.n;
        int i6 = 2;
        if (!z2) {
            boolean z3 = sl6Var.j;
            yw7 yw7Var2 = this.k;
            if (z3) {
                this.d0 &= -1073741825;
                if (!this.l0) {
                    vb3Var.c(yw7Var2.a, 0, 1, false);
                    this.h0++;
                    byte b = yw7Var2.a[0];
                    if ((b & 128) == 128) {
                        throw bx7.a("Extension bit is set in signal byte", null);
                    }
                    this.o0 = b;
                    this.l0 = true;
                }
                byte b2 = this.o0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.d0 |= TLObject.FLAG_30;
                    if (!this.p0) {
                        yw7 yw7Var3 = this.p;
                        vb3Var.c(yw7Var3.a, 0, 8, false);
                        this.h0 += 8;
                        this.p0 = true;
                        yw7Var2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        yw7Var2.N(0);
                        yzbVar.b(yw7Var2, 1, 1);
                        this.i0++;
                        yw7Var3.N(0);
                        yzbVar.b(yw7Var3, 8, 1);
                        this.i0 += 8;
                    }
                    if (z4) {
                        if (!this.m0) {
                            vb3Var.c(yw7Var2.a, 0, 1, false);
                            this.h0++;
                            yw7Var2.N(0);
                            this.n0 = yw7Var2.A();
                            this.m0 = true;
                        }
                        int i7 = this.n0 << 2;
                        yw7Var2.K(i7);
                        vb3Var.c(yw7Var2.a, 0, i7, false);
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
                            int E = yw7Var2.E();
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
                        yw7 yw7Var4 = this.q;
                        yw7Var4.L(i8, array);
                        yzbVar.b(yw7Var4, i8, 1);
                        this.i0 += i8;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr = sl6Var.k;
                if (bArr != null) {
                    yw7Var.L(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(sl6Var.c) ? z : sl6Var.h > 0) {
                this.d0 |= TLObject.FLAG_28;
                this.r.K(0);
                int i16 = (yw7Var.c + i) - this.h0;
                yw7Var2.K(4);
                byte[] bArr2 = yw7Var2.a;
                bArr2[0] = (byte) ((i16 >> 24) & nm7.d4);
                bArr2[1] = (byte) ((i16 >> 16) & nm7.d4);
                bArr2[i2] = (byte) ((i16 >> 8) & nm7.d4);
                bArr2[3] = (byte) (i16 & nm7.d4);
                yzbVar.b(yw7Var2, 4, i2);
                this.i0 += 4;
            }
            this.k0 = true;
        }
        int i17 = i + yw7Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(sl6Var.c) && !"V_MPEGH/ISO/HEVC".equals(sl6Var.c)) {
            if (sl6Var.W != null) {
                jte.p(yw7Var.c == 0);
                sl6Var.W.c(vb3Var);
            }
            while (true) {
                int i18 = this.h0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int a = yw7Var.a();
                if (a > 0) {
                    f2 = Math.min(i19, a);
                    yzbVar.e(f2, yw7Var);
                } else {
                    f2 = yzbVar.f(vb3Var, i19, false);
                }
                this.h0 += f2;
                this.i0 += f2;
            }
        } else {
            yw7 yw7Var5 = this.j;
            byte[] bArr3 = yw7Var5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = sl6Var.f0;
            int i21 = 4 - i20;
            while (this.h0 < i17) {
                int i22 = this.j0;
                if (i22 == 0) {
                    int min = Math.min(i20, yw7Var.a());
                    vb3Var.c(bArr3, i21 + min, i20 - min, false);
                    if (min > 0) {
                        yw7Var.k(i21, min, bArr3);
                    }
                    this.h0 += i20;
                    yw7Var5.N(0);
                    this.j0 = yw7Var5.E();
                    yw7 yw7Var6 = this.i;
                    yw7Var6.N(0);
                    yzbVar.e(4, yw7Var6);
                    this.i0 += 4;
                } else {
                    int a2 = yw7Var.a();
                    if (a2 > 0) {
                        f = Math.min(i22, a2);
                        yzbVar.e(f, yw7Var);
                    } else {
                        f = yzbVar.f(vb3Var, i22, false);
                    }
                    this.h0 += f;
                    this.i0 += f;
                    this.j0 -= f;
                }
            }
        }
        if ("A_VORBIS".equals(sl6Var.c)) {
            yw7 yw7Var7 = this.l;
            yw7Var7.N(0);
            yzbVar.e(4, yw7Var7);
            this.i0 += 4;
        }
        int i23 = this.i0;
        o();
        return i23;
    }

    public final void s(vb3 vb3Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        yw7 yw7Var = this.o;
        byte[] bArr2 = yw7Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            yw7Var.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        vb3Var.c(yw7Var.a, bArr.length, i, false);
        yw7Var.N(0);
        yw7Var.M(length);
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
