package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
