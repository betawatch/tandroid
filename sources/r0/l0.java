package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l0 {
    public final WeakReference a;

    public l0(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f7) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f7);
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

    public final void d(m0 m0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new ql0(m0Var, view, 18));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f7) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
