package rh;

import android.content.DialogInterface;
import org.telegram.messenger.j20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ d5(j20 j20Var, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = j20Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                j20 j20Var = this.b;
                if (j20Var != null && !this.c[0]) {
                    j20Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                j20 j20Var2 = this.b;
                if (j20Var2 != null && !this.c[0]) {
                    j20Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                j20 j20Var3 = this.b;
                if (j20Var3 != null && !this.c[0]) {
                    j20Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
