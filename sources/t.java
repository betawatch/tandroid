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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        int O;
        byte b = this.a;
        int i = -1;
        byte b2 = 6;
        byte b3 = 2;
        byte b4 = 0;
        byte b5 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                new xk8(42, (vnb) obj, ((b1) obj2).getContext()).show();
                break;
            case 1:
                final s0 s0Var = (s0) obj2;
                final vnb vnbVar = (vnb) obj;
                zt3 zt3Var = s0Var.W1;
                zt3 zt3Var2 = s0Var.V1;
                og2 og2Var = s0Var.Y1;
                c51 c51Var = s0Var.b2;
                if (!c51Var.R) {
                    if (!c51Var.e0) {
                        if (s0Var.c2 == null) {
                            s0Var.Z0();
                            break;
                        }
                    } else {
                        c51Var.setLoading(true);
                        if (s0Var.e2 == null) {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = og2Var.a.q;
                            createtone.emoji_id = s0Var.c2.longValue();
                            createtone.title = zt3Var2.getText().toString();
                            createtone.prompt = zt3Var.getText().toString();
                            final byte b6 = 1;
                            ConnectionsManager.getInstance(s0Var.a).sendRequestTyped(createtone, new ic((byte) 0), new icc() { // from class: n0
                                @Override // icc
                                public final void a(Object obj3, Object obj4) {
                                    byte b7 = b6;
                                    vnb vnbVar2 = vnbVar;
                                    s0 s0Var2 = s0Var;
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                    switch (b7) {
                                        case 0:
                                            s0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    ik8.u(s0Var2.a2, vnbVar2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                h hVar = s0Var2.g2;
                                                if (hVar != null) {
                                                    hVar.a(aiComposeTone);
                                                }
                                                s0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            s0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    FrameLayout frameLayout = s0Var2.a2;
                                                    if (!equalsIgnoreCase) {
                                                        ik8.u(frameLayout, vnbVar2, tL_error, false);
                                                        break;
                                                    } else {
                                                        b1.s1(new d31(frameLayout, vnbVar2), s0Var2.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                s0Var2.dismiss();
                                                h hVar2 = s0Var2.f2;
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
                            updatetone.display_author = og2Var.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(s0Var.e2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = s0Var.c2.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = zt3Var2.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = zt3Var.getText().toString();
                            final byte b7 = 0;
                            ConnectionsManager.getInstance(s0Var.a).sendRequestTyped(updatetone, new ic(b7), new icc() { // from class: n0
                                @Override // icc
                                public final void a(Object obj3, Object obj4) {
                                    byte b72 = b7;
                                    vnb vnbVar2 = vnbVar;
                                    s0 s0Var2 = s0Var;
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                    switch (b72) {
                                        case 0:
                                            s0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    ik8.u(s0Var2.a2, vnbVar2, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                h hVar = s0Var2.g2;
                                                if (hVar != null) {
                                                    hVar.a(aiComposeTone);
                                                }
                                                s0Var2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            s0Var2.b2.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    FrameLayout frameLayout = s0Var2.a2;
                                                    if (!equalsIgnoreCase) {
                                                        ik8.u(frameLayout, vnbVar2, tL_error, false);
                                                        break;
                                                    } else {
                                                        b1.s1(new d31(frameLayout, vnbVar2), s0Var2.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                s0Var2.dismiss();
                                                h hVar2 = s0Var2.f2;
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
                ((pcc) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 3:
                p5 p5Var = (p5) obj2;
                long n = wf3.n(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                p5Var.dismiss();
                e S = LaunchActivity.S();
                if (S != null && !lbc.C(n)) {
                    Bundle bundle = new Bundle();
                    if (n > 0) {
                        bundle.putLong("user_id", n);
                        if (n == yac.h(p5Var.a).e()) {
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
                s7 s7Var = (s7) obj2;
                r7 r7Var = (r7) obj;
                int indexOf = s7Var.h0.indexOf(r7Var.getFilter());
                if (s7Var.i0 == indexOf) {
                    if (r7Var.getFilter().h) {
                        if (!r7Var.a.f) {
                            r7Var.setSelectedForDelete(true);
                            break;
                        } else {
                            ph4 filter = r7Var.getFilter();
                            s7Var.J(filter);
                            o7 o7Var = s7Var.I;
                            if (o7Var != null) {
                                o7Var.j(filter);
                                s7Var.I.l(s7Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    s7Var.i0 = indexOf;
                    s7Var.E();
                    break;
                }
                break;
            case 5:
                q7 q7Var = (q7) obj2;
                s7 s7Var2 = (s7) obj;
                if (s7Var2.y() && q7Var.f) {
                    if (!s7Var2.U) {
                        s7Var2.U = true;
                        s7Var2.r();
                    }
                }
                s6 s6Var = s7Var2.c;
                if (s6Var == null) {
                    n7 n7Var = s7Var2.Q;
                    if (n7Var != null) {
                        n7Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    s6Var.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 6:
                fb fbVar = (fb) obj2;
                fbVar.b = true;
                ((ft) obj).run();
                fbVar.x.g3.O(true);
                break;
            case 7:
                ((cc) obj2).G0((Context) obj);
                break;
            case 8:
                id idVar = (id) obj2;
                if (!((ad) obj).a) {
                    fd fdVar = idVar.n0;
                    if (fdVar != null) {
                        fdVar.w(idVar, -1);
                    }
                    if (idVar.k0) {
                        idVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                id idVar2 = (id) obj2;
                if (!((ad) obj).a) {
                    fd fdVar2 = idVar2.p0;
                    if (fdVar2 != null) {
                        fdVar2.w(idVar2, -2);
                    }
                    if (idVar2.k0) {
                        idVar2.cancel();
                        break;
                    }
                }
                break;
            case 10:
                id idVar3 = (id) obj2;
                if (!((ad) obj).a) {
                    fd fdVar3 = idVar3.t0;
                    if (fdVar3 != null) {
                        fdVar3.w(idVar3, -2);
                    }
                    if (idVar3.k0) {
                        idVar3.dismiss();
                        break;
                    }
                }
                break;
            case 11:
                id idVar4 = (id) obj2;
                if (!((ad) obj).a) {
                    xi9 xi9Var = idVar4.r0;
                    if (xi9Var != null) {
                        xi9Var.w(idVar4, -2);
                    }
                    if (idVar4.k0) {
                        idVar4.cancel();
                        break;
                    }
                }
                break;
            case 12:
                ((nx0) ((z8d) obj2).b).y0.run();
                ((pcc) obj).a(null);
                break;
            case 13:
                s7 s7Var3 = (s7) obj2;
                gj gjVar = (gj) obj;
                s7Var3.U(null, null);
                s7Var3.O(gjVar.d, false);
                s7Var3.setupPopupRadialSelectors(gjVar.f);
                s7Var3.I(gjVar.e);
                break;
            case 14:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.M0.run();
                ((d73) obj).onClick(null, intValue);
                break;
            case 15:
                boolean[] zArr = (boolean[]) obj2;
                boolean z2 = !zArr[0];
                zArr[0] = z2;
                ((sg2) view).c(z2, true);
                ((lg) obj).run();
                break;
            case 16:
                ((boolean[]) obj2)[0] = true;
                ((ax0) obj).run();
                break;
            case 17:
                o oVar = (o) obj2;
                Activity activity = (Activity) obj;
                tw twVar = oVar.L;
                if (!oVar.i0.B0) {
                    m mVar = oVar.v0[0];
                    if (!mVar.e()) {
                        if (twVar == null) {
                            mVar.b.A0(0);
                            break;
                        } else {
                            rna rnaVar = new rna(activity);
                            rnaVar.a = 1;
                            rnaVar.s = -hl.L(32.0f);
                            mVar.d.v0(rnaVar);
                            break;
                        }
                    } else if (mVar.getWebView() != null && !oVar.i0.a0) {
                        if (oVar.j0 != null) {
                            nv0 webView = mVar.getWebView();
                            if (webView != null) {
                                str = webView.getTitle();
                                str2 = webView.getUrl();
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String r = rv0.r(str2);
                            fb fbVar2 = oVar.j0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(str)) {
                                str = ob6.M0(2131742557, null);
                            }
                            String str4 = TextUtils.isEmpty(r) ? "about:blank" : r;
                            ft ftVar = new ft(oVar, r, b4);
                            gt gtVar = new gt(oVar, mVar, activity, b4);
                            vs vsVar = new vs(oVar, b5);
                            vs vsVar2 = new vs(oVar, b3);
                            c0 c0Var = new c0(oVar, r, mVar, b2);
                            wa waVar = fbVar2.x;
                            ImageView imageView = fbVar2.f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(fbVar2.I, PorterDuff.Mode.SRC_IN));
                                r8 = 0;
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(fbVar2.getContext().getResources(), favicon));
                                r8 = 0;
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = fbVar2.r;
                            textView.setText(pv3.m(str, textView.getPaint().getFontMetricsInt(), false, r8, 0));
                            try {
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str4 = m01.x(parse, r8, r8, m01.a(parse.getHost()), r8);
                                } catch (Exception e) {
                                    cc4.g(e, false);
                                }
                                str3 = URLDecoder.decode(str4.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                                str3 = str4;
                            }
                            TextView textView2 = fbVar2.s;
                            b4 = 0;
                            textView2.setText(pv3.m(str3, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                            fbVar2.M = gtVar;
                            fbVar2.N = vsVar;
                            fbVar2.O = vsVar2;
                            fbVar2.e.setOnClickListener(new t(fbVar2, ftVar, (byte) 6));
                            fbVar2.n.setOnClickListener(c0Var);
                            fbVar2.b = false;
                            fbVar2.setInput(null);
                            waVar.g3.O(true);
                            waVar.x0(0);
                        }
                        xt xtVar = oVar.i0;
                        y0 y0Var = new y0(mVar, activity, (byte) 2);
                        xs0 xs0Var = xtVar.c0;
                        xs0Var.setText("");
                        xs0Var.setSelection(b4, xs0Var.getText().length());
                        xs0Var.setScrollX(b4);
                        xtVar.w0 = y0Var;
                        xtVar.k(true);
                        break;
                    }
                }
                break;
            case 18:
                fu fuVar = (fu) obj2;
                xi5 xi5Var = (xi5) obj;
                if (fuVar.h == 0) {
                    fuVar.a(1, true);
                    int i2 = ((o) xi5Var).Y;
                    TLRPC.Chat chat = xi5Var.n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = uc7.i1(chat);
                    ConnectionsManager.getInstance(i2).sendRequestTyped(tL_channels_joinChannel, new f((Object) fuVar, i2, (Object) tL_channels_joinChannel, (Object) chat, (byte) 2));
                    break;
                }
                break;
            case 19:
                j20 j20Var = (j20) obj2;
                float[] fArr = (float[]) obj;
                float f = MediaController.z().r0;
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
                MediaController.z().o0(true, fArr[i4]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - j20Var.J2 > 300) {
                    int i5 = uc7.f1().getInt("speedhint", 0) + 1;
                    if (i5 > 2) {
                        i5 = -10;
                    }
                    uc7.f1().edit().putInt("speedhint", i5).apply();
                    if (i5 >= 0 && j20Var.b != null) {
                        u10 u10Var = new u10(5, null, j20Var.getContext(), false);
                        j20Var.I2 = u10Var;
                        u10Var.setExtraTranslationY(hl.L(6.0f));
                        j20Var.I2.setText(ob6.M0(2131744926, null));
                        j20Var.x1.addView(j20Var.I2, tre.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        j20Var.I2.c(j20Var.O1);
                    }
                }
                j20Var.J2 = currentTimeMillis;
                break;
            case 20:
                ((fu5) obj).u();
                ((j20) obj2).K0(6);
                break;
            case 21:
                hl6 hl6Var = (hl6) obj;
                j20 j20Var2 = (j20) ((a20) obj2).G;
                int i6 = j20Var2.a;
                LaunchActivity launchActivity = j20Var2.z2;
                ArrayList arrayList = (ArrayList) uc7.s1(i6).w.get(0);
                if ((arrayList != null ? arrayList.size() : 0) > 10 && !TextUtils.isEmpty(hl6Var.getText().toString())) {
                    String charSequence = hl6Var.getText().toString();
                    if (launchActivity.N().getLastFragment() instanceof uj3) {
                        uj3 uj3Var = (uj3) launchActivity.N().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) uj3Var.getMessagesController().w.get(0);
                        int size = arrayList2 != null ? arrayList2.size() : 0;
                        if (!uj3Var.n2 && (size > 10 || uj3Var.L)) {
                            if (uj3Var.l2) {
                                uj3Var.Y.r.setText(charSequence);
                                uj3Var.Y.r.setSelection(charSequence.length());
                                bj3 bj3Var = uj3Var.D0;
                                if (bj3Var != null && (O = bj3Var.O(3)) >= 0 && uj3Var.D0.getTabsView().getCurrentTabId() != O) {
                                    uj3Var.D0.getTabsView().e(O, O);
                                }
                            } else {
                                uj3Var.y = 3;
                                uj3Var.Y.r.setText(charSequence);
                                uj3Var.Y.r.setSelection(charSequence.length());
                            }
                            j20Var2.dismiss();
                            break;
                        }
                    }
                    uj3 uj3Var2 = new uj3(null);
                    uj3Var2.p2 = charSequence;
                    uj3Var2.y = 3;
                    launchActivity.u0(uj3Var2, false, false);
                    j20Var2.dismiss();
                    break;
                }
                break;
            case 22:
                ob0 ob0Var = (ob0) obj2;
                ((boolean[]) obj)[0] = true;
                ob0Var.K.A1(ob0Var.Z);
                ob0Var.T.dismiss();
                break;
            case 23:
                dc0 dc0Var = (dc0) obj2;
                dc0Var.b(false);
                dc0Var.e.j((ec0) obj);
                break;
            case 24:
                ((at0) obj2).q0((Context) obj, view);
                break;
            case 25:
                xw0 xw0Var = (xw0) obj2;
                lp0 lp0Var = (lp0) obj;
                if (lp0Var.c()) {
                    lp0Var.a();
                } else {
                    File file = lp0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = lp0Var.d;
                        hl.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                fu5 fu5Var = xw0Var.P0;
                if (fu5Var != null) {
                    fu5Var.u();
                    xw0Var.P0 = null;
                    break;
                }
                break;
            case 26:
                hl.g(((TL_account.TL_businessChatLink) obj2).link);
                d31.b0((zu1) obj).k(false).j();
                break;
            case 27:
                ((z61) ((x61) obj2).f).w0((sg2) obj);
                break;
            case 28:
                h71 h71Var = (h71) obj2;
                p71 p71Var = (p71) obj;
                l71 l71Var = h71Var.f.G;
                if (l71Var != null) {
                    l71Var.g(p71Var.c, p71Var.d, true);
                }
                n8 n8Var = h71Var.a;
                if (n8Var != null) {
                    n8Var.d(true);
                    break;
                }
                break;
            default:
                i91 i91Var = (i91) obj2;
                f91 f91Var = (f91) obj;
                ArrayList arrayList3 = f91Var.b;
                if (arrayList3.size() != 1) {
                    boolean z3 = f91Var.e;
                    HashSet hashSet = new HashSet();
                    int size2 = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj3 = arrayList3.get(i7);
                        i7++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f91Var.c.get(0)).id;
                    id idVar5 = new id(3, null, i91Var.getParentActivity());
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i91Var.getMessagesController().l4.E3.f();
                    idVar5.setOnCancelListener(new n81(i91Var, i91Var.getConnectionsManager().sendRequest(getgroupcall, new m81(i91Var, idVar5, hashSet, tL_inputGroupCallInviteMessage, z3, (byte) 1)), b5));
                    idVar5.q(600L);
                    break;
                } else {
                    TLRPC.User user = (TLRPC.User) arrayList3.get(0);
                    TLRPC.UserFull Y1 = i91Var.getMessagesController().Y1(user.id);
                    i91Var.L = user;
                    boolean z4 = f91Var.e;
                    xkc.m(user, z4, z4 || (Y1 != null && Y1.video_calls_available), i91Var.getParentActivity(), null, i91Var.getAccountInstance());
                    break;
                }
        }
    }
}
