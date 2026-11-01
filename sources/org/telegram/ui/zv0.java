package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zv0 implements org.telegram.ui.ActionBar.q0, ns0, wg.a, org.telegram.ui.Components.a8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ zv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // wg.a
    public int E() {
        ProfileActivity profileActivity = this.a;
        wg.d dVar = profileActivity.G5;
        return i0.b.f(profileActivity.l4(), 352321535, dVar.a(dVar.d));
    }

    @Override // org.telegram.ui.ns0
    public void H0(org.telegram.messenger.kj kjVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        hx0 hx0Var = profileActivity.N;
        if (hx0Var != null && hx0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.c1.setBackgroundColor(i0.b.f(0.1f, profileActivity.f4(profileActivity.V4.f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.ns0
    public void I(org.telegram.messenger.kj kjVar) {
        org.telegram.ui.Components.ng0 ng0Var = this.a.m0;
        if (ng0Var == null || !ng0Var.a) {
            return;
        }
        ng0Var.K.e(true, 0.0f);
        ng0Var.invalidate();
    }

    @Override // wg.a
    public /* synthetic */ float N() {
        return -1.0f;
    }

    @Override // wg.a
    public /* synthetic */ float X() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.a8
    public void Y0(int i10, int i11) {
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().F4(i10, a2);
        if (profileActivity.u2 == null && profileActivity.t2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.u2;
        undoView.k(a2, i11, Z1, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.t2.ttl_period), null, null);
    }

    @Override // wg.a
    public /* synthetic */ float b0() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.a8
    public void dismiss() {
        this.a.S0.U(null, null);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void e() {
        RectF rectF = ProfileActivity.S6;
        org.telegram.ui.Components.ol0.d(new z4(this.a, 18));
    }

    @Override // wg.a
    public /* synthetic */ int h0() {
        return 0;
    }

    @Override // wg.a
    public int j0() {
        ProfileActivity profileActivity = this.a;
        wg.d dVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.t6.r1(profileActivity.l4(), dVar.a(dVar.b));
    }

    @Override // org.telegram.ui.ns0
    public /* synthetic */ TextureView k0() {
        return null;
    }

    @Override // wg.a
    public int n0() {
        ProfileActivity profileActivity = this.a;
        wg.d dVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.t6.r1(profileActivity.l4(), dVar.a(dVar.e));
    }

    @Override // org.telegram.ui.Components.a8
    public void t1() {
        this.a.presentFragment(new p4());
        dismiss();
    }

    @Override // wg.a
    public int u() {
        ProfileActivity profileActivity = this.a;
        wg.d dVar = profileActivity.G5;
        return i0.b.f(profileActivity.l4(), 553648127, dVar.a(dVar.c));
    }

    @Override // wg.a
    public /* synthetic */ int w() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void a() {
    }
}
