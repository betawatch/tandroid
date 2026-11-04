package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ xr(is isVar, int i3) {
        this.a = i3;
        this.b = isVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                is isVar = this.b;
                isVar.K = false;
                isVar.z.invalidate();
                isVar.m();
                break;
            case 1:
                is isVar2 = this.b;
                Activity activity = isVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                isVar2.K = false;
                isVar2.z.invalidate();
                isVar2.m();
                break;
            case 2:
                is isVar3 = this.b;
                gs gsVar = isVar3.l;
                if (gsVar != null) {
                    gsVar.J();
                }
                isVar3.o();
                break;
            default:
                is isVar4 = this.b;
                gs gsVar2 = isVar4.l;
                if (gsVar2 != null) {
                    gsVar2.r();
                }
                isVar4.o();
                break;
        }
    }
}
