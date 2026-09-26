package org.telegram.ui.web;

import ai.da;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import yh.s5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(b1 b1Var, boolean[] zArr, da daVar, String str) {
        this.a = 0;
        this.c = b1Var;
        this.b = zArr;
        this.d = daVar;
        this.e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.c;
                da daVar = (da) this.d;
                String str = (String) this.e;
                b1Var.getClass();
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b1Var.y(daVar, "requested_chat_failed", b1.B(str, "req_id"));
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

    public /* synthetic */ c0(s5 s5Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }
}
