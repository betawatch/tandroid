// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
