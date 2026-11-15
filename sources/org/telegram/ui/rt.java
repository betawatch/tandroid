package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ rt(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 != this.b) {
                    org.telegram.messenger.gz.w(i10);
                    break;
                } else {
                    org.telegram.messenger.gz.w(-1);
                    break;
                }
            default:
                int i11 = 2 - i7;
                if (i11 != this.b) {
                    org.telegram.messenger.gz.w(i11);
                    break;
                } else {
                    org.telegram.messenger.gz.w(-1);
                    break;
                }
        }
    }
}
