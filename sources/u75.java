// default package

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class u75 extends Paint {
    public final /* synthetic */ j95 a;

    public u75(j95 j95Var) {
        this.a = j95Var;
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
