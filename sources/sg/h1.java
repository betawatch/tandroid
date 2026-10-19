package sg;

import ai.a5;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class h1 extends aw {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, a5 a5Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(a5Var, context, d6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.aw
    public final void Z() {
        this.W.dismiss();
    }
}
