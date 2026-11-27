// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wf1 extends e implements fn7 {
    public static int Q0 = 10;
    public static final int[] R0 = {jn7.T, jn7.r, jn7.s, jn7.C, jn7.G0};
    public HashMap A0;
    public boolean B0;
    public final kf1 C0;
    public nf1 D0;
    public hw6 E;
    public final ArrayList E0;
    public tf1 F;
    public final zh6 F0;
    public TextView G;
    public if1 G0;
    public fv1 H;
    public int H0;
    public FrameLayout I;
    public ef1 I0;
    public f82 J;
    public wb2 J0;
    public LinearLayout K;
    public int K0;
    public ImageView L;
    public final vf1 L0;
    public xb M;
    public long M0;
    public dl1 N;
    public int N0;
    public s7 O;
    public int O0;
    public long P;
    public final RectF P0;
    public boolean Q;
    public boolean R;
    public AnimatorSet S;
    public boolean T;
    public final int[] U;
    public boolean V;
    public boolean W;
    public jz1 X;
    public uf1 Y;
    public r47 Z;
    public final sz4 a;
    public TLRPC.ChannelParticipant a0;
    public final ll0 b;
    public FrameLayout b0;
    public final ll0 c;
    public ImageView c0;
    public final tq3 d;
    public ema d0;
    public final int e;
    public zc e0;
    public final TLRPC.Chat f;
    public jx f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final zh6 l0;
    public final zh6 m0;
    public FrameLayout n;
    public final HashMap n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final HashSet q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public boolean t0;
    public ArrayList u0;
    public TLRPC.TL_channelAdminLogEventsFilter v0;
    public gu w;
    public String w0;
    public UndoView x;
    public zh6 x0;
    public as y;
    public final pn y0;
    public final HashMap z0;

    public wf1(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new zh6();
        this.m0 = new zh6();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new pn(R0);
        this.z0 = new HashMap();
        this.C0 = new kf1(this);
        this.E0 = new ArrayList();
        this.F0 = new zh6();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.L0 = new vf1(this);
        this.N0 = -1;
        this.P0 = new RectF();
        vy4 vy4Var = this.glassEngine;
        vy4Var.a = new bf1(this);
        vy4Var.d = new gz4(hl.L(48.0f));
        sz4 sz4Var = new sz4();
        this.a = sz4Var;
        ll0 ll0Var = new ll0(sz4Var, sz4Var, sz4Var);
        this.b = ll0Var;
        ll0Var.j = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !xea.f()) {
            this.d = null;
            this.e = 0;
            ll0 ll0Var2 = new ll0(sz4Var, sz4Var, sz4Var);
            this.c = ll0Var2;
            ll0Var2.j = this.glassEngine;
        } else {
            tq3 tq3Var = new tq3(false);
            this.d = tq3Var;
            this.glassEngine.a(tq3Var);
            rz4 rz4Var = new rz4(sz4Var);
            rz4Var.d = tq3Var;
            rz4Var.e = -3;
            rz4Var.f = sz4Var;
            if (i86.e(262144)) {
                rz4 rz4Var2 = new rz4(sz4Var);
                rz4Var2.d = tq3Var;
                rz4Var2.e = -2;
                rz4Var2.f = sz4Var;
                ll0 ll0Var3 = new ll0(rz4Var2, rz4Var2, rz4Var2);
                this.c = ll0Var3;
                ll0Var3.j = this.glassEngine;
                int L = i86.e(262144) ? hl.L(8.0f) : hl.L(48.0f);
                ll0Var3.d = L;
                ll0Var3.e = L;
                ll0Var3.k = true;
                this.e = 0;
            } else {
                ll0 ll0Var4 = new ll0(rz4Var, rz4Var, rz4Var);
                this.c = ll0Var4;
                ll0Var4.j = this.glassEngine;
                int L2 = i86.e(262144) ? hl.L(8.0f) : hl.L(48.0f);
                ll0Var4.d = L2;
                ll0Var4.e = L2;
                this.e = hl.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static gs8 P0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (wm2 wm2Var : (wm2[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), wm2.class)) {
            if (wm2Var != null) {
                Drawable drawable = wm2Var.c;
                if (drawable instanceof gs8) {
                    return (gs8) drawable;
                }
            }
        }
        return null;
    }

    public static void d1(int i, r47 r47Var) {
        if (r47Var == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = r47Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = r47Var.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            r47Var.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = ob6.G(i, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        r47Var.h5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t = hl.t(spannableStringBuilder, "\n\n");
        if (t >= 0 && Build.VERSION.SDK_INT >= 29) {
            vk1.j();
            spannableStringBuilder.setSpan(vk1.g(hl.L(8.0f)), t + 1, t + 2, 33);
        }
        return spannableStringBuilder;
    }

    public final r47 I0(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        r47 r47Var;
        byte b = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            if (i >= arrayList2.size()) {
                r47Var = null;
                break;
            }
            r47Var = (r47) arrayList2.get(i);
            if (r47Var != null && r47Var.U == 1 && r47Var.J0 == j) {
                break;
            }
            i++;
        }
        if (r47Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((r47) arrayList.get(0)).k.date;
            } catch (Exception e) {
                cc4.g(e, true);
            }
            r47Var = new r47(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
        r47Var.U = 1;
        if (!z2 || arrayList.size() <= 1) {
            r47Var.J0 = -1L;
        } else {
            r47Var.J0 = j;
        }
        byte b2 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r47.D5(ob6.G(arrayList.size(), z2 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new yz(b2)).distinct().map(new cf1(this, b)).filter(new eh(b2)).limit(4L).toArray())), "un1", X1));
        if (z2 && arrayList.size() > 1) {
            gs8 P0 = P0(r47Var.v);
            if (P0 == null) {
                P0 = new gs8(ob6.M0(z ? 2131751001 : 2131751000, null));
                Typeface o = hl.o();
                hn hnVar = P0.a;
                hnVar.x(o);
                hnVar.w(hl.L(10.0f));
                if (P0.c != -1) {
                    P0.c = -1;
                    P0.invalidateSelf();
                }
                P0.a(503316480);
            } else {
                P0.a.t(ob6.M0(z ? 2131751001 : 2131751000, null), false, true);
            }
            P0.setBounds(0, 0, P0.getIntrinsicWidth(), hl.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new wm2(0, P0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        r47Var.v = spannableStringBuilder;
        r47 r47Var2 = arrayList.size() > 0 ? (r47) c00.g(1, arrayList) : null;
        if (r47Var2 != null) {
            long j3 = r47Var2.T;
            zh6 zh6Var = this.F0;
            if (!zh6Var.d(j3)) {
                long j4 = r47Var2.T;
                int i2 = Q0;
                Q0 = i2 + 1;
                zh6Var.k(j4, Integer.valueOf(i2));
            }
            r47Var.m1 = ((Integer) zh6Var.f(r47Var2.T)).intValue();
        }
        return r47Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r6.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(Bundle bundle, long j) {
        TLRPC.Chat chat = this.f;
        if (!chat.megagroup || this.u0 == null || !xc2.w(2, chat)) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.u0.get(i);
            if (r47.B1(channelParticipant.peer) != j) {
                i++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public final void K0(r47 r47Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(R.string.AppName, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        if (r47Var.D == 3) {
            idVar.U = ob6.M0(2131747909, null);
        } else {
            idVar.U = ob6.a0(null, null, 2131747936, r47Var.F0().mime_type);
        }
        showDialog(idVar);
    }

    public final void L0(boolean z) {
        as asVar = this.y;
        if (asVar == null || this.j0) {
            return;
        }
        int K0 = asVar.K0();
        if ((K0 == -1 ? 0 : Math.abs(this.y.M0() - K0) + 1) > 0) {
            this.F.getClass();
            if (K0 > (z ? 4 : 1) || this.s0 || this.r0) {
                return;
            }
            X0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x018c, code lost:
    
        if (ls6.d0(r1.currentAccount).D0(r10.id, true) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01a5, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01a3, code lost:
    
        if (ls6.d0(r1.currentAccount).O.containsKey(r10.short_name) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M0(View view, float f, float f2) {
        Integer num;
        Integer num2;
        char c;
        boolean z;
        String str;
        Integer num3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num4;
        String str2;
        TLRPC.Message message;
        TLRPC.User X1;
        wf1 wf1Var = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        r47 messageObject = view instanceof wb2 ? ((wb2) view).getMessageObject() : view instanceof dl1 ? ((dl1) view).getMessageObject() : null;
        if (messageObject == null) {
            return false;
        }
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = messageObject.L1;
        int i = messageObject.D;
        if (i != 6) {
            if (i == 10 || i == 11 || i == 16) {
                num = 5;
                num2 = 10;
                if (messageObject.e1() != 0) {
                    c = 1;
                }
            } else {
                if (r47.Q4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.s4() || messageObject.J2()) {
                    num = 5;
                    TLRPC.InputStickerSet j1 = r47.j1(messageObject.k);
                    if (j1 instanceof TLRPC.TL_inputStickerSetID) {
                        num2 = 10;
                    } else {
                        num2 = 10;
                        if (j1 instanceof TLRPC.TL_inputStickerSetShortName) {
                        }
                        c = 2;
                    }
                } else {
                    if (messageObject.g4()) {
                        if (messageObject.g4()) {
                            boolean z2 = f11.a;
                        }
                        if (messageObject.D != 12) {
                            num = 5;
                            num2 = 10;
                            c = '\b';
                        } else {
                            num = 5;
                            num2 = 10;
                            if (messageObject.F3()) {
                                c = 3;
                            }
                            c = 2;
                        }
                    }
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.I3() || r47.K4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z3 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z3) {
                            num = 5;
                            z = z3;
                        } else {
                            xb4 fileLoader = wf1Var.getFileLoader();
                            z = z3;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (xb4.M(message2, false, true).exists()) {
                                z = true;
                            }
                        }
                        if (z) {
                            if (messageObject.F0() != null && (str = messageObject.F0().mime_type) != null) {
                                if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                                    num2 = 10;
                                    c = '\n';
                                } else if (str.endsWith("/xml")) {
                                    num2 = 10;
                                    c = 5;
                                } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                    num2 = 10;
                                    c = 6;
                                }
                            }
                            num2 = 10;
                            c = 4;
                        }
                    }
                    if (messageObject.D != 12) {
                    }
                }
                num2 = 10;
                c = 2;
            }
            wf1Var.Z = messageObject;
            if (wf1Var.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            r47 r47Var = messageObject;
            TLRPC.Chat chat = wf1Var.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        bt5 bt5Var = new bt5(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().N0(chat.id), null, this, chat.id, false, xc2.V(chat));
                        bt5Var.e2 = false;
                        bt5Var.show();
                        return true;
                    }
                }
                wf1Var = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != wf1Var.getMessagesController().L3) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof dl1) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = wf1Var.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(wf1Var.getThemedColor(aob.xj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, hl.L(10.0f), hl.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131750960, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) ob6.M0(2131752492, null));
                        spannableStringBuilder.setSpan(new a31(wf1Var, (byte) 2), 0, spannableStringBuilder.length(), 33);
                        v21 I = d31.b0(wf1Var).I(R.raw.msg_antispam, ob6.M0(2131752435, null), hl.G2(ob6.M0(2131752436, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    c00.s(null, 2131745946, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            r47 r47Var2 = wf1Var.Z;
            if (r47Var2.D == 0 || r47Var2.z != null) {
                c00.t(null, 2131751732, arrayList, arrayList3, valueOf2);
                arrayList2.add(3);
            }
            if (c == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = wf1Var.Z.L1;
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
                            showDialog(new s4b(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    } else if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                        nd5 nd5Var = new nd5(chat.id, 0);
                        TLRPC.ChatFull N0 = wf1Var.getMessagesController().N0(chat.id);
                        if (N0 != null) {
                            nd5Var.i0(N0);
                            wf1Var.presentFragment(nd5Var);
                        }
                    } else if ((channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && xc2.y(13, chat)) {
                        zi2 zi2Var = new zi2(wf1Var.getParentActivity(), chat);
                        zi2Var.v1 = new gf1(wf1Var);
                        wf1Var.showDialog(zi2Var);
                    }
                }
            } else if (c == 3) {
                TLRPC.MessageMedia messageMedia = wf1Var.Z.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && r47.M3(messageMedia.webpage.document)) {
                    c00.t(null, 2131745658, arrayList, arrayList3, valueOf);
                    arrayList2.add(11);
                }
            } else if (c != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c == 5) {
                    c00.s(null, 2131754210, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(ob6.M0(2131745659, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(ob6.M0(2131745187, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c == '\n') {
                        c00.s(null, 2131754208, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(ob6.M0(2131745659, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(ob6.M0(2131745187, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c == 6) {
                        c00.t(null, 2131745657, arrayList, arrayList3, valueOf3);
                        arrayList2.add(7);
                        arrayList.add(ob6.M0(2131745659, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(ob6.M0(2131745187, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c == 7) {
                        TLRPC.Message message3 = wf1Var.Z.k;
                        if (r47.n1(message3) == null || !r47.E3(r47.n1(message3).document)) {
                            arrayList.add(ob6.M0(2131754362, null));
                        } else {
                            arrayList.add(ob6.M0(2131754364, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c == '\b') {
                        long j = wf1Var.Z.k.media.user_id;
                        TLRPC.User X12 = j != 0 ? uc7.s1(wf1Var.currentAccount).X1(Long.valueOf(j)) : null;
                        if (X12 != null && X12.id != yac.h(wf1Var.currentAccount).e() && lv2.r(wf1Var.currentAccount).g0.get(Long.valueOf(X12.id)) == null) {
                            c00.s(null, 2131754437, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(wf1Var.Z.k.media.phone_number)) {
                            c00.t(null, 2131751732, arrayList, arrayList3, valueOf2);
                            arrayList2.add(16);
                            arrayList.add(ob6.M0(2131752615, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (r47.K4(wf1Var.Z.k)) {
                c00.t(null, 2131745657, arrayList, arrayList3, valueOf3);
                arrayList2.add(num4);
                arrayList.add(ob6.M0(2131745187, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (wf1Var.Z.I3()) {
                    c00.t(null, 2131745639, arrayList, arrayList3, num3);
                    arrayList2.add(num2);
                    arrayList.add(ob6.M0(2131745187, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (wf1Var.Z.F0() != null) {
                        if (r47.M3(wf1Var.Z.F0())) {
                            str2 = null;
                            c00.t(null, 2131745658, arrayList, arrayList3, valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        c00.t(str2, 2131745659, arrayList, arrayList3, num10);
                        arrayList2.add(num9);
                        arrayList.add(ob6.M0(2131745187, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        c00.t(null, 2131745657, arrayList, arrayList3, valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            df1 df1Var = new df1(wf1Var, arrayList2, arrayList, arrayList3, view, f, f2);
            if (xc2.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = r47Var.k) != null && message.from_id != null && (X1 = wf1Var.getMessagesController().X1(Long.valueOf(wf1Var.Z.k.from_id.user_id))) != null && !lbc.D(X1)) {
                    wf1Var.getMessagesController().K0(chat, X1, new hu0(wf1Var, arrayList, arrayList3, arrayList2, df1Var, (byte) 2));
                    return true;
                }
            }
            df1Var.run();
            return true;
        }
        num = 5;
        num2 = 10;
        c = 65535;
        wf1Var.Z = messageObject;
        if (wf1Var.getParentActivity() != null) {
        }
    }

    public final TextureView N0(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            zc zcVar = new zc((byte) 7, (Context) getParentActivity(), (Object) this);
            this.e0 = zcVar;
            zcVar.setOutlineProvider(new yi((byte) 2));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            jx jxVar = new jx(getParentActivity());
            this.f0 = jxVar;
            jxVar.setBackgroundColor(0);
            if (z) {
                this.e0.addView(this.f0, tre.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, tre.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            uf1 uf1Var = this.Y;
            zc zcVar2 = this.e0;
            int i = hl.u;
            uf1Var.addView(zcVar2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void O0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList4 = this.o0;
            if (i >= arrayList4.size()) {
                ArrayList arrayList5 = this.p0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            r47 r47Var = (r47) arrayList4.get(i);
            long j = (r47Var == null || (tL_channelAdminLogEvent2 = r47Var.L1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (r47Var.m1 <= 0) {
                int i2 = Q0;
                Q0 = i2 + 1;
                r47Var.m1 = i2;
            }
            int i3 = i + 1;
            r47 r47Var2 = i3 < arrayList4.size() ? (r47) arrayList4.get(i3) : null;
            long j2 = (r47Var2 == null || (tL_channelAdminLogEvent = r47Var2.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j != 0) {
                arrayList3.add(r47Var);
            } else {
                arrayList2.add(r47Var);
            }
            if (j == j2 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = r47Var.k.reply_markup;
                boolean z = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((r47) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((r47) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    r47 r47Var3 = (r47) c00.g(1, arrayList3);
                    boolean z2 = TextUtils.isEmpty(this.w0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(r47Var3.T);
                    HashSet hashSet = this.q0;
                    if (hashSet.contains(valueOf) || !z2) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            d1(0, (r47) arrayList3.get(i4));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        d1(arrayList3.size() - 1, r47Var3);
                        arrayList2.add(r47Var3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = r47Var3.k.reply_markup;
                    if (z != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        r47Var3.M1 = true;
                        this.F.g((z ? arrayList3.size() - 1 : 0) + size);
                        this.F.g(size + (z ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j3 = r47Var.T;
                    r47 I0 = I0(j3, r47Var.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j3)), z2);
                    arrayList = arrayList3;
                    arrayList2.add(I0);
                }
                if (!arrayList6.isEmpty()) {
                    r47 r47Var4 = (r47) c00.g(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(I0(r47Var4.T, r47Var4.L1.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i = i3;
            arrayList3 = arrayList;
        }
    }

    public final void Q0(boolean z) {
        if (this.N.getTag() == null || this.Q) {
            return;
        }
        if (!this.T || this.R) {
            this.N.setTag(null);
            if (!z) {
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            animatorSet2.setDuration(150L);
            this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
            this.S.addListener(new jb1((Object) this, (byte) 2));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void R0(int i) {
        tq3 tq3Var;
        if (Build.VERSION.SDK_INT < 31 || (tq3Var = this.d) == null) {
            return;
        }
        if (vsd.a(i, 4)) {
            fz4 e = this.glassEngine.e();
            e.b(this.w.getY(), this.Y.getWidth(), this.w.getY() + this.w.getHeight());
            tq3Var.h(e);
        }
        uf1 uf1Var = this.Y;
        Objects.requireNonNull(uf1Var);
        tq3Var.e(new mr0(uf1Var, (byte) 2), this.Y.getWidth(), this.Y.getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x036a, code lost:
    
        if (r0.exists() == false) goto L127;
     */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [org.telegram.tgnet.TLRPC$ChannelParticipant, r47] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(int i, ArrayList arrayList, Integer num) {
        TLRPC.Chat M0;
        File file;
        TLRPC.User X1;
        if (this.Z == null || i >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        if1 if1Var = this.G0;
        if (if1Var != null) {
            if1Var.dismiss();
        }
        r47 r47Var = this.Z;
        if (r47Var != null) {
            ?? r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            if (intValue != 3) {
                if (intValue == 4) {
                    String str = r47Var.k.attachPath;
                    if (str != null && str.length() > 0 && !bp1.t(str)) {
                        str = null;
                    }
                    if (str == null || str.length() == 0) {
                        xb4 fileLoader = getFileLoader();
                        TLRPC.Message message = this.Z.k;
                        fileLoader.getClass();
                        str = xb4.M(message, false, true).toString();
                    }
                    int i2 = this.Z.D;
                    if (i2 == 3 || i2 == 1) {
                        if ((Build.VERSION.SDK_INT <= 28 || f11.b) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                            getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                            this.Z = null;
                            this.a0 = null;
                            return;
                        }
                        MediaController.g0(str, getParentActivity(), this.Z.D != 3 ? 0 : 1, null, null, null);
                        r8 = 0;
                    }
                } else if (intValue == 5) {
                    String str2 = r47Var.k.attachPath;
                    if (str2 != null && str2.length() != 0) {
                        file = new File(this.Z.k.attachPath);
                    }
                    file = null;
                    if (file == null) {
                        xb4 fileLoader2 = getFileLoader();
                        TLRPC.Message message2 = this.Z.k;
                        fileLoader2.getClass();
                        File M = xb4.M(message2, false, true);
                        if (M.exists()) {
                            file = M;
                        }
                    }
                    if (file != null) {
                        if (file.getName().toLowerCase().endsWith("attheme")) {
                            as asVar = this.y;
                            if (asVar != null) {
                                if (asVar.M0() < this.y.A() - 1) {
                                    int K0 = this.y.K0();
                                    this.h0 = K0;
                                    n69 n69Var = (n69) this.w.L(K0);
                                    if (n69Var != null) {
                                        this.i0 = n69Var.a.getTop();
                                    } else {
                                        this.h0 = -1;
                                    }
                                } else {
                                    this.h0 = -1;
                                }
                            }
                            znb u = aob.u(file, this.Z.I0(), null, true);
                            if (u != null) {
                                presentFragment(new pqb(u));
                            } else {
                                this.h0 = -1;
                                if (getParentActivity() == null) {
                                    this.Z = null;
                                    this.a0 = null;
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                                String M02 = ob6.M0(R.string.AppName, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M02;
                                idVar.U = ob6.M0(2131748954, null);
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                showDialog(idVar);
                            }
                        } else if (ob6.D0().e(file, this.currentAccount)) {
                            presentFragment(new LanguageSelectActivity());
                        } else {
                            if (getParentActivity() == null) {
                                this.Z = null;
                                this.a0 = null;
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                            String M03 = ob6.M0(R.string.AppName, null);
                            id idVar2 = alertDialog$Builder2.a;
                            idVar2.S = M03;
                            idVar2.U = ob6.M0(2131748955, null);
                            alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                            showDialog(idVar2);
                        }
                    }
                } else if (intValue == 6) {
                    String str3 = r47Var.k.attachPath;
                    if (str3 != null && str3.length() > 0 && !bp1.t(str3)) {
                        str3 = null;
                    }
                    if (str3 == null || str3.length() == 0) {
                        xb4 fileLoader3 = getFileLoader();
                        TLRPC.Message message3 = this.Z.k;
                        fileLoader3.getClass();
                        str3 = xb4.M(message3, false, true).toString();
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType(this.Z.F0().mime_type);
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            Activity parentActivity = getParentActivity();
                            a.d();
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", new File(str3)));
                            intent.setFlags(1);
                        } catch (Exception unused) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                    }
                    try {
                        getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, null)), 500);
                    } catch (Exception unused2) {
                    }
                } else if (intValue != 7) {
                    byte b = 2;
                    switch (intValue) {
                        case 9:
                            showDialog(new s4b(getParentActivity(), this, r47.j1(this.Z.k), null, null, null));
                            break;
                        case 10:
                            if ((Build.VERSION.SDK_INT > 28 && !f11.b) || getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                String B = xb4.B(this.Z.F0());
                                if (TextUtils.isEmpty(B)) {
                                    B = this.Z.S0();
                                }
                                String str4 = B;
                                String str5 = this.Z.k.attachPath;
                                if (str5 != null && str5.length() > 0 && !bp1.t(str5)) {
                                    str5 = null;
                                }
                                if (str5 == null || str5.length() == 0) {
                                    xb4 fileLoader4 = getFileLoader();
                                    TLRPC.Message message4 = this.Z.k;
                                    fileLoader4.getClass();
                                    str5 = xb4.M(message4, false, true).toString();
                                }
                                MediaController.g0(str5, getParentActivity(), this.Z.I3() ? 3 : 2, str4, this.Z.F0() != null ? this.Z.F0().mime_type : "", null);
                                break;
                            } else {
                                getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                this.Z = null;
                                this.a0 = null;
                                return;
                            }
                            break;
                        case 11:
                            uc7.s1(this.currentAccount).E4(this.Z, r47Var.F0());
                            break;
                        default:
                            switch (intValue) {
                                case 15:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", this.Z.k.media.user_id);
                                    bundle.putString("phone", this.Z.k.media.phone_number);
                                    bundle.putBoolean("addContact", true);
                                    presentFragment(new cu2(bundle));
                                    break;
                                case 16:
                                    hl.g(r47Var.k.media.phone_number);
                                    d31.b0(this).i(ob6.M0(2131747022, null)).j();
                                    break;
                                case 17:
                                    try {
                                        Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.Z.k.media.phone_number));
                                        intent2.addFlags(TLObject.FLAG_28);
                                        getParentActivity().startActivityForResult(intent2, 500);
                                        break;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        break;
                                    }
                                default:
                                    TLRPC.Chat chat = this.f;
                                    switch (intValue) {
                                        case 33:
                                            if (this.a0 != null) {
                                                TLRPC.User X12 = getMessagesController().X1(Long.valueOf(wf3.n(this.a0.peer)));
                                                TLRPC.ChannelParticipant channelParticipant = this.a0;
                                                if (channelParticipant.banned_rights == null) {
                                                    channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                                }
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.a0.banned_rights;
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
                                                getMessagesController().a5(chat.id, X12, null, this.a0.banned_rights, true, getFragmentForAlert(1), new z21(this, X12, (byte) 18));
                                                break;
                                            }
                                            break;
                                        case 34:
                                            TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                            tL_channels_reportAntiSpamFalsePositive.channel = getMessagesController().h1(chat.id);
                                            tL_channels_reportAntiSpamFalsePositive.msg_id = this.Z.L1();
                                            getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new af1(this, b));
                                            break;
                                        case 35:
                                            getMessagesController().c0(chat.id, getMessagesController().m1(this.Z.k.from_id), false, new ef1(this, b));
                                            if ((this.Z.k.from_id instanceof TLRPC.TL_peerUser) && d31.a(this) && (X1 = getMessagesController().X1(Long.valueOf(this.Z.k.from_id.user_id))) != null) {
                                                d31.D(this, X1, chat.title).j();
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
                } else {
                    String str6 = r47Var.k.attachPath;
                    if (str6 != null && str6.length() > 0 && !bp1.t(str6)) {
                        str6 = null;
                    }
                    if (str6 == null || str6.length() == 0) {
                        xb4 fileLoader5 = getFileLoader();
                        TLRPC.Message message5 = this.Z.k;
                        fileLoader5.getClass();
                        str6 = xb4.M(message5, false, true).toString();
                    }
                    if ((Build.VERSION.SDK_INT <= 28 || f11.b) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        this.Z = null;
                        this.a0 = null;
                        return;
                    }
                    MediaController.g0(str6, getParentActivity(), 0, null, null, null);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long Z0 = r47Var.Z0();
                if (0 != Z0) {
                    if (Z0 > 0) {
                        TLRPC.User X13 = uc7.s1(this.currentAccount).X1(Long.valueOf(Z0));
                        if (X13 != null) {
                            spannableStringBuilder.append((CharSequence) lv2.m(0, X13.first_name, X13.last_name)).append((CharSequence) ":\n");
                        }
                    } else if (Z0 < 0 && (M0 = uc7.s1(this.currentAccount).M0(Long.valueOf(-Z0))) != null) {
                        spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                    }
                }
                if (TextUtils.isEmpty(r47Var.v)) {
                    spannableStringBuilder.append((CharSequence) r47Var.k.message);
                } else {
                    spannableStringBuilder.append(r47Var.v);
                }
                hl.g(spannableStringBuilder);
                d31.b0(this).i(ob6.M0(2131748343, null)).j();
            }
            this.Z = r8;
            this.a0 = r8;
        }
    }

    public final void T0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        int i;
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || getParentActivity() == null) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, getResourceProvider(), getParentActivity());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(hl.L(200.0f));
        Rect rect = new Rect();
        getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        yob.h(aob.G8, getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            if (arrayList4.get(i2) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new k8(getParentActivity(), getResourceProvider()), tre.o(-1, 8));
            } else {
                b8 b8Var = new b8(0, getResourceProvider(), getParentActivity(), i2 == 0, i2 == size + (-1));
                b8Var.setMinimumWidth(hl.L(200.0f));
                b8Var.j((CharSequence) arrayList2.get(i2), ((Integer) arrayList3.get(i2)).intValue(), null);
                if (((Integer) arrayList4.get(i2)).intValue() == 35) {
                    b8Var.d(getThemedColor(aob.q7), getThemedColor(aob.p7));
                }
                Integer num = (Integer) arrayList4.get(i2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                b8Var.setOnClickListener(new jf((Object) this, i2, (Object) arrayList4, (Object) num, (byte) 1));
            }
            i2++;
            arrayList4 = arrayList;
        }
        hf1 hf1Var = new hf1(this, this.Y.getContext(), (byte) 0);
        hf1Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        hf1Var.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        if1 if1Var = new if1(this, hf1Var);
        this.G0 = if1Var;
        if1Var.e = true;
        if1Var.c = (short) 220;
        if1Var.setOutsideTouchable(true);
        this.G0.setClippingEnabled(true);
        this.G0.setAnimationStyle(R.style.PopupContextAnimation);
        this.G0.setFocusable(true);
        hf1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
        this.G0.setInputMethodMode(2);
        this.G0.setSoftInputMode(48);
        this.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f)) - hf1Var.getMeasuredWidth()) + rect.left) - hl.L(28.0f);
        if (left < hl.L(6.0f)) {
            left = hl.L(6.0f);
        } else if (left > (this.w.getMeasuredWidth() - hl.L(6.0f)) - hf1Var.getMeasuredWidth()) {
            left = (this.w.getMeasuredWidth() - hl.L(6.0f)) - hf1Var.getMeasuredWidth();
        }
        if (hl.O1()) {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = this.Y.getHeight();
        int L = hl.L(48.0f) + hf1Var.getMeasuredHeight();
        int Q = this.Y.Q();
        if (Q > hl.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            i = (int) (this.w.getY() + view.getTop() + f2);
            if ((L - rect.top) - rect.bottom > hl.L(240.0f)) {
                i += hl.L(240.0f) - L;
            }
            if (i < this.w.getY() + hl.L(24.0f)) {
                i = (int) (this.w.getY() + hl.L(24.0f));
            } else {
                int i3 = height - L;
                if (i > i3 - hl.L(8.0f)) {
                    i = i3 - hl.L(8.0f);
                }
            }
        } else {
            i = this.inBubbleMode ? 0 : hl.m;
        }
        hf1Var.setMaxHeight(height - i);
        this.G0.showAtLocation(this.w, 51, left, i);
        this.G0.b();
    }

    public final void U0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().j4(tL_channels_channelParticipants.users, false);
            getMessagesController().c4(tL_channels_channelParticipants.chats, false);
            this.u0 = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.f;
            if (chat != null && (N0 = getMessagesController().N0(chat.id)) != null && N0.antispam) {
                jf1 jf1Var = new jf1();
                jf1Var.user_id = getMessagesController().L3;
                jf1Var.peer = getMessagesController().y1(jf1Var.user_id);
                long j = getMessagesController().L3;
                if (getMessagesController().X1(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new af1(this, (byte) 1));
                }
                this.u0.add(0, jf1Var);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof jb) {
                ((jb) dialog).a1(this.u0);
            }
        }
    }

    public final void V0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        byte b;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        r47 r47Var;
        int i = 0;
        this.D0.N = false;
        a1(false);
        uc7.s1(this.currentAccount).j4(tL_channels_adminLogResults.users, false);
        uc7.s1(this.currentAccount).c4(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = this.o0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            b = 1;
            if (i2 >= tL_channels_adminLogResults.events.size()) {
                break;
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            long j = tL_channelAdminLogEvent.id;
            zh6 zh6Var = this.l0;
            if (zh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent.id);
                r47 r47Var2 = new r47(this.currentAccount, tL_channelAdminLogEvent, arrayList, this.n0, this.f, this.U, false);
                if (r47Var2.U >= 0) {
                    zh6Var.k(tL_channelAdminLogEvent.id, r47Var2);
                }
                z = true;
            }
            i2++;
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            r47 r47Var3 = (r47) arrayList.get(size);
            if (r47Var3 != null && r47Var3.U != 0 && r47Var3.L1() >= 0) {
                this.m0.k(r47Var3.L1(), r47Var3);
            }
            if (r47Var3 != null && (message = r47Var3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            r47Var = null;
                            break;
                        }
                        if (size != i3) {
                            r47Var = (r47) arrayList.get(i3);
                            if (r47Var.U != 1 && r47Var.L1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (r47Var != null) {
                        r47Var3.C = r47Var;
                    }
                }
                arrayList2.add(r47Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            ls6.d0(this.currentAccount).Y0(arrayList2, -this.f.id, 0, 0L, new ef1(this, b), getClassGuid(), null);
        }
        O0();
        this.s0 = false;
        if (!z) {
            this.r0 = true;
        }
        hl.T3(this.n, false, 0.3f, true, true);
        this.w.setEmptyView(this.I);
        tf1 tf1Var = this.F;
        if (tf1Var != null) {
            tf1Var.f();
        }
        s7 s7Var = this.O;
        if (s7Var != null) {
            if (this.p0.isEmpty() && TextUtils.isEmpty(this.w0)) {
                i = 8;
            }
            s7Var.setVisibility(i);
        }
    }

    public final void W0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.t0 = false;
        this.D0.N = false;
        a1(false);
        uc7.s1(this.currentAccount).j4(tL_channels_adminLogResults.users, false);
        uc7.s1(this.currentAccount).c4(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            zh6 zh6Var = this.l0;
            if (zh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent2.id);
                r47 r47Var = new r47(this.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, this.f, this.U, false);
                if (r47Var.U >= 0 && (((tL_channelAdminLogEvent = r47Var.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !zh6Var.d(tL_channelAdminLogEvent2.id))) {
                    this.o0.add(0, r47Var);
                    zh6Var.k(tL_channelAdminLogEvent2.id, r47Var);
                    z = true;
                }
            }
        }
        if (this.F == null || !z) {
            return;
        }
        O0();
        this.F.f();
    }

    public final void X0(boolean z) {
        tf1 tf1Var;
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        if (z) {
            this.P = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                hl.T3(frameLayout, true, 0.3f, true, true);
                this.I.setVisibility(4);
                this.w.setEmptyView(null);
            }
            this.l0.b();
            arrayList.clear();
            this.n0.clear();
            O0();
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = uc7.i1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 50;
        if (z || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.P;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags |= 1;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.x0.m(); i++) {
                tL_channels_getAdminLog.admins.add(uc7.s1(this.currentAccount).q1((TLRPC.User) this.x0.n(i)));
            }
        }
        g1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new af1(this, (byte) 3));
        if (!z || (tf1Var = this.F) == null) {
            return;
        }
        tf1Var.f();
    }

    public final void Y0() {
        if (this.w == null || this.o0.isEmpty()) {
            return;
        }
        this.y.g1(this.p0.size() - 1, (-100000) - this.w.getPaddingTop());
    }

    public final void Z0() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = uc7.i1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags |= 1;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        byte b = 0;
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.x0.m(); i++) {
                tL_channels_getAdminLog.admins.add(uc7.s1(this.currentAccount).q1((TLRPC.User) this.x0.n(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new af1(this, b));
    }

    public final void a1(boolean z) {
        gu guVar = this.w;
        if (guVar == null || this.y == null || guVar.getChildCount() <= 0) {
            return;
        }
        int i = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < this.w.getChildCount(); i3++) {
            View childAt = this.w.getChildAt(i3);
            this.w.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0) {
                int top = childAt.getTop();
                if (z) {
                    if (top >= i) {
                    }
                    i = childAt.getTop();
                    view = childAt;
                    i2 = S;
                } else {
                    if (top <= i) {
                    }
                    i = childAt.getTop();
                    view = childAt;
                    i2 = S;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof wb2 ? ((wb2) view).getMessageObject().T : view instanceof dl1 ? ((dl1) view).getMessageObject().T : 0L;
            this.N0 = i2;
            this.O0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.wf));
        hashSet.add(Integer.valueOf(aob.vf));
        hashSet.add(Integer.valueOf(aob.Gc));
        hashSet.add(Integer.valueOf(aob.hf));
        hashSet.add(Integer.valueOf(aob.Ic));
        hashSet.add(Integer.valueOf(aob.Hc));
        hashSet.add(Integer.valueOf(aob.kf));
        hashSet.add(Integer.valueOf(aob.jf));
        hashSet.add(Integer.valueOf(aob.md));
        hashSet.add(Integer.valueOf(aob.af));
        hashSet.add(Integer.valueOf(aob.ld));
        hashSet.add(Integer.valueOf(aob.Ze));
        hashSet.add(Integer.valueOf(aob.Hb));
        hashSet.add(Integer.valueOf(aob.Fc));
        hashSet.add(Integer.valueOf(aob.Gb));
        hashSet.add(Integer.valueOf(aob.Ec));
        hashSet.add(Integer.valueOf(aob.Rb));
        hashSet.add(Integer.valueOf(aob.Ld));
        hashSet.add(Integer.valueOf(aob.Be));
        hashSet.add(Integer.valueOf(aob.Cc));
        hashSet.add(Integer.valueOf(aob.Ae));
        hashSet.add(Integer.valueOf(aob.Bc));
        hashSet.add(Integer.valueOf(aob.ze));
        hashSet.add(Integer.valueOf(aob.Ac));
        hashSet.add(Integer.valueOf(aob.ye));
        hashSet.add(Integer.valueOf(aob.zc));
        hashSet.add(Integer.valueOf(aob.xe));
        hashSet.add(Integer.valueOf(aob.yc));
        hashSet.add(Integer.valueOf(aob.we));
        hashSet.add(Integer.valueOf(aob.xc));
        hashSet.add(Integer.valueOf(aob.ve));
        hashSet.add(Integer.valueOf(aob.wc));
        hashSet.add(Integer.valueOf(aob.ue));
        hashSet.add(Integer.valueOf(aob.vc));
        hashSet.add(Integer.valueOf(aob.te));
        hashSet.add(Integer.valueOf(aob.uc));
        hashSet.add(Integer.valueOf(aob.se));
        hashSet.add(Integer.valueOf(aob.tc));
        hashSet.add(Integer.valueOf(aob.re));
        hashSet.add(Integer.valueOf(aob.sc));
        hashSet.add(Integer.valueOf(aob.qe));
        hashSet.add(Integer.valueOf(aob.rc));
        hashSet.add(Integer.valueOf(aob.pe));
        hashSet.add(Integer.valueOf(aob.qc));
        hashSet.add(Integer.valueOf(aob.me));
        hashSet.add(Integer.valueOf(aob.oe));
        hashSet.add(Integer.valueOf(aob.ne));
        hashSet.add(Integer.valueOf(aob.le));
        hashSet.add(Integer.valueOf(aob.mc));
        hashSet.add(Integer.valueOf(aob.ke));
        hashSet.add(Integer.valueOf(aob.lc));
        hashSet.add(Integer.valueOf(aob.je));
        hashSet.add(Integer.valueOf(aob.kc));
        hashSet.add(Integer.valueOf(aob.ie));
        hashSet.add(Integer.valueOf(aob.cc));
        hashSet.add(Integer.valueOf(aob.ge));
        hashSet.add(Integer.valueOf(aob.ec));
        hashSet.add(Integer.valueOf(aob.fe));
        hashSet.add(Integer.valueOf(aob.jc));
        hashSet.add(Integer.valueOf(aob.ee));
        hashSet.add(Integer.valueOf(aob.be));
        hashSet.add(Integer.valueOf(aob.ic));
        hashSet.add(Integer.valueOf(aob.ae));
        hashSet.add(Integer.valueOf(aob.hc));
        hashSet.add(Integer.valueOf(aob.Zd));
        hashSet.add(Integer.valueOf(aob.Yd));
        hashSet.add(Integer.valueOf(aob.Yb));
        hashSet.add(Integer.valueOf(aob.Ud));
        hashSet.add(Integer.valueOf(aob.Xb));
        hashSet.add(Integer.valueOf(aob.Td));
        hashSet.add(Integer.valueOf(aob.Sd));
        hashSet.add(Integer.valueOf(aob.Wb));
        hashSet.add(Integer.valueOf(aob.Rd));
        hashSet.add(Integer.valueOf(aob.Vb));
        hashSet.add(Integer.valueOf(aob.Qd));
        hashSet.add(Integer.valueOf(aob.Ub));
        hashSet.add(Integer.valueOf(aob.Pd));
        hashSet.add(Integer.valueOf(aob.Od));
        hashSet.add(Integer.valueOf(aob.Md));
        hashSet.add(Integer.valueOf(aob.Id));
        hashSet.add(Integer.valueOf(aob.Qb));
        hashSet.add(Integer.valueOf(aob.Hd));
        hashSet.add(Integer.valueOf(aob.Pb));
        hashSet.add(Integer.valueOf(aob.Fd));
        hashSet.add(Integer.valueOf(aob.Ed));
        hashSet.add(Integer.valueOf(aob.Dd));
        hashSet.add(Integer.valueOf(aob.Cd));
        hashSet.add(Integer.valueOf(aob.Ob));
        hashSet.add(Integer.valueOf(aob.Bd));
        hashSet.add(Integer.valueOf(aob.Ad));
        hashSet.add(Integer.valueOf(aob.zd));
        hashSet.add(Integer.valueOf(aob.xd));
        hashSet.add(Integer.valueOf(aob.wd));
        hashSet.add(Integer.valueOf(aob.qa));
        hashSet.add(Integer.valueOf(aob.r7));
        hashSet.add(Integer.valueOf(aob.zb));
        hashSet.add(Integer.valueOf(aob.vd));
        hashSet.add(Integer.valueOf(aob.ud));
        hashSet.add(Integer.valueOf(aob.Nb));
        hashSet.add(Integer.valueOf(aob.Mb));
        hashSet.add(Integer.valueOf(aob.td));
        hashSet.add(Integer.valueOf(aob.sd));
        hashSet.add(Integer.valueOf(aob.rd));
        hashSet.add(Integer.valueOf(aob.Lb));
        hashSet.add(Integer.valueOf(aob.Kb));
        hashSet.add(Integer.valueOf(aob.qd));
        hashSet.add(Integer.valueOf(aob.pd));
        hashSet.add(Integer.valueOf(aob.od));
        hashSet.add(Integer.valueOf(aob.Jb));
        hashSet.add(Integer.valueOf(aob.Ib));
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.Yc));
        hashSet.add(Integer.valueOf(aob.Xc));
        hashSet.add(Integer.valueOf(aob.Wc));
        hashSet.add(Integer.valueOf(aob.Vc));
        hashSet.add(Integer.valueOf(aob.dd));
        hashSet.add(Integer.valueOf(aob.cd));
        hashSet.add(Integer.valueOf(aob.bd));
        hashSet.add(Integer.valueOf(aob.ad));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.wb));
        hashSet.add(Integer.valueOf(aob.vb));
        hashSet.add(Integer.valueOf(aob.ub));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.tb));
        hashSet.add(Integer.valueOf(aob.ta));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.o8));
        hashSet.add(Integer.valueOf(aob.n8));
        hashSet.add(Integer.valueOf(aob.m8));
        hashSet.add(Integer.valueOf(aob.l8));
        hashSet.add(Integer.valueOf(aob.k8));
        hashSet.add(Integer.valueOf(aob.j8));
        hashSet.add(Integer.valueOf(aob.i8));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.B8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final int b1(r47 r47Var) {
        wb2 wb2Var = this.J0;
        if (wb2Var != null) {
            wb2Var.td = 0;
            wb2Var.ud = null;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[LOOP:1: B:31:0x0096->B:42:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(r47 r47Var) {
        int i;
        int i2;
        int indexOf;
        int q0;
        r47 messageObject;
        ArrayList arrayList = this.p0;
        if (arrayList.size() > 0) {
            int M0 = this.y.M0();
            for (int K0 = this.y.K0(); K0 <= M0; K0++) {
                tf1 tf1Var = this.F;
                int i3 = tf1Var.f;
                if (K0 >= i3 && K0 < tf1Var.h) {
                    r47 r47Var2 = (r47) arrayList.get(K0 - i3);
                    if (r47Var2.U != 1 && r47Var2.L1() != 0 && !r47Var2.q4()) {
                        i2 = K0 - this.F.f;
                        i = (r47Var2.L1() < r47Var.L1() ? 1 : 0) ^ 1;
                        this.E.b = i;
                        indexOf = arrayList.indexOf(r47Var);
                        if (indexOf == -1) {
                            if (i2 > 0) {
                                i = i2 > indexOf ? 0 : 1;
                                this.E.b = i;
                            }
                            ef1 ef1Var = this.I0;
                            if (ef1Var != null) {
                                hl.r(ef1Var);
                                this.I0 = null;
                            }
                            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.H0 = r47Var.L1();
                            int indexOf2 = arrayList.indexOf(r47Var) + this.F.f;
                            i1();
                            int childCount = this.w.getChildCount();
                            int i4 = 0;
                            boolean z = false;
                            while (true) {
                                if (i4 >= childCount) {
                                    break;
                                }
                                View childAt = this.w.getChildAt(i4);
                                if (childAt instanceof wb2) {
                                    r47 messageObject2 = ((wb2) childAt).getMessageObject();
                                    if (messageObject2 != null && messageObject2.L1() == r47Var.L1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        b1(messageObject2);
                                        z = true;
                                    }
                                    if (z) {
                                        i4++;
                                    } else {
                                        int top = childAt.getTop() - Math.max(-hl.L(2.0f), (this.w.getMeasuredHeight() - childAt.getHeight()) / 2);
                                        int computeVerticalScrollRange = (this.w.computeVerticalScrollRange() - this.w.computeVerticalScrollOffset()) - this.w.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.w.y0(0, top, null);
                                            this.w.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    if ((childAt instanceof dl1) && (messageObject = ((dl1) childAt).getMessageObject()) != null && messageObject.L1() == r47Var.L1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z = true;
                                    }
                                    if (z) {
                                    }
                                }
                            }
                            if (z) {
                                return;
                            }
                            if (getParentActivity() == null) {
                                q0 = 0;
                            } else {
                                wb2 wb2Var = this.J0;
                                if (wb2Var == null) {
                                    wb2Var = new wb2(getParentActivity(), this.currentAccount);
                                    this.J0 = wb2Var;
                                }
                                TLRPC.Chat chat = this.f;
                                wb2Var.f6 = chat != null;
                                wb2Var.k6 = xc2.T(chat) && chat.megagroup;
                                q0 = this.J0.q0(r47Var, null, false);
                            }
                            int max = Math.max(-hl.L(2.0f), (this.w.getMeasuredHeight() - q0) / 2);
                            b1(r47Var);
                            vf1 vf1Var = this.L0;
                            vf1Var.a = r47Var;
                            vf1Var.e = max;
                            hw6 hw6Var = this.E;
                            hw6Var.b = i;
                            vf1Var.b = indexOf2;
                            vf1Var.d = max;
                            vf1Var.c = false;
                            hw6Var.k(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        this.E.b = i;
        indexOf = arrayList.indexOf(r47Var);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        final byte b = 0;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new wb2(context, this.currentAccount));
            }
        }
        this.V = false;
        final byte b2 = 1;
        this.hasOwnBackground = true;
        aob.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!hl.O1());
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 20));
        f82 f82Var = new f82(context, null, false, null);
        this.J = f82Var;
        ns1 ns1Var = f82Var.h;
        if (ns1Var != null) {
            ns1Var.setTextSizePx(hl.L(17.5f));
        }
        ns1 ns1Var2 = f82Var.r;
        if (ns1Var2 != null) {
            ns1Var2.setTextSizePx(hl.L(13.5f));
        }
        f82Var.m0 = true;
        this.J.setOccupyStatusBar(!hl.O1());
        this.actionBar.addView(this.J, 0, tre.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        s7 a = this.actionBar.u().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new r10(this, b2);
        this.O = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        f82 f82Var2 = this.J;
        TLRPC.Chat chat = this.f;
        f82Var2.setTitle(chat.title);
        this.J.setSubtitle(ob6.M0(2131751039, null));
        this.J.setChatAvatar(chat);
        mf1 mf1Var = new mf1(this, context);
        this.fragmentView = mf1Var;
        this.Y = mf1Var;
        mf1Var.setOccupyStatusBar(!hl.O1());
        this.Y.U(aob.r0());
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        ql0 o = dtd.o(this.resourceProvider);
        ll0 ll0Var = this.c;
        aVar.P(ll0Var, o, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, tre.e(-1, -2, 17));
        this.I.setOnTouchListener(new q8((byte) 24));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new pnb(this.M, this.Y, hl.L(12.0f), aob.f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, tre.t(54, 54, 17, 16, 20, 16, -4));
        xb xbVar = new xb(context, (byte) 14);
        this.M = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        xb xbVar2 = this.M;
        int i2 = aob.Zc;
        yob.X(xbVar2, i2, null);
        this.M.setPadding(hl.L(8.0f), hl.L(5.0f), hl.L(8.0f), hl.L(5.0f));
        this.K.addView(this.M, tre.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, tre.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        gu guVar = new gu((byte) 5, context, (Object) this);
        this.w = guVar;
        guVar.setOnItemClickListener(new ri6(this, (byte) 15));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        gu guVar2 = this.w;
        tf1 tf1Var = new tf1(this, context);
        this.F = tf1Var;
        guVar2.setAdapter(tf1Var);
        this.w.setClipToPadding(false);
        gu guVar3 = this.w;
        int i3 = hl.m;
        int i4 = this.e;
        guVar3.setPadding(0, hl.L(4.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i3 + i4, 0, hl.L(60.0f) + i4 + hl.n);
        gu guVar4 = this.w;
        nf1 nf1Var = new nf1(this, this.w, this.resourceProvider);
        this.D0 = nf1Var;
        guVar4.setItemAnimator(nf1Var);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        as asVar = new as(this);
        this.y = asVar;
        asVar.i1(1);
        this.y.k1(true);
        this.w.setLayoutManager(this.y);
        hw6 hw6Var = new hw6(this.w, this.y);
        this.E = hw6Var;
        hw6Var.n = new bf1(this);
        hw6Var.r = this.L0;
        this.Y.addView(this.w, tre.c(-1.0f, -1));
        this.w.setOnScrollListener(new y(this));
        this.glassEngine.b(this.w);
        int i5 = this.h0;
        if (i5 != -1) {
            this.y.g1(i5, this.i0);
            this.h0 = -1;
        }
        jz1 jz1Var = new jz1(context);
        this.X = jz1Var;
        jz1Var.setup(this.b);
        this.X.setFadeZoneTop(hl.L(2.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m);
        this.X.setFadeHeightTop(hl.L(60.0f));
        this.X.setFadeZoneBottom(hl.L(7.0f) + hl.L(44.0f) + hl.L(9.0f) + hl.n);
        this.X.setFadeHeightBottom(hl.L(60.0f));
        this.Y.addView(this.X, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, tre.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new pnb(this.r, this.Y, hl.L(18.0f), aob.f2));
        this.n.addView(this.r, tre.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(hl.L(28.0f));
        this.s.setProgressColor(aob.w0(null, i2, false));
        this.n.addView(this.s, tre.e(32, 32, 17));
        dl1 dl1Var = new dl1(context);
        this.N = dl1Var;
        dl1Var.setAlpha(0.0f);
        final byte b3 = 2;
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, tre.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        vnb vnbVar = this.resourceProvider;
        fv1 fv1Var = new fv1(context, vnbVar, dtd.b(vnbVar), ll0Var);
        this.H = fv1Var;
        fv1Var.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-hl.n);
        this.H.c(4, true, false);
        fv1 fv1Var2 = this.H;
        jl0 c = fv1Var2.n.c(fv1Var2, null, false);
        c.p(fv1Var2.r);
        ik8.r(c, hl.L(22.0f), 6.0f);
        fv1Var2.w = c;
        this.Y.addView(this.H, tre.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ff1
            public final /* synthetic */ wf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b;
                wf1 wf1Var = this.b;
                switch (b4) {
                    case 0:
                        if (wf1Var.getParentActivity() != null) {
                            jb jbVar = new jb(wf1Var, wf1Var.v0, wf1Var.x0, wf1Var.f.megagroup);
                            jbVar.a1(wf1Var.u0);
                            jbVar.b2 = new bf1(wf1Var);
                            wf1Var.showDialog(jbVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        boolean z = wf1Var.f.megagroup;
                        id idVar = alertDialog$Builder.a;
                        if (z) {
                            idVar.U = hl.S2(ob6.M0(2131750942, null));
                        } else {
                            idVar.U = hl.S2(ob6.M0(2131750941, null));
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.S = ob6.M0(2131750940, null);
                        wf1Var.showDialog(idVar);
                        break;
                    default:
                        if (wf1Var.getParentActivity() != null) {
                            hl.t1(wf1Var.O.getSearchField());
                            wf1Var.showDialog((nx0) jj.o(wf1Var.getParentActivity(), new ze1(wf1Var, (byte) 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(hl.o());
        yob.X(this.G, aob.sf, null);
        this.G.setText(ob6.M0(2131745711, null));
        this.G.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        this.H.getContainer().addView(this.G, tre.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) { // from class: ff1
            public final /* synthetic */ wf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b2;
                wf1 wf1Var = this.b;
                switch (b4) {
                    case 0:
                        if (wf1Var.getParentActivity() != null) {
                            jb jbVar = new jb(wf1Var, wf1Var.v0, wf1Var.x0, wf1Var.f.megagroup);
                            jbVar.a1(wf1Var.u0);
                            jbVar.b2 = new bf1(wf1Var);
                            wf1Var.showDialog(jbVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        boolean z = wf1Var.f.megagroup;
                        id idVar = alertDialog$Builder.a;
                        if (z) {
                            idVar.U = hl.S2(ob6.M0(2131750942, null));
                        } else {
                            idVar.U = hl.S2(ob6.M0(2131750941, null));
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.S = ob6.M0(2131750940, null);
                        wf1Var.showDialog(idVar);
                        break;
                    default:
                        if (wf1Var.getParentActivity() != null) {
                            hl.t1(wf1Var.O.getSearchField());
                            wf1Var.showDialog((nx0) jj.o(wf1Var.getParentActivity(), new ze1(wf1Var, (byte) 0), null).b);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.b0.setVisibility(4);
        this.b0.setFocusable(true);
        this.b0.setFocusableInTouchMode(true);
        this.b0.setClickable(true);
        this.b0.setPadding(0, hl.L(3.0f), 0, 0);
        this.Y.addView(this.b0, tre.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        yob.s(this.c0, aob.pf, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, tre.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: ff1
            public final /* synthetic */ wf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b3;
                wf1 wf1Var = this.b;
                switch (b4) {
                    case 0:
                        if (wf1Var.getParentActivity() != null) {
                            jb jbVar = new jb(wf1Var, wf1Var.v0, wf1Var.x0, wf1Var.f.megagroup);
                            jbVar.a1(wf1Var.u0);
                            jbVar.b2 = new bf1(wf1Var);
                            wf1Var.showDialog(jbVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        boolean z = wf1Var.f.megagroup;
                        id idVar = alertDialog$Builder.a;
                        if (z) {
                            idVar.U = hl.S2(ob6.M0(2131750942, null));
                        } else {
                            idVar.U = hl.S2(ob6.M0(2131750941, null));
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.S = ob6.M0(2131750940, null);
                        wf1Var.showDialog(idVar);
                        break;
                    default:
                        if (wf1Var.getParentActivity() != null) {
                            hl.t1(wf1Var.O.getSearchField());
                            wf1Var.showDialog((nx0) jj.o(wf1Var.getParentActivity(), new ze1(wf1Var, (byte) 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        ema emaVar = new ema(context);
        this.d0 = emaVar;
        yob.W(emaVar, aob.qf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(hl.o());
        this.b0.addView(this.d0, tre.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            hl.T3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            hl.T3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        gu guVar5 = this.w;
        guVar5.X1 = true;
        guVar5.Y1 = true;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(hl.L(51.0f));
        this.Y.addView(this.x, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wb2 wb2Var;
        r47 messageObject;
        wb2 wb2Var2;
        r47 messageObject2;
        wb2 wb2Var3;
        r47 messageObject3;
        boolean z;
        if (i == jn7.l4) {
            gu guVar = this.w;
            if (guVar != null) {
                guVar.i1();
                return;
            }
            return;
        }
        if (i != jn7.h2) {
            if (i == jn7.f2 || i == jn7.g2) {
                gu guVar2 = this.w;
                if (guVar2 != null) {
                    int childCount = guVar2.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = this.w.getChildAt(i3);
                        if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null) {
                            if (r47.Q4(messageObject.k) || messageObject.I3()) {
                                wb2Var.R3(false, true, false);
                            } else if (messageObject.g4() && !MediaController.z().H(messageObject)) {
                                wb2Var.o0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i != jn7.e2) {
                if (i != jn7.C4 || this.fragmentView == null) {
                    return;
                }
                this.Y.U(aob.r0());
                this.r.invalidate();
                xb xbVar = this.M;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                this.w.i1();
                return;
            }
            Integer num = (Integer) objArr[0];
            gu guVar3 = this.w;
            if (guVar3 != null) {
                int childCount2 = guVar3.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.w.getChildAt(i4);
                    if ((childAt2 instanceof wb2) && (messageObject2 = (wb2Var2 = (wb2) childAt2).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                        r47 r47Var = MediaController.z().v0;
                        if (r47Var != null) {
                            messageObject2.b0 = r47Var.b0;
                            messageObject2.i0 = r47Var.i0;
                            messageObject2.j0 = r47Var.j0;
                            wb2Var2.W3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((r47) objArr[0]).g4()) {
            MediaController.z().s0(N0(true), this.f0, this.e0, true);
            int childCount3 = this.w.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount3) {
                    z = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i5);
                if (childAt3 instanceof wb2) {
                    wb2 wb2Var4 = (wb2) childAt3;
                    r47 messageObject4 = wb2Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.g4() && MediaController.z().H(messageObject4)) {
                        ImageReceiver photoImage = wb2Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.L0);
                        this.e0.setTranslationY(wb2Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                        this.fragmentView.invalidate();
                        this.e0.invalidate();
                        z = true;
                        break;
                    }
                }
                i5++;
            }
            if (this.e0 != null) {
                r47 r47Var2 = MediaController.z().v0;
                if (z) {
                    MediaController.z().m0(true);
                } else {
                    this.e0.setTranslationY((-hl.u) - 100);
                    this.fragmentView.invalidate();
                    if (r47Var2 != null && r47Var2.g4() && (this.W || MediaController.z().I0 != null)) {
                        MediaController.z().m0(false);
                    }
                }
            }
        }
        gu guVar4 = this.w;
        if (guVar4 != null) {
            int childCount4 = guVar4.getChildCount();
            for (int i6 = 0; i6 < childCount4; i6++) {
                View childAt4 = this.w.getChildAt(i6);
                if ((childAt4 instanceof wb2) && (messageObject3 = (wb2Var3 = (wb2) childAt4).getMessageObject()) != null) {
                    if (r47.Q4(messageObject3.k) || messageObject3.I3()) {
                        wb2Var3.R3(false, true, false);
                    } else if (messageObject3.g4()) {
                        wb2Var3.o0(null, false);
                        if (!MediaController.z().H(messageObject3) && messageObject3.b0 != 0.0f) {
                            messageObject3.F5();
                            wb2Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1(TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        uc7 messagesController = getMessagesController();
        TLRPC.Chat chat = this.f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.id);
        bt5 bt5Var = new bt5(this.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, this, N0.id, false, xc2.T(chat));
        bt5Var.d2 = new lf1(this);
        bt5Var.show();
    }

    public final void g1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(hl.L(8.0f), hl.L(3.0f), hl.L(8.0f), hl.L(3.0f));
            this.M.setText(hl.S2(ob6.M0(2131747932, null)));
            return;
        }
        if (this.x0 != null || this.v0 != null) {
            this.L.setVisibility(8);
            this.M.setPadding(hl.L(8.0f), hl.L(3.0f), hl.L(8.0f), hl.L(3.0f));
            this.M.setText(hl.S2(ob6.M0(2131747931, null)));
            return;
        }
        this.L.setVisibility(0);
        this.M.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        boolean z = this.f.megagroup;
        xb xbVar = this.M;
        if (z) {
            SpannableStringBuilder S2 = hl.S2(ob6.M0(2131750977, null));
            f1(S2);
            xbVar.setText(S2);
        } else {
            SpannableStringBuilder S22 = hl.S2(ob6.M0(2131750976, null));
            f1(S22);
            xbVar.setText(S22);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ee));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        arrayList.add(new apb(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.A8));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Sb));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Vd));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Zb));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Wd));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ac));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.nc));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.pc));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.oc));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.gf));
        arrayList.add(new apb(this.w, 131072, new Class[]{bf2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (zob) null, aob.xf));
        View view = this.r;
        int i = aob.cd;
        arrayList.add(new apb(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.M, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    public final void h1() {
        gu guVar = this.w;
        if (guVar == null) {
            return;
        }
        int childCount = guVar.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        boolean z2 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.w.getChildAt(i3);
            if (childAt instanceof ec2) {
                ec2 ec2Var = (ec2) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                ec2Var.f = y;
                ec2Var.h = backgroundSizeY;
            } else if (childAt instanceof wb2) {
                wb2 wb2Var = (wb2) childAt;
                int top = wb2Var.getTop();
                wb2Var.getBottom();
                int i4 = top >= 0 ? 0 : -top;
                int measuredHeight2 = wb2Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i4 + measuredHeight;
                }
                wb2Var.D3(i4, measuredHeight2 - i4, (this.Y.getHeightWithKeyboard() - hl.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                r47 messageObject = wb2Var.getMessageObject();
                if (this.e0 != null && messageObject.g4() && MediaController.z().H(messageObject)) {
                    ImageReceiver photoImage = wb2Var.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof dl1) {
                dl1 dl1Var = (dl1) childAt;
                dl1Var.j0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (dl1Var.S()) {
                    dl1Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i) {
                    if ((childAt instanceof wb2) || (childAt instanceof dl1)) {
                        view = childAt;
                    }
                    i = bottom;
                    view3 = childAt;
                }
                nf1 nf1Var = this.D0;
                if ((nf1Var == null || (!nf1Var.Z(childAt) && !this.D0.Y(childAt))) && (childAt instanceof dl1) && ((dl1) childAt).getMessageObject().l0) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i2) {
                        i2 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        zc zcVar = this.e0;
        if (zcVar != null) {
            if (z2) {
                MediaController.z().m0(true);
            } else {
                zcVar.setTranslationY((-hl.u) - 100);
                this.fragmentView.invalidate();
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.g4() && this.W) {
                    MediaController.z().m0(false);
                }
            }
        }
        if (view != null) {
            this.N.h0((view instanceof wb2 ? ((wb2) view).getMessageObject() : ((dl1) view).getMessageObject()).k.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof wb2) && !(view3 instanceof dl1)) {
            z = true;
        }
        this.R = z;
        if (view2 == null) {
            Q0(true);
            this.N.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.w.getPaddingTop() || this.R) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            Q0(!this.R);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.S;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            if (this.N.getTag() == null) {
                this.N.setTag(1);
            }
            if (this.N.getAlpha() != 1.0f) {
                this.N.setAlpha(1.0f);
            }
            this.Q = true;
        }
        int bottom2 = view2.getBottom() - this.w.getPaddingTop();
        if (bottom2 <= this.N.getMeasuredHeight() || bottom2 >= (this.N.getMeasuredHeight() << 1)) {
            this.N.setTranslationY(0.0f);
        } else {
            this.N.setTranslationY(((-r0.getMeasuredHeight()) << 1) + bottom2);
        }
    }

    public final void i1() {
        gu guVar = this.w;
        if (guVar != null) {
            int childCount = guVar.getChildCount();
            byte b = 0;
            for (int i = 0; i < childCount; i++) {
                View childAt = this.w.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    r47 messageObject = wb2Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.z()) {
                            wb2Var.setDrawSelectionBackground(false);
                            wb2Var.m3(false, true);
                            wb2Var.o3(false, false, true);
                        }
                        wb2Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0);
                        if (this.H0 != Integer.MAX_VALUE) {
                            ef1 ef1Var = this.I0;
                            if (ef1Var != null) {
                                hl.r(ef1Var);
                            }
                            ef1 ef1Var2 = new ef1(this, b);
                            this.I0 = ef1Var2;
                            hl.d3(ef1Var2, 1000L);
                        }
                        if (TextUtils.isEmpty(this.w0)) {
                            wb2Var.v3(null);
                        } else {
                            wb2Var.v3(this.w0);
                        }
                        wb2Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                    }
                } else if (childAt instanceof dl1) {
                    dl1 dl1Var = (dl1) childAt;
                    dl1Var.setMessageObject(dl1Var.getMessageObject());
                    dl1Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        jn7.e().b(this, jn7.l4);
        jn7.f(this.currentAccount).b(this, jn7.h2);
        jn7.f(this.currentAccount).b(this, jn7.g2);
        jn7.f(this.currentAccount).b(this, jn7.f2);
        jn7.f(this.currentAccount).b(this, jn7.e2);
        jn7.e().b(this, jn7.C4);
        X0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = uc7.i1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = jn7.d3;
        byte b = 4;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new af1(this, b)), this.classGuid);
        setBulletinDelegate(new py(b));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.l4);
        jn7.f(this.currentAccount).n(this, jn7.h2);
        jn7.f(this.currentAccount).n(this, jn7.g2);
        jn7.f(this.currentAccount).n(this, jn7.f2);
        jn7.f(this.currentAccount).n(this, jn7.e2);
        jn7.e().n(this, jn7.C4);
        this.y0.e();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        uf1 uf1Var = this.Y;
        if (uf1Var != null) {
            pvc pvcVar = uf1Var.w;
            if (pvcVar != null) {
                pvcVar.b(false);
            }
            uf1Var.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        vh4 vh4Var = vh4.f;
        if (vh4Var == null || !vh4Var.a) {
            return;
        }
        vh4 r = vh4.r();
        if (r.a) {
            tb0 tb0Var = (tb0) r.d;
            int i = dc0.G;
            tb0Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRemoveFromParent() {
        MediaController.z().s0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        uf1 uf1Var = this.Y;
        if (uf1Var != null) {
            pvc pvcVar = uf1Var.w;
            if (pvcVar != null) {
                pvcVar.b(true);
            }
            uf1Var.G = false;
        }
        this.j0 = false;
        L0(false);
        if (this.k0) {
            this.k0 = false;
            tf1 tf1Var = this.F;
            if (tf1Var != null) {
                tf1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(aob.w0(null, aob.Zc, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.y0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.y0.d();
        }
    }
}
