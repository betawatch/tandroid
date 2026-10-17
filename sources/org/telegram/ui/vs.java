package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt b;

    public /* synthetic */ vs(gt gtVar, int i10) {
        this.a = i10;
        this.b = gtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gt gtVar = this.b;
                gtVar.K = false;
                gtVar.z.invalidate();
                gtVar.n();
                break;
            case 1:
                gt gtVar2 = this.b;
                Activity activity = gtVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                gtVar2.K = false;
                gtVar2.z.invalidate();
                gtVar2.n();
                break;
            case 2:
                gt gtVar3 = this.b;
                et etVar = gtVar3.l;
                if (etVar != null) {
                    etVar.K();
                }
                gtVar3.p();
                break;
            default:
                gt gtVar4 = this.b;
                et etVar2 = gtVar4.l;
                if (etVar2 != null) {
                    etVar2.q();
                }
                gtVar4.p();
                break;
        }
    }
}
