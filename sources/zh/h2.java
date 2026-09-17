package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class h2 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(w3 w3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = w3Var;
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
