package zf;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b0 extends yf.b1 {
    public final /* synthetic */ Bitmap A;
    public final /* synthetic */ ys0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ys0 ys0Var, Context context, yf.p0 p0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, p0Var, bitmap, null, null);
        this.B = ys0Var;
        this.A = bitmap2;
    }

    @Override // yf.b1
    public final void g(yf.m mVar) {
        int indexOf = yf.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.A != null) {
            indexOf = i10;
        }
        ys0 ys0Var = this.B;
        ys0Var.p1.b(indexOf);
        ys0Var.l(mVar);
    }
}
