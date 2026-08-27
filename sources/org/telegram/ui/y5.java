package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y5 extends xf.b {
    public final /* synthetic */ a6 d;

    public y5(a6 a6Var) {
        this.d = a6Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.c.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((z5) this.d.c.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        a6 a6Var = this.d;
        ArrayList arrayList = a6Var.c;
        if (((z5) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) o1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).c;
            TLObject userOrChat = a6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            saVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((z5) arrayList.get(i10 + 1)).a != 2) {
                z10 = false;
            }
            saVar.e(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = saVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                l8Var.e(-1, org.telegram.ui.ActionBar.g6.p7);
                l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = l8Var;
            }
            return org.telegram.ui.Cells.pa.l(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
        l8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        l8Var2.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
        l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        view = l8Var2;
        view2 = view;
        return org.telegram.ui.Cells.pa.l(view2, view2, -1, -2);
    }
}
