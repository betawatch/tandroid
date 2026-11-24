// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class z6b extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ a7b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6b(a7b a7bVar, Activity activity) {
        super(activity);
        this.e = a7bVar;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i) {
        a7b a7bVar = this.e;
        FrameLayout frameLayout = i <= -1 ? a7bVar.b : i >= 1 ? a7bVar.f : a7bVar.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - gm.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a7b a7bVar = this.e;
        int floor = (int) Math.floor(a7bVar.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(a7bVar.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f = a7bVar.r;
        float floor2 = f - ((float) Math.floor(f));
        RectF rectF3 = this.c;
        gm.X1(rectF, rectF2, floor2, rectF3);
        int p1 = cmb.p1(0.15f, on2.f(a7bVar.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
