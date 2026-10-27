package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t51 extends org.telegram.ui.Components.cy0 {
    public final /* synthetic */ u51 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(u51 u51Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.H3 = u51Var;
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.H3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.cy0
    public final void K1(int i10) {
        super.K1(i10);
        this.H3.d(false);
    }
}
