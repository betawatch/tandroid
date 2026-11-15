package org.telegram.ui;

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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import vg.o;
import wg.z;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sc1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a8.r7 r7Var;
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        tg.c2 j3;
        int i7 = 24;
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                hi.d dVar = (hi.d) this.b;
                int[] iArr = (int[]) this.c;
                if (dVar.R || (r7Var = vc1.d) == null) {
                    return;
                }
                dVar.setLoading(true);
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] j10 = r7Var.j();
                    b9.k0 k0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.c);
                    String str = (String) r7Var.d;
                    com.google.android.gms.common.api.internal.p0 p0Var = k0Var.i;
                    b9.h0 h0Var = new b9.h0(p0Var, str, "/tg-wear-auth/answer", j10);
                    p0Var.b.d(0, h0Var);
                    q6.m.m(h0Var, b9.j0.a).addOnSuccessListener(new a7(r7Var, dVar, iArr, i7)).addOnFailureListener(new tc1(dVar, 0));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    dVar.setLoading(false);
                    return;
                }
            case 1:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                w wVar = (w) this.c;
                kVar.b = true;
                wVar.run();
                kVar.x.g3.O(true);
                return;
            case 2:
                sg.q qVar = (sg.q) this.b;
                Context context = (Context) this.c;
                androidx.activity.n nVar = qVar.s1;
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
                androidx.activity.n nVar2 = qVar.s1;
                switch (nVar2.a) {
                    case 1:
                        view2 = (hi.u9) nVar2.d;
                        break;
                    default:
                        view2 = (tp0) nVar2.d;
                        break;
                }
                Bitmap M3 = org.telegram.messenger.g0.M3(view2);
                Bitmap createBitmap = Bitmap.createBitmap(M3.getWidth(), M3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-16777216);
                androidx.activity.n nVar3 = qVar.s1;
                switch (nVar3.a) {
                    case 1:
                        hi.g5 g5Var = ((hi.u9) nVar3.d).y0;
                        Matrix matrix = g5Var.getMatrix();
                        canvas.save();
                        canvas.translate(g5Var.getX(), g5Var.getY());
                        canvas.concat(matrix);
                        g5Var.getWidth();
                        throw null;
                    default:
                        tg.b0 b0Var = ((tp0) nVar3.d).G0;
                        Matrix matrix2 = b0Var.getMatrix();
                        canvas.save();
                        canvas.translate(b0Var.getX(), b0Var.getY());
                        canvas.concat(matrix2);
                        float width = b0Var.getWidth();
                        Bitmap bitmap = (Bitmap) nVar3.c;
                        canvas.scale(width / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(M3, 0.0f, 0.0f, (Paint) null);
                        M3.recycle();
                        sg.i iVar = new sg.i(qVar, context, createBitmap);
                        androidx.activity.n nVar4 = qVar.s1;
                        switch (nVar4.a) {
                            case 1:
                                frameLayout = ((hi.u9) nVar4.d).F0;
                                break;
                            default:
                                frameLayout = ((tp0) nVar4.d).O0;
                                break;
                        }
                        frameLayout.addView(iVar, c8.ja.c(-1.0f, -1));
                        androidx.activity.n nVar5 = qVar.s1;
                        Objects.requireNonNull(nVar5);
                        iVar.setColorListener(new bi.i6(nVar5, 6));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                        duration.setInterpolator(org.telegram.ui.Components.er.f);
                        duration.addUpdateListener(new hi.j3(iVar, 29));
                        duration.start();
                        androidx.activity.n nVar6 = qVar.s1;
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
            case 3:
                org.telegram.ui.Components.jn.i0((an) this.c, 41026, new hi.g7((sh.b) this.b, 26), null);
                return;
            case 4:
                tg.f2 f2Var = (tg.f2) this.b;
                hi.kb kbVar = (hi.kb) this.c;
                tg.c2[] c2VarArr = f2Var.I;
                if (c2VarArr == null || c2VarArr.length == 0 || f2Var.J == null || (j3 = f2Var.j(f2Var.o0, f2Var.p0)) == null) {
                    return;
                }
                kbVar.a(j3);
                return;
            case 5:
                ug.j0 j0Var = (ug.j0) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = j0Var.G2;
                int i12 = j0Var.d2;
                if (i12 == 11 || i12 == 34) {
                    return;
                }
                if (i12 != 19 && i12 != 32 && !j0Var.s1()) {
                    if (i12 == 18 || i12 == 20 || i12 == 24 || i12 == 25 || i12 == 26 || i12 == 29 || i12 == 22 || i12 == 23 || i12 == 21 || i12 == 27 || i12 == 28 || i12 == 30 || i12 == 35) {
                        org.telegram.messenger.g0.g(j0Var.k1());
                        j0Var.dismiss();
                        return;
                    }
                    if (org.telegram.messenger.m10.i(j0Var.a).q() || org.telegram.messenger.np.s1(j0Var.a).D3() || j0Var.J2) {
                        j0Var.dismiss();
                        return;
                    } else {
                        if (e2Var == null) {
                            return;
                        }
                        if (e2Var.getVisibleDialog() != null) {
                            e2Var.getVisibleDialog().dismiss();
                        }
                        e2Var.presentFragment(new PremiumPreviewFragment(0, ug.j0.u1(i12)));
                        j0Var.dismiss();
                        return;
                    }
                }
                org.telegram.messenger.e3 e3Var = j0Var.Y1;
                if (e3Var.b) {
                    if (org.telegram.messenger.m10.i(j0Var.a).q() && wg.q.i()) {
                        wg.h.i(j0Var.W1, j0Var);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, j0Var.J0);
                    alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131747032, null);
                    alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(j0Var.r1() ? 2131747030 : 2131747031, null));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752152, null), new ug.w(j0Var, i10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new r2.j(29));
                    alertDialog$Builder.p();
                    return;
                }
                boolean z11 = e3Var.a;
                if (z11 && e3Var.c == 0) {
                    if (!e3Var.e || !wg.q.i()) {
                        j0Var.i1();
                        return;
                    }
                    j0Var.b2 = true;
                    j0Var.t2.e0 = false;
                    org.telegram.ui.ActionBar.e2 e2Var2 = j0Var.s1;
                    org.telegram.messenger.e3 e3Var2 = j0Var.Y1;
                    wg.o0 o0Var = new wg.o0(e2Var2, e3Var2.h, e3Var2.k);
                    o0Var.show();
                    o0Var.I0 = new di.r9(j0Var, 13);
                    return;
                }
                if (!z11) {
                    int i13 = e3Var.f;
                    if (i13 != 0) {
                        wg.h.g(i13);
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(j0Var.getContext());
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout2.addView(i9Var, c8.ja.c(60.0f, 60));
                frameLayout2.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                frameLayout2.addView(new hi.n5(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), c8.ja.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(j0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout2.addView(imageView, c8.ja.e(24, 24, 17));
                org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(j0Var.getContext());
                i9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                frameLayout2.addView(i9Var2, c8.ja.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout3 = new FrameLayout(j0Var.getContext());
                frameLayout3.addView(frameLayout2, c8.ja.e(-2, 60, 1));
                frameLayout3.setClipChildren(false);
                TextView textView = new TextView(context2);
                textView.setLetterSpacing(0.025f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout3.addView(textView, c8.ja.t(-1, -2, 0, 24, 80, 24, 0));
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(j0Var.a).M0(Long.valueOf(-j0Var.Y1.c));
                t8Var.q(M0);
                i9Var.f(M0, t8Var);
                org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(j0Var.a).M0(Long.valueOf(-j0Var.W1));
                t8Var2.q(M02);
                i9Var2.f(M02, t8Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                alertDialog$Builder2.o(frameLayout3);
                org.telegram.messenger.k5.q("ReplaceBoostChannelDescription", null, 2131746270, new Object[]{M0.title, M02.title}, textView);
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746272, null), new ug.w(j0Var, i11));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new ug.x(0));
                alertDialog$Builder2.p();
                return;
            case 6:
                wg.o0 o0Var2 = (wg.o0) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = o0Var2.T1;
                if (arrayList.isEmpty()) {
                    return;
                }
                wg.b0 b0Var2 = o0Var2.W1;
                if (b0Var2.R) {
                    return;
                }
                b0Var2.setLoading(true);
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                    arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_myBoost.peer)));
                }
                wg.q.a(chat.id, arrayList2, new bi.o1(o0Var2, chat, arrayList2, hashSet, 18), new ug.p1(o0Var2, 3));
                return;
            case 7:
                wg.c1 c1Var = (wg.c1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = c1Var.d2;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    c1Var.j2.remove(l10);
                }
                c1Var.e1();
                c1Var.V1.b(true, hashSet2, new wg.v0(c1Var, 5), null);
                c1Var.p1(true, true);
                c1Var.f1();
                return;
            case 8:
                final wg.c1 c1Var2 = (wg.c1) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(c1Var2.c, c1Var2.J0, (View) view.getParent());
                F.c(R.drawable.profile_discuss, org.telegram.messenger.hd.M0(2131745601, null), new Runnable() { // from class: wg.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    e2 e2Var3 = c1Var2.s1;
                                    if (e2Var3 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        e2Var3.presentFragment(new an(bundle));
                                        break;
                                    } else {
                                        e2 T = LaunchActivity.T();
                                        c2 c2Var = new c2();
                                        c2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new an(bundle2), c2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    e2 e2Var4 = c1Var2.s1;
                                    if (e2Var4 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        e2Var4.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        e2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            c2 c2Var2 = new c2();
                                            c2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), c2Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                F.c(R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131747786, null), new Runnable() { // from class: wg.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    e2 e2Var3 = c1Var2.s1;
                                    if (e2Var3 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        e2Var3.presentFragment(new an(bundle));
                                        break;
                                    } else {
                                        e2 T = LaunchActivity.T();
                                        c2 c2Var = new c2();
                                        c2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new an(bundle2), c2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    e2 e2Var4 = c1Var2.s1;
                                    if (e2Var4 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        e2Var4.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        e2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            c2 c2Var2 = new c2();
                                            c2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), c2Var2);
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
            case 9:
                final xg.f fVar = (xg.f) this.b;
                final yg.a aVar = (yg.a) this.c;
                if (!fVar.d) {
                    ((wg.z) fVar).r.dismiss();
                    return;
                }
                if (aVar.a.R) {
                    return;
                }
                aVar.b(true);
                String str2 = fVar.h;
                org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10() { // from class: xg.e
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj3) {
                        switch (i10) {
                            case 0:
                                aVar.b(false);
                                z zVar = (z) fVar;
                                g0.i3(new o(zVar, 6), 200L);
                                zVar.r.dismiss();
                                break;
                            default:
                                aVar.b(false);
                                f fVar2 = fVar;
                                wg.h.c((TLRPC.TL_error) obj3, fVar2.n, fVar2.c, new c(fVar2, 1));
                                break;
                        }
                    }
                };
                org.telegram.messenger.z10 z10Var2 = new org.telegram.messenger.z10() { // from class: xg.e
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj3) {
                        switch (i11) {
                            case 0:
                                aVar.b(false);
                                z zVar = (z) fVar;
                                g0.i3(new o(zVar, 6), 200L);
                                zVar.r.dismiss();
                                break;
                            default:
                                aVar.b(false);
                                f fVar2 = fVar;
                                wg.h.c((TLRPC.TL_error) obj3, fVar2.n, fVar2.c, new c(fVar2, 1));
                                break;
                        }
                    }
                };
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0);
                TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                tL_payments_applyGiftCode.slug = str2;
                connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(z10Var2, z10Var, i10), 2);
                return;
            case 10:
                yg.g gVar = (yg.g) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                yg.f fVar2 = gVar.w;
                if (fVar2 != null) {
                    wg.y yVar = ((wg.s) fVar2).a;
                    yVar.Y1.remove(chat2);
                    yVar.k1(true, true);
                    return;
                }
                return;
            case 11:
                ((ug.p1) this.b).a((TLRPC.TL_payments_checkedGiftCode) this.c);
                return;
            default:
                ((ug.p1) this.b).a((TLRPC.Chat) this.c);
                return;
        }
    }
}
