package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vr extends jg.e {
    public final /* synthetic */ ContactsActivity P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(ContactsActivity contactsActivity, Context context, int i7, boolean z10, a0.h hVar, int i10) {
        super(context, i7, z10, hVar, i10);
        this.P = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.d5 d5Var;
        boolean z12 = false;
        this.J = false;
        int i7 = this.G;
        int i10 = this.r;
        int i11 = this.w;
        int i12 = 2;
        if (i7 != 2) {
            size = (i11 == 2 ? org.telegram.messenger.g5.r(i10).k0 : org.telegram.messenger.g5.r(i10).i0).size();
            if (size == 0) {
                this.J = true;
            }
            if (i11 == 0) {
                size++;
            }
            z10 = this.F;
            if (z10) {
                size++;
            }
            boolean isEmpty = org.telegram.messenger.g5.r(i10).b0.isEmpty();
            this.K = !isEmpty;
            z11 = !this.J && this.x && !z10 && i11 == 0;
            this.L = z11;
            if (z11) {
                i12 = size;
            } else if (isEmpty) {
                i12 = 1;
            }
            ContactsActivity contactsActivity = this.P;
            ContactsActivity.g0(contactsActivity);
            d5Var = contactsActivity.n;
            if (d5Var != null) {
                vr vrVar = contactsActivity.b;
                if (vrVar != null && !vrVar.J) {
                    z12 = true;
                }
                d5Var.Z(z12, true);
            }
            contactsActivity.k0();
            return i12;
        }
        this.J = this.E.isEmpty();
        size = 1;
        if (i11 == 0) {
        }
        z10 = this.F;
        if (z10) {
        }
        boolean isEmpty2 = org.telegram.messenger.g5.r(i10).b0.isEmpty();
        this.K = !isEmpty2;
        if (this.J) {
        }
        this.L = z11;
        if (z11) {
        }
        ContactsActivity contactsActivity2 = this.P;
        ContactsActivity.g0(contactsActivity2);
        d5Var = contactsActivity2.n;
        if (d5Var != null) {
        }
        contactsActivity2.k0();
        return i12;
    }

    @Override // org.telegram.ui.Components.pj0, v4.h0
    public final void f() {
        X(false);
        ContactsActivity contactsActivity = this.P;
        org.telegram.ui.Components.uj0 uj0Var = contactsActivity.d;
        if (uj0Var == null || uj0Var.getAdapter() != this) {
            return;
        }
        int b10 = b();
        if (contactsActivity.G) {
            contactsActivity.d.setFastScrollVisible(b10 != 2);
        } else {
            contactsActivity.d.setFastScrollVisible(b10 != 0);
        }
    }
}
