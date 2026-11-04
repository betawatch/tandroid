package vg;

import ai.c7;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import ci.ic;
import ci.r4;
import gi.ka;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ls0;
import org.telegram.ui.s51;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class h1 extends ma implements cs {
    public boolean A2;
    public ValueAnimator B2;
    public boolean C2;
    public boolean D2;
    public FrameLayout E2;
    public final FrameLayout F2;
    public FrameLayout G2;
    public s70[] H2;
    public s70 I2;
    public final ArrayList Q1;
    public int R1;
    public final TLRPC.User S1;
    public final j T1;
    public final TL_stars.StarGift U1;
    public boolean V1;
    public final yr0 W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public final gz h2;
    public final x0 i2;
    public ii.f j2;
    public ic k2;
    public s51 l2;
    public final d2 m2;
    public Integer n2;
    public float o2;
    public float p2;
    public float q2;
    public float r2;
    public float s2;
    public View t2;
    public View u2;
    public TLRPC.InputStickerSet v2;
    public TLRPC.TL_emojiStatusCollectible w2;
    public boolean x2;
    public final int[] y2;
    public float z2;

    public h1(d2 d2Var, int i3, TLRPC.User user, e6 e6Var) {
        this(d2Var, i3, user, null, null, e6Var);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        return new r4(this, 10);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131744241, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void S0(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.Q1;
            if (i11 >= arrayList.size()) {
                this.X1 = i12;
                this.c.getLocationOnScreen(this.y2);
                return;
            }
            ls0 ls0Var = (ls0) arrayList.get(i11);
            yr0 yr0Var = this.W1;
            yr0Var.a(ls0Var, false);
            yr0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((ls0) arrayList.get(i11)).e = i12;
            i12 += yr0Var.getMeasuredHeight();
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(qt0 qt0Var) {
        this.R1 = h10.t0;
        o0 o0Var = new o0(getContext(), this.J0, false);
        o0Var.b(PremiumPreviewFragment.t0(this.R1, null), new b1(this, 0), false);
        this.E2 = new FrameLayout(getContext());
        View view = new View(getContext());
        r6.i(k6.d7, view, this.J0);
        this.E2.addView(view, mf.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Z3(view, true, 1.0f, true, false);
        if (h10.i(this.R1).q() || (this instanceof xg.j0)) {
            return;
        }
        this.E2.addView(o0Var, mf.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.h5, this.E2, this.J0);
        qt0Var.addView(this.E2, mf.e(-1, 68, 80));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void Z(Canvas canvas) {
        View view = this.u2;
        if (view != null) {
            view.setVisibility(this.A2 ? 4 : 0);
        }
        if (this.t2 == null || !this.A2) {
            return;
        }
        View view2 = this.u2;
        View view3 = view2 == null ? this.k2 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.o2, this.p2};
        this.t2.getMatrix().mapPoints(fArr);
        View view4 = this.t2;
        Drawable rightDrawable = view4 instanceof k5 ? ((k5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).pa : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.y2;
        float f10 = (-iArr[0]) + this.q2 + fArr[0];
        float f11 = (-iArr[1]) + this.r2 + fArr[1];
        if (org.telegram.messenger.g0.Q1()) {
            ViewGroup view5 = this.m2.getParentLayout().getView();
            f10 += view5.getX() + view5.getPaddingLeft();
            f11 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.s2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f12 = measuredHeight / intrinsicWidth;
        float f13 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, xq.h.getInterpolation(this.z2));
        float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.z2);
        float f14 = this.s2;
        float f15 = this.z2;
        float f16 = (f12 * f15) + ((1.0f - f15) * f14);
        canvas.save();
        canvas.scale(f16, f16, T1, T12);
        int i3 = (int) T1;
        int i10 = (int) T12;
        rightDrawable.setBounds(org.telegram.ui.Cells.f1.C(2, i3, rightDrawable), org.telegram.ui.Cells.f1.B(2, i10, rightDrawable), org.telegram.ui.Cells.f1.z(2, i3, rightDrawable), org.telegram.ui.Cells.f1.i(2, i10, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.z2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.z2);
        canvas.scale(T13, T13, T1, T12);
        canvas.translate(T1 - (view3.getMeasuredWidth() / 2.0f), T12 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i3 == hs.B0 && (inputStickerSet = this.v2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        hs.e().k(hs.k1, 4);
        ValueAnimator valueAnimator = this.B2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gz gzVar = this.h2;
        if (gzVar.c) {
            gzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(s51 s51Var) {
        s51Var.addView(this.u2, mf.q(hs.W1, hs.W1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i3) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.n2;
        return num == null ? org.telegram.messenger.g0.Q2(str, k6.u6, this.J0, null, false) : org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        s70[] s70VarArr = this.H2;
        if (s70VarArr == null || this.I2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.w2;
        int i3 = 2;
        int i10 = 1;
        TLRPC.User user = this.S1;
        int i11 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.H2[0].setText(org.telegram.messenger.g0.U2(bd.a0(null, null, 2131744229, m5.u(user), str), new z0(this, i11)));
            this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744227, null)));
        } else if (this.v2 != null) {
            CharSequence i12 = i1(bd.a0(null, null, 2131744226, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                i12 = i6.m(i12, this.H2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = i12 instanceof SpannableStringBuilder ? (SpannableStringBuilder) i12 : new SpannableStringBuilder(i12);
            int indexOf = i12.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet m0 = li.b0(this.R1).m0(this.v2, false);
                if (m0 == null || m0.documents.isEmpty()) {
                    document = null;
                } else {
                    document = m0.documents.get(0);
                    if (m0.set != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= m0.documents.size()) {
                                break;
                            }
                            if (m0.documents.get(i13).id == m0.set.thumb_document_id) {
                                document = m0.documents.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new p5(document, this.H2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (m0 != null && m0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) m0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(100.0f), this.H2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new ka(this, 11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.H2[1].setOnLinkPressListener(new r70() { // from class: vg.a1
                    @Override // org.telegram.ui.Components.r70
                    public final void a(ClickableSpan clickableSpan) {
                        ArrayList arrayList = new ArrayList();
                        h1 h1Var = h1.this;
                        arrayList.add(h1Var.v2);
                        c7 c7Var = new c7(h1Var, 12);
                        d2 d2Var = h1Var.m2;
                        if (d2Var != null) {
                            c7Var.setParentFragment(d2Var);
                        }
                        new d1(h1Var, c7Var, h1Var.getContext(), h1Var.J0, arrayList).show();
                    }
                });
                if (document != null) {
                    s70[] s70VarArr2 = this.H2;
                    if (s70VarArr2 != null) {
                        s70VarArr2[1].setText(spannableStringBuilder2);
                        if (this.H2[1].getVisibility() != 0) {
                            if (z10) {
                                this.H2[1].setAlpha(0.0f);
                                this.H2[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.H2[1].animate().alpha(1.0f);
                                xq xqVar = xq.f;
                                org.telegram.messenger.camera.q.l(alpha, xqVar, 200L);
                                this.H2[0].animate().alpha(0.0f).setInterpolator(xqVar).setDuration(200L).withEndAction(new z0(this, i3)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new c1(this, i10));
                                ofFloat.setInterpolator(xqVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.H2[1].setAlpha(1.0f);
                                this.H2[1].setVisibility(0);
                                this.H2[0].setAlpha(0.0f);
                                this.H2[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.H2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744227, null)));
        } else if (this.x2) {
            s70VarArr[0].setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744228, g5.m(0, user.first_name, user.last_name))));
            this.I2.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744227, g5.m(0, user.first_name, user.last_name))));
        } else {
            j jVar = this.T1;
            if (jVar == null) {
                TL_stars.StarGift starGift = this.U1;
                if (starGift != null) {
                    s70VarArr[0].setText(bd.M0(2131750076, null));
                    this.H2[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.I2.setText(org.telegram.messenger.g0.X2(bd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131750080, null)));
                    }
                    this.I2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    s70VarArr[0].setText(bd.M0(2131744241, null));
                    this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744239, null)));
                } else {
                    s70VarArr[0].setText(i1(bd.a0(null, null, 2131744235, g5.m(0, user.first_name, user.last_name))));
                    this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744236, null)));
                }
            } else if (this.V1) {
                s70VarArr[0].setText(i1(bd.a0(null, null, 2131744230, user != null ? user.first_name : "", bd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.I2.setText(i1(bd.a0(null, null, 2131744231, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.H2[0].setText(i1(bd.a0(null, null, 2131744232, bd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744234, null)));
            } else {
                this.H2[0].setText(i1(bd.a0(null, null, 2131744233, user.first_name, bd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744234, null)));
            }
        }
        try {
            s70 s70Var = this.H2[0];
            s70Var.setText(i6.m(s70Var.getText(), this.H2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void k1() {
        int i3 = this.Y1;
        int i10 = i3 + 1;
        this.Y1 = i10;
        this.Z1 = i3;
        this.c2 = i10;
        int size = this.Q1.size() + i10;
        this.d2 = size;
        this.Y1 = size + 1;
        this.e2 = size;
        if (h10.i(this.R1).q() || this.T1 != null) {
            return;
        }
        int i11 = this.Y1;
        this.Y1 = i11 + 1;
        this.f2 = i11;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean m0() {
        Drawable drawable;
        int i3 = 0;
        if (this.t2 == null) {
            return false;
        }
        this.B2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z2 = 0.0f;
        this.A2 = true;
        this.l2.invalidate();
        View view = this.t2;
        if (view instanceof k5) {
            drawable = ((k5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            e5 e5Var = q1Var.pa;
            q1Var.p2();
            drawable = e5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.t2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).p2();
        } else {
            view2.invalidate();
        }
        ic icVar = this.k2;
        if (icVar != null) {
            icVar.m(100L);
        }
        this.B2.addUpdateListener(new c1(this, i3));
        this.B2.addListener(new ri0(22, this, drawable));
        this.B2.setDuration(600L);
        this.B2.setInterpolator(xq.h);
        this.B2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(h10.t0).c(this, hs.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(h10.t0).n(this, hs.B0);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        int i3 = 1;
        hs.e().k(hs.j1, 4);
        if (this.C2) {
            org.telegram.messenger.g0.i3(new z0(this, i3), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, org.telegram.ui.ActionBar.z1
    public final boolean t(Dialog dialog) {
        ic icVar = this.k2;
        if (icVar != null) {
            icVar.setDialogVisible(true);
        }
        this.j2.setPaused(true);
        dialog.setOnDismissListener(new ba(this, 14));
        dialog.show();
        return true;
    }

    public h1(d2 d2Var, int i3, TLRPC.User user, j jVar, TL_stars.StarGift starGift, e6 e6Var) {
        super(d2Var, false, false, e6Var);
        ArrayList arrayList = new ArrayList();
        this.Q1 = arrayList;
        this.y2 = new int[2];
        this.z2 = 0.0f;
        N();
        this.m2 = d2Var;
        this.s1 = 0.26f;
        this.S1 = user;
        this.R1 = i3;
        this.T1 = jVar;
        this.U1 = starGift;
        this.W1 = new yr0(getContext(), null);
        PremiumPreviewFragment.s0(i3, arrayList);
        if (jVar != null || h10.i(i3).q()) {
            this.E2.setVisibility(8);
        }
        x0 x0Var = new x0(k6.zk, k6.Ak, k6.Bk, k6.Ck, null);
        this.i2 = x0Var;
        x0Var.m = true;
        x0Var.o = 1.0f;
        x0Var.p = 0.0f;
        x0Var.q = 0.0f;
        x0Var.b = 0.0f;
        x0Var.c = 0.0f;
        k1();
        this.l1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.l1.setOnItemClickListener(new ll0(this, i3, d2Var, 1));
        li.b0(i3).o1();
        PremiumPreviewFragment.w0("profile");
        gz gzVar = new gz(getContext());
        this.h2 = gzVar;
        this.c.addView(gzVar, mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.F2 = frameLayout;
        this.b.addView(frameLayout, mf.e(-1, hs.W1, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i3, View view) {
    }
}
