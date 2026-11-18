package ug;

import android.content.Context;
import bi.z8;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g1 extends bv {
    public final /* synthetic */ i1 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, z8 z8Var, Context context, i6 i6Var, ArrayList arrayList) {
        super(z8Var, context, i6Var, arrayList);
        this.R1 = i1Var;
    }

    @Override // org.telegram.ui.Components.bv
    public final void M0() {
        this.R1.dismiss();
    }
}
