package xh;

import android.view.View;
import org.telegram.ui.Components.m5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class t0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ m5 a;

    public t0(m5 m5Var) {
        this.a = m5Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b();
    }
}
