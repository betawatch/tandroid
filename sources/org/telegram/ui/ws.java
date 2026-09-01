package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ws extends uf.c1 {
    public final /* synthetic */ ContactsActivity H;

    public ws(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
        this.H = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z4;
        this.s = z10;
        this.x = 0;
        this.v = z11;
        this.w = true;
        uf.k1 k1Var = new uf.k1(true);
        this.f = k1Var;
        k1Var.a = new uf.a1(this);
    }

    @Override // uf.c1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.H.e.e(false, true);
    }
}
