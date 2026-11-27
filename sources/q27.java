// default package

import android.widget.PopupWindow;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
