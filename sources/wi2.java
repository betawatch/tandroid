// default package

import android.app.Activity;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wi2 extends LinearLayout {
    public final /* synthetic */ zi2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi2(zi2 zi2Var, Activity activity) {
        super(activity);
        this.a = zi2Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.E0();
    }
}
