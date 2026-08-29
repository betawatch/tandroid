package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l1 {
    public static int a(int i10) {
        int statusBars;
        int i11 = 0;
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i10 & i12) != 0) {
                if (i12 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i12 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i12 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i12 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i12 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i12 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i12 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i12 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                } else if (i12 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i11 |= statusBars;
            }
        }
        return i11;
    }
}
