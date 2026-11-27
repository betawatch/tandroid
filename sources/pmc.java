// default package

import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pmc {
    public float a;
    public float b;

    public static float a(RendererCommon.ScalingType scalingType) {
        int i = omc.a[scalingType.ordinal()];
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return 0.0f;
        }
        if (i == 3) {
            return 0.5625f;
        }
        iy8.d();
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if ((r11 > 1.0f) == (r12 > 1.0f)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Point b(boolean z, int i, int i2, int i3, int i4) {
        int defaultSize = View.getDefaultSize(ConnectionsManager.DEFAULT_DATACENTER_ID, i);
        int defaultSize2 = View.getDefaultSize(ConnectionsManager.DEFAULT_DATACENTER_ID, i2);
        if (i3 == 0 || i4 == 0 || defaultSize == 0 || defaultSize2 == 0) {
            return new Point(defaultSize, defaultSize2);
        }
        float f = i3 / i4;
        float f2 = defaultSize / defaultSize2;
        Point displaySize = RendererCommon.getDisplaySize(((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) > 0) == ((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) > 0) ? this.a : this.b, f, defaultSize, defaultSize2);
        if (!z) {
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
            }
            displaySize.y = defaultSize2;
        }
        return displaySize;
    }
}
