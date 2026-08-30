package x7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends h {
    public final /* synthetic */ int c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f10, int i10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.c = i10;
        switch (i10) {
            case 1:
                super(2, Float.valueOf(Math.max(f10, 0.0f)));
                this.d = Math.max(f10, 0.0f);
                break;
            default:
                this.d = Math.max(f10, 0.0f);
                break;
        }
    }

    @Override // x7.h
    public final String toString() {
        switch (this.c) {
            case 0:
                return "[Dash: length=" + this.d + "]";
            default:
                return "[Gap: length=" + this.d + "]";
        }
    }
}
