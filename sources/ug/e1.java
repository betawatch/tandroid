package ug;

import android.content.Context;
import bi.t6;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.wu;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e1 extends wu {
    public final /* synthetic */ g1 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, t6 t6Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(t6Var, context, e6Var, arrayList);
        this.R1 = g1Var;
    }

    @Override // org.telegram.ui.Components.wu
    public final void L0() {
        this.R1.dismiss();
    }
}
