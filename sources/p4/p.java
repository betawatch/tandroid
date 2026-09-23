package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class p extends q {
    public final Object a = new Object();
    public Executor b;
    public k2.b0 c;
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
                        executor.execute(new com.google.android.gms.internal.cast.p(this, this.c, mVar, arrayList, false, 3));
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
