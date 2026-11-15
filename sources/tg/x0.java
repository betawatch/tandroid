package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x0 extends View {
    public int a;
    public float b;
    public final /* synthetic */ y0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, Context context) {
        super(context);
        this.c = y0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.p0(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        y0 y0Var = this.c;
        y0Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (y0Var.g3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        y0.A1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            y0Var.g3.setColor(this.a);
            y0Var.g3.setAlpha(ns.e4);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), y0Var.g3);
        }
    }
}
