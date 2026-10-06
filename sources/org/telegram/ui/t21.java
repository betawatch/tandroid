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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        org.telegram.ui.Components.gq0 gq0Var;
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
                    org.telegram.ui.Components.t21 t21Var = (org.telegram.ui.Components.t21) zl0Var.getChildAt(i12);
                    if (t21Var != view && (gq0Var = t21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(gq0Var);
                        t21Var.J.run();
                    }
                    i12++;
                }
                if (!((org.telegram.ui.Components.op) npVar.d.get(i10)).a.a) {
                    ((org.telegram.ui.Components.t21) view).d();
                }
                i21 i21Var = x21Var.J;
                if (i21Var != null) {
                    i21Var.a.d0(i10, x21Var.K.a, true);
                    return;
                }
                return;
            case 1:
                d31.S((d31) this.b, view);
                return;
            case 2:
                w31.S((w31) this.b, view, i10);
                return;
            case 3:
                f41 f41Var = (f41) this.b;
                ri.a aVar = ri.e.b;
                if (i10 == 1) {
                    aVar.a();
                    boolean z10 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z10;
                        aVar.c = true;
                        aVar.b = true;
                        ri.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    f41Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    f41Var.T(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(24));
                    return;
                }
                if (i10 == 3) {
                    f41Var.T(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(i11));
                    return;
                }
                if (i10 == 4) {
                    f41Var.T(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(26));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        ri.a aVar2 = ri.e.g;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        f41Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = f41.c;
                    if (i12 >= 3) {
                        f41Var.T(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(27));
                        return;
                    } else {
                        charSequenceArr[i12] = f41.S(iArr[i12]);
                        i12++;
                    }
                }
            case 4:
                k71 k71Var = (k71) this.b;
                org.telegram.ui.Components.h61 G = k71Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.i6) view).s(true, true);
                    k71Var.a0 = (TLObject) G.G;
                    k71Var.S(true);
                    k71Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((n71) this.b).O(i10, view);
                return;
            case 6:
                SessionsActivity.S((SessionsActivity) this.b, i10);
                return;
            case 7:
                ta1 ta1Var = (ta1) this.b;
                ArrayList arrayList = ta1Var.N;
                ArrayList arrayList2 = ta1Var.O;
                y91 y91Var = ta1Var.W;
                int i14 = y91Var.I;
                if (i10 >= i14 && i10 <= y91Var.J) {
                    qa1 qa1Var = (qa1) ta1Var.y0.get(i10 - i14);
                    hj0 hj0Var = new hj0(qa1Var.b, true, ta1Var.b);
                    hj0Var.e0 = qa1Var;
                    ta1Var.presentFragment(hj0Var);
                    return;
                }
                int i15 = y91Var.U;
                if (i10 >= i15 && i10 <= y91Var.V) {
                    ((ma1) ta1Var.Q.get(i10 - i15)).b(ta1Var);
                    return;
                }
                int i16 = y91Var.R;
                if (i10 >= i16 && i10 <= y91Var.S) {
                    ((ma1) arrayList2.get(i10 - i16)).b(ta1Var);
                    return;
                }
                int i17 = y91Var.X;
                if (i10 >= i17 && i10 <= y91Var.Y) {
                    ((ma1) ta1Var.P.get(i10 - i17)).b(ta1Var);
                    return;
                }
                if (i10 == y91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i18 = ta1Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    y91 y91Var2 = ta1Var.W;
                    if (y91Var2 != null) {
                        y91Var2.E();
                        ta1Var.S.setItemAnimator(ta1Var.X);
                        ta1Var.W.s(i18 + 1, size);
                        ta1Var.W.u(i18);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                pd1 pd1Var = (pd1) this.b;
                boolean z11 = pd1Var.W0 != null;
                pd1Var.Z0(i10);
                if (z11 == (pd1Var.W0 == null)) {
                    pd1Var.M0();
                    pd1Var.l1();
                }
                pd1Var.n1();
                pd1Var.J0[1].a(pd1Var.W0 != null, true);
                pd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 < 0) {
                    pd1Var.P0.w0(i19, 0, null);
                    return;
                }
                int i20 = right + dp;
                if (i20 > pd1Var.P0.getMeasuredWidth()) {
                    xb1 xb1Var = pd1Var.P0;
                    xb1Var.w0(i20 - xb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                le1 le1Var = (le1) this.b;
                int i21 = le1Var.H;
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
                        le1Var.n.animate().translationY(i21).setDuration(200L).setListener(new he1(le1Var, i12)).start();
                        org.telegram.ui.Components.zl0 zl0Var2 = le1Var.s.getVisibility() == 0 ? le1Var.b : le1Var.a;
                        zl0Var2.d1(false);
                        int N0 = ((s4.c0) zl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == zl0Var2.getAdapter().h() - 1 || (N0 == zl0Var2.getAdapter().h() - 2 && zl0Var2 == le1Var.a)) && (K = zl0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == le1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (zl0Var2.getMeasuredHeight() - bottom <= i21) {
                                zl0Var2.setTranslationY(-(zl0Var2.getMeasuredHeight() - bottom));
                                zl0Var2.animate().translationY(0.0f).setDuration(200L).start();
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
                        le1Var.n.setTranslationY(i21);
                        le1Var.n.animate().setListener(null).cancel();
                        le1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, i13)).start();
                        le1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(f7));
                        le1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.zl0 zl0Var3 = le1Var.s.getVisibility() == 0 ? le1Var.b : le1Var.a;
                    int height = zl0Var3.getHeight() - view.getBottom();
                    if (height < i21) {
                        zl0Var3.w0(0, i21 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                wf1.T((wf1) this.b, view);
                return;
            case 11:
                wf1 wf1Var = ((sf1) this.b).v0;
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
                WallpapersListActivity.T((WallpapersListActivity) this.b, i10);
                return;
            default:
                zi1 zi1Var = (zi1) this.b;
                zi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sa.e.j(string, " ");
                String[] strArr = WallpapersListActivity.l0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = zi1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                zi1Var.n = strArr[i10];
                zi1Var.E("", true);
                return;
        }
    }
}
