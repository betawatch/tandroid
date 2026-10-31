package uh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new j());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        k kVar = (k) view;
        m10 m10Var = (m10) a51Var.G;
        kVar.a.setText(m10Var.b);
        kVar.b.setText(m10Var.c);
        if (kVar.c != z10) {
            kVar.invalidate();
        }
        kVar.c = z10;
        kVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new k(context);
    }
}
