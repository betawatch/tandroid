// default package

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q43 extends ImageView {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q43(s43 s43Var, Context context, gi3 gi3Var) {
        super(context);
        this.c = s43Var;
        this.b = gi3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                s43 s43Var = (s43) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (s43Var.n || s43Var.f)) {
                    s43Var.n = false;
                    s43Var.f = false;
                    removeCallbacks(s43Var.r);
                    removeCallbacks(s43Var.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((gi3) this.b).a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q43(t09 t09Var, Context context) {
        super(context);
        this.c = t09Var;
    }
}
