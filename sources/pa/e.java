package pa;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import na.g;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e implements na.e, g {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final na.d e;
    public final boolean f;

    public e(Writer writer, Map map, Map map2, na.d dVar, boolean z9) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = dVar;
        this.f = z9;
    }

    @Override // na.e
    public final na.e a(na.c cVar, Object obj) {
        i(obj, cVar.a);
        return this;
    }

    @Override // na.e
    public final na.e b(na.c cVar, double d) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // na.e
    public final na.e c(na.c cVar, boolean z9) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z9);
        return this;
    }

    @Override // na.e
    public final na.e d(na.c cVar, int i7) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i7);
        return this;
    }

    @Override // na.e
    public final na.e e(na.c cVar, long j3) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j3);
        return this;
    }

    @Override // na.g
    public final g f(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // na.g
    public final g g(boolean z9) {
        j();
        this.b.value(z9);
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
        int i7 = 0;
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
                        throw new na.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            na.d dVar = (na.d) this.c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            na.f fVar = (na.f) this.d.get(obj.getClass());
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
                int a10 = ((f) obj).a();
                j();
                jsonWriter.value(a10);
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
            while (i7 < length) {
                jsonWriter.value(r7[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                long j3 = jArr[i7];
                j();
                jsonWriter.value(j3);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                jsonWriter.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                jsonWriter.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i7 < length5) {
                h(numberArr[i7]);
                i7++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i7 < length6) {
                h(objArr[i7]);
                i7++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) {
        boolean z9 = this.f;
        JsonWriter jsonWriter = this.b;
        if (z9) {
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
