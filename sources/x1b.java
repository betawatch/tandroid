// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x1b extends de0 {
    public final /* synthetic */ vnb H;
    public final /* synthetic */ z1b I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1b(z1b z1bVar, Context context, vnb vnbVar) {
        super(context);
        this.I = z1bVar;
        this.H = vnbVar;
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        z1b z1bVar = this.I;
        q6b q6bVar = z1bVar.r;
        t1b t1bVar = z1bVar.w;
        if (t1bVar == null || !(t1bVar.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = hl.L(1.0f);
        q6bVar.F.set(L, L, getMeasuredWidth() - r0, getMeasuredHeight() - r0);
        q6bVar.a = false;
        q6bVar.b = false;
        q6bVar.v = true;
        q6bVar.o = false;
        q6bVar.z = 1;
        q6bVar.J = this.H;
        t6b.h(0L, canvas, this.a, q6bVar);
    }
}
