// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xn2 extends e implements yn5, fn7, s84 {
    public RadialProgressView E;
    public rb0 F;
    public zn5 G;
    public TLRPC.FileLocation H;
    public u8 I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final id[] L;
    public final vn2 M;
    public oz4 a;
    public final fm0 b;
    public long c;
    public gb0 d;
    public q9c e;
    public String f;
    public boolean h;
    public boolean n;
    public zc r;
    public wn2 s;
    public a81 w;
    public de0 x;
    public AnimatorSet y;

    public xn2(Bundle bundle) {
        super(bundle);
        this.b = new fm0(0, this, k43.h, 320L, false);
        this.L = new id[1];
        this.M = new vn2(this);
    }

    @Override // yn5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // yn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        this.b.a((this.h == this.n && TextUtils.equals(((xs0) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    public final void Z(long j) {
        uc7.s1(this.currentAccount).Z2(j, this.c, true, false, new tn2(this, (byte) 0));
    }

    public final /* synthetic */ void a0() {
        this.H = null;
        uc7.s1(this.currentAccount).z(this.c, null, null, null, null, 0.0d, null, null, null, null);
        e0(false, true);
        this.x.m(null, null, this.F, this.J);
    }

    public final void b0(b8c b8cVar) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        int i = b8cVar.d;
        byte b = 0;
        if (i == 140) {
            if (this.G.g() || (chatPhoto = (M0 = getMessagesController().M0(Long.valueOf(this.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            jn5 jn5Var = null;
            PhotoViewer.q0().T1(null, this, null);
            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
            int i2 = chatPhoto2.dc_id;
            if (i2 != 0) {
                chatPhoto2.photo_big.dc_id = i2;
            }
            TLRPC.ChatFull chatFull = this.K;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    jn5Var = jn5.j(this.K.chat_photo.video_sizes.get(0), this.K.chat_photo);
                }
            }
            PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, this.M, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i == 141) {
            this.G.n(this.H != null, new sn2(this, b), new h5((byte) 6), 0);
            return;
        }
        if (i == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            bg2 bg2Var = new bg2(bundle);
            bg2Var.B0(this.K);
            presentFragment(bg2Var);
            return;
        }
        if (i == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", this.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bg2 bg2Var2 = new bg2(bundle2);
            bg2Var2.B0(this.K);
            presentFragment(bg2Var2);
            return;
        }
        if (i == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", this.c);
            presentFragment(new io2(bundle3));
            return;
        }
        if (i == 150) {
            d0(true);
            return;
        }
        if (i == 151) {
            d0(false);
            return;
        }
        if (i == 145) {
            jj.r(this, false, this.J, null, false, true, true, false, new un2(this));
            return;
        }
        if (i == 146) {
            gp2.e(this.L, this, this.currentAccount, this.J);
            return;
        }
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.Chat) {
            presentFragment(zu1.ha(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            presentFragment(zu1.ha(((TLRPC.User) obj).id));
        }
    }

    public final boolean c0(b8c b8cVar, View view) {
        long j;
        boolean v;
        boolean z;
        boolean z2;
        Object obj = b8cVar.H;
        byte b = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j = user.id;
                v = lbc.v(user);
                TLRPC.Chat chat = this.J;
                z = chat != null && ((user.bot && user.bot_can_edit) || xc2.y(27, chat));
                z2 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j = -chat2.id;
        boolean V = xc2.V(chat2);
        TLRPC.Chat chat3 = this.J;
        z = chat3 != null && (chat2.creator || xc2.y(27, chat3));
        z2 = V;
        v = false;
        boolean z3 = z;
        int b2 = gp2.b(this.currentAccount, j);
        boolean z4 = b2 == 1 || b2 == 2;
        if (z3 || z4) {
            fu5 G = fu5.G(this.d, null, view);
            G.k(R.drawable.msg_viewintopic, ob6.M0(v ? 2131751875 : z2 ? 2131751874 : 2131751873, null), new rn2(this, j, b), z4);
            G.l(R.drawable.msg_cancel, new cm1(this, v, z2, j, (byte) 1), ob6.M0(2131751880, null), z3, true);
            G.X(this.e.W0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        byte b2 = 2;
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, b2));
        oz4 oz4Var = new oz4();
        this.a = oz4Var;
        oz4Var.a(getThemedColor(aob.d6));
        this.actionBar.P(new ll0(oz4Var, oz4Var, oz4Var), dtd.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        gb0 gb0Var = new gb0(this, context);
        this.d = gb0Var;
        yob.h(aob.a7, null, gb0Var);
        this.F = new rb0(this.J);
        wn2 wn2Var = new wn2(context);
        this.s = wn2Var;
        wn2Var.a.f(this.J, this.F);
        this.x = this.s.a;
        String l = wf3.l(this.J);
        this.f = l;
        vnb vnbVar = this.resourceProvider;
        byte b3 = 15;
        zc zcVar = new zc(context, b3);
        xs0 xs0Var = new xs0(context, b2);
        zcVar.b = xs0Var;
        yob.X(xs0Var, aob.G6, vnbVar);
        yob.G(xs0Var, aob.Xc, vnbVar);
        yob.D(xs0Var, aob.H6, vnbVar);
        xs0Var.setTextSize(1, 16.0f);
        xs0Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        xs0Var.setBackground(null);
        xs0Var.setImeOptions(xs0Var.getImeOptions() | TLObject.FLAG_28);
        xs0Var.setInputType(xs0Var.getInputType() | TLObject.FLAG_14);
        xs0Var.setPadding(hl.L(4.0f), hl.L(10.0f), hl.L(4.0f), hl.L(11.0f));
        xs0Var.setMinHeight(hl.L(50.0f));
        zcVar.addView(xs0Var, tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = zcVar;
        xs0Var.setText(l);
        ((xs0) this.r.b).setSelection(l.length());
        ((xs0) this.r.b).addTextChangedListener(new c7(this, b3));
        u8 u8Var = new u8(this, context);
        this.I = u8Var;
        yob.X(u8Var, aob.Ji, getResourceProvider());
        this.I.setText(ob6.M0(2131745674, null));
        this.I.setTypeface(hl.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        this.I.setOnClickListener(new r81(this, (byte) 17));
        iye.a(this.I);
        this.actionBar.addView(this.I, tre.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        a81 a81Var = new a81(this, context);
        this.w = a81Var;
        this.s.addView(a81Var, tre.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(hl.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, tre.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        e0(false, false);
        q9c q9cVar = new q9c(this, new tn2(this, b), new un2(this), new un2(this));
        this.e = q9cVar;
        q9cVar.setClipToPadding(false);
        q9c q9cVar2 = this.e;
        l9c l9cVar = q9cVar2.g3;
        l9cVar.r = false;
        l9cVar.s = true;
        q9cVar2.s1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, tre.c(-1.0f, -1));
        this.d.addView(this.actionBar, tre.e(-1, -2, 48));
        gb0 gb0Var2 = this.d;
        un2 un2Var = new un2(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(gb0Var2, un2Var);
        gb0 gb0Var3 = this.d;
        this.fragmentView = gb0Var3;
        return gb0Var3;
    }

    public final void d0(boolean z) {
        if (this.n == z) {
            return;
        }
        h29 h29Var = (h29) this.e.C1(jn7.g2);
        if (h29Var != null) {
            h29Var.a(!z);
        }
        h29 h29Var2 = (h29) this.e.C1(jn7.f2);
        if (h29Var2 != null) {
            h29Var2.a(z);
        }
        this.n = z;
        Y();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.K = chatFull;
                this.e.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.G.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(boolean z, boolean z2) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        if (!z2) {
            RadialProgressView radialProgressView = this.E;
            if (z) {
                radialProgressView.setAlpha(1.0f);
                this.E.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            radialProgressView.setAlpha(0.0f);
            this.E.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        RadialProgressView radialProgressView2 = this.E;
        if (z) {
            radialProgressView2.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.y;
            RadialProgressView radialProgressView3 = this.E;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<a81, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<a81, Float>) property2, 0.0f));
        }
        this.y.setDuration(180L);
        this.y.addListener(new z7((byte) 23, (Object) this, z));
        this.y.start();
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return ((xs0) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.G.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.c));
        this.J = M0;
        boolean z = M0 != null && ((tL_chatBannedRights = M0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z;
        this.n = z;
        this.K = getMessagesController().N0(this.c);
        zn5 zn5Var = new zn5(3, true, true);
        this.G = zn5Var;
        zn5Var.a = this;
        zn5Var.b = this;
        getNotificationCenter().b(this, jn7.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.T);
        zn5 zn5Var = this.G;
        if (zn5Var != null) {
            zn5Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.G.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            oz4 oz4Var = this.a;
            if (oz4Var != null) {
                oz4Var.a(getThemedColor(aob.d6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void restoreSelfArgs(Bundle bundle) {
        zn5 zn5Var = this.G;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.G;
        if (zn5Var != null && (str = zn5Var.f) != null) {
            bundle.putString("path", str);
        }
        zc zcVar = this.r;
        if (zcVar != null) {
            String obj = ((xs0) zcVar.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.I.setAlpha(f);
        this.I.setScaleX(hl.R1(0.75f, 1.0f, f));
        this.I.setScaleY(hl.R1(0.75f, 1.0f, f));
        this.I.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    @Override // yn5
    public final void T() {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
