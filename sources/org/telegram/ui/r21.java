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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        f2.m1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                w21.U((w21) obj, view);
                break;
            case 1:
                p31.U((p31) obj, view, i10);
                break;
            case 2:
                c71 c71Var = (c71) obj;
                org.telegram.ui.Components.j51 G = c71Var.f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        c71Var.X = (TLObject) G.G;
                        c71Var.U(true);
                        c71Var.f0.N(true);
                        break;
                    }
                }
                break;
            case 3:
                ((f71) obj).Q(i10, view);
                break;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 5:
                ha1 ha1Var = (ha1) obj;
                ArrayList arrayList = ha1Var.K;
                ArrayList arrayList2 = ha1Var.L;
                m91 m91Var = ha1Var.U;
                int i14 = m91Var.F;
                if (i10 >= i14 && i10 <= m91Var.G) {
                    ea1 ea1Var = (ea1) ha1Var.s0.get(i10 - i14);
                    bj0 bj0Var = new bj0(ea1Var.b, true, ha1Var.b);
                    bj0Var.b0 = ea1Var;
                    ha1Var.presentFragment(bj0Var);
                    break;
                } else {
                    int i15 = m91Var.R;
                    if (i10 >= i15 && i10 <= m91Var.S) {
                        ((aa1) ha1Var.N.get(i10 - i15)).b(ha1Var);
                        break;
                    } else {
                        int i16 = m91Var.O;
                        if (i10 >= i16 && i10 <= m91Var.P) {
                            ((aa1) arrayList2.get(i10 - i16)).b(ha1Var);
                            break;
                        } else {
                            int i17 = m91Var.U;
                            if (i10 >= i17 && i10 <= m91Var.V) {
                                ((aa1) ha1Var.M.get(i10 - i17)).b(ha1Var);
                                break;
                            } else if (i10 == m91Var.W) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = ha1Var.U.W;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                m91 m91Var2 = ha1Var.U;
                                if (m91Var2 != null) {
                                    m91Var2.E();
                                    ha1Var.P.setItemAnimator(ha1Var.V);
                                    ha1Var.U.s(i18 + 1, size);
                                    ha1Var.U.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                ed1 ed1Var = (ed1) obj;
                boolean z4 = ed1Var.T0 != null;
                ed1Var.Z0(i10);
                if (z4 == (ed1Var.T0 == null)) {
                    ed1Var.M0();
                    ed1Var.l1();
                }
                ed1Var.n1();
                ed1Var.G0[1].a(ed1Var.T0 != null, true);
                ed1Var.M0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > ed1Var.M0.getMeasuredWidth()) {
                        kb1 kb1Var = ed1Var.M0;
                        kb1Var.v0(i20 - kb1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    ed1Var.M0.v0(i19, 0, null);
                    break;
                }
                break;
            case 7:
                be1 be1Var = (be1) obj;
                int i21 = be1Var.E;
                HashSet hashSet = be1Var.w;
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
                    if (hashSet.isEmpty() && be1Var.v != -1 && be1Var.n.getVisibility() == 0) {
                        be1Var.v = -1;
                        be1Var.n.animate().setListener(null).cancel();
                        be1Var.n.animate().translationY(i21).setDuration(200L).setListener(new xd1(be1Var, i12)).start();
                        org.telegram.ui.Components.tl0 tl0Var = be1Var.s.getVisibility() == 0 ? be1Var.b : be1Var.a;
                        tl0Var.d1(false);
                        int N0 = ((f2.j0) tl0Var.getLayoutManager()).N0();
                        if ((N0 == tl0Var.getAdapter().h() - 1 || (N0 == tl0Var.getAdapter().h() - 2 && tl0Var == be1Var.a)) && (K = tl0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == be1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (tl0Var.getMeasuredHeight() - bottom <= i21) {
                                tl0Var.setTranslationY(-(tl0Var.getMeasuredHeight() - bottom));
                                tl0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        be1Var.a.setPadding(0, 0, 0, 0);
                        be1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && be1Var.n.getVisibility() == 8 && be1Var.v != 1) {
                        be1Var.v = 1;
                        be1Var.n.setVisibility(0);
                        be1Var.n.setTranslationY(i21);
                        be1Var.n.animate().setListener(null).cancel();
                        be1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new xd1(be1Var, i13)).start();
                        be1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        be1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        be1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.tl0 tl0Var2 = be1Var.s.getVisibility() == 0 ? be1Var.b : be1Var.a;
                        int height = tl0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            tl0Var2.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                mf1.V((mf1) obj, view);
                break;
            case 9:
                mf1 mf1Var = ((if1) obj).q0;
                if (!(view instanceof org.telegram.ui.Cells.oa)) {
                    if (view instanceof jf1) {
                        jf1 jf1Var = (jf1) view;
                        bg.e.m(mf1Var, mf1Var.a, jf1Var.K, jf1Var.getMessageId());
                        break;
                    }
                } else {
                    bg.e.m(mf1Var, mf1Var.a, ((org.telegram.ui.Cells.oa) view).getTopic(), 0);
                    break;
                }
                break;
            case 10:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                break;
            case 11:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                break;
            default:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = w.c.f(string, " ");
                String[] strArr = WallpapersListActivity.k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = si1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                si1Var.n = strArr[i10];
                si1Var.E("", true);
                break;
        }
    }
}
