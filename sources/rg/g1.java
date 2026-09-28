package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.uv;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
