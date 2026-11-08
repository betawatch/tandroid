package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx0 implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vx0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        v4.d1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ay0.Z((ay0) obj, view);
                break;
            case 1:
                qy0.Z((qy0) obj, view, i7);
                break;
            case 2:
                xy0.a0((xy0) obj, i7);
                break;
            case 3:
                a21 a21Var = (a21) obj;
                org.telegram.ui.Components.x31 G = a21Var.a2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        a21Var.S1 = (TLObject) G.G;
                        a21Var.f1(true);
                        a21Var.a2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((c21) obj).e1(i7, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                break;
            case 6:
                c51 c51Var = (c51) obj;
                ArrayList arrayList = c51Var.N;
                ArrayList arrayList2 = c51Var.O;
                g41 g41Var = c51Var.W;
                int i13 = g41Var.I;
                if (i7 >= i13 && i7 <= g41Var.J) {
                    z41 z41Var = (z41) c51Var.y0.get(i7 - i13);
                    jg0 jg0Var = new jg0(c51Var.b, z41Var.b, true);
                    jg0Var.e0 = z41Var;
                    c51Var.presentFragment(jg0Var);
                    break;
                } else {
                    int i14 = g41Var.U;
                    if (i7 >= i14 && i7 <= g41Var.V) {
                        ((v41) c51Var.Q.get(i7 - i14)).b(c51Var);
                        break;
                    } else {
                        int i15 = g41Var.R;
                        if (i7 >= i15 && i7 <= g41Var.S) {
                            ((v41) arrayList2.get(i7 - i15)).b(c51Var);
                            break;
                        } else {
                            int i16 = g41Var.X;
                            if (i7 >= i16 && i7 <= g41Var.Y) {
                                ((v41) c51Var.P.get(i7 - i16)).b(c51Var);
                                break;
                            } else if (i7 == g41Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = c51Var.W.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                g41 g41Var2 = c51Var.W;
                                if (g41Var2 != null) {
                                    g41Var2.E();
                                    c51Var.S.setItemAnimator(c51Var.X);
                                    c51Var.W.o(i17 + 1, size);
                                    c51Var.W.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                v71 v71Var = (v71) obj;
                boolean z9 = v71Var.X0 != null;
                v71Var.e1(i7);
                if (z9 == (v71Var.X0 == null)) {
                    v71Var.Q0();
                    v71Var.q1();
                }
                v71Var.s1();
                v71Var.K0[1].a(v71Var.X0 != null, true);
                v71Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > v71Var.Q0.getMeasuredWidth()) {
                        e61 e61Var = v71Var.Q0;
                        e61Var.w0(i19 - e61Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    v71Var.Q0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                n81 n81Var = (n81) obj;
                int i20 = n81Var.H;
                HashSet hashSet = n81Var.x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && n81Var.w != -1 && n81Var.n.getVisibility() == 0) {
                        n81Var.w = -1;
                        n81Var.n.animate().setListener(null).cancel();
                        n81Var.n.animate().translationY(i20).setDuration(200L).setListener(new j81(n81Var, i11)).start();
                        org.telegram.ui.Components.pj0 pj0Var = n81Var.s.getVisibility() == 0 ? n81Var.b : n81Var.a;
                        pj0Var.d1(false);
                        int N0 = ((v4.b0) pj0Var.getLayoutManager()).N0();
                        if ((N0 == pj0Var.getAdapter().b() - 1 || (N0 == pj0Var.getAdapter().b() - 2 && pj0Var == n81Var.a)) && (K = pj0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == n81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (pj0Var.getMeasuredHeight() - bottom <= i20) {
                                pj0Var.setTranslationY(-(pj0Var.getMeasuredHeight() - bottom));
                                pj0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        n81Var.a.setPadding(0, 0, 0, 0);
                        n81Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && n81Var.n.getVisibility() == 8 && n81Var.w != 1) {
                        n81Var.w = 1;
                        n81Var.n.setVisibility(0);
                        n81Var.n.setTranslationY(i20);
                        n81Var.n.animate().setListener(null).cancel();
                        n81Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new j81(n81Var, i12)).start();
                        n81Var.a.setPadding(0, 0, 0, i20 - org.telegram.messenger.g0.L(12.0f));
                        n81Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        n81Var.c.setText(org.telegram.messenger.id.a0("LeaveChats", null, 2131749000, org.telegram.messenger.id.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.pj0 pj0Var2 = n81Var.s.getVisibility() == 0 ? n81Var.b : n81Var.a;
                        int height = pj0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            pj0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                w91.a0((w91) obj, view);
                break;
            case 10:
                w91 w91Var = ((s91) obj).v0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof t91) {
                        t91 t91Var = (t91) view;
                        qg.d.m(w91Var, w91Var.a, t91Var.N, t91Var.getMessageId());
                        break;
                    }
                } else {
                    qg.d.m(w91Var, w91Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i7);
                break;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i7);
                break;
            default:
                sc1 sc1Var = (sc1) obj;
                String M0 = org.telegram.messenger.id.M0(2131753738, null);
                StringBuilder j3 = rf.b.j(M0, " ");
                String[] strArr = WallpapersListActivity.j0;
                SpannableString spannableString = new SpannableString(jg.g.l(WallpapersListActivity.k0[i7], strArr[i7], j3));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = sc1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                sc1Var.n = strArr[i7];
                sc1Var.E("", true);
                break;
        }
    }
}
