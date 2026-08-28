package xf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends ScrollView {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = xVar;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y10 = this.a.getY() + AndroidUtilities.dp(1.0f);
        int dp = AndroidUtilities.dp(36.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getMeasuredWidth() - dp) / 2.0f, y10, (getMeasuredWidth() + dp) / 2.0f, AndroidUtilities.dp(4.0f) + y10);
        f6.t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), f6.t0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        ((LinearLayout.LayoutParams) this.b.b.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
    }
}
