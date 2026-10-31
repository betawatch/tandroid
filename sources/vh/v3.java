package vh;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.Components.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v3 extends ig.c1 {
    public final /* synthetic */ s7 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(s7 s7Var, Context context, ig.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, s9 s9Var) {
        super(context, q0Var, bitmap, bitmap2, s9Var);
        this.E = s7Var;
    }

    @Override // ig.c1
    public final void g(ig.h hVar) {
        int indexOf = ig.h.a.indexOf(hVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        s7 s7Var = this.E;
        s7Var.T0.b(indexOf);
        s7Var.z(hVar);
    }
}
