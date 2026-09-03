package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qw implements org.telegram.ui.Components.f00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qy b;

    public qw(Context context, qy qyVar) {
        this.b = qyVar;
        this.a = context;
    }

    public final int a(int i10) {
        qy qyVar = this.b;
        if (qyVar.O0 == 3) {
            return 0;
        }
        if (i10 == qyVar.w0.getDefaultTabId()) {
            return qyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return qyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f10) {
        qy qyVar = this.b;
        if (f10 != 1.0f || qyVar.b0[1].getVisibility() == 0 || qyVar.g2) {
            if (qyVar.e3) {
                qyVar.b0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                qyVar.b0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * qyVar.b0[0].getMeasuredWidth()));
            } else {
                qyVar.b0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                qyVar.b0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - qyVar.b0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                py[] pyVarArr = qyVar.b0;
                py pyVar = pyVarArr[0];
                pyVarArr[0] = pyVarArr[1];
                pyVarArr[1] = pyVar;
                pyVar.setVisibility(8);
                qy.f1(qyVar, true);
                qyVar.T4(false);
                qyVar.w0.L = false;
                qyVar.r3(qyVar.b0[0]);
                qyVar.b0[0].d.getClass();
                qyVar.b0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.h00 h00Var, boolean z4) {
        int i10;
        int i11;
        qy qyVar = this.b;
        int i12 = qyVar.b0[0].h;
        int i13 = h00Var.a;
        if (i12 == i13) {
            return;
        }
        if (h00Var.f) {
            qyVar.w0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            qyVar.showDialog(new eg.v0(3, i11, this.a, qyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
        if (h00Var.e || ((i10 = h00Var.a) >= 0 && i10 < dialogFilters.size())) {
            py pyVar = qyVar.b0[1];
            pyVar.h = h00Var.a;
            pyVar.setVisibility(0);
            qyVar.b0[1].setTranslationX(r7[0].getMeasuredWidth());
            qy.f1(qyVar, false);
            qyVar.R4(true);
            qyVar.e3 = z4;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        qy qyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(qyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ss(7, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        qyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
