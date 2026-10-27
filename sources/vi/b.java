package vi;

import android.os.Handler;
import j$.util.Objects;
import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(j jVar, n0 n0Var, long j10, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = n0Var;
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
                n0 n0Var = this.c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == n0Var) {
                    jVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    u0 u0Var = (u0) jVar2.k.b;
                    Handler handler = u0Var.i;
                    e3 e3Var = u0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                    break;
                }
                break;
        }
    }
}
