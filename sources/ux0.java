// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ux0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ ux0(pcc pccVar, boolean[] zArr) {
        this.b = pccVar;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    pccVar.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    pccVar.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ux0(boolean[] zArr, pcc pccVar) {
        this.c = zArr;
        this.b = pccVar;
    }
}
