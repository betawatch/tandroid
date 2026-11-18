package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ tx(int i7, int i10, int[] iArr) {
        this.a = i10;
        this.b = i7;
        this.c = iArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.a;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                break;
        }
    }
}
