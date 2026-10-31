package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lt b;

    public /* synthetic */ zs(lt ltVar, int i10) {
        this.a = i10;
        this.b = ltVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lt ltVar = this.b;
                ltVar.K = false;
                ltVar.z.invalidate();
                ltVar.m();
                break;
            case 1:
                lt ltVar2 = this.b;
                Activity activity = ltVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(5)));
                }
                ltVar2.K = false;
                ltVar2.z.invalidate();
                ltVar2.m();
                break;
            case 2:
                lt ltVar3 = this.b;
                jt jtVar = ltVar3.l;
                if (jtVar != null) {
                    jtVar.J();
                }
                ltVar3.o();
                break;
            default:
                lt ltVar4 = this.b;
                jt jtVar2 = ltVar4.l;
                if (jtVar2 != null) {
                    jtVar2.q();
                }
                ltVar4.o();
                break;
        }
    }
}
