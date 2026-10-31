package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ qu(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 != this.b) {
                    org.telegram.messenger.tz.w(i11);
                    break;
                } else {
                    org.telegram.messenger.tz.w(-1);
                    break;
                }
            default:
                int i12 = 2 - i10;
                if (i12 != this.b) {
                    org.telegram.messenger.tz.w(i12);
                    break;
                } else {
                    org.telegram.messenger.tz.w(-1);
                    break;
                }
        }
    }
}
