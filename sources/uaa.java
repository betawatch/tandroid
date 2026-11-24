// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uaa extends pb0 {
    public final /* synthetic */ byte M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uaa(FrameLayout frameLayout, wjb wjbVar, byte b) {
        super(wjbVar);
        this.M = b;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.M;
        FrameLayout frameLayout = this.N;
        switch (b) {
            case 0:
                super.invalidateSelf();
                ((waa) frameLayout).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((cba) frameLayout).a.invalidate();
                break;
        }
    }
}
