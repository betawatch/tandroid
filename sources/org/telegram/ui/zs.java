package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class zs extends hg.u1 {
    public final /* synthetic */ ContactsActivity K;

    public zs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.c = context;
        this.h = iVar;
        this.r = z10;
        this.s = z11;
        this.x = 0;
        this.v = z12;
        this.w = true;
        hg.b2 b2Var = new hg.b2(true);
        this.f = b2Var;
        b2Var.a = new hg.r1(this);
    }

    @Override // hg.u1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.K.e.e(false, true);
    }
}
