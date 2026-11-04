package x7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements ma.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final ma.c g = new ma.c("key", k2.p1.o(t4.c.i(h.class, new e(1))));
    public static final ma.c h = new ma.c("value", k2.p1.o(t4.c.i(h.class, new e(2))));
    public static final i i = i.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ma.d d;
    public final b8.h0 e = new b8.h0(this, 2);

    public j(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ma.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int i(ma.c cVar) {
        h hVar = (h) cVar.b(h.class);
        if (hVar != null) {
            return ((e) hVar).a;
        }
        throw new ma.b("Field has no @Protobuf config");
    }

    @Override // ma.e
    public final ma.e a(ma.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    @Override // ma.e
    public final /* synthetic */ ma.e b(ma.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // ma.e
    public final ma.e c(ma.c cVar, double d) {
        d(cVar, d, true);
        return this;
    }

    public final void d(ma.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // ma.e
    public final /* synthetic */ ma.e e(ma.c cVar, int i3) {
        h(cVar, i3, true);
        return this;
    }

    @Override // ma.e
    public final ma.e f(ma.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        h hVar = (h) cVar.b(h.class);
        if (hVar == null) {
            throw new ma.b("Field has no @Protobuf config");
        }
        k(((e) hVar).a << 3);
        l(j10);
        return this;
    }

    public final void g(ma.c cVar, Object obj, boolean z10) {
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
                g(cVar, it.next(), false);
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
            d(cVar, ((Double) obj).doubleValue(), z10);
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
            h hVar = (h) cVar.b(h.class);
            if (hVar == null) {
                throw new ma.b("Field has no @Protobuf config");
            }
            k(((e) hVar).a << 3);
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
        ma.d dVar = (ma.d) this.b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        ma.f fVar = (ma.f) this.c.get(obj.getClass());
        if (fVar != null) {
            b8.h0 h0Var = this.e;
            h0Var.b = false;
            h0Var.d = cVar;
            h0Var.c = z10;
            fVar.a(obj, h0Var);
            return;
        }
        if (obj instanceof f) {
            h(cVar, ((f) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    public final void h(ma.c cVar, int i3, boolean z10) {
        if (z10 && i3 == 0) {
            return;
        }
        h hVar = (h) cVar.b(h.class);
        if (hVar == null) {
            throw new ma.b("Field has no @Protobuf config");
        }
        k(((e) hVar).a << 3);
        k(i3);
    }

    public final void j(ma.d dVar, ma.c cVar, Object obj, boolean z10) {
        b8.b0 b0Var = new b8.b0(2);
        b0Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = b0Var;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j10 = b0Var.b;
                b0Var.close();
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
                b0Var.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    public final void k(int i3) {
        while ((i3 & (-128)) != 0) {
            this.a.write((i3 & hs.L1) | 128);
            i3 >>>= 7;
        }
        this.a.write(i3 & hs.L1);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.a.write((((int) j10) & hs.L1) | 128);
            j10 >>>= 7;
        }
        this.a.write(((int) j10) & hs.L1);
    }
}
