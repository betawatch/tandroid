// default package

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q75 extends Paint {
    public final /* synthetic */ g95 a;

    public q75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        super.setAlpha(i);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
