package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t21 extends org.telegram.ui.Components.sk0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ i31 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public t21(i31 i31Var) {
        this.s = i31Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        i31 i31Var = this.s;
        int i10 = i31Var.W;
        boolean z11 = i31Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = i31Var.B1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < i31Var.B1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, i31Var.B1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = i31Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < i31Var.C1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, i31Var.C1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = i31Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < i31Var.D1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, i31Var.D1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = i31Var.E1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        f();
        if (i31Var.z1 && this.n == 0) {
            z12 = true;
        }
        if (i31Var.H1 == z12) {
            return;
        }
        i31Var.H1 = z12;
        ValueAnimator valueAnimator = i31Var.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        i31Var.I1 = ofFloat;
        ofFloat.addUpdateListener(new n11(i31Var, z12, i11));
        i31Var.I1.addListener(new c21(i31Var, z12, i11));
        i31Var.I1.setInterpolator(org.telegram.ui.Components.gr.h);
        i31Var.I1.setDuration(100L);
        i31Var.I1.start();
        if (z12) {
            i31.D(i31Var.V, i31Var.l0);
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.n;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        i31 i31Var = this.s;
        if (i31Var.W == 14) {
            ArrayList arrayList = i31Var.C1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < i31Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = i31Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (i31Var.W == 13 || ((sg.o0) i31Var.B1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= i31Var.E1.size()) {
            return 4;
        }
        return i31Var.E1.get(i10 - this.h) instanceof f31 ? 6 : 3;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        sg.o0 o0Var;
        int cacheType2;
        int i13;
        int indexOf;
        i31 i31Var = this.s;
        HashSet hashSet = i31Var.K;
        int i14 = i31Var.W;
        int i15 = i31Var.V;
        v11 v11Var = i31Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            o21 o21Var = (o21) view;
            ArrayList arrayList = i31Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) i31Var.E1.get(i10 - this.h);
                if (document2 instanceof f31) {
                    CharSequence charSequence = ((f31) document2).a;
                    String str = i31Var.A1;
                    o21Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jf, o21Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    o21Var.a.setText(charSequence);
                    o21Var.b(false);
                }
            } else if (i10 == this.e) {
                o21Var.a(org.telegram.messenger.cd.L0(2131751197, null), false);
            } else if (i14 == 14) {
                o21Var.a(org.telegram.messenger.cd.L0(2131744894, null), false);
            } else {
                o21Var.a(org.telegram.messenger.cd.L0(2131754756, null), false);
            }
            o21Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) i31Var.D1.get((i10 - this.c) - 1);
            s21 s21Var = (s21) view;
            s21Var.a(v11Var);
            s21Var.h.r0(org.telegram.messenger.ic.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.v5.f(document3, org.telegram.ui.ActionBar.t6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            s21Var.Q = true;
            s21Var.d = document3;
            s21Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                s21 s21Var2 = (s21) view;
                s21Var2.a = false;
                s21Var2.c = i10;
                s21Var2.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                s21Var2.setDrawable(null);
                ArrayList arrayList2 = i31Var.B1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = i31Var.E1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) i31Var.E1.get(i10 - this.h);
                        if (!(document instanceof f31)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    sg.o0 o0Var2 = (sg.o0) i31Var.B1.get(i10);
                    s21Var2.y = o0Var2;
                    long j10 = o0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = i31Var.J.contains(o0Var2);
                        s21Var2.D = true;
                        s21Var2.setDrawable(org.telegram.messenger.k6.g(o0Var2.f));
                        s21Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j10);
                    if (i14 == 14 && !org.telegram.messenger.d20.i(i15).q() && o0Var2.b && o0Var2.d) {
                        s21Var2.b();
                        s21Var2.J.setVisibility(0);
                    } else {
                        r21 r21Var = s21Var2.J;
                        if (r21Var != null) {
                            r21Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        s21Var2.e = new org.telegram.ui.Components.o5(document, (Paint.FontMetricsInt) null);
                        s21Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(l4.longValue(), (Paint.FontMetricsInt) null);
                        s21Var2.e = o5Var;
                        s21Var2.d = o5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) v11Var.k3.get(s21Var2.e.getDocumentId());
                    if (f5Var == null) {
                        cacheType = i31Var.getCacheType();
                        f5Var = org.telegram.ui.Components.f5.m(i15, s21Var2.e.getDocumentId(), null, cacheType);
                        v11Var.k3.put(s21Var2.e.getDocumentId(), f5Var);
                    }
                    s21Var2.setDrawable(f5Var);
                }
                s21Var2.d(contains, false);
                return;
            }
            return;
        }
        s21 s21Var3 = (s21) view;
        s21Var3.c = i10;
        ImageReceiver imageReceiver = s21Var3.n;
        ArrayList arrayList4 = i31Var.B1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = i31Var.C1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                o0Var = (sg.o0) i31Var.C1.get(i10 - this.c);
            }
        } else {
            o0Var = (sg.o0) i31Var.B1.get(i10);
        }
        if (s21Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(s21Var3);
            s21Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            s21Var3.h.P();
        }
        s21Var3.h.H0(v11Var);
        s21Var3.y = o0Var;
        s21Var3.D = false;
        s21Var3.d(i31Var.J.contains(o0Var), false);
        s21Var3.b = false;
        s21Var3.invalidate();
        if (i14 == 13) {
            s21Var3.setDrawable(org.telegram.messenger.k6.g(o0Var.f));
        } else if (o0Var.b || o0Var.f == null) {
            s21Var3.s = false;
            s21Var3.e = new org.telegram.ui.Components.o5(o0Var.g, (Paint.FontMetricsInt) null);
            s21Var3.d = null;
            s21Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.f5 f5Var2 = (org.telegram.ui.Components.f5) v11Var.k3.get(s21Var3.e.getDocumentId());
            if (f5Var2 == null) {
                cacheType2 = i31Var.getCacheType();
                f5Var2 = org.telegram.ui.Components.f5.m(i15, s21Var3.e.getDocumentId(), null, cacheType2);
                v11Var.k3.put(s21Var3.e.getDocumentId(), f5Var2);
            }
            s21Var3.setDrawable(f5Var2);
        } else {
            s21Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i15).r.get(o0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.t6.m6, 0.2f, null);
                if (org.telegram.messenger.sc.e(8200)) {
                    sg.o0 o0Var3 = o0Var;
                    s21Var3.h.u0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f7, 0L, "tgs", o0Var3, 0);
                    o0Var = o0Var3;
                } else {
                    s21Var3.h.r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f7, 0L, "tgs", o0Var, 0);
                }
                org.telegram.messenger.ui.b0(i15);
                org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.ic.b(tL_availableReaction.around_animation), sg.k0.a());
            } else {
                s21Var3.h.f();
                imageReceiver.f();
            }
            s21Var3.e = null;
            s21Var3.d = null;
            s21Var3.setDrawable(null);
            r21 r21Var2 = s21Var3.J;
            if (r21Var2 != null) {
                r21Var2.setVisibility(8);
                s21Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && o0Var.b) {
                s21Var3.setDrawable(org.telegram.messenger.k6.g(o0Var.f));
            }
        }
        if (!org.telegram.messenger.d20.i(i15).q() && i14 == 14 && o0Var.b && o0Var.d) {
            s21Var3.b();
            s21Var3.J.setVisibility(0);
            s21Var3.setEmojicon(null);
            return;
        }
        if (o0Var.e) {
            s21Var3.setEmojicon(o0Var.f);
        } else {
            s21Var3.setEmojicon(null);
        }
        r21 r21Var3 = s21Var3.J;
        if (r21Var3 != null) {
            r21Var3.setVisibility(4);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View s21Var;
        i31 i31Var = this.s;
        if (i10 == 6) {
            s21Var = new o21(i31Var, i31Var.getContext(), i31Var.W == 6);
        } else if (i10 == 7) {
            s21Var = new org.telegram.ui.Components.bn(i31Var.getContext(), 21);
            s21Var.setTag("searchbox");
        } else {
            s21Var = new s21(i31Var, i31Var.getContext());
        }
        if (i31.c(i31Var)) {
            s21Var.setScaleX(0.0f);
            s21Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.ck0(s21Var);
    }
}
