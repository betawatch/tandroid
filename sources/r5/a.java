package r5;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import m5.t;
import s4.d;
import u5.c;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final Logger f = Logger.getLogger(t.class.getName());
    public final d a;
    public final Executor b;
    public final n5.d c;
    public final t5.d d;
    public final c e;

    public a(Executor executor, n5.d dVar, d dVar2, t5.d dVar3, c cVar) {
        this.b = executor;
        this.c = dVar;
        this.a = dVar2;
        this.d = dVar3;
        this.e = cVar;
    }
}
