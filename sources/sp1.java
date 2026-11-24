// default package

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sp1 extends FrameLayout {
    public final /* synthetic */ mu1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp1(mu1 mu1Var, Activity activity) {
        super(activity);
        this.a = mu1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.G5(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i2), gl.L(300.0f));
        if (min == 0) {
            min = gl.L(300.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31));
    }
}
