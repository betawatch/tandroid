// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
