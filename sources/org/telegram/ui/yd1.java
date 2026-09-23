package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yd1 implements View.OnClickListener {
    public final /* synthetic */ ai0 a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ org.telegram.ui.Components.ml0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.o70 e;
    public final /* synthetic */ org.telegram.ui.Components.o70 f;
    public final /* synthetic */ de1 h;

    public yd1(de1 de1Var, ai0 ai0Var, xn xnVar, org.telegram.ui.Components.ml0 ml0Var, LinearLayout linearLayout, org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.h = de1Var;
        this.a = ai0Var;
        this.b = xnVar;
        this.c = ml0Var;
        this.d = linearLayout;
        this.e = o70Var;
        this.f = o70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ai0 ai0Var = this.a;
        ArrayList arrayList = ai0Var.b;
        ArrayList arrayList2 = ai0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        de1 de1Var = this.h;
        xn xnVar = this.b;
        if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else if (tLObject instanceof TLRPC.Chat) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            }
            xnVar.presentFragment(new ProfileActivity(bundle, null));
            de1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && xnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(de1Var.getContext()), de1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            xnVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.ml0 ml0Var = this.c;
        ml0Var.requestLayout();
        this.d.requestLayout();
        ml0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
