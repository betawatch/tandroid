package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ sy(int i10, int i11, int[] iArr) {
        this.a = i11;
        this.b = i10;
        this.c = iArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.a;
        int[] iArr = this.c;
        int i11 = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.y;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                break;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                break;
        }
    }
}
