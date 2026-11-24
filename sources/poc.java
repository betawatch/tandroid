// default package

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class poc extends io {
    public final /* synthetic */ byte s;
    public final /* synthetic */ soc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poc(soc socVar, Context context, byte b) {
        super(context, false, true, true, true, true);
        this.s = b;
        this.w = socVar;
    }

    public final /* synthetic */ void e(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final /* synthetic */ void f(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // io, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        byte b2 = 6;
        soc socVar = this.w;
        switch (b) {
            case 0:
                float c = getDrawable().c();
                float a = socVar.a();
                float min = (((c > 0.0f ? Math.min(1.0f, socVar.V / c) : 1.0f) - a) * socVar.U) + a;
                socVar.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - socVar.U) * socVar.g0.e(false, socVar.e0);
                ho drawable = getDrawable();
                Objects.requireNonNull(drawable);
                socVar.c(e, new lcc(drawable, b2), new qhc((Object) this, (Object) canvas, (byte) 17));
                canvas.restoreToCount(save);
                break;
            default:
                float e2 = (1.0f - socVar.U) * socVar.g0.e(false, socVar.e0);
                ho drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                socVar.c(e2, new lcc(drawable2, b2), new qhc((Object) this, (Object) canvas, (byte) 18));
                break;
        }
    }
}
