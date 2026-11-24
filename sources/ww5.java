// default package

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ww5 implements dq7, abc {
    public final boolean a = true;
    public final JsonWriter b;
    public final HashMap c;
    public final HashMap d;
    public final nw5 e;
    public final boolean f;

    public ww5(Writer writer, HashMap hashMap, HashMap hashMap2, nw5 nw5Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = nw5Var;
        this.f = z;
    }

    @Override // dq7
    public final dq7 a(wa4 wa4Var, Object obj) {
        i(obj, wa4Var.a);
        return this;
    }

    @Override // abc
    public final abc b(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // abc
    public final abc c(boolean z) {
        j();
        this.b.value(z);
        return this;
    }

    @Override // dq7
    public final dq7 d(wa4 wa4Var, boolean z) {
        String str = wa4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    @Override // dq7
    public final dq7 e(wa4 wa4Var, int i) {
        String str = wa4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // dq7
    public final dq7 f(wa4 wa4Var, double d) {
        String str = wa4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // dq7
    public final dq7 g(wa4 wa4Var, long j) {
        String str = wa4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final ww5 h(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
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
                    } catch (ClassCastException e) {
                        throw new e44(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            cq7 cq7Var = (cq7) this.c.get(obj.getClass());
            if (cq7Var != null) {
                jsonWriter.beginObject();
                cq7Var.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            zac zacVar = (zac) this.d.get(obj.getClass());
            if (zacVar != null) {
                zacVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                throw null;
            }
            if (obj instanceof np7) {
                int a = ((np7) obj).a();
                j();
                jsonWriter.value(a);
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
            while (i < length) {
                jsonWriter.value(r7[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                j();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                h(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                h(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final ww5 i(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
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
        if (this.a) {
            return;
        }
        dq9.m("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
