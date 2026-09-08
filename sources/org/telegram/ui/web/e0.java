package org.telegram.ui.web;

import android.content.DialogInterface;
import bi.k9;
import org.telegram.messenger.Utilities;
import zh.s5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(d1 d1Var, boolean[] zArr, k9 k9Var, String str) {
        this.a = 0;
        this.c = d1Var;
        this.b = zArr;
        this.d = k9Var;
        this.e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                k9 k9Var = (k9) this.d;
                String str = (String) this.e;
                d1Var.getClass();
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d1Var.y(k9Var, "requested_chat_failed", d1.B(str, "req_id"));
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

    public /* synthetic */ e0(s5 s5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }
}
