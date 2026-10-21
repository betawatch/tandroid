package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ et b;

    public /* synthetic */ ts(et etVar, int i10) {
        this.a = i10;
        this.b = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                et etVar = this.b;
                etVar.K = false;
                etVar.z.invalidate();
                etVar.n();
                break;
            case 1:
                et etVar2 = this.b;
                Activity activity = etVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                etVar2.K = false;
                etVar2.z.invalidate();
                etVar2.n();
                break;
            case 2:
                et etVar3 = this.b;
                ct ctVar = etVar3.l;
                if (ctVar != null) {
                    ctVar.K();
                }
                etVar3.p();
                break;
            default:
                et etVar4 = this.b;
                ct ctVar2 = etVar4.l;
                if (ctVar2 != null) {
                    ctVar2.q();
                }
                etVar4.p();
                break;
        }
    }
}
