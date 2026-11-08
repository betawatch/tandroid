package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class sh implements View.OnClickListener {
    public final /* synthetic */ jf0 a;
    public final /* synthetic */ org.telegram.ui.Components.pj0 b;
    public final /* synthetic */ LinearLayout c;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ an f;

    public sh(an anVar, jf0 jf0Var, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = anVar;
        this.a = jf0Var;
        this.b = pj0Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jf0 jf0Var = this.a;
        ArrayList arrayList = jf0Var.b;
        ArrayList arrayList2 = jf0Var.c;
        an anVar = this.f;
        if (anVar.e9 == null || arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
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
            anVar.O7(true);
            return;
        }
        if (org.telegram.messenger.iz.c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.xa).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748489, null)), null);
            anVar.B1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.iz.S(org.telegram.messenger.iz.c1 - 1);
        }
        org.telegram.ui.Components.pj0 pj0Var = this.b;
        pj0Var.requestLayout();
        this.c.requestLayout();
        pj0Var.getAdapter().f();
        this.d.getSwipeBack().e(this.e[0]);
    }
}
