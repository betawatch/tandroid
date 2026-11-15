package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h0 extends LimitPreviewView {
    public final /* synthetic */ i0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context, int i7, int i10, int i11, float f10, e6 e6Var) {
        super(context, i7, i10, i11, f10, e6Var);
        this.q0 = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.b2) {
            return;
        }
        super.invalidate();
    }
}
