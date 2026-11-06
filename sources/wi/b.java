package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(j jVar, m0 m0Var, long j3, int i7) {
        this.a = i7;
        this.b = jVar;
        this.c = m0Var;
        this.d = j3;
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
                long j3 = this.d;
                if (jVar2.V && jVar2.G == m0Var) {
                    jVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j3));
                    t0 t0Var = (t0) jVar2.k.b;
                    Handler handler = t0Var.i;
                    qt qtVar = t0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.p(qtVar, 3));
                    break;
                }
                break;
        }
    }
}
