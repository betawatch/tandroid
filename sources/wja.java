// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wja implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ uja d;

    public wja(uja ujaVar) {
        this.d = ujaVar;
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
        uja ujaVar = this.d;
        return i < ujaVar.a.size() || (!ujaVar.b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        uja ujaVar = this.d;
        return i < ujaVar.a.size() ? (Map.Entry) ujaVar.a.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            sc8.j("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = uja.f;
        uja ujaVar = this.d;
        ujaVar.c();
        if (this.a >= ujaVar.a.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        ujaVar.i(i2);
    }
}
