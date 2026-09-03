package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0, org.telegram.ui.Components.jl0, r0.o {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ ts(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.n0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        f2.o0 adapter = contactsActivity.f.getAdapter();
        ys ysVar = contactsActivity.d;
        if (adapter == ysVar) {
            int S = ysVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
            if (icVar != null) {
                icVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z4 = contactsActivity.H;
        if (!z4 && !contactsActivity.I && (view instanceof org.telegram.ui.Cells.ua)) {
            contactsActivity.r0((org.telegram.ui.Cells.ua) view);
            return true;
        }
        if (z4 || contactsActivity.I || !(view instanceof org.telegram.ui.Cells.g6)) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
        if (g6Var.getUser() != null && g6Var.getUser().contact) {
            contactsActivity.r0(g6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.xk0
    public void e() {
        this.a.g0();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.a0;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
