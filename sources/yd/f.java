package yd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class f {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new ud.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            a = qd.d.a(new qd.a(new qd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
