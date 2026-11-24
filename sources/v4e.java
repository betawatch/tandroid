// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
