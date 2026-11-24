// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class st7 extends TextView {
    public final /* synthetic */ tt7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st7(tt7 tt7Var, Context context, int i) {
        super(context);
        this.a = tt7Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        tt7 tt7Var = this.a;
        if (tt7Var.e.getAdapter() instanceof y14) {
            ((y14) tt7Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        Drawable background = getBackground();
        tt7 tt7Var = this.a;
        if (background != null) {
            cmb.F1(background, tt7Var.b(z ? 0.1f : 0.05f), true);
        }
        setTextColor(tt7Var.b(z ? 0.8f : 0.6f));
    }
}
