package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.wq0 wq0Var;
        float f7;
        s4.c1 K;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                v21 v21Var = (v21) this.b;
                org.telegram.ui.Components.wl0 wl0Var = v21Var.y;
                org.telegram.ui.Components.lp lpVar = v21Var.b;
                if (lpVar.d.get(i10) == v21Var.K || v21Var.O != null) {
                    return;
                }
                v21Var.Q = false;
                v21Var.K = (org.telegram.ui.Components.mp) lpVar.d.get(i10);
                lpVar.E(i10);
                v21Var.h.postDelayed(new org.telegram.ui.Components.ld(v21Var, i10, 26), 100L);
                while (i11 < wl0Var.getChildCount()) {
                    org.telegram.ui.Components.h21 h21Var = (org.telegram.ui.Components.h21) wl0Var.getChildAt(i11);
                    if (h21Var != view && (wq0Var = h21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(wq0Var);
                        h21Var.J.run();
                    }
                    i11++;
                }
                if (!((org.telegram.ui.Components.mp) lpVar.d.get(i10)).a.a) {
                    ((org.telegram.ui.Components.h21) view).d();
                }
                g21 g21Var = v21Var.J;
                if (g21Var != null) {
                    g21Var.a.d0(i10, v21Var.K.a, true);
                    return;
                }
                return;
            case 1:
                d31.U((d31) this.b, view);
                return;
            case 2:
                w31.U((w31) this.b, view, i10);
                return;
            case 3:
                f41 f41Var = (f41) this.b;
                pi.a aVar = pi.e.b;
                if (i10 == 1) {
                    boolean z10 = !aVar.a();
                    synchronized (aVar) {
                        aVar.c = z10;
                        aVar.b = true;
                        pi.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    f41Var.b.l();
                    return;
                }
                if (!aVar.a()) {
                    return;
                }
                if (i10 == 2) {
                    f41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(22));
                    return;
                }
                if (i10 == 3) {
                    f41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(23));
                    return;
                }
                if (i10 == 4) {
                    f41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(24));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        pi.e.g.b(!r3.a());
                        f41Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = f41.c;
                    if (i11 >= 3) {
                        f41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(25));
                        return;
                    } else {
                        charSequenceArr[i11] = f41.U(iArr[i11]);
                        i11++;
                    }
                }
            case 4:
                k71 k71Var = (k71) this.b;
                org.telegram.ui.Components.v51 G = k71Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.i6) view).s(true, true);
                    k71Var.a0 = (TLObject) G.G;
                    k71Var.U(true);
                    k71Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((n71) this.b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.b, i10);
                return;
            case 7:
                sa1 sa1Var = (sa1) this.b;
                ArrayList arrayList = sa1Var.N;
                ArrayList arrayList2 = sa1Var.O;
                x91 x91Var = sa1Var.X;
                int i13 = x91Var.I;
                if (i10 >= i13 && i10 <= x91Var.J) {
                    pa1 pa1Var = (pa1) sa1Var.v0.get(i10 - i13);
                    dj0 dj0Var = new dj0(pa1Var.b, true, sa1Var.b);
                    dj0Var.e0 = pa1Var;
                    sa1Var.presentFragment(dj0Var);
                    return;
                }
                int i14 = x91Var.U;
                if (i10 >= i14 && i10 <= x91Var.V) {
                    ((la1) sa1Var.Q.get(i10 - i14)).b(sa1Var);
                    return;
                }
                int i15 = x91Var.R;
                if (i10 >= i15 && i10 <= x91Var.S) {
                    ((la1) arrayList2.get(i10 - i15)).b(sa1Var);
                    return;
                }
                int i16 = x91Var.X;
                if (i10 >= i16 && i10 <= x91Var.Y) {
                    ((la1) sa1Var.P.get(i10 - i16)).b(sa1Var);
                    return;
                }
                if (i10 == x91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = sa1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    x91 x91Var2 = sa1Var.X;
                    if (x91Var2 != null) {
                        x91Var2.E();
                        sa1Var.S.setItemAnimator(sa1Var.Y);
                        sa1Var.X.s(i17 + 1, size);
                        sa1Var.X.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                od1 od1Var = (od1) this.b;
                boolean z11 = od1Var.W0 != null;
                od1Var.Z0(i10);
                if (z11 == (od1Var.W0 == null)) {
                    od1Var.M0();
                    od1Var.l1();
                }
                od1Var.n1();
                od1Var.J0[1].a(od1Var.W0 != null, true);
                od1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    od1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > od1Var.P0.getMeasuredWidth()) {
                    wb1 wb1Var = od1Var.P0;
                    wb1Var.v0(i19 - wb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                le1 le1Var = (le1) this.b;
                int i20 = le1Var.H;
                HashSet hashSet = le1Var.w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && le1Var.v != -1 && le1Var.n.getVisibility() == 0) {
                        le1Var.v = -1;
                        le1Var.n.animate().setListener(null).cancel();
                        le1Var.n.animate().translationY(i20).setDuration(200L).setListener(new he1(le1Var, i11)).start();
                        org.telegram.ui.Components.wl0 wl0Var2 = le1Var.s.getVisibility() == 0 ? le1Var.b : le1Var.a;
                        wl0Var2.d1(false);
                        int N0 = ((s4.c0) wl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == wl0Var2.getAdapter().h() - 1 || (N0 == wl0Var2.getAdapter().h() - 2 && wl0Var2 == le1Var.a)) && (K = wl0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == le1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (wl0Var2.getMeasuredHeight() - bottom <= i20) {
                                wl0Var2.setTranslationY(-(wl0Var2.getMeasuredHeight() - bottom));
                                wl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        le1Var.a.setPadding(0, 0, 0, 0);
                        le1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && le1Var.n.getVisibility() == 8 && le1Var.v != 1) {
                        le1Var.v = 1;
                        le1Var.n.setVisibility(0);
                        le1Var.n.setTranslationY(i20);
                        le1Var.n.animate().setListener(null).cancel();
                        le1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, i12)).start();
                        le1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        le1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.wl0 wl0Var3 = le1Var.s.getVisibility() == 0 ? le1Var.b : le1Var.a;
                    int height = wl0Var3.getHeight() - view.getBottom();
                    if (height < i20) {
                        wl0Var3.v0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                wf1.V((wf1) this.b, view);
                return;
            case 11:
                wf1 wf1Var = ((sf1) this.b).t0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(wf1Var, wf1Var.a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof tf1) {
                        tf1 tf1Var = (tf1) view;
                        ng.d.m(wf1Var, wf1Var.a, tf1Var.N, tf1Var.getMessageId());
                        return;
                    }
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.b, i10);
                return;
            default:
                bj1 bj1Var = (bj1) this.b;
                bj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder h = v7.j.h(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                bj1Var.n = strArr[i10];
                bj1Var.E("", true);
                return;
        }
    }
}
