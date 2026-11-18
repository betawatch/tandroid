package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lw0 b;

    public /* synthetic */ yv0(lw0 lw0Var, int i7) {
        this.a = i7;
        this.b = lw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.e;
                profileActivity.getMessagesController().E3(profileActivity, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = this.b.e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.r6;
                if (i7 >= 0) {
                    profileActivity2.c.h1(i7, profileActivity2.s6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
