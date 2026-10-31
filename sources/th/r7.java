package th;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r7 extends jg.y0 {
    public final /* synthetic */ s7 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(s7 s7Var, Context context, float f7) {
        super(context, f7);
        this.Q = s7Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
