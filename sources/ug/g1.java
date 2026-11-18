package ug;

import android.content.Context;
import bi.y8;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g1 extends bv {
    public final /* synthetic */ i1 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, y8 y8Var, Context context, i6 i6Var, ArrayList arrayList) {
        super(y8Var, context, i6Var, arrayList);
        this.R1 = i1Var;
    }

    @Override // org.telegram.ui.Components.bv
    public final void M0() {
        this.R1.dismiss();
    }
}
