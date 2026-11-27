// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ul4 extends View {
    public final RectF a;
    public final rj4 b;
    public long c;
    public final /* synthetic */ xl4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul4(xl4 xl4Var, Activity activity) {
        super(activity);
        this.d = xl4Var;
        this.a = new RectF();
        this.b = new rj4(this, (byte) 3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xl4 xl4Var = this.d;
        je8 je8Var = xl4Var.b;
        long duration = je8Var.getDuration();
        if (duration > 0 && aob.k2 != null) {
            float a = ete.a(je8Var.k() / duration, 0.0f, 1.0f);
            float N = hl.N(1.5f);
            RectF rectF = this.a;
            rectF.set(N, N, getWidth() - N, getHeight() - N);
            canvas.drawArc(rectF, -90.0f, a * 360.0f, false, aob.k2);
        }
        rj4 rj4Var = this.b;
        removeCallbacks(rj4Var);
        if (xl4Var.N) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.c > 500) {
            this.c = elapsedRealtime;
            xl4Var.u();
        }
        if (je8Var.i()) {
            postInvalidateOnAnimation();
        } else {
            postDelayed(rj4Var, 250L);
        }
    }
}
