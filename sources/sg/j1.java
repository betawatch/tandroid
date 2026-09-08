package sg;

import android.content.Context;
import bi.l3;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.rv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j1 extends rv {
    public final /* synthetic */ o1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(o1 o1Var, l3 l3Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(l3Var, context, f6Var, arrayList);
        this.W = o1Var;
    }

    @Override // org.telegram.ui.Components.rv
    public final void Y() {
        this.W.dismiss();
    }
}
