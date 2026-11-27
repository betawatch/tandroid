// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rr1 extends fv1 {
    public final /* synthetic */ zu1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr1(zu1 zu1Var, Context context, vnb vnbVar, kq1 kq1Var, ll0 ll0Var) {
        super(context, vnbVar, kq1Var, ll0Var);
        this.N = zu1Var;
    }

    @Override // fv1, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.N.xd.s(3, i == 0, getMeasuredWidth() > 0);
    }
}
