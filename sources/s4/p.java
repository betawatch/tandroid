package s4;

import a8.qa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.ou;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class p extends q {
    public final Object a = new Object();
    public Executor b;
    public ou c;
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
                        executor.execute(new qa(this, this.c, mVar, arrayList, false, 6));
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
