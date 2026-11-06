package org.telegram.ui.web;

import android.webkit.JsResult;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ n0(boolean[] zArr, JsResult jsResult, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
