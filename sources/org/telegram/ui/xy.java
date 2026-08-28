package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ xy(int i9, int i10, int[] iArr) {
        this.a = i10;
        this.b = i9;
        this.c = iArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i9 = this.a;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i9) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.x;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
        }
    }
}
