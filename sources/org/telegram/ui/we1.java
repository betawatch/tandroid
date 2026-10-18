package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class we1 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ ze1 a;

    public we1(ze1 ze1Var) {
        this.a = ze1Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        ze1 ze1Var = this.a;
        ArrayList arrayList = ze1Var.d;
        if (((ye1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ze1Var.c);
            bundle.putBoolean("for_select", true);
            te1 te1Var = new te1(bundle);
            te1Var.A0 = ze1Var.e;
            te1Var.v = new ue1(this);
            ze1Var.presentFragment(te1Var);
        }
        if (((ye1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ye1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ze1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            b11 b11Var = new b11(bundle2, null);
            b11Var.r = new ve1(this, tL_forumTopic);
            ze1Var.presentFragment(b11Var);
        }
        if (((ye1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ze1Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ue1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            ze1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
            }
        }
    }
}
