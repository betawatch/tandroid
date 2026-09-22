package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ yj0(fk0 fk0Var, int i10) {
        this.a = i10;
        this.b = fk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.b.b);
                break;
            default:
                AndroidUtilities.showKeyboard(this.b.d.getEditText());
                break;
        }
    }
}
