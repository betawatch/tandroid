package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ru0 implements org.telegram.ui.ActionBar.o0, fr0, gh.a, org.telegram.ui.Components.f8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ ru0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // gh.a
    public int A() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.I5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.c));
    }

    @Override // gh.a
    public /* synthetic */ int C0() {
        return 0;
    }

    @Override // org.telegram.ui.fr0
    public void I(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Components.lf0 lf0Var = this.a.m0;
        if (lf0Var == null || !lf0Var.a) {
            return;
        }
        lf0Var.K.e(true, 0.0f);
        lf0Var.invalidate();
    }

    @Override // org.telegram.ui.fr0
    public void I0(org.telegram.messenger.ij ijVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        xv0 xv0Var = profileActivity.N;
        if (xv0Var != null && xv0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.c1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.V4.f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.a7, profileActivity.z0)));
    }

    @Override // gh.a
    public /* synthetic */ int M() {
        return 0;
    }

    @Override // gh.a
    public int O() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.I5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override // gh.a
    public int R0() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.I5;
        return org.telegram.ui.ActionBar.l6.r1(profileActivity.l4(), eVar.a(eVar.b));
    }

    @Override // org.telegram.ui.Components.f8
    public void X0(int i7, int i10) {
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().I4(i7, a10);
        if (profileActivity.u2 == null && profileActivity.t2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.u2;
        undoView.k(a10, i10, a22, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.t2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.f8
    public void dismiss() {
        this.a.S0.U(null, null);
    }

    @Override // gh.a
    public int e1() {
        ProfileActivity profileActivity = this.a;
        gh.e eVar = profileActivity.I5;
        return org.telegram.ui.ActionBar.l6.r1(profileActivity.l4(), eVar.a(eVar.e));
    }

    @Override // org.telegram.ui.Components.f8
    public void i1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // gh.a
    public /* synthetic */ float j0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.fr0
    public /* synthetic */ TextureView l0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void n() {
        RectF rectF = ProfileActivity.V6;
        org.telegram.ui.Components.kk0.d(new a5(this.a, 19));
    }

    @Override // gh.a
    public /* synthetic */ float o0() {
        return -1.0f;
    }

    @Override // gh.a
    public /* synthetic */ float v0() {
        return 0.0f;
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void i() {
    }
}
