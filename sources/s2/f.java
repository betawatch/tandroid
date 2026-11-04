package s2;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.emoji2.text.n;
import b8.zb;
import d2.v;
import j2.h;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import k2.k0;
import k2.p1;
import k2.r0;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends k2.b {
    public final n J;
    public final h K;
    public final ArrayDeque L;
    public boolean M;
    public boolean N;
    public e O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public v T;
    public b U;
    public h V;
    public d W;
    public k0 X;
    public Bitmap Y;
    public boolean Z;
    public l5.c a0;
    public l5.c b0;
    public int c0;
    public boolean d0;

    public f(n nVar) {
        super(4);
        this.J = nVar;
        this.W = d.a;
        this.K = new h(0, 0);
        this.O = e.c;
        this.L = new ArrayDeque();
        this.Q = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.R = 0;
        this.S = 1;
    }

    @Override // k2.b
    public final int C(v vVar) {
        this.J.getClass();
        return n.e(vVar);
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
        Bitmap bitmap2 = this.Y;
        if ((bitmap2 == null || this.a0 != null) && (this.S != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.L;
            if (bitmap2 == null) {
                this.U.getClass();
                a aVar = (a) this.U.c();
                if (aVar != null) {
                    if (!aVar.isEndOfStream()) {
                        zb.k(aVar.a, "Non-EOS buffer came back from the decoder without bitmap.");
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
                v vVar = this.T;
                int i3 = vVar.R;
                int i10 = vVar.S;
                boolean z11 = ((i3 == 1 && i10 == 1) || i3 == -1 || i10 == -1) ? false : true;
                l5.c cVar = this.a0;
                if (((Bitmap) cVar.c) == null) {
                    if (z11) {
                        int i11 = cVar.b;
                        this.Y.getClass();
                        int width = this.Y.getWidth();
                        v vVar2 = this.T;
                        vVar2.getClass();
                        int i12 = width / vVar2.R;
                        int height = this.Y.getHeight();
                        v vVar3 = this.T;
                        vVar3.getClass();
                        int i13 = height / vVar3.S;
                        int i14 = this.T.R;
                        bitmap = Bitmap.createBitmap(this.Y, (i11 % i14) * i12, (i11 / i14) * i13, i12, i13);
                    } else {
                        bitmap = this.Y;
                        bitmap.getClass();
                    }
                    cVar.c = bitmap;
                }
                ((Bitmap) this.a0.c).getClass();
                long j11 = this.a0.a - j10;
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
                if (z12 || j11 < 30000) {
                    k0 k0Var = this.X;
                    if (k0Var != null) {
                        long j12 = this.O.b;
                        this.T.getClass();
                        r0 r0Var = k0Var.a;
                        if (r0Var.V) {
                            r0Var.n.a(37).b();
                        }
                    }
                    d dVar = this.W;
                    long j13 = this.O.b;
                    dVar.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    l5.c cVar2 = this.a0;
                    cVar2.getClass();
                    long j14 = cVar2.a;
                    this.P = j14;
                    while (!arrayDeque.isEmpty() && j14 >= ((e) arrayDeque.peek()).a) {
                        this.O = (e) arrayDeque.removeFirst();
                    }
                    this.S = 3;
                    if (z11) {
                        l5.c cVar3 = this.a0;
                        cVar3.getClass();
                        int i16 = cVar3.b;
                        v vVar4 = this.T;
                        vVar4.getClass();
                        int i17 = vVar4.S;
                        v vVar5 = this.T;
                        vVar5.getClass();
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
    public final boolean G(long j10) {
        boolean z10;
        h hVar;
        v vVar;
        int i3;
        h hVar2;
        if (!this.Z || this.a0 == null) {
            tf.b bVar = this.c;
            bVar.q();
            b bVar2 = this.U;
            if (bVar2 != null && this.R != 3 && !this.M) {
                if (this.V == null) {
                    h hVar3 = (h) bVar2.d();
                    this.V = hVar3;
                }
                if (this.R == 2) {
                    this.V.getClass();
                    this.V.setFlags(4);
                    b bVar3 = this.U;
                    bVar3.getClass();
                    bVar3.e(this.V);
                    this.V = null;
                    this.R = 3;
                    return false;
                }
                int w10 = w(bVar, this.V, 0);
                if (w10 == -5) {
                    v vVar2 = (v) bVar.b;
                    vVar2.getClass();
                    this.T = vVar2;
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
                                b bVar4 = this.U;
                                bVar4.getClass();
                                h hVar6 = this.V;
                                hVar6.getClass();
                                bVar4.e(hVar6);
                                this.c0 = 0;
                            }
                            hVar = this.V;
                            hVar.getClass();
                            if (hVar.isEndOfStream()) {
                                int i10 = this.c0;
                                long j11 = hVar.e;
                                l5.c cVar = new l5.c();
                                cVar.b = i10;
                                cVar.a = j11;
                                this.b0 = cVar;
                                this.c0 = i10 + 1;
                                if (!this.Z) {
                                    boolean z11 = j11 - 30000 <= j10 && j10 <= 30000 + j11;
                                    l5.c cVar2 = this.a0;
                                    boolean z12 = cVar2 != null && cVar2.a <= j10 && j10 < j11;
                                    v vVar3 = this.T;
                                    vVar3.getClass();
                                    this.Z = z11 || z12 || (vVar3.R == -1 || (i3 = (vVar = this.T).S) == -1 || i10 == (i3 * vVar.R) - 1);
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
                            long j12 = this.Q;
                            h hVar7 = this.V;
                            hVar7.getClass();
                            this.Q = Math.max(j12, hVar7.e);
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
            v vVar = this.T;
            vVar.getClass();
            n nVar = this.J;
            nVar.getClass();
            int e10 = n.e(vVar);
            if (e10 != p1.a(4, 0, 0, 0) && e10 != p1.a(3, 0, 0, 0)) {
                throw e(new c("Provided decoder factory can't create decoder for format."), this.T, false, 4005);
            }
            b bVar = this.U;
            if (bVar != null) {
                bVar.release();
            }
            this.U = new b(nVar.a);
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

    @Override // k2.b, k2.l1
    public final void d(int i3, Object obj) {
        if (i3 != 15) {
            if (i3 != 23) {
                return;
            }
            this.X = (k0) obj;
        } else {
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar == null) {
                dVar = d.a;
            }
            this.W = dVar;
        }
    }

    @Override // k2.b
    public final String j() {
        return "ImageRenderer";
    }

    @Override // k2.b
    public final boolean l() {
        return this.N;
    }

    @Override // k2.b
    public final boolean m() {
        int i3 = this.S;
        if (i3 != 3) {
            return i3 == 0 && this.Z;
        }
        return true;
    }

    @Override // k2.b
    public final void n() {
        this.T = null;
        this.O = e.c;
        this.L.clear();
        I();
        this.W.getClass();
    }

    @Override // k2.b
    public final void o(boolean z10, boolean z11) {
        this.S = z11 ? 1 : 0;
    }

    @Override // k2.b
    public final void p(long j10, boolean z10, boolean z11) {
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

    @Override // k2.b
    public final void q() {
        I();
    }

    @Override // k2.b
    public final void r() {
        I();
        this.S = Math.min(this.S, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(v[] vVarArr, long j10, long j11, g0 g0Var) {
        if (this.O.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.L;
            if (arrayDeque.isEmpty()) {
                long j12 = this.Q;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.P;
                    if (j13 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new e(this.Q, j11));
            return;
        }
        this.O = new e(-9223372036854775807L, j11);
    }

    @Override // k2.b
    public final void x(long j10, long j11) {
        if (this.N) {
            return;
        }
        if (this.T == null) {
            tf.b bVar = this.c;
            bVar.q();
            h hVar = this.K;
            hVar.clear();
            int w10 = w(bVar, hVar, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    zb.p(hVar.isEndOfStream());
                    this.M = true;
                    this.N = true;
                    return;
                }
                return;
            }
            v vVar = (v) bVar.b;
            vVar.getClass();
            this.T = vVar;
            this.d0 = true;
        }
        if (this.U == null) {
            H();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (F(j10)) {
            }
            while (G(j10)) {
            }
            Trace.endSection();
        } catch (c e10) {
            throw e(e10, null, false, 4003);
        }
    }
}
