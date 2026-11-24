// default package

import android.content.Context;
import android.graphics.Paint;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qa2 extends d implements jm7 {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public f56 H;
    public xib I;
    public njb J;
    public bba K;
    public pa2 L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public qf1 P;
    public ArrayList Q;
    public LinearLayout R;
    public jf5 S;
    public bjb T;
    public njb U;
    public ma2 V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public ia2 a;
    public long a0;
    public l7 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public njb d;
    public boolean d0;
    public jf5 e;
    public boolean e0;
    public jf5 f;
    public bba f0;
    public ArrayList g0;
    public ka2 h;
    public pa6 h0;
    public int i0;
    public String j0;
    public lx1 k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public t1 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public xs5 q0;
    public uja r;
    public da2 r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public v09 w;
    public v09 x;
    public LinearLayout y;

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.v6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
    }

    public final void b0() {
        boolean z;
        uja ujaVar = this.r;
        if (!this.W && this.b.length() <= 0) {
            ArrayList arrayList = this.O;
            z = false;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            ujaVar.a(z, true);
        }
        z = true;
        ujaVar.a(z, true);
    }

    public final void c0(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        lx1 lx1Var = this.k0;
        if (lx1Var != null) {
            gm.r(lx1Var);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(jb6.M0(2131748666, null));
                this.h.setTextColorByKey(cmb.o7);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (i == 0 && charAt >= '0' && charAt <= '9') {
                    boolean z = this.b0;
                    ka2 ka2Var = this.h;
                    if (z) {
                        ka2Var.setText(jb6.M0(2131748662, null));
                    } else {
                        ka2Var.setText(jb6.M0(2131748661, null));
                    }
                    this.h.setTextColorByKey(cmb.o7);
                    return;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(jb6.M0(2131748666, null));
                    this.h.setTextColorByKey(cmb.o7);
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            boolean z2 = this.b0;
            ka2 ka2Var2 = this.h;
            if (z2) {
                ka2Var2.setText(jb6.M0(2131748664, null));
            } else {
                ka2Var2.setText(jb6.M0(2131748663, null));
            }
            this.h.setTextColorByKey(cmb.o7);
            return;
        }
        int length = str.length();
        ka2 ka2Var3 = this.h;
        if (length > 32) {
            ka2Var3.setText(jb6.M0(2131748665, null));
            this.h.setTextColorByKey(cmb.o7);
            return;
        }
        ka2Var3.setText(jb6.M0(2131748679, null));
        this.h.setTextColorByKey(cmb.E6);
        this.j0 = str;
        lx1 lx1Var2 = new lx1(this, str, (byte) 28);
        this.k0 = lx1Var2;
        gm.d3(lx1Var2, 300L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ha2(this, context));
        this.r = this.simpleActionBar.s(jb6.M0(2131745680, null));
        this.n = new t1(context, (byte) 9);
        this.a = new ia2(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, qoe.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z = this.o0;
        if (z) {
            this.simpleActionBar.setTitle(jb6.M0(2131743617, null));
        } else {
            boolean z2 = this.b0;
            rja rjaVar = this.simpleActionBar;
            if (z2) {
                rjaVar.setTitle(jb6.M0(2131752235, null));
            } else {
                rjaVar.setTitle(jb6.M0(2131749157, null));
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, qoe.o(-1, -2));
        jf5 jf5Var = new jf5(context, 23);
        this.f = jf5Var;
        jf5Var.setHeight(46);
        boolean z3 = this.b0;
        jf5 jf5Var2 = this.f;
        if (z3) {
            jf5Var2.setText(jb6.M0(2131752213, null));
        } else {
            jf5Var2.setText(jb6.M0(2131749148, null));
        }
        this.s.addView(this.f);
        v09 v09Var = new v09(context, false);
        this.x = v09Var;
        if (this.b0) {
            v09Var.b(jb6.M0(2131752271, null), jb6.M0(2131752270, null), false, this.W);
        } else {
            v09Var.b(jb6.M0(2131748398, null), jb6.M0(2131748397, null), false, this.W);
        }
        this.s.addView(this.x, qoe.o(-1, -2));
        this.x.setOnClickListener(new ga2(this, b));
        v09 v09Var2 = new v09(context, false);
        this.w = v09Var2;
        if (this.b0) {
            v09Var2.b(jb6.M0(2131752260, null), jb6.M0(2131752257, null), false, !this.W);
        } else {
            v09Var2.b(jb6.M0(2131748395, null), jb6.M0(2131748394, null), false, !this.W);
        }
        this.s.addView(this.w, qoe.o(-1, -2));
        this.w.setOnClickListener(new ga2(this, (byte) 2));
        bba bbaVar = new bba(context, (hg9) null);
        this.K = bbaVar;
        this.n.addView(bbaVar, qoe.o(-1, -2));
        if (z) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, qoe.o(-1, -2));
        jf5 jf5Var3 = new jf5(context, 23);
        this.e = jf5Var3;
        this.E.addView(jf5Var3);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, qoe.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().N2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i = cmb.G6;
        anb.D(editTextBoldCursor2, i, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i2 = cmb.F6;
        anb.X(editTextBoldCursor3, i2, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, qoe.o(-2, 36));
        l7 l7Var = new l7(b, context, this);
        this.b = l7Var;
        l7Var.setTextSize(1, 18.0f);
        anb.D(this.b, i, null);
        anb.X(this.b, i2, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(jb6.M0(2131752203, null));
        anb.v(this.b, i2, null);
        this.b.setCursorSize(gm.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, qoe.o(-1, 36));
        this.b.addTextChangedListener(new b7(this, (byte) 12));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, qoe.o(-1, -2));
        f56 f56Var = new f56(context, this, null, true, sd2.T(this.Y));
        this.H = f56Var;
        f56Var.setDelegate(new ja2(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        ka2 ka2Var = new ka2(this, context, this.resourceProvider);
        this.h = ka2Var;
        ka2Var.setBottomPadding(6);
        this.n.addView(this.h, qoe.o(-2, -2));
        njb njbVar = new njb(12, this.resourceProvider, context);
        this.d = njbVar;
        njbVar.setImportantForAccessibility(1);
        this.n.addView(this.d, qoe.o(-1, -2));
        pa6 pa6Var = new pa6(context);
        this.h0 = pa6Var;
        this.n.addView(pa6Var, qoe.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, qoe.o(-1, -2));
        bba bbaVar2 = new bba(context, (hg9) null);
        this.f0 = bbaVar2;
        this.n.addView(bbaVar2, qoe.o(-1, -2));
        t1 t1Var = this.n;
        pa2 pa2Var = new pa2(this, context);
        this.L = pa2Var;
        t1Var.addView(pa2Var, qoe.o(-1, -2));
        this.L.setVisibility((this.W || this.O.isEmpty()) ? 8 : 0);
        xib xibVar = new xib(context);
        this.I = xibVar;
        xibVar.o(R.drawable.msg_link2, jb6.M0(2131748452, null), false);
        this.I.setOnClickListener(new ga2(this, (byte) 3));
        this.n.addView(this.I, qoe.o(-1, -2));
        njb njbVar2 = new njb(12, this.resourceProvider, context);
        this.J = njbVar2;
        this.n.addView(njbVar2, qoe.o(-1, -2));
        ma2 ma2Var = new ma2(this, context, this.Y, context);
        this.V = ma2Var;
        TLRPC.ChatFull chatFull = this.Z;
        ma2Var.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        ma2 ma2Var2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        njb njbVar3 = ma2Var2.e;
        boolean V = sd2.V(ma2Var2.n);
        boolean t0 = sd2.t0(ma2Var2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            njbVar3.setText(jb6.M0(V ? 2131752240 : t0 ? 2131749160 : 2131749163, null));
        } else {
            njbVar3.setText(gm.M2(jb6.a0(null, null, V ? 2131752239 : t0 ? 2131749159 : 2131749162, "@" + pg3.q(oc7.r1(z8c.t0).W1(Long.valueOf(chatFull2.guard_bot_id)))), cmb.Yl, null, new fd5(chatFull2, this, (byte) 18), false));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        jf5 jf5Var4 = new jf5(context, 23);
        this.S = jf5Var4;
        jf5Var4.setHeight(46);
        this.S.setText(jb6.M0(2131745597, null));
        this.R.addView(this.S, qoe.o(-1, -2));
        bjb bjbVar = new bjb(context);
        this.T = bjbVar;
        bjbVar.f(jb6.M0(2131745795, null), this.c0, false);
        this.T.setOnClickListener(new ga2(this, (byte) 4));
        this.R.addView(this.T, qoe.o(-1, -2));
        this.U = new njb(12, this.resourceProvider, context);
        if (!this.b0 || sd2.n0(this.Y)) {
            this.U.setText(jb6.M0(2131745793, null));
        } else {
            this.U.setText(jb6.M0(2131745794, null));
        }
        this.R.addView(this.U, qoe.o(-1, -2));
        String K = sd2.K(this.Y, true);
        if (!this.W && K != null) {
            this.n0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new r91((byte) 3, this, z)), this.classGuid);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
                return;
            }
            return;
        }
        if (i == nm7.y1) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                tk5 tk5Var = this.parentLayout;
                if (tk5Var == null || tk5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    public final void e0() {
        boolean z;
        ArrayList<TLRPC.TL_username> arrayList;
        gm.d3(this.r0, 200L);
        if (getParentActivity() != null) {
            final byte b = 1;
            String K = sd2.K(this.Y, true);
            final byte b2 = 0;
            if (!this.W) {
                l7 l7Var = this.b;
                if (K != null ? !K.equalsIgnoreCase(l7Var.getText().toString()) : l7Var.length() != 0) {
                    if (this.b.length() != 0 && !this.l0) {
                        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        gm.z3(this.h);
                        g0(false);
                        return;
                    }
                }
            }
            if (K == null) {
                K = "";
            }
            String obj = this.W ? "" : this.b.getText().toString();
            final byte b3 = 2;
            if (!K.equals(obj)) {
                if (!sd2.T(this.Y)) {
                    getMessagesController().P(getParentActivity(), this.a0, this, new xe7(this) { // from class: ea2
                        public final /* synthetic */ qa2 b;

                        {
                            this.b = this;
                        }

                        @Override // xe7
                        public final void run(long j) {
                            byte b4 = b;
                            qa2 qa2Var = this.b;
                            switch (b4) {
                                case 0:
                                    if (j != 0) {
                                        qa2Var.a0 = j;
                                        qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j));
                                        qa2Var.e0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (j != 0) {
                                        qa2Var.a0 = j;
                                        qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j));
                                        qa2Var.e0();
                                        break;
                                    }
                                    break;
                                default:
                                    if (j != 0) {
                                        qa2Var.a0 = j;
                                        qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j));
                                        oc7 messagesController = qa2Var.getMessagesController();
                                        long j2 = -qa2Var.a0;
                                        TLRPC.Chat chat = qa2Var.Y;
                                        boolean z2 = qa2Var.c0;
                                        chat.noforwards = z2;
                                        messagesController.l5(j2, 0, z2, null);
                                        qa2Var.e0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, null);
                    return;
                }
                oc7 messagesController = getMessagesController();
                long j = this.a0;
                da2 da2Var = new da2(this, b);
                da2 da2Var2 = new da2(this, b3);
                messagesController.getClass();
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = messagesController.g1(j);
                tL_channels_updateUsername.username = obj;
                messagesController.getConnectionsManager().sendRequest(tL_channels_updateUsername, new s97(messagesController, j, obj, da2Var, this, tL_channels_updateUsername, da2Var2), 64);
                return;
            }
            if (!this.W || (arrayList = this.Y.usernames) == null || arrayList.isEmpty()) {
                z = true;
            } else if (this.t0) {
                z = false;
            } else {
                this.t0 = true;
                boolean z2 = false;
                for (int i = 0; i < this.Y.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = this.Y.usernames.get(i);
                    if (tL_username != null && tL_username.active && !tL_username.editable) {
                        z2 = true;
                    }
                }
                if (z2) {
                    TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                    tL_channels_deactivateAllUsernames.channel = oc7.h1(this.Y);
                    getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new ca2(this, b3));
                } else {
                    this.t0 = false;
                }
                z = !z2;
            }
            if (z) {
                TLRPC.Chat chat = this.Y;
                if (chat.noforwards != this.c0) {
                    if (!sd2.T(chat)) {
                        g0(true);
                        getMessagesController().P(getParentActivity(), this.a0, this, new xe7(this) { // from class: ea2
                            public final /* synthetic */ qa2 b;

                            {
                                this.b = this;
                            }

                            @Override // xe7
                            public final void run(long j2) {
                                byte b4 = b3;
                                qa2 qa2Var = this.b;
                                switch (b4) {
                                    case 0:
                                        if (j2 != 0) {
                                            qa2Var.a0 = j2;
                                            qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j2));
                                            qa2Var.e0();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (j2 != 0) {
                                            qa2Var.a0 = j2;
                                            qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j2));
                                            qa2Var.e0();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (j2 != 0) {
                                            qa2Var.a0 = j2;
                                            qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j2));
                                            oc7 messagesController2 = qa2Var.getMessagesController();
                                            long j22 = -qa2Var.a0;
                                            TLRPC.Chat chat2 = qa2Var.Y;
                                            boolean z22 = qa2Var.c0;
                                            chat2.noforwards = z22;
                                            messagesController2.l5(j22, 0, z22, null);
                                            qa2Var.e0();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, null);
                        return;
                    }
                    oc7 messagesController2 = getMessagesController();
                    long j2 = -this.a0;
                    TLRPC.Chat chat2 = this.Y;
                    boolean z3 = this.c0;
                    chat2.noforwards = z3;
                    messagesController2.l5(j2, 0, z3, null);
                }
                if (this.V != null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    if (!this.b0 && !sd2.T(this.Y)) {
                        ma2 ma2Var = this.V;
                        if (ma2Var.f || ma2Var.h) {
                            getMessagesController().P(getParentActivity(), this.a0, this, new xe7(this) { // from class: ea2
                                public final /* synthetic */ qa2 b;

                                {
                                    this.b = this;
                                }

                                @Override // xe7
                                public final void run(long j22) {
                                    byte b4 = b2;
                                    qa2 qa2Var = this.b;
                                    switch (b4) {
                                        case 0:
                                            if (j22 != 0) {
                                                qa2Var.a0 = j22;
                                                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j22));
                                                qa2Var.e0();
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (j22 != 0) {
                                                qa2Var.a0 = j22;
                                                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j22));
                                                qa2Var.e0();
                                                break;
                                            }
                                            break;
                                        default:
                                            if (j22 != 0) {
                                                qa2Var.a0 = j22;
                                                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j22));
                                                oc7 messagesController22 = qa2Var.getMessagesController();
                                                long j222 = -qa2Var.a0;
                                                TLRPC.Chat chat22 = qa2Var.Y;
                                                boolean z22 = qa2Var.c0;
                                                chat22.noforwards = z22;
                                                messagesController22.l5(j222, 0, z22, null);
                                                qa2Var.e0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, null);
                            return;
                        }
                    }
                    if (this.Y.join_to_send != this.V.f) {
                        oc7 messagesController3 = getMessagesController();
                        long j3 = this.a0;
                        TLRPC.Chat chat3 = this.Y;
                        boolean z4 = this.V.f;
                        chat3.join_to_send = z4;
                        messagesController3.getClass();
                        TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                        tL_channels_toggleJoinToSend.channel = messagesController3.g1(j3);
                        tL_channels_toggleJoinToSend.enabled = z4;
                        Object obj2 = null;
                        messagesController3.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new i65(messagesController3, obj2, obj2, (byte) 22), 64);
                    }
                    if (this.Y.join_request != this.V.h || this.X) {
                        oc7 messagesController4 = getMessagesController();
                        long j4 = this.a0;
                        TLRPC.Chat chat4 = this.Y;
                        boolean z5 = this.V.h;
                        chat4.join_request = z5;
                        messagesController4.k5(j4, 0L, z5, this.X, false, null, null);
                    }
                }
                finishFragment();
            }
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(2, this.currentAccount, null, getParentActivity(), this);
        i46Var.q2 = this.b0;
        i46Var.C2 = new da2(this, (byte) 0);
        showDialog(i46Var);
    }

    public final void g0(boolean z) {
        if (!z) {
            gm.r(this.r0);
        }
        uja ujaVar = this.r;
        if (ujaVar != null) {
            ujaVar.b(z);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ww9 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = cmb.h6;
        arrayList.add(new cnb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb((View) null, 4, new Class[]{vkb.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        LinearLayout linearLayout = this.s;
        int i2 = cmb.c6;
        arrayList.add(new cnb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.T, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.T, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.h0, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.w, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.x, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    public final void h0() {
        if (this.K == null) {
            return;
        }
        int i = 8;
        if (this.W || this.d0 || !getUserConfig().p()) {
            njb njbVar = this.d;
            int i2 = cmb.A6;
            njbVar.setTag(Integer.valueOf(i2));
            anb.X(this.d.getTextView(), i2, null);
            boolean z = this.o0;
            bba bbaVar = this.K;
            if (z) {
                bbaVar.setVisibility(8);
            } else {
                bbaVar.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            boolean z2 = this.b0;
            njb njbVar2 = this.d;
            boolean z3 = this.W;
            if (z2) {
                njbVar2.setText(jb6.M0(z3 ? 2131752269 : 2131752204, null));
                this.e.setText(this.W ? jb6.M0(2131752347, null) : jb6.M0(2131752329, null));
            } else {
                njbVar2.setText(jb6.M0(z3 ? 2131748396 : 2131748393, null));
                this.e.setText(this.W ? jb6.M0(2131752347, null) : jb6.M0(2131752329, null));
            }
            this.F.setVisibility(this.W ? 8 : 0);
            this.G.setVisibility(this.W ? 0 : 8);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.E.setPadding(0, 0, 0, this.W ? 0 : gm.L(7.0f));
            f56 f56Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            f56Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.H.c(this.m0, this.a0);
            ka2 ka2Var = this.h;
            ka2Var.setVisibility((this.W || ka2Var.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull M0 = getMessagesController().M0(this.a0);
            this.J.setText(jb6.M0((M0 != null && M0.paid_media_allowed && sd2.V(getMessagesController().L0(Long.valueOf(this.a0)))) ? 2131748450 : 2131748451, null));
        } else {
            this.d.setText(jb6.M0(2131752486, null));
            njb njbVar3 = this.d;
            int i3 = cmb.o7;
            njbVar3.setTag(Integer.valueOf(i3));
            anb.X(this.d.getTextView(), i3, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            boolean z4 = this.e0;
            pa6 pa6Var = this.h0;
            if (z4) {
                pa6Var.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                pa6Var.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.w.a(!this.W);
        this.x.a(this.W);
        this.b.clearFocus();
        ma2 ma2Var = this.V;
        if (ma2Var != null) {
            ma2Var.setVisibility((!this.b0 || this.W) ? 0 : 8);
            ma2 ma2Var2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            ma2Var2.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        }
        pa2 pa2Var = this.L;
        if (pa2Var != null) {
            if (!this.W && !this.O.isEmpty()) {
                i = 0;
            }
            pa2Var.setVisibility(i);
        }
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        l7 l7Var;
        super.onBecomeFullyVisible();
        if (!this.o0 || (l7Var = this.b) == null) {
            return;
        }
        l7Var.requestFocus();
        gm.E3(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z = this.o0;
        ArrayList arrayList = this.O;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.a0));
        this.Y = L0;
        if (L0 == null) {
            TLRPC.Chat O = getMessagesStorage().O(this.a0);
            this.Y = O;
            if (O != null) {
                getMessagesController().V3(this.Y, true);
                if (this.Z == null) {
                    TLRPC.ChatFull C0 = getMessagesStorage().C0(this.a0, sd2.T(this.Y), new CountDownLatch(1), false, false, 0);
                    this.Z = C0;
                }
            }
            return false;
        }
        this.W = (z || sd2.t0(this.Y)) ? false : true;
        this.b0 = sd2.T(this.Y) && !this.Y.megagroup;
        TLRPC.Chat chat = this.Y;
        this.c0 = chat.noforwards;
        if ((z && !sd2.t0(chat)) || (this.W && this.Y.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new ca2(this, (byte) 3));
        }
        if (this.W && this.Z != null) {
            getMessagesController().a3(this.classGuid, this.a0, true);
        }
        if (this.Y != null) {
            this.N.clear();
            arrayList.clear();
            for (int i = 0; i < this.Y.usernames.size(); i++) {
                if (this.Y.usernames.get(i).active) {
                    arrayList.add(this.Y.usernames.get(i));
                }
            }
            for (int i2 = 0; i2 < this.Y.usernames.size(); i2++) {
                if (!this.Y.usernames.get(i2).active) {
                    arrayList.add(this.Y.usernames.get(i2));
                }
            }
        }
        getNotificationCenter().b(this, nm7.T);
        getNotificationCenter().b(this, nm7.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.T);
        getNotificationCenter().n(this, nm7.y1);
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            this.H.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            pa6 pa6Var = this.h0;
            if (pa6Var != null && pa6Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(cmb.w0(null, cmb.g6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.y.getChildAt(i);
                    if (childAt instanceof jb) {
                        jb jbVar = (jb) childAt;
                        jbVar.d.p(jbVar.f);
                        jbVar.a.invalidate();
                    }
                }
            }
            xs5 xs5Var = this.q0;
            if (xs5Var != null) {
                xs5Var.updateColors();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
