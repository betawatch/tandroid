package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ vg(int i9, boolean[] zArr) {
        this.a = i9;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i9 = this.a;
        boolean[] zArr = this.b;
        switch (i9) {
            case 0:
                zArr[0] = true;
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                zArr[0] = true;
                break;
        }
    }
}
