// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tu2 extends d implements jm7, vn5 {
    public xib E;
    public ru2 F;
    public xib G;
    public xb7 H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public su2 P;
    public final wn5 Q;
    public TLRPC.FileLocation R;
    public byte S;
    public byte T;
    public TLRPC.Photo U;
    public bf0 V;
    public FrameLayout W;
    public q7c X;
    public boolean Y;
    public boolean Z;
    public uja a;
    public k47 a0;
    public su3 b;
    public su3 c;
    public su3 d;
    public bf0 e;
    public TextView f;
    public TextView h;
    public pc0 n;
    public final ylb r;
    public RadialProgressView s;
    public a91 w;
    public AnimatorSet x;
    public xib y;

    public tu2(Bundle bundle, ylb ylbVar) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.r = ylbVar;
        this.Q = new wn5(0, true, true);
    }

    @Override // vn5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override // vn5
    public final void T() {
        gm.c3(new hu2(this, (byte) 0));
    }

    @Override // vn5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        gm.c3(new Runnable() { // from class: iu2
            @Override // java.lang.Runnable
            public final void run() {
                tu2.this.f0(photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.k6));
        hashSet.add(Integer.valueOf(cmb.j6));
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
    }

    public final String b0() {
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        return (W1 == null || TextUtils.isEmpty(W1.phone)) ? this.M : W1.phone;
    }

    @Override // vn5
    public final boolean c() {
        return this.T != 1;
    }

    public final /* synthetic */ void c0(TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = getMessagesController().n1(this.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_suggestBirthday, new tg(this, (byte) 15));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.J;
        rja rjaVar = this.simpleActionBar;
        if (z) {
            rjaVar.setTitle(jb6.M0(2131748040, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131751219, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new pu2(this));
        this.a = this.simpleActionBar.s(jb6.M0(this.J ? 2131751690 : 2131745680, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i = cmb.c6;
        ylb ylbVar = this.r;
        anb.h(i, ylbVar, frameLayout2);
        bf0 bf0Var = new bf0(context);
        this.e = bf0Var;
        bf0Var.setRoundRadius(gm.L(32.0f));
        this.W.addView(this.e, qoe.d(64, 64.0f, (jb6.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a91 a91Var = new a91((Object) this, context, (Object) paint, (byte) 6);
        this.w = a91Var;
        this.W.addView(a91Var, qoe.d(64, 64.0f, (jb6.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gm.L(30.0f));
        this.s.setProgressColor(-1);
        final byte b2 = 0;
        this.s.setNoProgress(false);
        this.W.addView(this.s, qoe.d(64, 64.0f, (jb6.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        anb.X(textView, cmb.F6, ylbVar);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(jb6.a0 ? 5 : 3);
        this.f.setTypeface(gm.o());
        FrameLayout frameLayout3 = this.W;
        TextView textView3 = this.f;
        boolean z2 = jb6.a0;
        TextView l = wi8.l(frameLayout3, textView3, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 94.0f, 25.66f, z2 ? 94.0f : 0.0f, 0.0f), context);
        this.h = l;
        anb.X(l, cmb.z6, ylbVar);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(jb6.a0 ? 5 : 3);
        FrameLayout frameLayout4 = this.W;
        TextView textView4 = this.h;
        boolean z3 = jb6.a0;
        frameLayout4.addView(textView4, qoe.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 94.0f, 49.66f, z3 ? 94.0f : 0.0f, 0.0f));
        su3 su3Var = new su3(context, jb6.M0(2131750626, null), false, false, -1, this.r);
        this.b = su3Var;
        su3Var.d.setImeOptions(5);
        anb.h(i, ylbVar, this.b);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: mu2
            public final /* synthetic */ tu2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b3 = b2;
                tu2 tu2Var = this.b;
                switch (b3) {
                    case 0:
                        if (i2 == 5) {
                            tu2Var.c.d.requestFocus();
                            ru3 ru3Var = tu2Var.c.d;
                            ru3Var.setSelection(ru3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            tu2Var.a.performClick();
                        } else if (i2 == 5) {
                            tu2Var.d.d.requestFocus();
                            tu2Var.d.d.setSelection(tu2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            tu2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.d.setOnFocusChangeListener(new qu2());
        this.b.setText(this.N);
        su3 su3Var2 = new su3(context, jb6.M0(2131748789, null), false, false, -1, this.r);
        this.c = su3Var2;
        su3Var2.d.setImeOptions(5);
        anb.h(i, ylbVar, this.c);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: mu2
            public final /* synthetic */ tu2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b3 = b;
                tu2 tu2Var = this.b;
                switch (b3) {
                    case 0:
                        if (i2 == 5) {
                            tu2Var.c.d.requestFocus();
                            ru3 ru3Var = tu2Var.c.d;
                            ru3Var.setSelection(ru3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            tu2Var.a.performClick();
                        } else if (i2 == 5) {
                            tu2Var.d.d.requestFocus();
                            tu2Var.d.d.setSelection(tu2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            tu2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.O);
        su3 su3Var3 = new su3(context, jb6.M0(2131754392, null), true, true, getMessagesController().l4.C.f(), this.r);
        this.d = su3Var3;
        anb.G(su3Var3.d, cmb.Wc, ylbVar);
        this.d.d.setImeOptions(6);
        anb.h(i, ylbVar, this.d);
        final byte b3 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: mu2
            public final /* synthetic */ tu2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b32 = b3;
                tu2 tu2Var = this.b;
                switch (b32) {
                    case 0:
                        if (i2 == 5) {
                            tu2Var.c.d.requestFocus();
                            ru3 ru3Var = tu2Var.c.d;
                            ru3Var.setSelection(ru3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            tu2Var.a.performClick();
                        } else if (i2 == 5) {
                            tu2Var.d.d.requestFocus();
                            tu2Var.d.d.setSelection(tu2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            tu2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (!this.J) {
            final TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
            xib xibVar = new xib(context, ylbVar);
            this.y = xibVar;
            xibVar.o(R.drawable.msg_addphoto, jb6.a0(null, null, 2131744083, W1.first_name), true);
            this.y.setBackground(cmb.K0(ylbVar, true));
            xib xibVar2 = this.y;
            int i2 = cmb.u6;
            int i3 = cmb.t6;
            xibVar2.g(i2, i3);
            final p09 p09Var = new p09(R.raw.photo_suggest_icon, gm.L(50.0f), gm.L(50.0f), false, null);
            this.y.e.setTranslationX(-gm.L(8.0f));
            this.y.e.setAnimation(p09Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: ou2
                public final /* synthetic */ tu2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b2;
                    final p09 p09Var2 = p09Var;
                    TLRPC.User user = W1;
                    final tu2 tu2Var = this.b;
                    final byte b5 = 1;
                    final byte b6 = 0;
                    switch (b4) {
                        case 0:
                            tu2Var.S = (byte) 1;
                            wn5 wn5Var = tu2Var.Q;
                            wn5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            wn5Var.n((userProfilePhoto != null ? userProfilePhoto.photo_small : null) != null, new jd((byte) 10), new DialogInterface.OnDismissListener() { // from class: ku2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b5;
                                    p09 p09Var3 = p09Var2;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            p09Var2.H(0);
                            p09Var2.K(43);
                            tu2Var.y.e.d();
                            break;
                        default:
                            tu2Var.S = (byte) 2;
                            wn5 wn5Var2 = tu2Var.Q;
                            wn5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            wn5Var2.n((userProfilePhoto2 != null ? userProfilePhoto2.photo_small : null) != null, new jd((byte) 10), new DialogInterface.OnDismissListener() { // from class: ku2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b6;
                                    p09 p09Var3 = p09Var2;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            p09Var2.H(0);
                            p09Var2.K(43);
                            tu2Var.E.e.d();
                            break;
                    }
                }
            });
            xib xibVar3 = new xib(context, ylbVar);
            this.E = xibVar3;
            xibVar3.o(R.drawable.msg_addphoto, jb6.a0(null, null, 2131743366, W1.first_name), false);
            this.E.setBackground(cmb.K0(ylbVar, true));
            this.E.g(i2, i3);
            final p09 p09Var2 = new p09(R.raw.camera_outline, gm.L(50.0f), gm.L(50.0f), false, null);
            this.E.e.setTranslationX(-gm.L(8.0f));
            this.E.e.setAnimation(p09Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: ou2
                public final /* synthetic */ tu2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b;
                    final p09 p09Var22 = p09Var2;
                    TLRPC.User user = W1;
                    final tu2 tu2Var = this.b;
                    final byte b5 = 1;
                    final byte b6 = 0;
                    switch (b4) {
                        case 0:
                            tu2Var.S = (byte) 1;
                            wn5 wn5Var = tu2Var.Q;
                            wn5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            wn5Var.n((userProfilePhoto != null ? userProfilePhoto.photo_small : null) != null, new jd((byte) 10), new DialogInterface.OnDismissListener() { // from class: ku2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b5;
                                    p09 p09Var3 = p09Var22;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            p09Var22.H(0);
                            p09Var22.K(43);
                            tu2Var.y.e.d();
                            break;
                        default:
                            tu2Var.S = (byte) 2;
                            wn5 wn5Var2 = tu2Var.Q;
                            wn5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            wn5Var2.n((userProfilePhoto2 != null ? userProfilePhoto2.photo_small : null) != null, new jd((byte) 10), new DialogInterface.OnDismissListener() { // from class: ku2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b6;
                                    p09 p09Var3 = p09Var22;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                break;
                                            } else {
                                                p09Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            p09Var22.H(0);
                            p09Var22.K(43);
                            tu2Var.E.e.d();
                            break;
                    }
                }
            });
            this.V = new bf0(context);
            this.F = new ru2(this, context, ylbVar);
            pc0 pc0Var = this.n;
            if (pc0Var == null) {
                pc0Var = new pc0(0, W1);
                this.n = pc0Var;
            }
            this.V.f(W1.photo, pc0Var);
            this.F.addView(this.V, qoe.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(jb6.M0(2131745821, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(cmb.K0(ylbVar, true));
            this.F.g(i2, i3);
            this.F.setOnClickListener(new b0(this, context, W1, (byte) 26));
            xib xibVar4 = new xib(context, ylbVar);
            this.G = xibVar4;
            xibVar4.o(R.drawable.menu_birthday, jb6.a0(null, null, 2131743365, new Object[0]), false);
            this.G.setBackground(cmb.K0(ylbVar, true));
            this.G.g(i2, i3);
            this.G.setNeedDivider(true);
            this.G.e.setTranslationX(gm.L(4.0f));
            this.G.setOnClickListener(new rc1((Object) this, (Object) W1, (byte) 23));
            TLRPC.UserFull X1 = getMessagesController().X1(this.I);
            if (X1 != null) {
                TLRPC.Photo photo = X1.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = X1.fallback_photo;
                }
            }
            k0();
        }
        q7c q7cVar = new q7c(this, new h92(this, (byte) 10), new wm2(this, b3), null);
        this.X = q7cVar;
        q7cVar.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new bk1(this, frameLayout, b3));
        frameLayout.addView(this.X, qoe.e(-1, -1, nm7.D1));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.User user) {
        this.R = null;
        h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        W1.photo.personal = false;
        TLRPC.UserFull X1 = oc7.r1(this.currentAccount).X1(this.I);
        if (X1 != null) {
            X1.personal_photo = null;
            X1.flags &= -2097153;
            getMessagesStorage().g2(X1, true);
        }
        TLRPC.Photo photo = this.U;
        if (photo != null) {
            W1.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 1000, false, null, false);
            if (w != null) {
                W1.photo.photo_small = w.location;
            }
            if (w2 != null) {
                W1.photo.photo_big = w2.location;
            }
        } else {
            W1.photo = null;
            W1.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        getMessagesStorage().j1(arrayList2, null, false, true);
        k0();
        getNotificationCenter().k(nm7.c0, new Object[0]);
        getNotificationCenter().k(2, 2);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xb7 xb7Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = oc7.s5;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            j0();
            return;
        }
        if (i == nm7.g3 && (xb7Var = (xb7) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(xb7Var.b);
            int i4 = 0;
            while (i4 < arrayList.size()) {
                if (arrayList.get(i4) == null) {
                    arrayList.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    public final void e0() {
        if (this.a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.a0.e1()));
            nm7.f(this.currentAccount).k(nm7.v, arrayList, 0L, Boolean.FALSE);
        }
    }

    public final void f0(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z) {
        wn5 wn5Var = this.Q;
        if (wn5Var.U) {
            return;
        }
        byte b = this.T;
        if (b == 2) {
            this.R = photoSize.location;
        } else if (b == 1 && getParentLayout() != null) {
            tk5 parentLayout = getParentLayout();
            d lastFragment = getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = (d) fragmentStack.get(size);
                if (dVar instanceof yv1) {
                    yv1 yv1Var = (yv1) dVar;
                    d dVar2 = lastFragment;
                    if (yv1Var.a() == this.I && yv1Var.g4 == 0) {
                        yv1Var.rb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            d dVar3 = dVar2;
                            if (arrayList.get(size2) != dVar3) {
                                ((d) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            dVar2 = dVar3;
                        }
                        dVar2.finishFragment();
                    } else {
                        lastFragment = dVar2;
                    }
                }
                arrayList.add((d) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            this.e.m(gn5.e(this.R), "50_50", this.n, getMessagesController().W1(Long.valueOf(this.I)));
            if (this.T == 2) {
                i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                a6a.B(this.currentAccount);
                tL_messageService.random_id = a6a.D();
                tL_messageService.dialog_id = this.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int i = getUserConfig().i();
                tL_messageService.id = i;
                tL_messageService.local_id = i;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = this.I;
                tL_messageService.date = getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                k47 k47Var = new k47(this.currentAccount, tL_messageService, false, false);
                this.a0 = k47Var;
                arrayList2.add(k47Var);
                new ArrayList().add(tL_messageService);
                oc7.r1(this.currentAccount).t5(0, this.I, arrayList2);
                getMessagesController().n4.put(tL_messageService.local_id, wn5Var);
            }
        } else {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
            if (this.a0 == null && W1 != null) {
                boolean z2 = inputFile2 != null;
                W1.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                W1.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z2;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(W1);
                getMessagesStorage().j1(arrayList3, null, false, true);
                getNotificationCenter().k(nm7.c0, new Object[0]);
                nm7 notificationCenter = getNotificationCenter();
                int i2 = oc7.s5;
                notificationCenter.k(2, 2);
            }
            h0(this.R, photoSize2.location, inputFile, inputFile2, videoSize, d, this.T);
            i0(false, true);
        }
        k0();
    }

    public final void g0(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (this.a0 == null) {
            if ((fileLocation == null && inputFile == null) || tLObject == null) {
                return;
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
            TLRPC.UserFull X1 = oc7.r1(this.currentAccount).X1(this.I);
            if (X1 != null) {
                X1.personal_photo = tL_photos_photo.photo;
                X1.flags |= TLObject.FLAG_21;
                getMessagesStorage().g2(X1, true);
            }
            if (W1 != null) {
                TLRPC.PhotoSize w = bc4.w(arrayList, 100, false, null, false);
                TLRPC.PhotoSize w2 = bc4.w(arrayList, 1000, false, null, false);
                if (w != null && fileLocation != null) {
                    bc4.G(this.currentAccount);
                    File J = bc4.J(w, null, true, true);
                    bc4.G(this.currentAccount);
                    bc4.J(fileLocation, null, true, true).renameTo(J);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fileLocation.volume_id);
                    sb.append("_");
                    String k = hg9.k(sb, fileLocation.local_id, "@50_50");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w.location.volume_id);
                    sb2.append("_");
                    fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@50_50"), gn5.l(this.currentAccount, 1, W1));
                }
                if (w2 != null && fileLocation2 != null) {
                    bc4.G(this.currentAccount);
                    File J2 = bc4.J(w2, null, true, true);
                    bc4.G(this.currentAccount);
                    bc4.J(fileLocation2, null, true, true).renameTo(J2);
                }
                f88.a(tL_photos_photo.photo, W1, true);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(W1);
                getMessagesStorage().j1(arrayList2, null, false, true);
                getMessagesController().T0(this.I);
                getNotificationCenter().k(nm7.c0, new Object[0]);
                getNotificationCenter().k(2, 2);
                if (getParentActivity() != null) {
                    if (i == 2) {
                        c41.b0(this).V(arrayList2, gm.S2(jb6.a0("UserCustomPhotoSeted", null, 2131743430, W1.first_name)), null, null).j();
                    } else {
                        c41.b0(this).V(arrayList2, gm.S2(jb6.a0("UserCustomPhotoSeted", null, 2131743430, W1.first_name)), null, null).j();
                    }
                }
            }
            this.R = null;
            k0();
        }
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(final TLRPC.FileLocation fileLocation, final TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final int i) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().n1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i2 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i2 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new RequestDelegate() { // from class: lu2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gm.c3(new nu2(tu2.this, fileLocation, inputFile2, tLObject, fileLocation2, i));
            }
        });
    }

    public final void i0(boolean z, boolean z2) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (!z2) {
            RadialProgressView radialProgressView = this.s;
            if (z) {
                radialProgressView.setAlpha(1.0f);
                this.s.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            radialProgressView.setAlpha(0.0f);
            this.s.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        RadialProgressView radialProgressView2 = this.s;
        if (z) {
            radialProgressView2.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.x;
            RadialProgressView radialProgressView3 = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<a91, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<a91, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new y7((byte) 24, (Object) this, z));
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User W1;
        if (this.f == null || (W1 = getMessagesController().W1(Long.valueOf(this.I))) == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(b0());
        TextView textView = this.f;
        if (isEmpty) {
            textView.setText(jb6.M0(2131748167, null));
        } else {
            textView.setText(r58.f().e("+" + b0()));
        }
        this.h.setText(jb6.d0(this.currentAccount, W1, null, null));
        if (this.R == null) {
            bf0 bf0Var = this.e;
            pc0 pc0Var = new pc0(0, W1);
            this.n = pc0Var;
            bf0Var.f(W1, pc0Var);
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.m(gn5.i(bc4.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.n, null);
        }
        pc0 pc0Var = this.n;
        if (pc0Var == null) {
            pc0Var = new pc0(0, W1);
            this.n = pc0Var;
        }
        TLRPC.FileLocation fileLocation = this.R;
        bf0 bf0Var = this.e;
        if (fileLocation == null) {
            bf0Var.f(W1, pc0Var);
        } else {
            bf0Var.m(gn5.e(fileLocation), "50_50", this.n, getMessagesController().W1(Long.valueOf(this.I)));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.g3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        this.L = oc7.r1(this.currentAccount).W3.getBoolean("dialog_bar_exception" + this.I, false);
        TLRPC.User W1 = this.I != 0 ? getMessagesController().W1(Long.valueOf(this.I)) : null;
        wn5 wn5Var = this.Q;
        if (wn5Var != null) {
            wn5Var.a = this;
            wn5Var.b = this;
        }
        this.H = oc7.r1(this.currentAccount).T0(this.I);
        return W1 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.g3);
        wn5 wn5Var = this.Q;
        if (wn5Var != null) {
            wn5Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        j0();
        this.Q.k();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        TLRPC.User W1;
        try {
            super.onThemeColorsChanged();
            if (this.e == null || (W1 = getMessagesController().W1(Long.valueOf(this.I))) == null) {
                return;
            }
            this.n.q(W1);
            this.e.invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    public tu2(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new wn5(0, true, true);
    }
}
