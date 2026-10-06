package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ u4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = callback2;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Utilities.Callback2 callback2 = this.b;
                if (callback2 != null && !this.c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                Utilities.Callback2 callback22 = this.b;
                if (callback22 != null && !this.c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback23 = this.b;
                if (callback23 != null && !this.c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
