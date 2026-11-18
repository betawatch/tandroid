package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j0 extends LimitPreviewView {
    public final /* synthetic */ k0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, Context context, int i7, int i10, int i11, float f10, i6 i6Var) {
        super(context, i7, i10, i11, f10, i6Var);
        this.q0 = k0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.b2) {
            return;
        }
        super.invalidate();
    }
}
