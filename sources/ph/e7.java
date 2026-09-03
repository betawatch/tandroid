package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class e7 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ f7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(f7 f7Var, Context context) {
        super(context);
        this.e = f7Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        f7 f7Var = this.e;
        FrameLayout frameLayout = i10 <= -1 ? f7Var.b : i10 >= 1 ? f7Var.f : f7Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f7 f7Var = this.e;
        int floor = (int) Math.floor(f7Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(f7Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f10 = f7Var.r;
        float floor2 = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF, rectF2, floor2, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i0.a.d(f7Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
