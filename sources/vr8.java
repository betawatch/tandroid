// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vr8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ vr8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                profileActivity.j3(true);
                break;
            default:
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null) {
                    vn8Var.f1(14);
                    profileActivity.j3(false);
                    break;
                }
                break;
        }
    }
}
