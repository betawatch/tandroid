package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] b;

    public /* synthetic */ sg(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.a = i10;
        this.b = d2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new sg(this.b, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new sg(this.b, 5));
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
