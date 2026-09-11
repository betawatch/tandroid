package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class x61 extends org.telegram.ui.Components.vw0 {
    public final /* synthetic */ y61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(y61 y61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.z3 = y61Var;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void D1(int i10) {
        super.D1(i10);
        this.z3.e(false);
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }
}
