package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b0 extends sg.u0 {
    public final /* synthetic */ Bitmap F;
    public final /* synthetic */ tp0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(tp0 tp0Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = tp0Var;
        this.F = bitmap2;
    }

    @Override // sg.u0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.F != null) {
            indexOf = i7;
        }
        tp0 tp0Var = this.G;
        tp0Var.d1.b(indexOf);
        tp0Var.w(hVar);
    }
}
