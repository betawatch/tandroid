package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vr0 implements View.OnClickListener {
    public final /* synthetic */ mf0 a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.ui.Components.ek0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.a70 e;
    public final /* synthetic */ org.telegram.ui.Components.a70 f;
    public final /* synthetic */ as0 h;

    public vr0(as0 as0Var, mf0 mf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.a70 a70Var, org.telegram.ui.Components.a70 a70Var2) {
        this.h = as0Var;
        this.a = mf0Var;
        this.b = bnVar;
        this.c = ek0Var;
        this.d = linearLayout;
        this.e = a70Var;
        this.f = a70Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mf0 mf0Var = this.a;
        ArrayList arrayList = mf0Var.b;
        ArrayList arrayList2 = mf0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        as0 as0Var = this.h;
        bn bnVar = this.b;
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
            bnVar.presentFragment(new ProfileActivity(bundle, null));
            as0Var.c(false);
            return;
        }
        if (org.telegram.messenger.cz.c1 > 0 && bnVar.m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(as0Var.getContext()), as0Var.b).t(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748295, null)), null);
            bnVar.C1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.cz.S(org.telegram.messenger.cz.c1 - 1);
        }
        org.telegram.ui.Components.ek0 ek0Var = this.c;
        ek0Var.requestLayout();
        this.d.requestLayout();
        ek0Var.getAdapter().f();
        this.e.L(this.f);
    }
}
