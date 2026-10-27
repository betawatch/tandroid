package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i0 extends FrameLayout implements p6 {
    public static final /* synthetic */ int f = 0;
    public final y9 a;
    public final h0 b;
    public final Paint c;
    public boolean d;
    public final j9 e;

    public i0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new j9((u6) null);
        y9 y9Var = new y9(getContext());
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        h0 h0Var = new h0(context);
        TextPaint textPaint = new TextPaint(1);
        h0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = y6.a7;
        textPaint.setColor(y6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = h0Var;
        h0Var.setAlpha(0.0f);
        addView(y9Var, kb1.h(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(h0Var, kb1.h(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(y6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.c.setColor(y6.x0(null, y6.a7, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
