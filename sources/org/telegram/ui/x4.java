package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x4 implements org.telegram.messenger.is {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.is
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
                org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.c5);
                if (intValue == 200) {
                    try {
                        ob0Var.G = (GoogleSignInAccount) a8.v7.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        ob0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                rc0 rc0Var = (rc0) this.b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.c5);
                if (intValue2 == 200) {
                    try {
                        rc0Var.E = (GoogleSignInAccount) a8.v7.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        rc0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                break;
        }
    }
}
