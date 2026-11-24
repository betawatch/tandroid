// default package

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qt7 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public void a(ggc ggcVar, Object obj) {
        ggcVar.removeView(((mw) obj).b);
    }

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i) {
        return null;
    }

    public abstract Object e(ggc ggcVar, int i);

    public boolean f(View view, Object obj) {
        return ((mw) obj).b == view;
    }

    public void g() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void i(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void h(int i) {
    }
}
