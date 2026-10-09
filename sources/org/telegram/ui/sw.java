package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sw implements org.telegram.ui.Components.u00 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ty b;

    public sw(Context context, ty tyVar) {
        this.b = tyVar;
        this.a = context;
    }

    public final int a(int i10) {
        ty tyVar = this.b;
        if (tyVar.R0 == 3) {
            return 0;
        }
        if (i10 == tyVar.z0.getDefaultTabId()) {
            return tyVar.getMessagesStorage().getMainUnreadCount();
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = tyVar.getMessagesController().getDialogFilters();
        if (i10 < 0 || i10 >= dialogFilters.size()) {
            return 0;
        }
        return tyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
    }

    public final void b(float f7) {
        ty tyVar = this.b;
        if (f7 != 1.0f || tyVar.e0[1].getVisibility() == 0 || tyVar.j2) {
            if (tyVar.h3) {
                tyVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                tyVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * tyVar.e0[0].getMeasuredWidth()));
            } else {
                tyVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                tyVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - tyVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                sy[] syVarArr = tyVar.e0;
                sy syVar = syVarArr[0];
                syVarArr[0] = syVarArr[1];
                syVarArr[1] = syVar;
                syVar.setVisibility(8);
                ty.c1(tyVar, true);
                tyVar.Q4(false);
                tyVar.z0.O = false;
                tyVar.o3(tyVar.e0[0]);
                tyVar.e0[0].d.getClass();
                tyVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.w00 w00Var, boolean z10) {
        int i10;
        int i11;
        ty tyVar = this.b;
        int i12 = tyVar.e0[0].h;
        int i13 = w00Var.a;
        if (i12 == i13) {
            return;
        }
        if (w00Var.f) {
            tyVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            tyVar.showDialog(new rg.j0(3, i11, this.a, tyVar, null));
            return;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = tyVar.getMessagesController().getDialogFilters();
        if (w00Var.e || ((i10 = w00Var.a) >= 0 && i10 < dialogFilters.size())) {
            sy syVar = tyVar.e0[1];
            syVar.h = w00Var.a;
            syVar.setVisibility(0);
            tyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            ty.c1(tyVar, false);
            tyVar.O4(true);
            tyVar.h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ty tyVar = this.b;
        if (isChatlist) {
            org.telegram.ui.Components.s10.U(tyVar, dialogFilter.id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rw(0, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        tyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
        }
    }
}
