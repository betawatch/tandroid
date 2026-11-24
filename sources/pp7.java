// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pp7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ pp7(boolean[] zArr, long j, byte b) {
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
                    vp7.g(j);
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    vp7.g(j);
                    break;
                }
                break;
        }
    }
}
