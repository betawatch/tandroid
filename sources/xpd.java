// default package

import java.io.Serializable;

/* loaded from: classes.dex */
public enum xpd {
    b(Void.class, null),
    c(Integer.class, 0),
    d(Long.class, 0L),
    e(Float.class, Float.valueOf(0.0f)),
    f(Double.class, Double.valueOf(0.0d)),
    h(Boolean.class, Boolean.FALSE),
    n(String.class, ""),
    r(vhd.class, vhd.c),
    s(Integer.class, null),
    w(Object.class, null);

    public final Class a;

    xpd(Class cls, Serializable serializable) {
        this.a = cls;
    }
}
