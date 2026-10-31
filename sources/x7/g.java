package x7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends e9.v {
    public final /* synthetic */ int f;
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i10) {
        super(jVar);
        this.f = i10;
        this.h = jVar;
    }

    @Override // e9.v
    public final Object b(int i10) {
        switch (this.f) {
            case 0:
                Object[] objArr = this.h.c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new i(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
