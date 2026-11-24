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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tkd implements ao7 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final w84 f = new w84("key", b00.m(yjb.q(kkd.class, new cjd(1))));
    public static final w84 g = new w84("value", b00.m(yjb.q(kkd.class, new cjd(2))));
    public static final s7d h = s7d.h;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final jt8 d = new jt8(this, (byte) 4);

    public tkd(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int j(w84 w84Var) {
        kkd kkdVar = (kkd) w84Var.b(kkd.class);
        if (kkdVar != null) {
            return kkdVar.zza();
        }
        throw new t24("Field has no @Protobuf config");
    }

    @Override // ao7
    public final ao7 a(w84 w84Var, Object obj) {
        c(w84Var, obj, true);
        return this;
    }

    public final void b(w84 w84Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((j(w84Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(w84 w84Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (z && charSequence.length() == 0) {
                    return;
                }
                l((j(w84Var) << 3) | 2);
                byte[] bytes = charSequence.toString().getBytes(e);
                l(bytes.length);
                this.a.write(bytes);
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    c(w84Var, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    k(h, w84Var, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                b(w84Var, ((Double) obj).doubleValue(), z);
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (z && floatValue == 0.0f) {
                    return;
                }
                l((j(w84Var) << 3) | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                return;
            }
            if (obj instanceof Number) {
                i(w84Var, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                h(w84Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                l((j(w84Var) << 3) | 2);
                l(bArr.length);
                this.a.write(bArr);
                return;
            }
            zn7 zn7Var = (zn7) this.b.get(obj.getClass());
            if (zn7Var != null) {
                k(zn7Var, w84Var, obj, z);
                return;
            }
            y8c y8cVar = (y8c) this.c.get(obj.getClass());
            if (y8cVar != null) {
                jt8 jt8Var = this.d;
                jt8Var.b = false;
                jt8Var.d = w84Var;
                jt8Var.c = z;
                y8cVar.a(obj, jt8Var);
                return;
            }
            if (obj instanceof yjd) {
                h(w84Var, ((yjd) obj).zza(), true);
            } else if (obj instanceof Enum) {
                h(w84Var, ((Enum) obj).ordinal(), true);
            } else {
                k(s7d.i, w84Var, obj, z);
            }
        }
    }

    @Override // ao7
    public final /* synthetic */ ao7 d(w84 w84Var, boolean z) {
        h(w84Var, z ? 1 : 0, true);
        return this;
    }

    @Override // ao7
    public final /* synthetic */ ao7 e(w84 w84Var, int i) {
        h(w84Var, i, true);
        return this;
    }

    @Override // ao7
    public final ao7 f(w84 w84Var, double d) {
        b(w84Var, d, true);
        return this;
    }

    @Override // ao7
    public final /* synthetic */ ao7 g(w84 w84Var, long j) {
        i(w84Var, j, true);
        return this;
    }

    public final void h(w84 w84Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        kkd kkdVar = (kkd) w84Var.b(kkd.class);
        if (kkdVar == null) {
            throw new t24("Field has no @Protobuf config");
        }
        int ordinal = kkdVar.zzb().ordinal();
        if (ordinal == 0) {
            l(kkdVar.zza() << 3);
            l(i);
        } else if (ordinal == 1) {
            l(kkdVar.zza() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((kkdVar.zza() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void i(w84 w84Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        kkd kkdVar = (kkd) w84Var.b(kkd.class);
        if (kkdVar == null) {
            throw new t24("Field has no @Protobuf config");
        }
        int ordinal = kkdVar.zzb().ordinal();
        if (ordinal == 0) {
            l(kkdVar.zza() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(kkdVar.zza() << 3);
            m((j << 1) ^ (j >> 63));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((kkdVar.zza() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void k(zn7 zn7Var, w84 w84Var, Object obj, boolean z) {
        n06 n06Var = new n06((byte) 4);
        n06Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = n06Var;
            try {
                zn7Var.a(obj, this);
                this.a = outputStream;
                long j = n06Var.b;
                n06Var.close();
                if (z && j == 0) {
                    return;
                }
                l((j(w84Var) << 3) | 2);
                m(j);
                zn7Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                n06Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void l(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & kk7.K1);
                return;
            } else {
                outputStream.write((i & kk7.K1) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & kk7.K1);
                return;
            } else {
                outputStream.write((((int) j) & kk7.K1) | 128);
                j >>>= 7;
            }
        }
    }
}
