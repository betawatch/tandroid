package ri;

import org.telegram.ui.Components.bw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class i implements c5.h {
    public int a;
    public final /* synthetic */ bw b;
    public final /* synthetic */ q c;

    public i(q qVar, bw bwVar) {
        this.c = qVar;
        this.b = bwVar;
        this.a = bwVar.getScrollX();
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
