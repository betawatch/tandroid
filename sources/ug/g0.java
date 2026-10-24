package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout implements b6 {
    public static final /* synthetic */ int f = 0;
    public final w9 a;
    public final f0 b;
    public final Paint c;
    public boolean d;
    public final h9 e;

    public g0(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new h9((g6) null);
        w9 w9Var = new w9(getContext());
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(f7));
        f0 f0Var = new f0(context);
        TextPaint textPaint = new TextPaint(1);
        f0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = k6.a7;
        textPaint.setColor(k6.x0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = f0Var;
        f0Var.setAlpha(0.0f);
        addView(w9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(f0Var, z5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(k6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.c.setColor(k6.x0(null, k6.a7, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
