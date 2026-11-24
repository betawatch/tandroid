// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tm5 extends v5c {
    public int b;
    public Object c;
    public final /* synthetic */ v5c d;

    public tm5(v5c v5cVar) {
        super((byte) 0);
        this.d = v5cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0 || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i <= 0) {
            vn7 vn7Var = (vn7) this.d.next();
            this.c = vn7Var.a;
            i = vn7Var.a();
            this.b = i;
        }
        this.b = i - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
