// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qna implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ ona d;

    public qna(ona onaVar) {
        this.d = onaVar;
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
        ona onaVar = this.d;
        return i < onaVar.a.size() || (!onaVar.b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        ona onaVar = this.d;
        return i < onaVar.a.size() ? (Map.Entry) onaVar.a.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            grb.i("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = ona.f;
        ona onaVar = this.d;
        onaVar.c();
        if (this.a >= onaVar.a.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        onaVar.i(i2);
    }
}
