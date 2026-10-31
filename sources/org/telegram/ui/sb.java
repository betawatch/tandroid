package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sb extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static int Q0 = 10;
    public static final int[] R0 = {org.telegram.messenger.zs.T, org.telegram.messenger.zs.s, org.telegram.messenger.zs.t, org.telegram.messenger.zs.D, org.telegram.messenger.zs.G0};
    public boolean A0;
    public final fb B0;
    public ib C0;
    public org.telegram.ui.Components.vj0 D;
    public final ArrayList D0;
    public pb E;
    public final a0.h E0;
    public TextView F;
    public db F0;
    public bh.h G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.sn I;
    public ua I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.q1 J0;
    public ImageView K;
    public int K0;
    public ag.j3 L;
    public final rb L0;
    public org.telegram.ui.Cells.s0 M;
    public long M0;
    public org.telegram.ui.ActionBar.t0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public final RectF P0;
    public boolean Q;
    public AnimatorSet R;
    public boolean S;
    public final int[] T;
    public boolean U;
    public boolean V;
    public bh.i W;
    public qb X;
    public org.telegram.messenger.jj Y;
    public TLRPC.ChannelParticipant Z;
    public final hi.g a;
    public FrameLayout a0;
    public final tg.b b;
    public ImageView b0;
    public final tg.b c;
    public org.telegram.ui.ActionBar.u5 c0;
    public final tg.f d;
    public l0 d0;
    public final int e;
    public k4 e0;
    public final TLRPC.Chat f;
    public TextureView f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public final a0.h k0;
    public final a0.h l0;
    public final HashMap m0;
    public FrameLayout n;
    public final ArrayList n0;
    public final ArrayList o0;
    public final HashSet p0;
    public boolean q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public ArrayList t0;
    public TLRPC.TL_channelAdminLogEventsFilter u0;
    public String v0;
    public ag.b1 w;
    public a0.h w0;
    public UndoView x;
    public final e2.f x0;
    public dh.f y;
    public final HashMap y0;
    public HashMap z0;

    public sb(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = true;
        this.j0 = false;
        this.k0 = new a0.h();
        this.l0 = new a0.h();
        this.m0 = new HashMap();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new HashSet();
        this.u0 = null;
        this.v0 = "";
        this.x0 = new e2.f(R0);
        this.y0 = new HashMap();
        this.B0 = new fb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.H0 = -1;
        this.L0 = new rb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        ei.r rVar = this.glassEngine;
        rVar.a = new va(this);
        rVar.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
        hi.g gVar = new hi.g();
        this.a = gVar;
        tg.b bVar = new tg.b(gVar);
        this.b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.tz.f()) {
            this.d = null;
            this.e = 0;
            tg.b bVar2 = new tg.b(gVar);
            this.c = bVar2;
            bVar2.h = this.glassEngine;
        } else {
            tg.f fVar = new tg.f(false);
            this.d = fVar;
            this.glassEngine.a(fVar);
            hi.f fVar2 = new hi.f(gVar);
            fVar2.d = fVar;
            fVar2.e = -3;
            fVar2.f = gVar;
            if (org.telegram.messenger.sc.e(262144)) {
                hi.f fVar3 = new hi.f(gVar);
                fVar3.d = fVar;
                fVar3.e = -2;
                fVar3.f = gVar;
                tg.b bVar3 = new tg.b(fVar3);
                this.c = bVar3;
                bVar3.h = this.glassEngine;
                int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
                bVar3.b = L;
                bVar3.c = L;
                bVar3.i = true;
                this.e = 0;
            } else {
                tg.b bVar4 = new tg.b(fVar2);
                this.c = bVar4;
                bVar4.h = this.glassEngine;
                int L2 = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
                bVar4.b = L2;
                bVar4.c = L2;
                this.e = org.telegram.messenger.i0.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static void E0(sb sbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.vp messagesController = sbVar.getMessagesController();
        TLRPC.Chat chat = sbVar.f;
        TLRPC.ChatFull M0 = messagesController.M0(chat.id);
        org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(sbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, M0, hashMap, sbVar, M0.id, false, org.telegram.messenger.w3.T(chat));
        c60Var.a2 = new gb(sbVar);
        c60Var.show();
    }

    public static void O0(sb sbVar) {
        if (sbVar.w == null || sbVar.n0.isEmpty()) {
            return;
        }
        sbVar.y.h1(sbVar.o0.size() - 1, (-100000) - sbVar.w.getPaddingTop());
    }

    public static iy0 W0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (org.telegram.ui.Components.dq dqVar : (org.telegram.ui.Components.dq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.dq.class)) {
            if (dqVar != null) {
                Drawable drawable = dqVar.c;
                if (drawable instanceof iy0) {
                    return (iy0) drawable;
                }
            }
        }
        return null;
    }

    public static void Y(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.jj jjVar;
        a0.h hVar = sbVar.k0;
        int i10 = 0;
        sbVar.C0.N = false;
        sbVar.a1(false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).V3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).P3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = sbVar.n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.O = Math.min(sbVar.O, tL_channelAdminLogEvent.id);
                org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(sbVar.currentAccount, tL_channelAdminLogEvent, arrayList, sbVar.m0, sbVar.f, sbVar.T, false);
                if (jjVar2.U >= 0) {
                    hVar.k(jjVar2, tL_channelAdminLogEvent.id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(size);
            if (jjVar3 != null && jjVar3.U != 0 && jjVar3.M1() >= 0) {
                sbVar.l0.k(jjVar3, jjVar3.M1());
            }
            if (jjVar3 != null && (message = jjVar3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            jjVar = null;
                            break;
                        }
                        if (size != i12) {
                            jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
                            if (jjVar.U != 1 && jjVar.M1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                    if (jjVar != null) {
                        jjVar3.C = jjVar;
                    }
                }
                arrayList2.add(jjVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.ui.b0(sbVar.currentAccount).X0(arrayList2, -sbVar.f.id, 0, 0L, new ua(sbVar, 1), sbVar.getClassGuid(), null);
        }
        sbVar.V0();
        sbVar.r0 = false;
        if (!z10) {
            sbVar.q0 = true;
        }
        org.telegram.messenger.i0.Y3(sbVar.n, false, 0.3f, true, true);
        sbVar.w.setEmptyView(sbVar.H);
        pb pbVar = sbVar.E;
        if (pbVar != null) {
            pbVar.f();
        }
        org.telegram.ui.ActionBar.t0 t0Var = sbVar.N;
        if (t0Var != null) {
            if (sbVar.o0.isEmpty() && TextUtils.isEmpty(sbVar.v0)) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
        }
    }

    public static void Z(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || sbVar.getParentActivity() == null) {
            return;
        }
        int i10 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, sbVar.getParentActivity(), sbVar.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
        Rect rect = new Rect();
        sbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, sbVar.getResourceProvider());
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            if (arrayList4.get(i11) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.h1(sbVar.getParentActivity(), sbVar.getResourceProvider()), w7.b6.o(-1, 8));
            } else {
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, sbVar.getParentActivity(), sbVar.getResourceProvider(), i11 == 0, i11 == size + (-1));
                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
                b1Var.j((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                    b1Var.d(sbVar.getThemedColor(org.telegram.ui.ActionBar.t6.q7), sbVar.getThemedColor(org.telegram.ui.ActionBar.t6.p7));
                }
                Integer num = (Integer) arrayList4.get(i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                b1Var.setOnClickListener(new ya(sbVar, i11, arrayList4, num, 0));
            }
            i11++;
            arrayList4 = arrayList;
        }
        cb cbVar = new cb(0, sbVar.X.getContext(), sbVar);
        cbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        cbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        db dbVar = new db(sbVar, cbVar);
        sbVar.F0 = dbVar;
        dbVar.e = true;
        dbVar.c = org.telegram.messenger.zs.x3;
        dbVar.setOutsideTouchable(true);
        sbVar.F0.setClippingEnabled(true);
        sbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
        sbVar.F0.setFocusable(true);
        cbVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
        sbVar.F0.setInputMethodMode(2);
        sbVar.F0.setSoftInputMode(48);
        sbVar.F0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f7)) - cbVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.i0.L(28.0f);
        if (left < org.telegram.messenger.i0.L(6.0f)) {
            left = org.telegram.messenger.i0.L(6.0f);
        } else if (left > (sbVar.w.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f)) - cbVar.getMeasuredWidth()) {
            left = (sbVar.w.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f)) - cbVar.getMeasuredWidth();
        }
        if (org.telegram.messenger.i0.Q1()) {
            int[] iArr = new int[2];
            sbVar.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = sbVar.X.getHeight();
        int L = org.telegram.messenger.i0.L(48.0f) + cbVar.getMeasuredHeight();
        int Q = sbVar.X.Q();
        if (Q > org.telegram.messenger.i0.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            int y3 = (int) (sbVar.w.getY() + view.getTop() + f10);
            i10 = (L - rect.top) - rect.bottom > org.telegram.messenger.i0.L(240.0f) ? (org.telegram.messenger.i0.L(240.0f) - L) + y3 : y3;
            if (i10 < sbVar.w.getY() + org.telegram.messenger.i0.L(24.0f)) {
                i10 = (int) (sbVar.w.getY() + org.telegram.messenger.i0.L(24.0f));
            } else {
                int i12 = height - L;
                if (i10 > i12 - org.telegram.messenger.i0.L(8.0f)) {
                    i10 = i12 - org.telegram.messenger.i0.L(8.0f);
                }
            }
        } else if (!sbVar.inBubbleMode) {
            i10 = org.telegram.messenger.i0.m;
        }
        cbVar.setMaxHeight(height - i10);
        sbVar.F0.showAtLocation(sbVar.w, 51, left, i10);
        sbVar.F0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x036d, code lost:
    
        if (r0.exists() != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(sb sbVar, int i10, ArrayList arrayList, Integer num) {
        TLRPC.Chat L0;
        File file;
        TLRPC.User Z1;
        if (sbVar.Y == null || i10 >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        TLRPC.Chat chat = sbVar.f;
        db dbVar = sbVar.F0;
        if (dbVar != null) {
            dbVar.dismiss();
        }
        org.telegram.messenger.jj jjVar = sbVar.Y;
        if (jjVar == null) {
            return;
        }
        if (intValue == 3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            long Z0 = jjVar.Z0();
            if (0 != Z0) {
                if (Z0 > 0) {
                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(sbVar.currentAccount).Z1(Long.valueOf(Z0));
                    if (Z12 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name)).append((CharSequence) ":\n");
                    }
                } else if (Z0 < 0 && (L0 = org.telegram.messenger.vp.r1(sbVar.currentAccount).L0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) L0.title).append((CharSequence) ":\n");
                }
            }
            if (TextUtils.isEmpty(jjVar.v)) {
                spannableStringBuilder.append((CharSequence) jjVar.k.message);
            } else {
                spannableStringBuilder.append(jjVar.v);
            }
            org.telegram.messenger.i0.g(spannableStringBuilder);
            org.telegram.messenger.z20.r(null, 2131748604, org.telegram.ui.Components.cc.a0(sbVar));
        } else if (intValue == 4) {
            String str = jjVar.k.attachPath;
            if (str != null && str.length() > 0 && !sc.e.x(str)) {
                str = null;
            }
            if (str == null || str.length() == 0) {
                org.telegram.messenger.b8 fileLoader = sbVar.getFileLoader();
                TLRPC.Message message = sbVar.Y.k;
                fileLoader.getClass();
                str = org.telegram.messenger.b8.N(message, false, true).toString();
            }
            int i11 = sbVar.Y.D;
            if (i11 == 3 || i11 == 1) {
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.b) && sbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    sbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    sbVar.Y = null;
                    sbVar.Z = null;
                    return;
                }
                MediaController.d0(str, sbVar.getParentActivity(), sbVar.Y.D == 3 ? 1 : 0, null, null, null);
            }
        } else if (intValue == 5) {
            String str2 = jjVar.k.attachPath;
            if (str2 != null && str2.length() != 0) {
                file = new File(sbVar.Y.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.b8 fileLoader2 = sbVar.getFileLoader();
                TLRPC.Message message2 = sbVar.Y.k;
                fileLoader2.getClass();
                File N = org.telegram.messenger.b8.N(message2, false, true);
                if (N.exists()) {
                    file = N;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    dh.f fVar = sbVar.y;
                    if (fVar != null) {
                        if (fVar.N0() < sbVar.y.B() - 1) {
                            int L02 = sbVar.y.L0();
                            sbVar.g0 = L02;
                            org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) sbVar.w.K(L02);
                            if (ck0Var != null) {
                                sbVar.h0 = ck0Var.a.getTop();
                            } else {
                                sbVar.g0 = -1;
                            }
                        } else {
                            sbVar.g0 = -1;
                        }
                    }
                    org.telegram.ui.ActionBar.s6 v = org.telegram.ui.ActionBar.t6.v(file, sbVar.Y.I0(), null, true);
                    if (v != null) {
                        sbVar.presentFragment(new m91(v));
                    } else {
                        sbVar.g0 = -1;
                        if (sbVar.getParentActivity() == null) {
                            sbVar.Y = null;
                            sbVar.Z = null;
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        String L03 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L03;
                        x1Var.T = org.telegram.messenger.cd.L0(2131749209, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        sbVar.showDialog(x1Var);
                    }
                } else if (org.telegram.messenger.cd.D0().e(file, sbVar.currentAccount)) {
                    sbVar.presentFragment(new LanguageSelectActivity());
                } else {
                    if (sbVar.getParentActivity() == null) {
                        sbVar.Y = null;
                        sbVar.Z = null;
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sbVar.getParentActivity());
                    String L04 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                    x1Var2.R = L04;
                    x1Var2.T = org.telegram.messenger.cd.L0(2131749210, null);
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    sbVar.showDialog(x1Var2);
                }
            }
        } else if (intValue == 6) {
            String str3 = jjVar.k.attachPath;
            if (str3 != null && str3.length() > 0 && !sc.e.x(str3)) {
                str3 = null;
            }
            if (str3 == null || str3.length() == 0) {
                org.telegram.messenger.b8 fileLoader3 = sbVar.getFileLoader();
                TLRPC.Message message3 = sbVar.Y.k;
                fileLoader3.getClass();
                str3 = org.telegram.messenger.b8.N(message3, false, true).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(sbVar.Y.F0().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Activity parentActivity = sbVar.getParentActivity();
                    org.telegram.messenger.w0.d();
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", new File(str3)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
            }
            try {
                sbVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131745477, null)), 500);
            } catch (Exception unused2) {
            }
        } else if (intValue != 7) {
            int i12 = 2;
            switch (intValue) {
                case 9:
                    sbVar.showDialog(new org.telegram.ui.Components.cx0(sbVar.getParentActivity(), sbVar, org.telegram.messenger.jj.k1(sbVar.Y.k), null, null, null));
                    break;
                case 10:
                    if ((Build.VERSION.SDK_INT > 28 && !org.telegram.messenger.v2.b) || sbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        String B = org.telegram.messenger.b8.B(sbVar.Y.F0());
                        if (TextUtils.isEmpty(B)) {
                            B = sbVar.Y.S0();
                        }
                        String str4 = B;
                        String str5 = sbVar.Y.k.attachPath;
                        if (str5 != null && str5.length() > 0 && !sc.e.x(str5)) {
                            str5 = null;
                        }
                        if (str5 == null || str5.length() == 0) {
                            org.telegram.messenger.b8 fileLoader4 = sbVar.getFileLoader();
                            TLRPC.Message message4 = sbVar.Y.k;
                            fileLoader4.getClass();
                            str5 = org.telegram.messenger.b8.N(message4, false, true).toString();
                        }
                        MediaController.d0(str5, sbVar.getParentActivity(), sbVar.Y.I3() ? 3 : 2, str4, sbVar.Y.F0() != null ? sbVar.Y.F0().mime_type : "", null);
                        break;
                    } else {
                        sbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        sbVar.Y = null;
                        sbVar.Z = null;
                        return;
                    }
                    break;
                case 11:
                    org.telegram.messenger.vp.r1(sbVar.currentAccount).q4(sbVar.Y, jjVar.F0());
                    break;
                default:
                    switch (intValue) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", sbVar.Y.k.media.user_id);
                            bundle.putString("phone", sbVar.Y.k.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            sbVar.presentFragment(new ns(bundle));
                            break;
                        case 16:
                            org.telegram.messenger.i0.g(jjVar.k.media.phone_number);
                            org.telegram.messenger.z20.r(null, 2131747311, org.telegram.ui.Components.cc.a0(sbVar));
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + sbVar.Y.k.media.phone_number));
                                intent2.addFlags(TLObject.FLAG_28);
                                sbVar.getParentActivity().startActivityForResult(intent2, 500);
                                break;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                                break;
                            }
                        default:
                            switch (intValue) {
                                case 33:
                                    if (sbVar.Z != null) {
                                        TLRPC.User Z13 = sbVar.getMessagesController().Z1(Long.valueOf(org.telegram.messenger.o5.o(sbVar.Z.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = sbVar.Z;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = sbVar.Z.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        sbVar.getMessagesController().J4(chat.id, Z13, null, sbVar.Z.banned_rights, true, sbVar.getFragmentForAlert(1), new h0(13, sbVar, Z13));
                                        break;
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = sbVar.getMessagesController().g1(chat.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = sbVar.Y.M1();
                                    sbVar.getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ta(sbVar, i12));
                                    break;
                                case 35:
                                    sbVar.getMessagesController().e0(chat.id, sbVar.getMessagesController().l1(sbVar.Y.k.from_id), false, new ua(sbVar, i12));
                                    if ((sbVar.Y.k.from_id instanceof TLRPC.TL_peerUser) && org.telegram.ui.Components.cc.a(sbVar) && (Z1 = sbVar.getMessagesController().Z1(Long.valueOf(sbVar.Y.k.from_id.user_id))) != null) {
                                        org.telegram.ui.Components.cc.D(sbVar, Z1, chat.title).j();
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            String str6 = jjVar.k.attachPath;
            if (str6 != null && str6.length() > 0 && !sc.e.x(str6)) {
                str6 = null;
            }
            if (str6 == null || str6.length() == 0) {
                org.telegram.messenger.b8 fileLoader5 = sbVar.getFileLoader();
                TLRPC.Message message5 = sbVar.Y.k;
                fileLoader5.getClass();
                str6 = org.telegram.messenger.b8.N(message5, false, true).toString();
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.b) && sbVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                sbVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                sbVar.Y = null;
                sbVar.Z = null;
                return;
            }
            MediaController.d0(str6, sbVar.getParentActivity(), 0, null, null, null);
        }
        sbVar.Y = null;
        sbVar.Z = null;
    }

    public static void b0(sb sbVar, int i10) {
        tg.f fVar = sbVar.d;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            gi.a e = sbVar.glassEngine.e();
            e.b(sbVar.w.getY(), sbVar.X.getWidth(), sbVar.w.getY() + sbVar.w.getHeight());
            fVar.h(e);
        }
        qb qbVar = sbVar.X;
        Objects.requireNonNull(qbVar);
        fVar.e(new sa(qbVar, 0), sbVar.X.getWidth(), sbVar.X.getHeight());
    }

    public static void c0(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = sbVar.k0;
        sbVar.s0 = false;
        sbVar.C0.N = false;
        sbVar.a1(false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).V3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).P3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.O = Math.min(sbVar.O, tL_channelAdminLogEvent2.id);
                org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(sbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, sbVar.f, sbVar.T, false);
                if (jjVar.U >= 0 && (((tL_channelAdminLogEvent = jjVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.id))) {
                    sbVar.n0.add(0, jjVar);
                    hVar.k(jjVar, tL_channelAdminLogEvent2.id);
                    z10 = true;
                }
            }
        }
        if (sbVar.E == null || !z10) {
            return;
        }
        sbVar.V0();
        sbVar.E.f();
    }

    public static void d0(sb sbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull M0;
        TLRPC.Chat chat = sbVar.f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            sbVar.getMessagesController().V3(tL_channels_channelParticipants.users, false);
            sbVar.getMessagesController().P3(tL_channels_channelParticipants.chats, false);
            sbVar.t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (M0 = sbVar.getMessagesController().M0(chat.id)) != null && M0.antispam) {
                eb ebVar = new eb();
                ebVar.user_id = sbVar.getMessagesController().f5;
                ebVar.peer = sbVar.getMessagesController().y1(ebVar.user_id);
                long j10 = sbVar.getMessagesController().f5;
                if (sbVar.getMessagesController().Z1(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(sbVar.currentAccount).sendRequest(tL_users_getUsers, new ta(sbVar, 1));
                }
                sbVar.t0.add(0, ebVar);
            }
            Dialog dialog = sbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).e1(sbVar.t0);
            }
        }
    }

    public static void d1(int i10, org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        if (i10 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = jjVar.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = jjVar.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            jjVar.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.cd.G(i10, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        jjVar.i5();
    }

    public static CharSequence e1(SpannableStringBuilder spannableStringBuilder) {
        int t10 = org.telegram.messenger.i0.t(spannableStringBuilder, "\n\n");
        if (t10 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.j();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.i0.L(8.0f)), t10 + 1, t10 + 2, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r6.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t0(sb sbVar, Bundle bundle, long j10) {
        TLRPC.Chat chat = sbVar.f;
        if (!chat.megagroup || sbVar.t0 == null || !org.telegram.messenger.w3.w(2, chat)) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= sbVar.t0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) sbVar.t0.get(i10);
            if (org.telegram.messenger.jj.C1(channelParticipant.peer) != j10) {
                i10++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public static void z0(sb sbVar, org.telegram.messenger.jj jjVar) {
        if (sbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        if (jjVar.D == 3) {
            x1Var.T = org.telegram.messenger.cd.L0(2131748194, null);
        } else {
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131748222, jjVar.F0().mime_type);
        }
        sbVar.showDialog(x1Var);
    }

    public final org.telegram.messenger.jj R0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.jj jjVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.o0;
            if (i11 >= arrayList2.size()) {
                jjVar = null;
                break;
            }
            jjVar = (org.telegram.messenger.jj) arrayList2.get(i11);
            if (jjVar != null && jjVar.U == 1 && jjVar.H0 == j10) {
                break;
            }
            i11++;
        }
        if (jjVar == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.jj) arrayList.get(0)).k.date;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            jjVar = new org.telegram.messenger.jj(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
        jjVar.U = 1;
        if (!z11 || arrayList.size() <= 1) {
            jjVar.H0 = -1L;
        } else {
            jjVar.H0 = j10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.jj.D5(org.telegram.messenger.cd.G(arrayList.size(), z11 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new k2.f(7)).distinct().map(new Function() { // from class: org.telegram.ui.wa
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                sb sbVar = sb.this;
                sbVar.getClass();
                if (l4.longValue() >= 0) {
                    return org.telegram.messenger.h20.k(sbVar.getMessagesController().Z1(l4));
                }
                TLRPC.Chat L0 = sbVar.getMessagesController().L0(Long.valueOf(-l4.longValue()));
                if (L0 == null) {
                    return null;
                }
                return L0.title;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new xa(i10)).limit(4L).toArray())), "un1", Z1));
        if (z11 && arrayList.size() > 1) {
            iy0 W0 = W0(jjVar.v);
            if (W0 == null) {
                W0 = new iy0(org.telegram.messenger.cd.L0(z10 ? 2131751037 : 2131751036, null));
                Typeface o10 = org.telegram.messenger.i0.o();
                org.telegram.ui.Components.e6 e6Var = W0.a;
                e6Var.x(o10);
                e6Var.w(org.telegram.messenger.i0.L(10.0f));
                if (W0.c != -1) {
                    W0.c = -1;
                    W0.invalidateSelf();
                }
                W0.a(503316480);
            } else {
                W0.a.t(org.telegram.messenger.cd.L0(z10 ? 2131751037 : 2131751036, null), false, true);
            }
            W0.setBounds(0, 0, W0.getIntrinsicWidth(), org.telegram.messenger.i0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(0, W0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        jjVar.v = spannableStringBuilder;
        org.telegram.messenger.jj jjVar2 = arrayList.size() > 0 ? (org.telegram.messenger.jj) i0.a.g(1, arrayList) : null;
        if (jjVar2 != null) {
            long j12 = jjVar2.T;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = jjVar2.T;
                int i12 = Q0;
                Q0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            jjVar.k1 = ((Integer) hVar.f(jjVar2.T)).intValue();
        }
        return jjVar;
    }

    public final void S0(boolean z10) {
        dh.f fVar = this.y;
        if (fVar == null || this.i0) {
            return;
        }
        int L0 = fVar.L0();
        if ((L0 == -1 ? 0 : Math.abs(this.y.N0() - L0) + 1) > 0) {
            this.E.getClass();
            if (L0 > (z10 ? 4 : 1) || this.r0 || this.q0) {
                return;
            }
            Y0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x0199, code lost:
    
        if (org.telegram.messenger.ui.b0(r1.currentAccount).B0(r10.id, true) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x019b, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01b2, code lost:
    
        if (org.telegram.messenger.ui.b0(r1.currentAccount).N.containsKey(r10.short_name) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x069e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T0(View view, float f7, float f10) {
        Integer num;
        Integer num2;
        char c10;
        boolean z10;
        String str;
        Integer num3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num4;
        String str2;
        boolean z11;
        TLRPC.Message message;
        TLRPC.User Z1;
        sb sbVar = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        org.telegram.messenger.jj messageObject = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject() : view instanceof org.telegram.ui.Cells.s0 ? ((org.telegram.ui.Cells.s0) view).getMessageObject() : null;
        if (messageObject == null) {
            return false;
        }
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = messageObject.J1;
        int i10 = messageObject.D;
        if (i10 == 6) {
            num = 5;
            num2 = 10;
        } else {
            if (i10 == 10 || i10 == 11 || i10 == 16) {
                num = 5;
                num2 = 10;
                if (messageObject.f1() != 0) {
                    c10 = 1;
                }
            } else {
                if (org.telegram.messenger.jj.R4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.t4() || messageObject.J2()) {
                    num = 5;
                    TLRPC.InputStickerSet k12 = org.telegram.messenger.jj.k1(messageObject.k);
                    if (k12 instanceof TLRPC.TL_inputStickerSetID) {
                        num2 = 10;
                    } else {
                        num2 = 10;
                        if (k12 instanceof TLRPC.TL_inputStickerSetShortName) {
                        }
                        c10 = 2;
                    }
                } else {
                    if (messageObject.h4()) {
                        if (messageObject.h4()) {
                            boolean z12 = org.telegram.messenger.v2.a;
                        }
                        if (messageObject.D != 12) {
                            num = 5;
                            num2 = 10;
                            c10 = '\b';
                        } else {
                            num = 5;
                            num2 = 10;
                            if (messageObject.F3()) {
                                c10 = 3;
                            }
                            c10 = 2;
                        }
                    }
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.I3() || org.telegram.messenger.jj.L4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z13 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z13) {
                            num = 5;
                            z10 = z13;
                        } else {
                            org.telegram.messenger.b8 fileLoader = sbVar.getFileLoader();
                            z10 = z13;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (org.telegram.messenger.b8.N(message2, false, true).exists()) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            if (messageObject.F0() != null && (str = messageObject.F0().mime_type) != null) {
                                if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                                    num2 = 10;
                                    c10 = '\n';
                                } else if (str.endsWith("/xml")) {
                                    num2 = 10;
                                    c10 = 5;
                                } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                    num2 = 10;
                                    c10 = 6;
                                }
                            }
                            num2 = 10;
                            c10 = 4;
                        }
                    }
                    if (messageObject.D != 12) {
                    }
                }
                num2 = 10;
                c10 = 2;
            }
            sbVar.Y = messageObject;
            if (sbVar.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.messenger.jj jjVar = messageObject;
            TLRPC.Chat chat = sbVar.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().M0(chat.id), null, this, chat.id, false, org.telegram.messenger.w3.V(chat));
                        c60Var.b2 = false;
                        c60Var.show();
                        return true;
                    }
                }
                sbVar = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != sbVar.getMessagesController().f5) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof org.telegram.ui.Cells.s0) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = sbVar.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(sbVar.getThemedColor(org.telegram.ui.ActionBar.t6.uj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131750996, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) org.telegram.messenger.cd.L0(2131752517, null));
                        spannableStringBuilder.setSpan(new dh.a(sbVar, 4), 0, spannableStringBuilder.length(), 33);
                        org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(sbVar).I(R.raw.msg_antispam, org.telegram.messenger.cd.L0(2131752460, null), org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131752461, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    org.telegram.ui.Cells.f1.t(null, 2131746236, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            org.telegram.messenger.jj jjVar2 = sbVar.Y;
            if (jjVar2.D == 0 || jjVar2.z != null) {
                arrayList.add(org.telegram.messenger.cd.L0(2131751767, null));
                arrayList3.add(valueOf2);
                arrayList2.add(3);
            }
            if (c10 == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = sbVar.Y.J1;
                if (tL_channelAdminLogEvent3 != null) {
                    TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                    if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                        TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                        TLRPC.InputStickerSet inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                        if (inputStickerSet == null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                        }
                        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                        if (inputStickerSet2 != null) {
                            showDialog(new org.telegram.ui.Components.cx0(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    }
                }
                if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                    k60 k60Var = new k60(chat.id, 0);
                    TLRPC.ChatFull M0 = sbVar.getMessagesController().M0(chat.id);
                    if (M0 != null) {
                        k60Var.i0(M0);
                        sbVar.presentFragment(k60Var);
                    }
                } else if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && org.telegram.messenger.w3.y(13, chat)) {
                    org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(sbVar.getParentActivity(), chat);
                    spVar.s1 = new bb(sbVar);
                    sbVar.showDialog(spVar);
                }
            } else if (c10 == 3) {
                TLRPC.MessageMedia messageMedia = sbVar.Y.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.M3(messageMedia.webpage.document)) {
                    arrayList.add(org.telegram.messenger.cd.L0(2131745947, null));
                    arrayList3.add(valueOf);
                    arrayList2.add(11);
                }
            } else if (c10 != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c10 == 5) {
                    org.telegram.ui.Cells.f1.t(null, 2131754217, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(org.telegram.messenger.cd.L0(2131745948, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(org.telegram.messenger.cd.L0(2131745477, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c10 == '\n') {
                        org.telegram.ui.Cells.f1.t(null, 2131754215, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(org.telegram.messenger.cd.L0(2131745948, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.cd.L0(2131745477, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c10 == 6) {
                        arrayList.add(org.telegram.messenger.cd.L0(2131745946, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(7);
                        arrayList.add(org.telegram.messenger.cd.L0(2131745948, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(org.telegram.messenger.cd.L0(2131745477, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c10 == 7) {
                        TLRPC.Message message3 = sbVar.Y.k;
                        if (org.telegram.messenger.jj.o1(message3) != null && org.telegram.messenger.jj.E3(org.telegram.messenger.jj.o1(message3).document)) {
                            arrayList.add(org.telegram.messenger.cd.L0(2131754371, null));
                        } else {
                            arrayList.add(org.telegram.messenger.cd.L0(2131754369, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c10 == '\b') {
                        long j10 = sbVar.Y.k.media.user_id;
                        TLRPC.User Z12 = j10 != 0 ? org.telegram.messenger.vp.r1(sbVar.currentAccount).Z1(Long.valueOf(j10)) : null;
                        if (Z12 != null && Z12.id != org.telegram.messenger.d20.i(sbVar.currentAccount).e() && org.telegram.messenger.i5.r(sbVar.currentAccount).f0.get(Long.valueOf(Z12.id)) == null) {
                            org.telegram.ui.Cells.f1.t(null, 2131754444, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(sbVar.Y.k.media.phone_number)) {
                            arrayList.add(org.telegram.messenger.cd.L0(2131751767, null));
                            arrayList3.add(valueOf2);
                            arrayList2.add(16);
                            arrayList.add(org.telegram.messenger.cd.L0(2131752634, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (org.telegram.messenger.jj.L4(sbVar.Y.k)) {
                arrayList.add(org.telegram.messenger.cd.L0(2131745946, null));
                arrayList3.add(valueOf3);
                arrayList2.add(num4);
                arrayList.add(org.telegram.messenger.cd.L0(2131745477, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (sbVar.Y.I3()) {
                    arrayList.add(org.telegram.messenger.cd.L0(2131745928, null));
                    arrayList3.add(num3);
                    arrayList2.add(num2);
                    arrayList.add(org.telegram.messenger.cd.L0(2131745477, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (sbVar.Y.F0() != null) {
                        if (org.telegram.messenger.jj.M3(sbVar.Y.F0())) {
                            str2 = null;
                            arrayList.add(org.telegram.messenger.cd.L0(2131745947, null));
                            arrayList3.add(valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        arrayList.add(org.telegram.messenger.cd.L0(2131745948, str2));
                        arrayList3.add(num10);
                        arrayList2.add(num9);
                        arrayList.add(org.telegram.messenger.cd.L0(2131745477, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        arrayList.add(org.telegram.messenger.cd.L0(2131745946, null));
                        arrayList3.add(valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            ab abVar = new ab(sbVar, arrayList2, arrayList, arrayList3, view, f7, f10);
            if (org.telegram.messenger.w3.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = jjVar.k) != null && message.from_id != null && (Z1 = sbVar.getMessagesController().Z1(Long.valueOf(sbVar.Y.k.from_id.user_id))) != null && !org.telegram.messenger.h20.B(Z1)) {
                    org.telegram.messenger.vp messagesController = sbVar.getMessagesController();
                    pa paVar = new pa(sbVar, arrayList, arrayList3, arrayList2, abVar, 0);
                    abVar = abVar;
                    messagesController.J0(chat, Z1, paVar);
                    z11 = true;
                    if (!z11) {
                        return true;
                    }
                    abVar.run();
                    return true;
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        c10 = 65535;
        sbVar.Y = messageObject;
        if (sbVar.getParentActivity() != null) {
        }
    }

    public final TextureView U0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.d0 == null) {
            l0 l0Var = new l0(this, getParentActivity(), 4);
            this.d0 = l0Var;
            l0Var.setOutlineProvider(new bi.d2(7));
            this.d0.setClipToOutline(true);
            this.d0.setWillNotDraw(false);
            this.d0.setVisibility(4);
            k4 k4Var = new k4(getParentActivity());
            this.e0 = k4Var;
            k4Var.setBackgroundColor(0);
            if (z10) {
                this.d0.addView(this.e0, w7.b6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f0 = textureView;
            textureView.setOpaque(false);
            this.e0.addView(this.f0, w7.b6.c(-1.0f, -1));
        }
        if (this.d0.getParent() == null) {
            qb qbVar = this.X;
            l0 l0Var2 = this.d0;
            int i10 = org.telegram.messenger.i0.u;
            qbVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.d0.setVisibility(4);
        this.e0.setDrawingReady(false);
        return this.f0;
    }

    public final void V0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = this.n0;
            if (i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.o0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(i10);
            long j10 = (jjVar == null || (tL_channelAdminLogEvent2 = jjVar.J1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (jjVar.k1 <= 0) {
                int i11 = Q0;
                Q0 = i11 + 1;
                jjVar.k1 = i11;
            }
            int i12 = i10 + 1;
            org.telegram.messenger.jj jjVar2 = i12 < arrayList4.size() ? (org.telegram.messenger.jj) arrayList4.get(i12) : null;
            long j11 = (jjVar2 == null || (tL_channelAdminLogEvent = jjVar2.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j10 != 0) {
                arrayList3.add(jjVar);
            } else {
                arrayList2.add(jjVar);
            }
            if (j10 == j11 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = jjVar.k.reply_markup;
                boolean z10 = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.jj) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((org.telegram.messenger.jj) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) i0.a.g(1, arrayList3);
                    boolean z11 = TextUtils.isEmpty(this.v0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(jjVar3.T);
                    HashSet hashSet = this.p0;
                    if (hashSet.contains(valueOf) || !z11) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            d1(0, (org.telegram.messenger.jj) arrayList3.get(i13));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        d1(arrayList3.size() - 1, jjVar3);
                        arrayList2.add(jjVar3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = jjVar3.k.reply_markup;
                    if (z10 != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        jjVar3.K1 = true;
                        this.E.g((z10 ? arrayList3.size() - 1 : 0) + size);
                        this.E.g(size + (z10 ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j12 = jjVar.T;
                    org.telegram.messenger.jj R02 = R0(j12, jjVar.J1.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11);
                    arrayList = arrayList3;
                    arrayList2.add(R02);
                }
                if (!arrayList6.isEmpty()) {
                    org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) i0.a.g(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(R0(jjVar4.T, jjVar4.J1.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i10 = i12;
            arrayList3 = arrayList;
        }
    }

    public final void X0(boolean z10) {
        if (this.M.getTag() == null || this.P) {
            return;
        }
        if (!this.S || this.Q) {
            this.M.setTag(null);
            if (!z10) {
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R = animatorSet2;
            animatorSet2.setDuration(150L);
            this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
            this.R.addListener(new s9(this, 12));
            this.R.setStartDelay(500L);
            this.R.start();
        }
    }

    public final void Y0(boolean z10) {
        pb pbVar;
        if (this.r0) {
            return;
        }
        ArrayList arrayList = this.n0;
        if (z10) {
            this.O = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                org.telegram.messenger.i0.Y3(frameLayout, true, 0.3f, true, true);
                this.H.setVisibility(4);
                this.w.setEmptyView(null);
            }
            this.k0.b();
            arrayList.clear();
            this.m0.clear();
            V0();
        }
        this.r0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.vp.h1(this.f);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 50;
        if (z10 || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.O;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.vp.r1(this.currentAccount).p1((TLRPC.User) this.w0.n(i10)));
            }
        }
        f1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ta(this, 3));
        if (!z10 || (pbVar = this.E) == null) {
            return;
        }
        pbVar.f();
    }

    public final void Z0() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.vp.h1(this.f);
        tL_channels_getAdminLog.q = this.v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.vp.r1(this.currentAccount).p1((TLRPC.User) this.w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ta(this, 0));
    }

    public final void a1(boolean z10) {
        ag.b1 b1Var = this.w;
        if (b1Var == null || this.y == null || b1Var.getChildCount() <= 0) {
            return;
        }
        int i10 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < this.w.getChildCount(); i12++) {
            View childAt = this.w.getChildAt(i12);
            this.w.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z10) {
                    if (top >= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = R;
                } else {
                    if (top <= i10) {
                    }
                    i10 = childAt.getTop();
                    view = childAt;
                    i11 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject().T : view instanceof org.telegram.ui.Cells.s0 ? ((org.telegram.ui.Cells.s0) view).getMessageObject().T : 0L;
            this.N0 = i11;
            this.O0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    public final int b1(org.telegram.messenger.jj jjVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.hj hjVar;
        if (TextUtils.isEmpty(null)) {
            org.telegram.ui.Cells.q1 q1Var2 = this.J0;
            if (q1Var2 != null) {
                q1Var2.Rc = 0;
                q1Var2.Sc = null;
            }
        } else {
            if (TextUtils.isEmpty(jjVar.z) || (q1Var = this.J0) == null || (hjVar = q1Var.k3) == null) {
                CharSequence charSequence2 = jjVar.v;
                arrayList = jjVar.z2;
                org.telegram.ui.Cells.q1 q1Var3 = this.J0;
                if (q1Var3 == null || !q1Var3.t1) {
                    charSequence = charSequence2;
                    i10 = 0;
                } else {
                    i10 = q1Var3.U1 + org.telegram.messenger.i0.L(10.0f);
                    charSequence = charSequence2;
                }
            } else {
                i10 = (int) q1Var.r3;
                charSequence = jjVar.z;
                arrayList = hjVar.e;
            }
            org.telegram.ui.Cells.q1 q1Var4 = this.J0;
            if (q1Var4 != null) {
                q1Var4.Rc = 0;
                q1Var4.Sc = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.jj.Y(this.H0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
                        String charSequence3 = gjVar.e.getText().toString();
                        int i12 = gjVar.n;
                        if (Y > i12) {
                            float o10 = Y - i12 > charSequence3.length() + (-1) ? i10 + ((int) (gjVar.o(arrayList) + gjVar.f + gjVar.w)) : r5.getLineTop(r5.getLineForOffset(Y - gjVar.n)) + gjVar.o(arrayList) + i10 + gjVar.f;
                            Point point = org.telegram.messenger.i0.q;
                            if (o10 > point.y * (this.X.getKeyboardHeight() > org.telegram.messenger.i0.L(20.0f) ? 0.7f : 0.5f)) {
                                return (int) (o10 - (point.y * (this.X.getKeyboardHeight() > org.telegram.messenger.i0.L(20.0f) ? 0.7f : 0.5f)));
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[LOOP:1: B:31:0x0098->B:42:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(org.telegram.messenger.jj jjVar) {
        int i10;
        int i11;
        int indexOf;
        boolean z10;
        float f7;
        int p02;
        org.telegram.messenger.jj messageObject;
        ArrayList arrayList = this.o0;
        boolean z11 = true;
        if (arrayList.size() > 0) {
            int N0 = this.y.N0();
            for (int L0 = this.y.L0(); L0 <= N0; L0++) {
                pb pbVar = this.E;
                int i12 = pbVar.f;
                if (L0 >= i12 && L0 < pbVar.h) {
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(L0 - i12);
                    if (jjVar2.U != 1 && jjVar2.M1() != 0 && !jjVar2.r4()) {
                        i11 = L0 - this.E.f;
                        i10 = (jjVar2.M1() < jjVar.M1() ? 1 : 0) ^ 1;
                        this.D.b = i10;
                        indexOf = arrayList.indexOf(jjVar);
                        if (indexOf == -1) {
                            if (i11 > 0) {
                                i10 = i11 > indexOf ? 0 : 1;
                                this.D.b = i10;
                            }
                            ua uaVar = this.I0;
                            if (uaVar != null) {
                                org.telegram.messenger.i0.r(uaVar);
                                this.I0 = null;
                            }
                            this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.G0 = jjVar.M1();
                            int indexOf2 = arrayList.indexOf(jjVar) + this.E.f;
                            h1();
                            int childCount = this.w.getChildCount();
                            int i13 = 0;
                            boolean z12 = false;
                            int i14 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    z10 = z11;
                                    f7 = 2.0f;
                                    break;
                                }
                                View childAt = this.w.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.messenger.jj messageObject2 = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                                    z10 = z11;
                                    if (messageObject2 != null) {
                                        f7 = 2.0f;
                                        if (messageObject2.M1() == jjVar.M1()) {
                                            childAt.sendAccessibilityEvent(8);
                                            i14 = b1(messageObject2);
                                            z12 = z10;
                                        }
                                    } else {
                                        f7 = 2.0f;
                                    }
                                    if (z12) {
                                        i13++;
                                        z11 = z10;
                                    } else {
                                        int top = childAt.getTop() - (Math.max(-org.telegram.messenger.i0.L(f7), (this.w.getMeasuredHeight() - childAt.getHeight()) / 2) - i14);
                                        int computeVerticalScrollRange = (this.w.computeVerticalScrollRange() - this.w.computeVerticalScrollOffset()) - this.w.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.w.w0(0, top, null);
                                            this.w.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    z10 = z11;
                                    f7 = 2.0f;
                                    if ((childAt instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) childAt).getMessageObject()) != null && messageObject.M1() == jjVar.M1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z12 = z10;
                                    }
                                    if (z12) {
                                    }
                                }
                            }
                            if (z12) {
                                return;
                            }
                            boolean z13 = !TextUtils.isEmpty(null);
                            if (getParentActivity() == null) {
                                p02 = 0;
                            } else {
                                if (this.J0 == null) {
                                    this.J0 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount);
                                }
                                org.telegram.ui.Cells.q1 q1Var = this.J0;
                                TLRPC.Chat chat = this.f;
                                q1Var.d6 = chat != null ? z10 : false;
                                q1Var.i6 = (org.telegram.messenger.w3.T(chat) && chat.megagroup) ? z10 : false;
                                p02 = this.J0.p0(jjVar, null, z13);
                            }
                            int max = Math.max(-org.telegram.messenger.i0.L(f7), (this.w.getMeasuredHeight() - p02) / 2) - b1(jjVar);
                            rb rbVar = this.L0;
                            rbVar.a = jjVar;
                            rbVar.e = max;
                            org.telegram.ui.Components.vj0 vj0Var = this.D;
                            vj0Var.b = i10;
                            rbVar.b = indexOf2;
                            rbVar.d = max;
                            rbVar.c = false;
                            vj0Var.d(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        this.D.b = i10;
        indexOf = arrayList.indexOf(jjVar);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.q1(context, this.currentAccount));
            }
        }
        this.U = false;
        final int i11 = 1;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.t6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 22));
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, null);
        this.I = snVar;
        kl klVar = snVar.h;
        if (klVar != null) {
            klVar.setTextSizePx(org.telegram.messenger.i0.L(17.5f));
        }
        kl klVar2 = snVar.r;
        if (klVar2 != null) {
            klVar2.setTextSizePx(org.telegram.messenger.i0.L(13.5f));
        }
        snVar.l0 = true;
        this.I.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        this.actionBar.addView(this.I, 0, w7.b6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new ag.l3(this, i11);
        this.N = a2;
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.sn snVar2 = this.I;
        TLRPC.Chat chat = this.f;
        snVar2.setTitle(chat.title);
        this.I.setSubtitle(org.telegram.messenger.cd.L0(2131751075, null));
        this.I.setChatAvatar(chat);
        hb hbVar = new hb(this, context);
        this.fragmentView = hbVar;
        this.X = hbVar;
        hbVar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        this.X.U(org.telegram.ui.ActionBar.t6.s0());
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        xg.c p5 = w7.b9.p(this.resourceProvider);
        tg.b bVar = this.c;
        lVar.M(bVar, p5, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.b6.e(-1, -2, 17));
        this.H.setOnTouchListener(new org.telegram.ui.ActionBar.n2(6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.g6(this.L, this.X, org.telegram.messenger.i0.L(12.0f), org.telegram.ui.ActionBar.t6.f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.b6.t(54, 54, 17, 16, 20, 16, -4));
        ag.j3 j3Var = new ag.j3(context, 7);
        this.L = j3Var;
        j3Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ag.j3 j3Var2 = this.L;
        int i12 = org.telegram.ui.ActionBar.t6.Wc;
        org.telegram.ui.ActionBar.a7.V(j3Var2, i12, null);
        this.L.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f));
        this.J.addView(this.L, w7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.b6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        ag.b1 b1Var = new ag.b1(this, context, 4);
        this.w = b1Var;
        b1Var.setOnItemClickListener(new e(this, 7));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        ag.b1 b1Var2 = this.w;
        pb pbVar = new pb(this, context);
        this.E = pbVar;
        b1Var2.setAdapter(pbVar);
        this.w.setClipToPadding(false);
        ag.b1 b1Var3 = this.w;
        int i13 = org.telegram.messenger.i0.m;
        int i14 = this.e;
        b1Var3.setPadding(0, org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i13 + i14, 0, org.telegram.messenger.i0.L(60.0f) + i14 + org.telegram.messenger.i0.n);
        ag.b1 b1Var4 = this.w;
        ib ibVar = new ib(this, this.w, this.resourceProvider);
        this.C0 = ibVar;
        b1Var4.setItemAnimator(ibVar);
        this.C0.Q = true;
        this.w.setLayoutAnimation(null);
        dh.f fVar = new dh.f(this);
        this.y = fVar;
        fVar.j1(1);
        this.y.l1(true);
        this.w.setLayoutManager(this.y);
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(this.w, this.y);
        this.D = vj0Var;
        vj0Var.h = new va(this);
        vj0Var.i = this.L0;
        this.X.addView(this.w, w7.b6.c(-1.0f, -1));
        this.w.setOnScrollListener(new h3(this));
        this.glassEngine.b(this.w);
        int i15 = this.g0;
        if (i15 != -1) {
            this.y.h1(i15, this.h0);
            this.g0 = -1;
        }
        bh.i iVar = new bh.i(context);
        this.W = iVar;
        iVar.setup(this.b);
        this.W.setFadeZoneTop(org.telegram.messenger.i0.L(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m);
        this.W.setFadeHeightTop(org.telegram.messenger.i0.L(60.0f));
        this.W.setFadeZoneBottom(org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(44.0f) + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.n);
        this.W.setFadeHeightBottom(org.telegram.messenger.i0.L(60.0f));
        this.X.addView(this.W, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.n, w7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new org.telegram.ui.ActionBar.g6(this.r, this.X, org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.f2));
        this.n.addView(this.r, w7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(28.0f));
        this.s.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        this.n.addView(this.s, w7.b6.e(32, 32, 17));
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
        this.M = s0Var;
        s0Var.setAlpha(0.0f);
        final int i16 = 2;
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.b6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        bh.h hVar = new bh.h(context, p6Var, bVar, w7.b9.b(p6Var));
        this.G = hVar;
        hVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-org.telegram.messenger.i0.n);
        this.G.c(4, true, false);
        bh.h hVar2 = this.G;
        vg.f c10 = hVar2.n.c(hVar2, null, false);
        c10.o(hVar2.r);
        org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(22.0f), 6.0f);
        hVar2.s = c10;
        this.X.addView(this.G, w7.b6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        final int i17 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za
            public final /* synthetic */ sb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                sb sbVar = this.b;
                switch (i18) {
                    case 0:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(sbVar, sbVar.u0, sbVar.w0, sbVar.f.megagroup);
                            i0Var.e1(sbVar.t0);
                            i0Var.Y1 = new va(sbVar);
                            sbVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        boolean z10 = sbVar.f.megagroup;
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        if (z10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750978, null));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131750976, null);
                        sbVar.showDialog(x1Var);
                        break;
                    default:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.messenger.i0.v1(sbVar.N.getSearchField());
                            sbVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(sbVar.getParentActivity(), new ra(sbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(this.F, org.telegram.ui.ActionBar.t6.pf, null);
        this.F.setText(org.telegram.messenger.cd.L0(2131746000, null));
        this.F.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.b6.e(-2, -2, 17));
        this.G.f.add(this.F);
        this.G.d(false);
        this.G.b[4] = new View.OnClickListener(this) { // from class: org.telegram.ui.za
            public final /* synthetic */ sb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i11;
                sb sbVar = this.b;
                switch (i18) {
                    case 0:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(sbVar, sbVar.u0, sbVar.w0, sbVar.f.megagroup);
                            i0Var.e1(sbVar.t0);
                            i0Var.Y1 = new va(sbVar);
                            sbVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        boolean z10 = sbVar.f.megagroup;
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        if (z10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750978, null));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131750976, null);
                        sbVar.showDialog(x1Var);
                        break;
                    default:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.messenger.i0.v1(sbVar.N.getSearchField());
                            sbVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(sbVar.getParentActivity(), new ra(sbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.a0.setVisibility(4);
        this.a0.setFocusable(true);
        this.a0.setFocusableInTouchMode(true);
        this.a0.setClickable(true);
        this.a0.setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, 0);
        this.X.addView(this.a0, w7.b6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.b0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.a7.t(this.b0, org.telegram.ui.ActionBar.t6.mf, null, PorterDuff.Mode.MULTIPLY);
        this.a0.addView(this.b0, w7.b6.e(48, 48, 53));
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za
            public final /* synthetic */ sb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i16;
                sb sbVar = this.b;
                switch (i18) {
                    case 0:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(sbVar, sbVar.u0, sbVar.w0, sbVar.f.megagroup);
                            i0Var.e1(sbVar.t0);
                            i0Var.Y1 = new va(sbVar);
                            sbVar.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        boolean z10 = sbVar.f.megagroup;
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        if (z10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750978, null));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131750976, null);
                        sbVar.showDialog(x1Var);
                        break;
                    default:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.messenger.i0.v1(sbVar.N.getSearchField());
                            sbVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(sbVar.getParentActivity(), new ra(sbVar, 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c0 = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.nf, null);
        this.c0.setTextSize(15);
        this.c0.setTypeface(org.telegram.messenger.i0.o());
        this.a0.addView(this.c0, w7.b6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.r0 && this.n0.isEmpty()) {
            org.telegram.messenger.i0.Y3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            org.telegram.messenger.i0.Y3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.H);
        }
        ag.b1 b1Var5 = this.w;
        b1Var5.W1 = true;
        b1Var5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.i0.L(51.0f));
        this.X.addView(this.x, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        f1();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.jj messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.jj messageObject3;
        boolean z10;
        if (i10 == org.telegram.messenger.zs.i4) {
            ag.b1 b1Var = this.w;
            if (b1Var != null) {
                b1Var.g1();
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.h2) {
            if (i10 == org.telegram.messenger.zs.f2 || i10 == org.telegram.messenger.zs.g2) {
                ag.b1 b1Var2 = this.w;
                if (b1Var2 != null) {
                    int childCount = b1Var2.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.w.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null) {
                            if (org.telegram.messenger.jj.R4(messageObject.k) || messageObject.I3()) {
                                q1Var.K3(false, true, false);
                            } else if (messageObject.h4() && !MediaController.B().I(messageObject)) {
                                q1Var.n0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != org.telegram.messenger.zs.e2) {
                if (i10 != org.telegram.messenger.zs.z4 || this.fragmentView == null) {
                    return;
                }
                this.X.U(org.telegram.ui.ActionBar.t6.s0());
                this.r.invalidate();
                ag.j3 j3Var = this.L;
                if (j3Var != null) {
                    j3Var.invalidate();
                }
                this.w.g1();
                return;
            }
            Integer num = (Integer) objArr[0];
            ag.b1 b1Var3 = this.w;
            if (b1Var3 != null) {
                int childCount2 = b1Var3.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.w.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject2.f1() == num.intValue()) {
                        org.telegram.messenger.jj jjVar = MediaController.B().u0;
                        if (jjVar != null) {
                            messageObject2.b0 = jjVar.b0;
                            messageObject2.g0 = jjVar.g0;
                            messageObject2.h0 = jjVar.h0;
                            q1Var2.O3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((org.telegram.messenger.jj) objArr[0]).h4()) {
            MediaController.B().p0(U0(true), this.e0, this.d0, true);
            int childCount3 = this.w.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount3) {
                    z10 = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i14);
                if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt3;
                    org.telegram.messenger.jj messageObject4 = q1Var4.getMessageObject();
                    if (this.d0 != null && messageObject4.h4() && MediaController.B().I(messageObject4)) {
                        ImageReceiver photoImage = q1Var4.getPhotoImage();
                        this.d0.setTranslationX(photoImage.K0);
                        this.d0.setTranslationY(q1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.L0);
                        this.fragmentView.invalidate();
                        this.d0.invalidate();
                        z10 = true;
                        break;
                    }
                }
                i14++;
            }
            if (this.d0 != null) {
                org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
                if (z10) {
                    MediaController.B().k0(true);
                } else {
                    this.d0.setTranslationY((-org.telegram.messenger.i0.u) - 100);
                    this.fragmentView.invalidate();
                    if (jjVar2 != null && jjVar2.h4() && (this.V || PipRoundVideoView.F != null)) {
                        MediaController.B().k0(false);
                    }
                }
            }
        }
        ag.b1 b1Var4 = this.w;
        if (b1Var4 != null) {
            int childCount4 = b1Var4.getChildCount();
            for (int i15 = 0; i15 < childCount4; i15++) {
                View childAt4 = this.w.getChildAt(i15);
                if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                    if (org.telegram.messenger.jj.R4(messageObject3.k) || messageObject3.I3()) {
                        q1Var3.K3(false, true, false);
                    } else if (messageObject3.h4()) {
                        q1Var3.n0(null, false);
                        if (!MediaController.B().I(messageObject3) && messageObject3.b0 != 0.0f) {
                            messageObject3.F5();
                            q1Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f));
            this.L.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748218, null)));
            return;
        }
        if (this.w0 != null || this.u0 != null) {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f));
            this.L.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748217, null)));
            return;
        }
        this.K.setVisibility(0);
        this.L.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        if (this.f.megagroup) {
            ag.j3 j3Var = this.L;
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751013, null));
            e1(W2);
            j3Var.setText(W2);
            return;
        }
        ag.j3 j3Var2 = this.L;
        SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751012, null));
        e1(W22);
        j3Var2.setText(W22);
    }

    public final void g1() {
        ag.b1 b1Var = this.w;
        if (b1Var == null) {
            return;
        }
        int childCount = b1Var.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.w.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                y1Var.f = y3;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var.getTop();
                q1Var.getBottom();
                int i13 = top >= 0 ? 0 : -top;
                int measuredHeight2 = q1Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i13 + measuredHeight;
                }
                q1Var.w3(i13, measuredHeight2 - i13, (this.X.getHeightWithKeyboard() - org.telegram.messenger.i0.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                if (this.d0 != null && messageObject.h4() && MediaController.B().I(messageObject)) {
                    ImageReceiver photoImage = q1Var.getPhotoImage();
                    this.d0.setTranslationX(photoImage.K0);
                    this.d0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.L0);
                    this.fragmentView.invalidate();
                    this.d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                s0Var.g0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (s0Var.R()) {
                    s0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i10) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.s0)) {
                        view = childAt;
                    }
                    i10 = bottom;
                    view3 = childAt;
                }
                ib ibVar = this.C0;
                if ((ibVar == null || (!ibVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.s0) && ((org.telegram.ui.Cells.s0) childAt).getMessageObject().j0) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i11) {
                        i11 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        l0 l0Var = this.d0;
        if (l0Var != null) {
            if (z11) {
                MediaController.B().k0(true);
            } else {
                l0Var.setTranslationY((-org.telegram.messenger.i0.u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.jj jjVar = MediaController.B().u0;
                if (jjVar != null && jjVar.h4() && this.V) {
                    MediaController.B().k0(false);
                }
            }
        }
        if (view != null) {
            this.M.e0((view instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view).getMessageObject() : ((org.telegram.ui.Cells.s0) view).getMessageObject()).k.date, false, true);
        }
        this.P = false;
        if (!(view3 instanceof org.telegram.ui.Cells.q1) && !(view3 instanceof org.telegram.ui.Cells.s0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view2 == null) {
            X0(true);
            this.M.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.w.getPaddingTop() || this.Q) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            X0(true ^ this.Q);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.R;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.R = null;
            }
            if (this.M.getTag() == null) {
                this.M.setTag(1);
            }
            if (this.M.getAlpha() != 1.0f) {
                this.M.setAlpha(1.0f);
            }
            this.P = true;
        }
        int bottom2 = view2.getBottom() - this.w.getPaddingTop();
        if (bottom2 <= this.M.getMeasuredHeight() || bottom2 >= this.M.getMeasuredHeight() * 2) {
            this.M.setTranslationY(0.0f);
        } else {
            this.M.setTranslationY(((-r1.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.kc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.lc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.df));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.uf));
        View view = this.r;
        int i10 = org.telegram.ui.ActionBar.t6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.c7(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    public final void h1() {
        ag.b1 b1Var = this.w;
        if (b1Var == null) {
            return;
        }
        int childCount = b1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                if (messageObject != null) {
                    if (!this.actionBar.u()) {
                        q1Var.setDrawSelectionBackground(false);
                        q1Var.f3(false, true);
                        q1Var.h3(false, false, true);
                    }
                    q1Var.setHighlighted(this.G0 != Integer.MAX_VALUE && messageObject.M1() == this.G0);
                    if (this.G0 != Integer.MAX_VALUE) {
                        ua uaVar = this.I0;
                        if (uaVar != null) {
                            org.telegram.messenger.i0.r(uaVar);
                        }
                        ua uaVar2 = new ua(this, 0);
                        this.I0 = uaVar2;
                        org.telegram.messenger.i0.h3(uaVar2, 1000L);
                    }
                    if (TextUtils.isEmpty(this.v0)) {
                        q1Var.o3(null);
                    } else {
                        q1Var.o3(this.v0);
                    }
                    q1Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                s0Var.setMessageObject(s0Var.getMessageObject());
                s0Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.z4);
        Y0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.vp.h1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = org.telegram.messenger.zs.e3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ta(this, 4)), this.classGuid);
        setBulletinDelegate(new mg.u(4));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.z4);
        this.x0.e();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        qb qbVar = this.X;
        if (qbVar != null) {
            org.telegram.ui.Components.z71 z71Var = qbVar.w;
            if (z71Var != null) {
                z71Var.c(false);
            }
            qbVar.F = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.i0 = true;
        this.j0 = true;
        ac.a aVar = ac.a.e;
        if (aVar == null || !aVar.a) {
            return;
        }
        ac.a n10 = ac.a.n();
        if (n10.a) {
            r4 r4Var = (r4) n10.d;
            int i10 = a5.F;
            r4Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        qb qbVar = this.X;
        if (qbVar != null) {
            org.telegram.ui.Components.z71 z71Var = qbVar.w;
            if (z71Var != null) {
                z71Var.c(true);
            }
            qbVar.F = false;
        }
        this.i0 = false;
        S0(false);
        if (this.j0) {
            this.j0 = false;
            pb pbVar = this.E;
            if (pbVar != null) {
                pbVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wc, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.x0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.x0.d();
        }
    }
}
