// default package

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
