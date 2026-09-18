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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z21 implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.xq0 xq0Var;
        s4.c1 L;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                d31 d31Var = (d31) obj;
                org.telegram.ui.Components.wl0 wl0Var = d31Var.y;
                org.telegram.ui.Components.kp kpVar = d31Var.b;
                if (kpVar.d.get(i10) != d31Var.K && d31Var.O == null) {
                    d31Var.Q = false;
                    d31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    d31Var.h.postDelayed(new org.telegram.ui.Components.x2(d31Var, i10, 28), 100L);
                    while (i12 < wl0Var.getChildCount()) {
                        org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) wl0Var.getChildAt(i12);
                        if (j21Var != view && (xq0Var = j21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(xq0Var);
                            j21Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.j21) view).d();
                    }
                    p21 p21Var = d31Var.J;
                    if (p21Var != null) {
                        p21Var.a.d0(i10, d31Var.K.a, true);
                        break;
                    }
                }
                break;
            case 1:
                l31.U((l31) obj, view);
                break;
            case 2:
                e41.U((e41) obj, view, i10);
                break;
            case 3:
                q71 q71Var = (q71) obj;
                org.telegram.ui.Components.x51 G = q71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        q71Var.a0 = (TLObject) G.G;
                        q71Var.U(true);
                        q71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((t71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                za1 za1Var = (za1) obj;
                ArrayList arrayList = za1Var.N;
                ArrayList arrayList2 = za1Var.O;
                ea1 ea1Var = za1Var.X;
                int i14 = ea1Var.I;
                if (i10 >= i14 && i10 <= ea1Var.J) {
                    wa1 wa1Var = (wa1) za1Var.v0.get(i10 - i14);
                    kj0 kj0Var = new kj0(wa1Var.b, true, za1Var.b);
                    kj0Var.e0 = wa1Var;
                    za1Var.presentFragment(kj0Var);
                    break;
                } else {
                    int i15 = ea1Var.U;
                    if (i10 >= i15 && i10 <= ea1Var.V) {
                        ((sa1) za1Var.Q.get(i10 - i15)).b(za1Var);
                        break;
                    } else {
                        int i16 = ea1Var.R;
                        if (i10 >= i16 && i10 <= ea1Var.S) {
                            ((sa1) arrayList2.get(i10 - i16)).b(za1Var);
                            break;
                        } else {
                            int i17 = ea1Var.X;
                            if (i10 >= i17 && i10 <= ea1Var.Y) {
                                ((sa1) za1Var.P.get(i10 - i17)).b(za1Var);
                                break;
                            } else if (i10 == ea1Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = za1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                ea1 ea1Var2 = za1Var.X;
                                if (ea1Var2 != null) {
                                    ea1Var2.E();
                                    za1Var.S.setItemAnimator(za1Var.Y);
                                    za1Var.X.s(i18 + 1, size);
                                    za1Var.X.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                vd1 vd1Var = (vd1) obj;
                boolean z10 = vd1Var.W0 != null;
                vd1Var.Z0(i10);
                if (z10 == (vd1Var.W0 == null)) {
                    vd1Var.M0();
                    vd1Var.l1();
                }
                vd1Var.n1();
                vd1Var.J0[1].a(vd1Var.W0 != null, true);
                vd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > vd1Var.P0.getMeasuredWidth()) {
                        dc1 dc1Var = vd1Var.P0;
                        dc1Var.w0(i20 - dc1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    vd1Var.P0.w0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                se1 se1Var = (se1) obj;
                int i21 = se1Var.H;
                HashSet hashSet = se1Var.w;
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
                    if (hashSet.isEmpty() && se1Var.v != -1 && se1Var.n.getVisibility() == 0) {
                        se1Var.v = -1;
                        se1Var.n.animate().setListener(null).cancel();
                        se1Var.n.animate().translationY(i21).setDuration(200L).setListener(new oe1(se1Var, i12)).start();
                        org.telegram.ui.Components.wl0 wl0Var2 = se1Var.s.getVisibility() == 0 ? se1Var.b : se1Var.a;
                        wl0Var2.e1(false);
                        int N0 = ((s4.c0) wl0Var2.getLayoutManager()).N0();
                        if ((N0 == wl0Var2.getAdapter().h() - 1 || (N0 == wl0Var2.getAdapter().h() - 2 && wl0Var2 == se1Var.a)) && (L = wl0Var2.L(N0)) != null) {
                            int bottom = L.a.getBottom();
                            if (N0 == se1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (wl0Var2.getMeasuredHeight() - bottom <= i21) {
                                wl0Var2.setTranslationY(-(wl0Var2.getMeasuredHeight() - bottom));
                                wl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        se1Var.a.setPadding(0, 0, 0, 0);
                        se1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && se1Var.n.getVisibility() == 8 && se1Var.v != 1) {
                        se1Var.v = 1;
                        se1Var.n.setVisibility(0);
                        se1Var.n.setTranslationY(i21);
                        se1Var.n.animate().setListener(null).cancel();
                        se1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new oe1(se1Var, i13)).start();
                        se1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        se1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        se1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.wl0 wl0Var3 = se1Var.s.getVisibility() == 0 ? se1Var.b : se1Var.a;
                        int height = wl0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            wl0Var3.w0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                dg1.V((dg1) obj, view);
                break;
            case 10:
                dg1 dg1Var = ((zf1) obj).u0;
                if (!(view instanceof org.telegram.ui.Cells.sa)) {
                    if (view instanceof ag1) {
                        ag1 ag1Var = (ag1) view;
                        ng.d.m(dg1Var, dg1Var.a, ag1Var.N, ag1Var.getMessageId());
                        break;
                    }
                } else {
                    ng.d.m(dg1Var, dg1Var.a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                break;
            case 12:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                break;
            default:
                hj1 hj1Var = (hj1) obj;
                hj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = t8.b.j(string, " ");
                String[] strArr = WallpapersListActivity.l0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = hj1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                hj1Var.n = strArr[i10];
                hj1Var.E("", true);
                break;
        }
    }
}
