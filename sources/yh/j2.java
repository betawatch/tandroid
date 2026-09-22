package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class j2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(z3 z3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = z3Var;
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
