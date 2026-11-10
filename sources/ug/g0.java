package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g0 extends LimitPreviewView {
    public final /* synthetic */ h0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Context context, int i7, int i10, int i11, float f10, h6 h6Var) {
        super(context, i7, i10, i11, f10, h6Var);
        this.p0 = h0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
