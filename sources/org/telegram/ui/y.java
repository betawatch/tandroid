package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(i4 i4Var, String str, int i3) {
        this.a = i3;
        this.b = i4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                ci.s sVar = i4Var.i0.c0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                sVar.setText(str);
                ci.s sVar2 = i4Var.i0.c0;
                sVar2.setSelection(sVar2.getText().length());
                org.telegram.messenger.g0.K3(i4Var.i0.c0);
                break;
            default:
                sf.c.n(this.b.M, this.c, false, null);
                break;
        }
    }
}
