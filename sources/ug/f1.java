package ug;

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
import bi.eb;
import bi.k5;
import bi.qd;
import bi.w4;
import c8.ha;
import fi.ka;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c61;
import org.telegram.ui.is0;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class f1 extends na implements ls {
    public ValueAnimator A2;
    public boolean B2;
    public boolean C2;
    public FrameLayout D2;
    public final FrameLayout E2;
    public FrameLayout F2;
    public w70[] G2;
    public w70 H2;
    public final ArrayList P1;
    public int Q1;
    public final TLRPC.User R1;
    public final j S1;
    public final TL_stars.StarGift T1;
    public boolean U1;
    public final is0 V1;
    public int W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public final kz g2;
    public final y0 h2;
    public hi.e i2;
    public qd j2;
    public c61 k2;
    public final f2 l2;
    public Integer m2;
    public float n2;
    public float o2;
    public float p2;
    public float q2;
    public float r2;
    public View s2;
    public View t2;
    public TLRPC.InputStickerSet u2;
    public TLRPC.TL_emojiStatusCollectible v2;
    public boolean w2;
    public final int[] x2;
    public float y2;
    public boolean z2;

    public f1(f2 f2Var, int i7, TLRPC.User user, f6 f6Var) {
        this(f2Var, i7, user, null, null, f6Var);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        return new k5(this, 11);
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return id.M0(2131744234, null);
    }

    @Override // org.telegram.ui.Components.na
    public final void S0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.P1;
            if (i11 >= arrayList.size()) {
                this.W1 = i12;
                this.c.getLocationOnScreen(this.x2);
                return;
            }
            vs0 vs0Var = (vs0) arrayList.get(i11);
            is0 is0Var = this.V1;
            is0Var.a(vs0Var, false);
            is0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((vs0) arrayList.get(i11)).e = i12;
            i12 += is0Var.getMeasuredHeight();
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.na
    public final void U0(rt0 rt0Var) {
        this.Q1 = p10.s0;
        p0 p0Var = new p0(getContext(), this.I0, false);
        p0Var.b(PremiumPreviewFragment.t0(this.Q1, null), new ii.g(this, 26), false);
        this.D2 = new FrameLayout(getContext());
        View view = new View(getContext());
        r6.i(k6.d7, view, this.I0);
        this.D2.addView(view, ha.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Z3(view, true, 1.0f, true, false);
        if (p10.i(this.Q1).q() || (this instanceof wg.j0)) {
            return;
        }
        this.D2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.h5, this.D2, this.I0);
        rt0Var.addView(this.D2, ha.e(-1, 68, 80));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void Z(Canvas canvas) {
        View view = this.t2;
        if (view != null) {
            view.setVisibility(this.z2 ? 4 : 0);
        }
        if (this.s2 == null || !this.z2) {
            return;
        }
        View view2 = this.t2;
        View view3 = view2 == null ? this.j2 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.n2, this.o2};
        this.s2.getMatrix().mapPoints(fArr);
        View view4 = this.s2;
        Drawable rightDrawable = view4 instanceof org.telegram.ui.ActionBar.k5 ? ((org.telegram.ui.ActionBar.k5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).pa : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.x2;
        float f10 = (-iArr[0]) + this.p2 + fArr[0];
        float f11 = (-iArr[1]) + this.q2 + fArr[1];
        if (org.telegram.messenger.g0.Q1()) {
            ViewGroup view5 = this.l2.getParentLayout().getView();
            f10 += view5.getX() + view5.getPaddingLeft();
            f11 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.r2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f12 = measuredHeight / intrinsicWidth;
        float f13 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, xq.h.getInterpolation(this.y2));
        float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.y2);
        float f14 = this.r2;
        float f15 = this.y2;
        float f16 = (f12 * f15) + ((1.0f - f15) * f14);
        canvas.save();
        canvas.scale(f16, f16, T1, T12);
        int i7 = (int) T1;
        int i10 = (int) T12;
        rightDrawable.setBounds(org.telegram.ui.Cells.f1.z(2, i7, rightDrawable), org.telegram.ui.Cells.f1.y(2, i10, rightDrawable), org.telegram.ui.Cells.f1.w(2, i7, rightDrawable), org.telegram.ui.Cells.f1.f(2, i10, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.y2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.y2);
        canvas.scale(T13, T13, T1, T12);
        canvas.translate(T1 - (view3.getMeasuredWidth() / 2.0f), T12 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == qs.B0 && (inputStickerSet = this.u2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        qs.e().k(qs.k1, 4);
        ValueAnimator valueAnimator = this.A2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kz kzVar = this.g2;
        if (kzVar.c) {
            kzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(c61 c61Var) {
        c61Var.addView(this.t2, ha.q(qs.W1, qs.W1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.m2;
        return num == null ? org.telegram.messenger.g0.Q2(str, k6.u6, this.I0, null, false) : org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z9) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        w70[] w70VarArr = this.G2;
        if (w70VarArr == null || this.H2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.v2;
        int i7 = 2;
        int i10 = 1;
        TLRPC.User user = this.R1;
        int i11 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.G2[0].setText(org.telegram.messenger.g0.U2(id.a0(null, null, 2131744222, m5.u(user), str), new a1(this, i11)));
            this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131744220, null)));
        } else if (this.u2 != null) {
            CharSequence i12 = i1(id.a0(null, null, 2131744219, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                i12 = i6.m(i12, this.G2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = i12 instanceof SpannableStringBuilder ? (SpannableStringBuilder) i12 : new SpannableStringBuilder(i12);
            int indexOf = i12.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet m0 = ui.b0(this.Q1).m0(this.u2, false);
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
                    spannableStringBuilder.setSpan(new r5(document, this.G2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (m0 != null && m0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) m0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(100.0f), this.G2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new ka(this, 11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.G2[1].setOnLinkPressListener(new v70() { // from class: ug.b1
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        ArrayList arrayList = new ArrayList();
                        f1 f1Var = f1.this;
                        arrayList.add(f1Var.u2);
                        w4 w4Var = new w4(f1Var, 11);
                        f2 f2Var = f1Var.l2;
                        if (f2Var != null) {
                            w4Var.setParentFragment(f2Var);
                        }
                        new d1(f1Var, w4Var, f1Var.getContext(), f1Var.I0, arrayList).show();
                    }
                });
                if (document != null) {
                    w70[] w70VarArr2 = this.G2;
                    if (w70VarArr2 != null) {
                        w70VarArr2[1].setText(spannableStringBuilder2);
                        if (this.G2[1].getVisibility() != 0) {
                            if (z9) {
                                this.G2[1].setAlpha(0.0f);
                                this.G2[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.G2[1].animate().alpha(1.0f);
                                xq xqVar = xq.f;
                                org.telegram.messenger.camera.q.l(alpha, xqVar, 200L);
                                this.G2[0].animate().alpha(0.0f).setInterpolator(xqVar).setDuration(200L).withEndAction(new a1(this, i7)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new c1(this, i10));
                                ofFloat.setInterpolator(xqVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.G2[1].setAlpha(1.0f);
                                this.G2[1].setVisibility(0);
                                this.G2[0].setAlpha(0.0f);
                                this.G2[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.G2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131744220, null)));
        } else if (this.w2) {
            w70VarArr[0].setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131744221, g5.m(0, user.first_name, user.last_name))));
            this.H2.setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131744220, g5.m(0, user.first_name, user.last_name))));
        } else {
            j jVar = this.S1;
            if (jVar == null) {
                TL_stars.StarGift starGift = this.T1;
                if (starGift != null) {
                    w70VarArr[0].setText(id.M0(2131750069, null));
                    this.G2[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.H2.setText(org.telegram.messenger.g0.X2(id.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131750073, null)));
                    }
                    this.H2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    w70VarArr[0].setText(id.M0(2131744234, null));
                    this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131744232, null)));
                } else {
                    w70VarArr[0].setText(i1(id.a0(null, null, 2131744228, g5.m(0, user.first_name, user.last_name))));
                    this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131744229, null)));
                }
            } else if (this.U1) {
                w70VarArr[0].setText(i1(id.a0(null, null, 2131744223, user != null ? user.first_name : "", id.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.H2.setText(i1(id.a0(null, null, 2131744224, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.G2[0].setText(i1(id.a0(null, null, 2131744225, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131744227, null)));
            } else {
                this.G2[0].setText(i1(id.a0(null, null, 2131744226, user.first_name, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.H2.setText(org.telegram.messenger.g0.X2(id.M0(2131744227, null)));
            }
        }
        try {
            w70 w70Var = this.G2[0];
            w70Var.setText(i6.m(w70Var.getText(), this.G2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void k1() {
        int i7 = this.X1;
        int i10 = i7 + 1;
        this.X1 = i10;
        this.Y1 = i7;
        this.b2 = i10;
        int size = this.P1.size() + i10;
        this.c2 = size;
        this.X1 = size + 1;
        this.d2 = size;
        if (p10.i(this.Q1).q() || this.S1 != null) {
            return;
        }
        int i11 = this.X1;
        this.X1 = i11 + 1;
        this.e2 = i11;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean m0() {
        Drawable drawable;
        int i7 = 0;
        if (this.s2 == null) {
            return false;
        }
        this.A2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.y2 = 0.0f;
        this.z2 = true;
        this.k2.invalidate();
        View view = this.s2;
        if (view instanceof org.telegram.ui.ActionBar.k5) {
            drawable = ((org.telegram.ui.ActionBar.k5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.ui.Components.g5 g5Var = q1Var.pa;
            q1Var.p2();
            drawable = g5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.s2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).p2();
        } else {
            view2.invalidate();
        }
        qd qdVar = this.j2;
        if (qdVar != null) {
            qdVar.m(100L);
        }
        this.A2.addUpdateListener(new c1(this, i7));
        this.A2.addListener(new v50(23, this, drawable));
        this.A2.setDuration(600L);
        this.A2.setInterpolator(xq.h);
        this.A2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(p10.s0).c(this, qs.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(p10.s0).n(this, qs.B0);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        int i7 = 1;
        qs.e().k(qs.j1, 4);
        if (this.B2) {
            org.telegram.messenger.g0.i3(new a1(this, i7), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, org.telegram.ui.ActionBar.b2
    public final boolean t(Dialog dialog) {
        qd qdVar = this.j2;
        if (qdVar != null) {
            qdVar.setDialogVisible(true);
        }
        this.i2.setPaused(true);
        dialog.setOnDismissListener(new eb(this, 14));
        dialog.show();
        return true;
    }

    public f1(f2 f2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, f6 f6Var) {
        super(f2Var, false, false, f6Var);
        ArrayList arrayList = new ArrayList();
        this.P1 = arrayList;
        this.x2 = new int[2];
        this.y2 = 0.0f;
        N();
        this.l2 = f2Var;
        this.r1 = 0.26f;
        this.R1 = user;
        this.Q1 = i7;
        this.S1 = jVar;
        this.T1 = starGift;
        this.V1 = new is0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || p10.i(i7).q()) {
            this.D2.setVisibility(8);
        }
        y0 y0Var = new y0(k6.zk, k6.Ak, k6.Bk, k6.Ck, null);
        this.h2 = y0Var;
        y0Var.m = true;
        y0Var.o = 1.0f;
        y0Var.p = 0.0f;
        y0Var.q = 0.0f;
        y0Var.b = 0.0f;
        y0Var.c = 0.0f;
        k1();
        this.k1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.k1.setOnItemClickListener(new hl0(this, i7, f2Var, 1));
        ui.b0(i7).o1();
        PremiumPreviewFragment.w0("profile");
        kz kzVar = new kz(getContext());
        this.g2 = kzVar;
        this.c.addView(kzVar, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.E2 = frameLayout;
        this.b.addView(frameLayout, ha.e(-1, qs.W1, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i7, View view) {
    }
}
