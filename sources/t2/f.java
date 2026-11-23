package t2;

import a8.ma;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.biometric.t;
import e2.u;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import jb.m;
import k2.h;
import l2.i0;
import l2.p0;
import x2.g0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f extends l2.b {
    public final t J;
    public final h K;
    public final ArrayDeque L;
    public boolean M;
    public boolean N;
    public e O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public u T;
    public b U;
    public h V;
    public d W;
    public i0 X;
    public Bitmap Y;
    public boolean Z;
    public m5.b a0;
    public m5.b b0;
    public int c0;
    public boolean d0;

    public f(t tVar) {
        super(4);
        this.J = tVar;
        this.W = d.a;
        this.K = new h(0, 0);
        this.O = e.c;
        this.L = new ArrayDeque();
        this.Q = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.R = 0;
        this.S = 1;
    }

    @Override // l2.b
    public final int C(u uVar) {
        this.J.getClass();
        return t.d(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r14 == ((r0 * r1.R) - 1)) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(long j3) {
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2 = this.Y;
        if ((bitmap2 == null || this.a0 != null) && (this.S != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.L;
            if (bitmap2 == null) {
                this.U.getClass();
                a aVar = (a) this.U.c();
                if (aVar != null) {
                    if (!aVar.isEndOfStream()) {
                        ma.k(aVar.a, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.Y = aVar.a;
                        aVar.release();
                    } else {
                        if (this.R == 3) {
                            I();
                            this.T.getClass();
                            H();
                            return false;
                        }
                        aVar.release();
                        if (arrayDeque.isEmpty()) {
                            this.N = true;
                            return false;
                        }
                    }
                }
            }
            if (this.Z && this.Y != null && this.a0 != null) {
                this.T.getClass();
                u uVar = this.T;
                int i7 = uVar.R;
                int i10 = uVar.S;
                boolean z11 = ((i7 == 1 && i10 == 1) || i7 == -1 || i10 == -1) ? false : true;
                m5.b bVar = this.a0;
                if (((Bitmap) bVar.c) == null) {
                    if (z11) {
                        int i11 = bVar.b;
                        this.Y.getClass();
                        int width = this.Y.getWidth();
                        u uVar2 = this.T;
                        uVar2.getClass();
                        int i12 = width / uVar2.R;
                        int height = this.Y.getHeight();
                        u uVar3 = this.T;
                        uVar3.getClass();
                        int i13 = height / uVar3.S;
                        int i14 = this.T.R;
                        bitmap = Bitmap.createBitmap(this.Y, (i11 % i14) * i12, (i11 / i14) * i13, i12, i13);
                    } else {
                        bitmap = this.Y;
                        bitmap.getClass();
                    }
                    bVar.c = bitmap;
                }
                ((Bitmap) this.a0.c).getClass();
                long j10 = this.a0.a - j3;
                boolean z12 = this.n == 2;
                int i15 = this.S;
                if (i15 != 0) {
                    if (i15 == 1) {
                        z12 = true;
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        z12 = false;
                    }
                }
                if (z12 || j10 < 30000) {
                    i0 i0Var = this.X;
                    if (i0Var != null) {
                        long j11 = this.O.b;
                        this.T.getClass();
                        p0 p0Var = i0Var.a;
                        if (p0Var.V) {
                            p0Var.n.a(37).b();
                        }
                    }
                    d dVar = this.W;
                    long j12 = this.O.b;
                    dVar.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    m5.b bVar2 = this.a0;
                    bVar2.getClass();
                    long j13 = bVar2.a;
                    this.P = j13;
                    while (!arrayDeque.isEmpty() && j13 >= ((e) arrayDeque.peek()).a) {
                        this.O = (e) arrayDeque.removeFirst();
                    }
                    this.S = 3;
                    if (z11) {
                        m5.b bVar3 = this.a0;
                        bVar3.getClass();
                        int i16 = bVar3.b;
                        u uVar4 = this.T;
                        uVar4.getClass();
                        int i17 = uVar4.S;
                        u uVar5 = this.T;
                        uVar5.getClass();
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
    public final boolean G(long j3) {
        boolean z10;
        h hVar;
        u uVar;
        int i7;
        h hVar2;
        if (!this.Z || this.a0 == null) {
            m mVar = this.c;
            mVar.T();
            b bVar = this.U;
            if (bVar != null && this.R != 3 && !this.M) {
                if (this.V == null) {
                    h hVar3 = (h) bVar.d();
                    this.V = hVar3;
                }
                if (this.R == 2) {
                    this.V.getClass();
                    this.V.setFlags(4);
                    b bVar2 = this.U;
                    bVar2.getClass();
                    bVar2.e(this.V);
                    this.V = null;
                    this.R = 3;
                    return false;
                }
                int w10 = w(mVar, this.V, 0);
                if (w10 == -5) {
                    u uVar2 = (u) mVar.c;
                    uVar2.getClass();
                    this.T = uVar2;
                    this.d0 = true;
                    this.R = 2;
                    return true;
                }
                if (w10 == -4) {
                    this.V.c();
                    ByteBuffer byteBuffer = this.V.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        h hVar4 = this.V;
                        hVar4.getClass();
                        if (!hVar4.isEndOfStream()) {
                            z10 = false;
                            if (z10) {
                                h hVar5 = this.V;
                                hVar5.getClass();
                                hVar5.a = this.T;
                                b bVar3 = this.U;
                                bVar3.getClass();
                                h hVar6 = this.V;
                                hVar6.getClass();
                                bVar3.e(hVar6);
                                this.c0 = 0;
                            }
                            hVar = this.V;
                            hVar.getClass();
                            if (hVar.isEndOfStream()) {
                                int i10 = this.c0;
                                long j10 = hVar.e;
                                m5.b bVar4 = new m5.b();
                                bVar4.b = i10;
                                bVar4.a = j10;
                                this.b0 = bVar4;
                                this.c0 = i10 + 1;
                                if (!this.Z) {
                                    boolean z11 = j10 - 30000 <= j3 && j3 <= 30000 + j10;
                                    m5.b bVar5 = this.a0;
                                    boolean z12 = bVar5 != null && bVar5.a <= j3 && j3 < j10;
                                    u uVar3 = this.T;
                                    uVar3.getClass();
                                    this.Z = z11 || z12 || (uVar3.R == -1 || (i7 = (uVar = this.T).S) == -1 || i10 == (i7 * uVar.R) - 1);
                                    if (z12) {
                                    }
                                }
                                this.a0 = this.b0;
                                this.b0 = null;
                            } else {
                                this.Z = true;
                            }
                            hVar2 = this.V;
                            hVar2.getClass();
                            if (!hVar2.isEndOfStream()) {
                                this.M = true;
                                this.V = null;
                                return false;
                            }
                            long j11 = this.Q;
                            h hVar7 = this.V;
                            hVar7.getClass();
                            this.Q = Math.max(j11, hVar7.e);
                            if (z10) {
                                this.V = null;
                            } else {
                                h hVar8 = this.V;
                                hVar8.getClass();
                                hVar8.clear();
                            }
                            return !this.Z;
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                    hVar = this.V;
                    hVar.getClass();
                    if (hVar.isEndOfStream()) {
                    }
                    hVar2 = this.V;
                    hVar2.getClass();
                    if (!hVar2.isEndOfStream()) {
                    }
                } else if (w10 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void H() {
        if (this.d0) {
            u uVar = this.T;
            uVar.getClass();
            t tVar = this.J;
            tVar.getClass();
            int d = t.d(uVar);
            if (d != i5.c.a(4, 0, 0, 0) && d != i5.c.a(3, 0, 0, 0)) {
                throw d(new c("Provided decoder factory can't create decoder for format."), this.T, false, 4005);
            }
            b bVar = this.U;
            if (bVar != null) {
                bVar.release();
            }
            this.U = new b(tVar.a);
            this.d0 = false;
        }
    }

    public final void I() {
        this.V = null;
        this.R = 0;
        this.Q = -9223372036854775807L;
        b bVar = this.U;
        if (bVar != null) {
            bVar.release();
            this.U = null;
        }
    }

    @Override // l2.b, l2.j1
    public final void c(int i7, Object obj) {
        if (i7 != 15) {
            if (i7 != 23) {
                return;
            }
            this.X = (i0) obj;
        } else {
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar == null) {
                dVar = d.a;
            }
            this.W = dVar;
        }
    }

    @Override // l2.b
    public final String i() {
        return "ImageRenderer";
    }

    @Override // l2.b
    public final boolean k() {
        return this.N;
    }

    @Override // l2.b
    public final boolean m() {
        int i7 = this.S;
        if (i7 != 3) {
            return i7 == 0 && this.Z;
        }
        return true;
    }

    @Override // l2.b
    public final void n() {
        this.T = null;
        this.O = e.c;
        this.L.clear();
        I();
        this.W.getClass();
    }

    @Override // l2.b
    public final void o(boolean z10, boolean z11) {
        this.S = z11 ? 1 : 0;
    }

    @Override // l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        this.S = Math.min(this.S, 1);
        this.N = false;
        this.M = false;
        this.Y = null;
        this.a0 = null;
        this.b0 = null;
        this.Z = false;
        this.V = null;
        b bVar = this.U;
        if (bVar != null) {
            bVar.flush();
        }
        this.L.clear();
    }

    @Override // l2.b
    public final void q() {
        I();
    }

    @Override // l2.b
    public final void r() {
        I();
        this.S = Math.min(this.S, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(u[] uVarArr, long j3, long j10, g0 g0Var) {
        if (this.O.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.L;
            if (arrayDeque.isEmpty()) {
                long j11 = this.Q;
                if (j11 != -9223372036854775807L) {
                    long j12 = this.P;
                    if (j12 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new e(this.Q, j10));
            return;
        }
        this.O = new e(-9223372036854775807L, j10);
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        if (this.N) {
            return;
        }
        if (this.T == null) {
            m mVar = this.c;
            mVar.T();
            h hVar = this.K;
            hVar.clear();
            int w10 = w(mVar, hVar, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ma.p(hVar.isEndOfStream());
                    this.M = true;
                    this.N = true;
                    return;
                }
                return;
            }
            u uVar = (u) mVar.c;
            uVar.getClass();
            this.T = uVar;
            this.d0 = true;
        }
        if (this.U == null) {
            H();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (F(j3)) {
            }
            while (G(j3)) {
            }
            Trace.endSection();
        } catch (c e10) {
            throw d(e10, null, false, 4003);
        }
    }
}
