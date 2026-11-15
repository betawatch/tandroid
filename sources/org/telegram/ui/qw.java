package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rw b;

    public /* synthetic */ qw(rw rwVar, int i7) {
        this.a = i7;
        this.b = rwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                rw rwVar = this.b;
                yw ywVar = rwVar.o0;
                Context context = rwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                ywVar.showDialog(new ug.j0(3, i7, context, ywVar, null));
                break;
            default:
                yw ywVar2 = this.b.o0;
                wv wvVar = ywVar2.N0;
                if (wvVar != null) {
                    wvVar.dismiss();
                    ywVar2.N0 = null;
                    break;
                }
                break;
        }
    }
}
