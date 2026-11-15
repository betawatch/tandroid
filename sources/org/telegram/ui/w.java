package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w(g4 g4Var, String str, int i7) {
        this.a = i7;
        this.b = g4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                di.q qVar = g4Var.i0.c0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                qVar.setText(str);
                di.q qVar2 = g4Var.i0.c0;
                qVar2.setSelection(qVar2.getText().length());
                org.telegram.messenger.g0.J3(g4Var.i0.c0);
                break;
            default:
                vf.c.n(this.b.M, this.c, false, null);
                break;
        }
    }
}
