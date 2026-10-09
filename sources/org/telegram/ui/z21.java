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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z21 implements org.telegram.ui.Components.em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.or0 or0Var;
        float f7;
        s4.d1 K;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                d31 d31Var = (d31) this.b;
                org.telegram.ui.Components.qm0 qm0Var = d31Var.y;
                org.telegram.ui.Components.aq aqVar = d31Var.b;
                if (aqVar.d.get(i10) == d31Var.K || d31Var.O != null) {
                    return;
                }
                d31Var.Q = false;
                d31Var.K = (org.telegram.ui.Components.bq) aqVar.d.get(i10);
                aqVar.E(i10);
                d31Var.h.postDelayed(new org.telegram.ui.Components.nd(d31Var, i10, 26), 100L);
                while (i11 < qm0Var.getChildCount()) {
                    org.telegram.ui.Components.z21 z21Var = (org.telegram.ui.Components.z21) qm0Var.getChildAt(i11);
                    if (z21Var != view && (or0Var = z21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(or0Var);
                        z21Var.J.run();
                    }
                    i11++;
                }
                if (!((org.telegram.ui.Components.bq) aqVar.d.get(i10)).a.a) {
                    ((org.telegram.ui.Components.z21) view).d();
                }
                o21 o21Var = d31Var.J;
                if (o21Var != null) {
                    o21Var.a.c0(i10, d31Var.K.a, true);
                    return;
                }
                return;
            case 1:
                l31.U((l31) this.b, view);
                return;
            case 2:
                f41.U((f41) this.b, view, i10);
                return;
            case 3:
                n41 n41Var = (n41) this.b;
                pi.a aVar = pi.e.b;
                if (i10 == 1) {
                    aVar.a();
                    boolean z10 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z10;
                        aVar.c = true;
                        aVar.b = true;
                        pi.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    n41Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    n41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new a80(13));
                    return;
                }
                if (i10 == 3) {
                    n41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new a80(14));
                    return;
                }
                if (i10 == 4) {
                    n41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new a80(15));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        pi.a aVar2 = pi.e.g;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        n41Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = n41.c;
                    if (i11 >= 3) {
                        n41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new a80(16));
                        return;
                    } else {
                        charSequenceArr[i11] = n41.U(iArr[i11]);
                        i11++;
                    }
                }
            case 4:
                u71 u71Var = (u71) this.b;
                org.telegram.ui.Components.p61 G = u71Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.i6) view).t(true, true);
                    u71Var.a0 = (TLObject) G.G;
                    u71Var.V(true);
                    u71Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((x71) this.b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.b, i10);
                return;
            case 7:
                bb1 bb1Var = (bb1) this.b;
                ArrayList arrayList = bb1Var.N;
                ArrayList arrayList2 = bb1Var.O;
                ga1 ga1Var = bb1Var.X;
                int i13 = ga1Var.I;
                if (i10 >= i13 && i10 <= ga1Var.J) {
                    ya1 ya1Var = (ya1) bb1Var.v0.get(i10 - i13);
                    lj0 lj0Var = new lj0(ya1Var.b, true, bb1Var.b);
                    lj0Var.e0 = ya1Var;
                    bb1Var.presentFragment(lj0Var);
                    return;
                }
                int i14 = ga1Var.U;
                if (i10 >= i14 && i10 <= ga1Var.V) {
                    ((ua1) bb1Var.Q.get(i10 - i14)).b(bb1Var);
                    return;
                }
                int i15 = ga1Var.R;
                if (i10 >= i15 && i10 <= ga1Var.S) {
                    ((ua1) arrayList2.get(i10 - i15)).b(bb1Var);
                    return;
                }
                int i16 = ga1Var.X;
                if (i10 >= i16 && i10 <= ga1Var.Y) {
                    ((ua1) bb1Var.P.get(i10 - i16)).b(bb1Var);
                    return;
                }
                if (i10 == ga1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = bb1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ga1 ga1Var2 = bb1Var.X;
                    if (ga1Var2 != null) {
                        ga1Var2.E();
                        bb1Var.S.setItemAnimator(bb1Var.Y);
                        bb1Var.X.s(i17 + 1, size);
                        bb1Var.X.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                xd1 xd1Var = (xd1) this.b;
                boolean z11 = xd1Var.W0 != null;
                xd1Var.Z0(i10);
                if (z11 == (xd1Var.W0 == null)) {
                    xd1Var.M0();
                    xd1Var.l1();
                }
                xd1Var.n1();
                xd1Var.J0[1].a(xd1Var.W0 != null, true);
                xd1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    xd1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > xd1Var.P0.getMeasuredWidth()) {
                    fc1 fc1Var = xd1Var.P0;
                    fc1Var.v0(i19 - fc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                ue1 ue1Var = (ue1) this.b;
                int i20 = ue1Var.H;
                HashSet hashSet = ue1Var.w;
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
                    if (hashSet.isEmpty() && ue1Var.v != -1 && ue1Var.n.getVisibility() == 0) {
                        ue1Var.v = -1;
                        ue1Var.n.animate().setListener(null).cancel();
                        ue1Var.n.animate().translationY(i20).setDuration(200L).setListener(new qe1(ue1Var, i11)).start();
                        org.telegram.ui.Components.qm0 qm0Var2 = ue1Var.s.getVisibility() == 0 ? ue1Var.b : ue1Var.a;
                        qm0Var2.d1(false);
                        int N0 = ((s4.d0) qm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == qm0Var2.getAdapter().h() - 1 || (N0 == qm0Var2.getAdapter().h() - 2 && qm0Var2 == ue1Var.a)) && (K = qm0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ue1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (qm0Var2.getMeasuredHeight() - bottom <= i20) {
                                qm0Var2.setTranslationY(-(qm0Var2.getMeasuredHeight() - bottom));
                                qm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ue1Var.a.setPadding(0, 0, 0, 0);
                        ue1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ue1Var.n.getVisibility() == 8 && ue1Var.v != 1) {
                        ue1Var.v = 1;
                        ue1Var.n.setVisibility(0);
                        ue1Var.n.setTranslationY(i20);
                        ue1Var.n.animate().setListener(null).cancel();
                        ue1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new qe1(ue1Var, i12)).start();
                        ue1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        ue1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        ue1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.qm0 qm0Var3 = ue1Var.s.getVisibility() == 0 ? ue1Var.b : ue1Var.a;
                    int height = qm0Var3.getHeight() - view.getBottom();
                    if (height < i20) {
                        qm0Var3.v0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                fg1.V((fg1) this.b, view);
                return;
            case 11:
                fg1 fg1Var = ((bg1) this.b).t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    ng.d.m(fg1Var, fg1Var.a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof cg1) {
                        cg1 cg1Var = (cg1) view;
                        ng.d.m(fg1Var, fg1Var.a, cg1Var.N, cg1Var.getMessageId());
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
                lj1 lj1Var = (lj1) this.b;
                lj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sc.v.j(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = lj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                lj1Var.n = strArr[i10];
                lj1Var.E("", true);
                return;
        }
    }
}
