package si;

import android.os.Handler;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ m c;

    public /* synthetic */ d(j jVar, m mVar, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                d dVar = new d(jVar, this.c, 3);
                Handler handler = jVar.n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.b;
                d dVar2 = new d(jVar2, this.c, 2);
                Handler handler2 = jVar2.n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.b;
                m mVar = this.c;
                if (jVar3.V && !jVar3.b0 && jVar3.x == mVar) {
                    jVar3.k();
                    jVar3.j.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    u0 u0Var = (u0) jVar3.k.b;
                    u0Var.i.post(new j0(u0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.b;
                m mVar2 = this.c;
                if (!jVar4.V || jVar4.b0 || jVar4.x != mVar2 || jVar4.A == null || (tVar = jVar4.w) == null) {
                    return;
                }
                try {
                    long j10 = mVar2.A;
                    if (j10 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    tVar.p = j10;
                    tVar.Q = -1L;
                    tVar.R = 0L;
                    tVar.S = -1L;
                    tVar.q = Long.MAX_VALUE;
                    tVar.s0 = true;
                    jVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.z(jVar4.E0));
                    return;
                } catch (RuntimeException e) {
                    jVar4.k();
                    jVar4.N(e);
                    return;
                }
        }
    }
}
