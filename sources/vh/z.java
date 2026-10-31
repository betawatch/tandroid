package vh;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z extends eg.q {
    public final /* synthetic */ int P;
    public final /* synthetic */ FrameLayout Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override // eg.q
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.P) {
            case 0:
                currentHeight = ((b0) this.Q).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((g0) this.Q).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // eg.q
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.P) {
            case 0:
                currentWidth = ((b0) this.Q).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((g0) this.Q).getCurrentWidth();
                return currentWidth2;
        }
    }
}
