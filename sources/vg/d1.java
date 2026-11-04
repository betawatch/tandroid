package vg;

import ai.c7;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.pu;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d1 extends pu {
    public final /* synthetic */ h1 O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(h1 h1Var, c7 c7Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(c7Var, context, e6Var, arrayList);
        this.O1 = h1Var;
    }

    @Override // org.telegram.ui.Components.pu
    public final void L0() {
        this.O1.dismiss();
    }
}
