// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v81 extends FrameLayout {
    public final r59 a;

    public v81(r59 r59Var, Context context) {
        super(context);
        this.a = r59Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(r59Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
