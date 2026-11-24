// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
