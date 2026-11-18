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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ up(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x084d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [int] */
    /* JADX WARN: Type inference failed for: r12v24 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i10;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        ActionBarLayout actionBarLayout;
        int i11 = 8;
        int i12 = 2;
        int i13 = 3;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i14 = 1;
        switch (this.a) {
            case 0:
                rq rqVar = (rq) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                a0.h hVar2 = rqVar.L;
                a0.h hVar3 = rqVar.M;
                int i15 = rqVar.e1;
                a0.h hVar4 = rqVar.K;
                int i16 = rqVar.O;
                ArrayList arrayList6 = rqVar.F;
                int i17 = 0;
                int i18 = 0;
                while (i18 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i18);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i18);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                    } else {
                        if (i16 == i14) {
                            i7 = i14;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            rqVar.getMessagesController().P3(rqVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            i7 = i14;
                        }
                        rqVar.getMessagesController().f4(tL_channels_channelParticipants.users, z10);
                        rqVar.getMessagesController().Z3(tL_channels_channelParticipants.chats, z10);
                        long e10 = rqVar.getUserConfig().e();
                        if (i15 != 0) {
                            ?? r12 = z10;
                            while (true) {
                                if (r12 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.fj.B1(tL_channels_channelParticipants.participants.get(r12).peer) == e10) {
                                        tL_channels_channelParticipants.participants.remove((int) r12);
                                    } else {
                                        r12++;
                                    }
                                }
                            }
                        }
                        if (i16 == 2) {
                            rqVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = rqVar.H;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = rqVar.G;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i10 = 0;
                            while (i10 < size) {
                                long j3 = e10;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                if (channelParticipant.user_id == j3) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, org.telegram.messenger.fj.B1(channelParticipant.peer));
                                }
                                i10++;
                                e10 = j3;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            int size2 = arrayList3.size() + i17;
                            if (i16 == 2) {
                                int size3 = arrayList6.size();
                                int i19 = 0;
                                while (i19 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i19);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long B1 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(B1) != null || hVar2.f(B1) != null || (i15 == i7 && B1 > 0 && org.telegram.messenger.o10.y(rqVar.getMessagesController().c2(Long.valueOf(B1))))) {
                                            arrayList6.remove(i19);
                                            hVar4.l(B1);
                                            i19--;
                                            size3--;
                                        }
                                    } else {
                                        arrayList6.remove(i19);
                                        i19--;
                                        size3--;
                                    }
                                    i19++;
                                    i7 = 1;
                                }
                            }
                            if ((i16 != 0 || i16 == 3 || i16 == 2) && (chat = rqVar.n) != null && chat.megagroup) {
                                chatFull = rqVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    rqVar.E0(arrayList3);
                                    i17 = size2;
                                }
                            }
                            if (i16 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList6, new pe(3));
                                    } catch (Exception e11) {
                                        e = e11;
                                        org.telegram.messenger.a8.g(e, true);
                                        i17 = size2;
                                        i18++;
                                        arrayList4 = arrayList;
                                        arrayList5 = arrayList2;
                                        z10 = false;
                                        i14 = 1;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                i17 = size2;
                            }
                            i17 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList6;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        int size22 = arrayList3.size() + i17;
                        if (i16 == 2) {
                        }
                        if (i16 != 0) {
                        }
                        chatFull = rqVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            rqVar.E0(arrayList3);
                            i17 = size22;
                        }
                        if (i16 == 1) {
                        }
                        i17 = size22;
                    }
                    i18++;
                    arrayList4 = arrayList;
                    arrayList5 = arrayList2;
                    z10 = false;
                    i14 = 1;
                }
                if (i16 != 2 || rqVar.k1 <= 0) {
                    nq nqVar = rqVar.a;
                    rqVar.D0(nqVar != null ? nqVar.d.d1 : 0);
                    rqVar.Q = false;
                    rqVar.R = true;
                    org.telegram.ui.ActionBar.h5 h5Var = rqVar.f;
                    if (h5Var != null) {
                        h5Var.setVisibility((i16 != 0 || i17 > 5) ? 0 : 8);
                    }
                }
                rqVar.G0();
                nq nqVar2 = rqVar.a;
                if (nqVar2 != null) {
                    di.b1 b1Var = rqVar.c;
                    b1Var.X1 = rqVar.B1;
                    b1Var.Y1 = 0;
                    nqVar2.f();
                    org.telegram.ui.Components.kv0 kv0Var = rqVar.b;
                    if (kv0Var != null && rqVar.a.d.d1 == 0 && rqVar.R) {
                        kv0Var.e(false, true);
                    }
                }
                rqVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                cx cxVar = (cx) this.b;
                ad adVar = (ad) this.c;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                cxVar.removeSelfFromStack();
                adVar.removeSelfFromStack();
                h2Var.finishFragment();
                break;
            case 2:
                cx cxVar2 = (cx) this.b;
                cxVar2.O4((bx) this.c);
                rw rwVar = cxVar2.A0;
                if (rwVar != null && rwVar.getVisibility() == 0) {
                    cxVar2.A0.d();
                    break;
                }
                break;
            case 3:
                tw twVar = (tw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) this.d;
                cx cxVar3 = twVar.b;
                if (!zArr[0]) {
                    zy.g1(cxVar3, roVar, null);
                    break;
                } else {
                    cxVar3.presentFragment(new ky(roVar, null));
                    break;
                }
            case 4:
                nx nxVar = (nx) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                nxVar.getClass();
                nxVar.o((TLRPC.TL_messages_stickerSet) tLObject2, fjVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList7 = ExternalActionActivity.y;
                try {
                    u1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.u1 u02 = org.telegram.ui.Components.b5.u0(externalActionActivity, org.telegram.messenger.gd.M0(2131743583, null), true);
                        if (u02 != null) {
                            u02.setOnDismissListener(new di.u1(i11, externalActionActivity, tL_error));
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
                kz kzVar = (kz) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                kz.x0(tL_error2, kzVar, org.telegram.ui.Components.lc.b0(kzVar));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.mp.g1().edit().putBoolean("n_0", true).apply();
                    kzVar.getMessagesController().i3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    ky kyVar = new ky(kzVar.r, tL_chatlists_exportedChatlistInvite.invite);
                    kyVar.y = new oy(kzVar, i14);
                    kyVar.x = new oy(kzVar, i12);
                    kzVar.presentFragment(kyVar);
                    org.telegram.messenger.g0.h3(new vs(16, kzVar, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                zy zyVar = (zy) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.h2 h2Var2 = zyVar.s1;
                kz.x0(tL_error3, h2Var2, new org.telegram.ui.Components.lc(zyVar.W1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.mp.g1().edit().putBoolean("n_0", true).apply();
                    zyVar.dismiss();
                    h2Var2.getMessagesController().i3(true, null);
                    h2Var2.presentFragment(new ky(zyVar.U1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                ez ezVar = (ez) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                dz dzVar = (dz) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.lc.b0(ezVar.a).t(org.telegram.messenger.gd.M0(2131743642, null), null).j();
                    org.telegram.messenger.g0.r(dzVar);
                    break;
                }
                break;
            case 9:
                j00 j00Var = (j00) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                org.telegram.messenger.ro roVar2 = (org.telegram.messenger.ro) this.d;
                FiltersSetupActivity filtersSetupActivity = j00Var.e;
                if (u1Var2 != null) {
                    try {
                        u1Var2.dismiss();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                filtersSetupActivity.getMessagesController().p4(roVar2);
                org.telegram.messenger.tr messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.rq(i13, messagesStorage, roVar2));
                break;
            case 10:
                x40 x40Var = (x40) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                z40 z40Var = x40Var.J;
                jg.z1 z1Var = x40Var.f;
                if (x40Var.n) {
                    x40Var.h = null;
                    x40Var.d = arrayList8;
                    x40Var.e = arrayList9;
                    z1Var.f(arrayList8, null);
                    z40Var.v0(x40Var.I);
                    x40Var.f();
                    if (x40Var.n && !z1Var.e() && x40Var.b() == 0) {
                        z40Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                v50 v50Var = (v50) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!v50Var.N) {
                    v50Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.mp.g1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                x50 x50Var = (x50) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                if (x50Var.h) {
                    x50Var.d = arrayList10;
                    x50Var.e = arrayList11;
                    x50Var.f();
                    x50Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                bn bnVar = (bn) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = LaunchActivity.C1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.o10.C(user)) {
                        org.telegram.messenger.n10.u(org.telegram.messenger.gd.a0(null, null, 2131747992, org.telegram.messenger.o10.k(user, true)), org.telegram.ui.Components.lc.b0(bnVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.lc.b0(bnVar).g0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                o60 o60Var = (o60) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = LaunchActivity.C1;
                try {
                    o60Var.run();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.b5.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                o60 o60Var2 = (o60) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.C1;
                try {
                    o60Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.b5.u0(launchActivity2, org.telegram.messenger.gd.M0(2131743583, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.b5.K(launchActivity2, null, org.telegram.messenger.gd.M0(2131751094, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e16) {
                    org.telegram.messenger.a8.g(e16, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.c;
                File file = (File) this.d;
                String str5 = LaunchActivity.C1;
                m6Var.d(file, m6Var.c);
                org.telegram.messenger.g0.g3(new t60(launchActivity3, i11));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str6 = LaunchActivity.C1;
                int i20 = iArr[0] - 1;
                iArr[0] = i20;
                if (i20 == 0) {
                    org.telegram.messenger.ks.f(launchActivity4.P).k(org.telegram.messenger.ks.y5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    String str7 = LaunchActivity.C1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.S0 = m6Var2;
                    launchActivity5.Q0 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                    launchActivity5.R0 = tL_wallPaper;
                    org.telegram.messenger.w7.G(m6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                y70 y70Var = (y70) this.d;
                String str8 = LaunchActivity.C1;
                org.telegram.messenger.mp.u1(launchActivity6.P).e4(user2, true, false);
                y70Var.a(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                String str11 = LaunchActivity.C1;
                if (!"rebuild".equals(str9)) {
                    if (!"keys".equals(str9)) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                        String str12 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.n6.Q0(string) != null && !org.telegram.ui.ActionBar.n6.Q0(string).q()) {
                            str12 = string;
                        }
                        String str13 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.n6.Q0(string2) != null && org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
                            str13 = string2;
                        }
                        boolean z11 = "night".equals(str9) || !("day".equals(str9) || org.telegram.ui.ActionBar.n6.I.q());
                        if (z11) {
                            str12 = str13;
                        }
                        org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0(str12);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z11 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(Q0.m());
                        sb2.append("), style ");
                        sb2.append(str10);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str10)) {
                            if (!"fade".equals(str10)) {
                                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, Q0, Boolean.FALSE, new int[]{launchActivity7.y0.getMeasuredWidth() / 2, launchActivity7.y0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z11), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.n6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet r10 = org.telegram.ui.ActionBar.u6.r();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = r10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.w4.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + r10.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = launchActivity7.r0) != null) {
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
                s90 s90Var = (s90) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str14 = (String) this.d;
                s90Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.b5.u0(s90Var.a, org.telegram.messenger.gd.M0(2131743583, null), true);
                    }
                    l90 l90Var = new l90(s90Var, str14, 2);
                    if (!password.has_password) {
                        bb1 bb1Var = new bb1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        bb1Var.k0 = l90Var;
                        s90Var.u(bb1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.J = password;
                        twoStepVerificationActivity.K = false;
                        s90Var.u(twoStepVerificationActivity, false);
                        l90Var.run();
                        break;
                    }
                }
                break;
            case 22:
                p90 p90Var = (p90) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    p90Var.getMessagesController().f4(tL_users_userFull.users, false);
                    p90Var.getMessagesController().Z3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.b2.m(user3, false, userFull2 != null && userFull2.video_calls_available, p90Var.getParentActivity(), userFull2, p90Var.getAccountInstance());
                break;
            case 23:
                qa0 qa0Var = (qa0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(qa0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, true);
                }
                org.telegram.messenger.g0.h3(new up(qa0Var, viewGroup, gLSurfaceView, 24), 100L);
                break;
            case 24:
                qa0 qa0Var2 = (qa0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                }
                qa0Var2.J = true;
                qa0Var2.finishFragment();
                break;
            case 25:
                qa0 qa0Var3 = (qa0) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                qa0Var3.getClass();
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                qa0Var3.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                qa0Var3.finishFragment();
                break;
            case 26:
                ((ee0) this.b).I1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                ee0 ee0Var = (ee0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                ee0Var.getClass();
                ee0Var.y1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                bi.v vVar = (bi.v) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                vVar.getClass();
                editText.removeTextChangedListener(vVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                pb0 pb0Var = (pb0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                ee0 ee0Var2 = pb0Var.a0;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ee0Var2.G != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            ee0Var2.G1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        ee0Var2.y1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    ee0Var2.finishFragment();
                    ee0Var2.e0.run();
                    break;
                }
                break;
        }
    }
}
