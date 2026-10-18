package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new a2(fVar, 27));
                    break;
                }
                break;
        }
    }
}
