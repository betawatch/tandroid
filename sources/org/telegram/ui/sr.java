package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sr extends jg.e {
    public final /* synthetic */ ContactsActivity O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(ContactsActivity contactsActivity, Context context, int i7, boolean z9, a0.h hVar, int i10) {
        super(context, i7, z9, hVar, i10);
        this.O = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.kj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z9;
        boolean z10;
        org.telegram.ui.ActionBar.f5 f5Var;
        boolean z11 = false;
        this.I = false;
        int i7 = this.F;
        int i10 = this.r;
        int i11 = this.w;
        int i12 = 2;
        if (i7 != 2) {
            size = (i11 == 2 ? org.telegram.messenger.g5.r(i10).j0 : org.telegram.messenger.g5.r(i10).h0).size();
            if (size == 0) {
                this.I = true;
            }
            if (i11 == 0) {
                size++;
            }
            z9 = this.E;
            if (z9) {
                size++;
            }
            boolean isEmpty = org.telegram.messenger.g5.r(i10).a0.isEmpty();
            this.J = !isEmpty;
            z10 = !this.I && this.x && !z9 && i11 == 0;
            this.K = z10;
            if (z10) {
                i12 = size;
            } else if (isEmpty) {
                i12 = 1;
            }
            ContactsActivity contactsActivity = this.O;
            ContactsActivity.g0(contactsActivity);
            f5Var = contactsActivity.n;
            if (f5Var != null) {
                sr srVar = contactsActivity.b;
                if (srVar != null && !srVar.I) {
                    z11 = true;
                }
                f5Var.Y(z11, true);
            }
            contactsActivity.k0();
            return i12;
        }
        this.I = this.D.isEmpty();
        size = 1;
        if (i11 == 0) {
        }
        z9 = this.E;
        if (z9) {
        }
        boolean isEmpty2 = org.telegram.messenger.g5.r(i10).a0.isEmpty();
        this.J = !isEmpty2;
        if (this.I) {
        }
        this.K = z10;
        if (z10) {
        }
        ContactsActivity contactsActivity2 = this.O;
        ContactsActivity.g0(contactsActivity2);
        f5Var = contactsActivity2.n;
        if (f5Var != null) {
        }
        contactsActivity2.k0();
        return i12;
    }

    @Override // org.telegram.ui.Components.kj0, v4.g0
    public final void f() {
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.pj0 pj0Var = contactsActivity.d;
        if (pj0Var == null || pj0Var.getAdapter() != this) {
            return;
        }
        int b10 = b();
        if (contactsActivity.F) {
            contactsActivity.d.setFastScrollVisible(b10 != 2);
        } else {
            contactsActivity.d.setFastScrollVisible(b10 != 0);
        }
    }
}
