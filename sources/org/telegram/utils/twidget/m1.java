package org.telegram.utils.twidget;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j00;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m1 implements j00 {
    public final /* synthetic */ Context a;

    public m1(Context context) {
        this.a = context;
    }

    @Override // org.telegram.ui.Components.j00
    public final void a() {
        z0 z0Var = z0.z;
        synchronized (z0Var.e) {
            z0Var.p = false;
        }
        z0Var.f.removeCallbacks(z0Var.y);
        z0Var.f.postDelayed(z0Var.y, 30000L);
    }

    @Override // org.telegram.ui.Components.j00
    public final void b() {
        Utilities.e.c(new j0(this.a, 4));
    }
}
