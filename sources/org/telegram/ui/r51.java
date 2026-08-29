package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r51 extends org.telegram.ui.Components.ow0 {
    public final /* synthetic */ s51 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(s51 s51Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.v3 = s51Var;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.v3.y.S == 4;
    }

    @Override // org.telegram.ui.Components.ow0
    public final void E1(int i10) {
        super.E1(i10);
        this.v3.d(false);
    }
}
