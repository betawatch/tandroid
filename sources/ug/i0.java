package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final z9 a;
    public final h0 b;
    public final Paint c;
    public boolean d;
    public final k9 e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new k9((c6) null);
        z9 z9Var = new z9(getContext());
        this.a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(f7));
        h0 h0Var = new h0(context);
        TextPaint textPaint = new TextPaint(1);
        h0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = g6.a7;
        textPaint.setColor(g6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = h0Var;
        h0Var.setAlpha(0.0f);
        addView(z9Var, z5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView(h0Var, z5.a(26.0f, 0.0f, 0.0f, 1.0f, 3.0f, 26, 85));
        paint.setColor(g6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }
}
