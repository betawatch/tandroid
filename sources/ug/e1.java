package ug;

import android.content.Context;
import bi.t6;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.wu;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
