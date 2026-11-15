package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw0 b;

    public /* synthetic */ xv0(iw0 iw0Var, int i7) {
        this.a = i7;
        this.b = iw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = this.b.e;
                profileActivity2.Q4 = !profileActivity2.Q4;
                if (!profileActivity2.P4) {
                    profileActivity2.P4 = true;
                }
                profileActivity2.V4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.p6;
                if (i7 >= 0) {
                    profileActivity2.c.h1(i7, profileActivity2.q6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
