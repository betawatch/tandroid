package ph;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a0 extends yf.n {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override // yf.n
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.M) {
            case 0:
                currentHeight = ((c0) this.N).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((f0) this.N).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // yf.n
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.M) {
            case 0:
                currentWidth = ((c0) this.N).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((f0) this.N).getCurrentWidth();
                return currentWidth2;
        }
    }
}
