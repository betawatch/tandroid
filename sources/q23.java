// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class q23 extends j33 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q23(FrameLayout frameLayout, Context context, byte b) {
        super(context);
        this.Q = b;
        this.R = frameLayout;
    }

    @Override // j33
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                currentHeight = ((t23) frameLayout).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((y23) frameLayout).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // j33
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        byte b = this.Q;
        FrameLayout frameLayout = this.R;
        switch (b) {
            case 0:
                currentWidth = ((t23) frameLayout).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((y23) frameLayout).getCurrentWidth();
                return currentWidth2;
        }
    }
}
