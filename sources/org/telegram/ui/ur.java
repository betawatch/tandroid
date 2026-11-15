package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ur extends jg.s1 {
    public final /* synthetic */ ContactsActivity L;

    public ur(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.I = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z10;
        this.s = z11;
        this.y = 0;
        this.w = z12;
        this.x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f = z1Var;
        z1Var.a = new jg.p1(this);
    }

    @Override // jg.s1
    public final void F() {
        if (this.E || this.f.e() || b() != 0) {
            return;
        }
        this.L.c.e(false, true);
    }
}
