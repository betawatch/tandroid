package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rr extends jg.s1 {
    public final /* synthetic */ ContactsActivity K;

    public rr(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z9, boolean z10, boolean z11) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z9;
        this.s = z10;
        this.y = 0;
        this.w = z11;
        this.x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f = z1Var;
        z1Var.a = new jg.p1(this);
    }

    @Override // jg.s1
    public final void F() {
        if (this.D || this.f.e() || b() != 0) {
            return;
        }
        this.K.c.e(false, true);
    }
}
