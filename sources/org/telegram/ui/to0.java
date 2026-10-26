package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ to0(rp0 rp0Var, int i10) {
        this.a = i10;
        this.b = rp0Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        rp0 rp0Var = this.b;
        rp0Var.b0 = defaultWindowInsets;
        cp0 cp0Var = rp0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = cp0Var.getPaddingTop();
        i0.b bVar = rp0Var.b0;
        cp0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        cp0 cp0Var2 = rp0Var.n.b;
        int i11 = rp0Var.b0.a;
        int paddingTop2 = cp0Var2.getPaddingTop();
        i0.b bVar2 = rp0Var.b0;
        cp0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = rp0Var.P;
        i0.b bVar3 = rp0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.z0();
                break;
        }
    }
}
