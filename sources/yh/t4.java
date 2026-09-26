package yh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ t4(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
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
