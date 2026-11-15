package zi;

import android.os.Handler;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ o c;

    public /* synthetic */ d(l lVar, o oVar, int i7) {
        this.a = i7;
        this.b = lVar;
        this.c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                d dVar = new d(lVar, this.c, 3);
                Handler handler = lVar.n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                l lVar2 = this.b;
                d dVar2 = new d(lVar2, this.c, 2);
                Handler handler2 = lVar2.n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.b;
                o oVar = this.c;
                if (lVar3.U && !lVar3.Y && lVar3.w == oVar) {
                    lVar3.j();
                    if (lVar3.f0 == 0) {
                        lVar3.f0 = oVar.e;
                    }
                    lVar3.j.b("common A/V start completed: segmentElapsedMs=" + l.z(lVar3.C0));
                    v0 v0Var = (v0) lVar3.k.a;
                    v0Var.i.post(new j0(v0Var, 2));
                    return;
                }
                return;
            default:
                l lVar4 = this.b;
                o oVar2 = this.c;
                if (!lVar4.U || lVar4.Y || lVar4.w != oVar2 || lVar4.z == null || (uVar = lVar4.v) == null) {
                    return;
                }
                try {
                    long j3 = oVar2.F;
                    if (j3 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    uVar.p = j3;
                    uVar.Q = -1L;
                    uVar.R = 0L;
                    uVar.S = -1L;
                    uVar.q = Long.MAX_VALUE;
                    uVar.t0 = true;
                    lVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + l.z(lVar4.C0));
                    return;
                } catch (RuntimeException e10) {
                    lVar4.j();
                    lVar4.M(e10);
                    return;
                }
        }
    }
}
