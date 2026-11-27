// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tf2 extends by4 {
    public final /* synthetic */ bg2 m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf2(bg2 bg2Var, Activity activity, bg2 bg2Var2) {
        super(activity, bg2Var2);
        this.m1 = bg2Var;
    }

    @Override // by4
    public final void F0() {
        bg2 bg2Var = this.m1;
        bg2Var.getMessagesController().Q(bg2Var.getParentActivity(), bg2Var.n, bg2Var, new rd1(this, (byte) 27));
    }
}
