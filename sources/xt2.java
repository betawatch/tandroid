// default package

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xt2 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ xt2(int i, long j, String str, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$26(this.a, this.b, this.c, this.d, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ConnectionsManager.lambda$onIntegrityCheckClassic$25(this.a, this.b, this.c, this.d, (IntegrityTokenResponse) obj);
    }
}
