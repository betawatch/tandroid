// default package

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ts9 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ts9(tw9 tw9Var, View view) {
        this.a = (byte) 1;
        this.c = tw9Var;
        this.b = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e9  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean booleanValue;
        int i;
        int i2;
        u69 K;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj3;
                vt4 vt4Var = (vt4) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f = iArr[0];
                    Point point = gm.q;
                    int j = Utilities.j((int) ((f / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j2 = Utilities.j((int) ((iArr[1] / ((point.y + gm.m) + gm.n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j3 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j, 0);
                    int j4 = Utilities.j((int) ((view.getHeight() / ((point.y + gm.m) + gm.n)) * bitmap.getHeight()), bitmap.getHeight() - j2, 0);
                    if ((j != 0 || j2 != 0 || j3 != bitmap.getWidth() || j4 != bitmap.getHeight()) && j3 > 0 && j4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j, j2, j3, j4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, cmb.I.o() ? 0.04f : 0.25f);
                gm.h(colorMatrix, cmb.I.o() ? -0.04f : -0.07f);
                Bitmap l = gm.l(bitmap, colorMatrix);
                l.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(cmb.I.o() ? 2.0f : 3.0f);
                gm.h(colorMatrix2, cmb.I.o() ? -0.2f : -0.07f);
                Bitmap l2 = gm.l(bitmap, colorMatrix2);
                l2.setHasAlpha(false);
                bitmap.recycle();
                vt4Var.a(l, l2);
                break;
            case 1:
                tw9 tw9Var = (tw9) obj2;
                View view2 = (View) obj3;
                Bitmap bitmap2 = (Bitmap) obj;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                tw9Var.f = bitmap2;
                Paint paint = new Paint(1);
                tw9Var.n = paint;
                Bitmap bitmap3 = tw9Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                tw9Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                gm.i(colorMatrix3, cmb.I.o() ? 0.05f : 0.25f);
                gm.h(colorMatrix3, cmb.I.o() ? -0.02f : -0.04f);
                tw9Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                tw9Var.r = new Matrix();
                break;
            case 2:
                j3a j3aVar = (j3a) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j5 = j3aVar.U1;
                Runnable runnable = j3aVar.b2;
                if (runnable != null) {
                    runnable.run();
                }
                j3aVar.dismiss();
                nm7.f(z8c.t0).k(nm7.U2, new Object[0]);
                gm.d3(new lo8(user, (byte) 1), 250L);
                oc7.r1(j3aVar.T1).X3.edit().putBoolean("show_gift_for_" + j5, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j5, true).apply();
                break;
            case 3:
                y5a y5aVar = (y5a) obj2;
                y5aVar.Q = ((Long) obj).longValue();
                ((a6a) obj3).q0(y5aVar);
                break;
            case 4:
                ((daa) obj3).h0((TLRPC.TL_attachMenuBot) obj2);
                break;
            case 5:
                oc7 oc7Var = (oc7) obj3;
                xt5 xt5Var = (xt5) obj2;
                d S = LaunchActivity.S();
                if (((Boolean) obj).booleanValue()) {
                    oc7Var.M4(true);
                    if (S != null) {
                        c41.b0(S).P(R.raw.chats_infotip, gm.D2(gm.N2(jb6.M0(2131745308, null), -1, 2, new sq8(S, (byte) 26), null), true)).k(true);
                    }
                    xt5Var.a(Boolean.TRUE);
                    break;
                } else if (S != null) {
                    c41.b0(S).I(R.raw.error, jb6.M0(2131754308, null), jb6.M0(2131754309, null)).j();
                    break;
                }
                break;
            case 6:
                ((nha) obj3).x0((TL_stories.StoryItem) obj2, (a4b) obj);
                break;
            case 7:
                ((wsa) obj3).L1((he) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 8:
                fw4 fw4Var = (fw4) obj2;
                Boolean bool = (Boolean) obj;
                ((wsa) obj3).f2.setLoading(bool.booleanValue());
                if (fw4Var != null && fw4Var.F1 != (booleanValue = bool.booleanValue())) {
                    fw4Var.F1 = booleanValue;
                    fw4Var.B1.h(booleanValue);
                    break;
                }
                break;
            case 9:
                wsa wsaVar = (wsa) obj3;
                String str = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                ssa ssaVar = wsaVar.a2;
                ac[] acVarArr = wsaVar.o2;
                b61 b61Var = wsaVar.f2;
                if (stargiftupgradepreview != null) {
                    ssaVar.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    wsaVar.z2(1, false, null);
                    ssaVar.i(1, jb6.M0(2131750069, null), jb6.a0(null, null, 2131750070, str), null);
                    acVarArr[0].setText(jb6.M0(2131749799, null));
                    acVarArr[1].setText(jb6.M0(2131749796, null));
                    acVarArr[2].setText(jb6.M0(2131749793, null));
                    wsaVar.q2.setVisibility(8);
                    wsaVar.p2.setVisibility(8);
                    b61Var.setFilled(true);
                    b61Var.i(jb6.M0(2131747564, null), false, true);
                    b61Var.g(null, false);
                    b61Var.setOnClickListener(new lpa(wsaVar, (byte) 16));
                    wsaVar.show();
                    break;
                }
                break;
            case 10:
                wsa wsaVar2 = (wsa) obj3;
                yw4[] yw4VarArr = (yw4[]) obj2;
                Long l3 = (Long) obj;
                if (l3.longValue() == -97) {
                    yw4 yw4Var = yw4VarArr[0];
                    TL_stars.TL_starGiftUnique A1 = wsaVar2.A1();
                    if (wsaVar2.E2() != null && A1 != null && !TextUtils.isEmpty(A1.slug)) {
                        long e = z8c.h(wsaVar2.a).e();
                        TextView textView = new TextView(wsaVar2.getContext());
                        textView.setTextSize(1, 13.0f);
                        int i3 = cmb.q5;
                        anb.X(textView, i3, wsaVar2.J0);
                        textView.setGravity(17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new ta6(gm.L(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                        textView.setText(spannableStringBuilder);
                        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                        long[] jArr = new long[1];
                        Runnable[] runnableArr = new Runnable[1];
                        boolean[] zArr = new boolean[1];
                        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                        depositstargift.peer = oc7.r1(wsaVar2.a).i1(e);
                        depositstargift.slug = A1.slug;
                        ConnectionsManager.getInstance(wsaVar2.a).sendRequestTyped(depositstargift, new kc(b4), new w35((Object) wsaVar2, (Object) zArr, (Object) textView, (Object) stargiftdepositpayloadArr, (Object) runnableArr, (Object) jArr, (byte) 5));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar2.J0, wsaVar2.getContext());
                        String M0 = jb6.M0(2131750040, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131750038, null);
                        TLRPC.User f2 = z8c.h(wsaVar2.a).f();
                        LinearLayout linearLayout = new LinearLayout(wsaVar2.getContext());
                        linearLayout.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(wsaVar2.getContext());
                        int L = gm.L(20.0f);
                        int i4 = cmb.i5;
                        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.045f, cmb.v0(i4, wsaVar2.J0)));
                        wmb K2 = anb.K(0.045f, i4);
                        ylb ylbVar = wsaVar2.J0;
                        frameLayout.setBackground(b0);
                        anb.j(frameLayout, b0, K2, null, ylbVar);
                        bf0 bf0Var = new bf0(wsaVar2.getContext());
                        bf0Var.setRoundRadius(gm.L(21.0f));
                        pc0 pc0Var = new pc0((ylb) null);
                        pc0Var.q(f2);
                        bf0Var.f(f2, pc0Var);
                        frameLayout.addView(bf0Var, qoe.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                        TextView textView2 = new TextView(wsaVar2.getContext());
                        ts2.s(textView2, 1, 16.0f);
                        anb.X(textView2, i4, wsaVar2.J0);
                        textView2.setSingleLine();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        textView2.setText(gw3.m(m9c.r(f2), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        frameLayout.addView(textView2, qoe.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                        TextView textView3 = new TextView(wsaVar2.getContext());
                        textView3.setTextSize(1, 14.0f);
                        anb.X(textView3, i3, wsaVar2.J0);
                        textView3.setSingleLine();
                        textView3.setEllipsize(truncateAt);
                        if (f2 != null) {
                            if (!TextUtils.isEmpty(f2.phone)) {
                                textView3.setText(r58.f().e("+" + f2.phone));
                            } else if (m9c.p(f2) != null) {
                                textView3.setText("@" + m9c.p(f2));
                            }
                        }
                        frameLayout.addView(textView3, qoe.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                        linearLayout.addView(frameLayout, qoe.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                        TextView textView4 = new TextView(wsaVar2.getContext());
                        textView4.setTextSize(1, 15.0f);
                        anb.X(textView4, i4, wsaVar2.J0);
                        hg9.p(textView4, 17, null, 2131750041);
                        linearLayout.addView(textView4, qoe.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(wsaVar2.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        wsaVar2.b1(linearLayout2, R.drawable.msg_openprofile, 14, i3, jb6.M0(2131748059, null), true);
                        wsaVar2.b1(linearLayout2, R.drawable.menu_gift, 14, i3, jb6.M0(2131746409, null), false);
                        linearLayout.addView(linearLayout2, qoe.t(-2, -2, 1, 0, 7, 0, 3));
                        linearLayout.addView(textView, qoe.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        alertDialog$Builder.n(linearLayout);
                        heVar.H = (byte) 20;
                        alertDialog$Builder.j(jb6.M0(2131750042, null), new jp1(wsaVar2, e, stargiftdepositpayloadArr, jArr, yw4Var));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        heVar.setOnDismissListener(new dg(zArr, runnableArr, (byte) 15));
                        heVar.show();
                        break;
                    }
                } else if (l3.longValue() != -99 && l3.longValue() != -98) {
                    long longValue = l3.longValue();
                    yw4 yw4Var2 = yw4VarArr[0];
                    TL_stars.TL_starGiftUnique A12 = wsaVar2.A1();
                    if (wsaVar2.E2() != null && A12 != null && !TextUtils.isEmpty(A12.slug)) {
                        he heVar2 = new he(3, wsaVar2.J0, wsaVar2.getContext());
                        heVar2.q(300L);
                        TL_stars.depositStarGift depositstargift2 = new TL_stars.depositStarGift();
                        depositstargift2.peer = oc7.r1(wsaVar2.a).i1(longValue);
                        depositstargift2.slug = A12.slug;
                        ConnectionsManager.getInstance(wsaVar2.a).sendRequestTyped(depositstargift2, new kc((byte) 0), new tm3(wsaVar2, heVar2, yw4Var2, longValue));
                        break;
                    }
                }
                break;
            case 11:
                ((sra) obj2).a((TL_stars.StarGift) obj, true);
                ((ura) obj3).d(true);
                break;
            case 12:
                asa asaVar = (asa) obj3;
                ok okVar = (ok) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                k11 k11Var = asaVar.n;
                if (k11Var != null && okVar == asaVar.s) {
                    k11Var.c(false);
                }
                asaVar.r.remove(okVar);
                if (tL_payments_paymentFormStarGift != null) {
                    asaVar.q.put(okVar, new yra(okVar, tL_payments_paymentFormStarGift));
                    asaVar.a(true);
                    break;
                }
                break;
            case 13:
                ((jac) obj3).a((nk) obj, new nsa((q2a[]) obj2, b2));
                break;
            case 14:
                v7b v7bVar = (v7b) obj3;
                ((bu5) obj2).u();
                v7bVar.h(true);
                a8b a8bVar = v7bVar.a0;
                g8b g8bVar = a8bVar.R1;
                if (g8bVar != null) {
                    g8bVar.a(new HashSet(a8bVar.u1));
                    break;
                }
                break;
            case 15:
                v7b v7bVar2 = (v7b) obj3;
                v7bVar2.a0.A1 = true;
                ((r23[]) obj2)[0].dismiss();
                v7bVar2.h(true);
                break;
            case 16:
                v8b v8bVar = (v8b) obj3;
                qac qacVar = (qac) obj2;
                Integer num = (Integer) obj;
                v9b v9bVar = v8bVar.a;
                boolean p0 = v9bVar.p0();
                int i5 = v9bVar.c;
                if (p0) {
                    try {
                        v9bVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                v9bVar.Q1 = false;
                ex8 ex8Var = v9bVar.D0;
                if (ex8Var != null) {
                    ex8Var.f(false);
                }
                if (v9bVar.H1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(v9bVar.H1.getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused2) {
                            i2 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            g6b m = g6b.m(v9bVar.H1, r8);
                            m.J0 = v9bVar.w0;
                            m.K0 = v9bVar.x0;
                            if (v9bVar.B0.i()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i = -1;
                    }
                    int i6 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i > i2) {
                            i6 = nm7.s4;
                        }
                    } else if (i2 > i && i6 != 0) {
                        i6 = 0;
                    }
                    g6b m2 = g6b.m(v9bVar.H1, i6);
                    m2.J0 = v9bVar.w0;
                    m2.K0 = v9bVar.x0;
                    if (v9bVar.B0.i()) {
                        v9bVar.L1 = m2;
                        c8b.a(i5, m2);
                        v9bVar.M1 = false;
                        if (qacVar != null) {
                            qacVar.a(new t8b(v8bVar, b3));
                            break;
                        } else {
                            v9bVar.I(1, true);
                            break;
                        }
                    } else {
                        v9bVar.H1 = null;
                        if (v9bVar.B0.l(m2)) {
                            g6b a = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
                            v9bVar.L1 = a;
                            c8b.a(i5, a);
                            v9bVar.M1 = false;
                            if (qacVar != null) {
                                qacVar.a(null);
                            }
                        } else if (qacVar != null) {
                            qacVar.a(null);
                        }
                        v9bVar.l0(true);
                        break;
                    }
                }
                break;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                themeActivity.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    gda.r0 = false;
                    gda.x();
                    themeActivity.P0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    r59 r59Var = themeActivity.b;
                    if (r59Var != null && r59Var.H && (K = r59Var.K(themeActivity.N)) != null) {
                        themeActivity.a.t(K, themeActivity.N);
                        break;
                    }
                }
                break;
            case 18:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                b7b b7bVar = (b7b) obj2;
                themeActivity2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    b7bVar.run();
                    break;
                } else {
                    c41.b0(themeActivity2).I(R.raw.error, jb6.M0(2131754308, null), jb6.M0(2131754309, null)).j();
                    break;
                }
            case 19:
                lqb lqbVar = (lqb) obj3;
                gqb gqbVar = (gqb) obj2;
                Float f3 = (Float) obj;
                lqbVar.getClass();
                gqbVar.i = f3.floatValue();
                fqb fqbVar = lqbVar.a;
                if (fqbVar != null) {
                    fqbVar.E0(f3.floatValue(), gqbVar.a);
                    break;
                }
                break;
            case 20:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 21:
                goc gocVar = (goc) obj3;
                c cVar = (c) obj2;
                String str2 = (String) obj;
                gocVar.F0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    pqc pqcVar = new pqc();
                    pqcVar.s = cVar.D();
                    gocVar.presentFragment(pqcVar);
                    break;
                } else if (str2 != null) {
                    c41.b0(gocVar).f0(str2, false);
                    break;
                } else {
                    gocVar.presentFragment(new asc());
                    break;
                }
            case 22:
                pqc pqcVar2 = (pqc) obj3;
                c cVar2 = (c) obj2;
                String str3 = (String) obj;
                pqcVar2.d.setLoading(false);
                if (str3 != null) {
                    c41.b0(pqcVar2).f0(str3, false);
                    break;
                } else {
                    pqcVar2.finishFragment();
                    cVar2.S();
                    break;
                }
            case 23:
                vqc vqcVar = (vqc) obj3;
                d dVar = (d) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    c41.b0(vqcVar).f0(str4, false);
                    break;
                } else {
                    vqcVar.finishFragment();
                    if (dVar instanceof goc) {
                        gm.d3(new sq8(dVar, (byte) 29), 300L);
                        break;
                    }
                }
                break;
            case 24:
                asc ascVar = (asc) obj3;
                String str5 = (String) obj;
                ascVar.getClass();
                ((qac) obj2).a(str5);
                if (str5 == null && !ascVar.r) {
                    if (ascVar.getParentLayout() != null) {
                        for (d dVar2 : ascVar.getParentLayout().getFragmentStack()) {
                            if (dVar2 instanceof goc) {
                                ((goc) dVar2).T0();
                            }
                        }
                    }
                    ascVar.finishFragment();
                    break;
                }
                break;
            case 25:
                ((ksc) obj3).d0((TL_wallet.tonConnectSession) obj2, (qac) obj);
                break;
            case 26:
                uuc uucVar = (uuc) obj3;
                m11 m11Var = (m11) obj;
                ((lg5[]) obj2)[0].finishFragment();
                xt xtVar = uucVar.f;
                if (xtVar != null) {
                    uucVar.finishFragment();
                    xtVar.a(m11Var);
                    break;
                } else {
                    l11.u(uucVar.getParentActivity(), m11Var.c);
                    break;
                }
            default:
                dvc dvcVar = (dvc) obj3;
                dvcVar.getClass();
                gm.c3(new gcc(dvcVar, (cvc) obj2, (Bitmap) obj, (byte) 24));
                break;
        }
    }

    public /* synthetic */ ts9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
