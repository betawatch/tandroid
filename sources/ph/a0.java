package ph;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
