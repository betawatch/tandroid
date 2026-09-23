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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        s4.c1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                w21 w21Var = (w21) obj;
                org.telegram.ui.Components.ml0 ml0Var = w21Var.y;
                org.telegram.ui.Components.lp lpVar = w21Var.b;
                if (lpVar.d.get(i10) != w21Var.K && w21Var.O == null) {
                    w21Var.Q = false;
                    w21Var.K = (org.telegram.ui.Components.mp) lpVar.d.get(i10);
                    lpVar.E(i10);
                    w21Var.h.postDelayed(new org.telegram.ui.Components.kd(w21Var, i10, 26), 100L);
                    while (i12 < ml0Var.getChildCount()) {
                        org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) ml0Var.getChildAt(i12);
                        if (t11Var != view && (jq0Var = t11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            t11Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.mp) lpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.t11) view).d();
                    }
                    i21 i21Var = w21Var.J;
                    if (i21Var != null) {
                        i21Var.a.d0(i10, w21Var.K.a, true);
                        break;
                    }
                }
                break;
            case 1:
                e31.U((e31) obj, view);
                break;
            case 2:
                x31.U((x31) obj, view, i10);
                break;
            case 3:
                j71 j71Var = (j71) obj;
                org.telegram.ui.Components.h51 G = j71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        j71Var.a0 = (TLObject) G.G;
                        j71Var.U(true);
                        j71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((m71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                ra1 ra1Var = (ra1) obj;
                ArrayList arrayList = ra1Var.N;
                ArrayList arrayList2 = ra1Var.O;
                w91 w91Var = ra1Var.X;
                int i14 = w91Var.I;
                if (i10 >= i14 && i10 <= w91Var.J) {
                    oa1 oa1Var = (oa1) ra1Var.v0.get(i10 - i14);
                    ej0 ej0Var = new ej0(oa1Var.b, true, ra1Var.b);
                    ej0Var.e0 = oa1Var;
                    ra1Var.presentFragment(ej0Var);
                    break;
                } else {
                    int i15 = w91Var.U;
                    if (i10 >= i15 && i10 <= w91Var.V) {
                        ((ka1) ra1Var.Q.get(i10 - i15)).b(ra1Var);
                        break;
                    } else {
                        int i16 = w91Var.R;
                        if (i10 >= i16 && i10 <= w91Var.S) {
                            ((ka1) arrayList2.get(i10 - i16)).b(ra1Var);
                            break;
                        } else {
                            int i17 = w91Var.X;
                            if (i10 >= i17 && i10 <= w91Var.Y) {
                                ((ka1) ra1Var.P.get(i10 - i17)).b(ra1Var);
                                break;
                            } else if (i10 == w91Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = ra1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                w91 w91Var2 = ra1Var.X;
                                if (w91Var2 != null) {
                                    w91Var2.E();
                                    ra1Var.S.setItemAnimator(ra1Var.Y);
                                    ra1Var.X.s(i18 + 1, size);
                                    ra1Var.X.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                od1 od1Var = (od1) obj;
                boolean z10 = od1Var.W0 != null;
                od1Var.Z0(i10);
                if (z10 == (od1Var.W0 == null)) {
                    od1Var.M0();
                    od1Var.l1();
                }
                od1Var.n1();
                od1Var.J0[1].a(od1Var.W0 != null, true);
                od1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > od1Var.P0.getMeasuredWidth()) {
                        wb1 wb1Var = od1Var.P0;
                        wb1Var.v0(i20 - wb1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    od1Var.P0.v0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                le1 le1Var = (le1) obj;
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
                        org.telegram.ui.Components.ml0 ml0Var2 = le1Var.s.getVisibility() == 0 ? le1Var.b : le1Var.a;
                        ml0Var2.d1(false);
                        int N0 = ((s4.c0) ml0Var2.getLayoutManager()).N0();
                        if ((N0 == ml0Var2.getAdapter().h() - 1 || (N0 == ml0Var2.getAdapter().h() - 2 && ml0Var2 == le1Var.a)) && (K = ml0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == le1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ml0Var2.getMeasuredHeight() - bottom <= i21) {
                                ml0Var2.setTranslationY(-(ml0Var2.getMeasuredHeight() - bottom));
                                ml0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        le1Var.a.setPadding(0, 0, 0, 0);
                        le1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && le1Var.n.getVisibility() == 8 && le1Var.v != 1) {
                        le1Var.v = 1;
                        le1Var.n.setVisibility(0);
                        le1Var.n.setTranslationY(i21);
                        le1Var.n.animate().setListener(null).cancel();
                        le1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, i13)).start();
                        le1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        le1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.ml0 ml0Var3 = le1Var.s.getVisibility() == 0 ? le1Var.b : le1Var.a;
                        int height = ml0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            ml0Var3.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                wf1.V((wf1) obj, view);
                break;
            case 10:
                wf1 wf1Var = ((sf1) obj).t0;
                if (!(view instanceof org.telegram.ui.Cells.ua)) {
                    if (view instanceof tf1) {
                        tf1 tf1Var = (tf1) view;
                        ng.d.m(wf1Var, wf1Var.a, tf1Var.N, tf1Var.getMessageId());
                        break;
                    }
                } else {
                    ng.d.m(wf1Var, wf1Var.a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
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
                bj1 bj1Var = (bj1) obj;
                bj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder h = w.c.h(string, " ");
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
                break;
        }
    }
}
