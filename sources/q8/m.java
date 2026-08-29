package q8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends j7.k {
    public final /* synthetic */ int f;
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i10) {
        super(pVar);
        this.f = i10;
        this.h = pVar;
    }

    @Override // j7.k
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
