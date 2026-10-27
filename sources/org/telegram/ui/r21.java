package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r21 implements s21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ org.telegram.ui.Components.u90 d;

    public r21(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.u90 u90Var) {
        this.a = r2Var;
        this.b = context;
        this.c = u6Var;
        this.d = u90Var;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        AndroidUtilities.runOnUIThread(new l21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(17, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void c() {
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        r2Var.showDialog(new tg.y0(r2Var, 3, true));
    }
}
