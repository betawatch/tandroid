package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout implements z5 {
    public static final /* synthetic */ int f = 0;
    public final i9 a;
    public final f0 b;
    public final Paint c;
    public boolean d;
    public final t8 e;

    public g0(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new t8((e6) null);
        i9 i9Var = new i9(getContext());
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        f0 f0Var = new f0(context);
        TextPaint textPaint = new TextPaint(1);
        f0Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i7 = j6.a7;
        textPaint.setColor(j6.x0(null, i7, false));
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.b = f0Var;
        f0Var.setAlpha(0.0f);
        addView(i9Var, ja.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(f0Var, ja.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.x0(null, i7, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.c.setColor(j6.x0(null, j6.a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
