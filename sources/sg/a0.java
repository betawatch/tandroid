package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class a0 extends r0 {
    public final /* synthetic */ k0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k0 k0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.P = k0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P.f0) {
            return;
        }
        super.invalidate();
    }
}
