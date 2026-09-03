package ph;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u extends FrameLayout {
    public final org.telegram.ui.m3 a;
    public r b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public u(Activity activity, d2 d2Var) {
        super(activity);
        org.telegram.ui.m3 m3Var = new org.telegram.ui.m3(this, activity);
        this.a = m3Var;
        m3Var.setAdapter(new s(this, activity, d2Var));
        m3Var.setLayoutManager(new f2.i0(0, false));
        m3Var.setClipToPadding(false);
        m3Var.setVisibility(8);
        m3Var.setWillNotDraw(false);
        m3Var.setOnItemClickListener(new dg.n(this, 13));
        addView(m3Var, k7.b6.c(56.0f, -1));
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        org.telegram.ui.m3 m3Var = this.a;
        if (!z10) {
            this.d = z4 ? 1.0f : 0.0f;
            m3Var.invalidate();
            m3Var.setVisibility(z4 ? 0 : 8);
            return;
        }
        m3Var.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z4 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 13));
        this.f.addListener(new s61(r0, this, z4));
        this.f.setInterpolator(mr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(Utilities.Callback<r> callback) {
        this.c = callback;
    }

    public void setSelected(r rVar) {
        this.b = rVar;
        AndroidUtilities.updateVisibleRows(this.a);
    }
}
