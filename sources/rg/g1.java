package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.tv;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g1 extends tv {
    public final /* synthetic */ k1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, y3 y3Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(y3Var, context, d6Var, arrayList);
        this.W = k1Var;
    }

    @Override // org.telegram.ui.Components.tv
    public final void Y() {
        this.W.dismiss();
    }
}
