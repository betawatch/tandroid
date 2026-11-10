package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b0 extends sg.v0 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ xp0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xp0 xp0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = xp0Var;
        this.E = bitmap2;
    }

    @Override // sg.v0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        xp0 xp0Var = this.F;
        xp0Var.c1.b(indexOf);
        xp0Var.w(hVar);
    }
}
