package s4;

import android.database.Observable;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class i0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).e(i10, i11);
        }
    }

    public final void d(int i10, int i11, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
        }
    }

    public final void e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).d(i10, i11);
        }
    }

    public final void f(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).f(i10, i11);
        }
    }
}
