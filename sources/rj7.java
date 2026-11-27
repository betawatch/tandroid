// default package

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rj7 {
    public final LinkedHashMap a;
    public final ri6 b;

    public rj7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new ri6(z);
    }

    public final Map a() {
        rx7 rx7Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int b = uk6.b(ul2.c(entrySet, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                rx7Var = new rx7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                rx7Var = new rx7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(rx7Var.a, rx7Var.b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.b).get()) {
            grb.i("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(zj8 zj8Var, Object obj) {
        zj8Var.getClass();
        d(zj8Var, obj);
    }

    public final void d(zj8 zj8Var, Object obj) {
        zj8Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(zj8Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(sl2.m((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(zj8Var, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(zj8Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(zj8Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x0026->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof rj7) {
            LinkedHashMap linkedHashMap = ((rj7) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = ur5.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return sl2.f(this.a.entrySet(), ",\n", "{\n", "\n}", zc4.d, 24);
    }

    public /* synthetic */ rj7(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
