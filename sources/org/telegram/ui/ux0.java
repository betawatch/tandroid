package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux0 implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ux0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        v4.e1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                zx0.Z((zx0) obj, view);
                break;
            case 1:
                oy0.Z((oy0) obj, view, i7);
                break;
            case 2:
                vy0.a0((vy0) obj, i7);
                break;
            case 3:
                x11 x11Var = (x11) obj;
                org.telegram.ui.Components.b41 G = x11Var.e2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.f6) view).w(true, true);
                        x11Var.W1 = (TLObject) G.G;
                        x11Var.f1(true);
                        x11Var.e2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((z11) obj).e1(i7, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                break;
            case 6:
                z41 z41Var = (z41) obj;
                ArrayList arrayList = z41Var.O;
                ArrayList arrayList2 = z41Var.P;
                e41 e41Var = z41Var.X;
                int i13 = e41Var.J;
                if (i7 >= i13 && i7 <= e41Var.K) {
                    w41 w41Var = (w41) z41Var.z0.get(i7 - i13);
                    jg0 jg0Var = new jg0(z41Var.b, w41Var.b, true);
                    jg0Var.f0 = w41Var;
                    z41Var.presentFragment(jg0Var);
                    break;
                } else {
                    int i14 = e41Var.V;
                    if (i7 >= i14 && i7 <= e41Var.W) {
                        ((s41) z41Var.R.get(i7 - i14)).b(z41Var);
                        break;
                    } else {
                        int i15 = e41Var.S;
                        if (i7 >= i15 && i7 <= e41Var.T) {
                            ((s41) arrayList2.get(i7 - i15)).b(z41Var);
                            break;
                        } else {
                            int i16 = e41Var.Y;
                            if (i7 >= i16 && i7 <= e41Var.Z) {
                                ((s41) z41Var.Q.get(i7 - i16)).b(z41Var);
                                break;
                            } else if (i7 == e41Var.a0) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = z41Var.X.a0;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                e41 e41Var2 = z41Var.X;
                                if (e41Var2 != null) {
                                    e41Var2.E();
                                    z41Var.T.setItemAnimator(z41Var.Y);
                                    z41Var.X.o(i17 + 1, size);
                                    z41Var.X.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                t71 t71Var = (t71) obj;
                boolean z10 = t71Var.Y0 != null;
                t71Var.e1(i7);
                if (z10 == (t71Var.Y0 == null)) {
                    t71Var.Q0();
                    t71Var.q1();
                }
                t71Var.s1();
                t71Var.L0[1].a(t71Var.Y0 != null, true);
                t71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > t71Var.R0.getMeasuredWidth()) {
                        b61 b61Var = t71Var.R0;
                        b61Var.w0(i19 - b61Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    t71Var.R0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                l81 l81Var = (l81) obj;
                int i20 = l81Var.I;
                HashSet hashSet = l81Var.x;
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
                    if (hashSet.isEmpty() && l81Var.w != -1 && l81Var.n.getVisibility() == 0) {
                        l81Var.w = -1;
                        l81Var.n.animate().setListener(null).cancel();
                        l81Var.n.animate().translationY(i20).setDuration(200L).setListener(new h81(l81Var, i11)).start();
                        org.telegram.ui.Components.uj0 uj0Var = l81Var.s.getVisibility() == 0 ? l81Var.b : l81Var.a;
                        uj0Var.d1(false);
                        int N0 = ((v4.b0) uj0Var.getLayoutManager()).N0();
                        if ((N0 == uj0Var.getAdapter().b() - 1 || (N0 == uj0Var.getAdapter().b() - 2 && uj0Var == l81Var.a)) && (K = uj0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == l81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (uj0Var.getMeasuredHeight() - bottom <= i20) {
                                uj0Var.setTranslationY(-(uj0Var.getMeasuredHeight() - bottom));
                                uj0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        l81Var.a.setPadding(0, 0, 0, 0);
                        l81Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && l81Var.n.getVisibility() == 8 && l81Var.w != 1) {
                        l81Var.w = 1;
                        l81Var.n.setVisibility(0);
                        l81Var.n.setTranslationY(i20);
                        l81Var.n.animate().setListener(null).cancel();
                        l81Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new h81(l81Var, i12)).start();
                        l81Var.a.setPadding(0, 0, 0, i20 - org.telegram.messenger.g0.L(12.0f));
                        l81Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        l81Var.c.setText(org.telegram.messenger.hd.a0("LeaveChats", null, 2131748999, org.telegram.messenger.hd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.uj0 uj0Var2 = l81Var.s.getVisibility() == 0 ? l81Var.b : l81Var.a;
                        int height = uj0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            uj0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                u91.a0((u91) obj, view);
                break;
            case 10:
                u91 u91Var = ((q91) obj).w0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof r91) {
                        r91 r91Var = (r91) view;
                        qg.c.m(u91Var, u91Var.a, r91Var.O, r91Var.getMessageId());
                        break;
                    }
                } else {
                    qg.c.m(u91Var, u91Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
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
                rc1 rc1Var = (rc1) obj;
                String M0 = org.telegram.messenger.hd.M0(2131753738, null);
                StringBuilder m10 = r.b.m(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                SpannableString spannableString = new SpannableString(i5.c.k(WallpapersListActivity.l0[i7], strArr[i7], m10));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = rc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.Q("", true);
                rc1Var.n = strArr[i7];
                rc1Var.E("", true);
                break;
        }
    }
}
