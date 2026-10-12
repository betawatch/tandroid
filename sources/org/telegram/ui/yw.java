package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yy a;

    public yw(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        iy iyVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yy yyVar = this.a;
        ArrayList arrayList3 = yyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (iyVar = yyVar.C0) != null) {
            HashMap hashMap = iyVar.z0;
            yy yyVar2 = iyVar.J0;
            if (i10 == 202) {
                if (yyVar2 == null || yyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.zg0(3));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.t2(18, iyVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (iyVar.N()) {
                    yyVar2.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) yyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                iyVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    yy yyVar3 = new yy(org.telegram.messenger.yh.d(3, "onlySelect", "dialogsType", true));
                    yyVar3.C2 = new org.telegram.ui.Components.xv(iyVar, 18);
                    yyVar2.presentFragment(yyVar3);
                    return;
                }
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            sx sxVar = yyVar.F3;
            if (sxVar != null && sxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (!kVar2.t()) {
                    yyVar.F3.a();
                    iy iyVar2 = yyVar.C0;
                    if (iyVar2 != null) {
                        iyVar2.R();
                        return;
                    }
                    return;
                }
                iy iyVar3 = yyVar.C0;
                if (iyVar3 != null && iyVar3.getVisibility() == 0) {
                    iy iyVar4 = yyVar.C0;
                    if (iyVar4.y0) {
                        iyVar4.Q(false);
                        return;
                    }
                }
                yyVar.Y3(true);
                return;
            }
            ww wwVar = yyVar.z0;
            if (wwVar != null && wwVar.n) {
                wwVar.setIsEditing(false);
                yyVar.F4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (!kVar.t()) {
                if (!yyVar.l2 && yyVar.V2 == 0 && yyVar.X2 == 0) {
                    return;
                }
                yyVar.finishFragment();
                return;
            }
            iy iyVar5 = yyVar.C0;
            if (iyVar5 != null && iyVar5.getVisibility() == 0) {
                iy iyVar6 = yyVar.C0;
                if (iyVar6.y0) {
                    iyVar6.Q(false);
                    return;
                }
            }
            yyVar.Y3(true);
            return;
        }
        if (i10 == 1) {
            if (yyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            yyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) yyVar.getParentActivity()).G0(false, true, (yyVar.f0.getMeasuredWidth() / 2) + iArr[0], (yyVar.f0.getMeasuredHeight() / 2) + iArr[1], new gj(this, 25));
            yyVar.getNotificationsController().showNotifications();
            yyVar.v3();
            return;
        }
        if (i10 == 3) {
            yyVar.L4(true, true, true, false);
            yyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            yyVar.m4(yyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(yyVar, arrayList3);
            z00Var.r = new mu(this, 4);
            yyVar.showDialog(z00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                yyVar.o4(yyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = yyVar.getMessagesController().getDialogFilters().get(yyVar.e0[0].h);
        ArrayList J = org.telegram.ui.Components.z00.J(yyVar, dialogFilter2, arrayList3, false, false);
        if (J.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            yyVar.showDialog(org.telegram.ui.Components.g5.M(yyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (J.isEmpty()) {
            arrayList = J;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(J);
            for (int i12 = 0; i12 < J.size(); i12++) {
                Long l4 = (Long) J.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = J;
            i11 = 1;
            l10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, yyVar, null);
        }
        if (arrayList.size() == i11) {
            arrayList2 = arrayList;
            z10 = false;
            j10 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z10 = false;
        }
        long j11 = j10;
        UndoView V3 = yyVar.V3();
        if (V3 != null) {
            V3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        yyVar.Y3(z10);
    }
}
