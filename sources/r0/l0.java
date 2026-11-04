package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.ri0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 {
    public final WeakReference a;

    public l0(View view) {
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

    public final void d(m0 m0Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new ri0(m0Var, view, 18));
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
