package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import ph.j2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m0 {
    public final WeakReference a;

    public m0(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(n0 n0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (n0Var != null) {
                view.animate().setListener(new j2(n0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
