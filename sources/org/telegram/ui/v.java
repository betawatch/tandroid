package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v(h4 h4Var, String str, int i10) {
        this.a = i10;
        this.b = h4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                zd zdVar = h4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                zdVar.setText(str);
                zd zdVar2 = h4Var.h0.b0;
                zdVar2.setSelection(zdVar2.getText().length());
                org.telegram.messenger.i0.J3(h4Var.h0.b0);
                break;
            default:
                gf.f.l(this.b.L, this.c, false, null);
                break;
        }
    }
}
