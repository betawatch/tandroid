package xh;

import android.view.View;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class u0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ o5 a;

    public u0(o5 o5Var) {
        this.a = o5Var;
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
