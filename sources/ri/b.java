package ri;

import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(j jVar, k0 k0Var, long j10, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = k0Var;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.c.post(new b(jVar, this.c, this.d, 1));
                break;
            default:
                j jVar2 = this.b;
                k0 k0Var = this.c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == k0Var) {
                    jVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    r0 r0Var = (r0) jVar2.k.b;
                    Handler handler = r0Var.i;
                    m.h hVar = r0Var.d;
                    Objects.requireNonNull(hVar);
                    handler.post(new h0(hVar, 0));
                    break;
                }
                break;
        }
    }
}
