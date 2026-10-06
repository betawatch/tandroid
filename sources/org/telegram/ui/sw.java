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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class sw extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ uy a;

    public sw(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        dy dyVar;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.a;
        ArrayList arrayList3 = uyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (dyVar = uyVar.C0) != null) {
            HashMap hashMap = dyVar.B0;
            uy uyVar2 = dyVar.L0;
            if (i10 == 202) {
                if (uyVar2 == null || uyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList(hashMap.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.a.T = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ru(18));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(16, dyVar, arrayList4));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (dyVar.P()) {
                    uyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) uyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() != 1) {
                    return;
                }
                dyVar.d((MessageObject) hashMap.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    uy uyVar3 = new uy(org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true));
                    uyVar3.C2 = new org.telegram.ui.Components.pv(dyVar, 18);
                    uyVar2.presentFragment(uyVar3);
                    return;
                }
                return;
            }
        }
        long j3 = 0;
        if (i10 == -1) {
            mx mxVar = uyVar.F3;
            if (mxVar != null && mxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (!kVar2.s()) {
                    uyVar.F3.a();
                    dy dyVar2 = uyVar.C0;
                    if (dyVar2 != null) {
                        dyVar2.T();
                        return;
                    }
                    return;
                }
                dy dyVar3 = uyVar.C0;
                if (dyVar3 != null && dyVar3.getVisibility() == 0) {
                    dy dyVar4 = uyVar.C0;
                    if (dyVar4.A0) {
                        dyVar4.S(false);
                        return;
                    }
                }
                uyVar.k4(true);
                return;
            }
            ky kyVar = uyVar.z0;
            if (kyVar != null && kyVar.n) {
                kyVar.setIsEditing(false);
                uyVar.R4(false);
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (!kVar.s()) {
                if (!uyVar.l2 && uyVar.V2 == 0 && uyVar.X2 == 0) {
                    return;
                }
                uyVar.finishFragment();
                return;
            }
            dy dyVar5 = uyVar.C0;
            if (dyVar5 != null && dyVar5.getVisibility() == 0) {
                dy dyVar6 = uyVar.C0;
                if (dyVar6.A0) {
                    dyVar6.S(false);
                    return;
                }
            }
            uyVar.k4(true);
            return;
        }
        if (i10 == 1) {
            if (uyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            uyVar.f0.getLocationInWindow(iArr);
            ((LaunchActivity) uyVar.getParentActivity()).G0(false, true, (uyVar.f0.getMeasuredWidth() / 2) + iArr[0], (uyVar.f0.getMeasuredHeight() / 2) + iArr[1], new bj(this, 22));
            uyVar.getNotificationsController().showNotifications();
            uyVar.H3();
            return;
        }
        if (i10 == 3) {
            uyVar.X4(true, true, true, false);
            uyVar.Y.b(true);
            return;
        }
        if (i10 == 11) {
            uyVar.y4(uyVar.D1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(uyVar, arrayList3);
            q00Var.r = new bu(this, 6);
            uyVar.showDialog(q00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                uyVar.A4(uyVar.I2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = uyVar.getMessagesController().getDialogFilters().get(uyVar.e0[0].h);
        ArrayList G = org.telegram.ui.Components.q00.G(uyVar, dialogFilter2, arrayList3, false, false);
        if (G.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            uyVar.showDialog(org.telegram.ui.Components.e5.N(uyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).a);
            return;
        }
        if (G.isEmpty()) {
            arrayList = G;
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(G);
            for (int i12 = 0; i12 < G.size(); i12++) {
                Long l4 = (Long) G.get(i12);
                dialogFilter2.alwaysShow.remove(l4);
                dialogFilter2.pinnedDialogs.delete(l4.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            arrayList = G;
            i11 = 1;
            f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, uyVar, null);
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
        UndoView h42 = uyVar.h4();
        if (h42 != null) {
            h42.k(j10, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
        }
        uyVar.k4(z10);
    }
}
