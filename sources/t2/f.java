package t2;

import a8.ia;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.biometric.t;
import e2.u;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import jg.g;
import k2.h;
import l2.k0;
import l2.r0;
import li.z;
import x2.g0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends l2.b {
    public final t I;
    public final h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public e N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public u S;
    public b T;
    public h U;
    public d V;
    public k0 W;
    public Bitmap X;
    public boolean Y;
    public z Z;
    public z a0;
    public int b0;
    public boolean c0;

    public f(t tVar) {
        super(4);
        this.I = tVar;
        this.V = d.a;
        this.J = new h(0, 0);
        this.N = e.c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override // l2.b
    public final int C(u uVar) {
        this.I.getClass();
        return t.d(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r14 == ((r0 * r1.R) - 1)) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(long j3) {
        boolean z9;
        Bitmap bitmap;
        Bitmap bitmap2 = this.X;
        if ((bitmap2 == null || this.Z != null) && (this.R != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.K;
            if (bitmap2 == null) {
                this.T.getClass();
                a aVar = (a) this.T.c();
                if (aVar != null) {
                    if (!aVar.isEndOfStream()) {
                        ia.k(aVar.a, "Non-EOS buffer came back from the decoder without bitmap.");
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
                u uVar = this.S;
                int i7 = uVar.R;
                int i10 = uVar.S;
                boolean z10 = ((i7 == 1 && i10 == 1) || i7 == -1 || i10 == -1) ? false : true;
                z zVar = this.Z;
                if (((Bitmap) zVar.c) == null) {
                    if (z10) {
                        int i11 = zVar.a;
                        this.X.getClass();
                        int width = this.X.getWidth();
                        u uVar2 = this.S;
                        uVar2.getClass();
                        int i12 = width / uVar2.R;
                        int height = this.X.getHeight();
                        u uVar3 = this.S;
                        uVar3.getClass();
                        int i13 = height / uVar3.S;
                        int i14 = this.S.R;
                        bitmap = Bitmap.createBitmap(this.X, (i11 % i14) * i12, (i11 / i14) * i13, i12, i13);
                    } else {
                        bitmap = this.X;
                        bitmap.getClass();
                    }
                    zVar.c = bitmap;
                }
                ((Bitmap) this.Z.c).getClass();
                long j10 = this.Z.b - j3;
                boolean z11 = this.n == 2;
                int i15 = this.R;
                if (i15 != 0) {
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        z11 = false;
                    }
                }
                if (z11 || j10 < 30000) {
                    k0 k0Var = this.W;
                    if (k0Var != null) {
                        long j11 = this.N.b;
                        this.S.getClass();
                        r0 r0Var = k0Var.a;
                        if (r0Var.U) {
                            r0Var.n.a(37).b();
                        }
                    }
                    d dVar = this.V;
                    long j12 = this.N.b;
                    dVar.getClass();
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    z zVar2 = this.Z;
                    zVar2.getClass();
                    long j13 = zVar2.b;
                    this.O = j13;
                    while (!arrayDeque.isEmpty() && j13 >= ((e) arrayDeque.peek()).a) {
                        this.N = (e) arrayDeque.removeFirst();
                    }
                    this.R = 3;
                    if (z10) {
                        z zVar3 = this.Z;
                        zVar3.getClass();
                        int i16 = zVar3.a;
                        u uVar4 = this.S;
                        uVar4.getClass();
                        int i17 = uVar4.S;
                        u uVar5 = this.S;
                        uVar5.getClass();
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
    public final boolean G(long j3) {
        boolean z9;
        h hVar;
        u uVar;
        int i7;
        h hVar2;
        if (!this.Y || this.Z == null) {
            wf.b bVar = this.c;
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
                int w10 = w(bVar, this.U, 0);
                if (w10 == -5) {
                    u uVar2 = (u) bVar.c;
                    uVar2.getClass();
                    this.S = uVar2;
                    this.c0 = true;
                    this.Q = 2;
                    return true;
                }
                if (w10 == -4) {
                    this.U.c();
                    ByteBuffer byteBuffer = this.U.c;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        h hVar4 = this.U;
                        hVar4.getClass();
                        if (!hVar4.isEndOfStream()) {
                            z9 = false;
                            if (z9) {
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
                                int i10 = this.b0;
                                long j10 = hVar.e;
                                z zVar = new z();
                                zVar.a = i10;
                                zVar.b = j10;
                                this.a0 = zVar;
                                this.b0 = i10 + 1;
                                if (!this.Y) {
                                    boolean z10 = j10 - 30000 <= j3 && j3 <= 30000 + j10;
                                    z zVar2 = this.Z;
                                    boolean z11 = zVar2 != null && zVar2.b <= j3 && j3 < j10;
                                    u uVar3 = this.S;
                                    uVar3.getClass();
                                    this.Y = z10 || z11 || (uVar3.R == -1 || (i7 = (uVar = this.S).S) == -1 || i10 == (i7 * uVar.R) - 1);
                                    if (z11) {
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
                            long j11 = this.P;
                            h hVar7 = this.U;
                            hVar7.getClass();
                            this.P = Math.max(j11, hVar7.e);
                            if (z9) {
                                this.U = null;
                            } else {
                                h hVar8 = this.U;
                                hVar8.getClass();
                                hVar8.clear();
                            }
                            return !this.Y;
                        }
                    }
                    z9 = true;
                    if (z9) {
                    }
                    hVar = this.U;
                    hVar.getClass();
                    if (hVar.isEndOfStream()) {
                    }
                    hVar2 = this.U;
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
        if (this.c0) {
            u uVar = this.S;
            uVar.getClass();
            t tVar = this.I;
            tVar.getClass();
            int d = t.d(uVar);
            if (d != g.b(4, 0, 0, 0) && d != g.b(3, 0, 0, 0)) {
                throw d(new c("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
            }
            b bVar = this.T;
            if (bVar != null) {
                bVar.release();
            }
            this.T = new b(tVar.a);
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

    @Override // l2.b, l2.m1
    public final void c(int i7, Object obj) {
        if (i7 != 15) {
            if (i7 != 23) {
                return;
            }
            this.W = (k0) obj;
        } else {
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar == null) {
                dVar = d.a;
            }
            this.V = dVar;
        }
    }

    @Override // l2.b
    public final String i() {
        return "ImageRenderer";
    }

    @Override // l2.b
    public final boolean l() {
        return this.M;
    }

    @Override // l2.b
    public final boolean m() {
        int i7 = this.R;
        if (i7 != 3) {
            return i7 == 0 && this.Y;
        }
        return true;
    }

    @Override // l2.b
    public final void n() {
        this.S = null;
        this.N = e.c;
        this.K.clear();
        I();
        this.V.getClass();
    }

    @Override // l2.b
    public final void o(boolean z9, boolean z10) {
        this.R = z10 ? 1 : 0;
    }

    @Override // l2.b
    public final void p(long j3, boolean z9, boolean z10) {
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

    @Override // l2.b
    public final void q() {
        I();
    }

    @Override // l2.b
    public final void r() {
        I();
        this.R = Math.min(this.R, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(u[] uVarArr, long j3, long j10, g0 g0Var) {
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

    @Override // l2.b
    public final void x(long j3, long j10) {
        if (this.M) {
            return;
        }
        if (this.S == null) {
            wf.b bVar = this.c;
            bVar.A();
            h hVar = this.J;
            hVar.clear();
            int w10 = w(bVar, hVar, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ia.p(hVar.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
            u uVar = (u) bVar.c;
            uVar.getClass();
            this.S = uVar;
            this.c0 = true;
        }
        if (this.T == null) {
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
