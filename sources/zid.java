// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
