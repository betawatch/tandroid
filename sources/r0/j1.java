package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                }
                i10 |= statusBars;
            }
        }
        return i10;
    }
}
