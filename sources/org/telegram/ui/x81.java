package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ x81(i91 i91Var, int i10) {
        this.a = i10;
        this.b = i91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i91 i91Var = this.b;
                of.f.s(i91Var.getParentActivity(), i91Var.getMessagesController().premiumManageSubscriptionUrl);
                i91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                i91 i91Var2 = this.b;
                i91Var2.getClass();
                i91Var2.presentFragment(new h(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                i91 i91Var3 = this.b;
                i91Var3.getClass();
                i91Var3.presentFragment(new hh1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                i91.W(this.b);
                break;
            default:
                i91.Z(this.b);
                break;
        }
    }
}
