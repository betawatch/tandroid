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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vl6 implements e84 {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public rl6 A;
    public ul6 B;
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
    public final ya3 a;
    public int[] a0;
    public final cdc b;
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
    public final peb h;
    public int h0;
    public final ey7 i;
    public int i0;
    public final ey7 j;
    public int j0;
    public final ey7 k;
    public boolean k0;
    public final ey7 l;
    public boolean l0;
    public final ey7 m;
    public boolean m0;
    public final ey7 n;
    public short n0;
    public final ey7 o;
    public byte o0;
    public final ey7 p;
    public boolean p0;
    public final ey7 q;
    public g84 q0;
    public final ey7 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = gcc.a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        bp1.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        bp1.q(jn7.J2, hashMap, "htc_video_rotA-180", jn7.s4, "htc_video_rotA-270");
        w0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public vl6(peb pebVar, int i) {
        ya3 ya3Var = new ya3();
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
        this.a = ya3Var;
        ya3Var.d = new v34(this, (byte) 14);
        this.h = pebVar;
        this.F = new SparseArray();
        this.e = (i & 1) == 0;
        this.g = (i & 2) == 0;
        this.f = true;
        this.b = new cdc();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new ey7(4);
        this.l = new ey7(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new ey7(4);
        this.i = new ey7(rfd.a);
        this.j = new ey7(4);
        this.n = new ey7();
        this.o = new ey7();
        this.p = new ey7(8);
        this.q = new ey7();
        this.r = new ey7();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] j(long j, long j2, String str) {
        yve.f(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = gcc.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        int i = 0;
        this.U = false;
        boolean z = true;
        while (z) {
            if (this.U) {
                return 0;
            }
            cb3 cb3Var = (cb3) f84Var;
            boolean a = this.a.a(cb3Var);
            if (a) {
                long j = cb3Var.d;
                if (this.Q) {
                    this.R = j;
                    v11Var.a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j2 = this.R;
                    if (j2 != -1) {
                        v11Var.a = j2;
                        this.R = -1L;
                        return 1;
                    }
                }
                long j3 = ((cb3) f84Var).d;
                if (this.M) {
                    this.O = j3;
                    v11Var.a = this.N;
                    this.M = false;
                    return 1;
                }
                if (this.C) {
                    long j4 = this.O;
                    if (j4 != -1) {
                        v11Var.a = j4;
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
            ul6 ul6Var = (ul6) sparseArray.valueAt(i);
            ul6Var.d0.getClass();
            g6c g6cVar = ul6Var.W;
            if (g6cVar != null) {
                g6cVar.a(ul6Var.d0, ul6Var.l);
            }
            i++;
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        ed edVar = new ed((byte) 16);
        ey7 ey7Var = (ey7) edVar.c;
        cb3 cb3Var = (cb3) f84Var;
        long j = cb3Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        cb3Var.d(ey7Var.a, 0, 4, false);
        long C = ey7Var.C();
        edVar.b = 4;
        while (true) {
            if (C != 440786851) {
                int i2 = edVar.b + 1;
                edVar.b = i2;
                if (i2 == i) {
                    break;
                }
                cb3Var.d(ey7Var.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (ey7Var.a[0] & 255);
            } else {
                long q0 = edVar.q0(cb3Var);
                long j3 = edVar.b;
                if (q0 != Long.MIN_VALUE && (j == -1 || j3 + q0 < j)) {
                    while (true) {
                        long j4 = edVar.b;
                        long j5 = j3 + q0;
                        if (j4 < j5) {
                            if (edVar.q0(cb3Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long q02 = edVar.q0(cb3Var);
                            if (q02 < 0 || q02 > 2147483647L) {
                                break;
                            }
                            if (q02 != 0) {
                                int i3 = (int) q02;
                                cb3Var.a(i3, false);
                                edVar.b += i3;
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

    @Override // e84
    public final void d(long j, long j2) {
        this.T = -9223372036854775807L;
        this.V = (byte) 0;
        ya3 ya3Var = this.a;
        ya3Var.e = (byte) 0;
        ya3Var.b.clear();
        cdc cdcVar = ya3Var.c;
        cdcVar.a = false;
        cdcVar.b = 0;
        cdc cdcVar2 = this.b;
        cdcVar2.a = false;
        cdcVar2.b = 0;
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
            g6c g6cVar = ((ul6) sparseArray.valueAt(i)).W;
            if (g6cVar != null) {
                g6cVar.b = false;
                g6cVar.c = 0;
            }
            i++;
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        if (this.g) {
            g84Var = new vh4(g84Var, this.h);
        }
        this.q0 = g84Var;
    }

    public final void g(int i) {
        if (this.G) {
            return;
        }
        throw hy7.a("Element " + i + " must be in a Cues", null);
    }

    public final void h(int i) {
        if (this.B != null) {
            return;
        }
        throw hy7.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(ul6 ul6Var, long j, int i, int i2, int i3) {
        byte[] j2;
        int i4;
        int i5;
        g6c g6cVar = ul6Var.W;
        if (g6cVar != null) {
            g6cVar.b(ul6Var.d0, j, i, i2, i3, ul6Var.l);
        } else {
            if ("S_TEXT/UTF8".equals(ul6Var.c) || "S_TEXT/ASS".equals(ul6Var.c) || "S_TEXT/SSA".equals(ul6Var.c) || "S_TEXT/WEBVTT".equals(ul6Var.c)) {
                if (this.Z > 1) {
                    efd.f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.X;
                    if (j3 == -9223372036854775807L) {
                        efd.f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = ul6Var.c;
                        ey7 ey7Var = this.o;
                        byte[] bArr = ey7Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                j2 = j(j3, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                j2 = j(j3, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                j2 = j(j3, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                iy8.d();
                                return;
                        }
                        System.arraycopy(j2, 0, bArr, i4, j2.length);
                        int i6 = ey7Var.b;
                        while (true) {
                            if (i6 < ey7Var.c) {
                                if (ey7Var.a[i6] == 0) {
                                    ey7Var.M(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        ul6Var.d0.e(ey7Var.c, ey7Var);
                        i5 = i2 + ey7Var.c;
                        if ((i & TLObject.FLAG_28) != 0) {
                            int i7 = this.Z;
                            ey7 ey7Var2 = this.r;
                            if (i7 > 1) {
                                ey7Var2.K(0);
                            } else {
                                int i8 = ey7Var2.c;
                                ul6Var.d0.b(ey7Var2, i8, 2);
                                i5 += i8;
                            }
                        }
                        ul6Var.d0.a(j, i, i5, i3, ul6Var.l);
                    }
                }
            }
            i5 = i2;
            if ((i & TLObject.FLAG_28) != 0) {
            }
            ul6Var.d0.a(j, i, i5, i3, ul6Var.l);
        }
        this.U = true;
    }

    public final rl6 k(int i) {
        rl6 rl6Var = this.A;
        if (rl6Var != null) {
            return rl6Var;
        }
        throw hy7.a("Element " + i + " must be in an EditionEntry", null);
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
                g84 g84Var = this.q0;
                g84Var.getClass();
                g84Var.D();
                this.z = false;
                return;
            }
            if (((ul6) sparseArray.valueAt(i)).X) {
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
        g84 g84Var = this.q0;
        g84Var.getClass();
        g84Var.m0(new qc0(this.x));
        this.C = true;
    }

    public final void n(cb3 cb3Var, int i) {
        ey7 ey7Var = this.k;
        if (ey7Var.c >= i) {
            return;
        }
        byte[] bArr = ey7Var.a;
        if (bArr.length < i) {
            ey7Var.c(Math.max(bArr.length << 1, i));
        }
        byte[] bArr2 = ey7Var.a;
        int i2 = ey7Var.c;
        cb3Var.c(bArr2, i2, i - i2, false);
        ey7Var.M(i);
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
            throw hy7.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        String str = gcc.a;
        return gcc.b0(j, j2, 1000L, RoundingMode.DOWN);
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
    public final void q(ul6 ul6Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        ?? r29;
        boolean z2;
        uf7 a;
        boolean z3;
        long j6 = 0;
        int i = 1;
        boolean z4 = false;
        if (!ul6Var.Y) {
            LongSparseArray longSparseArray = this.d;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    rl6 rl6Var = (rl6) longSparseArray.valueAt(i2);
                    long j7 = rl6Var.e;
                    if (j7 == 0 || j7 == ul6Var.e) {
                        long j8 = rl6Var.b;
                        String str = gcc.a;
                        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
                            j8 /= 1000000;
                        }
                        long j9 = j8;
                        long j10 = rl6Var.c;
                        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                            j10 /= 1000000;
                        }
                        arrayList.add(new tj1(j9, j10, rl6Var.d, rl6Var.f != null ? new xy5(rl6Var.g, rl6Var.f) : null));
                    }
                }
                if (!arrayList.isEmpty()) {
                    ko4 ko4Var = ul6Var.e0;
                    ko4Var.getClass();
                    jo4 a2 = ko4Var.a();
                    uf7 uf7Var = ul6Var.e0.m;
                    a2.l = uf7Var != null ? uf7Var.a((sf7[]) arrayList.toArray(new rj1[0])) : new uf7(arrayList);
                    ul6Var.e0 = new ko4(a2);
                    ul6Var.Y = true;
                }
            }
        }
        long j11 = this.x;
        long j12 = this.u;
        long j13 = this.t;
        if (ul6Var.f != 2) {
            return;
        }
        List list = (List) this.F.get(ul6Var.d);
        if (ul6Var.Z || list == null || list.isEmpty()) {
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
                sl6 sl6Var = (sl6) list.get(i3);
                boolean z5 = z4;
                long j15 = j11;
                long j16 = sl6Var.a;
                z = z5;
                int i5 = i;
                long j17 = sl6Var.c;
                long j18 = j12;
                long j19 = sl6Var.b;
                if (j16 > 10000000) {
                    break;
                }
                if (i3 < list.size() - i5) {
                    sl6 sl6Var2 = (sl6) list.get(i3 + 1);
                    j3 = j13;
                    j4 = (sl6Var2.b + sl6Var2.c) - (j19 + j17);
                    j5 = sl6Var2.a - j16;
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
                j2 = ((sl6) list.get(i4)).a;
                r29 = z;
                if (j2 == j) {
                    ko4 ko4Var2 = ul6Var.e0;
                    ko4Var2.getClass();
                    uf7 uf7Var2 = ko4Var2.m;
                    lrb lrbVar = new lrb(j2);
                    if (uf7Var2 == null) {
                        z2 = true;
                        sf7[] sf7VarArr = new sf7[1];
                        sf7VarArr[r29] = lrbVar;
                        a = new uf7(sf7VarArr);
                    } else {
                        z2 = true;
                        sf7[] sf7VarArr2 = new sf7[1];
                        sf7VarArr2[r29] = lrbVar;
                        a = uf7Var2.a(sf7VarArr2);
                    }
                    jo4 a3 = ul6Var.e0.a();
                    a3.l = a;
                    ul6Var.e0 = new ko4(a3);
                    ul6Var.Z = z2;
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
    public final int r(cb3 cb3Var, ul6 ul6Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        short s;
        if ("S_TEXT/UTF8".equals(ul6Var.c)) {
            s(cb3Var, r0, i);
            int i3 = this.i0;
            o();
            return i3;
        }
        if ("S_TEXT/ASS".equals(ul6Var.c) || "S_TEXT/SSA".equals(ul6Var.c)) {
            s(cb3Var, t0, i);
            int i4 = this.i0;
            o();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(ul6Var.c)) {
            s(cb3Var, u0, i);
            int i5 = this.i0;
            o();
            return i5;
        }
        if (ul6Var.X) {
            ul6Var.e0.getClass();
            ko4 h = s3d.h(cb3Var, i, ul6Var.e0);
            ul6Var.e0 = h;
            ul6Var.d0.g(h);
            ul6Var.X = false;
            l();
        }
        x1c x1cVar = ul6Var.d0;
        boolean z2 = this.k0;
        ey7 ey7Var = this.n;
        int i6 = 2;
        if (!z2) {
            boolean z3 = ul6Var.j;
            ey7 ey7Var2 = this.k;
            if (z3) {
                this.d0 &= -1073741825;
                if (!this.l0) {
                    cb3Var.c(ey7Var2.a, 0, 1, false);
                    this.h0++;
                    byte b = ey7Var2.a[0];
                    if ((b & 128) == 128) {
                        throw hy7.a("Extension bit is set in signal byte", null);
                    }
                    this.o0 = b;
                    this.l0 = true;
                }
                byte b2 = this.o0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.d0 |= TLObject.FLAG_30;
                    if (!this.p0) {
                        ey7 ey7Var3 = this.p;
                        cb3Var.c(ey7Var3.a, 0, 8, false);
                        this.h0 += 8;
                        this.p0 = true;
                        ey7Var2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        ey7Var2.N(0);
                        x1cVar.b(ey7Var2, 1, 1);
                        this.i0++;
                        ey7Var3.N(0);
                        x1cVar.b(ey7Var3, 8, 1);
                        this.i0 += 8;
                    }
                    if (z4) {
                        if (!this.m0) {
                            cb3Var.c(ey7Var2.a, 0, 1, false);
                            this.h0++;
                            ey7Var2.N(0);
                            this.n0 = ey7Var2.A();
                            this.m0 = true;
                        }
                        int i7 = this.n0 << 2;
                        ey7Var2.K(i7);
                        cb3Var.c(ey7Var2.a, 0, i7, false);
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
                            int E = ey7Var2.E();
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
                        ey7 ey7Var4 = this.q;
                        ey7Var4.L(i8, array);
                        x1cVar.b(ey7Var4, i8, 1);
                        this.i0 += i8;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr = ul6Var.k;
                if (bArr != null) {
                    ey7Var.L(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(ul6Var.c) ? z : ul6Var.h > 0) {
                this.d0 |= TLObject.FLAG_28;
                this.r.K(0);
                int i16 = (ey7Var.c + i) - this.h0;
                ey7Var2.K(4);
                byte[] bArr2 = ey7Var2.a;
                bArr2[0] = (byte) ((i16 >> 24) & jn7.d4);
                bArr2[1] = (byte) ((i16 >> 16) & jn7.d4);
                bArr2[i2] = (byte) ((i16 >> 8) & jn7.d4);
                bArr2[3] = (byte) (i16 & jn7.d4);
                x1cVar.b(ey7Var2, 4, i2);
                this.i0 += 4;
            }
            this.k0 = true;
        }
        int i17 = i + ey7Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(ul6Var.c) && !"V_MPEGH/ISO/HEVC".equals(ul6Var.c)) {
            if (ul6Var.W != null) {
                yve.p(ey7Var.c == 0);
                ul6Var.W.c(cb3Var);
            }
            while (true) {
                int i18 = this.h0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int a = ey7Var.a();
                if (a > 0) {
                    f2 = Math.min(i19, a);
                    x1cVar.e(f2, ey7Var);
                } else {
                    f2 = x1cVar.f(cb3Var, i19, false);
                }
                this.h0 += f2;
                this.i0 += f2;
            }
        } else {
            ey7 ey7Var5 = this.j;
            byte[] bArr3 = ey7Var5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = ul6Var.f0;
            int i21 = 4 - i20;
            while (this.h0 < i17) {
                int i22 = this.j0;
                if (i22 == 0) {
                    int min = Math.min(i20, ey7Var.a());
                    cb3Var.c(bArr3, i21 + min, i20 - min, false);
                    if (min > 0) {
                        ey7Var.k(i21, min, bArr3);
                    }
                    this.h0 += i20;
                    ey7Var5.N(0);
                    this.j0 = ey7Var5.E();
                    ey7 ey7Var6 = this.i;
                    ey7Var6.N(0);
                    x1cVar.e(4, ey7Var6);
                    this.i0 += 4;
                } else {
                    int a2 = ey7Var.a();
                    if (a2 > 0) {
                        f = Math.min(i22, a2);
                        x1cVar.e(f, ey7Var);
                    } else {
                        f = x1cVar.f(cb3Var, i22, false);
                    }
                    this.h0 += f;
                    this.i0 += f;
                    this.j0 -= f;
                }
            }
        }
        if ("A_VORBIS".equals(ul6Var.c)) {
            ey7 ey7Var7 = this.l;
            ey7Var7.N(0);
            x1cVar.e(4, ey7Var7);
            this.i0 += 4;
        }
        int i23 = this.i0;
        o();
        return i23;
    }

    public final void s(cb3 cb3Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        ey7 ey7Var = this.o;
        byte[] bArr2 = ey7Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            ey7Var.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        cb3Var.c(ey7Var.a, bArr.length, i, false);
        ey7Var.N(0);
        ey7Var.M(length);
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
