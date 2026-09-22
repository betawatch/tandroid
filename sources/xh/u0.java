package xh;

import android.view.View;
import org.telegram.ui.Components.n5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class u0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ n5 a;

    public u0(n5 n5Var) {
        this.a = n5Var;
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
