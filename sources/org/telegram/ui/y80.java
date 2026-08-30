package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ y80(LaunchActivity launchActivity, int i10) {
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
                AndroidUtilities.runOnUIThread(new x80(launchActivity, 9), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new x80(launchActivity, 10), 30000L);
                break;
        }
    }
}
