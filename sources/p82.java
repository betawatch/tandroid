// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class p82 extends d implements vl5, gk7 {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public b9a H;
    public boolean H0;
    public wgb I;
    public boolean I0;
    public wgb J;
    public boolean J0;
    public wgb K;
    public boolean K0;
    public wgb L;
    public TLRPC.ChatReactions L0;
    public d08 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public wgb N;
    public boolean N0;
    public wgb O;
    public boolean O0;
    public wgb P;
    public boolean P0;
    public mhb Q;
    public final ArrayList Q0;
    public wgb R;
    public final m82 R0;
    public LinearLayout S;
    public oy8 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public wgb U;
    public wgb V;
    public wgb W;
    public wgb X;
    public wgb Y;
    public wgb Z;
    public sha a;
    public wgb a0;
    public hd b;
    public wgb b0;
    public UndoView c;
    public n82 c0;
    public LinearLayout d;
    public FrameLayout d0;
    public kb0 e;
    public uib e0;
    public s71 f;
    public wgb f0;
    public wgb g0;
    public AnimatorSet h;
    public gn2 h0;
    public mhb i0;
    public wgb j0;
    public mhb k0;
    public wgb l0;
    public wgb m0;
    public RadialProgressView n;
    public wgb n0;
    public wgb o0;
    public wgb p0;
    public wgb q0;
    public final pb0 r;
    public wgb r0;
    public final wl5 s;
    public mhb s0;
    public mhb t0;
    public wgb u0;
    public TLRPC.FileLocation v0;
    public rt3 w;
    public long w0;
    public t1 x;
    public TLRPC.Chat x0;
    public tu9 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public p82(Bundle bundle) {
        super(bundle);
        this.Q0 = new ArrayList();
        this.R0 = new m82(this);
        this.r = new pb0((wjb) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new wl5(0, false, false);
        } else {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.w0));
            this.s = new wl5((K0 == null || !hc2.V(K0)) ? 2 : 1, true, true);
        }
    }

    public static SpannableStringBuilder a0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        nd4 nd4Var = new nd4(10);
        nd4Var.a.setTypeface(gl.n1("fonts/num.otf"));
        nd4Var.f = bkb.w0(null, bkb.Bk, false);
        nd4Var.n = false;
        spannableStringBuilder.setSpan(nd4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String d0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_username tL_username = arrayList.get(i);
            i++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // vl5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // vl5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.c3(new ph1(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
    }

    public final boolean b0(boolean z) {
        rt3 rt3Var;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        byte b = 1;
        byte b2 = 0;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            rt3 rt3Var2 = this.w;
            if ((rt3Var2 != null && !this.D0.first_name.equals(rt3Var2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131743487, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131752971, null);
                    alertDialog$Builder.j(k96.M0(2131754213, null), new j82(this, b2));
                    alertDialog$Builder.g(k96.M0(2131747387, null), new j82(this, b));
                    showDialog(hdVar);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && hc2.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((rt3Var = this.w) != null && !this.x0.title.equals(rt3Var.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = k96.M0(2131743487, "UserRestrictionsApplyChanges");
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M02;
                if (this.J0) {
                    hdVar2.U = k96.M0(2131752293, "ChannelSettingsChangedAlert");
                } else {
                    hdVar2.U = k96.M0(2131749209, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.j(k96.M0(2131754213, "ApplyTheme"), new j82(this, (byte) 2));
                alertDialog$Builder2.g(k96.M0(2131747387, "PassportDiscard"), new j82(this, (byte) 3));
                showDialog(hdVar2);
            }
            return false;
        }
        return true;
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    public final void c0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().H2.f(-this.w0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            k27 k27Var = (k27) b00.f(1, arrayList);
            str = !TextUtils.isEmpty(k27Var.z) ? k27Var.z.toString() : !TextUtils.isEmpty(k27Var.v) ? k27Var.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = k96.M0(2131742629, null);
        }
        this.f0.u(k96.M0(2131742635, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1037  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x1044  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x10a8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x10d4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x10ad  */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v24 */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v4, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r23;
        final p82 p82Var;
        int i;
        Context context2;
        Integer num;
        ay0 ay0Var;
        int i2;
        int i3;
        vkb vkbVar;
        CharSequence charSequence;
        Integer num2;
        boolean z;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        TLRPC.User user;
        final p82 p82Var2;
        Context context3;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        long j;
        long j2;
        boolean z2;
        String format;
        int i4;
        wgb wgbVar;
        wgb wgbVar2;
        int i5;
        wgb wgbVar3;
        wgb wgbVar4;
        wgb wgbVar5;
        wgb wgbVar6;
        TLRPC.ChatFull chatFull2;
        int i6;
        byte b;
        byte b2;
        Context context4;
        final p82 p82Var3;
        byte b3;
        byte b4;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final byte b5 = 1;
        setHasOwnBackground(true);
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 24));
        ay0 ay0Var2 = new ay0(this, context, (byte) 2);
        ay0Var2.setOnTouchListener(new jz1((byte) 3));
        this.fragmentView = ay0Var2;
        t1 t1Var = new t1(context, (byte) 9);
        this.x = t1Var;
        tu9 tu9Var = new tu9(context, this.x, this.resourceProvider, false);
        this.y = tu9Var;
        tu9Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        ay0Var2.addView(this.y, nme.c(-1.0f, -1));
        this.y.addView(t1Var, new FrameLayout.LayoutParams(-1, -2));
        t1Var.setOrientation(1);
        this.simpleActionBar.setTitle(k96.L0(2131752403));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i7 = bkb.c6;
        zkb.h(i7, null, linearLayout2);
        t1Var.addView(this.d, nme.o(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d.addView(frameLayout, nme.o(-1, -2));
        kb0 kb0Var = new kb0((byte) 3, context, this);
        this.e = kb0Var;
        kb0Var.setRoundRadius(this.F0 ? gl.L(16.0f) : gl.L(32.0f));
        byte b6 = 4;
        if (this.D0 != null || hc2.d(this.x0)) {
            kb0 kb0Var2 = this.e;
            boolean z3 = k96.a0;
            frameLayout.addView(kb0Var2, nme.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            s71 s71Var = new s71(this, context, paint, b6);
            this.f = s71Var;
            boolean z4 = k96.a0;
            frameLayout.addView(s71Var, nme.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(gl.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z5 = k96.a0;
            frameLayout.addView(radialProgressView2, nme.d(64, 64.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 8.0f));
            r0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b7 = b5;
                    byte b8 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b7) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j3 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j3 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j3));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i8 = chatPhoto2.dc_id;
                                        if (i8 != 0) {
                                            chatPhoto2.photo_big.dc_id = i8;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i9 = userProfilePhoto2.dc_id;
                                        if (i9 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i9;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j4 = p82Var4.w0;
                            wgb wgbVar7 = p82Var4.I;
                            boolean z6 = wgbVar7 != null && wgbVar7.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j4;
                            f92Var.o0 = z6;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b8);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
        } else {
            kb0 kb0Var3 = this.e;
            boolean z6 = k96.a0;
            frameLayout.addView(kb0Var3, nme.d(64, 64.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 16.0f, 12.0f, z6 ? 16.0f : 0.0f, 12.0f));
        }
        rt3 rt3Var2 = new rt3(context, ay0Var2, this);
        this.w = rt3Var2;
        long j3 = this.C0;
        if (j3 != 0) {
            r23 = 0;
            rt3Var2.setHint(k96.L0(2131753009));
        } else if (this.J0) {
            rt3Var2.setHint(k96.M0(2131751112, "EnterChannelName"));
            r23 = false;
        } else {
            rt3Var2.setHint(k96.M0(2131749230, "GroupName"));
            r23 = false;
        }
        rt3 rt3Var3 = this.w;
        TLRPC.Chat chat3 = this.x0;
        rt3Var3.setEnabled((chat3 != null || hc2.d(chat3)) ? true : r23);
        rt3 rt3Var4 = this.w;
        rt3Var4.setFocusable(rt3Var4.isEnabled());
        this.w.getEditText().addTextChangedListener(new b7(this, (byte) 10));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r23] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        rt3 rt3Var5 = this.w;
        boolean z7 = k96.a0;
        frameLayout.addView(rt3Var5, nme.d(-1, -2.0f, 16, z7 ? 5.0f : 96.0f, 0.0f, z7 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(1);
        t1Var.addView(this.E, nme.o(-1, -2));
        final byte b7 = 12;
        if (this.D0 != null || hc2.d(this.x0)) {
            n82 n82Var = new n82(context);
            this.c0 = n82Var;
            zkb.Q(n82Var, bkb.L0(r23), null, zkb.M(bkb.h6));
            this.c0.g(bkb.u6, bkb.t6);
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b7;
                    byte b8 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i8 = chatPhoto2.dc_id;
                                        if (i8 != 0) {
                                            chatPhoto2.photo_big.dc_id = i8;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i9 = userProfilePhoto2.dc_id;
                                        if (i9 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i9;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j4 = p82Var4.w0;
                            wgb wgbVar7 = p82Var4.I;
                            boolean z62 = wgbVar7 != null && wgbVar7.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j4;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b8);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            this.E.addView(this.c0, nme.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.F = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        zkb.E(this.F, bkb.G6);
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        int i8 = bkb.F6;
        zkb.X(editTextBoldCursor2, i8, null);
        int i9 = r23;
        this.F.setPadding(i9, i9, i9, gl.L(6.0f));
        this.F.setBackgroundDrawable(null);
        this.F.setGravity(k96.a0 ? 5 : 3);
        this.F.setInputType(180225);
        this.F.setImeOptions(6);
        this.F.setEnabled(this.D0 != null || hc2.d(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.F;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(kk7.d4)});
        this.F.setHint(k96.M0(2131751448, "DescriptionOptionalPlaceholder"));
        zkb.u(this.F, i8);
        this.F.setCursorSize(gl.L(20.0f));
        this.F.setCursorWidth(1.5f);
        boolean isEnabled = this.F.isEnabled();
        LinearLayout linearLayout4 = this.E;
        EditTextBoldCursor editTextBoldCursor4 = this.F;
        if (isEnabled) {
            linearLayout4.addView(editTextBoldCursor4, nme.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            linearLayout4.addView(editTextBoldCursor4, nme.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.F.setOnEditorActionListener(new j(this, (byte) 7));
        this.F.addTextChangedListener(new xh1((byte) 1));
        b9a b9aVar = new b9a(context);
        this.H = b9aVar;
        t1Var.addView(b9aVar, nme.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        t1Var.addView(this.G, nme.o(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        CharSequence charSequence2 = "";
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                wgb wgbVar7 = new wgb(context);
                this.I = wgbVar7;
                zkb.Q(wgbVar7, bkb.L0(true), zkb.M(i7), zkb.M(bkb.h6));
                this.G.addView(this.I, nme.o(-1, -2));
                final byte b8 = 15;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b72 = b8;
                        byte b82 = 4;
                        gl5 gl5Var = null;
                        p82 p82Var4 = this.b;
                        switch (b72) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", p82Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kf2 kf2Var = new kf2(bundle);
                                kf2Var.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var);
                                break;
                            case 1:
                                m82 m82Var = p82Var4.R0;
                                long j32 = p82Var4.C0;
                                if (!p82Var4.s.g()) {
                                    TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                    if (V1 == null) {
                                        TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                            int i82 = chatPhoto2.dc_id;
                                            if (i82 != 0) {
                                                chatPhoto2.photo_big.dc_id = i82;
                                            }
                                            TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                            int i92 = userProfilePhoto2.dc_id;
                                            if (i92 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i92;
                                            }
                                            PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", p82Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kf2 kf2Var2 = new kf2(bundle2);
                                kf2Var2.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var2);
                                break;
                            case 3:
                                p82Var4.presentFragment(new hu0(p82Var4.w0));
                                break;
                            case 4:
                                p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                break;
                            case 5:
                                p82Var4.presentFragment(new nf1(p82Var4.x0));
                                break;
                            case 6:
                                p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", p82Var4.C0);
                                p82Var4.presentFragment(new me1(bundle3));
                                break;
                            case 8:
                                p82Var4.presentFragment(new bc(p82Var4.C0));
                                break;
                            case 9:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                break;
                            case 10:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                break;
                            case 11:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                break;
                            case 12:
                                p82Var4.m0();
                                break;
                            case 13:
                                p82Var4.h0();
                                break;
                            case 14:
                                p82 p82Var5 = this.b;
                                ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                break;
                            case 15:
                                if (gl.H1(p82Var4)) {
                                    qa6 qa6Var = new qa6(4);
                                    qa6Var.m0 = -p82Var4.w0;
                                    TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                    p82Var4.presentFragment(qa6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = p82Var4.w0;
                                wgb wgbVar72 = p82Var4.I;
                                boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                f92 f92Var = new f92(null);
                                f92Var.N = new ArrayList();
                                f92Var.O = new ArrayList();
                                f92Var.Q = new ArrayList();
                                f92Var.d0 = true;
                                f92Var.g0 = new ArrayList();
                                f92Var.p0 = new HashMap();
                                f92Var.r0 = new r82(f92Var, (byte) 5);
                                f92Var.t0 = false;
                                f92Var.a0 = j4;
                                f92Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                f92Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        f92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        f92Var.c0(false);
                                    }
                                }
                                p82Var4.presentFragment(f92Var);
                                break;
                            case 17:
                                long j5 = p82Var4.w0;
                                x92 x92Var = new x92(null);
                                x92Var.w = new ArrayList();
                                x92Var.P = false;
                                x92Var.Q = false;
                                x92Var.F = j5;
                                TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                x92Var.f = K02;
                                x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                x92Var.h = p82Var4.y0;
                                p82Var4.presentFragment(x92Var);
                                break;
                            case 18:
                                uf8 uf8Var = new uf8(p82Var4.w0);
                                uf8Var.s = new j82(p82Var4, b82);
                                p82Var4.presentFragment(uf8Var);
                                break;
                            case 19:
                                p82Var4.e0();
                                break;
                            case 20:
                                ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                ca5Var.c = p82Var4.M0;
                                ca5Var.m0 = p82Var4;
                                p82Var4.presentFragment(ca5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", p82Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                kf2 kf2Var3 = new kf2(bundle4);
                                kf2Var3.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var3);
                                break;
                            case 22:
                                yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                p82Var4.presentFragment(yh6Var);
                                break;
                            case 23:
                                if (!hc2.V(p82Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", p82Var4.w0);
                                    oc2 oc2Var = new oc2(bundle5);
                                    TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                    oc2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (oc2Var.a == null) {
                                            oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                        }
                                        oc2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            oc2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            oc2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            oc2Var.w = (byte) 1;
                                        }
                                    }
                                    p82Var4.presentFragment(oc2Var);
                                    break;
                                } else {
                                    p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = ls6.j(9, "chatMode");
                                j6.putLong("chat_id", p82Var4.w0);
                                j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                p82Var4.presentFragment(new mu1(j6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                wgb wgbVar8 = new wgb(context);
                this.J = wgbVar8;
                zkb.Q(wgbVar8, bkb.L0(true), zkb.M(i7), zkb.M(bkb.h6));
                this.G.addView(this.J, nme.o(-1, -2));
                final byte b9 = 16;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b72 = b9;
                        byte b82 = 4;
                        gl5 gl5Var = null;
                        p82 p82Var4 = this.b;
                        switch (b72) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", p82Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kf2 kf2Var = new kf2(bundle);
                                kf2Var.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var);
                                break;
                            case 1:
                                m82 m82Var = p82Var4.R0;
                                long j32 = p82Var4.C0;
                                if (!p82Var4.s.g()) {
                                    TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                    if (V1 == null) {
                                        TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                            int i82 = chatPhoto2.dc_id;
                                            if (i82 != 0) {
                                                chatPhoto2.photo_big.dc_id = i82;
                                            }
                                            TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                            int i92 = userProfilePhoto2.dc_id;
                                            if (i92 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i92;
                                            }
                                            PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", p82Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kf2 kf2Var2 = new kf2(bundle2);
                                kf2Var2.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var2);
                                break;
                            case 3:
                                p82Var4.presentFragment(new hu0(p82Var4.w0));
                                break;
                            case 4:
                                p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                break;
                            case 5:
                                p82Var4.presentFragment(new nf1(p82Var4.x0));
                                break;
                            case 6:
                                p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", p82Var4.C0);
                                p82Var4.presentFragment(new me1(bundle3));
                                break;
                            case 8:
                                p82Var4.presentFragment(new bc(p82Var4.C0));
                                break;
                            case 9:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                break;
                            case 10:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                break;
                            case 11:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                break;
                            case 12:
                                p82Var4.m0();
                                break;
                            case 13:
                                p82Var4.h0();
                                break;
                            case 14:
                                p82 p82Var5 = this.b;
                                ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                break;
                            case 15:
                                if (gl.H1(p82Var4)) {
                                    qa6 qa6Var = new qa6(4);
                                    qa6Var.m0 = -p82Var4.w0;
                                    TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                    p82Var4.presentFragment(qa6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = p82Var4.w0;
                                wgb wgbVar72 = p82Var4.I;
                                boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                f92 f92Var = new f92(null);
                                f92Var.N = new ArrayList();
                                f92Var.O = new ArrayList();
                                f92Var.Q = new ArrayList();
                                f92Var.d0 = true;
                                f92Var.g0 = new ArrayList();
                                f92Var.p0 = new HashMap();
                                f92Var.r0 = new r82(f92Var, (byte) 5);
                                f92Var.t0 = false;
                                f92Var.a0 = j4;
                                f92Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                f92Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        f92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        f92Var.c0(false);
                                    }
                                }
                                p82Var4.presentFragment(f92Var);
                                break;
                            case 17:
                                long j5 = p82Var4.w0;
                                x92 x92Var = new x92(null);
                                x92Var.w = new ArrayList();
                                x92Var.P = false;
                                x92Var.Q = false;
                                x92Var.F = j5;
                                TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                x92Var.f = K02;
                                x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                x92Var.h = p82Var4.y0;
                                p82Var4.presentFragment(x92Var);
                                break;
                            case 18:
                                uf8 uf8Var = new uf8(p82Var4.w0);
                                uf8Var.s = new j82(p82Var4, b82);
                                p82Var4.presentFragment(uf8Var);
                                break;
                            case 19:
                                p82Var4.e0();
                                break;
                            case 20:
                                ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                ca5Var.c = p82Var4.M0;
                                ca5Var.m0 = p82Var4;
                                p82Var4.presentFragment(ca5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", p82Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                kf2 kf2Var3 = new kf2(bundle4);
                                kf2Var3.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var3);
                                break;
                            case 22:
                                yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                p82Var4.presentFragment(yh6Var);
                                break;
                            case 23:
                                if (!hc2.V(p82Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", p82Var4.w0);
                                    oc2 oc2Var = new oc2(bundle5);
                                    TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                    oc2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (oc2Var.a == null) {
                                            oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                        }
                                        oc2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            oc2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            oc2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            oc2Var.w = (byte) 1;
                                        }
                                    }
                                    p82Var4.presentFragment(oc2Var);
                                    break;
                                } else {
                                    p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = ls6.j(9, "chatMode");
                                j6.putLong("chat_id", p82Var4.w0);
                                j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                p82Var4.presentFragment(new mu1(j6));
                                break;
                        }
                    }
                });
            }
            if (hc2.T(this.x0) && ((this.J0 && hc2.y(1, this.x0)) || (!this.J0 && hc2.y(0, this.x0)))) {
                wgb wgbVar9 = new wgb(context);
                this.K = wgbVar9;
                zkb.Q(wgbVar9, bkb.L0(true), zkb.M(i7), zkb.M(bkb.h6));
                this.G.addView(this.K, nme.o(-1, -2));
                final byte b10 = 17;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b72 = b10;
                        byte b82 = 4;
                        gl5 gl5Var = null;
                        p82 p82Var4 = this.b;
                        switch (b72) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", p82Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kf2 kf2Var = new kf2(bundle);
                                kf2Var.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var);
                                break;
                            case 1:
                                m82 m82Var = p82Var4.R0;
                                long j32 = p82Var4.C0;
                                if (!p82Var4.s.g()) {
                                    TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                    if (V1 == null) {
                                        TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                            int i82 = chatPhoto2.dc_id;
                                            if (i82 != 0) {
                                                chatPhoto2.photo_big.dc_id = i82;
                                            }
                                            TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                            int i92 = userProfilePhoto2.dc_id;
                                            if (i92 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i92;
                                            }
                                            PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", p82Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kf2 kf2Var2 = new kf2(bundle2);
                                kf2Var2.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var2);
                                break;
                            case 3:
                                p82Var4.presentFragment(new hu0(p82Var4.w0));
                                break;
                            case 4:
                                p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                break;
                            case 5:
                                p82Var4.presentFragment(new nf1(p82Var4.x0));
                                break;
                            case 6:
                                p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", p82Var4.C0);
                                p82Var4.presentFragment(new me1(bundle3));
                                break;
                            case 8:
                                p82Var4.presentFragment(new bc(p82Var4.C0));
                                break;
                            case 9:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                break;
                            case 10:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                break;
                            case 11:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                break;
                            case 12:
                                p82Var4.m0();
                                break;
                            case 13:
                                p82Var4.h0();
                                break;
                            case 14:
                                p82 p82Var5 = this.b;
                                ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                break;
                            case 15:
                                if (gl.H1(p82Var4)) {
                                    qa6 qa6Var = new qa6(4);
                                    qa6Var.m0 = -p82Var4.w0;
                                    TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                    p82Var4.presentFragment(qa6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = p82Var4.w0;
                                wgb wgbVar72 = p82Var4.I;
                                boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                f92 f92Var = new f92(null);
                                f92Var.N = new ArrayList();
                                f92Var.O = new ArrayList();
                                f92Var.Q = new ArrayList();
                                f92Var.d0 = true;
                                f92Var.g0 = new ArrayList();
                                f92Var.p0 = new HashMap();
                                f92Var.r0 = new r82(f92Var, (byte) 5);
                                f92Var.t0 = false;
                                f92Var.a0 = j4;
                                f92Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                f92Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        f92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        f92Var.c0(false);
                                    }
                                }
                                p82Var4.presentFragment(f92Var);
                                break;
                            case 17:
                                long j5 = p82Var4.w0;
                                x92 x92Var = new x92(null);
                                x92Var.w = new ArrayList();
                                x92Var.P = false;
                                x92Var.Q = false;
                                x92Var.F = j5;
                                TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                x92Var.f = K02;
                                x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                x92Var.h = p82Var4.y0;
                                p82Var4.presentFragment(x92Var);
                                break;
                            case 18:
                                uf8 uf8Var = new uf8(p82Var4.w0);
                                uf8Var.s = new j82(p82Var4, b82);
                                p82Var4.presentFragment(uf8Var);
                                break;
                            case 19:
                                p82Var4.e0();
                                break;
                            case 20:
                                ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                ca5Var.c = p82Var4.M0;
                                ca5Var.m0 = p82Var4;
                                p82Var4.presentFragment(ca5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", p82Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                kf2 kf2Var3 = new kf2(bundle4);
                                kf2Var3.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var3);
                                break;
                            case 22:
                                yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                p82Var4.presentFragment(yh6Var);
                                break;
                            case 23:
                                if (!hc2.V(p82Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", p82Var4.w0);
                                    oc2 oc2Var = new oc2(bundle5);
                                    TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                    oc2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (oc2Var.a == null) {
                                            oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                        }
                                        oc2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            oc2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            oc2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            oc2Var.w = (byte) 1;
                                        }
                                    }
                                    p82Var4.presentFragment(oc2Var);
                                    break;
                                } else {
                                    p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = ls6.j(9, "chatMode");
                                j6.putLong("chat_id", p82Var4.w0);
                                j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                p82Var4.presentFragment(new mu1(j6));
                                break;
                        }
                    }
                });
            }
            if (hc2.V(this.x0) && this.J0 && hc2.y(1, this.x0)) {
                wgb wgbVar10 = new wgb(context);
                this.L = wgbVar10;
                zkb.Q(wgbVar10, bkb.L0(true), zkb.M(i7), zkb.M(bkb.h6));
                this.L.s(k96.L0(2131746903), "", R.drawable.msg_markunread, true);
                i6 = -1;
                this.G.addView(this.L, nme.o(-1, -2));
                final byte b11 = 18;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b72 = b11;
                        byte b82 = 4;
                        gl5 gl5Var = null;
                        p82 p82Var4 = this.b;
                        switch (b72) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", p82Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kf2 kf2Var = new kf2(bundle);
                                kf2Var.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var);
                                break;
                            case 1:
                                m82 m82Var = p82Var4.R0;
                                long j32 = p82Var4.C0;
                                if (!p82Var4.s.g()) {
                                    TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                    if (V1 == null) {
                                        TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                            int i82 = chatPhoto2.dc_id;
                                            if (i82 != 0) {
                                                chatPhoto2.photo_big.dc_id = i82;
                                            }
                                            TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                            int i92 = userProfilePhoto2.dc_id;
                                            if (i92 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i92;
                                            }
                                            PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", p82Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kf2 kf2Var2 = new kf2(bundle2);
                                kf2Var2.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var2);
                                break;
                            case 3:
                                p82Var4.presentFragment(new hu0(p82Var4.w0));
                                break;
                            case 4:
                                p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                break;
                            case 5:
                                p82Var4.presentFragment(new nf1(p82Var4.x0));
                                break;
                            case 6:
                                p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", p82Var4.C0);
                                p82Var4.presentFragment(new me1(bundle3));
                                break;
                            case 8:
                                p82Var4.presentFragment(new bc(p82Var4.C0));
                                break;
                            case 9:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                break;
                            case 10:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                break;
                            case 11:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                break;
                            case 12:
                                p82Var4.m0();
                                break;
                            case 13:
                                p82Var4.h0();
                                break;
                            case 14:
                                p82 p82Var5 = this.b;
                                ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                break;
                            case 15:
                                if (gl.H1(p82Var4)) {
                                    qa6 qa6Var = new qa6(4);
                                    qa6Var.m0 = -p82Var4.w0;
                                    TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                    p82Var4.presentFragment(qa6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = p82Var4.w0;
                                wgb wgbVar72 = p82Var4.I;
                                boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                f92 f92Var = new f92(null);
                                f92Var.N = new ArrayList();
                                f92Var.O = new ArrayList();
                                f92Var.Q = new ArrayList();
                                f92Var.d0 = true;
                                f92Var.g0 = new ArrayList();
                                f92Var.p0 = new HashMap();
                                f92Var.r0 = new r82(f92Var, (byte) 5);
                                f92Var.t0 = false;
                                f92Var.a0 = j4;
                                f92Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                f92Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        f92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        f92Var.c0(false);
                                    }
                                }
                                p82Var4.presentFragment(f92Var);
                                break;
                            case 17:
                                long j5 = p82Var4.w0;
                                x92 x92Var = new x92(null);
                                x92Var.w = new ArrayList();
                                x92Var.P = false;
                                x92Var.Q = false;
                                x92Var.F = j5;
                                TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                x92Var.f = K02;
                                x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                x92Var.h = p82Var4.y0;
                                p82Var4.presentFragment(x92Var);
                                break;
                            case 18:
                                uf8 uf8Var = new uf8(p82Var4.w0);
                                uf8Var.s = new j82(p82Var4, b82);
                                p82Var4.presentFragment(uf8Var);
                                break;
                            case 19:
                                p82Var4.e0();
                                break;
                            case 20:
                                ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                ca5Var.c = p82Var4.M0;
                                ca5Var.m0 = p82Var4;
                                p82Var4.presentFragment(ca5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", p82Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                kf2 kf2Var3 = new kf2(bundle4);
                                kf2Var3.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var3);
                                break;
                            case 22:
                                yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                p82Var4.presentFragment(yh6Var);
                                break;
                            case 23:
                                if (!hc2.V(p82Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", p82Var4.w0);
                                    oc2 oc2Var = new oc2(bundle5);
                                    TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                    oc2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (oc2Var.a == null) {
                                            oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                        }
                                        oc2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            oc2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            oc2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            oc2Var.w = (byte) 1;
                                        }
                                    }
                                    p82Var4.presentFragment(oc2Var);
                                    break;
                                } else {
                                    p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = ls6.j(9, "chatMode");
                                j6.putLong("chat_id", p82Var4.w0);
                                j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                p82Var4.presentFragment(new mu1(j6));
                                break;
                        }
                    }
                });
            } else {
                i6 = -1;
            }
            if (hc2.V(this.x0) && hc2.d(this.x0)) {
                i = i7;
                ay0Var = ay0Var2;
                b = 13;
                b2 = 14;
                i2 = i6;
                d08 d08Var = new d08(this.currentAccount, -this.x0.id, getResourceProvider(), context);
                this.M = d08Var;
                zkb.Q(d08Var, bkb.L0(true), zkb.M(i), zkb.M(bkb.h6));
                this.G.addView(this.M, nme.o(i2, -2));
                final byte b12 = 19;
                this.M.setOnClickListener(new View.OnClickListener(this) { // from class: d82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b72 = b12;
                        byte b82 = 4;
                        gl5 gl5Var = null;
                        p82 p82Var4 = this.b;
                        switch (b72) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", p82Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kf2 kf2Var = new kf2(bundle);
                                kf2Var.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var);
                                break;
                            case 1:
                                m82 m82Var = p82Var4.R0;
                                long j32 = p82Var4.C0;
                                if (!p82Var4.s.g()) {
                                    TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                    if (V1 == null) {
                                        TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                            int i82 = chatPhoto2.dc_id;
                                            if (i82 != 0) {
                                                chatPhoto2.photo_big.dc_id = i82;
                                            }
                                            TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                            int i92 = userProfilePhoto2.dc_id;
                                            if (i92 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i92;
                                            }
                                            PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", p82Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kf2 kf2Var2 = new kf2(bundle2);
                                kf2Var2.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var2);
                                break;
                            case 3:
                                p82Var4.presentFragment(new hu0(p82Var4.w0));
                                break;
                            case 4:
                                p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                break;
                            case 5:
                                p82Var4.presentFragment(new nf1(p82Var4.x0));
                                break;
                            case 6:
                                p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", p82Var4.C0);
                                p82Var4.presentFragment(new me1(bundle3));
                                break;
                            case 8:
                                p82Var4.presentFragment(new bc(p82Var4.C0));
                                break;
                            case 9:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                break;
                            case 10:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                break;
                            case 11:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                break;
                            case 12:
                                p82Var4.m0();
                                break;
                            case 13:
                                p82Var4.h0();
                                break;
                            case 14:
                                p82 p82Var5 = this.b;
                                ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                break;
                            case 15:
                                if (gl.H1(p82Var4)) {
                                    qa6 qa6Var = new qa6(4);
                                    qa6Var.m0 = -p82Var4.w0;
                                    TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                    p82Var4.presentFragment(qa6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = p82Var4.w0;
                                wgb wgbVar72 = p82Var4.I;
                                boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                f92 f92Var = new f92(null);
                                f92Var.N = new ArrayList();
                                f92Var.O = new ArrayList();
                                f92Var.Q = new ArrayList();
                                f92Var.d0 = true;
                                f92Var.g0 = new ArrayList();
                                f92Var.p0 = new HashMap();
                                f92Var.r0 = new r82(f92Var, (byte) 5);
                                f92Var.t0 = false;
                                f92Var.a0 = j4;
                                f92Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                f92Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        f92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        f92Var.c0(false);
                                    }
                                }
                                p82Var4.presentFragment(f92Var);
                                break;
                            case 17:
                                long j5 = p82Var4.w0;
                                x92 x92Var = new x92(null);
                                x92Var.w = new ArrayList();
                                x92Var.P = false;
                                x92Var.Q = false;
                                x92Var.F = j5;
                                TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                x92Var.f = K02;
                                x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                x92Var.h = p82Var4.y0;
                                p82Var4.presentFragment(x92Var);
                                break;
                            case 18:
                                uf8 uf8Var = new uf8(p82Var4.w0);
                                uf8Var.s = new j82(p82Var4, b82);
                                p82Var4.presentFragment(uf8Var);
                                break;
                            case 19:
                                p82Var4.e0();
                                break;
                            case 20:
                                ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                ca5Var.c = p82Var4.M0;
                                ca5Var.m0 = p82Var4;
                                p82Var4.presentFragment(ca5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", p82Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                kf2 kf2Var3 = new kf2(bundle4);
                                kf2Var3.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var3);
                                break;
                            case 22:
                                yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                p82Var4.presentFragment(yh6Var);
                                break;
                            case 23:
                                if (!hc2.V(p82Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", p82Var4.w0);
                                    oc2 oc2Var = new oc2(bundle5);
                                    TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                    oc2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (oc2Var.a == null) {
                                            oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                        }
                                        oc2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            oc2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            oc2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            oc2Var.w = (byte) 1;
                                        }
                                    }
                                    p82Var4.presentFragment(oc2Var);
                                    break;
                                } else {
                                    p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = ls6.j(9, "chatMode");
                                j6.putLong("chat_id", p82Var4.w0);
                                j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                p82Var4.presentFragment(new mu1(j6));
                                break;
                        }
                    }
                });
            } else {
                i = i7;
                ay0Var = ay0Var2;
                b = 13;
                b2 = 14;
                i2 = i6;
            }
            if (!hc2.V(this.x0) || hc2.Y(this.x0)) {
                context4 = context;
                p82Var3 = this;
                num = 1;
                b3 = b;
                b4 = b2;
            } else {
                long j4 = -this.x0.id;
                num = 1;
                wgb wgbVar11 = new wgb(23, this.resourceProvider, context, false, true);
                context4 = context;
                this.N = wgbVar11;
                zkb.Q(wgbVar11, bkb.L0(true), zkb.M(i), zkb.M(bkb.h6));
                this.N.n(R.drawable.msg_translate, k96.L0(2131752446), this.x0.autotranslation);
                final byte b13 = 0;
                getMessagesController().E0().a(j4, new p8c(this) { // from class: h82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = this;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b14 = b13;
                        p82 p82Var4 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (b14) {
                            case 0:
                                if (tL_premium_boostsStatus != null) {
                                    p82Var4.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < p82Var4.getMessagesController().k4.U1.f() ? R.drawable.permission_locked : 0);
                                    break;
                                }
                                break;
                            default:
                                p82Var4.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                this.G.addView(this.N, nme.o(i2, -2));
                b3 = b;
                b4 = b2;
                p82Var3 = this;
                this.N.setOnClickListener(new fg(this, new boolean[]{false}, j4, (byte) 2));
            }
            if (!p82Var3.J0 && hc2.w(2, p82Var3.x0) && (hc2.T(p82Var3.x0) || p82Var3.x0.creator)) {
                wgb wgbVar12 = new wgb(context4);
                p82Var3.O = wgbVar12;
                zkb.Q(wgbVar12, bkb.L0(true), zkb.M(i), zkb.M(bkb.h6));
                p82Var3.G.addView(p82Var3.O, nme.o(i2, -2));
                p82Var3.O.setOnClickListener(new kb1(p82Var3, context4, b3));
            }
            if (hc2.n0(p82Var3.x0) && hc2.N(p82Var3.x0) && !hc2.Y(p82Var3.x0)) {
                final byte b14 = 1;
                na7.q1(p82Var3.currentAccount).E0().a(-p82Var3.x0.id, new p8c(p82Var3) { // from class: h82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = p82Var3;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b142 = b14;
                        p82 p82Var4 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (b142) {
                            case 0:
                                if (tL_premium_boostsStatus != null) {
                                    p82Var4.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < p82Var4.getMessagesController().k4.U1.f() ? R.drawable.permission_locked : 0);
                                    break;
                                }
                                break;
                            default:
                                p82Var4.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                Context context5 = context4;
                p82Var = this;
                d08 d08Var2 = new d08(p82Var3.currentAccount, -p82Var3.x0.id, getResourceProvider(), context5);
                p82Var.M = d08Var2;
                zkb.Q(d08Var2, bkb.L0(true), zkb.M(i), zkb.M(bkb.h6));
                p82Var.G.addView(p82Var.M, nme.o(i2, -2));
                final byte b15 = 20;
                p82Var.M.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = p82Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b72 = b15;
                        byte b82 = 4;
                        gl5 gl5Var = null;
                        p82 p82Var4 = this.b;
                        switch (b72) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", p82Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kf2 kf2Var = new kf2(bundle);
                                kf2Var.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var);
                                break;
                            case 1:
                                m82 m82Var = p82Var4.R0;
                                long j32 = p82Var4.C0;
                                if (!p82Var4.s.g()) {
                                    TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                    if (V1 == null) {
                                        TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                            int i82 = chatPhoto2.dc_id;
                                            if (i82 != 0) {
                                                chatPhoto2.photo_big.dc_id = i82;
                                            }
                                            TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, p82Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                            int i92 = userProfilePhoto2.dc_id;
                                            if (i92 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i92;
                                            }
                                            PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", p82Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kf2 kf2Var2 = new kf2(bundle2);
                                kf2Var2.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var2);
                                break;
                            case 3:
                                p82Var4.presentFragment(new hu0(p82Var4.w0));
                                break;
                            case 4:
                                p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                break;
                            case 5:
                                p82Var4.presentFragment(new nf1(p82Var4.x0));
                                break;
                            case 6:
                                p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", p82Var4.C0);
                                p82Var4.presentFragment(new me1(bundle3));
                                break;
                            case 8:
                                p82Var4.presentFragment(new bc(p82Var4.C0));
                                break;
                            case 9:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                break;
                            case 10:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                break;
                            case 11:
                                d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                break;
                            case 12:
                                p82Var4.m0();
                                break;
                            case 13:
                                p82Var4.h0();
                                break;
                            case 14:
                                p82 p82Var5 = this.b;
                                ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                break;
                            case 15:
                                if (gl.H1(p82Var4)) {
                                    qa6 qa6Var = new qa6(4);
                                    qa6Var.m0 = -p82Var4.w0;
                                    TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                    p82Var4.presentFragment(qa6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j42 = p82Var4.w0;
                                wgb wgbVar72 = p82Var4.I;
                                boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                f92 f92Var = new f92(null);
                                f92Var.N = new ArrayList();
                                f92Var.O = new ArrayList();
                                f92Var.Q = new ArrayList();
                                f92Var.d0 = true;
                                f92Var.g0 = new ArrayList();
                                f92Var.p0 = new HashMap();
                                f92Var.r0 = new r82(f92Var, (byte) 5);
                                f92Var.t0 = false;
                                f92Var.a0 = j42;
                                f92Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                f92Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        f92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        f92Var.c0(false);
                                    }
                                }
                                p82Var4.presentFragment(f92Var);
                                break;
                            case 17:
                                long j5 = p82Var4.w0;
                                x92 x92Var = new x92(null);
                                x92Var.w = new ArrayList();
                                x92Var.P = false;
                                x92Var.Q = false;
                                x92Var.F = j5;
                                TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                x92Var.f = K02;
                                x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                x92Var.h = p82Var4.y0;
                                p82Var4.presentFragment(x92Var);
                                break;
                            case 18:
                                uf8 uf8Var = new uf8(p82Var4.w0);
                                uf8Var.s = new j82(p82Var4, b82);
                                p82Var4.presentFragment(uf8Var);
                                break;
                            case 19:
                                p82Var4.e0();
                                break;
                            case 20:
                                ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                ca5Var.c = p82Var4.M0;
                                ca5Var.m0 = p82Var4;
                                p82Var4.presentFragment(ca5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", p82Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                kf2 kf2Var3 = new kf2(bundle4);
                                kf2Var3.A0(p82Var4.y0);
                                p82Var4.presentFragment(kf2Var3);
                                break;
                            case 22:
                                yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                p82Var4.presentFragment(yh6Var);
                                break;
                            case 23:
                                if (!hc2.V(p82Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", p82Var4.w0);
                                    oc2 oc2Var = new oc2(bundle5);
                                    TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                    oc2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (oc2Var.a == null) {
                                            oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                        }
                                        oc2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            oc2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            oc2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            oc2Var.w = (byte) 1;
                                        }
                                    }
                                    p82Var4.presentFragment(oc2Var);
                                    break;
                                } else {
                                    p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = ls6.j(9, "chatMode");
                                j6.putLong("chat_id", p82Var4.w0);
                                j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                p82Var4.presentFragment(new mu1(j6));
                                break;
                        }
                    }
                });
            } else {
                p82Var = p82Var3;
            }
            if (p82Var.J0 || !p82Var.x0.creator) {
                context2 = context;
            } else {
                wgb wgbVar13 = new wgb(23, null, context, false, true);
                context2 = context;
                p82Var.R = wgbVar13;
                zkb.Q(wgbVar13, bkb.L0(true), zkb.M(i), zkb.M(bkb.h6));
                p82Var.R.n(R.drawable.msg_topics, k96.L0(2131752269), p82Var.F0);
                p82Var.R.getCheckBox().setIcon(p82Var.G0 ? 0 : R.drawable.permission_locked);
                p82Var.G.addView(p82Var.R, nme.c(-2.0f, i2));
                p82Var.R.setOnClickListener(new kb1(p82Var, frameLayout, b4));
            }
            p82Var.s0();
        } else {
            p82Var = this;
            i = i7;
            context2 = context;
            num = 1;
            ay0Var = ay0Var2;
            i2 = -1;
        }
        p82Var.simpleActionBar.t();
        if (p82Var.D0 != null || hc2.d(p82Var.x0) || p82Var.O != null) {
            p82Var.a = p82Var.simpleActionBar.s(k96.L0(2131745754));
        }
        if (p82Var.I == null && p82Var.O == null && p82Var.J == null && p82Var.K == null && p82Var.R == null) {
            i3 = -2;
        } else {
            mhb mhbVar = new mhb(12, p82Var.resourceProvider, context2);
            p82Var.Q = mhbVar;
            if (p82Var.R != null) {
                mhbVar.setText(k96.L0(2131750571));
            } else {
                mhbVar.setFixedSize(12);
            }
            i3 = -2;
            t1Var.addView(p82Var.Q, nme.o(i2, -2));
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        p82Var.S = linearLayout6;
        linearLayout6.setOrientation(1);
        t1Var.addView(p82Var.S, nme.o(i2, i3));
        final byte b16 = 8;
        if (p82Var.x0 != null) {
            wgb wgbVar14 = new wgb(context2);
            p82Var.Y = wgbVar14;
            ff0 L0 = bkb.L0(false);
            int i10 = bkb.h6;
            vkbVar = null;
            zkb.Q(wgbVar14, L0, null, zkb.M(i10));
            wgb wgbVar15 = p82Var.Y;
            if (!hc2.T(p82Var.x0)) {
                TLRPC.Chat chat5 = p82Var.x0;
                if (!chat5.creator && (!hc2.N(chat5) || !hc2.d(p82Var.x0))) {
                    i4 = 8;
                    wgbVar15.setVisibility(i4);
                    final byte b17 = 21;
                    p82Var.Y.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b17;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j5 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j5;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = ls6.j(9, "chatMode");
                                    j6.putLong("chat_id", p82Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j6));
                                    break;
                            }
                        }
                    });
                    wgb wgbVar16 = new wgb(context2);
                    p82Var.W = wgbVar16;
                    zkb.Q(wgbVar16, bkb.L0(false), null, zkb.M(i10));
                    final byte b18 = 22;
                    p82Var.W.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b18;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j5 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j5;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = ls6.j(9, "chatMode");
                                    j6.putLong("chat_id", p82Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j6));
                                    break;
                            }
                        }
                    });
                    wgb wgbVar17 = new wgb(context2);
                    p82Var.P = wgbVar17;
                    zkb.Q(wgbVar17, bkb.L0(false), null, zkb.M(i10));
                    final byte b19 = 23;
                    p82Var.P.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b19;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j5 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j5;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = ls6.j(9, "chatMode");
                                    j6.putLong("chat_id", p82Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j6));
                                    break;
                            }
                        }
                    });
                    if (hc2.y(28, p82Var.x0)) {
                        wgb wgbVar18 = new wgb(context2);
                        p82Var.f0 = wgbVar18;
                        zkb.Q(wgbVar18, bkb.L0(false), null, zkb.M(i10));
                        final byte b20 = 24;
                        p82Var.f0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                            public final /* synthetic */ p82 b;

                            {
                                this.b = p82Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b72 = b20;
                                byte b82 = 4;
                                gl5 gl5Var = null;
                                p82 p82Var4 = this.b;
                                switch (b72) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", p82Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kf2 kf2Var = new kf2(bundle);
                                        kf2Var.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var);
                                        break;
                                    case 1:
                                        m82 m82Var = p82Var4.R0;
                                        long j32 = p82Var4.C0;
                                        if (!p82Var4.s.g()) {
                                            TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                            if (V1 == null) {
                                                TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = K0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                    int i82 = chatPhoto2.dc_id;
                                                    if (i82 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i82;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                    int i92 = userProfilePhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i92;
                                                    }
                                                    PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", p82Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kf2 kf2Var2 = new kf2(bundle2);
                                        kf2Var2.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var2);
                                        break;
                                    case 3:
                                        p82Var4.presentFragment(new hu0(p82Var4.w0));
                                        break;
                                    case 4:
                                        p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                        break;
                                    case 5:
                                        p82Var4.presentFragment(new nf1(p82Var4.x0));
                                        break;
                                    case 6:
                                        p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", p82Var4.C0);
                                        p82Var4.presentFragment(new me1(bundle3));
                                        break;
                                    case 8:
                                        p82Var4.presentFragment(new bc(p82Var4.C0));
                                        break;
                                    case 9:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                        break;
                                    case 12:
                                        p82Var4.m0();
                                        break;
                                    case 13:
                                        p82Var4.h0();
                                        break;
                                    case 14:
                                        p82 p82Var5 = this.b;
                                        ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (gl.H1(p82Var4)) {
                                            qa6 qa6Var = new qa6(4);
                                            qa6Var.m0 = -p82Var4.w0;
                                            TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                            p82Var4.presentFragment(qa6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = p82Var4.w0;
                                        wgb wgbVar72 = p82Var4.I;
                                        boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                        f92 f92Var = new f92(null);
                                        f92Var.N = new ArrayList();
                                        f92Var.O = new ArrayList();
                                        f92Var.Q = new ArrayList();
                                        f92Var.d0 = true;
                                        f92Var.g0 = new ArrayList();
                                        f92Var.p0 = new HashMap();
                                        f92Var.r0 = new r82(f92Var, (byte) 5);
                                        f92Var.t0 = false;
                                        f92Var.a0 = j42;
                                        f92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                        f92Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                f92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                f92Var.c0(false);
                                            }
                                        }
                                        p82Var4.presentFragment(f92Var);
                                        break;
                                    case 17:
                                        long j5 = p82Var4.w0;
                                        x92 x92Var = new x92(null);
                                        x92Var.w = new ArrayList();
                                        x92Var.P = false;
                                        x92Var.Q = false;
                                        x92Var.F = j5;
                                        TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                        x92Var.f = K02;
                                        x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                        x92Var.h = p82Var4.y0;
                                        p82Var4.presentFragment(x92Var);
                                        break;
                                    case 18:
                                        uf8 uf8Var = new uf8(p82Var4.w0);
                                        uf8Var.s = new j82(p82Var4, b82);
                                        p82Var4.presentFragment(uf8Var);
                                        break;
                                    case 19:
                                        p82Var4.e0();
                                        break;
                                    case 20:
                                        ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                        ca5Var.c = p82Var4.M0;
                                        ca5Var.m0 = p82Var4;
                                        p82Var4.presentFragment(ca5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", p82Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                        kf2 kf2Var3 = new kf2(bundle4);
                                        kf2Var3.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var3);
                                        break;
                                    case 22:
                                        yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                        yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                        p82Var4.presentFragment(yh6Var);
                                        break;
                                    case 23:
                                        if (!hc2.V(p82Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", p82Var4.w0);
                                            oc2 oc2Var = new oc2(bundle5);
                                            TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                            oc2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (oc2Var.a == null) {
                                                    oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                                }
                                                oc2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    oc2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    oc2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    oc2Var.w = (byte) 1;
                                                }
                                            }
                                            p82Var4.presentFragment(oc2Var);
                                            break;
                                        } else {
                                            p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = ls6.j(9, "chatMode");
                                        j6.putLong("chat_id", p82Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                        p82Var4.presentFragment(new mu1(j6));
                                        break;
                                }
                            }
                        });
                        p82Var.c0();
                    }
                    wgb wgbVar19 = new wgb(context2);
                    p82Var.X = wgbVar19;
                    final byte b21 = 0;
                    zkb.Q(wgbVar19, bkb.L0(false), null, zkb.M(i10));
                    p82Var.X.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b21;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j5 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j5;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = ls6.j(9, "chatMode");
                                    j6.putLong("chat_id", p82Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j6));
                                    break;
                            }
                        }
                    });
                    wgb wgbVar20 = new wgb(context2);
                    p82Var.U = wgbVar20;
                    zkb.Q(wgbVar20, bkb.L0(false), null, zkb.M(i10));
                    final byte b22 = 2;
                    p82Var.U.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b22;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j5 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j5;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = ls6.j(9, "chatMode");
                                    j6.putLong("chat_id", p82Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j6));
                                    break;
                            }
                        }
                    });
                    if (!hc2.V(p82Var.x0)) {
                        wgb wgbVar21 = new wgb(context2);
                        p82Var.V = wgbVar21;
                        zkb.Q(wgbVar21, bkb.L0(false), null, zkb.M(i10));
                        final byte b23 = 3;
                        p82Var.V.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                            public final /* synthetic */ p82 b;

                            {
                                this.b = p82Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b72 = b23;
                                byte b82 = 4;
                                gl5 gl5Var = null;
                                p82 p82Var4 = this.b;
                                switch (b72) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", p82Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kf2 kf2Var = new kf2(bundle);
                                        kf2Var.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var);
                                        break;
                                    case 1:
                                        m82 m82Var = p82Var4.R0;
                                        long j32 = p82Var4.C0;
                                        if (!p82Var4.s.g()) {
                                            TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                            if (V1 == null) {
                                                TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = K0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                    int i82 = chatPhoto2.dc_id;
                                                    if (i82 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i82;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                    int i92 = userProfilePhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i92;
                                                    }
                                                    PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", p82Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kf2 kf2Var2 = new kf2(bundle2);
                                        kf2Var2.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var2);
                                        break;
                                    case 3:
                                        p82Var4.presentFragment(new hu0(p82Var4.w0));
                                        break;
                                    case 4:
                                        p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                        break;
                                    case 5:
                                        p82Var4.presentFragment(new nf1(p82Var4.x0));
                                        break;
                                    case 6:
                                        p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", p82Var4.C0);
                                        p82Var4.presentFragment(new me1(bundle3));
                                        break;
                                    case 8:
                                        p82Var4.presentFragment(new bc(p82Var4.C0));
                                        break;
                                    case 9:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                        break;
                                    case 12:
                                        p82Var4.m0();
                                        break;
                                    case 13:
                                        p82Var4.h0();
                                        break;
                                    case 14:
                                        p82 p82Var5 = this.b;
                                        ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (gl.H1(p82Var4)) {
                                            qa6 qa6Var = new qa6(4);
                                            qa6Var.m0 = -p82Var4.w0;
                                            TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                            p82Var4.presentFragment(qa6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = p82Var4.w0;
                                        wgb wgbVar72 = p82Var4.I;
                                        boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                        f92 f92Var = new f92(null);
                                        f92Var.N = new ArrayList();
                                        f92Var.O = new ArrayList();
                                        f92Var.Q = new ArrayList();
                                        f92Var.d0 = true;
                                        f92Var.g0 = new ArrayList();
                                        f92Var.p0 = new HashMap();
                                        f92Var.r0 = new r82(f92Var, (byte) 5);
                                        f92Var.t0 = false;
                                        f92Var.a0 = j42;
                                        f92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                        f92Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                f92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                f92Var.c0(false);
                                            }
                                        }
                                        p82Var4.presentFragment(f92Var);
                                        break;
                                    case 17:
                                        long j5 = p82Var4.w0;
                                        x92 x92Var = new x92(null);
                                        x92Var.w = new ArrayList();
                                        x92Var.P = false;
                                        x92Var.Q = false;
                                        x92Var.F = j5;
                                        TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                        x92Var.f = K02;
                                        x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                        x92Var.h = p82Var4.y0;
                                        p82Var4.presentFragment(x92Var);
                                        break;
                                    case 18:
                                        uf8 uf8Var = new uf8(p82Var4.w0);
                                        uf8Var.s = new j82(p82Var4, b82);
                                        p82Var4.presentFragment(uf8Var);
                                        break;
                                    case 19:
                                        p82Var4.e0();
                                        break;
                                    case 20:
                                        ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                        ca5Var.c = p82Var4.M0;
                                        ca5Var.m0 = p82Var4;
                                        p82Var4.presentFragment(ca5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", p82Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                        kf2 kf2Var3 = new kf2(bundle4);
                                        kf2Var3.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var3);
                                        break;
                                    case 22:
                                        yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                        yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                        p82Var4.presentFragment(yh6Var);
                                        break;
                                    case 23:
                                        if (!hc2.V(p82Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", p82Var4.w0);
                                            oc2 oc2Var = new oc2(bundle5);
                                            TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                            oc2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (oc2Var.a == null) {
                                                    oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                                }
                                                oc2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    oc2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    oc2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    oc2Var.w = (byte) 1;
                                                }
                                            }
                                            p82Var4.presentFragment(oc2Var);
                                            break;
                                        } else {
                                            p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = ls6.j(9, "chatMode");
                                        j6.putLong("chat_id", p82Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                        p82Var4.presentFragment(new mu1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    wgb wgbVar22 = new wgb(context2);
                    p82Var.a0 = wgbVar22;
                    wgbVar22.o(R.drawable.menu_feature_premium, a0(k96.L0(2131752459)), false);
                    zkb.Q(p82Var.a0, bkb.L0(false), null, zkb.M(i10));
                    final byte b24 = 4;
                    p82Var.a0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b24;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j5 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j5;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = ls6.j(9, "chatMode");
                                    j6.putLong("chat_id", p82Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j6));
                                    break;
                            }
                        }
                    });
                    p82Var.a0.setVisibility(8);
                    if (!hc2.T(p82Var.x0) || p82Var.x0.gigagroup) {
                        wgb wgbVar23 = new wgb(context2);
                        p82Var.Z = wgbVar23;
                        wgbVar23.o(R.drawable.msg_log, k96.L0(2131751067), false);
                        zkb.Q(p82Var.Z, bkb.L0(false), null, zkb.M(i10));
                        final byte b25 = 5;
                        p82Var.Z.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                            public final /* synthetic */ p82 b;

                            {
                                this.b = p82Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b72 = b25;
                                byte b82 = 4;
                                gl5 gl5Var = null;
                                p82 p82Var4 = this.b;
                                switch (b72) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", p82Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kf2 kf2Var = new kf2(bundle);
                                        kf2Var.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var);
                                        break;
                                    case 1:
                                        m82 m82Var = p82Var4.R0;
                                        long j32 = p82Var4.C0;
                                        if (!p82Var4.s.g()) {
                                            TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                            if (V1 == null) {
                                                TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = K0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                    int i82 = chatPhoto2.dc_id;
                                                    if (i82 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i82;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                    int i92 = userProfilePhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i92;
                                                    }
                                                    PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", p82Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kf2 kf2Var2 = new kf2(bundle2);
                                        kf2Var2.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var2);
                                        break;
                                    case 3:
                                        p82Var4.presentFragment(new hu0(p82Var4.w0));
                                        break;
                                    case 4:
                                        p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                        break;
                                    case 5:
                                        p82Var4.presentFragment(new nf1(p82Var4.x0));
                                        break;
                                    case 6:
                                        p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", p82Var4.C0);
                                        p82Var4.presentFragment(new me1(bundle3));
                                        break;
                                    case 8:
                                        p82Var4.presentFragment(new bc(p82Var4.C0));
                                        break;
                                    case 9:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                        break;
                                    case 12:
                                        p82Var4.m0();
                                        break;
                                    case 13:
                                        p82Var4.h0();
                                        break;
                                    case 14:
                                        p82 p82Var5 = this.b;
                                        ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (gl.H1(p82Var4)) {
                                            qa6 qa6Var = new qa6(4);
                                            qa6Var.m0 = -p82Var4.w0;
                                            TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                            p82Var4.presentFragment(qa6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = p82Var4.w0;
                                        wgb wgbVar72 = p82Var4.I;
                                        boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                        f92 f92Var = new f92(null);
                                        f92Var.N = new ArrayList();
                                        f92Var.O = new ArrayList();
                                        f92Var.Q = new ArrayList();
                                        f92Var.d0 = true;
                                        f92Var.g0 = new ArrayList();
                                        f92Var.p0 = new HashMap();
                                        f92Var.r0 = new r82(f92Var, (byte) 5);
                                        f92Var.t0 = false;
                                        f92Var.a0 = j42;
                                        f92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                        f92Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                f92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                f92Var.c0(false);
                                            }
                                        }
                                        p82Var4.presentFragment(f92Var);
                                        break;
                                    case 17:
                                        long j5 = p82Var4.w0;
                                        x92 x92Var = new x92(null);
                                        x92Var.w = new ArrayList();
                                        x92Var.P = false;
                                        x92Var.Q = false;
                                        x92Var.F = j5;
                                        TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                        x92Var.f = K02;
                                        x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                        x92Var.h = p82Var4.y0;
                                        p82Var4.presentFragment(x92Var);
                                        break;
                                    case 18:
                                        uf8 uf8Var = new uf8(p82Var4.w0);
                                        uf8Var.s = new j82(p82Var4, b82);
                                        p82Var4.presentFragment(uf8Var);
                                        break;
                                    case 19:
                                        p82Var4.e0();
                                        break;
                                    case 20:
                                        ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                        ca5Var.c = p82Var4.M0;
                                        ca5Var.m0 = p82Var4;
                                        p82Var4.presentFragment(ca5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", p82Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                        kf2 kf2Var3 = new kf2(bundle4);
                                        kf2Var3.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var3);
                                        break;
                                    case 22:
                                        yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                        yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                        p82Var4.presentFragment(yh6Var);
                                        break;
                                    case 23:
                                        if (!hc2.V(p82Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", p82Var4.w0);
                                            oc2 oc2Var = new oc2(bundle5);
                                            TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                            oc2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (oc2Var.a == null) {
                                                    oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                                }
                                                oc2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    oc2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    oc2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    oc2Var.w = (byte) 1;
                                                }
                                            }
                                            p82Var4.presentFragment(oc2Var);
                                            break;
                                        } else {
                                            p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = ls6.j(9, "chatMode");
                                        j6.putLong("chat_id", p82Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                        p82Var4.presentFragment(new mu1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    if (hc2.R(p82Var.x0)) {
                        wgb wgbVar24 = new wgb(context2);
                        p82Var.b0 = wgbVar24;
                        wgbVar24.o(R.drawable.msg_stats, k96.L0(2131744654), true);
                        zkb.Q(p82Var.b0, bkb.L0(false), null, zkb.M(i10));
                        final byte b26 = 6;
                        p82Var.b0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                            public final /* synthetic */ p82 b;

                            {
                                this.b = p82Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b72 = b26;
                                byte b82 = 4;
                                gl5 gl5Var = null;
                                p82 p82Var4 = this.b;
                                switch (b72) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", p82Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kf2 kf2Var = new kf2(bundle);
                                        kf2Var.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var);
                                        break;
                                    case 1:
                                        m82 m82Var = p82Var4.R0;
                                        long j32 = p82Var4.C0;
                                        if (!p82Var4.s.g()) {
                                            TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                            if (V1 == null) {
                                                TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = K0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                    int i82 = chatPhoto2.dc_id;
                                                    if (i82 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i82;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, p82Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                    int i92 = userProfilePhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i92;
                                                    }
                                                    PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", p82Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kf2 kf2Var2 = new kf2(bundle2);
                                        kf2Var2.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var2);
                                        break;
                                    case 3:
                                        p82Var4.presentFragment(new hu0(p82Var4.w0));
                                        break;
                                    case 4:
                                        p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                        break;
                                    case 5:
                                        p82Var4.presentFragment(new nf1(p82Var4.x0));
                                        break;
                                    case 6:
                                        p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", p82Var4.C0);
                                        p82Var4.presentFragment(new me1(bundle3));
                                        break;
                                    case 8:
                                        p82Var4.presentFragment(new bc(p82Var4.C0));
                                        break;
                                    case 9:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                        break;
                                    case 12:
                                        p82Var4.m0();
                                        break;
                                    case 13:
                                        p82Var4.h0();
                                        break;
                                    case 14:
                                        p82 p82Var5 = this.b;
                                        ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (gl.H1(p82Var4)) {
                                            qa6 qa6Var = new qa6(4);
                                            qa6Var.m0 = -p82Var4.w0;
                                            TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                            p82Var4.presentFragment(qa6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = p82Var4.w0;
                                        wgb wgbVar72 = p82Var4.I;
                                        boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                        f92 f92Var = new f92(null);
                                        f92Var.N = new ArrayList();
                                        f92Var.O = new ArrayList();
                                        f92Var.Q = new ArrayList();
                                        f92Var.d0 = true;
                                        f92Var.g0 = new ArrayList();
                                        f92Var.p0 = new HashMap();
                                        f92Var.r0 = new r82(f92Var, (byte) 5);
                                        f92Var.t0 = false;
                                        f92Var.a0 = j42;
                                        f92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                        f92Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                f92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                f92Var.c0(false);
                                            }
                                        }
                                        p82Var4.presentFragment(f92Var);
                                        break;
                                    case 17:
                                        long j5 = p82Var4.w0;
                                        x92 x92Var = new x92(null);
                                        x92Var.w = new ArrayList();
                                        x92Var.P = false;
                                        x92Var.Q = false;
                                        x92Var.F = j5;
                                        TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                                        x92Var.f = K02;
                                        x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                        x92Var.h = p82Var4.y0;
                                        p82Var4.presentFragment(x92Var);
                                        break;
                                    case 18:
                                        uf8 uf8Var = new uf8(p82Var4.w0);
                                        uf8Var.s = new j82(p82Var4, b82);
                                        p82Var4.presentFragment(uf8Var);
                                        break;
                                    case 19:
                                        p82Var4.e0();
                                        break;
                                    case 20:
                                        ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                        ca5Var.c = p82Var4.M0;
                                        ca5Var.m0 = p82Var4;
                                        p82Var4.presentFragment(ca5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", p82Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                        kf2 kf2Var3 = new kf2(bundle4);
                                        kf2Var3.A0(p82Var4.y0);
                                        p82Var4.presentFragment(kf2Var3);
                                        break;
                                    case 22:
                                        yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                        yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                        p82Var4.presentFragment(yh6Var);
                                        break;
                                    case 23:
                                        if (!hc2.V(p82Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", p82Var4.w0);
                                            oc2 oc2Var = new oc2(bundle5);
                                            TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                            oc2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (oc2Var.a == null) {
                                                    oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                                }
                                                oc2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    oc2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    oc2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    oc2Var.w = (byte) 1;
                                                }
                                            }
                                            p82Var4.presentFragment(oc2Var);
                                            break;
                                        } else {
                                            p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = ls6.j(9, "chatMode");
                                        j6.putLong("chat_id", p82Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                                        p82Var4.presentFragment(new mu1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    p82Var.S.addView(p82Var.P, nme.o(i2, -2));
                    wgbVar = p82Var.f0;
                    if (wgbVar != null) {
                        p82Var.S.addView(wgbVar, nme.o(i2, -2));
                    }
                    if (!p82Var.J0 && !p82Var.x0.gigagroup) {
                        p82Var.S.addView(p82Var.Y, nme.o(i2, -2));
                    }
                    if (!p82Var.J0) {
                        p82Var.S.addView(p82Var.W, nme.o(i2, -2));
                    }
                    p82Var.S.addView(p82Var.X, nme.o(i2, -2));
                    p82Var.S.addView(p82Var.U, nme.o(i2, -2));
                    wgbVar2 = p82Var.V;
                    if (wgbVar2 != null && (chatFull2 = p82Var.y0) != null && chatFull2.requests_pending > 0) {
                        p82Var.S.addView(wgbVar2, nme.o(i2, -2));
                    }
                    if (p82Var.J0) {
                        p82Var.S.addView(p82Var.W, nme.o(i2, -2));
                    }
                    if (!p82Var.J0 || p82Var.x0.gigagroup) {
                        i5 = -2;
                        p82Var.S.addView(p82Var.Y, nme.o(i2, -2));
                    } else {
                        i5 = -2;
                    }
                    wgbVar3 = p82Var.b0;
                    if (wgbVar3 != null) {
                        p82Var.S.addView(wgbVar3, nme.o(i2, i5));
                    }
                    wgbVar4 = p82Var.Z;
                    if (wgbVar4 != null) {
                        p82Var.S.addView(wgbVar4, nme.o(i2, i5));
                    }
                    wgbVar5 = p82Var.a0;
                    if (wgbVar5 != null) {
                        p82Var.S.addView(wgbVar5, nme.o(i2, i5));
                    }
                    if (p82Var.a0 != null && p82Var.getMessagesController().k4.C2.f() && hc2.V(p82Var.x0)) {
                        p82Var.a0.setVisibility(0);
                    }
                    wgbVar6 = p82Var.Z;
                    if (wgbVar6 != null) {
                        wgb wgbVar25 = p82Var.a0;
                        wgbVar6.setNeedDivider(wgbVar25 != null && wgbVar25.getVisibility() == 0);
                    }
                }
            }
            i4 = 0;
            wgbVar15.setVisibility(i4);
            final byte b172 = 21;
            p82Var.Y.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b172;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            wgb wgbVar162 = new wgb(context2);
            p82Var.W = wgbVar162;
            zkb.Q(wgbVar162, bkb.L0(false), null, zkb.M(i10));
            final byte b182 = 22;
            p82Var.W.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b182;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            wgb wgbVar172 = new wgb(context2);
            p82Var.P = wgbVar172;
            zkb.Q(wgbVar172, bkb.L0(false), null, zkb.M(i10));
            final byte b192 = 23;
            p82Var.P.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b192;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            if (hc2.y(28, p82Var.x0)) {
            }
            wgb wgbVar192 = new wgb(context2);
            p82Var.X = wgbVar192;
            final byte b212 = 0;
            zkb.Q(wgbVar192, bkb.L0(false), null, zkb.M(i10));
            p82Var.X.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b212;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            wgb wgbVar202 = new wgb(context2);
            p82Var.U = wgbVar202;
            zkb.Q(wgbVar202, bkb.L0(false), null, zkb.M(i10));
            final byte b222 = 2;
            p82Var.U.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b222;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            if (!hc2.V(p82Var.x0)) {
            }
            wgb wgbVar222 = new wgb(context2);
            p82Var.a0 = wgbVar222;
            wgbVar222.o(R.drawable.menu_feature_premium, a0(k96.L0(2131752459)), false);
            zkb.Q(p82Var.a0, bkb.L0(false), null, zkb.M(i10));
            final byte b242 = 4;
            p82Var.a0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b242;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            p82Var.a0.setVisibility(8);
            if (!hc2.T(p82Var.x0)) {
            }
            wgb wgbVar232 = new wgb(context2);
            p82Var.Z = wgbVar232;
            wgbVar232.o(R.drawable.msg_log, k96.L0(2131751067), false);
            zkb.Q(p82Var.Z, bkb.L0(false), null, zkb.M(i10));
            final byte b252 = 5;
            p82Var.Z.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b252;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            if (hc2.R(p82Var.x0)) {
            }
            p82Var.S.addView(p82Var.P, nme.o(i2, -2));
            wgbVar = p82Var.f0;
            if (wgbVar != null) {
            }
            if (!p82Var.J0) {
                p82Var.S.addView(p82Var.Y, nme.o(i2, -2));
            }
            if (!p82Var.J0) {
            }
            p82Var.S.addView(p82Var.X, nme.o(i2, -2));
            p82Var.S.addView(p82Var.U, nme.o(i2, -2));
            wgbVar2 = p82Var.V;
            if (wgbVar2 != null) {
                p82Var.S.addView(wgbVar2, nme.o(i2, -2));
            }
            if (p82Var.J0) {
            }
            if (p82Var.J0) {
            }
            i5 = -2;
            p82Var.S.addView(p82Var.Y, nme.o(i2, -2));
            wgbVar3 = p82Var.b0;
            if (wgbVar3 != null) {
            }
            wgbVar4 = p82Var.Z;
            if (wgbVar4 != null) {
            }
            wgbVar5 = p82Var.a0;
            if (wgbVar5 != null) {
            }
            if (p82Var.a0 != null) {
                p82Var.a0.setVisibility(0);
            }
            wgbVar6 = p82Var.Z;
            if (wgbVar6 != null) {
            }
        } else {
            vkbVar = null;
        }
        if (p82Var.D0 != null) {
            wgb wgbVar26 = new wgb(context2);
            p82Var.l0 = wgbVar26;
            ff0 L02 = bkb.L0(false);
            int i11 = bkb.h6;
            zkb.Q(wgbVar26, L02, vkbVar, zkb.M(i11));
            p82Var.l0.setPrioritizeTitleOverValue(true);
            p82Var.S.addView(p82Var.l0, nme.o(i2, -2));
            final byte b27 = 7;
            p82Var.l0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b27;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            p82Var.v0();
            wgb wgbVar27 = new wgb(context2);
            p82Var.o0 = wgbVar27;
            zkb.Q(wgbVar27, bkb.L0(false), vkbVar, zkb.M(i11));
            p82Var.o0.s(a0(k96.L0(2131754343)), "", R.drawable.msg_shareout, true);
            p82Var.S.addView(p82Var.o0, nme.o(i2, -2));
            p82Var.o0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b16;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            p82Var.o0.h(45, p82Var.E0 == null, false);
            TLRPC.UserFull userFull = p82Var.E0;
            if (userFull != null) {
                wgb wgbVar28 = p82Var.o0;
                if (userFull.starref_program == null) {
                    format = k96.L0(2131754342);
                    z2 = false;
                } else {
                    z2 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r1.commission_permille / 10.0f));
                }
                wgbVar28.w(format, z2);
            }
            if (!p82Var.getMessagesController().k4.B2.f()) {
                p82Var.o0.setVisibility(8);
            }
            wgb wgbVar29 = new wgb(context2);
            p82Var.p0 = wgbVar29;
            zkb.Q(wgbVar29, bkb.L0(false), vkbVar, zkb.M(i11));
            p82Var.p0.o(R.drawable.msg_log, k96.L0(2131753089), true);
            p82Var.S.addView(p82Var.p0, nme.o(i2, -2));
            final byte b28 = 9;
            p82Var.p0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b28;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            wgb wgbVar30 = new wgb(context2);
            p82Var.q0 = wgbVar30;
            zkb.Q(wgbVar30, bkb.L0(false), vkbVar, zkb.M(i11));
            p82Var.q0.o(R.drawable.msg_media, k96.L0(2131753090), true);
            p82Var.S.addView(p82Var.q0, nme.o(i2, -2));
            final byte b29 = 10;
            p82Var.q0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b29;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            wgb wgbVar31 = new wgb(context2);
            p82Var.r0 = wgbVar31;
            zkb.Q(wgbVar31, bkb.L0(false), vkbVar, zkb.M(i11));
            p82Var.r0.o(R.drawable.msg_bot, k96.L0(2131753098), true);
            p82Var.S.addView(p82Var.r0, nme.o(i2, -2));
            final byte b30 = 11;
            p82Var.r0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b30;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = p82Var.x0;
        if (chat6 != null) {
            if (!hc2.N(chat6)) {
                p82Var.S.setVisibility(8);
                p82Var.H.setVisibility(8);
            }
            t1Var.addView(new b9a(context2), nme.o(i2, -2));
        } else if (p82Var.D0 != null) {
            p82Var.s0 = new mhb(12, p82Var.resourceProvider, context2);
            String L03 = k96.L0(2131753040);
            SpannableString valueOf = SpannableString.valueOf(L03);
            int indexOf = L03.indexOf("@BotFather");
            if (indexOf != i2) {
                valueOf.setSpan(new o82((byte) 0), indexOf, indexOf + 10, 33);
            }
            p82Var.s0.setText(valueOf);
            t1Var.addView(p82Var.s0, nme.o(i2, -2));
            wgb wgbVar32 = new wgb(context2);
            p82Var.u0 = wgbVar32;
            ff0 L04 = bkb.L0(true);
            vkb M = zkb.M(i);
            int i12 = bkb.h6;
            zkb.Q(wgbVar32, L04, M, zkb.M(i12));
            p82Var.u0.o(R.drawable.menu_factcheck, k96.L0(2131752917), false);
            wgb wgbVar33 = p82Var.u0;
            int i13 = bkb.p6;
            wgbVar33.g(i13, i13);
            t1Var.addView(p82Var.u0, nme.o(i2, -2));
            final byte b31 = 13;
            p82Var.u0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b31;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j5 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j5;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j5));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = ls6.j(9, "chatMode");
                            j6.putLong("chat_id", p82Var4.w0);
                            j6.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j6));
                            break;
                    }
                }
            });
            mhb mhbVar2 = new mhb(12, p82Var.resourceProvider, context2);
            p82Var.t0 = mhbVar2;
            mhbVar2.setFixedSize(12);
            t1Var.addView(p82Var.t0, nme.o(i2, -2));
            wgb wgbVar34 = p82Var.u0;
            TLRPC.UserFull userFull2 = p82Var.E0;
            wgbVar34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            mhb mhbVar3 = p82Var.t0;
            TLRPC.UserFull userFull3 = p82Var.E0;
            mhbVar3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = p82Var.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout7 = new LinearLayout(context2);
                p82Var.T = linearLayout7;
                linearLayout7.setOrientation(1);
                t1Var.addView(p82Var.T, nme.o(i2, -2));
                ld5 ld5Var = new ld5(context2);
                ld5Var.setText(k96.L0(2131753109));
                p82Var.T.addView(ld5Var, nme.o(i2, -2));
                wgb wgbVar35 = new wgb(context2);
                p82Var.m0 = wgbVar35;
                zkb.Q(wgbVar35, bkb.L0(false), vkbVar, zkb.M(i12));
                p82Var.m0.setPrioritizeTitleOverValue(true);
                p82Var.T.addView(p82Var.m0, nme.o(i2, -2));
                final ct0 g = ct0.g(p82Var.currentAccount);
                final byte b32 = 0;
                p82Var.m0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: e82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = p82Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b33 = b32;
                        ct0 ct0Var = g;
                        p82 p82Var4 = this.b;
                        switch (b33) {
                            case 0:
                                long j5 = p82Var4.C0;
                                if (ct0Var.h(j5, false) != null) {
                                    p82Var4.presentFragment(new ss0(1, j5));
                                    break;
                                }
                                break;
                            default:
                                long j6 = p82Var4.C0;
                                if (ct0Var.h(j6, false) != null) {
                                    p82Var4.presentFragment(new ss0(0, j6));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g.m(j3)) {
                    charSequence = "x";
                    long i14 = g.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i14 > 0) {
                        double d = i14 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) gl.o0((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    p82Var.m0.s(k96.L0(2131753107), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new u86(gl.L(30.0f), p82Var.m0.c), 0, spannableStringBuilder2.length(), 33);
                    p82Var.m0.s(k96.L0(2131753107), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    charSequence = "x";
                }
                p82Var.m0.setVisibility(g.b(j3) ? 0 : 8);
                wgb wgbVar36 = new wgb(context2);
                p82Var.n0 = wgbVar36;
                zkb.Q(wgbVar36, bkb.L0(false), null, zkb.M(i12));
                final byte b33 = 1;
                p82Var.n0.setPrioritizeTitleOverValue(true);
                p82Var.T.addView(p82Var.n0, nme.o(-1, -2));
                p82Var.n0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: e82
                    public final /* synthetic */ p82 b;

                    {
                        this.b = p82Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b332 = b33;
                        ct0 ct0Var = g;
                        p82 p82Var4 = this.b;
                        switch (b332) {
                            case 0:
                                long j5 = p82Var4.C0;
                                if (ct0Var.h(j5, false) != null) {
                                    p82Var4.presentFragment(new ss0(1, j5));
                                    break;
                                }
                                break;
                            default:
                                long j6 = p82Var4.C0;
                                if (ct0Var.h(j6, false) != null) {
                                    p82Var4.presentFragment(new ss0(0, j6));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g.h(j3, false) != null) {
                    wgb wgbVar37 = p82Var.n0;
                    String L05 = k96.L0(2131753108);
                    if (g.c(j3).amount <= 0) {
                        z = false;
                    } else {
                        z = false;
                        charSequence2 = jva.a1(false, TextUtils.concat("XTR", jva.H0(g.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    wgbVar37.s(L05, charSequence2, R.drawable.menu_premium_main, z);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder3.setSpan(new u86(gl.L(30.0f), p82Var.n0.c), 0, spannableStringBuilder3.length(), 33);
                    p82Var.n0.s(k96.L0(2131753108), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                p82Var.n0.setVisibility(g.a(j3) ? 0 : 8);
                mhb mhbVar4 = new mhb(12, p82Var.getResourceProvider(), context2);
                mhbVar4.setFixedSize(12);
                num2 = num;
                mhbVar4.setTag(R.id.fit_width_tag, num2);
                t1Var.addView(mhbVar4, nme.o(-1, 12));
                p82Var.T.setVisibility((p82Var.n0.getVisibility() == 0 || p82Var.m0.getVisibility() == 0) ? 0 : 8);
                chat = p82Var.x0;
                if ((chat == null && chat.creator) || ((user = p82Var.D0) != null && user.bot && user.bot_can_edit)) {
                    if (chat != null) {
                        j = chat.linked_community_id;
                        j2 = -chat.id;
                    } else {
                        TLRPC.User user3 = p82Var.D0;
                        j = user3.linked_community_id;
                        j2 = user3.id;
                    }
                    final long j5 = j2;
                    final long j6 = j;
                    final boolean z8 = p82Var.D0 != null;
                    if (j6 != 0) {
                        gn2 gn2Var = new gn2(context2, p82Var.resourceProvider);
                        p82Var.h0 = gn2Var;
                        gn2Var.a(p82Var.currentAccount, p82Var.getMessagesController().K0(Long.valueOf(j6)));
                        gn2 gn2Var2 = p82Var.h0;
                        final byte b34 = 0;
                        ff0 L06 = bkb.L0(false);
                        int i15 = bkb.h6;
                        zkb.Q(gn2Var2, L06, null, zkb.M(i15));
                        p82Var.h0.setOnClickListener(new View.OnClickListener(p82Var) { // from class: f82
                            public final /* synthetic */ p82 b;

                            {
                                this.b = p82Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (b34) {
                                    case 0:
                                        p82 p82Var4 = this.b;
                                        na7 messagesController = p82Var4.getMessagesController();
                                        long j7 = j6;
                                        if (!hc2.N(messagesController.K0(Long.valueOf(j7)))) {
                                            p82Var4.showDialog(new eo2(p82Var4, j7, null, null));
                                            break;
                                        } else {
                                            p82Var4.presentFragment(new en2(ls6.k(j7, "community_id")));
                                            break;
                                        }
                                    default:
                                        this.b.presentFragment(new xm2(ls6.k(j6, "dialog_id")));
                                        break;
                                }
                            }
                        });
                        t1Var.addView(p82Var.h0, nme.o(-1, -2));
                        wgb wgbVar38 = new wgb(context2);
                        p82Var.j0 = wgbVar38;
                        wgbVar38.o(R.drawable.outline_community_remove_24, k96.L0(z8 ? 2131751872 : p82Var.J0 ? 2131751871 : 2131751870), false);
                        wgb wgbVar39 = p82Var.j0;
                        int i16 = bkb.o7;
                        wgbVar39.g(i16, i16);
                        zkb.Q(p82Var.j0, bkb.L0(false), null, zkb.M(i15));
                        wgb wgbVar40 = p82Var.j0;
                        p82Var2 = p82Var;
                        context3 = context;
                        wgbVar40.setOnClickListener(new View.OnClickListener() { // from class: g82
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String M0 = k96.M0(2131751903, null);
                                p82 p82Var4 = p82.this;
                                ij.s0(p82Var4, M0, k96.M0(z8 ? 2131751905 : p82Var4.J0 ? 2131751904 : 2131751902, null), k96.M0(2131746128, null), true, new w20(p82Var4, j5, j6, (byte) 2));
                            }
                        });
                        t1Var.addView(p82Var2.j0, nme.o(-1, -2));
                        mhb mhbVar5 = new mhb(12, p82Var2.getResourceProvider(), context3);
                        p82Var2.k0 = mhbVar5;
                        mhbVar5.setFixedSize(14);
                        p82Var2.k0.setTag(R.id.fit_width_tag, num2);
                        t1Var.addView(p82Var2.k0, nme.o(-1, 14));
                    } else {
                        p82Var2 = p82Var;
                        context3 = context2;
                        wgb wgbVar41 = new wgb(context3);
                        p82Var2.g0 = wgbVar41;
                        wgbVar41.g(bkb.u6, bkb.t6);
                        zkb.V(p82Var2.g0.getTextView(), bkb.Yl);
                        zkb.Q(p82Var2.g0, bkb.L0(false), null, zkb.M(bkb.h6));
                        p82Var2.g0.o(R.drawable.msg_groups, k96.L0(z8 ? 2131751969 : p82Var2.J0 ? 2131751967 : 2131751964), false);
                        final byte b35 = 1;
                        p82Var2.g0.setOnClickListener(new View.OnClickListener(p82Var2) { // from class: f82
                            public final /* synthetic */ p82 b;

                            {
                                this.b = p82Var2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (b35) {
                                    case 0:
                                        p82 p82Var4 = this.b;
                                        na7 messagesController = p82Var4.getMessagesController();
                                        long j7 = j5;
                                        if (!hc2.N(messagesController.K0(Long.valueOf(j7)))) {
                                            p82Var4.showDialog(new eo2(p82Var4, j7, null, null));
                                            break;
                                        } else {
                                            p82Var4.presentFragment(new en2(ls6.k(j7, "community_id")));
                                            break;
                                        }
                                    default:
                                        this.b.presentFragment(new xm2(ls6.k(j5, "dialog_id")));
                                        break;
                                }
                            }
                        });
                        mhb mhbVar6 = new mhb(12, p82Var2.resourceProvider, context3);
                        p82Var2.i0 = mhbVar6;
                        mhbVar6.setText(k96.L0(z8 ? 2131751968 : p82Var2.J0 ? 2131751966 : 2131751963));
                        t1Var.addView(p82Var2.g0, nme.o(-1, -2));
                        t1Var.addView(p82Var2.i0, nme.o(-1, -2));
                    }
                } else {
                    p82Var2 = p82Var;
                    context3 = context2;
                }
                chat2 = p82Var2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    p82Var2.d0 = frameLayout2;
                    t1Var.addView(frameLayout2, nme.o(-1, -2));
                    uib uibVar = new uib(context3);
                    p82Var2.e0 = uibVar;
                    zkb.X(uibVar.getTextView(), bkb.o7, null);
                    zkb.Q(p82Var2.e0, bkb.L0(false), null, zkb.M(bkb.h6));
                    if (p82Var2.D0 == null) {
                        p82Var2.e0.b(k96.L0(2131751554), false);
                    } else {
                        boolean z9 = p82Var2.J0;
                        uib uibVar2 = p82Var2.e0;
                        if (z9) {
                            uibVar2.b(k96.L0(2131752410), false);
                        } else {
                            uibVar2.b(k96.L0(2131751560), false);
                        }
                    }
                    p82Var2.d0.addView(p82Var2.e0, nme.c(-2.0f, -1));
                    final byte b36 = 14;
                    p82Var2.e0.setOnClickListener(new View.OnClickListener(p82Var2) { // from class: d82
                        public final /* synthetic */ p82 b;

                        {
                            this.b = p82Var2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b72 = b36;
                            byte b82 = 4;
                            gl5 gl5Var = null;
                            p82 p82Var4 = this.b;
                            switch (b72) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p82Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kf2 kf2Var = new kf2(bundle);
                                    kf2Var.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var);
                                    break;
                                case 1:
                                    m82 m82Var = p82Var4.R0;
                                    long j32 = p82Var4.C0;
                                    if (!p82Var4.s.g()) {
                                        TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                        if (V1 == null) {
                                            TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = K0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                                int i82 = chatPhoto2.dc_id;
                                                if (i82 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i82;
                                                }
                                                TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, p82Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                                int i92 = userProfilePhoto2.dc_id;
                                                if (i92 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i92;
                                                }
                                                PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", p82Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kf2 kf2Var2 = new kf2(bundle2);
                                    kf2Var2.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var2);
                                    break;
                                case 3:
                                    p82Var4.presentFragment(new hu0(p82Var4.w0));
                                    break;
                                case 4:
                                    p82Var4.presentFragment(new eg1(-p82Var4.w0));
                                    break;
                                case 5:
                                    p82Var4.presentFragment(new nf1(p82Var4.x0));
                                    break;
                                case 6:
                                    p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", p82Var4.C0);
                                    p82Var4.presentFragment(new me1(bundle3));
                                    break;
                                case 8:
                                    p82Var4.presentFragment(new bc(p82Var4.C0));
                                    break;
                                case 9:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                                    break;
                                case 12:
                                    p82Var4.m0();
                                    break;
                                case 13:
                                    p82Var4.h0();
                                    break;
                                case 14:
                                    p82 p82Var5 = this.b;
                                    ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (gl.H1(p82Var4)) {
                                        qa6 qa6Var = new qa6(4);
                                        qa6Var.m0 = -p82Var4.w0;
                                        TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                        p82Var4.presentFragment(qa6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = p82Var4.w0;
                                    wgb wgbVar72 = p82Var4.I;
                                    boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                                    f92 f92Var = new f92(null);
                                    f92Var.N = new ArrayList();
                                    f92Var.O = new ArrayList();
                                    f92Var.Q = new ArrayList();
                                    f92Var.d0 = true;
                                    f92Var.g0 = new ArrayList();
                                    f92Var.p0 = new HashMap();
                                    f92Var.r0 = new r82(f92Var, (byte) 5);
                                    f92Var.t0 = false;
                                    f92Var.a0 = j42;
                                    f92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = p82Var4.y0;
                                    f92Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            f92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            f92Var.c0(false);
                                        }
                                    }
                                    p82Var4.presentFragment(f92Var);
                                    break;
                                case 17:
                                    long j52 = p82Var4.w0;
                                    x92 x92Var = new x92(null);
                                    x92Var.w = new ArrayList();
                                    x92Var.P = false;
                                    x92Var.Q = false;
                                    x92Var.F = j52;
                                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j52));
                                    x92Var.f = K02;
                                    x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                                    x92Var.h = p82Var4.y0;
                                    p82Var4.presentFragment(x92Var);
                                    break;
                                case 18:
                                    uf8 uf8Var = new uf8(p82Var4.w0);
                                    uf8Var.s = new j82(p82Var4, b82);
                                    p82Var4.presentFragment(uf8Var);
                                    break;
                                case 19:
                                    p82Var4.e0();
                                    break;
                                case 20:
                                    ca5 ca5Var = new ca5(-p82Var4.x0.id);
                                    ca5Var.c = p82Var4.M0;
                                    ca5Var.m0 = p82Var4;
                                    p82Var4.presentFragment(ca5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", p82Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                                    kf2 kf2Var3 = new kf2(bundle4);
                                    kf2Var3.A0(p82Var4.y0);
                                    p82Var4.presentFragment(kf2Var3);
                                    break;
                                case 22:
                                    yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = p82Var4.y0;
                                    yh6Var.l0(chatFull8, chatFull8.exported_invite);
                                    p82Var4.presentFragment(yh6Var);
                                    break;
                                case 23:
                                    if (!hc2.V(p82Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", p82Var4.w0);
                                        oc2 oc2Var = new oc2(bundle5);
                                        TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                        oc2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (oc2Var.a == null) {
                                                oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                            }
                                            oc2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                oc2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                oc2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                oc2Var.w = (byte) 1;
                                            }
                                        }
                                        p82Var4.presentFragment(oc2Var);
                                        break;
                                    } else {
                                        p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j62 = ls6.j(9, "chatMode");
                                    j62.putLong("chat_id", p82Var4.w0);
                                    j62.putLong("welcome_messages_chat_id", p82Var4.w0);
                                    p82Var4.presentFragment(new mu1(j62));
                                    break;
                            }
                        }
                    });
                    t1Var.addView(new b9a(context3), nme.o(-1, -2));
                }
                UndoView undoView = new UndoView(context3);
                p82Var2.c = undoView;
                ay0Var.addView(undoView, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                rt3 rt3Var6 = p82Var2.w;
                TLRPC.User user4 = p82Var2.D0;
                rt3Var6.setText(vu3.l(user4 == null ? qu2.p(user4) : p82Var2.x0.title, p82Var2.w.getEditText().getPaint().getFontMetricsInt(), true));
                rt3 rt3Var7 = p82Var2.w;
                rt3Var7.setSelection(rt3Var7.n());
                chatFull = p82Var2.y0;
                if (chatFull == null) {
                    p82Var2.F.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = p82Var2.E0;
                    if (userFull4 != null) {
                        p82Var2.F.setText(userFull4.about);
                    }
                }
                p82Var2.o0();
                p82Var2.t0(true, false);
                return p82Var2.fragmentView;
            }
        }
        num2 = num;
        chat = p82Var.x0;
        if (chat == null) {
        }
        p82Var2 = p82Var;
        context3 = context2;
        chat2 = p82Var2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout22 = new FrameLayout(context3);
            p82Var2.d0 = frameLayout22;
            t1Var.addView(frameLayout22, nme.o(-1, -2));
            uib uibVar3 = new uib(context3);
            p82Var2.e0 = uibVar3;
            zkb.X(uibVar3.getTextView(), bkb.o7, null);
            zkb.Q(p82Var2.e0, bkb.L0(false), null, zkb.M(bkb.h6));
            if (p82Var2.D0 == null) {
            }
            p82Var2.d0.addView(p82Var2.e0, nme.c(-2.0f, -1));
            final byte b362 = 14;
            p82Var2.e0.setOnClickListener(new View.OnClickListener(p82Var2) { // from class: d82
                public final /* synthetic */ p82 b;

                {
                    this.b = p82Var2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b362;
                    byte b82 = 4;
                    gl5 gl5Var = null;
                    p82 p82Var4 = this.b;
                    switch (b72) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", p82Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kf2 kf2Var = new kf2(bundle);
                            kf2Var.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var);
                            break;
                        case 1:
                            m82 m82Var = p82Var4.R0;
                            long j32 = p82Var4.C0;
                            if (!p82Var4.s.g()) {
                                TLRPC.User V1 = j32 == 0 ? null : p82Var4.getMessagesController().V1(Long.valueOf(j32));
                                if (V1 == null) {
                                    TLRPC.Chat K0 = p82Var4.getMessagesController().K0(Long.valueOf(p82Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                                        int i82 = chatPhoto2.dc_id;
                                        if (i82 != 0) {
                                            chatPhoto2.photo_big.dc_id = i82;
                                        }
                                        TLRPC.ChatFull chatFull5 = p82Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gl5Var = gl5.j(p82Var4.y0.chat_photo.video_sizes.get(0), p82Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, p82Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = V1.photo;
                                        int i92 = userProfilePhoto2.dc_id;
                                        if (i92 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i92;
                                        }
                                        PhotoViewer.r0().n1(null, V1.photo.photo_big, null, null, null, null, null, 0, m82Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", p82Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kf2 kf2Var2 = new kf2(bundle2);
                            kf2Var2.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var2);
                            break;
                        case 3:
                            p82Var4.presentFragment(new hu0(p82Var4.w0));
                            break;
                        case 4:
                            p82Var4.presentFragment(new eg1(-p82Var4.w0));
                            break;
                        case 5:
                            p82Var4.presentFragment(new nf1(p82Var4.x0));
                            break;
                        case 6:
                            p82Var4.presentFragment(uxa.d0(p82Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", p82Var4.C0);
                            p82Var4.presentFragment(new me1(bundle3));
                            break;
                        case 8:
                            p82Var4.presentFragment(new bc(p82Var4.C0));
                            break;
                        case 9:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-intro");
                            break;
                        case 10:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0) + "-commands");
                            break;
                        case 11:
                            d01.t(view.getContext(), "https://t.me/BotFather?start=" + p82.d0(p82Var4.D0));
                            break;
                        case 12:
                            p82Var4.m0();
                            break;
                        case 13:
                            p82Var4.h0();
                            break;
                        case 14:
                            p82 p82Var5 = this.b;
                            ij.r(p82Var5, false, p82Var5.x0, null, false, true, true, false, new j82(p82Var5, (byte) 7));
                            break;
                        case 15:
                            if (gl.H1(p82Var4)) {
                                qa6 qa6Var = new qa6(4);
                                qa6Var.m0 = -p82Var4.w0;
                                TLRPC.ChatFull chatFull6 = p82Var4.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        qa6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                qa6Var.M0 = new j82(p82Var4, (byte) 6);
                                p82Var4.presentFragment(qa6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = p82Var4.w0;
                            wgb wgbVar72 = p82Var4.I;
                            boolean z62 = wgbVar72 != null && wgbVar72.getVisibility() == 0;
                            f92 f92Var = new f92(null);
                            f92Var.N = new ArrayList();
                            f92Var.O = new ArrayList();
                            f92Var.Q = new ArrayList();
                            f92Var.d0 = true;
                            f92Var.g0 = new ArrayList();
                            f92Var.p0 = new HashMap();
                            f92Var.r0 = new r82(f92Var, (byte) 5);
                            f92Var.t0 = false;
                            f92Var.a0 = j42;
                            f92Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = p82Var4.y0;
                            f92Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    f92Var.m0 = tL_chatInviteExported;
                                } else {
                                    f92Var.c0(false);
                                }
                            }
                            p82Var4.presentFragment(f92Var);
                            break;
                        case 17:
                            long j52 = p82Var4.w0;
                            x92 x92Var = new x92(null);
                            x92Var.w = new ArrayList();
                            x92Var.P = false;
                            x92Var.Q = false;
                            x92Var.F = j52;
                            TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(j52));
                            x92Var.f = K02;
                            x92Var.s = hc2.T(K02) && !x92Var.f.megagroup;
                            x92Var.h = p82Var4.y0;
                            p82Var4.presentFragment(x92Var);
                            break;
                        case 18:
                            uf8 uf8Var = new uf8(p82Var4.w0);
                            uf8Var.s = new j82(p82Var4, b82);
                            p82Var4.presentFragment(uf8Var);
                            break;
                        case 19:
                            p82Var4.e0();
                            break;
                        case 20:
                            ca5 ca5Var = new ca5(-p82Var4.x0.id);
                            ca5Var.c = p82Var4.M0;
                            ca5Var.m0 = p82Var4;
                            p82Var4.presentFragment(ca5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", p82Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(p82Var4.J0 || p82Var4.x0.gigagroup) || hc2.Y(p82Var4.x0)) ? 3 : 0);
                            kf2 kf2Var3 = new kf2(bundle4);
                            kf2Var3.A0(p82Var4.y0);
                            p82Var4.presentFragment(kf2Var3);
                            break;
                        case 22:
                            yh6 yh6Var = new yh6(p82Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = p82Var4.y0;
                            yh6Var.l0(chatFull8, chatFull8.exported_invite);
                            p82Var4.presentFragment(yh6Var);
                            break;
                        case 23:
                            if (!hc2.V(p82Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", p82Var4.w0);
                                oc2 oc2Var = new oc2(bundle5);
                                TLRPC.ChatFull chatFull9 = p82Var4.y0;
                                oc2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (oc2Var.a == null) {
                                        oc2Var.a = oc2Var.getMessagesController().K0(Long.valueOf(oc2Var.c));
                                    }
                                    oc2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        oc2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        oc2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                oc2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        oc2Var.w = (byte) 1;
                                    }
                                }
                                p82Var4.presentFragment(oc2Var);
                                break;
                            } else {
                                p82Var4.presentFragment(new c82(p82Var4.w0, p82Var4.y0));
                                break;
                            }
                        default:
                            Bundle j62 = ls6.j(9, "chatMode");
                            j62.putLong("chat_id", p82Var4.w0);
                            j62.putLong("welcome_messages_chat_id", p82Var4.w0);
                            p82Var4.presentFragment(new mu1(j62));
                            break;
                    }
                }
            });
            t1Var.addView(new b9a(context3), nme.o(-1, -2));
        }
        UndoView undoView2 = new UndoView(context3);
        p82Var2.c = undoView2;
        ay0Var.addView(undoView2, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        rt3 rt3Var62 = p82Var2.w;
        TLRPC.User user42 = p82Var2.D0;
        rt3Var62.setText(vu3.l(user42 == null ? qu2.p(user42) : p82Var2.x0.title, p82Var2.w.getEditText().getPaint().getFontMetricsInt(), true));
        rt3 rt3Var72 = p82Var2.w;
        rt3Var72.setSelection(rt3Var72.n());
        chatFull = p82Var2.y0;
        if (chatFull == null) {
        }
        p82Var2.o0();
        p82Var2.t0(true, false);
        return p82Var2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.x0.participants_count) >= getMessagesController().k4.o1.f()) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z;
        wgb wgbVar;
        EditTextBoldCursor editTextBoldCursor;
        int i3 = kk7.S;
        boolean z2 = true;
        long j = this.C0;
        int i4 = 0;
        if (i == i3) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.w0) {
                if (this.y0 == null && (editTextBoldCursor = this.F) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z3 = this.y0 == null;
                this.y0 = chatFull;
                c0();
                if (j != 0) {
                    this.G0 = false;
                } else {
                    if (!this.F0) {
                        TLRPC.ChatFull chatFull2 = this.y0;
                    }
                    TLRPC.ChatFull chatFull3 = this.y0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z = true;
                        this.G0 = z;
                        wgbVar = this.R;
                        if (wgbVar != null) {
                            wgbVar.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z = false;
                    this.G0 = z;
                    wgbVar = this.R;
                    if (wgbVar != null) {
                    }
                }
                if (hc2.T(this.x0) && !this.y0.hidden_prehistory) {
                    z2 = false;
                }
                this.K0 = z2;
                t0(false, false);
                if (z3) {
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.t5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.w0 == longValue) {
                this.F0 = booleanValue;
                this.H0 = booleanValue2;
                if (objArr.length > 3) {
                    this.I0 = ((Boolean) objArr[3]).booleanValue();
                }
                wgb wgbVar2 = this.R;
                if (wgbVar2 != null) {
                    wgbVar2.setChecked(this.F0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i5 = na7.q5;
            if ((intValue & 2) != 0) {
                o0();
            }
            if ((intValue & 1) != 0) {
                v0();
                return;
            }
            return;
        }
        if (i == kk7.a1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            ui5 ui5Var = this.parentLayout;
            if (ui5Var == null || ui5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i == kk7.Z4) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull L0 = getMessagesController().L0(longValue2);
                this.y0 = L0;
                if (L0 != null) {
                    this.L0 = L0.available_reactions;
                }
                w0(true);
                return;
            }
            return;
        }
        if (i != kk7.D3) {
            if (i == kk7.D0) {
                if (((Long) objArr[0]).longValue() == j) {
                    q0(getMessagesController().W1(j));
                    return;
                }
                return;
            } else {
                if (i == kk7.N3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i == kk7.x1 && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    ui5 ui5Var2 = this.parentLayout;
                    if (ui5Var2 == null || ui5Var2.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == j) {
            if (this.n0 != null) {
                ct0 g = ct0.g(this.currentAccount);
                this.n0.setVisibility(g.a(j) ? 0 : 8);
                this.n0.w(jva.a1(false, TextUtils.concat("XTR", jva.G0(g.c(j), 0.8f, ' ')), 0.85f, null), true);
                wgb wgbVar3 = this.l0;
                if (wgbVar3 != null) {
                    wgbVar3.setNeedDivider(g.a(j) || g.b(j));
                }
                this.T.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                ct0 g2 = ct0.g(this.currentAccount);
                this.m0.setVisibility(g2.b(j) ? 0 : 8);
                long i6 = g2.i(j);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i6 > 0) {
                    double d = i6 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) gl.o0((int) d, 0));
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        decimalFormat.setMinimumFractionDigits(2);
                        decimalFormat.setMaximumFractionDigits(3);
                        decimalFormat.setGroupingUsed(false);
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                    }
                }
                this.m0.w(spannableStringBuilder, true);
                wgb wgbVar4 = this.l0;
                if (wgbVar4 != null) {
                    if (!g2.a(j) && !g2.b(j)) {
                        z2 = false;
                    }
                    wgbVar4.setNeedDivider(z2);
                }
                LinearLayout linearLayout = this.T;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i4 = 8;
                }
                linearLayout.setVisibility(i4);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    public final void e0() {
        nh1 nh1Var = new nh1(-this.x0.id);
        nh1Var.m0 = this;
        presentFragment(nh1Var);
        na7.q1(this.currentAccount).X3.edit().putInt("boostingappearance", na7.q1(this.currentAccount).X3.getInt("boostingappearance", 0) + 1).apply();
    }

    public final void f0(hd hdVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, ng1 ng1Var) {
        hdVar.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        h26 h26Var = new h26(35, this.currentAccount, getResourceProvider(), getParentActivity(), this);
        h26Var.r1(ng1Var);
        h26Var.q1(tL_premium_boostsStatus, true);
        h26Var.s1(j);
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
        if (K0 != null) {
            h26Var.L2 = new kx1(this, K0, (byte) 26);
        }
        showDialog(h26Var);
    }

    public final void g0(FrameLayout frameLayout, View view) {
        if (!this.G0) {
            TLRPC.ChatFull chatFull = this.y0;
            u21.b0(this).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? gl.S2(k96.G(getMessagesController().k4.o1.f(), "ChannelTopicsForbidden", new Object[0])) : gl.S2(k96.M0(2131752268, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j = -this.w0;
        m24 m24Var = new m24(null);
        m24Var.a = j;
        m24Var.setResourceProvider(this.resourceProvider);
        boolean z = this.F0;
        boolean z2 = this.H0;
        boolean z3 = this.I0;
        qo0 qo0Var = new qo0(this, view, (byte) 1);
        m24Var.c = z;
        m24Var.d = z2;
        m24Var.e = z3;
        m24Var.h = qo0Var;
        presentFragment(m24Var);
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final tu9 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        n82 n82Var = this.c0;
        int i = bkb.h6;
        arrayList.add(new blb(n82Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.c0, 4, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.t6));
        arrayList.add(new blb(this.c0, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.u6));
        arrayList.add(new blb(this.U, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        wgb wgbVar = this.V;
        if (wgbVar != null) {
            arrayList.add(new blb(wgbVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        arrayList.add(new blb(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.Z, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.J, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        LinearLayout linearLayout = this.E;
        int i2 = bkb.c6;
        arrayList.add(new blb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.e0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.e0, 4, new Class[]{uib.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.P, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        wgb wgbVar2 = this.L;
        if (wgbVar2 != null) {
            arrayList.add(new blb(wgbVar2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        wgb wgbVar3 = this.b0;
        if (wgbVar3 != null) {
            arrayList.add(new blb(wgbVar3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        return arrayList;
    }

    public final void h0() {
        int i = this.currentAccount;
        TL_bots.BotVerifierSettings botVerifierSettings = this.E0.bot_info.verifier_settings;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        Bundle j = tb4.j(16, "onlySelect", "dialogsType", true);
        j.putBoolean("resetDelegate", false);
        cj3 cj3Var = new cj3(j);
        cj3Var.setCurrentAccount(i);
        cj3Var.E2 = new bf(cj3Var, i, this.C0, botVerifierSettings);
        S.presentFragment(cj3Var);
    }

    public final void i0(long j, long j2) {
        na7.q1(this.currentAccount).T2(j, j2, true, false, new w72(this, (byte) 1));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final /* synthetic */ void j0() {
        this.P0 = true;
        kk7 f = kk7.f(this.currentAccount);
        int i = na7.q5;
        f.k(2, 2);
    }

    public final /* synthetic */ void k0() {
        this.v0 = null;
        long j = this.C0;
        if (j == 0) {
            na7.q1(this.currentAccount).x(this.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().m1(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new i82(this, (byte) 2));
        }
        r0(false, true);
        kb0 kb0Var = this.e;
        Object obj = this.D0;
        if (obj == null) {
            obj = this.x0;
        }
        kb0Var.m(null, null, this.r, obj);
        this.S0.H(0);
        this.c0.e.d();
    }

    public final void l0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().h1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new i82(this, (byte) 0));
    }

    public final void m0() {
        this.s.n(this.v0 != null, new k82(this, (byte) 0), new n1(this, (byte) 17), 0);
        this.S0.H(0);
        this.S0.K(43);
        this.c0.e.d();
    }

    public final void n0() {
        rt3 rt3Var;
        String str;
        String str2;
        if (this.O0 || (rt3Var = this.w) == null) {
            return;
        }
        if (rt3Var.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            gl.z3(this.w);
            return;
        }
        this.O0 = true;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().o1(this.D0);
            byte b = 4;
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.D0.first_name.equals(this.w.getText().toString())) {
                setbotinfo.name = this.w.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.F.getText().toString();
                setbotinfo.flags |= 1;
            }
            this.b = new hd(3, null, getParentActivity());
            this.b.setOnCancelListener(new xs0(this, getConnectionsManager().sendRequest(setbotinfo, new pl(this, setbotinfo, (byte) 20)), b));
            this.b.show();
            return;
        }
        byte b2 = 5;
        if (!hc2.T(this.x0) && (!this.K0 || this.F0)) {
            getMessagesController().P(getParentActivity(), this.w0, this, new j82(this, b2), null);
            return;
        }
        if (this.y0 != null && hc2.T(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z = chatFull.hidden_prehistory;
            boolean z2 = this.K0;
            if (z != z2) {
                chatFull.hidden_prehistory = z2;
                getMessagesController().h5(this.w0, this.K0);
            }
        }
        if (this.s.g()) {
            this.N0 = true;
            hd hdVar = new hd(3, null, getParentActivity());
            this.b = hdVar;
            hdVar.setOnCancelListener(new ur0(this, b2));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.w.getText().toString())) {
            getMessagesController().y(this.w0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            na7 messagesController = getMessagesController();
            long j = this.w0;
            String obj = this.F.getText().toString();
            TLRPC.ChatFull chatFull3 = this.y0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.h1(-j);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new k45(messagesController, chatFull3, obj, (byte) 21), 64);
        }
        boolean z3 = this.F0;
        TLRPC.Chat chat = this.x0;
        boolean z4 = chat.forum;
        if (z3 != z4 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
            boolean z5 = this.H0 != chat.forum_tabs;
            boolean z6 = this.I0 != chat.forum_sidebar;
            boolean z7 = z3 != z4;
            getMessagesController().g5(this.w0, this.F0, this.H0, this.I0);
            if (this.F0 && !this.H0 && (z7 || z5)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof mu1) && ((mu1) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).a0(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ui5 parentLayout = getParentLayout();
                        HashSet hashSet = qvb.s1;
                        ((ActionBarLayout) parentLayout).b(i, qvb.E0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z5 || z6) {
                u0(z5);
            }
        }
        finishFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        TLRPC.FileLocation fileLocation;
        boolean z;
        gl5 m;
        if (this.e == null || this.P0) {
            return;
        }
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.w0));
        TLRPC.User V1 = this.C0 == 0 ? null : getMessagesController().V1(Long.valueOf(this.C0));
        if (K0 == null && V1 == null) {
            return;
        }
        this.D0 = V1;
        this.x0 = K0;
        if (V1 != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
            if (userProfilePhoto != null) {
                fileLocation = userProfilePhoto.photo_small;
                this.v0 = fileLocation;
                m = gl5.m(this.currentAccount, 1, V1);
                this.e.f(V1, this.r);
                if (m != null) {
                    z = true;
                }
                z = false;
            }
            this.e.setImageDrawable(this.r);
            z = false;
        } else {
            TLRPC.ChatPhoto chatPhoto = K0.photo;
            if (chatPhoto != null) {
                TLRPC.FileLocation fileLocation2 = chatPhoto.photo_small;
                V1 = K0;
                fileLocation = fileLocation2;
                this.v0 = fileLocation;
                m = gl5.m(this.currentAccount, 1, V1);
                this.e.f(V1, this.r);
                if (m != null) {
                }
                z = false;
            }
            this.e.setImageDrawable(this.r);
            z = false;
        }
        if (this.c0 != null) {
            if (z || this.s.g()) {
                this.c0.o(R.drawable.msg_addphoto, k96.M0(2131752201, "ChatSetNewPhoto"), true);
            } else {
                this.c0.o(R.drawable.msg_addphoto, k96.M0(2131752200, "ChatSetPhotoOrVideo"), true);
            }
            if (this.S0 == null) {
                this.S0 = new oy8(R.raw.camera_outline, gl.L(50.0f), gl.L(50.0f), false, null);
            }
            this.c0.e.setTranslationX(-gl.L(8.0f));
            this.c0.e.setAnimation(this.S0);
        }
        if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer.r0().t();
        }
        if (this.a0 != null && getMessagesController().k4.C2.f && hc2.V(this.x0)) {
            this.a0.setVisibility(0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.s.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.w;
        if (rt3Var == null || !rt3Var.e) {
            return b0(z);
        }
        if (!z) {
            return false;
        }
        rt3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0127, code lost:
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().k4.o1.f()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        if (r1.linked_chat_id != 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j = this.w0;
        long j2 = this.C0;
        boolean z = true;
        if (j == 0) {
            TLRPC.User V1 = j2 == 0 ? null : getMessagesController().V1(Long.valueOf(j2));
            this.D0 = V1;
            if (V1 == null) {
                TLRPC.User h0 = ad7.Y(this.currentAccount).h0(j2);
                this.D0 = h0;
                if (h0 != null) {
                    getMessagesController().a4(this.D0, true, false);
                    if (this.E0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j2));
                        ArrayList I0 = ad7.Y(this.currentAccount).I0(hashSet);
                        if (!I0.isEmpty()) {
                            this.E0 = (TLRPC.UserFull) I0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            pb0 pb0Var = this.r;
            if (chat == null) {
            }
            wl5 wl5Var = this.s;
            wl5Var.a = this;
            wl5Var.b = this;
            getNotificationCenter().b(this, 2);
            getNotificationCenter().b(this, kk7.x1);
            getNotificationCenter().b(this, kk7.a1);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.w0));
        this.x0 = K0;
        if (K0 == null) {
            TLRPC.Chat O = ad7.Y(this.currentAccount).O(this.w0);
            this.x0 = O;
            if (O != null) {
                getMessagesController().T3(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull C0 = ad7.Y(this.currentAccount).C0(this.w0, hc2.T(this.x0), new CountDownLatch(1), false, false, 0);
                    this.y0 = C0;
                }
            }
            return false;
        }
        chat = this.x0;
        pb0 pb0Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            pb0Var2.j(5L, this.x0.title, null, null);
            this.J0 = hc2.T(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat2 = this.x0;
            boolean z2 = chat2.forum;
            this.F0 = z2;
            this.H0 = chat2.forum_tabs;
            this.I0 = chat2.forum_sidebar;
            if (j2 == 0) {
                if (!z2) {
                    TLRPC.ChatFull chatFull = this.y0;
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null) {
                }
                this.G0 = z;
                getNotificationCenter().b(this, kk7.S);
                getNotificationCenter().b(this, kk7.t5);
                getNotificationCenter().b(this, kk7.Z4);
                getNotificationCenter().b(this, kk7.N3);
            }
            z = false;
            this.G0 = z;
            getNotificationCenter().b(this, kk7.S);
            getNotificationCenter().b(this, kk7.t5);
            getNotificationCenter().b(this, kk7.Z4);
            getNotificationCenter().b(this, kk7.N3);
        } else {
            pb0Var2.j(5L, this.D0.first_name, null, null);
            this.J0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
            this.G0 = false;
            getNotificationCenter().b(this, kk7.D0);
            if (this.D0.bot) {
                getNotificationCenter().b(this, kk7.D3);
            }
        }
        wl5 wl5Var2 = this.s;
        wl5Var2.a = this;
        wl5Var2.b = this;
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, kk7.x1);
        getNotificationCenter().b(this, kk7.a1);
        if (this.y0 != null) {
            l0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wl5 wl5Var = this.s;
        if (wl5Var != null) {
            wl5Var.c();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, kk7.S);
            getNotificationCenter().n(this, kk7.t5);
            getNotificationCenter().n(this, kk7.Z4);
            getNotificationCenter().n(this, kk7.N3);
        } else {
            getNotificationCenter().n(this, kk7.D0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, kk7.D3);
            }
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.x1);
        getNotificationCenter().n(this, kk7.a1);
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vl) obj).n(null);
        }
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.s.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.s();
            this.w.getEditText().requestFocus();
        }
        s0();
        gl.V2(getParentActivity(), this.classGuid);
        t0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                zkb.l(editTextBoldCursor, 30, bkb.F6, null);
            }
            kb0 kb0Var = this.e;
            if (kb0Var != null) {
                kb0Var.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(TLRPC.ChatFull chatFull) {
        vl m;
        this.y0 = chatFull;
        if (chatFull != null) {
            TLRPC.Chat chat = this.x0;
            if (chat == null) {
                chat = getMessagesController().K0(Long.valueOf(this.w0));
                this.x0 = chat;
            }
            this.K0 = !hc2.T(chat) || this.y0.hidden_prehistory;
            this.L0 = this.y0.available_reactions;
            this.Q0.clear();
            ArrayList arrayList = this.Q0;
            TLRPC.Chat chat2 = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && hc2.V(chat2)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i);
                        i++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m = vl.l(y6c.t0, vl.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? vl.m(y6c.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, vl.f()) : null;
                        }
                        if (m != null) {
                            arrayList2.add(m);
                            m.a(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = hq6.d0(y6c.t0).n;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            vl l = vl.l(y6c.t0, vl.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l);
                            l.a(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().k4.C2.f && hc2.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        c0();
    }

    public final void q0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j = this.C0;
                this.D0 = j == 0 ? null : getMessagesController().V1(Long.valueOf(j));
            }
            wgb wgbVar = this.o0;
            if (wgbVar != null) {
                wgbVar.h(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.w(userFull2.starref_program == null ? k96.M0(2131754342, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            wgb wgbVar2 = this.u0;
            if (wgbVar2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                wgbVar2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            mhb mhbVar = this.t0;
            if (mhbVar != null) {
                TLRPC.UserFull userFull4 = this.E0;
                mhbVar.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void r0(boolean z, boolean z2) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z2) {
            RadialProgressView radialProgressView = this.n;
            if (z) {
                radialProgressView.setAlpha(1.0f);
                this.n.setVisibility(0);
                this.f.setAlpha(1.0f);
                this.f.setVisibility(0);
                return;
            }
            radialProgressView.setAlpha(0.0f);
            this.n.setVisibility(4);
            this.f.setAlpha(0.0f);
            this.f.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.h = animatorSet2;
        RadialProgressView radialProgressView2 = this.n;
        if (z) {
            radialProgressView2.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView3 = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<s71, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<s71, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new y7((byte) 16, (Object) this, z));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.s;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
    }

    public final void s0() {
        wgb wgbVar;
        wgb wgbVar2;
        u08 u08Var;
        int v0;
        ArrayList<Integer> arrayList;
        d08 d08Var = this.M;
        if (d08Var != null) {
            TLRPC.Chat chat = this.x0;
            wgb wgbVar3 = this.O;
            boolean z = (wgbVar3 != null && wgbVar3.getVisibility() == 0) || ((wgbVar = this.R) != null && wgbVar.getVisibility() == 0) || ((hc2.n0(this.x0) && hc2.N(this.x0)) || ((wgbVar2 = this.N) != null && wgbVar2.getVisibility() == 0));
            Paint paint = d08Var.n;
            int i = d08Var.a;
            wjb wjbVar = d08Var.d;
            if (chat != null) {
                d08Var.w = z;
                d08Var.r = new tgb(vu3.m(chat.title, bkb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gl.o());
                u08 u08Var2 = d08Var.x;
                if (u08Var2 != null) {
                    u08Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i2 = u08.j;
                    int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
                    u08Var = new u08(i3, i3, i3, tL_emojiStatusCollectible.document_id);
                    d08Var.x = u08Var;
                } else {
                    if (hc2.I(chat) >= 0) {
                        u08 c = u08.c(i, hc2.I(chat));
                        c.a = gl.L(11.0f);
                        c.d();
                        u08Var = c;
                    } else {
                        u08Var = null;
                    }
                    d08Var.x = u08Var;
                }
                if (u08Var != null) {
                    u08Var.e(d08Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
                    int i4 = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                    if (!a || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                    int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                    d08Var.r.m(i4);
                    paint.setColor(bkb.p1(0.1f, i4));
                    u08 u08Var3 = new u08(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                    u08Var3.a = gl.L(11.0f);
                    u08Var3.d();
                    d08Var.y = u08Var3;
                    u08Var3.e(d08Var);
                    return;
                }
                int F = hc2.F(chat);
                if (F < 7) {
                    int i5 = bkb.q8[F];
                    d08Var.s = i5;
                    v0 = bkb.v0(i5, wjbVar);
                } else {
                    ea7 ea7Var = na7.q1(y6c.t0).E3;
                    da7 d = ea7Var != null ? ea7Var.d(F) : null;
                    if (d != null) {
                        d08Var.s = -1;
                        v0 = d.f();
                    } else {
                        int i6 = bkb.q8[0];
                        d08Var.s = i6;
                        v0 = bkb.v0(i6, wjbVar);
                    }
                }
                d08Var.r.m(v0);
                paint.setColor(bkb.p1(0.1f, v0));
                u08 a2 = u08.a(i, F);
                a2.a = gl.L(11.0f);
                a2.d();
                d08Var.y = a2;
                a2.e(d08Var);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.s;
        if (wl5Var != null && (str = wl5Var.f) != null) {
            bundle.putString("path", str);
        }
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            String obj = rt3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        TLRPC.ChatFull chatFull;
        String str2;
        int i6;
        String M0;
        wgb wgbVar;
        wgb wgbVar2;
        wgb wgbVar3;
        wgb wgbVar4;
        String str3;
        int i7;
        wgb wgbVar5;
        wgb wgbVar6;
        wgb wgbVar7;
        wgb wgbVar8;
        wgb wgbVar9;
        TLRPC.Chat K0;
        if (z && (K0 = getMessagesController().K0(Long.valueOf(this.w0))) != null) {
            this.x0 = K0;
        }
        boolean t0 = hc2.t0(this.x0);
        mhb mhbVar = this.Q;
        byte b = 8;
        if (mhbVar != null) {
            mhbVar.setVisibility((this.J != null || ((wgbVar7 = this.K) != null && wgbVar7.getVisibility() == 0) || (((wgbVar8 = this.O) != null && wgbVar8.getVisibility() == 0) || ((wgbVar9 = this.I) != null && wgbVar9.getVisibility() == 0))) ? 0 : 8);
        }
        wgb wgbVar10 = this.Z;
        if (wgbVar10 != null) {
            wgbVar10.setVisibility(hc2.T(this.x0) ? 0 : 8);
        }
        wgb wgbVar11 = this.K;
        if (wgbVar11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.J0 && chatFull2.linked_chat_id == 0)) {
                wgbVar11.setVisibility(8);
            } else {
                wgbVar11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(k96.M0(2131751377, "Discussion"), k96.M0(2131751369, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(this.y0.linked_chat_id));
                    if (K02 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = hc2.K(K02, false);
                        boolean isEmpty = TextUtils.isEmpty(K);
                        wgb wgbVar12 = this.K;
                        if (isEmpty) {
                            wgbVar12.u(k96.M0(2131751377, "Discussion"), K02.title, false, R.drawable.msg_discuss, true);
                        } else {
                            wgbVar12.u(k96.M0(2131751377, "Discussion"), b00.h("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = hc2.K(K02, false);
                        boolean isEmpty2 = TextUtils.isEmpty(K2);
                        wgb wgbVar13 = this.K;
                        if (isEmpty2) {
                            String M02 = k96.M0(2131748691, "LinkedChannel");
                            String str4 = K02.title;
                            wgb wgbVar14 = this.R;
                            wgbVar13.u(M02, str4, false, R.drawable.msg_channel, wgbVar14 != null && wgbVar14.getVisibility() == 0);
                        } else {
                            String M03 = k96.M0(2131748691, "LinkedChannel");
                            String h = b00.h("@", K2);
                            wgb wgbVar15 = this.R;
                            wgbVar13.u(M03, h, false, R.drawable.msg_channel, wgbVar15 != null && wgbVar15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        wgb wgbVar16 = this.I;
        if (wgbVar16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                wgbVar16.setVisibility(8);
            } else {
                wgbVar16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                boolean z4 = channelLocation instanceof TLRPC.TL_channelLocation;
                wgb wgbVar17 = this.I;
                if (z4) {
                    wgbVar17.q(k96.M0(2131753958, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    wgbVar17.q(k96.M0(2131753958, "AttachLocation"), "Unknown address", z2, true);
                }
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z5 = this.x0.noforwards;
                if (this.J0) {
                    if (t0) {
                        str3 = "TypePublic";
                        i7 = 2131743681;
                    } else if (z5) {
                        str3 = "TypePrivateRestrictedForwards";
                        i7 = 2131743682;
                    } else {
                        str3 = "TypePrivate";
                        i7 = 2131743685;
                    }
                    M0 = k96.M0(i7, str3);
                } else {
                    if (t0) {
                        str2 = "TypePublicGroup";
                        i6 = 2131743680;
                    } else if (z5) {
                        str2 = "TypePrivateGroupRestrictedForwards";
                        i6 = 2131743683;
                    } else {
                        str2 = "TypePrivateGroup";
                        i6 = 2131743684;
                    }
                    M0 = k96.M0(i6, str2);
                }
                String str5 = M0;
                boolean z6 = this.J0;
                wgb wgbVar18 = this.J;
                if (z6) {
                    String M04 = k96.M0(2131752264, "ChannelType");
                    wgb wgbVar19 = this.O;
                    wgbVar18.u(M04, str5, false, R.drawable.msg_channel, (wgbVar19 != null && wgbVar19.getVisibility() == 0) || ((wgbVar3 = this.K) != null && wgbVar3.getVisibility() == 0) || ((wgbVar4 = this.R) != null && wgbVar4.getVisibility() == 0));
                } else {
                    String M05 = k96.M0(2131749200, "GroupType");
                    wgb wgbVar20 = this.O;
                    wgbVar18.u(M05, str5, false, R.drawable.msg_groups, (wgbVar20 != null && wgbVar20.getVisibility() == 0) || ((wgbVar = this.K) != null && wgbVar.getVisibility() == 0) || ((wgbVar2 = this.R) != null && wgbVar2.getVisibility() == 0));
                }
            } else {
                String M06 = !t0 ? k96.M0(2131743690, "TypeLocationGroupEdit") : String.format(b00.j(new StringBuilder("https://"), getMessagesController().N2, "/%s"), hc2.K(this.x0, false));
                wgb wgbVar21 = this.J;
                String M07 = k96.M0(2131743691, "TypeLocationGroup");
                wgb wgbVar22 = this.O;
                wgbVar21.u(M07, M06, false, R.drawable.msg_channel, (wgbVar22 != null && wgbVar22.getVisibility() == 0) || ((wgbVar5 = this.K) != null && wgbVar5.getVisibility() == 0) || ((wgbVar6 = this.R) != null && wgbVar6.getVisibility() == 0));
            }
        }
        byte b2 = 2;
        if (this.O != null) {
            if (!this.K0 || this.F0) {
                str = "ChatHistoryVisible";
                i5 = 2131752216;
            } else {
                str = "ChatHistoryHidden";
                i5 = 2131752220;
            }
            this.O.u(k96.M0(2131752217, "ChatHistoryShort"), k96.M0(i5, str), z2, R.drawable.msg_discuss, this.R != null);
            this.O.setEnabled(!this.F0);
            boolean z7 = (this.F0 || t0 || ((chatFull = this.y0) != null && (chatFull.linked_chat_id != 0 || (chatFull.location instanceof TLRPC.TL_channelLocation)))) ? false : true;
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.O.getAlpha() <= 0.0f && !z7) {
                this.O.setVisibility(8);
                s0();
            } else if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z7) {
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                boolean z8 = false;
                while (i8 < this.G.getChildCount()) {
                    LinearLayout linearLayout = this.G;
                    if (z8) {
                        arrayList.add(linearLayout.getChildAt(i8));
                    } else if (linearLayout.getChildAt(i8) == this.O) {
                        z8 = true;
                    }
                    i8++;
                    z8 = z8;
                }
                int i9 = 0;
                boolean z9 = false;
                while (i9 < this.x.getChildCount()) {
                    t1 t1Var = this.x;
                    if (z9) {
                        arrayList.add(t1Var.getChildAt(i9));
                    } else if (t1Var.getChildAt(i9) == this.G) {
                        z9 = true;
                    }
                    i9++;
                    z9 = z9;
                }
                if (this.O.getVisibility() != 0) {
                    this.O.setAlpha(0.0f);
                    this.O.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.O.setVisibility(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                }
                wgb wgbVar23 = this.O;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(wgbVar23.getAlpha(), z7 ? 1.0f : 0.0f);
                    this.T0 = ofFloat;
                    ofFloat.addUpdateListener(new pk(this, arrayList, b));
                    this.T0.addListener(new qw(this, z7, arrayList, b2));
                    this.T0.setDuration(320L);
                    this.T0.setInterpolator(s33.h);
                    this.T0.start();
                } else {
                    wgbVar23.setAlpha(z7 ? 1.0f : 0.0f);
                    this.O.setTranslationY(((-r5.getHeight()) / 2.0f) * (z7 ? 0.0f : 1.0f));
                    this.O.setScaleY(((z7 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.O.setVisibility(z7 ? 0 : 8);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((View) arrayList.get(i11)).setTranslationY(0.0f);
                    }
                    this.T0 = null;
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                wgb wgbVar24 = this.V;
                if (wgbVar24 != null) {
                    if (wgbVar24.getParent() == null) {
                        i = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, nme.o(-1, -2));
                    } else {
                        i = 0;
                    }
                    this.V.setVisibility(this.y0.requests_pending > 0 ? i : 8);
                } else {
                    i = 0;
                }
                if (!this.J0 || hc2.Y(this.x0)) {
                    boolean T = hc2.T(this.x0);
                    wgb wgbVar25 = this.U;
                    if (T) {
                        CharSequence M08 = k96.M0(2131752365, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i] = Integer.valueOf(this.y0.participants_count);
                        wgbVar25.u(M08, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        CharSequence M09 = k96.M0(2131752365, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i] = Integer.valueOf(this.y0.participants.participants.size());
                        wgbVar25.u(M09, String.format("%d", objArr2), false, R.drawable.msg_groups, this.V.getVisibility() == 0 ? 1 : i);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (!chat.gigagroup || hc2.Y(chat)) {
                        int i12 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i13 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i13++;
                            }
                            i2 = kf2.n0(tL_chatBannedRights) + i13;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i2++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i2++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
                                i2++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i2++;
                            }
                            i3 = i12;
                        } else {
                            i2 = i12;
                            i3 = i2;
                        }
                        wgb wgbVar26 = this.Y;
                        String M010 = k96.M0(2131752321, null);
                        Integer valueOf = Integer.valueOf(i2);
                        Integer valueOf2 = Integer.valueOf(i3);
                        Object[] objArr3 = new Object[2];
                        objArr3[i] = valueOf;
                        objArr3[1] = valueOf2;
                        wgbVar26.u(M010, String.format("%d/%d", objArr3), z2, R.drawable.msg_permissions, true);
                        z3 = z2;
                    } else {
                        wgb wgbVar27 = this.Y;
                        CharSequence M011 = k96.M0(2131752441, null);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        wgb wgbVar28 = this.Z;
                        wgbVar27.u(M011, format, false, R.drawable.msg_user_remove, (wgbVar28 == null || wgbVar28.getVisibility() != 0) ? i : 1);
                        z3 = z2;
                    }
                    wgb wgbVar29 = this.V;
                    if (wgbVar29 != null) {
                        CharSequence M012 = k96.M0(2131748443, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        wgb wgbVar30 = this.Z;
                        wgbVar29.u(M012, format2, false, R.drawable.msg_requests, (wgbVar30 == null || wgbVar30.getVisibility() != 0) ? i : 1);
                    }
                } else {
                    wgb wgbVar31 = this.U;
                    String M013 = k96.M0(2131752277, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i] = Integer.valueOf(this.y0.participants_count);
                    wgbVar31.u(M013, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    wgb wgbVar32 = this.Y;
                    CharSequence M014 = k96.M0(2131752441, null);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    wgb wgbVar33 = this.Z;
                    wgbVar32.u(M014, format3, false, R.drawable.msg_user_remove, (wgbVar33 == null || wgbVar33.getVisibility() != 0) ? i : 1);
                    z3 = z2;
                }
                wgb wgbVar34 = this.X;
                String M015 = k96.M0(2131752505, "ChannelAdministrators");
                boolean T2 = hc2.T(this.x0);
                TLRPC.ChatFull chatFull7 = this.y0;
                if (T2) {
                    i4 = chatFull7.admins_count;
                } else if (chatFull7 == null) {
                    i4 = 1;
                } else {
                    int size = chatFull7.participants.participants.size();
                    int i14 = i;
                    int i15 = i14;
                    while (i14 < size) {
                        TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i14);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            i15++;
                        }
                        i14++;
                    }
                    i4 = i15;
                }
                Object[] objArr8 = new Object[1];
                objArr8[i] = Integer.valueOf(i4);
                wgbVar34.u(M015, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z3 = z2;
                i = 0;
                if (!this.J0 || hc2.Y(this.x0)) {
                    wgb wgbVar35 = this.U;
                    String M016 = k96.M0(2131752365, "ChannelMembers");
                    wgb wgbVar36 = this.Z;
                    wgbVar35.o(R.drawable.msg_groups, M016, wgbVar36 != null && wgbVar36.getVisibility() == 0);
                    boolean z10 = this.x0.gigagroup;
                    wgb wgbVar37 = this.Y;
                    if (z10) {
                        String M017 = k96.M0(2131752441, null);
                        wgb wgbVar38 = this.Z;
                        wgbVar37.o(R.drawable.msg_chats_remove, M017, wgbVar38 != null && wgbVar38.getVisibility() == 0);
                    } else {
                        wgbVar37.o(R.drawable.msg_permissions, k96.M0(2131752321, null), true);
                    }
                } else {
                    this.U.o(R.drawable.msg_groups, k96.M0(2131752277, "ChannelSubscribers"), true);
                    wgb wgbVar39 = this.Y;
                    String M018 = k96.M0(2131752441, null);
                    wgb wgbVar40 = this.Z;
                    wgbVar39.o(R.drawable.msg_chats_remove, M018, wgbVar40 != null && wgbVar40.getVisibility() == 0);
                }
                this.X.o(R.drawable.msg_admins, k96.M0(2131752505, "ChannelAdministrators"), true);
            }
            this.P.setVisibility(hc2.w(1, this.x0) ? i : 8);
            w0(z3);
            if (this.y0 == null || !hc2.y(3, this.x0) || (t0 && this.x0.creator)) {
                this.W.setVisibility(8);
            } else {
                int i16 = this.y0.invitesCount;
                wgb wgbVar41 = this.W;
                if (i16 > 0) {
                    wgbVar41.u(k96.M0(2131748948, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    wgbVar41.u(k96.M0(2131748948, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
                }
            }
        }
        if (this.L != null) {
            x0(null);
        }
    }

    public final void u0(boolean z) {
        cj3 cj3Var;
        rh3 rh3Var;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i = 0;
            while (i < fragmentStack.size()) {
                if (fragmentStack.get(i) instanceof mu1) {
                    mu1 mu1Var = (mu1) fragmentStack.get(i);
                    if (mu1Var.getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(mu1Var, false);
                        mu1Var.clearViews();
                        if (((ActionBarLayout) getParentLayout()).b(i, mu1Var)) {
                            kk7.e().j(mu1Var.da);
                        }
                        if (z && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.w0);
                            ((ActionBarLayout) getParentLayout()).b(i, new qvb(bundle));
                            i++;
                        }
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof qvb)) {
                    qvb qvbVar = (qvb) fragmentStack.get(i);
                    if (qvbVar.f() != null && qvbVar.f().id == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(qvbVar, false);
                        i--;
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof cj3) && (cj3Var = (cj3) fragmentStack.get(i)) != null && (rh3Var = cj3Var.H3) != null && rh3Var.c()) {
                    cj3Var.H3.a();
                }
                i++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.u(k96.M0(2131752993, null), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i2);
            i2++;
            if (tL_username.active) {
                i++;
            }
        }
        this.l0.u(k96.M0(2131752992, null), k96.a0(null, null, 2131752991, Integer.valueOf(i), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    public final void w0(boolean z) {
        String str;
        String str2;
        int i;
        TLRPC.ChatFull L0 = getMessagesController().L0(this.w0);
        boolean V = hc2.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String M0 = k96.M0(2131746186, null);
            if (L0 == null || !L0.paid_reactions_available) {
                str = M0;
                this.P.u(k96.M0(2131746194, null), str, z, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i2 = 0;
            for (0; i < tL_chatReactionsSome.reactions.size(); i + 1) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i2++;
                    }
                } else {
                    i = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i + 1;
                    i2++;
                }
            }
            if (V) {
                if (L0 != null && L0.paid_reactions_available) {
                    i2++;
                }
                str2 = i2 == 0 ? k96.M0(2131746186, null) : String.valueOf(i2);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i2);
                str2 = min == 0 ? k96.M0(2131746186, null) : k96.a0(null, null, 2131746191, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = k96.M0(2131746193, null);
        }
        str = str2;
        this.P.u(k96.M0(2131746194, null), str, z, R.drawable.msg_reactions2, true);
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    public final void x0(Long l) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.L == null) {
            return;
        }
        long j = 0;
        if (!(l != null ? l.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.L.u(k96.M0(2131746903, null), k96.M0(2131746893, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.x0.linked_monoforum_id));
        if (l != null) {
            j = l.longValue();
        } else if (K0 != null) {
            j = K0.send_paid_messages_stars;
        }
        this.L.u(k96.M0(2131746903, null), jva.a1(false, k96.a0(null, null, 2131746877, Long.valueOf(j)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // vl5
    public final void T() {
    }
}
