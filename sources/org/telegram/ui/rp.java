package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rp(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0860 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        int i10;
        int i11;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i12;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        ActionBarLayout actionBarLayout;
        int i13 = 8;
        int i14 = 25;
        int i15 = 4;
        int i16 = 2;
        TLRPC.UserFull userFull = null;
        int i17 = 0;
        switch (this.a) {
            case 0:
                int i18 = 3;
                oq oqVar = (oq) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                a0.h hVar2 = oqVar.K;
                a0.h hVar3 = oqVar.L;
                int i19 = oqVar.d1;
                a0.h hVar4 = oqVar.J;
                int i20 = oqVar.N;
                ArrayList arrayList6 = oqVar.E;
                int i21 = 0;
                int i22 = 0;
                while (i22 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i22);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i22);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        i7 = i15;
                        i10 = i22;
                        i11 = i18;
                    } else {
                        if (i20 == 1) {
                            i10 = i22;
                            oqVar.getMessagesController().I3(oqVar.M, tL_channels_channelParticipants);
                        } else {
                            i10 = i22;
                        }
                        oqVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
                        oqVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
                        long e10 = oqVar.getUserConfig().e();
                        if (i19 != 0) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.ij.C1(tL_channels_channelParticipants.participants.get(i23).peer) == e10) {
                                        tL_channels_channelParticipants.participants.remove(i23);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                        if (i20 == 2) {
                            oqVar.j1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = oqVar.G;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = oqVar.F;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList4;
                            i12 = 0;
                            while (i12 < size) {
                                ArrayList arrayList7 = arrayList5;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                                int i24 = i12;
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                if (channelParticipant.user_id == e10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, org.telegram.messenger.ij.C1(channelParticipant.peer));
                                }
                                i12 = i24 + 1;
                                arrayList5 = arrayList7;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            arrayList2 = arrayList5;
                            int size2 = arrayList3.size() + i21;
                            if (i20 == 2) {
                                int size3 = arrayList6.size();
                                int i25 = 0;
                                while (i25 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i25);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long C1 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(C1) != null || hVar2.f(C1) != null || (i19 == 1 && C1 > 0 && org.telegram.messenger.t10.x(oqVar.getMessagesController().a2(Long.valueOf(C1))))) {
                                            arrayList6.remove(i25);
                                            hVar4.l(C1);
                                        }
                                        i25++;
                                    } else {
                                        arrayList6.remove(i25);
                                    }
                                    i25--;
                                    size3--;
                                    i25++;
                                }
                            }
                            i11 = i18;
                            if ((i20 != 0 || i20 == i11 || i20 == 2) && (chat = oqVar.n) != null && chat.megagroup) {
                                chatFull = oqVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    oqVar.E0(arrayList3);
                                    i7 = 4;
                                    i21 = size2;
                                }
                            }
                            if (i20 == 1) {
                                try {
                                    i7 = 4;
                                    try {
                                        Collections.sort(arrayList6, new oe(i7));
                                    } catch (Exception e11) {
                                        e = e11;
                                        org.telegram.messenger.a8.g(e, true);
                                        i21 = size2;
                                        i22 = i10 + 1;
                                        i15 = i7;
                                        i18 = i11;
                                        arrayList4 = arrayList;
                                        arrayList5 = arrayList2;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    i7 = 4;
                                }
                                i21 = size2;
                            }
                            i7 = 4;
                            i21 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList6;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList4;
                        i12 = 0;
                        while (i12 < size) {
                        }
                        arrayList2 = arrayList5;
                        int size22 = arrayList3.size() + i21;
                        if (i20 == 2) {
                        }
                        i11 = i18;
                        if (i20 != 0) {
                        }
                        chatFull = oqVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            oqVar.E0(arrayList3);
                            i7 = 4;
                            i21 = size22;
                        }
                        if (i20 == 1) {
                        }
                        i7 = 4;
                        i21 = size22;
                    }
                    i22 = i10 + 1;
                    i15 = i7;
                    i18 = i11;
                    arrayList4 = arrayList;
                    arrayList5 = arrayList2;
                }
                if (i20 != 2 || oqVar.j1 <= 0) {
                    kq kqVar = oqVar.a;
                    oqVar.D0(kqVar != null ? kqVar.d.c1 : 0);
                    oqVar.P = false;
                    oqVar.Q = true;
                    org.telegram.ui.ActionBar.f5 f5Var = oqVar.f;
                    if (f5Var != null) {
                        f5Var.setVisibility((i20 != 0 || i21 > 5) ? 0 : 8);
                    }
                }
                oqVar.G0();
                kq kqVar2 = oqVar.a;
                if (kqVar2 != null) {
                    bi.q1 q1Var = oqVar.c;
                    q1Var.W1 = oqVar.A1;
                    q1Var.X1 = 0;
                    kqVar2.f();
                    org.telegram.ui.Components.av0 av0Var = oqVar.b;
                    if (av0Var != null && oqVar.a.d.c1 == 0 && oqVar.Q) {
                        av0Var.e(false, true);
                    }
                }
                oqVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ww wwVar = (ww) this.b;
                bd bdVar = (bd) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                wwVar.removeSelfFromStack();
                bdVar.removeSelfFromStack();
                f2Var.finishFragment();
                break;
            case 2:
                ww wwVar2 = (ww) this.b;
                wwVar2.G4((vw) this.c);
                mw mwVar = wwVar2.z0;
                if (mwVar != null && mwVar.getVisibility() == 0) {
                    wwVar2.z0.c();
                    break;
                }
                break;
            case 3:
                nw nwVar = (nw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) this.d;
                ww wwVar3 = nwVar.b;
                if (!zArr[0]) {
                    vy.f1(wwVar3, voVar, null);
                    break;
                } else {
                    wwVar3.presentFragment(new gy(voVar, null));
                    break;
                }
            case 4:
                ix ixVar = (ix) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                ixVar.getClass();
                ixVar.o((TLRPC.TL_messages_stickerSet) tLObject2, ijVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList8 = ExternalActionActivity.y;
                try {
                    u1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.u1 u02 = org.telegram.ui.Components.v4.u0(externalActionActivity, org.telegram.messenger.hd.M0(2131743821, null), true);
                        if (u02 != null) {
                            u02.setOnDismissListener(new bi.u3(10, externalActionActivity, tL_error));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else {
                        if (!"BOT_INVALID".equals(tL_error.text) && !"PUBLIC_KEY_REQUIRED".equals(tL_error.text) && !"PUBLIC_KEY_INVALID".equals(tL_error.text) && !"SCOPE_EMPTY".equals(tL_error.text) && !"PAYLOAD_EMPTY".equals(tL_error.text)) {
                            externalActionActivity.setResult(0);
                            externalActionActivity.finish();
                        }
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    }
                    break;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
                break;
            case 6:
                gz gzVar = (gz) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                gz.x0(tL_error2, gzVar, org.telegram.ui.Components.hc.a0(gzVar));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("n_0", true).apply();
                    gzVar.getMessagesController().c3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    gy gyVar = new gy(gzVar.r, tL_chatlists_exportedChatlistInvite.invite);
                    gyVar.y = new ky(gzVar, 1);
                    gyVar.x = new ky(gzVar, i16);
                    gzVar.presentFragment(gyVar);
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l51(i14, gzVar, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                vy vyVar = (vy) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = vyVar.o1;
                gz.x0(tL_error3, f2Var2, new org.telegram.ui.Components.hc(vyVar.S1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("n_0", true).apply();
                    vyVar.dismiss();
                    f2Var2.getMessagesController().c3(true, null);
                    f2Var2.presentFragment(new gy(vyVar.Q1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                az azVar = (az) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                zy zyVar = (zy) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.hc.a0(azVar.a).t(org.telegram.messenger.hd.M0(2131743880, null), null).j();
                    org.telegram.messenger.g0.r(zyVar);
                    break;
                }
                break;
            case 9:
                e00 e00Var = (e00) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) this.d;
                FiltersSetupActivity filtersSetupActivity = e00Var.e;
                if (u1Var2 != null) {
                    try {
                        u1Var2.dismiss();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                filtersSetupActivity.getMessagesController().h4(voVar2);
                org.telegram.messenger.yr messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.yq(i17, messagesStorage, voVar2));
                break;
            case 10:
                u40 u40Var = (u40) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                w40 w40Var = u40Var.I;
                jg.z1 z1Var = u40Var.f;
                if (u40Var.n) {
                    u40Var.h = null;
                    u40Var.d = arrayList9;
                    u40Var.e = arrayList10;
                    z1Var.f(arrayList9, null);
                    w40Var.v0(u40Var.H);
                    u40Var.f();
                    if (u40Var.n && !z1Var.e() && u40Var.b() == 0) {
                        w40Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                u50 u50Var = (u50) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!u50Var.M) {
                    u50Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.qp.e1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                w50 w50Var = (w50) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                if (w50Var.h) {
                    w50Var.d = arrayList11;
                    w50Var.e = arrayList12;
                    w50Var.f();
                    w50Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                an anVar = (an) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = LaunchActivity.B1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.t10.B(user)) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0(null, null, 2131748183, org.telegram.messenger.t10.j(user, true)), org.telegram.ui.Components.hc.a0(anVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.hc.a0(anVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                q10 q10Var = (q10) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.v4.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                q10 q10Var2 = (q10) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.B1;
                try {
                    q10Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.v4.u0(launchActivity2, org.telegram.messenger.hd.M0(2131743821, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.v4.K(launchActivity2, null, org.telegram.messenger.hd.M0(2131751106, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e16) {
                    org.telegram.messenger.a8.g(e16, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.c;
                File file = (File) this.d;
                String str5 = LaunchActivity.B1;
                j6Var.d(file, j6Var.c);
                org.telegram.messenger.g0.h3(new s60(launchActivity3, i13));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str6 = LaunchActivity.B1;
                int i26 = iArr[0] - 1;
                iArr[0] = i26;
                if (i26 == 0) {
                    org.telegram.messenger.qs.f(launchActivity4.O).k(org.telegram.messenger.qs.v5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    String str7 = LaunchActivity.B1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.R0 = j6Var2;
                    launchActivity5.P0 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                    launchActivity5.Q0 = tL_wallPaper;
                    org.telegram.messenger.w7.G(j6Var2.E).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                x70 x70Var = (x70) this.d;
                String str8 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity6.O).X3(user2, true, false);
                x70Var.a(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                String str11 = LaunchActivity.B1;
                if (!"rebuild".equals(str9)) {
                    if (!"keys".equals(str9)) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                        String str12 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                            str12 = string;
                        }
                        String str13 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                            str13 = string2;
                        }
                        boolean z9 = "night".equals(str9) || !("day".equals(str9) || org.telegram.ui.ActionBar.k6.I.q());
                        if (z9) {
                            str12 = str13;
                        }
                        org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(str12);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z9 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(Q0.m());
                        sb2.append("), style ");
                        sb2.append(str10);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str10)) {
                            if (!"fade".equals(str10)) {
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, new int[]{launchActivity7.x0.getMeasuredWidth() / 2, launchActivity7.x0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z9), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.k6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet s5 = org.telegram.ui.ActionBar.r6.s();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = s5.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.u4.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + s5.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = launchActivity7.q0) != null) {
                            actionBarLayout.X(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e17) {
                        org.telegram.messenger.a8.g(e17, true);
                        return;
                    }
                }
                break;
            case 21:
                p90 p90Var = (p90) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str14 = (String) this.d;
                p90Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.v4.u0(p90Var.a, org.telegram.messenger.hd.M0(2131743821, null), true);
                    }
                    l90 l90Var = new l90(p90Var, str14, 2);
                    if (!password.has_password) {
                        ya1 ya1Var = new ya1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        ya1Var.j0 = l90Var;
                        p90Var.u(ya1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        p90Var.u(twoStepVerificationActivity, false);
                        l90Var.run();
                        break;
                    }
                }
                break;
            case 22:
                m90 m90Var = (m90) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    m90Var.getMessagesController().Y3(tL_users_userFull.users, false);
                    m90Var.getMessagesController().S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.y1.m(user3, false, userFull2 != null && userFull2.video_calls_available, m90Var.getParentActivity(), userFull2, m90Var.getAccountInstance());
                break;
            case 23:
                pa0 pa0Var = (pa0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(pa0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, true);
                }
                org.telegram.messenger.g0.i3(new rp(pa0Var, viewGroup, gLSurfaceView, i14), 100L);
                break;
            case 24:
                pa0 pa0Var2 = (pa0) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                pa0Var2.getClass();
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                pa0Var2.G0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                pa0Var2.finishFragment();
                break;
            case 25:
                pa0 pa0Var3 = (pa0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                }
                pa0Var3.I = true;
                pa0Var3.finishFragment();
                break;
            case 26:
                ((ce0) this.b).I1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                ce0 ce0Var = (ce0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                ce0Var.getClass();
                ce0Var.y1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                fi.h7 h7Var = (fi.h7) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                h7Var.getClass();
                editText.removeTextChangedListener(h7Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                ob0 ob0Var = (ob0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                ce0 ce0Var2 = ob0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ce0Var2.F != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            ce0Var2.G1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        ce0Var2.y1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    ce0Var2.finishFragment();
                    ce0Var2.d0.run();
                    break;
                }
                break;
        }
    }
}
