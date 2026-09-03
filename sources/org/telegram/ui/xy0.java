package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ xy0(int i10, int i11) {
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
