package z4;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public abstract void a(g gVar, Object obj);

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i10) {
        return null;
    }

    public abstract Object e(g gVar, int i10);

    public abstract boolean f(View view, Object obj);

    public void g() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.notifyChanged();
    }

    public final void i(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void h(int i10) {
    }
}
