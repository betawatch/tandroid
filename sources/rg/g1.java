package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.sv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g1 extends sv {
    public final /* synthetic */ k1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, y3 y3Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(y3Var, context, e6Var, arrayList);
        this.W = k1Var;
    }

    @Override // org.telegram.ui.Components.sv
    public final void Y() {
        this.W.dismiss();
    }
}
