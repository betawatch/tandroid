package zf;

import android.content.Context;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y extends p0 {
    public final /* synthetic */ j0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(j0 j0Var, Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.L = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.L.b0) {
            return;
        }
        super.invalidate();
    }
}
