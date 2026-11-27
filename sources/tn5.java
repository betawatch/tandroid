// default package

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tn5 extends vg0 {
    public final vj0 K;
    public final s93 L;
    public final ArrayDeque M;
    public boolean N;
    public boolean O;
    public sn5 P;
    public long Q;
    public long R;
    public byte S;
    public int T;
    public ko4 U;
    public wj0 V;
    public s93 W;
    public v64 X;
    public Bitmap Y;
    public boolean Z;
    public sd1 a0;
    public sd1 b0;
    public int c0;
    public boolean d0;

    public tn5(vj0 vj0Var) {
        super(4);
        this.K = vj0Var;
        this.L = new s93(0, 0);
        this.P = sn5.c;
        this.M = new ArrayDeque();
        this.R = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.S = (byte) 0;
        this.T = 1;
    }

    @Override // vg0
    public final void B(long j, long j2) {
        if (this.O) {
            return;
        }
        if (this.U == null) {
            ym4 ym4Var = this.c;
            ym4Var.t();
            s93 s93Var = this.L;
            s93Var.clear();
            int A = A(ym4Var, s93Var, 2);
            if (A != -5) {
                if (A == -4) {
                    yve.p(s93Var.isEndOfStream());
                    this.N = true;
                    this.O = true;
                    return;
                }
                return;
            }
            ko4 ko4Var = (ko4) ym4Var.c;
            ko4Var.getClass();
            this.U = ko4Var;
            this.d0 = true;
        }
        if (this.V == null) {
            M();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (K(j)) {
            }
            while (L(j)) {
            }
            Trace.endSection();
        } catch (fm5 e) {
            throw e(e, null, false, 4003);
        }
    }

    @Override // vg0
    public final int G(ko4 ko4Var) {
        return vj0.e(ko4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
    
        if (r14 == ((r0 * r1.V) - 1)) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(long j) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.Y;
        if ((bitmap2 == null || this.a0 != null) && (this.T != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.M;
            if (bitmap2 == null) {
                this.V.getClass();
                uj0 uj0Var = (uj0) this.V.c();
                if (uj0Var != null) {
                    if (!uj0Var.isEndOfStream()) {
                        yve.l(uj0Var.a, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.Y = uj0Var.a;
                        uj0Var.release();
                    } else {
                        if (this.S == 3) {
                            N();
                            this.U.getClass();
                            M();
                            return false;
                        }
                        uj0Var.release();
                        if (arrayDeque.isEmpty()) {
                            this.O = true;
                            return false;
                        }
                    }
                }
            }
            if (this.Z && this.Y != null && this.a0 != null) {
                this.U.getClass();
                ko4 ko4Var = this.U;
                int i = ko4Var.V;
                int i2 = ko4Var.W;
                boolean z = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                sd1 sd1Var = this.a0;
                if (((Bitmap) sd1Var.c) == null) {
                    if (z) {
                        int i3 = sd1Var.a;
                        this.Y.getClass();
                        int width = this.Y.getWidth();
                        ko4 ko4Var2 = this.U;
                        ko4Var2.getClass();
                        int i4 = width / ko4Var2.V;
                        int height = this.Y.getHeight();
                        ko4 ko4Var3 = this.U;
                        ko4Var3.getClass();
                        int i5 = height / ko4Var3.W;
                        int i6 = this.U.V;
                        bitmap = Bitmap.createBitmap(this.Y, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.Y;
                        bitmap.getClass();
                    }
                    sd1Var.c = bitmap;
                }
                ((Bitmap) this.a0.c).getClass();
                long j2 = this.a0.b - j;
                boolean z2 = this.n == 2;
                int i7 = this.T;
                if (i7 != 0) {
                    if (i7 == 1) {
                        z2 = true;
                    } else {
                        if (i7 != 3) {
                            grb.g();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2 || j2 < 30000) {
                    v64 v64Var = this.X;
                    if (v64Var != null) {
                        long j3 = this.P.b;
                        this.U.getClass();
                        c74 c74Var = v64Var.a;
                        if (c74Var.V) {
                            c74Var.h.a(37).b();
                        }
                    }
                    long j4 = this.P.b;
                    sd1 sd1Var2 = this.a0;
                    sd1Var2.getClass();
                    long j5 = sd1Var2.b;
                    this.Q = j5;
                    while (!arrayDeque.isEmpty() && j5 >= ((sn5) arrayDeque.peek()).a) {
                        this.P = (sn5) arrayDeque.removeFirst();
                    }
                    this.T = 3;
                    if (z) {
                        sd1 sd1Var3 = this.a0;
                        sd1Var3.getClass();
                        int i8 = sd1Var3.a;
                        ko4 ko4Var4 = this.U;
                        ko4Var4.getClass();
                        int i9 = ko4Var4.W;
                        ko4 ko4Var5 = this.U;
                        ko4Var5.getClass();
                    }
                    this.Y = null;
                    this.a0 = this.b0;
                    this.b0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fc, code lost:
    
        if (r2 == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(long j) {
        boolean z;
        s93 s93Var;
        ko4 ko4Var;
        int i;
        s93 s93Var2;
        if (!this.Z || this.a0 == null) {
            ym4 ym4Var = this.c;
            ym4Var.t();
            wj0 wj0Var = this.V;
            if (wj0Var != null && this.S != 3 && !this.N) {
                s93 s93Var3 = this.W;
                if (s93Var3 == null) {
                    s93Var3 = (s93) wj0Var.d();
                    this.W = s93Var3;
                }
                s93 s93Var4 = s93Var3;
                if (this.S == 2) {
                    s93Var4.setFlags(4);
                    wj0 wj0Var2 = this.V;
                    wj0Var2.getClass();
                    wj0Var2.e(this.W);
                    this.W = null;
                    this.S = (byte) 3;
                    return false;
                }
                int A = A(ym4Var, s93Var3, 0);
                if (A == -5) {
                    ko4 ko4Var2 = (ko4) ym4Var.c;
                    ko4Var2.getClass();
                    this.U = ko4Var2;
                    this.d0 = true;
                    this.S = (byte) 2;
                    return true;
                }
                if (A == -4) {
                    this.W.d();
                    ByteBuffer byteBuffer = this.W.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        s93 s93Var5 = this.W;
                        s93Var5.getClass();
                        if (!s93Var5.isEndOfStream()) {
                            z = false;
                            if (z) {
                                s93 s93Var6 = this.W;
                                s93Var6.getClass();
                                s93Var6.a = this.U;
                                wj0 wj0Var3 = this.V;
                                wj0Var3.getClass();
                                s93 s93Var7 = this.W;
                                s93Var7.getClass();
                                wj0Var3.e(s93Var7);
                                this.c0 = 0;
                            }
                            s93Var = this.W;
                            s93Var.getClass();
                            if (s93Var.isEndOfStream()) {
                                int i2 = this.c0;
                                long j2 = s93Var.e;
                                sd1 sd1Var = new sd1();
                                sd1Var.a = i2;
                                sd1Var.b = j2;
                                this.b0 = sd1Var;
                                this.c0 = i2 + 1;
                                if (!this.Z) {
                                    boolean z2 = j2 - 30000 <= j && j <= 30000 + j2;
                                    sd1 sd1Var2 = this.a0;
                                    boolean z3 = sd1Var2 != null && sd1Var2.b <= j && j < j2;
                                    ko4 ko4Var3 = this.U;
                                    ko4Var3.getClass();
                                    this.Z = z2 || z3 || (ko4Var3.V == -1 || (i = (ko4Var = this.U).W) == -1 || i2 == (i * ko4Var.V) - 1);
                                    if (z3) {
                                    }
                                }
                                this.a0 = this.b0;
                                this.b0 = null;
                            } else {
                                this.Z = true;
                            }
                            s93Var2 = this.W;
                            s93Var2.getClass();
                            if (!s93Var2.isEndOfStream()) {
                                this.N = true;
                                this.W = null;
                                return false;
                            }
                            long j3 = this.R;
                            s93 s93Var8 = this.W;
                            s93Var8.getClass();
                            this.R = Math.max(j3, s93Var8.e);
                            if (z) {
                                this.W = null;
                            } else {
                                s93 s93Var9 = this.W;
                                s93Var9.getClass();
                                s93Var9.clear();
                            }
                            return !this.Z;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    s93Var = this.W;
                    s93Var.getClass();
                    if (s93Var.isEndOfStream()) {
                    }
                    s93Var2 = this.W;
                    s93Var2.getClass();
                    if (!s93Var2.isEndOfStream()) {
                    }
                } else if (A != -3) {
                    grb.g();
                    return false;
                }
            }
        }
        return false;
    }

    public final void M() {
        if (this.d0) {
            ko4 ko4Var = this.U;
            ko4Var.getClass();
            int e = vj0.e(ko4Var);
            if (e != qu6.a(4, 0, 0, 0) && e != qu6.a(3, 0, 0, 0)) {
                throw e(new fm5("Provided decoder factory can't create decoder for format."), this.U, false, 4005);
            }
            wj0 wj0Var = this.V;
            if (wj0Var != null) {
                wj0Var.release();
            }
            this.V = new wj0(this.K.a);
            this.d0 = false;
        }
    }

    public final void N() {
        this.W = null;
        this.S = (byte) 0;
        this.R = -9223372036854775807L;
        wj0 wj0Var = this.V;
        if (wj0Var != null) {
            wj0Var.release();
            this.V = null;
        }
    }

    @Override // vg0, lg8
    public final void d(int i, Object obj) {
        if (i == 15 || i != 23) {
            return;
        }
        this.X = (v64) obj;
    }

    @Override // vg0
    public final String l() {
        return "ImageRenderer";
    }

    @Override // vg0
    public final boolean n() {
        return this.O;
    }

    @Override // vg0
    public final boolean o() {
        int i = this.T;
        if (i != 3) {
            return i == 0 && this.Z;
        }
        return true;
    }

    @Override // vg0
    public final void q() {
        this.U = null;
        this.P = sn5.c;
        this.M.clear();
        N();
    }

    @Override // vg0
    public final void r(boolean z, boolean z2) {
        this.T = z2 ? 1 : 0;
    }

    @Override // vg0
    public final void s(long j, boolean z, boolean z2) {
        this.T = Math.min(this.T, 1);
        this.O = false;
        this.N = false;
        this.Y = null;
        this.a0 = null;
        this.b0 = null;
        this.Z = false;
        this.W = null;
        wj0 wj0Var = this.V;
        if (wj0Var != null) {
            wj0Var.flush();
        }
        this.M.clear();
    }

    @Override // vg0
    public final void t() {
        N();
    }

    @Override // vg0
    public final void v() {
        N();
        this.T = Math.min(this.T, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        if (this.P.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.M;
            if (arrayDeque.isEmpty()) {
                long j3 = this.R;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.Q;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new sn5(this.R, j2));
            return;
        }
        this.P = new sn5(-9223372036854775807L, j2);
    }
}
