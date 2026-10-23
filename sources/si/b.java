package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(j jVar, m0 m0Var, long j10, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = m0Var;
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
                m0 m0Var = this.c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == m0Var) {
                    jVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    u0 u0Var = (u0) jVar2.k.b;
                    Handler handler = u0Var.i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new a2(fVar, 27));
                    break;
                }
                break;
        }
    }
}
