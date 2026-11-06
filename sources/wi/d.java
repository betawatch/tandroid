package wi;

import android.os.Handler;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ m c;

    public /* synthetic */ d(j jVar, m mVar, int i7) {
        this.a = i7;
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
                    if (jVar3.i0 == 0) {
                        jVar3.i0 = mVar.e;
                    }
                    jVar3.j.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.F0));
                    t0 t0Var = (t0) jVar3.k.b;
                    t0Var.i.post(new i0(t0Var, 2));
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
                    long j3 = mVar2.F;
                    if (j3 <= 0) {
                        throw new IllegalArgumentException("Invalid recording time origin");
                    }
                    tVar.p = j3;
                    tVar.Q = -1L;
                    tVar.R = 0L;
                    tVar.S = -1L;
                    tVar.q = Long.MAX_VALUE;
                    tVar.s0 = true;
                    jVar4.j.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.z(jVar4.F0));
                    return;
                } catch (RuntimeException e10) {
                    jVar4.k();
                    jVar4.N(e10);
                    return;
                }
        }
    }
}
