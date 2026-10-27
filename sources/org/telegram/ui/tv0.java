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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tv0 implements View.OnClickListener {
    public final /* synthetic */ th0 a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ org.telegram.ui.Components.nm0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.l80 e;
    public final /* synthetic */ org.telegram.ui.Components.l80 f;
    public final /* synthetic */ zv0 h;

    public tv0(zv0 zv0Var, th0 th0Var, wn wnVar, org.telegram.ui.Components.nm0 nm0Var, LinearLayout linearLayout, org.telegram.ui.Components.l80 l80Var, org.telegram.ui.Components.l80 l80Var2) {
        this.h = zv0Var;
        this.a = th0Var;
        this.b = wnVar;
        this.c = nm0Var;
        this.d = linearLayout;
        this.e = l80Var;
        this.f = l80Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        th0 th0Var = this.a;
        ArrayList arrayList = th0Var.b;
        ArrayList arrayList2 = th0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        zv0 zv0Var = this.h;
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
            zv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && wnVar.j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(zv0Var.getContext()), zv0Var.b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            wnVar.z1 = t10;
            t10.j = 4000;
            t10.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.nm0 nm0Var = this.c;
        nm0Var.requestLayout();
        this.d.requestLayout();
        nm0Var.getAdapter().l();
        this.e.K(this.f);
    }
}
