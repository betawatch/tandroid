package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class tw implements org.telegram.ui.Components.e00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uy b;

    public tw(Context context, uy uyVar) {
        this.b = uyVar;
        this.a = context;
    }

    public final int a(int i10) {
        uy uyVar = this.b;
        if (uyVar.R0 == 3) {
            return 0;
        }
        if (i10 == uyVar.z0.getDefaultTabId()) {
            return uyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return uyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        uy uyVar = this.b;
        if (f7 != 1.0f || uyVar.e0[1].getVisibility() == 0 || uyVar.j2) {
            if (uyVar.h3) {
                uyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                uyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * uyVar.e0[0].getMeasuredWidth()));
            } else {
                uyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                uyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - uyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                ty[] tyVarArr = uyVar.e0;
                ty tyVar = tyVarArr[0];
                tyVarArr[0] = tyVarArr[1];
                tyVarArr[1] = tyVar;
                tyVar.setVisibility(8);
                uy.f1(uyVar, true);
                uyVar.T4(false);
                uyVar.z0.O = false;
                uyVar.r3(uyVar.e0[0]);
                uyVar.e0[0].d.getClass();
                uyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.g00 g00Var, boolean z10) {
        int i10;
        int i11;
        uy uyVar = this.b;
        int i12 = uyVar.e0[0].h;
        int i13 = g00Var.a;
        if (i12 == i13) {
            return;
        }
        if (g00Var.f) {
            uyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            uyVar.showDialog(new sg.k0(3, i11, this.a, uyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
        if (g00Var.e || ((i10 = g00Var.a) >= 0 && i10 < dialogFilters.size())) {
            ty tyVar = uyVar.e0[1];
            tyVar.h = g00Var.a;
            tyVar.setVisibility(0);
            uyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            uy.f1(uyVar, false);
            uyVar.R4(true);
            uyVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        uy uyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.c10.T(uyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(29, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
