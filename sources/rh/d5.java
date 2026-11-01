package rh;

import android.content.DialogInterface;
import org.telegram.messenger.k20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ d5(k20 k20Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = k20Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                k20 k20Var = this.b;
                if (k20Var != null && !this.c[0]) {
                    k20Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                k20 k20Var2 = this.b;
                if (k20Var2 != null && !this.c[0]) {
                    k20Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                k20 k20Var3 = this.b;
                if (k20Var3 != null && !this.c[0]) {
                    k20Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
