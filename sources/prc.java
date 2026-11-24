// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class prc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ qrc h;

    public prc(qrc qrcVar, prc prcVar, float f, boolean z) {
        float A;
        this.h = qrcVar;
        this.f = z;
        this.b = f;
        this.a = prcVar != null ? prcVar.a : f;
        this.g = (prcVar == null || z) ? SystemClock.uptimeMillis() : prcVar.g;
        float f2 = 0.0f;
        float a = (prcVar == null || !z) ? 0.0f : prcVar.a();
        if (prcVar != null) {
            float f3 = prcVar.c;
            f2 = td4.A(1.0f, f3, a, f3);
        }
        this.c = f2;
        if (prcVar == null) {
            A = qrcVar.P;
        } else {
            float f4 = prcVar.d;
            A = td4.A(1.0f, f4, a, f4);
        }
        this.d = A;
        this.e = prcVar == null ? (-gm.N(44.0f)) * 0.1f : prcVar.e * (1.0f - a);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return qrc.T.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f, int i) {
        float a = a();
        boolean z = this.f;
        float f2 = z ? 0.0f : 1.0f;
        float f3 = this.c;
        float A = td4.A(f2, f3, a, f3);
        if (A <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f;
        float f4 = i;
        float f5 = this.e;
        canvas.translate(d, td4.A(z ? gm.N(44.0f) * 0.1f : 0.0f, f5, a, f4 + f5));
        float f6 = z ? this.h.P : 1.0f;
        float f7 = this.d;
        float A2 = td4.A(f6, f7, a, f7);
        canvas.scale(A2, A2, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * A));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final prc c() {
        qrc qrcVar = this.h;
        return qrcVar.J >= 1.0f ? new prc(qrcVar, d()) : new prc(qrcVar, d(), this);
    }

    public final float d() {
        float f = this.b;
        float f2 = this.a;
        return (qrc.T.getInterpolation(this.h.J) * (f - f2)) + f2;
    }

    public prc(qrc qrcVar, float f) {
        this.h = qrcVar;
        this.f = false;
        this.b = f;
        this.a = f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public prc(qrc qrcVar, float f, prc prcVar) {
        this.h = qrcVar;
        this.f = prcVar.f;
        this.b = f;
        this.a = f;
        this.c = prcVar.c;
        this.d = prcVar.d;
        this.e = prcVar.e;
        this.g = prcVar.g;
    }
}
