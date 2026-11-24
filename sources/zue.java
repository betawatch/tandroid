// default package

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class zue {
    public static StaticLayout a;

    public static kd9 a(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        StaticLayout staticLayout = a;
        if (staticLayout == null) {
            StaticLayout staticLayout2 = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            a = staticLayout2;
            staticLayout = staticLayout2;
        }
        return new kd9(staticLayout, rect);
    }
}
