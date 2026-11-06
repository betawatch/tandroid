package q2;

import android.os.Handler;
import h2.m0;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new m5(this, 20));
    }
}
