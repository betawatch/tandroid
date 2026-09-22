package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ei0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new m());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ei0 ei0Var = (ei0) view;
        ei0Var.a((TLObject) i51Var.G, true, i51Var.z);
        ei0Var.setOnClickListener(i51Var.D);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.B == i51Var2.B;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        ei0 ei0Var = new ei0(context);
        ei0Var.setBackground(i6.K0(false));
        return ei0Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.B == i51Var2.B;
    }
}
