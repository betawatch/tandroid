// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y20 extends FrameLayout {
    public final bf0[] a;
    public boolean b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ i30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(i30 i30Var, Activity activity) {
        super(activity);
        this.e = i30Var;
        this.a = new bf0[2];
        for (int i = 0; i < 2; i++) {
            this.a[i] = new bf0(activity);
            this.a[i].getImageReceiver().h1 = new ji((Object) this, i, (byte) 1);
            this.a[i].setRoundRadius(gm.L(4.0f));
            if (i == 1) {
                this.a[i].setVisibility(8);
            }
            addView(this.a[i], qoe.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        i30 i30Var = this.e;
        if (action == 0) {
            if (this.a[this.b ? 1 : 0].getImageReceiver().B()) {
                i30Var.Q0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            i30Var.Q0(false, true);
        }
        return true;
    }
}
