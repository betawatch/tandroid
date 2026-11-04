package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zk0 extends FrameLayout {
    public final Paint a;
    public float b;
    public q1.g c;
    public final /* synthetic */ dl0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk0(dl0 dl0Var, Context context) {
        super(context);
        this.d = dl0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        q1.g gVar = this.c;
        if (gVar != null) {
            gVar.d();
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f10;
            TextView textView = this.d.V;
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
        q1.g gVar2 = new q1.g(new q1.f(f11 * 100.0f));
        q1.h hVar = new q1.h(f10 * 100.0f);
        hVar.b(z10 ? 500.0f : 650.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.c = gVar2;
        gVar2.b(new wa0(this, 1));
        this.c.a(new k9(this, 1));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i3 = org.telegram.ui.ActionBar.k6.O6;
        dl0 dl0Var = this.d;
        canvas.drawColor(dl0Var.getThemedColor(i3));
        int themedColor = dl0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Si);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(org.telegram.messenger.bd.a0 ? getWidth() - org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(28.0f), -org.telegram.messenger.g0.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
