package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y61 extends org.telegram.ui.Components.yx0 {
    public final /* synthetic */ z61 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(z61 z61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.x3 = z61Var;
    }

    @Override // org.telegram.ui.Components.yx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.x3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.yx0
    public final void F1(int i10) {
        super.F1(i10);
        this.x3.d(false);
    }
}
