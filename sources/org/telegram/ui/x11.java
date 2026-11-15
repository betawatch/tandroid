package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x11 extends org.telegram.ui.Components.ja {
    public TLRPC.Chat T1;
    public final TLRPC.User U1;
    public final org.telegram.ui.Components.a2 V1;
    public TLObject W1;
    public final FrameLayout X1;
    public final p11 Y1;
    public final r11 Z1;
    public final w11 a2;
    public final w11 b2;
    public final w11 c2;
    public final hi.d d2;
    public org.telegram.ui.Components.p41 e2;
    public Context f2;

    public x11(Context context, TLRPC.Chat chat, TLRPC.User user, org.telegram.ui.Components.a2 a2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2, context, e6Var, true);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.Q0 = true;
        this.T1 = chat;
        this.U1 = user;
        this.W1 = user;
        this.V1 = a2Var;
        org.telegram.messenger.m10.i(this.a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.j6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, d02, M, null, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.j6.P5;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ja.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        p11 p11Var = new p11(context);
        this.Y1 = p11Var;
        org.telegram.ui.ActionBar.q6.U(p11Var, org.telegram.ui.ActionBar.j6.R5, e6Var);
        org.telegram.ui.ActionBar.q6.D(p11Var, i10, e6Var);
        p11Var.setTextSize(1, 15.0f);
        p11Var.setSingleLine(true);
        p11Var.setBackground(null);
        p11Var.setCursorWidth(1.5f);
        p11Var.setGravity(org.telegram.messenger.ns.x1);
        p11Var.setClipToPadding(true);
        p11Var.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        p11Var.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        p11Var.setInputType(p11Var.getInputType() | TLObject.FLAG_19);
        p11Var.setImeOptions(33554435);
        p11Var.setTextIsSelectable(false);
        p11Var.setOnEditorActionListener(new fa(this, 11));
        p11Var.addTextChangedListener(new q11(this));
        p11Var.setHint(org.telegram.messenger.hd.M0(2131745757, null));
        frameLayout2.addView(p11Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.p1));
        float f10 = this.u0 / org.telegram.messenger.g0.p;
        viewGroup.addView(frameLayout, max, c8.ja.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        r11 r11Var = new r11(context);
        this.Z1 = r11Var;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        i9Var.setImageDrawable(new org.telegram.ui.Components.ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        int i11 = 17;
        r11Var.addView(i9Var, c8.ja.e(org.telegram.messenger.ns.O1, org.telegram.messenger.ns.O1, 17));
        w11 w11Var = new w11(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        w11Var.e.add(new pu0(this, i11));
        this.a2 = w11Var;
        w11 w11Var2 = new w11(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        w11Var2.e.add(new pu0(this, i11));
        this.b2 = w11Var2;
        w11 w11Var3 = new w11(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        w11Var3.e.add(new pu0(this, i11));
        this.c2 = w11Var3;
        org.telegram.ui.Components.uj0 uj0Var = this.o1;
        int i12 = this.u0;
        uj0Var.setPadding(i12, 0, i12, org.telegram.messenger.g0.L(68.0f));
        this.o1.setClipToPadding(false);
        this.o1.setOnItemClickListener(new ux0(this, 3));
        s11 s11Var = new s11(this);
        s11Var.m = false;
        s11Var.C = false;
        s11Var.o(org.telegram.ui.Components.er.h);
        s11Var.n(350L);
        this.o1.setItemAnimator(s11Var);
        this.o1.addOnLayoutChangeListener(new t11(this));
        this.o1.j(new u11(this));
        this.b.addView(new v11(this, getContext()), c8.ja.e(-1, 68, 87));
        hi.d dVar = new hi.d(getContext(), e6Var, true);
        dVar.setRoundRadius(24);
        this.d2 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.r7, this.J0));
        f1(false);
        ViewGroup viewGroup2 = this.b;
        float f11 = (this.u0 / org.telegram.messenger.g0.p) + 10.0f;
        viewGroup2.addView(dVar, c8.ja.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new ky0(this, 5));
        org.telegram.ui.Components.p41 p41Var = this.e2;
        if (p41Var != null) {
            p41Var.O(false);
        }
        w11Var.b();
        w11Var2.b();
    }

    public static void d1(x11 x11Var) {
        org.telegram.ui.Components.uj0 uj0Var = x11Var.o1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        x11Var.X1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.ja
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(uj0Var, getContext(), this.a, 0, false, new a5(this, 24), this.J0);
        this.e2 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131754210, null);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        this.a2.a();
        this.b2.a();
        this.c2.a();
    }

    public final void e1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.f2 = getContext();
        }
        if (this.f2 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.T1)) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            org.telegram.messenger.np.s1(this.a).T(this.f2, this.T1.id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.t3.T(this.T1)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.T1;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = org.telegram.messenger.np.s1(this.a).q1(user);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new di.k7(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void f1(boolean z10) {
        int i7 = org.telegram.messenger.t3.V(this.T1) ? 2131749003 : 2131748994;
        float L = org.telegram.messenger.g0.L(32.0f);
        hi.d dVar = this.d2;
        float max = Math.max(L, ((dVar.getWidth() > 0 ? dVar.getWidth() : org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.hd.M0(i7, null)));
        TLObject tLObject = this.W1;
        dVar.i(org.telegram.messenger.hd.a0(null, null, i7, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? org.telegram.messenger.q10.k((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            hi.d dVar = this.d2;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.r7, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
