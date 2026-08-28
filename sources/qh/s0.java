package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s0 extends View implements org.telegram.ui.ActionBar.w5 {
    public final b6 a;
    public final Paint b;
    public a c;

    public s0(Context context, b6 b6Var) {
        super(context);
        this.b = new Paint();
        this.a = b6Var;
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.b.setColor(f6.v0(f6.Fk, this.a));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(6.0f) + 1);
    }
}
