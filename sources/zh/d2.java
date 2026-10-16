package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class d2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(r3 r3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = r3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.Z0.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.Z0.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.Z0.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.Z0.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
