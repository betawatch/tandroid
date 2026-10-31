package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.x;
import bi.d0;
import h2.h;
import i2.l0;
import i2.s0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import u2.g0;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends i2.b {
    public final b I;
    public final h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public f N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public x S;
    public c T;
    public h U;
    public e V;
    public l0 W;
    public Bitmap X;
    public boolean Y;
    public d0 Z;
    public d0 a0;
    public int b0;
    public boolean c0;

    public g(b bVar) {
        super(4);
        this.I = bVar;
        this.V = e.a;
        this.J = new h(0, 0);
        this.N = f.c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override // i2.b
    public final int C(x xVar) {
        this.I.getClass();
        return b.b(xVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r14 == ((r0 * r1.R) - 1)) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(long j10) {
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2 = this.X;
        if ((bitmap2 == null || this.Z != null) && (this.R != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.K;
            if (bitmap2 == null) {
                this.T.getClass();
                a aVar = (a) this.T.c();
                if (aVar != null) {
                    if (!aVar.isEndOfStream()) {
                        t6.l(aVar.a, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.X = aVar.a;
                        aVar.release();
                    } else {
                        if (this.Q == 3) {
                            I();
                            this.S.getClass();
                            H();
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
            if (this.Y && this.X != null && this.Z != null) {
                this.S.getClass();
                x xVar = this.S;
                int i10 = xVar.R;
                int i11 = xVar.S;
                boolean z11 = ((i10 == 1 && i11 == 1) || i10 == -1 || i11 == -1) ? false : true;
                d0 d0Var = this.Z;
                if (((Bitmap) d0Var.c) == null) {
                    if (z11) {
                        int i12 = d0Var.a;
                        this.X.getClass();
                        int width = this.X.getWidth();
                        x xVar2 = this.S;
                        xVar2.getClass();
                        int i13 = width / xVar2.R;
                        int height = this.X.getHeight();
                        x xVar3 = this.S;
                        xVar3.getClass();
                        int i14 = height / xVar3.S;
                        int i15 = this.S.R;
                        bitmap = Bitmap.createBitmap(this.X, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmap = this.X;
                        bitmap.getClass();
                    }
                    d0Var.c = bitmap;
                }
                ((Bitmap) this.Z.c).getClass();
                long j11 = this.Z.b - j10;
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
                if (z12 || j11 < 30000) {
                    l0 l0Var = this.W;
                    if (l0Var != null) {
                        long j12 = this.N.b;
                        this.S.getClass();
                        s0 s0Var = l0Var.a;
                        if (s0Var.U) {
                            s0Var.n.a(37).b();
                        }
                    }
                    e eVar = this.V;
                    long j13 = this.N.b;
                    eVar.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    d0 d0Var2 = this.Z;
                    d0Var2.getClass();
                    long j14 = d0Var2.b;
                    this.O = j14;
                    while (!arrayDeque.isEmpty() && j14 >= ((f) arrayDeque.peek()).a) {
                        this.N = (f) arrayDeque.removeFirst();
                    }
                    this.R = 3;
                    if (z11) {
                        d0 d0Var3 = this.Z;
                        d0Var3.getClass();
                        int i17 = d0Var3.a;
                        x xVar4 = this.S;
                        xVar4.getClass();
                        int i18 = xVar4.S;
                        x xVar5 = this.S;
                        xVar5.getClass();
                    }
                    this.X = null;
                    this.Z = this.a0;
                    this.a0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(long j10) {
        boolean z10;
        h hVar;
        x xVar;
        int i10;
        h hVar2;
        if (!this.Y || this.Z == null) {
            hf.b bVar = this.c;
            bVar.L();
            c cVar = this.T;
            if (cVar != null && this.Q != 3 && !this.L) {
                if (this.U == null) {
                    h hVar3 = (h) cVar.d();
                    this.U = hVar3;
                }
                if (this.Q == 2) {
                    this.U.getClass();
                    this.U.setFlags(4);
                    c cVar2 = this.T;
                    cVar2.getClass();
                    cVar2.e(this.U);
                    this.U = null;
                    this.Q = 3;
                    return false;
                }
                int w9 = w(bVar, this.U, 0);
                if (w9 == -5) {
                    x xVar2 = (x) bVar.c;
                    xVar2.getClass();
                    this.S = xVar2;
                    this.c0 = true;
                    this.Q = 2;
                    return true;
                }
                if (w9 == -4) {
                    this.U.d();
                    ByteBuffer byteBuffer = this.U.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        h hVar4 = this.U;
                        hVar4.getClass();
                        if (!hVar4.isEndOfStream()) {
                            z10 = false;
                            if (z10) {
                                h hVar5 = this.U;
                                hVar5.getClass();
                                hVar5.a = this.S;
                                c cVar3 = this.T;
                                cVar3.getClass();
                                h hVar6 = this.U;
                                hVar6.getClass();
                                cVar3.e(hVar6);
                                this.b0 = 0;
                            }
                            hVar = this.U;
                            hVar.getClass();
                            if (hVar.isEndOfStream()) {
                                int i11 = this.b0;
                                long j11 = hVar.e;
                                d0 d0Var = new d0();
                                d0Var.a = i11;
                                d0Var.b = j11;
                                this.a0 = d0Var;
                                this.b0 = i11 + 1;
                                if (!this.Y) {
                                    boolean z11 = j11 - 30000 <= j10 && j10 <= 30000 + j11;
                                    d0 d0Var2 = this.Z;
                                    boolean z12 = d0Var2 != null && d0Var2.b <= j10 && j10 < j11;
                                    x xVar3 = this.S;
                                    xVar3.getClass();
                                    this.Y = z11 || z12 || (xVar3.R == -1 || (i10 = (xVar = this.S).S) == -1 || i11 == (i10 * xVar.R) - 1);
                                    if (z12) {
                                    }
                                }
                                this.Z = this.a0;
                                this.a0 = null;
                            } else {
                                this.Y = true;
                            }
                            hVar2 = this.U;
                            hVar2.getClass();
                            if (!hVar2.isEndOfStream()) {
                                this.L = true;
                                this.U = null;
                                return false;
                            }
                            long j12 = this.P;
                            h hVar7 = this.U;
                            hVar7.getClass();
                            this.P = Math.max(j12, hVar7.e);
                            if (z10) {
                                this.U = null;
                            } else {
                                h hVar8 = this.U;
                                hVar8.getClass();
                                hVar8.clear();
                            }
                            return !this.Y;
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                    hVar = this.U;
                    hVar.getClass();
                    if (hVar.isEndOfStream()) {
                    }
                    hVar2 = this.U;
                    hVar2.getClass();
                    if (!hVar2.isEndOfStream()) {
                    }
                } else if (w9 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void H() {
        if (this.c0) {
            x xVar = this.S;
            xVar.getClass();
            b bVar = this.I;
            bVar.getClass();
            int b10 = b.b(xVar);
            if (b10 != i0.a.a(4, 0, 0, 0) && b10 != i0.a.a(3, 0, 0, 0)) {
                throw e(new d("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
            }
            c cVar = this.T;
            if (cVar != null) {
                cVar.release();
            }
            this.T = new c(bVar.a);
            this.c0 = false;
        }
    }

    public final void I() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        c cVar = this.T;
        if (cVar != null) {
            cVar.release();
            this.T = null;
        }
    }

    @Override // i2.b, i2.o1
    public final void d(int i10, Object obj) {
        if (i10 != 15) {
            if (i10 != 23) {
                return;
            }
            this.W = (l0) obj;
        } else {
            e eVar = obj instanceof e ? (e) obj : null;
            if (eVar == null) {
                eVar = e.a;
            }
            this.V = eVar;
        }
    }

    @Override // i2.b
    public final String j() {
        return "ImageRenderer";
    }

    @Override // i2.b
    public final boolean l() {
        return this.M;
    }

    @Override // i2.b
    public final boolean m() {
        int i10 = this.R;
        if (i10 != 3) {
            return i10 == 0 && this.Y;
        }
        return true;
    }

    @Override // i2.b
    public final void n() {
        this.S = null;
        this.N = f.c;
        this.K.clear();
        I();
        this.V.getClass();
    }

    @Override // i2.b
    public final void o(boolean z10, boolean z11) {
        this.R = z11 ? 1 : 0;
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.X = null;
        this.Z = null;
        this.a0 = null;
        this.Y = false;
        this.U = null;
        c cVar = this.T;
        if (cVar != null) {
            cVar.flush();
        }
        this.K.clear();
    }

    @Override // i2.b
    public final void q() {
        I();
    }

    @Override // i2.b
    public final void r() {
        I();
        this.R = Math.min(this.R, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(x[] xVarArr, long j10, long j11, g0 g0Var) {
        if (this.N.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.K;
            if (arrayDeque.isEmpty()) {
                long j12 = this.P;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.O;
                    if (j13 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new f(this.P, j11));
            return;
        }
        this.N = new f(-9223372036854775807L, j11);
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        if (this.M) {
            return;
        }
        if (this.S == null) {
            hf.b bVar = this.c;
            bVar.L();
            h hVar = this.J;
            hVar.clear();
            int w9 = w(bVar, hVar, 2);
            if (w9 != -5) {
                if (w9 == -4) {
                    t6.p(hVar.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
            x xVar = (x) bVar.c;
            xVar.getClass();
            this.S = xVar;
            this.c0 = true;
        }
        if (this.T == null) {
            H();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (F(j10)) {
            }
            while (G(j10)) {
            }
            Trace.endSection();
        } catch (d e) {
            throw e(e, null, false, 4003);
        }
    }
}
