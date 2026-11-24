// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y14 extends qt7 {
    public final /* synthetic */ e34 c;

    public y14(e34 e34Var) {
        this.c = e34Var;
    }

    @Override // qt7
    public final void a(ggc ggcVar, Object obj) {
        ggcVar.removeView((View) obj);
    }

    @Override // qt7
    public final int b() {
        return this.c.e.size();
    }

    @Override // qt7
    public final CharSequence d(int i) {
        if (i == 0) {
            return jb6.M0(2131751133, null);
        }
        if (i == 1) {
            return jb6.M0(2131754879, null);
        }
        if (i != 2) {
            return null;
        }
        return jb6.M0(2131754755, null);
    }

    @Override // qt7
    public final Object e(ggc ggcVar, int i) {
        FrameLayout frameLayout = ((a34) this.c.e.get(i)).b;
        ggcVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // qt7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
