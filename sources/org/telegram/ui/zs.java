package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0, org.telegram.ui.Components.cm0, r0.n {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ zs(ContactsActivity contactsActivity) {
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

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.g0 adapter = contactsActivity.f.getAdapter();
        et etVar = contactsActivity.d;
        if (adapter == etVar) {
            int S = etVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
            if (scVar != null) {
                scVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.xa)) {
            contactsActivity.r0((org.telegram.ui.Cells.xa) view);
            return true;
        }
        if (z10 || contactsActivity.L || !(view instanceof org.telegram.ui.Cells.i6)) {
            return false;
        }
        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
        if (i6Var.getUser() != null && i6Var.getUser().contact) {
            contactsActivity.r0(i6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ol0
    public void c() {
        this.a.g0();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.d0;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
