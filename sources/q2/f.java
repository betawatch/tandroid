package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.s;
import hi.c0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import k6.h;
import u2.g0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f extends i2.f {
    public final h I;
    public final h2.h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public e N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public s S;
    public b T;
    public h2.h U;
    public d V;
    public Bitmap W;
    public boolean X;
    public c0 Y;
    public c0 Z;
    public int a0;
    public boolean b0;

    public f(h hVar) {
        super(4);
        this.I = hVar;
        this.V = d.a;
        this.J = new h2.h(0, 0);
        this.N = e.c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override // i2.f
    public final int A(s sVar) {
        this.I.getClass();
        return h.c(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        if (r14 == ((r0 * r1.Q) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j3) {
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2 = this.W;
        if ((bitmap2 == null || this.Y != null) && (this.R != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.K;
            if (bitmap2 == null) {
                e2.d.h(this.T);
                a aVar = (a) this.T.c();
                if (aVar != null) {
                    if (!aVar.isEndOfStream()) {
                        e2.d.i(aVar.a, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.W = aVar.a;
                        aVar.release();
                    } else {
                        if (this.Q == 3) {
                            F();
                            e2.d.h(this.S);
                            E();
                            return false;
                        }
                        aVar.release();
                        if (arrayDeque.isEmpty()) {
                            this.M = true;
                            return false;
                        }
                    }
                }
            }
            if (this.X && this.W != null && this.Y != null) {
                e2.d.h(this.S);
                s sVar = this.S;
                int i10 = sVar.Q;
                int i11 = sVar.R;
                boolean z11 = ((i10 == 1 && i11 == 1) || i10 == -1 || i11 == -1) ? false : true;
                c0 c0Var = this.Y;
                if (((Bitmap) c0Var.c) == null) {
                    if (z11) {
                        int i12 = c0Var.a;
                        e2.d.h(this.W);
                        int width = this.W.getWidth();
                        s sVar2 = this.S;
                        e2.d.h(sVar2);
                        int i13 = width / sVar2.Q;
                        int height = this.W.getHeight();
                        s sVar3 = this.S;
                        e2.d.h(sVar3);
                        int i14 = height / sVar3.R;
                        int i15 = this.S.Q;
                        bitmap = Bitmap.createBitmap(this.W, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmap = this.W;
                        e2.d.h(bitmap);
                    }
                    c0Var.c = bitmap;
                }
                e2.d.h((Bitmap) this.Y.c);
                long j10 = this.Y.b - j3;
                boolean z12 = this.n == 2;
                int i16 = this.R;
                if (i16 != 0) {
                    if (i16 == 1) {
                        z12 = true;
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        z12 = false;
                    }
                }
                if (z12 || j10 < 30000) {
                    d dVar = this.V;
                    long j11 = this.N.b;
                    dVar.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c0 c0Var2 = this.Y;
                    e2.d.h(c0Var2);
                    long j12 = c0Var2.b;
                    this.O = j12;
                    while (!arrayDeque.isEmpty() && j12 >= ((e) arrayDeque.peek()).a) {
                        this.N = (e) arrayDeque.removeFirst();
                    }
                    this.R = 3;
                    if (z11) {
                        c0 c0Var3 = this.Y;
                        e2.d.h(c0Var3);
                        int i17 = c0Var3.a;
                        s sVar4 = this.S;
                        e2.d.h(sVar4);
                        int i18 = sVar4.R;
                        s sVar5 = this.S;
                        e2.d.h(sVar5);
                    }
                    this.W = null;
                    this.Y = this.Z;
                    this.Z = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long j3) {
        boolean z10;
        h2.h hVar;
        s sVar;
        int i10;
        h2.h hVar2;
        if (!this.X || this.Y == null) {
            of.b bVar = this.c;
            bVar.F();
            b bVar2 = this.T;
            if (bVar2 != null && this.Q != 3 && !this.L) {
                if (this.U == null) {
                    h2.h hVar3 = (h2.h) bVar2.d();
                    this.U = hVar3;
                }
                if (this.Q == 2) {
                    e2.d.h(this.U);
                    this.U.setFlags(4);
                    b bVar3 = this.T;
                    e2.d.h(bVar3);
                    bVar3.e(this.U);
                    this.U = null;
                    this.Q = 3;
                    return false;
                }
                int w10 = w(bVar, this.U, 0);
                if (w10 == -5) {
                    s sVar2 = (s) bVar.c;
                    e2.d.h(sVar2);
                    this.S = sVar2;
                    this.b0 = true;
                    this.Q = 2;
                    return true;
                }
                if (w10 == -4) {
                    this.U.c();
                    ByteBuffer byteBuffer = this.U.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        h2.h hVar4 = this.U;
                        e2.d.h(hVar4);
                        if (!hVar4.isEndOfStream()) {
                            z10 = false;
                            if (z10) {
                                h2.h hVar5 = this.U;
                                e2.d.h(hVar5);
                                hVar5.a = this.S;
                                b bVar4 = this.T;
                                e2.d.h(bVar4);
                                h2.h hVar6 = this.U;
                                e2.d.h(hVar6);
                                bVar4.e(hVar6);
                                this.a0 = 0;
                            }
                            hVar = this.U;
                            e2.d.h(hVar);
                            if (hVar.isEndOfStream()) {
                                int i11 = this.a0;
                                long j10 = hVar.e;
                                c0 c0Var = new c0();
                                c0Var.a = i11;
                                c0Var.b = j10;
                                this.Z = c0Var;
                                this.a0 = i11 + 1;
                                if (!this.X) {
                                    boolean z11 = j10 - 30000 <= j3 && j3 <= 30000 + j10;
                                    c0 c0Var2 = this.Y;
                                    boolean z12 = c0Var2 != null && c0Var2.b <= j3 && j3 < j10;
                                    s sVar3 = this.S;
                                    e2.d.h(sVar3);
                                    this.X = z11 || z12 || (sVar3.Q == -1 || (i10 = (sVar = this.S).R) == -1 || i11 == (i10 * sVar.Q) - 1);
                                    if (z12) {
                                    }
                                }
                                this.Y = this.Z;
                                this.Z = null;
                            } else {
                                this.X = true;
                            }
                            hVar2 = this.U;
                            e2.d.h(hVar2);
                            if (!hVar2.isEndOfStream()) {
                                this.L = true;
                                this.U = null;
                                return false;
                            }
                            long j11 = this.P;
                            h2.h hVar7 = this.U;
                            e2.d.h(hVar7);
                            this.P = Math.max(j11, hVar7.e);
                            if (z10) {
                                this.U = null;
                            } else {
                                h2.h hVar8 = this.U;
                                e2.d.h(hVar8);
                                hVar8.clear();
                            }
                            return !this.X;
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                    hVar = this.U;
                    e2.d.h(hVar);
                    if (hVar.isEndOfStream()) {
                    }
                    hVar2 = this.U;
                    e2.d.h(hVar2);
                    if (!hVar2.isEndOfStream()) {
                    }
                } else if (w10 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void E() {
        if (this.b0) {
            s sVar = this.S;
            sVar.getClass();
            h hVar = this.I;
            hVar.getClass();
            int c10 = h.c(sVar);
            if (c10 != hc.b.c(4, 0, 0, 0) && c10 != hc.b.c(3, 0, 0, 0)) {
                throw d(new c("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
            }
            b bVar = this.T;
            if (bVar != null) {
                bVar.release();
            }
            this.T = new b(hVar.a);
            this.b0 = false;
        }
    }

    public final void F() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
            this.T = null;
        }
    }

    @Override // i2.f, i2.h1
    public final void c(int i10, Object obj) {
        if (i10 != 15) {
            return;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar == null) {
            dVar = d.a;
        }
        this.V = dVar;
    }

    @Override // i2.f
    public final String j() {
        return "ImageRenderer";
    }

    @Override // i2.f
    public final boolean l() {
        return this.M;
    }

    @Override // i2.f
    public final boolean m() {
        int i10 = this.R;
        if (i10 != 3) {
            return i10 == 0 && this.X;
        }
        return true;
    }

    @Override // i2.f
    public final void o() {
        this.S = null;
        this.N = e.c;
        this.K.clear();
        F();
        this.V.getClass();
    }

    @Override // i2.f
    public final void p(boolean z10, boolean z11) {
        this.R = z11 ? 1 : 0;
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.W = null;
        this.Y = null;
        this.Z = null;
        this.X = false;
        this.U = null;
        b bVar = this.T;
        if (bVar != null) {
            bVar.flush();
        }
        this.K.clear();
    }

    @Override // i2.f
    public final void r() {
        F();
    }

    @Override // i2.f
    public final void s() {
        F();
        this.R = Math.min(this.R, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s[] sVarArr, long j3, long j10, g0 g0Var) {
        if (this.N.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.K;
            if (arrayDeque.isEmpty()) {
                long j11 = this.P;
                if (j11 != -9223372036854775807L) {
                    long j12 = this.O;
                    if (j12 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new e(this.P, j10));
            return;
        }
        this.N = new e(-9223372036854775807L, j10);
    }

    @Override // i2.f
    public final void x(long j3, long j10) {
        if (this.M) {
            return;
        }
        if (this.S == null) {
            of.b bVar = this.c;
            bVar.F();
            h2.h hVar = this.J;
            hVar.clear();
            int w10 = w(bVar, hVar, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    e2.d.g(hVar.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
            s sVar = (s) bVar.c;
            e2.d.h(sVar);
            this.S = sVar;
            this.b0 = true;
        }
        if (this.T == null) {
            E();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (C(j3)) {
            }
            while (D(j3)) {
            }
            Trace.endSection();
        } catch (c e) {
            throw d(e, null, false, 4003);
        }
    }
}
