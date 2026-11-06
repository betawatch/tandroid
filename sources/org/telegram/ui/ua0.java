package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ce0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.b = ce0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z9;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ce0.a0(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                ce0.c0(this.b, this.c, this.d, this.e, this.f, (p8.d) obj);
                break;
        }
    }

    public /* synthetic */ ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.b = ce0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z9;
    }
}
