package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qt0 implements r40, org.telegram.ui.Components.lu0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.nr, r0.m, org.telegram.ui.Components.gf0, org.telegram.ui.Components.ij0, te.b, org.telegram.messenger.i9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ qt0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        RectF rectF = ProfileActivity.X6;
        this.b.r5();
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        RectF rectF = ProfileActivity.X6;
        int i7 = k1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.N6 = i7;
        FrameLayout frameLayout = profileActivity.w5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.N6 + profileActivity.M6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.w5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.G3();
            org.telegram.ui.Components.wp0 wp0Var = profileActivity.O.b0;
            if (wp0Var != null) {
                wp0Var.setButtonOffset(profileActivity.N6 + profileActivity.M6);
            }
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        ProfileActivity profileActivity = this.b;
        sw0 sw0Var = profileActivity.e;
        if (sw0Var.x || sw0Var.w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String M0 = org.telegram.messenger.hd.M0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new qt0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        profileActivity.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView == null) {
            return true;
        }
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.X6;
                profileActivity.getMessagesController().w(profileActivity.e1);
                if (org.telegram.ui.Components.cc.a(profileActivity)) {
                    org.telegram.ui.Components.cc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 9:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.getClass();
                org.telegram.messenger.gz.l = null;
                org.telegram.messenger.gz.m = null;
                org.telegram.messenger.gz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                break;
            default:
                sw0 sw0Var = profileActivity.e;
                sw0Var.w.clear();
                org.telegram.messenger.np.e1().edit().remove("settingsSearchRecent2").commit();
                sw0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.r40
    public void i(int i7, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.X6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.v2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.v2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.F2, profileActivity, arrayList, i7, new f3(arrayList2, 5), new f3(profileActivity, 6), new lc0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        ProfileActivity profileActivity = this.b;
        profileActivity.J1 = 0;
        org.telegram.messenger.ns notificationCenter = profileActivity.getNotificationCenter();
        int i7 = org.telegram.messenger.ns.t;
        notificationCenter.n(profileActivity, i7);
        profileActivity.getNotificationCenter().k(i7, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(-profileActivity.F2.id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.i9
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.E2 != null || profileActivity.v4();
    }

    @Override // org.telegram.ui.r40
    public /* synthetic */ void f(TLRPC.User user) {
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
