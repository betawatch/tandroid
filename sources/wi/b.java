package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(j jVar, m0 m0Var, long j10, int i3) {
        this.a = i3;
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
                    t0 t0Var = (t0) jVar2.k.b;
                    Handler handler = t0Var.i;
                    y00 y00Var = t0Var.d;
                    Objects.requireNonNull(y00Var);
                    handler.post(new r4.u(y00Var, 29));
                    break;
                }
                break;
        }
    }
}
