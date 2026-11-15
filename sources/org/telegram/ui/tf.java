package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                an anVar = (an) this.b;
                anVar.s9 = true;
                anVar.q9 = 0;
                anVar.Tb = 0;
                anVar.a5 = 0;
                anVar.O9();
                anVar.uc(false);
                break;
            case 1:
                qn qnVar = (qn) this.b;
                qnVar.N0 = false;
                qnVar.b = null;
                qnVar.O0 = false;
                break;
            case 2:
                ((to) this.b).n = null;
                break;
            case 3:
                ((q90) this.b).b();
                break;
            default:
                ((CancellationTokenSource) this.b).cancel();
                break;
        }
    }
}
