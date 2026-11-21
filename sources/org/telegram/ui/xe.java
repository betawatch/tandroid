package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ xe(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.uc(false);
                break;
            default:
                this.b.uc(false);
                break;
        }
    }
}
