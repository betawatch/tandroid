package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ xy0(ProfileActivity profileActivity, String str, int i10) {
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
