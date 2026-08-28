package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fg0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ sc0(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.b = fg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z10;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                fg0.W(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                fg0.U(this.b, this.c, this.d, this.e, this.f, (w7.d) obj);
                break;
        }
    }

    public /* synthetic */ sc0(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.b = fg0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z10;
    }
}
