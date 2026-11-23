package ri;

import org.telegram.ui.Components.gw;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class i implements c5.h {
    public int a;
    public final /* synthetic */ gw b;
    public final /* synthetic */ q c;

    public i(q qVar, gw gwVar) {
        this.c = qVar;
        this.b = gwVar;
        this.a = gwVar.getScrollX();
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // c5.h
    public final void c(int i7) {
        this.c.g++;
    }

    @Override // c5.h
    public final void a(int i7) {
    }
}
