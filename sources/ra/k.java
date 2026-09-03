package ra;

import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k implements Map.Entry {
    public k a;
    public k b;
    public k c;
    public k d;
    public k e;
    public final Object f;
    public final boolean h;
    public Object n;
    public int r;

    public k(boolean z4) {
        this.f = null;
        this.h = z4;
        this.e = this;
        this.d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.n;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.n;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.h) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.n;
    }

    public k(boolean z4, k kVar, Object obj, k kVar2, k kVar3) {
        this.a = kVar;
        this.f = obj;
        this.h = z4;
        this.r = 1;
        this.d = kVar2;
        this.e = kVar3;
        kVar3.d = this;
        kVar2.e = this;
    }
}
