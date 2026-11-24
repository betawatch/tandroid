// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wt1 implements bb2 {
    public final /* synthetic */ mu1 a;

    public wt1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // bb2
    public final void A(gb2 gb2Var, float f, float f2) {
        mu1 mu1Var = this.a;
        mu1Var.R5(gb2Var, false, false, f, f2, true, false, false);
        mu1Var.A0.getClass();
        mu1Var.tc(RecyclerView.R(gb2Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0667, code lost:
    
        if (r0.exists() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x072a, code lost:
    
        if (r2.startsWith("text/x-web-markdown") == false) goto L203;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0772 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(gb2 gb2Var, float f, float f2, boolean z) {
        int i;
        k27 k27Var;
        boolean z2;
        k27 k27Var2;
        long j;
        long j2;
        long j3;
        File file;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i2;
        k27 messageObject = gb2Var.getMessageObject();
        int i3 = messageObject.D;
        TLRPC.Message message2 = messageObject.k;
        int i4 = 2;
        if (i3 == 23) {
            TLRPC.MessageMedia messageMedia2 = message2.media;
            TL_stories.StoryItem storyItem = messageMedia2.storyItem;
            if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                return;
            }
            storyItem.dialogId = cf3.n(messageMedia2.peer);
            storyItem.messageId = messageObject.e1();
            storyItem.messageType = 2;
            x2b.b(storyItem, this.a.f);
            this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), messageObject.k.media.storyItem, p2b.a(this.a.A0));
            return;
        }
        byte b = 1;
        if (k27.K4(message2)) {
            i2 = ((d) this.a).currentAccount;
            if (up3.q(i2).b(messageObject.k) == 1) {
                messageObject.P = true;
            }
        } else {
            messageObject.P = true;
        }
        if (messageObject.m4()) {
            this.a.R5(gb2Var, false, false, f, f2, true, false, false);
            return;
        }
        if (messageObject.n4()) {
            return;
        }
        byte b2 = 0;
        if (z && (message = messageObject.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(webPage.url)) {
            String str = messageObject.k.media.webpage.url;
            gl.J0(str, false);
            if (this.a.ja(str, gb2Var, null, messageObject.e1(), 2)) {
                return;
            }
            c01 c01Var = this.a.ec;
            if (c01Var != null) {
                c01Var.a(true);
            }
            this.a.ec = gb2Var.getMessageObject() != null ? new pt1(this, gb2Var, b2) : null;
            d01.s(this.a.getParentActivity(), Uri.parse(str), true, false, false, this.a.ec, null, false, true, false, false);
            return;
        }
        if (messageObject.T2()) {
            ht1 ht1Var = new ht1(this, messageObject, b2);
            TLRPC.MessageMedia n1 = k27.n1(messageObject.k);
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) (TLRPC.TL_messageMediaDice.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaDice.class.cast(n1) : null);
            if (tL_messageMediaDice == null || !TextUtils.equals("🎲", tL_messageMediaDice.emoticon)) {
                ht1Var.run();
                return;
            }
            na7 messagesController = this.a.getMessagesController();
            ht htVar = new ht(this, messageObject, ht1Var, (byte) 10);
            TLRPC.EmojiGameInfo emojiGameInfo = messagesController.k5;
            if (emojiGameInfo != null) {
                htVar.a(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
                return;
            }
            ArrayList arrayList = messagesController.j5;
            if (arrayList != null) {
                arrayList.add(htVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            messagesController.j5 = arrayList2;
            arrayList2.add(htVar);
            messagesController.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new hc(b2), new k67(messagesController, (byte) 5));
            return;
        }
        if ((messageObject.G2() && (!messageObject.F2() || (this.a.Ua.e.containsKey(zu3.p(k27.U(messageObject.F0()))) && this.a.f != null))) || messageObject.V3()) {
            this.a.Xa(gb2Var);
            mu1 mu1Var = this.a;
            mu1Var.Ua.k(gb2Var, mu1Var, true);
            this.a.A0.J0(false);
            return;
        }
        if (messageObject.l5()) {
            bl1 tb = this.a.tb(messageObject, false);
            de2 sb = this.a.sb(messageObject);
            gb2Var.invalidate();
            final SecretMediaViewer d = SecretMediaViewer.d();
            final Activity parentActivity = this.a.getParentActivity();
            int i5 = y6c.t0;
            d.a = i5;
            ImageReceiver imageReceiver = d.h;
            imageReceiver.d = i5;
            if (d.b != parentActivity) {
                d.b = parentActivity;
                d.f1 = new kr9(parentActivity, null);
                oc6 oc6Var = new oc6((byte) 17, parentActivity, d);
                d.d = oc6Var;
                oc6Var.setBackgroundDrawable(d.k0);
                d.d.setFocusable(true);
                d.d.setFocusableInTouchMode(true);
                d.d.setClipChildren(false);
                d.d.setClipToPadding(false);
                d.e = new st(d, parentActivity);
                View view = new View(parentActivity);
                d.f = view;
                view.setBackgroundColor(2130706432);
                d.e.addView(d.f, nme.e(-1, -2, 80));
                d.e.setFocusable(false);
                d.d.addView(d.e);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d.e.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                d.e.setLayoutParams(layoutParams);
                d.e.setFitsSystemWindows(true);
                d.e.setOnApplyWindowInsetsListener(new qv0(d, (byte) 2));
                d.e.setSystemUiVisibility(1792);
                GestureDetector gestureDetector = new GestureDetector(d.e.getContext(), d);
                d.K0 = gestureDetector;
                gestureDetector.setOnDoubleTapListener(d);
                x10 x10Var = new x10((byte) 7, parentActivity, d);
                d.G = x10Var;
                x10Var.setTitleColor(-1);
                d.G.setSubtitleColor(-1);
                d.G.setBackgroundColor(2130706432);
                d.G.setOccupyStatusBar(true);
                d.G.G(1090519039, false);
                d.G.H(-1, false);
                d.G.setBackButtonImage(R.drawable.ic_ab_back);
                d.G.setTitleRightMargin(gl.L(70.0f));
                d.e.addView(d.G, nme.c(-2.0f, -1));
                d.G.setActionBarMenuOnItemClick(new kk8(d, (byte) 11));
                je5 je5Var = new je5(parentActivity, 1);
                d.r = je5Var;
                je5Var.n(1.0f, -26.0f);
                d.r.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                d.e.addView(d.r, nme.d(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
                iu9 iu9Var = new iu9(d, parentActivity);
                d.n = iu9Var;
                d.e.addView(iu9Var, nme.d(kk7.D1, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                g29 g29Var = new g29(d, (byte) 8);
                d.T = new ju9(d, parentActivity);
                View view2 = new View(parentActivity);
                d.S = view2;
                view2.setBackgroundColor(2130706432);
                d.T.addView(d.S, nme.e(-1, -1, kk7.D1));
                jia jiaVar = new jia(d.e.getContext());
                d.R = jiaVar;
                jiaVar.setTextColor(-1);
                d.R.setGravity(53);
                d.R.setTextSize(14);
                d.R.setImportantForAccessibility(2);
                d.T.addView(d.R, nme.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
                si9 si9Var = new si9(b, parentActivity, d);
                d.Q = si9Var;
                tbc tbcVar = new tbc(si9Var);
                d.P = tbcVar;
                tbcVar.z = gl.L(2.0f);
                tbc tbcVar2 = d.P;
                tbcVar2.k = 872415231;
                tbcVar2.l = 872415231;
                tbcVar2.m = -1;
                tbcVar2.n = -1;
                tbcVar2.A = 1509949439;
                tbcVar2.j = g29Var;
                d.T.addView(d.Q);
                d.e.addView(d.T, nme.e(-1, 48, 80));
                s78 s78Var = new s78(null, new f53(), (byte) 1);
                d.X = s78Var;
                s78Var.j0 = true;
                s78Var.h0 = false;
                g98 g98Var = new g98(d.e.getContext());
                d.Y = g98Var;
                g98Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: eu9
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        return new f98(parentActivity, secretMediaViewer.Z, secretMediaViewer.X, new np0(secretMediaViewer, (byte) 3), new du9());
                    }
                });
                d.Y.setVisibility(4);
                if (!d.v1) {
                    d.v1 = true;
                    d.Y.setLayerType(2, null);
                    d.Y.getCurrentView().setLayerType(2, null);
                    d.Y.getNextView().setLayerType(2, null);
                }
                ImageView imageView = new ImageView(parentActivity);
                d.U = imageView;
                imageView.setBackground(bkb.K(gl.L(64.0f), 1711276032));
                xb8 xb8Var = new xb8(28);
                d.V = xb8Var;
                xb8Var.setCallback(d.U);
                d.U.setImageDrawable(d.V);
                d.U.setScaleType(ImageView.ScaleType.CENTER);
                d.U.setScaleX(0.6f);
                d.U.setScaleY(0.6f);
                d.U.setAlpha(0.0f);
                d.U.setPivotX(gl.L(32.0f));
                d.U.setPivotY(gl.L(32.0f));
                d.e.addView(d.U, nme.e(64, 64, 17));
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                d.c = layoutParams2;
                layoutParams2.height = -1;
                layoutParams2.format = -3;
                layoutParams2.width = -1;
                layoutParams2.gravity = 48;
                layoutParams2.type = 99;
                layoutParams2.flags = -2147409656;
                gl.f2();
                imageReceiver.p0(d.e);
                imageReceiver.V0 = true;
                qib m = d.X.m(d.d.getContext());
                gl.B2(m);
                d.e.addView(m);
                d.X.Q(d.e);
                d.X.i0 = true;
            }
            SecretMediaViewer.d().h(messageObject, this.a.db, tb, sb);
            return;
        }
        if (k27.H2(messageObject.F0()) && k27.i1(messageObject.F0()) != null) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(k27.i1(messageObject.F0()));
            mu1 mu1Var2 = this.a;
            qx3 qx3Var = new qx3(mu1Var2, mu1Var2.getParentActivity(), this.a.Ba, arrayList3);
            boolean Q7 = this.a.Q7();
            qx3Var.i0 = Q7;
            qx3Var.n = Q7;
            this.a.showDialog(qx3Var);
            return;
        }
        if (k27.j1(messageObject.k) != null) {
            u0b u0bVar = new u0b(this.a.getParentActivity(), this.a, k27.j1(messageObject.k), null, (this.a.d1.getVisibility() == 0 || !((chat = this.a.e) == null || hc2.t(chat))) ? null : this.a.a0, this.a.Ba);
            boolean Q72 = this.a.Q7();
            u0bVar.i0 = Q72;
            u0bVar.n = Q72;
            this.a.showDialog(u0bVar);
            return;
        }
        if (k27.K4(messageObject.k) || (i = messageObject.D) == 1 || ((i == 0 && !messageObject.Z4()) || k27.t3(messageObject.k))) {
            if (messageObject.q4()) {
                if (k27.t3(messageObject.k) || k27.R3(messageObject.k)) {
                    this.a.O9(messageObject, true, false);
                    if (messageObject.T0 != null) {
                        c01 c01Var2 = this.a.ec;
                        if (c01Var2 != null) {
                            c01Var2.a(true);
                        }
                        this.a.ec = gb2Var.getMessageObject() == null ? null : new pt1(this, gb2Var, b);
                        Activity parentActivity2 = this.a.getParentActivity();
                        Uri parse = Uri.parse(messageObject.T0);
                        mu1 mu1Var3 = this.a;
                        d01.s(parentActivity2, parse, true, false, false, mu1Var3.ec, null, false, mu1Var3.getMessagesController().k4.A2.f, false, false);
                        return;
                    }
                    return;
                }
                if (k27.K4(messageObject.k)) {
                    this.a.O9(messageObject, true, false);
                }
            }
            if (messageObject.L0() > 0.0d && messageObject.g2() > 0 && !messageObject.j3) {
                messageObject.c0 = (float) (messageObject.g2() / messageObject.L0());
            }
            this.a.ma(gb2Var, messageObject);
            return;
        }
        int i6 = messageObject.D;
        if (i6 == 3) {
            this.a.tb(messageObject, true);
            try {
                String str2 = messageObject.k.attachPath;
                File file2 = (str2 == null || str2.length() == 0) ? null : new File(messageObject.k.attachPath);
                if (file2 == null || !file2.exists()) {
                    ba4 fileLoader = this.a.getFileLoader();
                    TLRPC.Message message3 = messageObject.k;
                    fileLoader.getClass();
                    file2 = ba4.M(message3, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity3 = this.a.getParentActivity();
                    a.d();
                    intent.setDataAndType(FileProvider.c(parentActivity3, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                this.a.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                this.a.A4(messageObject);
                return;
            }
        }
        if (i6 == 4) {
            if (gl.H1(this.a)) {
                boolean C3 = messageObject.C3();
                mu1 mu1Var4 = this.a;
                if (!C3) {
                    qa6 qa6Var = new qa6(mu1Var4.h != null ? 0 : 3);
                    qa6Var.M0 = this.a;
                    qa6Var.F0(messageObject);
                    this.a.presentFragment(qa6Var);
                    return;
                }
                TLRPC.Chat chat2 = mu1Var4.e;
                if (chat2 != null && !hc2.n(chat2) && !this.a.e.megagroup) {
                    i4 = 6;
                }
                qa6 qa6Var2 = new qa6(i4);
                qa6Var2.M0 = this.a;
                qa6Var2.F0(messageObject);
                this.a.presentFragment(qa6Var2);
                return;
            }
            return;
        }
        if (i6 != 9 && i6 != 0) {
            return;
        }
        if (messageObject.I0().toLowerCase().endsWith("attheme")) {
            String str3 = messageObject.k.attachPath;
            if (str3 != null && str3.length() != 0) {
                file = new File(messageObject.k.attachPath);
            }
            file = null;
            if (file == null) {
                ba4 fileLoader2 = this.a.getFileLoader();
                TLRPC.Message message4 = messageObject.k;
                fileLoader2.getClass();
                File M = ba4.M(message4, false, true);
                if (M.exists()) {
                    file = M;
                }
            }
            akb u = bkb.u(file, messageObject.I0(), null, true);
            mu1 mu1Var5 = this.a;
            if (u != null) {
                mu1Var5.presentFragment(new qmb(u));
                return;
            }
            mu1Var5.N4 = -1;
        }
        if (messageObject.x()) {
            PhotoViewer r0 = PhotoViewer.r0();
            mu1 mu1Var6 = this.a;
            r0.T1(null, mu1Var6, mu1Var6.Ba);
            PhotoViewer r02 = PhotoViewer.r0();
            mu1 mu1Var7 = this.a;
            if (messageObject.D != 0) {
                j = mu1Var7.l6;
                j2 = mu1Var7.d7;
                j3 = mu1Var7.d();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            k27Var = messageObject;
            r02.m1(k27Var, mu1Var7, j, j2, j3, this.a.db);
            z2 = true;
        } else {
            k27Var = messageObject;
            z2 = false;
        }
        Pattern pattern = xi6.a;
        String Q0 = k27Var.Q0();
        if (!"md".equalsIgnoreCase(Q0) && !"mkd".equalsIgnoreCase(Q0) && !"mdwn".equalsIgnoreCase(Q0) && !"mkdn".equalsIgnoreCase(Q0) && !"mdown".equalsIgnoreCase(Q0) && !"markdown".equalsIgnoreCase(Q0)) {
            String t1 = k27Var.t1();
            if (t1 != null) {
                String lowerCase = t1.toLowerCase();
                if (!lowerCase.startsWith("text/markdown")) {
                    if (!lowerCase.startsWith("text/x-markdown")) {
                    }
                }
            }
            if (!xi6.g(k27Var)) {
                k27Var2 = k27Var;
                if (z2) {
                    try {
                        gl.r2(k27Var2, this.a.getParentActivity(), this.a.Ba, false);
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        this.a.A4(k27Var2);
                        return;
                    }
                }
                return;
            }
        }
        k27 k27Var3 = k27Var;
        mu1 mu1Var8 = this.a;
        if (mu1Var8.getParentActivity() == null) {
            k27Var2 = k27Var3;
        } else {
            hd hdVar = new hd(3, mu1Var8.Ba, mu1Var8.getParentActivity());
            hdVar.setCanceledOnTouchOutside(false);
            boolean[] zArr = {false};
            hdVar.setOnCancelListener(new gn1(zArr, (byte) 0));
            hdVar.q(150L);
            hn1 hn1Var = new hn1(mu1Var8, k27Var3, hdVar, zArr, (byte) 0);
            k27Var2 = k27Var3;
            new Thread(hn1Var).start();
        }
        z2 = true;
        if (z2) {
        }
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        mu1 mu1Var = this.a;
        return mu1Var.ac != 0 && gb2Var.getMessageObject() != null && mu1Var.ac == gb2Var.getMessageObject().e1() && mu1Var.bc == i;
    }

    @Override // bb2
    public final void B0() {
        gb2 gb2Var;
        k27 messageObject;
        km m;
        mu1 mu1Var = this.a;
        if (mu1Var.A3 || gba.w0 || mu1Var.A0 == null || mu1Var.getParentActivity() == null || mu1Var.fragmentView == null) {
            return;
        }
        je5 je5Var = mu1Var.I2;
        if (je5Var == null) {
            int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
            if (indexOfChild == -1) {
                return;
            }
            je5 s4 = mu1Var.s4(250.0f, 3, indexOfChild + 1, false);
            mu1Var.I2 = s4;
            s4.d = 10000L;
            s4.l(mu1Var.getParentActivity().getResources().getDrawable(R.drawable.tooltip_sound).mutate());
            mu1Var.I2.t(k96.M0(2131753759, null));
        } else if (je5Var.W) {
            return;
        }
        int childCount = mu1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mu1Var.A0.getChildAt(i);
            if ((childAt instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null && k27.K4(messageObject.k) && (m = gb2Var.getPhotoImage().m()) != null && m.o() >= 3000 && !mu1Var.I2.W) {
                ImageReceiver photoImage = gb2Var.getPhotoImage();
                float p7 = mu1Var.p7(gb2Var, photoImage.M0);
                float f = photoImage.O0;
                View view = (View) gb2Var.getParent();
                float p72 = mu1Var.p7(gb2Var, -gb2Var.getTop());
                if (p7 <= gl.L(80.0f)) {
                    continue;
                } else if ((p7 + f) - p72 <= (f / 4.0f) + view.getMeasuredHeight()) {
                    mu1Var.Lb = gb2Var;
                    je5 je5Var2 = mu1Var.I2;
                    je5Var2.r0 = new wl1(mu1Var, (byte) 24);
                    je5Var2.w(mu1Var.o7(gb2Var, gb2Var.getNoSoundIconCenterX()), p7, true);
                    gba.C(true);
                    return;
                }
            }
        }
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        long j;
        ViewGroup viewGroup;
        int i;
        ou9 ou9Var;
        je5 je5Var;
        if (k27Var.R4() || k27Var.f4()) {
            qu9 qu9Var = this.a.wa;
            if (qu9Var == null || qu9Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!k27Var.O3()) {
                            u21.b0(this.a).w(R.drawable.tooltip_sound, k96.M0(2131743271, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new qu9(this.a.getParentActivity());
                qu9 qu9Var2 = this.a.wa;
                bl1 tb = !k27Var.O3() ? this.a.tb(k27Var, true) : null;
                de2 sb = !k27Var.O3() ? this.a.sb(k27Var) : null;
                Activity activity = qu9Var2.a;
                st stVar = qu9Var2.c;
                qu9Var2.Y = tb;
                qu9Var2.Z = sb;
                ou9 ou9Var2 = qu9Var2.O;
                if (ou9Var2 != null) {
                    stVar.removeView(ou9Var2);
                    qu9Var2.O = null;
                }
                qu9Var2.P = gb2Var;
                k27 messageObject = gb2Var.getMessageObject();
                qu9Var2.N = messageObject;
                qu9Var2.T = messageObject != null && messageObject.g4();
                gb2 gb2Var2 = qu9Var2.P;
                qu9Var2.M = gb2Var2 != null ? gb2Var2.getResourcesProvider() : null;
                if (qu9Var2.P != null) {
                    qu9Var2.U = 0.0f;
                    qu9Var2.V = gb2Var.n;
                    if (gb2Var.getParent() instanceof View) {
                        View view = (View) gb2Var.getParent();
                        qu9Var2.U = view.getY() + qu9Var2.U;
                        qu9Var2.V = view.getY() + qu9Var2.V;
                    }
                    int width = qu9Var2.P.getWidth();
                    int height = qu9Var2.P.getHeight();
                    if (qu9Var2.T) {
                        height = Math.min(gl.L(360.0f), Math.min(width, gl.q.y));
                    }
                    qu9Var2.L = height - qu9Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / gl.p);
                    j = 0;
                    int i2 = height;
                    viewGroup = stVar;
                    ou9 ou9Var3 = new ou9(qu9Var2, qu9Var2.getContext(), y6c.t0, qu9Var2.P.getResourcesProvider(), width, i2);
                    qu9Var2.O = ou9Var3;
                    qu9Var2.P.u0(ou9Var3);
                    qu9Var2.O.t0(qu9Var2.P);
                    qu9Var2.O.setDelegate(new eef((byte) 25));
                    ou9 ou9Var4 = qu9Var2.O;
                    k27 k27Var2 = qu9Var2.N;
                    f27 currentMessagesGroup = qu9Var2.P.getCurrentMessagesGroup();
                    gb2 gb2Var3 = qu9Var2.P;
                    ou9Var4.z3(k27Var2, currentMessagesGroup, gb2Var3.G, gb2Var3.F, false, false);
                    if (!qu9Var2.T) {
                        n40 n40Var = new n40();
                        qu9Var2.W = n40Var;
                        ou9 ou9Var5 = qu9Var2.O;
                        n40Var.i = ou9Var5;
                        ou9Var5.Ic = n40Var;
                        if (ou9Var5.getSeekBarWaveform() != null) {
                            dv9 seekBarWaveform = qu9Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = qu9Var2.s;
                            gb2 gb2Var4 = seekBarWaveform.n;
                            if (gb2Var4 != null) {
                                gb2Var4.invalidate();
                            }
                        }
                    }
                    qu9Var2.I = false;
                    viewGroup.addView(qu9Var2.O, new FrameLayout.LayoutParams(qu9Var2.P.getWidth(), i2, 17));
                    i = ceil;
                } else {
                    j = 0;
                    viewGroup = stVar;
                    i = 360;
                }
                TextureView textureView = qu9Var2.Q;
                if (textureView != null) {
                    viewGroup.removeView(textureView);
                    qu9Var2.Q = null;
                }
                if (qu9Var2.T) {
                    qu9Var2.R = false;
                    TextureView textureView2 = new TextureView(activity);
                    qu9Var2.Q = textureView2;
                    viewGroup.addView(textureView2, 0, nme.c(i, i));
                }
                lbc lbcVar = MediaController.w().j0;
                if (lbcVar != null) {
                    lbcVar.f0();
                }
                lbc lbcVar2 = qu9Var2.x;
                if (lbcVar2 != null) {
                    lbcVar2.f0();
                    qu9Var2.x.l0();
                    qu9Var2.x = null;
                }
                gb2 gb2Var5 = qu9Var2.P;
                if (gb2Var5 != null && gb2Var5.getMessageObject() != null) {
                    ba4.G(qu9Var2.P.getMessageObject().K1);
                    File I = ba4.I(qu9Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        ba4.G(qu9Var2.P.getMessageObject().K1);
                        I = ba4.M(qu9Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && qu9Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(qu9Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        lbc lbcVar3 = new lbc();
                        qu9Var2.x = lbcVar3;
                        lbcVar3.K = new u39(qu9Var2, (byte) 9);
                        if (qu9Var2.W != null) {
                            lbcVar3.L = new ln8((Object) qu9Var2, (byte) 12);
                        }
                        if (qu9Var2.T) {
                            lbcVar3.z0(qu9Var2.Q);
                        }
                        qu9Var2.x.i0(Uri.fromFile(I), "other");
                        qu9Var2.x.g0();
                        ks3 ks3Var = qu9Var2.F;
                        if (ks3Var != null) {
                            ks3Var.s = qu9Var2.x;
                            ks3Var.a();
                        }
                    }
                    mu1 mu1Var = this.a;
                    mu1Var.showDialog(mu1Var.wa);
                    return false;
                }
                je5 je5Var2 = qu9Var2.y;
                if (je5Var2 != null) {
                    viewGroup.removeView(je5Var2);
                    qu9Var2.y = null;
                }
                k27 k27Var3 = qu9Var2.N;
                boolean z = k27Var3 != null && k27Var3.O3();
                k27 k27Var4 = qu9Var2.N;
                if (k27Var4 != null && k27.B0(k27Var4.k) != y6c.h(qu9Var2.N.K1).e()) {
                    je5 je5Var3 = new je5(activity, 3);
                    qu9Var2.y = je5Var3;
                    je5Var3.p(true);
                    if (z) {
                        long B0 = k27.B0(qu9Var2.N.k);
                        k27 k27Var5 = qu9Var2.N;
                        String str = "";
                        if (B0 > j) {
                            TLRPC.User V1 = na7.q1(k27Var5.K1).V1(Long.valueOf(B0));
                            if (V1 != null) {
                                str = l7c.k(V1, true);
                            }
                        } else {
                            TLRPC.Chat K0 = na7.q1(k27Var5.K1).K0(Long.valueOf(-B0));
                            if (K0 != null) {
                                str = K0.title;
                            }
                        }
                        qu9Var2.y.t(gl.S2(k96.a0(null, null, qu9Var2.T ? 2131743351 : 2131743272, str)));
                    } else {
                        qu9Var2.y.t(gl.S2(k96.M0(qu9Var2.T ? 2131743352 : 2131743273, null)));
                    }
                    qu9Var2.y.q(12.0f);
                    qu9Var2.y.setPadding(gl.L((z || qu9Var2.P.G) ? 0.0f : 6.0f), 0, 0, 0);
                    boolean z2 = qu9Var2.T;
                    je5 je5Var4 = qu9Var2.y;
                    if (z2) {
                        je5Var4.o(0.5f, 0.0f);
                        je5Var = qu9Var2.y;
                        je5Var.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        je5Var4.o(0.0f, gl.L(34.0f));
                        je5Var = qu9Var2.y;
                        je5Var.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    je5Var.u(14.0f);
                    je5 je5Var5 = qu9Var2.y;
                    je5Var5.h = je5.a(je5Var5.getText(), qu9Var2.y.getTextPaint());
                    boolean z3 = qu9Var2.T;
                    je5 je5Var6 = qu9Var2.y;
                    gb2 gb2Var6 = qu9Var2.P;
                    if (z3) {
                        viewGroup.addView(je5Var6, nme.d((int) ((gb2Var6.getWidth() / gl.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((qu9Var2.P.getHeight() + qu9Var2.L) / gl.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        viewGroup.addView(je5Var6, nme.d((int) ((gb2Var6.getWidth() / gl.p) * 0.6f), 150.0f, 17, ((((qu9Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + qu9Var2.P.getBoundsLeft()) / gl.p) + 1.0f, ((-75.0f) - ((qu9Var2.P.getHeight() / gl.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    qu9Var2.y.v();
                }
                TextView textView = qu9Var2.E;
                if (textView != null) {
                    viewGroup.removeView(textView);
                    qu9Var2.E = null;
                }
                TextView textView2 = new TextView(activity);
                qu9Var2.E = textView2;
                textView2.setTextColor(-1);
                qu9Var2.E.setTypeface(gl.o());
                boolean o = bkb.I.o();
                TextView textView3 = qu9Var2.E;
                if (o) {
                    textView3.setBackground(bkb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    textView3.setBackground(bkb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                qu9Var2.E.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(6.0f));
                ote.a(qu9Var2.E);
                qu9Var2.E.setText(k96.M0(z ? 2131743277 : 2131743274, null));
                qu9Var2.E.setOnClickListener(new lu9(qu9Var2, (byte) 1));
                viewGroup.addView(qu9Var2.E, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z && (ou9Var = qu9Var2.O) != null && ou9Var.getMessageObject() != null && qu9Var2.O.getMessageObject().k != null) {
                    qu9Var2.O.getMessageObject().k.media_unread = false;
                    qu9Var2.O.invalidate();
                }
                mu1 mu1Var2 = this.a;
                mu1Var2.showDialog(mu1Var2.wa);
                return false;
            }
        } else {
            if (k27.Q4(k27Var.k) || k27Var.g4()) {
                boolean R = MediaController.w().R(k27Var);
                MediaController.w().q0(R ? this.a.c6(k27Var, false) : null, false);
                return R;
            }
            if (k27Var.I3()) {
                MediaController w = MediaController.w();
                ArrayList G = this.a.D0.G();
                mu1 mu1Var3 = this.a;
                return w.n0(G, k27Var, mu1Var3.d7, !mu1Var3.D0.O, null, mu1Var3.x4 ? mu1Var3.d() : 0L);
            }
        }
        return false;
    }

    @Override // bb2
    public final void C1(gb2 gb2Var, boolean z) {
        f(gb2Var, z, false, false);
    }

    @Override // bb2
    public final void C2() {
        mu1 mu1Var = this.a;
        if (!mu1Var.getUserConfig().p()) {
            u21.b0(mu1Var).Q(R.raw.star_premium_2, 36, gl.N2(k96.H(',', "UnlockSimilarChannelsPremium", mu1Var.getMessagesController().k4.R1.f()), -1, 0, new ft1(this, (byte) 4), null)).j();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", mu1Var.l6);
        bundle.putInt("start_from", 10);
        mu1Var.presentFragment(new zj6(bundle, mu1Var.p1.getSharedMediaPreloader()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x06a4, code lost:
    
        if (r8.paid_reactions_available == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x06aa, code lost:
    
        if (r6.isEmpty() != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06e4, code lost:
    
        if (r5.f != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06ec, code lost:
    
        if (hc2.p0(r5.e) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06f2, code lost:
    
        if (r6.isEmpty() != false) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09c5 A[LOOP:3: B:262:0x09c3->B:263:0x09c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0966  */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        ve8 ve8Var;
        TLRPC.PollAnswer pollAnswer2;
        ve8 ve8Var2;
        mu1 mu1Var;
        se8 se8Var;
        kl0 kl0Var;
        k27 k27Var;
        se8 se8Var2;
        boolean z;
        kl0 kl0Var2;
        boolean z2;
        hl1 hl1Var;
        k27 k27Var2;
        mu1 mu1Var2;
        cs5 cs5Var;
        ArrayList arrayList;
        ve8 ve8Var3;
        int size;
        int i;
        ViewGroup viewGroup;
        ve8 ve8Var4;
        boolean z3;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        boolean z4;
        byte[] bArr;
        se8 se8Var3;
        TLRPC.PollAnswerVoters pollAnswerVoters;
        boolean z5;
        ve8 ve8Var5;
        ArrayList arrayList2;
        byte[] bArr2;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2;
        TLRPC.PollAnswer pollAnswer3;
        boolean z6;
        String str;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3;
        mu1 mu1Var3 = this.a;
        if (mu1Var3.getParentActivity() != null && mu1Var3.getParentActivity() != null) {
            je5 je5Var = mu1Var3.M1;
            if (je5Var != null && je5Var.W) {
                je5Var.f(true);
            }
            ks1 ks1Var = mu1Var3.Q1;
            if (ks1Var != null && ks1Var.W) {
                ks1Var.f(true);
            }
            k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m1 = k27.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
                mu1Var3.v5 = primaryMessageObject;
                mu1Var3.w5 = null;
                ve8 ve8Var6 = new ve8(mu1Var3.getParentActivity(), mu1Var3.getResourceProvider());
                byte[] bArr3 = pollAnswer.option;
                ve8Var6.M = gb2Var;
                ve8Var6.Q = bArr3;
                k27 messageObject = gb2Var.getMessageObject();
                ve8Var6.I = messageObject;
                ve8Var6.J = messageObject != null && messageObject.O3();
                gb2 gb2Var2 = ve8Var6.M;
                se8 se8Var4 = ve8Var6.d;
                if (gb2Var2 != null) {
                    ve8Var6.N = mu1Var3.P9 - gl.L(4.0f);
                    ve8Var6.O = gb2Var.n;
                    if (gb2Var.getParent() instanceof View) {
                        View view = (View) gb2Var.getParent();
                        ve8Var6.N = view.getY() + ve8Var6.N;
                        ve8Var6.O = view.getY() + ve8Var6.O;
                    }
                    int width = ve8Var6.M.getWidth();
                    int height = ve8Var6.M.getHeight();
                    ve8Var6.M.getHeight();
                    te8 te8Var = new te8(ve8Var6, ve8Var6.getContext(), y6c.t0, ve8Var6.M.getResourcesProvider(), bArr3, width, height);
                    ve8Var = ve8Var6;
                    ve8Var.K = te8Var;
                    ve8Var.M.s0(te8Var);
                    ve8Var.K.t0(ve8Var.M);
                    ve8Var.K.setDelegate(new i2f((byte) 23));
                    te8 te8Var2 = ve8Var.K;
                    k27 k27Var3 = ve8Var.I;
                    f27 currentMessagesGroup = ve8Var.M.getCurrentMessagesGroup();
                    gb2 gb2Var3 = ve8Var.M;
                    te8Var2.z3(k27Var3, currentMessagesGroup, gb2Var3.G, gb2Var3.F, gb2Var3.H, false);
                    te8 te8Var3 = ve8Var.K;
                    te8Var3.e6 = bArr3;
                    se8Var4.addView(te8Var3, new FrameLayout.LayoutParams(ve8Var.M.getWidth(), height, 51));
                    ue8 ue8Var = new ue8(ve8Var.getContext(), y6c.t0, ve8Var.M.getResourcesProvider(), width, height, (byte) 0);
                    ve8Var.L = ue8Var;
                    ve8Var.M.u0(ue8Var);
                    ve8Var.M.s0(ve8Var.L);
                    ve8Var.L.t0(ve8Var.M);
                    ve8Var.L.setDelegate(new ize((byte) 23));
                    ue8 ue8Var2 = ve8Var.L;
                    k27 k27Var4 = ve8Var.I;
                    f27 currentMessagesGroup2 = ve8Var.M.getCurrentMessagesGroup();
                    gb2 gb2Var4 = ve8Var.M;
                    ue8Var2.z3(k27Var4, currentMessagesGroup2, gb2Var4.G, gb2Var4.F, gb2Var4.H, false);
                    se8Var4.addView(ve8Var.L, new FrameLayout.LayoutParams(ve8Var.M.getWidth(), height, 51));
                } else {
                    ve8Var = ve8Var6;
                }
                vq1 vq1Var = ve8Var.f;
                vq1Var.bringToFront();
                se8 se8Var5 = ve8Var.e;
                se8Var5.bringToFront();
                ve8Var.n.bringToFront();
                vq1Var.w(false);
                Activity activity = ve8Var.a;
                View view2 = new View(activity);
                wjb wjbVar = ve8Var.b;
                cs5 H = cs5.H(se8Var4, wjbVar, view2, true);
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) k27.m1(ve8Var.I);
                ve8Var.W = k27.V4(tL_messageMediaPoll4);
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messageMediaPoll4.poll.answers.size()) {
                        pollAnswer2 = null;
                        break;
                    }
                    if (Arrays.equals(tL_messageMediaPoll4.poll.answers.get(i2).option, bArr3)) {
                        pollAnswer2 = tL_messageMediaPoll4.poll.answers.get(i2);
                        break;
                    }
                    i2++;
                }
                kl0 kl0Var3 = ve8Var.H;
                if (pollAnswer2 != null) {
                    TLRPC.Poll poll = tL_messageMediaPoll4.poll;
                    boolean z7 = (poll.closed || poll.revoting_disabled) ? false : true;
                    boolean z8 = poll.multiple_choice;
                    ArrayList arrayList4 = new ArrayList();
                    TLRPC.PollResults pollResults = tL_messageMediaPoll4.results;
                    if (pollResults == null || (arrayList3 = pollResults.results) == null) {
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        z4 = z8;
                        bArr = bArr3;
                        se8Var3 = se8Var4;
                        pollAnswerVoters = null;
                        z5 = false;
                    } else {
                        int size2 = arrayList3.size();
                        z4 = z8;
                        int i3 = 0;
                        z5 = false;
                        TLRPC.PollAnswerVoters pollAnswerVoters2 = null;
                        while (i3 < size2) {
                            TLRPC.PollAnswerVoters pollAnswerVoters3 = arrayList3.get(i3);
                            int i4 = i3 + 1;
                            TLRPC.PollAnswerVoters pollAnswerVoters4 = pollAnswerVoters3;
                            se8 se8Var6 = se8Var4;
                            boolean equals = Arrays.equals(pollAnswerVoters4.option, bArr3);
                            if (equals) {
                                pollAnswerVoters2 = pollAnswerVoters4;
                            }
                            byte[] bArr4 = bArr3;
                            if (pollAnswerVoters4.chosen) {
                                if (equals) {
                                    z5 = true;
                                }
                                ArrayList<TLRPC.PollAnswer> arrayList5 = tL_messageMediaPoll4.poll.answers;
                                int size3 = arrayList5.size();
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                                int i5 = 0;
                                while (i5 < size3) {
                                    TLRPC.PollAnswer pollAnswer4 = arrayList5.get(i5);
                                    int i6 = i5 + 1;
                                    TLRPC.PollAnswer pollAnswer5 = pollAnswer4;
                                    ArrayList<TLRPC.PollAnswer> arrayList6 = arrayList5;
                                    int i7 = size3;
                                    if (Arrays.equals(pollAnswer5.option, pollAnswerVoters4.option)) {
                                        arrayList4.add(pollAnswer5);
                                    }
                                    arrayList5 = arrayList6;
                                    i5 = i6;
                                    size3 = i7;
                                }
                            } else {
                                tL_messageMediaPoll3 = tL_messageMediaPoll4;
                            }
                            se8Var4 = se8Var6;
                            i3 = i4;
                            bArr3 = bArr4;
                            tL_messageMediaPoll4 = tL_messageMediaPoll3;
                        }
                        tL_messageMediaPoll = tL_messageMediaPoll4;
                        bArr = bArr3;
                        se8Var3 = se8Var4;
                        pollAnswerVoters = pollAnswerVoters2;
                    }
                    if (pollAnswerVoters == null || pollAnswerVoters.voters <= 0 || !k27.A(tL_messageMediaPoll)) {
                        ve8Var5 = ve8Var;
                        arrayList2 = arrayList4;
                        k27Var = primaryMessageObject;
                        se8Var = se8Var3;
                        bArr2 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                    } else {
                        c29 c29Var = new c29(mu1Var3.getCurrentAccount(), wjbVar, activity);
                        cs5 K = H.K();
                        K.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                        al0 k = nod.k(wjbVar);
                        View view3 = K.B;
                        byte b = 0;
                        if (view3 != null) {
                            il0 c = kl0Var3.c(view3, null, false);
                            c.p(k);
                            view3.setBackground(c);
                        }
                        K.b(R.drawable.ic_ab_back, k96.M0(2131753753, null), new en1(H, b), false);
                        K.j();
                        ve8Var5 = ve8Var;
                        k27Var = primaryMessageObject;
                        arrayList2 = arrayList4;
                        se8Var = se8Var3;
                        byte[] bArr5 = bArr;
                        tL_messageMediaPoll2 = tL_messageMediaPoll;
                        View a = c29Var.a(mu1Var3, k27.B0(ve8Var.I.k), ve8Var.I.e1(), bArr5, pollAnswerVoters.voters, new x15(ve8Var, mu1Var3, (byte) 18));
                        mu1Var3 = mu1Var3;
                        bArr2 = bArr5;
                        K.p(a);
                        c29Var.setMinimumHeight(gl.L(48.0f));
                        c29Var.setText(k96.G(pollAnswerVoters.voters, "PollVotesCount", new Object[0]));
                        c29Var.a.d(pollAnswerVoters.recent_voters, false);
                        c29Var.setLayoutParams(nme.o(-1, 48));
                        int i8 = bkb.H5;
                        ff0 Y = bkb.Y(bkb.w0(null, i8, false), 12, 0);
                        vkb M = zkb.M(i8);
                        c29Var.setBackground(Y);
                        zkb.j(c29Var, Y, null, M, null);
                        c29Var.setOnClickListener(new v16(H, K, (byte) 20));
                        H.p(c29Var);
                        H.j();
                    }
                    if (!z7) {
                        ve8Var2 = ve8Var5;
                        mu1Var = mu1Var3;
                        pollAnswer3 = pollAnswer2;
                    } else if (z5) {
                        CharSequence M0 = k96.M0(2131743585, null);
                        ve8Var2 = ve8Var5;
                        TLRPC.PollAnswer pollAnswer6 = pollAnswer2;
                        Runnable pe8Var = new pe8(ve8Var2, z4, mu1Var3, arrayList2, pollAnswer6);
                        mu1Var = mu1Var3;
                        pollAnswer3 = pollAnswer6;
                        H.b(R.drawable.msg_unvote, M0, pe8Var, false);
                    } else {
                        ve8Var2 = ve8Var5;
                        mu1Var = mu1Var3;
                        pollAnswer3 = pollAnswer2;
                        boolean z9 = z4;
                        if (ye8.a(ve8Var2.I) == 0) {
                            H.b(R.drawable.msg_select, k96.M0(2131746963, null), new pe8(ve8Var2, z9, pollAnswer3, mu1Var, arrayList2), false);
                        }
                    }
                    byte b2 = 25;
                    if (mu1Var.I4()) {
                        H.b(R.drawable.menu_reply, k96.M0(2131746977, null), new pc7(ve8Var2, mu1Var, pollAnswer3, b2), false);
                    }
                    if (k27.B0(ve8Var2.I.k) >= 0 || pollAnswer3.option == null) {
                        kl0Var = kl0Var3;
                        z6 = false;
                        str = null;
                    } else {
                        na7 q1 = na7.q1(ve8Var2.I.K1);
                        kl0Var = kl0Var3;
                        String q = cf3.q(q1.Z1(k27.B0(ve8Var2.I.k)));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(q1.N2);
                        sb.append("/");
                        if (TextUtils.isEmpty(q)) {
                            q = "c/" + (-k27.B0(ve8Var2.I.k));
                        }
                        sb.append(q);
                        sb.append("/");
                        sb.append(ve8Var2.I.e1());
                        sb.append("?option=");
                        sb.append(new String(Base64.encode(pollAnswer3.option, 9)));
                        str = null;
                        z6 = false;
                        H.b(R.drawable.msg_link, k96.M0(2131751750, null), new h18(ve8Var2, sb.toString(), (byte) 15), false);
                    }
                    H.b(R.drawable.msg_copy, k96.M0(2131751755, str), new h18(ve8Var2, pollAnswer3, (byte) 16), z6);
                    TLRPC.Peer peer = pollAnswer3.added_by;
                    if (peer != null) {
                        long n = cf3.n(peer);
                        long e = y6c.h(ve8Var2.I.K1).e();
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll2;
                        long currentTime = ConnectionsManager.getInstance(ve8Var2.I.K1).getCurrentTime();
                        mu1 mu1Var4 = mu1Var;
                        long g = na7.q1(ve8Var2.I.K1).k4.O.g(TimeUnit.SECONDS) + pollAnswer3.date;
                        if (!k27.l3(ve8Var2.I.k)) {
                            TLRPC.Poll poll2 = tL_messageMediaPoll5.poll;
                            if (!poll2.closed && (poll2.creator || (n == e && currentTime < g))) {
                                H.b(R.drawable.msg_delete, k96.M0(2131751586, null), new h18(ve8Var2, bArr2, (byte) 17), true);
                            }
                        }
                        H.j();
                        TLObject Z1 = na7.q1(ve8Var2.I.K1).Z1(n);
                        SpannableStringBuilder R2 = gl.R2(k96.V(null, null, 2131746988, cf3.t(Z1), k96.x(pollAnswer3.date, true)));
                        mu1Var = mu1Var4;
                        go6 go6Var = new go6((Object) ve8Var2, n, (Object) mu1Var, (byte) 22);
                        Context context = H.e;
                        FrameLayout frameLayout = new FrameLayout(context);
                        int i9 = bkb.h6;
                        wjb wjbVar2 = H.d;
                        ff0 Y2 = bkb.Y(bkb.v0(i9, wjbVar2), 0, 12);
                        vkb M2 = zkb.M(i9);
                        frameLayout.setBackground(Y2);
                        zkb.j(frameLayout, Y2, null, M2, wjbVar2);
                        be0 be0Var = new be0(context);
                        be0Var.setRoundRadius(gl.L(17.0f));
                        pb0 pb0Var = new pb0((wjb) null);
                        pb0Var.k(Z1);
                        be0Var.f(Z1, pb0Var);
                        frameLayout.addView(be0Var, nme.d(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
                        TextView textView = new TextView(context);
                        zkb.X(textView, bkb.i5, wjbVar2);
                        textView.setTextSize(1, 14.0f);
                        textView.setText(R2);
                        textView.setMaxWidth(gl.L(150.0f));
                        textView.setLineSpacing(gl.L(3.0f), 1.0f);
                        frameLayout.addView(textView, nme.d(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
                        frameLayout.setOnClickListener(new xf3(H, (Runnable) go6Var, (byte) 25));
                        H.q(frameLayout, nme.o(-1, -2));
                    }
                } else {
                    ve8Var2 = ve8Var;
                    mu1Var = mu1Var3;
                    se8Var = se8Var4;
                    kl0Var = kl0Var3;
                    k27Var = primaryMessageObject;
                }
                H.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                kl0 kl0Var4 = kl0Var;
                H.R(kl0Var4, nod.k(wjbVar), false);
                H.Z();
                ViewGroup viewGroup2 = H.A;
                ve8Var2.S = viewGroup2;
                viewGroup2.setPivotX(0.0f);
                ve8Var2.S.setPivotY(0.0f);
                se8Var5.addView(ve8Var2.S, nme.e(-2, -2, 51));
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                mu1Var.B6(k27Var, arrayList7, arrayList8, arrayList9);
                hl1 hl1Var2 = new hl1(mu1Var, (byte) 10);
                k27 k27Var5 = ve8Var2.I;
                ArrayList arrayList10 = mu1Var.getMediaDataController().n;
                boolean z10 = (mu1Var.y() || mu1Var.P7() || mu1Var.f != null || !k27Var5.w2() || (hc2.T(mu1Var.e) && !mu1Var.e.megagroup) || hc2.p0(mu1Var.e) || arrayList10.isEmpty() || !k27Var5.k.reactions.can_see_list || k27Var5.k4()) ? false : true;
                if (k27Var5.k3()) {
                    se8Var2 = se8Var5;
                    TLRPC.ChatFull L0 = mu1Var.getMessagesController().L0(-k27Var5.Z0());
                    if (L0 != null) {
                        if (!mu1Var.y()) {
                            if (mu1Var.g4 != 5) {
                                if (!mu1Var.P7()) {
                                    if (k27Var5.c4()) {
                                        if (L0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    se8Var2 = se8Var5;
                    if (!k27Var5.k4() && mu1Var.g4 != 5 && !mu1Var.y() && !mu1Var.P7() && k27Var5.c4()) {
                        if ((r8 = mu1Var.r8) != null) {
                        }
                    }
                    z = false;
                }
                boolean z11 = z;
                boolean z12 = (z10 || mu1Var.P7() || mu1Var.e == null || !k27Var5.O3() || !k27Var5.p4() || k27Var5.Y2() || k27Var5.n4() || k27Var5.m4() || k27Var5.k.media_unread || k27Var5.E4() || ConnectionsManager.getInstance(mu1Var.getCurrentAccount()).getCurrentTime() - k27Var5.k.date >= mu1Var.getMessagesController().k4.O0.f() || (!hc2.n0(mu1Var.e) && hc2.T(mu1Var.e)) || (chatFull = mu1Var.r8) == null || chatFull.participants_count > mu1Var.getMessagesController().k4.N0.f() || (k27Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || mu1Var.g4 == 3 || !k27Var5.z() || hc2.p0(mu1Var.e)) ? false : true;
                if (mu1Var.e == null || k27Var5.N3() || !hc2.p0(mu1Var.e) || !hc2.A(mu1Var.getCurrentAccount(), mu1Var.e, 24)) {
                    kl0Var2 = kl0Var4;
                } else {
                    kl0Var2 = kl0Var4;
                    long j = mu1Var.e.linked_monoforum_id;
                    k27Var5.Z0();
                }
                if (!z10 && mu1Var.e == null && mu1Var.h == null && (user = mu1Var.f) != null && !l7c.D(user) && !l7c.B(mu1Var.f) && !l7c.u(mu1Var.f)) {
                    TLRPC.User user2 = mu1Var.f;
                    if (!user2.bot && !l7c.C(user2.id) && (((userFull = mu1Var.s8) == null || !userFull.read_dates_private) && !mu1Var.P7() && k27Var5.O3() && k27Var5.p4() && !k27Var5.Y2() && !k27Var5.n4() && !k27Var5.m4() && !k27Var5.k.media_unread && !k27Var5.E4() && mu1Var.getConnectionsManager().getCurrentTime() - k27Var5.k.date < mu1Var.getMessagesController().k4.P0.f() && !(k27Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                        z2 = true;
                        TLRPC.User user3 = mu1Var.f;
                        boolean z13 = ((user3 == null && (l7c.B(user3) || l7c.u(mu1Var.f))) || mu1Var.P7() || !k27Var5.X2() || (k27Var5.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                        cs5 H2 = cs5.H(se8Var, mu1Var.getResourceProvider(), null, !z10 || z12);
                        if (z12) {
                            hl1Var = hl1Var2;
                            k27Var2 = k27Var5;
                            mu1Var2 = mu1Var;
                            cs5Var = H2;
                            arrayList = arrayList9;
                            ve8Var3 = ve8Var2;
                            if (z2) {
                                cs5Var.q(new n37(ve8Var3.getContext(), 0, k27Var2, new ne8(ve8Var3, (byte) 1), ve8Var3.b), nme.o(-1, 36));
                                cs5Var.j();
                            } else if (z13) {
                                cs5Var.q(new n37(ve8Var3.getContext(), 1, k27Var2, new ne8(ve8Var3, (byte) 2), ve8Var3.b), nme.o(-1, 36));
                                cs5Var.j();
                            }
                        } else {
                            t37 t37Var = new t37(ve8Var2.getContext(), mu1Var.getCurrentAccount(), k27Var5, mu1Var.e);
                            FrameLayout frameLayout2 = new FrameLayout(ve8Var2.getContext());
                            frameLayout2.addView(t37Var, nme.c(36.0f, -1));
                            cs5 K2 = H2.K();
                            a8 a8Var = new a8(0, ve8Var2.b, ve8Var2.getContext(), true, false);
                            a8Var.setItemHeight(44);
                            a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
                            ve8 ve8Var7 = ve8Var2;
                            a8Var.getTextView().setPadding(k96.a0 ? 0 : gl.L(40.0f), 0, k96.a0 ? gl.L(40.0f) : 0, 0);
                            FrameLayout frameLayout3 = new FrameLayout(ve8Var7.getContext());
                            LinearLayout linearLayout = new LinearLayout(ve8Var7.getContext());
                            zkb.h(bkb.F8, wjbVar, linearLayout);
                            linearLayout.setOrientation(1);
                            k27Var2 = k27Var5;
                            mu1Var2 = mu1Var;
                            o39 a2 = t37Var.a();
                            frameLayout3.addView(a8Var);
                            linearLayout.addView(frameLayout3);
                            linearLayout.addView(new j8(ve8Var7.getContext(), wjbVar), nme.o(-1, 8));
                            frameLayout3.setOnClickListener(new qe8(H2, (byte) 0));
                            hl1Var = hl1Var2;
                            arrayList = arrayList9;
                            re8 re8Var = new re8(ve8Var7, t37Var, mu1Var2, a2, linearLayout, H2, K2);
                            cs5Var = H2;
                            ve8Var3 = ve8Var7;
                            t37Var.setOnClickListener(re8Var);
                            linearLayout.addView(a2, nme.o(-1, -2));
                            K2.p(linearLayout);
                            cs5Var.p(frameLayout2);
                            cs5Var.j();
                        }
                        size = arrayList7.size();
                        i = 0;
                        while (i < size) {
                            cs5Var.b(((Integer) arrayList7.get(i)).intValue(), (CharSequence) arrayList8.get(i), new j45((Object) ve8Var3, (Object) hl1Var, ((Integer) arrayList.get(i)).intValue(), (byte) 24), false);
                            i++;
                            arrayList7 = arrayList7;
                        }
                        cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                        cs5Var.R(kl0Var2, nod.k(wjbVar), false);
                        cs5Var.Z();
                        ViewGroup viewGroup3 = cs5Var.A;
                        ve8Var3.U = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        ve8Var3.U.setPivotY(0.0f);
                        ViewGroup viewGroup4 = se8Var2;
                        viewGroup4.addView(ve8Var3.U, nme.e(-2, -2, 51));
                        viewGroup = ve8Var3.U;
                        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).setOnSizeChangedListener(new k88(ve8Var3, (byte) 4));
                            ve8Var3.U.setOnTouchListener(new a7(ve8Var3, (byte) 14));
                        }
                        if (z11) {
                            ve8Var4 = ve8Var3;
                            z3 = true;
                        } else {
                            mu1 mu1Var5 = mu1Var2;
                            t09 t09Var = new t09((mu1Var2.getUserConfig().e() > mu1Var2.a() ? 1 : (mu1Var2.getUserConfig().e() == mu1Var2.a() ? 0 : -1)) == 0 ? 3 : 0, mu1Var2.getCurrentAccount(), ve8Var3.b, ve8Var3.getContext(), mu1Var5);
                            t09Var.a = true;
                            t09Var.setPadding(gl.L(4.0f) + (k96.a0 ? 0 : 24), gl.L(4.0f), gl.L(4.0f) + (k96.a0 ? 24 : 0), gl.L(22.0f));
                            ve8Var4 = ve8Var3;
                            k27 k27Var6 = k27Var2;
                            t09Var.setDelegate(new c5a(ve8Var4, mu1Var5, k27Var6, t09Var, false, (byte) 12));
                            ve8Var4.R = t09Var;
                            viewGroup4.addView(t09Var, nme.e(-2, (int) ((t09Var.getTopOffset() / gl.p) + 52.0f + 22.0f), 51));
                            z3 = true;
                            t09Var.m(k27Var6, mu1Var5.r8, true);
                            ve8Var4.R.setTransitionProgress(1.0f);
                        }
                        ve8Var4.e();
                        ve8Var4.f0 = new ft1(this, (byte) 0);
                        ve8Var4.show();
                        return z3;
                    }
                }
                z2 = false;
                TLRPC.User user32 = mu1Var.f;
                if (user32 == null) {
                }
                cs5 H22 = cs5.H(se8Var, mu1Var.getResourceProvider(), null, !z10 || z12);
                if (z12) {
                }
                size = arrayList7.size();
                i = 0;
                while (i < size) {
                }
                cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                cs5Var.R(kl0Var2, nod.k(wjbVar), false);
                cs5Var.Z();
                ViewGroup viewGroup32 = cs5Var.A;
                ve8Var3.U = viewGroup32;
                viewGroup32.setPivotX(0.0f);
                ve8Var3.U.setPivotY(0.0f);
                ViewGroup viewGroup42 = se8Var2;
                viewGroup42.addView(ve8Var3.U, nme.e(-2, -2, 51));
                viewGroup = ve8Var3.U;
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z11) {
                }
                ve8Var4.e();
                ve8Var4.f0 = new ft1(this, (byte) 0);
                ve8Var4.show();
                return z3;
            }
        }
        return false;
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
        StaticLayout staticLayout = h27Var.e;
        if (staticLayout == null || staticLayout.getText() == null) {
            return;
        }
        String charSequence = h27Var.e.getText().toString();
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new nj2(h27Var.L, charSequence, false), 0, spannableString.length(), 33);
        gl.g(spannableString);
        u21.b0(this.a).i(k96.M0(2131752010, null)).j();
    }

    @Override // bb2
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i;
        int i2;
        gl5 b;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        mu1 mu1Var = this.a;
        if (!isEmpty) {
            d01.t(mu1Var.getParentActivity(), "https://" + mu1Var.getMessagesController().N2 + "/nft/" + str);
            return;
        }
        i = ((d) mu1Var).currentAccount;
        xh8 xh8Var = new xh8(mu1Var, i, user, null, null, mu1Var.Ba);
        gb2Var.getLocationOnScreen(new int[2]);
        xh8Var.q2 = gb2Var.getNameStatusX();
        xh8Var.r2 = gb2Var.getNameStatusY();
        xh8Var.u2 = gb2Var.getScaleX();
        xh8Var.s2 = gb2Var.getLeft();
        xh8Var.t2 = gb2Var.getTop();
        xh8Var.v2 = gb2Var;
        int f = l7c.f(user);
        if (f < 7) {
            xh8Var.p2 = Integer.valueOf(mu1Var.getThemedColor(bkb.q8[f]));
        } else {
            i2 = ((d) mu1Var).currentAccount;
            ea7 ea7Var = na7.q1(i2).E3;
            da7 d = ea7Var != null ? ea7Var.d(f) : null;
            xh8Var.p2 = d != null ? Integer.valueOf(d.f()) : null;
        }
        tl tlVar = gb2Var.Ca;
        if (tlVar != null && (tlVar.f[0] instanceof vl)) {
            xh8Var.u2 *= 0.95f;
            if (document != null) {
                be0 be0Var = new be0(mu1Var.getParentActivity());
                kcb d2 = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = gl5.b(document);
                    if (d2 != null) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    str2 = "160_160_g";
                } else {
                    if (d2 != null && k27.K2(document, false)) {
                        d2.e = 512;
                        d2.f = 512;
                    }
                    b = gl5.b(document);
                    str2 = "160_160";
                }
                gl5 gl5Var = b;
                String str3 = str2;
                be0Var.setLayerNum(7);
                be0Var.setRoundRadius(gl.L(4.0f));
                be0Var.j(gl5Var, str3, gl5.c(w, document), "140_140", d2, document);
                if (k27.B4(document)) {
                    Integer num = xh8Var.p2;
                    be0Var.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : mu1Var.getThemedColor(bkb.u6), PorterDuff.Mode.SRC_IN));
                    xh8Var.x2 = k27.i1(document);
                } else {
                    xh8Var.x2 = k27.i1(document);
                }
                xh8Var.w2 = be0Var;
                xh8Var.z2 = true;
            }
        }
        mu1Var.showDialog(xh8Var);
    }

    @Override // bb2
    public final void E0(gb2 gb2Var, long j) {
        Bundle k = ls6.k(j, "user_id");
        d dVar = this.a;
        if (dVar.getMessagesController().A(k, dVar, gb2Var.getMessageObject(), null)) {
            dVar.presentFragment(new mu1(k));
        }
    }

    @Override // bb2
    public final gib E2() {
        return this.a.u9;
    }

    @Override // bb2
    public final void F(gb2 gb2Var) {
        k27 messageObject;
        if (gb2Var == null || (messageObject = gb2Var.getMessageObject()) == null || messageObject.k == null) {
            return;
        }
        int e1 = messageObject.e1();
        mu1 mu1Var = this.a;
        if (mu1Var.ac == e1 && mu1Var.bc == 7) {
            return;
        }
        TLRPC.InputPeer h1 = mu1Var.getMessagesController().h1(k27.B0(messageObject.k));
        TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
        getrichmessage.peer = h1;
        getrichmessage.id = e1;
        c01 c01Var = mu1Var.ec;
        if (c01Var != null) {
            c01Var.a(true);
            mu1Var.ec = null;
        }
        int[] iArr = new int[1];
        pp1 pp1Var = new pp1(mu1Var, e1, gb2Var, (byte) 2);
        pp1Var.b = new aj1(mu1Var, iArr, (byte) 10);
        mu1Var.ec = pp1Var;
        pp1Var.d();
        iArr[0] = mu1Var.getConnectionsManager().sendRequestTyped(getrichmessage, new hc((byte) 0), new jl1(mu1Var, pp1Var, iArr, gb2Var, messageObject, (byte) 2));
    }

    @Override // bb2
    public final boolean F0(gb2 gb2Var) {
        int i;
        k27 messageObject;
        TLRPC.Message message;
        if (gb2Var == null) {
            return false;
        }
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() == null) {
            return false;
        }
        i = ((d) mu1Var).currentAccount;
        if (!na7.q1(i).v4() || (messageObject = gb2Var.getMessageObject()) == null || (message = messageObject.k) == null || message.rich_message == null) {
            return false;
        }
        if (!messageObject.L2 || message.translatedRichMessage == null) {
            return messageObject.u(mu1Var.e);
        }
        return false;
    }

    @Override // bb2
    public final void F1(gb2 gb2Var, int i) {
        int i2;
        int i3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String e;
        int i4;
        TLRPC.User user2;
        int i5;
        TLRPC.WebPage webPage;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        k27 messageObject = gb2Var.getMessageObject();
        File file = null;
        byte b = 1;
        if (i == 19) {
            c01 c01Var = this.a.ec;
            if (c01Var != null) {
                c01Var.a(true);
            }
            this.a.ec = gb2Var.getMessageObject() != null ? new pt1(this, gb2Var, (byte) 2) : null;
            mu1 mu1Var = this.a;
            final c01 c01Var2 = mu1Var.ec;
            final Activity parentActivity = mu1Var.getParentActivity();
            final wjb resourceProvider = this.a.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c01Var2.d();
            c01Var2.b = new tm0(atomicBoolean, (byte) 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b2 = ym0.b(messageObject);
            TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-messageObject.Z0()));
            final boolean z = K0 != null && hc2.V(K0);
            final long j = messageObject.k.date * 1000;
            on0.e(messageObject, new p8c(atomicBoolean, c01Var2, z, b2, j, tL_messageMediaGiveaway2, parentActivity, resourceProvider) { // from class: um0
                public final /* synthetic */ AtomicBoolean a;
                public final /* synthetic */ c01 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ TLRPC.TL_messageMediaGiveaway e;
                public final /* synthetic */ Activity f;
                public final /* synthetic */ wjb g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override // p8c
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (this.a.get()) {
                        return;
                    }
                    this.b.b();
                    boolean z2 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                    boolean z3 = this.c;
                    String str = this.d;
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                    Activity activity = this.f;
                    wjb wjbVar = this.g;
                    if (z2) {
                        ym0.d(z3, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, wjbVar);
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ym0.e(z3, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, wjbVar);
                    }
                }
            }, new vm0(atomicBoolean, c01Var2, (byte) 0));
            return;
        }
        byte b3 = 21;
        if (i == 21) {
            a.t();
            boolean z2 = w01.a;
            a.q();
            d01.t(this.a.getParentActivity(), w01.g);
            return;
        }
        if (i == 84) {
            this.a.Aa(gb2Var);
            return;
        }
        if (i == 80) {
            mu1 mu1Var2 = this.a;
            pm pmVar = gf8.L1;
            if (mu1Var2.getParentActivity() != null) {
                mu1Var2.showDialog(new gf8(mu1Var2.getContext(), mu1Var2.getCurrentAccount(), messageObject, mu1Var2.getResourceProvider()));
                return;
            }
            return;
        }
        if (i == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 == null || (webPage = messageMedia4.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                this.a.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        byte b4 = 5;
        if (i == 5) {
            long j2 = messageObject.k.media.user_id;
            if (j2 != 0) {
                i5 = ((d) this.a).currentAccount;
                user2 = na7.q1(i5).V1(Long.valueOf(j2));
            } else {
                user2 = null;
            }
            mu1 mu1Var3 = this.a;
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                mu1Var3.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File f1 = gl.f1();
                    f1.mkdirs();
                    file = new File(f1, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                mu1Var3.showDialog(new b48(mu1Var3, null, user2, null, file, p38.h(str, false), str3, str4, mu1Var3.Ba));
                return;
            } catch (Exception e2) {
                fa4.g(e2, true);
                return;
            }
        }
        if (i == 30) {
            this.a.presentFragment(new mu1(ls6.k(messageObject.k.media.user_id, "user_id")));
            return;
        }
        if (i == 31) {
            long j3 = messageObject.k.media.user_id;
            if (j3 != 0) {
                i4 = ((d) this.a).currentAccount;
                user = na7.q1(i4).V1(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    e = messageObject.Z1.toString();
                } else if (TextUtils.isEmpty(user.phone)) {
                    String str5 = k27.n1(messageObject.k).phone_number;
                    e = !TextUtils.isEmpty(str5) ? p38.f().e(str5) : k96.M0(2131747639, null);
                } else {
                    e = yjb.k(new StringBuilder("+"), user.phone, p38.f());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", e);
                bundle2.putBoolean("addContact", true);
                this.a.presentFragment(new it2(bundle2));
                return;
            }
            return;
        }
        if (i == 23 || i == 24) {
            boolean z3 = i == 24;
            TLRPC.Message message2 = messageObject.k;
            TLRPC.WebPage webPage2 = (message2 == null || (messageMedia = message2.media) == null) ? null : messageMedia.webpage;
            if (webPage2 == null || webPage2.url == null) {
                return;
            }
            Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage2.url);
            c01 c01Var3 = this.a.ec;
            if (c01Var3 != null) {
                c01Var3.a(true);
            }
            this.a.ec = gb2Var.getMessageObject() != null ? new pt1(this, gb2Var, (byte) 3) : null;
            if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                String group = matcher.group(1);
                i2 = ((d) this.a).currentAccount;
                if (hq6.d0(i2).q0(group) == null) {
                    this.a.ec.d();
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = group;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                    i3 = ((d) this.a).currentAccount;
                    this.a.ec.b = new eg(this, ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickerSet, new i81(b, this, z3)), b3);
                    return;
                }
            }
            d01.s(this.a.getParentActivity(), Uri.parse(webPage2.url), true, true, false, this.a.ec, null, false, true, false, false);
            return;
        }
        if (messageObject.q4()) {
            this.a.O9(messageObject, false, false);
            if (messageObject.T0 != null) {
                c01 c01Var4 = this.a.ec;
                if (c01Var4 != null) {
                    c01Var4.a(true);
                }
                this.a.ec = gb2Var.getMessageObject() != null ? new pt1(this, gb2Var, (byte) 4) : null;
                Activity parentActivity2 = this.a.getParentActivity();
                Uri parse = Uri.parse(messageObject.T0);
                mu1 mu1Var4 = this.a;
                d01.s(parentActivity2, parse, true, false, false, mu1Var4.ec, null, false, mu1Var4.getMessagesController().k4.A2.f, false, false);
                return;
            }
            return;
        }
        TLRPC.WebPage W1 = messageObject.W1();
        if (W1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
            W1 = messageMedia2.webpage;
        }
        TLRPC.WebPage webPage3 = W1;
        if (webPage3 != null) {
            if (webPage3.attributes != null) {
                for (int i6 = 0; i6 < webPage3.attributes.size(); i6++) {
                    if ((webPage3.attributes.get(i6) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPage3.attributes.get(i6)).storyItem) != null) {
                        storyItem.dialogId = cf3.n(tL_webPageAttributeStory.peer);
                        tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                        tL_webPageAttributeStory.storyItem.messageType = 1;
                        this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), tL_webPageAttributeStory.storyItem, p2b.a(this.a.A0));
                        return;
                    }
                }
            }
            if (this.a.ja(webPage3.url, gb2Var, null, messageObject.e1(), 2)) {
                return;
            }
            c01 c01Var5 = this.a.ec;
            if (c01Var5 != null) {
                c01Var5.a(true);
            }
            this.a.ec = gb2Var.getMessageObject() != null ? new pt1(this, gb2Var, b4) : null;
            d01.s(this.a.getParentActivity(), Uri.parse(webPage3.url), true, true, false, this.a.ec, null, false, true, false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x04f8, code lost:
    
        if (r8.paid_reactions_available == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04fe, code lost:
    
        if (r11.isEmpty() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0538, code lost:
    
        if (r6.f != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0540, code lost:
    
        if (hc2.p0(r6.e) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0546, code lost:
    
        if (r11.isEmpty() != false) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0828 A[LOOP:2: B:227:0x0826->B:228:0x0828, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04c9  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r11v42 */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        gpb gpbVar;
        TLRPC.TodoItem todoItem2;
        final int i;
        TLRPC.TodoCompletion todoCompletion;
        k27 k27Var;
        String str;
        boolean z;
        final ?? r11;
        mu1 mu1Var;
        gpb gpbVar2;
        int i2;
        kl0 kl0Var;
        k27 k27Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        kl0 kl0Var2;
        ViewGroup viewGroup;
        boolean z5;
        k27 k27Var3;
        jpb jpbVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        mu1 mu1Var2;
        hl1 hl1Var;
        cs5 cs5Var;
        boolean z6;
        kl0 kl0Var3;
        int size;
        int i3;
        ViewGroup viewGroup2;
        jpb jpbVar2;
        boolean z7;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        String str2;
        boolean z8;
        final byte b;
        String str3;
        Calendar calendar;
        final mu1 mu1Var3 = this.a;
        if (mu1Var3.getParentActivity() != null && mu1Var3.getParentActivity() != null) {
            je5 je5Var = mu1Var3.M1;
            if (je5Var != null && je5Var.W) {
                je5Var.f(true);
            }
            ks1 ks1Var = mu1Var3.Q1;
            if (ks1Var != null && ks1Var.W) {
                ks1Var.f(true);
            }
            k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
            TLRPC.MessageMedia m1 = k27.m1(primaryMessageObject);
            if (primaryMessageObject != null && (m1 instanceof TLRPC.TL_messageMediaToDo)) {
                mu1Var3.v5 = primaryMessageObject;
                mu1Var3.w5 = null;
                final jpb jpbVar3 = new jpb(mu1Var3.getParentActivity(), mu1Var3.getResourceProvider());
                final int i4 = todoItem.id;
                jpbVar3.L = gb2Var;
                jpbVar3.P = i4;
                k27 messageObject = gb2Var.getMessageObject();
                jpbVar3.H = messageObject;
                jpbVar3.I = messageObject != null && messageObject.O3();
                gb2 gb2Var2 = jpbVar3.L;
                gpb gpbVar3 = jpbVar3.c;
                if (gb2Var2 != null) {
                    jpbVar3.M = mu1Var3.P9 - gl.L(4.0f);
                    jpbVar3.N = gb2Var.n;
                    if (gb2Var.getParent() instanceof View) {
                        View view = (View) gb2Var.getParent();
                        jpbVar3.M = view.getY() + jpbVar3.M;
                        jpbVar3.N = view.getY() + jpbVar3.N;
                    }
                    int width = jpbVar3.L.getWidth();
                    int height = jpbVar3.L.getHeight();
                    jpbVar3.L.getHeight();
                    hpb hpbVar = new hpb(jpbVar3, jpbVar3.getContext(), y6c.t0, jpbVar3.L.getResourcesProvider(), i4, width, height);
                    jpbVar3.J = hpbVar;
                    jpbVar3.L.s0(hpbVar);
                    jpbVar3.J.t0(jpbVar3.L);
                    jpbVar3.J.setDelegate(new ipb(jpbVar3));
                    hpb hpbVar2 = jpbVar3.J;
                    k27 k27Var4 = jpbVar3.H;
                    f27 currentMessagesGroup = jpbVar3.L.getCurrentMessagesGroup();
                    gb2 gb2Var3 = jpbVar3.L;
                    hpbVar2.z3(k27Var4, currentMessagesGroup, gb2Var3.G, gb2Var3.F, gb2Var3.H, false);
                    gpbVar3.addView(jpbVar3.J, new FrameLayout.LayoutParams(jpbVar3.L.getWidth(), height, 51));
                    ue8 ue8Var = new ue8(jpbVar3.getContext(), y6c.t0, jpbVar3.L.getResourcesProvider(), width, height, (byte) 1);
                    jpbVar3.K = ue8Var;
                    jpbVar3.L.u0(ue8Var);
                    jpbVar3.L.s0(jpbVar3.K);
                    jpbVar3.K.t0(jpbVar3.L);
                    jpbVar3.K.setDelegate(new eef((byte) 27));
                    ue8 ue8Var2 = jpbVar3.K;
                    k27 k27Var5 = jpbVar3.H;
                    f27 currentMessagesGroup2 = jpbVar3.L.getCurrentMessagesGroup();
                    gb2 gb2Var4 = jpbVar3.L;
                    ue8Var2.z3(k27Var5, currentMessagesGroup2, gb2Var4.G, gb2Var4.F, gb2Var4.H, false);
                    gpbVar3.addView(jpbVar3.K, new FrameLayout.LayoutParams(jpbVar3.L.getWidth(), height, 51));
                }
                vq1 vq1Var = jpbVar3.e;
                vq1Var.bringToFront();
                gpb gpbVar4 = jpbVar3.d;
                gpbVar4.bringToFront();
                jpbVar3.h.bringToFront();
                vq1Var.w(false);
                wjb wjbVar = jpbVar3.a;
                cs5 G = cs5.G(gpbVar3, wjbVar, null);
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) k27.m1(jpbVar3.H);
                int i5 = 0;
                while (true) {
                    gpbVar = gpbVar3;
                    if (i5 >= tL_messageMediaToDo.todo.list.size()) {
                        todoItem2 = null;
                        i = -1;
                        break;
                    }
                    if (tL_messageMediaToDo.todo.list.get(i5).id == i4) {
                        todoItem2 = tL_messageMediaToDo.todo.list.get(i5);
                        i = i5;
                        break;
                    }
                    i5++;
                    gpbVar3 = gpbVar;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= tL_messageMediaToDo.completions.size()) {
                        todoCompletion = null;
                        break;
                    }
                    if (tL_messageMediaToDo.completions.get(i6).id == i4) {
                        todoCompletion = tL_messageMediaToDo.completions.get(i6);
                        break;
                    }
                    i6++;
                }
                if (!jpbVar3.H.q()) {
                    k27Var = primaryMessageObject;
                    str = null;
                    z = false;
                } else if (todoCompletion != null) {
                    long j = todoCompletion.date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        k27Var = primaryMessageObject;
                    } catch (Exception e) {
                        e = e;
                        k27Var = primaryMessageObject;
                    }
                    try {
                        int i7 = calendar.get(6);
                        int i8 = calendar.get(1);
                        calendar.setTimeInMillis(j);
                        int i9 = calendar.get(6);
                        int i10 = calendar.get(1);
                        str3 = (i9 == i7 && i8 == i10) ? k96.a0(null, null, 2131743840, k96.D0().o0().format(new Date(j))) : (i9 + 1 == i7 && i8 == i10) ? k96.a0(null, null, 2131743839, k96.D0().o0().format(new Date(j))) : Math.abs(System.currentTimeMillis() - j) < 31536000000L ? k96.a0(null, null, 2131743841, k96.D0().p0().format(new Date(j)), k96.D0().o0().format(new Date(j))) : k96.a0(null, null, 2131743841, k96.D0().B0().format(new Date(j)), k96.D0().o0().format(new Date(j)));
                        b = 1;
                    } catch (Exception e2) {
                        e = e2;
                        b = 1;
                        fa4.g(e, true);
                        str3 = "LOC_ERR";
                        G.o(14, -1, str3);
                        G.j();
                        str = null;
                        z = false;
                        G.b(R.drawable.msg_cancel, k96.M0(2131743811, null), new Runnable() { // from class: dpb
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = b;
                                int i11 = i4;
                                mu1 mu1Var4 = mu1Var3;
                                jpb jpbVar4 = jpbVar3;
                                switch (b2) {
                                    case 0:
                                        ie8 ie8Var = new ie8(mu1Var4);
                                        ie8Var.r0(k27.m1(jpbVar4.H), false, i11);
                                        ie8Var.f0 = new kq8(jpbVar4, mu1Var4, (byte) 27);
                                        mu1Var4.presentFragment(ie8Var);
                                        jpbVar4.b(false);
                                        break;
                                    case 1:
                                        if (mu1Var4.P7()) {
                                            Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                        } else {
                                            hpb hpbVar3 = jpbVar4.J;
                                            hpbVar3.P3(hpbVar3.e2(i11), false);
                                        }
                                        jpbVar4.b(true);
                                        break;
                                    default:
                                        if (mu1Var4.P7()) {
                                            Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                        } else {
                                            hpb hpbVar4 = jpbVar4.J;
                                            hpbVar4.P3(hpbVar4.e2(i11), false);
                                        }
                                        jpbVar4.b(true);
                                        break;
                                }
                            }
                        }, false);
                        if (todoItem2 == null) {
                        }
                        if (jpbVar3.H.u(mu1Var3.e)) {
                        }
                        mu1Var = mu1Var3;
                        gpbVar2 = gpbVar;
                        i2 = 51;
                        G.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                        nl0 k = nod.k(wjbVar);
                        kl0Var = jpbVar3.G;
                        G.R(kl0Var, k, r11);
                        G.Z();
                        ViewGroup viewGroup3 = G.A;
                        jpbVar3.R = viewGroup3;
                        viewGroup3.setPivotX(0.0f);
                        jpbVar3.R.setPivotY(0.0f);
                        gpbVar4.addView(jpbVar3.R, nme.e(-2, -2, i2));
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        mu1Var.B6(k27Var, arrayList3, arrayList4, arrayList5);
                        hl1 hl1Var2 = new hl1(mu1Var, (byte) 11);
                        k27Var2 = jpbVar3.H;
                        ArrayList arrayList6 = mu1Var.getMediaDataController().n;
                        if (mu1Var.y()) {
                        }
                        if (k27Var2.k3()) {
                        }
                        boolean z9 = z3;
                        if (!z2) {
                        }
                        if (mu1Var.e == null) {
                        }
                        kl0Var2 = kl0Var;
                        viewGroup = gpbVar4;
                        if (!z2) {
                        }
                        z5 = false;
                        TLRPC.User user3 = mu1Var.f;
                        if (user3 == null) {
                        }
                        boolean z10 = z5;
                        cs5 H = cs5.H(gpbVar2, mu1Var.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList3.size();
                        while (i3 < size) {
                        }
                        cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                        cs5Var.R(kl0Var3, nod.k(wjbVar), false);
                        cs5Var.Z();
                        ViewGroup viewGroup4 = cs5Var.A;
                        jpbVar.T = viewGroup4;
                        viewGroup4.setPivotX(0.0f);
                        jpbVar.T.setPivotY(0.0f);
                        viewGroup.addView(jpbVar.T, nme.e(-2, -2, 51));
                        viewGroup2 = jpbVar.T;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z6) {
                        }
                        jpbVar2.e();
                        jpbVar2.d0 = new ft1(this, (byte) 5);
                        jpbVar2.show();
                        return z7;
                    }
                    G.o(14, -1, str3);
                    G.j();
                    str = null;
                    z = false;
                    G.b(R.drawable.msg_cancel, k96.M0(2131743811, null), new Runnable() { // from class: dpb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            int i11 = i4;
                            mu1 mu1Var4 = mu1Var3;
                            jpb jpbVar4 = jpbVar3;
                            switch (b2) {
                                case 0:
                                    ie8 ie8Var = new ie8(mu1Var4);
                                    ie8Var.r0(k27.m1(jpbVar4.H), false, i11);
                                    ie8Var.f0 = new kq8(jpbVar4, mu1Var4, (byte) 27);
                                    mu1Var4.presentFragment(ie8Var);
                                    jpbVar4.b(false);
                                    break;
                                case 1:
                                    if (mu1Var4.P7()) {
                                        Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                    } else {
                                        hpb hpbVar3 = jpbVar4.J;
                                        hpbVar3.P3(hpbVar3.e2(i11), false);
                                    }
                                    jpbVar4.b(true);
                                    break;
                                default:
                                    if (mu1Var4.P7()) {
                                        Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                    } else {
                                        hpb hpbVar4 = jpbVar4.J;
                                        hpbVar4.P3(hpbVar4.e2(i11), false);
                                    }
                                    jpbVar4.b(true);
                                    break;
                            }
                        }
                    }, false);
                } else {
                    k27Var = primaryMessageObject;
                    str = null;
                    z = false;
                    final byte b2 = 2;
                    G.b(R.drawable.msg_select, k96.M0(2131743848, null), new Runnable() { // from class: dpb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            int i11 = i4;
                            mu1 mu1Var4 = mu1Var3;
                            jpb jpbVar4 = jpbVar3;
                            switch (b22) {
                                case 0:
                                    ie8 ie8Var = new ie8(mu1Var4);
                                    ie8Var.r0(k27.m1(jpbVar4.H), false, i11);
                                    ie8Var.f0 = new kq8(jpbVar4, mu1Var4, (byte) 27);
                                    mu1Var4.presentFragment(ie8Var);
                                    jpbVar4.b(false);
                                    break;
                                case 1:
                                    if (mu1Var4.P7()) {
                                        Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                    } else {
                                        hpb hpbVar3 = jpbVar4.J;
                                        hpbVar3.P3(hpbVar3.e2(i11), false);
                                    }
                                    jpbVar4.b(true);
                                    break;
                                default:
                                    if (mu1Var4.P7()) {
                                        Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                    } else {
                                        hpb hpbVar4 = jpbVar4.J;
                                        hpbVar4.P3(hpbVar4.e2(i11), false);
                                    }
                                    jpbVar4.b(true);
                                    break;
                            }
                        }
                    }, false);
                }
                if (todoItem2 == null) {
                    G.b(R.drawable.menu_reply, k96.M0(2131743832, str), new r1b(jpbVar3, mu1Var3, todoItem2, (byte) 16), z);
                    if (k27.B0(jpbVar3.H.k) < 0) {
                        na7 q1 = na7.q1(jpbVar3.H.K1);
                        String q = cf3.q(q1.Z1(k27.B0(jpbVar3.H.k)));
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(q1.N2);
                        sb.append("/");
                        if (TextUtils.isEmpty(q)) {
                            q = "c/" + (-k27.B0(jpbVar3.H.k));
                        }
                        sb.append(q);
                        sb.append("/");
                        sb.append(jpbVar3.H.e1());
                        sb.append("?task=");
                        sb.append(todoItem2.id);
                        String sb2 = sb.toString();
                        str2 = null;
                        z8 = false;
                        G.b(R.drawable.msg_link, k96.M0(2131751750, null), new a5b((Object) jpbVar3, (Object) sb2, (byte) 14), false);
                    } else {
                        str2 = null;
                        z8 = false;
                    }
                    G.b(R.drawable.msg_copy, k96.M0(2131751755, str2), new a5b((Object) jpbVar3, (Object) todoItem2, (byte) 15), z8);
                    r11 = z8;
                } else {
                    r11 = z;
                }
                if (jpbVar3.H.u(mu1Var3.e)) {
                    G.b(R.drawable.msg_edit, k96.M0(2131743835, null), new Runnable() { // from class: dpb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = r11;
                            int i11 = i;
                            mu1 mu1Var4 = mu1Var3;
                            jpb jpbVar4 = jpbVar3;
                            switch (b22) {
                                case 0:
                                    ie8 ie8Var = new ie8(mu1Var4);
                                    ie8Var.r0(k27.m1(jpbVar4.H), false, i11);
                                    ie8Var.f0 = new kq8(jpbVar4, mu1Var4, (byte) 27);
                                    mu1Var4.presentFragment(ie8Var);
                                    jpbVar4.b(false);
                                    break;
                                case 1:
                                    if (mu1Var4.P7()) {
                                        Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                    } else {
                                        hpb hpbVar3 = jpbVar4.J;
                                        hpbVar3.P3(hpbVar3.e2(i11), false);
                                    }
                                    jpbVar4.b(true);
                                    break;
                                default:
                                    if (mu1Var4.P7()) {
                                        Toast.makeText(jpbVar4.getContext(), k96.M0(2131748301, null), 1).show();
                                    } else {
                                        hpb hpbVar4 = jpbVar4.J;
                                        hpbVar4.P3(hpbVar4.e2(i11), false);
                                    }
                                    jpbVar4.b(true);
                                    break;
                            }
                        }
                    }, r11);
                    if (tL_messageMediaToDo.todo.list.size() > 1) {
                        mu1Var = mu1Var3;
                        gpbVar2 = gpbVar;
                        i2 = 51;
                        G.b(R.drawable.msg_delete, k96.M0(2131743836, null), new ica((Object) jpbVar3, (Object) tL_messageMediaToDo, i4, (Object) mu1Var, (byte) 10), r11);
                        G.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                        nl0 k2 = nod.k(wjbVar);
                        kl0Var = jpbVar3.G;
                        G.R(kl0Var, k2, r11);
                        G.Z();
                        ViewGroup viewGroup32 = G.A;
                        jpbVar3.R = viewGroup32;
                        viewGroup32.setPivotX(0.0f);
                        jpbVar3.R.setPivotY(0.0f);
                        gpbVar4.addView(jpbVar3.R, nme.e(-2, -2, i2));
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        ArrayList arrayList52 = new ArrayList();
                        mu1Var.B6(k27Var, arrayList32, arrayList42, arrayList52);
                        hl1 hl1Var22 = new hl1(mu1Var, (byte) 11);
                        k27Var2 = jpbVar3.H;
                        ArrayList arrayList62 = mu1Var.getMediaDataController().n;
                        z2 = mu1Var.y() && !mu1Var.P7() && mu1Var.f == null && k27Var2.w2() && !((hc2.T(mu1Var.e) && !mu1Var.e.megagroup) || hc2.p0(mu1Var.e) || arrayList62.isEmpty() || !k27Var2.k.reactions.can_see_list || k27Var2.k4());
                        if (k27Var2.k3()) {
                            TLRPC.ChatFull L0 = mu1Var.getMessagesController().L0(-k27Var2.Z0());
                            if (L0 != null) {
                                if (mu1Var.y()) {
                                    if (mu1Var.g4 == 5) {
                                        if (mu1Var.P7()) {
                                            if (!k27Var2.c4()) {
                                                if (L0.available_reactions instanceof TLRPC.TL_chatReactionsNone) {
                                                }
                                            }
                                        }
                                    }
                                }
                                z3 = false;
                            }
                            z3 = true;
                        } else {
                            if (!k27Var2.k4() && mu1Var.g4 != 5 && !mu1Var.y() && !mu1Var.P7() && k27Var2.c4()) {
                                if ((r8 = mu1Var.r8) != null) {
                                }
                            }
                            z3 = false;
                        }
                        boolean z92 = z3;
                        z4 = (!z2 || mu1Var.P7() || mu1Var.e == null || !k27Var2.O3() || !k27Var2.p4() || k27Var2.Y2() || k27Var2.n4() || k27Var2.m4() || k27Var2.k.media_unread || k27Var2.E4() || ConnectionsManager.getInstance(mu1Var.getCurrentAccount()).getCurrentTime() - k27Var2.k.date >= mu1Var.getMessagesController().k4.O0.f() || (!hc2.n0(mu1Var.e) && hc2.T(mu1Var.e)) || (chatFull = mu1Var.r8) == null || chatFull.participants_count > mu1Var.getMessagesController().k4.N0.f() || (k27Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || mu1Var.g4 == 3 || !k27Var2.z() || hc2.p0(mu1Var.e)) ? false : true;
                        if (mu1Var.e == null && !k27Var2.N3() && hc2.p0(mu1Var.e)) {
                            kl0Var2 = kl0Var;
                            if (hc2.A(mu1Var.getCurrentAccount(), mu1Var.e, 24)) {
                                viewGroup = gpbVar4;
                                long j2 = mu1Var.e.linked_monoforum_id;
                                k27Var2.Z0();
                                if (!z2 && mu1Var.e == null && mu1Var.h == null && (user = mu1Var.f) != null && !l7c.D(user) && !l7c.B(mu1Var.f) && !l7c.u(mu1Var.f)) {
                                    user2 = mu1Var.f;
                                    if (!user2.bot && !l7c.C(user2.id) && (((userFull = mu1Var.s8) == null || !userFull.read_dates_private) && !mu1Var.P7() && k27Var2.O3() && k27Var2.p4() && !k27Var2.Y2() && !k27Var2.n4() && !k27Var2.m4() && !k27Var2.k.media_unread && !k27Var2.E4() && mu1Var.getConnectionsManager().getCurrentTime() - k27Var2.k.date < mu1Var.getMessagesController().k4.P0.f() && !(k27Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                                        z5 = true;
                                        TLRPC.User user32 = mu1Var.f;
                                        boolean z11 = ((user32 == null && (l7c.B(user32) || l7c.u(mu1Var.f))) || mu1Var.P7() || !k27Var2.X2() || (k27Var2.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) ? false : true;
                                        boolean z102 = z5;
                                        cs5 H2 = cs5.H(gpbVar2, mu1Var.getResourceProvider(), null, !z2 || z4);
                                        if (z4) {
                                            k27Var3 = k27Var2;
                                            jpbVar = jpbVar3;
                                            arrayList = arrayList42;
                                            arrayList2 = arrayList52;
                                            mu1Var2 = mu1Var;
                                            hl1Var = hl1Var22;
                                            cs5Var = H2;
                                            z6 = z92;
                                            kl0Var3 = kl0Var2;
                                            if (z102) {
                                                cs5Var.q(new n37(jpbVar.getContext(), 0, k27Var3, new cpb(jpbVar, (byte) 0), jpbVar.a), nme.o(-1, 36));
                                                cs5Var.j();
                                            } else if (z11) {
                                                cs5Var.q(new n37(jpbVar.getContext(), 1, k27Var3, new cpb(jpbVar, (byte) 2), jpbVar.a), nme.o(-1, 36));
                                                cs5Var.j();
                                            }
                                        } else {
                                            t37 t37Var = new t37(jpbVar3.getContext(), mu1Var.getCurrentAccount(), k27Var2, mu1Var.e);
                                            FrameLayout frameLayout = new FrameLayout(jpbVar3.getContext());
                                            frameLayout.addView(t37Var, nme.c(36.0f, -1));
                                            cs5 K = H2.K();
                                            a8 a8Var = new a8(0, jpbVar3.a, jpbVar3.getContext(), true, false);
                                            a8Var.setItemHeight(44);
                                            k27Var3 = k27Var2;
                                            a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
                                            a8Var.getTextView().setPadding(k96.a0 ? 0 : gl.L(40.0f), 0, k96.a0 ? gl.L(40.0f) : 0, 0);
                                            FrameLayout frameLayout2 = new FrameLayout(jpbVar3.getContext());
                                            LinearLayout linearLayout = new LinearLayout(jpbVar3.getContext());
                                            zkb.h(bkb.F8, wjbVar, linearLayout);
                                            linearLayout.setOrientation(1);
                                            arrayList2 = arrayList52;
                                            mu1Var2 = mu1Var;
                                            o39 a = t37Var.a();
                                            frameLayout2.addView(a8Var);
                                            linearLayout.addView(frameLayout2);
                                            z6 = z92;
                                            linearLayout.addView(new j8(jpbVar3.getContext(), wjbVar), nme.o(-1, 8));
                                            frameLayout2.setOnClickListener(new qe8(H2, (byte) 1));
                                            hl1Var = hl1Var22;
                                            arrayList = arrayList42;
                                            kl0Var3 = kl0Var2;
                                            fpb fpbVar = new fpb(jpbVar3, t37Var, mu1Var2, a, linearLayout, H2, K);
                                            cs5Var = H2;
                                            jpbVar = jpbVar3;
                                            t37Var.setOnClickListener(fpbVar);
                                            linearLayout.addView(a, nme.o(-1, -2));
                                            K.p(linearLayout);
                                            cs5Var.p(frameLayout);
                                            cs5Var.j();
                                        }
                                        size = arrayList32.size();
                                        for (i3 = 0; i3 < size; i3++) {
                                            cs5Var.b(((Integer) arrayList32.get(i3)).intValue(), (CharSequence) arrayList.get(i3), new t79((Object) jpbVar, (Object) hl1Var, ((Integer) arrayList2.get(i3)).intValue(), (byte) 26), false);
                                        }
                                        cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                                        cs5Var.R(kl0Var3, nod.k(wjbVar), false);
                                        cs5Var.Z();
                                        ViewGroup viewGroup42 = cs5Var.A;
                                        jpbVar.T = viewGroup42;
                                        viewGroup42.setPivotX(0.0f);
                                        jpbVar.T.setPivotY(0.0f);
                                        viewGroup.addView(jpbVar.T, nme.e(-2, -2, 51));
                                        viewGroup2 = jpbVar.T;
                                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup2).setOnSizeChangedListener(new hza(jpbVar, (byte) 17));
                                            jpbVar.T.setOnTouchListener(new a7(jpbVar, (byte) 17));
                                        }
                                        if (z6) {
                                            jpbVar2 = jpbVar;
                                            z7 = true;
                                        } else {
                                            mu1 mu1Var4 = mu1Var2;
                                            t09 t09Var = new t09((mu1Var2.getUserConfig().e() > mu1Var2.a() ? 1 : (mu1Var2.getUserConfig().e() == mu1Var2.a() ? 0 : -1)) == 0 ? 3 : 0, mu1Var2.getCurrentAccount(), jpbVar.a, jpbVar.getContext(), mu1Var4);
                                            t09Var.a = true;
                                            t09Var.setPadding(gl.L(4.0f) + (k96.a0 ? 0 : 24), gl.L(4.0f), gl.L(4.0f) + (k96.a0 ? 24 : 0), gl.L(22.0f));
                                            jpbVar2 = jpbVar;
                                            k27 k27Var6 = k27Var3;
                                            t09Var.setDelegate(new c5a(jpbVar2, mu1Var4, k27Var6, t09Var, false, (byte) 16));
                                            jpbVar2.Q = t09Var;
                                            viewGroup.addView(t09Var, nme.e(-2, (int) ((t09Var.getTopOffset() / gl.p) + 52.0f + 22.0f), 51));
                                            z7 = true;
                                            t09Var.m(k27Var6, mu1Var4.r8, true);
                                            jpbVar2.Q.setTransitionProgress(1.0f);
                                        }
                                        jpbVar2.e();
                                        jpbVar2.d0 = new ft1(this, (byte) 5);
                                        jpbVar2.show();
                                        return z7;
                                    }
                                }
                                z5 = false;
                                TLRPC.User user322 = mu1Var.f;
                                if (user322 == null) {
                                }
                                boolean z1022 = z5;
                                cs5 H22 = cs5.H(gpbVar2, mu1Var.getResourceProvider(), null, !z2 || z4);
                                if (z4) {
                                }
                                size = arrayList32.size();
                                while (i3 < size) {
                                }
                                cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                                cs5Var.R(kl0Var3, nod.k(wjbVar), false);
                                cs5Var.Z();
                                ViewGroup viewGroup422 = cs5Var.A;
                                jpbVar.T = viewGroup422;
                                viewGroup422.setPivotX(0.0f);
                                jpbVar.T.setPivotY(0.0f);
                                viewGroup.addView(jpbVar.T, nme.e(-2, -2, 51));
                                viewGroup2 = jpbVar.T;
                                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z6) {
                                }
                                jpbVar2.e();
                                jpbVar2.d0 = new ft1(this, (byte) 5);
                                jpbVar2.show();
                                return z7;
                            }
                        } else {
                            kl0Var2 = kl0Var;
                        }
                        viewGroup = gpbVar4;
                        if (!z2) {
                            user2 = mu1Var.f;
                            if (!user2.bot) {
                                z5 = true;
                                TLRPC.User user3222 = mu1Var.f;
                                if (user3222 == null) {
                                }
                                boolean z10222 = z5;
                                cs5 H222 = cs5.H(gpbVar2, mu1Var.getResourceProvider(), null, !z2 || z4);
                                if (z4) {
                                }
                                size = arrayList32.size();
                                while (i3 < size) {
                                }
                                cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                                cs5Var.R(kl0Var3, nod.k(wjbVar), false);
                                cs5Var.Z();
                                ViewGroup viewGroup4222 = cs5Var.A;
                                jpbVar.T = viewGroup4222;
                                viewGroup4222.setPivotX(0.0f);
                                jpbVar.T.setPivotY(0.0f);
                                viewGroup.addView(jpbVar.T, nme.e(-2, -2, 51));
                                viewGroup2 = jpbVar.T;
                                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                }
                                if (z6) {
                                }
                                jpbVar2.e();
                                jpbVar2.d0 = new ft1(this, (byte) 5);
                                jpbVar2.show();
                                return z7;
                            }
                        }
                        z5 = false;
                        TLRPC.User user32222 = mu1Var.f;
                        if (user32222 == null) {
                        }
                        boolean z102222 = z5;
                        cs5 H2222 = cs5.H(gpbVar2, mu1Var.getResourceProvider(), null, !z2 || z4);
                        if (z4) {
                        }
                        size = arrayList32.size();
                        while (i3 < size) {
                        }
                        cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                        cs5Var.R(kl0Var3, nod.k(wjbVar), false);
                        cs5Var.Z();
                        ViewGroup viewGroup42222 = cs5Var.A;
                        jpbVar.T = viewGroup42222;
                        viewGroup42222.setPivotX(0.0f);
                        jpbVar.T.setPivotY(0.0f);
                        viewGroup.addView(jpbVar.T, nme.e(-2, -2, 51));
                        viewGroup2 = jpbVar.T;
                        if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        if (z6) {
                        }
                        jpbVar2.e();
                        jpbVar2.d0 = new ft1(this, (byte) 5);
                        jpbVar2.show();
                        return z7;
                    }
                }
                mu1Var = mu1Var3;
                gpbVar2 = gpbVar;
                i2 = 51;
                G.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                nl0 k22 = nod.k(wjbVar);
                kl0Var = jpbVar3.G;
                G.R(kl0Var, k22, r11);
                G.Z();
                ViewGroup viewGroup322 = G.A;
                jpbVar3.R = viewGroup322;
                viewGroup322.setPivotX(0.0f);
                jpbVar3.R.setPivotY(0.0f);
                gpbVar4.addView(jpbVar3.R, nme.e(-2, -2, i2));
                ArrayList arrayList322 = new ArrayList();
                ArrayList arrayList422 = new ArrayList();
                ArrayList arrayList522 = new ArrayList();
                mu1Var.B6(k27Var, arrayList322, arrayList422, arrayList522);
                hl1 hl1Var222 = new hl1(mu1Var, (byte) 11);
                k27Var2 = jpbVar3.H;
                ArrayList arrayList622 = mu1Var.getMediaDataController().n;
                if (mu1Var.y()) {
                }
                if (k27Var2.k3()) {
                }
                boolean z922 = z3;
                if (!z2) {
                }
                if (mu1Var.e == null) {
                }
                kl0Var2 = kl0Var;
                viewGroup = gpbVar4;
                if (!z2) {
                }
                z5 = false;
                TLRPC.User user322222 = mu1Var.f;
                if (user322222 == null) {
                }
                boolean z1022222 = z5;
                cs5 H22222 = cs5.H(gpbVar2, mu1Var.getResourceProvider(), null, !z2 || z4);
                if (z4) {
                }
                size = arrayList322.size();
                while (i3 < size) {
                }
                cs5Var.U(bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar)));
                cs5Var.R(kl0Var3, nod.k(wjbVar), false);
                cs5Var.Z();
                ViewGroup viewGroup422222 = cs5Var.A;
                jpbVar.T = viewGroup422222;
                viewGroup422222.setPivotX(0.0f);
                jpbVar.T.setPivotY(0.0f);
                viewGroup.addView(jpbVar.T, nme.e(-2, -2, 51));
                viewGroup2 = jpbVar.T;
                if (viewGroup2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                if (z6) {
                }
                jpbVar2.e();
                jpbVar2.d0 = new ft1(this, (byte) 5);
                jpbVar2.show();
                return z7;
            }
        }
        return false;
    }

    @Override // bb2
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
        f(gb2Var, z, false, z2);
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
        this.a.Ba(gb2Var);
    }

    @Override // bb2
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
        if (gb2Var == null || document == null) {
            return;
        }
        mu1 mu1Var = this.a;
        if (mu1Var.getParentLayout() == null || !l2(gb2Var)) {
            return;
        }
        boolean J3 = k27.J3(document);
        gb2Var.setScrimBlockBounds(rectF);
        cs5 I = cs5.I(mu1Var, gb2Var);
        I.b(R.drawable.msg_download, k96.M0(J3 ? 2131745719 : 2131745739, null), new jn1(this, gb2Var, document, (byte) 6), false);
        I.p = new jt1(gb2Var, rectF, (byte) 0);
        I.a0();
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        try {
            mu1 mu1Var = this.a;
            ou3.I0(mu1Var, k27Var, mu1Var.db, str2, str3, str4, str, i, i2, -1, mu1Var.Q7());
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // bb2
    public final void J(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        messageObject.k.summarizedOpen = !r1.summarizedOpen;
        messageObject.f6(true);
        mu1 mu1Var = this.a;
        mu1Var.getMessagesStorage().U1(k27.B0(messageObject.k), messageObject.k);
        mu1Var.getMessagesController().i4.g(messageObject, true, false);
        f(gb2Var, true, false, true);
    }

    @Override // bb2
    public final boolean J0(long j) {
        TLRPC.ChatFull L0;
        mu1 mu1Var = this.a;
        TLRPC.Chat chat = mu1Var.e;
        if (chat == null || hc2.V(chat)) {
            return false;
        }
        na7 messagesController = mu1Var.getMessagesController();
        long j2 = mu1Var.e.id;
        if (j2 == j) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j2));
        if (messagesController.getUserConfig().e() == j && K0 != null && K0.creator) {
            return true;
        }
        vf6 vf6Var = (vf6) messagesController.q1.f(j2);
        if (vf6Var == null && (L0 = messagesController.L0(j2)) != null && L0.participants != null) {
            for (int i = 0; i < L0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                if (chatParticipant.user_id == j) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) vf6Var.f(j)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean z2 = (z || !d01.i(str, false, false)) ? z : true;
        mu1 mu1Var = this.a;
        c01 c01Var = mu1Var.ec;
        if (c01Var != null) {
            c01Var.a(true);
        }
        mu1Var.ec = gb2Var.getMessageObject() == null ? null : new st1(this, gb2Var);
        if (z2 || d01.g(parse, false, null)) {
            d01.s(mu1Var.getParentActivity(), parse, true, true, false, mu1Var.ec, null, false, true, false, false);
        } else {
            ij.o0(mu1Var, str, true, true, true, !z2, mu1Var.ec, webPage, mu1Var.Ba);
        }
    }

    @Override // bb2
    public final void M0(gb2 gb2Var, boolean z) {
        f(gb2Var, z, true, false);
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().f(messageObject);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00ff, code lost:
    
        if (cf3.n(r5) != r8.l6) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(gb2 gb2Var, int i, float f, float f2, boolean z) {
        Integer num;
        String str;
        TLRPC.MessageReplyHeader messageReplyHeader;
        String str2;
        byte[] bArr;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        byte[] bArr2;
        TLRPC.Message message;
        String str3;
        long j;
        boolean z2;
        TLRPC.Chat K0;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader3;
        TLRPC.MessageReplyHeader messageReplyHeader4;
        TLRPC.Chat K02;
        TLRPC.MessageReplyHeader messageReplyHeader5;
        k27 k27Var;
        TLRPC.MessageReplyHeader messageReplyHeader6;
        TLRPC.MessageReplyHeader messageReplyHeader7;
        TLRPC.Message message3;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.a aVar;
        boolean b = b();
        mu1 mu1Var = this.a;
        if (!b && !z) {
            aVar = ((d) mu1Var).actionBar;
            if ((aVar.y() || mu1Var.T7()) && !mu1Var.u9.y(gb2Var.getMessageObject())) {
                mu1Var.Ha(gb2Var, f, f2, !gb2Var.E2(f));
                return;
            }
            return;
        }
        if (l7c.B(mu1Var.f)) {
            q1(gb2Var);
            return;
        }
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null) {
            if (messageObject.e4() && (storyItem = (message3 = messageObject.k).replyStory) != null) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    ir2.v(null, 2131744366, u21.b0(mu1Var), R.raw.story_bomb1, 36);
                    return;
                }
                storyItem.dialogId = cf3.n(message3.reply_to.peer);
                storyItem.messageId = messageObject.e1();
                storyItem.messageType = 3;
                x2b.b(storyItem, mu1Var.f);
                mu1Var.getOrCreateStoryViewer().J(mu1Var.getParentActivity(), storyItem, p2b.a(mu1Var.A0));
                return;
            }
            TLRPC.Message message4 = messageObject.k;
            if (message4 == null || (messageReplyHeader7 = message4.reply_to) == null || (messageReplyHeader7.flags & 2048) == 0) {
                if (message4 != null && (messageReplyHeader2 = message4.reply_to) != null && (bArr2 = messageReplyHeader2.poll_option) != null) {
                    num = null;
                    str2 = null;
                    bArr = bArr2;
                } else if (message4 == null || (messageReplyHeader = message4.reply_to) == null || !messageReplyHeader.quote) {
                    num = null;
                    str = null;
                } else {
                    String str4 = messageReplyHeader.quote_text;
                    r9 = (messageReplyHeader.flags & 1024) != 0 ? messageReplyHeader.quote_offset : -1;
                    num = null;
                    str2 = str4;
                    bArr = 0;
                }
                long j2 = mu1Var.l6;
                message = messageObject.k;
                if (message == null && (messageReplyHeader6 = message.reply_to) != null) {
                    TLRPC.Peer peer = messageReplyHeader6.reply_to_peer_id;
                    if (peer == null) {
                        str3 = str2;
                        TLRPC.MessageFwdHeader messageFwdHeader = messageReplyHeader6.reply_from;
                        if (messageFwdHeader != null) {
                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                            if (peer2 != null) {
                                if (!(peer2 instanceof TLRPC.TL_peerUser)) {
                                    j2 = cf3.n(peer2);
                                }
                                j = Long.MAX_VALUE;
                            } else {
                                TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                                if (peer3 != null) {
                                    j2 = cf3.n(peer3);
                                }
                                j = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        if (!(peer instanceof TLRPC.TL_peerUser)) {
                            long n = cf3.n(peer);
                            z2 = true;
                            j = n;
                            str3 = str2;
                            K0 = j >= 0 ? mu1Var.getMessagesController().K0(Long.valueOf(-j)) : null;
                            if (j != Long.MAX_VALUE) {
                                boolean z3 = z2;
                                if (j == mu1Var.l6 || K0 == null || hc2.t0(K0) || (!K0.left && !K0.kicked)) {
                                    if (((j == mu1Var.l6 && (!hc2.c0(mu1Var.e) || !z3)) || j == Long.MAX_VALUE) && (mu1Var.g4 != 3 || ((k27Var = messageObject.C) != null && k27Var.P1() == mu1Var.d()))) {
                                        int i2 = mu1Var.g4;
                                        if (i2 == 2 || i2 == 1) {
                                            mu1Var.n9.p(i);
                                            mu1Var.finishFragment();
                                            return;
                                        }
                                        if (bArr != 0) {
                                            mu1Var.j8 = bArr;
                                        } else if (num != null) {
                                            mu1Var.i8 = num;
                                        } else {
                                            TLRPC.Message message5 = messageObject.k;
                                            if (message5 != null && (messageReplyHeader5 = message5.reply_to) != null && messageReplyHeader5.quote) {
                                                mu1Var.f8 = true;
                                                mu1Var.h8 = messageReplyHeader5.quote_text;
                                                mu1Var.k8 = r9;
                                                mu1Var.e8 = true;
                                            }
                                        }
                                        i57 i57Var = new i57((Object) this, i, (Object) messageObject, (Object) num, (Object) bArr, (byte) 10);
                                        if (!mu1Var.D0.O) {
                                            i57Var.run();
                                            return;
                                        }
                                        mu1Var.G3 = false;
                                        mu1Var.zb(false, true, false);
                                        mu1Var.bd(mu1Var.getMediaDataController().e0(), mu1Var.getMediaDataController().f1, mu1Var.getMediaDataController().k0());
                                        gl.d3(i57Var, 80L);
                                        return;
                                    }
                                    Integer num2 = num;
                                    byte[] bArr3 = bArr;
                                    if (LaunchActivity.H1 != null) {
                                        c01 c01Var = mu1Var.ec;
                                        if (c01Var != null) {
                                            c01Var.a(false);
                                            mu1Var.ec = null;
                                        }
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        final vt vtVar = new vt(this, messageObject, gb2Var);
                                        mu1Var.ec = vtVar;
                                        int e1 = messageObject.e1();
                                        ArrayList arrayList = launchActivity.e0;
                                        if (j < 0 && (K02 = na7.q1(launchActivity.P).K0(Long.valueOf(-j))) != null && hc2.c0(K02)) {
                                            vtVar.d();
                                            final byte b2 = 0;
                                            launchActivity.l0(j, Integer.valueOf(i), str3, num2, bArr3, new Runnable() { // from class: dy5
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b3 = b2;
                                                    vt vtVar2 = vtVar;
                                                    switch (b3) {
                                                        case 0:
                                                            String str5 = LaunchActivity.C1;
                                                            vtVar2.c(false);
                                                            break;
                                                        default:
                                                            String str6 = LaunchActivity.C1;
                                                            vtVar2.c(false);
                                                            break;
                                                    }
                                                }
                                            }, e1, r9);
                                            return;
                                        }
                                        String str5 = str3;
                                        int i3 = r9;
                                        vtVar.d();
                                        Bundle bundle = new Bundle();
                                        if (j >= 0) {
                                            bundle.putLong("user_id", j);
                                        } else {
                                            long j3 = -j;
                                            TLRPC.Chat K03 = na7.q1(launchActivity.P).K0(Long.valueOf(j3));
                                            if (K03 != null && K03.forum) {
                                                final byte b3 = 1;
                                                launchActivity.l0(j, Integer.valueOf(i), str5, num2, bArr3, new Runnable() { // from class: dy5
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        byte b32 = b3;
                                                        vt vtVar2 = vtVar;
                                                        switch (b32) {
                                                            case 0:
                                                                String str52 = LaunchActivity.C1;
                                                                vtVar2.c(false);
                                                                break;
                                                            default:
                                                                String str6 = LaunchActivity.C1;
                                                                vtVar2.c(false);
                                                                break;
                                                        }
                                                    }
                                                }, e1, i3);
                                                return;
                                            }
                                            bundle.putLong("chat_id", j3);
                                        }
                                        bundle.putInt("message_id", i);
                                        d dVar = !arrayList.isEmpty() ? (d) b00.f(1, arrayList) : null;
                                        if (dVar == null || na7.q1(launchActivity.P).A(bundle, dVar, null, null)) {
                                            gl.c3(new cy5(launchActivity, bundle, bArr3, i, num2, str5, i3, j, vtVar, dVar));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            message2 = messageObject.k;
                            if (message2 != null || (messageReplyHeader4 = message2.reply_to) == null || TextUtils.isEmpty(messageReplyHeader4.quote_text) || !messageObject.c1 || messageObject.d1 || messageObject.O5()) {
                                TLRPC.Message message6 = messageObject.k;
                                u21.b0(mu1Var).Q(R.raw.error, 36, k96.M0((message6 == null && (messageReplyHeader3 = message6.reply_to) != null && messageReplyHeader3.quote) ? (K0 == null || !K0.megagroup) ? hc2.T(K0) ? 2131746239 : 2131746240 : 2131746238 : (K0 == null && K0.megagroup) ? 2131746063 : !hc2.T(K0) ? 2131746064 : 2131746065, null)).k(true);
                            } else {
                                messageObject.d1 = true;
                                mu1Var.Mc(messageObject, true);
                                return;
                            }
                        }
                        str3 = str2;
                    }
                    z2 = false;
                    if (j >= 0) {
                    }
                    if (j != Long.MAX_VALUE) {
                    }
                    message2 = messageObject.k;
                    if (message2 != null) {
                    }
                    TLRPC.Message message62 = messageObject.k;
                    u21.b0(mu1Var).Q(R.raw.error, 36, k96.M0((message62 == null && (messageReplyHeader3 = message62.reply_to) != null && messageReplyHeader3.quote) ? (K0 == null || !K0.megagroup) ? hc2.T(K0) ? 2131746239 : 2131746240 : 2131746238 : (K0 == null && K0.megagroup) ? 2131746063 : !hc2.T(K0) ? 2131746064 : 2131746065, null)).k(true);
                }
                str3 = str2;
                j = j2;
                z2 = false;
                if (j >= 0) {
                }
                if (j != Long.MAX_VALUE) {
                }
                message2 = messageObject.k;
                if (message2 != null) {
                }
                TLRPC.Message message622 = messageObject.k;
                u21.b0(mu1Var).Q(R.raw.error, 36, k96.M0((message622 == null && (messageReplyHeader3 = message622.reply_to) != null && messageReplyHeader3.quote) ? (K0 == null || !K0.megagroup) ? hc2.T(K0) ? 2131746239 : 2131746240 : 2131746238 : (K0 == null && K0.megagroup) ? 2131746063 : !hc2.T(K0) ? 2131746064 : 2131746065, null)).k(true);
            }
            num = Integer.valueOf(messageReplyHeader7.todo_item_id);
            str = null;
            str2 = str;
            bArr = str;
            long j22 = mu1Var.l6;
            message = messageObject.k;
            if (message == null) {
            }
            str3 = str2;
            j = j22;
            z2 = false;
            if (j >= 0) {
            }
            if (j != Long.MAX_VALUE) {
            }
            message2 = messageObject.k;
            if (message2 != null) {
            }
            TLRPC.Message message6222 = messageObject.k;
            u21.b0(mu1Var).Q(R.raw.error, 36, k96.M0((message6222 == null && (messageReplyHeader3 = message6222.reply_to) != null && messageReplyHeader3.quote) ? (K0 == null || !K0.megagroup) ? hc2.T(K0) ? 2131746239 : 2131746240 : 2131746238 : (K0 == null && K0.megagroup) ? 2131746063 : !hc2.T(K0) ? 2131746064 : 2131746065, null)).k(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(gb2 gb2Var) {
        k27 messageObject;
        TLRPC.MessageReplies messageReplies;
        int i;
        long j;
        f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (k27) arrayList.get(0);
                k27 k27Var = messageObject;
                messageReplies = k27Var.k.replies;
                if (messageReplies == null) {
                    i = messageReplies.read_max_id;
                    j = messageReplies.channel_id;
                } else {
                    i = -1;
                    j = 0;
                }
                int i2 = i;
                long j2 = j;
                mu1 mu1Var = this.a;
                mu1Var.fa(mu1Var.e.id, k27Var, k27Var.e1(), j2, i2, 0, null);
            }
        }
        messageObject = gb2Var.getMessageObject();
        k27 k27Var2 = messageObject;
        messageReplies = k27Var2.k.replies;
        if (messageReplies == null) {
        }
        int i22 = i;
        long j22 = j;
        mu1 mu1Var2 = this.a;
        mu1Var2.fa(mu1Var2.e.id, k27Var2, k27Var2.e1(), j22, i22, 0, null);
    }

    @Override // bb2
    public final boolean N1() {
        mu1 mu1Var = this.a;
        return mu1Var.m1.getKeyboardHeight() + mu1Var.La >= gl.L(20.0f);
    }

    @Override // bb2
    public final boolean O() {
        SparseArray[] sparseArrayArr = this.a.o6;
        return sparseArrayArr[1].size() + sparseArrayArr[0].size() > 0;
    }

    @Override // bb2
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
        TLRPC.Message message;
        int i;
        int i2;
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject == null || (message = messageObject.k) == null) {
            return;
        }
        byte b = iq0Var.a;
        byte b2 = 4;
        mu1 mu1Var = this.a;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    mu1Var.R5(gb2Var, true, false, gb2Var.getLastTouchX(), gb2Var.getLastTouchY(), true, false, true);
                    return;
                } else {
                    if (b == 4) {
                        mu1Var.g2.k(messageObject.Y1(), true);
                        return;
                    }
                    return;
                }
            }
            if (message.suggested_post != null) {
                i = ((d) mu1Var).currentAccount;
                boolean A = hc2.A(i, mu1Var.e, 24);
                if (A) {
                    i2 = ((d) mu1Var).currentAccount;
                    hc2.A(i2, mu1Var.e, 5);
                }
                rg rgVar = new rg((Object) this, (Object) message, A, (Object) messageObject, (byte) 6);
                TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                mu1Var.m5(rgVar, nj.m(suggestedPost != null ? suggestedPost.price : null), !A);
                return;
            }
            return;
        }
        long n = cf3.n(message.from_id);
        x0 x0Var = new x0(this, message, (byte) 28);
        Pattern pattern = ij.a;
        Activity parentActivity = mu1Var.getParentActivity();
        byte b3 = 0;
        md mdVar = new md(0, null, parentActivity);
        String M0 = k96.M0(2131744146, null);
        hd hdVar = mdVar.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.a0(null, null, 2131744145, na7.q1(y6c.t0).y1(n, false)));
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(parentActivity);
        zkb.X(editText, bkb.F6, null);
        editText.setHint(k96.M0(2131744144, null));
        zkb.D(editText, bkb.G6, null);
        editText.setTextSize(1, 16.0f);
        editText.setBackground(bkb.T(parentActivity));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new zi(parentActivity)});
        editText.setPadding(k96.a0 ? gl.L(24.0f) : 0, gl.L(8.0f), k96.a0 ? 0 : gl.L(24.0f), gl.L(8.0f));
        editText.setSelection(editText.getText().toString().length());
        mdVar.n(frameLayout);
        mdVar.j(k96.M0(2131751592, null), new o(x0Var, editText, b2));
        mdVar.g(k96.M0(2131752577, null), null);
        hdVar.O = new ve(editText, b3);
        frameLayout.addView(editText, nme.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        gl.d3(new b1(editText, (byte) 11), 100L);
        mu1Var.showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    @Override // bb2
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        this.a.f6(characterStyle, z, gb2Var.getMessageObject(), gb2Var);
    }

    @Override // bb2
    public final boolean Q() {
        mu1 mu1Var = this.a;
        return l7c.B(mu1Var.f) || l7c.D(mu1Var.f);
    }

    @Override // bb2
    public final int R() {
        return this.a.g4;
    }

    @Override // bb2
    public final void R1() {
        wjb wjbVar;
        mu1 mu1Var = this.a;
        if (mu1Var.m1 == null || mu1Var.getParentActivity() == null) {
            return;
        }
        Context context = mu1Var.m1.getContext();
        wjbVar = ((d) mu1Var).resourceProvider;
        cb9.Y0(context, mu1Var, false, wjbVar, null);
    }

    @Override // bb2
    public final void T(gb2 gb2Var) {
        k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Nc(primaryMessageObject, false);
    }

    @Override // bb2
    public final boolean T0(gb2 gb2Var, final TLRPC.TodoItem todoItem, final boolean z) {
        int i;
        int i2;
        boolean l3 = k27.l3(gb2Var.getMessageObject().k);
        mu1 mu1Var = this.a;
        if (l3) {
            TLRPC.Message message = gb2Var.getMessageObject().k;
            long n = cf3.n(message != null ? message.from_id : null);
            u21 b0 = u21.b0(mu1Var);
            i2 = ((d) mu1Var).currentAccount;
            b0.Q(R.raw.passcode_lock_close, 36, gl.S2(k96.a0(null, null, 2131743846, cf3.k(i2, n)))).k(true);
            return false;
        }
        if (!gb2Var.getMessageObject().q()) {
            TLRPC.Message message2 = gb2Var.getMessageObject().k;
            long n2 = cf3.n(message2 != null ? message2.from_id : null);
            u21 b02 = u21.b0(mu1Var);
            i = ((d) mu1Var).currentAccount;
            b02.Q(R.raw.passcode_lock_close, 36, gl.S2(k96.a0(null, null, 2131743847, cf3.k(i, n2)))).k(true);
            return false;
        }
        if (!mu1Var.getUserConfig().p()) {
            u21.b0(mu1Var).Q(R.raw.star_premium_2, 36, gl.N2(k96.M0(2131743823, null), -1, 2, new ft1(this, (byte) 9), null)).k(true);
            return false;
        }
        final long M = hc2.M(mu1Var.e, mu1Var.r8, true);
        final z3a sendMessagesHelper = mu1Var.getSendMessagesHelper();
        final k27 messageObject = gb2Var.getMessageObject();
        sendMessagesHelper.getClass();
        if (messageObject == null) {
            return true;
        }
        final int hash = Objects.hash(Long.valueOf(k27.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
        sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
        tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().h1(k27.B0(messageObject.k));
        if (z) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: i3a
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                z3a z3aVar = z3a.this;
                final boolean z2 = z;
                if (tL_error == null) {
                    final ad7 messagesStorage = z3aVar.getMessagesStorage();
                    k27 k27Var = messageObject;
                    final long B0 = k27.B0(k27Var.k);
                    final int e1 = k27Var.e1();
                    final int i3 = todoItem.id;
                    final long e = messagesStorage.getUserConfig().e();
                    final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                    co3 co3Var = messagesStorage.a;
                    final long j = M;
                    co3Var.c(new Runnable() { // from class: ec7
                        /* JADX WARN: Removed duplicated region for block: B:104:0x01a7  */
                        /* JADX WARN: Removed duplicated region for block: B:106:0x01ac  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x01a0 A[ORIG_RETURN, RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
                        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
                        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            SQLitePreparedStatement sQLitePreparedStatement;
                            SQLiteCursor sQLiteCursor;
                            SQLitePreparedStatement sQLitePreparedStatement2;
                            SQLitePreparedStatement sQLitePreparedStatement3;
                            SQLiteCursor sQLiteCursor2;
                            SQLiteCursor queryFinalized;
                            NativeByteBuffer byteBufferValue;
                            NativeByteBuffer byteBufferValue2;
                            ad7 ad7Var = ad7.this;
                            long j2 = B0;
                            int i4 = e1;
                            long j3 = e;
                            long j4 = j;
                            int i5 = i3;
                            boolean z3 = z2;
                            int i6 = currentTime;
                            SQLiteCursor sQLiteCursor3 = null;
                            try {
                                sQLiteCursor = ad7Var.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j2 + " AND mid = " + i4, new Object[0]);
                                try {
                                    if (sQLiteCursor.next() && (byteBufferValue2 = sQLiteCursor.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                        TLdeserialize.readAttachPath(byteBufferValue2, j3);
                                        byteBufferValue2.reuse();
                                        sQLiteCursor.dispose();
                                        TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                            k27.Y5(ad7Var.currentAccount, j4, (TLRPC.TL_messageMediaToDo) messageMedia, i5, z3, i6);
                                            sQLitePreparedStatement = ad7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                            try {
                                                sQLitePreparedStatement.requery();
                                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                                k27.p5(TLdeserialize);
                                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                                sQLitePreparedStatement.bindInteger(2, i4);
                                                sQLitePreparedStatement.bindLong(3, j2);
                                                sQLitePreparedStatement.step();
                                                sQLitePreparedStatement.dispose();
                                                nativeByteBuffer.reuse();
                                            } catch (Exception e2) {
                                                e = e2;
                                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                                sQLiteCursor = null;
                                                try {
                                                    fa4.g(e, true);
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                        sQLiteCursor = null;
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                        sQLitePreparedStatement2.dispose();
                                                        sQLitePreparedStatement3 = null;
                                                        if (ad7Var.r0(5, j2)) {
                                                        }
                                                    } else {
                                                        sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                                        if (ad7Var.r0(5, j2)) {
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sQLiteCursor3 = sQLiteCursor;
                                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                                    if (sQLiteCursor3 != null) {
                                                        sQLiteCursor3.dispose();
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                        sQLitePreparedStatement.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (sQLiteCursor3 != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        sQLiteCursor = null;
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        sQLiteCursor = null;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLitePreparedStatement2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteCursor3 = sQLiteCursor;
                                    sQLitePreparedStatement = null;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor = null;
                                sQLitePreparedStatement2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = null;
                            }
                            sQLitePreparedStatement3 = null;
                            try {
                                if (ad7Var.r0(5, j2)) {
                                    try {
                                        sQLiteCursor2 = sQLiteCursor;
                                        try {
                                            queryFinalized = ad7Var.b.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j2 + " AND mid = " + i4, new Object[0]);
                                            try {
                                            } catch (Exception e5) {
                                                e = e5;
                                                sQLiteCursor3 = queryFinalized;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                sQLiteCursor3 = queryFinalized;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLiteCursor3 = sQLiteCursor2;
                                            fa4.g(e, true);
                                            if (sQLiteCursor3 != null) {
                                            }
                                            if (sQLitePreparedStatement3 == null) {
                                            }
                                            sQLitePreparedStatement3.dispose();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLiteCursor3 = sQLiteCursor2;
                                            if (sQLiteCursor3 != null) {
                                            }
                                            if (sQLitePreparedStatement3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        sQLiteCursor2 = sQLiteCursor;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteCursor2 = sQLiteCursor;
                                    }
                                    if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        TLdeserialize2.readAttachPath(byteBufferValue, j3);
                                        byteBufferValue.reuse();
                                        TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                            k27.Y5(ad7Var.currentAccount, j4, (TLRPC.TL_messageMediaToDo) messageMedia2, i5, z3, i6);
                                            queryFinalized.dispose();
                                            try {
                                                SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                                try {
                                                    executeFast.requery();
                                                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                    TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                    executeFast.bindByteBuffer(1, nativeByteBuffer2);
                                                    executeFast.bindInteger(2, i4);
                                                    executeFast.bindLong(3, j2);
                                                    executeFast.step();
                                                    executeFast.dispose();
                                                    try {
                                                        nativeByteBuffer2.reuse();
                                                        sQLitePreparedStatement3 = null;
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        if (sQLitePreparedStatement3 == null) {
                                                            return;
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        sQLitePreparedStatement3 = null;
                                                        fa4.g(e, true);
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        if (sQLitePreparedStatement3 == null) {
                                                            return;
                                                        }
                                                        sQLitePreparedStatement3.dispose();
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        sQLitePreparedStatement3 = null;
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        if (sQLitePreparedStatement3 != null) {
                                                            sQLitePreparedStatement3.dispose();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    sQLitePreparedStatement3 = executeFast;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    sQLitePreparedStatement3 = executeFast;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                            }
                                            sQLitePreparedStatement3.dispose();
                                        }
                                    }
                                    sQLiteCursor3 = queryFinalized;
                                    if (sQLiteCursor3 != null) {
                                    }
                                    if (sQLitePreparedStatement3 == null) {
                                    }
                                    sQLitePreparedStatement3.dispose();
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                    });
                    z3aVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                }
                gl.c3(new z54((Object) z3aVar, hash, z2, (byte) 3));
            }
        });
        return true;
    }

    @Override // bb2
    public final boolean T1(gm gmVar) {
        TLRPC.InputStickerSet i1;
        int i;
        mu1 mu1Var = this.a;
        if (!mu1Var.getMessagesController().F3() && gmVar != null && !gmVar.standard) {
            long documentId = gmVar.getDocumentId();
            TLRPC.Document document = gmVar.document;
            if (document == null) {
                i = ((d) mu1Var).currentAccount;
                document = vl.e(i, documentId);
            }
            if (document != null && (i1 = k27.i1(document)) != null) {
                hq6.d0(y6c.t0).n0(i1, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i1);
                qx3 qx3Var = new qx3(mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
                hx3 hx3Var = qx3Var.p1;
                hx3Var.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(hx3Var);
                hx3Var.w = imageReceiver;
                if (hx3Var.d) {
                    imageReceiver.I();
                }
                hx3Var.x = true;
                hx3Var.y.e(true, 1.0f);
                hx3Var.w.Z(gl5.b(document), "140_140", gl5.c(ba4.w(document.thumbs, 90, false, null, false), document), "140_140", uo3.d(document.thumbs, bkb.l6, 0.2f, true), 0L, null, null, 0);
                hx3Var.w.m0(7);
                ImageReceiver imageReceiver2 = hx3Var.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.M(1);
                ImageReceiver imageReceiver3 = hx3Var.w;
                imageReceiver3.x0 = true;
                imageReceiver3.p0(hx3Var);
                boolean Q7 = mu1Var.Q7();
                qx3Var.i0 = Q7;
                qx3Var.n = Q7;
                mu1Var.showDialog(qx3Var);
                return true;
            }
        }
        return false;
    }

    @Override // bb2
    public final int V(gb2 gb2Var) {
        jd8 jd8Var;
        mu1 mu1Var = this.a;
        if (!mu1Var.fd.f || (jd8Var = mu1Var.ld) == null || jd8Var.n != gb2Var || jd8Var.a.getWidth() <= 0) {
            return 0;
        }
        return mu1Var.ld.a.getHeight();
    }

    @Override // bb2
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        mu1 mu1Var = this.a;
        if (mu1Var.S7()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (mu1Var.getParentActivity() != null) {
            if (mu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                ar1 ar1Var = mu1Var.a0;
                k27 messageObject = gb2Var.getMessageObject();
                k27 messageObject2 = gb2Var.getMessageObject();
                op1 op1Var = null;
                String str = tL_inlineButtonTypeUrl != null ? tL_inlineButtonTypeUrl.url : null;
                c01 c01Var = mu1Var.ec;
                if (c01Var != null) {
                    c01Var.a(true);
                    mu1Var.ec = null;
                }
                if (str == null || gb2Var.getMessageObject() == null) {
                    mu1Var.ec = null;
                } else {
                    op1Var = new op1(mu1Var, gb2Var.getMessageObject().e1(), str, gb2Var, (byte) 1);
                    mu1Var.ec = op1Var;
                }
                ar1Var.s0(keyboardButtonProto, messageObject, messageObject2, op1Var);
            }
        }
    }

    @Override // bb2
    public final void W(gb2 gb2Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() != null) {
            if (mu1Var.ua == null) {
                wx8 wx8Var = new wx8(mu1Var.getParentActivity());
                mu1Var.ua = wx8Var;
                mu1Var.m1.addView(wx8Var, nme.e(-1, -1, 48));
            }
            wx8 wx8Var2 = mu1Var.ua;
            HashMap hashMap = wx8Var2.a;
            ArrayList arrayList = wx8Var2.c;
            arrayList.clear();
            int i = wx8Var2.d;
            y6c h = y6c.h(i);
            long j = h.n;
            arrayList.add(Long.valueOf(j));
            if (h.W) {
                ArrayList arrayList2 = hq6.d0(i).j1;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j2 = tL_topPeer.peer.user_id;
                    if (j2 != 0 && na7.q1(i).V1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = na7.q1(i).y;
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i3);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j3 = dialog.id;
                    if (j3 != j && !cf3.B(j3)) {
                        if (cf3.D(dialog.id)) {
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(dialog.id));
                            if (V1 != null && !l7c.v(V1) && !l7c.z(V1) && !l7c.C(V1.id)) {
                                int i4 = dialog.folder_id;
                                long j4 = dialog.id;
                                if (i4 == 1) {
                                    arrayList3.add(Long.valueOf(j4));
                                } else {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        } else {
                            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-dialog.id));
                            if (K0 != null && !K0.forum && !hc2.r0(K0) && ((!K0.gigagroup || hc2.N(K0)) && (!hc2.T(K0) || K0.creator || (((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_messages) || K0.megagroup)))) {
                                int i5 = dialog.folder_id;
                                long j5 = dialog.id;
                                if (i5 == 1) {
                                    arrayList3.add(Long.valueOf(j5));
                                } else {
                                    arrayList.add(Long.valueOf(j5));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b = wx8.b(gb2Var);
            if (b != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    Long l = (Long) obj2;
                    if (hashSet.add(l) && cf3.D(l.longValue())) {
                        arrayList5.add(l);
                    }
                }
                vx8 vx8Var = new vx8(wx8Var2, gb2Var, arrayList5, new lw8(wx8Var2, b, (byte) 5));
                vx8Var.setBounds(0, 0, wx8Var2.getMeasuredWidth(), wx8Var2.getMeasuredHeight());
                vx8Var.setCallback(wx8Var2);
                if (hashMap.containsKey(b)) {
                    return;
                }
                hashMap.put(b, vx8Var);
            }
        }
    }

    @Override // bb2
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
        ui5 ui5Var;
        ui5 ui5Var2;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() == null || tLObject == null) {
            return;
        }
        ui5Var = ((d) mu1Var).parentLayout;
        if (ui5Var != null) {
            ui5Var2 = ((d) mu1Var).parentLayout;
            if (((ActionBarLayout) ui5Var2).w()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        boolean z2 = tLObject instanceof TLRPC.Chat;
        if (z2) {
            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
        } else if (!(tLObject instanceof TLRPC.User)) {
            return;
        } else {
            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
        }
        if (!z || !z2) {
            mu1Var.presentFragment(new mu1(bundle));
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, mu1Var.getResourceProvider(), mu1Var.getParentActivity());
        zkb.h(bkb.F8, mu1Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        a8 a8Var = new a8(mu1Var.getParentActivity(), false, false);
        a8Var.j(k96.M0(2131747618, null), R.drawable.msg_channel, null);
        a8Var.setMinimumWidth(kk7.p2);
        a8Var.setOnClickListener(new x91(this, (byte) 7));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
        a8 a8Var2 = new a8(mu1Var.getParentActivity(), false, false);
        a8Var2.j(k96.M0(2131746469, null), R.drawable.msg_addbot, null);
        a8Var2.setMinimumWidth(kk7.p2);
        a8Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, gb2Var, (byte) 19));
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
        mu1 mu1Var2 = new mu1(bundle);
        mu1Var2.ga = true;
        mu1Var.presentFragmentAsPreviewWithMenu(mu1Var2, actionBarPopupWindow$ActionBarPopupWindowLayout);
        mu1Var.j5();
    }

    @Override // bb2
    public final vu1 X() {
        return this.a.uc;
    }

    @Override // bb2
    public final void X0(gb2 gb2Var) {
        int i;
        int i2;
        mq1 mq1Var;
        k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.c3 = !primaryMessageObject.c3;
            primaryMessageObject.M1 = true;
            mu1 mu1Var = this.a;
            jq1 jq1Var = mu1Var.A0;
            if (jq1Var != null && (mq1Var = mu1Var.C0) != null && mq1Var.y < 0) {
                for (int childCount = jq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = mu1Var.A0.getChildAt(childCount);
                    mu1Var.A0.getClass();
                    i = RecyclerView.R(childAt);
                    if (i >= 0) {
                        if (!(childAt instanceof gb2)) {
                            if (childAt instanceof uk1) {
                                i2 = mu1Var.a7(childAt);
                                break;
                            }
                        } else {
                            if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                                i2 = mu1Var.a7(childAt);
                                break;
                            }
                        }
                    }
                }
            }
            i = -1;
            i2 = 0;
            mu1Var.Nc(primaryMessageObject, false);
            je5 je5Var = mu1Var.P1;
            if (je5Var != null) {
                je5Var.f(true);
            }
            if (i < 0 || gb2Var.getCurrentMessagesGroup() != null) {
                return;
            }
            mu1Var.C0.g1(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.tgnet.TLRPC$ChatParticipant] */
    /* JADX WARN: Type inference failed for: r8v0, types: [wt1] */
    @Override // bb2
    public final void X1(gb2 gb2Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull L0;
        TLRPC.User currentUser = gb2Var.getCurrentUser();
        mu1 mu1Var = this.a;
        if (!gl.C1(mu1Var.getParentActivity()) || (chat = mu1Var.e) == null || currentUser == null || hc2.V(chat)) {
            return;
        }
        na7 messagesController = mu1Var.getMessagesController();
        long j = mu1Var.e.id;
        long j2 = currentUser.id;
        vf6 vf6Var = (vf6) messagesController.q1.f(j);
        if (vf6Var == null && (L0 = messagesController.L0(j)) != null && L0.participants != null) {
            for (int i = 0; i < L0.participants.participants.size(); i++) {
                chatParticipant = L0.participants.participants.get(i);
                if (chatParticipant.user_id == j2) {
                    break;
                }
            }
        }
        chatParticipant = (TLObject) vf6Var.f(j2);
        e(gb2Var, chatParticipant);
    }

    @Override // bb2
    public final void Y(k27 k27Var) {
        this.a.s.put(k27Var, Boolean.TRUE);
    }

    @Override // bb2
    public final void Y0(gb2 gb2Var, float f, float f2) {
        this.a.R5(gb2Var, true, false, f, f2, false, false, false);
    }

    @Override // bb2
    public final void Y1(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        mu1 mu1Var = this.a;
        mu1Var.v5 = messageObject;
        mu1Var.v7();
    }

    @Override // bb2
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        pp1 pp1Var;
        int i;
        on7 on7Var;
        k27 messageObject = gb2Var.getMessageObject();
        byte b = 1;
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            TLRPC.Message message = messageObject.k;
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                ArrayList arrayList = new ArrayList();
                int i2 = -1;
                for (int i3 = 0; i3 < tL_messageMediaPaidMedia.extended_media.size(); i3++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i3);
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                        if (tL_messageExtendedMedia == messageExtendedMedia) {
                            i2 = arrayList.size();
                        }
                        TLRPC.TL_message I5 = mu1.I5(message);
                        if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                            I5.attachPath = tL_messageExtendedMedia.attachPath;
                        } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                            I5.attachPath = message.attachPath;
                        }
                        I5.media = tL_messageExtendedMedia.media;
                        I5.noforwards = true;
                        arrayList.add(new k27(messageObject.K1, I5, false, true));
                    }
                }
                if (i2 <= -1 || arrayList.isEmpty()) {
                    return;
                }
                PhotoViewer r0 = PhotoViewer.r0();
                mu1 mu1Var = this.a;
                r0.T1(null, mu1Var, mu1Var.Ba);
                PhotoViewer.r0().j1(arrayList, i2, this.a.a(), 0L, 0L, this.a.eb);
                return;
            }
            return;
        }
        mu1 mu1Var2 = this.a;
        c01 c01Var = mu1Var2.ec;
        if (c01Var != null) {
            c01Var.a(true);
            mu1Var2.ec = null;
        }
        if (gb2Var.getMessageObject() == null) {
            mu1Var2.ec = null;
            pp1Var = null;
        } else {
            pp1Var = new pp1(mu1Var2, gb2Var.getMessageObject().e1(), gb2Var, b);
            mu1Var2.ec = pp1Var;
        }
        i = ((d) this.a).currentAccount;
        gta v = gta.v(i, false);
        Objects.requireNonNull(pp1Var);
        hq1 hq1Var = new hq1(pp1Var, (byte) 4);
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        wjb F = gta.F();
        if (messageObject == null || context == null) {
            on7Var = null;
        } else {
            long B0 = k27.B0(messageObject.k);
            int e1 = messageObject.e1();
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = na7.q1(v.a).h1(B0);
            tL_inputInvoiceMessage.msg_id = e1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = ow0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
            on7Var = new on7((Object) v, ConnectionsManager.getInstance(v.a).sendRequest(tL_payments_getPaymentForm, new rt0((Object) v, (Object) messageObject, (Object) tL_inputInvoiceMessage, (Object) hq1Var, (byte) 21)), (byte) 15);
        }
        if (on7Var != null) {
            pp1Var.b = on7Var;
            pp1Var.d();
        }
    }

    @Override // bb2
    public final ma8 Z1() {
        return this.a.Ta;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        mu1 mu1Var = this.a;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            CharSequence fieldText = ar1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = hc2.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                mu1Var.a0.setFieldText(spannableStringBuilder);
                gl.d3(new ft1(this, (byte) 6), 200L);
            }
        }
    }

    @Override // bb2
    public final boolean b() {
        org.telegram.ui.ActionBar.a aVar;
        org.telegram.ui.ActionBar.a aVar2;
        boolean z;
        mu1 mu1Var = this.a;
        aVar = ((d) mu1Var).actionBar;
        if (aVar == null) {
            return false;
        }
        aVar2 = ((d) mu1Var).actionBar;
        if (aVar2.y() || mu1Var.T7()) {
            return false;
        }
        z = ((d) mu1Var).inPreviewMode;
        return !z;
    }

    @Override // bb2
    public final String b1(gb2 gb2Var) {
        mu1 mu1Var;
        int i;
        if (gb2Var.getMessageObject() == null || (i = (mu1Var = this.a).ac) == 0 || i != gb2Var.getMessageObject().e1() || mu1Var.bc != 3) {
            return null;
        }
        return mu1Var.dc;
    }

    @Override // bb2
    public final void b2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new nj2(str2, str, false), 0, spannableString.length(), 33);
        gl.g(spannableString);
        u21.b0(this.a).i(k96.M0(2131752010, null)).j();
    }

    @Override // bb2
    public final void c() {
        this.a.m1.getClass();
    }

    @Override // bb2
    public final void c0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
        org.telegram.ui.ActionBar.a aVar;
        mu1 mu1Var = this.a;
        aVar = ((d) mu1Var).actionBar;
        boolean z = true;
        if (aVar.y() || mu1Var.T7()) {
            mu1Var.Ha(gb2Var, f, f2, true);
            return;
        }
        if (gb2Var != null && gb2Var.getMessageObject() != null && gb2Var.getMessageObject().q4()) {
            F1(gb2Var, 10);
            return;
        }
        if (!hc2.c0(mu1Var.e) && !mu1Var.a8()) {
            z = false;
        }
        k(user, z);
    }

    @Override // bb2
    public final void c1(gb2 gb2Var) {
        float L;
        if (gb2Var.getMessageObject().y3()) {
            i1();
            return;
        }
        mu1 mu1Var = this.a;
        if (mu1Var.A3 || mu1Var.A0 == null || mu1Var.getParentActivity() == null || mu1Var.fragmentView == null) {
            return;
        }
        if (mu1Var.J2 == null) {
            int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
            if (indexOfChild == -1) {
                return;
            }
            je5 s4 = mu1Var.s4(250.0f, 3, indexOfChild + 1, false);
            mu1Var.J2 = s4;
            s4.t(k96.M0(2131749137, null));
        }
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null) {
            TLRPC.User currentUser = gb2Var.getCurrentUser();
            if (currentUser == null || currentUser.id != 0) {
                float L2 = gl.L(22.0f);
                L = (messageObject.O3() || !gb2Var.w9 || gb2Var.h9 == null) ? L2 : gl.L(20.0f) + L2;
            } else {
                L = (gb2Var.getMeasuredHeight() - Math.max(0, gb2Var.getBottom() - ((View) gb2Var.getParent()).getMeasuredHeight())) - gl.L(50.0f);
            }
            if (mu1Var.p7(gb2Var, L) > gl.L(80.0f)) {
                mu1Var.J2.w(mu1Var.o7(gb2Var, gb2Var.getForwardNameCenterX()), mu1Var.p7(gb2Var, L) - gl.L(4.0f), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c2(long j) {
        TLRPC.ChatFull L0;
        mu1 mu1Var = this.a;
        TLRPC.Chat chat = mu1Var.e;
        if (chat != null && !hc2.V(chat)) {
            na7 messagesController = mu1Var.getMessagesController();
            long j2 = mu1Var.e.id;
            if (j2 == j) {
                messagesController.getClass();
                return true;
            }
            vf6 vf6Var = (vf6) messagesController.q1.f(j2);
            if (vf6Var == null && (L0 = messagesController.L0(j2)) != null && L0.participants != null) {
                for (int i = 0; i < L0.participants.participants.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                    if (chatParticipant.user_id == j) {
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            return true;
                        }
                    }
                }
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) vf6Var.f(j);
            if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) {
            }
        }
        return false;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        mu1 mu1Var = this.a;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            CharSequence fieldText = ar1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String p = l7c.p(user);
            if (p != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) p).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(tb4.o(l7c.k(user, false), " "));
                spannableString.setSpan(new j4c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            mu1Var.a0.setFieldText(spannableStringBuilder);
            gl.d3(new ft1(this, (byte) 7), 200L);
        }
    }

    @Override // bb2
    public final void d0(int i) {
        int i2;
        SpannableStringBuilder S2;
        int i3;
        byte b = 3;
        byte b2 = 2;
        byte b3 = 1;
        mu1 mu1Var = this.a;
        try {
            if (i == 0) {
                mu1Var.n5();
                xr1 xr1Var = mu1Var.O3;
                if (xr1Var != null) {
                    xr1Var.l(0L, 84, null, new ft1(this, b3));
                    mu1Var.O3.performHapticFeedback(3, 2);
                    return;
                }
                return;
            }
            if (i == 1) {
                String x = k96.x(mu1Var.getMessagesController().H3, true);
                if (mu1Var.getMessagesController().H3 > 0) {
                    i3 = ((d) mu1Var).currentAccount;
                    S2 = gl.S2(k96.G(uyb.g(i3), "TranscriptionTrialLeftUntil", x));
                } else {
                    i2 = ((d) mu1Var).currentAccount;
                    S2 = gl.S2(k96.G(uyb.g(i2), "TranscriptionTrialLeft", new Object[0]));
                }
                u21.b0(mu1Var).G(R.raw.transcribe, 6, S2).k(true);
                mu1Var.fragmentView.performHapticFeedback(3, 2);
                return;
            }
            if (i == 2 || i == 3) {
                String x2 = k96.x(mu1Var.getMessagesController().H3, true);
                u21 b0 = u21.b0(mu1Var);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) gl.S2(k96.G(mu1Var.getMessagesController().G3, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ").append(i == 2 ? gl.N2(k96.M0(2131743729, null), -1, 0, new ft1(this, b2), null) : mu1Var.getMessagesController().H3 <= 0 ? "" : gl.N2(k96.a0(null, null, 2131743728, x2), -1, 0, new ft1(this, b), null));
                b0.getClass();
                t11 t11Var = new t11(b0.X(), b0.c);
                t11Var.c(R.raw.transcribe, 36, 36, new String[0]);
                if (append != null) {
                    String charSequence = append.toString();
                    int i4 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i4 >= 6) {
                            append.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i4++;
                    }
                }
                t11Var.b.setText(append);
                t11Var.b.setSingleLine(false);
                t11Var.b.setMaxLines(6);
                b0.b(t11Var, 7000).k(true);
                pw0.E.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // bb2
    public final void d2(gb2 gb2Var, k08 k08Var) {
        TLRPC.Message message;
        if (gb2Var == null) {
            k08Var.run();
            return;
        }
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject == null || ((messageObject.n4() && !messageObject.Y2()) || (message = messageObject.k) == null || message.rich_message == null)) {
            k08Var.run();
        } else {
            d dVar = this.a;
            dVar.getSendMessagesHelper().u(messageObject, messageObject.k.rich_message, null, dVar, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(gb2 gb2Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        wjb wjbVar;
        TLRPC.User currentUser = gb2Var.getCurrentUser();
        mu1 mu1Var = this.a;
        mu1Var.getUserConfig().f();
        if (!gl.C1(mu1Var.getParentActivity()) || (chat = mu1Var.e) == null || currentUser == null || hc2.V(chat)) {
            return;
        }
        boolean z4 = true;
        byte b = 0;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                z = false;
                b = 1;
            } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                z = channelParticipant.promoted_by == mu1Var.getUserConfig().e();
            } else {
                z = false;
                z4 = false;
            }
            str = channelParticipant.rank;
        } else {
            if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z2 = false;
                    b = 1;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    z2 = channelParticipant2.promoted_by == mu1Var.getUserConfig().e();
                } else {
                    z2 = false;
                    z4 = false;
                }
                str2 = channelParticipant2.rank;
                z3 = z2;
                boolean z5 = z4;
                boolean z6 = b;
                Activity parentActivity = mu1Var.getParentActivity();
                i = ((d) mu1Var).currentAccount;
                long j = -mu1Var.e.id;
                wjbVar = ((d) mu1Var).resourceProvider;
                wfb.b(parentActivity, i, j, currentUser, str2, z5, z6, z3, wjbVar);
            }
            if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                if (hc2.T(mu1Var.e)) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    mu1Var.getMessagesController();
                    tL_channels_getParticipant.channel = na7.g1(mu1Var.e);
                    tL_channels_getParticipant.participant = mu1Var.getMessagesController().h1(currentUser.id);
                    mu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new hc(b), new ae2((Object) this, (Object) gb2Var, (byte) 7));
                    return;
                }
                return;
            }
            if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                z = false;
                b = 1;
            } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                z = ((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == mu1Var.getUserConfig().e();
            } else {
                z = false;
                z4 = false;
            }
            str = ((TLRPC.ChatParticipant) tLObject).rank;
        }
        z3 = z;
        str2 = str;
        boolean z52 = z4;
        boolean z62 = b;
        Activity parentActivity2 = mu1Var.getParentActivity();
        i = ((d) mu1Var).currentAccount;
        long j2 = -mu1Var.e.id;
        wjbVar = ((d) mu1Var).resourceProvider;
        wfb.b(parentActivity2, i, j2, currentUser, str2, z52, z62, z3, wjbVar);
    }

    @Override // bb2
    public final boolean e0() {
        return this.a.g4 == 0;
    }

    @Override // bb2
    public final void e2(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject == null || messageObject.D != 27) {
            return;
        }
        messageObject.X5();
        messageObject.M1 = true;
        gb2Var.J1();
        gb2Var.requestLayout();
        this.a.D0.M(messageObject, false, false);
    }

    public final void f(gb2 gb2Var, boolean z, boolean z2, boolean z3) {
        k27 primaryMessageObject;
        int i;
        int i2;
        mq1 mq1Var;
        if (gb2Var == null || (primaryMessageObject = gb2Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        mu1 mu1Var = this.a;
        jq1 jq1Var = mu1Var.A0;
        if (jq1Var != null && (mq1Var = mu1Var.C0) != null && mq1Var.y < 0) {
            for (int childCount = jq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = mu1Var.A0.getChildAt(childCount);
                mu1Var.A0.getClass();
                i = RecyclerView.R(childAt);
                if (i >= 0) {
                    if (!(childAt instanceof gb2)) {
                        if (childAt instanceof uk1) {
                            i2 = mu1Var.a7(childAt);
                            break;
                        }
                    } else {
                        if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                            i2 = mu1Var.a7(childAt);
                            break;
                        }
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        if (z && i >= 0 && gb2Var.getCurrentMessagesGroup() == null) {
            mq1 mq1Var2 = mu1Var.C0;
            if (z3) {
                mu1Var.A0.getClass();
                mq1Var2.h1(RecyclerView.R(gb2Var), gb2Var.getTop() - ((int) mu1Var.P9), false);
            } else {
                mq1Var2.g1(i, i2);
            }
        }
        mu1Var.c1 = z2;
        mu1Var.Nc(primaryMessageObject, false);
        mu1Var.c1 = false;
    }

    @Override // bb2
    public final CharacterStyle f0(gb2 gb2Var) {
        mu1 mu1Var;
        int i;
        if (gb2Var.getMessageObject() == null || (i = (mu1Var = this.a).ac) == 0 || i != gb2Var.getMessageObject().e1() || mu1Var.bc != 1) {
            return null;
        }
        return mu1Var.cc;
    }

    public final boolean g() {
        mu1 mu1Var = this.a;
        if (l7c.D(mu1Var.f)) {
            return true;
        }
        TLRPC.Chat chat = mu1Var.e;
        if (chat != null) {
            return !hc2.T(chat) || mu1Var.e.megagroup;
        }
        return false;
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        return !this.a.s.containsKey(k27Var);
    }

    public final void h(gb2 gb2Var, TLRPC.Chat chat, int i, boolean z) {
        mu1 mu1Var = this.a;
        TLRPC.Chat chat2 = mu1Var.e;
        byte b = 0;
        if (chat2 != null) {
            long j = chat.id;
            long j2 = chat2.id;
            if (j == j2) {
                cq1 cq1Var = mu1Var.p1;
                if (cq1Var != null && i == 0) {
                    cq1Var.e(false, false);
                    return;
                } else {
                    if (gb2Var.getMessageObject() != null) {
                        mu1Var.J(i, gb2Var.getMessageObject().e1(), 0, 0, true, false);
                        return;
                    }
                    return;
                }
            }
            if (j == j2 && !mu1Var.a8()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i != 0) {
            bundle.putInt("message_id", i);
        }
        pp1 pp1Var = null;
        if (z) {
            c01 c01Var = mu1Var.ec;
            if (c01Var != null) {
                c01Var.a(true);
                mu1Var.ec = null;
            }
            if (gb2Var == null || gb2Var.getMessageObject() == null) {
                mu1Var.ec = null;
            } else {
                pp1 pp1Var2 = new pp1(mu1Var, gb2Var.getMessageObject().e1(), gb2Var, b);
                mu1Var.ec = pp1Var2;
                pp1Var = pp1Var2;
            }
        }
        if (mu1Var.getMessagesController().A(bundle, mu1Var, gb2Var.getMessageObject(), pp1Var)) {
            mu1 mu1Var2 = new mu1(bundle);
            if (pp1Var == null || i == 0) {
                mu1Var.presentFragment(mu1Var2);
                return;
            }
            pp1 pp1Var3 = pp1Var;
            gl.d3(new i57((Object) this, (Object) pp1Var3, (Object) chat, i, (Object) mu1Var2, (byte) 9), 5000L);
            pp1Var3.d();
        }
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        k27 messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (gb2Var != null && pageBlock != null) {
            mu1 mu1Var = this.a;
            if (mu1Var.getParentActivity() != null && (messageObject = gb2Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i = 0; i < arrayList2.size(); i++) {
                    mg9 mg9Var = (mg9) arrayList2.get(i);
                    if (mg9Var instanceof ah9) {
                        arrayList.add(((ah9) mg9Var).r0);
                    } else if (mg9Var instanceof mh9) {
                        arrayList.add(((mh9) mg9Var).r0);
                    } else if (mg9Var instanceof sg9) {
                        ArrayList arrayList3 = ((sg9) mg9Var).Y;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            arrayList.add(((gg9) obj).b);
                        }
                    } else if (mg9Var instanceof eh9) {
                        ArrayList arrayList4 = ((eh9) mg9Var).Y;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((gg9) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.T1(null, mu1Var, null);
                    return r0.n1(null, null, null, null, null, null, null, indexOf, new dt1(mu1Var, arrayList), null, 0L, 0L, 0L, true, new ct1(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void i(gb2 gb2Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            d dVar = this.a;
            if (dVar.getMessagesController().A(bundle, dVar, gb2Var.getMessageObject(), null)) {
                dVar.presentFragment(new mu1(bundle));
            }
        }
    }

    @Override // bb2
    public final boolean i0() {
        boolean z;
        mu1 mu1Var = this.a;
        if (mu1Var.T7()) {
            return false;
        }
        z = ((d) mu1Var).inPreviewMode;
        return !z;
    }

    @Override // bb2
    public final void i1() {
        mu1 mu1Var = this.a;
        mu1Var.b6();
        UndoView undoView = mu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, mu1Var.l6, null);
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        k27 messageObject;
        if (chat == null) {
            return;
        }
        mu1 mu1Var = this.a;
        aVar = ((d) mu1Var).actionBar;
        if (aVar.y() || mu1Var.T7()) {
            mu1Var.Ha(gb2Var, f, f2, true);
            return;
        }
        if (z || !chat.signature_profiles || (messageObject = gb2Var.getMessageObject()) == null || k27.B0(messageObject.k) == 1271266957) {
            h(gb2Var, chat, i, z);
        } else {
            mu1Var.ua(cf3.n(messageObject.k.from_id));
        }
    }

    public final void j(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override // bb2
    public final void j0(k27 k27Var) {
        if (k27.K4(k27Var.k)) {
            this.a.tb(k27Var, true);
        }
    }

    @Override // bb2
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        mu1 mu1Var = this.a;
        mu1Var.getSendMessagesHelper().m0(true, gb2Var.getMessageObject(), keyboardInlineButton, null, null, mu1Var);
    }

    public final void k(TLRPC.User user, boolean z) {
        int i;
        if (user == null || user.id == 489000) {
            return;
        }
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        int i2 = 0;
        if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("expandPhoto", z);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        mu1 mu1Var = this.a;
        TLRPC.User user2 = mu1Var.f;
        if (user2 != null && user2.id == user.id) {
            i2 = 1;
        }
        profileActivity.x3(i2);
        Activity parentActivity = mu1Var.getParentActivity();
        i = ((d) mu1Var).classGuid;
        gl.g3(parentActivity, i);
        mu1Var.presentFragment(profileActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // bb2
    public final boolean k2(gb2 gb2Var, final TLRPC.User user) {
        char c;
        int i;
        wb0 b;
        int i2;
        er1 er1Var;
        dr1 dr1Var;
        final byte b2 = 0;
        if (!g()) {
            return false;
        }
        mu1 mu1Var = this.a;
        final byte b3 = 1;
        ?? r2 = (mu1Var.e == null || ((er1Var = mu1Var.d1) != null && er1Var.getVisibility() == 0) || ((dr1Var = mu1Var.T) != null && dr1Var.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat = mu1Var.e;
        ?? r4 = (chat == null || !(mu1Var.s4 == 0 || mu1Var.x4) || (hc2.T(chat) && !mu1Var.e.megagroup)) ? 0 : 1;
        cc0[] cc0VarArr = new cc0[r2 + 2 + r4];
        cc0VarArr[0] = cc0.d;
        cc0VarArr[1] = cc0.h;
        final byte b4 = 2;
        if (r2 != 0) {
            cc0VarArr[2] = cc0.n;
            c = 3;
        } else {
            c = 2;
        }
        if (r4 != 0) {
            cc0VarArr[c] = cc0.r;
        }
        TLRPC.UserFull W1 = mu1Var.getMessagesController().W1(user.id);
        if (W1 != null) {
            b = wb0.c(user, W1, cc0VarArr);
            if (!xf4.i(b)) {
                i2 = ((d) mu1Var).classGuid;
                b = wb0.b(user, i2, cc0VarArr);
            }
        } else {
            i = ((d) mu1Var).classGuid;
            b = wb0.b(user, i, cc0VarArr);
        }
        if (xf4.i(b)) {
            xf4.t().J((ViewGroup) mu1Var.fragmentView, mu1Var.Ba, b, new ie((Object) this, (Object) gb2Var, (Object) user, (byte) 15));
            return true;
        }
        cs5 I = cs5.I(mu1Var, gb2Var);
        I.b(R.drawable.msg_openprofile, k96.M0(2131747593, null), new Runnable(this) { // from class: gt1
            public final /* synthetic */ wt1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b2;
                TLRPC.User user2 = user;
                wt1 wt1Var = this.b;
                switch (b5) {
                    case 0:
                        wt1Var.k(user2, false);
                        break;
                    case 1:
                        wt1Var.d(user2);
                        break;
                    default:
                        wt1Var.a.sa(user2);
                        break;
                }
            }
        }, false);
        I.b(R.drawable.msg_discussion, k96.M0(2131745409, null), new jn1(this, gb2Var, user, (byte) 4), false);
        I.k(R.drawable.msg_mention, k96.M0(2131748417, null), new Runnable(this) { // from class: gt1
            public final /* synthetic */ wt1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b3;
                TLRPC.User user2 = user;
                wt1 wt1Var = this.b;
                switch (b5) {
                    case 0:
                        wt1Var.k(user2, false);
                        break;
                    case 1:
                        wt1Var.d(user2);
                        break;
                    default:
                        wt1Var.a.sa(user2);
                        break;
                }
            }
        }, r2);
        I.k(R.drawable.msg_search, k96.M0(2131753755, null), new Runnable(this) { // from class: gt1
            public final /* synthetic */ wt1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                TLRPC.User user2 = user;
                wt1 wt1Var = this.b;
                switch (b5) {
                    case 0:
                        wt1Var.k(user2, false);
                        break;
                    case 1:
                        wt1Var.d(user2);
                        break;
                    default:
                        wt1Var.a.sa(user2);
                        break;
                }
            }
        }, r4);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gl.L(48.0f));
        I.a0();
        return true;
    }

    @Override // bb2
    public final boolean l() {
        return false;
    }

    @Override // bb2
    public final void l0(String str) {
        mu1 mu1Var = this.a;
        er1 er1Var = mu1Var.d1;
        if (er1Var == null || er1Var.getVisibility() != 0) {
            dr1 dr1Var = mu1Var.T;
            if ((dr1Var == null || dr1Var.getVisibility() != 0) && mu1Var.a0 != null && str != null && str.length() > 0) {
                mu1Var.a0.setFieldText("@" + str + " ");
                mu1Var.a0.h1();
            }
        }
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
        mu1 mu1Var = this.a;
        if (!mu1Var.getMessagesController().Y4()) {
            hd hdVar = new hd(3, null, mu1Var.getParentActivity());
            hdVar.q(200L);
            mu1Var.getMessagesController().P0(new ht(this, hdVar, gb2Var, (byte) 11));
        } else {
            if (gb2Var.getMessageObject() != null) {
                gb2Var.getMessageObject().t2 = Boolean.FALSE;
            }
            gb2Var.K3();
        }
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        k27 messageObject = gb2Var == null ? null : gb2Var.getMessageObject();
        if (messageObject == null || messageObject.k == null) {
            return false;
        }
        mu1 mu1Var = this.a;
        return (mu1Var.g4 == 1 || mu1Var.R7() || messageObject.k.noforwards || messageObject.D == 29) ? false : true;
    }

    @Override // bb2
    public final void m0(gb2 gb2Var, int i) {
        boolean z = gb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        mu1 mu1Var = this.a;
        if (z) {
            long j = -((TLRPC.TL_messageMediaGiveaway) gb2Var.getMessageObject().k.media).channels.get(i).longValue();
            if (mu1Var.l6 != j) {
                mu1Var.presentFragment(mu1.W9(j));
            } else {
                mu1Var.p1.e(false, false);
            }
        }
        if (gb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            mu1Var.presentFragment(ProfileActivity.P2(((TLRPC.TL_messageMediaGiveawayResults) gb2Var.getMessageObject().k.media).winners.get(i).longValue()));
        }
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.h6(gb2Var, reactionCount, z, f, f2);
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
        int i;
        de2 de2Var;
        f27 f27Var;
        int i2;
        mu1 mu1Var = this.a;
        wx8 wx8Var = mu1Var.ua;
        if (wx8Var != null) {
            HashMap hashMap = wx8Var.a;
            vx8 vx8Var = (vx8) hashMap.get(wx8.b(gb2Var));
            m21 m21Var = null;
            k27 k27Var = vx8Var != null ? vx8Var.F : null;
            vx8 vx8Var2 = (vx8) mu1Var.ua.a.get(wx8.b(gb2Var));
            long j = (vx8Var2 == null || (i2 = vx8Var2.S) == -1) ? 0L : vx8Var2.x[i2].d;
            if (k27Var != null && j != 0) {
                Activity parentActivity = mu1Var.getParentActivity();
                i = ((d) mu1Var).currentAccount;
                if (!ij.h(parentActivity, i, j, false)) {
                    ArrayList arrayList = (k27Var.c1() == 0 || (f27Var = (f27) mu1Var.P6.f(k27Var.c1())) == null) ? null : f27Var.d;
                    if (arrayList == null) {
                        arrayList = tb4.t(k27Var);
                    }
                    boolean z = j == y6c.h(y6c.t0).n;
                    long j2 = j;
                    de2 de2Var2 = new de2(this, arrayList, j2, (byte) 15);
                    if (z) {
                        de2Var2.run();
                        de2Var = null;
                    } else {
                        de2Var = de2Var2;
                    }
                    m21Var = u21.v(mu1Var.getParentActivity(), mu1Var, null, 1, j2, 1, mu1Var.getThemedColor(bkb.vj), mu1Var.getThemedColor(bkb.xj), 5000, false, de2Var);
                    m21Var.k = true;
                    m21Var.k(m21Var.e instanceof x11);
                }
            }
            vx8 vx8Var3 = (vx8) hashMap.get(wx8.b(gb2Var));
            if (vx8Var3 != null) {
                if (m21Var == null) {
                    vx8Var3.S = -1;
                    vx8Var3.c();
                    return;
                }
                q11 q11Var = m21Var.e;
                if (!(q11Var instanceof t11)) {
                    vx8Var3.c();
                    return;
                }
                t11 t11Var = (t11) q11Var;
                vx8Var3.X = t11Var;
                t11Var.a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = vx8Var3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ni3(vx8Var3, viewTreeObserver, (byte) 2));
            }
        }
    }

    @Override // bb2
    public final void p() {
        a.t();
        boolean z = w01.a;
        a.q();
        d01.t(this.a.getParentActivity(), w01.g);
    }

    @Override // bb2
    public final void q(gb2 gb2Var) {
        mu1 mu1Var = this.a;
        mu1Var.getNotificationCenter().k(kk7.o3, Long.valueOf(mu1Var.l6), gb2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010b, code lost:
    
        if (r1.noforwards == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0117, code lost:
    
        if (hc2.t0(r1) != false) goto L82;
     */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(gb2 gb2Var) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i2;
        TLRPC.Message message2;
        int i3;
        TLRPC.Peer peer;
        f27 f27Var;
        int i4;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() == null) {
            return;
        }
        kxb kxbVar = mu1Var.g2;
        boolean z = true;
        if (kxbVar != null && mu1Var.s4 == 0 && (gb2Var.l6 || gb2Var.m6)) {
            kxbVar.k(gb2Var.getMessageObject().Y1(), true);
            return;
        }
        if (mu1Var.getMessagesController().t2()) {
            i4 = ((d) mu1Var).currentAccount;
            h5.b(i4);
            return;
        }
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            ar1Var.S();
        }
        k27 messageObject = gb2Var.getMessageObject();
        int i5 = mu1Var.g4;
        if (i5 == 2) {
            mu1Var.n9.p(messageObject.e1());
            mu1Var.finishFragment();
            return;
        }
        if (i5 == 3 || ((i5 == 7 && mu1Var.d4 == 2) || !((!l7c.B(mu1Var.f) && !l7c.D(mu1Var.f)) || (messageFwdHeader = messageObject.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
            if (l7c.B(mu1Var.f) && (messageReplyHeader = (message = messageObject.k).reply_to) != null && (i = messageReplyHeader.reply_to_top_id) != 0) {
                mu1Var.fa(messageReplyHeader.reply_to_peer_id.channel_id, null, i, 0L, -1, message.fwd_from.saved_from_msg_id, messageObject);
                return;
            } else if (mu1Var.g4 == 7 && mu1Var.d4 == 2) {
                mu1Var.ka(messageObject);
                return;
            } else {
                mu1Var.la(messageObject);
                return;
            }
        }
        ArrayList arrayList = (messageObject.c1() == 0 || (f27Var = (f27) mu1Var.P6.f(messageObject.c1())) == null) ? null : f27Var.d;
        if (arrayList == null) {
            arrayList = tb4.t(messageObject);
        }
        if (mu1Var.getMessagesController().c5()) {
            int i6 = messageObject.K1;
            if (!messageObject.q4() && (((message2 = messageObject.k) == null || !message2.noforwards) && (i3 = messageObject.D) != 17 && i3 != 12)) {
                long B0 = k27.B0(message2);
                TLRPC.Chat K0 = na7.q1(i6).K0(Long.valueOf(-B0));
                if (K0 == null || !K0.noforwards) {
                    if (B0 >= 0 || !hc2.V(K0)) {
                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.k.fwd_from;
                        if (messageFwdHeader2 != null && (peer = messageFwdHeader2.from_id) != null && (messageFwdHeader2.flags & 4) != 0) {
                            long n = cf3.n(peer);
                            TLRPC.Chat K02 = na7.q1(i6).K0(Long.valueOf(-n));
                            if (n < 0) {
                                if (K02 != null) {
                                }
                                if (hc2.V(K02)) {
                                }
                            }
                        }
                    }
                    boolean z2 = z;
                    mu1Var.showDialog(new qt1(this, mu1Var.getParentActivity(), mu1Var, arrayList, hc2.T(mu1Var.e), z2, mu1Var.Ba, z2, messageObject));
                    Activity parentActivity = mu1Var.getParentActivity();
                    i2 = ((d) mu1Var).classGuid;
                    gl.g3(parentActivity, i2);
                    mu1Var.fragmentView.requestLayout();
                }
            }
        }
        z = false;
        boolean z22 = z;
        mu1Var.showDialog(new qt1(this, mu1Var.getParentActivity(), mu1Var, arrayList, hc2.T(mu1Var.e), z22, mu1Var.Ba, z22, messageObject));
        Activity parentActivity2 = mu1Var.getParentActivity();
        i2 = ((d) mu1Var).classGuid;
        gl.g3(parentActivity2, i2);
        mu1Var.fragmentView.requestLayout();
    }

    @Override // bb2
    public final void r0(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            return;
        }
        String N0 = k96.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
        if (TextUtils.isEmpty(N0)) {
            N0 = k96.M0(2131746401, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        k27.d(spannableStringBuilder, false);
        f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
        mu1 mu1Var = this.a;
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.e;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if ((((c27) arrayList.get(i)).l & 1) != 0) {
                    k27 k27Var = (k27) currentMessagesGroup.d.get(i);
                    if (k27Var != messageObject) {
                        int childCount = mu1Var.A0.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = mu1Var.A0.getChildAt(i2);
                            if (childAt instanceof gb2) {
                                gb2 gb2Var2 = (gb2) childAt;
                                if (k27Var.T(gb2Var2.getMessageObject())) {
                                    gb2Var = gb2Var2;
                                }
                            }
                        }
                        messageObject = k27Var;
                    }
                } else {
                    i++;
                }
            }
        }
        mu1Var.Zb(messageObject, spannableStringBuilder, 1);
        gb2Var.J3(1, false, true);
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null) {
            int a = ye8.a(messageObject);
            boolean a2 = fod.a(a, 7);
            mu1 mu1Var = this.a;
            if (a2) {
                u21.b0(mu1Var).Q(R.raw.e_hand_2, 36, ye8.b(a, messageObject)).j();
                return;
            }
            if (i < 0 && !arrayList.isEmpty()) {
                mu1Var.getSendMessagesHelper().v0(messageObject, arrayList, null);
                gb2Var.c0(true);
                return;
            }
            if (mu1Var.getParentActivity() != null) {
                if (mu1Var.C2 == null) {
                    int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    je5 s4 = mu1Var.s4(250.0f, 3, indexOfChild + 1, false);
                    mu1Var.C2 = s4;
                    s4.v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i < 0) {
                    ArrayList<fb2> pollButtons = gb2Var.getPollButtons();
                    int size = pollButtons.size();
                    int i4 = 0;
                    float f = 0.0f;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        fb2 fb2Var = pollButtons.get(i4);
                        float y = ((gb2Var.getY() + fb2Var.b) - gl.L(4.0f)) - mu1Var.P9;
                        mu1Var.F2 = gl.L(13.3f) + fb2Var.a;
                        int z = b00.z(6.0f, fb2Var.b, i3);
                        mu1Var.G2 = z;
                        if (y > 0.0f) {
                            i2 = mu1Var.F2;
                            i3 = z;
                            f = 0.0f;
                            break;
                        }
                        i4++;
                        f = y;
                    }
                    if (f != 0.0f) {
                        mu1Var.A0.x0(0, (int) f, null);
                        mu1Var.E2 = gb2Var;
                        return;
                    }
                }
                mu1Var.ec(gb2Var, i, i2, i3);
            }
        }
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Document document;
        int i3;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i4;
        TLRPC.Document document3;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        long j3;
        int i8;
        wjb wjbVar;
        wjb wjbVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k27.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m1 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
        TLRPC.WebPage webPage = messageMedia.webpage;
        if (webPage != null) {
            K1(gb2Var, webPage, webPage.url, messageMedia.safe);
            return;
        }
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        mu1 mu1Var = this.a;
        if (geoPoint != null) {
            if (gl.H1(mu1Var)) {
                tt1 tt1Var = new tt1(3);
                wjbVar2 = ((d) mu1Var).resourceProvider;
                tt1Var.setResourceProvider(wjbVar2);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = mu1Var.getMessagesController().w1(mu1Var.a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                tt1Var.V0 = false;
                tt1Var.F0(new k27(y6c.t0, tL_message, false, false));
                mu1Var.presentFragment(tt1Var);
                return;
            }
            return;
        }
        if (k27.N2(messageMedia.document)) {
            xv2.e().l(mu1Var.getParentActivity());
            xv2.e().k(new ut1(this, tL_messageMediaPoll, pollAnswer, gb2Var));
            xv2 e = xv2.e();
            TLRPC.Document document4 = messageMedia.document;
            int i9 = k27.H2(document4) ? 2 : 0;
            k27 messageObject2 = gb2Var.getMessageObject();
            wjbVar = ((d) mu1Var).resourceProvider;
            e.i(document4, null, "", null, null, i9, false, messageObject2, wjbVar, kk7.d3);
            return;
        }
        if (k27.J3(messageMedia.document)) {
            k27 k27Var = MediaController.w().v0;
            if (MediaController.w().D(messageObject) && k27Var != null) {
                if (k27Var.m0 == (i == -3)) {
                    if (MediaController.w().C()) {
                        MediaController.w().R(k27Var);
                        return;
                    } else {
                        MediaController.w().Q(k27Var, true);
                        return;
                    }
                }
            }
            TLRPC.Message message = messageObject.k;
            TLRPC.TL_message I5 = mu1.I5(message);
            I5.media = messageMedia;
            I5.attachPath = ud8.c(i, message);
            ArrayList arrayList = new ArrayList();
            i8 = ((d) mu1Var).currentAccount;
            k27 k27Var2 = new k27(i8, I5, false, true);
            k27Var2.m0 = i == -3;
            arrayList.add(k27Var2);
            if (MediaController.w().D(messageObject)) {
                MediaController.w().l(false, true, false, false);
            }
            MediaController.w().n0(arrayList, k27Var2, 0L, true, null, 0L);
            return;
        }
        TLRPC.Document document5 = messageMedia.document;
        if (document5 != null && !k27.J4(document5)) {
            i6 = ((d) mu1Var).currentAccount;
            TLRPC.Document document6 = messageMedia.document;
            bb4 bb4Var = new bb4(i6, messageObject, document6, ud8.c(i, messageObject.k));
            if (bb4Var.g) {
                ba4.G(i6).f(document6);
                bb4Var.a();
                gb2Var.b0();
                return;
            }
            if (!bb4Var.f) {
                ba4.G(i6).X(document6, messageObject, 2, 0);
                bb4Var.a();
                gb2Var.b0();
                return;
            }
            TLRPC.Message message2 = messageObject.k;
            TLRPC.TL_message I52 = mu1.I5(message2);
            I52.media = messageMedia;
            I52.attachPath = ud8.c(i, message2);
            i7 = ((d) mu1Var).currentAccount;
            vt1 vt1Var = new vt1(i7, I52, false, true);
            if (!k27.y(messageMedia.document)) {
                try {
                    gl.r2(vt1Var, mu1Var.getParentActivity(), mu1Var.Ba, false);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    mu1Var.A4(vt1Var);
                    return;
                }
            }
            PhotoViewer.r0().T1(null, mu1Var, mu1Var.Ba);
            PhotoViewer r0 = PhotoViewer.r0();
            if (vt1Var.D != 0) {
                j = mu1Var.l6;
                j2 = mu1Var.d7;
                j3 = mu1Var.d();
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            r0.m1(vt1Var, mu1Var, j, j2, j3, mu1Var.db);
            return;
        }
        TLRPC.Message message3 = messageObject.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k27.J4(document3))) {
            i2 = messageMedia3 == messageMedia ? arrayList3.size() : -1;
            TLRPC.TL_message I53 = mu1.I5(message3);
            I53.media = messageMedia3;
            I53.attachPath = ud8.c(-2, message3);
            i5 = ((d) mu1Var).currentAccount;
            arrayList3.add(new mt1(i5, I53, false, true));
            arrayList2.add(-2);
        } else {
            i2 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k27.J4(document2))) {
            if (messageMedia2 == messageMedia) {
                i2 = arrayList3.size();
            }
            TLRPC.TL_message I54 = mu1.I5(message3);
            I54.media = messageMedia2;
            I54.attachPath = ud8.c(-3, message3);
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            I54.message = pollResults2.solution;
            I54.entities = pollResults2.solution_entities;
            i4 = ((d) mu1Var).currentAccount;
            arrayList3.add(new nt1(i4, I54, false, true));
            arrayList2.add(-3);
        }
        apb.b(tL_messageMediaPoll.poll, mu1Var.getUserConfig().e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
        if (arrayList4 == null) {
            arrayList4 = poll.answers;
        }
        int i10 = i2;
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i11);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k27.J4(document))) {
                if (pollAnswer2.unshuffled_index == i) {
                    i10 = arrayList3.size();
                }
                TLRPC.TL_message I55 = mu1.I5(message3);
                I55.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                I55.message = tL_textWithEntities2.text;
                I55.entities = tL_textWithEntities2.entities;
                I55.attachPath = ud8.c(pollAnswer2.unshuffled_index, message3);
                i3 = ((d) mu1Var).currentAccount;
                arrayList3.add(new ot1(i3, I55, false, true));
                arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            }
        }
        if (i10 <= -1 || arrayList3.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList2;
        PhotoViewer.r0().T1(null, mu1Var, mu1Var.Ba);
        PhotoViewer.r0().j1(arrayList3, i10, mu1Var.a(), 0L, 0L, mu1Var.eb);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s0(gb2 gb2Var, boolean z) {
        k27 messageObject;
        f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null) {
            ArrayList arrayList = currentMessagesGroup.d;
            if (!arrayList.isEmpty()) {
                messageObject = (k27) arrayList.get(0);
                if (messageObject != null) {
                    mu1 mu1Var = this.a;
                    boolean z2 = !mu1Var.Rc && messageObject.e1() == mu1Var.Qc;
                    if (!z) {
                        return z2;
                    }
                    if (z2 && System.currentTimeMillis() - mu1Var.Sc > 1000) {
                        return true;
                    }
                }
                return false;
            }
        }
        messageObject = gb2Var.getMessageObject();
        if (messageObject != null) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bb2
    public final void s2(gb2 gb2Var, float f, float f2) {
        k27 messageObject = gb2Var.getMessageObject();
        int i = messageObject.D;
        mu1 mu1Var = this.a;
        if (i != 16) {
            mu1Var.R5(gb2Var, true, false, f, f2, messageObject.I3(), false, false);
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        int i2 = 0;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
            TLRPC.User user = mu1Var.f;
            if (user != null) {
                boolean I4 = messageObject.I4();
                TLRPC.UserFull userFull = mu1Var.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i2 = 1;
                }
                rgc.m(user, I4, i2, mu1Var.getParentActivity(), mu1Var.getMessagesController().W1(mu1Var.f.id), mu1Var.getAccountInstance());
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(mu1Var.a()));
        ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
        int size = arrayList.size();
        while (i2 < size) {
            TLRPC.Peer peer = arrayList.get(i2);
            i2++;
            hashSet.add(Long.valueOf(cf3.n(peer)));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
        hd hdVar = new hd(3, null, mu1Var.getParentActivity());
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = mu1Var.getMessagesController().k4.w3.f();
        hdVar.setOnCancelListener(new xs0(this, mu1Var.getConnectionsManager().sendRequest(getgroupcall, new fn0((Object) this, (Object) hdVar, (Object) hashSet, (Object) tL_inputGroupCallInviteMessage, (Object) messageObject, (byte) 5)), (byte) 2));
        hdVar.q(600L);
    }

    @Override // bb2
    public final void t() {
        this.a.rc();
    }

    @Override // bb2
    public final void u2() {
        this.a.I7();
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        mu1 mu1Var = this.a;
        if (mu1Var.S7()) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        if (mu1Var.getParentActivity() != null) {
            if (mu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                if (tL_inlineButtonTypeCopy == null) {
                    if (tL_inlineButtonTypeUrl != null) {
                        mu1Var.ea(null, tL_inlineButtonTypeUrl.url, true, gb2Var, gb2Var.getMessageObject());
                        try {
                            gb2Var.performHapticFeedback(0, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                String str = tL_inlineButtonTypeCopy.copy_text;
                fx0 fx0Var = new fx0(1, (wjb) mu1Var.Ba, (Context) mu1Var.getParentActivity(), false);
                fx0Var.K();
                fx0Var.P = str;
                fx0Var.Q = false;
                fx0Var.R = true;
                CharSequence[] charSequenceArr = {k96.M0(2131751755, null)};
                fe feVar = new fe((Object) mu1Var, (Object) str, (byte) 3);
                fx0Var.M = charSequenceArr;
                fx0Var.L = feVar;
                mu1Var.showDialog(fx0Var);
            }
        }
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f, float f2) {
        vx8 vx8Var;
        wx8 wx8Var = this.a.ua;
        if (wx8Var == null || (vx8Var = (vx8) wx8Var.a.get(wx8.b(gb2Var))) == null) {
            return;
        }
        sx8[] sx8VarArr = vx8Var.x;
        RectF rectF = vx8Var.r;
        if (vx8Var.N) {
            float f3 = (f - rectF.left) + vx8Var.V;
            float f4 = (f2 - rectF.top) + vx8Var.W;
            int b = (((float) (-gl.L(37.0f))) >= f4 || f4 >= rectF.height()) ? -1 : moe.b((int) Math.floor((f3 - (gl.L(9.0f) - (gl.L(11.0f) / 2.0f))) / gl.L(53.0f)), 0, sx8VarArr.length - 1);
            if (vx8Var.S != b) {
                vx8Var.a.performHapticFeedback(3, 1);
                vx8Var.S = b;
                int i = 0;
                while (i < sx8VarArr.length) {
                    sx8 sx8Var = sx8VarArr[i];
                    boolean z = b == i;
                    if (sx8Var.p != z) {
                        ValueAnimator valueAnimator = sx8Var.n;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        sx8Var.p = z;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(sx8Var.o, z ? 1.0f : 0.0f);
                        sx8Var.n = ofFloat;
                        ofFloat.setDuration(180L);
                        sx8Var.n.addUpdateListener(sx8Var);
                        sx8Var.n.setInterpolator(ux8.a);
                        sx8Var.n.start();
                    }
                    sx8 sx8Var2 = sx8VarArr[i];
                    boolean z2 = b == i || b == -1;
                    if (sx8Var2.m != z2) {
                        ValueAnimator valueAnimator2 = sx8Var2.k;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        sx8Var2.m = z2;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(sx8Var2.l, z2 ? 1.0f : 0.0f);
                        sx8Var2.k = ofFloat2;
                        ofFloat2.setDuration(180L);
                        sx8Var2.k.addUpdateListener(sx8Var2);
                        sx8Var2.k.setInterpolator(ux8.a);
                        sx8Var2.k.start();
                    }
                    i++;
                }
            }
        }
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
        mu1 mu1Var = this.a;
        mu1Var.Ua.k(gb2Var, mu1Var, true);
        mu1Var.A0.J0(false);
    }

    @Override // bb2
    public final void w0(gb2 gb2Var, int i, int i2) {
        k27 messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        mu1 mu1Var = this.a;
        je5 je5Var = mu1Var.P1;
        if (je5Var != null) {
            je5Var.f(true);
        }
        if (mu1Var.getParentActivity() == null || (messageObject = gb2Var.getMessageObject()) == null || (R0 = messageObject.R0()) == null || R0.country == null) {
            return;
        }
        try {
            str = new Locale("", R0.country).getDisplayCountry(k96.D0().y);
        } catch (Exception e) {
            fa4.g(e, true);
            str = R0.country;
        }
        je5 je5Var2 = new je5(mu1Var.getParentActivity(), 3);
        je5Var2.p(true);
        je5Var2.L = Layout.Alignment.ALIGN_NORMAL;
        je5Var2.d = -1L;
        je5Var2.U = true;
        je5Var2.e = true;
        je5Var2.q(12.0f);
        mu1Var.P1 = je5Var2;
        je5Var2.r0 = new aj1(this, je5Var2, (byte) 22);
        je5Var2.t(gl.S2(k96.a0(null, null, 2131750836, str)));
        mu1Var.P1.k(mu1Var.L);
        mu1Var.m1.addView(mu1Var.P1, nme.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
        mu1Var.m1.post(new mp1(this, gb2Var, i2, i, (byte) 2));
    }

    @Override // bb2
    public final String x(long j) {
        TLRPC.Peer peer;
        String A0;
        mu1 mu1Var = this.a;
        if (!l7c.w(mu1Var.f)) {
            TLRPC.Chat chat = mu1Var.e;
            if (chat != null && !hc2.V(chat) && (A0 = mu1Var.getMessagesController().A0(mu1Var.e.id, j)) != null) {
                return A0;
            }
            TLRPC.TL_forumTopic tL_forumTopic = mu1Var.r4;
            if (tL_forumTopic != null && (peer = tL_forumTopic.from_id) != null && (peer.user_id == j || peer.channel_id == j || peer.chat_id == j)) {
                return k96.M0(2131743783, null);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bb2
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        String str;
        boolean z2;
        wb0 wb0Var;
        int i5;
        int i6;
        er1 er1Var;
        dr1 dr1Var;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(hc2.K(chat, false));
        mu1 mu1Var = this.a;
        int i7 = (isEmpty || mu1Var.e == null || ((er1Var = mu1Var.d1) != null && er1Var.getVisibility() == 0) || ((dr1Var = mu1Var.T) != null && dr1Var.getVisibility() == 0)) ? 0 : 1;
        TLRPC.Chat chat2 = mu1Var.e;
        int i8 = (chat2 == null || !(mu1Var.s4 == 0 || mu1Var.x4) || (hc2.T(chat2) && !mu1Var.e.megagroup)) ? 0 : 1;
        TLRPC.Chat chat3 = mu1Var.e;
        int i9 = (chat3 == null || chat3.id != chat.id || mu1Var.a8()) ? 1 : 0;
        cc0[] cc0VarArr = new cc0[i9 + 1 + i7 + i8];
        cc0VarArr[0] = cc0.d;
        if (i9 != 0) {
            cc0VarArr[1] = chat.broadcast ? cc0.e : cc0.f;
            i = 2;
        } else {
            i = 1;
        }
        if (i7 != 0) {
            cc0VarArr[i] = cc0.n;
            i++;
        }
        if (i8 != 0) {
            cc0VarArr[i] = cc0.r;
        }
        TLRPC.ChatFull L0 = mu1Var.getMessagesController().L0(chat.id);
        if (L0 != null) {
            wb0Var = wb0.a(chat, L0, cc0VarArr);
            i3 = i7;
            i4 = i8;
            z = true;
            str = null;
            z2 = i9;
        } else {
            i2 = ((d) mu1Var).classGuid;
            gl5 m = gl5.m(y6c.t0, 0, chat);
            gl5 m2 = gl5.m(y6c.t0, 1, chat);
            String str2 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            z = true;
            i3 = i7;
            i4 = i8;
            str = null;
            z2 = i9;
            wb0Var = new wb0(m, m2, null, str2, null, null, chatPhoto != null ? chatPhoto.strippedBitmap : null, chat, cc0VarArr, new vb0(i2, kk7.S, chat));
        }
        if (xf4.i(wb0Var)) {
            xf4.t().J((ViewGroup) mu1Var.fragmentView, mu1Var.Ba, wb0Var, new ie((Object) this, (Object) chat, (Object) gb2Var, (byte) 16));
            return z;
        }
        cs5 I = cs5.I(mu1Var, gb2Var);
        I.b(R.drawable.msg_openprofile, k96.M0(2131747593, str), new it1(this, chat, (byte) 0), false);
        if (chat.broadcast) {
            i5 = R.drawable.msg_channel;
            i6 = 2131747618;
        } else {
            i5 = R.drawable.msg_discussion;
            i6 = 2131747606;
        }
        I.k(i5, k96.M0(i6, str), new jn1(this, gb2Var, chat, (byte) 5), z2);
        I.k(R.drawable.msg_mention, k96.M0(2131748417, str), new it1(this, chat, z ? (byte) 1 : (byte) 0), i3);
        I.k(R.drawable.msg_search, k96.M0(2131753755, str), new it1(this, chat, (byte) 2), i4);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gl.L(48.0f));
        I.a0();
        return true;
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
        jd8 jd8Var = this.a.ld;
        if (jd8Var == null || jd8Var.n != gb2Var) {
            return;
        }
        jd8Var.x.getClass();
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
        f(gb2Var, z, true, z2);
    }

    @Override // bb2
    public final boolean y1() {
        mu1 mu1Var = this.a;
        return mu1Var.m1.getMeasuredWidth() > mu1Var.m1.getMeasuredHeight();
    }

    @Override // bb2
    public final boolean y2(int i) {
        boolean z;
        ui5 ui5Var;
        ui5 ui5Var2;
        if (i != 16 && i != R.id.acc_action_small_button && i != R.id.acc_action_msg_options) {
            return false;
        }
        mu1 mu1Var = this.a;
        z = ((d) mu1Var).inPreviewMode;
        if (!z || !mu1Var.ga) {
            return !b();
        }
        ui5Var = ((d) mu1Var).parentLayout;
        if (ui5Var != null) {
            ui5Var2 = ((d) mu1Var).parentLayout;
            ((ActionBarLayout) ui5Var2).p();
        }
        return true;
    }

    @Override // bb2
    public final boolean z1(k27 k27Var) {
        vs1 vs1Var;
        long B0 = k27.B0(k27Var.k);
        mu1 mu1Var = this.a;
        return (B0 == 1271266957 || ((vs1Var = mu1Var.D0) != null && vs1Var.O)) && mu1Var.g4 != 7;
    }
}
