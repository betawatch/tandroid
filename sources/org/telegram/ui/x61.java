package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class x61 extends org.telegram.ui.Components.jx0 {
    public final /* synthetic */ y61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(y61 y61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.z3 = y61Var;
    }

    @Override // org.telegram.ui.Components.jx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.jx0
    public final void F1(int i10) {
        super.F1(i10);
        this.z3.d(false);
    }
}
