// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tb extends b61 {
    public final /* synthetic */ byte m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Context context, boolean z, ylb ylbVar, byte b) {
        super(ylbVar, context, z);
        this.m0 = b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 1:
                if (this.e0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // b61
    public final boolean j() {
        switch (this.m0) {
            case 0:
            case 3:
                return false;
            default:
                return super.j();
        }
    }
}
