// default package

import android.app.Activity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
