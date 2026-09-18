package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class k2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(a4 a4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = a4Var;
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
