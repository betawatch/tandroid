package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class j2 extends r61 {
    public final /* synthetic */ zr0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Context context, int i10, hi.a aVar, i2 i2Var, i2 i2Var2, d6 d6Var, zr0 zr0Var) {
        super(context, i10, 0, false, aVar, i2Var, i2Var2, d6Var, 3, 1);
        this.f3 = zr0Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3.o();
    }
}
