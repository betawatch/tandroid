package ri;

import org.telegram.ui.Components.jw;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i implements c5.h {
    public int a;
    public final /* synthetic */ jw b;
    public final /* synthetic */ q c;

    public i(q qVar, jw jwVar) {
        this.c = qVar;
        this.b = jwVar;
        this.a = jwVar.getScrollX();
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
