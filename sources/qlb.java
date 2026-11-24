// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qlb extends FrameLayout {
    public final /* synthetic */ byte a;
    public final RectF b;
    public final /* synthetic */ qmb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlb(qmb qmbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.c = qmbVar;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = qmbVar;
                this.b = new RectF();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        qmb qmbVar = this.c;
        RectF rectF = this.b;
        switch (b) {
            case 0:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qlb qlbVar = qmbVar.F0;
                gmb gmbVar = qmbVar.z0;
                slb slbVar = qmbVar.a;
                bkb.s(qlbVar, gmbVar, slbVar);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, slbVar.d("paintChatActionBackground"));
                if (bkb.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, slbVar.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qlb qlbVar2 = qmbVar.G0;
                gmb gmbVar2 = qmbVar.z0;
                slb slbVar2 = qmbVar.a;
                bkb.s(qlbVar2, gmbVar2, slbVar2);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, slbVar2.d("paintChatActionBackground"));
                if (bkb.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, slbVar2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
