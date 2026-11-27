// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class x8b extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ y8b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8b(y8b y8bVar, Activity activity) {
        super(activity);
        this.e = y8bVar;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i) {
        y8b y8bVar = this.e;
        FrameLayout frameLayout = i <= -1 ? y8bVar.b : i >= 1 ? y8bVar.f : y8bVar.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - hl.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y8b y8bVar = this.e;
        int floor = (int) Math.floor(y8bVar.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(y8bVar.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f = y8bVar.r;
        float floor2 = f - ((float) Math.floor(f));
        RectF rectF3 = this.c;
        hl.X1(rectF, rectF2, floor2, rectF3);
        int p1 = aob.p1(0.15f, vm2.f(y8bVar.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
