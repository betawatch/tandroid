package p2;

import android.os.Handler;
import g2.n0;
import org.telegram.ui.ActionBar.d4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // p2.l
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        n0.W(handler, new d4(this, 25));
    }
}
