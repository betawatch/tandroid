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
import bi.b9;
import c8.ma;
import di.bc;
import di.l4;
import di.u9;
import hi.ha;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d61;
import org.telegram.ui.js0;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class h1 extends sa implements gs {
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
    public m80[] K2;
    public m80 L2;
    public final ArrayList T1;
    public int U1;
    public final TLRPC.User V1;
    public final j W1;
    public final TL_stars.StarGift X1;
    public boolean Y1;
    public final js0 Z1;
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
    public final wz k2;
    public final a1 l2;
    public ki.e m2;
    public bc n2;
    public d61 o2;
    public final g2 p2;
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

    public h1(g2 g2Var, int i7, TLRPC.User user, h6 h6Var) {
        this(g2Var, i7, user, null, null, h6Var);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        return new l4(this, 11);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return hd.N0(2131743988, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final void T0(int i7, int i10) {
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
            ws0 ws0Var = (ws0) arrayList.get(i11);
            js0 js0Var = this.Z1;
            js0Var.a(ws0Var, false);
            js0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((ws0) arrayList.get(i11)).e = i12;
            i12 += js0Var.getMeasuredHeight();
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void V0(du0 du0Var) {
        this.U1 = k10.t0;
        r0 r0Var = new r0(getContext(), this.J0, false);
        r0Var.b(PremiumPreviewFragment.t0(this.U1, null), new tg.u(this, 3), false);
        this.H2 = new FrameLayout(getContext());
        View view = new View(getContext());
        t6.h(m6.d7, view, this.J0);
        this.H2.addView(view, ma.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.X3(view, true, 1.0f, true, false);
        if (k10.i(this.U1).q() || (this instanceof wg.j0)) {
            return;
        }
        this.H2.addView(r0Var, ma.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        t6.h(m6.h5, this.H2, this.J0);
        du0Var.addView(this.H2, ma.e(-1, 68, 80));
    }

    @Override // org.telegram.ui.ActionBar.w2
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
        Drawable rightDrawable = view4 instanceof m5 ? ((m5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.r1 ? ((org.telegram.ui.Cells.r1) view4).qa : null;
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
        float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, nr.h.getInterpolation(this.C2));
        float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.C2);
        float f14 = this.v2;
        float f15 = this.C2;
        float f16 = (f12 * f15) + ((1.0f - f15) * f14);
        canvas.save();
        canvas.scale(f16, f16, T1, T12);
        int i7 = (int) T1;
        int i10 = (int) T12;
        rightDrawable.setBounds(org.telegram.ui.Cells.c0.C(2, i7, rightDrawable), org.telegram.ui.Cells.c0.A(2, i10, rightDrawable), org.telegram.ui.Cells.c0.y(2, i7, rightDrawable), org.telegram.ui.Cells.c0.j(2, i10, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.C2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.C2);
        canvas.scale(T13, T13, T1, T12);
        o10.k(view3.getMeasuredHeight(), 2.0f, T12, T1 - (view3.getMeasuredWidth() / 2.0f), canvas);
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == ls.B0 && (inputStickerSet = this.y2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            k1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        ls.e().k(ls.k1, 4);
        ValueAnimator valueAnimator = this.E2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wz wzVar = this.k2;
        if (wzVar.c) {
            wzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void f1(d61 d61Var) {
        d61Var.addView(this.x2, ma.q(ls.W1, ls.W1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int g1() {
        return 0;
    }

    public View i1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder j1(String str) {
        Integer num = this.q2;
        return num == null ? org.telegram.messenger.g0.Q2(str, m6.u6, this.J0, null, false) : org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void k1(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        m80[] m80VarArr = this.K2;
        if (m80VarArr == null || this.L2 == null) {
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
            this.K2[0].setText(org.telegram.messenger.g0.T2(hd.a0(null, null, 2131743976, n5.u(user), str), new c1(this, i11)));
            this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743974, null)));
        } else if (this.y2 != null) {
            CharSequence j12 = j1(hd.a0(null, null, 2131743973, i5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                j12 = j6.m(j12, this.K2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = j12 instanceof SpannableStringBuilder ? (SpannableStringBuilder) j12 : new SpannableStringBuilder(j12);
            int indexOf = j12.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet o02 = si.d0(this.U1).o0(this.y2, false);
                if (o02 == null || o02.documents.isEmpty()) {
                    document = null;
                } else {
                    document = o02.documents.get(0);
                    if (o02.set != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= o02.documents.size()) {
                                break;
                            }
                            if (o02.documents.get(i12).id == o02.set.thumb_document_id) {
                                document = o02.documents.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new y5(document, this.K2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (o02 != null && o02.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) o02.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new r80(org.telegram.messenger.g0.L(100.0f), this.K2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new ha(this, 11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.K2[1].setOnLinkPressListener(new l80() { // from class: ug.d1
                    @Override // org.telegram.ui.Components.l80
                    public final void a(ClickableSpan clickableSpan) {
                        ArrayList arrayList = new ArrayList();
                        h1 h1Var = h1.this;
                        arrayList.add(h1Var.y2);
                        b9 b9Var = new b9(h1Var, 12);
                        g2 g2Var = h1Var.p2;
                        if (g2Var != null) {
                            b9Var.setParentFragment(g2Var);
                        }
                        new f1(h1Var, b9Var, h1Var.getContext(), h1Var.J0, arrayList).show();
                    }
                });
                if (document != null) {
                    m80[] m80VarArr2 = this.K2;
                    if (m80VarArr2 != null) {
                        m80VarArr2[1].setText(spannableStringBuilder2);
                        if (this.K2[1].getVisibility() != 0) {
                            if (z10) {
                                this.K2[1].setAlpha(0.0f);
                                this.K2[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.K2[1].animate().alpha(1.0f);
                                nr nrVar = nr.f;
                                o10.o(alpha, nrVar, 200L);
                                this.K2[0].animate().alpha(0.0f).setInterpolator(nrVar).setDuration(200L).withEndAction(new c1(this, i7)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new e1(this, i10));
                                ofFloat.setInterpolator(nrVar);
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
            this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743974, null)));
        } else if (this.A2) {
            m80VarArr[0].setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131743975, i5.m(0, user.first_name, user.last_name))));
            this.L2.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131743974, i5.m(0, user.first_name, user.last_name))));
        } else {
            j jVar = this.W1;
            if (jVar == null) {
                TL_stars.StarGift starGift = this.X1;
                if (starGift != null) {
                    m80VarArr[0].setText(hd.N0(2131750051, null));
                    this.K2[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.L2.setText(org.telegram.messenger.g0.W2(hd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131750055, null)));
                    }
                    this.L2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    m80VarArr[0].setText(hd.N0(2131743988, null));
                    this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743986, null)));
                } else {
                    m80VarArr[0].setText(j1(hd.a0(null, null, 2131743982, i5.m(0, user.first_name, user.last_name))));
                    this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743983, null)));
                }
            } else if (this.Y1) {
                m80VarArr[0].setText(j1(hd.a0(null, null, 2131743977, user != null ? user.first_name : "", hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.L2.setText(j1(hd.a0(null, null, 2131743978, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.K2[0].setText(j1(hd.a0(null, null, 2131743979, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743981, null)));
            } else {
                this.K2[0].setText(j1(hd.a0(null, null, 2131743980, user.first_name, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                this.L2.setText(org.telegram.messenger.g0.W2(hd.N0(2131743981, null)));
            }
        }
        try {
            m80 m80Var = this.K2[0];
            m80Var.setText(j6.m(m80Var.getText(), this.K2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void l1() {
        int i7 = this.b2;
        int i10 = i7 + 1;
        this.b2 = i10;
        this.c2 = i7;
        this.f2 = i10;
        int size = this.T1.size() + i10;
        this.g2 = size;
        this.b2 = size + 1;
        this.h2 = size;
        if (k10.i(this.U1).q() || this.W1 != null) {
            return;
        }
        int i11 = this.b2;
        this.b2 = i11 + 1;
        this.i2 = i11;
    }

    @Override // org.telegram.ui.ActionBar.w2
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
        if (view instanceof m5) {
            drawable = ((m5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            org.telegram.ui.Components.n5 n5Var = r1Var.qa;
            r1Var.q2();
            drawable = n5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.w2;
        if (view2 instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view2).q2();
        } else {
            view2.invalidate();
        }
        bc bcVar = this.n2;
        if (bcVar != null) {
            bcVar.m(100L);
        }
        this.E2.addUpdateListener(new e1(this, i7));
        this.E2.addListener(new h10(23, this, drawable));
        this.E2.setDuration(600L);
        this.E2.setInterpolator(nr.h);
        this.E2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(k10.t0).c(this, ls.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(k10.t0).n(this, ls.B0);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        int i7 = 1;
        ls.e().k(ls.j1, 4);
        if (this.F2) {
            org.telegram.messenger.g0.h3(new c1(this, i7), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public final boolean t(Dialog dialog) {
        bc bcVar = this.n2;
        if (bcVar != null) {
            bcVar.setDialogVisible(true);
        }
        this.m2.setPaused(true);
        dialog.setOnDismissListener(new u9(this, 14));
        dialog.show();
        return true;
    }

    public h1(g2 g2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, h6 h6Var) {
        super(g2Var, false, false, h6Var);
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        this.B2 = new int[2];
        this.C2 = 0.0f;
        O();
        this.p2 = g2Var;
        this.v1 = 0.26f;
        this.V1 = user;
        this.U1 = i7;
        this.W1 = jVar;
        this.X1 = starGift;
        this.Z1 = new js0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || k10.i(i7).q()) {
            this.H2.setVisibility(8);
        }
        a1 a1Var = new a1(m6.Ck, m6.Dk, m6.Ek, m6.Fk, null);
        this.l2 = a1Var;
        a1Var.m = true;
        a1Var.o = 1.0f;
        a1Var.p = 0.0f;
        a1Var.q = 0.0f;
        a1Var.b = 0.0f;
        a1Var.c = 0.0f;
        l1();
        this.o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.o1.setOnItemClickListener(new wl0(this, i7, g2Var, 1));
        si.d0(i7).r1();
        PremiumPreviewFragment.w0("profile");
        wz wzVar = new wz(getContext());
        this.k2 = wzVar;
        this.c.addView(wzVar, ma.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I2 = frameLayout;
        this.b.addView(frameLayout, ma.e(-1, ls.W1, 87));
    }

    public void h1(View view) {
    }

    public void e1(int i7, View view) {
    }
}
