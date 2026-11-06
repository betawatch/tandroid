package wi;

import android.os.Handler;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(j jVar, int i7) {
        this.a = i7;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        boolean z9;
        switch (this.a) {
            case 0:
                this.b.u();
                return;
            case 1:
                this.b.d0();
                return;
            case 2:
                j jVar = this.b;
                Handler handler = jVar.n;
                if (handler != null) {
                    handler.post(new a(jVar, 3));
                    return;
                }
                return;
            case 3:
                j jVar2 = this.b;
                if (!jVar2.V || jVar2.A == null || (mVar = jVar2.x) == null) {
                    return;
                }
                synchronized (mVar) {
                    z9 = mVar.E;
                }
                if (z9) {
                    return;
                }
                try {
                    m mVar2 = jVar2.x;
                    jVar2.y = mVar2;
                    Handler handler2 = jVar2.n;
                    if (handler2 != null) {
                        handler2.removeCallbacks(jVar2.n1);
                        handler2.postDelayed(jVar2.n1, 3000L);
                    }
                    mVar2.t(new d(jVar2, mVar2, 0), new d(jVar2, mVar2, 1));
                    jVar2.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.z(jVar2.F0));
                    return;
                } catch (RuntimeException e10) {
                    jVar2.k();
                    jVar2.N(e10);
                    return;
                }
            case 4:
                j jVar3 = this.b;
                m mVar3 = jVar3.y;
                if (!jVar3.V || jVar3.b0 || mVar3 == null || jVar3.x != mVar3) {
                    return;
                }
                jVar3.y = null;
                jVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 5:
                this.b.g();
                return;
            case 6:
                j jVar4 = this.b;
                jVar4.V = false;
                jVar4.k();
                m mVar4 = jVar4.x;
                if (mVar4 != null) {
                    long p10 = mVar4.p();
                    t tVar = jVar4.w;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, p10) * 1000;
                        Handler handler3 = tVar.u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(tVar.x0);
                        }
                    }
                }
                jVar4.p();
                m mVar5 = jVar4.x;
                if (mVar5 != null) {
                    mVar5.u();
                    jVar4.x = null;
                }
                jVar4.b0 = false;
                t0 t0Var = (t0) jVar4.k.b;
                t0Var.i.post(new i0(t0Var, 3));
                return;
            case 7:
                this.b.I();
                return;
            default:
                this.b.d0();
                return;
        }
    }
}
