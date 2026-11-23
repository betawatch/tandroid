package ug;

import android.content.Context;
import bi.e9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f1 extends bv {
    public final /* synthetic */ h1 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, e9 e9Var, Context context, i6 i6Var, ArrayList arrayList) {
        super(e9Var, context, i6Var, arrayList);
        this.R1 = h1Var;
    }

    @Override // org.telegram.ui.Components.bv
    public final void M0() {
        this.R1.dismiss();
    }
}
