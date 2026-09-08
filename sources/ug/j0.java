package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.x9;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final x9 a;
    public final i0 b;
    public final Paint c;
    public boolean d;
    public final i9 e;

    public j0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new i9((f6) null);
        x9 x9Var = new x9(getContext());
        this.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(f7));
        i0 i0Var = new i0(context);
        TextPaint textPaint = new TextPaint(1);
        i0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = j6.a7;
        textPaint.setColor(j6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = i0Var;
        i0Var.setAlpha(0.0f);
        addView(x9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i0Var, x5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }
}
