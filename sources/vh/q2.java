package vh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ r2 c;

    public q2(r2 r2Var, boolean z10, View view) {
        this.c = r2Var;
        this.a = z10;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.a;
        r2 r2Var = this.c;
        if (z10) {
            r2Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r2Var.j);
        view2.addOnLayoutChangeListener(r2Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        r2 r2Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(r2Var.j);
        view2.removeOnLayoutChangeListener(r2Var.i);
    }
}
