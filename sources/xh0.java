// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id[] b;

    public /* synthetic */ xh0(id[] idVarArr, byte b) {
        this.a = b;
        this.b = idVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        id[] idVarArr = this.b;
        switch (b) {
            case 0:
                id idVar = new id(3, null, a.b);
                idVarArr[0] = idVar;
                idVar.q(500L);
                break;
            case 1:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.dismiss();
                    break;
                }
                break;
            case 2:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                idVarArr[0] = null;
                break;
            case 3:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                idVarArr[0] = null;
                break;
            case 4:
                hl.c3(new xh0(idVarArr, (byte) 6));
                break;
            case 5:
                hl.c3(new xh0(idVarArr, (byte) 7));
                break;
            case 6:
                idVarArr[0].dismiss();
                break;
            case 7:
                idVarArr[0].dismiss();
                break;
            case 8:
                id idVar3 = idVarArr[0];
                if (idVar3 != null) {
                    idVar3.dismiss();
                    break;
                }
                break;
            case 9:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused3) {
                }
                idVarArr[0] = null;
                break;
            default:
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused4) {
                }
                idVarArr[0] = null;
                break;
        }
    }
}
