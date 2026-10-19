package yh;

import android.view.View;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class s0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ p5 a;

    public s0(p5 p5Var) {
        this.a = p5Var;
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
