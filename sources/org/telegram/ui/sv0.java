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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sv0 implements View.OnClickListener {
    public final /* synthetic */ yh0 a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ org.telegram.ui.Components.rl0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.p70 e;
    public final /* synthetic */ org.telegram.ui.Components.p70 f;
    public final /* synthetic */ yv0 h;

    public sv0(yv0 yv0Var, yh0 yh0Var, zn znVar, org.telegram.ui.Components.rl0 rl0Var, LinearLayout linearLayout, org.telegram.ui.Components.p70 p70Var, org.telegram.ui.Components.p70 p70Var2) {
        this.h = yv0Var;
        this.a = yh0Var;
        this.b = znVar;
        this.c = rl0Var;
        this.d = linearLayout;
        this.e = p70Var;
        this.f = p70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yh0 yh0Var = this.a;
        ArrayList arrayList = yh0Var.b;
        ArrayList arrayList2 = yh0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        yv0 yv0Var = this.h;
        zn znVar = this.b;
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
            znVar.presentFragment(new ProfileActivity(bundle, null));
            yv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && znVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(yv0Var.getContext()), yv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            znVar.k1 = t6;
            t6.j = 4000;
            t6.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.rl0 rl0Var = this.c;
        rl0Var.requestLayout();
        this.d.requestLayout();
        rl0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
