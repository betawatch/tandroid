package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ de0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ua0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
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

    public /* synthetic */ ua0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.b = de0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z10;
    }
}
