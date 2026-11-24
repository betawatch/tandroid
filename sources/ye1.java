// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ye1 extends bd2 {
    public final /* synthetic */ byte s;
    public final /* synthetic */ d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye1(d dVar, Context context, byte b) {
        super(context);
        this.s = b;
        this.w = dVar;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ze1 ze1Var;
        byte b = this.s;
        d dVar = this.w;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (ze1Var = ((nf1) dVar).G0) != null) {
                    ze1Var.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((mu1) dVar).G5(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ze1 ze1Var;
        byte b = this.s;
        d dVar = this.w;
        switch (b) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (ze1Var = ((nf1) dVar).G0) != null) {
                    ze1Var.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((mu1) dVar).G5(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
