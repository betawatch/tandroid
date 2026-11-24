// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pt implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ qt d;

    public pt(qt qtVar) {
        this.d = qtVar;
        this.a = qtVar.c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            dq9.m("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.b;
            qt qtVar = this.d;
            if (rr5.a(key, qtVar.f(i)) && rr5.a(entry.getValue(), qtVar.i(this.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.f(this.b);
        }
        dq9.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.i(this.b);
        }
        dq9.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            dq9.m("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.b;
        qt qtVar = this.d;
        Object f = qtVar.f(i);
        Object i2 = qtVar.i(this.b);
        return (f == null ? 0 : f.hashCode()) ^ (i2 != null ? i2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u36.g();
            return null;
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            rjb.h();
            return;
        }
        this.d.g(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.h(this.b, obj);
        }
        dq9.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
