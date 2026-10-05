package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.wv;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h1 extends wv {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, y3 y3Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(y3Var, context, d6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.wv
    public final void X() {
        this.W.dismiss();
    }
}
