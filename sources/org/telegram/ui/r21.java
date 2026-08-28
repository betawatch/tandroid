package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r21 implements t21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ org.telegram.ui.Components.jg0 d;

    public r21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.jg0 jg0Var) {
        this.a = o2Var;
        this.b = context;
        this.c = b6Var;
        this.d = jg0Var;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void b() {
        AndroidUtilities.runOnUIThread(new n21(2, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        o2Var.showDialog(new zf.x0(o2Var, 3, true));
    }
}
