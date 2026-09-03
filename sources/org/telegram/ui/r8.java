package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r8(l9 l9Var, int i10, int i11) {
        this.a = i11;
        this.b = l9Var;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
