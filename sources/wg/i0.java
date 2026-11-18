package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout implements c6 {
    public static final /* synthetic */ int f = 0;
    public final q9 a;
    public final h0 b;
    public final Paint c;
    public boolean d;
    public final b9 e;

    public i0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new b9((i6) null);
        q9 q9Var = new q9(getContext());
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        h0 h0Var = new h0(context);
        TextPaint textPaint = new TextPaint(1);
        h0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = n6.a7;
        textPaint.setColor(n6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.b = h0Var;
        h0Var.setAlpha(0.0f);
        addView(q9Var, ma.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(h0Var, ma.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(n6.x0(null, i7, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.c.setColor(n6.x0(null, n6.a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
