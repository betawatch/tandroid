package z7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y implements ja.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ja.c g = new ja.c("key", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c h = new ja.c("value", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final x i = x.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ja.d d;
    public final ma.h e = new ma.h(this, 4);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ja.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(ja.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).a;
        }
        throw new ja.b("Field has no @Protobuf config");
    }

    @Override // ja.e
    public final /* synthetic */ ja.e a(ja.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void b(ja.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ja.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z10 && floatValue == 0.0f) {
                return;
            }
            k((i(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z10 && longValue == 0) {
                return;
            }
            w wVar = (w) cVar.b(w.class);
            if (wVar == null) {
                throw new ja.b("Field has no @Protobuf config");
            }
            k(((s) wVar).a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        ja.d dVar = (ja.d) this.b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        ja.f fVar = (ja.f) this.c.get(obj.getClass());
        if (fVar != null) {
            ma.h hVar = this.e;
            hVar.b = false;
            hVar.d = cVar;
            hVar.c = z10;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof u) {
            h(cVar, ((u) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    @Override // ja.e
    public final ja.e d(ja.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    @Override // ja.e
    public final ja.e e(ja.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    @Override // ja.e
    public final ja.e f(ja.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar == null) {
            throw new ja.b("Field has no @Protobuf config");
        }
        k(((s) wVar).a << 3);
        l(j10);
        return this;
    }

    @Override // ja.e
    public final /* synthetic */ ja.e g(ja.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    public final void h(ja.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar == null) {
            throw new ja.b("Field has no @Protobuf config");
        }
        k(((s) wVar).a << 3);
        k(i10);
    }

    public final void j(ja.d dVar, ja.c cVar, Object obj, boolean z10) {
        ma.b bVar = new ma.b(4);
        bVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j10 = bVar.b;
                bVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    public final void k(int i10) {
        while (true) {
            long j10 = i10 & (-128);
            int i11 = i10 & zs.L1;
            if (j10 == 0) {
                this.a.write(i11);
                return;
            } else {
                this.a.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            long j11 = (-128) & j10;
            int i10 = ((int) j10) & zs.L1;
            if (j11 == 0) {
                this.a.write(i10);
                return;
            } else {
                this.a.write(i10 | 128);
                j10 >>>= 7;
            }
        }
    }
}
