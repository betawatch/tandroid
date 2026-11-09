package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                yw ywVar = rwVar.n0;
                Context context = rwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                ywVar.showDialog(new ug.i0(3, i7, context, ywVar, null));
                break;
            default:
                yw ywVar2 = this.b.n0;
                wv wvVar = ywVar2.M0;
                if (wvVar != null) {
                    wvVar.dismiss();
                    ywVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
