// default package

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class wse {
    public static StaticLayout a;

    public static kb9 a(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        StaticLayout staticLayout = a;
        if (staticLayout == null) {
            StaticLayout staticLayout2 = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            a = staticLayout2;
            staticLayout = staticLayout2;
        }
        return new kb9(staticLayout, rect);
    }
}
