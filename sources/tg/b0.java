package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b0 extends sg.v0 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ wp0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(wp0 wp0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = wp0Var;
        this.E = bitmap2;
    }

    @Override // sg.v0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        wp0 wp0Var = this.F;
        wp0Var.c1.b(indexOf);
        wp0Var.w(hVar);
    }
}
