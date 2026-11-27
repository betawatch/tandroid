// default package

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class qx5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ rx5 c;

    public qx5(rx5 rx5Var, boolean z, View view) {
        this.c = rx5Var;
        this.a = z;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z = this.a;
        rx5 rx5Var = this.c;
        if (z) {
            rx5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(rx5Var.j);
        view2.addOnLayoutChangeListener(rx5Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        rx5 rx5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(rx5Var.j);
        view2.removeOnLayoutChangeListener(rx5Var.i);
    }
}
