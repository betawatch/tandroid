package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class y31 implements a41 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.Components.jn0 d;

    public y31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var) {
        this.a = n2Var;
        this.b = context;
        this.c = f6Var;
        this.d = jn0Var;
    }

    @Override // org.telegram.ui.a41
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.a41
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(26, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.a41
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new sg.a1(n2Var, 3, true));
    }
}
