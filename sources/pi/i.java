package pi;

import org.telegram.ui.Components.uv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class i implements b5.h {
    public int a;
    public final /* synthetic */ uv b;
    public final /* synthetic */ q c;

    public i(q qVar, uv uvVar) {
        this.c = qVar;
        this.b = uvVar;
        this.a = uvVar.getScrollX();
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // b5.h
    public final void c(int i3) {
        this.c.g++;
    }

    @Override // b5.h
    public final void a(int i3) {
    }
}
