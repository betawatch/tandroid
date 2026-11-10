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
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.e61;
import org.telegram.ui.ls0;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class f1 extends ma implements ls {
    public final int[] A2;
    public float B2;
    public boolean C2;
    public ValueAnimator D2;
    public boolean E2;
    public boolean F2;
    public FrameLayout G2;
    public final FrameLayout H2;
    public FrameLayout I2;
    public w70[] J2;
    public w70 K2;
    public final ArrayList S1;
    public int T1;
    public final TLRPC.User U1;
    public final j V1;
    public final TL_stars.StarGift W1;
    public boolean X1;
    public final ls0 Y1;
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
    public final jz j2;
    public final y0 k2;
    public hi.e l2;
    public qd m2;
    public e61 n2;
    public final f2 o2;
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

    public f1(f2 f2Var, int i7, TLRPC.User user, h6 h6Var) {
        this(f2Var, i7, user, null, null, h6Var);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        return new k5(this, 11);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(2131744231, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void S0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.S1;
            if (i11 >= arrayList.size()) {
                this.Z1 = i12;
                this.c.getLocationOnScreen(this.A2);
                return;
            }
            ys0 ys0Var = (ys0) arrayList.get(i11);
            ls0 ls0Var = this.Y1;
            ls0Var.a(ys0Var, false);
            ls0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((ys0) arrayList.get(i11)).e = i12;
            i12 += ls0Var.getMeasuredHeight();
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(st0 st0Var) {
        this.T1 = p10.s0;
        p0 p0Var = new p0(getContext(), this.I0, false);
        p0Var.b(PremiumPreviewFragment.t0(this.T1, null), new ii.g(this, 26), false);
        this.G2 = new FrameLayout(getContext());
        View view = new View(getContext());
        t6.h(m6.d7, view, this.I0);
        this.G2.addView(view, ha.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Z3(view, true, 1.0f, true, false);
        if (p10.i(this.T1).q() || (this instanceof wg.j0)) {
            return;
        }
        this.G2.addView(p0Var, ha.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        t6.h(m6.h5, this.G2, this.I0);
        st0Var.addView(this.G2, ha.e(-1, 68, 80));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void Z(Canvas canvas) {
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
        Drawable rightDrawable = view4 instanceof m5 ? ((m5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).pa : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.A2;
        float f10 = (-iArr[0]) + this.s2 + fArr[0];
        float f11 = (-iArr[1]) + this.t2 + fArr[1];
        if (org.telegram.messenger.g0.Q1()) {
            ViewGroup view5 = this.o2.getParentLayout().getView();
            f10 += view5.getX() + view5.getPaddingLeft();
            f11 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.u2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f12 = measuredHeight / intrinsicWidth;
        float f13 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, wq.h.getInterpolation(this.B2));
        float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.B2);
        float f14 = this.u2;
        float f15 = this.B2;
        float f16 = (f12 * f15) + ((1.0f - f15) * f14);
        canvas.save();
        canvas.scale(f16, f16, T1, T12);
        int i7 = (int) T1;
        int i10 = (int) T12;
        rightDrawable.setBounds(org.telegram.ui.Cells.f1.z(2, i7, rightDrawable), org.telegram.ui.Cells.f1.y(2, i10, rightDrawable), org.telegram.ui.Cells.f1.w(2, i7, rightDrawable), org.telegram.ui.Cells.f1.f(2, i10, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.B2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.B2);
        canvas.scale(T13, T13, T1, T12);
        canvas.translate(T1 - (view3.getMeasuredWidth() / 2.0f), T12 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == qs.B0 && (inputStickerSet = this.x2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        qs.e().k(qs.k1, 4);
        ValueAnimator valueAnimator = this.D2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        jz jzVar = this.j2;
        if (jzVar.c) {
            jzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(e61 e61Var) {
        e61Var.addView(this.w2, ha.q(qs.W1, qs.W1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.p2;
        return num == null ? org.telegram.messenger.g0.Q2(str, m6.u6, this.I0, null, false) : org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z9) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        w70[] w70VarArr = this.J2;
        if (w70VarArr == null || this.K2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.y2;
        int i7 = 2;
        int i10 = 1;
        TLRPC.User user = this.U1;
        int i11 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.J2[0].setText(org.telegram.messenger.g0.U2(id.a0(null, null, 2131744219, org.telegram.messenger.m5.u(user), str), new a1(this, i11)));
            this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744217, null)));
        } else if (this.x2 != null) {
            CharSequence i12 = i1(id.a0(null, null, 2131744216, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                i12 = i6.m(i12, this.J2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = i12 instanceof SpannableStringBuilder ? (SpannableStringBuilder) i12 : new SpannableStringBuilder(i12);
            int indexOf = i12.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet m0 = ui.b0(this.T1).m0(this.x2, false);
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
                    spannableStringBuilder.setSpan(new q5(document, this.J2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (m0 != null && m0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) m0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(100.0f), this.J2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new ka(this, 11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.J2[1].setOnLinkPressListener(new v70() { // from class: ug.b1
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        ArrayList arrayList = new ArrayList();
                        f1 f1Var = f1.this;
                        arrayList.add(f1Var.x2);
                        w4 w4Var = new w4(f1Var, 11);
                        f2 f2Var = f1Var.o2;
                        if (f2Var != null) {
                            w4Var.setParentFragment(f2Var);
                        }
                        new d1(f1Var, w4Var, f1Var.getContext(), f1Var.I0, arrayList).show();
                    }
                });
                if (document != null) {
                    w70[] w70VarArr2 = this.J2;
                    if (w70VarArr2 != null) {
                        w70VarArr2[1].setText(spannableStringBuilder2);
                        if (this.J2[1].getVisibility() != 0) {
                            if (z9) {
                                this.J2[1].setAlpha(0.0f);
                                this.J2[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.J2[1].animate().alpha(1.0f);
                                wq wqVar = wq.f;
                                org.telegram.messenger.camera.q.l(alpha, wqVar, 200L);
                                this.J2[0].animate().alpha(0.0f).setInterpolator(wqVar).setDuration(200L).withEndAction(new a1(this, i7)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new c1(this, i10));
                                ofFloat.setInterpolator(wqVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.J2[1].setAlpha(1.0f);
                                this.J2[1].setVisibility(0);
                                this.J2[0].setAlpha(0.0f);
                                this.J2[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.J2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744217, null)));
        } else if (this.z2) {
            w70VarArr[0].setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131744218, g5.m(0, user.first_name, user.last_name))));
            this.K2.setText(org.telegram.messenger.g0.X2(id.a0(null, null, 2131744217, g5.m(0, user.first_name, user.last_name))));
        } else {
            j jVar = this.V1;
            if (jVar == null) {
                TL_stars.StarGift starGift = this.W1;
                if (starGift != null) {
                    w70VarArr[0].setText(id.M0(2131750068, null));
                    this.J2[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.K2.setText(org.telegram.messenger.g0.X2(id.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131750072, null)));
                    }
                    this.K2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    w70VarArr[0].setText(id.M0(2131744231, null));
                    this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744229, null)));
                } else {
                    w70VarArr[0].setText(i1(id.a0(null, null, 2131744225, g5.m(0, user.first_name, user.last_name))));
                    this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744226, null)));
                }
            } else if (this.X1) {
                w70VarArr[0].setText(i1(id.a0(null, null, 2131744220, user != null ? user.first_name : "", id.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(i1(id.a0(null, null, 2131744221, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.J2[0].setText(i1(id.a0(null, null, 2131744222, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744224, null)));
            } else {
                this.J2[0].setText(i1(id.a0(null, null, 2131744223, user.first_name, id.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(org.telegram.messenger.g0.X2(id.M0(2131744224, null)));
            }
        }
        try {
            w70 w70Var = this.J2[0];
            w70Var.setText(i6.m(w70Var.getText(), this.J2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void k1() {
        int i7 = this.a2;
        int i10 = i7 + 1;
        this.a2 = i10;
        this.b2 = i7;
        this.e2 = i10;
        int size = this.S1.size() + i10;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
        if (p10.i(this.T1).q() || this.V1 != null) {
            return;
        }
        int i11 = this.a2;
        this.a2 = i11 + 1;
        this.h2 = i11;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean m0() {
        Drawable drawable;
        int i7 = 0;
        if (this.v2 == null) {
            return false;
        }
        this.D2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B2 = 0.0f;
        this.C2 = true;
        this.n2.invalidate();
        View view = this.v2;
        if (view instanceof m5) {
            drawable = ((m5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            f5 f5Var = q1Var.pa;
            q1Var.p2();
            drawable = f5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.v2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).p2();
        } else {
            view2.invalidate();
        }
        qd qdVar = this.m2;
        if (qdVar != null) {
            qdVar.m(100L);
        }
        this.D2.addUpdateListener(new c1(this, i7));
        this.D2.addListener(new v50(23, this, drawable));
        this.D2.setDuration(600L);
        this.D2.setInterpolator(wq.h);
        this.D2.start();
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

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        int i7 = 1;
        qs.e().k(qs.j1, 4);
        if (this.E2) {
            org.telegram.messenger.g0.i3(new a1(this, i7), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.b2
    public final boolean t(Dialog dialog) {
        qd qdVar = this.m2;
        if (qdVar != null) {
            qdVar.setDialogVisible(true);
        }
        this.l2.setPaused(true);
        dialog.setOnDismissListener(new eb(this, 14));
        dialog.show();
        return true;
    }

    public f1(f2 f2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, h6 h6Var) {
        super(f2Var, false, false, h6Var);
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        this.A2 = new int[2];
        this.B2 = 0.0f;
        N();
        this.o2 = f2Var;
        this.u1 = 0.26f;
        this.U1 = user;
        this.T1 = i7;
        this.V1 = jVar;
        this.W1 = starGift;
        this.Y1 = new ls0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || p10.i(i7).q()) {
            this.G2.setVisibility(8);
        }
        y0 y0Var = new y0(m6.zk, m6.Ak, m6.Bk, m6.Ck, null);
        this.k2 = y0Var;
        y0Var.m = true;
        y0Var.o = 1.0f;
        y0Var.p = 0.0f;
        y0Var.q = 0.0f;
        y0Var.b = 0.0f;
        y0Var.c = 0.0f;
        k1();
        this.n1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.n1.setOnItemClickListener(new hl0(this, i7, f2Var, 1));
        ui.b0(i7).o1();
        PremiumPreviewFragment.w0("profile");
        jz jzVar = new jz(getContext());
        this.j2 = jzVar;
        this.c.addView(jzVar, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.H2 = frameLayout;
        this.b.addView(frameLayout, ha.e(-1, qs.W1, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i7, View view) {
    }
}
