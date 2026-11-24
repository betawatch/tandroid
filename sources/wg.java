// default package

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wg implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wg(int i, View view, AtomicReference atomicReference) {
        this.a = (byte) 23;
        this.b = i;
        this.c = view;
        this.d = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fl flVar;
        int i;
        int i2;
        Integer num;
        View view2;
        int R;
        byte b = this.a;
        byte b2 = 15;
        byte b3 = 5;
        byte b4 = 2;
        boolean z = false;
        byte b5 = 1;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((hn7) obj2).setValue(i3);
                ((ug) obj).run();
                break;
            case 1:
                zi1 zi1Var = (zi1) obj2;
                uxa uxaVar = (uxa) obj;
                oi1 oi1Var = zi1Var.G0;
                if (view.isEnabled() && !oi1Var.R && !zi1Var.A0.R) {
                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                    if (zi1Var.B0 <= currentTime) {
                        if (zi1Var.N0 >= na7.q1(i3).k4.q2.f()) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            gi1 gi1Var = new gi1(zi1Var, twoStepVerificationActivity, b4);
                            twoStepVerificationActivity.a0 = (byte) 1;
                            twoStepVerificationActivity.c0 = gi1Var;
                            oi1Var.setLoading(true);
                            twoStepVerificationActivity.w0(new hi1(zi1Var, uxaVar, twoStepVerificationActivity, b4));
                            break;
                        } else {
                            u21.b0(uxaVar).M(zi1Var.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), gl.N2(k96.G((int) na7.q1(i3).k4.q2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new fi1(zi1Var, i3, b5), null)).j();
                            break;
                        }
                    } else {
                        zi1Var.P0 = u21.b0(uxaVar).Q(R.raw.timer_3, 36, gl.S2(k96.a0(null, null, 2131752940, ss0.w0(zi1Var.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 2:
                mu1 mu1Var = (mu1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (mu1Var.m1 != null && mu1Var.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i3);
                    break;
                }
                break;
            case 3:
                mu1 mu1Var2 = (mu1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (mu1Var2.v5 != null && i3 < arrayList.size()) {
                    mu1Var2.Ja(((Integer) arrayList.get(i3)).intValue());
                    break;
                }
                break;
            case 4:
                ((vt4) obj2).c(new eg(obj, i3, (byte) 23));
                break;
            case 5:
                r32 r32Var = (r32) obj2;
                wjb wjbVar = (wjb) obj;
                cs5 G = cs5.G(r32Var, wjbVar, r32Var.y);
                G.T = true;
                G.b(R.drawable.msg_addbot, k96.M0(2131742894, null), new va7(r32Var, i3, wjbVar, b2), false);
                G.b(R.drawable.menu_comments, k96.M0(2131742962, null), new j32(r32Var, r7), false);
                G.s = (short) 0;
                G.b0(0.0f, -gl.L(48.0f));
                G.a0();
                break;
            case 6:
                sd3 sd3Var = (sd3) obj2;
                l5c l5cVar = (l5c) obj;
                if (!sd3Var.Y0()) {
                    r7 = i3 <= 0 ? (byte) 1 : (byte) 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = sd3Var.r2;
                    boolean z2 = r7 ^ 1;
                    tL_chatBannedRights.send_media = z2;
                    tL_chatBannedRights.send_photos = z2;
                    tL_chatBannedRights.send_videos = z2;
                    tL_chatBannedRights.send_stickers = z2;
                    tL_chatBannedRights.send_gifs = z2;
                    tL_chatBannedRights.send_inline = z2;
                    tL_chatBannedRights.send_games = z2;
                    tL_chatBannedRights.send_audios = z2;
                    tL_chatBannedRights.send_docs = z2;
                    tL_chatBannedRights.send_voices = z2;
                    tL_chatBannedRights.send_roundvideos = z2;
                    tL_chatBannedRights.embed_links = z2;
                    tL_chatBannedRights.send_polls = z2;
                    tL_chatBannedRights.send_reactions = z2;
                    sd3Var.c1();
                    l5cVar.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sd3Var.getContext());
                    String M0 = k96.M0(2131743480, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131743479, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    hdVar.show();
                    break;
                }
            case 7:
                ((cj3) obj2).S3(i3, (cs5) obj);
                break;
            case 8:
                xf5 xf5Var = (xf5) obj2;
                xf5Var.n = i3;
                xf5Var.b.e(false, view.getLeft());
                xf5Var.c.e(false, view.getRight());
                ((uc7) obj).a(i3);
                xf5Var.invalidate();
                break;
            case 9:
                ((ah6) obj2).k0(i3, (cs5) obj);
                break;
            case 10:
                boolean[] zArr = (boolean[]) obj2;
                wy8[] wy8VarArr = (wy8[]) obj;
                zArr[0] = i3 == 1;
                int i4 = 0;
                while (i4 < 2) {
                    wy8VarArr[i4].c.a(zArr[0] == (i4 == 1), true);
                    i4++;
                }
                break;
            case 11:
                ks7 ks7Var = (ks7) obj2;
                ks7Var.a(i3);
                ks7Var.b.w().i(i3 - 1, true);
                ks7Var.b.s((m01) obj);
                break;
            case 12:
                b48 b48Var = (b48) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = b48Var.G1;
                d dVar = b48Var.s1;
                int i5 = b48Var.z1;
                if (i3 < i5 || i3 >= b48Var.A1) {
                    int i6 = b48Var.B1;
                    flVar = (i3 < i6 || i3 >= b48Var.C1) ? null : (fl) b48Var.F1.get(i3 - i6);
                } else {
                    flVar = (fl) arrayList2.get(i3 - i5);
                }
                if (flVar != null) {
                    if (!b48Var.D1) {
                        flVar.d = !flVar.d;
                        if (i3 >= b48Var.z1 && i3 < b48Var.A1) {
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayList2.size()) {
                                    if (((fl) arrayList2.get(i7)).d) {
                                        z = true;
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                            b48Var.r1.setEnabled(z);
                            b48Var.D0();
                        }
                        ((z38) viewGroup).setChecked(flVar.d);
                        break;
                    } else {
                        int i8 = flVar.c;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                if (i8 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dVar.getParentActivity());
                                    alertDialog$Builder2.e(new CharSequence[]{k96.M0(2131751755, null)}, new fe((Object) b48Var, (Object) flVar, (byte) 8));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String c = flVar.c(false);
                                    if (!c.startsWith("http")) {
                                        c = "http://".concat(c);
                                    }
                                    d01.t(dVar.getParentActivity(), c);
                                    break;
                                }
                            } else {
                                d01.t(dVar.getParentActivity(), "mailto:" + flVar.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + flVar.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                dVar.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e) {
                                fa4.g(e, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 13:
                lca lcaVar = (lca) obj2;
                d dVar2 = (d) obj;
                wf2 wf2Var = lcaVar.G;
                wf2Var.a(!wf2Var.a.q, true);
                boolean z3 = wf2Var.a.q;
                u21 b0 = u21.b0(dVar2);
                if (z3) {
                    i = R.raw.silent_unmute;
                    i2 = 2131750240;
                } else {
                    i = R.raw.silent_mute;
                    i2 = 2131750239;
                }
                b0.P(i, k96.M0(i2, null)).j();
                lcaVar.d.h = Boolean.valueOf(z3);
                if (lcaVar.I >= 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(lcaVar.I, true);
                    lcaVar.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = na7.q1(i3).h1(lcaVar.c);
                togglechatstargiftnotifications.enabled = z3;
                ConnectionsManager.getInstance(i3).sendRequest(togglechatstargiftnotifications, new hj7(lcaVar, dVar2, b2));
                break;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                ((m8) obj).d(true);
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((op9) saveToGallerySettingsActivity.s.get(i3)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                h04 h04Var = (h04) obj;
                tx9 tx9Var = ((tw9) obj2).c;
                if (!h04Var.e && !y6c.h(tx9Var.W).p()) {
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new jh8(tx9Var.d1, tx9Var.getContext(), tx9Var.W, 11, false));
                        break;
                    }
                } else {
                    int i9 = 0;
                    while (true) {
                        rw9 rw9Var = tx9Var.i0;
                        if (i9 >= rw9Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((rw9Var.getChildAt(i9) instanceof yw9) && (R = RecyclerView.R((view2 = rw9Var.getChildAt(i9)))) >= 0 && tx9Var.z0.get(R) == i3) {
                            num = Integer.valueOf(R);
                        } else {
                            i9++;
                        }
                    }
                    if (num != null) {
                        tx9Var.h(num.intValue(), view2);
                    }
                    qx3.E0(null, h04Var.b, false, null, null);
                    tx9Var.C0.add(Long.valueOf(h04Var.b.id));
                    tx9Var.B(true, true, true);
                    break;
                }
                break;
            case 16:
                zda zdaVar = (zda) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nfa nfaVar = zdaVar.f;
                d dVar3 = nfaVar.y1;
                dVar3.finishPreviewFragment();
                chat.left = false;
                zdaVar.E(false);
                zdaVar.r(i3);
                if (zdaVar.d.isEmpty()) {
                    nfaVar.N1(true);
                    nfaVar.y();
                }
                dVar3.getNotificationCenter().k(203, Long.valueOf(-nfaVar.m1));
                dVar3.getMessagesController().k(chat.id, dVar3.getUserConfig().f(), null, dVar3, new t7a(zdaVar, chat, b3));
                break;
            case 17:
                d01.t((Context) obj2, "https://" + na7.q1(i3).N2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 18:
                ((r15) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i3);
                break;
            case 19:
                x4c x4cVar = (x4c) obj2;
                x4cVar.e.a(true, true);
                na7.q1(i3).P1().f(false, (ArrayList) obj, new jq0(x4cVar, i3, (byte) 5));
                break;
            case 20:
                ((ae9) obj).a(Integer.valueOf(i3));
                ((cmc) obj2).setSelected(i3);
                break;
            case 21:
                ((qqc) obj2).a(i3, ((pqc) obj).h);
                break;
            case 22:
                u41 u41Var = (u41) obj2;
                fx0 fx0Var = (fx0) obj;
                if (!u41Var.R) {
                    gl2 gl2Var = xrc.d;
                    if (gl2Var != null && ((byte[]) gl2Var.f) != null) {
                        u41Var.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_requestUrlAuth, new hc(r7), new u15(u41Var, fx0Var, i10, view, gl2Var));
                        break;
                    } else {
                        fa4.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            default:
                gba.m0 = i3;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putInt("searchEngineType", gba.m0);
                edit.apply();
                ((wgb) ((View) obj2)).w(is9.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
        }
    }

    public /* synthetic */ wg(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ wg(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
