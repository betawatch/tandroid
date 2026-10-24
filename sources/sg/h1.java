package sg;

import ai.a5;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aw;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h1 extends aw {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, a5 a5Var, Context context, g6 g6Var, ArrayList arrayList) {
        super(a5Var, context, g6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.aw
    public final void i0() {
        this.W.dismiss();
    }
}
