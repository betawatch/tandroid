package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b0 extends s0 {
    public final /* synthetic */ l0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l0 l0Var, Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.S = l0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.b2) {
            return;
        }
        super.invalidate();
    }
}
