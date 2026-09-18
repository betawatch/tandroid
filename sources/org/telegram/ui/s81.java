package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f91 b;

    public /* synthetic */ s81(f91 f91Var, int i10) {
        this.a = i10;
        this.b = f91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f91 f91Var = this.b;
                nf.f.s(f91Var.getParentActivity(), f91Var.getMessagesController().premiumManageSubscriptionUrl);
                f91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                f91 f91Var2 = this.b;
                f91Var2.getClass();
                f91Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                f91 f91Var3 = this.b;
                f91Var3.getClass();
                f91Var3.presentFragment(new gh1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                f91.W(this.b);
                break;
            default:
                f91.Z(this.b);
                break;
        }
    }
}
