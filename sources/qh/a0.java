package qh;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a0 extends zf.n {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override // zf.n
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

    @Override // zf.n
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
