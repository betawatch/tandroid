// default package

import android.database.Observable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x39 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((y39) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((y39) ((Observable) this).mObservers.get(size)).e(i, i2);
        }
    }

    public final void d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((y39) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((y39) ((Observable) this).mObservers.get(size)).d(i, i2);
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((y39) ((Observable) this).mObservers.get(size)).f(i, i2);
        }
    }
}
