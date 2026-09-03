package qd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class f {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new md.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            a = id.d.a(new id.a(new id.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
