package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ z80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                launchActivity.s1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new y80(launchActivity, 9), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new y80(launchActivity, 10), 30000L);
                break;
        }
    }
}
