package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x4 implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.fs
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
                pb0 pb0Var = (pb0) this.b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f5);
                if (intValue == 200) {
                    try {
                        pb0Var.G = (GoogleSignInAccount) a8.v7.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        pb0Var.h(null);
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
                org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f5);
                if (intValue2 == 200) {
                    try {
                        sc0Var.E = (GoogleSignInAccount) a8.v7.b(intent2).getResult(com.google.android.gms.common.api.f.class);
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
