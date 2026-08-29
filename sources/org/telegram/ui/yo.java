package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
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
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A;
    public LinearLayout B;
    public org.telegram.ui.Components.r80 C;
    public org.telegram.ui.Cells.m8 D;
    public org.telegram.ui.Cells.y8 E;
    public org.telegram.ui.Cells.x6 F;
    public xo G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ia K;
    public ArrayList L;
    public LinearLayout M;
    public org.telegram.ui.Cells.k4 N;
    public org.telegram.ui.Cells.q8 O;
    public org.telegram.ui.Cells.y8 P;
    public uo Q;
    public boolean R;
    public boolean S;
    public TLRPC.Chat T;
    public TLRPC.ChatFull U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ig.f a;
    public org.telegram.ui.Cells.x6 a0;
    public EditTextBoldCursor b;
    public ArrayList b0;
    public org.telegram.ui.Cells.y8 c;
    public org.telegram.ui.Cells.q4 c0;
    public org.telegram.ui.Cells.k4 d;
    public int d0;
    public org.telegram.ui.Cells.k4 e;
    public String e0;
    public so f;
    public vf f0;
    public boolean g0;
    public bg.y3 h;
    public TLRPC.TL_chatInviteExported h0;
    public boolean i0;
    public boolean j0;
    public HashMap k0;
    public org.telegram.ui.Components.n60 l0;
    public no m0;
    public org.telegram.ui.ActionBar.w0 n;
    public ValueAnimator n0;
    public Boolean o0;
    public boolean p0;
    public org.telegram.ui.Components.ir r;
    public LinearLayout s;
    public org.telegram.ui.Cells.g6 v;
    public org.telegram.ui.Cells.g6 w;
    public LinearLayout x;
    public LinearLayout y;

    public final void V() {
        if (!this.R && this.a.length() <= 0) {
            ArrayList arrayList = this.J;
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

    public final boolean W(String str) {
        if (str == null || str.length() <= 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        vf vfVar = this.f0;
        if (vfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vfVar);
            this.f0 = null;
            this.e0 = null;
            if (this.d0 != 0) {
                getConnectionsManager().cancelRequest(this.d0, true);
            }
        }
        this.g0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.W) {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.W) {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.F6);
        this.e0 = str;
        vf vfVar2 = new vf(18, this, str);
        this.f0 = vfVar2;
        AndroidUtilities.runOnUIThread(vfVar2, 300L);
        return true;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.V);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new nh.l3(6, this, z10)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final yo yoVar = this;
        AndroidUtilities.runOnUIThread(yoVar.m0, 200L);
        boolean z13 = true;
        if (yoVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(yoVar.T, true);
            if (yoVar.R || (((publicUsername != null || yoVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(yoVar.a.getText().toString()))) || yoVar.a.length() == 0 || yoVar.g0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = yoVar.R ? "" : yoVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!yoVar.R || (arrayList = yoVar.T.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (yoVar.p0) {
                        z10 = false;
                    } else {
                        yoVar.p0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < yoVar.T.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = yoVar.T.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(yoVar.T);
                            yoVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new lo(yoVar, 1));
                        } else {
                            yoVar.p0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = yoVar.T;
                        if (chat.noforwards != yoVar.X) {
                            if (!ChatObject.isChannel(chat)) {
                                yoVar.a0(true);
                                final int i11 = 2;
                                yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.V, yoVar, new MessagesStorage.LongCallback(yoVar) { // from class: org.telegram.ui.mo
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
                                                    yoVar2.V = j10;
                                                    yoVar2.T = yoVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                    yoVar2.Y();
                                                    break;
                                                }
                                            case 1:
                                                yo yoVar3 = this.b;
                                                if (j10 == 0) {
                                                    yoVar3.getClass();
                                                    break;
                                                } else {
                                                    yoVar3.V = j10;
                                                    yoVar3.T = yoVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                    yoVar3.Y();
                                                    break;
                                                }
                                            default:
                                                yo yoVar4 = this.b;
                                                if (j10 == 0) {
                                                    yoVar4.getClass();
                                                    break;
                                                } else {
                                                    yoVar4.V = j10;
                                                    yoVar4.T = yoVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                    MessagesController messagesController = yoVar4.getMessagesController();
                                                    long j11 = -yoVar4.V;
                                                    TLRPC.Chat chat2 = yoVar4.T;
                                                    boolean z15 = yoVar4.X;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                    yoVar4.Y();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (yoVar.Q != null) {
                                    if (yoVar.getParentActivity() != null) {
                                        if (!yoVar.W && !ChatObject.isChannel(yoVar.T)) {
                                            uo uoVar = yoVar.Q;
                                            if (uoVar.f || uoVar.h) {
                                                final int i12 = 0;
                                                yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.V, yoVar, new MessagesStorage.LongCallback(yoVar) { // from class: org.telegram.ui.mo
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
                                                                    yoVar2.V = j10;
                                                                    yoVar2.T = yoVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                                    yoVar2.Y();
                                                                    break;
                                                                }
                                                            case 1:
                                                                yo yoVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    yoVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    yoVar3.V = j10;
                                                                    yoVar3.T = yoVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                                    yoVar3.Y();
                                                                    break;
                                                                }
                                                            default:
                                                                yo yoVar4 = this.b;
                                                                if (j10 == 0) {
                                                                    yoVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    yoVar4.V = j10;
                                                                    yoVar4.T = yoVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                                    MessagesController messagesController = yoVar4.getMessagesController();
                                                                    long j11 = -yoVar4.V;
                                                                    TLRPC.Chat chat2 = yoVar4.T;
                                                                    boolean z15 = yoVar4.X;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                                    yoVar4.Y();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (yoVar.T.join_to_send != yoVar.Q.f) {
                                            MessagesController messagesController = yoVar.getMessagesController();
                                            long j10 = yoVar.V;
                                            TLRPC.Chat chat2 = yoVar.T;
                                            boolean z15 = yoVar.Q.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j10, z15, null, null);
                                        }
                                        if (yoVar.T.join_request != yoVar.Q.h || yoVar.S) {
                                            MessagesController messagesController2 = yoVar.getMessagesController();
                                            long j11 = yoVar.V;
                                            TLRPC.Chat chat3 = yoVar.T;
                                            boolean z16 = yoVar.Q.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j11, 0L, z16, yoVar.S, false, null, null);
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
                            long j12 = -yoVar.V;
                            TLRPC.Chat chat4 = yoVar.T;
                            boolean z17 = yoVar.X;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j12, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(yoVar.T)) {
                    yoVar.getMessagesController().updateChannelUserName(yoVar, yoVar.V, obj, new no(yoVar, 1), new no(yoVar, 2));
                    yoVar = yoVar;
                } else {
                    final int i13 = 1;
                    yoVar.getMessagesController().convertToMegaGroup(yoVar.getParentActivity(), yoVar.V, yoVar, new MessagesStorage.LongCallback(yoVar) { // from class: org.telegram.ui.mo
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
                                        yoVar2.V = j102;
                                        yoVar2.T = yoVar2.getMessagesController().getChat(Long.valueOf(j102));
                                        yoVar2.Y();
                                        break;
                                    }
                                case 1:
                                    yo yoVar3 = this.b;
                                    if (j102 == 0) {
                                        yoVar3.getClass();
                                        break;
                                    } else {
                                        yoVar3.V = j102;
                                        yoVar3.T = yoVar3.getMessagesController().getChat(Long.valueOf(j102));
                                        yoVar3.Y();
                                        break;
                                    }
                                default:
                                    yo yoVar4 = this.b;
                                    if (j102 == 0) {
                                        yoVar4.getClass();
                                        break;
                                    } else {
                                        yoVar4.V = j102;
                                        yoVar4.T = yoVar4.getMessagesController().getChat(Long.valueOf(j102));
                                        MessagesController messagesController4 = yoVar4.getMessagesController();
                                        long j112 = -yoVar4.V;
                                        TLRPC.Chat chat22 = yoVar4.T;
                                        boolean z152 = yoVar4.X;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j112, z152);
                                        yoVar4.Y();
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
                yoVar.a0(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.r0 = this.W;
        v0Var.D0 = new no(this, 0);
        showDialog(v0Var);
    }

    public final void a0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
        }
        if (this.r != null) {
            ValueAnimator valueAnimator = this.n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r.c, z10 ? 1.0f : 0.0f);
            this.n0 = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 7));
            this.n0.setDuration((long) (Math.abs(this.r.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.n0.setInterpolator(org.telegram.ui.Components.jr.f);
            this.n0.start();
        }
    }

    public final void b0() {
        if (this.F == null) {
            return;
        }
        int i10 = 8;
        if (this.R || this.Y || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.y8 y8Var = this.c;
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            y8Var.setTag(Integer.valueOf(i11));
            this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            if (this.j0) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
            this.a0.setVisibility(8);
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            this.c0.setVisibility(8);
            if (this.W) {
                this.c.setText(LocaleController.getString(this.R ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.d.setText(LocaleController.getString(this.R ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.c.setText(LocaleController.getString(this.R ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.d.setText(LocaleController.getString(this.R ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.A.setVisibility(this.R ? 8 : 0);
            this.B.setVisibility(this.R ? 0 : 8);
            this.M.setVisibility(0);
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            this.y.setPadding(0, 0, 0, this.R ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.r80 r80Var = this.C;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.h0;
            r80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.C.c(this.h0, this.V);
            so soVar = this.f;
            soVar.setVisibility((this.R || soVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.V);
            this.E.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.V)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.y8 y8Var2 = this.c;
            int i12 = org.telegram.ui.ActionBar.g6.p7;
            y8Var2.setTag(Integer.valueOf(i12));
            this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.y.setVisibility(8);
            this.f.setVisibility(8);
            this.F.setVisibility(8);
            this.a0.setVisibility(0);
            if (this.Z) {
                this.c0.setVisibility(0);
                this.x.setVisibility(8);
            } else {
                this.c0.setVisibility(8);
                this.x.setVisibility(0);
            }
        }
        this.v.a(!this.R);
        this.w.a(this.R);
        this.a.clearFocus();
        uo uoVar = this.Q;
        if (uoVar != null) {
            uoVar.setVisibility((!this.W || this.R) ? 0 : 8);
            uo uoVar2 = this.Q;
            TLRPC.ChatFull chatFull2 = this.U;
            uoVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.W) ? false : true);
        }
        xo xoVar = this.G;
        if (xoVar != null) {
            if (!this.R && !this.J.isEmpty()) {
                i10 = 0;
            }
            xoVar.setVisibility(i10);
        }
        V();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 18));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        this.r = irVar;
        this.n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), irVar);
        this.h = new bg.y3(context);
        qo qoVar = new qo(this, context, this.h, this.resourceProvider);
        this.fragmentView = qoVar;
        qoVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        org.telegram.ui.Components.un0 un0Var = (org.telegram.ui.Components.un0) this.fragmentView;
        un0Var.setFillViewport(true);
        un0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(un0Var);
        this.h.setOrientation(1);
        boolean z10 = this.j0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.W) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.s, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 23);
        this.e = k4Var;
        k4Var.setHeight(46);
        if (this.W) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.s.addView(this.e);
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
        this.w = g6Var;
        if (this.W) {
            g6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.R);
        } else {
            g6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.R);
        }
        this.s.addView(this.w, i7.f6.n(-1, -2));
        this.w.setOnClickListener(new po(this, i10));
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
        this.v = g6Var2;
        if (this.W) {
            g6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.R);
        } else {
            g6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.R);
        }
        this.s.addView(this.v, i7.f6.n(-1, -2));
        this.v.setOnClickListener(new po(this, 2));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        this.F = x6Var;
        this.h.addView(x6Var, i7.f6.n(-1, -2));
        if (z10) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            this.F.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.y, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context, 23);
        this.d = k4Var2;
        this.y.addView(k4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.A = linearLayout3;
        linearLayout3.setOrientation(0);
        this.y.addView(this.A, i7.f6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setEnabled(false);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163840);
        this.b.setImeOptions(6);
        this.A.addView(this.b, i7.f6.n(-2, 36));
        ig.f fVar = new ig.f(this, context, 4);
        this.a = fVar;
        fVar.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.A.addView(this.a, i7.f6.n(-1, 36));
        int i14 = 3;
        this.a.addTextChangedListener(new p0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.B = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.B, i7.f6.n(-1, -2));
        org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(context, this, null, true, ChatObject.isChannel(this.T));
        this.C = r80Var;
        r80Var.setDelegate(new ro(this, context));
        this.C.d(0, null, false);
        this.B.addView(this.C);
        so soVar = new so(this, context, this.resourceProvider);
        this.f = soVar;
        soVar.setBottomPadding(6);
        this.h.addView(this.f, i7.f6.n(-2, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.c = y8Var;
        y8Var.setImportantForAccessibility(1);
        this.h.addView(this.c, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        this.c0 = q4Var;
        this.h.addView(q4Var, i7.f6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.x, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (b) null);
        this.a0 = x6Var2;
        this.h.addView(x6Var2, i7.f6.n(-1, -2));
        bg.y3 y3Var = this.h;
        xo xoVar = new xo(this, context);
        this.G = xoVar;
        y3Var.addView(xoVar, i7.f6.n(-1, -2));
        this.G.setVisibility((this.R || this.J.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
        this.D = m8Var;
        m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.D.setOnClickListener(new po(this, i14));
        this.h.addView(this.D, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.E = y8Var2;
        this.h.addView(y8Var2, i7.f6.n(-1, -2));
        uo uoVar = new uo(this, context, this.T, context);
        this.Q = uoVar;
        TLRPC.ChatFull chatFull = this.U;
        uoVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.W) ? false : true);
        uo uoVar2 = this.Q;
        TLRPC.ChatFull chatFull2 = this.U;
        org.telegram.ui.Cells.y8 y8Var3 = uoVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(uoVar2.n);
        boolean isPublic = ChatObject.isPublic(uoVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            y8Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            y8Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.il, false), new org.telegram.ui.Components.gt(21, chatFull2, this)));
        }
        this.h.addView(this.Q);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.M = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.M);
        org.telegram.ui.Cells.k4 k4Var3 = new org.telegram.ui.Cells.k4(context, 23);
        this.N = k4Var3;
        k4Var3.setHeight(46);
        this.N.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.M.addView(this.N, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.O = q8Var;
        q8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.X, false);
        this.O.setOnClickListener(new po(this, 4));
        this.M.addView(this.O, i7.f6.n(-1, -2));
        this.P = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        if (!this.W || ChatObject.isMegagroup(this.T)) {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.M.addView(this.P, i7.f6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.T, true);
        if (!this.R && publicUsername != null) {
            this.i0 = true;
            this.a.setText(publicUsername);
            this.a.setSelection(publicUsername.length());
            this.i0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.V) {
                this.U = chatFull;
                this.h0 = chatFull.exported_invite;
                b0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.V) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
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
        f fVar = new f(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        int i10 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4, null, null, null, null, i14));
        ig.f fVar2 = this.a;
        int i15 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(fVar2, TLObject.FLAG_23, null, null, null, null, i15));
        LinearLayout linearLayout = this.s;
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, TLObject.FLAG_23, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c0, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.g6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.g6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.g6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        ig.f fVar;
        super.onBecomeFullyVisible();
        if (!this.j0 || (fVar = this.a) == null) {
            return;
        }
        fVar.requestFocus();
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
        boolean z10 = this.j0;
        ArrayList arrayList = this.J;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.V));
        this.T = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = getMessagesStorage().getChatSync(this.V);
            this.T = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.T, true);
                if (this.U == null) {
                    TLRPC.ChatFull loadChatInfo = getMessagesStorage().loadChatInfo(this.V, ChatObject.isChannel(this.T), new CountDownLatch(1), false, false);
                    this.U = loadChatInfo;
                }
            }
            return false;
        }
        this.R = (z10 || ChatObject.isPublic(this.T)) ? false : true;
        this.W = ChatObject.isChannel(this.T) && !this.T.megagroup;
        TLRPC.Chat chat2 = this.T;
        this.X = chat2.noforwards;
        if ((z10 && !ChatObject.isPublic(chat2)) || (this.R && this.T.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new lo(this, 3));
        }
        if (this.R && this.U != null) {
            getMessagesController().loadFullChat(this.V, this.classGuid, true);
        }
        if (this.T != null) {
            this.I.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.T.usernames.size(); i10++) {
                if (this.T.usernames.get(i10).active) {
                    arrayList.add(this.T.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.T.usernames.size(); i11++) {
                if (!this.T.usernames.get(i11).active) {
                    arrayList.add(this.T.usernames.get(i11));
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
        bg.y3 y3Var = this.h;
        if (y3Var != null) {
            y3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.U;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.h0 = tL_chatInviteExported;
            this.C.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.C.c(this.h0, this.V);
        }
    }
}
