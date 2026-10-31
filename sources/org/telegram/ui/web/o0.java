package org.telegram.ui.web;

import android.webkit.JsResult;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ o0(boolean[] zArr, JsResult jsResult, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.c.cancel();
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.c.confirm();
                    break;
                }
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.c.confirm();
                    break;
                }
                break;
        }
    }
}
