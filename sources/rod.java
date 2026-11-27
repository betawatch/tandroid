// default package

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class rod implements prd {
    public static final Object d = new Object();
    public static final j26 e = new j26(jtd.class, (byte) 3);
    public static final boolean f;
    public static final o5f h;
    public volatile Object a;
    public volatile dod b;
    public volatile lod c;

    static {
        boolean z;
        o5f jodVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                jodVar = new kod();
            } catch (Error | Exception e2) {
                try {
                    jodVar = new iod();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    jodVar = new jod();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                jodVar = new iod();
            } catch (NoClassDefFoundError unused2) {
                jodVar = new jod();
            }
        }
        th = null;
        th2 = null;
        h = jodVar;
        if (th != null) {
            j26 j26Var = e;
            Logger c = j26Var.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            j26Var.c().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(lod lodVar) {
        lodVar.a = null;
        while (true) {
            lod lodVar2 = this.c;
            if (lodVar2 != lod.c) {
                lod lodVar3 = null;
                while (lodVar2 != null) {
                    lod lodVar4 = lodVar2.b;
                    if (lodVar2.a != null) {
                        lodVar3 = lodVar2;
                    } else if (lodVar3 != null) {
                        lodVar3.b = lodVar4;
                        if (lodVar3.a == null) {
                            break;
                        }
                    } else if (h.g(this, lodVar2, lodVar4)) {
                    }
                    lodVar2 = lodVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
