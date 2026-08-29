package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xn0 extends FrameLayout {
    public final Paint a;
    public float b;
    public o1.k c;
    public final /* synthetic */ bo0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn0(bo0 bo0Var, Context context) {
        super(context);
        this.d = bo0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        o1.k kVar = this.c;
        if (kVar != null) {
            kVar.c();
        }
        float f9 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f9;
            TextView textView = this.d.Q;
            if (textView != null) {
                textView.setAlpha((f9 * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f10 = this.b;
        if (f10 == f9) {
            return;
        }
        o1.k kVar2 = new o1.k(new ib.a(f10 * 100.0f));
        o1.l lVar = new o1.l(f9 * 100.0f);
        lVar.b(z10 ? 500.0f : 650.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.c = kVar2;
        kVar2.b(new cd0(this, 1));
        this.c.a(new k9(this, 1));
        this.c.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.O6;
        bo0 bo0Var = this.d;
        canvas.drawColor(bo0Var.getThemedColor(i10));
        int themedColor = bo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ei);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
