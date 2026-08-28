package yf;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b0 extends xf.c1 {
    public final /* synthetic */ Bitmap A;
    public final /* synthetic */ xs0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xs0 xs0Var, Context context, xf.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.B = xs0Var;
        this.A = bitmap2;
    }

    @Override // xf.c1
    public final void g(xf.m mVar) {
        int indexOf = xf.m.a.indexOf(mVar);
        int i9 = indexOf + 1;
        if (i9 <= 1 || this.A != null) {
            indexOf = i9;
        }
        xs0 xs0Var = this.B;
        xs0Var.p1.b(indexOf);
        xs0Var.n(mVar);
    }
}
