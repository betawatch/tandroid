package th;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k3 extends im0 {
    public o0 f;
    public final /* synthetic */ y3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(y3 y3Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = y3Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final void a(String str) {
        o0 o0Var = this.f;
        if (o0Var != null) {
            org.telegram.messenger.i0.r(o0Var);
        }
        this.f = new o0(5, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            org.telegram.messenger.i0.h3(this.f, 300L);
        }
        if (this.f != null) {
            y3 y3Var = this.h;
            if (y3Var.Q) {
                return;
            }
            y3Var.Q = true;
            y3Var.x.E();
            y3Var.y.h1(0, -y3Var.r.getPaddingTop());
        }
    }
}
