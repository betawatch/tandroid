// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q14 extends be0 {
    public final /* synthetic */ r14 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q14(r14 r14Var, Context context) {
        super(context);
        this.H = r14Var;
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r14 r14Var = this.H;
        t14 t14Var = r14Var.d;
        boolean z = r14Var.c;
        if (z) {
            return;
        }
        if (!hq6.d0(t14Var.d1).v0[z ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || t14Var.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - gl.L(8.0f), gl.L(14.0f), gl.L(3.0f), t14Var.t1);
    }
}
