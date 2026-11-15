package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z extends q0 {
    public final /* synthetic */ j0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.S = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.b2) {
            return;
        }
        super.invalidate();
    }
}
