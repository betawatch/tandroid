package org.telegram.ui.web;

import ai.da;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import yh.t5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(d1 d1Var, boolean[] zArr, da daVar, String str) {
        this.a = 0;
        this.c = d1Var;
        this.b = zArr;
        this.d = daVar;
        this.e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                da daVar = (da) this.d;
                String str = (String) this.e;
                d1Var.getClass();
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    break;
                }
                break;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.b[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr2[0]) {
                        callback2.run("cancelled", 0L);
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            default:
                Utilities.Callback callback3 = (Utilities.Callback) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.b[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr3[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr3[0] = true;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d0(t5 t5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }
}
