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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A;
    public LinearLayout B;
    public org.telegram.ui.Components.e80 C;
    public org.telegram.ui.Cells.p8 D;
    public org.telegram.ui.Cells.b9 E;
    public org.telegram.ui.Cells.z6 F;
    public uo G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ja K;
    public ArrayList L;
    public LinearLayout M;
    public org.telegram.ui.Cells.m4 N;
    public org.telegram.ui.Cells.t8 O;
    public org.telegram.ui.Cells.b9 P;
    public ro Q;
    public boolean R;
    public boolean S;
    public TLRPC.Chat T;
    public TLRPC.ChatFull U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public fg.g a;
    public org.telegram.ui.Cells.z6 a0;
    public EditTextBoldCursor b;
    public ArrayList b0;
    public org.telegram.ui.Cells.b9 c;
    public org.telegram.ui.Cells.s4 c0;
    public org.telegram.ui.Cells.m4 d;
    public int d0;
    public org.telegram.ui.Cells.m4 e;
    public String e0;
    public po f;
    public rd f0;
    public boolean g0;
    public gh.m h;
    public TLRPC.TL_chatInviteExported h0;
    public boolean i0;
    public boolean j0;
    public HashMap k0;
    public org.telegram.ui.Components.a60 l0;
    public ko m0;
    public org.telegram.ui.ActionBar.w0 n;
    public ValueAnimator n0;
    public Boolean o0;
    public boolean p0;
    public org.telegram.ui.Components.fr r;
    public LinearLayout s;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 w;
    public LinearLayout x;
    public LinearLayout y;

    public final void U() {
        if (!this.R && this.a.length() <= 0) {
            ArrayList arrayList = this.J;
            if (arrayList != null) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i9);
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

    public final boolean V(String str) {
        if (str == null || str.length() <= 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        rd rdVar = this.f0;
        if (rdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rdVar);
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
                this.f.setTextColorByKey(org.telegram.ui.ActionBar.f6.p7);
                return false;
            }
            for (int i9 = 0; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (i9 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.W) {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.f6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f.setTextColorByKey(org.telegram.ui.ActionBar.f6.p7);
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
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.f6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f.setTextColorByKey(org.telegram.ui.ActionBar.f6.p7);
            return false;
        }
        this.f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f.setTextColorByKey(org.telegram.ui.ActionBar.f6.F6);
        this.e0 = str;
        rd rdVar2 = new rd(21, this, str);
        this.f0 = rdVar2;
        AndroidUtilities.runOnUIThread(rdVar2, 300L);
        return true;
    }

    public final void W(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.V);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new kh.o3(6, this, z10)), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final vo voVar = this;
        AndroidUtilities.runOnUIThread(voVar.m0, 200L);
        boolean z13 = true;
        if (voVar.getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(voVar.T, true);
            if (voVar.R || (((publicUsername != null || voVar.a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(voVar.a.getText().toString()))) || voVar.a.length() == 0 || voVar.g0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String obj = voVar.R ? "" : voVar.a.getText().toString();
                if (publicUsername.equals(obj)) {
                    if (!voVar.R || (arrayList = voVar.T.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (voVar.p0) {
                        z10 = false;
                    } else {
                        voVar.p0 = true;
                        boolean z14 = false;
                        for (int i9 = 0; i9 < voVar.T.usernames.size(); i9++) {
                            TLRPC.TL_username tL_username = voVar.T.usernames.get(i9);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(voVar.T);
                            voVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new io(voVar, 1));
                        } else {
                            voVar.p0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = voVar.T;
                        if (chat.noforwards != voVar.X) {
                            if (!ChatObject.isChannel(chat)) {
                                voVar.Z(true);
                                final int i10 = 2;
                                voVar.getMessagesController().convertToMegaGroup(voVar.getParentActivity(), voVar.V, voVar, new MessagesStorage.LongCallback(voVar) { // from class: org.telegram.ui.jo
                                    public final /* synthetic */ vo b;

                                    {
                                        this.b = voVar;
                                    }

                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                    public final void run(long j10) {
                                        switch (i10) {
                                            case 0:
                                                vo voVar2 = this.b;
                                                if (j10 == 0) {
                                                    voVar2.getClass();
                                                    break;
                                                } else {
                                                    voVar2.V = j10;
                                                    voVar2.T = voVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                    voVar2.X();
                                                    break;
                                                }
                                            case 1:
                                                vo voVar3 = this.b;
                                                if (j10 == 0) {
                                                    voVar3.getClass();
                                                    break;
                                                } else {
                                                    voVar3.V = j10;
                                                    voVar3.T = voVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                    voVar3.X();
                                                    break;
                                                }
                                            default:
                                                vo voVar4 = this.b;
                                                if (j10 == 0) {
                                                    voVar4.getClass();
                                                    break;
                                                } else {
                                                    voVar4.V = j10;
                                                    voVar4.T = voVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                    MessagesController messagesController = voVar4.getMessagesController();
                                                    long j11 = -voVar4.V;
                                                    TLRPC.Chat chat2 = voVar4.T;
                                                    boolean z15 = voVar4.X;
                                                    chat2.noforwards = z15;
                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                    voVar4.X();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (voVar.Q != null) {
                                    if (voVar.getParentActivity() != null) {
                                        if (!voVar.W && !ChatObject.isChannel(voVar.T)) {
                                            ro roVar = voVar.Q;
                                            if (roVar.f || roVar.h) {
                                                final int i11 = 0;
                                                voVar.getMessagesController().convertToMegaGroup(voVar.getParentActivity(), voVar.V, voVar, new MessagesStorage.LongCallback(voVar) { // from class: org.telegram.ui.jo
                                                    public final /* synthetic */ vo b;

                                                    {
                                                        this.b = voVar;
                                                    }

                                                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                                                    public final void run(long j10) {
                                                        switch (i11) {
                                                            case 0:
                                                                vo voVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    voVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    voVar2.V = j10;
                                                                    voVar2.T = voVar2.getMessagesController().getChat(Long.valueOf(j10));
                                                                    voVar2.X();
                                                                    break;
                                                                }
                                                            case 1:
                                                                vo voVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    voVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    voVar3.V = j10;
                                                                    voVar3.T = voVar3.getMessagesController().getChat(Long.valueOf(j10));
                                                                    voVar3.X();
                                                                    break;
                                                                }
                                                            default:
                                                                vo voVar4 = this.b;
                                                                if (j10 == 0) {
                                                                    voVar4.getClass();
                                                                    break;
                                                                } else {
                                                                    voVar4.V = j10;
                                                                    voVar4.T = voVar4.getMessagesController().getChat(Long.valueOf(j10));
                                                                    MessagesController messagesController = voVar4.getMessagesController();
                                                                    long j11 = -voVar4.V;
                                                                    TLRPC.Chat chat2 = voVar4.T;
                                                                    boolean z15 = voVar4.X;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.toggleChatNoForwards(j11, z15);
                                                                    voVar4.X();
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        if (voVar.T.join_to_send != voVar.Q.f) {
                                            MessagesController messagesController = voVar.getMessagesController();
                                            long j10 = voVar.V;
                                            TLRPC.Chat chat2 = voVar.T;
                                            boolean z15 = voVar.Q.f;
                                            chat2.join_to_send = z15;
                                            messagesController.toggleChatJoinToSend(j10, z15, null, null);
                                        }
                                        if (voVar.T.join_request != voVar.Q.h || voVar.S) {
                                            MessagesController messagesController2 = voVar.getMessagesController();
                                            long j11 = voVar.V;
                                            TLRPC.Chat chat3 = voVar.T;
                                            boolean z16 = voVar.Q.h;
                                            chat3.join_request = z16;
                                            messagesController2.toggleChatJoinRequest(j11, 0L, z16, voVar.S, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    voVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            MessagesController messagesController3 = voVar.getMessagesController();
                            long j12 = -voVar.V;
                            TLRPC.Chat chat4 = voVar.T;
                            boolean z17 = voVar.X;
                            chat4.noforwards = z17;
                            messagesController3.toggleChatNoForwards(j12, z17);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (ChatObject.isChannel(voVar.T)) {
                    voVar.getMessagesController().updateChannelUserName(voVar, voVar.V, obj, new ko(voVar, 1), new ko(voVar, 2));
                    voVar = voVar;
                } else {
                    final int i12 = 1;
                    voVar.getMessagesController().convertToMegaGroup(voVar.getParentActivity(), voVar.V, voVar, new MessagesStorage.LongCallback(voVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ vo b;

                        {
                            this.b = voVar;
                        }

                        @Override // org.telegram.messenger.MessagesStorage.LongCallback
                        public final void run(long j102) {
                            switch (i12) {
                                case 0:
                                    vo voVar2 = this.b;
                                    if (j102 == 0) {
                                        voVar2.getClass();
                                        break;
                                    } else {
                                        voVar2.V = j102;
                                        voVar2.T = voVar2.getMessagesController().getChat(Long.valueOf(j102));
                                        voVar2.X();
                                        break;
                                    }
                                case 1:
                                    vo voVar3 = this.b;
                                    if (j102 == 0) {
                                        voVar3.getClass();
                                        break;
                                    } else {
                                        voVar3.V = j102;
                                        voVar3.T = voVar3.getMessagesController().getChat(Long.valueOf(j102));
                                        voVar3.X();
                                        break;
                                    }
                                default:
                                    vo voVar4 = this.b;
                                    if (j102 == 0) {
                                        voVar4.getClass();
                                        break;
                                    } else {
                                        voVar4.V = j102;
                                        voVar4.T = voVar4.getMessagesController().getChat(Long.valueOf(j102));
                                        MessagesController messagesController4 = voVar4.getMessagesController();
                                        long j112 = -voVar4.V;
                                        TLRPC.Chat chat22 = voVar4.T;
                                        boolean z152 = voVar4.X;
                                        chat22.noforwards = z152;
                                        messagesController4.toggleChatNoForwards(j112, z152);
                                        voVar4.X();
                                        break;
                                    }
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) voVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(voVar.f);
                voVar.Z(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.r0 = this.W;
        j0Var.D0 = new ko(this, 0);
        showDialog(j0Var);
    }

    public final void Z(boolean z10) {
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
            ofFloat.addUpdateListener(new f3(this, 7));
            this.n0.setDuration((long) (Math.abs(this.r.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.n0.setInterpolator(org.telegram.ui.Components.gr.f);
            this.n0.start();
        }
    }

    public final void a0() {
        if (this.F == null) {
            return;
        }
        int i9 = 8;
        if (this.R || this.Y || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.b9 b9Var = this.c;
            int i10 = org.telegram.ui.ActionBar.f6.B6;
            b9Var.setTag(Integer.valueOf(i10));
            this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
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
            org.telegram.ui.Components.e80 e80Var = this.C;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.h0;
            e80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.C.c(this.h0, this.V);
            po poVar = this.f;
            poVar.setVisibility((this.R || poVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.V);
            this.E.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.V)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.b9 b9Var2 = this.c;
            int i11 = org.telegram.ui.ActionBar.f6.p7;
            b9Var2.setTag(Integer.valueOf(i11));
            this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
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
        ro roVar = this.Q;
        if (roVar != null) {
            roVar.setVisibility((!this.W || this.R) ? 0 : 8);
            ro roVar2 = this.Q;
            TLRPC.ChatFull chatFull2 = this.U;
            roVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.W) ? false : true);
        }
        uo uoVar = this.G;
        if (uoVar != null) {
            if (!this.R && !this.J.isEmpty()) {
                i9 = 0;
            }
            uoVar.setVisibility(i9);
        }
        U();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 26));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        this.r = frVar;
        this.n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        this.h = new gh.m(context);
        no noVar = new no(this, context, this.h, this.resourceProvider);
        this.fragmentView = noVar;
        noVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.in0 in0Var = (org.telegram.ui.Components.in0) this.fragmentView;
        in0Var.setFillViewport(true);
        in0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(in0Var);
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
        this.h.addView(this.s, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.e = m4Var;
        m4Var.setHeight(46);
        if (this.W) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.s.addView(this.e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.w = i6Var;
        if (this.W) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.R);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.R);
        }
        this.s.addView(this.w, g7.e6.n(-1, -2));
        this.w.setOnClickListener(new mo(this, i9));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.W) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.R);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.R);
        }
        this.s.addView(this.v, g7.e6.n(-1, -2));
        this.v.setOnClickListener(new mo(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        this.F = z6Var;
        this.h.addView(z6Var, g7.e6.n(-1, -2));
        if (z10) {
            this.w.setVisibility(8);
            this.v.setVisibility(8);
            this.F.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.y, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.A = linearLayout3;
        linearLayout3.setOrientation(0);
        this.y.addView(this.A, g7.e6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i11 = org.telegram.ui.ActionBar.f6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setEnabled(false);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163840);
        this.b.setImeOptions(6);
        this.A.addView(this.b, g7.e6.n(-2, 36));
        fg.g gVar = new fg.g(this, context, 4);
        this.a = gVar;
        gVar.setTextSize(1, 18.0f);
        this.a.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackground(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.a.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        this.A.addView(this.a, g7.e6.n(-1, 36));
        int i13 = 3;
        this.a.addTextChangedListener(new o0(this, i13));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.B = linearLayout4;
        linearLayout4.setOrientation(1);
        this.y.addView(this.B, g7.e6.n(-1, -2));
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, this, null, true, ChatObject.isChannel(this.T));
        this.C = e80Var;
        e80Var.setDelegate(new oo(this, context));
        this.C.d(0, null, false);
        this.B.addView(this.C);
        po poVar = new po(this, context, this.resourceProvider);
        this.f = poVar;
        poVar.setBottomPadding(6);
        this.h.addView(this.f, g7.e6.n(-2, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.c = b9Var;
        b9Var.setImportantForAccessibility(1);
        this.h.addView(this.c, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.c0 = s4Var;
        this.h.addView(s4Var, g7.e6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.x, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        this.a0 = z6Var2;
        this.h.addView(z6Var2, g7.e6.n(-1, -2));
        gh.m mVar = this.h;
        uo uoVar = new uo(this, context);
        this.G = uoVar;
        mVar.addView(uoVar, g7.e6.n(-1, -2));
        this.G.setVisibility((this.R || this.J.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
        this.D = p8Var;
        p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.D.setOnClickListener(new mo(this, i13));
        this.h.addView(this.D, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.E = b9Var2;
        this.h.addView(b9Var2, g7.e6.n(-1, -2));
        ro roVar = new ro(this, context, this.T, context);
        this.Q = roVar;
        TLRPC.ChatFull chatFull = this.U;
        roVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.W) ? false : true);
        ro roVar2 = this.Q;
        TLRPC.ChatFull chatFull2 = this.U;
        org.telegram.ui.Cells.b9 b9Var3 = roVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(roVar2.n);
        boolean isPublic = ChatObject.isPublic(roVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            b9Var3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfo2 : isPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2));
        } else {
            b9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.ChannelSettingsJoinRequestInfoManagedBy : isPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy, "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.il, false), new org.telegram.ui.Components.zq(24, chatFull2, this)));
        }
        this.h.addView(this.Q);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.M = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.M);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.N = m4Var3;
        m4Var3.setHeight(46);
        this.N.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.M.addView(this.N, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.O = t8Var;
        t8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.X, false);
        this.O.setOnClickListener(new mo(this, 4));
        this.M.addView(this.O, g7.e6.n(-1, -2));
        this.P = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        if (!this.W || ChatObject.isMegagroup(this.T)) {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.M.addView(this.P, g7.e6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.T, true);
        if (!this.R && publicUsername != null) {
            this.i0 = true;
            this.a.setText(publicUsername);
            this.a.setSelection(publicUsername.length());
            this.i0 = false;
        }
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.V) {
                this.U = chatFull;
                this.h0 = chatFull.exported_invite;
                a0();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.dialogDeleted) {
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
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        int i9 = org.telegram.ui.ActionBar.f6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.F, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4096, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4096, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4, null, null, null, null, i13));
        fg.g gVar = this.a;
        int i14 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.s;
        int i15 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.y, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 4096, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4096, null, null, null, null, i11));
        int i17 = org.telegram.ui.ActionBar.f6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.f6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i19 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 4096, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i13));
        int i20 = org.telegram.ui.ActionBar.f6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4096, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        fg.g gVar;
        super.onBecomeFullyVisible();
        if (!this.j0 || (gVar = this.a) == null) {
            return;
        }
        gVar.requestFocus();
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
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new io(this, 3));
        }
        if (this.R && this.U != null) {
            getMessagesController().loadFullChat(this.V, this.classGuid, true);
        }
        if (this.T != null) {
            this.I.clear();
            arrayList.clear();
            for (int i9 = 0; i9 < this.T.usernames.size(); i9++) {
                if (this.T.usernames.get(i9).active) {
                    arrayList.add(this.T.usernames.get(i9));
                }
            }
            for (int i10 = 0; i10 < this.T.usernames.size(); i10++) {
                if (!this.T.usernames.get(i10).active) {
                    arrayList.add(this.T.usernames.get(i10));
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        gh.m mVar = this.h;
        if (mVar != null) {
            mVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i12);
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
