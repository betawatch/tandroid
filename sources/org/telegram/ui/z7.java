package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ tn a;
    public final /* synthetic */ a8 b;

    public z7(a8 a8Var, tn tnVar) {
        this.b = a8Var;
        this.a = tnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        c8 c8Var = this.b.b;
        c8Var.x.finishFragment();
        f8 f8Var = c8Var.x;
        this.a.S7(f8Var.L, f8Var.M + 86400, z10);
    }
}
