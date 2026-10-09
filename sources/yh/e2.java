package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(s3 s3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = s3Var;
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
