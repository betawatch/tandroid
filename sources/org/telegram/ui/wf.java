package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.b;
                bnVar.t9 = true;
                bnVar.r9 = 0;
                bnVar.Ub = 0;
                bnVar.b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                break;
            case 1:
                rn rnVar = (rn) this.b;
                rnVar.N0 = false;
                rnVar.b = null;
                rnVar.O0 = false;
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
