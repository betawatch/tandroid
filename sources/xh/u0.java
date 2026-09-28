package xh;

import android.view.View;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
