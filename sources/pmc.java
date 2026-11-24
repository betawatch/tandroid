// default package

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class pmc extends hn {
    public final /* synthetic */ byte s;
    public final /* synthetic */ smc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmc(smc smcVar, Context context, byte b) {
        super(context, false, true, true, true, true);
        this.s = b;
        this.w = smcVar;
    }

    public final /* synthetic */ void e(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final /* synthetic */ void f(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // hn, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        byte b2 = 2;
        smc smcVar = this.w;
        switch (b) {
            case 0:
                float c = getDrawable().c();
                float a = smcVar.a();
                float min = (((c > 0.0f ? Math.min(1.0f, smcVar.V / c) : 1.0f) - a) * smcVar.U) + a;
                smcVar.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - smcVar.U) * smcVar.g0.e(false, smcVar.e0);
                gn drawable = getDrawable();
                Objects.requireNonNull(drawable);
                smcVar.c(e, new dkc(drawable, b2), new mhc(this, canvas, (byte) 15));
                canvas.restoreToCount(save);
                break;
            default:
                float e2 = (1.0f - smcVar.U) * smcVar.g0.e(false, smcVar.e0);
                gn drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                smcVar.c(e2, new dkc(drawable2, b2), new mhc(this, canvas, (byte) 16));
                break;
        }
    }
}
