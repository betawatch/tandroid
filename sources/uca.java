// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uca extends pc0 {
    public final /* synthetic */ byte M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uca(FrameLayout frameLayout, ylb ylbVar, byte b) {
        super(ylbVar);
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
                ((wca) frameLayout).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((cda) frameLayout).a.invalidate();
                break;
        }
    }
}
