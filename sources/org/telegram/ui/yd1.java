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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class yd1 implements View.OnClickListener {
    public final /* synthetic */ zh0 a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ org.telegram.ui.Components.wl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.y70 e;
    public final /* synthetic */ org.telegram.ui.Components.y70 f;
    public final /* synthetic */ de1 h;

    public yd1(de1 de1Var, zh0 zh0Var, wn wnVar, org.telegram.ui.Components.wl0 wl0Var, LinearLayout linearLayout, org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.h = de1Var;
        this.a = zh0Var;
        this.b = wnVar;
        this.c = wl0Var;
        this.d = linearLayout;
        this.e = y70Var;
        this.f = y70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zh0 zh0Var = this.a;
        ArrayList arrayList = zh0Var.b;
        ArrayList arrayList2 = zh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        de1 de1Var = this.h;
        wn wnVar = this.b;
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
            wnVar.presentFragment(new ProfileActivity(bundle, null));
            de1Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && wnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(de1Var.getContext()), de1Var.a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            wnVar.n1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.c;
        wl0Var.requestLayout();
        this.d.requestLayout();
        wl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
