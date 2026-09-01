package qh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
