package v9;

import h7.l;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements s9.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final s9.c g = new s9.c("key", u3.c.h(u3.c.g(d.class, new a(1))));
    public static final s9.c h = new s9.c("value", u3.c.h(u3.c.g(d.class, new a(2))));
    public static final u9.a i = new u9.a(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final s9.d d;
    public final l e = new l(this, 4);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, s9.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int j(s9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).a;
        }
        throw new s9.b("Field has no @Protobuf config");
    }

    @Override // s9.e
    public final s9.e a(s9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override // s9.e
    public final s9.e b(s9.c cVar, int i10) {
        g(cVar, i10, true);
        return this;
    }

    @Override // s9.e
    public final s9.e c(s9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new s9.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        l(j10);
        return this;
    }

    @Override // s9.e
    public final s9.e d(s9.c cVar, boolean z10) {
        g(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // s9.e
    public final s9.e e(s9.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void f(s9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(s9.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new s9.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        k(i10);
    }

    public final void h(s9.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
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
            f(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z10 && floatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z10 && longValue == 0) {
                return;
            }
            d dVar = (d) cVar.b(d.class);
            if (dVar == null) {
                throw new s9.b("Field has no @Protobuf config");
            }
            k(((a) dVar).a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        s9.d dVar2 = (s9.d) this.b.get(obj.getClass());
        if (dVar2 != null) {
            i(dVar2, cVar, obj, z10);
            return;
        }
        s9.f fVar = (s9.f) this.c.get(obj.getClass());
        if (fVar != null) {
            l lVar = this.e;
            lVar.b = false;
            lVar.d = cVar;
            lVar.c = z10;
            fVar.a(obj, lVar);
            return;
        }
        if (obj instanceof b) {
            g(cVar, ((b) obj).a(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.d, cVar, obj, z10);
        }
    }

    public final void i(s9.d dVar, s9.c cVar, Object obj, boolean z10) {
        h7.f fVar = new h7.f(4);
        fVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = fVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j10 = fVar.b;
                fVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                fVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.a.write(((int) j10) & 127);
    }
}
