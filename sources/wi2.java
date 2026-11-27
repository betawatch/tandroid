// default package

import android.app.Activity;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
