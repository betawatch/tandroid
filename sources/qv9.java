// default package

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qv9 extends il3 {
    public final /* synthetic */ nk3 g0;
    public final /* synthetic */ sj3 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv9(sj3 sj3Var, r59 r59Var, Activity activity, int i, int i2, nk3 nk3Var) {
        super(r59Var, activity, i, i2);
        this.h0 = sj3Var;
        this.g0 = nk3Var;
    }

    @Override // l7c
    public final void O(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z);
        iv9 iv9Var = this.h0.j0;
        iv9Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z);
        if (!TextUtils.isEmpty(this.e0)) {
            iv9Var.d.setText(jb6.M0(2131747901, null));
            iv9Var.e.setVisibility(8);
        } else {
            iv9Var.d.setText(jb6.M0(2131747965, null));
            iv9Var.e.setVisibility(0);
            iv9Var.e.setText(jb6.M0(2131747966, null));
        }
    }
}
