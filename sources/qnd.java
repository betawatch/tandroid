// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qnd extends omd {
    public final /* synthetic */ wnd r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnd(wnd wndVar) {
        super((byte) 4);
        this.r = wndVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        eod eodVar = this.r.s;
        return new AbstractMap.SimpleImmutableEntry(eodVar.c.x.get(i), eodVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.s.d.size();
    }
}
