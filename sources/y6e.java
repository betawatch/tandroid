// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y6e extends v7c {
    public boolean b;
    public final /* synthetic */ Object c;

    public y6e(Object obj) {
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
            u36.g();
            return null;
        }
        this.b = true;
        return this.c;
    }
}
