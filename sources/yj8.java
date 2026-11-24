// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class yj8 extends mz0 implements jm7 {
    public final int[] A2;
    public float B2;
    public boolean C2;
    public ValueAnimator D2;
    public boolean E2;
    public boolean F2;
    public FrameLayout G2;
    public final FrameLayout H2;
    public FrameLayout I2;
    public l66[] J2;
    public l66 K2;
    public final ArrayList S1;
    public int T1;
    public final TLRPC.User U1;
    public final nw4 V1;
    public final TL_stars.StarGift W1;
    public boolean X1;
    public final lj8 Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public final uj4 j2;
    public final nj8 k2;
    public ub l2;
    public w94 m2;
    public qmb n2;
    public final d o2;
    public Integer p2;
    public float q2;
    public float r2;
    public float s2;
    public float t2;
    public float u2;
    public View v2;
    public View w2;
    public TLRPC.InputStickerSet x2;
    public TLRPC.TL_emojiStatusCollectible y2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj8(d dVar, int i, TLRPC.User user, nw4 nw4Var, TL_stars.StarGift starGift, ylb ylbVar) {
        super(dVar, false, false, ylbVar);
        byte b = 0;
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        this.A2 = new int[2];
        this.B2 = 0.0f;
        J();
        this.o2 = dVar;
        this.u1 = 0.26f;
        this.U1 = user;
        this.T1 = i;
        this.V1 = nw4Var;
        this.W1 = starGift;
        this.Y1 = new lj8(getContext(), null);
        PremiumPreviewFragment.r0(i, arrayList);
        if (nw4Var != null || z8c.h(i).p()) {
            this.G2.setVisibility(8);
        }
        nj8 nj8Var = new nj8(cmb.Bk, cmb.Ck, cmb.Dk, cmb.Ek, null);
        this.k2 = nj8Var;
        nj8Var.m = true;
        nj8Var.o = 1.0f;
        nj8Var.p = 0.0f;
        nj8Var.q = 0.0f;
        nj8Var.b = 0.0f;
        nj8Var.c = 0.0f;
        f1();
        this.n1.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
        this.n1.setOnItemClickListener(new tj8(this, i, dVar, b));
        hs6.d0(i).p1();
        PremiumPreviewFragment.w0("profile");
        uj4 uj4Var = new uj4(getContext());
        this.j2 = uj4Var;
        this.c.addView(uj4Var, qoe.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.H2 = frameLayout;
        this.b.addView(frameLayout, qoe.e(-1, nm7.V1, 87));
    }

    @Override // mz0
    public final void N0(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.S1;
            if (i3 >= arrayList.size()) {
                this.Z1 = i4;
                this.c.getLocationOnScreen(this.A2);
                return;
            }
            hk8 hk8Var = (hk8) arrayList.get(i3);
            lj8 lj8Var = this.Y1;
            lj8Var.a(hk8Var, false);
            lj8Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((hk8) arrayList.get(i3)).e = i4;
            i4 += lj8Var.getMeasuredHeight();
            i3++;
        }
    }

    @Override // mz0
    public final void P0(ela elaVar) {
        this.T1 = z8c.t0;
        cj8 cj8Var = new cj8(this.J0, getContext(), false);
        cj8Var.b(PremiumPreviewFragment.s0(this.T1, null), new m67(this, (byte) 26), false);
        this.G2 = new FrameLayout(getContext());
        View view = new View(getContext());
        anb.h(cmb.c7, this.J0, view);
        this.G2.addView(view, qoe.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        gm.T3(view, true, 1.0f, true, false);
        if (z8c.h(this.T1).p() || (this instanceof ok8)) {
            return;
        }
        this.G2.addView(cj8Var, qoe.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        anb.h(cmb.g5, this.J0, this.G2);
        elaVar.addView(this.G2, qoe.e(-1, 68, 80));
    }

    @Override // my0
    public final void W(Canvas canvas) {
        View view = this.w2;
        if (view != null) {
            view.setVisibility(this.C2 ? 4 : 0);
        }
        if (this.v2 == null || !this.C2) {
            return;
        }
        View view2 = this.w2;
        View view3 = view2 == null ? this.m2 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.q2, this.r2};
        this.v2.getMatrix().mapPoints(fArr);
        View view4 = this.v2;
        Drawable rightDrawable = view4 instanceof lka ? ((lka) view4).getRightDrawable() : view4 instanceof rc2 ? ((rc2) view4).Ca : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.A2;
        float f = (-iArr[0]) + this.s2 + fArr[0];
        float f2 = (-iArr[1]) + this.t2 + fArr[1];
        if (gm.O1()) {
            ViewGroup view5 = this.o2.getParentLayout().getView();
            f += view5.getX() + view5.getPaddingLeft();
            f2 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.u2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f3 = measuredHeight / intrinsicWidth;
        float f4 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float R1 = gm.R1(f, measuredWidth, d53.h.getInterpolation(this.B2));
        float R12 = gm.R1(f2, measuredHeight2, this.B2);
        float f5 = this.u2;
        float f6 = this.B2;
        float f7 = (f3 * f6) + ((1.0f - f6) * f5);
        canvas.save();
        canvas.scale(f7, f7, R1, R12);
        int i = (int) R1;
        int i2 = (int) R12;
        rightDrawable.setBounds(aq1.A(2, i, rightDrawable), aq1.y(2, i2, rightDrawable), aq1.w(2, i, rightDrawable), aq1.i(2, i2, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.B2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float R13 = gm.R1(f4, 1.0f, this.B2);
        canvas.scale(R13, R13, R1, R12);
        hg9.m(view3.getMeasuredHeight(), 2.0f, R12, R1 - (view3.getMeasuredWidth() / 2.0f), canvas);
        view3.draw(canvas);
        canvas.restore();
    }

    public void Z0(qmb qmbVar) {
        qmbVar.addView(this.w2, qoe.q(nm7.V1, nm7.V1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int a1() {
        return 0;
    }

    public View c1(Context context, int i) {
        return null;
    }

    public final SpannableStringBuilder d1(String str) {
        Integer num = this.p2;
        return num == null ? gm.M2(str, cmb.t6, this.J0, null, false) : gm.K2(str, num.intValue(), null);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i == nm7.B0 && (inputStickerSet = this.x2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            e1(true);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        nm7.e().k(nm7.k1, 4);
        ValueAnimator valueAnimator = this.D2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        uj4 uj4Var = this.j2;
        if (uj4Var.c) {
            uj4Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(boolean z) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        l66[] l66VarArr = this.J2;
        if (l66VarArr == null || this.K2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.y2;
        byte b = 2;
        byte b2 = 1;
        TLRPC.User user = this.U1;
        byte b3 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.J2[0].setText(gm.N2(jb6.a0(null, null, 2131743904, pg3.t(user), str), -1, 0, new rj8(this, b3), null));
            this.K2.setText(gm.S2(jb6.M0(2131743902, null)));
        } else if (this.x2 != null) {
            CharSequence d1 = d1(jb6.a0(null, null, 2131743901, bw2.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                d1 = gw3.m(d1, this.J2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = d1 instanceof SpannableStringBuilder ? (SpannableStringBuilder) d1 : new SpannableStringBuilder(d1);
            int indexOf = d1.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet n0 = hs6.d0(this.T1).n0(this.x2, false);
                if (n0 == null || n0.documents.isEmpty()) {
                    document = null;
                } else {
                    document = n0.documents.get(0);
                    if (n0.set != null) {
                        int i = 0;
                        while (true) {
                            if (i >= n0.documents.size()) {
                                break;
                            }
                            if (n0.documents.get(i).id == n0.set.thumb_document_id) {
                                document = n0.documents.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new gn(document, this.J2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (n0 != null && n0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) n0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new ta6(gm.L(100.0f), this.J2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new z31(this, (byte) 9), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.J2[1].setOnLinkPressListener(new sj8(this, b3));
                l66[] l66VarArr2 = this.J2;
                if (document == null) {
                    l66VarArr2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                } else if (l66VarArr2 != null) {
                    l66VarArr2[1].setText(spannableStringBuilder2);
                    if (this.J2[1].getVisibility() != 0) {
                        l66[] l66VarArr3 = this.J2;
                        if (z) {
                            l66VarArr3[1].setAlpha(0.0f);
                            this.J2[1].setVisibility(0);
                            ViewPropertyAnimator alpha = this.J2[1].animate().alpha(1.0f);
                            d53 d53Var = d53.f;
                            wi8.t(alpha, d53Var, 200L);
                            this.J2[0].animate().alpha(0.0f).setInterpolator(d53Var).setDuration(200L).withEndAction(new rj8(this, b)).start();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new uj8(this, b2));
                            ofFloat.setInterpolator(d53Var);
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                        } else {
                            l66VarArr3[1].setAlpha(1.0f);
                            this.J2[1].setVisibility(0);
                            this.J2[0].setAlpha(0.0f);
                            this.J2[0].setVisibility(8);
                        }
                    }
                }
            }
            this.K2.setText(gm.S2(jb6.M0(2131743902, null)));
        } else if (this.z2) {
            l66VarArr[0].setText(gm.S2(jb6.a0(null, null, 2131743903, bw2.m(0, user.first_name, user.last_name))));
            this.K2.setText(gm.S2(jb6.a0(null, null, 2131743902, bw2.m(0, user.first_name, user.last_name))));
        } else {
            nw4 nw4Var = this.V1;
            if (nw4Var == null) {
                TL_stars.StarGift starGift = this.W1;
                if (starGift != null) {
                    l66VarArr[0].setText(jb6.M0(2131750001, null));
                    this.J2[0].setTextSize(1, 20.0f);
                    boolean z2 = starGift.limited_per_user;
                    l66 l66Var = this.K2;
                    if (z2) {
                        l66Var.setText(gm.S2(jb6.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        l66Var.setText(gm.S2(jb6.M0(2131750005, null)));
                    }
                    this.K2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    l66VarArr[0].setText(jb6.M0(2131743916, null));
                    this.K2.setText(gm.S2(jb6.M0(2131743914, null)));
                } else {
                    l66VarArr[0].setText(d1(jb6.a0(null, null, 2131743910, bw2.m(0, user.first_name, user.last_name))));
                    this.K2.setText(gm.S2(jb6.M0(2131743911, null)));
                }
            } else if (this.X1) {
                l66VarArr[0].setText(d1(jb6.a0(null, null, 2131743905, user != null ? user.first_name : "", jb6.G(nw4Var.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(d1(jb6.a0(null, null, 2131743906, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.J2[0].setText(d1(jb6.a0(null, null, 2131743907, jb6.G(nw4Var.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(gm.S2(jb6.M0(2131743909, null)));
            } else {
                this.J2[0].setText(d1(jb6.a0(null, null, 2131743908, user.first_name, jb6.G(nw4Var.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(gm.S2(jb6.M0(2131743909, null)));
            }
        }
        try {
            l66 l66Var2 = this.J2[0];
            l66Var2.setText(gw3.m(l66Var2.getText(), this.J2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void f1() {
        int i = this.a2;
        int i2 = i + 1;
        this.a2 = i2;
        this.b2 = i;
        this.e2 = i2;
        int size = this.S1.size() + i2;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
        if (z8c.h(this.T1).p() || this.V1 != null) {
            return;
        }
        int i3 = this.a2;
        this.a2 = i3 + 1;
        this.h2 = i3;
    }

    @Override // my0
    public final boolean j0() {
        Drawable drawable;
        byte b = 0;
        if (this.v2 == null) {
            return false;
        }
        byte b2 = 2;
        this.D2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B2 = 0.0f;
        this.C2 = true;
        this.n2.invalidate();
        View view = this.v2;
        if (view instanceof lka) {
            drawable = ((lka) view).getRightDrawable();
        } else if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            tm tmVar = rc2Var.Ca;
            rc2Var.r2();
            drawable = tmVar;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.v2;
        if (view2 instanceof rc2) {
            ((rc2) view2).r2();
        } else {
            view2.invalidate();
        }
        w94 w94Var = this.m2;
        if (w94Var != null) {
            w94Var.m(100L);
        }
        this.D2.addUpdateListener(new uj8(this, b));
        this.D2.addListener(new ic8(this, drawable, b2));
        this.D2.setDuration(600L);
        this.D2.setInterpolator(d53.h);
        this.D2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(z8c.t0).b(this, nm7.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(z8c.t0).n(this, nm7.B0);
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        byte b = 1;
        nm7.e().k(nm7.j1, 4);
        if (this.E2) {
            gm.d3(new rj8(this, b), 200L);
        }
    }

    @Override // my0, ah0
    public final boolean t(Dialog dialog) {
        w94 w94Var = this.m2;
        if (w94Var != null) {
            w94Var.setDialogVisible(true);
        }
        this.l2.setPaused(true);
        dialog.setOnDismissListener(new qj8(this, (byte) 0));
        dialog.show();
        return true;
    }

    public void b1(View view) {
    }

    public void Y0(int i, View view) {
    }

    public yj8(d dVar, int i, TLRPC.User user, ylb ylbVar) {
        this(dVar, i, user, null, null, ylbVar);
    }
}
