package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b0 extends sg.w0 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ tp0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(tp0 tp0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = tp0Var;
        this.E = bitmap2;
    }

    @Override // sg.w0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        tp0 tp0Var = this.F;
        tp0Var.c1.b(indexOf);
        tp0Var.w(hVar);
    }
}
