// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
