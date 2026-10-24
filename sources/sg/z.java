package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class z extends p0 {
    public final /* synthetic */ j0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.R = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.R.f0) {
            return;
        }
        super.invalidate();
    }
}
