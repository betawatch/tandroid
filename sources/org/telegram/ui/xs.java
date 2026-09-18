package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ok0, org.telegram.ui.Components.cl0, r0.n {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ xs(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        this.a.g0();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.h0 adapter = contactsActivity.f.getAdapter();
        ct ctVar = contactsActivity.d;
        if (adapter == ctVar) {
            int S = ctVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
            if (ocVar != null) {
                ocVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.ab)) {
            contactsActivity.r0((org.telegram.ui.Cells.ab) view);
            return true;
        }
        if (z10 || contactsActivity.L || !(view instanceof org.telegram.ui.Cells.h6)) {
            return false;
        }
        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
        if (h6Var.getUser() != null && h6Var.getUser().contact) {
            contactsActivity.r0(h6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.d0;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
