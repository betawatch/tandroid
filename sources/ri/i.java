package ri;

import org.telegram.ui.Components.hw;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i implements c5.h {
    public int a;
    public final /* synthetic */ hw b;
    public final /* synthetic */ q c;

    public i(q qVar, hw hwVar) {
        this.c = qVar;
        this.b = hwVar;
        this.a = hwVar.getScrollX();
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
