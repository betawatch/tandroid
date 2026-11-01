package uh;

import android.content.Context;
import org.telegram.ui.Components.ew0;
import th.x4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e extends h {
    public final /* synthetic */ i w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Context context) {
        super(iVar, context);
        this.w = iVar;
    }

    @Override // uh.h, s4.g0
    public final void f() {
        super.f();
        i iVar = this.w;
        if (iVar.r.getVisibility() == 0) {
            iVar.x.f();
        }
        ew0 ew0Var = iVar.D;
        if (ew0Var != null) {
            x4 x4Var = this.e;
            ew0Var.e(x4Var != null && x4Var.k(), true);
        }
    }
}
