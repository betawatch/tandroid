package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ y81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k91 k91Var = this.b;
                nf.f.s(k91Var.getParentActivity(), k91Var.getMessagesController().premiumManageSubscriptionUrl);
                k91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                k91 k91Var2 = this.b;
                k91Var2.getClass();
                k91Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                k91 k91Var3 = this.b;
                k91Var3.getClass();
                k91Var3.presentFragment(new mh1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                k91.W(this.b);
                break;
            default:
                k91.Z(this.b);
                break;
        }
    }
}
