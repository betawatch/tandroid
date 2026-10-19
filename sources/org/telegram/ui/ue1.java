package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ue1 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ xe1 a;

    public ue1(xe1 xe1Var) {
        this.a = xe1Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        xe1 xe1Var = this.a;
        ArrayList arrayList = xe1Var.d;
        if (((we1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -xe1Var.c);
            bundle.putBoolean("for_select", true);
            re1 re1Var = new re1(bundle);
            re1Var.A0 = xe1Var.e;
            re1Var.v = new se1(this);
            xe1Var.presentFragment(re1Var);
        }
        if (((we1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((we1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", xe1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            z01 z01Var = new z01(bundle2, null);
            z01Var.r = new te1(this, tL_forumTopic);
            xe1Var.presentFragment(z01Var);
        }
        if (((we1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xe1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new se1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            xe1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
            }
        }
    }
}
