package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b0 extends sg.u0 {
    public final /* synthetic */ Bitmap F;
    public final /* synthetic */ vp0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(vp0 vp0Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = vp0Var;
        this.F = bitmap2;
    }

    @Override // sg.u0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.F != null) {
            indexOf = i7;
        }
        vp0 vp0Var = this.G;
        vp0Var.d1.b(indexOf);
        vp0Var.w(hVar);
    }
}
