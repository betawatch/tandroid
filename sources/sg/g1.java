package sg;

import ai.z4;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class g1 extends aw {
    public final /* synthetic */ l1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, z4 z4Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(z4Var, context, d6Var, arrayList);
        this.W = l1Var;
    }

    @Override // org.telegram.ui.Components.aw
    public final void Z() {
        this.W.dismiss();
    }
}
