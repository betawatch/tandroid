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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yc1 implements View.OnClickListener {
    public final /* synthetic */ ph0 a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ org.telegram.ui.Components.wk0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.x60 e;
    public final /* synthetic */ org.telegram.ui.Components.x60 f;
    public final /* synthetic */ dd1 h;

    public yc1(dd1 dd1Var, ph0 ph0Var, qn qnVar, org.telegram.ui.Components.wk0 wk0Var, LinearLayout linearLayout, org.telegram.ui.Components.x60 x60Var, org.telegram.ui.Components.x60 x60Var2) {
        this.h = dd1Var;
        this.a = ph0Var;
        this.b = qnVar;
        this.c = wk0Var;
        this.d = linearLayout;
        this.e = x60Var;
        this.f = x60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ph0 ph0Var = this.a;
        ArrayList arrayList = ph0Var.b;
        ArrayList arrayList2 = ph0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        dd1 dd1Var = this.h;
        qn qnVar = this.b;
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
            qnVar.presentFragment(new ProfileActivity(bundle, null));
            dd1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && qnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.gc t10 = new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(dd1Var.getContext()), dd1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            qnVar.j1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.c;
        wk0Var.requestLayout();
        this.d.requestLayout();
        wk0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
