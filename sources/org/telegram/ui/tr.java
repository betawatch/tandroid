package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.ui.Components.sj0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ tr(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        ContactsActivity contactsActivity = this.a;
        v4.i0 adapter = contactsActivity.d.getAdapter();
        vr vrVar = contactsActivity.b;
        if (adapter == vrVar) {
            int S = vrVar.S(i7);
            int Q = contactsActivity.b.Q(i7);
            org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.w;
            if (fcVar != null) {
                fcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.sa)) {
            contactsActivity.p0((org.telegram.ui.Cells.sa) view);
            return true;
        }
        if (z10 || contactsActivity.K || !(view instanceof org.telegram.ui.Cells.g6)) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
        if (g6Var.getUser() != null && g6Var.getUser().contact) {
            contactsActivity.p0(g6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ContactsActivity contactsActivity = this.a;
        a0.h hVar = contactsActivity.a0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        org.telegram.messenger.i5 contactsController = contactsActivity.getContactsController();
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
            org.telegram.messenger.ks notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.mp.I8;
            notificationCenter.k(org.telegram.messenger.ks.r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.ks.O, new Object[0]);
            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, contactsActivity.getResourceProvider());
            xbVar.setTimer();
            xbVar.b.setText(org.telegram.messenger.gd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(parentActivity, contactsActivity.getResourceProvider(), true, true);
            dcVar.b = new org.telegram.messenger.w3(27, contactsController, hashMap);
            dcVar.c = new org.telegram.messenger.y4(contactsController, arrayList, 1);
            xbVar.setButton(dcVar);
            org.telegram.ui.Components.fc.g(contactsActivity, xbVar, 5000).j();
        }
        contactsActivity.m0();
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.l0 = i7;
        ri.a.e(contactsActivity.d, I0.b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.l1.b;
    }
}
