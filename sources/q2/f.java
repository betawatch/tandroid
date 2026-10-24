package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.w;
import h2.h;
import i2.j0;
import i2.o1;
import i2.q0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import l5.j;
import u2.h0;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f extends i2.b {
    public final j I;
    public final h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public e N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public w S;
    public b T;
    public h U;
    public d V;
    public j0 W;
    public Bitmap X;
    public boolean Y;
    public j5.c Z;
    public j5.c a0;
    public int b0;
    public boolean c0;

    public f(j jVar) {
        super(4);
        this.I = jVar;
        this.V = d.a;
        this.J = new h(0, 0);
        this.N = e.c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override // i2.b
    public final int C(w wVar) {
        this.I.getClass();
        return j.d(wVar);
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
                        u6.l(aVar.a, "Non-EOS buffer came back from the decoder without bitmap.");
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
                w wVar = this.S;
                int i10 = wVar.R;
                int i11 = wVar.S;
                boolean z11 = ((i10 == 1 && i11 == 1) || i10 == -1 || i11 == -1) ? false : true;
                j5.c cVar = this.Z;
                if (((Bitmap) cVar.c) == null) {
                    if (z11) {
                        int i12 = cVar.b;
                        this.X.getClass();
                        int width = this.X.getWidth();
                        w wVar2 = this.S;
                        wVar2.getClass();
                        int i13 = width / wVar2.R;
                        int height = this.X.getHeight();
                        w wVar3 = this.S;
                        wVar3.getClass();
                        int i14 = height / wVar3.S;
                        int i15 = this.S.R;
                        bitmap = Bitmap.createBitmap(this.X, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmap = this.X;
                        bitmap.getClass();
                    }
                    cVar.c = bitmap;
                }
                ((Bitmap) this.Z.c).getClass();
                long j11 = this.Z.a - j10;
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
                    j0 j0Var = this.W;
                    if (j0Var != null) {
                        long j12 = this.N.b;
                        this.S.getClass();
                        q0 q0Var = j0Var.a;
                        if (q0Var.U) {
                            q0Var.n.a(37).b();
                        }
                    }
                    d dVar = this.V;
                    long j13 = this.N.b;
                    dVar.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j5.c cVar2 = this.Z;
                    cVar2.getClass();
                    long j14 = cVar2.a;
                    this.O = j14;
                    while (!arrayDeque.isEmpty() && j14 >= ((e) arrayDeque.peek()).a) {
                        this.N = (e) arrayDeque.removeFirst();
                    }
                    this.R = 3;
                    if (z11) {
                        j5.c cVar3 = this.Z;
                        cVar3.getClass();
                        int i17 = cVar3.b;
                        w wVar4 = this.S;
                        wVar4.getClass();
                        int i18 = wVar4.S;
                        w wVar5 = this.S;
                        wVar5.getClass();
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
        w wVar;
        int i10;
        h hVar2;
        if (!this.Y || this.Z == null) {
            qf.b bVar = this.c;
            bVar.A();
            b bVar2 = this.T;
            if (bVar2 != null && this.Q != 3 && !this.L) {
                if (this.U == null) {
                    h hVar3 = (h) bVar2.d();
                    this.U = hVar3;
                }
                if (this.Q == 2) {
                    this.U.getClass();
                    this.U.setFlags(4);
                    b bVar3 = this.T;
                    bVar3.getClass();
                    bVar3.e(this.U);
                    this.U = null;
                    this.Q = 3;
                    return false;
                }
                int w9 = w(bVar, this.U, 0);
                if (w9 == -5) {
                    w wVar2 = (w) bVar.c;
                    wVar2.getClass();
                    this.S = wVar2;
                    this.c0 = true;
                    this.Q = 2;
                    return true;
                }
                if (w9 == -4) {
                    this.U.c();
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
                                b bVar4 = this.T;
                                bVar4.getClass();
                                h hVar6 = this.U;
                                hVar6.getClass();
                                bVar4.e(hVar6);
                                this.b0 = 0;
                            }
                            hVar = this.U;
                            hVar.getClass();
                            if (hVar.isEndOfStream()) {
                                int i11 = this.b0;
                                long j11 = hVar.e;
                                j5.c cVar = new j5.c();
                                cVar.b = i11;
                                cVar.a = j11;
                                this.a0 = cVar;
                                this.b0 = i11 + 1;
                                if (!this.Y) {
                                    boolean z11 = j11 - 30000 <= j10 && j10 <= 30000 + j11;
                                    j5.c cVar2 = this.Z;
                                    boolean z12 = cVar2 != null && cVar2.a <= j10 && j10 < j11;
                                    w wVar3 = this.S;
                                    wVar3.getClass();
                                    this.Y = z11 || z12 || (wVar3.R == -1 || (i10 = (wVar = this.S).S) == -1 || i11 == (i10 * wVar.R) - 1);
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
            w wVar = this.S;
            wVar.getClass();
            j jVar = this.I;
            jVar.getClass();
            int d = j.d(wVar);
            if (d != o1.c(4, 0, 0, 0) && d != o1.c(3, 0, 0, 0)) {
                throw c(new c("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
            }
            b bVar = this.T;
            if (bVar != null) {
                bVar.release();
            }
            this.T = new b(jVar.a);
            this.c0 = false;
        }
    }

    public final void I() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        b bVar = this.T;
        if (bVar != null) {
            bVar.release();
            this.T = null;
        }
    }

    @Override // i2.b, i2.k1
    public final void d(int i10, Object obj) {
        if (i10 != 15) {
            if (i10 != 23) {
                return;
            }
            this.W = (j0) obj;
        } else {
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar == null) {
                dVar = d.a;
            }
            this.V = dVar;
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
        this.N = e.c;
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
        b bVar = this.T;
        if (bVar != null) {
            bVar.flush();
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
    public final void u(w[] wVarArr, long j10, long j11, h0 h0Var) {
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
            arrayDeque.add(new e(this.P, j11));
            return;
        }
        this.N = new e(-9223372036854775807L, j11);
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        if (this.M) {
            return;
        }
        if (this.S == null) {
            qf.b bVar = this.c;
            bVar.A();
            h hVar = this.J;
            hVar.clear();
            int w9 = w(bVar, hVar, 2);
            if (w9 != -5) {
                if (w9 == -4) {
                    u6.p(hVar.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
            w wVar = (w) bVar.c;
            wVar.getClass();
            this.S = wVar;
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
        } catch (c e) {
            throw c(e, null, false, 4003);
        }
    }
}
