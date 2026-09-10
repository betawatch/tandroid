package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import xh.l8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g0 extends LinearLayout {
    public l8 a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.d6 e;
    public final /* synthetic */ j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, Context context) {
        super(context);
        this.f = j0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        j0 j0Var = this.f;
        l0 l0Var = j0Var.f;
        if (l0Var != null) {
            int b10 = o.b(l0Var.a, l0Var.b(), 3);
            l0 l0Var2 = j0Var.f;
            int b11 = o.b(l0Var2.a, l0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            l0 l0Var3 = j0Var.f;
            long j10 = l0Var3.b;
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (j3 != j10) {
                d6Var.d(l0Var3.a(), true);
            }
            float d = d6Var.d(j0Var.f.a(), false);
            this.d = j0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new l8(1, MediaDataController.MAX_LINKS_COUNT);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        l8 l8Var = this.a;
        l8Var.h = 30.0f;
        l8Var.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
