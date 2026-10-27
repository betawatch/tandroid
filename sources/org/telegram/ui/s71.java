package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f81 b;

    public /* synthetic */ s71(f81 f81Var, int i10) {
        this.a = i10;
        this.b = f81Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f81 f81Var = this.b;
                qf.d.r(f81Var.getParentActivity(), f81Var.getMessagesController().premiumManageSubscriptionUrl);
                f81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                f81 f81Var2 = this.b;
                f81Var2.getClass();
                f81Var2.presentFragment(new g(3));
                break;
            case 2:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                f81 f81Var3 = this.b;
                f81Var3.getClass();
                f81Var3.presentFragment(new fg1(8, null));
                break;
            case 4:
                this.b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                f81.W(this.b);
                break;
            default:
                f81.Z(this.b);
                break;
        }
    }
}
