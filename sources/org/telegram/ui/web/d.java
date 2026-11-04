package org.telegram.ui.web;

import ai.q6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import gi.g5;
import gi.j3;
import gi.j8;
import gi.n5;
import gi.nb;
import gi.x9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e3;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lp0;
import org.telegram.ui.wm;
import ug.c2;
import xg.b0;
import xg.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        ug.z1 j10;
        final int i3 = 0;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                org.telegram.ui.y yVar = (org.telegram.ui.y) this.c;
                lVar.b = true;
                yVar.run();
                lVar.x.g3.O(true);
                return;
            case 1:
                tg.q qVar = (tg.q) this.b;
                Context context = (Context) this.c;
                androidx.activity.n nVar = qVar.p1;
                switch (nVar.a) {
                    case 1:
                        z10 = nVar.b;
                        break;
                    default:
                        z10 = nVar.b;
                        break;
                }
                if (z10) {
                    return;
                }
                androidx.activity.n nVar2 = qVar.p1;
                switch (nVar2.a) {
                    case 1:
                        view2 = (x9) nVar2.d;
                        break;
                    default:
                        view2 = (lp0) nVar2.d;
                        break;
                }
                Bitmap N3 = org.telegram.messenger.g0.N3(view2);
                Bitmap createBitmap = Bitmap.createBitmap(N3.getWidth(), N3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-16777216);
                androidx.activity.n nVar3 = qVar.p1;
                switch (nVar3.a) {
                    case 1:
                        g5 g5Var = ((x9) nVar3.d).y0;
                        Matrix matrix = g5Var.getMatrix();
                        canvas.save();
                        canvas.translate(g5Var.getX(), g5Var.getY());
                        canvas.concat(matrix);
                        g5Var.getWidth();
                        throw null;
                    default:
                        ug.a0 a0Var = ((lp0) nVar3.d).G0;
                        Matrix matrix2 = a0Var.getMatrix();
                        canvas.save();
                        canvas.translate(a0Var.getX(), a0Var.getY());
                        canvas.concat(matrix2);
                        float width = a0Var.getWidth();
                        Bitmap bitmap = (Bitmap) nVar3.c;
                        canvas.scale(width / bitmap.getWidth(), a0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(N3, 0.0f, 0.0f, (Paint) null);
                        N3.recycle();
                        tg.i iVar = new tg.i(qVar, context, createBitmap);
                        androidx.activity.n nVar4 = qVar.p1;
                        switch (nVar4.a) {
                            case 1:
                                frameLayout = ((x9) nVar4.d).F0;
                                break;
                            default:
                                frameLayout = ((lp0) nVar4.d).O0;
                                break;
                        }
                        frameLayout.addView(iVar, mf.c(-1.0f, -1));
                        androidx.activity.n nVar5 = qVar.p1;
                        Objects.requireNonNull(nVar5);
                        iVar.setColorListener(new q6(nVar5, 6));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                        duration.setInterpolator(xq.f);
                        duration.addUpdateListener(new j3(iVar, 28));
                        duration.start();
                        androidx.activity.n nVar6 = qVar.p1;
                        switch (nVar6.a) {
                            case 1:
                                nVar6.b = true;
                                break;
                            default:
                                nVar6.b = true;
                                break;
                        }
                        qVar.dismiss();
                        return;
                }
            case 2:
                an.i0((wm) this.c, 41026, new j8((th.b) this.b, 24), null);
                return;
            case 3:
                c2 c2Var = (c2) this.b;
                nb nbVar = (nb) this.c;
                ug.z1[] z1VarArr = c2Var.I;
                if (z1VarArr == null || z1VarArr.length == 0 || c2Var.J == null || (j10 = c2Var.j(c2Var.o0, c2Var.p0)) == null) {
                    return;
                }
                nbVar.a(j10);
                return;
            case 4:
                vg.i0 i0Var = (vg.i0) this.b;
                Context context2 = (Context) this.c;
                d2 d2Var = i0Var.D2;
                int i11 = i0Var.a2;
                if (i11 == 11 || i11 == 34) {
                    return;
                }
                if (i11 != 19 && i11 != 32 && !i0Var.s1()) {
                    if (i11 == 18 || i11 == 20 || i11 == 24 || i11 == 25 || i11 == 26 || i11 == 29 || i11 == 22 || i11 == 23 || i11 == 21 || i11 == 27 || i11 == 28 || i11 == 30 || i11 == 35) {
                        org.telegram.messenger.g0.g(i0Var.k1());
                        i0Var.dismiss();
                        return;
                    }
                    if (h10.i(i0Var.a).q() || hp.s1(i0Var.a).D3() || i0Var.G2) {
                        i0Var.dismiss();
                        return;
                    } else {
                        if (d2Var == null) {
                            return;
                        }
                        if (d2Var.getVisibleDialog() != null) {
                            d2Var.getVisibleDialog().dismiss();
                        }
                        d2Var.presentFragment(new PremiumPreviewFragment(0, vg.i0.u1(i11)));
                        i0Var.dismiss();
                        return;
                    }
                }
                e3 e3Var = i0Var.V1;
                if (e3Var.b) {
                    if (h10.i(i0Var.a).q() && xg.s.i()) {
                        xg.j.i(i0Var.T1, i0Var);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, i0Var.J0);
                    alertDialog$Builder.a.S = bd.M0(2131747040, null);
                    alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(bd.M0(i0Var.r1() ? 2131747038 : 2131747039, null));
                    alertDialog$Builder.k(bd.M0(2131752152, null), new vg.w(i0Var, i3));
                    alertDialog$Builder.h(bd.M0(2131752589, null), new u9.j(10));
                    alertDialog$Builder.p();
                    return;
                }
                boolean z11 = e3Var.a;
                if (z11 && e3Var.c == 0) {
                    if (!e3Var.e || !xg.s.i()) {
                        i0Var.i1();
                        return;
                    }
                    i0Var.Y1 = true;
                    i0Var.q2.e0 = false;
                    d2 d2Var2 = i0Var.p1;
                    e3 e3Var2 = i0Var.V1;
                    xg.q0 q0Var = new xg.q0(d2Var2, e3Var2.h, e3Var2.k);
                    q0Var.show();
                    q0Var.I0 = new ba(i0Var, 13);
                    return;
                }
                if (!z11) {
                    int i12 = e3Var.f;
                    if (i12 != 0) {
                        xg.j.g(i12);
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout2 = new FrameLayout(i0Var.getContext());
                k9 k9Var = new k9(i0Var.getContext());
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout2.addView(k9Var, mf.c(60.0f, 60));
                frameLayout2.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(k6.x0(null, k6.h5, false));
                frameLayout2.addView(new n5(i0Var.getContext(), paint, i0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), mf.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(i0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                r6.t(imageView, k6.m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout2.addView(imageView, mf.e(24, 24, 17));
                k9 k9Var2 = new k9(i0Var.getContext());
                k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout2.addView(k9Var2, mf.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout3 = new FrameLayout(i0Var.getContext());
                frameLayout3.addView(frameLayout2, mf.e(-2, 60, 1));
                frameLayout3.setClipChildren(false);
                TextView textView = new TextView(context2);
                textView.setLetterSpacing(0.025f);
                r6.V(textView, k6.j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout3.addView(textView, mf.t(-1, -2, 0, 24, 80, 24, 0));
                u8 u8Var = new u8((e6) null);
                TLRPC.Chat M0 = hp.s1(i0Var.a).M0(Long.valueOf(-i0Var.V1.c));
                u8Var.q(M0);
                k9Var.e(M0, u8Var);
                u8 u8Var2 = new u8((e6) null);
                TLRPC.Chat M02 = hp.s1(i0Var.a).M0(Long.valueOf(-i0Var.T1));
                u8Var2.q(M02);
                k9Var2.e(M02, u8Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                alertDialog$Builder2.o(frameLayout3);
                k5.r("ReplaceBoostChannelDescription", null, 2131746278, new Object[]{M0.title, M02.title}, textView);
                alertDialog$Builder2.k(bd.M0(2131746280, null), new vg.w(i0Var, i10));
                alertDialog$Builder2.h(bd.M0(2131752589, null), new u9.j(11));
                alertDialog$Builder2.p();
                return;
            case 5:
                xg.q0 q0Var2 = (xg.q0) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = q0Var2.Q1;
                if (arrayList.isEmpty()) {
                    return;
                }
                xg.d0 d0Var = q0Var2.T1;
                if (d0Var.R) {
                    return;
                }
                d0Var.setLoading(true);
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                    arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                    hashSet.add(Long.valueOf(m5.o(tL_myBoost.peer)));
                }
                xg.s.a(chat.id, arrayList2, new ai.v1(q0Var2, chat, arrayList2, hashSet, 18), new xg.d(q0Var2, i10));
                return;
            case 6:
                xg.e1 e1Var = (xg.e1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = e1Var.a2;
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    e1Var.g2.remove(l10);
                }
                e1Var.e1();
                e1Var.S1.b(true, hashSet2, new xg.x0(e1Var, 5), null);
                e1Var.p1(true, true);
                e1Var.f1();
                return;
            case 7:
                final xg.e1 e1Var2 = (xg.e1) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                f60 F = f60.F(e1Var2.c, e1Var2.J0, (View) view.getParent());
                F.c(R.drawable.profile_discuss, bd.M0(2131745611, null), new Runnable() { // from class: xg.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    d2 d2Var3 = e1Var2.p1;
                                    if (d2Var3 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        d2Var3.presentFragment(new wm(bundle));
                                        break;
                                    } else {
                                        d2 T = LaunchActivity.T();
                                        b2 b2Var = new b2();
                                        b2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new wm(bundle2), b2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    d2 d2Var4 = e1Var2.p1;
                                    if (d2Var4 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        d2Var4.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        d2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            b2 b2Var2 = new b2();
                                            b2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), b2Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                F.c(R.drawable.msg_openprofile, bd.M0(2131747794, null), new Runnable() { // from class: xg.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    d2 d2Var3 = e1Var2.p1;
                                    if (d2Var3 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        d2Var3.presentFragment(new wm(bundle));
                                        break;
                                    } else {
                                        d2 T = LaunchActivity.T();
                                        b2 b2Var = new b2();
                                        b2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new wm(bundle2), b2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    d2 d2Var4 = e1Var2.p1;
                                    if (d2Var4 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        d2Var4.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        d2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            b2 b2Var2 = new b2();
                                            b2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), b2Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                F.Z();
                return;
            case 8:
                final yg.e eVar = (yg.e) this.b;
                final zg.a aVar = (zg.a) this.c;
                if (!eVar.d) {
                    ((xg.b0) eVar).r.dismiss();
                    return;
                }
                if (aVar.a.R) {
                    return;
                }
                aVar.b(true);
                String str = eVar.h;
                u10 u10Var = new u10() { // from class: yg.d
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj3) {
                        switch (i3) {
                            case 0:
                                aVar.b(false);
                                b0 b0Var = (b0) eVar;
                                g0.i3(new xf.c(b0Var, 5), 200L);
                                b0Var.r.dismiss();
                                break;
                            default:
                                aVar.b(false);
                                e eVar2 = eVar;
                                j.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                break;
                        }
                    }
                };
                u10 u10Var2 = new u10() { // from class: yg.d
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj3) {
                        switch (i10) {
                            case 0:
                                aVar.b(false);
                                b0 b0Var = (b0) eVar;
                                g0.i3(new xf.c(b0Var, 5), 200L);
                                b0Var.r.dismiss();
                                break;
                            default:
                                aVar.b(false);
                                e eVar2 = eVar;
                                j.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                break;
                        }
                    }
                };
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.t0);
                TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                tL_payments_applyGiftCode.slug = str;
                connectionsManager.sendRequest(tL_payments_applyGiftCode, new xg.p(u10Var2, u10Var, i3), 2);
                return;
            case 9:
                zg.g gVar = (zg.g) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                zg.f fVar = gVar.w;
                if (fVar != null) {
                    xg.a0 a0Var2 = ((xg.u) fVar).a;
                    a0Var2.V1.remove(chat2);
                    a0Var2.k1(true, true);
                    return;
                }
                return;
            case 10:
                ((xg.d) this.b).a((TLRPC.TL_payments_checkedGiftCode) this.c);
                return;
            default:
                ((xg.d) this.b).a((TLRPC.Chat) this.c);
                return;
        }
    }
}
