package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a0 extends r0 {
    public final /* synthetic */ k0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k0 k0Var, Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.S = k0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.b2) {
            return;
        }
        super.invalidate();
    }
}
