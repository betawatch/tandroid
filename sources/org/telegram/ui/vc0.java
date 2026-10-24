package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements OnSuccessListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ig0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TLRPC.auth_SentCode d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ vc0(ig0 ig0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.b = ig0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.c = str;
        this.f = z10;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ig0.X(this.b, this.e, this.d, this.c, this.f, (IntegrityTokenResponse) obj);
                break;
            default:
                ig0.V(this.b, this.c, this.d, this.e, this.f, (m8.d) obj);
                break;
        }
    }

    public /* synthetic */ vc0(ig0 ig0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.b = ig0Var;
        this.c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f = z10;
    }
}
