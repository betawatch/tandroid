package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g1 extends sv {
    public final /* synthetic */ k1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, y3 y3Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(y3Var, context, f6Var, arrayList);
        this.W = k1Var;
    }

    @Override // org.telegram.ui.Components.sv
    public final void Y() {
        this.W.dismiss();
    }
}
