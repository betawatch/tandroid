package p1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g1;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends z {
    private static final c DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private o0 preferences_ = o0.b;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.j(c.class, cVar);
    }

    public static o0 l(c cVar) {
        o0 o0Var = cVar.preferences_;
        if (!o0Var.a) {
            cVar.preferences_ = o0Var.c();
        }
        return cVar.preferences_;
    }

    public static a n() {
        return (a) ((x) DEFAULT_INSTANCE.c(5));
    }

    public static c o(FileInputStream fileInputStream) {
        c cVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.j jVar = new androidx.datastore.preferences.protobuf.j(fileInputStream);
        p a10 = p.a();
        z i7 = cVar.i();
        try {
            y0 y0Var = y0.c;
            y0Var.getClass();
            b1 a11 = y0Var.a(i7.getClass());
            d4.f fVar = (d4.f) jVar.b;
            if (fVar == null) {
                fVar = new d4.f(jVar);
            }
            a11.i(i7, fVar, a10);
            a11.d(i7);
            if (z.f(i7, true)) {
                return (c) i7;
            }
            throw new e0(new g1().getMessage());
        } catch (e0 e10) {
            if (e10.a) {
                throw new e0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (g1 e11) {
            throw new e0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof e0) {
                throw ((e0) e13.getCause());
            }
            throw e13;
        }
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
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 != null) {
                    return x0Var2;
                }
                synchronized (c.class) {
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

    public final Map m() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
