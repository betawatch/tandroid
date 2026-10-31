package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs implements org.telegram.ui.Components.ik0, r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ qs(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.k0 = i10;
        ei.b.e(contactsActivity.d, I0.b, i10, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), contactsActivity.h0);
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.g0 adapter = contactsActivity.d.getAdapter();
        ss ssVar = contactsActivity.b;
        if (adapter == ssVar) {
            int S = ssVar.S(i10);
            int Q = contactsActivity.b.Q(i10);
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
            if (wbVar != null) {
                wbVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.I;
        if (!z10 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.o0((org.telegram.ui.Cells.pa) view);
            return true;
        }
        if (z10 || contactsActivity.J || !(view instanceof org.telegram.ui.Cells.k6)) {
            return false;
        }
        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
        if (k6Var.getUser() != null && k6Var.getUser().contact) {
            contactsActivity.o0(k6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        a0.h hVar = contactsActivity.Z;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        org.telegram.messenger.i5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i12);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f0.get(Long.valueOf(user.id));
                user.contact = false;
                contactsController.e0.remove(tL_contact);
                contactsController.f0.remove(Long.valueOf(user.id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.zs notificationCenter = contactsController.getNotificationCenter();
            int i13 = org.telegram.messenger.vp.D8;
            notificationCenter.k(org.telegram.messenger.zs.r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.zs.O, new Object[0]);
            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(parentActivity, contactsActivity.getResourceProvider());
            obVar.setTimer();
            obVar.b.setText(org.telegram.messenger.cd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(parentActivity, contactsActivity.getResourceProvider(), true, true);
            ubVar.b = new org.telegram.messenger.e4(25, contactsController, hashMap);
            ubVar.c = new org.telegram.messenger.z4(contactsController, arrayList, 1);
            obVar.setButton(ubVar);
            org.telegram.ui.Components.wb.g(contactsActivity, obVar, 5000).j();
        }
        contactsActivity.l0();
    }
}
