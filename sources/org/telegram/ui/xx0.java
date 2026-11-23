package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        v4.f1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                cy0.Z((cy0) obj, view);
                break;
            case 1:
                ry0.Z((ry0) obj, view, i7);
                break;
            case 2:
                yy0.a0((yy0) obj, i7);
                break;
            case 3:
                a21 a21Var = (a21) obj;
                org.telegram.ui.Components.n41 G = a21Var.e2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.H;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).x(true, true);
                        a21Var.W1 = (TLObject) G.H;
                        a21Var.g1(true);
                        a21Var.e2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((c21) obj).f1(i7, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                break;
            case 6:
                b51 b51Var = (b51) obj;
                ArrayList arrayList = b51Var.O;
                ArrayList arrayList2 = b51Var.P;
                g41 g41Var = b51Var.X;
                int i13 = g41Var.J;
                if (i7 >= i13 && i7 <= g41Var.K) {
                    y41 y41Var = (y41) b51Var.z0.get(i7 - i13);
                    mg0 mg0Var = new mg0(b51Var.b, y41Var.b, true);
                    mg0Var.f0 = y41Var;
                    b51Var.presentFragment(mg0Var);
                    break;
                } else {
                    int i14 = g41Var.V;
                    if (i7 >= i14 && i7 <= g41Var.W) {
                        ((u41) b51Var.R.get(i7 - i14)).b(b51Var);
                        break;
                    } else {
                        int i15 = g41Var.S;
                        if (i7 >= i15 && i7 <= g41Var.T) {
                            ((u41) arrayList2.get(i7 - i15)).b(b51Var);
                            break;
                        } else {
                            int i16 = g41Var.Y;
                            if (i7 >= i16 && i7 <= g41Var.Z) {
                                ((u41) b51Var.Q.get(i7 - i16)).b(b51Var);
                                break;
                            } else if (i7 == g41Var.a0) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = b51Var.X.a0;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                g41 g41Var2 = b51Var.X;
                                if (g41Var2 != null) {
                                    g41Var2.E();
                                    b51Var.T.setItemAnimator(b51Var.Y);
                                    b51Var.X.o(i17 + 1, size);
                                    b51Var.X.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                v71 v71Var = (v71) obj;
                boolean z10 = v71Var.Y0 != null;
                v71Var.e1(i7);
                if (z10 == (v71Var.Y0 == null)) {
                    v71Var.Q0();
                    v71Var.q1();
                }
                v71Var.s1();
                v71Var.L0[1].a(v71Var.Y0 != null, true);
                v71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > v71Var.R0.getMeasuredWidth()) {
                        d61 d61Var = v71Var.R0;
                        d61Var.w0(i19 - d61Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    v71Var.R0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                n81 n81Var = (n81) obj;
                int i20 = n81Var.I;
                HashSet hashSet = n81Var.x;
                if (view instanceof org.telegram.ui.Cells.i4) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) i4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        i4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        i4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && n81Var.w != -1 && n81Var.n.getVisibility() == 0) {
                        n81Var.w = -1;
                        n81Var.n.animate().setListener(null).cancel();
                        n81Var.n.animate().translationY(i20).setDuration(200L).setListener(new j81(n81Var, i11)).start();
                        org.telegram.ui.Components.ek0 ek0Var = n81Var.s.getVisibility() == 0 ? n81Var.b : n81Var.a;
                        ek0Var.d1(false);
                        int N0 = ((v4.c0) ek0Var.getLayoutManager()).N0();
                        if ((N0 == ek0Var.getAdapter().b() - 1 || (N0 == ek0Var.getAdapter().b() - 2 && ek0Var == n81Var.a)) && (K = ek0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == n81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (ek0Var.getMeasuredHeight() - bottom <= i20) {
                                ek0Var.setTranslationY(-(ek0Var.getMeasuredHeight() - bottom));
                                ek0Var.animate().translationY(0.0f).setDuration(200L).start();
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
                        n81Var.c.setText(org.telegram.messenger.gd.a0("LeaveChats", null, 2131748806, org.telegram.messenger.gd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.ek0 ek0Var2 = n81Var.s.getVisibility() == 0 ? n81Var.b : n81Var.a;
                        int height = ek0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            ek0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                w91.a0((w91) obj, view);
                break;
            case 10:
                w91 w91Var = ((s91) obj).w0;
                if (!(view instanceof org.telegram.ui.Cells.ma)) {
                    if (view instanceof t91) {
                        t91 t91Var = (t91) view;
                        qg.c.n(w91Var, w91Var.a, t91Var.O, t91Var.getMessageId());
                        break;
                    }
                } else {
                    qg.c.n(w91Var, w91Var.a, ((org.telegram.ui.Cells.ma) view).getTopic(), 0);
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
                String N02 = org.telegram.messenger.gd.N0(2131753735, null);
                StringBuilder n10 = p5.c.n(N02, " ");
                String[] strArr = WallpapersListActivity.k0;
                SpannableString spannableString = new SpannableString(i5.c.k(WallpapersListActivity.l0[i7], strArr[i7], n10));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B8, false)), N02.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = sc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.Q("", true);
                sc1Var.n = strArr[i7];
                sc1Var.E("", true);
                break;
        }
    }
}
