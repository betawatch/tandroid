package r0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                view.animate().setListener(new pg.d0(m0Var, view));
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
