package ph;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.l61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class u extends FrameLayout {
    public final org.telegram.ui.k3 a;
    public r b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public u(Activity activity, d2 d2Var) {
        super(activity);
        org.telegram.ui.k3 k3Var = new org.telegram.ui.k3(this, activity);
        this.a = k3Var;
        k3Var.setAdapter(new s(this, activity, d2Var));
        k3Var.setLayoutManager(new f2.i0(0, false));
        k3Var.setClipToPadding(false);
        k3Var.setVisibility(8);
        k3Var.setWillNotDraw(false);
        k3Var.setOnItemClickListener(new dg.n(this, 13));
        addView(k3Var, k7.b6.c(56.0f, -1));
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
        org.telegram.ui.k3 k3Var = this.a;
        if (!z10) {
            this.d = z4 ? 1.0f : 0.0f;
            k3Var.invalidate();
            k3Var.setVisibility(z4 ? 0 : 8);
            return;
        }
        k3Var.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z4 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 13));
        this.f.addListener(new l61(r0, this, z4));
        this.f.setInterpolator(nr.h);
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
