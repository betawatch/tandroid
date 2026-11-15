package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x91 implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ aa1 a;

    public x91(aa1 aa1Var) {
        this.a = aa1Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        aa1 aa1Var = this.a;
        ArrayList arrayList = aa1Var.d;
        if (((z91) arrayList.get(i7)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -aa1Var.c);
            bundle.putBoolean("for_select", true);
            u91 u91Var = new u91(bundle);
            u91Var.B0 = aa1Var.e;
            u91Var.w = new v91(this);
            aa1Var.presentFragment(u91Var);
        }
        if (((z91) arrayList.get(i7)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((z91) arrayList.get(i7)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", aa1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            fx0 fx0Var = new fx0(bundle2, null);
            fx0Var.s = new w91(this, tL_forumTopic);
            aa1Var.presentFragment(fx0Var);
        }
        if (((z91) arrayList.get(i7)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aa1Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131747913, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131747914, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new v91(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            aa1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
            }
        }
    }
}
