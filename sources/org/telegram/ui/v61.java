package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v61 extends org.telegram.ui.Components.ww0 {
    public final /* synthetic */ w61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v61(w61 w61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.z3 = w61Var;
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.ww0
    public final void E1(int i10) {
        super.E1(i10);
        this.z3.d(false);
    }
}
