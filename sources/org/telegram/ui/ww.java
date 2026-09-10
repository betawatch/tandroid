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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ww extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ wy a;

    public ww(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        gy gyVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        wy wyVar = this.a;
        ArrayList arrayList3 = wyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (gyVar = wyVar.C0) != null) {
            HashMap hashMap = gyVar.z0;
            wy wyVar2 = gyVar.J0;
            if (i10 == 202) {
                if (wyVar2 == null || wyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.q2(29));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(9, gyVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (gyVar.N()) {
                    wyVar2.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) wyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                gyVar.c((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    wy wyVar3 = new wy(org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true));
                    wyVar3.C2 = new org.telegram.ui.Components.pv(gyVar, 17);
                    wyVar2.presentFragment(wyVar3);
                    return;
                }
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            qx qxVar = wyVar.F3;
            if (qxVar != null && qxVar.c()) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (!lVar2.s()) {
                    wyVar.F3.a();
                    gy gyVar2 = wyVar.C0;
                    if (gyVar2 != null) {
                        gyVar2.R();
                        return;
                    }
                    return;
                }
                gy gyVar3 = wyVar.C0;
                if (gyVar3 != null && gyVar3.getVisibility() == 0) {
                    gy gyVar4 = wyVar.C0;
                    if (gyVar4.y0) {
                        gyVar4.Q(false);
                        return;
                    }
                }
                wyVar.b4(true);
                return;
            }
            uw uwVar = wyVar.z0;
            if (uwVar != null && uwVar.n) {
                uwVar.setIsEditing(false);
                wyVar.I4(false);
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (!lVar.s()) {
                if (!wyVar.l2 && wyVar.V2 == 0 && wyVar.X2 == 0) {
                    return;
                }
                wyVar.finishFragment();
                return;
            }
            gy gyVar5 = wyVar.C0;
            if (gyVar5 != null && gyVar5.getVisibility() == 0) {
                gy gyVar6 = wyVar.C0;
                if (gyVar6.y0) {
                    gyVar6.Q(false);
                    return;
                }
            }
            wyVar.b4(true);
            return;
        }
        if (i10 == 1) {
            if (wyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            wyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) wyVar.getParentActivity()).G0(false, true, (wyVar.f0.getMeasuredWidth() / 2) + iArr[0], (wyVar.f0.getMeasuredHeight() / 2) + iArr[1], new fj(this, 24));
            wyVar.getNotificationsController().showNotifications();
            wyVar.y3();
            return;
        }
        if (i10 == 3) {
            wyVar.O4(true, true, true, false);
            wyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            wyVar.p4(wyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(wyVar, arrayList3);
            u00Var.r = new iu(this, 4);
            wyVar.showDialog(u00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                wyVar.r4(wyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = wyVar.getMessagesController().getDialogFilters().get(wyVar.e0[0].h);
        ArrayList I = org.telegram.ui.Components.u00.I(wyVar, dialogFilter2, arrayList3, false, false);
        if (I.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            wyVar.showDialog(org.telegram.ui.Components.d5.N(wyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (I.isEmpty()) {
            arrayList = I;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(I);
            for (int i12 = 0; i12 < I.size(); i12++) {
                Long l4 = (Long) I.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = I;
            i11 = 1;
            h10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, wyVar, null);
        }
        if (arrayList.size() == i11) {
            arrayList2 = arrayList;
            z10 = false;
            j3 = ((Long) arrayList2.get(0)).longValue();
        } else {
            arrayList2 = arrayList;
            z10 = false;
        }
        long j10 = j3;
        UndoView Y3 = wyVar.Y3();
        if (Y3 != null) {
            Y3.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        wyVar.b4(z10);
    }
}
