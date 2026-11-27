// default package

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qw8 implements ar7 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final sa4 f = new sa4("key", c00.n(c00.m(nw8.class, new wx(1))));
    public static final sa4 g = new sa4("value", c00.n(c00.m(nw8.class, new wx(2))));
    public static final sw5 h = new sw5((byte) 1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final sw8 d = new sw8(this, (byte) 0);

    public qw8(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int k(sa4 sa4Var) {
        nw8 nw8Var = (nw8) sa4Var.b(nw8.class);
        if (nw8Var != null) {
            return nw8Var.tag();
        }
        throw new o34("Field has no @Protobuf config");
    }

    @Override // ar7
    public final ar7 a(sa4 sa4Var, Object obj) {
        i(sa4Var, obj, true);
        return this;
    }

    public final void b(sa4 sa4Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((k(sa4Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(sa4 sa4Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        nw8 nw8Var = (nw8) sa4Var.b(nw8.class);
        if (nw8Var == null) {
            throw new o34("Field has no @Protobuf config");
        }
        int ordinal = nw8Var.intEncoding().ordinal();
        if (ordinal == 0) {
            l(nw8Var.tag() << 3);
            l(i);
        } else if (ordinal == 1) {
            l(nw8Var.tag() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((nw8Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // ar7
    public final ar7 d(sa4 sa4Var, boolean z) {
        c(sa4Var, z ? 1 : 0, true);
        return this;
    }

    @Override // ar7
    public final ar7 e(sa4 sa4Var, int i) {
        c(sa4Var, i, true);
        return this;
    }

    @Override // ar7
    public final ar7 f(sa4 sa4Var, double d) {
        b(sa4Var, d, true);
        return this;
    }

    @Override // ar7
    public final ar7 g(sa4 sa4Var, long j) {
        h(sa4Var, j, true);
        return this;
    }

    public final void h(sa4 sa4Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        nw8 nw8Var = (nw8) sa4Var.b(nw8.class);
        if (nw8Var == null) {
            throw new o34("Field has no @Protobuf config");
        }
        int ordinal = nw8Var.intEncoding().ordinal();
        if (ordinal == 0) {
            l(nw8Var.tag() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(nw8Var.tag() << 3);
            m((j << 1) ^ (j >> 63));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((nw8Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(sa4 sa4Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (z && charSequence.length() == 0) {
                    return;
                }
                l((k(sa4Var) << 3) | 2);
                byte[] bytes = charSequence.toString().getBytes(e);
                l(bytes.length);
                this.a.write(bytes);
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(sa4Var, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    j(h, sa4Var, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                b(sa4Var, ((Double) obj).doubleValue(), z);
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (z && floatValue == 0.0f) {
                    return;
                }
                l((k(sa4Var) << 3) | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                return;
            }
            if (obj instanceof Number) {
                h(sa4Var, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                c(sa4Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                l((k(sa4Var) << 3) | 2);
                l(bArr.length);
                this.a.write(bArr);
                return;
            }
            zq7 zq7Var = (zq7) this.b.get(obj.getClass());
            if (zq7Var != null) {
                j(zq7Var, sa4Var, obj, z);
                return;
            }
            ycc yccVar = (ycc) this.c.get(obj.getClass());
            if (yccVar != null) {
                sw8 sw8Var = this.d;
                sw8Var.b = false;
                sw8Var.d = sa4Var;
                sw8Var.c = z;
                yccVar.a(obj, sw8Var);
                return;
            }
            if (obj instanceof lw8) {
                c(sa4Var, ((lw8) obj).a(), true);
            } else if (obj instanceof Enum) {
                c(sa4Var, ((Enum) obj).ordinal(), true);
            } else {
                j(chd.a, sa4Var, obj, z);
            }
        }
    }

    public final void j(zq7 zq7Var, sa4 sa4Var, Object obj, boolean z) {
        r26 r26Var = new r26((byte) 0);
        r26Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = r26Var;
            try {
                zq7Var.a(obj, this);
                this.a = outputStream;
                long j = r26Var.b;
                r26Var.close();
                if (z && j == 0) {
                    return;
                }
                l((k(sa4Var) << 3) | 2);
                m(j);
                zq7Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                r26Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & jn7.K1);
                return;
            } else {
                outputStream.write((i & jn7.K1) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & jn7.K1);
                return;
            } else {
                outputStream.write((((int) j) & jn7.K1) | 128);
                j >>>= 7;
            }
        }
    }
}
