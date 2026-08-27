package p8;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ n(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = pVar.d(entry.getKey());
                    if (d != -1 && h7.e0.a(pVar.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                Map b10 = pVar.b();
                return b10 != null ? b10.entrySet().iterator() : new m(pVar, 1);
            default:
                p pVar2 = this.b;
                Map b11 = pVar2.b();
                return b11 != null ? b11.keySet().iterator() : new m(pVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!pVar.f()) {
                        int c10 = pVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = pVar.a;
                        Objects.requireNonNull(obj2);
                        int m10 = l.m(key, value, c10, obj2, pVar.h(), pVar.i(), pVar.j());
                        if (m10 != -1) {
                            pVar.e(m10, c10);
                            pVar.f--;
                            pVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                p pVar2 = this.b;
                Map b11 = pVar2.b();
                return b11 != null ? b11.keySet().remove(obj) : pVar2.g(obj) != p.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
