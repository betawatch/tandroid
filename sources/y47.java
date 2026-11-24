// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y47 extends a8 {
    public final /* synthetic */ byte W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y47(Context context, int i, boolean z, boolean z2, ylb ylbVar, byte b) {
        super(i, ylbVar, context, z, z2);
        this.W = b;
    }

    @Override // a8
    public final void l() {
        switch (this.W) {
            case 0:
                setBackground(null);
                break;
            default:
                setBackground(null);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    break;
                }
                break;
            default:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
