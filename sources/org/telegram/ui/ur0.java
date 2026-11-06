package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ur0 implements View.OnClickListener {
    public final /* synthetic */ jf0 a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.Components.pj0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.k60 e;
    public final /* synthetic */ org.telegram.ui.Components.k60 f;
    public final /* synthetic */ zr0 h;

    public ur0(zr0 zr0Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = zr0Var;
        this.a = jf0Var;
        this.b = anVar;
        this.c = pj0Var;
        this.d = linearLayout;
        this.e = k60Var;
        this.f = k60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jf0 jf0Var = this.a;
        ArrayList arrayList = jf0Var.b;
        ArrayList arrayList2 = jf0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        zr0 zr0Var = this.h;
        an anVar = this.b;
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
            anVar.presentFragment(new ProfileActivity(bundle, null));
            zr0Var.c(false);
            return;
        }
        if (org.telegram.messenger.iz.c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(zr0Var.getContext()), zr0Var.b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748487, null)), null);
            anVar.B1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.iz.S(org.telegram.messenger.iz.c1 - 1);
        }
        org.telegram.ui.Components.pj0 pj0Var = this.c;
        pj0Var.requestLayout();
        this.d.requestLayout();
        pj0Var.getAdapter().f();
        this.e.K(this.f);
    }
}
