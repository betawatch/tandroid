package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.ui.Components.dj0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ qr(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.k0 = i7;
        oi.a.e(contactsActivity.d, I0.b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.h0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        ContactsActivity contactsActivity = this.a;
        v4.g0 adapter = contactsActivity.d.getAdapter();
        sr srVar = contactsActivity.b;
        if (adapter == srVar) {
            int S = srVar.S(i7);
            int Q = contactsActivity.b.Q(i7);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
            if (ccVar != null) {
                ccVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z9 = contactsActivity.I;
        if (!z9 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            return true;
        }
        if (z9 || contactsActivity.J || !(view instanceof org.telegram.ui.Cells.g6)) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
        if (g6Var.getUser() != null && g6Var.getUser().contact) {
            contactsActivity.p0(g6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ContactsActivity contactsActivity = this.a;
        a0.h hVar = contactsActivity.Z;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        org.telegram.messenger.g5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i11);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f0.get(Long.valueOf(user.id));
                user.contact = false;
                contactsController.e0.remove(tL_contact);
                contactsController.f0.remove(Long.valueOf(user.id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.qs notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.qp.C8;
            notificationCenter.k(org.telegram.messenger.qs.r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.qs.O, new Object[0]);
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(parentActivity, contactsActivity.getResourceProvider());
            ubVar.setTimer();
            ubVar.b.setText(org.telegram.messenger.hd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(parentActivity, contactsActivity.getResourceProvider(), true, true);
            acVar.b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            acVar.c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            ubVar.setButton(acVar);
            org.telegram.ui.Components.cc.g(contactsActivity, ubVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
