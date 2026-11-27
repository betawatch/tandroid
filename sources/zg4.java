// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg4 implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zg4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r69
    public final void e(int i, View view) {
        ac7 ac7Var;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        tl8 tl8Var;
        TLRPC.Document document;
        pz8 pz8Var;
        l39 l39Var;
        byte b = this.a;
        byte b2 = 9;
        r14 = false;
        r14 = false;
        boolean z3 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ah4 ah4Var = (ah4) obj;
                ht2 ht2Var = ah4Var.t1;
                ArrayList arrayList = ((ah4) ah4Var.n1.e).u1;
                ac7 ac7Var2 = i < arrayList.size() ? (ac7) arrayList.get(i) : null;
                boolean z4 = view instanceof hx0 ? ((hx0) view).e : false;
                uj3 uj3Var = (uj3) ((kg2) ht2Var.b).b;
                ArrayList arrayList2 = uj3Var.K2;
                ArrayList E0 = ah4.E0(uj3Var, ac7Var2, arrayList2, true, false);
                if (!z4) {
                    int size = E0.size() + (ac7Var2 != null ? ac7Var2.h.size() : 0);
                    if ((size > uj3Var.getMessagesController().k4.j1.f() && !uj3Var.getUserConfig().p()) || size > uj3Var.getMessagesController().k4.k1.f()) {
                        Context context = uj3Var.fragmentView.getContext();
                        i2 = ((e) uj3Var).currentAccount;
                        uj3Var.showDialog(new l46(4, i2, null, context, uj3Var));
                        ah4Var.dismiss();
                        return;
                    }
                }
                if (ac7Var2 != null) {
                    LongSparseIntArray longSparseIntArray = ac7Var2.j;
                    if (z4) {
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            ac7Var2.i.add((Long) arrayList2.get(i7));
                            ac7Var2.h.remove(arrayList2.get(i7));
                        }
                        ac7 ac7Var3 = ac7Var2;
                        nf4.z0(ac7Var3, ac7Var2.g, ac7Var2.b, ac7Var2.c, ac7Var2.n, ac7Var2.m, ac7Var2.h, ac7Var2.i, longSparseIntArray, false, false, true, true, false, uj3Var, null);
                        long longValue = arrayList2.size() == 1 ? ((Long) arrayList2.get(0)).longValue() : 0L;
                        UndoView w3 = uj3Var.w3();
                        if (w3 != null) {
                            w3.k(longValue, 21, Integer.valueOf(arrayList2.size()), ac7Var3, null, null);
                        }
                        uj3Var = uj3Var;
                    } else {
                        ac7 ac7Var4 = ac7Var2;
                        if (E0.isEmpty()) {
                            ac7Var = ac7Var4;
                        } else {
                            for (int i8 = 0; i8 < E0.size(); i8++) {
                                ac7Var4.i.remove(E0.get(i8));
                            }
                            ac7Var4.h.addAll(E0);
                            ac7Var = ac7Var4;
                            nf4.z0(ac7Var, ac7Var4.g, ac7Var4.b, ac7Var4.c, ac7Var4.n, ac7Var4.m, ac7Var4.h, ac7Var4.i, longSparseIntArray, false, false, true, true, false, uj3Var, null);
                        }
                        uj3Var = uj3Var;
                        long longValue2 = E0.size() == 1 ? ((Long) E0.get(0)).longValue() : 0L;
                        ac7 ac7Var5 = ac7Var;
                        UndoView w32 = uj3Var.w3();
                        if (w32 != null) {
                            w32.k(longValue2, 20, Integer.valueOf(E0.size()), ac7Var5, null, null);
                        }
                    }
                } else {
                    uj3Var.presentFragment(new nf4(null, E0));
                }
                uj3Var.A3(true);
                ah4Var.dismiss();
                return;
            case 1:
                ll4 ll4Var = (ll4) obj;
                Runnable runnable = ((dl4) ll4Var.F.get(i)).c;
                if (runnable != null) {
                    runnable.run();
                    ll4Var.c(false);
                    return;
                }
                return;
            case 2:
                qn4 qn4Var = (qn4) obj;
                ArrayList arrayList3 = qn4Var.b2;
                ArrayList arrayList4 = qn4Var.d2;
                if (!(view instanceof bd5) || (i3 = (i - 1) - qn4Var.m2) < 0 || i3 >= arrayList3.size()) {
                    return;
                }
                long n = wf3.n((TLRPC.Peer) arrayList3.get(i3));
                if (!arrayList4.contains(Long.valueOf(n))) {
                    arrayList4.add(Long.valueOf(n));
                    ((bd5) view).c(true, true);
                } else {
                    if (qn4Var.c2.contains(Long.valueOf(n))) {
                        int i9 = -qn4Var.x2;
                        qn4Var.x2 = i9;
                        hl.A3(i9, view, null);
                        yw0.E.a();
                        ArrayList arrayList5 = new ArrayList();
                        e eVar = qn4Var.r1;
                        if (n >= 0) {
                            arrayList5.add(eVar.getMessagesController().X1(Long.valueOf(n)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat M0 = eVar.getMessagesController().M0(Long.valueOf(-n));
                            String M02 = xc2.V(M0) ? ob6.M0(2131750636, null) : ob6.M0(2131750637, null);
                            arrayList5.add(M0);
                            str = M02;
                        }
                        if (qn4Var.y2 != n || System.currentTimeMillis() - qn4Var.z2 > 1500) {
                            qn4Var.y2 = n;
                            qn4Var.z2 = System.currentTimeMillis();
                            v21 g = new d31(qn4Var.f2, null).g(str, arrayList5);
                            g.j = 1500;
                            g.j();
                            return;
                        }
                        return;
                    }
                    arrayList4.remove(Long.valueOf(n));
                    ((bd5) view).c(false, true);
                }
                qn4Var.d1(true);
                qn4Var.e1();
                qn4Var.Z0(false);
                return;
            case 3:
                dd5 dd5Var = (dd5) obj;
                if (dd5Var.getParentActivity() != null) {
                    if (i == dd5Var.n || i == 0) {
                        if (dd5Var.f != null) {
                            try {
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", dd5Var.f.link));
                                d31.j(dd5Var).j();
                                return;
                            } catch (Exception e) {
                                cc4.g(e, true);
                                return;
                            }
                        }
                        return;
                    }
                    if (i != dd5Var.s) {
                        if (i == dd5Var.r) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dd5Var.getParentActivity());
                            alertDialog$Builder.a.U = ob6.M0(2131745753, null);
                            alertDialog$Builder.a.S = ob6.M0(2131745750, null);
                            alertDialog$Builder.j(ob6.M0(2131745751, null), new e05(dd5Var, b2));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            dd5Var.showDialog(alertDialog$Builder.a);
                            return;
                        }
                        return;
                    }
                    if (dd5Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", dd5Var.f.link);
                            dd5Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131748864, null)), 500);
                            return;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                ((nd5) obj).e0(i, view);
                return;
            case 5:
                sd5 sd5Var = (sd5) obj;
                if (i == sd5Var.c2) {
                    sd5Var.a2.a.b1(true);
                    sd5Var.dismiss();
                    return;
                } else {
                    if (view instanceof lj6) {
                        lj6 lj6Var = (lj6) view;
                        if (sd5Var.Z1.contains(Long.valueOf(lj6Var.getUserId()))) {
                            return;
                        }
                        sd5Var.a2.a.f1(lj6Var.getUserId(), true);
                        return;
                    }
                    return;
                }
            case 6:
                ((hs5) obj).d0(i, view);
                return;
            case 7:
                hc8 hc8Var = (hc8) obj;
                xv7 xv7Var = (xv7) xv7.a().get(i);
                hc8Var.e1.setTypeface(xv7Var.a);
                a78 e3 = a78.e(hc8Var.z1);
                String str2 = xv7Var.a;
                e3.j = str2;
                e3.a.edit().putString("typeface", str2).apply();
                h44 h44Var = hc8Var.C0;
                if (h44Var instanceof rlb) {
                    ((rlb) h44Var).setTypeface(xv7Var);
                }
                hc8Var.B0(false);
                return;
            case 8:
                ((LanguageSelectActivity) obj).h0(i, view);
                return;
            case 9:
                l46 l46Var = (l46) obj;
                HashSet hashSet = l46Var.t2;
                if (view instanceof kb) {
                    kb kbVar = (kb) view;
                    TLRPC.Chat currentChannel = kbVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    kbVar.r.a(hashSet.contains(currentChannel), true);
                    l46Var.w1();
                    return;
                }
                if (view instanceof bd5) {
                    if (l46Var.T1 || !((i4 = l46Var.c2) == 11 || i4 == 34)) {
                        bd5 bd5Var = (bd5) view;
                        Object object = bd5Var.getObject();
                        if (!bd5Var.P) {
                            if (hashSet.contains(object)) {
                                hashSet.remove(object);
                            } else {
                                hashSet.add(object);
                            }
                            bd5Var.c(hashSet.contains(object), true);
                            l46Var.w1();
                            return;
                        }
                        if (object instanceof TLRPC.User) {
                            long j = ((TLRPC.User) object).id;
                            int i10 = -l46Var.P2;
                            l46Var.P2 = i10;
                            hl.A3(i10, bd5Var, null);
                            yw0.E.a();
                            String l = j >= 0 ? lbc.l(uc7.s1(l46Var.a).X1(Long.valueOf(j))) : "";
                            boolean M3 = uc7.s1(l46Var.a).M3();
                            ViewGroup viewGroup = l46Var.b;
                            (M3 ? new d31((FrameLayout) viewGroup, l46Var.J0).Q(R.raw.star_premium_2, 36, hl.S2(ob6.a0(null, null, 2131743415, l))) : new d31((FrameLayout) viewGroup, l46Var.J0).K(R.raw.star_premium_2, hl.S2(ob6.a0(null, null, 2131743415, l)), ob6.M0(2131743414, null), new w36(l46Var, r14))).j();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
            case 11:
                ((t07) obj).h(view);
                return;
            case 12:
                ((q67) obj).onBackPressed();
                return;
            case 13:
                z67 z67Var = (z67) obj;
                int i11 = z67Var.J;
                if (i < i11 || i >= z67Var.K) {
                    return;
                }
                r47 r47Var = (r47) z67Var.y.get(i - i11);
                if (r47Var.w4()) {
                    if (z67Var.c0(r47Var)) {
                        return;
                    }
                    z67Var.getOrCreateStoryViewer().J(z67Var.getParentActivity(), r47Var.l, l6b.a(z67Var.f));
                    return;
                }
                long B0 = r47.B0(r47Var.k);
                Bundle bundle = new Bundle();
                if (wf3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", r47Var.e1());
                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                if (z67Var.getMessagesController().C(bundle, z67Var, null, null)) {
                    z67Var.presentFragment(new zu1(bundle));
                    return;
                }
                return;
            case 14:
                gv7 gv7Var = (gv7) obj;
                gv7Var.j3.accept(Integer.valueOf(gv7Var.i3.b(i)));
                a78 a78Var = gv7Var.i3;
                a78Var.c.put(Integer.valueOf(a78Var.f), Integer.valueOf(a78Var.b(i)));
                a78Var.e = true;
                return;
            case 15:
                vab vabVar = (vab) obj;
                xv7 xv7Var2 = (xv7) xv7.a().get(i);
                vabVar.V0.setTypeface(xv7Var2.a);
                a78 e4 = a78.e(vabVar.p1);
                String str3 = xv7Var2.a;
                e4.j = str3;
                e4.a.edit().putString("typeface", str3).apply();
                h44 h44Var2 = vabVar.t0;
                if (h44Var2 instanceof rlb) {
                    ((rlb) h44Var2).setTypeface(xv7Var2);
                }
                vabVar.O0(false);
                return;
            case 16:
                ((PasscodeActivity) obj).r0(i, view);
                return;
            case 17:
                g48 g48Var = (g48) obj;
                g48Var.a(i, true);
                r38 r38Var = g48Var.h;
                if (r38Var != null) {
                    r38Var.a(Integer.valueOf(i));
                    return;
                }
                return;
            case 18:
                l98 l98Var = (l98) obj;
                ArrayList arrayList6 = l98Var.n;
                ArrayList arrayList7 = l98Var.f;
                do6 do6Var = l98Var.K;
                if (do6Var != null) {
                    arrayList7 = do6Var.e;
                } else if (arrayList7.isEmpty()) {
                    if (i < arrayList6.size()) {
                        String str4 = (String) arrayList6.get(i);
                        k98 k98Var = l98Var.u0;
                        if (k98Var != null) {
                            k98Var.F(str4);
                            return;
                        }
                        l98Var.Q.getSearchField().setText(str4);
                        l98Var.Q.getSearchField().setSelection(str4.length());
                        l98Var.f0(l98Var.Q.getSearchField());
                        return;
                    }
                    if (i == arrayList6.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l98Var.getParentActivity());
                        alertDialog$Builder2.a.S = ob6.M0(2131752021, null);
                        alertDialog$Builder2.a.U = ob6.M0(2131752026, null);
                        alertDialog$Builder2.j(ob6.M0(2131752064, null), new d98(l98Var, r14));
                        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                        id idVar = alertDialog$Builder2.a;
                        l98Var.showDialog(idVar);
                        TextView textView = (TextView) idVar.c(-1);
                        if (textView != null) {
                            yob.X(textView, aob.q7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i < 0 || i >= arrayList7.size()) {
                    return;
                }
                s7 s7Var = l98Var.Q;
                if (s7Var != null) {
                    hl.t1(s7Var.getSearchField());
                }
                if (l98Var.Z) {
                    l98Var.e0(view, arrayList7.get(i));
                    return;
                }
                byte b3 = l98Var.U;
                if (b3 != 1) {
                    i5 = 3;
                    if (b3 != 3) {
                        if (b3 != 2) {
                            i5 = 10;
                            if (b3 != 10) {
                                i5 = l98Var.V == null ? (byte) 4 : (byte) 0;
                            }
                        }
                        PhotoViewer.q0().T1(null, l98Var, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        int i12 = l98Var.I;
                        boolean z5 = l98Var.J;
                        q0.h = i12;
                        q0.n = z5;
                        PhotoViewer.q0().o1(arrayList7, i, i5, l98Var.m0, l98Var.y0, l98Var.V);
                        return;
                    }
                }
                i5 = 1;
                PhotoViewer.q0().T1(null, l98Var, null);
                PhotoViewer q02 = PhotoViewer.q0();
                int i122 = l98Var.I;
                boolean z52 = l98Var.J;
                q02.h = i122;
                q02.n = z52;
                PhotoViewer.q0().o1(arrayList7, i, i5, l98Var.m0, l98Var.y0, l98Var.V);
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList8 = photoViewer.f7;
                if (!arrayList8.isEmpty() && (i6 = photoViewer.O4) >= 0 && i6 < arrayList8.size()) {
                    Object obj2 = arrayList8.get(photoViewer.O4);
                    if (obj2 instanceof go6) {
                        ((go6) obj2).s = photoViewer.k0();
                    }
                }
                photoViewer.j5 = true;
                int indexOf = arrayList8.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.K1(indexOf);
                }
                photoViewer.j5 = false;
                return;
            case 20:
                wh8 wh8Var = (wh8) obj;
                boolean[] zArr = wh8Var.x;
                if (i == wh8Var.p0) {
                    wh8Var.g0();
                    return;
                }
                if (view instanceof wkb) {
                    wkb wkbVar = (wkb) view;
                    boolean z6 = wh8Var.M;
                    zeb zebVar = wh8Var.R;
                    if (zebVar != null) {
                        zebVar.e();
                    }
                    if (wh8Var.J) {
                        int i13 = -wh8Var.P;
                        wh8Var.P = i13;
                        hl.A3(i13, wkbVar, null);
                        yw0.E.a();
                        return;
                    }
                    if (i == wh8Var.s0) {
                        z = !wh8Var.H;
                        wh8Var.H = z;
                    } else {
                        int i14 = wh8Var.v0;
                        if (i == i14) {
                            z = !wh8Var.I;
                            wh8Var.I = z;
                        } else {
                            if (i == wh8Var.w0) {
                                z2 = !wh8Var.K;
                                wh8Var.K = z2;
                                wh8Var.u0();
                                int i15 = wh8Var.v0;
                                if (i15 >= 0 && i14 < 0) {
                                    wh8Var.b.i(i15);
                                } else if (i14 >= 0 && i15 < 0) {
                                    wh8Var.b.s(i14);
                                }
                            } else if (i == wh8Var.t0) {
                                boolean z7 = wh8Var.L;
                                z2 = !z7;
                                wh8Var.L = z2;
                                if (!z7 && wh8Var.M) {
                                    int i16 = wh8Var.k0;
                                    wh8Var.M = false;
                                    wh8Var.u0();
                                    f89 L = wh8Var.c.L(wh8Var.u0);
                                    if (L != null) {
                                        ((wkb) L.a).setChecked(false);
                                    } else {
                                        wh8Var.b.g(wh8Var.u0);
                                    }
                                    wh8Var.b.q(i16, 2);
                                }
                            } else {
                                if (wh8Var.O != 0) {
                                    return;
                                }
                                z = !wh8Var.M;
                                wh8Var.M = z;
                                int i17 = wh8Var.k0;
                                wh8Var.u0();
                                boolean z8 = wh8Var.M;
                                uh8 uh8Var = wh8Var.b;
                                if (z8) {
                                    uh8Var.p(wh8Var.k0, 2);
                                } else {
                                    uh8Var.q(i17, 2);
                                }
                                if (wh8Var.M && wh8Var.L) {
                                    wh8Var.L = false;
                                    f89 L2 = wh8Var.c.L(wh8Var.t0);
                                    if (L2 != null) {
                                        ((wkb) L2.a).setChecked(false);
                                    } else {
                                        wh8Var.b.g(wh8Var.t0);
                                    }
                                }
                                if (wh8Var.M) {
                                    int i18 = 0;
                                    boolean z9 = false;
                                    while (i18 < zArr.length) {
                                        if (z9) {
                                            zArr[i18] = false;
                                        } else if (zArr[i18]) {
                                            z9 = true;
                                        }
                                        i18++;
                                        z9 = z9;
                                    }
                                }
                            }
                            z = z2;
                        }
                    }
                    if (wh8Var.N && !wh8Var.M) {
                        wh8Var.c.getChildCount();
                        wh8Var.h.a();
                    }
                    for (int i19 = wh8Var.o0; i19 < wh8Var.o0 + wh8Var.E; i19++) {
                        f89 L3 = wh8Var.c.L(i19);
                        if (L3 != null) {
                            View view2 = L3.a;
                            if (view2 instanceof zh8) {
                                zh8 zh8Var = (zh8) view2;
                                zh8Var.n(wh8Var.M, true);
                                zh8Var.r.a(zArr[i19 - wh8Var.o0], z6);
                                if (zh8Var.getTop() > hl.L(40.0f) && i == wh8Var.u0 && !wh8Var.N) {
                                    wh8Var.h.c(zh8Var.getCheckBox());
                                    wh8Var.N = true;
                                }
                            }
                        }
                    }
                    wkbVar.setChecked(z);
                    wh8Var.j0();
                    return;
                }
                return;
            case 21:
                ((PremiumPreviewFragment) obj).s0(i, view);
                return;
            case 22:
                rl8 rl8Var = (rl8) obj;
                PremiumPreviewFragment premiumPreviewFragment = rl8Var.n;
                ArrayList arrayList9 = premiumPreviewFragment.d;
                jd8 jd8Var = rl8Var.e;
                if (view.isEnabled() && (view instanceof em8)) {
                    em8 em8Var = (em8) view;
                    premiumPreviewFragment.e = arrayList9.indexOf(em8Var.getTier());
                    premiumPreviewFragment.y0(true);
                    em8Var.c(true, true);
                    for (int i20 = 0; i20 < jd8Var.getChildCount(); i20++) {
                        View childAt = jd8Var.getChildAt(i20);
                        if (childAt instanceof em8) {
                            em8 em8Var2 = (em8) childAt;
                            if (em8Var2.getTier() != em8Var.getTier()) {
                                em8Var2.c(false, true);
                            }
                        }
                    }
                    for (int i21 = 0; i21 < jd8Var.getHiddenChildCount(); i21++) {
                        View X = jd8Var.X(i21);
                        if (X instanceof em8) {
                            em8 em8Var3 = (em8) X;
                            if (em8Var3.getTier() != em8Var.getTier()) {
                                em8Var3.c(false, true);
                            }
                        }
                    }
                    for (int i22 = 0; i22 < jd8Var.getCachedChildCount(); i22++) {
                        View Q = jd8Var.Q(i22);
                        if (Q instanceof em8) {
                            em8 em8Var4 = (em8) Q;
                            if (em8Var4.getTier() != em8Var.getTier()) {
                                em8Var4.c(false, true);
                            }
                        }
                    }
                    for (int i23 = 0; i23 < jd8Var.getAttachedScrapChildCount(); i23++) {
                        View P = jd8Var.P(i23);
                        if (P instanceof em8) {
                            em8 em8Var5 = (em8) P;
                            if (em8Var5.getTier() != em8Var.getTier()) {
                                em8Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().p() || ((tl8Var = premiumPreviewFragment.f) != null && tl8Var.a.months < ((tl8) arrayList9.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z3 = true;
                    }
                    hl.R3(frameLayout, z3);
                    return;
                }
                return;
            case 23:
                rk8 rk8Var = (rk8) obj;
                if (view != null) {
                    rk8Var.A1(view, true);
                    rk8Var.l3 = false;
                    rk8Var.y0(0, view.getTop() - ((rk8Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), hl.H);
                    return;
                }
                return;
            case 24:
                ((PrivacyControlActivity) obj).H0(i, view);
                return;
            case 25:
                vn8 vn8Var = (vn8) obj;
                boolean z10 = vn8Var.E;
                if (i == vn8Var.x) {
                    id idVar2 = jj.L(vn8Var.getParentActivity(), ob6.M0(2131747640, null), ob6.M0(2131747641, null), ob6.M0(2131751563, null), new pg6((Object) vn8Var, (byte) 16), null).a;
                    idVar2.show();
                    idVar2.h();
                    return;
                }
                if (i != vn8Var.f) {
                    if (i < vn8Var.r || i >= vn8Var.s) {
                        return;
                    }
                    if (z10 != 1) {
                        throw null;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", vn8Var.getMessagesController().x0.keyAt(i - vn8Var.r));
                    vn8Var.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                if (z10 != 1) {
                    Bundle l2 = bs2.l("isNeverShare", true);
                    if (z10 == 2) {
                        l2.putInt("chatAddType", 2);
                    }
                    rc5 rc5Var = new rc5(l2);
                    rc5Var.x = new tn8(vn8Var);
                    vn8Var.presentFragment(rc5Var);
                    return;
                }
                bg3 bg3Var = new bg3(null);
                bg3Var.d = new Paint();
                bg3Var.f = new ag3[2];
                bg3Var.x = true;
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("onlySelect", true);
                bundle3.putBoolean("checkCanWrite", false);
                bundle3.putBoolean("resetDelegate", false);
                bundle3.putInt("dialogsType", 9);
                uj3 uj3Var2 = new uj3(bundle3);
                bg3Var.a = uj3Var2;
                uj3Var2.E2 = new xf3(bg3Var);
                uj3Var2.onFragmentCreate();
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("onlyUsers", true);
                bundle4.putBoolean("destroyAfterSelect", true);
                bundle4.putBoolean("returnAsResult", true);
                bundle4.putBoolean("disableSections", true);
                bundle4.putBoolean("needFinishFragment", false);
                bundle4.putBoolean("resetDelegate", false);
                bundle4.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle4);
                bg3Var.b = contactsActivity;
                contactsActivity.V = new xf3(bg3Var);
                contactsActivity.onFragmentCreate();
                vn8Var.presentFragment(bg3Var);
                return;
            case 26:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).z2(i);
                return;
            case 27:
                ((ProxyListActivity) obj).f0(i, view);
                return;
            case 28:
                oz8 oz8Var = (oz8) obj;
                if (!(view instanceof xy8) || (document = ((xy8) view).e) == null) {
                    return;
                }
                long j2 = document.id;
                if (j2 != 0) {
                    rz8 rz8Var = oz8Var.a;
                    if (rz8Var.d != null) {
                        if (!rz8Var.getUserConfig().p() && ((pz8Var = rz8Var.h) == null || !pz8Var.I.contains(Long.valueOf(j2)))) {
                            f09 f09Var = rz8Var.d;
                            f09Var.getClass();
                            f09Var.d1(0, ob6.M0(2131746202, null), ob6.M0(2131746200, null));
                            f09Var.i0();
                            return;
                        }
                        f09 f09Var2 = rz8Var.d;
                        f09Var2.getClass();
                        String str5 = "c:" + j2;
                        HashMap hashMap = f09Var2.K;
                        if (!hashMap.containsKey(str5)) {
                            wl l3 = wl.l(f09Var2.b, 2, document);
                            l3.b(f09Var2);
                            hashMap.put(str5, l3);
                        }
                        if (!str5.startsWith("c:")) {
                            str5 = str5.replace("️", "");
                        }
                        ArrayList arrayList10 = f09Var2.J;
                        int indexOf2 = arrayList10.indexOf(str5);
                        if (indexOf2 >= 0) {
                            arrayList10.remove(indexOf2);
                        } else {
                            if (arrayList10.size() >= 6) {
                                arrayList10.remove(0);
                            }
                            arrayList10.add(str5);
                        }
                        f09Var2.c();
                        f09Var2.i0();
                        pz8 pz8Var2 = rz8Var.h;
                        if (pz8Var2 != null) {
                            ArrayList a = pz8Var2.a();
                            a.remove(Long.valueOf(j2));
                            a.add(0, Long.valueOf(j2));
                            while (a.size() > 21) {
                                qd4.v(1, a);
                            }
                            StringBuilder sb = new StringBuilder();
                            for (int i24 = 0; i24 < a.size(); i24++) {
                                if (i24 > 0) {
                                    sb.append(',');
                                }
                                sb.append(a.get(i24));
                            }
                            uc7.s1(pz8Var2.a).X3.edit().putString("qrAppliedEmoji", sb.toString()).apply();
                            pz8Var2.K = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                o39 o39Var = (o39) obj;
                ArrayList arrayList11 = o39Var.n;
                int d = o39Var.f.d(i);
                if (d == 0) {
                    n39 n39Var = o39Var.F;
                    if (n39Var != null) {
                        n39Var.g(r47.B1(((TLRPC.MessagePeerReaction) arrayList11.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList11.get(i));
                        return;
                    }
                    return;
                }
                if (d != 1 || (l39Var = o39Var.H) == null) {
                    return;
                }
                l39Var.c(o39Var.J);
                return;
        }
    }
}
