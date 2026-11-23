package q2;

import android.os.Handler;
import h2.l0;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class d implements l {
    public final j a;
    public g b;
    public boolean c;
    public final /* synthetic */ e d;

    public d(e eVar, j jVar) {
        this.d = eVar;
        this.a = jVar;
    }

    @Override // q2.l
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        l0.W(handler, new z0(this, 3));
    }
}
