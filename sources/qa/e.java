package qa;

import a8.k0;
import a8.r0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jg.g;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e implements na.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final na.c g = new na.c("key", g.q(g.p(d.class, new a(1))));
    public static final na.c h = new na.c("value", g.q(g.p(d.class, new a(2))));
    public static final pa.a i = new pa.a(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final na.d d;
    public final r0 e = new r0(this, 2);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, na.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int j(na.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).a;
        }
        throw new na.b("Field has no @Protobuf config");
    }

    @Override // na.e
    public final na.e a(na.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override // na.e
    public final na.e b(na.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override // na.e
    public final na.e c(na.c cVar, boolean z9) {
        g(cVar, z9 ? 1 : 0, true);
        return this;
    }

    @Override // na.e
    public final na.e d(na.c cVar, int i7) {
        g(cVar, i7, true);
        return this;
    }

    @Override // na.e
    public final na.e e(na.c cVar, long j3) {
        if (j3 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new na.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        l(j3);
        return this;
    }

    public final void f(na.c cVar, double d, boolean z9) {
        if (z9 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(na.c cVar, int i7, boolean z9) {
        if (z9 && i7 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new na.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        k(i7);
    }

    public final void h(na.c cVar, Object obj, boolean z9) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z9 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(cVar, ((Double) obj).doubleValue(), z9);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z9 && floatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z9 && longValue == 0) {
                return;
            }
            d dVar = (d) cVar.b(d.class);
            if (dVar == null) {
                throw new na.b("Field has no @Protobuf config");
            }
            k(((a) dVar).a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z9 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        na.d dVar2 = (na.d) this.b.get(obj.getClass());
        if (dVar2 != null) {
            i(dVar2, cVar, obj, z9);
            return;
        }
        na.f fVar = (na.f) this.c.get(obj.getClass());
        if (fVar != null) {
            r0 r0Var = this.e;
            r0Var.b = false;
            r0Var.d = cVar;
            r0Var.c = z9;
            fVar.a(obj, r0Var);
            return;
        }
        if (obj instanceof b) {
            g(cVar, ((b) obj).a(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.d, cVar, obj, z9);
        }
    }

    public final void i(na.d dVar, na.c cVar, Object obj, boolean z9) {
        k0 k0Var = new k0(2);
        k0Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = k0Var;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j3 = k0Var.b;
                k0Var.close();
                if (z9 && j3 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j3);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                k0Var.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void k(int i7) {
        while ((i7 & (-128)) != 0) {
            this.a.write((i7 & qs.L1) | 128);
            i7 >>>= 7;
        }
        this.a.write(i7 & qs.L1);
    }

    public final void l(long j3) {
        while (((-128) & j3) != 0) {
            this.a.write((((int) j3) & qs.L1) | 128);
            j3 >>>= 7;
        }
        this.a.write(((int) j3) & qs.L1);
    }
}
