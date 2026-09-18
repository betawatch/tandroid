package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ zy0(ProfileActivity profileActivity, String str, int i10) {
        this.a = i10;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                nf.f.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.c);
                break;
            default:
                ProfileActivity profileActivity2 = this.b;
                nf.f.s(profileActivity2.getParentActivity(), "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.c);
                break;
        }
    }
}
