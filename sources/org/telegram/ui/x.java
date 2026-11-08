package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(g4 g4Var, String str, int i7) {
        this.a = i7;
        this.b = g4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                bi.v vVar = g4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vVar.setText(str);
                bi.v vVar2 = g4Var.h0.b0;
                vVar2.setSelection(vVar2.getText().length());
                org.telegram.messenger.g0.K3(g4Var.h0.b0);
                break;
            default:
                vf.c.n(this.b.L, this.c, false, null);
                break;
        }
    }
}
