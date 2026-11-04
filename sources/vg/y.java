package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y extends o0 {
    public final /* synthetic */ i0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i0 i0Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.S = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.Y1) {
            return;
        }
        super.invalidate();
    }
}
