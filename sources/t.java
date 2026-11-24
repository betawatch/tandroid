// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int[], java.lang.String] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        String str;
        String str2;
        ?? r8;
        String str3;
        int N;
        byte b = this.a;
        int i = -1;
        byte b2 = 2;
        byte b3 = 6;
        byte b4 = 0;
        byte b5 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                new kj8(42, (ylb) obj, ((a1) obj2).getContext()).show();
                break;
            case 1:
                final r0 r0Var = (r0) obj2;
                final ylb ylbVar = (ylb) obj;
                su3 su3Var = r0Var.W1;
                su3 su3Var2 = r0Var.V1;
                jh2 jh2Var = r0Var.Y1;
                b61 b61Var = r0Var.b2;
                if (!b61Var.R) {
                    if (!b61Var.e0) {
                        if (r0Var.c2 == null) {
                            r0Var.Y0();
                            break;
                        }
                    } else {
                        b61Var.setLoading(true);
                        if (r0Var.e2 == null) {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = jh2Var.a.q;
                            createtone.emoji_id = r0Var.c2.longValue();
                            createtone.title = su3Var2.getText().toString();
                            createtone.prompt = su3Var.getText().toString();
                            final byte b6 = 1;
                            ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(createtone, new kc((byte) 0), new jac() { // from class: m0
                                @Override // jac
                                public final void a(Object obj3, Object obj4) {
                                    byte b7 = b6;
                                    ylb ylbVar2 = ylbVar;
                                    r0 r0Var2 = r0Var;
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                    switch (b7) {
                                        case 0:
                                            r0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    wi8.u(r0Var2.a2, ylbVar2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                h hVar = r0Var2.g2;
                                                if (hVar != null) {
                                                    hVar.a(aiComposeTone);
                                                }
                                                r0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            r0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    FrameLayout frameLayout = r0Var2.a2;
                                                    if (!equalsIgnoreCase) {
                                                        wi8.u(frameLayout, ylbVar2, tL_error, false);
                                                        break;
                                                    } else {
                                                        a1.q1(new c41(frameLayout, ylbVar2), r0Var2.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                r0Var2.dismiss();
                                                h hVar2 = r0Var2.f2;
                                                if (hVar2 != null) {
                                                    hVar2.a(aiComposeTone);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                            updatetone.flags |= 1;
                            updatetone.display_author = jh2Var.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = r0Var.c2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = su3Var2.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = su3Var.getText().toString();
                            final byte b7 = 0;
                            ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(updatetone, new kc(b7), new jac() { // from class: m0
                                @Override // jac
                                public final void a(Object obj3, Object obj4) {
                                    byte b72 = b7;
                                    ylb ylbVar2 = ylbVar;
                                    r0 r0Var2 = r0Var;
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                    switch (b72) {
                                        case 0:
                                            r0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    wi8.u(r0Var2.a2, ylbVar2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                h hVar = r0Var2.g2;
                                                if (hVar != null) {
                                                    hVar.a(aiComposeTone);
                                                }
                                                r0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            r0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    FrameLayout frameLayout = r0Var2.a2;
                                                    if (!equalsIgnoreCase) {
                                                        wi8.u(frameLayout, ylbVar2, tL_error, false);
                                                        break;
                                                    } else {
                                                        a1.q1(new c41(frameLayout, ylbVar2), r0Var2.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                r0Var2.dismiss();
                                                h hVar2 = r0Var2.f2;
                                                if (hVar2 != null) {
                                                    hVar2.a(aiComposeTone);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((qac) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 3:
                o5 o5Var = (o5) obj2;
                long n = pg3.n(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                o5Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null && !m9c.C(n)) {
                    Bundle bundle = new Bundle();
                    if (n > 0) {
                        bundle.putLong("user_id", n);
                        if (n == z8c.h(o5Var.a).e()) {
                            z = true;
                            bundle.putBoolean("my_profile", true);
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                        bundle.putLong("chat_id", -n);
                    }
                    bundle.putBoolean("open_gifts", z);
                    S.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 4:
                r7 r7Var = (r7) obj2;
                q7 q7Var = (q7) obj;
                int indexOf = r7Var.h0.indexOf(q7Var.getFilter());
                if (r7Var.i0 == indexOf) {
                    if (q7Var.getFilter().h) {
                        if (!q7Var.a.f) {
                            q7Var.setSelectedForDelete(true);
                            break;
                        } else {
                            sh4 filter = q7Var.getFilter();
                            r7Var.J(filter);
                            n7 n7Var = r7Var.I;
                            if (n7Var != null) {
                                n7Var.j(filter);
                                r7Var.I.l(r7Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    r7Var.i0 = indexOf;
                    r7Var.E();
                    break;
                }
                break;
            case 5:
                p7 p7Var = (p7) obj2;
                r7 r7Var2 = (r7) obj;
                if (r7Var2.y() && p7Var.f) {
                    if (!r7Var2.U) {
                        r7Var2.U = true;
                        r7Var2.r();
                    }
                }
                r6 r6Var = r7Var2.c;
                if (r6Var == null) {
                    m7 m7Var = r7Var2.Q;
                    if (m7Var != null) {
                        m7Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    r6Var.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 6:
                eb ebVar = (eb) obj2;
                ebVar.b = true;
                ((hu) obj).run();
                ebVar.x.g3.O(true);
                break;
            case 7:
                ((bc) obj2).G0((Context) obj);
                break;
            case 8:
                he heVar = (he) obj2;
                if (!((zd) obj).a) {
                    ee eeVar = heVar.n0;
                    if (eeVar != null) {
                        eeVar.r(heVar, -1);
                    }
                    if (heVar.k0) {
                        heVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                he heVar2 = (he) obj2;
                if (!((zd) obj).a) {
                    ee eeVar2 = heVar2.p0;
                    if (eeVar2 != null) {
                        eeVar2.r(heVar2, -2);
                    }
                    if (heVar2.k0) {
                        heVar2.cancel();
                        break;
                    }
                }
                break;
            case 10:
                he heVar3 = (he) obj2;
                if (!((zd) obj).a) {
                    ee eeVar3 = heVar3.t0;
                    if (eeVar3 != null) {
                        eeVar3.r(heVar3, -2);
                    }
                    if (heVar3.k0) {
                        heVar3.dismiss();
                        break;
                    }
                }
                break;
            case 11:
                he heVar4 = (he) obj2;
                if (!((zd) obj).a) {
                    kh9 kh9Var = heVar4.r0;
                    if (kh9Var != null) {
                        kh9Var.r(heVar4, -2);
                    }
                    if (heVar4.k0) {
                        heVar4.cancel();
                        break;
                    }
                }
                break;
            case 12:
                r7 r7Var3 = (r7) obj2;
                fk fkVar = (fk) obj;
                r7Var3.U(null, null);
                r7Var3.O(fkVar.d, false);
                r7Var3.setupPopupRadialSelectors(fkVar.f);
                r7Var3.I(fkVar.e);
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                boolean z2 = !zArr[0];
                zArr[0] = z2;
                ((oh2) view).c(z2, true);
                ((rh) obj).run();
                break;
            case 14:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((w73) obj).onClick(null, intValue);
                break;
            case 15:
                ((my0) ((k6d) obj2).b).y0.run();
                ((qac) obj).a(null);
                break;
            case 16:
                ((boolean[]) obj2)[0] = true;
                ((zx0) obj).run();
                break;
            case 17:
                o oVar = (o) obj2;
                Activity activity = (Activity) obj;
                sx sxVar = oVar.L;
                if (!oVar.i0.B0) {
                    m mVar = oVar.v0[0];
                    if (!mVar.e()) {
                        if (sxVar == null) {
                            mVar.b.z0(0);
                            break;
                        } else {
                            yla ylaVar = new yla(activity);
                            ylaVar.a = 1;
                            ylaVar.s = -gm.L(32.0f);
                            mVar.d.v0(ylaVar);
                            break;
                        }
                    } else if (mVar.getWebView() != null && !oVar.i0.a0) {
                        if (oVar.j0 != null) {
                            mw0 webView = mVar.getWebView();
                            if (webView != null) {
                                str = webView.getTitle();
                                str2 = webView.getUrl();
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String r = qw0.r(str2);
                            eb ebVar2 = oVar.j0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(str)) {
                                str = jb6.M0(2131742589, null);
                            }
                            String str4 = TextUtils.isEmpty(r) ? "about:blank" : r;
                            hu huVar = new hu(oVar, r, b4);
                            iu iuVar = new iu(oVar, mVar, activity, b4);
                            xt xtVar = new xt(oVar, b5);
                            xt xtVar2 = new xt(oVar, b2);
                            b0 b0Var = new b0(oVar, r, mVar, b3);
                            va vaVar = ebVar2.x;
                            ImageView imageView = ebVar2.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(ebVar2.I, PorterDuff.Mode.SRC_IN));
                                r8 = 0;
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(ebVar2.getContext().getResources(), favicon));
                                r8 = 0;
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = ebVar2.r;
                            textView.setText(gw3.m(str, textView.getPaint().getFontMetricsInt(), false, r8, 0));
                            try {
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str4 = l11.x(parse, r8, r8, l11.a(parse.getHost()), r8);
                                } catch (Exception e) {
                                    fc4.g(e, false);
                                }
                                str3 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                                str3 = str4;
                            }
                            TextView textView2 = ebVar2.s;
                            b4 = 0;
                            textView2.setText(gw3.m(str3, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            ebVar2.M = iuVar;
                            ebVar2.N = xtVar;
                            ebVar2.O = xtVar2;
                            ebVar2.e.setOnClickListener(new t(ebVar2, huVar, (byte) 6));
                            ebVar2.n.setOnClickListener(b0Var);
                            ebVar2.b = false;
                            ebVar2.setInput(null);
                            vaVar.g3.O(true);
                            vaVar.w0(0);
                        }
                        wu wuVar = oVar.i0;
                        x0 x0Var = new x0(mVar, activity, (byte) 3);
                        vc vcVar = wuVar.c0;
                        vcVar.setText("");
                        vcVar.setSelection(b4, vcVar.getText().length());
                        vcVar.setScrollX(b4);
                        wuVar.w0 = x0Var;
                        wuVar.k(true);
                        break;
                    }
                }
                break;
            case 18:
                ev evVar = (ev) obj2;
                ui5 ui5Var = (ui5) obj;
                if (evVar.h == 0) {
                    evVar.a(1, true);
                    int i2 = ((o) ui5Var).Y;
                    TLRPC.Chat chat = ui5Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = oc7.h1(chat);
                    ConnectionsManager.getInstance(i2).sendRequestTyped(tL_channels_joinChannel, new e((Object) evVar, i2, (Object) tL_channels_joinChannel, (Object) chat, (byte) 2));
                    break;
                }
                break;
            case 19:
                i30 i30Var = (i30) obj2;
                float[] fArr = (float[]) obj;
                float f = MediaController.w().r0;
                int i3 = 0;
                while (true) {
                    if (i3 < 3) {
                        if (f - 0.1f <= fArr[i3]) {
                            i = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                int i4 = i + 1;
                if (i4 >= 3) {
                    i4 = 0;
                }
                MediaController.w().l0(true, fArr[i4]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - i30Var.J2 > 300) {
                    int i5 = oc7.e1().getInt("speedhint", 0) + 1;
                    if (i5 > 2) {
                        i5 = -10;
                    }
                    oc7.e1().edit().putInt("speedhint", i5).apply();
                    if (i5 >= 0 && i30Var.b != null) {
                        t20 t20Var = new t20(5, null, i30Var.getContext(), false);
                        i30Var.I2 = t20Var;
                        t20Var.setExtraTranslationY(gm.L(6.0f));
                        i30Var.I2.setText(jb6.M0(2131744958, null));
                        i30Var.x1.addView(i30Var.I2, qoe.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        i30Var.I2.c(i30Var.O1);
                    }
                }
                i30Var.J2 = currentTimeMillis;
                break;
            case 20:
                ((bu5) obj).u();
                ((i30) obj2).J0(6);
                break;
            case 21:
                fl6 fl6Var = (fl6) obj;
                i30 i30Var2 = (i30) ((z20) obj2).G;
                int i6 = i30Var2.a;
                LaunchActivity launchActivity = i30Var2.z2;
                ArrayList arrayList = (ArrayList) oc7.r1(i6).w.get(0);
                if ((arrayList != null ? arrayList.size() : 0) > 10 && !TextUtils.isEmpty(fl6Var.getText().toString())) {
                    String charSequence = fl6Var.getText().toString();
                    if (launchActivity.N().getLastFragment() instanceof nk3) {
                        nk3 nk3Var = (nk3) launchActivity.N().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) nk3Var.getMessagesController().w.get(0);
                        int size = arrayList2 != null ? arrayList2.size() : 0;
                        if (!nk3Var.n2 && (size > 10 || nk3Var.L)) {
                            if (nk3Var.l2) {
                                nk3Var.Y.r.setText(charSequence);
                                nk3Var.Y.r.setSelection(charSequence.length());
                                sj3 sj3Var = nk3Var.D0;
                                if (sj3Var != null && (N = sj3Var.N(3)) >= 0 && nk3Var.D0.getTabsView().getCurrentTabId() != N) {
                                    nk3Var.D0.getTabsView().e(N, N);
                                }
                            } else {
                                nk3Var.y = 3;
                                nk3Var.Y.r.setText(charSequence);
                                nk3Var.Y.r.setSelection(charSequence.length());
                            }
                            i30Var2.dismiss();
                            break;
                        }
                    }
                    nk3 nk3Var2 = new nk3(null);
                    nk3Var2.p2 = charSequence;
                    nk3Var2.y = 3;
                    launchActivity.u0(nk3Var2, false, false);
                    i30Var2.dismiss();
                    break;
                }
                break;
            case 22:
                mc0 mc0Var = (mc0) obj2;
                ((boolean[]) obj)[0] = true;
                mc0Var.K.z1(mc0Var.Z);
                mc0Var.T.dismiss();
                break;
            case 23:
                bd0 bd0Var = (bd0) obj2;
                bd0Var.b(false);
                bd0Var.e.j((cd0) obj);
                break;
            case 24:
                ((au0) obj2).r0((Context) obj, view);
                break;
            case 25:
                wx0 wx0Var = (wx0) obj2;
                lq0 lq0Var = (lq0) obj;
                if (lq0Var.c()) {
                    lq0Var.a();
                } else {
                    File file = lq0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = lq0Var.d;
                        gm.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                bu5 bu5Var = wx0Var.P0;
                if (bu5Var != null) {
                    bu5Var.u();
                    wx0Var.P0 = null;
                    break;
                }
                break;
            case 26:
                gm.g(((TL_account.TL_businessChatLink) obj2).link);
                c41.b0((yv1) obj).k(false).j();
                break;
            case 27:
                ((y71) ((w71) obj2).f).w0((oh2) obj);
                break;
            case 28:
                g81 g81Var = (g81) obj2;
                p81 p81Var = (p81) obj;
                l81 l81Var = g81Var.f.G;
                if (l81Var != null) {
                    l81Var.h(p81Var.c, p81Var.d, true);
                }
                m8 m8Var = g81Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    break;
                }
                break;
            default:
                ia1 ia1Var = (ia1) obj2;
                fa1 fa1Var = (fa1) obj;
                ArrayList arrayList3 = fa1Var.b;
                if (arrayList3.size() != 1) {
                    boolean z3 = fa1Var.e;
                    HashSet hashSet = new HashSet();
                    int size2 = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj3 = arrayList3.get(i7);
                        i7++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) fa1Var.c.get(0)).id;
                    he heVar5 = new he(3, null, ia1Var.getParentActivity());
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = ia1Var.getMessagesController().l4.w3.f();
                    heVar5.setOnCancelListener(new p91(ia1Var, ia1Var.getConnectionsManager().sendRequest(getgroupcall, new o91(ia1Var, heVar5, hashSet, tL_inputGroupCallInviteMessage, z3, (byte) 1)), b5));
                    heVar5.q(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList3.get(0);
                    TLRPC.UserFull X1 = ia1Var.getMessagesController().X1(user.id);
                    ia1Var.L = user;
                    boolean z4 = fa1Var.e;
                    sic.m(user, z4, z4 || (X1 != null && X1.video_calls_available), ia1Var.getParentActivity(), null, ia1Var.getAccountInstance());
                    break;
                }
        }
    }
}
