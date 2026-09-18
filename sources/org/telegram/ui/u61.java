package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class u61 extends org.telegram.ui.Components.ix0 {
    public final /* synthetic */ v61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u61(v61 v61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.z3 = v61Var;
    }

    @Override // org.telegram.ui.Components.ix0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.ix0
    public final void F1(int i10) {
        super.F1(i10);
        this.z3.d(false);
    }
}
