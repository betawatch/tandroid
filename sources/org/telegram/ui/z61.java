package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z61 extends sg.c1 {
    public final /* synthetic */ a71 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(a71 a71Var, Context context) {
        super(context, 2, null);
        this.M = a71Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a71 a71Var = this.M;
        if (a71Var.getParent() instanceof View) {
            ((View) a71Var.getParent()).invalidate();
        }
    }
}
