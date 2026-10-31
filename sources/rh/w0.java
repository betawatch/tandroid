package rh;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ w0(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0331, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0333, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0347, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0433  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        String str;
        boolean z10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i11;
        boolean z11;
        int i12;
        a4 a4Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        i3 i3Var;
        String str2;
        int i13 = this.a;
        int i14 = 4;
        int i15 = 7;
        long j10 = 0;
        int i16 = 1;
        e4 e4Var = this.b;
        switch (i13) {
            case 0:
                e4Var.k().Q(R.raw.copy, 36, cd.L0(2131743228, null)).k(false);
                break;
            case 1:
                e4Var.k().Q(R.raw.copy, 36, cd.L0(2131743228, null)).k(false);
                break;
            case 2:
                e4Var.getClass();
                new kg.i1((org.telegram.ui.ActionBar.k2) new kg.q1(e4Var, 9), 12, false).show();
                break;
            case 3:
                if (e4Var.k3 != null) {
                    long j11 = 0;
                    for (int i17 = 0; i17 < e4Var.k3.invoice.prices.size(); i17++) {
                        j11 += e4Var.k3.invoice.prices.get(i17).amount;
                    }
                    Context context = e4Var.getContext();
                    ArrayList arrayList = e4Var.h3;
                    org.telegram.ui.ActionBar.p6 p6Var = e4Var.I0;
                    a4 a4Var2 = new a4(context, p6Var);
                    a4Var2.S1 = arrayList;
                    float f7 = a4Var2.t0 / org.telegram.messenger.i0.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.star, 0, 0, a4Var2.getContext(), p6Var);
                    a4Var2.T1 = limitPreviewView;
                    float f10 = 14.0f;
                    limitPreviewView.setTranslationY(-org.telegram.messenger.i0.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s10 = w7.b6.s(-1, -2, 17, f7, 20.0f, f7, 10.0f);
                    LinearLayout linearLayout = a4Var2.P1;
                    linearLayout.addView(limitPreviewView, s10);
                    a4Var2.d1(j11);
                    int i18 = org.telegram.ui.ActionBar.t6.G6;
                    TextView b10 = w7.g6.b(context, 20.0f, i18, true, null);
                    org.telegram.messenger.m5.l(b10, 17, null, 2131749877);
                    a4Var2.setTitle(cd.L0(2131749877, null));
                    linearLayout.addView(b10, w7.b6.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b11 = w7.g6.b(context, 14.0f, i18, false, null);
                    org.telegram.messenger.m5.l(b11, 17, null, 2131749878);
                    linearLayout.addView(b11, w7.b6.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(a4Var2.a).getCurrentTime();
                    wy0 wy0Var = new wy0(context, p6Var);
                    int i19 = 0;
                    boolean z12 = false;
                    while (true) {
                        float f11 = f10;
                        if (i19 >= arrayList.size()) {
                            if (!z12) {
                                int size = arrayList.size();
                                int i20 = 0;
                                while (i20 < size) {
                                    Object obj = arrayList.get(i20);
                                    i20++;
                                    TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                                    Date date = new Date(starGiftUpgradePrice2.date * 1000);
                                    wy0Var.c(cd.D0().o0().format(date) + ", " + cd.D0().p0().format(date), h8.Z0(false, i0.a.k((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                    linearLayout = linearLayout;
                                }
                            }
                            LinearLayout linearLayout2 = linearLayout;
                            float f12 = f7 + f11;
                            linearLayout2.addView(wy0Var, w7.b6.s(-1, -2, 7, f12, 16.0f, f12, 15.0f));
                            TextView b12 = w7.g6.b(context, 12.0f, org.telegram.ui.ActionBar.t6.y6, false, null);
                            org.telegram.messenger.m5.l(b12, 17, null, 2131749880);
                            linearLayout2.addView(b12, w7.b6.t(-1, -2, 17, 32, 0, 32, 15));
                            float f13 = a4Var2.t0 / org.telegram.messenger.i0.p;
                            FrameLayout frameLayout = new FrameLayout(a4Var2.getContext());
                            a4Var2.Q1 = frameLayout;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout, a4Var2.I0);
                            View view = new View(a4Var2.getContext());
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, a4Var2.I0);
                            a4Var2.Q1.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 55));
                            vh.d dVar = new vh.d(a4Var2.getContext(), a4Var2.I0, true);
                            a4Var2.R1 = dVar;
                            float f14 = f13 + 16.0f;
                            a4Var2.Q1.addView(dVar, w7.b6.d(-1, 48.0f, zs.E1, f14, 16.0f, f14, 16.0f));
                            a4Var2.b.addView(a4Var2.Q1, w7.b6.e(-1, -2, 87));
                            tk0 tk0Var = a4Var2.k1;
                            tk0Var.setPadding(tk0Var.getPaddingLeft(), tk0Var.getPaddingTop(), tk0Var.getPaddingRight(), org.telegram.messenger.i0.L(80.0f) + tk0Var.getPaddingBottom());
                            a4Var2.R1.i(e4.g2(cd.L0(2131743913, null)), false, true);
                            a4Var2.R1.setOnClickListener(new s(a4Var2, 7));
                            e4Var.i2 = a4Var2;
                            a4Var2.show();
                            break;
                        } else {
                            if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i19)).date || ((i10 = i19 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                                Date date2 = new Date(r8.date * 1000);
                                wy0Var.c(cd.D0().o0().format(date2) + ", " + cd.D0().p0().format(date2), h8.Z0(false, i0.a.k((int) r8.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                                z12 = true;
                            }
                            i19++;
                            f10 = f11;
                        }
                    }
                }
                break;
            case 4:
                e4Var.dismiss();
                break;
            case 5:
                new e30(e4Var.getContext()).show();
                break;
            case 6:
                e4.d1(e4Var);
                break;
            case 7:
                e4.e1(e4Var);
                break;
            case 8:
                Bundle bundle = new Bundle();
                long j12 = e4Var.P1;
                if (j12 >= 0) {
                    bundle.putLong("user_id", j12);
                } else {
                    bundle.putLong("chat_id", -j12);
                }
                if (j12 == d20.i(e4Var.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bundle.putBoolean("open_gifts", true);
                bundle.putBoolean("open_gifts_upgradable", true);
                e4.c2(new ProfileActivity(bundle, null));
                break;
            case 9:
                e4Var.c2.setLoading(false);
                e4Var.s2(0, true, null);
                break;
            case 10:
                new e30(e4Var.getContext()).show();
                break;
            case 11:
                dq[] dqVarArr = e4Var.l3;
                vh.d dVar2 = e4Var.c2;
                if (e4Var.T2.b == 1 && !e4Var.I) {
                    TL_stars.InputSavedStarGift B1 = e4Var.B1();
                    jj jjVar = e4Var.z2;
                    if (jjVar != null) {
                        TLRPC.MessageAction messageAction = jjVar.k.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            long j13 = tL_messageActionStarGift.upgrade_stars;
                            str = tL_messageActionStarGift.prepaid_upgrade_hash;
                            if (j13 <= 0) {
                                break;
                            }
                            z10 = false;
                        }
                    } else {
                        TL_stars.SavedStarGift savedStarGift = e4Var.x2;
                        if (savedStarGift != null) {
                            long j14 = savedStarGift.upgrade_stars;
                            str = savedStarGift.prepaid_upgrade_hash;
                            if (j14 <= 0) {
                                break;
                            }
                            z10 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(e4Var.a).getCurrentTime();
                    if (e4Var.i3 != null) {
                        for (int i21 = 0; i21 < e4Var.i3.size(); i21++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) e4Var.i3.get(i21);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i11 = i21;
                                if (e4Var.k3 != null) {
                                    for (int i22 = 0; i22 < e4Var.k3.invoice.prices.size(); i22++) {
                                        j10 += e4Var.k3.invoice.prices.get(i22).amount;
                                    }
                                }
                                long j15 = j10;
                                if (i11 > 0 || e4Var.j3) {
                                    z11 = z10;
                                    i12 = currentTime2;
                                } else {
                                    e4Var.j3 = true;
                                    if (e4Var.i3 != null) {
                                        for (int i23 = 0; i23 < i11; i23++) {
                                            e4Var.i3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str)) {
                                        z11 = z10;
                                        i12 = currentTime2;
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = e4Var.o2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                                        z11 = z10;
                                        i12 = currentTime2;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = vp.r1(e4Var.a).i1(e4Var.P1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    }
                                    JSONObject u10 = xh.m2.u(e4Var.I0, false);
                                    if (u10 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u10.toString();
                                        tL_payments_getPaymentForm.flags |= 1;
                                    }
                                    ConnectionsManager.getInstance(e4Var.a).sendRequest(tL_payments_getPaymentForm, new f2(e4Var, i16));
                                }
                                if (z11) {
                                    dVar2.i(h8.T0(cd.a0(null, null, 2131749886, Long.valueOf(j15)), 1.13f, dqVarArr), true, true);
                                } else {
                                    dVar2.i(h8.T0(cd.a0(null, null, 2131750076, Long.valueOf(j15)), 1.13f, dqVarArr), true, true);
                                }
                                a4Var = e4Var.i2;
                                if (a4Var != null) {
                                    a4Var.d1(j15);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i24 = starGiftUpgradePrice.date - i12;
                                    String g02 = i24 < 86400 ? org.telegram.messenger.i0.g0(i24, false, true) : cd.G(Math.round(i24 / 86400.0f), "Days", new Object[0]);
                                    org.telegram.ui.Components.e6 e6Var = dVar2.e;
                                    e6Var.D = false;
                                    e6Var.E = true;
                                    e6Var.F = true;
                                    e6Var.G = false;
                                    e6Var.H = false;
                                    dVar2.g(cd.a0(null, null, 2131749885, g02), true);
                                    org.telegram.messenger.i0.h3(e4Var.m3, 1000L);
                                    break;
                                } else {
                                    dVar2.g(null, true);
                                    break;
                                }
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    i11 = -1;
                    if (e4Var.k3 != null) {
                    }
                    long j152 = j10;
                    if (i11 > 0) {
                    }
                    z11 = z10;
                    i12 = currentTime2;
                    if (z11) {
                    }
                    a4Var = e4Var.i2;
                    if (a4Var != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 12:
                e4Var.onBackPressed();
                break;
            case 13:
                TL_stars.SavedStarGift savedStarGift2 = e4Var.x2;
                if (savedStarGift2.unsaved) {
                    savedStarGift2.unsaved = false;
                    u5 F = e6.y(e4Var.a, false).F(e4Var.P1, false);
                    if (F != null) {
                        TL_stars.SavedStarGift savedStarGift3 = e4Var.x2;
                        F.m(savedStarGift3, savedStarGift3.unsaved);
                    }
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = e4Var.B1();
                    savestargift.unsave = e4Var.x2.unsaved;
                    ConnectionsManager.getInstance(e4Var.a).sendRequest(savestargift, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift4 = e4Var.x2;
                boolean z13 = savedStarGift4.pinned_to_top;
                if (((v5) e4Var.y2).o(savedStarGift4, !z13, false)) {
                    new ph.i2(e4Var.getContext(), e4Var.P1, e4Var.x2, e4Var.I0, new org.telegram.ui.ActionBar.d2(e4Var, i16)).show();
                    break;
                } else if (z13) {
                    org.telegram.messenger.m5.n(null, 2131749889, e4Var.k(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    e4Var.k().I(R.raw.ic_pin, cd.L0(2131750085, null), cd.L0(2131750086, null)).j();
                    break;
                }
            case 14:
                long x12 = e4Var.x1();
                if (x12 != 0) {
                    e4Var.U1(x12);
                    break;
                }
                break;
            case 15:
                e4 e4Var2 = this.b;
                TL_stars.InputSavedStarGift B12 = e4Var2.B1();
                if (B12 != null) {
                    long e = d20.i(e4Var2.a).e();
                    jj jjVar2 = e4Var2.z2;
                    if (jjVar2 != null && (message = jjVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction2).peer;
                            if (peer != null) {
                                e = org.telegram.messenger.o5.o(peer);
                            }
                            long j16 = e;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e4Var2.getContext(), e4Var2.I0);
                            String L0 = cd.L0(2131750227, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = cd.L0(2131750226, null);
                            alertDialog$Builder.k(cd.L0(2131751599, null), new org.telegram.messenger.voip.d0(e4Var2, B12, j16, 8));
                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                            alertDialog$Builder.d(-1);
                            alertDialog$Builder.p();
                            break;
                        }
                    }
                    if (e4Var2.x2 != null) {
                        e = e4Var2.P1;
                        long j162 = e;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, e4Var2.getContext(), e4Var2.I0);
                        String L02 = cd.L0(2131750227, null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = L02;
                        x1Var2.T = cd.L0(2131750226, null);
                        alertDialog$Builder2.k(cd.L0(2131751599, null), new org.telegram.messenger.voip.d0(e4Var2, B12, j162, 8));
                        alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                        alertDialog$Builder2.d(-1);
                        alertDialog$Builder2.p();
                    }
                }
                break;
            case 16:
                e4Var.T1(true);
                break;
            case 17:
                TL_stars.TL_starGiftUnique H1 = e4Var.H1();
                if (H1 != null) {
                    h8.h1(e4Var.getContext(), e4Var.a, H1, new d2(e4Var, H1, 2), e4Var.I0);
                    break;
                }
                break;
            case 18:
                e4Var.O1();
                break;
            case 19:
                TL_stars.TL_starGiftUnique H12 = e4Var.H1();
                new b0(e4Var.getContext(), e4Var.a, org.telegram.messenger.o5.o(H12.owner_id), H12, e4Var.I0, new w0(e4Var, i14)).show();
                break;
            case 20:
                e4Var.dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                TL_stars.TL_starGiftUnique H13 = e4Var.H1();
                if (T != null && H13 != null) {
                    ay ayVar = new ay(org.telegram.ui.Cells.f1.j(4, "onlySelect", "dialogsType", true));
                    ayVar.C2 = new q5.a(e4Var, H13, ayVar, i16);
                    T.presentFragment(ayVar);
                    break;
                }
                break;
            case 21:
                e4Var.W1();
                break;
            case 22:
                e4Var.b2();
                break;
            case 23:
                e4Var.onBackPressed();
                break;
            case 24:
                y3 y3Var = e4Var.X1;
                vh.d dVar3 = e4Var.c2;
                j3 j3Var = e4Var.H2.h;
                ImageReceiver imageReceiver = (j3Var == null || (i3Var = j3Var.c) == null) ? null : ((l3) i3Var).d;
                g9 g9Var = y3Var.d[0];
                if (imageReceiver != null && g9Var != null && g9Var.getImageReceiver() != null) {
                    bi0 B = imageReceiver.B();
                    bi0 B2 = g9Var.getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    } else if (B2 == null && B != null) {
                        imageReceiver.f();
                        g9Var.setImageDrawable(B);
                    }
                }
                y3Var.b.setAlpha(1.0f);
                y3Var.c.setAlpha(0.0f);
                if (!e4Var.j2 || e4Var.R1 == null || e4Var.y2 == null || e4Var.D1() < 0 || e4Var.y2.a(e4Var.D1()) < 0) {
                    dVar3.setFilled(true);
                    dVar3.i(cd.L0(2131747847, null), true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new v0(e4Var, i15));
                    break;
                } else {
                    dVar3.setFilled(false);
                    int a2 = e4Var.y2.a(e4Var.D1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) cd.L0(2131749864, null));
                    Object obj2 = e4Var.y2.get(a2);
                    if ((obj2 instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj2).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(document, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar3.i(spannableStringBuilder, true, true);
                    dVar3.g(null, true);
                    dVar3.setOnClickListener(new i1(e4Var, a2, 0));
                    break;
                }
                break;
            case 25:
                if (e4Var.y1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e4Var.y1().title);
                    sb2.append(" #");
                    str2 = i0.a.k(e4Var.y1().num, ',', sb2);
                } else {
                    str2 = "";
                }
                wb I = e4Var.k().I(R.raw.gift_upgrade, cd.L0(2131749858, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749859, str2)));
                I.j = 5000;
                I.t = true;
                I.j();
                xz xzVar = e4Var.S1;
                if (xzVar != null) {
                    xzVar.c(true);
                    break;
                }
                break;
            default:
                e4Var.k1.v0(((e4) e4Var.L2.d).K2.length - 1);
                break;
        }
    }
}
