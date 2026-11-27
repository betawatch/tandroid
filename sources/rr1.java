// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
