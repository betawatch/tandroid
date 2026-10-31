package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w4 implements org.telegram.messenger.us {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        switch (this.a) {
            case 0:
                x4 x4Var = (x4) this.b;
                if (x4Var.g && i10 == x4Var.e) {
                    x4Var.b(objArr);
                    break;
                }
                break;
            case 1:
                wc0 wc0Var = (wc0) this.b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.c5);
                if (intValue == 200) {
                    try {
                        wc0Var.F = (GoogleSignInAccount) w7.n9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        wc0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                zd0 zd0Var = (zd0) this.b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.c5);
                if (intValue2 == 200) {
                    try {
                        zd0Var.D = (GoogleSignInAccount) w7.n9.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        zd0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                break;
        }
    }
}
