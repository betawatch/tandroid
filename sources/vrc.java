// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vrc implements OnFailureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u41 b;

    public /* synthetic */ vrc(u41 u41Var, byte b) {
        this.a = b;
        this.b = u41Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        byte b = this.a;
        u41 u41Var = this.b;
        switch (b) {
            case 0:
                fa4.d("wear-auth: /answer send failed: " + exc.getMessage());
                u41Var.setLoading(false);
                break;
            default:
                fa4.d("wear-auth: /token send failed: " + exc.getMessage());
                u41Var.setLoading(false);
                break;
        }
    }
}
