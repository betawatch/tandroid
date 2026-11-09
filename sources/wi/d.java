package wi;

import android.os.Handler;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                if (kVar3.U && !kVar3.Y && kVar3.w == nVar) {
                    kVar3.j();
                    if (kVar3.f0 == 0) {
                        kVar3.f0 = nVar.e;
                    }
                    kVar3.j.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.C0));
                    t0 t0Var = (t0) kVar3.k.b;
                    t0Var.i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.b;
                n nVar2 = this.c;
                if (!kVar4.U || kVar4.Y || kVar4.w != nVar2 || kVar4.z == null || (tVar = kVar4.v) == null) {
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
                    kVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.z(kVar4.C0));
                    return;
                } catch (RuntimeException e10) {
                    kVar4.j();
                    kVar4.M(e10);
                    return;
                }
        }
    }
}
