package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        v4.d1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ey0.Z((ey0) obj, view);
                break;
            case 1:
                ty0.Z((ty0) obj, view, i7);
                break;
            case 2:
                az0.a0((az0) obj, i7);
                break;
            case 3:
                c21 c21Var = (c21) obj;
                org.telegram.ui.Components.y31 G = c21Var.a2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        c21Var.S1 = (TLObject) G.G;
                        c21Var.f1(true);
                        c21Var.a2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((e21) obj).e1(i7, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                break;
            case 6:
                d51 d51Var = (d51) obj;
                ArrayList arrayList = d51Var.N;
                ArrayList arrayList2 = d51Var.O;
                h41 h41Var = d51Var.W;
                int i13 = h41Var.I;
                if (i7 >= i13 && i7 <= h41Var.J) {
                    a51 a51Var = (a51) d51Var.y0.get(i7 - i13);
                    lg0 lg0Var = new lg0(d51Var.b, a51Var.b, true);
                    lg0Var.e0 = a51Var;
                    d51Var.presentFragment(lg0Var);
                    break;
                } else {
                    int i14 = h41Var.U;
                    if (i7 >= i14 && i7 <= h41Var.V) {
                        ((w41) d51Var.Q.get(i7 - i14)).b(d51Var);
                        break;
                    } else {
                        int i15 = h41Var.R;
                        if (i7 >= i15 && i7 <= h41Var.S) {
                            ((w41) arrayList2.get(i7 - i15)).b(d51Var);
                            break;
                        } else {
                            int i16 = h41Var.X;
                            if (i7 >= i16 && i7 <= h41Var.Y) {
                                ((w41) d51Var.P.get(i7 - i16)).b(d51Var);
                                break;
                            } else if (i7 == h41Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = d51Var.W.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                h41 h41Var2 = d51Var.W;
                                if (h41Var2 != null) {
                                    h41Var2.E();
                                    d51Var.S.setItemAnimator(d51Var.X);
                                    d51Var.W.o(i17 + 1, size);
                                    d51Var.W.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                w71 w71Var = (w71) obj;
                boolean z9 = w71Var.X0 != null;
                w71Var.e1(i7);
                if (z9 == (w71Var.X0 == null)) {
                    w71Var.Q0();
                    w71Var.q1();
                }
                w71Var.s1();
                w71Var.K0[1].a(w71Var.X0 != null, true);
                w71Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > w71Var.Q0.getMeasuredWidth()) {
                        f61 f61Var = w71Var.Q0;
                        f61Var.w0(i19 - f61Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    w71Var.Q0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                o81 o81Var = (o81) obj;
                int i20 = o81Var.H;
                HashSet hashSet = o81Var.x;
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
                    if (hashSet.isEmpty() && o81Var.w != -1 && o81Var.n.getVisibility() == 0) {
                        o81Var.w = -1;
                        o81Var.n.animate().setListener(null).cancel();
                        o81Var.n.animate().translationY(i20).setDuration(200L).setListener(new k81(o81Var, i11)).start();
                        org.telegram.ui.Components.qj0 qj0Var = o81Var.s.getVisibility() == 0 ? o81Var.b : o81Var.a;
                        qj0Var.d1(false);
                        int N0 = ((v4.b0) qj0Var.getLayoutManager()).N0();
                        if ((N0 == qj0Var.getAdapter().b() - 1 || (N0 == qj0Var.getAdapter().b() - 2 && qj0Var == o81Var.a)) && (K = qj0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == o81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (qj0Var.getMeasuredHeight() - bottom <= i20) {
                                qj0Var.setTranslationY(-(qj0Var.getMeasuredHeight() - bottom));
                                qj0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        o81Var.a.setPadding(0, 0, 0, 0);
                        o81Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && o81Var.n.getVisibility() == 8 && o81Var.w != 1) {
                        o81Var.w = 1;
                        o81Var.n.setVisibility(0);
                        o81Var.n.setTranslationY(i20);
                        o81Var.n.animate().setListener(null).cancel();
                        o81Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new k81(o81Var, i12)).start();
                        o81Var.a.setPadding(0, 0, 0, i20 - org.telegram.messenger.g0.L(12.0f));
                        o81Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        o81Var.c.setText(org.telegram.messenger.id.a0("LeaveChats", null, 2131748999, org.telegram.messenger.id.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.qj0 qj0Var2 = o81Var.s.getVisibility() == 0 ? o81Var.b : o81Var.a;
                        int height = qj0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            qj0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                y91.a0((y91) obj, view);
                break;
            case 10:
                y91 y91Var = ((u91) obj).v0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof v91) {
                        v91 v91Var = (v91) view;
                        qg.d.m(y91Var, y91Var.a, v91Var.N, v91Var.getMessageId());
                        break;
                    }
                } else {
                    qg.d.m(y91Var, y91Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
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
                vc1 vc1Var = (vc1) obj;
                String M0 = org.telegram.messenger.id.M0(2131753738, null);
                StringBuilder j3 = rf.b.j(M0, " ");
                String[] strArr = WallpapersListActivity.j0;
                SpannableString spannableString = new SpannableString(jg.g.l(WallpapersListActivity.k0[i7], strArr[i7], j3));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = vc1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                vc1Var.n = strArr[i7];
                vc1Var.E("", true);
                break;
        }
    }
}
