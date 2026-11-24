// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x82 extends m8 {
    public final /* synthetic */ z82 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(z82 z82Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = z82Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        yv1 yv1Var = this.o.H;
        if (yv1Var != null) {
            yv1Var.y6(false, true, 0.0f);
        }
    }
}
