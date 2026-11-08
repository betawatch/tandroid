package q2;

import android.os.Handler;
import h2.m0;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
