package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.uv;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class g1 extends uv {
    public final /* synthetic */ k1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, y3 y3Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(y3Var, context, d6Var, arrayList);
        this.W = k1Var;
    }

    @Override // org.telegram.ui.Components.uv
    public final void Y() {
        this.W.dismiss();
    }
}
