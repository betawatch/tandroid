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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tp(Object obj, Object obj2, Object obj3, int i7) {
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
                qq qqVar = (qq) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                a0.h hVar2 = qqVar.K;
                a0.h hVar3 = qqVar.L;
                int i19 = qqVar.d1;
                a0.h hVar4 = qqVar.J;
                int i20 = qqVar.N;
                ArrayList arrayList6 = qqVar.E;
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
                            qqVar.getMessagesController().I3(qqVar.M, tL_channels_channelParticipants);
                        } else {
                            i10 = i22;
                        }
                        qqVar.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
                        qqVar.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
                        long e10 = qqVar.getUserConfig().e();
                        if (i19 != 0) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.ij.B1(tL_channels_channelParticipants.participants.get(i23).peer) == e10) {
                                        tL_channels_channelParticipants.participants.remove(i23);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                        if (i20 == 2) {
                            qqVar.j1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = qqVar.G;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = qqVar.F;
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
                                    hVar.k(channelParticipant, org.telegram.messenger.ij.B1(channelParticipant.peer));
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
                                        long B1 = org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(B1) != null || hVar2.f(B1) != null || (i19 == 1 && B1 > 0 && org.telegram.messenger.t10.x(qqVar.getMessagesController().a2(Long.valueOf(B1))))) {
                                            arrayList6.remove(i25);
                                            hVar4.l(B1);
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
                            if ((i20 != 0 || i20 == i11 || i20 == 2) && (chat = qqVar.n) != null && chat.megagroup) {
                                chatFull = qqVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    qqVar.E0(arrayList3);
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
                        chatFull = qqVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            qqVar.E0(arrayList3);
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
                if (i20 != 2 || qqVar.j1 <= 0) {
                    mq mqVar = qqVar.a;
                    qqVar.D0(mqVar != null ? mqVar.d.c1 : 0);
                    qqVar.P = false;
                    qqVar.Q = true;
                    org.telegram.ui.ActionBar.f5 f5Var = qqVar.f;
                    if (f5Var != null) {
                        f5Var.setVisibility((i20 != 0 || i21 > 5) ? 0 : 8);
                    }
                }
                qqVar.G0();
                mq mqVar2 = qqVar.a;
                if (mqVar2 != null) {
                    bi.q1 q1Var = qqVar.c;
                    q1Var.W1 = qqVar.A1;
                    q1Var.X1 = 0;
                    mqVar2.f();
                    org.telegram.ui.Components.cv0 cv0Var = qqVar.b;
                    if (cv0Var != null && qqVar.a.d.c1 == 0 && qqVar.Q) {
                        cv0Var.e(false, true);
                    }
                }
                qqVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                yw ywVar = (yw) this.b;
                bd bdVar = (bd) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                ywVar.removeSelfFromStack();
                bdVar.removeSelfFromStack();
                f2Var.finishFragment();
                break;
            case 2:
                yw ywVar2 = (yw) this.b;
                ywVar2.G4((xw) this.c);
                ow owVar = ywVar2.z0;
                if (owVar != null && owVar.getVisibility() == 0) {
                    ywVar2.z0.c();
                    break;
                }
                break;
            case 3:
                pw pwVar = (pw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) this.d;
                yw ywVar3 = pwVar.b;
                if (!zArr[0]) {
                    xy.f1(ywVar3, voVar, null);
                    break;
                } else {
                    ywVar3.presentFragment(new iy(voVar, null));
                    break;
                }
            case 4:
                kx kxVar = (kx) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                kxVar.getClass();
                kxVar.o((TLRPC.TL_messages_stickerSet) tLObject2, ijVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList8 = ExternalActionActivity.y;
                try {
                    u1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.u1 u02 = org.telegram.ui.Components.v4.u0(externalActionActivity, org.telegram.messenger.id.M0(2131743820, null), true);
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
                iz izVar = (iz) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                iz.x0(tL_error2, izVar, org.telegram.ui.Components.hc.a0(izVar));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("n_0", true).apply();
                    izVar.getMessagesController().c3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    iy iyVar = new iy(izVar.r, tL_chatlists_exportedChatlistInvite.invite);
                    iyVar.y = new my(izVar, 1);
                    iyVar.x = new my(izVar, i16);
                    izVar.presentFragment(iyVar);
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Components.m51(i14, izVar, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                xy xyVar = (xy) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = xyVar.o1;
                iz.x0(tL_error3, f2Var2, new org.telegram.ui.Components.hc(xyVar.S1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("n_0", true).apply();
                    xyVar.dismiss();
                    f2Var2.getMessagesController().c3(true, null);
                    f2Var2.presentFragment(new iy(xyVar.Q1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                cz czVar = (cz) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                bz bzVar = (bz) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.hc.a0(czVar.a).t(org.telegram.messenger.id.M0(2131743879, null), null).j();
                    org.telegram.messenger.g0.r(bzVar);
                    break;
                }
                break;
            case 9:
                g00 g00Var = (g00) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) this.d;
                FiltersSetupActivity filtersSetupActivity = g00Var.e;
                if (u1Var2 != null) {
                    try {
                        u1Var2.dismiss();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                filtersSetupActivity.getMessagesController().h4(voVar2);
                org.telegram.messenger.yr messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.zq(i17, messagesStorage, voVar2));
                break;
            case 10:
                w40 w40Var = (w40) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                y40 y40Var = w40Var.I;
                jg.z1 z1Var = w40Var.f;
                if (w40Var.n) {
                    w40Var.h = null;
                    w40Var.d = arrayList9;
                    w40Var.e = arrayList10;
                    z1Var.f(arrayList9, null);
                    y40Var.v0(w40Var.H);
                    w40Var.f();
                    if (w40Var.n && !z1Var.e() && w40Var.b() == 0) {
                        y40Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                w50 w50Var = (w50) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!w50Var.M) {
                    w50Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.qp.e1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                y50 y50Var = (y50) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                if (y50Var.h) {
                    y50Var.d = arrayList11;
                    y50Var.e = arrayList12;
                    y50Var.f();
                    y50Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                cn cnVar = (cn) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = LaunchActivity.B1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.t10.B(user)) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131748184, org.telegram.messenger.t10.j(user, true)), org.telegram.ui.Components.hc.a0(cnVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.hc.a0(cnVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                s10 s10Var = (s10) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = LaunchActivity.B1;
                try {
                    s10Var.run();
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
                s10 s10Var2 = (s10) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.B1;
                try {
                    s10Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.v4.u0(launchActivity2, org.telegram.messenger.id.M0(2131743820, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.v4.K(launchActivity2, null, org.telegram.messenger.id.M0(2131751105, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e16) {
                    org.telegram.messenger.a8.g(e16, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.c;
                File file = (File) this.d;
                String str5 = LaunchActivity.B1;
                k6Var.d(file, k6Var.c);
                org.telegram.messenger.g0.h3(new u60(launchActivity3, i13));
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
                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    String str7 = LaunchActivity.B1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.R0 = k6Var2;
                    launchActivity5.P0 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                    launchActivity5.Q0 = tL_wallPaper;
                    org.telegram.messenger.w7.G(k6Var2.E).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                z70 z70Var = (z70) this.d;
                String str8 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity6.O).X3(user2, true, false);
                z70Var.a(user2);
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
                        if (org.telegram.ui.ActionBar.l6.Q0(string) != null && !org.telegram.ui.ActionBar.l6.Q0(string).q()) {
                            str12 = string;
                        }
                        String str13 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.l6.Q0(string2) != null && org.telegram.ui.ActionBar.l6.Q0(string2).q()) {
                            str13 = string2;
                        }
                        boolean z9 = "night".equals(str9) || !("day".equals(str9) || org.telegram.ui.ActionBar.l6.I.q());
                        if (z9) {
                            str12 = str13;
                        }
                        org.telegram.ui.ActionBar.k6 Q0 = org.telegram.ui.ActionBar.l6.Q0(str12);
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
                                org.telegram.ui.ActionBar.l6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet r10 = org.telegram.ui.ActionBar.s6.r();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = r10.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.u4.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + r10.size() + "): " + ((Object) sb3));
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
                r90 r90Var = (r90) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str14 = (String) this.d;
                r90Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.v4.u0(r90Var.a, org.telegram.messenger.id.M0(2131743820, null), true);
                    }
                    n90 n90Var = new n90(r90Var, str14, 2);
                    if (!password.has_password) {
                        bb1 bb1Var = new bb1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        bb1Var.j0 = n90Var;
                        r90Var.u(bb1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        r90Var.u(twoStepVerificationActivity, false);
                        n90Var.run();
                        break;
                    }
                }
                break;
            case 22:
                o90 o90Var = (o90) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    o90Var.getMessagesController().Y3(tL_users_userFull.users, false);
                    o90Var.getMessagesController().S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.y1.m(user3, false, userFull2 != null && userFull2.video_calls_available, o90Var.getParentActivity(), userFull2, o90Var.getAccountInstance());
                break;
            case 23:
                ra0 ra0Var = (ra0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(ra0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, true);
                }
                org.telegram.messenger.g0.i3(new tp(ra0Var, viewGroup, gLSurfaceView, i14), 100L);
                break;
            case 24:
                ra0 ra0Var2 = (ra0) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                ra0Var2.getClass();
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                ra0Var2.G0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                ra0Var2.finishFragment();
                break;
            case 25:
                ra0 ra0Var3 = (ra0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e19) {
                    org.telegram.messenger.a8.g(e19, true);
                }
                ra0Var3.I = true;
                ra0Var3.finishFragment();
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
                fi.h7 h7Var = (fi.h7) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                h7Var.getClass();
                editText.removeTextChangedListener(h7Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                qb0 qb0Var = (qb0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                ee0 ee0Var2 = qb0Var.W;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || ee0Var2.F != 3) {
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
                    ee0Var2.d0.run();
                    break;
                }
                break;
        }
    }
}
