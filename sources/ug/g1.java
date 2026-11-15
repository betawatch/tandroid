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
import bi.t6;
import di.i4;
import di.q9;
import di.xb;
import hi.ha;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fs0;
import org.telegram.ui.ss0;
import org.telegram.ui.z51;
import tg.h2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class g1 extends ja implements is {
    public boolean A2;
    public final int[] B2;
    public float C2;
    public boolean D2;
    public ValueAnimator E2;
    public boolean F2;
    public boolean G2;
    public FrameLayout H2;
    public final FrameLayout I2;
    public FrameLayout J2;
    public z70[] K2;
    public z70 L2;
    public final ArrayList T1;
    public int U1;
    public final TLRPC.User V1;
    public final j W1;
    public final TL_stars.StarGift X1;
    public boolean Y1;
    public final fs0 Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public final nz k2;
    public final z0 l2;
    public ki.f m2;
    public xb n2;
    public z51 o2;
    public final e2 p2;
    public Integer q2;
    public float r2;
    public float s2;
    public float t2;
    public float u2;
    public float v2;
    public View w2;
    public View x2;
    public TLRPC.InputStickerSet y2;
    public TLRPC.TL_emojiStatusCollectible z2;

    public g1(e2 e2Var, int i7, TLRPC.User user, e6 e6Var) {
        this(e2Var, i7, user, null, null, e6Var);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        return new i4(this, 11);
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131744231, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final void S0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i11 >= arrayList.size()) {
                this.a2 = i12;
                this.c.getLocationOnScreen(this.B2);
                return;
            }
            ss0 ss0Var = (ss0) arrayList.get(i11);
            fs0 fs0Var = this.Z1;
            fs0Var.a(ss0Var, false);
            fs0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((ss0) arrayList.get(i11)).e = i12;
            i12 += fs0Var.getMeasuredHeight();
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final void U0(st0 st0Var) {
        this.U1 = m10.t0;
        q0 q0Var = new q0(getContext(), this.J0, false);
        q0Var.b(PremiumPreviewFragment.t0(this.U1, null), new h2(this, 2), false);
        this.H2 = new FrameLayout(getContext());
        View view = new View(getContext());
        q6.h(j6.d7, view, this.J0);
        this.H2.addView(view, c8.ja.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Y3(view, true, 1.0f, true, false);
        if (m10.i(this.U1).q() || (this instanceof wg.h0)) {
            return;
        }
        this.H2.addView(q0Var, c8.ja.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        q6.h(j6.h5, this.H2, this.J0);
        st0Var.addView(this.H2, c8.ja.e(-1, 68, 80));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void Z(Canvas canvas) {
        View view = this.x2;
        if (view != null) {
            view.setVisibility(this.D2 ? 4 : 0);
        }
        if (this.w2 == null || !this.D2) {
            return;
        }
        View view2 = this.x2;
        View view3 = view2 == null ? this.n2 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.r2, this.s2};
        this.w2.getMatrix().mapPoints(fArr);
        View view4 = this.w2;
        Drawable rightDrawable = view4 instanceof j5 ? ((j5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).qa : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.B2;
        float f10 = (-iArr[0]) + this.t2 + fArr[0];
        float f11 = (-iArr[1]) + this.u2 + fArr[1];
        if (org.telegram.messenger.g0.Q1()) {
            ViewGroup view5 = this.p2.getParentLayout().getView();
            f10 += view5.getX() + view5.getPaddingLeft();
            f11 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.v2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f12 = measuredHeight / intrinsicWidth;
        float f13 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, er.h.getInterpolation(this.C2));
        float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.C2);
        float f14 = this.v2;
        float f15 = this.C2;
        float f16 = (f12 * f15) + ((1.0f - f15) * f14);
        canvas.save();
        canvas.scale(f16, f16, T1, T12);
        int i7 = (int) T1;
        int i10 = (int) T12;
        rightDrawable.setBounds(org.telegram.ui.Cells.y0.A(2, i7, rightDrawable), org.telegram.ui.Cells.y0.y(2, i10, rightDrawable), org.telegram.ui.Cells.y0.w(2, i7, rightDrawable), org.telegram.ui.Cells.y0.h(2, i10, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.C2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.C2);
        canvas.scale(T13, T13, T1, T12);
        i20.j(view3.getMeasuredHeight(), 2.0f, T12, T1 - (view3.getMeasuredWidth() / 2.0f), canvas);
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == ns.B0 && (inputStickerSet = this.y2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        ns.e().k(ns.k1, 4);
        ValueAnimator valueAnimator = this.E2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        nz nzVar = this.k2;
        if (nzVar.c) {
            nzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(z51 z51Var) {
        z51Var.addView(this.x2, c8.ja.q(ns.W1, ns.W1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.q2;
        return num == null ? org.telegram.messenger.g0.Q2(str, j6.u6, this.J0, null, false) : org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        z70[] z70VarArr = this.K2;
        if (z70VarArr == null || this.L2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.z2;
        int i7 = 2;
        int i10 = 1;
        TLRPC.User user = this.V1;
        int i11 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.K2[0].setText(org.telegram.messenger.g0.U2(hd.a0(null, null, 2131744219, m5.u(user), str), new b1(this, i11)));
            this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744217, null)));
        } else if (this.y2 != null) {
            CharSequence i12 = i1(hd.a0(null, null, 2131744216, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                i12 = org.telegram.messenger.j6.m(i12, this.K2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = i12 instanceof SpannableStringBuilder ? (SpannableStringBuilder) i12 : new SpannableStringBuilder(i12);
            int indexOf = i12.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet m0 = si.b0(this.U1).m0(this.y2, false);
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
                    spannableStringBuilder.setSpan(new p5(document, this.K2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (m0 != null && m0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) m0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(100.0f), this.K2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new ha(this, 11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.K2[1].setOnLinkPressListener(new y70() { // from class: ug.c1
                    @Override // org.telegram.ui.Components.y70
                    public final void a(ClickableSpan clickableSpan) {
                        ArrayList arrayList = new ArrayList();
                        g1 g1Var = g1.this;
                        arrayList.add(g1Var.y2);
                        t6 t6Var = new t6(g1Var, 12);
                        e2 e2Var = g1Var.p2;
                        if (e2Var != null) {
                            t6Var.setParentFragment(e2Var);
                        }
                        new e1(g1Var, t6Var, g1Var.getContext(), g1Var.J0, arrayList).show();
                    }
                });
                if (document != null) {
                    z70[] z70VarArr2 = this.K2;
                    if (z70VarArr2 != null) {
                        z70VarArr2[1].setText(spannableStringBuilder2);
                        if (this.K2[1].getVisibility() != 0) {
                            if (z10) {
                                this.K2[1].setAlpha(0.0f);
                                this.K2[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.K2[1].animate().alpha(1.0f);
                                er erVar = er.f;
                                i20.n(alpha, erVar, 200L);
                                this.K2[0].animate().alpha(0.0f).setInterpolator(erVar).setDuration(200L).withEndAction(new b1(this, i7)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new d1(this, i10));
                                ofFloat.setInterpolator(erVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.K2[1].setAlpha(1.0f);
                                this.K2[1].setVisibility(0);
                                this.K2[0].setAlpha(0.0f);
                                this.K2[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.K2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744217, null)));
        } else if (this.A2) {
            z70VarArr[0].setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744218, g5.m(0, user.first_name, user.last_name))));
            this.L2.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744217, g5.m(0, user.first_name, user.last_name))));
        } else {
            j jVar = this.W1;
            if (jVar == null) {
                TL_stars.StarGift starGift = this.X1;
                if (starGift != null) {
                    z70VarArr[0].setText(hd.M0(2131750068, null));
                    this.K2[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.L2.setText(org.telegram.messenger.g0.X2(hd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131750072, null)));
                    }
                    this.L2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    z70VarArr[0].setText(hd.M0(2131744231, null));
                    this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744229, null)));
                } else {
                    z70VarArr[0].setText(i1(hd.a0(null, null, 2131744225, g5.m(0, user.first_name, user.last_name))));
                    this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744226, null)));
                }
            } else if (this.Y1) {
                z70VarArr[0].setText(i1(hd.a0(null, null, 2131744220, user != null ? user.first_name : "", hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.L2.setText(i1(hd.a0(null, null, 2131744221, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.K2[0].setText(i1(hd.a0(null, null, 2131744222, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744224, null)));
            } else {
                this.K2[0].setText(i1(hd.a0(null, null, 2131744223, user.first_name, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744224, null)));
            }
        }
        try {
            z70 z70Var = this.K2[0];
            z70Var.setText(org.telegram.messenger.j6.m(z70Var.getText(), this.K2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void k1() {
        int i7 = this.b2;
        int i10 = i7 + 1;
        this.b2 = i10;
        this.c2 = i7;
        this.f2 = i10;
        int size = this.T1.size() + i10;
        this.g2 = size;
        this.b2 = size + 1;
        this.h2 = size;
        if (m10.i(this.U1).q() || this.W1 != null) {
            return;
        }
        int i11 = this.b2;
        this.b2 = i11 + 1;
        this.i2 = i11;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean m0() {
        Drawable drawable;
        int i7 = 0;
        if (this.w2 == null) {
            return false;
        }
        this.E2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C2 = 0.0f;
        this.D2 = true;
        this.o2.invalidate();
        View view = this.w2;
        if (view instanceof j5) {
            drawable = ((j5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            e5 e5Var = q1Var.qa;
            q1Var.q2();
            drawable = e5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.w2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).q2();
        } else {
            view2.invalidate();
        }
        xb xbVar = this.n2;
        if (xbVar != null) {
            xbVar.m(100L);
        }
        this.E2.addUpdateListener(new d1(this, i7));
        this.E2.addListener(new y50(22, this, drawable));
        this.E2.setDuration(600L);
        this.E2.setInterpolator(er.h);
        this.E2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(m10.t0).c(this, ns.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(m10.t0).n(this, ns.B0);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        int i7 = 1;
        ns.e().k(ns.j1, 4);
        if (this.F2) {
            org.telegram.messenger.g0.i3(new b1(this, i7), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public final boolean t(Dialog dialog) {
        xb xbVar = this.n2;
        if (xbVar != null) {
            xbVar.setDialogVisible(true);
        }
        this.m2.setPaused(true);
        dialog.setOnDismissListener(new q9(this, 14));
        dialog.show();
        return true;
    }

    public g1(e2 e2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, e6 e6Var) {
        super(e2Var, false, false, e6Var);
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        this.B2 = new int[2];
        this.C2 = 0.0f;
        O();
        this.p2 = e2Var;
        this.v1 = 0.26f;
        this.V1 = user;
        this.U1 = i7;
        this.W1 = jVar;
        this.X1 = starGift;
        this.Z1 = new fs0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || m10.i(i7).q()) {
            this.H2.setVisibility(8);
        }
        z0 z0Var = new z0(j6.Ck, j6.Dk, j6.Ek, j6.Fk, null);
        this.l2 = z0Var;
        z0Var.m = true;
        z0Var.o = 1.0f;
        z0Var.p = 0.0f;
        z0Var.q = 0.0f;
        z0Var.b = 0.0f;
        z0Var.c = 0.0f;
        k1();
        this.o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.o1.setOnItemClickListener(new ml0(this, i7, e2Var, 1));
        si.b0(i7).o1();
        PremiumPreviewFragment.w0("profile");
        nz nzVar = new nz(getContext());
        this.k2 = nzVar;
        this.c.addView(nzVar, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I2 = frameLayout;
        this.b.addView(frameLayout, c8.ja.e(-1, ns.W1, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i7, View view) {
    }
}
