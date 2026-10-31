package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rs extends zf.f1 {
    public final /* synthetic */ ContactsActivity K;

    public rs(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z10;
        this.s = z11;
        this.y = 0;
        this.w = z12;
        this.x = true;
        zf.m1 m1Var = new zf.m1(true);
        this.f = m1Var;
        m1Var.a = new zf.d1(this);
    }

    @Override // zf.f1
    public final void F() {
        if (this.D || this.f.e() || b() != 0) {
            return;
        }
        this.K.c.e(false, true);
    }
}
