package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h1 extends View {
    public int a;
    public float b;
    public final /* synthetic */ i1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, Context context) {
        super(context);
        this.c = i1Var;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setLayoutParams(new s4.p0(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i1 i1Var = this.c;
        i1Var.e3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (i1Var.f3.getStrokeWidth() + AndroidUtilities.dp(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        i1.y1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            i1Var.f3.setColor(this.a);
            i1Var.f3.setAlpha(255);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), i1Var.f3);
        }
    }
}
