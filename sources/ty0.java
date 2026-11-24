// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ty0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qac b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ ty0(qac qacVar, boolean[] zArr) {
        this.b = qacVar;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    qacVar.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    qacVar.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ty0(boolean[] zArr, qac qacVar) {
        this.c = zArr;
        this.b = qacVar;
    }
}
