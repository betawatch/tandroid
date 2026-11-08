package wi;

import android.os.Handler;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ n c;

    public /* synthetic */ d(k kVar, n nVar, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                d dVar = new d(kVar, this.c, 3);
                Handler handler = kVar.n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.b;
                d dVar2 = new d(kVar2, this.c, 2);
                Handler handler2 = kVar2.n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.b;
                n nVar = this.c;
                if (kVar3.V && !kVar3.Z && kVar3.x == nVar) {
                    kVar3.j();
                    if (kVar3.g0 == 0) {
                        kVar3.g0 = nVar.e;
                    }
                    kVar3.j.b("common A/V start completed: segmentElapsedMs=" + k.A(kVar3.D0));
                    t0 t0Var = (t0) kVar3.k.b;
                    t0Var.i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.b;
                n nVar2 = this.c;
                if (!kVar4.V || kVar4.Z || kVar4.x != nVar2 || kVar4.A == null || (tVar = kVar4.w) == null) {
                    return;
                }
                try {
                    long j3 = nVar2.F;
                    if (j3 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    tVar.p = j3;
                    tVar.Q = -1L;
                    tVar.R = 0L;
                    tVar.S = -1L;
                    tVar.q = Long.MAX_VALUE;
                    tVar.t0 = true;
                    kVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.A(kVar4.D0));
                    return;
                } catch (RuntimeException e10) {
                    kVar4.j();
                    kVar4.N(e10);
                    return;
                }
        }
    }
}
