package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zh0 {
    public final LaunchActivity a;
    public final ArrayList b = new ArrayList();
    public int c = TLObject.FLAG_31;

    public zh0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.b.isEmpty();
        LaunchActivity launchActivity = this.a;
        try {
            if (isEmpty || launchActivity.getResources().getConfiguration().smallestScreenWidthDp >= 600 || (Build.VERSION.SDK_INT >= 24 && launchActivity.isInMultiWindowMode())) {
                int i3 = this.c;
                if (i3 != Integer.MIN_VALUE) {
                    launchActivity.setRequestedOrientation(i3);
                    this.c = TLObject.FLAG_31;
                    return;
                }
                return;
            }
            if (this.c == Integer.MIN_VALUE) {
                this.c = launchActivity.getRequestedOrientation();
            }
            if (launchActivity.getRequestedOrientation() != 1) {
                launchActivity.setRequestedOrientation(1);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
