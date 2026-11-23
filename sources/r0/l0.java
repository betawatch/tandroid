package r0;

import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.ui.Components.h10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                view.animate().setListener(new h10(m0Var, view, 19));
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
