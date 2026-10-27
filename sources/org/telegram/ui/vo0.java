package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ vo0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        tp0 tp0Var = this.b;
        tp0Var.b0 = defaultWindowInsets;
        ep0 ep0Var = tp0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = ep0Var.getPaddingTop();
        i0.b bVar = tp0Var.b0;
        ep0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        ep0 ep0Var2 = tp0Var.n.b;
        int i11 = tp0Var.b0.a;
        int paddingTop2 = ep0Var2.getPaddingTop();
        i0.b bVar2 = tp0Var.b0;
        ep0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = tp0Var.P;
        i0.b bVar3 = tp0Var.b0;
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
