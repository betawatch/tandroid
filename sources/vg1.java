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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vg1 extends d implements jm7 {
    public static int Q0 = 10;
    public static final int[] R0 = {nm7.T, nm7.r, nm7.s, nm7.C, nm7.G0};
    public HashMap A0;
    public boolean B0;
    public final jg1 C0;
    public mg1 D0;
    public cw6 E;
    public final ArrayList E0;
    public sg1 F;
    public final vh6 F0;
    public TextView G;
    public hg1 G0;
    public ew1 H;
    public int H0;
    public FrameLayout I;
    public bg1 I0;
    public z82 J;
    public rc2 J0;
    public LinearLayout K;
    public int K0;
    public ImageView L;
    public final ug1 L0;
    public wb M;
    public long M0;
    public cm1 N;
    public int N0;
    public r7 O;
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
    public e02 X;
    public tg1 Y;
    public k47 Z;
    public final oz4 a;
    public TLRPC.ChannelParticipant a0;
    public final km0 b;
    public FrameLayout b0;
    public final km0 c;
    public ImageView c0;
    public final mr3 d;
    public lka d0;
    public final int e;
    public yd e0;
    public final TLRPC.Chat f;
    public jy f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final vh6 l0;
    public final vh6 m0;
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
    public fv w;
    public String w0;
    public UndoView x;
    public vh6 x0;
    public zs y;
    public final po y0;
    public final HashMap z0;

    public vg1(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new vh6();
        this.m0 = new vh6();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new po(R0);
        this.z0 = new HashMap();
        this.C0 = new jg1(this);
        this.E0 = new ArrayList();
        this.F0 = new vh6();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.L0 = new ug1(this);
        this.N0 = -1;
        this.P0 = new RectF();
        sy4 sy4Var = this.glassEngine;
        sy4Var.a = new cg1(this);
        sy4Var.d = new cz4(gm.L(48.0f));
        oz4 oz4Var = new oz4();
        this.a = oz4Var;
        km0 km0Var = new km0(oz4Var, oz4Var, oz4Var);
        this.b = km0Var;
        km0Var.j = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !gda.f()) {
            this.d = null;
            this.e = 0;
            km0 km0Var2 = new km0(oz4Var, oz4Var, oz4Var);
            this.c = km0Var2;
            km0Var2.j = this.glassEngine;
        } else {
            mr3 mr3Var = new mr3(false);
            this.d = mr3Var;
            this.glassEngine.a(mr3Var);
            nz4 nz4Var = new nz4(oz4Var);
            nz4Var.d = mr3Var;
            nz4Var.e = -3;
            nz4Var.f = oz4Var;
            if (e86.e(262144)) {
                nz4 nz4Var2 = new nz4(oz4Var);
                nz4Var2.d = mr3Var;
                nz4Var2.e = -2;
                nz4Var2.f = oz4Var;
                km0 km0Var3 = new km0(nz4Var2, nz4Var2, nz4Var2);
                this.c = km0Var3;
                km0Var3.j = this.glassEngine;
                int L = e86.e(262144) ? gm.L(8.0f) : gm.L(48.0f);
                km0Var3.d = L;
                km0Var3.e = L;
                km0Var3.k = true;
                this.e = 0;
            } else {
                km0 km0Var4 = new km0(nz4Var, nz4Var, nz4Var);
                this.c = km0Var4;
                km0Var4.j = this.glassEngine;
                int L2 = e86.e(262144) ? gm.L(8.0f) : gm.L(48.0f);
                km0Var4.d = L2;
                km0Var4.e = L2;
                this.e = gm.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static vq8 P0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (pn2 pn2Var : (pn2[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), pn2.class)) {
            if (pn2Var != null) {
                Drawable drawable = pn2Var.c;
                if (drawable instanceof vq8) {
                    return (vq8) drawable;
                }
            }
        }
        return null;
    }

    public static void d1(int i, k47 k47Var) {
        if (k47Var == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = k47Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = k47Var.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            k47Var.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = jb6.G(i, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        k47Var.h5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t = gm.t(spannableStringBuilder, "\n\n");
        if (t >= 0 && Build.VERSION.SDK_INT >= 29) {
            ul1.j();
            spannableStringBuilder.setSpan(ul1.g(gm.L(8.0f)), t + 1, t + 2, 33);
        }
        return spannableStringBuilder;
    }

    public final k47 I0(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        k47 k47Var;
        byte b = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            if (i >= arrayList2.size()) {
                k47Var = null;
                break;
            }
            k47Var = (k47) arrayList2.get(i);
            if (k47Var != null && k47Var.U == 1 && k47Var.J0 == j) {
                break;
            }
            i++;
        }
        if (k47Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((k47) arrayList.get(0)).k.date;
            } catch (Exception e) {
                fc4.g(e, true);
            }
            k47Var = new k47(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j2));
        k47Var.U = 1;
        if (!z2 || arrayList.size() <= 1) {
            k47Var.J0 = -1L;
        } else {
            k47Var.J0 = j;
        }
        byte b2 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k47.D5(jb6.G(arrayList.size(), z2 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new x00(b2)).distinct().map(new dg1(this, b)).filter(new se(b2)).limit(4L).toArray())), "un1", W1));
        if (z2 && arrayList.size() > 1) {
            vq8 P0 = P0(k47Var.v);
            if (P0 == null) {
                P0 = new vq8(jb6.M0(z ? 2131750973 : 2131750972, null));
                Typeface o = gm.o();
                ho hoVar = P0.a;
                hoVar.x(o);
                hoVar.w(gm.L(10.0f));
                if (P0.c != -1) {
                    P0.c = -1;
                    P0.invalidateSelf();
                }
                P0.a(503316480);
            } else {
                P0.a.t(jb6.M0(z ? 2131750973 : 2131750972, null), false, true);
            }
            P0.setBounds(0, 0, P0.getIntrinsicWidth(), gm.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new pn2(0, P0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        k47Var.v = spannableStringBuilder;
        k47 k47Var2 = arrayList.size() > 0 ? (k47) b10.f(1, arrayList) : null;
        if (k47Var2 != null) {
            long j3 = k47Var2.T;
            vh6 vh6Var = this.F0;
            if (!vh6Var.d(j3)) {
                long j4 = k47Var2.T;
                int i2 = Q0;
                Q0 = i2 + 1;
                vh6Var.k(Integer.valueOf(i2), j4);
            }
            k47Var.m1 = ((Integer) vh6Var.f(k47Var2.T)).intValue();
        }
        return k47Var;
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
        if (!chat.megagroup || this.u0 == null || !sd2.w(2, chat)) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.u0.get(i);
            if (k47.B1(channelParticipant.peer) != j) {
                i++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public final void K0(k47 k47Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(R.string.AppName, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        if (k47Var.D == 3) {
            heVar.U = jb6.M0(2131747912, null);
        } else {
            heVar.U = jb6.a0(null, null, 2131747939, k47Var.F0().mime_type);
        }
        showDialog(heVar);
    }

    public final void L0(boolean z) {
        zs zsVar = this.y;
        if (zsVar == null || this.j0) {
            return;
        }
        int K0 = zsVar.K0();
        if ((K0 == -1 ? 0 : Math.abs(this.y.M0() - K0) + 1) > 0) {
            this.F.getClass();
            if (K0 > (z ? 4 : 1) || this.s0 || this.r0) {
                return;
            }
            X0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x018c, code lost:
    
        if (hs6.d0(r1.currentAccount).D0(r10.id, true) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01a5, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01a3, code lost:
    
        if (hs6.d0(r1.currentAccount).O.containsKey(r10.short_name) == false) goto L89;
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
        TLRPC.User W1;
        vg1 vg1Var = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        k47 messageObject = view instanceof rc2 ? ((rc2) view).getMessageObject() : view instanceof cm1 ? ((cm1) view).getMessageObject() : null;
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
                if (k47.Q4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.s4() || messageObject.J2()) {
                    num = 5;
                    TLRPC.InputStickerSet j1 = k47.j1(messageObject.k);
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
                            boolean z2 = e21.a;
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
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.I3() || k47.K4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z3 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z3) {
                            num = 5;
                            z = z3;
                        } else {
                            bc4 fileLoader = vg1Var.getFileLoader();
                            z = z3;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (bc4.M(message2, false, true).exists()) {
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
            vg1Var.Z = messageObject;
            if (vg1Var.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            k47 k47Var = messageObject;
            TLRPC.Chat chat = vg1Var.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        xs5 xs5Var = new xs5(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().M0(chat.id), null, this, chat.id, false, sd2.V(chat));
                        xs5Var.e2 = false;
                        xs5Var.show();
                        return true;
                    }
                }
                vg1Var = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != vg1Var.getMessagesController().L3) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof cm1) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = vg1Var.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(vg1Var.getThemedColor(cmb.wj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, gm.L(10.0f), gm.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131750932, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) jb6.M0(2131752464, null));
                        spannableStringBuilder.setSpan(new z31(vg1Var, (byte) 2), 0, spannableStringBuilder.length(), 33);
                        u31 I = c41.b0(vg1Var).I(R.raw.msg_antispam, jb6.M0(2131752407, null), gm.G2(jb6.M0(2131752408, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    b10.r(null, 2131745952, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            k47 k47Var2 = vg1Var.Z;
            if (k47Var2.D == 0 || k47Var2.z != null) {
                b10.s(null, 2131751704, arrayList, arrayList3, valueOf2);
                arrayList2.add(3);
            }
            if (c == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = vg1Var.Z.L1;
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
                            showDialog(new x2b(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    } else if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                        kd5 kd5Var = new kd5(chat.id, 0);
                        TLRPC.ChatFull M0 = vg1Var.getMessagesController().M0(chat.id);
                        if (M0 != null) {
                            kd5Var.j0(M0);
                            vg1Var.presentFragment(kd5Var);
                        }
                    } else if ((channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && sd2.y(13, chat)) {
                        rj2 rj2Var = new rj2(vg1Var.getParentActivity(), chat);
                        rj2Var.v1 = new fg1(vg1Var);
                        vg1Var.showDialog(rj2Var);
                    }
                }
            } else if (c == 3) {
                TLRPC.MessageMedia messageMedia = vg1Var.Z.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && k47.M3(messageMedia.webpage.document)) {
                    b10.s(null, 2131745664, arrayList, arrayList3, valueOf);
                    arrayList2.add(11);
                }
            } else if (c != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c == 5) {
                    b10.r(null, 2131754182, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(jb6.M0(2131745665, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(jb6.M0(2131745193, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c == '\n') {
                        b10.r(null, 2131754180, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(jb6.M0(2131745665, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(jb6.M0(2131745193, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c == 6) {
                        b10.s(null, 2131745663, arrayList, arrayList3, valueOf3);
                        arrayList2.add(7);
                        arrayList.add(jb6.M0(2131745665, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(jb6.M0(2131745193, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c == 7) {
                        TLRPC.Message message3 = vg1Var.Z.k;
                        if (k47.n1(message3) == null || !k47.E3(k47.n1(message3).document)) {
                            arrayList.add(jb6.M0(2131754366, null));
                        } else {
                            arrayList.add(jb6.M0(2131754368, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c == '\b') {
                        long j = vg1Var.Z.k.media.user_id;
                        TLRPC.User W12 = j != 0 ? oc7.r1(vg1Var.currentAccount).W1(Long.valueOf(j)) : null;
                        if (W12 != null && W12.id != z8c.h(vg1Var.currentAccount).e() && bw2.r(vg1Var.currentAccount).g0.get(Long.valueOf(W12.id)) == null) {
                            b10.r(null, 2131754441, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(vg1Var.Z.k.media.phone_number)) {
                            b10.s(null, 2131751704, arrayList, arrayList3, valueOf2);
                            arrayList2.add(16);
                            arrayList.add(jb6.M0(2131752587, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (k47.K4(vg1Var.Z.k)) {
                b10.s(null, 2131745663, arrayList, arrayList3, valueOf3);
                arrayList2.add(num4);
                arrayList.add(jb6.M0(2131745193, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (vg1Var.Z.I3()) {
                    b10.s(null, 2131745645, arrayList, arrayList3, num3);
                    arrayList2.add(num2);
                    arrayList.add(jb6.M0(2131745193, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (vg1Var.Z.F0() != null) {
                        if (k47.M3(vg1Var.Z.F0())) {
                            str2 = null;
                            b10.s(null, 2131745664, arrayList, arrayList3, valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        b10.s(str2, 2131745665, arrayList, arrayList3, num10);
                        arrayList2.add(num9);
                        arrayList.add(jb6.M0(2131745193, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        b10.s(null, 2131745663, arrayList, arrayList3, valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            xf1 xf1Var = new xf1(vg1Var, arrayList2, arrayList, arrayList3, view, f, f2);
            if (sd2.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = k47Var.k) != null && message.from_id != null && (W1 = vg1Var.getMessagesController().W1(Long.valueOf(vg1Var.Z.k.from_id.user_id))) != null && !m9c.D(W1)) {
                    vg1Var.getMessagesController().J0(chat, W1, new hv0(vg1Var, arrayList, arrayList3, arrayList2, xf1Var, (byte) 2));
                    return true;
                }
            }
            xf1Var.run();
            return true;
        }
        num = 5;
        num2 = 10;
        c = 65535;
        vg1Var.Z = messageObject;
        if (vg1Var.getParentActivity() != null) {
        }
    }

    public final TextureView N0(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            yd ydVar = new yd((byte) 7, (Context) getParentActivity(), (Object) this);
            this.e0 = ydVar;
            ydVar.setOutlineProvider(new xj((byte) 2));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            jy jyVar = new jy(getParentActivity());
            this.f0 = jyVar;
            jyVar.setBackgroundColor(0);
            if (z) {
                this.e0.addView(this.f0, qoe.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, qoe.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            tg1 tg1Var = this.Y;
            yd ydVar2 = this.e0;
            int i = gm.u;
            tg1Var.addView(ydVar2, 1, new FrameLayout.LayoutParams(i, i));
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
            k47 k47Var = (k47) arrayList4.get(i);
            long j = (k47Var == null || (tL_channelAdminLogEvent2 = k47Var.L1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (k47Var.m1 <= 0) {
                int i2 = Q0;
                Q0 = i2 + 1;
                k47Var.m1 = i2;
            }
            int i3 = i + 1;
            k47 k47Var2 = i3 < arrayList4.size() ? (k47) arrayList4.get(i3) : null;
            long j2 = (k47Var2 == null || (tL_channelAdminLogEvent = k47Var2.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j != 0) {
                arrayList3.add(k47Var);
            } else {
                arrayList2.add(k47Var);
            }
            if (j == j2 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = k47Var.k.reply_markup;
                boolean z = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((k47) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((k47) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    k47 k47Var3 = (k47) b10.f(1, arrayList3);
                    boolean z2 = TextUtils.isEmpty(this.w0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(k47Var3.T);
                    HashSet hashSet = this.q0;
                    if (hashSet.contains(valueOf) || !z2) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            d1(0, (k47) arrayList3.get(i4));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        d1(arrayList3.size() - 1, k47Var3);
                        arrayList2.add(k47Var3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = k47Var3.k.reply_markup;
                    if (z != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        k47Var3.M1 = true;
                        this.F.g((z ? arrayList3.size() - 1 : 0) + size);
                        this.F.g(size + (z ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j3 = k47Var.T;
                    k47 I0 = I0(j3, k47Var.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j3)), z2);
                    arrayList = arrayList3;
                    arrayList2.add(I0);
                }
                if (!arrayList6.isEmpty()) {
                    k47 k47Var4 = (k47) b10.f(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(I0(k47Var4.T, k47Var4.L1.user_id, arrayList6, true, false));
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
            this.S.addListener(new b91((Object) this, (byte) 4));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void R0(int i) {
        mr3 mr3Var;
        if (Build.VERSION.SDK_INT < 31 || (mr3Var = this.d) == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            bz4 e = this.glassEngine.e();
            e.b(this.w.getY(), this.Y.getWidth(), this.w.getY() + this.w.getHeight());
            mr3Var.h(e);
        }
        tg1 tg1Var = this.Y;
        Objects.requireNonNull(tg1Var);
        mr3Var.e(new ms0(tg1Var, (byte) 2), this.Y.getWidth(), this.Y.getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x036a, code lost:
    
        if (r0.exists() == false) goto L127;
     */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [k47, org.telegram.tgnet.TLRPC$ChannelParticipant] */
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
        TLRPC.Chat L0;
        File file;
        TLRPC.User W1;
        if (this.Z == null || i >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        hg1 hg1Var = this.G0;
        if (hg1Var != null) {
            hg1Var.dismiss();
        }
        k47 k47Var = this.Z;
        if (k47Var != null) {
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
                    String str = k47Var.k.attachPath;
                    if (str != null && str.length() > 0 && !aq1.t(str)) {
                        str = null;
                    }
                    if (str == null || str.length() == 0) {
                        bc4 fileLoader = getFileLoader();
                        TLRPC.Message message = this.Z.k;
                        fileLoader.getClass();
                        str = bc4.M(message, false, true).toString();
                    }
                    int i2 = this.Z.D;
                    if (i2 == 3 || i2 == 1) {
                        if ((Build.VERSION.SDK_INT <= 28 || e21.b) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                            getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                            this.Z = null;
                            this.a0 = null;
                            return;
                        }
                        MediaController.d0(str, getParentActivity(), this.Z.D != 3 ? 0 : 1, null, null, null);
                        r8 = 0;
                    }
                } else if (intValue == 5) {
                    String str2 = k47Var.k.attachPath;
                    if (str2 != null && str2.length() != 0) {
                        file = new File(this.Z.k.attachPath);
                    }
                    file = null;
                    if (file == null) {
                        bc4 fileLoader2 = getFileLoader();
                        TLRPC.Message message2 = this.Z.k;
                        fileLoader2.getClass();
                        File M = bc4.M(message2, false, true);
                        if (M.exists()) {
                            file = M;
                        }
                    }
                    if (file != null) {
                        if (file.getName().toLowerCase().endsWith("attheme")) {
                            zs zsVar = this.y;
                            if (zsVar != null) {
                                if (zsVar.M0() < this.y.A() - 1) {
                                    int K0 = this.y.K0();
                                    this.h0 = K0;
                                    b59 b59Var = (b59) this.w.K(K0);
                                    if (b59Var != null) {
                                        this.i0 = b59Var.a.getTop();
                                    } else {
                                        this.h0 = -1;
                                    }
                                } else {
                                    this.h0 = -1;
                                }
                            }
                            bmb u = cmb.u(file, this.Z.I0(), null, true);
                            if (u != null) {
                                presentFragment(new rob(u));
                            } else {
                                this.h0 = -1;
                                if (getParentActivity() == null) {
                                    this.Z = null;
                                    this.a0 = null;
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                                String M0 = jb6.M0(R.string.AppName, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131748957, null);
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                showDialog(heVar);
                            }
                        } else if (jb6.D0().e(file, this.currentAccount)) {
                            presentFragment(new LanguageSelectActivity());
                        } else {
                            if (getParentActivity() == null) {
                                this.Z = null;
                                this.a0 = null;
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                            String M02 = jb6.M0(R.string.AppName, null);
                            he heVar2 = alertDialog$Builder2.a;
                            heVar2.S = M02;
                            heVar2.U = jb6.M0(2131748958, null);
                            alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                            showDialog(heVar2);
                        }
                    }
                } else if (intValue == 6) {
                    String str3 = k47Var.k.attachPath;
                    if (str3 != null && str3.length() > 0 && !aq1.t(str3)) {
                        str3 = null;
                    }
                    if (str3 == null || str3.length() == 0) {
                        bc4 fileLoader3 = getFileLoader();
                        TLRPC.Message message3 = this.Z.k;
                        fileLoader3.getClass();
                        str3 = bc4.M(message3, false, true).toString();
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
                        getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, null)), 500);
                    } catch (Exception unused2) {
                    }
                } else if (intValue != 7) {
                    byte b = 2;
                    switch (intValue) {
                        case 9:
                            showDialog(new x2b(getParentActivity(), this, k47.j1(this.Z.k), null, null, null));
                            break;
                        case 10:
                            if ((Build.VERSION.SDK_INT > 28 && !e21.b) || getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                String B = bc4.B(this.Z.F0());
                                if (TextUtils.isEmpty(B)) {
                                    B = this.Z.S0();
                                }
                                String str4 = B;
                                String str5 = this.Z.k.attachPath;
                                if (str5 != null && str5.length() > 0 && !aq1.t(str5)) {
                                    str5 = null;
                                }
                                if (str5 == null || str5.length() == 0) {
                                    bc4 fileLoader4 = getFileLoader();
                                    TLRPC.Message message4 = this.Z.k;
                                    fileLoader4.getClass();
                                    str5 = bc4.M(message4, false, true).toString();
                                }
                                MediaController.d0(str5, getParentActivity(), this.Z.I3() ? 3 : 2, str4, this.Z.F0() != null ? this.Z.F0().mime_type : "", null);
                                break;
                            } else {
                                getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                this.Z = null;
                                this.a0 = null;
                                return;
                            }
                            break;
                        case 11:
                            oc7.r1(this.currentAccount).y4(this.Z, k47Var.F0());
                            break;
                        default:
                            switch (intValue) {
                                case 15:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", this.Z.k.media.user_id);
                                    bundle.putString("phone", this.Z.k.media.phone_number);
                                    bundle.putBoolean("addContact", true);
                                    presentFragment(new tu2(bundle));
                                    break;
                                case 16:
                                    gm.g(k47Var.k.media.phone_number);
                                    c41.b0(this).i(jb6.M0(2131747028, null)).j();
                                    break;
                                case 17:
                                    try {
                                        Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.Z.k.media.phone_number));
                                        intent2.addFlags(TLObject.FLAG_28);
                                        getParentActivity().startActivityForResult(intent2, 500);
                                        break;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        break;
                                    }
                                default:
                                    TLRPC.Chat chat = this.f;
                                    switch (intValue) {
                                        case 33:
                                            if (this.a0 != null) {
                                                TLRPC.User W12 = getMessagesController().W1(Long.valueOf(pg3.n(this.a0.peer)));
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
                                                getMessagesController().U4(chat.id, W12, null, this.a0.banned_rights, true, getFragmentForAlert(1), new y31(this, W12, (byte) 19));
                                                break;
                                            }
                                            break;
                                        case 34:
                                            TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                            tL_channels_reportAntiSpamFalsePositive.channel = getMessagesController().g1(chat.id);
                                            tL_channels_reportAntiSpamFalsePositive.msg_id = this.Z.L1();
                                            getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ag1(this, b));
                                            break;
                                        case 35:
                                            getMessagesController().a0(chat.id, getMessagesController().l1(this.Z.k.from_id), false, new bg1(this, b));
                                            if ((this.Z.k.from_id instanceof TLRPC.TL_peerUser) && c41.a(this) && (W1 = getMessagesController().W1(Long.valueOf(this.Z.k.from_id.user_id))) != null) {
                                                c41.D(this, W1, chat.title).j();
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
                } else {
                    String str6 = k47Var.k.attachPath;
                    if (str6 != null && str6.length() > 0 && !aq1.t(str6)) {
                        str6 = null;
                    }
                    if (str6 == null || str6.length() == 0) {
                        bc4 fileLoader5 = getFileLoader();
                        TLRPC.Message message5 = this.Z.k;
                        fileLoader5.getClass();
                        str6 = bc4.M(message5, false, true).toString();
                    }
                    if ((Build.VERSION.SDK_INT <= 28 || e21.b) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        this.Z = null;
                        this.a0 = null;
                        return;
                    }
                    MediaController.d0(str6, getParentActivity(), 0, null, null, null);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long Z0 = k47Var.Z0();
                if (0 != Z0) {
                    if (Z0 > 0) {
                        TLRPC.User W13 = oc7.r1(this.currentAccount).W1(Long.valueOf(Z0));
                        if (W13 != null) {
                            spannableStringBuilder.append((CharSequence) bw2.m(0, W13.first_name, W13.last_name)).append((CharSequence) ":\n");
                        }
                    } else if (Z0 < 0 && (L0 = oc7.r1(this.currentAccount).L0(Long.valueOf(-Z0))) != null) {
                        spannableStringBuilder.append((CharSequence) L0.title).append((CharSequence) ":\n");
                    }
                }
                if (TextUtils.isEmpty(k47Var.v)) {
                    spannableStringBuilder.append((CharSequence) k47Var.k.message);
                } else {
                    spannableStringBuilder.append(k47Var.v);
                }
                gm.g(spannableStringBuilder);
                c41.b0(this).i(jb6.M0(2131748346, null)).j();
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(gm.L(200.0f));
        Rect rect = new Rect();
        getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        anb.h(cmb.F8, getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            if (arrayList4.get(i2) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new j8(getParentActivity(), getResourceProvider()), qoe.o(-1, 8));
            } else {
                a8 a8Var = new a8(0, getResourceProvider(), getParentActivity(), i2 == 0, i2 == size + (-1));
                a8Var.setMinimumWidth(gm.L(200.0f));
                a8Var.j((CharSequence) arrayList2.get(i2), ((Integer) arrayList3.get(i2)).intValue(), null);
                if (((Integer) arrayList4.get(i2)).intValue() == 35) {
                    a8Var.d(getThemedColor(cmb.p7), getThemedColor(cmb.o7));
                }
                Integer num = (Integer) arrayList4.get(i2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                a8Var.setOnClickListener(new ph((Object) this, i2, (Object) arrayList4, (Object) num, (byte) 1));
            }
            i2++;
            arrayList4 = arrayList;
        }
        gg1 gg1Var = new gg1(this, this.Y.getContext(), (byte) 0);
        gg1Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        gg1Var.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        hg1 hg1Var = new hg1(this, gg1Var);
        this.G0 = hg1Var;
        hg1Var.e = true;
        hg1Var.c = (short) 220;
        hg1Var.setOutsideTouchable(true);
        this.G0.setClippingEnabled(true);
        this.G0.setAnimationStyle(R.style.PopupContextAnimation);
        this.G0.setFocusable(true);
        gg1Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
        this.G0.setInputMethodMode(2);
        this.G0.setSoftInputMode(48);
        this.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f)) - gg1Var.getMeasuredWidth()) + rect.left) - gm.L(28.0f);
        if (left < gm.L(6.0f)) {
            left = gm.L(6.0f);
        } else if (left > (this.w.getMeasuredWidth() - gm.L(6.0f)) - gg1Var.getMeasuredWidth()) {
            left = (this.w.getMeasuredWidth() - gm.L(6.0f)) - gg1Var.getMeasuredWidth();
        }
        if (gm.O1()) {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = this.Y.getHeight();
        int L = gm.L(48.0f) + gg1Var.getMeasuredHeight();
        int Q = this.Y.Q();
        if (Q > gm.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            i = (int) (this.w.getY() + view.getTop() + f2);
            if ((L - rect.top) - rect.bottom > gm.L(240.0f)) {
                i += gm.L(240.0f) - L;
            }
            if (i < this.w.getY() + gm.L(24.0f)) {
                i = (int) (this.w.getY() + gm.L(24.0f));
            } else {
                int i3 = height - L;
                if (i > i3 - gm.L(8.0f)) {
                    i = i3 - gm.L(8.0f);
                }
            }
        } else {
            i = this.inBubbleMode ? 0 : gm.m;
        }
        gg1Var.setMaxHeight(height - i);
        this.G0.showAtLocation(this.w, 51, left, i);
        this.G0.b();
    }

    public final void U0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull M0;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().d4(tL_channels_channelParticipants.users, false);
            getMessagesController().X3(tL_channels_channelParticipants.chats, false);
            this.u0 = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.f;
            if (chat != null && (M0 = getMessagesController().M0(chat.id)) != null && M0.antispam) {
                ig1 ig1Var = new ig1();
                ig1Var.user_id = getMessagesController().L3;
                ig1Var.peer = getMessagesController().x1(ig1Var.user_id);
                long j = getMessagesController().L3;
                if (getMessagesController().W1(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new ag1(this, (byte) 1));
                }
                this.u0.add(0, ig1Var);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof ib) {
                ((ib) dialog).Z0(this.u0);
            }
        }
    }

    public final void V0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        byte b;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        k47 k47Var;
        int i = 0;
        this.D0.N = false;
        a1(false);
        oc7.r1(this.currentAccount).d4(tL_channels_adminLogResults.users, false);
        oc7.r1(this.currentAccount).X3(tL_channels_adminLogResults.chats, false);
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
            vh6 vh6Var = this.l0;
            if (vh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent.id);
                k47 k47Var2 = new k47(this.currentAccount, tL_channelAdminLogEvent, arrayList, this.n0, this.f, this.U, false);
                if (k47Var2.U >= 0) {
                    vh6Var.k(k47Var2, tL_channelAdminLogEvent.id);
                }
                z = true;
            }
            i2++;
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            k47 k47Var3 = (k47) arrayList.get(size);
            if (k47Var3 != null && k47Var3.U != 0 && k47Var3.L1() >= 0) {
                this.m0.k(k47Var3, k47Var3.L1());
            }
            if (k47Var3 != null && (message = k47Var3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            k47Var = null;
                            break;
                        }
                        if (size != i3) {
                            k47Var = (k47) arrayList.get(i3);
                            if (k47Var.U != 1 && k47Var.L1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (k47Var != null) {
                        k47Var3.C = k47Var;
                    }
                }
                arrayList2.add(k47Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            hs6.d0(this.currentAccount).Y0(arrayList2, -this.f.id, 0, 0L, new bg1(this, b), getClassGuid(), null);
        }
        O0();
        this.s0 = false;
        if (!z) {
            this.r0 = true;
        }
        gm.T3(this.n, false, 0.3f, true, true);
        this.w.setEmptyView(this.I);
        sg1 sg1Var = this.F;
        if (sg1Var != null) {
            sg1Var.f();
        }
        r7 r7Var = this.O;
        if (r7Var != null) {
            if (this.p0.isEmpty() && TextUtils.isEmpty(this.w0)) {
                i = 8;
            }
            r7Var.setVisibility(i);
        }
    }

    public final void W0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.t0 = false;
        this.D0.N = false;
        a1(false);
        oc7.r1(this.currentAccount).d4(tL_channels_adminLogResults.users, false);
        oc7.r1(this.currentAccount).X3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            vh6 vh6Var = this.l0;
            if (vh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent2.id);
                k47 k47Var = new k47(this.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, this.f, this.U, false);
                if (k47Var.U >= 0 && (((tL_channelAdminLogEvent = k47Var.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !vh6Var.d(tL_channelAdminLogEvent2.id))) {
                    this.o0.add(0, k47Var);
                    vh6Var.k(k47Var, tL_channelAdminLogEvent2.id);
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
        sg1 sg1Var;
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        if (z) {
            this.P = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                gm.T3(frameLayout, true, 0.3f, true, true);
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
        tL_channels_getAdminLog.channel = oc7.h1(this.f);
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
                tL_channels_getAdminLog.admins.add(oc7.r1(this.currentAccount).p1((TLRPC.User) this.x0.n(i)));
            }
        }
        g1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ag1(this, (byte) 3));
        if (!z || (sg1Var = this.F) == null) {
            return;
        }
        sg1Var.f();
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
        tL_channels_getAdminLog.channel = oc7.h1(this.f);
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
                tL_channels_getAdminLog.admins.add(oc7.r1(this.currentAccount).p1((TLRPC.User) this.x0.n(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ag1(this, b));
    }

    public final void a1(boolean z) {
        fv fvVar = this.w;
        if (fvVar == null || this.y == null || fvVar.getChildCount() <= 0) {
            return;
        }
        int i = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < this.w.getChildCount(); i3++) {
            View childAt = this.w.getChildAt(i3);
            this.w.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z) {
                    if (top >= i) {
                    }
                    i = childAt.getTop();
                    view = childAt;
                    i2 = R;
                } else {
                    if (top <= i) {
                    }
                    i = childAt.getTop();
                    view = childAt;
                    i2 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof rc2 ? ((rc2) view).getMessageObject().T : view instanceof cm1 ? ((cm1) view).getMessageObject().T : 0L;
            this.N0 = i2;
            this.O0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.vf));
        hashSet.add(Integer.valueOf(cmb.uf));
        hashSet.add(Integer.valueOf(cmb.Fc));
        hashSet.add(Integer.valueOf(cmb.gf));
        hashSet.add(Integer.valueOf(cmb.Hc));
        hashSet.add(Integer.valueOf(cmb.Gc));
        hashSet.add(Integer.valueOf(cmb.jf));
        hashSet.add(Integer.valueOf(cmb.hf));
        hashSet.add(Integer.valueOf(cmb.ld));
        hashSet.add(Integer.valueOf(cmb.Ze));
        hashSet.add(Integer.valueOf(cmb.kd));
        hashSet.add(Integer.valueOf(cmb.Ye));
        hashSet.add(Integer.valueOf(cmb.Gb));
        hashSet.add(Integer.valueOf(cmb.Ec));
        hashSet.add(Integer.valueOf(cmb.Fb));
        hashSet.add(Integer.valueOf(cmb.Dc));
        hashSet.add(Integer.valueOf(cmb.Qb));
        hashSet.add(Integer.valueOf(cmb.Kd));
        hashSet.add(Integer.valueOf(cmb.Ae));
        hashSet.add(Integer.valueOf(cmb.Bc));
        hashSet.add(Integer.valueOf(cmb.ze));
        hashSet.add(Integer.valueOf(cmb.Ac));
        hashSet.add(Integer.valueOf(cmb.ye));
        hashSet.add(Integer.valueOf(cmb.zc));
        hashSet.add(Integer.valueOf(cmb.xe));
        hashSet.add(Integer.valueOf(cmb.yc));
        hashSet.add(Integer.valueOf(cmb.we));
        hashSet.add(Integer.valueOf(cmb.xc));
        hashSet.add(Integer.valueOf(cmb.ve));
        hashSet.add(Integer.valueOf(cmb.wc));
        hashSet.add(Integer.valueOf(cmb.ue));
        hashSet.add(Integer.valueOf(cmb.vc));
        hashSet.add(Integer.valueOf(cmb.te));
        hashSet.add(Integer.valueOf(cmb.uc));
        hashSet.add(Integer.valueOf(cmb.se));
        hashSet.add(Integer.valueOf(cmb.tc));
        hashSet.add(Integer.valueOf(cmb.re));
        hashSet.add(Integer.valueOf(cmb.sc));
        hashSet.add(Integer.valueOf(cmb.qe));
        hashSet.add(Integer.valueOf(cmb.rc));
        hashSet.add(Integer.valueOf(cmb.pe));
        hashSet.add(Integer.valueOf(cmb.qc));
        hashSet.add(Integer.valueOf(cmb.oe));
        hashSet.add(Integer.valueOf(cmb.pc));
        hashSet.add(Integer.valueOf(cmb.le));
        hashSet.add(Integer.valueOf(cmb.ne));
        hashSet.add(Integer.valueOf(cmb.me));
        hashSet.add(Integer.valueOf(cmb.ke));
        hashSet.add(Integer.valueOf(cmb.lc));
        hashSet.add(Integer.valueOf(cmb.je));
        hashSet.add(Integer.valueOf(cmb.kc));
        hashSet.add(Integer.valueOf(cmb.ie));
        hashSet.add(Integer.valueOf(cmb.jc));
        hashSet.add(Integer.valueOf(cmb.he));
        hashSet.add(Integer.valueOf(cmb.bc));
        hashSet.add(Integer.valueOf(cmb.fe));
        hashSet.add(Integer.valueOf(cmb.dc));
        hashSet.add(Integer.valueOf(cmb.ee));
        hashSet.add(Integer.valueOf(cmb.ic));
        hashSet.add(Integer.valueOf(cmb.de));
        hashSet.add(Integer.valueOf(cmb.ae));
        hashSet.add(Integer.valueOf(cmb.hc));
        hashSet.add(Integer.valueOf(cmb.Zd));
        hashSet.add(Integer.valueOf(cmb.gc));
        hashSet.add(Integer.valueOf(cmb.Yd));
        hashSet.add(Integer.valueOf(cmb.Xd));
        hashSet.add(Integer.valueOf(cmb.Xb));
        hashSet.add(Integer.valueOf(cmb.Td));
        hashSet.add(Integer.valueOf(cmb.Wb));
        hashSet.add(Integer.valueOf(cmb.Sd));
        hashSet.add(Integer.valueOf(cmb.Rd));
        hashSet.add(Integer.valueOf(cmb.Vb));
        hashSet.add(Integer.valueOf(cmb.Qd));
        hashSet.add(Integer.valueOf(cmb.Ub));
        hashSet.add(Integer.valueOf(cmb.Pd));
        hashSet.add(Integer.valueOf(cmb.Tb));
        hashSet.add(Integer.valueOf(cmb.Od));
        hashSet.add(Integer.valueOf(cmb.Nd));
        hashSet.add(Integer.valueOf(cmb.Ld));
        hashSet.add(Integer.valueOf(cmb.Hd));
        hashSet.add(Integer.valueOf(cmb.Pb));
        hashSet.add(Integer.valueOf(cmb.Gd));
        hashSet.add(Integer.valueOf(cmb.Ob));
        hashSet.add(Integer.valueOf(cmb.Ed));
        hashSet.add(Integer.valueOf(cmb.Dd));
        hashSet.add(Integer.valueOf(cmb.Cd));
        hashSet.add(Integer.valueOf(cmb.Bd));
        hashSet.add(Integer.valueOf(cmb.Nb));
        hashSet.add(Integer.valueOf(cmb.Ad));
        hashSet.add(Integer.valueOf(cmb.zd));
        hashSet.add(Integer.valueOf(cmb.yd));
        hashSet.add(Integer.valueOf(cmb.wd));
        hashSet.add(Integer.valueOf(cmb.vd));
        hashSet.add(Integer.valueOf(cmb.pa));
        hashSet.add(Integer.valueOf(cmb.q7));
        hashSet.add(Integer.valueOf(cmb.yb));
        hashSet.add(Integer.valueOf(cmb.ud));
        hashSet.add(Integer.valueOf(cmb.td));
        hashSet.add(Integer.valueOf(cmb.Mb));
        hashSet.add(Integer.valueOf(cmb.Lb));
        hashSet.add(Integer.valueOf(cmb.sd));
        hashSet.add(Integer.valueOf(cmb.rd));
        hashSet.add(Integer.valueOf(cmb.qd));
        hashSet.add(Integer.valueOf(cmb.Kb));
        hashSet.add(Integer.valueOf(cmb.Jb));
        hashSet.add(Integer.valueOf(cmb.pd));
        hashSet.add(Integer.valueOf(cmb.od));
        hashSet.add(Integer.valueOf(cmb.nd));
        hashSet.add(Integer.valueOf(cmb.Ib));
        hashSet.add(Integer.valueOf(cmb.Hb));
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.Xc));
        hashSet.add(Integer.valueOf(cmb.Wc));
        hashSet.add(Integer.valueOf(cmb.Vc));
        hashSet.add(Integer.valueOf(cmb.Uc));
        hashSet.add(Integer.valueOf(cmb.cd));
        hashSet.add(Integer.valueOf(cmb.bd));
        hashSet.add(Integer.valueOf(cmb.ad));
        hashSet.add(Integer.valueOf(cmb.Zc));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.vb));
        hashSet.add(Integer.valueOf(cmb.ub));
        hashSet.add(Integer.valueOf(cmb.tb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.sb));
        hashSet.add(Integer.valueOf(cmb.sa));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.n8));
        hashSet.add(Integer.valueOf(cmb.m8));
        hashSet.add(Integer.valueOf(cmb.l8));
        hashSet.add(Integer.valueOf(cmb.k8));
        hashSet.add(Integer.valueOf(cmb.j8));
        hashSet.add(Integer.valueOf(cmb.i8));
        hashSet.add(Integer.valueOf(cmb.h8));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.A8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final int b1(k47 k47Var) {
        rc2 rc2Var = this.J0;
        if (rc2Var != null) {
            rc2Var.td = 0;
            rc2Var.ud = null;
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
    public final void c1(k47 k47Var) {
        int i;
        int i2;
        int indexOf;
        int q0;
        k47 messageObject;
        ArrayList arrayList = this.p0;
        if (arrayList.size() > 0) {
            int M0 = this.y.M0();
            for (int K0 = this.y.K0(); K0 <= M0; K0++) {
                sg1 sg1Var = this.F;
                int i3 = sg1Var.f;
                if (K0 >= i3 && K0 < sg1Var.h) {
                    k47 k47Var2 = (k47) arrayList.get(K0 - i3);
                    if (k47Var2.U != 1 && k47Var2.L1() != 0 && !k47Var2.q4()) {
                        i2 = K0 - this.F.f;
                        i = (k47Var2.L1() < k47Var.L1() ? 1 : 0) ^ 1;
                        this.E.b = i;
                        indexOf = arrayList.indexOf(k47Var);
                        if (indexOf == -1) {
                            if (i2 > 0) {
                                i = i2 > indexOf ? 0 : 1;
                                this.E.b = i;
                            }
                            bg1 bg1Var = this.I0;
                            if (bg1Var != null) {
                                gm.r(bg1Var);
                                this.I0 = null;
                            }
                            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.H0 = k47Var.L1();
                            int indexOf2 = arrayList.indexOf(k47Var) + this.F.f;
                            i1();
                            int childCount = this.w.getChildCount();
                            int i4 = 0;
                            boolean z = false;
                            while (true) {
                                if (i4 >= childCount) {
                                    break;
                                }
                                View childAt = this.w.getChildAt(i4);
                                if (childAt instanceof rc2) {
                                    k47 messageObject2 = ((rc2) childAt).getMessageObject();
                                    if (messageObject2 != null && messageObject2.L1() == k47Var.L1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        b1(messageObject2);
                                        z = true;
                                    }
                                    if (z) {
                                        i4++;
                                    } else {
                                        int top = childAt.getTop() - Math.max(-gm.L(2.0f), (this.w.getMeasuredHeight() - childAt.getHeight()) / 2);
                                        int computeVerticalScrollRange = (this.w.computeVerticalScrollRange() - this.w.computeVerticalScrollOffset()) - this.w.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.w.x0(0, top, null);
                                            this.w.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    if ((childAt instanceof cm1) && (messageObject = ((cm1) childAt).getMessageObject()) != null && messageObject.L1() == k47Var.L1()) {
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
                                rc2 rc2Var = this.J0;
                                if (rc2Var == null) {
                                    rc2Var = new rc2(getParentActivity(), this.currentAccount);
                                    this.J0 = rc2Var;
                                }
                                TLRPC.Chat chat = this.f;
                                rc2Var.f6 = chat != null;
                                rc2Var.k6 = sd2.T(chat) && chat.megagroup;
                                q0 = this.J0.q0(k47Var, null, false);
                            }
                            int max = Math.max(-gm.L(2.0f), (this.w.getMeasuredHeight() - q0) / 2);
                            b1(k47Var);
                            ug1 ug1Var = this.L0;
                            ug1Var.a = k47Var;
                            ug1Var.e = max;
                            cw6 cw6Var = this.E;
                            cw6Var.b = i;
                            ug1Var.b = indexOf2;
                            ug1Var.d = max;
                            ug1Var.c = false;
                            cw6Var.l(indexOf2, max, false, false);
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
        indexOf = arrayList.indexOf(k47Var);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        final byte b = 0;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new rc2(context, this.currentAccount));
            }
        }
        this.V = false;
        final byte b2 = 1;
        this.hasOwnBackground = true;
        cmb.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!gm.O1());
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 20));
        z82 z82Var = new z82(context, null, false, null);
        this.J = z82Var;
        mt1 mt1Var = z82Var.h;
        if (mt1Var != null) {
            mt1Var.setTextSizePx(gm.L(17.5f));
        }
        mt1 mt1Var2 = z82Var.r;
        if (mt1Var2 != null) {
            mt1Var2.setTextSizePx(gm.L(13.5f));
        }
        z82Var.m0 = true;
        this.J.setOccupyStatusBar(!gm.O1());
        this.actionBar.addView(this.J, 0, qoe.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        r7 a = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, b2);
        this.O = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        z82 z82Var2 = this.J;
        TLRPC.Chat chat = this.f;
        z82Var2.setTitle(chat.title);
        this.J.setSubtitle(jb6.M0(2131751011, null));
        this.J.setChatAvatar(chat);
        lg1 lg1Var = new lg1(this, context);
        this.fragmentView = lg1Var;
        this.Y = lg1Var;
        lg1Var.setOccupyStatusBar(!gm.O1());
        this.Y.U(cmb.r0());
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        pm0 o = qqd.o(this.resourceProvider);
        km0 km0Var = this.c;
        aVar.P(km0Var, o, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, qoe.e(-1, -2, 17));
        this.I.setOnTouchListener(new p8((byte) 24));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new slb(this.M, this.Y, gm.L(12.0f), cmb.e2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, qoe.t(54, 54, 17, 16, 20, 16, -4));
        wb wbVar = new wb(context, (byte) 14);
        this.M = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        wb wbVar2 = this.M;
        int i2 = cmb.Yc;
        anb.X(wbVar2, i2, null);
        this.M.setPadding(gm.L(8.0f), gm.L(5.0f), gm.L(8.0f), gm.L(5.0f));
        this.K.addView(this.M, qoe.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, qoe.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        fv fvVar = new fv((byte) 5, context, (Object) this);
        this.w = fvVar;
        fvVar.setOnItemClickListener(new ni6(this, (byte) 15));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        fv fvVar2 = this.w;
        sg1 sg1Var = new sg1(this, context);
        this.F = sg1Var;
        fvVar2.setAdapter(sg1Var);
        this.w.setClipToPadding(false);
        fv fvVar3 = this.w;
        int i3 = gm.m;
        int i4 = this.e;
        fvVar3.setPadding(0, gm.L(4.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i3 + i4, 0, gm.L(60.0f) + i4 + gm.n);
        fv fvVar4 = this.w;
        mg1 mg1Var = new mg1(this, this.w, this.resourceProvider);
        this.D0 = mg1Var;
        fvVar4.setItemAnimator(mg1Var);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        zs zsVar = new zs(this);
        this.y = zsVar;
        zsVar.i1(1);
        this.y.k1(true);
        this.w.setLayoutManager(this.y);
        cw6 cw6Var = new cw6(this.w, this.y);
        this.E = cw6Var;
        cw6Var.n = new cg1(this);
        cw6Var.r = this.L0;
        this.Y.addView(this.w, qoe.c(-1.0f, -1));
        this.w.setOnScrollListener(new y(this));
        this.glassEngine.b(this.w);
        int i5 = this.h0;
        if (i5 != -1) {
            this.y.g1(i5, this.i0);
            this.h0 = -1;
        }
        e02 e02Var = new e02(context);
        this.X = e02Var;
        e02Var.setup(this.b);
        this.X.setFadeZoneTop(gm.L(2.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m);
        this.X.setFadeHeightTop(gm.L(60.0f));
        this.X.setFadeZoneBottom(gm.L(7.0f) + gm.L(44.0f) + gm.L(9.0f) + gm.n);
        this.X.setFadeHeightBottom(gm.L(60.0f));
        this.Y.addView(this.X, qoe.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, qoe.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new slb(this.r, this.Y, gm.L(18.0f), cmb.e2));
        this.n.addView(this.r, qoe.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gm.L(28.0f));
        this.s.setProgressColor(cmb.w0(null, i2, false));
        this.n.addView(this.s, qoe.e(32, 32, 17));
        cm1 cm1Var = new cm1(context);
        this.N = cm1Var;
        cm1Var.setAlpha(0.0f);
        final byte b3 = 2;
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, qoe.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        ylb ylbVar = this.resourceProvider;
        ew1 ew1Var = new ew1(context, ylbVar, qqd.b(ylbVar), km0Var);
        this.H = ew1Var;
        ew1Var.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-gm.n);
        this.H.c(4, true, false);
        ew1 ew1Var2 = this.H;
        im0 c = ew1Var2.n.c(ew1Var2, null, false);
        c.p(ew1Var2.r);
        wi8.r(c, gm.L(22.0f), 6.0f);
        ew1Var2.w = c;
        this.Y.addView(this.H, qoe.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: eg1
            public final /* synthetic */ vg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b;
                vg1 vg1Var = this.b;
                switch (b4) {
                    case 0:
                        if (vg1Var.getParentActivity() != null) {
                            ib ibVar = new ib(vg1Var, vg1Var.v0, vg1Var.x0, vg1Var.f.megagroup);
                            ibVar.Z0(vg1Var.u0);
                            ibVar.b2 = new cg1(vg1Var);
                            vg1Var.showDialog(ibVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        boolean z = vg1Var.f.megagroup;
                        he heVar = alertDialog$Builder.a;
                        if (z) {
                            heVar.U = gm.S2(jb6.M0(2131750914, null));
                        } else {
                            heVar.U = gm.S2(jb6.M0(2131750913, null));
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.S = jb6.M0(2131750912, null);
                        vg1Var.showDialog(heVar);
                        break;
                    default:
                        if (vg1Var.getParentActivity() != null) {
                            gm.t1(vg1Var.O.getSearchField());
                            vg1Var.showDialog((my0) ik.o(vg1Var.getParentActivity(), new zf1(vg1Var, (byte) 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(gm.o());
        anb.X(this.G, cmb.rf, null);
        this.G.setText(jb6.M0(2131745717, null));
        this.G.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
        this.H.getContainer().addView(this.G, qoe.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) { // from class: eg1
            public final /* synthetic */ vg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b2;
                vg1 vg1Var = this.b;
                switch (b4) {
                    case 0:
                        if (vg1Var.getParentActivity() != null) {
                            ib ibVar = new ib(vg1Var, vg1Var.v0, vg1Var.x0, vg1Var.f.megagroup);
                            ibVar.Z0(vg1Var.u0);
                            ibVar.b2 = new cg1(vg1Var);
                            vg1Var.showDialog(ibVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        boolean z = vg1Var.f.megagroup;
                        he heVar = alertDialog$Builder.a;
                        if (z) {
                            heVar.U = gm.S2(jb6.M0(2131750914, null));
                        } else {
                            heVar.U = gm.S2(jb6.M0(2131750913, null));
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.S = jb6.M0(2131750912, null);
                        vg1Var.showDialog(heVar);
                        break;
                    default:
                        if (vg1Var.getParentActivity() != null) {
                            gm.t1(vg1Var.O.getSearchField());
                            vg1Var.showDialog((my0) ik.o(vg1Var.getParentActivity(), new zf1(vg1Var, (byte) 0), null).b);
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
        this.b0.setPadding(0, gm.L(3.0f), 0, 0);
        this.Y.addView(this.b0, qoe.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        anb.s(this.c0, cmb.of, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, qoe.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: eg1
            public final /* synthetic */ vg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b3;
                vg1 vg1Var = this.b;
                switch (b4) {
                    case 0:
                        if (vg1Var.getParentActivity() != null) {
                            ib ibVar = new ib(vg1Var, vg1Var.v0, vg1Var.x0, vg1Var.f.megagroup);
                            ibVar.Z0(vg1Var.u0);
                            ibVar.b2 = new cg1(vg1Var);
                            vg1Var.showDialog(ibVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        boolean z = vg1Var.f.megagroup;
                        he heVar = alertDialog$Builder.a;
                        if (z) {
                            heVar.U = gm.S2(jb6.M0(2131750914, null));
                        } else {
                            heVar.U = gm.S2(jb6.M0(2131750913, null));
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.S = jb6.M0(2131750912, null);
                        vg1Var.showDialog(heVar);
                        break;
                    default:
                        if (vg1Var.getParentActivity() != null) {
                            gm.t1(vg1Var.O.getSearchField());
                            vg1Var.showDialog((my0) ik.o(vg1Var.getParentActivity(), new zf1(vg1Var, (byte) 0), null).b);
                            break;
                        }
                        break;
                }
            }
        });
        lka lkaVar = new lka(context);
        this.d0 = lkaVar;
        anb.W(lkaVar, cmb.pf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(gm.o());
        this.b0.addView(this.d0, qoe.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            gm.T3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            gm.T3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        fv fvVar5 = this.w;
        fvVar5.X1 = true;
        fvVar5.Y1 = true;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(gm.L(51.0f));
        this.Y.addView(this.x, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        rc2 rc2Var;
        k47 messageObject;
        rc2 rc2Var2;
        k47 messageObject2;
        rc2 rc2Var3;
        k47 messageObject3;
        boolean z;
        if (i == nm7.m4) {
            fv fvVar = this.w;
            if (fvVar != null) {
                fvVar.h1();
                return;
            }
            return;
        }
        if (i != nm7.h2) {
            if (i == nm7.f2 || i == nm7.g2) {
                fv fvVar2 = this.w;
                if (fvVar2 != null) {
                    int childCount = fvVar2.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = this.w.getChildAt(i3);
                        if ((childAt instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) != null) {
                            if (k47.Q4(messageObject.k) || messageObject.I3()) {
                                rc2Var.R3(false, true, false);
                            } else if (messageObject.g4() && !MediaController.w().D(messageObject)) {
                                rc2Var.o0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i != nm7.e2) {
                if (i != nm7.D4 || this.fragmentView == null) {
                    return;
                }
                this.Y.U(cmb.r0());
                this.r.invalidate();
                wb wbVar = this.M;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                this.w.h1();
                return;
            }
            Integer num = (Integer) objArr[0];
            fv fvVar3 = this.w;
            if (fvVar3 != null) {
                int childCount2 = fvVar3.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.w.getChildAt(i4);
                    if ((childAt2 instanceof rc2) && (messageObject2 = (rc2Var2 = (rc2) childAt2).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                        k47 k47Var = MediaController.w().v0;
                        if (k47Var != null) {
                            messageObject2.b0 = k47Var.b0;
                            messageObject2.i0 = k47Var.i0;
                            messageObject2.j0 = k47Var.j0;
                            rc2Var2.W3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((k47) objArr[0]).g4()) {
            MediaController.w().o0(N0(true), this.f0, this.e0, true);
            int childCount3 = this.w.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount3) {
                    z = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i5);
                if (childAt3 instanceof rc2) {
                    rc2 rc2Var4 = (rc2) childAt3;
                    k47 messageObject4 = rc2Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.g4() && MediaController.w().D(messageObject4)) {
                        ImageReceiver photoImage = rc2Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.L0);
                        this.e0.setTranslationY(rc2Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                        this.fragmentView.invalidate();
                        this.e0.invalidate();
                        z = true;
                        break;
                    }
                }
                i5++;
            }
            if (this.e0 != null) {
                k47 k47Var2 = MediaController.w().v0;
                if (z) {
                    MediaController.w().j0(true);
                } else {
                    this.e0.setTranslationY((-gm.u) - 100);
                    this.fragmentView.invalidate();
                    if (k47Var2 != null && k47Var2.g4() && (this.W || PipRoundVideoView.G != null)) {
                        MediaController.w().j0(false);
                    }
                }
            }
        }
        fv fvVar4 = this.w;
        if (fvVar4 != null) {
            int childCount4 = fvVar4.getChildCount();
            for (int i6 = 0; i6 < childCount4; i6++) {
                View childAt4 = this.w.getChildAt(i6);
                if ((childAt4 instanceof rc2) && (messageObject3 = (rc2Var3 = (rc2) childAt4).getMessageObject()) != null) {
                    if (k47.Q4(messageObject3.k) || messageObject3.I3()) {
                        rc2Var3.R3(false, true, false);
                    } else if (messageObject3.g4()) {
                        rc2Var3.o0(null, false);
                        if (!MediaController.w().D(messageObject3) && messageObject3.b0 != 0.0f) {
                            messageObject3.F5();
                            rc2Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e1(TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        oc7 messagesController = getMessagesController();
        TLRPC.Chat chat = this.f;
        TLRPC.ChatFull M0 = messagesController.M0(chat.id);
        xs5 xs5Var = new xs5(this.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, M0, hashMap, this, M0.id, false, sd2.T(chat));
        xs5Var.d2 = new kg1(this);
        xs5Var.show();
    }

    public final void g1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(gm.L(8.0f), gm.L(3.0f), gm.L(8.0f), gm.L(3.0f));
            this.M.setText(gm.S2(jb6.M0(2131747935, null)));
            return;
        }
        if (this.x0 != null || this.v0 != null) {
            this.L.setVisibility(8);
            this.M.setPadding(gm.L(8.0f), gm.L(3.0f), gm.L(8.0f), gm.L(3.0f));
            this.M.setText(gm.S2(jb6.M0(2131747934, null)));
            return;
        }
        this.L.setVisibility(0);
        this.M.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        boolean z = this.f.megagroup;
        wb wbVar = this.M;
        if (z) {
            SpannableStringBuilder S2 = gm.S2(jb6.M0(2131750949, null));
            f1(S2);
            wbVar.setText(S2);
        } else {
            SpannableStringBuilder S22 = gm.S2(jb6.M0(2131750948, null));
            f1(S22);
            wbVar.setText(S22);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.De));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        arrayList.add(new cnb(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.z8));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Rb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ud));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vd));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.mc));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oc));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.nc));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ff));
        arrayList.add(new cnb(this.w, 131072, new Class[]{vf2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (bnb) null, cmb.wf));
        View view = this.r;
        int i = cmb.bd;
        arrayList.add(new cnb(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.M, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    public final void h1() {
        fv fvVar = this.w;
        if (fvVar == null) {
            return;
        }
        int childCount = fvVar.getChildCount();
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
            if (childAt instanceof zc2) {
                zc2 zc2Var = (zc2) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                zc2Var.f = y;
                zc2Var.h = backgroundSizeY;
            } else if (childAt instanceof rc2) {
                rc2 rc2Var = (rc2) childAt;
                int top = rc2Var.getTop();
                rc2Var.getBottom();
                int i4 = top >= 0 ? 0 : -top;
                int measuredHeight2 = rc2Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i4 + measuredHeight;
                }
                rc2Var.D3(i4, measuredHeight2 - i4, (this.Y.getHeightWithKeyboard() - gm.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                k47 messageObject = rc2Var.getMessageObject();
                if (this.e0 != null && messageObject.g4() && MediaController.w().D(messageObject)) {
                    ImageReceiver photoImage = rc2Var.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof cm1) {
                cm1 cm1Var = (cm1) childAt;
                cm1Var.j0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (cm1Var.Q()) {
                    cm1Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i) {
                    if ((childAt instanceof rc2) || (childAt instanceof cm1)) {
                        view = childAt;
                    }
                    i = bottom;
                    view3 = childAt;
                }
                mg1 mg1Var = this.D0;
                if ((mg1Var == null || (!mg1Var.Z(childAt) && !this.D0.Y(childAt))) && (childAt instanceof cm1) && ((cm1) childAt).getMessageObject().l0) {
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
        yd ydVar = this.e0;
        if (ydVar != null) {
            if (z2) {
                MediaController.w().j0(true);
            } else {
                ydVar.setTranslationY((-gm.u) - 100);
                this.fragmentView.invalidate();
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.g4() && this.W) {
                    MediaController.w().j0(false);
                }
            }
        }
        if (view != null) {
            this.N.h0((view instanceof rc2 ? ((rc2) view).getMessageObject() : ((cm1) view).getMessageObject()).k.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof rc2) && !(view3 instanceof cm1)) {
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
        fv fvVar = this.w;
        if (fvVar != null) {
            int childCount = fvVar.getChildCount();
            byte b = 0;
            for (int i = 0; i < childCount; i++) {
                View childAt = this.w.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    k47 messageObject = rc2Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.y()) {
                            rc2Var.setDrawSelectionBackground(false);
                            rc2Var.m3(false, true);
                            rc2Var.o3(false, false, true);
                        }
                        rc2Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0);
                        if (this.H0 != Integer.MAX_VALUE) {
                            bg1 bg1Var = this.I0;
                            if (bg1Var != null) {
                                gm.r(bg1Var);
                            }
                            bg1 bg1Var2 = new bg1(this, b);
                            this.I0 = bg1Var2;
                            gm.d3(bg1Var2, 1000L);
                        }
                        if (TextUtils.isEmpty(this.w0)) {
                            rc2Var.v3(null);
                        } else {
                            rc2Var.v3(this.w0);
                        }
                        rc2Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                    }
                } else if (childAt instanceof cm1) {
                    cm1 cm1Var = (cm1) childAt;
                    cm1Var.setMessageObject(cm1Var.getMessageObject());
                    cm1Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        nm7.e().b(this, nm7.m4);
        nm7.f(this.currentAccount).b(this, nm7.h2);
        nm7.f(this.currentAccount).b(this, nm7.g2);
        nm7.f(this.currentAccount).b(this, nm7.f2);
        nm7.f(this.currentAccount).b(this, nm7.e2);
        nm7.e().b(this, nm7.D4);
        X0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = oc7.h1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = nm7.d3;
        byte b = 4;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ag1(this, b)), this.classGuid);
        setBulletinDelegate(new oz(b));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.m4);
        nm7.f(this.currentAccount).n(this, nm7.h2);
        nm7.f(this.currentAccount).n(this, nm7.g2);
        nm7.f(this.currentAccount).n(this, nm7.f2);
        nm7.f(this.currentAccount).n(this, nm7.e2);
        nm7.e().n(this, nm7.D4);
        this.y0.e();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        tg1 tg1Var = this.Y;
        if (tg1Var != null) {
            dtc dtcVar = tg1Var.w;
            if (dtcVar != null) {
                dtcVar.b(false);
            }
            tg1Var.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        yh4 yh4Var = yh4.f;
        if (yh4Var == null || !yh4Var.a) {
            return;
        }
        yh4 t = yh4.t();
        if (t.a) {
            rc0 rc0Var = (rc0) t.d;
            int i = bd0.G;
            rc0Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRemoveFromParent() {
        MediaController.w().o0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        tg1 tg1Var = this.Y;
        if (tg1Var != null) {
            dtc dtcVar = tg1Var.w;
            if (dtcVar != null) {
                dtcVar.b(true);
            }
            tg1Var.G = false;
        }
        this.j0 = false;
        L0(false);
        if (this.k0) {
            this.k0 = false;
            sg1 sg1Var = this.F;
            if (sg1Var != null) {
                sg1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(cmb.w0(null, cmb.Yc, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.y0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.y0.d();
        }
    }
}
