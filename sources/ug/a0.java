package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a0 extends r0 {
    public final /* synthetic */ k0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k0 k0Var, Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.S = k0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.b2) {
            return;
        }
        super.invalidate();
    }
}
