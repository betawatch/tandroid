package s9;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import q9.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements q9.e, g {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final q9.d e;
    public final boolean f;

    public e(Writer writer, Map map, Map map2, q9.d dVar, boolean z10) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = dVar;
        this.f = z10;
    }

    @Override // q9.e
    public final q9.e a(q9.c cVar, boolean z10) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override // q9.e
    public final q9.e b(q9.c cVar, double d) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // q9.e
    public final q9.e c(q9.c cVar, int i9) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i9);
        return this;
    }

    @Override // q9.e
    public final q9.e d(q9.c cVar, long j10) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j10);
        return this;
    }

    @Override // q9.g
    public final g e(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // q9.g
    public final g f(boolean z10) {
        j();
        this.b.value(z10);
        return this;
    }

    @Override // q9.e
    public final q9.e g(q9.c cVar, Object obj) {
        i(obj, cVar.a);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i9 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new q9.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            q9.d dVar = (q9.d) this.c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            q9.f fVar = (q9.f) this.d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int a2 = ((f) obj).a();
                j();
                jsonWriter.value(a2);
                return this;
            }
            String name = ((Enum) obj).name();
            j();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i9 < length) {
                jsonWriter.value(r7[i9]);
                i9++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i9 < length2) {
                long j10 = jArr[i9];
                j();
                jsonWriter.value(j10);
                i9++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i9 < length3) {
                jsonWriter.value(dArr[i9]);
                i9++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i9 < length4) {
                jsonWriter.value(zArr[i9]);
                i9++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i9 < length5) {
                h(numberArr[i9]);
                i9++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i9 < length6) {
                h(objArr[i9]);
                i9++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) {
        boolean z10 = this.f;
        JsonWriter jsonWriter = this.b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
