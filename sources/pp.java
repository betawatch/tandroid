// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pp {
    public static final int a = -100;
    public static final st b = new st(0);
    public static final Object c = new Object();

    public static void b(bq bqVar) {
        synchronized (c) {
            st stVar = b;
            stVar.getClass();
            nt ntVar = new nt(stVar);
            while (ntVar.hasNext()) {
                pp ppVar = (pp) ((WeakReference) ntVar.next()).get();
                if (ppVar == bqVar || ppVar == null) {
                    ntVar.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i);
}
