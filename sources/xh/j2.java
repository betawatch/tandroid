package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.yr0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class j2 extends s61 {
    public final /* synthetic */ yr0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Context context, int i10, hi.a aVar, i2 i2Var, i2 i2Var2, f6 f6Var, yr0 yr0Var) {
        super(context, i10, 0, false, aVar, i2Var, i2Var2, f6Var, 3, 1);
        this.f3 = yr0Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3.o();
    }
}
