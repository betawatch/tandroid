package ph;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ i3 c;

    public h3(i3 i3Var, boolean z4, View view) {
        this.c = i3Var;
        this.a = z4;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z4 = this.a;
        i3 i3Var = this.c;
        if (z4) {
            i3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i3Var.j);
        view2.addOnLayoutChangeListener(i3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i3 i3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(i3Var.j);
        view2.removeOnLayoutChangeListener(i3Var.i);
    }
}
