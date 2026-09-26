package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] b;

    public /* synthetic */ ug(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.a = i10;
        this.b = a2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                break;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ug(this.b, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ug(this.b, 5));
                break;
            case 4:
                this.b[0].dismiss();
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
