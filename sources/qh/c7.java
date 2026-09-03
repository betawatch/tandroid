package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c7 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ d7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(d7 d7Var, Context context) {
        super(context);
        this.e = d7Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        d7 d7Var = this.e;
        FrameLayout frameLayout = i10 <= -1 ? d7Var.b : i10 >= 1 ? d7Var.f : d7Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d7 d7Var = this.e;
        int floor = (int) Math.floor(d7Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(d7Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f10 = d7Var.r;
        float floor2 = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF, rectF2, floor2, rectF3);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.15f, i0.a.d(d7Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
