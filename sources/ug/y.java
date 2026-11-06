package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y extends p0 {
    public final /* synthetic */ i0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i0 i0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.R = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.R.X1) {
            return;
        }
        super.invalidate();
    }
}
