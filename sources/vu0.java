// default package

import android.webkit.JsResult;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vu0 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ JsResult c;

    public /* synthetic */ vu0(boolean[] zArr, JsResult jsResult, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = jsResult;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        JsResult jsResult = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.cancel();
                    break;
                }
                break;
            case 1:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.confirm();
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsResult.confirm();
                    break;
                }
                break;
        }
    }
}
