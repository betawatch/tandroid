// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ytc implements OnFailureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b61 b;

    public /* synthetic */ ytc(b61 b61Var, byte b) {
        this.a = b;
        this.b = b61Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        byte b = this.a;
        b61 b61Var = this.b;
        switch (b) {
            case 0:
                fc4.d("wear-auth: /answer send failed: " + exc.getMessage());
                b61Var.setLoading(false);
                break;
            default:
                fc4.d("wear-auth: /token send failed: " + exc.getMessage());
                b61Var.setLoading(false);
                break;
        }
    }
}
