// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.Editable;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class y0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050f  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        TLRPC.Document document;
        pxc pxcVar;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i;
        float f;
        lp lpVar;
        nv0 nv0Var;
        zu1 zu1Var;
        nr1 nr1Var;
        int i2;
        byte b = this.a;
        byte b2 = 16;
        byte b3 = 8;
        byte b4 = 2;
        int i3 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                z0 z0Var = (z0) obj3;
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
                        z0Var.h.j(jn5.b(document), "24_24", jn5.c(xb4.w(document.thumbs, 24, false, null, false), document), "24_24", pv3.g(str5), null);
                        break;
                    }
                }
                break;
            case 1:
                o oVar = (o) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                tw twVar = oVar.L;
                zc[] zcVarArr = oVar.U0;
                if ((!oVar.v0[0].b() || oVar.v0[0].c.F != null) && oVar.M != null) {
                    if (num.intValue() == 1) {
                        xt xtVar = oVar.i0;
                        int L = hl.L(56.0f);
                        oVar.K0 = L;
                        xtVar.setHeight(L);
                        oVar.i0.h(true);
                        break;
                    } else if (num.intValue() == 2) {
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
                        String r = rv0.r(str4);
                        oVar.Y(new kea(oVar.M, null, r, false, r, false, hl.B(oVar.i0.getBackgroundColor()) < 0.721f ? new x53() : null));
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
                        o.c(str3, oVar.Y, frameLayout, twVar, null);
                        break;
                    } else if (num.intValue() == 7) {
                        bg0 bg0Var = new bg0();
                        bg0Var.a = true;
                        e S = LaunchActivity.S();
                        if (S != null) {
                            S.showAsSheet(new dm0(twVar != null ? new ys(oVar, b4) : null, new vs(oVar, b4)), bg0Var);
                            break;
                        }
                    } else {
                        byte b5 = 3;
                        if (num.intValue() == 8) {
                            bg0 bg0Var2 = new bg0();
                            bg0Var2.a = true;
                            e S2 = LaunchActivity.S();
                            if (S2 != null) {
                                S2.showAsSheet(new ng5(twVar != null ? new ys(oVar, b5) : null, new vs(oVar, b5)), bg0Var2);
                                break;
                            }
                        } else if (num.intValue() == 9) {
                            if (oVar.v0[0].getWebView() != null) {
                                oVar.v0[0].getWebView().goForward();
                                break;
                            }
                        } else if (num.intValue() != 3) {
                            byte b6 = 4;
                            if (num.intValue() == 4) {
                                if (oVar.v0[0].e()) {
                                    e S3 = LaunchActivity.S();
                                    if (S3 != null) {
                                        bg0 bg0Var3 = new bg0();
                                        bg0Var3.a = true;
                                        S3.showAsSheet(new ixc(new vs(oVar, b5)), bg0Var3);
                                        break;
                                    }
                                } else {
                                    nx0 i6 = ik8.i(oVar.M, false, 1, null);
                                    i6.v0 = false;
                                    LinearLayout linearLayout = new LinearLayout(oVar.M);
                                    linearLayout.setPadding(0, 0, 0, hl.L(4.0f));
                                    linearLayout.setOrientation(1);
                                    mf5 mf5Var = new mf5(oVar.M, (vnb) null);
                                    mf5Var.setText(ob6.M0(2131750569, null));
                                    linearLayout.addView(mf5Var, tre.t(-2, -2, 51, 3, 1, 3, 0));
                                    linearLayout.addView(new cx(oVar, oVar.M), tre.t(-1, -2, 51, 3, 0, 3, 0));
                                    mf5 mf5Var2 = new mf5(oVar.M, (vnb) null);
                                    mf5Var2.setText(ob6.M0(2131750564, null));
                                    linearLayout.addView(mf5Var2, tre.t(-2, -2, 51, 3, 4, 3, 2));
                                    int i7 = 0;
                                    while (i7 < b4) {
                                        Activity activity2 = oVar.M;
                                        zc zcVar = new zc((Context) activity2, (byte) (z ? 1 : 0));
                                        byte b7 = b2;
                                        int i8 = aob.i6;
                                        hf0 f0 = aob.f0(aob.w0(null, i8, false), b4, -1);
                                        uob M = yob.M(i8);
                                        zcVar.setBackground(f0);
                                        yob.j(zcVar, f0, null, M, null);
                                        RadioButton radioButton = new RadioButton(activity2);
                                        zcVar.b = radioButton;
                                        radioButton.setSize(hl.L(20.0f));
                                        yob.O(radioButton, aob.D5, aob.E5, null);
                                        boolean z5 = ob6.a0;
                                        zcVar.addView(radioButton, tre.d(22, 22.0f, (z5 ? 5 : 3) | 48, z5 ? 0 : 22, 13.0f, z5 ? 22 : 0, 0.0f));
                                        TextView textView = new TextView(activity2);
                                        yob.X(textView, aob.G6, null);
                                        ik8.w(textView, 1, 16.0f, 1, 1);
                                        textView.setSingleLine(true);
                                        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                                        boolean z6 = ob6.a0;
                                        zcVar.addView(textView, tre.d(-1, -1.0f, (z6 ? 5 : 3) | 48, z6 ? 17 : 62, 0.0f, z6 ? 62 : 17, 0.0f));
                                        zcVarArr[i7] = zcVar;
                                        if (i7 == 0) {
                                            String M0 = ob6.M0(2131751565, null);
                                            Typeface typeface = Typeface.DEFAULT;
                                            textView.setText(M0);
                                            textView.setTypeface(typeface);
                                            zcVar.setContentDescription(M0);
                                            zcVar.invalidate();
                                        } else if (i7 == 1) {
                                            Typeface typeface2 = Typeface.SERIF;
                                            textView.setText("Serif");
                                            textView.setTypeface(typeface2);
                                            zcVar.setContentDescription("Serif");
                                            zcVar.invalidate();
                                        }
                                        ((RadioButton) zcVarArr[i7].b).a(i7 == oVar.a, false);
                                        zcVarArr[i7].setTag(Integer.valueOf(i7));
                                        zcVarArr[i7].setOnClickListener(new ws(oVar, b6));
                                        linearLayout.addView(zcVarArr[i7], tre.o(-1, 50));
                                        i7++;
                                        b2 = b7;
                                        b4 = 2;
                                    }
                                    i6.O = linearLayout;
                                    oVar.J = i6;
                                    oVar.Y(i6);
                                    break;
                                }
                            } else if (num.intValue() != 5) {
                                if (num.intValue() == 10 && (pxcVar = oVar.v0[0].F) != null && pxcVar.b() != null) {
                                    oVar.e(pxcVar.b(), null, 1);
                                    break;
                                }
                            } else if (oVar.v0[0].e() && oVar.v0[0].getWebView() != null) {
                                oVar.v0[0].getWebView().reload();
                                break;
                            }
                        } else {
                            boolean e3 = oVar.v0[0].e();
                            m[] mVarArr3 = oVar.v0;
                            if (!e3) {
                                TLRPC.WebPage webPage3 = mVarArr3[0].c.F;
                                if (webPage3 != null) {
                                    String str6 = webPage3.url;
                                    TL_iv.Page page = webPage3.cached_page;
                                    if (page != null) {
                                        file = page.local;
                                        str = str6;
                                        str2 = null;
                                    } else {
                                        str = str6;
                                        str2 = null;
                                        file = null;
                                    }
                                }
                            } else if (mVarArr3[0].getWebView() != null) {
                                str = oVar.v0[0].getWebView().getUrl();
                                str2 = oVar.v0[0].getWebView().getOpenURL();
                                file = null;
                            }
                            Activity activity3 = oVar.M;
                            if (activity3 != null && !activity3.isFinishing()) {
                                if (file != null) {
                                    String D = xb4.D(file);
                                    Pattern pattern = cl6.a;
                                    hl.s2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", oVar.M, null, true);
                                    break;
                                } else if (str != null) {
                                    String J0 = hl.J0(str2, true);
                                    String J02 = hl.J0(str, true);
                                    ft ftVar = new ft(oVar, str, z4 ? 1 : 0);
                                    gt gtVar = new gt(oVar, J02, J0, z3 ? 1 : 0);
                                    if (!oVar.v0[0].e() || !uc7.s1(oVar.Y).T2(J02) || uc7.s1(oVar.Y).R2(true)) {
                                        ftVar.run();
                                        break;
                                    } else {
                                        jj.l0(activity, null, str, true, new qe2((Object) gtVar, (Object) ftVar, (byte) (z2 ? 1 : 0)));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                m mVar2 = (m) obj3;
                Activity activity4 = (Activity) obj2;
                String str7 = (String) obj;
                if (!TextUtils.isEmpty(str7) && mVar2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str7.trim());
                    hl.c(spannableStringBuilder, 1, false, true);
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
                        uri = Uri.parse(str7);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i9 <= 0) && (uri == null || uri.getScheme() == null)) {
                            fb.b(activity4, str7);
                            nv0 webView = mVar2.getWebView();
                            String str8 = bw9.a().b;
                            webView.loadUrl(str8 != null ? str8 + URLEncoder.encode(str7) : null);
                            break;
                        } else {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str7 = m01.x(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            mVar2.getWebView().loadUrl(str7);
                            break;
                        }
                    }
                }
                break;
            case 3:
                hl.c3(new es6((ph0) obj3, (String) obj, (Runnable) obj2, b2));
                break;
            case 4:
                tq0 tq0Var = (tq0) obj3;
                yt0 yt0Var = (yt0) obj2;
                int[] iArr = (int[]) obj;
                tq0Var.getClass();
                boolean z7 = false;
                while (i3 < iArr.length) {
                    if (iArr[i3] == 0) {
                        z7 = true;
                    }
                    i3++;
                }
                tq0Var.d = true;
                tq0Var.e = true;
                tq0Var.j();
                Iterator it = tq0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                yt0Var.a(Boolean.TRUE, Boolean.valueOf(z7));
                break;
            case 5:
                tq0 tq0Var2 = (tq0) obj3;
                hp8 hp8Var = (hp8) obj2;
                int[] iArr2 = (int[]) obj;
                boolean z8 = false;
                while (i3 < iArr2.length) {
                    if (iArr2[i3] == 0) {
                        z8 = true;
                    }
                    i3++;
                }
                tq0Var2.d = z8;
                tq0Var2.e = z8;
                tq0Var2.j();
                Iterator it2 = tq0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (hp8Var != null) {
                    hp8Var.run();
                    break;
                }
                break;
            case 6:
                ((File[]) obj3)[0] = (File) obj;
                ((ds0) obj2).run();
                break;
            case 7:
                ((sw0) obj3).d.E.D((String) obj2, (String) obj, false);
                break;
            case 8:
                yx0 yx0Var = (yx0) obj3;
                xx0 xx0Var = (xx0) obj2;
                e eVar = (e) obj;
                if (eVar != null) {
                    if ((eVar instanceof zu1) && (nr1Var = (zu1Var = (zu1) eVar).a0) != null) {
                        nr1Var.U();
                        zu1Var.a0.O0(true, false, true);
                    }
                    if (eVar.getContext() != null && eVar.getParentActivity() != null) {
                        xw0 xw0Var = new xw0(eVar.getContext(), eVar.getResourceProvider());
                        xw0Var.m0 = eVar.getParentActivity();
                        if (xx0Var != null && xx0Var.a != null) {
                            xw0Var.G0 = true;
                            boolean z9 = xx0Var.o;
                            xw0Var.X = z9;
                            if (z9) {
                                xw0Var.A(xx0Var.r, false);
                            }
                            if (xx0Var.n) {
                                i = xx0Var.q;
                            } else {
                                int i10 = xx0Var.p;
                                if (i10 < 0) {
                                    i10 = aob.d6;
                                }
                                i = aob.v0(i10, xw0Var.G);
                            }
                            xw0Var.y(i, xx0Var.n, false);
                            xw0Var.D(xx0Var.s, false);
                            xw0Var.H0 = xx0Var.j;
                            xw0Var.I0 = xx0Var.k;
                            boolean z10 = xx0Var.u;
                            xw0Var.y0 = z10;
                            pw0 pw0Var = xw0Var.E;
                            pw0Var.setIsBackButtonVisible(z10);
                            xw0Var.x.setAllowSwipes(xx0Var.l);
                            hl.L3(xw0Var.Y.getBackButton(), xw0Var.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            yp0 yp0Var = xw0Var.o0;
                            if (yp0Var != null) {
                                boolean z11 = xw0Var.y0;
                                yp0Var.L = z11;
                                yp0Var.M.d(z11);
                                yp0Var.invalidate();
                            }
                            xw0Var.t0 = xx0Var.y;
                            xw0Var.B0 = Boolean.valueOf(xx0Var.B);
                            xw0Var.C0 = xx0Var.C;
                            wr0 wr0Var = xx0Var.K;
                            xw0Var.D0 = wr0Var;
                            if (wr0Var != null) {
                                ur0 ur0Var = wr0Var.r;
                                SensorManager sensorManager = wr0Var.a;
                                if (wr0Var.l) {
                                    wr0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = wr0Var.b;
                                        if (sensor != null) {
                                            f = 0.721f;
                                            sensorManager.registerListener(wr0Var.n, sensor, wr0.a(wr0Var.c));
                                        } else {
                                            f = 0.721f;
                                        }
                                        Sensor sensor2 = wr0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(wr0Var.p, sensor2, wr0.a(wr0Var.e));
                                        }
                                        Sensor sensor3 = wr0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(ur0Var, sensor3, wr0.a(wr0Var.h));
                                        }
                                        Sensor sensor4 = wr0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(ur0Var, sensor4, wr0.a(wr0Var.h));
                                        }
                                        Sensor sensor5 = wr0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(wr0Var.t, sensor5, wr0.a(wr0Var.j));
                                        }
                                        lpVar = xx0Var.w;
                                        if (lpVar != null) {
                                            tw0 tw0Var = xw0Var.n0;
                                            int totalHeight = tw0Var.getTotalHeight();
                                            tw0Var.e = lpVar;
                                            xo0[] xo0VarArr = tw0Var.f;
                                            zo0.b(xo0VarArr[0].l, (yo0) lpVar.c, false);
                                            zo0.b(xo0VarArr[1].l, (yo0) lpVar.d, false);
                                            tw0Var.invalidate();
                                            if (totalHeight != tw0Var.getTotalHeight() && tw0Var.r != null) {
                                                int totalHeight2 = tw0Var.getTotalHeight();
                                                Runnable runnable = tw0Var.r;
                                                if (totalHeight < totalHeight2) {
                                                    hl.d3(runnable, 200L);
                                                } else {
                                                    runnable.run();
                                                }
                                            }
                                            int i11 = lpVar.b;
                                            Paint paint = tw0Var.a;
                                            tw0Var.e.b = i11;
                                            paint.setColor(i11);
                                            tw0Var.d.a(i11, true);
                                        }
                                        xw0Var.C(xx0Var.z, false, xx0Var.A);
                                        gzc gzcVar = xx0Var.a;
                                        xw0Var.I = gzcVar == null ? gzcVar.a : yac.t0;
                                        nv0Var = xx0Var.b;
                                        if (nv0Var == null) {
                                            nv0Var.onResume();
                                            pw0Var.L(xw0Var.I, xx0Var.b, xx0Var.d, xx0Var.f, xx0Var.e);
                                            boolean z12 = xx0Var.t || xx0Var.b.b;
                                            String str9 = xx0Var.x;
                                            pw0Var.e("setState(" + z12 + ", " + str9 + ")");
                                            pw0Var.O = z12;
                                            pw0Var.b = str9;
                                            if (aob.I.o() != xx0Var.D) {
                                                pw0Var.w();
                                            }
                                        } else {
                                            gzcVar.q = null;
                                            gzcVar.r = 0L;
                                        }
                                        xw0Var.x(eVar, xx0Var.a);
                                        xw0Var.d0 = xx0Var.v;
                                        if (xx0Var.G) {
                                            xw0Var.X0 = true;
                                            xw0Var.j();
                                            dw dwVar = xw0Var.Z0;
                                            String r2 = xw0Var.o() ? xw0Var.x0.e : lbc.r(uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J)));
                                            String str10 = xx0Var.H;
                                            xw0Var.Y0 = str10;
                                            dwVar.a(r2, str10);
                                            dw dwVar2 = xw0Var.Z0;
                                            Paint paint2 = xw0Var.R;
                                            dwVar2.b(hl.B(paint2.getColor()) <= f, false);
                                            xw0Var.Z0.setBackgroundColor(paint2.getColor());
                                            xw0Var.Z0.setVisibility(0);
                                            xw0Var.Z0.setAlpha(1.0f);
                                        }
                                        xw0Var.t(xx0Var.L);
                                        yx0Var.h(yx0Var.x, xx0Var, false);
                                        xw0Var.show();
                                        break;
                                    }
                                }
                            }
                            f = 0.721f;
                            lpVar = xx0Var.w;
                            if (lpVar != null) {
                            }
                            xw0Var.C(xx0Var.z, false, xx0Var.A);
                            gzc gzcVar2 = xx0Var.a;
                            xw0Var.I = gzcVar2 == null ? gzcVar2.a : yac.t0;
                            nv0Var = xx0Var.b;
                            if (nv0Var == null) {
                            }
                            xw0Var.x(eVar, xx0Var.a);
                            xw0Var.d0 = xx0Var.v;
                            if (xx0Var.G) {
                            }
                            xw0Var.t(xx0Var.L);
                            yx0Var.h(yx0Var.x, xx0Var, false);
                            xw0Var.show();
                        }
                    }
                }
                break;
            case 9:
                dy0 dy0Var = (dy0) obj2;
                ((xx0) obj3).m = (Bitmap) obj;
                dy0Var.d().setDrawingFromOverlay(false);
                dy0Var.release();
                break;
            case 10:
                fy0 fy0Var = (fy0) obj2;
                gy0 gy0Var = (gy0) ((cy0) obj3).q;
                if (((Boolean) obj).booleanValue()) {
                    fy0Var.a(1.0f);
                    if (gy0Var.a.getTabs().isEmpty()) {
                        gy0Var.a(false);
                        break;
                    }
                } else {
                    fy0Var.a(0.0f);
                    break;
                }
                break;
            case 11:
                View view = (View) obj3;
                k41 k41Var = (k41) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                hl.t1(k41Var);
                hl.d3(runnable2, 80L);
                break;
            case 12:
                gc1 gc1Var = (gc1) obj3;
                kc1 kc1Var = (kc1) obj2;
                Boolean bool = (Boolean) obj;
                gc1Var.a.i(bool.booleanValue());
                gc1Var.f(bool.booleanValue() ? kc1Var : null);
                break;
            case 13:
                wg1 wg1Var = (wg1) obj3;
                pcc pccVar = (pcc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                String str11 = tL_error.text;
                if (startsWith) {
                    wg1Var.f = Utilities.z(str11).intValue();
                } else if (str11.startsWith("BOOSTS_EMPTY")) {
                    wg1Var.b = true;
                }
                wg1Var.a = false;
                pccVar.a(wg1Var);
                break;
            case 14:
                wh1 wh1Var = (wh1) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                wh1Var.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i12 = tL_premium_boostsStatus.level;
                    wh1Var.b = i12;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i12;
                    }
                }
                wh1Var.e1(true);
                c51 c51Var = wh1Var.Q;
                if (c51Var != null) {
                    c51Var.setLoading(false);
                    break;
                }
                break;
            case 15:
                nh1 nh1Var = (nh1) obj3;
                lc7 lc7Var = (lc7) obj2;
                View view2 = (View) obj;
                if (view2 instanceof mh1) {
                    mh1 mh1Var = (mh1) view2;
                    mh1Var.setBackgroundColor(aob.v0(aob.d6, nh1Var.a));
                    nh1Var.b.getClass();
                    int S4 = RecyclerView.S(view2);
                    if (lc7Var != null) {
                        ArrayList arrayList = lc7Var.c;
                        if (S4 >= 0 && S4 < arrayList.size()) {
                            mh1Var.a((kc7) arrayList.get(S4));
                        }
                    }
                    view2.invalidate();
                    break;
                }
                break;
            case 16:
                l46 l46Var = (l46) obj2;
                l46Var.s1((wg1) obj);
                ((ij1) obj3).m0.showDialog(l46Var);
                break;
            case 17:
                zu1 zu1Var2 = (zu1) obj3;
                zu1Var2.getClass();
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = zu1Var2.getMessagesController().j1(zu1Var2.l6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((a19) obj2).a;
                zu1Var2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                nr1 nr1Var2 = zu1Var2.a0;
                if (nr1Var2 != null) {
                    nr1Var2.setFieldText(null);
                    break;
                }
                break;
            case 18:
                zu1 zu1Var3 = (zu1) obj3;
                zu1Var3.getClass();
                p7a b8 = p7a.b((String) obj2, zu1Var3.l6, zu1Var3.F5, zu1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                b8.K = zu1Var3.X6();
                b8.Q = ((Long) obj).longValue();
                b8.R = zu1Var3.k7();
                b8.T = zu1Var3.y5;
                zu1Var3.getSendMessagesHelper().q0(b8);
                zu1Var3.a0.setFieldText("");
                zu1Var3.E7(false);
                break;
            case 19:
                zu1 zu1Var4 = (zu1) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                if (zu1Var4.g4 == 1) {
                    jj.J(zu1Var4.getParentActivity(), zu1Var4.l6, new ie((Object) zu1Var4, (Object) botInlineResult, (Object) l, (byte) 12), zu1Var4.Ba);
                    break;
                } else {
                    zu1Var4.zb(botInlineResult, true, 0, l.longValue());
                    break;
                }
            case 20:
                ((zu1) obj3).Q9((qe9[]) obj2, (fu5) obj);
                break;
            case 21:
                zu1 zu1Var5 = (zu1) obj3;
                id[] idVarArr = (id[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                idVarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        bs2.v(null, 2131746884, d31.b0(zu1Var5), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new li8(zu1Var5.getParentActivity(), zu1Var5.Ba, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 22:
                zu1 zu1Var6 = (zu1) obj3;
                r47 r47Var = (r47) obj2;
                TLRPC.SuggestedPost c = ((b77) obj).c();
                if (r47Var != null && r47Var.k != null) {
                    zu1Var6.getMessagesController().e(r47Var, c);
                    break;
                }
                break;
            case 23:
                ((zu1) obj3).Ub = true;
                ((jj1) obj2).run();
                break;
            case 24:
                a19 a19Var = (a19) obj2;
                String str12 = (String) obj;
                zu1 zu1Var7 = ((oq1) obj3).b;
                if (a19Var != null) {
                    i2 = ((e) zu1Var7).currentAccount;
                    b19.f(i2).k(a19Var.a, str12);
                }
                zu1Var7.f4 = str12;
                zu1Var7.p1.setTitle(str12);
                break;
            case 25:
                r47 r47Var2 = (r47) obj2;
                Long l2 = (Long) obj;
                zu1 zu1Var8 = ((ju1) obj3).a;
                if (zu1Var8.r5()) {
                    p7a b9 = p7a.b(r47Var2.C0(), zu1Var8.l6, zu1Var8.F5, zu1Var8.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b9.K = zu1Var8.X6();
                    b9.W = l2.longValue();
                    zu1Var8.getSendMessagesHelper().q0(b9);
                    break;
                }
                break;
            case 26:
                wb2 wb2Var = (wb2) obj2;
                zu1 zu1Var9 = ((ju1) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i3 < zu1Var9.A0.getChildCount()) {
                        View childAt = zu1Var9.A0.getChildAt(i3);
                        if (childAt instanceof wb2) {
                            wb2 wb2Var2 = (wb2) childAt;
                            if (wb2Var2.getMessageObject() != null && wb2Var2.getMessageObject().o4()) {
                                wb2Var2.K3();
                            }
                        }
                        i3++;
                    }
                    break;
                } else {
                    if (wb2Var.getMessageObject() != null) {
                        wb2Var.getMessageObject().t2 = Boolean.FALSE;
                    }
                    wb2Var.K3();
                    break;
                }
                break;
            case 27:
                ju1 ju1Var = (ju1) obj3;
                y0 y0Var = (y0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zu1 zu1Var10 = ju1Var.a;
                if (booleanValue) {
                    zu1Var10.getMessagesController().S4(true);
                    d31.b0(zu1Var10).P(R.raw.chats_infotip, hl.D2(hl.N2(ob6.M0(2131745302, null), -1, 2, new st1(ju1Var, b3), null), true)).k(true);
                    y0Var.a(Boolean.TRUE);
                    break;
                } else {
                    d31.b0(zu1Var10).I(R.raw.error, ob6.M0(2131754304, null), ob6.M0(2131754305, null)).j();
                    break;
                }
            case 28:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((ju1) obj3).a.getMessagesController().t(message.id, -1, wf3.n(message.peer_id), (String) obj, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i13 = ChatActivityEnterView.X7;
                ((pcc) obj2).a((CharSequence) obj);
                tx1 tx1Var = chatActivityEnterView.F0;
                Editable text = tx1Var != null ? tx1Var.getText() : null;
                chatActivityEnterView.P6 = text != null ? text.toString() : null;
                break;
        }
    }
}
