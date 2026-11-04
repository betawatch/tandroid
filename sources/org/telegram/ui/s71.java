package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s71 implements View.OnClickListener {
    public final /* synthetic */ df0 a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ org.telegram.ui.Components.tj0 c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ org.telegram.ui.Components.f60 e;
    public final /* synthetic */ org.telegram.ui.Components.f60 f;
    public final /* synthetic */ w71 h;

    public s71(w71 w71Var, df0 df0Var, wm wmVar, org.telegram.ui.Components.tj0 tj0Var, LinearLayout linearLayout, org.telegram.ui.Components.f60 f60Var, org.telegram.ui.Components.f60 f60Var2) {
        this.h = w71Var;
        this.a = df0Var;
        this.b = wmVar;
        this.c = tj0Var;
        this.d = linearLayout;
        this.e = f60Var;
        this.f = f60Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        df0 df0Var = this.a;
        ArrayList arrayList = df0Var.b;
        ArrayList arrayList2 = df0Var.c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        w71 w71Var = this.h;
        wm wmVar = this.b;
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
            wmVar.presentFragment(new ProfileActivity(bundle, null));
            w71Var.c(false);
            return;
        }
        if (org.telegram.messenger.az.c1 > 0 && wmVar.m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.ui.Components.ac t10 = new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(w71Var.getContext()), w71Var.a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748496, null)), null);
            wmVar.C1 = t10;
            t10.j = 4000;
            t10.j();
            org.telegram.messenger.az.S(org.telegram.messenger.az.c1 - 1);
        }
        org.telegram.ui.Components.tj0 tj0Var = this.c;
        tj0Var.requestLayout();
        this.d.requestLayout();
        tj0Var.getAdapter().f();
        this.e.K(this.f);
    }
}
