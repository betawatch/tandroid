package tg;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j2 extends i0 {
    public final /* synthetic */ l2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, Context context, float f10) {
        super(context, f10);
        this.u0 = l2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
