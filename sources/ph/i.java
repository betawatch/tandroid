package ph;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int W;
    public final /* synthetic */ j X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        super(true, false, false, false);
        this.W = i10;
        this.X = jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidateSelf();
                break;
            default:
                this.X.invalidateSelf();
                break;
        }
    }
}
