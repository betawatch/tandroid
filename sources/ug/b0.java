package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b0 extends s0 {
    public final /* synthetic */ l0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l0 l0Var, Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.S = l0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.b2) {
            return;
        }
        super.invalidate();
    }
}
