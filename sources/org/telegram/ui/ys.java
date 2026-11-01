package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt b;

    public /* synthetic */ ys(kt ktVar, int i10) {
        this.a = i10;
        this.b = ktVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kt ktVar = this.b;
                ktVar.K = false;
                ktVar.z.invalidate();
                ktVar.m();
                break;
            case 1:
                kt ktVar2 = this.b;
                Activity activity = ktVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                ktVar2.K = false;
                ktVar2.z.invalidate();
                ktVar2.m();
                break;
            case 2:
                kt ktVar3 = this.b;
                ht htVar = ktVar3.l;
                if (htVar != null) {
                    htVar.J();
                }
                ktVar3.o();
                break;
            default:
                kt ktVar4 = this.b;
                ht htVar2 = ktVar4.l;
                if (htVar2 != null) {
                    htVar2.q();
                }
                ktVar4.o();
                break;
        }
    }
}
