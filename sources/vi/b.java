package vi;

import android.os.Handler;
import j$.util.Objects;
import li.e3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(j jVar, l0 l0Var, long j10, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = l0Var;
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
                l0 l0Var = this.c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == l0Var) {
                    jVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    s0 s0Var = (s0) jVar2.k.b;
                    Handler handler = s0Var.i;
                    e3 e3Var = s0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                    break;
                }
                break;
        }
    }
}
