package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ qy0(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 != this.b) {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    break;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    break;
                }
            default:
                int i12 = 2 - i10;
                if (i12 != this.b) {
                    SharedConfig.overrideDevicePerformanceClass(i12);
                    break;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    break;
                }
        }
    }
}
