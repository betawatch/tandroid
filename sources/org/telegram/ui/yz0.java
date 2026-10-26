package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j01 b;

    public /* synthetic */ yz0(j01 j01Var, int i10) {
        this.a = i10;
        this.b = j01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        j01 j01Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = j01Var.e;
                int i11 = ProfileActivity.R6;
                profileActivity.D4();
                break;
            case 1:
                ProfileActivity profileActivity2 = j01Var.e;
                TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1));
                MessagesController messagesController = profileActivity2.getMessagesController();
                ProfileActivity profileActivity3 = j01Var.e;
                messagesController.openApp(profileActivity3, user, null, profileActivity3.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity4 = j01Var.e;
                profileActivity4.U4 = !profileActivity4.U4;
                if (!profileActivity4.T4) {
                    profileActivity4.T4 = true;
                }
                profileActivity4.N4();
                view.requestLayout();
                profileActivity4.d.m(profileActivity4.O3);
                int i12 = profileActivity4.b6;
                if (i12 >= 0) {
                    profileActivity4.c.h1(i12, profileActivity4.c6 - profileActivity4.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
