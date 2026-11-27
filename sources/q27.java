// default package

import android.widget.PopupWindow;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
