package org.telegram.ui.web;

import android.webkit.JsResult;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ p0(boolean[] zArr, JsResult jsResult, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
