package rh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(e4 e4Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.T2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.T2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.T2.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.T2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
