// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v71 extends FrameLayout {
    public final d79 a;

    public v71(d79 d79Var, Context context) {
        super(context);
        this.a = d79Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(d79Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
