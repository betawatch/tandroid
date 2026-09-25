package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ts extends gg.u1 {
    public final /* synthetic */ ContactsActivity K;

    public ts(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
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
        gg.c2 c2Var = new gg.c2(true);
        this.f = c2Var;
        c2Var.a = new gg.r1(this);
    }

    @Override // gg.u1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.K.e.e(false, true);
    }
}
