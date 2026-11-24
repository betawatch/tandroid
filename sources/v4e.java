// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class v4e extends v5c {
    public boolean b;
    public final /* synthetic */ Object c;

    public v4e(Object obj) {
        super((byte) 12);
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            w26.g();
            return null;
        }
        this.b = true;
        return this.c;
    }
}
