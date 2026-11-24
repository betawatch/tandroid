// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yh1 extends d implements gk7, vl5 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public ld5 I;
    public EditTextBoldCursor J;
    public boolean K;
    public oy8 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public f36 R;
    public uy8 S;
    public uy8 T;
    public mhb U;
    public TextView V;
    public ke1 W;
    public ld5 X;
    public int Y;
    public String Z;
    public r7 a;
    public q21 a0;
    public m33 b;
    public boolean b0;
    public ih2 c;
    public boolean c0;
    public rt3 d;
    public boolean d0;
    public b9a e;
    public TLRPC.TL_chatInviteExported e0;
    public kb0 f;
    public boolean f0;
    public mhb g0;
    public s71 h;
    public final ArrayList h0;
    public q86 i0;
    public final int j0;
    public final long k0;
    public boolean l0;
    public final Boolean m0;
    public vh1 n;
    public TLRPC.InputFile n0;
    public TLRPC.InputFile o0;
    public TLRPC.VideoSize p0;
    public String q0;
    public AnimatorSet r;
    public double r0;
    public wh1 s;
    public boolean s0;
    public boolean t0;
    public Integer u0;
    public i8c v0;
    public final pb0 w;
    public hd w0;
    public final wl5 x;
    public final oh1 x0;
    public EditTextBoldCursor y;
    public ValueAnimator y0;
    public int z0;

    public yh1(Bundle bundle) {
        super(bundle);
        this.h0 = new ArrayList();
        byte b = 1;
        this.l0 = true;
        byte b2 = 0;
        this.x0 = new oh1(this, b2);
        int i = bundle.getInt("step", 0);
        this.j0 = i;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i == 0) {
            this.w = new pb0((wjb) null);
            this.x = new wl5(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new qh1(this, b));
            return;
        }
        if (i == 1) {
            boolean z = bundle.getBoolean("canCreatePublic", true);
            this.l0 = z;
            this.c0 = !z;
            if (!z && !this.f0) {
                this.f0 = true;
                m0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qh1(this, b2));
            }
        }
        this.k0 = bundle.getLong("chat_id", 0L);
    }

    @Override // vl5
    public final void H(float f) {
        wh1 wh1Var = this.s;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(f);
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
        wh1 wh1Var = this.s;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(0.0f);
    }

    @Override // vl5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1((d) this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 0));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    public final void c0() {
        int w0 = bkb.w0(null, bkb.T7, false) + ((bkb.w0(null, bkb.S7, false) + ((bkb.w0(null, bkb.R7, false) + ((bkb.w0(null, bkb.Q7, false) + ((bkb.w0(null, bkb.P7, false) + ((bkb.w0(null, bkb.O7, false) + ((bkb.w0(null, bkb.N7, false) + (bkb.w0(null, bkb.I7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (w0 != this.z0) {
            this.z0 = w0;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.N.getChildAt(i);
                    if (childAt instanceof jb) {
                        jb jbVar = (jb) childAt;
                        jbVar.d.p(jbVar.f);
                        jbVar.a.invalidate();
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i;
        final yh1 yh1Var = this;
        rt3 rt3Var = yh1Var.d;
        if (rt3Var != null) {
            rt3Var.o();
        }
        yh1Var.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b = 1;
        yh1Var.actionBar.setAllowOverlayTitle(true);
        yh1Var.actionBar.setActionBarMenuOnItemClick(new r8(yh1Var, (byte) 21));
        r6 t = yh1Var.actionBar.t();
        Drawable d = b00.d(context, R.drawable.ic_ab_done);
        int i2 = bkb.u8;
        final byte b2 = 0;
        int w0 = bkb.w0(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        d.setColorFilter(new PorterDuffColorFilter(w0, mode));
        ih2 ih2Var = new ih2(bkb.w0(null, i2, false));
        yh1Var.c = ih2Var;
        m33 m33Var = new m33(d, ih2Var);
        yh1Var.b = m33Var;
        int L = gl.L(56.0f);
        String M0 = k96.M0(2131751342, null);
        boolean z = t.c;
        a aVar = t.b;
        r7 c = t.c(1, 0, null, z ? aVar.r0 : aVar.q0, m33Var, L, M0, null);
        yh1Var.a = c;
        zkb.x(c, d, i2, null, mode);
        byte b3 = 2;
        int i3 = yh1Var.j0;
        if (i3 == 0) {
            yh1Var.actionBar.setTitle(k96.M0(2131748094, null));
            ay0 ay0Var = new ay0(yh1Var, context, b);
            ay0Var.setOnTouchListener(new p8((byte) 26));
            yh1Var.fragmentView = ay0Var;
            int i4 = bkb.c6;
            ay0Var.setTag(Integer.valueOf(i4));
            zkb.h(i4, null, yh1Var.fragmentView);
            LinearLayout linearLayout = new LinearLayout(context);
            yh1Var.M = linearLayout;
            linearLayout.setOrientation(1);
            ay0Var.addView(yh1Var.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            yh1Var.M.addView(frameLayout, nme.o(-1, -2));
            kb0 kb0Var = new kb0(b3, context, yh1Var);
            yh1Var.f = kb0Var;
            kb0Var.setRoundRadius(gl.L(32.0f));
            pb0 pb0Var = yh1Var.w;
            pb0Var.j(5L, null, null, null);
            yh1Var.f.setImageDrawable(pb0Var);
            kb0 kb0Var2 = yh1Var.f;
            boolean z2 = k96.a0;
            frameLayout.addView(kb0Var2, nme.d(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            s71 s71Var = new s71(yh1Var, context, paint, b);
            yh1Var.h = s71Var;
            s71Var.setContentDescription(k96.M0(2131752200, null));
            s71 s71Var2 = yh1Var.h;
            boolean z3 = k96.a0;
            frameLayout.addView(s71Var2, nme.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 12.0f));
            yh1Var.h.setOnClickListener(new sh1(yh1Var, b));
            yh1Var.L = new oy8(R.raw.camera, gl.L(60.0f), gl.L(60.0f), false, null);
            vh1 vh1Var = new vh1(b2, context, yh1Var);
            yh1Var.n = vh1Var;
            vh1Var.setScaleType(ImageView.ScaleType.CENTER);
            yh1Var.n.setAnimation(yh1Var.L);
            yh1Var.n.setEnabled(false);
            yh1Var.n.setClickable(false);
            yh1Var.n.setPadding(gl.L(0.0f), 0, 0, gl.L(1.0f));
            vh1 vh1Var2 = yh1Var.n;
            boolean z4 = k96.a0;
            frameLayout.addView(vh1Var2, nme.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 15.0f, 12.0f, z4 ? 15.0f : 0.0f, 12.0f));
            wh1 wh1Var = new wh1(yh1Var, context, b2);
            yh1Var.s = wh1Var;
            wh1Var.setSize(gl.L(30.0f));
            yh1Var.s.setProgressColor(-1);
            yh1Var.s.setNoProgress(false);
            wh1 wh1Var2 = yh1Var.s;
            boolean z5 = k96.a0;
            frameLayout.addView(wh1Var2, nme.d(64, 64.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 12.0f));
            yh1Var.i0(false, false);
            rt3 rt3Var2 = new rt3(context, ay0Var, yh1Var, 0, false, null);
            yh1Var = yh1Var;
            yh1Var.d = rt3Var2;
            rt3Var2.setHint(k96.M0(2131751112, null));
            String str = yh1Var.G;
            if (str != null) {
                yh1Var.d.setText(str);
                yh1Var.G = null;
            }
            yh1Var.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            yh1Var.d.getEditText().setSingleLine(true);
            yh1Var.d.getEditText().setImeOptions(5);
            yh1Var.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(yh1Var) { // from class: th1
                public final /* synthetic */ yh1 b;

                {
                    this.b = yh1Var;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                    r7 r7Var;
                    byte b4 = b2;
                    yh1 yh1Var2 = this.b;
                    switch (b4) {
                        case 0:
                            if (i5 == 5 && !TextUtils.isEmpty(yh1Var2.d.getEditText().getText())) {
                                yh1Var2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i5 == 6 && (r7Var = yh1Var2.a) != null) {
                                r7Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            rt3 rt3Var3 = yh1Var.d;
            boolean z6 = k96.a0;
            frameLayout.addView(rt3Var3, nme.d(-1, -2.0f, 16, z6 ? 5.0f : 96.0f, 0.0f, z6 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            yh1Var.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            zkb.D(yh1Var.y, bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor2 = yh1Var.y;
            int i5 = bkb.F6;
            zkb.X(editTextBoldCursor2, i5, null);
            yh1Var.y.setBackgroundDrawable(null);
            zkb.F(yh1Var.y, bkb.j6, bkb.k6, bkb.o7, yh1Var.getResourceProvider());
            yh1Var.y.setPadding(0, 0, 0, gl.L(6.0f));
            yh1Var.y.setGravity(k96.a0 ? 5 : 3);
            yh1Var.y.setInputType(180225);
            yh1Var.y.setImeOptions(6);
            yh1Var.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            yh1Var.y.setHint(k96.M0(2131751447, null));
            zkb.v(yh1Var.y, i5, null);
            yh1Var.y.setCursorSize(gl.L(20.0f));
            yh1Var.y.setCursorWidth(1.5f);
            yh1Var.M.addView(yh1Var.y, nme.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            yh1Var.y.setOnEditorActionListener(new TextView.OnEditorActionListener(yh1Var) { // from class: th1
                public final /* synthetic */ yh1 b;

                {
                    this.b = yh1Var;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i52, KeyEvent keyEvent) {
                    r7 r7Var;
                    byte b4 = b;
                    yh1 yh1Var2 = this.b;
                    switch (b4) {
                        case 0:
                            if (i52 == 5 && !TextUtils.isEmpty(yh1Var2.d.getEditText().getText())) {
                                yh1Var2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i52 == 6 && (r7Var = yh1Var2.a) != null) {
                                r7Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            yh1Var.y.addTextChangedListener(new xh1(b2));
            TextView textView = new TextView(context);
            yh1Var.V = textView;
            textView.setTextSize(1, 15.0f);
            zkb.X(yh1Var.V, bkb.E6, null);
            yh1Var.V.setGravity(k96.a0 ? 5 : 3);
            yh1Var.V.setText(k96.M0(2131751450, null));
            yh1Var.M.addView(yh1Var.V, nme.t(-2, -2, k96.a0 ? 5 : 3, 24, 10, 24, 20));
        } else if (i3 == 1) {
            ScrollView scrollView = new ScrollView(context);
            yh1Var.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            yh1Var.M = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(yh1Var.M, new FrameLayout.LayoutParams(-1, -2));
            na7 messagesController = yh1Var.getMessagesController();
            long j = yh1Var.k0;
            TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
            boolean z7 = K0 != null && (!hc2.T(K0) || hc2.n0(K0));
            yh1Var.K = z7;
            yh1Var.actionBar.setTitle(k96.M0(z7 ? 2131749208 : 2131752285, null));
            View view = yh1Var.fragmentView;
            int i6 = bkb.Z6;
            view.setTag(Integer.valueOf(i6));
            zkb.h(i6, null, yh1Var.fragmentView);
            ld5 ld5Var = new ld5(context, 23);
            yh1Var.I = ld5Var;
            ld5Var.setHeight(46);
            ld5 ld5Var2 = yh1Var.I;
            int i7 = bkb.c6;
            zkb.h(i7, null, ld5Var2);
            yh1Var.I.setText(k96.M0(yh1Var.K ? 2131749199 : 2131752263, null));
            yh1Var.M.addView(yh1Var.I);
            LinearLayout linearLayout3 = new LinearLayout(context);
            yh1Var.H = linearLayout3;
            linearLayout3.setOrientation(1);
            zkb.h(i7, null, yh1Var.H);
            yh1Var.M.addView(yh1Var.H, nme.o(-1, -2));
            uy8 uy8Var = new uy8(context, false);
            yh1Var.S = uy8Var;
            ff0 L0 = bkb.L0(false);
            int i8 = bkb.h6;
            vkb M = zkb.M(i8);
            uy8Var.setBackground(L0);
            zkb.j(uy8Var, L0, null, M, null);
            Boolean bool = yh1Var.m0;
            if (bool != null && !bool.booleanValue()) {
                yh1Var.c0 = true;
            }
            boolean z8 = yh1Var.K;
            uy8 uy8Var2 = yh1Var.S;
            if (z8) {
                i = 1;
                uy8Var2.b(k96.M0(2131748446, null), k96.M0(2131748445, null), false, !yh1Var.c0);
            } else {
                i = 1;
                uy8Var2.b(k96.M0(2131752306, null), k96.M0(2131752303, null), false, !yh1Var.c0);
            }
            yh1Var.S.setOnClickListener(new sh1(yh1Var, b3));
            if (bool == null || bool.booleanValue()) {
                yh1Var.H.addView(yh1Var.S, nme.o(-1, -2));
            }
            uy8 uy8Var3 = new uy8(context, false);
            yh1Var.T = uy8Var3;
            ff0 L02 = bkb.L0(false);
            vkb M2 = zkb.M(i8);
            uy8Var3.setBackground(L02);
            zkb.j(uy8Var3, L02, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                yh1Var.c0 = false;
            }
            boolean z9 = yh1Var.K;
            uy8 uy8Var4 = yh1Var.T;
            if (z9) {
                uy8Var4.b(k96.M0(2131748449, null), k96.M0(2131748448, null), false, yh1Var.c0);
            } else {
                uy8Var4.b(k96.M0(2131752317, null), k96.M0(2131752316, null), false, yh1Var.c0);
            }
            yh1Var.T.setOnClickListener(new sh1(yh1Var, (byte) 3));
            if (bool == null || !bool.booleanValue()) {
                yh1Var.H.addView(yh1Var.T, nme.o(-1, -2));
            }
            b9a b9aVar = new b9a(context, (de9) null);
            yh1Var.e = b9aVar;
            yh1Var.M.addView(b9aVar, nme.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            yh1Var.O = linearLayout4;
            linearLayout4.setOrientation(i);
            zkb.h(i7, null, yh1Var.O);
            yh1Var.M.addView(yh1Var.O, nme.o(-1, -2));
            ld5 ld5Var3 = new ld5(context);
            yh1Var.X = ld5Var3;
            yh1Var.O.addView(ld5Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            yh1Var.P = linearLayout5;
            linearLayout5.setOrientation(0);
            yh1Var.O.addView(yh1Var.P, nme.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            yh1Var.J = editTextBoldCursor3;
            editTextBoldCursor3.setText(na7.q1(yh1Var.currentAccount).N2 + "/");
            yh1Var.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = yh1Var.J;
            int i9 = bkb.G6;
            zkb.D(editTextBoldCursor4, i9, null);
            EditTextBoldCursor editTextBoldCursor5 = yh1Var.J;
            int i10 = bkb.F6;
            zkb.X(editTextBoldCursor5, i10, null);
            yh1Var.J.setMaxLines(1);
            yh1Var.J.setLines(1);
            yh1Var.J.setEnabled(false);
            yh1Var.J.setBackgroundDrawable(null);
            yh1Var.J.setPadding(0, 0, 0, 0);
            yh1Var.J.setSingleLine(true);
            yh1Var.J.setInputType(163840);
            yh1Var.J.setImeOptions(6);
            yh1Var.P.addView(yh1Var.J, nme.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            yh1Var.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            zkb.D(yh1Var.y, i9, null);
            zkb.X(yh1Var.y, i10, null);
            yh1Var.y.setMaxLines(1);
            yh1Var.y.setLines(1);
            yh1Var.y.setBackgroundDrawable(null);
            yh1Var.y.setPadding(0, 0, 0, 0);
            yh1Var.y.setSingleLine(true);
            yh1Var.y.setInputType(163872);
            yh1Var.y.setImeOptions(6);
            yh1Var.y.setHint(k96.M0(2131752254, null));
            zkb.v(yh1Var.y, i10, null);
            yh1Var.y.setCursorSize(gl.L(20.0f));
            yh1Var.y.setCursorWidth(1.5f);
            yh1Var.P.addView(yh1Var.y, nme.o(-1, 36));
            yh1Var.y.addTextChangedListener(new b7(yh1Var, (byte) 6));
            LinearLayout linearLayout6 = new LinearLayout(context);
            yh1Var.Q = linearLayout6;
            linearLayout6.setOrientation(1);
            yh1Var.O.addView(yh1Var.Q, nme.o(-1, -2));
            f36 f36Var = new f36(context, yh1Var, null, true, hc2.T(yh1Var.getMessagesController().K0(Long.valueOf(j))));
            yh1Var.R = f36Var;
            f36Var.b(true);
            yh1Var.R.d(0, null, false);
            yh1Var.Q.addView(yh1Var.R);
            ke1 ke1Var = new ke1((byte) 1, context, (Object) yh1Var);
            yh1Var.W = ke1Var;
            zkb.G(ke1Var, bkb.I6, null);
            zkb.C(yh1Var.W, bkb.J6, null);
            yh1Var.W.setTextSize(1, 15.0f);
            yh1Var.W.setGravity(k96.a0 ? 5 : 3);
            yh1Var.W.setVisibility(8);
            yh1Var.W.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
            yh1Var.O.addView(yh1Var.W, nme.t(-2, -2, k96.a0 ? 5 : 3, 18, 3, 18, 7));
            mhb mhbVar = new mhb(context);
            yh1Var.U = mhbVar;
            int i11 = bkb.a7;
            zkb.Z(mhbVar, context, R.drawable.greydivider_bottom, i11);
            yh1Var.M.addView(yh1Var.U, nme.o(-1, -2));
            q86 q86Var = new q86(context);
            yh1Var.i0 = q86Var;
            yh1Var.M.addView(q86Var, nme.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            yh1Var.N = linearLayout7;
            zkb.h(i7, null, linearLayout7);
            yh1Var.N.setOrientation(1);
            yh1Var.M.addView(yh1Var.N, nme.o(-1, -2));
            mhb mhbVar2 = new mhb(context);
            yh1Var.g0 = mhbVar2;
            zkb.Z(mhbVar2, context, R.drawable.greydivider_bottom, i11);
            yh1Var.M.addView(yh1Var.g0, nme.o(-1, -2));
            yh1Var.m0();
        }
        return yh1Var.fragmentView;
    }

    public final void d0(String str) {
        if (str == null || str.length() <= 0) {
            this.W.setVisibility(8);
        } else {
            this.W.setVisibility(0);
        }
        q21 q21Var = this.a0;
        if (q21Var != null) {
            gl.r(q21Var);
            this.a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.b0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.W.setText(k96.M0(2131748717, null));
                ke1 ke1Var = this.W;
                int i = bkb.o7;
                ke1Var.setTag(Integer.valueOf(i));
                zkb.X(this.W, i, null);
                return;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (i2 == 0 && charAt >= '0' && charAt <= '9') {
                    this.W.setText(k96.M0(2131748713, null));
                    ke1 ke1Var2 = this.W;
                    int i3 = bkb.o7;
                    ke1Var2.setTag(Integer.valueOf(i3));
                    zkb.X(this.W, i3, null);
                    return;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.W.setText(k96.M0(2131748717, null));
                    ke1 ke1Var3 = this.W;
                    int i4 = bkb.o7;
                    ke1Var3.setTag(Integer.valueOf(i4));
                    zkb.X(this.W, i4, null);
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.W.setText(k96.M0(2131748715, null));
            ke1 ke1Var4 = this.W;
            int i5 = bkb.o7;
            ke1Var4.setTag(Integer.valueOf(i5));
            zkb.X(this.W, i5, null);
            return;
        }
        int length = str.length();
        ke1 ke1Var5 = this.W;
        if (length > 32) {
            ke1Var5.setText(k96.M0(2131748716, null));
            ke1 ke1Var6 = this.W;
            int i6 = bkb.o7;
            ke1Var6.setTag(Integer.valueOf(i6));
            zkb.X(this.W, i6, null);
            return;
        }
        ke1Var5.setText(k96.M0(2131748730, null));
        ke1 ke1Var7 = this.W;
        int i7 = bkb.E6;
        ke1Var7.setTag(Integer.valueOf(i7));
        zkb.X(this.W, i7, null);
        this.Z = str;
        q21 q21Var2 = new q21(this, str, (byte) 26);
        this.a0 = q21Var2;
        gl.e3(q21Var2, 300L);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.R) {
            hd hdVar = this.w0;
            if (hdVar != null) {
                try {
                    hdVar.dismiss();
                    this.w0 = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            l0(false);
            this.t0 = false;
            return;
        }
        if (i == kk7.Q) {
            hd hdVar2 = this.w0;
            if (hdVar2 != null) {
                try {
                    hdVar2.dismiss();
                    this.w0 = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.n0 != null || this.o0 != null || this.p0 != null) {
                na7.q1(this.currentAccount).x(longValue, null, this.n0, this.o0, this.p0, this.r0, this.q0, this.E, this.F, null);
            }
            yh1 yh1Var = new yh1(bundle);
            yh1Var.v0 = this.v0;
            presentFragment(yh1Var, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        wl5 wl5Var = this.x;
        if (wl5Var == null || !wl5Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        wl5 wl5Var = this.x;
        return (wl5Var == null || dialog != wl5Var.c) && super.dismissDialogOnPause(dialog);
    }

    public final /* synthetic */ void e0(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = na7.q1(this.currentAccount).f1(this.k0);
        this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new en0((Object) this, (Object) str, (Object) tL_channels_checkUsername, (byte) 14), 2);
    }

    public final /* synthetic */ void f0(TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = na7.g1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new qh1(this, (byte) 2), 64);
    }

    public final void g0(View view) {
        TLRPC.Chat currentChannel = ((jb) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        boolean z = currentChannel.megagroup;
        int i = this.currentAccount;
        if (z) {
            hdVar.U = gl.T2(k96.a0("RevokeLinkAlert", null, 2131745829, na7.q1(i).N2 + "/" + hc2.K(currentChannel, false), currentChannel.title));
        } else {
            hdVar.U = gl.T2(k96.a0("RevokeLinkAlertChannel", null, 2131745828, na7.q1(i).N2 + "/" + hc2.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131745831, null), new q31((Object) this, (Object) currentChannel, (byte) 9));
        showDialog(hdVar);
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        rt3 rt3Var = this.d;
        int i = bkb.j6;
        arrayList.add(new blb(rt3Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        rt3 rt3Var2 = this.d;
        int i2 = bkb.k6;
        arrayList.add(new blb(rt3Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.a7));
        LinearLayout linearLayout = this.Q;
        int i3 = bkb.h6;
        arrayList.add(new blb(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.i0, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        return arrayList;
    }

    public final /* synthetic */ void h0(hd hdVar) {
        this.t0 = false;
        this.s0 = false;
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        l0(false);
        hdVar.dismiss();
    }

    public final void i0(boolean z, boolean z2) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.r.cancel();
            this.r = null;
        }
        if (!z2) {
            vh1 vh1Var = this.n;
            if (z) {
                vh1Var.setAlpha(1.0f);
                this.n.setVisibility(4);
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            }
            vh1Var.setAlpha(1.0f);
            this.n.setVisibility(0);
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            return;
        }
        this.r = new AnimatorSet();
        if (z) {
            this.s.setVisibility(0);
            AnimatorSet animatorSet2 = this.r;
            vh1 vh1Var2 = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(vh1Var2, (Property<vh1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<wh1, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            vh1 vh1Var3 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(vh1Var3, (Property<vh1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<wh1, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new y7((byte) 13, (Object) this, z));
        this.r.start();
    }

    public final void j0() {
        if (this.w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131744595, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131744596, null);
        alertDialog$Builder.j(k96.M0(2131742971, null), null);
        alertDialog$Builder.g(k96.M0(2131744604, null), new rh1((Object) this, (byte) 0));
        this.w0 = alertDialog$Builder.o();
    }

    public final void k0() {
        if (getParentActivity() == null) {
            return;
        }
        h26 h26Var = new h26(2, this.currentAccount, null, getParentActivity(), this);
        h26Var.q2 = true;
        h26Var.C2 = new oh1(this, (byte) 1);
        showDialog(h26Var);
    }

    public final void l0(boolean z) {
        if (!z) {
            gl.r(this.x0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new f0(this, (byte) 25));
            this.y0.setDuration((long) (Math.abs(this.b.c - (z ? 1.0f : 0.0f)) * 200.0f));
            this.y0.setInterpolator(s33.f);
            this.y0.start();
        }
    }

    public final void m0() {
        if (this.e == null) {
            return;
        }
        int i = 8;
        if (this.c0 || this.l0) {
            mhb mhbVar = this.U;
            int i2 = bkb.A6;
            mhbVar.setTag(Integer.valueOf(i2));
            zkb.X(this.U.getTextView(), i2, null);
            this.e.setVisibility(0);
            this.g0.setVisibility(8);
            this.N.setVisibility(8);
            mhb mhbVar2 = this.U;
            zkb.Z(mhbVar2, mhbVar2.getContext(), R.drawable.greydivider_bottom, bkb.a7);
            this.O.setVisibility(0);
            this.i0.setVisibility(8);
            boolean z = this.K;
            mhb mhbVar3 = this.U;
            boolean z2 = this.c0;
            if (z) {
                mhbVar3.setText(k96.M0(z2 ? 2131748447 : 2131748444, null));
                this.X.setText(this.c0 ? k96.M0(2131752391, null) : k96.M0(2131752373, null));
            } else {
                mhbVar3.setText(k96.M0(z2 ? 2131752315 : 2131752255, null));
                this.X.setText(this.c0 ? k96.M0(2131752391, null) : k96.M0(2131752373, null));
            }
            this.P.setVisibility(this.c0 ? 8 : 0);
            this.Q.setVisibility(this.c0 ? 0 : 8);
            this.O.setPadding(0, 0, 0, this.c0 ? 0 : gl.L(7.0f));
            f36 f36Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e0;
            f36Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            ke1 ke1Var = this.W;
            if (!this.c0 && ke1Var.length() != 0) {
                i = 0;
            }
            ke1Var.setVisibility(i);
        } else {
            this.U.setText(k96.M0(2131752521, null));
            mhb mhbVar4 = this.U;
            int i3 = bkb.o7;
            mhbVar4.setTag(Integer.valueOf(i3));
            zkb.X(this.U.getTextView(), i3, null);
            this.O.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f0) {
                this.i0.setVisibility(0);
                this.N.setVisibility(8);
                mhb mhbVar5 = this.U;
                zkb.Z(mhbVar5, mhbVar5.getContext(), R.drawable.greydivider_bottom, bkb.a7);
                this.g0.setVisibility(8);
            } else {
                mhb mhbVar6 = this.U;
                zkb.Z(mhbVar6, mhbVar6.getContext(), R.drawable.greydivider, bkb.a7);
                this.i0.setVisibility(8);
                this.N.setVisibility(0);
                this.g0.setVisibility(0);
            }
        }
        this.S.a(!this.c0);
        this.T.a(this.c0);
        this.y.clearFocus();
        gl.t1(this.y);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.d;
        if (rt3Var == null || !rt3Var.e) {
            return true;
        }
        if (!z) {
            return false;
        }
        rt3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.Q);
        kk7.f(this.currentAccount).b(this, kk7.R);
        if (this.j0 == 1 && !this.d0 && this.e0 == null) {
            na7 messagesController = getMessagesController();
            long j = this.k0;
            TLRPC.ChatFull L0 = messagesController.L0(j);
            if (L0 != null) {
                this.e0 = L0.exported_invite;
            }
            if (this.e0 == null) {
                this.d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().h1(-j);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new qh1(this, (byte) 3));
            }
        }
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.a = this;
            wl5Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        kk7.f(this.currentAccount).n(this, kk7.Q);
        kk7.f(this.currentAccount).n(this, kk7.R);
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.c();
        }
        gl.y2(getParentActivity(), this.classGuid);
        rt3 rt3Var = this.d;
        if (rt3Var != null) {
            rt3Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        rt3 rt3Var = this.d;
        if (rt3Var != null) {
            rt3Var.r();
        }
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.j(i, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        rt3 rt3Var = this.d;
        if (rt3Var != null) {
            rt3Var.s();
        }
        gl.W2(getParentActivity(), this.classGuid);
        wl5 wl5Var = this.x;
        if (wl5Var != null) {
            wl5Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            ih2 ih2Var = this.c;
            if (ih2Var != null) {
                ih2Var.b(bkb.w0(null, bkb.u8, false));
            }
            q86 q86Var = this.i0;
            if (q86Var == null || q86Var.getChildCount() <= 0 || !(this.i0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.i0.getChildAt(0)).setProgressColor(bkb.w0(null, bkb.g6, false));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.j0 == 1) {
            return;
        }
        this.d.requestFocus();
        mt3 mt3Var = this.d.a;
        mt3Var.requestFocus();
        gl.F3(mt3Var);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.j0 == 0) {
            wl5 wl5Var = this.x;
            if (wl5Var != null) {
                wl5Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                rt3 rt3Var = this.d;
                if (rt3Var != null) {
                    rt3Var.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.j0 == 0) {
            wl5 wl5Var = this.x;
            if (wl5Var != null && (str = wl5Var.f) != null) {
                bundle.putString("path", str);
            }
            rt3 rt3Var = this.d;
            if (rt3Var != null) {
                String obj = rt3Var.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    @Override // vl5
    public final void T() {
    }
}
