package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d01 b;

    public /* synthetic */ sz0(d01 d01Var, int i10) {
        this.a = i10;
        this.b = d01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d01 d01Var = this.b;
                ProfileActivity profileActivity = d01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = d01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity3 = this.b.e;
                profileActivity3.Q4 = !profileActivity3.Q4;
                if (!profileActivity3.P4) {
                    profileActivity3.P4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.P3);
                int i10 = profileActivity3.W5;
                if (i10 >= 0) {
                    profileActivity3.c.h1(i10, profileActivity3.X5 - profileActivity3.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
