// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ppb extends FrameLayout {
    public final /* synthetic */ byte a;
    public final RectF b;
    public final /* synthetic */ pqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppb(pqb pqbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.c = pqbVar;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = pqbVar;
                this.b = new RectF();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        pqb pqbVar = this.c;
        RectF rectF = this.b;
        switch (b) {
            case 0:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ppb ppbVar = pqbVar.F0;
                fqb fqbVar = pqbVar.z0;
                rpb rpbVar = pqbVar.a;
                aob.s(ppbVar, fqbVar, rpbVar);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar.d("paintChatActionBackground"));
                if (aob.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ppb ppbVar2 = pqbVar.G0;
                fqb fqbVar2 = pqbVar.z0;
                rpb rpbVar2 = pqbVar.a;
                aob.s(ppbVar2, fqbVar2, rpbVar2);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar2.d("paintChatActionBackground"));
                if (aob.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
