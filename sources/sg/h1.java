package sg;

import android.content.Context;
import bi.o3;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ew;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h1 extends ew {
    public final /* synthetic */ m1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, o3 o3Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(o3Var, context, c6Var, arrayList);
        this.W = m1Var;
    }

    @Override // org.telegram.ui.Components.ew
    public final void Z() {
        this.W.dismiss();
    }
}
