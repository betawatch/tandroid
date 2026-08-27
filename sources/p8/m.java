package p8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends i7.k {
    public final /* synthetic */ int f;
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i10) {
        super(pVar);
        this.f = i10;
        this.h = pVar;
    }

    @Override // i7.k
    public final Object a(int i10) {
        switch (this.f) {
            case 0:
                return this.h.i()[i10];
            case 1:
                return new o(this.h, i10);
            default:
                return this.h.j()[i10];
        }
    }
}
