package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i0 extends LimitPreviewView {
    public final /* synthetic */ j0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Context context, int i7, int i10, int i11, float f10, h6 h6Var) {
        super(context, i7, i10, i11, f10, h6Var);
        this.q0 = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.b2) {
            return;
        }
        super.invalidate();
    }
}
