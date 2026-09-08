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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class y5 extends pg.b {
    public final /* synthetic */ a6 d;

    public y5(a6 a6Var) {
        this.d = a6Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.c.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((z5) this.d.c.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        a6 a6Var = this.d;
        ArrayList arrayList = a6Var.c;
        if (((z5) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) c1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).c;
            TLObject userOrChat = a6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            zaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((z5) arrayList.get(i10 + 1)).a != 2) {
                z10 = false;
            }
            zaVar.e(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View zaVar = new org.telegram.ui.Cells.za(4, 0, viewGroup.getContext(), null, false, false);
                zaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = zaVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.p6) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = r8Var;
            }
            return com.google.android.gms.internal.vision.e2.l(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
        r8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        r8Var2.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
        r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        view = r8Var2;
        view2 = view;
        return com.google.android.gms.internal.vision.e2.l(view2, view2, -1, -2);
    }
}
