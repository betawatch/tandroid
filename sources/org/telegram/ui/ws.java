package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht b;

    public /* synthetic */ ws(ht htVar, int i10) {
        this.a = i10;
        this.b = htVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ht htVar = this.b;
                htVar.K = false;
                htVar.z.invalidate();
                htVar.l();
                break;
            case 1:
                ht htVar2 = this.b;
                Activity activity = htVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(5)));
                }
                htVar2.K = false;
                htVar2.z.invalidate();
                htVar2.l();
                break;
            case 2:
                ht htVar3 = this.b;
                ft ftVar = htVar3.l;
                if (ftVar != null) {
                    ftVar.J();
                }
                htVar3.n();
                break;
            default:
                ht htVar4 = this.b;
                ft ftVar2 = htVar4.l;
                if (ftVar2 != null) {
                    ftVar2.r();
                }
                htVar4.n();
                break;
        }
    }
}
