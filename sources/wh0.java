// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd[] b;

    public /* synthetic */ wh0(hd[] hdVarArr, byte b) {
        this.a = b;
        this.b = hdVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd[] hdVarArr = this.b;
        switch (b) {
            case 0:
                hd hdVar = new hd(3, null, a.b);
                hdVarArr[0] = hdVar;
                hdVar.q(500L);
                break;
            case 1:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.dismiss();
                    break;
                }
                break;
            case 2:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                hdVarArr[0] = null;
                break;
            case 3:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                hdVarArr[0] = null;
                break;
            case 4:
                gl.c3(new wh0(hdVarArr, (byte) 6));
                break;
            case 5:
                gl.c3(new wh0(hdVarArr, (byte) 7));
                break;
            case 6:
                hdVarArr[0].dismiss();
                break;
            case 7:
                hdVarArr[0].dismiss();
                break;
            case 8:
                hd hdVar3 = hdVarArr[0];
                if (hdVar3 != null) {
                    hdVar3.dismiss();
                    break;
                }
                break;
            case 9:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused3) {
                }
                hdVarArr[0] = null;
                break;
            default:
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused4) {
                }
                hdVarArr[0] = null;
                break;
        }
    }
}
