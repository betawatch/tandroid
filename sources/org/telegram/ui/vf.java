package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                an anVar = (an) this.b;
                anVar.p9 = true;
                anVar.n9 = 0;
                anVar.Qb = 0;
                anVar.Z4 = 0;
                anVar.M9();
                anVar.qc(false);
                break;
            case 1:
                pn pnVar = (pn) this.b;
                pnVar.M0 = false;
                pnVar.b = null;
                pnVar.N0 = false;
                break;
            case 2:
                ((so) this.b).n = null;
                break;
            case 3:
                ((p90) this.b).b();
                break;
            default:
                ((CancellationTokenSource) this.b).cancel();
                break;
        }
    }
}
