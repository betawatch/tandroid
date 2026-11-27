// default package

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
