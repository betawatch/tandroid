package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z61 extends org.telegram.ui.Components.hx0 {
    public final /* synthetic */ a71 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(a71 a71Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.z3 = a71Var;
    }

    @Override // org.telegram.ui.Components.hx0
    public final void D1(int i10) {
        super.D1(i10);
        this.z3.d(false);
    }

    @Override // org.telegram.ui.Components.hx0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }
}
