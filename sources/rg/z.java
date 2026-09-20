package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z extends p0 {
    public final /* synthetic */ j0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.P = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P.f0) {
            return;
        }
        super.invalidate();
    }
}
