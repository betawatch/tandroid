package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.oj1;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

    public final void c(long j3) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    public final void d(m0 m0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new oj1(m0Var, view));
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
