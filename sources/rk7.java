// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class rk7 extends FrameLayout {
    public final FrameLayout a;

    public rk7(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, tre.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
