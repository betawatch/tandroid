package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ zt0(ProfileActivity profileActivity, String str, int i3) {
        this.a = i3;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (i3) {
            case 0:
                RectF rectF = ProfileActivity.T6;
                sf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().V2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.T6;
                sf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().V2 + "/nft/" + str);
                break;
        }
    }
}
