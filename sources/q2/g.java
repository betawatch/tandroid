package q2;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import n4.y;
import u2.f0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g extends i2.f {
    public final b I;
    public final h2.g J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public f N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public s S;
    public c T;
    public h2.g U;
    public e V;
    public Bitmap W;
    public boolean X;
    public j5.b Y;
    public j5.b Z;
    public int a0;
    public boolean b0;

    public g(b bVar) {
        super(4);
        this.I = bVar;
        this.V = e.a;
        this.J = new h2.g(0, 0);
        this.N = f.c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0147, code lost:
    
        if (r14 == ((r0 * r1.Q) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(long j3) {
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2 = this.W;
        if ((bitmap2 == null || this.Y != null) && (this.R != 0 || this.n == 2)) {
            ArrayDeque arrayDeque = this.K;
            if (bitmap2 == null) {
                e2.d.h(this.T);
                a aVar = (a) this.T.c();
                if (aVar != null) {
                    if (!aVar.c(4)) {
                        e2.d.i(aVar.f, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.W = aVar.f;
                        aVar.j();
                    } else {
                        if (this.Q == 3) {
                            E();
                            e2.d.h(this.S);
                            D();
                            return false;
                        }
                        aVar.j();
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
                j5.b bVar = this.Y;
                if (((Bitmap) bVar.c) == null) {
                    if (z11) {
                        int i12 = bVar.b;
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
                    bVar.c = bitmap;
                }
                e2.d.h((Bitmap) this.Y.c);
                long j10 = this.Y.a - j3;
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
                    e eVar = this.V;
                    long j11 = this.N.b;
                    eVar.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j5.b bVar2 = this.Y;
                    e2.d.h(bVar2);
                    long j12 = bVar2.a;
                    this.O = j12;
                    while (!arrayDeque.isEmpty() && j12 >= ((f) arrayDeque.peek()).a) {
                        this.N = (f) arrayDeque.removeFirst();
                    }
                    this.R = 3;
                    if (z11) {
                        j5.b bVar3 = this.Y;
                        e2.d.h(bVar3);
                        int i17 = bVar3.b;
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
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(long j3) {
        boolean z10;
        h2.g gVar;
        s sVar;
        int i10;
        h2.g gVar2;
        if (!this.X || this.Y == null) {
            y yVar = this.c;
            yVar.A();
            c cVar = this.T;
            if (cVar != null && this.Q != 3 && !this.L) {
                if (this.U == null) {
                    h2.g gVar3 = (h2.g) cVar.d();
                    this.U = gVar3;
                }
                if (this.Q == 2) {
                    e2.d.h(this.U);
                    this.U.b = 4;
                    c cVar2 = this.T;
                    e2.d.h(cVar2);
                    cVar2.e(this.U);
                    this.U = null;
                    this.Q = 3;
                    return false;
                }
                int v = v(yVar, this.U, 0);
                if (v == -5) {
                    s sVar2 = (s) yVar.c;
                    e2.d.h(sVar2);
                    this.S = sVar2;
                    this.b0 = true;
                    this.Q = 2;
                    return true;
                }
                if (v == -4) {
                    this.U.m();
                    ByteBuffer byteBuffer = this.U.e;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        h2.g gVar4 = this.U;
                        e2.d.h(gVar4);
                        if (!gVar4.c(4)) {
                            z10 = false;
                            if (z10) {
                                h2.g gVar5 = this.U;
                                e2.d.h(gVar5);
                                gVar5.c = this.S;
                                c cVar3 = this.T;
                                e2.d.h(cVar3);
                                h2.g gVar6 = this.U;
                                e2.d.h(gVar6);
                                cVar3.e(gVar6);
                                this.a0 = 0;
                            }
                            gVar = this.U;
                            e2.d.h(gVar);
                            if (gVar.c(4)) {
                                int i11 = this.a0;
                                long j10 = gVar.h;
                                j5.b bVar = new j5.b();
                                bVar.b = i11;
                                bVar.a = j10;
                                this.Z = bVar;
                                this.a0 = i11 + 1;
                                if (!this.X) {
                                    boolean z11 = j10 - 30000 <= j3 && j3 <= 30000 + j10;
                                    j5.b bVar2 = this.Y;
                                    boolean z12 = bVar2 != null && bVar2.a <= j3 && j3 < j10;
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
                            gVar2 = this.U;
                            e2.d.h(gVar2);
                            if (!gVar2.c(4)) {
                                this.L = true;
                                this.U = null;
                                return false;
                            }
                            long j11 = this.P;
                            h2.g gVar7 = this.U;
                            e2.d.h(gVar7);
                            this.P = Math.max(j11, gVar7.h);
                            if (z10) {
                                this.U = null;
                            } else {
                                h2.g gVar8 = this.U;
                                e2.d.h(gVar8);
                                gVar8.i();
                            }
                            return !this.X;
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                    gVar = this.U;
                    e2.d.h(gVar);
                    if (gVar.c(4)) {
                    }
                    gVar2 = this.U;
                    e2.d.h(gVar2);
                    if (!gVar2.c(4)) {
                    }
                } else if (v != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void D() {
        if (this.b0) {
            s sVar = this.S;
            sVar.getClass();
            b bVar = this.I;
            bVar.getClass();
            int a2 = b.a(sVar);
            if (a2 != i2.g.b(4, 0, 0, 0) && a2 != i2.g.b(3, 0, 0, 0)) {
                throw c(new d("Provided decoder factory can't create decoder for format."), this.S, false, 4005);
            }
            c cVar = this.T;
            if (cVar != null) {
                cVar.release();
            }
            this.T = new c(bVar.a);
            this.b0 = false;
        }
    }

    public final void E() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        c cVar = this.T;
        if (cVar != null) {
            cVar.release();
            this.T = null;
        }
    }

    @Override // i2.f, i2.i1
    public final void d(int i10, Object obj) {
        if (i10 != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.a;
        }
        this.V = eVar;
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
    public final void n() {
        this.S = null;
        this.N = f.c;
        this.K.clear();
        E();
        this.V.getClass();
    }

    @Override // i2.f
    public final void o(boolean z10, boolean z11) {
        this.R = z11 ? 1 : 0;
    }

    @Override // i2.f
    public final void p(long j3, boolean z10) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.W = null;
        this.Y = null;
        this.Z = null;
        this.X = false;
        this.U = null;
        c cVar = this.T;
        if (cVar != null) {
            cVar.flush();
        }
        this.K.clear();
    }

    @Override // i2.f
    public final void q() {
        E();
    }

    @Override // i2.f
    public final void r() {
        E();
        this.R = Math.min(this.R, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(s[] sVarArr, long j3, long j10, f0 f0Var) {
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
            arrayDeque.add(new f(this.P, j10));
            return;
        }
        this.N = new f(-9223372036854775807L, j10);
    }

    @Override // i2.f
    public final void w(long j3, long j10) {
        if (this.M) {
            return;
        }
        if (this.S == null) {
            y yVar = this.c;
            yVar.A();
            h2.g gVar = this.J;
            gVar.i();
            int v = v(yVar, gVar, 2);
            if (v != -5) {
                if (v == -4) {
                    e2.d.g(gVar.c(4));
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
            s sVar = (s) yVar.c;
            e2.d.h(sVar);
            this.S = sVar;
            this.b0 = true;
        }
        if (this.T == null) {
            D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (B(j3)) {
            }
            while (C(j3)) {
            }
            Trace.endSection();
        } catch (d e7) {
            throw c(e7, null, false, 4003);
        }
    }

    @Override // i2.f
    public final int z(s sVar) {
        this.I.getClass();
        return b.a(sVar);
    }
}
