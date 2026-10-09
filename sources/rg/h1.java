package rg;

import ai.z3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.iw;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h1 extends iw {
    public final /* synthetic */ l1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l1 l1Var, z3 z3Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(z3Var, context, e6Var, arrayList);
        this.W = l1Var;
    }

    @Override // org.telegram.ui.Components.iw
    public final void Z() {
        this.W.dismiss();
    }
}
