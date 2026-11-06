package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b0 extends sg.w0 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ up0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(up0 up0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = up0Var;
        this.E = bitmap2;
    }

    @Override // sg.w0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        up0 up0Var = this.F;
        up0Var.c1.b(indexOf);
        up0Var.w(hVar);
    }
}
