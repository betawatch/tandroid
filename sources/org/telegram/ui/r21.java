package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r21 implements t21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.Components.ii0 d;

    public r21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ii0 ii0Var) {
        this.a = o2Var;
        this.b = context;
        this.c = c6Var;
        this.d = ii0Var;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        AndroidUtilities.runOnUIThread(new l21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void b() {
        AndroidUtilities.runOnUIThread(new av0(29, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        o2Var.showDialog(new cg.p1(o2Var, 3, true));
    }
}
