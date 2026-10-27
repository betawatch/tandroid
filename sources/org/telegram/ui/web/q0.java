package org.telegram.ui.web;

import android.webkit.JsResult;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ q0(boolean[] zArr, JsResult jsResult, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
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
