package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.ui.ActionBar.t6;
import w7.k8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends k8 {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final /* synthetic */ f c;

    public b(f fVar) {
        this.c = fVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
    }

    @Override // w7.k8
    public final void b(Canvas canvas, hi.a aVar) {
        f fVar = this.c;
        e eVar = fVar.M;
        int i10 = fVar.c;
        if (i10 == 0) {
            return;
        }
        int r12 = t6.r1(i10 / 255.0f, fVar.s);
        if (Color.alpha(fVar.r) > 0 && i10 == 255) {
            float f7 = fVar.R;
            if (f7 > 0.0f) {
                float f10 = fVar.P;
                float f11 = fVar.Q;
                int r13 = t6.r1(f7, fVar.r);
                Paint paint = this.b;
                paint.setShadowLayer(f10, 0.0f, f11, r13);
                eVar.c(canvas, paint, fVar.O);
            }
        }
        Rect rect = eVar.m;
        float f12 = rect.left;
        float f13 = fVar.d;
        float f14 = f12 + f13;
        float f15 = rect.top;
        float f16 = fVar.e;
        float f17 = f15 + f16;
        float f18 = rect.right;
        float f19 = f18 + f13;
        float f20 = rect.bottom;
        float f21 = f20 + f16;
        boolean z10 = i10 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f12, f15, f18, f20, i10);
        }
        canvas.save();
        canvas.clipPath(eVar.k);
        canvas.translate(rect.left, rect.top);
        canvas.translate(-f14, -f17);
        aVar.e(canvas, f14, f17, f19, f21);
        canvas.restore();
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.a;
            paint2.setColor(r12);
            eVar.b(canvas, paint2);
        }
        if (z10) {
            canvas.restore();
        }
    }
}
