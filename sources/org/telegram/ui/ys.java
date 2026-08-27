package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ktVar.n();
                break;
            case 1:
                kt ktVar2 = this.b;
                Activity activity = ktVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ktVar2.K = false;
                ktVar2.z.invalidate();
                ktVar2.n();
                break;
            case 2:
                kt ktVar3 = this.b;
                ht htVar = ktVar3.l;
                if (htVar != null) {
                    htVar.J();
                }
                ktVar3.p();
                break;
            default:
                kt ktVar4 = this.b;
                ht htVar2 = ktVar4.l;
                if (htVar2 != null) {
                    htVar2.q();
                }
                ktVar4.p();
                break;
        }
    }
}
