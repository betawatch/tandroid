package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ss extends zf.d {
    public final /* synthetic */ ContactsActivity O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.O = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.p5 p5Var;
        boolean z12 = false;
        this.I = false;
        int i10 = this.F;
        int i11 = this.r;
        int i12 = this.w;
        int i13 = 2;
        if (i10 != 2) {
            size = (i12 == 2 ? org.telegram.messenger.i5.r(i11).j0 : org.telegram.messenger.i5.r(i11).h0).size();
            if (size == 0) {
                this.I = true;
            }
            if (i12 == 0) {
                size++;
            }
            z10 = this.E;
            if (z10) {
                size++;
            }
            boolean isEmpty = org.telegram.messenger.i5.r(i11).a0.isEmpty();
            this.J = !isEmpty;
            z11 = !this.I && this.x && !z10 && i12 == 0;
            this.K = z11;
            if (z11) {
                i13 = size;
            } else if (isEmpty) {
                i13 = 1;
            }
            ContactsActivity contactsActivity = this.O;
            ContactsActivity.f0(contactsActivity);
            p5Var = contactsActivity.n;
            if (p5Var != null) {
                ss ssVar = contactsActivity.b;
                if (ssVar != null && !ssVar.I) {
                    z12 = true;
                }
                p5Var.Y(z12, true);
            }
            contactsActivity.j0();
            return i13;
        }
        this.I = this.D.isEmpty();
        size = 1;
        if (i12 == 0) {
        }
        z10 = this.E;
        if (z10) {
        }
        boolean isEmpty2 = org.telegram.messenger.i5.r(i11).a0.isEmpty();
        this.J = !isEmpty2;
        if (this.I) {
        }
        this.K = z11;
        if (z11) {
        }
        ContactsActivity contactsActivity2 = this.O;
        ContactsActivity.f0(contactsActivity2);
        p5Var = contactsActivity2.n;
        if (p5Var != null) {
        }
        contactsActivity2.j0();
        return i13;
    }

    @Override // org.telegram.ui.Components.ok0, s4.g0
    public final void f() {
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.tk0 tk0Var = contactsActivity.d;
        if (tk0Var == null || tk0Var.getAdapter() != this) {
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
