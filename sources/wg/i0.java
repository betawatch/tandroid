package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout implements a6 {
    public static final /* synthetic */ int f = 0;
    public final l9 a;
    public final h0 b;
    public final Paint c;
    public boolean d;
    public final w8 e;

    public i0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new w8((f6) null);
        l9 l9Var = new l9(getContext());
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        h0 h0Var = new h0(context);
        TextPaint textPaint = new TextPaint(1);
        h0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = k6.a7;
        textPaint.setColor(k6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.b = h0Var;
        h0Var.setAlpha(0.0f);
        addView(l9Var, ha.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(h0Var, ha.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(k6.x0(null, i7, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.c.setColor(k6.x0(null, k6.a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
