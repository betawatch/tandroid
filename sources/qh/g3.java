package qh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ h3 c;

    public g3(h3 h3Var, boolean z4, View view) {
        this.c = h3Var;
        this.a = z4;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z4 = this.a;
        h3 h3Var = this.c;
        if (z4) {
            h3Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h3Var.j);
        view2.addOnLayoutChangeListener(h3Var.i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h3 h3Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(h3Var.j);
        view2.removeOnLayoutChangeListener(h3Var.i);
    }
}
