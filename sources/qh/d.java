package qh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.t10;
import org.telegram.messenger.u1;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p51;
import org.telegram.ui.m10;
import ph.x1;
import rh.b8;
import rh.e6;
import rh.e8;
import rh.h8;
import rh.q7;
import rh.t7;
import rh.u7;
import rh.x7;
import rh.y7;
import vh.b4;
import vh.d8;
import vh.g1;
import vh.l1;
import vh.n2;
import vh.n5;
import vh.n8;
import vh.o5;
import vh.o8;
import vh.r5;
import vh.s7;
import vh.s8;
import vh.t5;
import xh.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e8, code lost:
    
        if (r0.equals("audio/mpeg") == false) goto L16;
     */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z10;
        q20 q20Var;
        String str;
        String upperCase;
        int i10 = this.a;
        char c10 = ' ';
        int i11 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                e eVar = (e) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList = eVar.e;
                eVar.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    eVar.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        eVar.b.serializeToStream(serializedData);
                        vp.r1(eVar.a).f7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        z10 = true;
                        f8.g(e, true);
                    }
                }
                z10 = true;
                eVar.d = shareThemeBackdrops != null ? z10 : false;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    ((Runnable) obj4).run();
                }
                break;
            case 1:
                rh.i.d0((rh.i) obj3, (ArrayList) obj);
                break;
            case 2:
                rh.h hVar = (rh.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = hVar.b;
                int size2 = arrayList4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj5 = arrayList4.get(i13);
                    i13++;
                    int i14 = b8.b;
                    a51 K = a51.K(b8.class);
                    K.G = (TL_stars.StarsTransaction) obj5;
                    K.q = true;
                    arrayList3.add(K);
                }
                if (hVar.h) {
                    arrayList3.add(a51.e(-1, cd.L0(2131746069, null)));
                    break;
                } else if (!hVar.f) {
                    for (int i15 = 0; i15 < 3; i15++) {
                        arrayList3.add(a51.q(i15, 7));
                    }
                    break;
                }
                break;
            case 3:
                e30 e30Var = (e30) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(a51.k(e30Var.Q1));
                arrayList5.add(rh.u.i(cd.L0(2131750868, null), cd.L0(2131750869, null), R.drawable.msg_gift_premium));
                arrayList5.add(rh.u.i(cd.L0(2131750866, null), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131750867, null), new x1(e30Var, 9)), true), R.drawable.msg_bot));
                arrayList5.add(rh.u.i(cd.L0(2131750864, null), cd.L0(2131750865, null), R.drawable.menu_unlock));
                arrayList5.add(rh.u.i(cd.L0(2131750862, null), cd.L0(2131750863, null), R.drawable.menu_feature_paid));
                arrayList5.add(a51.D(org.telegram.messenger.i0.L(68.0f)));
                break;
            case 4:
                ArrayList arrayList6 = (ArrayList) obj;
                a51 a51Var = ((rh.b0) obj3).o2;
                if (a51Var != null) {
                    arrayList6.add(a51Var);
                    break;
                }
                break;
            case 5:
                rh.t0 t0Var = (rh.t0) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = t0Var.V1;
                boolean z11 = t0Var.m2;
                com.google.android.gms.common.api.internal.r rVar = t0Var.Y1;
                ArrayList arrayList9 = t0Var.T1;
                ArrayList arrayList10 = t0Var.S1;
                com.google.android.gms.common.api.internal.r rVar2 = t0Var.X1;
                com.google.android.gms.common.api.internal.r rVar3 = t0Var.W1;
                ArrayList arrayList11 = t0Var.U1;
                if (arrayList11 != null && arrayList10 != null && arrayList9 != null) {
                    arrayList7.add(a51.D(org.telegram.messenger.i0.L(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i16 = t0Var.b2.s;
                    if (i16 == 0) {
                        arrayList7.add(a51.g(org.telegram.messenger.i0.W2(cd.H(',', z11 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList11.size()))));
                        int size3 = arrayList11.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj6 = arrayList11.get(i17);
                            i17++;
                            arrayList7.add(rh.p0.i(i16, new rh.o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj6)));
                        }
                        if (!arrayList8.isEmpty()) {
                            arrayList7.add(a51.g(org.telegram.messenger.i0.W2(cd.H(',', z11 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList11.size()))));
                            int size4 = arrayList8.size();
                            int i18 = 0;
                            while (i18 < size4) {
                                Object obj7 = arrayList8.get(i18);
                                i18++;
                                arrayList7.add(rh.p0.i(i16, new rh.o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj7)));
                            }
                            break;
                        }
                    } else if (i16 == 1) {
                        arrayList7.add(a51.g(org.telegram.messenger.i0.W2(cd.H(',', "GiftPreviewCountBackdrops", arrayList10.size()))));
                        int size5 = arrayList10.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            Object obj8 = arrayList10.get(i19);
                            i19++;
                            arrayList7.add(rh.p0.i(i16, new rh.o0((TL_stars.starGiftAttributeBackdrop) obj8, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i16 == 2) {
                        arrayList7.add(a51.g(org.telegram.messenger.i0.W2(cd.H(',', "GiftPreviewCountSymbols", arrayList9.size()))));
                        int size6 = arrayList9.size();
                        int i20 = 0;
                        while (i20 < size6) {
                            Object obj9 = arrayList9.get(i20);
                            i20++;
                            arrayList7.add(rh.p0.i(i16, new rh.o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj9, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 6:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    long j10 = wallettransaction.fee;
                    if (j10 > 0) {
                        textView.setText(cd.V(null, null, 2131743098, org.telegram.ui.Wallet.k0.s(j10, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 7:
                j20 j20Var = (j20) obj3;
                Long l4 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (j20Var != null) {
                    j20Var.a(l4, bool);
                    break;
                }
                break;
            case 8:
                ((h8) obj3).J0((ArrayList) obj, (p51) obj2);
                break;
            case 9:
                t7 t7Var = (t7) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                arrayList12.add(a51.k(t7Var.P1));
                arrayList12.add(a51.u(cd.L0(2131744239, null)));
                ArrayList u10 = e6.y(t7Var.a, false).u();
                if (u10 == null || u10.isEmpty()) {
                    arrayList12.add(a51.p(31));
                    arrayList12.add(a51.p(31));
                    arrayList12.add(a51.p(31));
                } else {
                    int i21 = 1;
                    int i22 = 0;
                    for (int i23 = 0; i23 < u10.size(); i23++) {
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i23);
                        if (t7Var.U1 || !tL_starsGiftOption.extended) {
                            int i24 = i21 + 1;
                            int i25 = u7.b;
                            a51 K2 = a51.K(u7.class);
                            K2.d = i23;
                            K2.z = i21;
                            long j11 = tL_starsGiftOption.stars;
                            K2.B = j11;
                            K2.l = cd.H(' ', "StarsCount", (int) j11);
                            K2.m = tL_starsGiftOption.loadingStorePrice ? null : u1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                            K2.G = tL_starsGiftOption;
                            arrayList12.add(K2);
                            i21 = i24;
                        } else {
                            i22++;
                        }
                    }
                    boolean z12 = t7Var.U1;
                    if (!z12 && i22 > 0) {
                        String L0 = cd.L0(z12 ? 2131747861 : 2131747852, null);
                        boolean z13 = !t7Var.U1;
                        int i26 = q7.b;
                        a51 K3 = a51.K(q7.class);
                        K3.d = -1;
                        K3.l = L0;
                        K3.f = z13;
                        K3.q = true;
                        arrayList12.add(K3);
                    }
                }
                arrayList12.add(a51.k(t7Var.Q1));
                break;
            case 10:
                x7 x7Var = (x7) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                long j12 = x7Var.P1;
                m10 m10Var = x7Var.Q1;
                arrayList13.add(a51.m(m10Var));
                boolean z14 = x7Var.V1;
                if (z14) {
                    arrayList13.add(a51.u(cd.L0(2131744239, null)));
                }
                ArrayList z15 = e6.y(x7Var.a, false).z();
                if (z14) {
                    if (z15 == null || z15.isEmpty()) {
                        arrayList13.add(a51.p(31));
                        arrayList13.add(a51.p(31));
                        arrayList13.add(a51.p(31));
                    } else {
                        int i27 = 0;
                        int i28 = 0;
                        boolean z16 = false;
                        int i29 = 1;
                        for (int i30 = 0; i30 < z15.size(); i30++) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z15.get(i30);
                            if (tL_starsTopupOption.stars >= j12) {
                                if (tL_starsTopupOption.extended && !x7Var.X1 && z16) {
                                    i28++;
                                } else {
                                    arrayList13.add(u7.i(i30, i29, tL_starsTopupOption));
                                    i27++;
                                    i29++;
                                    z16 = true;
                                }
                            }
                        }
                        if (i27 < 3) {
                            arrayList13.clear();
                            arrayList13.add(a51.k(m10Var));
                            arrayList13.add(a51.u(cd.L0(2131744239, null)));
                            int i31 = 0;
                            for (int i32 = 0; i32 < z15.size(); i32++) {
                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z15.get(i32);
                                if (tL_starsTopupOption2.stars >= j12) {
                                    arrayList13.add(u7.i(i32, i29, tL_starsTopupOption2));
                                    i31++;
                                    i29++;
                                }
                            }
                            if (i31 == 0) {
                                int i33 = i29;
                                int i34 = 0;
                                while (i34 < z15.size()) {
                                    arrayList13.add(u7.i(i34, i33, (TL_stars.TL_starsTopupOption) z15.get(i34)));
                                    i34++;
                                    i33++;
                                }
                                boolean z17 = x7Var.X1;
                                if (!z17 && i28 > 0) {
                                    String L02 = cd.L0(z17 ? 2131747861 : 2131747852, null);
                                    boolean z18 = !x7Var.X1;
                                    int i35 = q7.b;
                                    a51 K4 = a51.K(q7.class);
                                    K4.d = -1;
                                    K4.l = L02;
                                    K4.f = z18;
                                    K4.q = true;
                                    arrayList13.add(K4);
                                }
                            } else {
                                x7Var.X1 = true;
                            }
                        } else if (i27 > 0) {
                            boolean z19 = x7Var.X1;
                            if (!z19 && i28 > 0) {
                                String L03 = cd.L0(z19 ? 2131747861 : 2131747852, null);
                                boolean z20 = !x7Var.X1;
                                int i36 = q7.b;
                                a51 K5 = a51.K(q7.class);
                                K5.d = -1;
                                K5.l = L03;
                                K5.f = z20;
                                K5.q = true;
                                arrayList13.add(K5);
                            }
                        } else {
                            int i37 = i29;
                            int i38 = 0;
                            while (i38 < z15.size()) {
                                arrayList13.add(u7.i(i38, i37, (TL_stars.TL_starsTopupOption) z15.get(i38)));
                                i38++;
                                i37++;
                            }
                        }
                    }
                }
                arrayList13.add(a51.k(x7Var.R1));
                break;
            case 11:
                y7 y7Var = (y7) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(a51.u(cd.L0(2131744239, null)));
                ArrayList z21 = e6.y(y7Var.a, false).z();
                if (z21 == null || z21.isEmpty()) {
                    arrayList14.add(a51.p(31));
                    arrayList14.add(a51.p(31));
                    arrayList14.add(a51.p(31));
                    arrayList14.add(a51.p(31));
                    arrayList14.add(a51.p(31));
                } else {
                    int i39 = 0;
                    int i40 = 1;
                    while (i11 < z21.size()) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) z21.get(i11);
                        if (!tL_starsTopupOption3.extended || y7Var.R1) {
                            arrayList14.add(u7.i(i11, i40, tL_starsTopupOption3));
                            i40++;
                        } else {
                            i39++;
                        }
                        i11++;
                    }
                    boolean z22 = y7Var.R1;
                    if (!z22 && i39 > 0) {
                        String L04 = cd.L0(z22 ? 2131747861 : 2131747852, null);
                        boolean z23 = !y7Var.R1;
                        int i41 = q7.b;
                        a51 K6 = a51.K(q7.class);
                        K6.d = -1;
                        K6.l = L04;
                        K6.f = z23;
                        K6.q = true;
                        arrayList14.add(K6);
                    }
                }
                arrayList14.add(a51.k(y7Var.P1));
                break;
            case 12:
                e8 e8Var = (e8) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                int i42 = e8Var.c;
                int i43 = e8Var.d;
                long j13 = e8Var.f;
                if (j13 != 0) {
                    rh.r g10 = rh.r.g(i42);
                    ArrayList arrayList16 = g10.k(j13).a[i43];
                    int size7 = arrayList16.size();
                    while (i11 < size7) {
                        Object obj10 = arrayList16.get(i11);
                        i11++;
                        int i44 = b8.b;
                        a51 K7 = a51.K(b8.class);
                        K7.G = (TL_stars.StarsTransaction) obj10;
                        K7.q = true;
                        arrayList15.add(K7);
                    }
                    if (!g10.k(j13).e[i43]) {
                        arrayList15.add(a51.q(arrayList15.size(), 7));
                        arrayList15.add(a51.q(arrayList15.size(), 7));
                        arrayList15.add(a51.q(arrayList15.size(), 7));
                        break;
                    }
                } else {
                    e6 y3 = e6.y(i42, e8Var.e);
                    ArrayList arrayList17 = y3.q[i43];
                    int size8 = arrayList17.size();
                    int i45 = 0;
                    while (i45 < size8) {
                        Object obj11 = arrayList17.get(i45);
                        i45++;
                        int i46 = b8.b;
                        a51 K8 = a51.K(b8.class);
                        K8.G = (TL_stars.StarsTransaction) obj11;
                        K8.q = false;
                        arrayList15.add(K8);
                    }
                    if (!y3.u[i43]) {
                        arrayList15.add(a51.q(arrayList15.size(), 7));
                        arrayList15.add(a51.q(arrayList15.size(), 7));
                        arrayList15.add(a51.q(arrayList15.size(), 7));
                        break;
                    }
                }
                break;
            case 13:
                sg.o oVar = (sg.o) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = oVar.F;
                t8 t8Var = oVar.e;
                if (t8Var != null && oVar.f != null) {
                    arrayList18.add(a51.j(1, t8Var));
                    arrayList18.add(a51.l(2, oVar.f));
                    int i47 = oVar.X;
                    if (i47 == 1 || i47 == 0 || oVar.a) {
                        while (i11 < arrayList19.size()) {
                            View view = (View) arrayList19.get(i11);
                            arrayList18.add(((Boolean) oVar.G.get(i11)).booleanValue() ? a51.l(i11 + 100, view) : a51.j(i11 + 100, view));
                            i11++;
                        }
                        break;
                    }
                }
                break;
            case 14:
                ArrayList arrayList20 = (ArrayList) obj;
                ((uh.l) obj3).getClass();
                ArrayList n10 = t10.n();
                int size9 = n10.size();
                while (i11 < size9) {
                    Object obj12 = n10.get(i11);
                    i11++;
                    int i48 = uh.j.b;
                    a51 K9 = a51.K(uh.j.class);
                    K9.G = (org.telegram.messenger.m10) obj12;
                    arrayList20.add(K9);
                }
                break;
            case 15:
                vh.k kVar = (vh.k) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = kVar.I;
                RectF rectF = kVar.y0;
                vh.f fVar = kVar.f;
                if (kVar.g()) {
                    if (kVar.G == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-fVar.getEditText().p0, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, kVar.G.getWidth(), kVar.G.getHeight(), zs.e4, 31);
                        rectF.set(0.0f, 1.0f, kVar.G.getWidth(), kVar.G.getHeight() - 1);
                        kVar.h(kVar.P, canvas, rectF, 0.0f, true, (-fVar.getX()) - r0.getPaddingLeft(), ((-fVar.getY()) - r0.getPaddingTop()) - r0.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(zs.v2);
                        canvas.drawBitmap(kVar.G, 0.0f, 0.0f, paint);
                        canvas.restore();
                        canvas.restore();
                        break;
                    }
                } else {
                    Paint c11 = kVar.P.c(1.0f);
                    fVar.getEditText().setHintColor(c11 == null ? -2130706433 : -1);
                    if (c11 == null) {
                        runnable.run();
                        break;
                    } else {
                        mt editText = fVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), zs.e4, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c11);
                        canvas.restore();
                        break;
                    }
                }
            case 16:
                g1 g1Var = (g1) obj3;
                String str2 = (String) obj;
                vh.u1 u1Var = g1Var.r;
                u1Var.i1 = str2;
                u1Var.j1 = ((Integer) obj2).intValue();
                g1Var.c.H(str2);
                break;
            case 17:
                l1 l1Var = (l1) obj3;
                String str3 = (String) obj;
                vh.u1 u1Var2 = l1Var.s;
                u1Var2.i1 = str3;
                u1Var2.j1 = ((Integer) obj2).intValue();
                l1Var.c.D(str3);
                break;
            case 18:
                n2 n2Var = (n2) obj3;
                if (obj != null) {
                    if (n2Var.l1 == null && (obj instanceof ef) && (q20Var = n2Var.m1) != null) {
                        q20Var.a((ef) obj);
                        break;
                    }
                } else {
                    n2Var.getClass();
                    break;
                }
                break;
            case 19:
                b4 b4Var = (b4) obj3;
                b4Var.b0(b4Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 20:
                ((n8) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 21:
                t5 t5Var = (t5) obj3;
                ArrayList arrayList21 = (ArrayList) obj;
                if (t5Var.Z1 || t5Var.Y1 != null) {
                    TLRPC.WebPage webPage = t5Var.Y1;
                    o5 o5Var = new o5(t5Var, 0);
                    int i49 = r5.b;
                    a51 K10 = a51.K(r5.class);
                    K10.G = webPage;
                    K10.D = o5Var;
                    arrayList21.add(K10);
                }
                arrayList21.add(a51.k(t5Var.Q1));
                arrayList21.add(a51.B(1, null));
                a51 i50 = a51.i(2, cd.L0(2131744656, null));
                i50.L(t5Var.e2);
                arrayList21.add(i50);
                if (t5Var.e2) {
                    arrayList21.add(a51.k(t5Var.R1));
                }
                arrayList21.add(a51.B(3, null));
                arrayList21.add(a51.k(t5Var.S1));
                break;
            case 22:
                o8 o8Var = (o8) obj3;
                Float f7 = (Float) obj2;
                long duration = o8Var.X0.getDuration() < 100 ? o8Var.K1.h0 : o8Var.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                n5 n5Var = o8Var.K1;
                float f10 = n5Var.a0;
                float f11 = n5Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j14 = (long) (f12 * f13);
                d8 d8Var = o8Var.X0;
                long j15 = (long) ((f11 * f13) + j14);
                o8Var.M1 = j15;
                d8Var.m(j15);
                s7 s7Var = o8Var.v1;
                if (s7Var != null) {
                    s7Var.setCoverTime(o8Var.M1);
                }
                n5 n5Var2 = o8Var.K1;
                if (n5Var2 != null && n5Var2.g) {
                    n5Var2.j = true;
                    break;
                }
                break;
            case 23:
                ((s8) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 24:
                ((wh.g) obj3).D0((ArrayList) obj, (p51) obj2);
                break;
            case 25:
                wh.f fVar2 = (wh.f) obj3;
                ArrayList arrayList22 = (ArrayList) obj;
                arrayList22.add(a51.k(fVar2.Q1));
                arrayList22.add(a51.k(fVar2.R1));
                break;
            case 26:
                ((xh.i) obj3).G0((ArrayList) obj, (p51) obj2);
                break;
            case 27:
                xh.o.Y((xh.o) obj3, (ArrayList) obj);
                break;
            case 28:
                f6 f6Var = (f6) obj3;
                String str4 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(org.telegram.messenger.i0.i0(l10.longValue(), false, false));
                }
                if (str4 == null) {
                    upperCase = null;
                } else {
                    if (!str4.isEmpty()) {
                        switch (str4.hashCode()) {
                            case -2008589971:
                                if (str4.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str4.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str4.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str4.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str4.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str4.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str4.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str4.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str4.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str4.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str4.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str4.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str4.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str4.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str4.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str4.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str4.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str4.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str4.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str4.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str4.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str4.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str4.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str4.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str4.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str4.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str4.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str4.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str4.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str4.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                break;
                            case 1509238306:
                                if (str4.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str4.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str4.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str4.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str4.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str4.equals("text/javascript")) {
                                    c10 = '\'';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case zs.U /* 31 */:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case '\b':
                                str = "ppt";
                                break;
                            case '\t':
                                str = "docx";
                                break;
                            case '\n':
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case '\f':
                                str = "php";
                                break;
                            case '\r':
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case zs.T /* 30 */:
                                str = "arc";
                                break;
                            case ' ':
                                str = "mp3";
                                break;
                            case '!':
                                str = "rar";
                                break;
                            case '\"':
                                str = "ico";
                                break;
                            case '#':
                                str = "ods";
                                break;
                            case '$':
                                str = "azw";
                                break;
                            case '%':
                                str = "xlsx";
                                break;
                            case '&':
                                str = "jar";
                                break;
                            case '\'':
                                str = "js";
                                break;
                            default:
                                if (str4.contains("/")) {
                                    str4 = str4.substring(str4.indexOf("/") + 1);
                                }
                                if (str4.contains("-")) {
                                    str4 = str4.substring(str4.indexOf("-") + 1);
                                }
                                if (str4.contains("+")) {
                                    str4 = str4.substring(0, str4.indexOf("+"));
                                }
                                str = str4.toLowerCase();
                                break;
                        }
                    } else {
                        str = "";
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(upperCase.toUpperCase());
                }
                if (sb2.length() <= 0) {
                    sb2.append(cd.L0(2131753975, null));
                }
                f6Var.setText(sb2);
                break;
            default:
                c1 c1Var = (c1) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                arrayList23.add(a51.j(-1, c1Var.S1));
                arrayList23.add(a51.C(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752980, c1Var.Q1))));
                break;
        }
    }
}
