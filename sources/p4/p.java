package p4;

import a8.fg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import li.h5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class p extends q {
    public final Object a = new Object();
    public Executor b;
    public h5 c;
    public m d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.a) {
            try {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new fg(this, this.c, mVar, arrayList, false, 4));
                    } else {
                        this.d = mVar;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
