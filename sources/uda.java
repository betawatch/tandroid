// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uda implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final Rect b;
    public final /* synthetic */ kea c;

    public uda(kea keaVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = keaVar;
                this.b = new Rect();
                break;
            default:
                this.c = keaVar;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n8 n8Var;
        n8 n8Var2;
        byte b = this.a;
        kea keaVar = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n8Var = keaVar.E2) != null && n8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        keaVar.E2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n8Var2 = keaVar.E2) != null && n8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        keaVar.E2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
