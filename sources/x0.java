// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final void b(Object obj) {
        iv1 iv1Var = (iv1) this.c;
        x0 x0Var = (x0) this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        yv1 yv1Var = iv1Var.a;
        if (!booleanValue) {
            c41.b0(yv1Var).I(R.raw.error, jb6.M0(2131754308, null), jb6.M0(2131754309, null)).j();
            return;
        }
        yv1Var.getMessagesController().M4(true);
        c41.b0(yv1Var).P(R.raw.chats_infotip, gm.D2(gm.N2(jb6.M0(2131745308, null), -1, 2, new ru1(iv1Var, (byte) 8), null), true)).k(true);
        x0Var.a(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x048b  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        TLRPC.Document document;
        bvc bvcVar;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i;
        float f;
        kq kqVar;
        mw0 mw0Var;
        yv1 yv1Var;
        ms1 ms1Var;
        int i2;
        byte b = this.a;
        byte b2 = 16;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i3 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                y0 y0Var = (y0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String replace = str5.replace("️", "");
                    int i4 = 0;
                    while (true) {
                        if (i4 < tL_messages_stickerSet.packs.size()) {
                            if (tL_messages_stickerSet.packs.get(i4).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i4).emoticon.replace("️", ""), replace)) {
                                i4++;
                            } else {
                                long longValue = tL_messages_stickerSet.packs.get(i4).documents.get(0).longValue();
                                for (int i5 = 0; i5 < tL_messages_stickerSet.documents.size(); i5++) {
                                    if (tL_messages_stickerSet.documents.get(i5).id == longValue) {
                                        document = tL_messages_stickerSet.documents.get(i5);
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document != null) {
                        y0Var.h.j(gn5.b(document), "24_24", gn5.c(bc4.w(document.thumbs, 24, false, null, false), document), "24_24", gw3.g(str5), null);
                        break;
                    }
                }
                break;
            case 1:
                jc jcVar = (jc) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                dy0 dy0Var = jcVar.c;
                su3 su3Var = jcVar.g2;
                jcVar.l2 = false;
                b61 b61Var = jcVar.j2;
                b61Var.setLoading(false);
                TL_agent.agentProvider agentprovider = jcVar.k2;
                if (agentprovider != null) {
                    b61Var.i(jb6.a0(null, null, 2131754294, agentprovider.title), true, true);
                }
                jcVar.d1();
                if (tL_error == null) {
                    gm.t1(su3Var.d);
                    jcVar.dismiss();
                    ao8 ao8Var = jcVar.X1;
                    if (ao8Var != null) {
                        ao8Var.a(str6);
                        break;
                    }
                } else if ("AGENT_KEY_INVALID".equals(tL_error.text)) {
                    jcVar.c1(true);
                    gm.A3(-6.0f, su3Var, null);
                    break;
                } else if ("AGENT_PROVIDER_UNAVAILABLE".equals(tL_error.text)) {
                    mlb.y(null, 2131754275, new c41(dy0Var, jcVar.J0), null);
                    break;
                } else {
                    boolean equals = "AGENT_NOT_AVAILABLE".equals(tL_error.text);
                    ylb ylbVar = jcVar.J0;
                    if (equals) {
                        mlb.y(null, 2131754280, new c41(dy0Var, ylbVar), null);
                        break;
                    } else {
                        new c41(dy0Var, ylbVar).g0(tL_error, false);
                        break;
                    }
                }
                break;
            case 2:
                o oVar = (o) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                sx sxVar = oVar.L;
                yd[] ydVarArr = oVar.U0;
                if ((!oVar.v0[0].b() || oVar.v0[0].c.F != null) && oVar.M != null) {
                    if (num.intValue() == 1) {
                        wu wuVar = oVar.i0;
                        int L = gm.L(56.0f);
                        oVar.K0 = L;
                        wuVar.setHeight(L);
                        oVar.i0.h(true);
                        break;
                    } else {
                        byte b3 = 2;
                        if (num.intValue() == 2) {
                            boolean e = oVar.v0[0].e();
                            m[] mVarArr = oVar.v0;
                            if (!e) {
                                TLRPC.WebPage webPage = mVarArr[0].c.F;
                                if (webPage != null) {
                                    str4 = webPage.url;
                                }
                            } else if (mVarArr[0].getWebView() != null) {
                                str4 = oVar.v0[0].getWebView().getUrl();
                            }
                            String r = qw0.r(str4);
                            oVar.Y(new tca(oVar.M, null, r, false, r, false, gm.B(oVar.i0.getBackgroundColor()) < 0.721f ? new r63() : null));
                            break;
                        } else if (num.intValue() == 6) {
                            boolean e2 = oVar.v0[0].e();
                            m[] mVarArr2 = oVar.v0;
                            if (!e2) {
                                m mVar = mVarArr2[0];
                                TLRPC.WebPage webPage2 = mVar.c.F;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = mVar;
                                }
                            } else if (mVarArr2[0].getWebView() != null) {
                                str3 = oVar.v0[0].getWebView().getUrl();
                                frameLayout = oVar.v0[0].f;
                            }
                            o.c(str3, oVar.Y, frameLayout, sxVar, null);
                            break;
                        } else {
                            byte b4 = 4;
                            if (num.intValue() == 7) {
                                bh0 bh0Var = new bh0();
                                bh0Var.a = true;
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    S.showAsSheet(new dn0(sxVar != null ? new ut(oVar, b4) : null, new xt(oVar, b3)), bh0Var);
                                    break;
                                }
                            } else {
                                byte b5 = 5;
                                byte b6 = 3;
                                if (num.intValue() == 8) {
                                    bh0 bh0Var2 = new bh0();
                                    bh0Var2.a = true;
                                    d S2 = LaunchActivity.S();
                                    if (S2 != null) {
                                        S2.showAsSheet(new lg5(sxVar != null ? new ut(oVar, b5) : null, new xt(oVar, b6)), bh0Var2);
                                        break;
                                    }
                                } else if (num.intValue() == 9) {
                                    if (oVar.v0[0].getWebView() != null) {
                                        oVar.v0[0].getWebView().goForward();
                                        break;
                                    }
                                } else if (num.intValue() == 3) {
                                    boolean e3 = oVar.v0[0].e();
                                    m[] mVarArr3 = oVar.v0;
                                    if (!e3) {
                                        TLRPC.WebPage webPage3 = mVarArr3[0].c.F;
                                        if (webPage3 != null) {
                                            String str7 = webPage3.url;
                                            TL_iv.Page page = webPage3.cached_page;
                                            if (page != null) {
                                                file = page.local;
                                                str = str7;
                                                str2 = null;
                                            } else {
                                                str = str7;
                                                str2 = null;
                                                file = null;
                                            }
                                        }
                                    } else if (mVarArr3[0].getWebView() != null) {
                                        str = oVar.v0[0].getWebView().getUrl();
                                        str2 = oVar.v0[0].getWebView().getOpenURL();
                                        file = null;
                                    }
                                    Activity activity2 = oVar.M;
                                    if (activity2 != null && !activity2.isFinishing()) {
                                        if (file != null) {
                                            String D = bc4.D(file);
                                            Pattern pattern = al6.a;
                                            gm.s2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", oVar.M, null, true);
                                            break;
                                        } else if (str != null) {
                                            String J0 = gm.J0(str2, true);
                                            String J02 = gm.J0(str, true);
                                            hu huVar = new hu(oVar, str, z3 ? 1 : 0);
                                            iu iuVar = new iu(oVar, J02, J0, z2 ? 1 : 0);
                                            if (!oVar.v0[0].e() || !oc7.r1(oVar.Y).P2(J02) || oc7.r1(oVar.Y).N2(true)) {
                                                huVar.run();
                                                break;
                                            } else {
                                                ik.l0(activity, null, str, true, new lf2(iuVar, huVar, b6));
                                                break;
                                            }
                                        }
                                    }
                                } else if (num.intValue() == 4) {
                                    if (oVar.v0[0].e()) {
                                        d S3 = LaunchActivity.S();
                                        if (S3 != null) {
                                            bh0 bh0Var3 = new bh0();
                                            bh0Var3.a = true;
                                            S3.showAsSheet(new uuc(new xt(oVar, b6)), bh0Var3);
                                            break;
                                        }
                                    } else {
                                        my0 i6 = wi8.i(oVar.M, false, 1, null);
                                        i6.v0 = false;
                                        LinearLayout linearLayout = new LinearLayout(oVar.M);
                                        linearLayout.setPadding(0, 0, 0, gm.L(4.0f));
                                        linearLayout.setOrientation(1);
                                        jf5 jf5Var = new jf5(oVar.M, (ylb) null);
                                        jf5Var.setText(jb6.M0(2131750541, null));
                                        linearLayout.addView(jf5Var, qoe.t(-2, -2, 51, 3, 1, 3, 0));
                                        linearLayout.addView(new cy(oVar, oVar.M), qoe.t(-1, -2, 51, 3, 0, 3, 0));
                                        jf5 jf5Var2 = new jf5(oVar.M, (ylb) null);
                                        jf5Var2.setText(jb6.M0(2131750536, null));
                                        linearLayout.addView(jf5Var2, qoe.t(-2, -2, 51, 3, 4, 3, 2));
                                        int i7 = 0;
                                        while (i7 < b3) {
                                            Activity activity3 = oVar.M;
                                            yd ydVar = new yd((Context) activity3, (byte) (z ? 1 : 0));
                                            int i8 = cmb.h6;
                                            byte b7 = b2;
                                            fg0 f0 = cmb.f0(cmb.w0(null, i8, false), b3, -1);
                                            wmb M = anb.M(i8);
                                            ydVar.setBackground(f0);
                                            anb.j(ydVar, f0, null, M, null);
                                            RadioButton radioButton = new RadioButton(activity3);
                                            ydVar.b = radioButton;
                                            radioButton.setSize(gm.L(20.0f));
                                            anb.O(radioButton, cmb.C5, cmb.D5, null);
                                            boolean z4 = jb6.a0;
                                            ydVar.addView(radioButton, qoe.d(22, 22.0f, (z4 ? 5 : 3) | 48, z4 ? 0 : 22, 13.0f, z4 ? 22 : 0, 0.0f));
                                            TextView textView = new TextView(activity3);
                                            anb.X(textView, cmb.F6, null);
                                            wi8.w(textView, 1, 16.0f, 1, 1);
                                            textView.setSingleLine(true);
                                            textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                                            boolean z5 = jb6.a0;
                                            ydVar.addView(textView, qoe.d(-1, -1.0f, (z5 ? 5 : 3) | 48, z5 ? 17 : 62, 0.0f, z5 ? 62 : 17, 0.0f));
                                            ydVarArr[i7] = ydVar;
                                            if (i7 == 0) {
                                                String M0 = jb6.M0(2131751537, null);
                                                Typeface typeface = Typeface.DEFAULT;
                                                textView.setText(M0);
                                                textView.setTypeface(typeface);
                                                ydVar.setContentDescription(M0);
                                                ydVar.invalidate();
                                            } else if (i7 == 1) {
                                                Typeface typeface2 = Typeface.SERIF;
                                                textView.setText("Serif");
                                                textView.setTypeface(typeface2);
                                                ydVar.setContentDescription("Serif");
                                                ydVar.invalidate();
                                            }
                                            ((RadioButton) ydVarArr[i7].b).a(i7 == oVar.a, false);
                                            ydVarArr[i7].setTag(Integer.valueOf(i7));
                                            ydVarArr[i7].setOnClickListener(new yt(oVar, b4));
                                            linearLayout.addView(ydVarArr[i7], qoe.o(-1, 50));
                                            i7++;
                                            b2 = b7;
                                            b3 = 2;
                                        }
                                        i6.O = linearLayout;
                                        oVar.J = i6;
                                        oVar.Y(i6);
                                        break;
                                    }
                                } else if (num.intValue() != 5) {
                                    if (num.intValue() == 10 && (bvcVar = oVar.v0[0].F) != null && bvcVar.b() != null) {
                                        oVar.e(bvcVar.b(), null, 1);
                                        break;
                                    }
                                } else if (oVar.v0[0].e() && oVar.v0[0].getWebView() != null) {
                                    oVar.v0[0].getWebView().reload();
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                m mVar2 = (m) obj3;
                Activity activity4 = (Activity) obj2;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && mVar2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8.trim());
                    gm.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i9 = 0;
                    while (i3 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i3]), length);
                        i9 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i3]), i9);
                        i3++;
                    }
                    Pattern pattern2 = Utilities.a;
                    try {
                        uri = Uri.parse(str8);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i9 <= 0) && (uri == null || uri.getScheme() == null)) {
                            eb.b(activity4, str8);
                            mw0 webView = mVar2.getWebView();
                            String str9 = ku9.a().b;
                            webView.loadUrl(str9 != null ? str9 + URLEncoder.encode(str8) : null);
                            break;
                        } else {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str8 = l11.x(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            mVar2.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
            case 4:
                gm.c3(new op6((oi0) obj3, (String) obj, (Runnable) obj2, b2));
                break;
            case 5:
                tr0 tr0Var = (tr0) obj3;
                yu0 yu0Var = (yu0) obj2;
                int[] iArr = (int[]) obj;
                tr0Var.getClass();
                boolean z6 = false;
                while (i3 < iArr.length) {
                    if (iArr[i3] == 0) {
                        z6 = true;
                    }
                    i3++;
                }
                tr0Var.d = true;
                tr0Var.e = true;
                tr0Var.j();
                Iterator it = tr0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                yu0Var.a(Boolean.TRUE, Boolean.valueOf(z6));
                break;
            case 6:
                tr0 tr0Var2 = (tr0) obj3;
                mn8 mn8Var = (mn8) obj2;
                int[] iArr2 = (int[]) obj;
                boolean z7 = false;
                while (i3 < iArr2.length) {
                    if (iArr2[i3] == 0) {
                        z7 = true;
                    }
                    i3++;
                }
                tr0Var2.d = z7;
                tr0Var2.e = z7;
                tr0Var2.j();
                Iterator it2 = tr0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (mn8Var != null) {
                    mn8Var.run();
                    break;
                }
                break;
            case 7:
                ((File[]) obj3)[0] = (File) obj;
                ((dt0) obj2).run();
                break;
            case 8:
                ((rx0) obj3).d.E.D((String) obj2, (String) obj, false);
                break;
            case 9:
                xy0 xy0Var = (xy0) obj3;
                wy0 wy0Var = (wy0) obj2;
                d dVar = (d) obj;
                if (dVar != null) {
                    if ((dVar instanceof yv1) && (ms1Var = (yv1Var = (yv1) dVar).a0) != null) {
                        ms1Var.R();
                        yv1Var.a0.K0(true, false, true);
                    }
                    if (dVar.getContext() != null && dVar.getParentActivity() != null) {
                        wx0 wx0Var = new wx0(dVar.getContext(), dVar.getResourceProvider());
                        wx0Var.m0 = dVar.getParentActivity();
                        if (wy0Var != null && wy0Var.a != null) {
                            wx0Var.G0 = true;
                            boolean z8 = wy0Var.o;
                            wx0Var.X = z8;
                            if (z8) {
                                wx0Var.A(wy0Var.r, false);
                            }
                            if (wy0Var.n) {
                                i = wy0Var.q;
                            } else {
                                int i10 = wy0Var.p;
                                if (i10 < 0) {
                                    i10 = cmb.c6;
                                }
                                i = cmb.v0(i10, wx0Var.G);
                            }
                            wx0Var.y(i, wy0Var.n, false);
                            wx0Var.D(wy0Var.s, false);
                            wx0Var.H0 = wy0Var.j;
                            wx0Var.I0 = wy0Var.k;
                            boolean z9 = wy0Var.u;
                            wx0Var.y0 = z9;
                            ox0 ox0Var = wx0Var.E;
                            ox0Var.setIsBackButtonVisible(z9);
                            wx0Var.x.setAllowSwipes(wy0Var.l);
                            gm.L3(wx0Var.Y.getBackButton(), wx0Var.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            yq0 yq0Var = wx0Var.o0;
                            if (yq0Var != null) {
                                boolean z10 = wx0Var.y0;
                                yq0Var.L = z10;
                                yq0Var.M.d(z10);
                                yq0Var.invalidate();
                            }
                            wx0Var.t0 = wy0Var.y;
                            wx0Var.B0 = Boolean.valueOf(wy0Var.B);
                            wx0Var.C0 = wy0Var.C;
                            ws0 ws0Var = wy0Var.K;
                            wx0Var.D0 = ws0Var;
                            if (ws0Var != null) {
                                us0 us0Var = ws0Var.r;
                                SensorManager sensorManager = ws0Var.a;
                                if (ws0Var.l) {
                                    ws0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = ws0Var.b;
                                        if (sensor != null) {
                                            f = 0.721f;
                                            sensorManager.registerListener(ws0Var.n, sensor, ws0.a(ws0Var.c));
                                        } else {
                                            f = 0.721f;
                                        }
                                        Sensor sensor2 = ws0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(ws0Var.p, sensor2, ws0.a(ws0Var.e));
                                        }
                                        Sensor sensor3 = ws0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(us0Var, sensor3, ws0.a(ws0Var.h));
                                        }
                                        Sensor sensor4 = ws0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(us0Var, sensor4, ws0.a(ws0Var.h));
                                        }
                                        Sensor sensor5 = ws0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(ws0Var.t, sensor5, ws0.a(ws0Var.j));
                                        }
                                        kqVar = wy0Var.w;
                                        if (kqVar != null) {
                                            sx0 sx0Var = wx0Var.n0;
                                            int totalHeight = sx0Var.getTotalHeight();
                                            sx0Var.e = kqVar;
                                            xp0[] xp0VarArr = sx0Var.f;
                                            zp0.b(xp0VarArr[0].l, (yp0) kqVar.c, false);
                                            zp0.b(xp0VarArr[1].l, (yp0) kqVar.d, false);
                                            sx0Var.invalidate();
                                            if (totalHeight != sx0Var.getTotalHeight() && sx0Var.r != null) {
                                                int totalHeight2 = sx0Var.getTotalHeight();
                                                Runnable runnable = sx0Var.r;
                                                if (totalHeight < totalHeight2) {
                                                    gm.d3(runnable, 200L);
                                                } else {
                                                    runnable.run();
                                                }
                                            }
                                            int i11 = kqVar.b;
                                            Paint paint = sx0Var.a;
                                            sx0Var.e.b = i11;
                                            paint.setColor(i11);
                                            sx0Var.d.a(i11, true);
                                        }
                                        wx0Var.C(wy0Var.z, false, wy0Var.A);
                                        rwc rwcVar = wy0Var.a;
                                        wx0Var.I = rwcVar == null ? rwcVar.a : z8c.t0;
                                        mw0Var = wy0Var.b;
                                        if (mw0Var == null) {
                                            mw0Var.onResume();
                                            ox0Var.L(wx0Var.I, wy0Var.b, wy0Var.d, wy0Var.f, wy0Var.e);
                                            boolean z11 = wy0Var.t || wy0Var.b.b;
                                            String str10 = wy0Var.x;
                                            ox0Var.e("setState(" + z11 + ", " + str10 + ")");
                                            ox0Var.O = z11;
                                            ox0Var.b = str10;
                                            if (cmb.I.o() != wy0Var.D) {
                                                ox0Var.w();
                                            }
                                        } else {
                                            rwcVar.q = null;
                                            rwcVar.r = 0L;
                                        }
                                        wx0Var.x(dVar, wy0Var.a);
                                        wx0Var.d0 = wy0Var.v;
                                        if (wy0Var.G) {
                                            wx0Var.X0 = true;
                                            wx0Var.j();
                                            cx cxVar = wx0Var.Z0;
                                            String r2 = wx0Var.o() ? wx0Var.x0.e : m9c.r(oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J)));
                                            String str11 = wy0Var.H;
                                            wx0Var.Y0 = str11;
                                            cxVar.a(r2, str11);
                                            cx cxVar2 = wx0Var.Z0;
                                            Paint paint2 = wx0Var.R;
                                            cxVar2.b(gm.B(paint2.getColor()) <= f, false);
                                            wx0Var.Z0.setBackgroundColor(paint2.getColor());
                                            wx0Var.Z0.setVisibility(0);
                                            wx0Var.Z0.setAlpha(1.0f);
                                        }
                                        wx0Var.t(wy0Var.L);
                                        xy0Var.h(xy0Var.x, wy0Var, false);
                                        wx0Var.show();
                                        break;
                                    }
                                }
                            }
                            f = 0.721f;
                            kqVar = wy0Var.w;
                            if (kqVar != null) {
                            }
                            wx0Var.C(wy0Var.z, false, wy0Var.A);
                            rwc rwcVar2 = wy0Var.a;
                            wx0Var.I = rwcVar2 == null ? rwcVar2.a : z8c.t0;
                            mw0Var = wy0Var.b;
                            if (mw0Var == null) {
                            }
                            wx0Var.x(dVar, wy0Var.a);
                            wx0Var.d0 = wy0Var.v;
                            if (wy0Var.G) {
                            }
                            wx0Var.t(wy0Var.L);
                            xy0Var.h(xy0Var.x, wy0Var, false);
                            wx0Var.show();
                        }
                    }
                }
                break;
            case 10:
                cz0 cz0Var = (cz0) obj2;
                ((wy0) obj3).m = (Bitmap) obj;
                cz0Var.d().setDrawingFromOverlay(false);
                cz0Var.release();
                break;
            case 11:
                ez0 ez0Var = (ez0) obj2;
                fz0 fz0Var = (fz0) ((bz0) obj3).q;
                if (((Boolean) obj).booleanValue()) {
                    ez0Var.a(1.0f);
                    if (fz0Var.a.getTabs().isEmpty()) {
                        fz0Var.a(false);
                        break;
                    }
                } else {
                    ez0Var.a(0.0f);
                    break;
                }
                break;
            case 12:
                View view = (View) obj3;
                j51 j51Var = (j51) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                gm.t1(j51Var);
                gm.d3(runnable2, 80L);
                break;
            case 13:
                gd1 gd1Var = (gd1) obj3;
                kd1 kd1Var = (kd1) obj2;
                Boolean bool = (Boolean) obj;
                gd1Var.a.o(bool.booleanValue());
                gd1Var.f(bool.booleanValue() ? kd1Var : null);
                break;
            case 14:
                vh1 vh1Var = (vh1) obj3;
                qac qacVar = (qac) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean startsWith = tL_error2.text.startsWith("FLOOD_WAIT");
                String str12 = tL_error2.text;
                if (startsWith) {
                    vh1Var.f = Utilities.z(str12).intValue();
                } else if (str12.startsWith("BOOSTS_EMPTY")) {
                    vh1Var.b = true;
                }
                vh1Var.a = false;
                qacVar.a(vh1Var);
                break;
            case 15:
                vi1 vi1Var = (vi1) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                vi1Var.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i12 = tL_premium_boostsStatus.level;
                    vi1Var.b = i12;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i12;
                    }
                }
                vi1Var.e1(true);
                b61 b61Var2 = vi1Var.Q;
                if (b61Var2 != null) {
                    b61Var2.setLoading(false);
                    break;
                }
                break;
            case 16:
                mi1 mi1Var = (mi1) obj3;
                fc7 fc7Var = (fc7) obj2;
                View view2 = (View) obj;
                if (view2 instanceof li1) {
                    li1 li1Var = (li1) view2;
                    li1Var.setBackgroundColor(cmb.v0(cmb.c6, mi1Var.a));
                    mi1Var.b.getClass();
                    int R = RecyclerView.R(view2);
                    if (fc7Var != null) {
                        ArrayList arrayList = fc7Var.c;
                        if (R >= 0 && R < arrayList.size()) {
                            li1Var.a((ec7) arrayList.get(R));
                        }
                    }
                    view2.invalidate();
                    break;
                }
                break;
            case 17:
                i46 i46Var = (i46) obj2;
                i46Var.r1((vh1) obj);
                ((ik1) obj3).m0.showDialog(i46Var);
                break;
            case 18:
                yv1 yv1Var2 = (yv1) obj3;
                yv1Var2.getClass();
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = yv1Var2.getMessagesController().i1(yv1Var2.l6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((oz8) obj2).a;
                yv1Var2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ms1 ms1Var2 = yv1Var2.a0;
                if (ms1Var2 != null) {
                    ms1Var2.setFieldText(null);
                    break;
                }
                break;
            case 19:
                yv1 yv1Var3 = (yv1) obj3;
                yv1Var3.getClass();
                y5a b8 = y5a.b((String) obj2, yv1Var3.l6, yv1Var3.F5, yv1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                b8.K = yv1Var3.X6();
                b8.Q = ((Long) obj).longValue();
                b8.R = yv1Var3.k7();
                b8.T = yv1Var3.y5;
                yv1Var3.getSendMessagesHelper().q0(b8);
                yv1Var3.a0.setFieldText("");
                yv1Var3.E7(false);
                break;
            case 20:
                yv1 yv1Var4 = (yv1) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                if (yv1Var4.g4 == 1) {
                    ik.J(yv1Var4.getParentActivity(), yv1Var4.l6, new jf((Object) yv1Var4, (Object) botInlineResult, (Object) l, (byte) 11), yv1Var4.Ba);
                    break;
                } else {
                    yv1Var4.yb(botInlineResult, true, 0, l.longValue());
                    break;
                }
            case 21:
                ((yv1) obj3).Rb = true;
                ((uj1) obj2).run();
                break;
            case 22:
                ((yv1) obj3).P9((cd9[]) obj2, (bu5) obj);
                break;
            case 23:
                yv1 yv1Var5 = (yv1) obj3;
                he[] heVarArr = (he[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                heVarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        ts2.u(null, 2131746890, c41.b0(yv1Var5), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new zg8(yv1Var5.getParentActivity(), yv1Var5.Ba, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 24:
                yv1 yv1Var6 = (yv1) obj3;
                k47 k47Var = (k47) obj2;
                TLRPC.SuggestedPost c = ((v67) obj).c();
                if (k47Var != null && k47Var.k != null) {
                    yv1Var6.getMessagesController().e(k47Var, c);
                    break;
                }
                break;
            case 25:
                oz8 oz8Var = (oz8) obj2;
                String str13 = (String) obj;
                yv1 yv1Var7 = ((nr1) obj3).b;
                if (oz8Var != null) {
                    i2 = ((d) yv1Var7).currentAccount;
                    pz8.f(i2).k(oz8Var.a, str13);
                }
                yv1Var7.f4 = str13;
                yv1Var7.p1.setTitle(str13);
                break;
            case 26:
                k47 k47Var2 = (k47) obj2;
                Long l2 = (Long) obj;
                yv1 yv1Var8 = ((iv1) obj3).a;
                if (yv1Var8.s5()) {
                    y5a b9 = y5a.b(k47Var2.C0(), yv1Var8.l6, yv1Var8.F5, yv1Var8.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b9.K = yv1Var8.X6();
                    b9.W = l2.longValue();
                    yv1Var8.getSendMessagesHelper().q0(b9);
                    break;
                }
                break;
            case 27:
                rc2 rc2Var = (rc2) obj2;
                yv1 yv1Var9 = ((iv1) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i3 < yv1Var9.A0.getChildCount()) {
                        View childAt = yv1Var9.A0.getChildAt(i3);
                        if (childAt instanceof rc2) {
                            rc2 rc2Var2 = (rc2) childAt;
                            if (rc2Var2.getMessageObject() != null && rc2Var2.getMessageObject().o4()) {
                                rc2Var2.K3();
                            }
                        }
                        i3++;
                    }
                    break;
                } else {
                    if (rc2Var.getMessageObject() != null) {
                        rc2Var.getMessageObject().t2 = Boolean.FALSE;
                    }
                    rc2Var.K3();
                    break;
                }
                break;
            case 28:
                b(obj);
                break;
            default:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((iv1) obj3).a.getMessagesController().s(message.id, -1, pg3.n(message.peer_id), (String) obj, true);
                break;
        }
    }
}
