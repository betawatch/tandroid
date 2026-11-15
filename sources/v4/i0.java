package v4;

import android.database.Observable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    public final void c(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).e(i7, i10);
        }
    }

    public final void d(int i7, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).c(i7, i10, obj);
        }
    }

    public final void e(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).d(i7, i10);
        }
    }

    public final void f(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((j0) ((Observable) this).mObservers.get(size)).f(i7, i10);
        }
    }
}
