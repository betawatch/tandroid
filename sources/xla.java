// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xla implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ vla d;

    public xla(vla vlaVar) {
        this.d = vlaVar;
    }

    public final Iterator a() {
        Iterator it = this.c;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.d.b.entrySet().iterator();
        this.c = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        vla vlaVar = this.d;
        return i < vlaVar.a.size() || (!vlaVar.b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        vla vlaVar = this.d;
        return i < vlaVar.a.size() ? (Map.Entry) vlaVar.a.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            dq9.m("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = vla.f;
        vla vlaVar = this.d;
        vlaVar.c();
        if (this.a >= vlaVar.a.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        vlaVar.i(i2);
    }
}
