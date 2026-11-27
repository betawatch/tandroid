// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pp8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ pp8(ProfileActivity profileActivity, String str, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                m01.u(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                m01.u(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                break;
        }
    }
}
