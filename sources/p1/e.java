package p1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e extends z {
    private static final e DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private b0 strings_ = z0.d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.j(e.class, eVar);
    }

    public static void l(e eVar, Set set) {
        b0 b0Var = eVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) b0Var).a) {
            int size = b0Var.size();
            eVar.strings_ = ((z0) b0Var).j(size == 0 ? 10 : size * 2);
        }
        List list = eVar.strings_;
        Charset charset = c0.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(set.size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static d o() {
        return (d) ((x) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object c(int i7) {
        x0 x0Var;
        switch (g.c(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 != null) {
                    return x0Var2;
                }
                synchronized (e.class) {
                    try {
                        x0Var = PARSER;
                        if (x0Var == null) {
                            x0Var = new y();
                            PARSER = x0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return x0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final b0 n() {
        return this.strings_;
    }
}
