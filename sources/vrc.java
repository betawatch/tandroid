// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
