package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;

    public /* synthetic */ xo0(wp0 wp0Var, int i10) {
        this.a = i10;
        this.b = wp0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wp0 wp0Var = this.b;
        wp0Var.b0 = defaultWindowInsets;
        hp0 hp0Var = wp0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = hp0Var.getPaddingTop();
        i0.b bVar = wp0Var.b0;
        hp0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        hp0 hp0Var2 = wp0Var.n.b;
        int i11 = wp0Var.b0.a;
        int paddingTop2 = hp0Var2.getPaddingTop();
        i0.b bVar2 = wp0Var.b0;
        hp0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = wp0Var.P;
        i0.b bVar3 = wp0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
