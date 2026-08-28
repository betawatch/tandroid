package zf;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.dv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 extends dv {
    public final /* synthetic */ k1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k1 k1Var, bg.i1 i1Var, Context context, b6 b6Var, ArrayList arrayList) {
        super(i1Var, context, b6Var, arrayList);
        this.S = k1Var;
    }

    @Override // org.telegram.ui.Components.dv
    public final void X() {
        this.S.dismiss();
    }
}
