// default package

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qn5 extends uh0 {
    public final uk0 K;
    public final la3 L;
    public final ArrayDeque M;
    public boolean N;
    public boolean O;
    public pn5 P;
    public long Q;
    public long R;
    public byte S;
    public int T;
    public go4 U;
    public vk0 V;
    public la3 W;
    public k74 X;
    public Bitmap Y;
    public boolean Z;
    public re1 a0;
    public re1 b0;
    public int c0;
    public boolean d0;

    public qn5(uk0 uk0Var) {
        super(4);
        this.K = uk0Var;
        this.L = new la3(0, 0);
        this.P = pn5.c;
        this.M = new ArrayDeque();
        this.R = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.S = (byte) 0;
        this.T = 1;
    }

    @Override // uh0
    public final void B(long j, long j2) {
        if (this.O) {
            return;
        }
        if (this.U == null) {
            mj4 mj4Var = this.c;
            mj4Var.i();
            la3 la3Var = this.L;
            la3Var.clear();
            int A = A(mj4Var, la3Var, 2);
            if (A != -5) {
                if (A == -4) {
                    jte.p(la3Var.isEndOfStream());
                    this.N = true;
                    this.O = true;
                    return;
                }
                return;
            }
            go4 go4Var = (go4) mj4Var.c;
            go4Var.getClass();
            this.U = go4Var;
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
        } catch (cm5 e) {
            throw e(e, null, false, 4003);
        }
    }

    @Override // uh0
    public final int G(go4 go4Var) {
        return uk0.f(go4Var);
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
                tk0 tk0Var = (tk0) this.V.c();
                if (tk0Var != null) {
                    if (!tk0Var.isEndOfStream()) {
                        jte.l(tk0Var.a, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.Y = tk0Var.a;
                        tk0Var.release();
                    } else {
                        if (this.S == 3) {
                            N();
                            this.U.getClass();
                            M();
                            return false;
                        }
                        tk0Var.release();
                        if (arrayDeque.isEmpty()) {
                            this.O = true;
                            return false;
                        }
                    }
                }
            }
            if (this.Z && this.Y != null && this.a0 != null) {
                this.U.getClass();
                go4 go4Var = this.U;
                int i = go4Var.V;
                int i2 = go4Var.W;
                boolean z = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                re1 re1Var = this.a0;
                if (((Bitmap) re1Var.c) == null) {
                    if (z) {
                        int i3 = re1Var.a;
                        this.Y.getClass();
                        int width = this.Y.getWidth();
                        go4 go4Var2 = this.U;
                        go4Var2.getClass();
                        int i4 = width / go4Var2.V;
                        int height = this.Y.getHeight();
                        go4 go4Var3 = this.U;
                        go4Var3.getClass();
                        int i5 = height / go4Var3.W;
                        int i6 = this.U.V;
                        bitmap = Bitmap.createBitmap(this.Y, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.Y;
                        bitmap.getClass();
                    }
                    re1Var.c = bitmap;
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
                            rjb.h();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2 || j2 < 30000) {
                    k74 k74Var = this.X;
                    if (k74Var != null) {
                        long j3 = this.P.b;
                        this.U.getClass();
                        r74 r74Var = k74Var.a;
                        if (r74Var.V) {
                            r74Var.h.a(37).b();
                        }
                    }
                    long j4 = this.P.b;
                    re1 re1Var2 = this.a0;
                    re1Var2.getClass();
                    long j5 = re1Var2.b;
                    this.Q = j5;
                    while (!arrayDeque.isEmpty() && j5 >= ((pn5) arrayDeque.peek()).a) {
                        this.P = (pn5) arrayDeque.removeFirst();
                    }
                    this.T = 3;
                    if (z) {
                        re1 re1Var3 = this.a0;
                        re1Var3.getClass();
                        int i8 = re1Var3.a;
                        go4 go4Var4 = this.U;
                        go4Var4.getClass();
                        int i9 = go4Var4.W;
                        go4 go4Var5 = this.U;
                        go4Var5.getClass();
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
        la3 la3Var;
        go4 go4Var;
        int i;
        la3 la3Var2;
        if (!this.Z || this.a0 == null) {
            mj4 mj4Var = this.c;
            mj4Var.i();
            vk0 vk0Var = this.V;
            if (vk0Var != null && this.S != 3 && !this.N) {
                la3 la3Var3 = this.W;
                if (la3Var3 == null) {
                    la3Var3 = (la3) vk0Var.d();
                    this.W = la3Var3;
                }
                la3 la3Var4 = la3Var3;
                if (this.S == 2) {
                    la3Var4.setFlags(4);
                    vk0 vk0Var2 = this.V;
                    vk0Var2.getClass();
                    vk0Var2.e(this.W);
                    this.W = null;
                    this.S = (byte) 3;
                    return false;
                }
                int A = A(mj4Var, la3Var3, 0);
                if (A == -5) {
                    go4 go4Var2 = (go4) mj4Var.c;
                    go4Var2.getClass();
                    this.U = go4Var2;
                    this.d0 = true;
                    this.S = (byte) 2;
                    return true;
                }
                if (A == -4) {
                    this.W.d();
                    ByteBuffer byteBuffer = this.W.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        la3 la3Var5 = this.W;
                        la3Var5.getClass();
                        if (!la3Var5.isEndOfStream()) {
                            z = false;
                            if (z) {
                                la3 la3Var6 = this.W;
                                la3Var6.getClass();
                                la3Var6.a = this.U;
                                vk0 vk0Var3 = this.V;
                                vk0Var3.getClass();
                                la3 la3Var7 = this.W;
                                la3Var7.getClass();
                                vk0Var3.e(la3Var7);
                                this.c0 = 0;
                            }
                            la3Var = this.W;
                            la3Var.getClass();
                            if (la3Var.isEndOfStream()) {
                                int i2 = this.c0;
                                long j2 = la3Var.e;
                                re1 re1Var = new re1();
                                re1Var.a = i2;
                                re1Var.b = j2;
                                this.b0 = re1Var;
                                this.c0 = i2 + 1;
                                if (!this.Z) {
                                    boolean z2 = j2 - 30000 <= j && j <= 30000 + j2;
                                    re1 re1Var2 = this.a0;
                                    boolean z3 = re1Var2 != null && re1Var2.b <= j && j < j2;
                                    go4 go4Var3 = this.U;
                                    go4Var3.getClass();
                                    this.Z = z2 || z3 || (go4Var3.V == -1 || (i = (go4Var = this.U).W) == -1 || i2 == (i * go4Var.V) - 1);
                                    if (z3) {
                                    }
                                }
                                this.a0 = this.b0;
                                this.b0 = null;
                            } else {
                                this.Z = true;
                            }
                            la3Var2 = this.W;
                            la3Var2.getClass();
                            if (!la3Var2.isEndOfStream()) {
                                this.N = true;
                                this.W = null;
                                return false;
                            }
                            long j3 = this.R;
                            la3 la3Var8 = this.W;
                            la3Var8.getClass();
                            this.R = Math.max(j3, la3Var8.e);
                            if (z) {
                                this.W = null;
                            } else {
                                la3 la3Var9 = this.W;
                                la3Var9.getClass();
                                la3Var9.clear();
                            }
                            return !this.Z;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    la3Var = this.W;
                    la3Var.getClass();
                    if (la3Var.isEndOfStream()) {
                    }
                    la3Var2 = this.W;
                    la3Var2.getClass();
                    if (!la3Var2.isEndOfStream()) {
                    }
                } else if (A != -3) {
                    rjb.h();
                    return false;
                }
            }
        }
        return false;
    }

    public final void M() {
        if (this.d0) {
            go4 go4Var = this.U;
            go4Var.getClass();
            int f = uk0.f(go4Var);
            if (f != kt6.a(4, 0, 0, 0) && f != kt6.a(3, 0, 0, 0)) {
                throw e(new cm5("Provided decoder factory can't create decoder for format."), this.U, false, 4005);
            }
            vk0 vk0Var = this.V;
            if (vk0Var != null) {
                vk0Var.release();
            }
            this.V = new vk0(this.K.a);
            this.d0 = false;
        }
    }

    public final void N() {
        this.W = null;
        this.S = (byte) 0;
        this.R = -9223372036854775807L;
        vk0 vk0Var = this.V;
        if (vk0Var != null) {
            vk0Var.release();
            this.V = null;
        }
    }

    @Override // uh0, ze8
    public final void d(int i, Object obj) {
        if (i == 15 || i != 23) {
            return;
        }
        this.X = (k74) obj;
    }

    @Override // uh0
    public final String l() {
        return "ImageRenderer";
    }

    @Override // uh0
    public final boolean n() {
        return this.O;
    }

    @Override // uh0
    public final boolean o() {
        int i = this.T;
        if (i != 3) {
            return i == 0 && this.Z;
        }
        return true;
    }

    @Override // uh0
    public final void q() {
        this.U = null;
        this.P = pn5.c;
        this.M.clear();
        N();
    }

    @Override // uh0
    public final void r(boolean z, boolean z2) {
        this.T = z2 ? 1 : 0;
    }

    @Override // uh0
    public final void s(long j, boolean z, boolean z2) {
        this.T = Math.min(this.T, 1);
        this.O = false;
        this.N = false;
        this.Y = null;
        this.a0 = null;
        this.b0 = null;
        this.Z = false;
        this.W = null;
        vk0 vk0Var = this.V;
        if (vk0Var != null) {
            vk0Var.flush();
        }
        this.M.clear();
    }

    @Override // uh0
    public final void t() {
        N();
    }

    @Override // uh0
    public final void v() {
        N();
        this.T = Math.min(this.T, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // uh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
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
            arrayDeque.add(new pn5(this.R, j2));
            return;
        }
        this.P = new pn5(-9223372036854775807L, j2);
    }
}
