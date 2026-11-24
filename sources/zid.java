// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zid extends xhd {
    public final /* synthetic */ fjd r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zid(fjd fjdVar) {
        super((byte) 4);
        this.r = fjdVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        njd njdVar = this.r.s;
        return new AbstractMap.SimpleImmutableEntry(njdVar.c.x.get(i), njdVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.s.d.size();
    }
}
