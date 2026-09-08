package w7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f implements ia.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ia.c g = new ia.c("key", i2.g.n(w.f.i(d.class, new a(1))));
    public static final ia.c h = new ia.c("value", i2.g.n(w.f.i(d.class, new a(2))));
    public static final e i = e.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ia.d d;
    public final la.h e = new la.h(this, 2);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ia.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(ia.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).a;
        }
        throw new ia.b("Field has no @Protobuf config");
    }

    @Override // ia.e
    public final ia.e a(ia.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final void b(ia.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // ia.e
    public final /* synthetic */ ia.e c(ia.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void d(ia.c cVar, Object obj, boolean z10) {
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
                d(cVar, it.next(), false);
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
            d dVar = (d) cVar.b(d.class);
            if (dVar == null) {
                throw new ia.b("Field has no @Protobuf config");
            }
            k(((a) dVar).a << 3);
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
        ia.d dVar2 = (ia.d) this.b.get(obj.getClass());
        if (dVar2 != null) {
            j(dVar2, cVar, obj, z10);
            return;
        }
        ia.f fVar = (ia.f) this.c.get(obj.getClass());
        if (fVar != null) {
            la.h hVar = this.e;
            hVar.b = false;
            hVar.d = cVar;
            hVar.c = z10;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof b) {
            h(cVar, ((b) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    @Override // ia.e
    public final /* synthetic */ ia.e e(ia.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // ia.e
    public final ia.e f(ia.c cVar, long j3) {
        if (j3 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new ia.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        l(j3);
        return this;
    }

    @Override // ia.e
    public final ia.e g(ia.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ia.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar == null) {
            throw new ia.b("Field has no @Protobuf config");
        }
        k(((a) dVar).a << 3);
        k(i10);
    }

    public final void j(ia.d dVar, ia.c cVar, Object obj, boolean z10) {
        la.b bVar = new la.b(2);
        bVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j3 = bVar.b;
                bVar.close();
                if (z10 && j3 == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                l(j3);
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
            long j3 = i10 & (-128);
            OutputStream outputStream = this.a;
            if (j3 == 0) {
                outputStream.write(i10 & 127);
                return;
            } else {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void l(long j3) {
        while (true) {
            long j10 = (-128) & j3;
            OutputStream outputStream = this.a;
            if (j10 == 0) {
                outputStream.write(((int) j3) & 127);
                return;
            } else {
                outputStream.write((((int) j3) & 127) | 128);
                j3 >>>= 7;
            }
        }
    }
}
