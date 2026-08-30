package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum v extends a2 {
    public v() {
        super("Data", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r9 = pc.a.c(r4, r9.h, r0, r5 - r0);
     */
    @Override // pc.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(k kVar, a aVar) {
        char c3;
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            kVar.f(aVar.d());
            return;
        }
        if (i10 == '&') {
            kVar.a(a2.b);
            return;
        }
        if (i10 == '<') {
            kVar.a(a2.h);
            return;
        }
        if (i10 == 65535) {
            kVar.h(new g());
            return;
        }
        aVar.b();
        int i11 = aVar.e;
        int i12 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i13 = aVar.e;
            if (i13 >= i12 || (c3 = cArr[i13]) == '&' || c3 == '<' || c3 == 0) {
                break;
            } else {
                aVar.e = i13 + 1;
            }
        }
        String str = "";
        kVar.g(str);
    }
}
