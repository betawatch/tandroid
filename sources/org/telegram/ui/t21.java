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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.br0 br0Var;
        float f7;
        s4.c1 K;
        int i11 = 25;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                x21 x21Var = (x21) this.b;
                org.telegram.ui.Components.zl0 zl0Var = x21Var.y;
                org.telegram.ui.Components.np npVar = x21Var.b;
                if (npVar.d.get(i10) == x21Var.K || x21Var.O != null) {
                    return;
                }
                x21Var.Q = false;
                x21Var.K = (org.telegram.ui.Components.op) npVar.d.get(i10);
                npVar.E(i10);
                x21Var.h.postDelayed(new org.telegram.ui.Components.ld(x21Var, i10, i11), 100L);
                while (i12 < zl0Var.getChildCount()) {
                    org.telegram.ui.Components.s21 s21Var = (org.telegram.ui.Components.s21) zl0Var.getChildAt(i12);
                    if (s21Var != view && (br0Var = s21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(br0Var);
                        s21Var.J.run();
                    }
                    i12++;
                }
                if (!((org.telegram.ui.Components.op) npVar.d.get(i10)).a.a) {
                    ((org.telegram.ui.Components.s21) view).d();
                }
                i21 i21Var = x21Var.J;
                if (i21Var != null) {
                    i21Var.a.d0(i10, x21Var.K.a, true);
                    return;
                }
                return;
            case 1:
                f31.S((f31) this.b, view);
                return;
            case 2:
                y31.S((y31) this.b, view, i10);
                return;
            case 3:
                h41 h41Var = (h41) this.b;
                ri.a aVar = ri.e.b;
                if (i10 == 1) {
                    boolean z10 = !aVar.a();
                    synchronized (aVar) {
                        aVar.c = z10;
                        aVar.b = true;
                        ri.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    h41Var.b.l();
                    return;
                }
                if (!aVar.a()) {
                    return;
                }
                if (i10 == 2) {
                    h41Var.T(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(24));
                    return;
                }
                if (i10 == 3) {
                    h41Var.T(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(i11));
                    return;
                }
                if (i10 == 4) {
                    h41Var.T(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(26));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        ri.e.g.b(!r3.a());
                        h41Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = h41.c;
                    if (i12 >= 3) {
                        h41Var.T(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(27));
                        return;
                    } else {
                        charSequenceArr[i12] = h41.S(iArr[i12]);
                        i12++;
                    }
                }
            case 4:
                m71 m71Var = (m71) this.b;
                org.telegram.ui.Components.g61 G = m71Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.i6) view).s(true, true);
                    m71Var.a0 = (TLObject) G.G;
                    m71Var.S(true);
                    m71Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((p71) this.b).O(i10, view);
                return;
            case 6:
                SessionsActivity.S((SessionsActivity) this.b, i10);
                return;
            case 7:
                va1 va1Var = (va1) this.b;
                ArrayList arrayList = va1Var.N;
                ArrayList arrayList2 = va1Var.O;
                aa1 aa1Var = va1Var.W;
                int i14 = aa1Var.I;
                if (i10 >= i14 && i10 <= aa1Var.J) {
                    sa1 sa1Var = (sa1) va1Var.y0.get(i10 - i14);
                    hj0 hj0Var = new hj0(sa1Var.b, true, va1Var.b);
                    hj0Var.e0 = sa1Var;
                    va1Var.presentFragment(hj0Var);
                    return;
                }
                int i15 = aa1Var.U;
                if (i10 >= i15 && i10 <= aa1Var.V) {
                    ((oa1) va1Var.Q.get(i10 - i15)).b(va1Var);
                    return;
                }
                int i16 = aa1Var.R;
                if (i10 >= i16 && i10 <= aa1Var.S) {
                    ((oa1) arrayList2.get(i10 - i16)).b(va1Var);
                    return;
                }
                int i17 = aa1Var.X;
                if (i10 >= i17 && i10 <= aa1Var.Y) {
                    ((oa1) va1Var.P.get(i10 - i17)).b(va1Var);
                    return;
                }
                if (i10 == aa1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i18 = va1Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    aa1 aa1Var2 = va1Var.W;
                    if (aa1Var2 != null) {
                        aa1Var2.E();
                        va1Var.S.setItemAnimator(va1Var.X);
                        va1Var.W.s(i18 + 1, size);
                        va1Var.W.u(i18);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                rd1 rd1Var = (rd1) this.b;
                boolean z11 = rd1Var.W0 != null;
                rd1Var.Z0(i10);
                if (z11 == (rd1Var.W0 == null)) {
                    rd1Var.M0();
                    rd1Var.l1();
                }
                rd1Var.n1();
                rd1Var.J0[1].a(rd1Var.W0 != null, true);
                rd1Var.P0.h1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 < 0) {
                    rd1Var.P0.w0(i19, 0, null);
                    return;
                }
                int i20 = right + dp;
                if (i20 > rd1Var.P0.getMeasuredWidth()) {
                    zb1 zb1Var = rd1Var.P0;
                    zb1Var.w0(i20 - zb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                ne1 ne1Var = (ne1) this.b;
                int i21 = ne1Var.H;
                HashSet hashSet = ne1Var.w;
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
                    if (hashSet.isEmpty() && ne1Var.v != -1 && ne1Var.n.getVisibility() == 0) {
                        ne1Var.v = -1;
                        ne1Var.n.animate().setListener(null).cancel();
                        ne1Var.n.animate().translationY(i21).setDuration(200L).setListener(new je1(ne1Var, i12)).start();
                        org.telegram.ui.Components.zl0 zl0Var2 = ne1Var.s.getVisibility() == 0 ? ne1Var.b : ne1Var.a;
                        zl0Var2.e1(false);
                        int N0 = ((s4.c0) zl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == zl0Var2.getAdapter().h() - 1 || (N0 == zl0Var2.getAdapter().h() - 2 && zl0Var2 == ne1Var.a)) && (K = zl0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ne1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (zl0Var2.getMeasuredHeight() - bottom <= i21) {
                                zl0Var2.setTranslationY(-(zl0Var2.getMeasuredHeight() - bottom));
                                zl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ne1Var.a.setPadding(0, 0, 0, 0);
                        ne1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ne1Var.n.getVisibility() == 8 && ne1Var.v != 1) {
                        ne1Var.v = 1;
                        ne1Var.n.setVisibility(0);
                        ne1Var.n.setTranslationY(i21);
                        ne1Var.n.animate().setListener(null).cancel();
                        ne1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new je1(ne1Var, i13)).start();
                        ne1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(f7));
                        ne1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ne1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.zl0 zl0Var3 = ne1Var.s.getVisibility() == 0 ? ne1Var.b : ne1Var.a;
                    int height = zl0Var3.getHeight() - view.getBottom();
                    if (height < i21) {
                        zl0Var3.w0(0, i21 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                yf1.T((yf1) this.b, view);
                return;
            case 11:
                yf1 yf1Var = ((uf1) this.b).u0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(yf1Var, yf1Var.a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof vf1) {
                        vf1 vf1Var = (vf1) view;
                        ng.d.m(yf1Var, yf1Var.a, vf1Var.N, vf1Var.getMessageId());
                        return;
                    }
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.b, i10);
                return;
            case 13:
                WallpapersListActivity.T((WallpapersListActivity) this.b, i10);
                return;
            default:
                bj1 bj1Var = (bj1) this.b;
                bj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = t8.b.j(string, " ");
                String[] strArr = WallpapersListActivity.l0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bj1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                bj1Var.n = strArr[i10];
                bj1Var.E("", true);
                return;
        }
    }
}
