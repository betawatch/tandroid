package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j1 extends View {
    public int a;
    public float b;
    public final /* synthetic */ k1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Context context) {
        super(context);
        this.c = k1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k1 k1Var = this.c;
        k1Var.X2.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (k1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        k1.w1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            k1Var.Y2.setColor(this.a);
            k1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), k1Var.Y2);
        }
    }
}
