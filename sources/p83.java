// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class p83 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ p83(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = 2 - i;
                if (i2 != this.b) {
                    gba.v(i2);
                    break;
                } else {
                    gba.v(-1);
                    break;
                }
            default:
                int i3 = 2 - i;
                if (i3 != this.b) {
                    gba.v(i3);
                    break;
                } else {
                    gba.v(-1);
                    break;
                }
        }
    }
}
