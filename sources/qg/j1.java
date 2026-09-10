package qg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j1 extends wv {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, bi.o1 o1Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(o1Var, context, f6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.wv
    public final void Y() {
        this.W.dismiss();
    }
}
