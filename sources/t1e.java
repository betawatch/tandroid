// default package

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class t1e {
    public static final cy2 a(cy2 cy2Var, cy2 cy2Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) cy2Var.fold(bool, new qn2((byte) 2))).booleanValue();
        boolean booleanValue2 = ((Boolean) cy2Var2.fold(bool, new qn2((byte) 2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return cy2Var.plus(cy2Var2);
        }
        qn2 qn2Var = new qn2((byte) 3);
        k34 k34Var = k34.a;
        cy2 cy2Var3 = (cy2) cy2Var.fold(k34Var, qn2Var);
        Object obj = cy2Var2;
        if (booleanValue2) {
            obj = cy2Var2.fold(k34Var, new qn2((byte) 4));
        }
        return cy2Var3.plus((cy2) obj);
    }

    public static final cy2 b(ky2 ky2Var, cy2 cy2Var) {
        cy2 a = a(ky2Var.c(), cy2Var, true);
        jd3 jd3Var = up3.a;
        return (a == jd3Var || a.get(jk2.b) != null) ? a : a.plus(jd3Var);
    }

    public static final y6c c(px2 px2Var, cy2 cy2Var, Object obj) {
        y6c y6cVar = null;
        if ((px2Var instanceof my2) && cy2Var.get(z6c.a) != null) {
            my2 my2Var = (my2) px2Var;
            while (true) {
                if ((my2Var instanceof sp3) || (my2Var = my2Var.getCallerFrame()) == null) {
                    break;
                }
                if (my2Var instanceof y6c) {
                    y6cVar = (y6c) my2Var;
                    break;
                }
            }
            if (y6cVar != null) {
                y6cVar.T(cy2Var, obj);
            }
        }
        return y6cVar;
    }

    public static qzd d() {
        String str;
        ClassLoader classLoader = t1e.class.getClassLoader();
        if (qzd.class.equals(qzd.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!qzd.class.getPackage().equals(t1e.class.getPackage())) {
                u36.j(qzd.class.getName());
                return null;
            }
            str = qzd.class.getPackage().getName() + ".BlazeGenerated" + qzd.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    ts2.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new t1e[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(fyd.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(qzd.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (qzd) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (qzd) qzd.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    dq9.o(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    dq9.o(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    dq9.o(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
