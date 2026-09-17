package sg;

import android.content.Context;
import bi.l3;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.rv;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class j1 extends rv {
    public final /* synthetic */ o1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(o1 o1Var, l3 l3Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(l3Var, context, f6Var, arrayList);
        this.W = o1Var;
    }

    @Override // org.telegram.ui.Components.rv
    public final void Y() {
        this.W.dismiss();
    }
}
