package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class j1 {
    public static int a(int i7) {
        int statusBars;
        int i10 = 0;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i7 & i11) != 0) {
                if (i11 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i11 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i11 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i11 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i11 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i11 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i11 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i11 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                } else if (i11 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i10 |= statusBars;
            }
        }
        return i10;
    }
}
