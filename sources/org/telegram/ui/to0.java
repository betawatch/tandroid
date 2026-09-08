package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class to0 extends FrameLayout {
    public final Paint a;
    public float b;
    public o1.k c;
    public final /* synthetic */ xo0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(xo0 xo0Var, Context context) {
        super(context);
        this.d = xo0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        o1.k kVar = this.c;
        if (kVar != null) {
            kVar.c();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f7;
            TextView textView = this.d.U;
            if (textView != null) {
                textView.setAlpha((f7 * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f10 = this.b;
        if (f10 == f7) {
            return;
        }
        o1.k kVar2 = new o1.k(new o1.j(f10 * 100.0f));
        o1.l lVar = new o1.l(f7 * 100.0f);
        lVar.b(z10 ? 500.0f : 650.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.c = kVar2;
        kVar2.b(new td0(this, 1));
        this.c.a(new n9(this, 1));
        this.c.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.O6;
        xo0 xo0Var = this.d;
        canvas.drawColor(xo0Var.getThemedColor(i10));
        int themedColor = xo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ei);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
