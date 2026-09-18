package org.telegram.ui.web;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ s0(boolean[] zArr, JsResult jsResult, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.c.cancel();
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.c.cancel();
                    break;
                }
                break;
        }
    }
}
