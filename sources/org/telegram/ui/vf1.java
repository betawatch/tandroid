package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vf1 implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ yf1 a;

    public vf1(yf1 yf1Var) {
        this.a = yf1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        yf1 yf1Var = this.a;
        ArrayList arrayList = yf1Var.d;
        if (((xf1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -yf1Var.c);
            bundle.putBoolean("for_select", true);
            sf1 sf1Var = new sf1(bundle);
            sf1Var.x0 = yf1Var.e;
            sf1Var.v = new tf1(this);
            yf1Var.presentFragment(sf1Var);
        }
        if (((xf1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((xf1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", yf1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            k11 k11Var = new k11(bundle2, null);
            k11Var.r = new uf1(this, tL_forumTopic);
            yf1Var.presentFragment(k11Var);
        }
        if (((xf1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yf1Var.getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tf1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            yf1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
            }
        }
    }
}
