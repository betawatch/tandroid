// default package

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ql5 extends ug0 {
    public final uj0 K;
    public final z83 L;
    public final ArrayDeque M;
    public boolean N;
    public boolean O;
    public pl5 P;
    public long Q;
    public long R;
    public byte S;
    public int T;
    public fm4 U;
    public vj0 V;
    public z83 W;
    public b64 X;
    public Bitmap Y;
    public boolean Z;
    public jd1 a0;
    public jd1 b0;
    public int c0;
    public boolean d0;

    public ql5(uj0 uj0Var) {
        super(4);
        this.K = uj0Var;
        this.L = new z83(0, 0);
        this.P = pl5.c;
        this.M = new ArrayDeque();
        this.R = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.S = (byte) 0;
        this.T = 1;
    }

    @Override // ug0
    public final void B(long j, long j2) {
        if (this.O) {
            return;
        }
        if (this.U == null) {
            sk4 sk4Var = this.c;
            sk4Var.m();
            z83 z83Var = this.L;
            z83Var.clear();
            int A = A(sk4Var, z83Var, 2);
            if (A != -5) {
                if (A == -4) {
                    gre.p(z83Var.isEndOfStream());
                    this.N = true;
                    this.O = true;
                    return;
                }
                return;
            }
            fm4 fm4Var = (fm4) sk4Var.c;
            fm4Var.getClass();
            this.U = fm4Var;
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
        } catch (ck5 e) {
            throw e(e, null, false, 4003);
        }
    }

    @Override // ug0
    public final int G(fm4 fm4Var) {
        return uj0.c(fm4Var);
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
                tj0 tj0Var = (tj0) this.V.c();
                if (tj0Var != null) {
                    if (!tj0Var.isEndOfStream()) {
                        gre.l(tj0Var.a, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.Y = tj0Var.a;
                        tj0Var.release();
                    } else {
                        if (this.S == 3) {
                            N();
                            this.U.getClass();
                            M();
                            return false;
                        }
                        tj0Var.release();
                        if (arrayDeque.isEmpty()) {
                            this.O = true;
                            return false;
                        }
                    }
                }
            }
            if (this.Z && this.Y != null && this.a0 != null) {
                this.U.getClass();
                fm4 fm4Var = this.U;
                int i = fm4Var.V;
                int i2 = fm4Var.W;
                boolean z = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                jd1 jd1Var = this.a0;
                if (((Bitmap) jd1Var.c) == null) {
                    if (z) {
                        int i3 = jd1Var.a;
                        this.Y.getClass();
                        int width = this.Y.getWidth();
                        fm4 fm4Var2 = this.U;
                        fm4Var2.getClass();
                        int i4 = width / fm4Var2.V;
                        int height = this.Y.getHeight();
                        fm4 fm4Var3 = this.U;
                        fm4Var3.getClass();
                        int i5 = height / fm4Var3.W;
                        int i6 = this.U.V;
                        bitmap = Bitmap.createBitmap(this.Y, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.Y;
                        bitmap.getClass();
                    }
                    jd1Var.c = bitmap;
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
                            sdb.a();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2 || j2 < 30000) {
                    b64 b64Var = this.X;
                    if (b64Var != null) {
                        long j3 = this.P.b;
                        this.U.getClass();
                        i64 i64Var = b64Var.a;
                        if (i64Var.V) {
                            i64Var.h.a(37).b();
                        }
                    }
                    long j4 = this.P.b;
                    jd1 jd1Var2 = this.a0;
                    jd1Var2.getClass();
                    long j5 = jd1Var2.b;
                    this.Q = j5;
                    while (!arrayDeque.isEmpty() && j5 >= ((pl5) arrayDeque.peek()).a) {
                        this.P = (pl5) arrayDeque.removeFirst();
                    }
                    this.T = 3;
                    if (z) {
                        jd1 jd1Var3 = this.a0;
                        jd1Var3.getClass();
                        int i8 = jd1Var3.a;
                        fm4 fm4Var4 = this.U;
                        fm4Var4.getClass();
                        int i9 = fm4Var4.W;
                        fm4 fm4Var5 = this.U;
                        fm4Var5.getClass();
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
        z83 z83Var;
        fm4 fm4Var;
        int i;
        z83 z83Var2;
        if (!this.Z || this.a0 == null) {
            sk4 sk4Var = this.c;
            sk4Var.m();
            vj0 vj0Var = this.V;
            if (vj0Var != null && this.S != 3 && !this.N) {
                z83 z83Var3 = this.W;
                if (z83Var3 == null) {
                    z83Var3 = (z83) vj0Var.d();
                    this.W = z83Var3;
                }
                z83 z83Var4 = z83Var3;
                if (this.S == 2) {
                    z83Var4.setFlags(4);
                    vj0 vj0Var2 = this.V;
                    vj0Var2.getClass();
                    vj0Var2.e(this.W);
                    this.W = null;
                    this.S = (byte) 3;
                    return false;
                }
                int A = A(sk4Var, z83Var3, 0);
                if (A == -5) {
                    fm4 fm4Var2 = (fm4) sk4Var.c;
                    fm4Var2.getClass();
                    this.U = fm4Var2;
                    this.d0 = true;
                    this.S = (byte) 2;
                    return true;
                }
                if (A == -4) {
                    this.W.d();
                    ByteBuffer byteBuffer = this.W.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        z83 z83Var5 = this.W;
                        z83Var5.getClass();
                        if (!z83Var5.isEndOfStream()) {
                            z = false;
                            if (z) {
                                z83 z83Var6 = this.W;
                                z83Var6.getClass();
                                z83Var6.a = this.U;
                                vj0 vj0Var3 = this.V;
                                vj0Var3.getClass();
                                z83 z83Var7 = this.W;
                                z83Var7.getClass();
                                vj0Var3.e(z83Var7);
                                this.c0 = 0;
                            }
                            z83Var = this.W;
                            z83Var.getClass();
                            if (z83Var.isEndOfStream()) {
                                int i2 = this.c0;
                                long j2 = z83Var.e;
                                jd1 jd1Var = new jd1();
                                jd1Var.a = i2;
                                jd1Var.b = j2;
                                this.b0 = jd1Var;
                                this.c0 = i2 + 1;
                                if (!this.Z) {
                                    boolean z2 = j2 - 30000 <= j && j <= 30000 + j2;
                                    jd1 jd1Var2 = this.a0;
                                    boolean z3 = jd1Var2 != null && jd1Var2.b <= j && j < j2;
                                    fm4 fm4Var3 = this.U;
                                    fm4Var3.getClass();
                                    this.Z = z2 || z3 || (fm4Var3.V == -1 || (i = (fm4Var = this.U).W) == -1 || i2 == (i * fm4Var.V) - 1);
                                    if (z3) {
                                    }
                                }
                                this.a0 = this.b0;
                                this.b0 = null;
                            } else {
                                this.Z = true;
                            }
                            z83Var2 = this.W;
                            z83Var2.getClass();
                            if (!z83Var2.isEndOfStream()) {
                                this.N = true;
                                this.W = null;
                                return false;
                            }
                            long j3 = this.R;
                            z83 z83Var8 = this.W;
                            z83Var8.getClass();
                            this.R = Math.max(j3, z83Var8.e);
                            if (z) {
                                this.W = null;
                            } else {
                                z83 z83Var9 = this.W;
                                z83Var9.getClass();
                                z83Var9.clear();
                            }
                            return !this.Z;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    z83Var = this.W;
                    z83Var.getClass();
                    if (z83Var.isEndOfStream()) {
                    }
                    z83Var2 = this.W;
                    z83Var2.getClass();
                    if (!z83Var2.isEndOfStream()) {
                    }
                } else if (A != -3) {
                    sdb.a();
                    return false;
                }
            }
        }
        return false;
    }

    public final void M() {
        if (this.d0) {
            fm4 fm4Var = this.U;
            fm4Var.getClass();
            int c = uj0.c(fm4Var);
            if (c != ls6.a(4, 0, 0, 0) && c != ls6.a(3, 0, 0, 0)) {
                throw e(new ck5("Provided decoder factory can't create decoder for format."), this.U, false, 4005);
            }
            vj0 vj0Var = this.V;
            if (vj0Var != null) {
                vj0Var.release();
            }
            this.V = new vj0(this.K.a);
            this.d0 = false;
        }
    }

    public final void N() {
        this.W = null;
        this.S = (byte) 0;
        this.R = -9223372036854775807L;
        vj0 vj0Var = this.V;
        if (vj0Var != null) {
            vj0Var.release();
            this.V = null;
        }
    }

    @Override // ug0, xc8
    public final void d(int i, Object obj) {
        if (i == 15 || i != 23) {
            return;
        }
        this.X = (b64) obj;
    }

    @Override // ug0
    public final String l() {
        return "ImageRenderer";
    }

    @Override // ug0
    public final boolean n() {
        return this.O;
    }

    @Override // ug0
    public final boolean o() {
        int i = this.T;
        if (i != 3) {
            return i == 0 && this.Z;
        }
        return true;
    }

    @Override // ug0
    public final void q() {
        this.U = null;
        this.P = pl5.c;
        this.M.clear();
        N();
    }

    @Override // ug0
    public final void r(boolean z, boolean z2) {
        this.T = z2 ? 1 : 0;
    }

    @Override // ug0
    public final void s(long j, boolean z, boolean z2) {
        this.T = Math.min(this.T, 1);
        this.O = false;
        this.N = false;
        this.Y = null;
        this.a0 = null;
        this.b0 = null;
        this.Z = false;
        this.W = null;
        vj0 vj0Var = this.V;
        if (vj0Var != null) {
            vj0Var.flush();
        }
        this.M.clear();
    }

    @Override // ug0
    public final void t() {
        N();
    }

    @Override // ug0
    public final void v() {
        N();
        this.T = Math.min(this.T, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // ug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
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
            arrayDeque.add(new pl5(this.R, j2));
            return;
        }
        this.P = new pl5(-9223372036854775807L, j2);
    }
}
