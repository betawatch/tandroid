package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ sv0(ProfileActivity profileActivity, String str, int i10) {
        this.a = i10;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                gf.f.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.R6;
                gf.f.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                break;
        }
    }
}
