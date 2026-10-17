package si;

import android.os.Handler;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ n c;

    public /* synthetic */ e(k kVar, n nVar, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                e eVar = new e(kVar, this.c, 3);
                Handler handler = kVar.n;
                if (handler != null) {
                    handler.post(eVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.b;
                e eVar2 = new e(kVar2, this.c, 2);
                Handler handler2 = kVar2.n;
                if (handler2 != null) {
                    handler2.post(eVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.b;
                n nVar = this.c;
                if (kVar3.V && !kVar3.b0 && kVar3.x == nVar) {
                    kVar3.k();
                    kVar3.j.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.E0));
                    t0 t0Var = (t0) kVar3.k.b;
                    t0Var.i.post(new j0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.b;
                n nVar2 = this.c;
                if (!kVar4.V || kVar4.b0 || kVar4.x != nVar2 || kVar4.A == null || (uVar = kVar4.w) == null) {
                    return;
                }
                try {
                    long j10 = nVar2.A;
                    if (j10 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    uVar.p = j10;
                    uVar.Q = -1L;
                    uVar.R = 0L;
                    uVar.S = -1L;
                    uVar.q = Long.MAX_VALUE;
                    uVar.s0 = true;
                    kVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.z(kVar4.E0));
                    return;
                } catch (RuntimeException e) {
                    kVar4.k();
                    kVar4.N(e);
                    return;
                }
        }
    }
}
