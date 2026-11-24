// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq8 b;

    public /* synthetic */ zp8(lq8 lq8Var, byte b) {
        this.a = b;
        this.b = lq8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        lq8 lq8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = lq8Var.e;
                RectF rectF = ProfileActivity.e7;
                profileActivity.c3();
                break;
            case 1:
                ProfileActivity profileActivity2 = lq8Var.e;
                profileActivity2.X4 = !profileActivity2.X4;
                if (!profileActivity2.W4) {
                    profileActivity2.W4 = true;
                }
                profileActivity2.m3();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i = profileActivity2.w6;
                if (i >= 0) {
                    profileActivity2.c.g1(i, profileActivity2.x6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity3 = lq8Var.e;
                profileActivity3.getMessagesController().B3(profileActivity3, profileActivity3.getMessagesController().W1(Long.valueOf(profileActivity3.e1)), null, profileActivity3.getClassGuid(), null, false, false);
                break;
        }
    }
}
