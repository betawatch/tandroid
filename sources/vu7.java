// default package

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class vu7 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public void a(fic ficVar, Object obj) {
        ficVar.removeView(((nv) obj).b);
    }

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i) {
        return null;
    }

    public abstract Object e(fic ficVar, int i);

    public boolean f(View view, Object obj) {
        return ((nv) obj).b == view;
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
