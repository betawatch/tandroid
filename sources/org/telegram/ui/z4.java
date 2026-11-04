package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z4 implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z4(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        switch (this.a) {
            case 0:
                a5 a5Var = (a5) this.b;
                if (a5Var.g && i3 == a5Var.e) {
                    a5Var.b(objArr);
                    break;
                }
                break;
            case 1:
                lb0 lb0Var = (lb0) this.b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.c5);
                if (intValue == 200) {
                    try {
                        lb0Var.G = (GoogleSignInAccount) b8.h1.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        lb0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                qc0 qc0Var = (qc0) this.b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.c5);
                if (intValue2 == 200) {
                    try {
                        qc0Var.E = (GoogleSignInAccount) b8.h1.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        qc0Var.h(null);
                        break;
                    } catch (com.google.android.gms.common.api.f e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                break;
        }
    }
}
