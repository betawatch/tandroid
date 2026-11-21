package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y0 extends View {
    public int a;
    public float b;
    public final /* synthetic */ z0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, Context context) {
        super(context);
        this.c = z0Var;
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        setLayoutParams(new v4.q0(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        z0 z0Var = this.c;
        z0Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (z0Var.g3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        z0.A1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            z0Var.g3.setColor(this.a);
            z0Var.g3.setAlpha(ks.e4);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), z0Var.g3);
        }
    }
}
