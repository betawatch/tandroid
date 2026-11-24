// default package

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ot9 extends xj3 {
    public final /* synthetic */ cj3 g0;
    public final /* synthetic */ hi3 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot9(hi3 hi3Var, o39 o39Var, Activity activity, int i, int i2, cj3 cj3Var) {
        super(o39Var, activity, i, i2);
        this.h0 = hi3Var;
        this.g0 = cj3Var;
    }

    @Override // l5c
    public final void O(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z);
        gt9 gt9Var = this.h0.j0;
        gt9Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z);
        if (!TextUtils.isEmpty(this.e0)) {
            gt9Var.d.setText(k96.M0(2131747975, null));
            gt9Var.e.setVisibility(8);
        } else {
            gt9Var.d.setText(k96.M0(2131748039, null));
            gt9Var.e.setVisibility(0);
            gt9Var.e.setText(k96.M0(2131748040, null));
        }
    }
}
