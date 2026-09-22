package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k1 extends View {
    public int a;
    public float b;
    public final /* synthetic */ l1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, Context context) {
        super(context);
        this.c = l1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        l1 l1Var = this.c;
        l1Var.X2.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (l1Var.Y2.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        l1.x1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            l1Var.Y2.setColor(this.a);
            l1Var.Y2.setAlpha(255);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), l1Var.Y2);
        }
    }
}
