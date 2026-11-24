// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vxa extends be0 {
    public final /* synthetic */ wjb H;
    public final /* synthetic */ xxa I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxa(xxa xxaVar, Context context, wjb wjbVar) {
        super(context);
        this.I = xxaVar;
        this.H = wjbVar;
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        xxa xxaVar = this.I;
        u2b u2bVar = xxaVar.r;
        rxa rxaVar = xxaVar.w;
        if (rxaVar == null || !(rxaVar.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = gl.L(1.0f);
        u2bVar.F.set(L, L, getMeasuredWidth() - r0, getMeasuredHeight() - r0);
        u2bVar.a = false;
        u2bVar.b = false;
        u2bVar.v = true;
        u2bVar.o = false;
        u2bVar.z = 1;
        u2bVar.J = this.H;
        x2b.h(0L, canvas, this.a, u2bVar);
    }
}
