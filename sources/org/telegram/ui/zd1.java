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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zd1 implements View.OnClickListener {
    public final /* synthetic */ di0 a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ org.telegram.ui.Components.zl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.b80 e;
    public final /* synthetic */ org.telegram.ui.Components.b80 f;
    public final /* synthetic */ ee1 h;

    public zd1(ee1 ee1Var, di0 di0Var, yn ynVar, org.telegram.ui.Components.zl0 zl0Var, LinearLayout linearLayout, org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.h = ee1Var;
        this.a = di0Var;
        this.b = ynVar;
        this.c = zl0Var;
        this.d = linearLayout;
        this.e = b80Var;
        this.f = b80Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        di0 di0Var = this.a;
        ArrayList arrayList = di0Var.b;
        ArrayList arrayList2 = di0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        ee1 ee1Var = this.h;
        yn ynVar = this.b;
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
            ynVar.presentFragment(new ProfileActivity(bundle, null));
            ee1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && ynVar.V0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.rc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ee1Var.getContext()), ee1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            ynVar.l1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.zl0 zl0Var = this.c;
        zl0Var.requestLayout();
        this.d.requestLayout();
        zl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
