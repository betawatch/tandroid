// default package

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zt5 extends n8 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ fu5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt5(fu5 fu5Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = fu5Var;
        this.o = viewGroup;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        fu5 fu5Var = this.p;
        fu5Var.v(viewGroup);
        Runnable runnable = fu5Var.p;
        if (runnable != null) {
            runnable.run();
            fu5Var.p = null;
        }
    }
}
