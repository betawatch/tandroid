package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w31 implements y31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.ui.Components.ny d;

    public w31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ny nyVar) {
        this.a = n2Var;
        this.b = context;
        this.c = e6Var;
        this.d = nyVar;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void b() {
        AndroidUtilities.runOnUIThread(new iy0(20, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
