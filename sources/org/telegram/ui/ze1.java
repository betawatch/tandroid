package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ze1 implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ cf1 a;

    public ze1(cf1 cf1Var) {
        this.a = cf1Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        cf1 cf1Var = this.a;
        ArrayList arrayList = cf1Var.d;
        if (((bf1) arrayList.get(i10)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -cf1Var.c);
            bundle.putBoolean("for_select", true);
            we1 we1Var = new we1(bundle);
            we1Var.w0 = cf1Var.e;
            we1Var.v = new xe1(this);
            cf1Var.presentFragment(we1Var);
        }
        if (((bf1) arrayList.get(i10)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((bf1) arrayList.get(i10)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", cf1Var.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            t01 t01Var = new t01(bundle2, null);
            t01Var.r = new ye1(this, tL_forumTopic);
            cf1Var.presentFragment(t01Var);
        }
        if (((bf1) arrayList.get(i10)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cf1Var.getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xe1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            cf1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
            }
        }
    }
}
