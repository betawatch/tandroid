package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g91 b;

    public /* synthetic */ u81(g91 g91Var, int i10) {
        this.a = i10;
        this.b = g91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g91 g91Var = this.b;
                nf.f.s(g91Var.getParentActivity(), g91Var.getMessagesController().premiumManageSubscriptionUrl);
                g91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                g91 g91Var2 = this.b;
                g91Var2.getClass();
                g91Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                g91 g91Var3 = this.b;
                g91Var3.getClass();
                g91Var3.presentFragment(new ih1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                g91.W(this.b);
                break;
            default:
                g91.Z(this.b);
                break;
        }
    }
}
