package zf;

import android.content.Context;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h0 extends LimitPreviewView {
    public final /* synthetic */ i0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context, int i9, int i10, int i11, float f10, b6 b6Var) {
        super(context, i9, i10, i11, f10, b6Var);
        this.i0 = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.i0.e.b0) {
            return;
        }
        super.invalidate();
    }
}
