package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x4 implements org.telegram.messenger.ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                y4 y4Var = (y4) this.b;
                if (y4Var.g && i7 == y4Var.e) {
                    y4Var.b(objArr);
                    break;
                }
                break;
            case 1:
                ob0 ob0Var = (ob0) this.b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.c5);
                if (intValue == 200) {
                    try {
                        ob0Var.F = (GoogleSignInAccount) a8.u7.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        ob0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                sc0 sc0Var = (sc0) this.b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.c5);
                if (intValue2 == 200) {
                    try {
                        sc0Var.D = (GoogleSignInAccount) a8.u7.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        sc0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                break;
        }
    }
}
