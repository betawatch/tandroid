package z7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends b8.d {
    public final /* synthetic */ int f;
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i3) {
        super(iVar);
        this.f = i3;
        this.h = iVar;
    }

    @Override // b8.d
    public final Object b(int i3) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i3];
            case 1:
                return new h(this.h, i3);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i3];
        }
    }
}
