package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class z extends p0 {
    public final /* synthetic */ j0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.P = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P.f0) {
            return;
        }
        super.invalidate();
    }
}
