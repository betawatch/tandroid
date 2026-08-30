package ra;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k7.a8;
import pa.u;
import pa.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f implements v, Cloneable {
    public static final f c = new f();
    public List a;
    public final List b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z4) {
        if (!z4 && !Enum.class.isAssignableFrom(cls)) {
            a8 a8Var = ua.c.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z4 ? this.a : this.b).iterator();
        while (it.hasNext()) {
            if (((pa.a) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // pa.v
    public final u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (b10 || b11) {
            return new e(this, b11, b10, gVar, aVar);
        }
        return null;
    }
}
