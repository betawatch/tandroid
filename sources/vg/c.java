package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import g.y;
import w7.k8;
import w7.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends k8 {
    public NinePatchDrawable c;
    public long d;
    public final /* synthetic */ f f;
    public final y a = new y();
    public final Rect b = new Rect();
    public final Bitmap[] e = new Bitmap[1];

    public c(f fVar) {
        this.f = fVar;
    }

    @Override // w7.k8
    public final void b(Canvas canvas, hi.a aVar) {
        hi.a u10 = f.u(aVar);
        f fVar = this.f;
        c(canvas, i0.b.k(fVar.s, (Color.alpha(fVar.s) == 255 || !(u10 instanceof hi.c)) ? 0 : ((hi.c) u10).b));
    }

    public final void c(Canvas canvas, int i10) {
        f fVar = this.f;
        e eVar = fVar.M;
        if (Color.alpha(i10) == 0 && Color.alpha(fVar.r) == 0) {
            return;
        }
        y yVar = this.a;
        yVar.a = 0L;
        yVar.b = false;
        yVar.a(i10);
        yVar.a(fVar.r);
        for (float f7 : eVar.b) {
            yVar.c(f7);
        }
        yVar.c(fVar.P);
        yVar.c(0.0f);
        yVar.c(fVar.Q);
        long j10 = yVar.b ? -1L : yVar.a;
        NinePatchDrawable ninePatchDrawable = this.c;
        Rect rect = this.b;
        if (ninePatchDrawable == null || this.d != j10) {
            this.d = j10;
            NinePatchDrawable b10 = k9.b(this.e, i10, eVar.b, fVar.P, fVar.r, fVar.Q, Color.alpha(i10) == 255 ? i10 : 1);
            this.c = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.c;
        Rect rect2 = eVar.m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(fVar.c);
        ninePatchDrawable2.draw(canvas);
    }
}
