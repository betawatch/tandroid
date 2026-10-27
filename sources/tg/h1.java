package tg;

import android.content.Context;
import bi.v4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.aw;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h1 extends aw {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, v4 v4Var, Context context, u6 u6Var, ArrayList arrayList) {
        super(v4Var, context, u6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.aw
    public final void i0() {
        this.W.dismiss();
    }
}
