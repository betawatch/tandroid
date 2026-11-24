// default package

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p04 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p04(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                t14 t14Var = ((t04) obj).G;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        t14Var.f = false;
                        break;
                    }
                } else {
                    t14Var.f = true;
                    break;
                }
                break;
            case 1:
                t14 t14Var2 = ((h14) obj).H;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        t14Var2.f = false;
                        break;
                    }
                } else {
                    t14Var2.f = true;
                    break;
                }
                break;
            case 2:
                t14 t14Var3 = ((o14) obj).R;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        t14Var3.f = false;
                        break;
                    }
                } else {
                    t14Var3.f = true;
                    break;
                }
                break;
            default:
                o56 o56Var = (o56) obj;
                m56 m56Var = o56Var.H;
                Handler handler = o56Var.L;
                np npVar = o56Var.P;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && npVar != null && npVar.isShowing() && x >= 0 && x < npVar.getWidth() && y >= 0 && y < npVar.getHeight()) {
                    handler.postDelayed(m56Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(m56Var);
                    break;
                }
                break;
        }
        return false;
    }
}
