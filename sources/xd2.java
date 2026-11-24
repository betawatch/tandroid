// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xd2 extends fx0 implements gk7 {
    public static final /* synthetic */ int f2 = 0;
    public final sd2 A1;
    public final View B1;
    public final hn C1;
    public final hn D1;
    public final TextView E1;
    public wd2 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public umb K1;
    public float L1;
    public ValueAnimator M1;
    public ke5 N1;
    public boolean O1;
    public jy3 P1;
    public d Q1;
    public x02 R1;
    public st S1;
    public hn T1;
    public boolean U1;
    public cm2 V1;
    public boolean W1;
    public boolean X1;
    public TL_stories.TL_premium_boostsStatus Y1;
    public float Z1;
    public ValueAnimator a2;
    public boolean b2;
    public boolean c2;
    public int d2;
    public int e2;
    public final ImageView l1;
    public final ed0 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final vd2 q1;
    public final ku1 r1;
    public final jy3 s1;
    public final boolean t1;
    public final mu1 u1;
    public final o39 v1;
    public final t26 w1;
    public final pi4 x1;
    public final oy8 y1;
    public final vh1 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd2(mu1 mu1Var, ku1 ku1Var) {
        super(1, (wjb) ku1Var, (Context) mu1Var.getParentActivity(), true);
        String str;
        byte b = 1;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = mu1Var;
        this.r1 = ku1Var;
        this.s1 = ku1Var.f;
        this.p1 = ku1Var.g;
        this.t1 = bkb.I.o();
        vd2 vd2Var = new vd2(this.a, mu1Var.a(), ku1Var, 0);
        this.q1 = vd2Var;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i = bkb.h5;
            this.H0 = bkb.v0(i, this.J0);
            gl.p3(this, bkb.v0(i, this.J0), false, null);
            gl.j3(this, ((double) gl.B(this.H0)) > 0.721d);
        } else {
            M(bkb.h5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(k96.M0(2131745459, null));
        tb4.w(textView, bkb.i5, this.J0, 1, 20.0f);
        textView.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = gl.L(10.0f);
        imageView.setPadding(L, L, L, L);
        ed0 ed0Var = new ed0(false);
        this.m1 = ed0Var;
        imageView.setImageDrawable(ed0Var);
        imageView.setOnClickListener(new hd2(this, b));
        frameLayout.addView(imageView, nme.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, nme.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i2 = bkb.Ei;
        int v0 = bkb.v0(i2, this.J0);
        int L2 = gl.L(28.0f);
        oy8 oy8Var = new oy8(R.raw.sun_outline, L2, L2, false, null);
        this.y1 = oy8Var;
        this.G1 = !bkb.I.o();
        O0(bkb.I.o(), false);
        oy8Var.E(true);
        oy8Var.h = true;
        this.d2 = v0;
        oy8Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        vh1 vh1Var = new vh1((byte) 1, getContext(), this);
        this.z1 = vh1Var;
        vh1Var.setAnimation(oy8Var);
        vh1Var.setScaleType(ImageView.ScaleType.CENTER);
        vh1Var.setOnClickListener(new hd2(this, (byte) 2));
        frameLayout.addView(vh1Var, nme.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new sd2(getContext());
        o39 o39Var = new o39(getContext(), null);
        this.v1 = o39Var;
        o39Var.setAdapter(vd2Var);
        o39Var.setDrawSelection(false);
        o39Var.setClipChildren(false);
        o39Var.setClipToPadding(false);
        o39Var.setHasFixedSize(true);
        o39Var.setItemAnimator(null);
        o39Var.setNestedScrollingEnabled(false);
        getContext();
        t26 t26Var = new t26(0, false);
        this.w1 = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        o39Var.setOnItemClickListener(new u(this, (byte) 12));
        o39Var.setOnScrollListener(new y(this, (byte) 26));
        pi4 pi4Var = new pi4(getContext(), this.J0);
        this.x1 = pi4Var;
        pi4Var.setViewType(14);
        pi4Var.setVisibility(0);
        frameLayout.addView(pi4Var, nme.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(o39Var, nme.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = gl.L(6.0f);
        int v02 = bkb.v0(i2, this.J0);
        int i3 = bkb.Gi;
        int v03 = bkb.v0(i3, this.J0);
        Drawable i0 = bkb.i0(L3, L3, L3, L3, v02, v03, v03);
        vkb M = zkb.M(i2);
        vkb M2 = zkb.M(i3);
        wjb wjbVar = this.J0;
        view.setBackground(i0);
        zkb.j(view, i0, M, M2, wjbVar);
        view.setOnClickListener(new hd2(this, (byte) 3));
        frameLayout.addView(view, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(k96.M0(2131752126, null));
        } else {
            textView2.setText(k96.M0(2131752128, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new g6(this, (byte) 4));
        frameLayout.addView(textView2, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        hn hnVar = new hn(getContext(), true, true, true);
        this.C1 = hnVar;
        hnVar.getDrawable().q(true);
        hnVar.n = false;
        hnVar.setGravity(17);
        int i4 = bkb.Ii;
        zkb.U(hnVar, i4, this.J0);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTypeface(gl.o());
        frameLayout.addView(hnVar, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        hn hnVar2 = new hn(getContext(), true, true, true);
        this.D1 = hnVar2;
        hnVar2.getDrawable().q(true);
        hnVar2.n = false;
        hnVar2.setGravity(17);
        zkb.U(hnVar2, i4, this.J0);
        hnVar2.setTextSize(gl.L(12.0f));
        hnVar2.setAlpha(0.0f);
        hnVar2.setTranslationY(gl.L(11.0f));
        frameLayout.addView(hnVar2, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(k96.M0(2131745892, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new kb1((Object) this, (Object) mu1Var, (byte) 18));
            frameLayout.addView(textView3, nme.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (mu1Var.h() != null) {
                str = l7c.k(mu1Var.h(), true);
            } else {
                TLRPC.Chat chat = mu1Var.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(k96.a0("ChatThemeApplyHint", null, 2131752194, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, nme.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        T0();
        U0(false);
    }

    public static akb D0(boolean z) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (bkb.O0(string) != null && !bkb.O0(string).o()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (bkb.O0(string2) != null && bkb.O0(string2).o()) {
            str2 = string2;
        }
        return z ? bkb.O0(str2) : bkb.O0(str);
    }

    public static void R0(umb umbVar) {
        if (umbVar == null) {
            return;
        }
        float width = umbVar.getWidth() / 2.0f;
        float width2 = umbVar.getWidth();
        float height = umbVar.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(umbVar, umb.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ls3.e);
        ofFloat.addListener(new bb1((Object) umbVar, (byte) 25));
        ofFloat.start();
    }

    @Override // fx0
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.h5));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(boolean z) {
        long j;
        TLRPC.ChatTheme chatTheme;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z2;
        char c;
        TLRPC.User h;
        boolean z3;
        if (this.W1) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y1;
        byte b = 1;
        mu1 mu1Var = this.u1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < mu1Var.getMessagesController().k4.f2.f()) {
            mu1Var.getMessagesController().E0().b(mu1Var.a(), this.Y1, new id2(this, b));
            return;
        }
        jy3 jy3Var = this.F1.a;
        m21 m21Var = null;
        if (jy3Var != this.P1) {
            TLRPC.ChatTheme chatTheme2 = !jy3Var.a ? jy3Var.d : null;
            if (jy3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l = (Long) je2.e(jy3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) jy3Var.d).gift.slug);
                if (l != null) {
                    j = l.longValue();
                    chatTheme = jy3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j == 0 && tL_starGiftUnique != null && !z) {
                                ij.k0(getContext(), this.J0, this.a, tL_starGiftUnique, j, new gd2(this, b));
                                return;
                            }
                            je2.e(this.a).a(mu1Var.a(), false, false);
                            je2.e(this.a).q(mu1Var.a(), elb.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = J0() ? null : this.r1.g;
                            boolean z4 = this.G1;
                            boolean z5 = this.t1;
                            umb F0 = z4 != z5 ? F0() : null;
                            z2 = jy3Var.a;
                            ku1 ku1Var = this.r1;
                            if (z2) {
                                c = 0;
                                ku1Var.q(null, wallPaper, F0 == null, Boolean.valueOf(z5), false);
                            } else {
                                c = 0;
                                ku1Var.q(jy3Var, wallPaper, F0 == null, Boolean.valueOf(z5), false);
                            }
                            R0(F0);
                            this.H1 = true;
                            h = mu1Var.h();
                            if (h != null && !h.self) {
                                z3 = jy3Var.a;
                                nza nzaVar = new nza(getContext(), null, 1, -1, jy3Var.e(), mu1Var.getResourceProvider());
                                nzaVar.c.setVisibility(8);
                                String str = h.first_name;
                                TextView textView = nzaVar.b;
                                if (z3) {
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str;
                                    de9.r("ThemeAlsoAppliedForHint", null, 2131743948, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str;
                                    de9.r("ThemeAlsoDisabledForHint", null, 2131743947, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                m21Var = m21.g(mu1Var, nzaVar, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j == 0) {
                    }
                    je2.e(this.a).a(mu1Var.a(), false, false);
                    je2.e(this.a).q(mu1Var.a(), elb.c(chatTheme2), chatTheme2, true);
                    if (J0()) {
                    }
                    boolean z42 = this.G1;
                    boolean z52 = this.t1;
                    if (z42 != z52) {
                    }
                    z2 = jy3Var.a;
                    ku1 ku1Var2 = this.r1;
                    if (z2) {
                    }
                    R0(F0);
                    this.H1 = true;
                    h = mu1Var.h();
                    if (h != null) {
                        z3 = jy3Var.a;
                        nza nzaVar2 = new nza(getContext(), null, 1, -1, jy3Var.e(), mu1Var.getResourceProvider());
                        nzaVar2.c.setVisibility(8);
                        String str2 = h.first_name;
                        TextView textView2 = nzaVar2.b;
                        if (z3) {
                        }
                        textView2.setTypeface(null);
                        m21Var = m21.g(mu1Var, nzaVar2, 2750);
                    }
                }
            }
            j = 0;
            chatTheme = jy3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j == 0) {
            }
            je2.e(this.a).a(mu1Var.a(), false, false);
            je2.e(this.a).q(mu1Var.a(), elb.c(chatTheme2), chatTheme2, true);
            if (J0()) {
            }
            boolean z422 = this.G1;
            boolean z522 = this.t1;
            if (z422 != z522) {
            }
            z2 = jy3Var.a;
            ku1 ku1Var22 = this.r1;
            if (z2) {
            }
            R0(F0);
            this.H1 = true;
            h = mu1Var.h();
            if (h != null) {
            }
        }
        dismiss();
        if (m21Var != null) {
            m21Var.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final umb F0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        mu1 mu1Var = this.u1;
        Activity parentActivity = mu1Var != null ? mu1Var.getParentActivity() : null;
        if (parentActivity == null || parentActivity.getWindow() == null || !(parentActivity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) parentActivity.getWindow().getDecorView();
        if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0) {
            return null;
        }
        try {
            bitmap2 = Build.VERSION.SDK_INT >= 26 ? gl.A0(parentActivity.getWindow()) : null;
            if (bitmap2 == null) {
                try {
                    bitmap2 = gl.I3(frameLayout);
                } catch (Throwable th) {
                    bitmap = bitmap2;
                    th = th;
                    fa4.g(th, true);
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
        if (bitmap2 != null) {
            return null;
        }
        umb umbVar = new umb(parentActivity);
        umbVar.setScaleType(ImageView.ScaleType.MATRIX);
        umbVar.setImageBitmap(bitmap2);
        umbVar.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        umbVar.setRadius(0.0f);
        frameLayout.addView(umbVar, new FrameLayout.LayoutParams(-1, -1));
        return umbVar;
    }

    public final void G0() {
        if (!J0()) {
            dismiss();
            return;
        }
        final byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = k96.M0(2131752184, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752185, null);
        alertDialog$Builder.j(k96.M0(2131752187, null), new ed(this) { // from class: jd2
            public final /* synthetic */ xd2 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i) {
                byte b2 = b;
                xd2 xd2Var = this.b;
                switch (b2) {
                    case 0:
                        xd2Var.E0(false);
                        break;
                    default:
                        xd2Var.dismiss();
                        break;
                }
            }
        });
        final byte b2 = 1;
        alertDialog$Builder.g(k96.M0(2131752186, null), new ed(this) { // from class: jd2
            public final /* synthetic */ xd2 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i) {
                byte b22 = b2;
                xd2 xd2Var = this.b;
                switch (b22) {
                    case 0:
                        xd2Var.E0(false);
                        break;
                    default:
                        xd2Var.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.o();
    }

    public final void H0() {
        try {
            int v0 = bkb.v0(bkb.Ei, this.J0);
            oy8 oy8Var = this.y1;
            if (oy8Var != null && v0 != this.d2) {
                this.d2 = v0;
                oy8Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            ed0 ed0Var = this.m1;
            if (ed0Var != null) {
                int i = bkb.i5;
                ed0Var.a(bkb.v0(i, this.J0));
                ed0Var.b(bkb.v0(i, this.J0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int v02 = bkb.v0(bkb.g5, this.J0);
            if (v02 != this.e2) {
                this.e2 = v02;
                s0(v02);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void I0() {
        if (this.J || this.H1) {
            return;
        }
        bkb.b = false;
        TLRPC.WallPaper wallPaper = J0() ? null : this.r1.g;
        jy3 jy3Var = this.F1.a;
        boolean z = jy3Var.a;
        boolean z2 = this.G1;
        ku1 ku1Var = this.r1;
        if (z) {
            ku1Var.q(null, wallPaper, false, Boolean.valueOf(z2), true);
        } else {
            ku1Var.q(jy3Var, wallPaper, false, Boolean.valueOf(z2), true);
        }
        x02 x02Var = this.R1;
        if (x02Var != null) {
            v12 v12Var = x02Var.l2;
            if (v12Var != null) {
                boolean z3 = this.G1;
                dy0 dy0Var = v12Var.w;
                ((ArrayList) dy0Var.e).clear();
                WallpapersListActivity.z0((ArrayList) dy0Var.e, z3);
                dy0Var.f();
            }
            this.R1.H0();
        }
        vd2 vd2Var = this.q1;
        if (vd2Var == null || vd2Var.d == null) {
            return;
        }
        for (int i = 0; i < vd2Var.d.size(); i++) {
            ((wd2) vd2Var.d.get(i)).c = this.G1 ? 1 : 0;
        }
        vd2Var.f();
    }

    public final boolean J0() {
        if (this.F1 == null) {
            return false;
        }
        jy3 jy3Var = this.P1;
        elb elbVar = jy3Var != null ? jy3Var.c : null;
        if (elbVar == null) {
            elbVar = elb.d("❌");
        }
        jy3 jy3Var2 = this.F1.a;
        elb elbVar2 = jy3Var2 != null ? jy3Var2.c : null;
        if (elbVar2 == null) {
            elbVar2 = elb.d("❌");
        }
        return !elb.a(elbVar, elbVar2);
    }

    public final void K0() {
        ArrayList arrayList;
        if (this.U1) {
            return;
        }
        je2 e = je2.e(this.a);
        if (!e.f.c || (arrayList = e.b) == null || arrayList.isEmpty()) {
            this.U1 = true;
            byte b = 0;
            if (e.f.c) {
                e.o(new td2(this, e), false);
                return;
            }
            ud2 ud2Var = new ud2(this, e);
            long currentTimeMillis = System.currentTimeMillis();
            ie2 ie2Var = e.f;
            boolean z = currentTimeMillis - ie2Var.b > 7200000;
            if (((ArrayList) ie2Var.d) == null || !ie2Var.c || z) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                ie2 ie2Var2 = e.f;
                tl_getUniqueGiftChatThemes.offset = (String) ie2Var2.e;
                tl_getUniqueGiftChatThemes.hash = ie2Var2.a;
                tl_getUniqueGiftChatThemes.limit = 50;
                ConnectionsManager connectionsManager = e.getConnectionsManager();
                co3 co3Var = je2.s;
                Objects.requireNonNull(co3Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new ge2(co3Var, b), new ae2(e, ud2Var, b));
            }
        }
    }

    public final void L0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        wd2 wd2Var = new wd2((jy3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            jy3 jy3Var = this.r1.f;
            this.P1 = jy3Var;
            if (jy3Var != null) {
                jy3Var.k();
            }
        }
        arrayList2.add(0, wd2Var);
        if (!this.O1) {
            this.F1 = wd2Var;
        }
        jy3 jy3Var2 = this.P1;
        elb elbVar = jy3Var2 != null ? jy3Var2.c : null;
        boolean z = false;
        int i = 1;
        while (i < arrayList.size()) {
            jy3 jy3Var3 = (jy3) arrayList.get(i);
            wd2 wd2Var2 = new wd2(jy3Var3);
            jy3Var3.m(this.a);
            wd2Var2.c = this.G1 ? 1 : 0;
            if (elb.a(jy3Var3.c, elbVar)) {
                arrayList2.add(1, wd2Var2);
                z = true;
            } else {
                arrayList2.add(wd2Var2);
            }
            i++;
            z = z;
        }
        jy3 jy3Var4 = this.P1;
        if (jy3Var4 != null && !z) {
            wd2 wd2Var3 = new wd2(jy3Var4);
            jy3Var4.m(this.a);
            wd2Var3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, wd2Var3);
        }
        vd2 vd2Var = this.q1;
        vd2Var.d = arrayList2;
        vd2Var.f();
        this.z1.setVisibility(0);
        if (!this.O1) {
            N0(false);
            this.v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        U0(true);
    }

    public final void M0() {
        if (this.J || this.H1) {
            return;
        }
        this.I1 = false;
        this.u1.getClass();
        TLRPC.WallPaper wallPaper = J0() ? null : this.p1;
        jy3 jy3Var = this.F1.a;
        boolean z = jy3Var.a;
        boolean z2 = this.G1;
        ku1 ku1Var = this.r1;
        if (z) {
            ku1Var.q(null, wallPaper, true, Boolean.valueOf(z2), false);
        } else {
            ku1Var.q(jy3Var, wallPaper, true, Boolean.valueOf(z2), false);
        }
    }

    public final void N0(boolean z) {
        vd2 vd2Var = this.q1;
        ArrayList arrayList = vd2Var.d;
        jy3 jy3Var = this.P1;
        t26 t26Var = this.w1;
        o39 o39Var = this.v1;
        if (jy3Var != null) {
            int i = 0;
            while (true) {
                if (i == arrayList.size()) {
                    i = -1;
                    break;
                } else {
                    if (elb.a(((wd2) arrayList.get(i)).a.c, this.P1.c)) {
                        this.F1 = (wd2) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i != -1) {
                this.J1 = i;
                vd2Var.E(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int min = Math.min(i, vd2Var.d.size() - 1);
                if (z) {
                    o39Var.z0(min);
                } else {
                    t26Var.g1(min, 0);
                }
            }
        } else {
            this.F1 = (wd2) arrayList.get(0);
            vd2Var.E(0);
            if (z) {
                o39Var.z0(0);
            } else {
                t26Var.g1(0, 0);
            }
        }
        M0();
    }

    public final void O0(boolean z, boolean z2) {
        if (this.G1 != z) {
            this.G1 = z;
            vh1 vh1Var = this.z1;
            oy8 oy8Var = this.y1;
            if (z2) {
                oy8Var.K(z ? oy8Var.e[0] : 0);
                if (vh1Var != null) {
                    vh1Var.d();
                    return;
                }
                return;
            }
            int i = z ? oy8Var.e[0] - 1 : 0;
            oy8Var.I(i, false, true);
            oy8Var.K(i);
            if (vh1Var != null) {
                vh1Var.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(boolean z) {
        Bitmap bitmap;
        if (this.J || this.b2) {
            return;
        }
        ValueAnimator valueAnimator = this.M1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        mu1 mu1Var = this.u1;
        FrameLayout frameLayout = (FrameLayout) mu1Var.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = mu1Var.getParentActivity().getWindow();
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 26 && frameLayout2.getWidth() > 0 && frameLayout2.getHeight() > 0) {
            Bitmap A0 = gl.A0(window);
            Bitmap A02 = A0 != null ? gl.A0(window2) : null;
            if (A0 != null) {
                if (A02 != null) {
                    frameLayout.getLocationOnScreen(new int[2]);
                    frameLayout2.getLocationOnScreen(new int[2]);
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawBitmap(A0, r6[0] - r7[0], r6[1] - r7[1], (Paint) null);
                    canvas.drawBitmap(A02, 0.0f, 0.0f, (Paint) null);
                    A0.recycle();
                    A02.recycle();
                    vh1 vh1Var = this.z1;
                    if (bitmap == null) {
                        umb.a(bitmap, null, vh1Var);
                    } else {
                        bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        vh1Var.setAlpha(0.0f);
                        frameLayout.draw(canvas2);
                        frameLayout2.draw(canvas2);
                        vh1Var.setAlpha(1.0f);
                    }
                    vh1Var.getLocationInWindow(new int[2]);
                    float measuredWidth = (vh1Var.getMeasuredWidth() / 2.0f) + r3[0];
                    float measuredHeight = (vh1Var.getMeasuredHeight() / 2.0f) + r3[1];
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    ax1 ax1Var = umb.x;
                    float max = Math.max(measuredWidth, width - measuredWidth);
                    float max2 = Math.max(measuredHeight, height - measuredHeight);
                    float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                    umb umbVar = new umb(getContext());
                    umbVar.setScaleType(ImageView.ScaleType.MATRIX);
                    umbVar.setImageBitmap(bitmap);
                    umbVar.b(measuredWidth, measuredHeight, z);
                    ColorFilter colorFilter = this.y1.getColorFilter();
                    umbVar.n = vh1Var;
                    umbVar.r = colorFilter;
                    umbVar.setRadius(!z ? 0.0f : sqrt);
                    this.K1 = umbVar;
                    umbVar.setOnTouchListener(new jz1((byte) 4));
                    this.L1 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.M1 = ofFloat;
                    ofFloat.addUpdateListener(new ld2(this, umbVar, sqrt, z));
                    this.M1.addListener(new bb1((Object) this, (byte) 24));
                    this.M1.setDuration(400L);
                    this.M1.setInterpolator(ls3.e);
                    this.M1.start();
                    frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
                    gl.d3(new x6c((byte) 12, this, z));
                }
                A0.recycle();
            }
        }
        bitmap = null;
        vh1 vh1Var2 = this.z1;
        if (bitmap == null) {
        }
        vh1Var2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (vh1Var2.getMeasuredWidth() / 2.0f) + r3[0];
        float measuredHeight2 = (vh1Var2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        ax1 ax1Var2 = umb.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        umb umbVar2 = new umb(getContext());
        umbVar2.setScaleType(ImageView.ScaleType.MATRIX);
        umbVar2.setImageBitmap(bitmap);
        umbVar2.b(measuredWidth2, measuredHeight2, z);
        ColorFilter colorFilter2 = this.y1.getColorFilter();
        umbVar2.n = vh1Var2;
        umbVar2.r = colorFilter2;
        umbVar2.setRadius(!z ? 0.0f : sqrt2);
        this.K1 = umbVar2;
        umbVar2.setOnTouchListener(new jz1((byte) 4));
        this.L1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M1 = ofFloat2;
        ofFloat2.addUpdateListener(new ld2(this, umbVar2, sqrt2, z));
        this.M1.addListener(new bb1((Object) this, (byte) 24));
        this.M1.setDuration(400L);
        this.M1.setInterpolator(ls3.e);
        this.M1.start();
        frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
        gl.d3(new x6c((byte) 12, this, z));
    }

    public final void Q0(qmb qmbVar) {
        ag0 ag0Var = new ag0();
        ag0Var.a = true;
        mu1 mu1Var = this.u1;
        qmbVar.a.a = mu1Var.getResourceProvider();
        qmbVar.r1 = new rd2(this);
        ag0Var.c = new jc((byte) 24);
        ag0Var.d = new gd2(this, (byte) 5);
        ag0Var.b = new gd2(this, (byte) 6);
        ag0Var.e = true;
        this.Q1 = qmbVar;
        mu1Var.showAsSheet(qmbVar, ag0Var);
    }

    @Override // fx0
    public final ArrayList S() {
        kd2 kd2Var = new kd2(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.w7) {
            d dVar = this.Q1;
            if (dVar instanceof qmb) {
                arrayList.addAll(((qmb) dVar).T0());
                return arrayList;
            }
        }
        x02 x02Var = this.R1;
        if (x02Var != null) {
            arrayList.addAll(x02Var.S());
        }
        int i = 0;
        arrayList.add(new blb((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, kd2Var, bkb.g5));
        int i2 = bkb.Ei;
        View view = this.B1;
        arrayList.add(new blb(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Gi));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((blb) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void S0(akb akbVar) {
        if (akbVar == null || akbVar == bkb.I) {
            return;
        }
        this.b2 = true;
        try {
            kk7.e().k(kk7.v4, akbVar, Boolean.FALSE, null, -1);
        } finally {
            this.b2 = false;
        }
    }

    public final void T0() {
        TextView textView = this.o1;
        if (textView != null) {
            zkb.X(textView, bkb.o5, this.J0);
            int L = gl.L(6.0f);
            int i = bkb.Ei;
            int o = bm2.o(bkb.v0(i, this.J0), 76);
            ff0 i0 = bkb.i0(L, L, L, L, 0, o, o);
            vkb g = zkb.g(i, 76);
            wjb wjbVar = this.J0;
            textView.setBackground(i0);
            zkb.j(textView, i0, null, g, wjbVar);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i2 = bkb.o7;
            zkb.X(textView2, i2, this.J0);
            int L2 = gl.L(6.0f);
            int o2 = bm2.o(bkb.v0(i2, this.J0), 76);
            ff0 i02 = bkb.i0(L2, L2, L2, L2, 0, o2, o2);
            vkb g2 = zkb.g(i2, 76);
            wjb wjbVar2 = this.J0;
            textView2.setBackground(i02);
            zkb.j(textView2, i02, null, g2, wjbVar2);
        }
        int i3 = bkb.i5;
        ff0 f0 = bkb.f0(bm2.o(bkb.v0(i3, this.J0), 30), 1, -1);
        vkb g3 = zkb.g(i3, 30);
        wjb wjbVar3 = this.J0;
        ImageView imageView = this.l1;
        zkb.R(imageView, f0, null, g3, wjbVar3);
        int v0 = bkb.v0(i3, this.J0);
        ed0 ed0Var = this.m1;
        ed0Var.a(v0);
        ed0Var.b(bkb.v0(i3, this.J0));
        imageView.invalidate();
        int i4 = bkb.Ei;
        zkb.R(this.z1, bkb.f0(bm2.o(bkb.v0(i4, this.J0), 30), 1, -1), null, zkb.g(i4, 30), this.J0);
        int i5 = bkb.l5;
        wjb wjbVar4 = this.J0;
        TextView textView3 = this.E1;
        zkb.X(textView3, i5, wjbVar4);
        int L3 = gl.L(6.0f);
        int o3 = bm2.o(bkb.v0(i4, this.J0), 76);
        zkb.R(textView3, bkb.i0(L3, L3, L3, L3, 0, o3, o3), null, zkb.g(i4, 76), this.J0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, hn] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(boolean z) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z2;
        boolean z3;
        ValueAnimator valueAnimator;
        jy3 jy3Var;
        mu1 mu1Var = this.u1;
        TLRPC.Chat chat = mu1Var.e;
        byte b = 0;
        if (chat != null && !this.W1 && !this.X1 && this.Y1 == null) {
            this.W1 = true;
            mu1Var.getMessagesController().E0().a(mu1Var.a(), new id2(this, b));
        }
        boolean z4 = this.O1;
        pi4 pi4Var = this.x1;
        ed0 ed0Var = this.m1;
        TextView textView = this.o1;
        ?? r10 = this.D1;
        TextView textView2 = this.n1;
        TextView textView3 = this.E1;
        View view = this.B1;
        hn hnVar = this.C1;
        if (!z4) {
            ed0Var.c(z, 1.0f);
            view.setEnabled(false);
            gl.U3(textView3, false, 0.9f, false, z);
            gl.U3(textView2, false, 0.9f, false, z);
            gl.U3(view, false, 1.0f, false, z);
            gl.U3(hnVar, false, 0.9f, false, z);
            gl.U3(r10, false, 0.9f, false, z);
            gl.U3(textView, false, 0.9f, false, z);
            gl.U3(pi4Var, true, 1.0f, true, z);
            return;
        }
        gl.U3(pi4Var, false, 1.0f, true, z);
        if (!J0()) {
            ed0Var.c(z, 1.0f);
            view.setEnabled(false);
            gl.U3(textView3, true, 0.9f, false, z);
            gl.U3(textView2, true, 0.9f, false, z);
            gl.U3(view, false, 1.0f, false, z);
            gl.U3(hnVar, false, 0.9f, false, z);
            gl.U3(r10, false, 0.9f, false, z);
            gl.U3(textView, false, 0.9f, false, z);
            return;
        }
        ed0Var.c(z, 0.0f);
        view.setEnabled(true);
        wd2 wd2Var = this.F1;
        if (wd2Var == null || (jy3Var = wd2Var.a) == null || !jy3Var.a) {
            hnVar.setText(k96.M0(2131752235, null));
            if (chat != null && (tL_premium_boostsStatus = this.Y1) != null && tL_premium_boostsStatus.level < mu1Var.getMessagesController().k4.f2.f()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                cm2 cm2Var = this.V1;
                if (cm2Var == null) {
                    cm2Var = new cm2(R.drawable.mini_switch_lock, 0);
                    this.V1 = cm2Var;
                    cm2Var.n = 1;
                }
                spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.G(mu1Var.getMessagesController().k4.f2.f(), "ReactionLevelRequiredBtn", new Object[0]));
                r10.setText(spannableStringBuilder);
                z2 = true;
                z3 = (z || hnVar.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.a2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.a2 = null;
                }
                if (z3) {
                    this.Z1 = z2 ? 1.0f : 0.0f;
                    hnVar.setTranslationY((-gl.L(7.0f)) * this.Z1);
                } else {
                    float f = this.Z1;
                    float f3 = z2 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f;
                    fArr[r17] = f3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.a2 = ofFloat;
                    ofFloat.addUpdateListener(new uz1(this, (byte) 9));
                    this.a2.addListener(new y7((byte) 20, (Object) this, z2));
                    this.a2.start();
                }
                gl.U3(textView3, false, 0.9f, false, z);
                gl.U3(textView2, false, 0.9f, false, z);
                boolean z5 = r17;
                gl.U3(view, z5, 1.0f, false, z);
                gl.U3(hnVar, z5, 0.9f, false, z);
                gl.T3(r10, z2, 0.9f, false, 0.7f, z, null);
                gl.U3(textView, z5, 0.9f, false, z);
            }
        } else {
            hnVar.setText(k96.M0(2131752202, null));
        }
        r17 = 1;
        z2 = false;
        if (z) {
        }
        valueAnimator = this.a2;
        if (valueAnimator != null) {
        }
        if (z3) {
        }
        gl.U3(textView3, false, 0.9f, false, z);
        gl.U3(textView2, false, 0.9f, false, z);
        boolean z52 = r17;
        gl.U3(view, z52, 1.0f, false, z);
        gl.U3(hnVar, z52, 0.9f, false, z);
        gl.T3(r10, z2, 0.9f, false, 0.7f, z, null);
        gl.U3(textView, z52, 0.9f, false, z);
    }

    @Override // fx0
    public final boolean c0(MotionEvent motionEvent) {
        if (motionEvent == null || !J0()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x >= this.b.getLeft() && x <= this.b.getRight()) {
            return false;
        }
        this.u1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // fx0
    public final void d0(float f) {
        ke5 ke5Var = this.N1;
        if (ke5Var != null) {
            ke5Var.a();
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            kk7.f(this.a).d(new gd2(this, (byte) 0));
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        kk7.e().n(this, kk7.k4);
        super.dismiss();
        this.u1.getClass();
        boolean z = this.H1;
        boolean z2 = this.t1;
        umb F0 = (z || this.G1 == z2) ? null : F0();
        if (!this.H1) {
            ku1 ku1Var = this.r1;
            TLRPC.WallPaper wallPaper = ku1Var.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            ku1Var.q(this.s1, wallPaper, F0 == null, Boolean.valueOf(z2), false);
        }
        if (this.G1 != z2) {
            akb D0 = bkb.I.o() == z2 ? bkb.I : D0(z2);
            if (this.c2) {
                S0(D0);
            } else {
                bkb.t(D0, false, z2);
            }
        }
        this.c2 = false;
        R0(F0);
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        G0();
    }

    @Override // fx0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        je2 e = je2.e(this.a);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        kk7.e().b(this, kk7.k4);
        this.H1 = false;
        byte b = 7;
        if (!e.f.c || (arrayList = e.b) == null || arrayList.isEmpty()) {
            K0();
        } else {
            L0(e.d(7));
        }
        if (this.u1.h() == null || gba.b1 <= 0 || this.u1.h().self) {
            return;
        }
        gba.b1--;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", gba.b1).apply();
        ke5 ke5Var = new ke5(9, this.u1.getResourceProvider(), getContext(), false);
        this.N1 = ke5Var;
        ke5Var.setVisibility(4);
        this.N1.setShowingDuration(5000L);
        this.N1.setBottomOffset(-gl.L(8.0f));
        boolean z = this.G1;
        ke5 ke5Var2 = this.N1;
        if (z) {
            ke5Var2.setText(gl.T2(k96.a0("ChatThemeDaySwitchTooltip", null, 2131752191, new Object[0])));
        } else {
            ke5Var2.setText(gl.T2(k96.a0("ChatThemeNightSwitchTooltip", null, 2131752188, new Object[0])));
        }
        gl.e3(new gd2(this, b), 1500L);
        this.c.addView(this.N1, nme.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // fx0
    public final void p0() {
        int v0;
        super.p0();
        H0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.G0 != -1 || this.H0 == (v0 = bkb.v0(bkb.h5, this.J0))) {
                return;
            }
            this.H0 = v0;
            gl.p3(this, v0, false, null);
            gl.j3(this, ((double) gl.B(v0)) > 0.721d);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
