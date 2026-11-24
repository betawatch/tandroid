// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sr7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ sr7(boolean[] zArr, long j, byte b) {
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
                    yr7.g(j);
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    yr7.g(j);
                    break;
                }
                break;
        }
    }
}
