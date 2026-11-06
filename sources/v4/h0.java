package v4;

import android.database.Observable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class h0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i0) ((Observable) this).mObservers.get(size)).e(i7, i10);
        }
    }

    public final void d(int i7, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i0) ((Observable) this).mObservers.get(size)).c(i7, i10, obj);
        }
    }

    public final void e(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i0) ((Observable) this).mObservers.get(size)).d(i7, i10);
        }
    }

    public final void f(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i0) ((Observable) this).mObservers.get(size)).f(i7, i10);
        }
    }
}
