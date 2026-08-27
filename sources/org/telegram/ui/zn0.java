package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zn0 extends FrameLayout {
    public final Paint a;
    public float b;
    public o1.j c;
    public final /* synthetic */ do0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(do0 do0Var, Context context) {
        super(context);
        this.d = do0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        o1.j jVar = this.c;
        if (jVar != null) {
            jVar.c();
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f10;
            TextView textView = this.d.Q;
            if (textView != null) {
                textView.setAlpha((f10 * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f11 = this.b;
        if (f11 == f10) {
            return;
        }
        o1.j jVar2 = new o1.j(new hb.a(f11 * 100.0f));
        o1.k kVar = new o1.k(f10 * 100.0f);
        kVar.b(z10 ? 500.0f : 650.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.c = jVar2;
        jVar2.b(new ed0(this, 1));
        this.c.a(new m9(this, 1));
        this.c.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.O6;
        do0 do0Var = this.d;
        canvas.drawColor(do0Var.getThemedColor(i10));
        int themedColor = do0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ei);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
