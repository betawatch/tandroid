package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks b;

    public /* synthetic */ zr(ks ksVar, int i7) {
        this.a = i7;
        this.b = ksVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ks ksVar = this.b;
                ksVar.K = false;
                ksVar.z.invalidate();
                ksVar.m();
                break;
            case 1:
                ks ksVar2 = this.b;
                Activity activity = ksVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                ksVar2.K = false;
                ksVar2.z.invalidate();
                ksVar2.m();
                break;
            case 2:
                ks ksVar3 = this.b;
                is isVar = ksVar3.l;
                if (isVar != null) {
                    isVar.K();
                }
                ksVar3.o();
                break;
            default:
                ks ksVar4 = this.b;
                is isVar2 = ksVar4.l;
                if (isVar2 != null) {
                    isVar2.r();
                }
                ksVar4.o();
                break;
        }
    }
}
