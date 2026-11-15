package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements org.telegram.ui.Components.ij0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ sr(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.l0 = i7;
        ri.a.e(contactsActivity.d, I0.b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        ContactsActivity contactsActivity = this.a;
        v4.h0 adapter = contactsActivity.d.getAdapter();
        vr vrVar = contactsActivity.b;
        if (adapter == vrVar) {
            int S = vrVar.S(i7);
            int Q = contactsActivity.b.Q(i7);
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
            if (xbVar != null) {
                xbVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            return true;
        }
        if (z10 || contactsActivity.K || !(view instanceof org.telegram.ui.Cells.f6)) {
            return false;
        }
        org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
        if (f6Var.getUser() != null && f6Var.getUser().contact) {
            contactsActivity.p0(f6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ContactsActivity contactsActivity = this.a;
        a0.h hVar = contactsActivity.a0;
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
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.g0.get(Long.valueOf(user.id));
                user.contact = false;
                contactsController.f0.remove(tL_contact);
                contactsController.g0.remove(Long.valueOf(user.id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.ns notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.np.D8;
            notificationCenter.k(org.telegram.messenger.ns.r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.ns.O, new Object[0]);
            org.telegram.ui.Components.pb pbVar = new org.telegram.ui.Components.pb(parentActivity, contactsActivity.getResourceProvider());
            pbVar.setTimer();
            pbVar.b.setText(org.telegram.messenger.hd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(parentActivity, contactsActivity.getResourceProvider(), true, true);
            vbVar.b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            vbVar.c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            pbVar.setButton(vbVar);
            org.telegram.ui.Components.xb.g(contactsActivity, pbVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
