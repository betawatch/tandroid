package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sl implements sm {
    public final /* synthetic */ fo a;
    public final /* synthetic */ fo b;

    public sl(fo foVar, fo foVar2) {
        this.b = foVar;
        this.a = foVar2;
    }

    @Override // org.telegram.ui.sm
    public final void U0(int i10) {
        this.b.j(i10, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.sm
    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.Components.pb pbVar;
        int i10;
        fo foVar = this.b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) foVar.J4.get(Integer.valueOf(foVar.L4));
            if (messageObject == null) {
                messageObject = (MessageObject) foVar.o6[0].get(foVar.L4);
            }
            foVar.gc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(foVar.H4);
        ArrayList arrayList2 = new ArrayList(foVar.J4.values());
        org.telegram.ui.Components.sc scVar = null;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            if (foVar.H4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + foVar.T5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + foVar.T5, ((Integer) foVar.H4.get(0)).intValue()).commit();
            }
            foVar.Cc(0, true);
        } else {
            foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(foVar.T5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.sc scVar2 = foVar.A3;
        if (scVar2 != null) {
            scVar2.b();
        }
        foVar.B3 = true;
        int i11 = foVar.C3 + 1;
        foVar.C3 = i11;
        boolean z12 = foVar.h4;
        fo foVar2 = this.a;
        int L8 = z12 ? foVar2.L8() : foVar.L8();
        ArrayList arrayList3 = new ArrayList(foVar.h4 ? foVar2.H4 : foVar.H4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, L8, i11);
        org.telegram.messenger.voip.n0 n0Var = new org.telegram.messenger.voip.n0(this, z11, arrayList3, i11);
        co coVar = foVar.ea;
        if (foVar.getParentActivity() == null) {
            n0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(foVar.getParentActivity(), coVar);
                pcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                pcVar.b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                pcVar.c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                pbVar = pcVar;
            } else {
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(foVar.getParentActivity(), coVar);
                acVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                acVar.b.setText(LocaleController.formatPluralString("MessagesUnpinned", L8, new Object[0]));
                pbVar = acVar;
            }
            org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(foVar.getParentActivity(), coVar, true);
            qcVar.a = y7Var;
            qcVar.b = n0Var;
            pbVar.setButton(qcVar);
            scVar = org.telegram.ui.Components.sc.g(foVar, pbVar, 5000);
        }
        foVar.A3 = scVar;
    }

    @Override // org.telegram.ui.sm
    public final void r0(String str) {
        this.b.ia(str, false);
    }
}
