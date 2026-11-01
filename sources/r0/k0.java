package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.jw0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class k0 {
    public final WeakReference a;

    public k0(View view) {
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

    public final void d(l0 l0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (l0Var != null) {
                view.animate().setListener(new jw0(14, view, (Object) l0Var));
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
