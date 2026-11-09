package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wr0 implements View.OnClickListener {
    public final /* synthetic */ lf0 a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.ui.Components.qj0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.l60 e;
    public final /* synthetic */ org.telegram.ui.Components.l60 f;
    public final /* synthetic */ bs0 h;

    public wr0(bs0 bs0Var, lf0 lf0Var, cn cnVar, org.telegram.ui.Components.qj0 qj0Var, LinearLayout linearLayout, org.telegram.ui.Components.l60 l60Var, org.telegram.ui.Components.l60 l60Var2) {
        this.h = bs0Var;
        this.a = lf0Var;
        this.b = cnVar;
        this.c = qj0Var;
        this.d = linearLayout;
        this.e = l60Var;
        this.f = l60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lf0 lf0Var = this.a;
        ArrayList arrayList = lf0Var.b;
        ArrayList arrayList2 = lf0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        bs0 bs0Var = this.h;
        cn cnVar = this.b;
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
            cnVar.presentFragment(new ProfileActivity(bundle, null));
            bs0Var.c(false);
            return;
        }
        if (org.telegram.messenger.iz.c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(bs0Var.getContext()), bs0Var.b).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
            cnVar.B1 = t6;
            t6.j = 4000;
            t6.j();
            org.telegram.messenger.iz.S(org.telegram.messenger.iz.c1 - 1);
        }
        org.telegram.ui.Components.qj0 qj0Var = this.c;
        qj0Var.requestLayout();
        this.d.requestLayout();
        qj0Var.getAdapter().f();
        this.e.K(this.f);
    }
}
