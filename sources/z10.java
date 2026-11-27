// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z10 extends FrameLayout {
    public final de0[] a;
    public boolean b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ j20 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(j20 j20Var, Activity activity) {
        super(activity);
        this.e = j20Var;
        this.a = new de0[2];
        for (int i = 0; i < 2; i++) {
            this.a[i] = new de0(activity);
            this.a[i].getImageReceiver().h1 = new wg((Object) this, i, (byte) 1);
            this.a[i].setRoundRadius(hl.L(4.0f));
            if (i == 1) {
                this.a[i].setVisibility(8);
            }
            addView(this.a[i], tre.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        j20 j20Var = this.e;
        if (action == 0) {
            if (this.a[this.b ? 1 : 0].getImageReceiver().B()) {
                j20Var.R0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            j20Var.R0(false, true);
        }
        return true;
    }
}
