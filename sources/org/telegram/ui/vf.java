package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.b;
                cnVar.r9 = true;
                cnVar.p9 = 0;
                cnVar.Sb = 0;
                cnVar.Z4 = 0;
                cnVar.N9();
                cnVar.tc(false);
                break;
            case 1:
                rn rnVar = (rn) this.b;
                rnVar.M0 = false;
                rnVar.b = null;
                rnVar.N0 = false;
                break;
            case 2:
                ((uo) this.b).n = null;
                break;
            case 3:
                ((r90) this.b).b();
                break;
            default:
                ((CancellationTokenSource) this.b).cancel();
                break;
        }
    }
}
