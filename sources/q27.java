// default package

import android.widget.PopupWindow;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class q27 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ s27 a;

    public q27(s27 s27Var) {
        this.a = s27Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
