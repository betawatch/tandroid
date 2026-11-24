// default package

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wt5 extends m8 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ bu5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt5(bu5 bu5Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = bu5Var;
        this.o = viewGroup;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        bu5 bu5Var = this.p;
        bu5Var.v(viewGroup);
        Runnable runnable = bu5Var.p;
        if (runnable != null) {
            runnable.run();
            bu5Var.p = null;
        }
    }
}
