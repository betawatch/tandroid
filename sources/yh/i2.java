package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class i2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(y3 y3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.Y0.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.Y0.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.Y0.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.Y0.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
