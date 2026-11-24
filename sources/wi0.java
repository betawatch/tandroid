// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wi0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he[] b;

    public /* synthetic */ wi0(he[] heVarArr, byte b) {
        this.a = b;
        this.b = heVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        he[] heVarArr = this.b;
        switch (b) {
            case 0:
                he heVar = new he(3, null, a.b);
                heVarArr[0] = heVar;
                heVar.q(500L);
                break;
            case 1:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.dismiss();
                    break;
                }
                break;
            case 2:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                heVarArr[0] = null;
                break;
            case 3:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                heVarArr[0] = null;
                break;
            case 4:
                gm.c3(new wi0(heVarArr, (byte) 6));
                break;
            case 5:
                gm.c3(new wi0(heVarArr, (byte) 7));
                break;
            case 6:
                heVarArr[0].dismiss();
                break;
            case 7:
                heVarArr[0].dismiss();
                break;
            case 8:
                he heVar3 = heVarArr[0];
                if (heVar3 != null) {
                    heVar3.dismiss();
                    break;
                }
                break;
            case 9:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused3) {
                }
                heVarArr[0] = null;
                break;
            default:
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused4) {
                }
                heVarArr[0] = null;
                break;
        }
    }
}
