package q2;

import android.os.Handler;
import h2.l0;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
