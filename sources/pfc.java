// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pfc {
    public final qfc a = new qfc();

    public final void a() {
        qfc qfcVar = this.a;
        if (!qfcVar.d) {
            qfcVar.d = true;
            synchronized (qfcVar.a) {
                Iterator it = qfcVar.b.values().iterator();
                while (it.hasNext()) {
                    qfc.a((AutoCloseable) it.next());
                }
                Iterator it2 = qfcVar.c.iterator();
                while (it2.hasNext()) {
                    qfc.a((AutoCloseable) it2.next());
                }
                qfcVar.c.clear();
            }
        }
        b();
    }

    public void b() {
    }
}
