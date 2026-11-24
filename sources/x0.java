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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(Object obj) {
        wt1 wt1Var = (wt1) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        na7 messagesController = wt1Var.a.getMessagesController();
        long n = cf3.n(message.peer_id);
        messagesController.s(message.id, -1, n, (String) obj, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0545  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        TLRPC.Document document;
        atc atcVar;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i;
        gw0 gw0Var;
        kp kpVar;
        cv0 cv0Var;
        mu1 mu1Var;
        ar1 ar1Var;
        int i2;
        k27 threadMessage;
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
                        y0Var.h.j(gl5.b(document), "24_24", gl5.c(ba4.w(document.thumbs, 24, false, null, false), document), "24_24", vu3.g(str5), null);
                        break;
                    }
                }
                break;
            case 1:
                o oVar = (o) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                sw swVar = oVar.L;
                yc[] ycVarArr = oVar.U0;
                if ((!oVar.v0[0].b() || oVar.v0[0].c.F != null) && oVar.M != null) {
                    if (num.intValue() == 1) {
                        wt wtVar = oVar.i0;
                        int L = gl.L(56.0f);
                        oVar.K0 = L;
                        wtVar.setHeight(L);
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
                        String r = hv0.r(str4);
                        oVar.Y(new taa(oVar.M, null, r, false, r, false, gl.B(oVar.i0.getBackgroundColor()) < 0.721f ? new f53() : null));
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
                        o.c(str3, oVar.Y, frameLayout, swVar, null);
                        break;
                    } else {
                        byte b5 = 4;
                        if (num.intValue() == 7) {
                            ag0 ag0Var = new ag0();
                            ag0Var.a = true;
                            d S = LaunchActivity.S();
                            if (S != null) {
                                S.showAsSheet(new dm0(swVar != null ? new ts(oVar, b5) : null, new ws(oVar, b4)), ag0Var);
                                break;
                            }
                        } else {
                            byte b6 = 5;
                            byte b7 = 3;
                            if (num.intValue() == 8) {
                                ag0 ag0Var2 = new ag0();
                                ag0Var2.a = true;
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    S2.showAsSheet(new me5(swVar != null ? new ts(oVar, b6) : null, new ws(oVar, b7)), ag0Var2);
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
                                Activity activity2 = oVar.M;
                                if (activity2 != null && !activity2.isFinishing()) {
                                    if (file != null) {
                                        String D = ba4.D(file);
                                        Pattern pattern = xi6.a;
                                        gl.s2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", oVar.M, null, true);
                                        break;
                                    } else if (str != null) {
                                        String J0 = gl.J0(str2, true);
                                        String J02 = gl.J0(str, true);
                                        gt gtVar = new gt(oVar, str, z4 ? 1 : 0);
                                        ht htVar = new ht(oVar, J02, J0, z3 ? 1 : 0);
                                        if (!oVar.v0[0].e() || !na7.q1(oVar.Y).N2(J02) || na7.q1(oVar.Y).L2(true)) {
                                            gtVar.run();
                                            break;
                                        } else {
                                            ij.l0(activity, null, str, true, new ae2((Object) htVar, (Object) gtVar, (byte) (z2 ? 1 : 0)));
                                            break;
                                        }
                                    }
                                }
                            } else if (num.intValue() == 4) {
                                if (oVar.v0[0].e()) {
                                    d S3 = LaunchActivity.S();
                                    if (S3 != null) {
                                        ag0 ag0Var3 = new ag0();
                                        ag0Var3.a = true;
                                        S3.showAsSheet(new tsc(new ws(oVar, b7)), ag0Var3);
                                        break;
                                    }
                                } else {
                                    fx0 i6 = ug8.i(oVar.M, false, 1, null);
                                    i6.v0 = false;
                                    LinearLayout linearLayout = new LinearLayout(oVar.M);
                                    linearLayout.setPadding(0, 0, 0, gl.L(4.0f));
                                    linearLayout.setOrientation(1);
                                    ld5 ld5Var = new ld5(oVar.M, (wjb) null);
                                    ld5Var.setText(k96.M0(2131750592, null));
                                    linearLayout.addView(ld5Var, nme.t(-2, -2, 51, 3, 1, 3, 0));
                                    linearLayout.addView(new bx(oVar, oVar.M), nme.t(-1, -2, 51, 3, 0, 3, 0));
                                    ld5 ld5Var2 = new ld5(oVar.M, (wjb) null);
                                    ld5Var2.setText(k96.M0(2131750587, null));
                                    linearLayout.addView(ld5Var2, nme.t(-2, -2, 51, 3, 4, 3, 2));
                                    int i7 = 0;
                                    while (i7 < b4) {
                                        Activity activity3 = oVar.M;
                                        yc ycVar = new yc((Context) activity3, (byte) (z ? 1 : 0));
                                        byte b8 = b2;
                                        int i8 = bkb.h6;
                                        ff0 f0 = bkb.f0(bkb.w0(null, i8, false), b4, -1);
                                        vkb M = zkb.M(i8);
                                        ycVar.setBackground(f0);
                                        zkb.j(ycVar, f0, null, M, null);
                                        RadioButton radioButton = new RadioButton(activity3);
                                        ycVar.b = radioButton;
                                        radioButton.setSize(gl.L(20.0f));
                                        zkb.O(radioButton, bkb.C5, bkb.D5, null);
                                        boolean z5 = k96.a0;
                                        ycVar.addView(radioButton, nme.d(22, 22.0f, (z5 ? 5 : 3) | 48, z5 ? 0 : 22, 13.0f, z5 ? 22 : 0, 0.0f));
                                        TextView textView = new TextView(activity3);
                                        zkb.X(textView, bkb.F6, null);
                                        ug8.w(textView, 1, 16.0f, 1, 1);
                                        textView.setSingleLine(true);
                                        textView.setGravity((k96.a0 ? 5 : 3) | 16);
                                        boolean z6 = k96.a0;
                                        ycVar.addView(textView, nme.d(-1, -1.0f, (z6 ? 5 : 3) | 48, z6 ? 17 : 62, 0.0f, z6 ? 62 : 17, 0.0f));
                                        ycVarArr[i7] = ycVar;
                                        if (i7 == 0) {
                                            String M0 = k96.M0(2131751588, null);
                                            Typeface typeface = Typeface.DEFAULT;
                                            textView.setText(M0);
                                            textView.setTypeface(typeface);
                                            ycVar.setContentDescription(M0);
                                            ycVar.invalidate();
                                        } else if (i7 == 1) {
                                            Typeface typeface2 = Typeface.SERIF;
                                            textView.setText("Serif");
                                            textView.setTypeface(typeface2);
                                            ycVar.setContentDescription("Serif");
                                            ycVar.invalidate();
                                        }
                                        ((RadioButton) ycVarArr[i7].b).a(i7 == oVar.a, false);
                                        ycVarArr[i7].setTag(Integer.valueOf(i7));
                                        ycVarArr[i7].setOnClickListener(new xs(oVar, b5));
                                        linearLayout.addView(ycVarArr[i7], nme.o(-1, 50));
                                        i7++;
                                        b2 = b8;
                                        b4 = 2;
                                    }
                                    i6.O = linearLayout;
                                    oVar.J = i6;
                                    oVar.Y(i6);
                                    break;
                                }
                            } else if (num.intValue() != 5) {
                                if (num.intValue() == 10 && (atcVar = oVar.v0[0].F) != null && atcVar.b() != null) {
                                    oVar.e(atcVar.b(), null, 1);
                                    break;
                                }
                            } else if (oVar.v0[0].e() && oVar.v0[0].getWebView() != null) {
                                oVar.v0[0].getWebView().reload();
                                break;
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
                    gl.c(spannableStringBuilder, 1, false, true);
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
                            eb.b(activity4, str7);
                            cv0 webView = mVar2.getWebView();
                            String str8 = is9.a().b;
                            webView.loadUrl(str8 != null ? str8 + URLEncoder.encode(str7) : null);
                            break;
                        } else {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str7 = d01.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            mVar2.getWebView().loadUrl(str7);
                            break;
                        }
                    }
                }
                break;
            case 3:
                gl.c3(new nn6((oh0) obj3, (String) obj, (Runnable) obj2, b2));
                break;
            case 4:
                tq0 tq0Var = (tq0) obj3;
                pt0 pt0Var = (pt0) obj2;
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
                pt0Var.a(Boolean.TRUE, Boolean.valueOf(z7));
                break;
            case 5:
                tq0 tq0Var2 = (tq0) obj3;
                ll8 ll8Var = (ll8) obj2;
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
                if (ll8Var != null) {
                    ll8Var.run();
                    break;
                }
                break;
            case 6:
                ((File[]) obj3)[0] = (File) obj;
                ((vr0) obj2).run();
                break;
            case 7:
                ((jw0) obj3).d.E.D((String) obj2, (String) obj, false);
                break;
            case 8:
                qx0 qx0Var = (qx0) obj3;
                px0 px0Var = (px0) obj2;
                d dVar = (d) obj;
                if (dVar != null) {
                    if ((dVar instanceof mu1) && (ar1Var = (mu1Var = (mu1) dVar).a0) != null) {
                        ar1Var.S();
                        mu1Var.a0.K0(true, false, true);
                    }
                    if (dVar.getContext() != null && dVar.getParentActivity() != null) {
                        ow0 ow0Var = new ow0(dVar.getContext(), dVar.getResourceProvider());
                        ow0Var.m0 = dVar.getParentActivity();
                        if (px0Var != null && px0Var.a != null) {
                            ow0Var.G0 = true;
                            boolean z9 = px0Var.o;
                            ow0Var.X = z9;
                            if (z9) {
                                ow0Var.A(px0Var.r, false);
                            }
                            if (px0Var.n) {
                                i = px0Var.q;
                            } else {
                                int i10 = px0Var.p;
                                if (i10 < 0) {
                                    i10 = bkb.c6;
                                }
                                i = bkb.v0(i10, ow0Var.G);
                            }
                            ow0Var.y(i, px0Var.n, false);
                            ow0Var.D(px0Var.s, false);
                            ow0Var.H0 = px0Var.j;
                            ow0Var.I0 = px0Var.k;
                            boolean z10 = px0Var.u;
                            ow0Var.y0 = z10;
                            gw0 gw0Var2 = ow0Var.E;
                            gw0Var2.setIsBackButtonVisible(z10);
                            ow0Var.x.setAllowSwipes(px0Var.l);
                            gl.L3(ow0Var.Y.getBackButton(), ow0Var.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            yp0 yp0Var = ow0Var.o0;
                            if (yp0Var != null) {
                                boolean z11 = ow0Var.y0;
                                yp0Var.L = z11;
                                yp0Var.M.d(z11);
                                yp0Var.invalidate();
                            }
                            ow0Var.t0 = px0Var.y;
                            ow0Var.B0 = Boolean.valueOf(px0Var.B);
                            ow0Var.C0 = px0Var.C;
                            or0 or0Var = px0Var.K;
                            ow0Var.D0 = or0Var;
                            if (or0Var != null) {
                                mr0 mr0Var = or0Var.r;
                                SensorManager sensorManager = or0Var.a;
                                if (or0Var.l) {
                                    or0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = or0Var.b;
                                        if (sensor != null) {
                                            gw0Var = gw0Var2;
                                            sensorManager.registerListener(or0Var.n, sensor, or0.a(or0Var.c));
                                        } else {
                                            gw0Var = gw0Var2;
                                        }
                                        Sensor sensor2 = or0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(or0Var.p, sensor2, or0.a(or0Var.e));
                                        }
                                        Sensor sensor3 = or0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(mr0Var, sensor3, or0.a(or0Var.h));
                                        }
                                        Sensor sensor4 = or0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(mr0Var, sensor4, or0.a(or0Var.h));
                                        }
                                        Sensor sensor5 = or0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(or0Var.t, sensor5, or0.a(or0Var.j));
                                        }
                                        kpVar = px0Var.w;
                                        if (kpVar != null) {
                                            kw0 kw0Var = ow0Var.n0;
                                            int totalHeight = kw0Var.getTotalHeight();
                                            kw0Var.e = kpVar;
                                            xo0[] xo0VarArr = kw0Var.f;
                                            zo0.b(xo0VarArr[0].l, (yo0) kpVar.c, false);
                                            zo0.b(xo0VarArr[1].l, (yo0) kpVar.d, false);
                                            kw0Var.invalidate();
                                            if (totalHeight != kw0Var.getTotalHeight() && kw0Var.r != null) {
                                                int totalHeight2 = kw0Var.getTotalHeight();
                                                Runnable runnable = kw0Var.r;
                                                if (totalHeight < totalHeight2) {
                                                    gl.d3(runnable, 200L);
                                                } else {
                                                    runnable.run();
                                                }
                                            }
                                            int i11 = kpVar.b;
                                            Paint paint = kw0Var.a;
                                            kw0Var.e.b = i11;
                                            paint.setColor(i11);
                                            kw0Var.d.a(i11, true);
                                        }
                                        ow0Var.C(px0Var.z, false, px0Var.A);
                                        quc qucVar = px0Var.a;
                                        ow0Var.I = qucVar == null ? qucVar.a : y6c.t0;
                                        cv0Var = px0Var.b;
                                        if (cv0Var == null) {
                                            cv0Var.onResume();
                                            gw0Var.L(ow0Var.I, px0Var.b, px0Var.d, px0Var.f, px0Var.e);
                                            gw0 gw0Var3 = gw0Var;
                                            boolean z12 = px0Var.t || px0Var.b.b;
                                            String str9 = px0Var.x;
                                            gw0Var3.e("setState(" + z12 + ", " + str9 + ")");
                                            gw0Var3.O = z12;
                                            gw0Var3.b = str9;
                                            if (bkb.I.o() != px0Var.D) {
                                                gw0Var3.w();
                                            }
                                        } else {
                                            qucVar.q = null;
                                            qucVar.r = 0L;
                                        }
                                        ow0Var.x(dVar, px0Var.a);
                                        ow0Var.d0 = px0Var.v;
                                        if (px0Var.G) {
                                            ow0Var.X0 = true;
                                            ow0Var.j();
                                            cw cwVar = ow0Var.Z0;
                                            String r2 = ow0Var.o() ? ow0Var.x0.e : l7c.r(na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J)));
                                            String str10 = px0Var.H;
                                            ow0Var.Y0 = str10;
                                            cwVar.a(r2, str10);
                                            cw cwVar2 = ow0Var.Z0;
                                            Paint paint2 = ow0Var.R;
                                            cwVar2.b(gl.B(paint2.getColor()) <= 0.721f, false);
                                            ow0Var.Z0.setBackgroundColor(paint2.getColor());
                                            ow0Var.Z0.setVisibility(0);
                                            ow0Var.Z0.setAlpha(1.0f);
                                        }
                                        ow0Var.t(px0Var.L);
                                        qx0Var.h(qx0Var.x, px0Var, false);
                                        ow0Var.show();
                                        break;
                                    }
                                }
                            }
                            gw0Var = gw0Var2;
                            kpVar = px0Var.w;
                            if (kpVar != null) {
                            }
                            ow0Var.C(px0Var.z, false, px0Var.A);
                            quc qucVar2 = px0Var.a;
                            ow0Var.I = qucVar2 == null ? qucVar2.a : y6c.t0;
                            cv0Var = px0Var.b;
                            if (cv0Var == null) {
                            }
                            ow0Var.x(dVar, px0Var.a);
                            ow0Var.d0 = px0Var.v;
                            if (px0Var.G) {
                            }
                            ow0Var.t(px0Var.L);
                            qx0Var.h(qx0Var.x, px0Var, false);
                            ow0Var.show();
                        }
                    }
                }
                break;
            case 9:
                vx0 vx0Var = (vx0) obj2;
                ((px0) obj3).m = (Bitmap) obj;
                vx0Var.d().setDrawingFromOverlay(false);
                vx0Var.release();
                break;
            case 10:
                xx0 xx0Var = (xx0) obj2;
                yx0 yx0Var = (yx0) ((ux0) obj3).q;
                if (((Boolean) obj).booleanValue()) {
                    xx0Var.a(1.0f);
                    if (yx0Var.a.getTabs().isEmpty()) {
                        yx0Var.a(false);
                        break;
                    }
                } else {
                    xx0Var.a(0.0f);
                    break;
                }
                break;
            case 11:
                View view = (View) obj3;
                c41 c41Var = (c41) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                gl.t1(c41Var);
                gl.d3(runnable2, 80L);
                break;
            case 12:
                yb1 yb1Var = (yb1) obj3;
                cc1 cc1Var = (cc1) obj2;
                Boolean bool = (Boolean) obj;
                yb1Var.a.l(bool.booleanValue());
                yb1Var.f(bool.booleanValue() ? cc1Var : null);
                break;
            case 13:
                ng1 ng1Var = (ng1) obj3;
                p8c p8cVar = (p8c) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                String str11 = tL_error.text;
                if (startsWith) {
                    ng1Var.f = Utilities.z(str11).intValue();
                } else if (str11.startsWith("BOOSTS_EMPTY")) {
                    ng1Var.b = true;
                }
                ng1Var.a = false;
                p8cVar.a(ng1Var);
                break;
            case 14:
                nh1 nh1Var = (nh1) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                nh1Var.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i12 = tL_premium_boostsStatus.level;
                    nh1Var.b = i12;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i12;
                    }
                }
                nh1Var.d1(true);
                u41 u41Var = nh1Var.Q;
                if (u41Var != null) {
                    u41Var.setLoading(false);
                    break;
                }
                break;
            case 15:
                eh1 eh1Var = (eh1) obj3;
                ea7 ea7Var = (ea7) obj2;
                View view2 = (View) obj;
                if (view2 instanceof dh1) {
                    dh1 dh1Var = (dh1) view2;
                    dh1Var.setBackgroundColor(bkb.v0(bkb.c6, eh1Var.a));
                    eh1Var.b.getClass();
                    int R = RecyclerView.R(view2);
                    if (ea7Var != null) {
                        ArrayList arrayList = ea7Var.c;
                        if (R >= 0 && R < arrayList.size()) {
                            dh1Var.a((da7) arrayList.get(R));
                        }
                    }
                    view2.invalidate();
                    break;
                }
                break;
            case 16:
                h26 h26Var = (h26) obj2;
                h26Var.r1((ng1) obj);
                ((zi1) obj3).m0.showDialog(h26Var);
                break;
            case 17:
                mu1 mu1Var2 = (mu1) obj3;
                mu1Var2.getClass();
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = mu1Var2.getMessagesController().h1(mu1Var2.l6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((nx8) obj2).a;
                mu1Var2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ar1 ar1Var2 = mu1Var2.a0;
                if (ar1Var2 != null) {
                    ar1Var2.setFieldText(null);
                    break;
                }
                break;
            case 18:
                mu1 mu1Var3 = (mu1) obj3;
                mu1Var3.getClass();
                x3a b9 = x3a.b((String) obj2, mu1Var3.l6, mu1Var3.F5, mu1Var3.m4, null, false, null, null, null, true, 0, 0, null, false);
                b9.K = mu1Var3.Q6();
                b9.Q = ((Long) obj).longValue();
                b9.R = mu1Var3.c7();
                b9.T = mu1Var3.y5;
                mu1Var3.getSendMessagesHelper().q0(b9);
                mu1Var3.a0.setFieldText("");
                mu1Var3.w7(false);
                break;
            case 19:
                mu1 mu1Var4 = (mu1) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                if (mu1Var4.g4 == 1) {
                    ij.J(mu1Var4.getParentActivity(), mu1Var4.l6, new ie((Object) mu1Var4, (Object) botInlineResult, (Object) l, (byte) 11), mu1Var4.Ba);
                    break;
                } else {
                    mu1Var4.ob(botInlineResult, true, 0, l.longValue());
                    break;
                }
            case 20:
                ((mu1) obj3).Jb = true;
                ((aj1) obj2).run();
                break;
            case 21:
                ((mu1) obj3).F9((cb9[]) obj2, (cs5) obj);
                break;
            case 22:
                mu1 mu1Var5 = (mu1) obj3;
                hd[] hdVarArr = (hd[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                hdVarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        ir2.v(null, 2131746964, u21.b0(mu1Var5), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new xe8(mu1Var5.getParentActivity(), mu1Var5.Ba, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 23:
                mu1 mu1Var6 = (mu1) obj3;
                k27 k27Var = (k27) obj2;
                TLRPC.SuggestedPost c = ((u47) obj).c();
                if (k27Var != null && k27Var.k != null) {
                    mu1Var6.getMessagesController().e(k27Var, c);
                    break;
                }
                break;
            case 24:
                nx8 nx8Var = (nx8) obj2;
                String str12 = (String) obj;
                mu1 mu1Var7 = ((aq1) obj3).b;
                if (nx8Var != null) {
                    i2 = ((d) mu1Var7).currentAccount;
                    ox8.f(i2).k(nx8Var.a, str12);
                }
                mu1Var7.f4 = str12;
                mu1Var7.p1.setTitle(str12);
                break;
            case 25:
                k27 k27Var2 = (k27) obj2;
                Long l2 = (Long) obj;
                mu1 mu1Var8 = ((wt1) obj3).a;
                if (mu1Var8.l5()) {
                    x3a b10 = x3a.b(k27Var2.C0(), mu1Var8.l6, mu1Var8.F5, mu1Var8.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = mu1Var8.Q6();
                    b10.W = l2.longValue();
                    mu1Var8.getSendMessagesHelper().q0(b10);
                    break;
                }
                break;
            case 26:
                gb2 gb2Var = (gb2) obj2;
                mu1 mu1Var9 = ((wt1) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i3 < mu1Var9.A0.getChildCount()) {
                        View childAt = mu1Var9.A0.getChildAt(i3);
                        if (childAt instanceof gb2) {
                            gb2 gb2Var2 = (gb2) childAt;
                            if (gb2Var2.getMessageObject() != null && gb2Var2.getMessageObject().o4()) {
                                gb2Var2.K3();
                            }
                        }
                        i3++;
                    }
                    break;
                } else {
                    if (gb2Var.getMessageObject() != null) {
                        gb2Var.getMessageObject().t2 = Boolean.FALSE;
                    }
                    gb2Var.K3();
                    break;
                }
                break;
            case 27:
                wt1 wt1Var = (wt1) obj3;
                x0 x0Var = (x0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mu1 mu1Var10 = wt1Var.a;
                if (booleanValue) {
                    mu1Var10.getMessagesController().K4(true);
                    u21.b0(mu1Var10).P(R.raw.chats_infotip, gl.D2(gl.N2(k96.M0(2131745382, null), -1, 2, new ft1(wt1Var, b3), null), true)).k(true);
                    x0Var.a(Boolean.TRUE);
                    break;
                } else {
                    u21.b0(mu1Var10).I(R.raw.error, k96.M0(2131754308, null), k96.M0(2131754309, null)).j();
                    break;
                }
            case 28:
                b(obj);
                break;
            default:
                Long l3 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((dx1) obj3).a;
                long j = chatActivityEnterView.G3;
                k27 k27Var3 = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                x3a b11 = x3a.b((String) obj2, j, k27Var3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                mu1 mu1Var11 = chatActivityEnterView.F3;
                b11.K = mu1Var11 != null ? mu1Var11.Q6() : null;
                b11.O = chatActivityEnterView.O6;
                b11.Q = l3.longValue();
                b11.R = chatActivityEnterView.getSendMonoForumPeerId();
                b11.T = chatActivityEnterView.getSendMessageSuggestionParams();
                z3a.B(chatActivityEnterView.R).q0(b11);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                ow1 ow1Var = chatActivityEnterView.K0;
                chatActivityEnterView.O6 = 0L;
                ow1Var.setEffect(0L);
                break;
        }
    }
}
