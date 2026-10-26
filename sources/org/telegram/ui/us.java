package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft b;

    public /* synthetic */ us(ft ftVar, int i10) {
        this.a = i10;
        this.b = ftVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ft ftVar = this.b;
                ftVar.K = false;
                ftVar.z.invalidate();
                ftVar.l();
                break;
            case 1:
                ft ftVar2 = this.b;
                Activity activity = ftVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(5)));
                }
                ftVar2.K = false;
                ftVar2.z.invalidate();
                ftVar2.l();
                break;
            case 2:
                ft ftVar3 = this.b;
                dt dtVar = ftVar3.l;
                if (dtVar != null) {
                    dtVar.J();
                }
                ftVar3.n();
                break;
            default:
                ft ftVar4 = this.b;
                dt dtVar2 = ftVar4.l;
                if (dtVar2 != null) {
                    dtVar2.r();
                }
                ftVar4.n();
                break;
        }
    }
}
