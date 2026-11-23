package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class va0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ de0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ va0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.b = de0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z10;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                de0.a0(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                de0.c0(this.b, this.c, this.d, this.e, this.f, (p8.d) obj);
                break;
        }
    }

    public /* synthetic */ va0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.b = de0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z10;
    }
}
