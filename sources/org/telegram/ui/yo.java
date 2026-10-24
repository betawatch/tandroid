package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class yo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.r90 H;
    public org.telegram.ui.Cells.r8 I;
    public org.telegram.ui.Cells.e9 J;
    public org.telegram.ui.Cells.b7 K;
    public xo L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public pa P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.l4 S;
    public org.telegram.ui.Cells.w8 T;
    public org.telegram.ui.Cells.e9 U;
    public uo V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public ei.e2 a;
    public long a0;
    public EditTextBoldCursor b;
    public boolean b0;
    public org.telegram.ui.Cells.e9 c;
    public boolean c0;
    public org.telegram.ui.Cells.l4 d;
    public boolean d0;
    public org.telegram.ui.Cells.l4 e;
    public boolean e0;
    public so f;
    public org.telegram.ui.Cells.b7 f0;
    public ArrayList g0;
    public ai.r h;
    public org.telegram.ui.Cells.r4 h0;
    public int i0;
    public String j0;
    public eh k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.ActionBar.u0 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public org.telegram.ui.Components.m70 q0;
    public org.telegram.ui.Components.as r;
    public no r0;
    public org.telegram.ui.Components.eq s;
    public ValueAnimator s0;
    public Boolean t0;
    public boolean u0;
    public LinearLayout v;
    public org.telegram.ui.Cells.j6 w;
    public org.telegram.ui.Cells.j6 x;
    public LinearLayout y;

    public final void W() {
        if (!this.W && this.a.length() <= 0) {
            ArrayList arrayList = this.O;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.n.setEnabled(false);
            this.n.setAlpha(0.5f);
            return;
        }
        this.n.setEnabled(true);
        this.n.setAlpha(1.0f);
    }

    public final boolean X(String str) {
        if (str == null || str.length() <= 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        eh ehVar = this.k0;
        if (ehVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ehVar);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.b0) {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.b0) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
        this.j0 = str;
        eh ehVar2 = new eh(13, this, str);
        this.k0 = ehVar2;
        AndroidUtilities.runOnUIThread(ehVar2, 300L);
        return true;
    }

    public final void Y(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ei.o3(6, this, z10)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final yo yoVar = this;
        AndroidUtilities.runOnUIThread(yoVar.r0, 200L);
        boolean z13 = true;
        if (yoVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(yoVar.Y, true);
            if (yoVar.W || (((publicUsername != null || yoVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(yoVar.a.getText().toString()))) || yoVar.a.length() == 0 || yoVar.l0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = yoVar.W ? "" : yoVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!yoVar.W || (arrayList = yoVar.Y.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (yoVar.u0) {
                        z10 = false;
                    } else {
                        yoVar.u0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < yoVar.Y.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = yoVar.Y.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(yoVar.Y);
                            yoVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new lo(yoVar, 1));
                        } else {
                            yoVar.u0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = yoVar.Y;
                        if (chat.noforwards != yoVar.c0) {
                            if (!ChatObject.isChannel(chat)) {
                                yoVar.b0(true);
                                final int i11 = 2;
                                yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.a0, yoVar, new MessagesStorage.LongCallback(yoVar) { // from class: org.telegram.ui.mo
                                    public final /* synthetic */ yo b;

                                    {
                                        this.b = yoVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j10) {
                                        switch (i11) {
                                            case 0:
                                                yo yoVar2 = this.b;
                                                if (j10 == 0) {
                                                    yoVar2.getClass();
                                                    break;
                                                } else {
                                                    yoVar2.a0 = j10;
                                                    yoVar2.Y = yoVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                    yoVar2.Z();
                                                    break;
                                                }
                                            case 1:
                                                yo yoVar3 = this.b;
                                                if (j10 == 0) {
                                                    yoVar3.getClass();
                                                    break;
                                                } else {
                                                    yoVar3.a0 = j10;
                                                    yoVar3.Y = yoVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                    yoVar3.Z();
                                                    break;
                                                }
                                            default:
                                                yo yoVar4 = this.b;
                                                if (j10 == 0) {
                                                    yoVar4.getClass();
                                                    break;
                                                } else {
                                                    yoVar4.a0 = j10;
                                                    yoVar4.Y = yoVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                    MessagesController messagesController = yoVar4.getMessagesController();
                                                    long j11 = -yoVar4.a0;
                                                    TLRPC.Chat chat2 = yoVar4.Y;
                                                    boolean z15 = yoVar4.c0;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                    yoVar4.Z();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (yoVar.V != null) {
                                    if (yoVar.getParentActivity() != null) {
                                        if (!yoVar.b0 && !ChatObject.isChannel(yoVar.Y)) {
                                            uo uoVar = yoVar.V;
                                            if (uoVar.f || uoVar.h) {
                                                final int i12 = 0;
                                                yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.a0, yoVar, new MessagesStorage.LongCallback(yoVar) { // from class: org.telegram.ui.mo
                                                    public final /* synthetic */ yo b;

                                                    {
                                                        this.b = yoVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j10) {
                                                        switch (i12) {
                                                            case 0:
                                                                yo yoVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    yoVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    yoVar2.a0 = j10;
                                                                    yoVar2.Y = yoVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                                    yoVar2.Z();
                                                                    break;
                                                                }
                                                            case 1:
                                                                yo yoVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    yoVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    yoVar3.a0 = j10;
                                                                    yoVar3.Y = yoVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                                    yoVar3.Z();
                                                                    break;
                                                                }
                                                            default:
                                                                yo yoVar4 = this.b;
                                                                if (j10 == 0) {
                                                                    yoVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    yoVar4.a0 = j10;
                                                                    yoVar4.Y = yoVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                                    MessagesController messagesController = yoVar4.getMessagesController();
                                                                    long j11 = -yoVar4.a0;
                                                                    TLRPC.Chat chat2 = yoVar4.Y;
                                                                    boolean z15 = yoVar4.c0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                                    yoVar4.Z();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (yoVar.Y.join_to_send != yoVar.V.f) {
                                            MessagesController messagesController = yoVar.getMessagesController();
                                            long j10 = yoVar.a0;
                                            TLRPC.Chat chat2 = yoVar.Y;
                                            boolean z15 = yoVar.V.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j10, z15, null, null);
                                        }
                                        if (yoVar.Y.join_request != yoVar.V.h || yoVar.X) {
                                            MessagesController messagesController2 = yoVar.getMessagesController();
                                            long j11 = yoVar.a0;
                                            TLRPC.Chat chat3 = yoVar.Y;
                                            boolean z16 = yoVar.V.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j11, 0L, z16, yoVar.X, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    yoVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = yoVar.getMessagesController();
                            long j12 = -yoVar.a0;
                            TLRPC.Chat chat4 = yoVar.Y;
                            boolean z17 = yoVar.c0;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j12, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(yoVar.Y)) {
                    yoVar.getMessagesController().updateChannelUserName(yoVar, yoVar.a0, obj, new no(yoVar, 1), new no(yoVar, 2));
                    yoVar = yoVar;
                } else {
                    final int i13 = 1;
                    yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.a0, yoVar, new MessagesStorage.LongCallback(yoVar) { // from class: org.telegram.ui.mo
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j102) {
                            switch (i13) {
                                case 0:
                                    yo yoVar2 = this.b;
                                    if (j102 == 0) {
                                        yoVar2.getClass();
                                        break;
                                    } else {
                                        yoVar2.a0 = j102;
                                        yoVar2.Y = yoVar2.getMessagesController().getChat(Long.valueOf(j102));
                                        yoVar2.Z();
                                        break;
                                    }
                                case 1:
                                    yo yoVar3 = this.b;
                                    if (j102 == 0) {
                                        yoVar3.getClass();
                                        break;
                                    } else {
                                        yoVar3.a0 = j102;
                                        yoVar3.Y = yoVar3.getMessagesController().getChat(Long.valueOf(j102));
                                        yoVar3.Z();
                                        break;
                                    }
                                default:
                                    yo yoVar4 = this.b;
                                    if (j102 == 0) {
                                        yoVar4.getClass();
                                        break;
                                    } else {
                                        yoVar4.a0 = j102;
                                        yoVar4.Y = yoVar4.getMessagesController().getChat(Long.valueOf(j102));
                                        MessagesController messagesController4 = yoVar4.getMessagesController();
                                        long j112 = -yoVar4.a0;
                                        TLRPC.Chat chat22 = yoVar4.Y;
                                        boolean z152 = yoVar4.c0;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j112, z152);
                                        yoVar4.Z();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) yoVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(yoVar.f);
                yoVar.b0(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public final void a0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = this.b0;
        j0Var.H0 = new no(this, 0);
        showDialog(j0Var);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final void b0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.r0);
        }
        if (this.r != null) {
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r.c, z10 ? 1.0f : 0.0f);
            this.s0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 7));
            this.s0.setDuration((long) (Math.abs(this.r.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.s0.setInterpolator(org.telegram.ui.Components.bs.f);
            this.s0.start();
        }
    }

    public final void c0() {
        if (this.K == null) {
            return;
        }
        int i10 = 8;
        if (this.W || this.d0 || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.e9 e9Var = this.c;
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.r6.W(this.c.getTextView(), i11, null);
            if (this.o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            if (this.b0) {
                this.c.setText(LocaleController.getString(this.W ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.d.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.c.setText(LocaleController.getString(this.W ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.d.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.F.setVisibility(this.W ? 8 : 0);
            this.G.setVisibility(this.W ? 0 : 8);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.E.setPadding(0, 0, 0, this.W ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.r90 r90Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            r90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.H.c(this.m0, this.a0);
            so soVar = this.f;
            soVar.setVisibility((this.W || soVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.a0);
            this.J.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.a0)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var2 = this.c;
            int i12 = org.telegram.ui.ActionBar.k6.p7;
            e9Var2.setTag(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.r6.W(this.c.getTextView(), i12, null);
            this.E.setVisibility(8);
            this.f.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                this.h0.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.w.a(!this.W);
        this.x.a(this.W);
        this.a.clearFocus();
        uo uoVar = this.V;
        if (uoVar != null) {
            uoVar.setVisibility((!this.b0 || this.W) ? 0 : 8);
            uo uoVar2 = this.V;
            TLRPC.ChatFull chatFull2 = this.Z;
            uoVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.b0) ? false : true);
        }
        xo xoVar = this.L;
        if (xoVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i10 = 0;
            }
            xoVar.setVisibility(i10);
        }
        W();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 4));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.k6.v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.s = eqVar;
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, eqVar);
        this.r = asVar;
        org.telegram.ui.ActionBar.u0 i12 = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        this.n = i12;
        org.telegram.ui.ActionBar.r6.z(i12, mutate, i11, null, mode);
        this.h = new ai.r(context);
        qo qoVar = new qo(this, context, this.h, this.resourceProvider);
        this.fragmentView = qoVar;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, qoVar, null);
        org.telegram.ui.Components.bp0 bp0Var = (org.telegram.ui.Components.bp0) this.fragmentView;
        bp0Var.setFillViewport(true);
        bp0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(bp0Var);
        this.h.setOrientation(1);
        boolean z11 = this.o0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.b0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.v, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.e = l4Var;
        l4Var.setHeight(46);
        if (this.b0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.v.addView(this.e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.x = j6Var;
        if (this.b0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.W);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.W);
        }
        this.v.addView(this.x, w7.z5.n(-1, -2));
        this.x.setOnClickListener(new po(this, i10));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.w = j6Var2;
        if (this.b0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.W);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.W);
        }
        this.v.addView(this.w, w7.z5.n(-1, -2));
        this.w.setOnClickListener(new po(this, 2));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        this.K = b7Var;
        this.h.addView(b7Var, w7.z5.n(-1, -2));
        if (z11) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.E, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.E.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, w7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i13 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor2, i13, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor3, i14, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setEnabled(false);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163840);
        this.b.setImeOptions(6);
        this.F.addView(this.b, w7.z5.n(-2, 36));
        int i15 = 3;
        ei.e2 e2Var = new ei.e2(this, context, i15);
        this.a = e2Var;
        e2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.F(this.a, i13, null);
        org.telegram.ui.ActionBar.r6.W(this.a, i14, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        org.telegram.ui.ActionBar.r6.x(this.a, i14, null);
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.F.addView(this.a, w7.z5.n(-1, 36));
        this.a.addTextChangedListener(new n0(this, i15));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, w7.z5.n(-1, -2));
        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, this, null, true, ChatObject.isChannel(this.Y));
        this.H = r90Var;
        r90Var.setDelegate(new ro(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        so soVar = new so(this, context, this.resourceProvider);
        this.f = soVar;
        soVar.setBottomPadding(6);
        this.h.addView(this.f, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.c, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.h0 = r4Var;
        this.h.addView(r4Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.y, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        this.f0 = b7Var2;
        this.h.addView(b7Var2, w7.z5.n(-1, -2));
        ai.r rVar = this.h;
        xo xoVar = new xo(this, context);
        this.L = xoVar;
        rVar.addView(xoVar, w7.z5.n(-1, -2));
        this.L.setVisibility((this.W || this.O.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.I = r8Var;
        r8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.I.setOnClickListener(new po(this, i15));
        this.h.addView(this.I, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.J = e9Var2;
        this.h.addView(e9Var2, w7.z5.n(-1, -2));
        uo uoVar = new uo(this, context, this.Y, context);
        this.V = uoVar;
        TLRPC.ChatFull chatFull = this.Z;
        uoVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        uo uoVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.e9 e9Var3 = uoVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(uoVar2.n);
        boolean isPublic = ChatObject.isPublic(uoVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            z10 = false;
            e9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            StringBuilder sb2 = new StringBuilder("@");
            z10 = false;
            sb2.append(DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id))));
            e9Var3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, sb2.toString()), org.telegram.ui.ActionBar.k6.il, null, new org.telegram.ui.Components.yt(19, chatFull2, this)));
        }
        this.h.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.R);
        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context, 23);
        this.S = l4Var3;
        l4Var3.setHeight(46);
        this.S.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.R.addView(this.S, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.T = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.c0, z10);
        this.T.setOnClickListener(new po(this, 4));
        this.R.addView(this.T, w7.z5.n(-1, -2));
        this.U = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (!this.b0 || ChatObject.isMegagroup(this.Y)) {
            this.U.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.U.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.R.addView(this.U, w7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.Y, true);
        if (!this.W && publicUsername != null) {
            this.n0 = true;
            this.a.setText(publicUsername);
            this.a.setSelection(publicUsername.length());
            this.n0 = false;
        }
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                c0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                if (h5Var == null || h5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        LinearLayout linearLayout = this.v;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        ei.e2 e2Var;
        super.onBecomeFullyVisible();
        if (!this.o0 || (e2Var = this.a) == null) {
            return;
        }
        e2Var.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.o0;
        ArrayList arrayList = this.O;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.a0));
        this.Y = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = getMessagesStorage().getChatSync(this.a0);
            this.Y = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.Y, true);
                if (this.Z == null) {
                    TLRPC.ChatFull loadChatInfo = getMessagesStorage().loadChatInfo(this.a0, ChatObject.isChannel(this.Y), new CountDownLatch(1), false, false);
                    this.Z = loadChatInfo;
                }
            }
            return false;
        }
        this.W = (z10 || ChatObject.isPublic(this.Y)) ? false : true;
        this.b0 = ChatObject.isChannel(this.Y) && !this.Y.megagroup;
        TLRPC.Chat chat2 = this.Y;
        this.c0 = chat2.noforwards;
        if ((z10 && !ChatObject.isPublic(chat2)) || (this.W && this.Y.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new lo(this, 3));
        }
        if (this.W && this.Z != null) {
            getMessagesController().loadFullChat(this.a0, this.classGuid, true);
        }
        if (this.Y != null) {
            this.N.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.Y.usernames.size(); i10++) {
                if (this.Y.usernames.get(i10).active) {
                    arrayList.add(this.Y.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.Y.usernames.size(); i11++) {
                if (!this.Y.usernames.get(i11).active) {
                    arrayList.add(this.Y.usernames.get(i11));
                }
            }
        }
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ai.r rVar = this.h;
        if (rVar != null) {
            rVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            this.H.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.eq eqVar = this.s;
            if (eqVar != null) {
                eqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v8, false));
            }
            org.telegram.ui.Cells.r4 r4Var = this.h0;
            if (r4Var != null && r4Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.y.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.n, nVar.f);
                        nVar.a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.m70 m70Var = this.q0;
            if (m70Var != null) {
                m70Var.updateColors();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
