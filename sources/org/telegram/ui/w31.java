package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class w31 implements y31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.Components.yn0 d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.yn0 yn0Var) {
        this.a = n2Var;
        this.b = context;
        this.c = f6Var;
        this.d = yn0Var;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(26, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
