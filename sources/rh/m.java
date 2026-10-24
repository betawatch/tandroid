package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.th0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new m());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        th0 th0Var = (th0) view;
        th0Var.a((TLObject) m61Var.G, true, m61Var.z);
        th0Var.setOnClickListener(m61Var.D);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return m61Var.B == m61Var2.B;
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        th0 th0Var = new th0(context);
        th0Var.setBackground(k6.M0(false));
        return th0Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.B == m61Var2.B;
    }
}
