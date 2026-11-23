package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l00;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m1 implements l00 {
    public final /* synthetic */ Context a;

    public m1(Context context) {
        this.a = context;
    }

    @Override // org.telegram.ui.Components.l00
    public final void a() {
        z0 z0Var = z0.z;
        synchronized (z0Var.e) {
            z0Var.p = false;
        }
        z0Var.f.removeCallbacks(z0Var.y);
        z0Var.f.postDelayed(z0Var.y, 30000L);
    }

    @Override // org.telegram.ui.Components.l00
    public final void b() {
        Utilities.e.c(new j0(this.a, 4));
    }
}
