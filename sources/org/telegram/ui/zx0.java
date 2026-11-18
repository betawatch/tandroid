package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        v4.f1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ey0.Z((ey0) obj, view);
                break;
            case 1:
                sy0.Z((sy0) obj, view, i7);
                break;
            case 2:
                zy0.a0((zy0) obj, i7);
                break;
            case 3:
                b21 b21Var = (b21) obj;
                org.telegram.ui.Components.l41 G = b21Var.e2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.H;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        b21Var.W1 = (TLObject) G.H;
                        b21Var.g1(true);
                        b21Var.e2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((d21) obj).f1(i7, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                break;
            case 6:
                c51 c51Var = (c51) obj;
                ArrayList arrayList = c51Var.O;
                ArrayList arrayList2 = c51Var.P;
                h41 h41Var = c51Var.X;
                int i13 = h41Var.J;
                if (i7 >= i13 && i7 <= h41Var.K) {
                    z41 z41Var = (z41) c51Var.z0.get(i7 - i13);
                    ng0 ng0Var = new ng0(c51Var.b, z41Var.b, true);
                    ng0Var.f0 = z41Var;
                    c51Var.presentFragment(ng0Var);
                    break;
                } else {
                    int i14 = h41Var.V;
                    if (i7 >= i14 && i7 <= h41Var.W) {
                        ((v41) c51Var.R.get(i7 - i14)).b(c51Var);
                        break;
                    } else {
                        int i15 = h41Var.S;
                        if (i7 >= i15 && i7 <= h41Var.T) {
                            ((v41) arrayList2.get(i7 - i15)).b(c51Var);
                            break;
                        } else {
                            int i16 = h41Var.Y;
                            if (i7 >= i16 && i7 <= h41Var.Z) {
                                ((v41) c51Var.Q.get(i7 - i16)).b(c51Var);
                                break;
                            } else if (i7 == h41Var.a0) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = c51Var.X.a0;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                h41 h41Var2 = c51Var.X;
                                if (h41Var2 != null) {
                                    h41Var2.E();
                                    c51Var.T.setItemAnimator(c51Var.Y);
                                    c51Var.X.o(i17 + 1, size);
                                    c51Var.X.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                x71 x71Var = (x71) obj;
                boolean z10 = x71Var.Y0 != null;
                x71Var.e1(i7);
                if (z10 == (x71Var.Y0 == null)) {
                    x71Var.Q0();
                    x71Var.q1();
                }
                x71Var.s1();
                x71Var.L0[1].a(x71Var.Y0 != null, true);
                x71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > x71Var.R0.getMeasuredWidth()) {
                        f61 f61Var = x71Var.R0;
                        f61Var.w0(i19 - f61Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    x71Var.R0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                p81 p81Var = (p81) obj;
                int i20 = p81Var.I;
                HashSet hashSet = p81Var.x;
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
                    if (hashSet.isEmpty() && p81Var.w != -1 && p81Var.n.getVisibility() == 0) {
                        p81Var.w = -1;
                        p81Var.n.animate().setListener(null).cancel();
                        p81Var.n.animate().translationY(i20).setDuration(200L).setListener(new l81(p81Var, i11)).start();
                        org.telegram.ui.Components.ck0 ck0Var = p81Var.s.getVisibility() == 0 ? p81Var.b : p81Var.a;
                        ck0Var.d1(false);
                        int N0 = ((v4.c0) ck0Var.getLayoutManager()).N0();
                        if ((N0 == ck0Var.getAdapter().b() - 1 || (N0 == ck0Var.getAdapter().b() - 2 && ck0Var == p81Var.a)) && (K = ck0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == p81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (ck0Var.getMeasuredHeight() - bottom <= i20) {
                                ck0Var.setTranslationY(-(ck0Var.getMeasuredHeight() - bottom));
                                ck0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        p81Var.a.setPadding(0, 0, 0, 0);
                        p81Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && p81Var.n.getVisibility() == 8 && p81Var.w != 1) {
                        p81Var.w = 1;
                        p81Var.n.setVisibility(0);
                        p81Var.n.setTranslationY(i20);
                        p81Var.n.animate().setListener(null).cancel();
                        p81Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new l81(p81Var, i12)).start();
                        p81Var.a.setPadding(0, 0, 0, i20 - org.telegram.messenger.g0.L(12.0f));
                        p81Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        p81Var.c.setText(org.telegram.messenger.gd.a0("LeaveChats", null, 2131748807, org.telegram.messenger.gd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.ck0 ck0Var2 = p81Var.s.getVisibility() == 0 ? p81Var.b : p81Var.a;
                        int height = ck0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            ck0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                y91.a0((y91) obj, view);
                break;
            case 10:
                y91 y91Var = ((u91) obj).w0;
                if (!(view instanceof org.telegram.ui.Cells.ka)) {
                    if (view instanceof v91) {
                        v91 v91Var = (v91) view;
                        qg.c.n(y91Var, y91Var.a, v91Var.O, v91Var.getMessageId());
                        break;
                    }
                } else {
                    qg.c.n(y91Var, y91Var.a, ((org.telegram.ui.Cells.ka) view).getTopic(), 0);
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
                uc1 uc1Var = (uc1) obj;
                String M0 = org.telegram.messenger.gd.M0(2131753736, null);
                StringBuilder n10 = p5.c.n(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                SpannableString spannableString = new SpannableString(i5.c.k(WallpapersListActivity.l0[i7], strArr[i7], n10));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = uc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.Q("", true);
                uc1Var.n = strArr[i7];
                uc1Var.E("", true);
                break;
        }
    }
}
