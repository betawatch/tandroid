package rh;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ee;
import org.telegram.messenger.ef;
import org.telegram.messenger.h20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k20;
import org.telegram.messenger.o20;
import org.telegram.messenger.ot;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ay;
import org.telegram.ui.nb0;
import org.telegram.ui.rm0;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, rf.l, fe.e, o20, rm0, t0.e, ik0, k20, hk0, th.m5, th.i7, nh.m, r0.m, qa.a, uj0, ig.s1, CameraController.VideoTakeCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ig.s1
    public void B() {
        vh.s7 s7Var = (vh.s7) this.b;
        TextView textView = s7Var.X0;
        boolean a2 = s7Var.m0.a();
        ImageView imageView = s7Var.W0;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.b;
        if (z10) {
            long j10 = i10;
            if (e0Var.z1 != j10) {
                e0Var.z1 = j10;
                e0Var.p1.setText(e0.K0(j10));
            }
            e0Var.J0(true);
        }
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        th.o7 o7Var = (th.o7) this.b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o7Var.w.getLayoutParams();
        marginLayoutParams.topMargin = o7Var.c ? 0 : j1Var.d();
        marginLayoutParams.bottomMargin = o7Var.c ? j1Var.a.f(2).d : j1Var.a();
        marginLayoutParams.leftMargin = I0.a;
        marginLayoutParams.rightMargin = I0.c;
        th.c7 c7Var = o7Var.s;
        if (c7Var != null) {
            c7Var.requestLayout();
        }
        th.d7 d7Var = o7Var.w;
        if (d7Var != null) {
            d7Var.requestLayout();
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        th.p1 p1Var = (th.p1) this.b;
        nb0 nb0Var = p1Var.c;
        ArrayList arrayList = p1Var.r;
        th.i0 i0Var = ((th.g0) view).f;
        int i14 = p1Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= i0Var.f.size()) {
                break;
            }
            th.h0 h0Var = (th.h0) i0Var.f.get(i16);
            long j11 = h0Var.g;
            if (j11 > 0 && currentTime - h0Var.d <= th.o.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(h0Var.a));
            }
            i16++;
        }
        th.s0 s0Var = p1Var.P;
        long j12 = s0Var != null ? s0Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            th.h0 h0Var2 = (th.h0) arrayList.get(i17);
            if (h0Var2.b || !h0Var2.e || h0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(h0Var2.a))) {
                    j10 = j12;
                    if (p1Var.x != i0Var.b || (i13 = p1Var.y) == 0 || h0Var2.a < i13) {
                        i11 = h0Var2.a;
                        break;
                    }
                } else {
                    j10 = j12;
                }
                i18++;
            } else {
                j10 = j12;
            }
            i17++;
            j12 = j10;
        }
        j10 = j12;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
                th.h0 h0Var3 = (th.h0) arrayList.get(i15);
                if (h0Var3.b || !h0Var3.e || h0Var3.g >= j10) {
                    if (hashSet.contains(Integer.valueOf(h0Var3.a))) {
                        i12 = h0Var3.a;
                        i18 = i19;
                        break;
                    }
                    i19++;
                }
                i15++;
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        p1Var.x = i0Var.b;
        p1Var.y = i12;
        p1Var.D = true;
        s4.l0 itemAnimator = nb0Var.getItemAnimator();
        nb0Var.setItemAnimator(null);
        p1Var.d.i1(i18, nb0Var.getHeight() / 2, true);
        p1Var.e.g(i18);
        nb0Var.setItemAnimator(itemAnimator);
    }

    @Override // th.m5
    public void c(boolean z10) {
        th.x3 x3Var = (th.x3) this.b;
        if (x3Var != null) {
            x3Var.c();
        }
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 11:
                return th.j0.a((th.j0) obj2, (Long) obj);
            default:
                uq0 uq0Var = (uq0) obj2;
                if (((Integer) number).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new uh.l(uq0Var.a, cd.L0(2131746708, null), new ph.h1(uq0Var, 18)).show();
                return Boolean.TRUE;
        }
    }

    @Override // org.telegram.ui.rm0
    public void e(int i10) {
        switch (this.a) {
            case 5:
                j20 j20Var = (j20) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        j20Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    j20Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            case 6:
                ih.s sVar = (ih.s) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        sVar.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    sVar.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                q70 q70Var = (q70) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        q70Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    q70Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    @Override // org.telegram.ui.Components.ik0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i10, final View view) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        eq eqVar;
        boolean z10;
        boolean z11;
        z60 z60Var;
        final int i18;
        int i19;
        int i20 = this.a;
        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
        final int i21 = 2;
        Object obj = this.b;
        final int i22 = 0;
        final int i23 = 1;
        switch (i20) {
            case 10:
                final uw uwVar = (uw) obj;
                if (uwVar.N == 0.0f && uwVar.n0 == 0.0f) {
                    final long j11 = ((th.l) view).E;
                    ay ayVar = uwVar.O0;
                    i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                    ui.b0(i11).M0(true);
                    z60 H = z60.H(ayVar, view);
                    H.z.set(0, org.telegram.messenger.i0.L(8.0f), 0, 0);
                    H.W(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6)));
                    H.a0(0.0f, org.telegram.messenger.i0.L(8.0f));
                    ayVar.L0 = H;
                    if (!h20.A(j11)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i12 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        if (j11 != d20.i(i12).e()) {
                            final TLRPC.User Z1 = ayVar.getMessagesController().Z1(Long.valueOf(j11));
                            TLRPC.Chat L0 = ayVar.getMessagesController().L0(Long.valueOf(-j11));
                            final String v = ot.v(j11, 0L, false);
                            i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            boolean g02 = NotificationsCustomSettingsActivity.g0(i13, j11);
                            i14 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            boolean A3 = vp.r1(i14).A3();
                            i15 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            boolean q6 = d20.i(i15).q();
                            i16 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            boolean L = vp.r1(i16).O1().L(j11);
                            i17 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                            boolean H2 = vp.r1(i17).O1().H(j11);
                            if (A3 || j11 <= 0 || q6) {
                                j10 = 0;
                            } else {
                                j10 = 0;
                                Drawable drawable = uwVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = uwVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        org.telegram.ui.ActionBar.a7.y(uwVar, drawable2, org.telegram.ui.ActionBar.t6.F8, ayVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    eqVar = new eq(drawable2, drawable);
                                    if (j11 < j10 && ayVar.i4().j(j11)) {
                                        final int i24 = 4;
                                        ayVar.L0.b(R.drawable.msg_stories_add, null, cd.L0(2131754384, null), org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new Runnable() { // from class: org.telegram.ui.qw
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i25;
                                                switch (i24) {
                                                    case 0:
                                                        uwVar.O0.presentFragment(un.ha(j11));
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        ay ayVar2 = uwVar.O0;
                                                        i25 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25);
                                                        long j12 = j11;
                                                        b02.N1(j12);
                                                        ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                        break;
                                                    case 4:
                                                        uwVar.O0.E0.j(j11);
                                                        break;
                                                    case 5:
                                                        uwVar.O0.presentFragment(un.ha(j11));
                                                        break;
                                                    default:
                                                        uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (Z1 != null && !Z1.contact) {
                                        i19 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                        if (ui.b0(i19).G(j11)) {
                                            z10 = true;
                                            z60 z60Var2 = ayVar.L0;
                                            final int i25 = 5;
                                            z60Var2.l(R.drawable.msg_discussion, cd.L0(2131745618, null), new Runnable() { // from class: org.telegram.ui.qw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i252;
                                                    switch (i25) {
                                                        case 0:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ay ayVar2 = uwVar.O0;
                                                            i252 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i252);
                                                            long j12 = j11;
                                                            b02.N1(j12);
                                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            uwVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        default:
                                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i26 = 6;
                                            z60Var2.l(R.drawable.msg_openprofile, cd.L0(2131747802, null), new Runnable() { // from class: org.telegram.ui.qw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i252;
                                                    switch (i26) {
                                                        case 0:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ay ayVar2 = uwVar.O0;
                                                            i252 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i252);
                                                            long j12 = j11;
                                                            b02.N1(j12);
                                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            uwVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        default:
                                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 > j10);
                                            final int i27 = 0;
                                            z60Var2.l(R.drawable.msg_channel, cd.L0(org.telegram.messenger.w3.V(L0) ? 2131747827 : 2131747815, null), new Runnable() { // from class: org.telegram.ui.qw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i252;
                                                    switch (i27) {
                                                        case 0:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ay ayVar2 = uwVar.O0;
                                                            i252 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i252);
                                                            long j12 = j11;
                                                            b02.N1(j12);
                                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            uwVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        default:
                                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                            break;
                                                    }
                                                }
                                            }, j11 < j10);
                                            final int i28 = 0;
                                            z60Var2.l(R.drawable.msg_mute, cd.L0(2131747879, null), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i29;
                                                    String trim;
                                                    int i30;
                                                    int i31 = i28;
                                                    TLRPC.User user = Z1;
                                                    String str = v;
                                                    uw uwVar2 = uwVar;
                                                    switch (i31) {
                                                        case 0:
                                                            ay ayVar2 = uwVar2.O0;
                                                            i29 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.vp.r1(i29).e7.edit().putBoolean("stories_" + str, false).apply();
                                                            ayVar2.getNotificationsController().c0(j11, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ayVar2).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryMutedHint", null, 2131747878, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            ay ayVar3 = uwVar2.O0;
                                                            i30 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                                            org.telegram.messenger.vp.r1(i30).e7.edit().putBoolean("stories_" + str, true).apply();
                                                            ayVar3.getNotificationsController().c0(j11, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ayVar3).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !g02 && j11 > j10);
                                            z60Var2.E();
                                            final int i29 = 1;
                                            z60Var2.l(R.drawable.msg_unmute, cd.L0(2131747876, null), new Runnable() { // from class: org.telegram.ui.rw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i292;
                                                    String trim;
                                                    int i30;
                                                    int i31 = i29;
                                                    TLRPC.User user = Z1;
                                                    String str = v;
                                                    uw uwVar2 = uwVar;
                                                    switch (i31) {
                                                        case 0:
                                                            ay ayVar2 = uwVar2.O0;
                                                            i292 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.vp.r1(i292).e7.edit().putBoolean("stories_" + str, false).apply();
                                                            ayVar2.getNotificationsController().c0(j11, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ayVar2).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryMutedHint", null, 2131747878, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            ay ayVar3 = uwVar2.O0;
                                                            i30 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                                            org.telegram.messenger.vp.r1(i30).e7.edit().putBoolean("stories_" + str, true).apply();
                                                            ayVar3.getNotificationsController().c0(j11, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ayVar3).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, g02 && j11 > j10);
                                            z60Var2.E();
                                            final int i30 = 0;
                                            z60Var2.l(R.drawable.msg_stories_stealth2, cd.L0(2131743588, null), new Runnable() { // from class: org.telegram.ui.sw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.p6 p6Var;
                                                    int i31;
                                                    org.telegram.ui.ActionBar.p6 p6Var2;
                                                    switch (i30) {
                                                        case 0:
                                                            uw uwVar2 = uwVar;
                                                            ay ayVar2 = uwVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i31 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i31).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof th.l) {
                                                                        ayVar2.E0.i((th.l) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = uwVar2.getContext();
                                                            p6Var = ((org.telegram.ui.ActionBar.k2) ayVar2).resourceProvider;
                                                            th.h4 h4Var = new th.h4(context, 0.0f, 1, p6Var);
                                                            h4Var.l1 = new tw(uwVar2, view2, 1);
                                                            ayVar2.showDialog(h4Var);
                                                            break;
                                                        default:
                                                            uw uwVar3 = uwVar;
                                                            Context context2 = uwVar3.getContext();
                                                            ay ayVar3 = uwVar3.O0;
                                                            p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar3).resourceProvider;
                                                            th.h4 h4Var2 = new th.h4(context2, 0.0f, 1, p6Var2);
                                                            h4Var2.l1 = new tw(uwVar3, view, 0);
                                                            ayVar3.showDialog(h4Var2);
                                                            break;
                                                    }
                                                }
                                            }, A3 && j11 > j10 && q6 && L && !H2);
                                            z60Var2.E();
                                            z11 = A3 && j11 > j10 && !q6 && L && !H2;
                                            String L02 = cd.L0(2131743588, null);
                                            final int i31 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.sw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.p6 p6Var;
                                                    int i312;
                                                    org.telegram.ui.ActionBar.p6 p6Var2;
                                                    switch (i31) {
                                                        case 0:
                                                            uw uwVar2 = uwVar;
                                                            ay ayVar2 = uwVar2.O0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i312 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i312).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof th.l) {
                                                                        ayVar2.E0.i((th.l) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = uwVar2.getContext();
                                                            p6Var = ((org.telegram.ui.ActionBar.k2) ayVar2).resourceProvider;
                                                            th.h4 h4Var = new th.h4(context, 0.0f, 1, p6Var);
                                                            h4Var.l1 = new tw(uwVar2, view2, 1);
                                                            ayVar2.showDialog(h4Var);
                                                            break;
                                                        default:
                                                            uw uwVar3 = uwVar;
                                                            Context context2 = uwVar3.getContext();
                                                            ay ayVar3 = uwVar3.O0;
                                                            p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar3).resourceProvider;
                                                            th.h4 h4Var2 = new th.h4(context2, 0.0f, 1, p6Var2);
                                                            h4Var2.l1 = new tw(uwVar3, view, 0);
                                                            ayVar3.showDialog(h4Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                z60Var2.b(R.drawable.msg_stories_stealth2, eqVar, L02, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, runnable);
                                                z60Var = z60Var2;
                                            } else {
                                                z60Var = z60Var2;
                                            }
                                            z60Var.E();
                                            final int i32 = 1;
                                            z60Var.l(R.drawable.msg_archive, cd.L0(2131754153, null), new Runnable() { // from class: org.telegram.ui.qw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i252;
                                                    switch (i32) {
                                                        case 0:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ay ayVar2 = uwVar.O0;
                                                            i252 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i252);
                                                            long j12 = j11;
                                                            b02.N1(j12);
                                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            uwVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        default:
                                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10 && !ayVar.p4());
                                            z60Var.E();
                                            final int i33 = 2;
                                            z60Var.l(R.drawable.msg_unarchive, cd.L0(2131743939, null), new Runnable() { // from class: org.telegram.ui.qw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i252;
                                                    switch (i33) {
                                                        case 0:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ay ayVar2 = uwVar.O0;
                                                            i252 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i252);
                                                            long j12 = j11;
                                                            b02.N1(j12);
                                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            uwVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        default:
                                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10 && ayVar.p4());
                                            z60Var.E();
                                            i18 = 3;
                                            z60Var.l(R.drawable.msg_delete, cd.L0(2131744766, null), new Runnable() { // from class: org.telegram.ui.qw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i252;
                                                    switch (i18) {
                                                        case 0:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            ay ayVar2 = uwVar.O0;
                                                            i252 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i252);
                                                            long j12 = j11;
                                                            b02.N1(j12);
                                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                            break;
                                                        case 4:
                                                            uwVar.O0.E0.j(j11);
                                                            break;
                                                        case 5:
                                                            uwVar.O0.presentFragment(un.ha(j11));
                                                            break;
                                                        default:
                                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                            break;
                                                    }
                                                }
                                            }, z10);
                                        }
                                    }
                                    z10 = false;
                                    z60 z60Var22 = ayVar.L0;
                                    final int i252 = 5;
                                    z60Var22.l(R.drawable.msg_discussion, cd.L0(2131745618, null), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2522;
                                            switch (i252) {
                                                case 0:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ay ayVar2 = uwVar.O0;
                                                    i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                    long j12 = j11;
                                                    b02.N1(j12);
                                                    ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    uwVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                default:
                                                    uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i262 = 6;
                                    z60Var22.l(R.drawable.msg_openprofile, cd.L0(2131747802, null), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2522;
                                            switch (i262) {
                                                case 0:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ay ayVar2 = uwVar.O0;
                                                    i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                    long j12 = j11;
                                                    b02.N1(j12);
                                                    ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    uwVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                default:
                                                    uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 > j10);
                                    final int i272 = 0;
                                    z60Var22.l(R.drawable.msg_channel, cd.L0(org.telegram.messenger.w3.V(L0) ? 2131747827 : 2131747815, null), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2522;
                                            switch (i272) {
                                                case 0:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ay ayVar2 = uwVar.O0;
                                                    i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                    long j12 = j11;
                                                    b02.N1(j12);
                                                    ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    uwVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                default:
                                                    uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                    break;
                                            }
                                        }
                                    }, j11 < j10);
                                    final int i282 = 0;
                                    z60Var22.l(R.drawable.msg_mute, cd.L0(2131747879, null), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i292;
                                            String trim;
                                            int i302;
                                            int i312 = i282;
                                            TLRPC.User user = Z1;
                                            String str = v;
                                            uw uwVar2 = uwVar;
                                            switch (i312) {
                                                case 0:
                                                    ay ayVar2 = uwVar2.O0;
                                                    i292 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.vp.r1(i292).e7.edit().putBoolean("stories_" + str, false).apply();
                                                    ayVar2.getNotificationsController().c0(j11, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ayVar2).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryMutedHint", null, 2131747878, trim)), null, null).j();
                                                    break;
                                                default:
                                                    ay ayVar3 = uwVar2.O0;
                                                    i302 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                                    org.telegram.messenger.vp.r1(i302).e7.edit().putBoolean("stories_" + str, true).apply();
                                                    ayVar3.getNotificationsController().c0(j11, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ayVar3).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !g02 && j11 > j10);
                                    z60Var22.E();
                                    final int i292 = 1;
                                    z60Var22.l(R.drawable.msg_unmute, cd.L0(2131747876, null), new Runnable() { // from class: org.telegram.ui.rw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2922;
                                            String trim;
                                            int i302;
                                            int i312 = i292;
                                            TLRPC.User user = Z1;
                                            String str = v;
                                            uw uwVar2 = uwVar;
                                            switch (i312) {
                                                case 0:
                                                    ay ayVar2 = uwVar2.O0;
                                                    i2922 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.vp.r1(i2922).e7.edit().putBoolean("stories_" + str, false).apply();
                                                    ayVar2.getNotificationsController().c0(j11, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ayVar2).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryMutedHint", null, 2131747878, trim)), null, null).j();
                                                    break;
                                                default:
                                                    ay ayVar3 = uwVar2.O0;
                                                    i302 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                                    org.telegram.messenger.vp.r1(i302).e7.edit().putBoolean("stories_" + str, true).apply();
                                                    ayVar3.getNotificationsController().c0(j11, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ayVar3).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, g02 && j11 > j10);
                                    z60Var22.E();
                                    final int i302 = 0;
                                    z60Var22.l(R.drawable.msg_stories_stealth2, cd.L0(2131743588, null), new Runnable() { // from class: org.telegram.ui.sw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.p6 p6Var;
                                            int i312;
                                            org.telegram.ui.ActionBar.p6 p6Var2;
                                            switch (i302) {
                                                case 0:
                                                    uw uwVar2 = uwVar;
                                                    ay ayVar2 = uwVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i312 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i312).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof th.l) {
                                                                ayVar2.E0.i((th.l) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = uwVar2.getContext();
                                                    p6Var = ((org.telegram.ui.ActionBar.k2) ayVar2).resourceProvider;
                                                    th.h4 h4Var = new th.h4(context, 0.0f, 1, p6Var);
                                                    h4Var.l1 = new tw(uwVar2, view2, 1);
                                                    ayVar2.showDialog(h4Var);
                                                    break;
                                                default:
                                                    uw uwVar3 = uwVar;
                                                    Context context2 = uwVar3.getContext();
                                                    ay ayVar3 = uwVar3.O0;
                                                    p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar3).resourceProvider;
                                                    th.h4 h4Var2 = new th.h4(context2, 0.0f, 1, p6Var2);
                                                    h4Var2.l1 = new tw(uwVar3, view, 0);
                                                    ayVar3.showDialog(h4Var2);
                                                    break;
                                            }
                                        }
                                    }, A3 && j11 > j10 && q6 && L && !H2);
                                    z60Var22.E();
                                    if (A3) {
                                    }
                                    String L022 = cd.L0(2131743588, null);
                                    final int i312 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.sw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.p6 p6Var;
                                            int i3122;
                                            org.telegram.ui.ActionBar.p6 p6Var2;
                                            switch (i312) {
                                                case 0:
                                                    uw uwVar2 = uwVar;
                                                    ay ayVar2 = uwVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i3122 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i3122).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof th.l) {
                                                                ayVar2.E0.i((th.l) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = uwVar2.getContext();
                                                    p6Var = ((org.telegram.ui.ActionBar.k2) ayVar2).resourceProvider;
                                                    th.h4 h4Var = new th.h4(context, 0.0f, 1, p6Var);
                                                    h4Var.l1 = new tw(uwVar2, view2, 1);
                                                    ayVar2.showDialog(h4Var);
                                                    break;
                                                default:
                                                    uw uwVar3 = uwVar;
                                                    Context context2 = uwVar3.getContext();
                                                    ay ayVar3 = uwVar3.O0;
                                                    p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar3).resourceProvider;
                                                    th.h4 h4Var2 = new th.h4(context2, 0.0f, 1, p6Var2);
                                                    h4Var2.l1 = new tw(uwVar3, view, 0);
                                                    ayVar3.showDialog(h4Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    z60Var.E();
                                    final int i322 = 1;
                                    z60Var.l(R.drawable.msg_archive, cd.L0(2131754153, null), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2522;
                                            switch (i322) {
                                                case 0:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ay ayVar2 = uwVar.O0;
                                                    i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                    long j12 = j11;
                                                    b02.N1(j12);
                                                    ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    uwVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                default:
                                                    uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10 && !ayVar.p4());
                                    z60Var.E();
                                    final int i332 = 2;
                                    z60Var.l(R.drawable.msg_unarchive, cd.L0(2131743939, null), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2522;
                                            switch (i332) {
                                                case 0:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ay ayVar2 = uwVar.O0;
                                                    i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                    long j12 = j11;
                                                    b02.N1(j12);
                                                    ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    uwVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                default:
                                                    uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10 && ayVar.p4());
                                    z60Var.E();
                                    i18 = 3;
                                    z60Var.l(R.drawable.msg_delete, cd.L0(2131744766, null), new Runnable() { // from class: org.telegram.ui.qw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2522;
                                            switch (i18) {
                                                case 0:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    ay ayVar2 = uwVar.O0;
                                                    i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                    long j12 = j11;
                                                    b02.N1(j12);
                                                    ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                    break;
                                                case 4:
                                                    uwVar.O0.E0.j(j11);
                                                    break;
                                                case 5:
                                                    uwVar.O0.presentFragment(un.ha(j11));
                                                    break;
                                                default:
                                                    uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                            }
                            eqVar = null;
                            if (j11 < j10) {
                                final int i242 = 4;
                                ayVar.L0.b(R.drawable.msg_stories_add, null, cd.L0(2131754384, null), org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new Runnable() { // from class: org.telegram.ui.qw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2522;
                                        switch (i242) {
                                            case 0:
                                                uwVar.O0.presentFragment(un.ha(j11));
                                                break;
                                            case 1:
                                                org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                break;
                                            case 2:
                                                org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                                break;
                                            case 3:
                                                ay ayVar2 = uwVar.O0;
                                                i2522 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2522);
                                                long j12 = j11;
                                                b02.N1(j12);
                                                ayVar2.getMessagesController().O1().l0(j12, true, false);
                                                break;
                                            case 4:
                                                uwVar.O0.E0.j(j11);
                                                break;
                                            case 5:
                                                uwVar.O0.presentFragment(un.ha(j11));
                                                break;
                                            default:
                                                uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (Z1 != null) {
                                i19 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                if (ui.b0(i19).G(j11)) {
                                }
                            }
                            z10 = false;
                            z60 z60Var222 = ayVar.L0;
                            final int i2522 = 5;
                            z60Var222.l(R.drawable.msg_discussion, cd.L0(2131745618, null), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i25222;
                                    switch (i2522) {
                                        case 0:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        case 1:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 3:
                                            ay ayVar2 = uwVar.O0;
                                            i25222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25222);
                                            long j12 = j11;
                                            b02.N1(j12);
                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                            break;
                                        case 4:
                                            uwVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        default:
                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2622 = 6;
                            z60Var222.l(R.drawable.msg_openprofile, cd.L0(2131747802, null), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i25222;
                                    switch (i2622) {
                                        case 0:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        case 1:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 3:
                                            ay ayVar2 = uwVar.O0;
                                            i25222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25222);
                                            long j12 = j11;
                                            b02.N1(j12);
                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                            break;
                                        case 4:
                                            uwVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        default:
                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                            break;
                                    }
                                }
                            }, j11 > j10);
                            final int i2722 = 0;
                            z60Var222.l(R.drawable.msg_channel, cd.L0(org.telegram.messenger.w3.V(L0) ? 2131747827 : 2131747815, null), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i25222;
                                    switch (i2722) {
                                        case 0:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        case 1:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 3:
                                            ay ayVar2 = uwVar.O0;
                                            i25222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25222);
                                            long j12 = j11;
                                            b02.N1(j12);
                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                            break;
                                        case 4:
                                            uwVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        default:
                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                            break;
                                    }
                                }
                            }, j11 < j10);
                            final int i2822 = 0;
                            z60Var222.l(R.drawable.msg_mute, cd.L0(2131747879, null), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2922;
                                    String trim;
                                    int i3022;
                                    int i3122 = i2822;
                                    TLRPC.User user = Z1;
                                    String str = v;
                                    uw uwVar2 = uwVar;
                                    switch (i3122) {
                                        case 0:
                                            ay ayVar2 = uwVar2.O0;
                                            i2922 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.vp.r1(i2922).e7.edit().putBoolean("stories_" + str, false).apply();
                                            ayVar2.getNotificationsController().c0(j11, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.cc.a0(ayVar2).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryMutedHint", null, 2131747878, trim)), null, null).j();
                                            break;
                                        default:
                                            ay ayVar3 = uwVar2.O0;
                                            i3022 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                            org.telegram.messenger.vp.r1(i3022).e7.edit().putBoolean("stories_" + str, true).apply();
                                            ayVar3.getNotificationsController().c0(j11, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.cc.a0(ayVar3).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !g02 && j11 > j10);
                            z60Var222.E();
                            final int i2922 = 1;
                            z60Var222.l(R.drawable.msg_unmute, cd.L0(2131747876, null), new Runnable() { // from class: org.telegram.ui.rw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i29222;
                                    String trim;
                                    int i3022;
                                    int i3122 = i2922;
                                    TLRPC.User user = Z1;
                                    String str = v;
                                    uw uwVar2 = uwVar;
                                    switch (i3122) {
                                        case 0:
                                            ay ayVar2 = uwVar2.O0;
                                            i29222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.vp.r1(i29222).e7.edit().putBoolean("stories_" + str, false).apply();
                                            ayVar2.getNotificationsController().c0(j11, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.cc.a0(ayVar2).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryMutedHint", null, 2131747878, trim)), null, null).j();
                                            break;
                                        default:
                                            ay ayVar3 = uwVar2.O0;
                                            i3022 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                            org.telegram.messenger.vp.r1(i3022).e7.edit().putBoolean("stories_" + str, true).apply();
                                            ayVar3.getNotificationsController().c0(j11, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.cc.a0(ayVar3).V(Arrays.asList(user), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, g02 && j11 > j10);
                            z60Var222.E();
                            final int i3022 = 0;
                            z60Var222.l(R.drawable.msg_stories_stealth2, cd.L0(2131743588, null), new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.p6 p6Var;
                                    int i3122;
                                    org.telegram.ui.ActionBar.p6 p6Var2;
                                    switch (i3022) {
                                        case 0:
                                            uw uwVar2 = uwVar;
                                            ay ayVar2 = uwVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i3122 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i3122).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof th.l) {
                                                        ayVar2.E0.i((th.l) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = uwVar2.getContext();
                                            p6Var = ((org.telegram.ui.ActionBar.k2) ayVar2).resourceProvider;
                                            th.h4 h4Var = new th.h4(context, 0.0f, 1, p6Var);
                                            h4Var.l1 = new tw(uwVar2, view2, 1);
                                            ayVar2.showDialog(h4Var);
                                            break;
                                        default:
                                            uw uwVar3 = uwVar;
                                            Context context2 = uwVar3.getContext();
                                            ay ayVar3 = uwVar3.O0;
                                            p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar3).resourceProvider;
                                            th.h4 h4Var2 = new th.h4(context2, 0.0f, 1, p6Var2);
                                            h4Var2.l1 = new tw(uwVar3, view, 0);
                                            ayVar3.showDialog(h4Var2);
                                            break;
                                    }
                                }
                            }, A3 && j11 > j10 && q6 && L && !H2);
                            z60Var222.E();
                            if (A3) {
                            }
                            String L0222 = cd.L0(2131743588, null);
                            final int i3122 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.sw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.p6 p6Var;
                                    int i31222;
                                    org.telegram.ui.ActionBar.p6 p6Var2;
                                    switch (i3122) {
                                        case 0:
                                            uw uwVar2 = uwVar;
                                            ay ayVar2 = uwVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).O1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i31222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i31222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof th.l) {
                                                        ayVar2.E0.i((th.l) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = uwVar2.getContext();
                                            p6Var = ((org.telegram.ui.ActionBar.k2) ayVar2).resourceProvider;
                                            th.h4 h4Var = new th.h4(context, 0.0f, 1, p6Var);
                                            h4Var.l1 = new tw(uwVar2, view2, 1);
                                            ayVar2.showDialog(h4Var);
                                            break;
                                        default:
                                            uw uwVar3 = uwVar;
                                            Context context2 = uwVar3.getContext();
                                            ay ayVar3 = uwVar3.O0;
                                            p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar3).resourceProvider;
                                            th.h4 h4Var2 = new th.h4(context2, 0.0f, 1, p6Var2);
                                            h4Var2.l1 = new tw(uwVar3, view, 0);
                                            ayVar3.showDialog(h4Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            z60Var.E();
                            final int i3222 = 1;
                            z60Var.l(R.drawable.msg_archive, cd.L0(2131754153, null), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i25222;
                                    switch (i3222) {
                                        case 0:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        case 1:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 3:
                                            ay ayVar2 = uwVar.O0;
                                            i25222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25222);
                                            long j12 = j11;
                                            b02.N1(j12);
                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                            break;
                                        case 4:
                                            uwVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        default:
                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                            break;
                                    }
                                }
                            }, z10 && !ayVar.p4());
                            z60Var.E();
                            final int i3322 = 2;
                            z60Var.l(R.drawable.msg_unarchive, cd.L0(2131743939, null), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i25222;
                                    switch (i3322) {
                                        case 0:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        case 1:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 3:
                                            ay ayVar2 = uwVar.O0;
                                            i25222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25222);
                                            long j12 = j11;
                                            b02.N1(j12);
                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                            break;
                                        case 4:
                                            uwVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        default:
                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                            break;
                                    }
                                }
                            }, z10 && ayVar.p4());
                            z60Var.E();
                            i18 = 3;
                            z60Var.l(R.drawable.msg_delete, cd.L0(2131744766, null), new Runnable() { // from class: org.telegram.ui.qw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i25222;
                                    switch (i18) {
                                        case 0:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        case 1:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.i0.h3(new wv(uwVar.O0, j11, !r2.p4(), 0), 200L);
                                            break;
                                        case 3:
                                            ay ayVar2 = uwVar.O0;
                                            i25222 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i25222);
                                            long j12 = j11;
                                            b02.N1(j12);
                                            ayVar2.getMessagesController().O1().l0(j12, true, false);
                                            break;
                                        case 4:
                                            uwVar.O0.E0.j(j11);
                                            break;
                                        case 5:
                                            uwVar.O0.presentFragment(un.ha(j11));
                                            break;
                                        default:
                                            uwVar.O0.presentFragment(ProfileActivity.z4(j11));
                                            break;
                                    }
                                }
                            }, z10);
                        } else if (ayVar.N3) {
                            z60 z60Var3 = ayVar.L0;
                            String L03 = cd.L0(2131754384, null);
                            int i34 = org.telegram.ui.ActionBar.t6.F8;
                            int i35 = org.telegram.ui.ActionBar.t6.E8;
                            z60Var3.b(R.drawable.msg_stories_add, null, L03, i34, i35, new Runnable() { // from class: org.telegram.ui.pw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i36;
                                    int i37;
                                    switch (i22) {
                                        case 0:
                                            uwVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            ay ayVar2 = uwVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.d20.i(i36).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            ayVar2.presentFragment(new org.telegram.ui.Components.n90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            ay ayVar3 = uwVar.O0;
                                            i37 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.d20.i(i37).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            ayVar3.presentFragment(new org.telegram.ui.Components.n90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            ayVar.L0.b(R.drawable.msg_stories_archive, null, cd.L0(2131754123, null), i34, i35, new Runnable() { // from class: org.telegram.ui.pw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i36;
                                    int i37;
                                    switch (i23) {
                                        case 0:
                                            uwVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            ay ayVar2 = uwVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.d20.i(i36).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            ayVar2.presentFragment(new org.telegram.ui.Components.n90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            ay ayVar3 = uwVar.O0;
                                            i37 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.d20.i(i37).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            ayVar3.presentFragment(new org.telegram.ui.Components.n90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            ayVar.L0.b(R.drawable.msg_stories_saved, null, cd.L0(2131745902, null), i34, i35, new Runnable() { // from class: org.telegram.ui.pw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i36;
                                    int i37;
                                    switch (i21) {
                                        case 0:
                                            uwVar.O0.E0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            ay ayVar2 = uwVar.O0;
                                            i36 = ((org.telegram.ui.ActionBar.k2) ayVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.d20.i(i36).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            ayVar2.presentFragment(new org.telegram.ui.Components.n90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            ay ayVar3 = uwVar.O0;
                                            i37 = ((org.telegram.ui.ActionBar.k2) ayVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.d20.i(i37).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            ayVar3.presentFragment(new org.telegram.ui.Components.n90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            i18 = 3;
                        } else {
                            uw uwVar2 = ayVar.E0;
                            if (uwVar2 != null) {
                                uwVar2.n();
                            }
                        }
                        z60 z60Var4 = ayVar.L0;
                        z60Var4.i = i18;
                        z60Var4.a0(org.telegram.messenger.i0.L(-8.0f), org.telegram.messenger.i0.L(-10.0f));
                        z60Var4.Z();
                        return false;
                    }
                    t2Var.a();
                }
                return false;
            case 22:
                uq0 uq0Var = ((uh.i) obj).W;
                if (uq0Var.G.E1 || !(view instanceof org.telegram.ui.Cells.s7)) {
                    return false;
                }
                jj messageObject = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                if (uq0Var.c(messageObject)) {
                    uq0Var.g(messageObject);
                } else {
                    uq0Var.e(messageObject);
                }
                return true;
            default:
                vh.k2 k2Var = (vh.k2) obj;
                ArrayList arrayList = k2Var.b0;
                ArrayList arrayList2 = k2Var.h0;
                if (i10 < 2 || k2Var.W == null || !(view instanceof vh.h2)) {
                    return false;
                }
                int i36 = i10 - 2;
                if (k2Var.c0) {
                    if (i36 == 0) {
                        return false;
                    }
                    i36 = i10 - 3;
                } else if (k2Var.d0) {
                    if (i36 >= 0 && i36 < arrayList.size()) {
                        return false;
                    }
                    i36 -= arrayList.size();
                }
                if (i36 < 0 || i36 >= k2Var.f0.size()) {
                    return false;
                }
                ef efVar = (ef) k2Var.f0.get(i36);
                if (!arrayList2.isEmpty() || k2Var.Q) {
                    return false;
                }
                if (arrayList2.contains(efVar)) {
                    arrayList2.remove(efVar);
                } else {
                    if (arrayList2.size() + 1 > k2Var.R) {
                        int i37 = -k2Var.N;
                        k2Var.N = i37;
                        org.telegram.messenger.i0.F3(i37, view, null);
                        t2Var.a();
                        return true;
                    }
                    arrayList2.add(efVar);
                }
                org.telegram.messenger.i0.a4(k2Var.d);
                k2Var.j();
                return true;
        }
    }

    @Override // org.telegram.ui.Components.uj0
    public void g() {
        ((vh.b1) this.b).invalidate();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                ((q20) this.b).a(x1Var.h(i10, true, true));
                break;
            case 13:
                ((Runnable) this.b).run();
                break;
            case 23:
                vh.o8 o8Var = ((vh.e8) ((vh.p) this.b)).R1;
                vh.d8 d8Var = o8Var.X0;
                if (d8Var != null) {
                    d8Var.s(null, null, true);
                }
                vh.s7 s7Var = o8Var.v1;
                if (s7Var != null) {
                    s7Var.n0();
                }
                vh.e8 e8Var = o8Var.c1;
                if (e8Var != null) {
                    e8Var.setHasRoundVideo(false);
                }
                vh.n5 n5Var = o8Var.K1;
                if (n5Var != null) {
                    File file = n5Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        o8Var.K1.o0 = null;
                    }
                    if (o8Var.K1.p0 != null) {
                        try {
                            new File(o8Var.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        o8Var.K1.p0 = null;
                        break;
                    }
                }
                break;
            default:
                ((vh.u3) this.b).a.Y1.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // qa.a
    public void i(qa.b bVar) {
        u9.a aVar = (u9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((u9.a) bVar.get());
    }

    @Override // th.i7
    public void j(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.i0.L(7.0f)) - (org.telegram.messenger.i0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.i0.L(7.0f)) - (org.telegram.messenger.i0.L(14.0f) * pow), org.telegram.messenger.i0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 4:
                e6.b((e6) this.b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
            case 8:
                e8 e8Var = (e8) this.b;
                a51 a51Var = (a51) obj;
                if (a51Var.G instanceof TL_stars.StarsTransaction) {
                    h8.j1(e8Var.getContext(), false, 0L, e8Var.c, (TL_stars.StarsTransaction) a51Var.G, e8Var.b);
                    break;
                }
                break;
            default:
                vh.k7 k7Var = (vh.k7) this.b;
                a51 a51Var2 = (a51) obj;
                int i10 = a51Var2.d;
                vh.n5 n5Var = (vh.n5) a51Var2.G;
                k7Var.c(false, true);
                vh.o8 o8Var = k7Var.O;
                if (n5Var != o8Var.K1 && !o8Var.X1) {
                    o8Var.d1.setSelected(i10);
                    o8Var.X1 = true;
                    org.telegram.utils.twidget.v vVar = new org.telegram.utils.twidget.v(o8Var, i10, 9);
                    vh.s7 s7Var = o8Var.v1;
                    vh.n5 n5Var2 = o8Var.K1;
                    if (s7Var != null && n5Var2 != null) {
                        if (!s7Var.r0()) {
                            vVar.run();
                            break;
                        } else {
                            n5Var2.f();
                            boolean r02 = s7Var.r0();
                            boolean z10 = s7Var.x0.getPainting().E;
                            Utilities.g.c(new ee(o8Var, s7Var, n5Var2.i0, n5Var2.j0, n5Var2, z10, r02, vVar, 1));
                            break;
                        }
                    } else {
                        vVar.run();
                        break;
                    }
                }
                break;
        }
    }

    @Override // rf.l
    public void l(long j10) {
        ((p3) this.b).h();
    }

    @Override // nh.m
    public void m(nh.i iVar, float f7, float f10) {
        th.h6 h6Var = (th.h6) this.b;
        if (h6Var.v.y) {
            return;
        }
        iVar.q = new th.g6(h6Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = h6Var.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((nh.i) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        vh.o7 o7Var = (vh.o7) this.b;
        vh.o8 o8Var = o7Var.a;
        vh.r4 r4Var = o8Var.O0;
        int i10 = o8Var.c;
        if (r4Var != null) {
            r4Var.g(true);
        }
        if (o8Var.p0()) {
            o8Var.s.d();
        }
        if (o8Var.G1 == null || o8Var.B0 == null) {
            return;
        }
        o8Var.Q1 = false;
        o8Var.R1 = false;
        vh.o4 o4Var = o8Var.C0;
        if (o4Var != null) {
            o4Var.c(false);
        }
        if (j10 <= 800) {
            o8Var.g(false, true);
            o8Var.c0(false);
            o8Var.J0.b(false, true);
            vh.r4 r4Var2 = o8Var.O0;
            if (r4Var2 != null) {
                r4Var2.g(true);
            }
            try {
                o8Var.G1.delete();
                o8Var.G1 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            }
            return;
        }
        o8Var.h0(false, true);
        vh.n5 o10 = vh.n5.o(o8Var.G1, str, j10);
        o10.J0 = o8Var.v0;
        o10.K0 = o8Var.w0;
        o10.B();
        o8Var.g(false, true);
        o8Var.c0(false);
        o8Var.J0.b(false, true);
        vh.r4 r4Var3 = o8Var.O0;
        if (r4Var3 != null) {
            r4Var3.g(true);
        }
        if (!o8Var.A0.j()) {
            o8Var.K1 = o10;
            vh.x6.a(i10, o10);
            o8Var.L1 = false;
            int videoWidth = o8Var.B0.getVideoWidth();
            int videoHeight = o8Var.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                vh.n5 n5Var = o8Var.K1;
                n5Var.k0 = videoWidth;
                n5Var.l0 = videoHeight;
                n5Var.A();
            }
            o8Var.K(new vh.m7(o7Var, 3), 0L);
            return;
        }
        o8Var.G1 = null;
        o10.P = 1.0f;
        if (o8Var.A0.l(o10)) {
            vh.n5 a2 = vh.n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
            o8Var.K1 = a2;
            vh.x6.a(i10, a2);
            o8Var.L1 = false;
            int videoWidth2 = o8Var.B0.getVideoWidth();
            int videoHeight2 = o8Var.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                vh.n5 n5Var2 = o8Var.K1;
                n5Var2.k0 = videoWidth2;
                n5Var2.l0 = videoHeight2;
                n5Var2.A();
            }
        }
        o8Var.l0(true);
    }

    @Override // t0.e
    public boolean p(m2.t tVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((t0.h) tVar.b).c();
                Parcelable parcelable = (Parcelable) ((t0.h) tVar.b).f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = (t0.h) tVar.b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            dVar = new j2.k(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.d());
        dVar.setExtras(bundle);
        return r0.h0.h(sVar, dVar.build()) == null;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        View view = ((g4) this.b).b;
        if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).U();
        } else {
            view.invalidate();
        }
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
