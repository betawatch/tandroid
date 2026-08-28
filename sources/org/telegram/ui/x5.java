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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x5 extends wf.b {
    public final /* synthetic */ z5 d;

    public x5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 1 || i9 == 2 || i9 == 4;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.c.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((y5) this.d.c.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        z5 z5Var = this.d;
        ArrayList arrayList = z5Var.c;
        if (((y5) arrayList.get(i9)).a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) q1Var.a;
            CacheByChatsController.KeepMediaException keepMediaException = ((y5) arrayList.get(i9)).c;
            TLObject userOrChat = z5Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
            }
            boolean z10 = true;
            vaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i9 != arrayList.size() - 1 && ((y5) arrayList.get(i9 + 1)).a != 2) {
                z10 = false;
            }
            vaVar.e(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2 = null;
        if (i9 != 1) {
            if (i9 == 2) {
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = vaVar;
            } else if (i9 == 3) {
                view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
            } else if (i9 == 4) {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                p8Var.e(-1, org.telegram.ui.ActionBar.f6.p7);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = p8Var;
            }
            return j3.r0.s(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
        p8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        p8Var2.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
        p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        view = p8Var2;
        view2 = view;
        return j3.r0.s(view2, view2, -1, -2);
    }
}
