// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ps7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ ps7(boolean[] zArr, long j, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        long j = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    vs7.g(j);
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    vs7.g(j);
                    break;
                }
                break;
        }
    }
}
