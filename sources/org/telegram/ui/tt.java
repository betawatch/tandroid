package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ tt(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 != this.b) {
                    org.telegram.messenger.cz.w(i10);
                    break;
                } else {
                    org.telegram.messenger.cz.w(-1);
                    break;
                }
            default:
                int i11 = 2 - i7;
                if (i11 != this.b) {
                    org.telegram.messenger.cz.w(i11);
                    break;
                } else {
                    org.telegram.messenger.cz.w(-1);
                    break;
                }
        }
    }
}
