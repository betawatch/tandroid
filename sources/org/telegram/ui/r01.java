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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r01 extends org.telegram.ui.Components.sj0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ g11 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public r01(g11 g11Var) {
        this.s = g11Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 3 || i3 == 4;
    }

    public final void E(boolean z10) {
        g11 g11Var = this.s;
        int i3 = g11Var.a0;
        boolean z11 = g11Var.J;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = g11Var.C1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i3 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < g11Var.C1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, g11Var.C1.get(i12))));
            }
        }
        if (i3 == 14) {
            ArrayList arrayList3 = g11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < g11Var.D1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g11Var.D1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = g11Var.E1;
            if (arrayList4 != null) {
                if (i3 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < g11Var.E1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g11Var.E1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = g11Var.F1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        f();
        if (g11Var.A1 && this.n == 0) {
            z12 = true;
        }
        if (g11Var.I1 == z12) {
            return;
        }
        g11Var.I1 = z12;
        ValueAnimator valueAnimator = g11Var.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        g11Var.J1 = ofFloat;
        ofFloat.addUpdateListener(new nz0(g11Var, z12, i10));
        g11Var.J1.addListener(new a01(g11Var, z12, i10));
        g11Var.J1.setInterpolator(org.telegram.ui.Components.xq.h);
        g11Var.J1.setDuration(100L);
        g11Var.J1.start();
        if (z12) {
            g11.D(g11Var.W, g11Var.m0);
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.n;
    }

    @Override // u4.h0
    public final int d(int i3) {
        int i10;
        if (i3 == this.e || i3 == this.f) {
            return 6;
        }
        g11 g11Var = this.s;
        if (g11Var.a0 == 14) {
            ArrayList arrayList = g11Var.D1;
            if (arrayList != null && i3 >= (i10 = this.c) && i3 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i3 > this.c && (i3 - r2) - 1 < g11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = g11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i3 > this.d && (i3 - r5) - 1 < arrayList2.size() && (g11Var.a0 == 13 || ((dh.n0) g11Var.C1.get((i3 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i3 - i11 < 0 || i3 - i11 >= g11Var.F1.size()) {
            return 4;
        }
        return g11Var.F1.get(i3 - this.h) instanceof d11 ? 6 : 3;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        dh.n0 n0Var;
        int cacheType2;
        int i12;
        int indexOf;
        g11 g11Var = this.s;
        HashSet hashSet = g11Var.L;
        int i13 = g11Var.a0;
        int i14 = g11Var.W;
        uz0 uz0Var = g11Var.j0;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 6) {
            m01 m01Var = (m01) view;
            ArrayList arrayList = g11Var.F1;
            if (arrayList != null && (i12 = i3 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) g11Var.F1.get(i3 - this.h);
                if (document2 instanceof d11) {
                    CharSequence charSequence = ((d11) document2).a;
                    String str = g11Var.B1;
                    m01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jf, m01Var.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    m01Var.a.setText(charSequence);
                    m01Var.b(false);
                }
            } else if (i3 == this.e) {
                m01Var.a(org.telegram.messenger.bd.M0(2131751197, null), false);
            } else if (i13 == 14) {
                m01Var.a(org.telegram.messenger.bd.M0(2131744886, null), false);
            } else {
                m01Var.a(org.telegram.messenger.bd.M0(2131754756, null), false);
            }
            m01Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) g11Var.E1.get((i3 - this.c) - 1);
            q01 q01Var = (q01) view;
            q01Var.a(uz0Var);
            q01Var.h.r0(org.telegram.messenger.ac.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            q01Var.R = true;
            q01Var.d = document3;
            q01Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                q01 q01Var2 = (q01) view;
                q01Var2.a = false;
                q01Var2.c = i3;
                q01Var2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                q01Var2.setDrawable(null);
                ArrayList arrayList2 = g11Var.C1;
                if (arrayList2 == null || i3 < 0 || i3 >= arrayList2.size()) {
                    ArrayList arrayList3 = g11Var.F1;
                    if (arrayList3 != null && (i10 = i3 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) g11Var.F1.get(i3 - this.h);
                        if (!(document instanceof d11)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    dh.n0 n0Var2 = (dh.n0) g11Var.C1.get(i3);
                    q01Var2.y = n0Var2;
                    long j10 = n0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = g11Var.K.contains(n0Var2);
                        q01Var2.E = true;
                        q01Var2.setDrawable(org.telegram.messenger.i6.g(n0Var2.f));
                        q01Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j10);
                    if (i13 == 14 && !org.telegram.messenger.h10.i(i14).q() && n0Var2.b && n0Var2.d) {
                        q01Var2.b();
                        q01Var2.K.setVisibility(0);
                    } else {
                        p01 p01Var = q01Var2.K;
                        if (p01Var != null) {
                            p01Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        q01Var2.e = new org.telegram.ui.Components.p5(document, (Paint.FontMetricsInt) null);
                        q01Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(l10.longValue(), (Paint.FontMetricsInt) null);
                        q01Var2.e = p5Var;
                        q01Var2.d = p5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) uz0Var.l3.get(q01Var2.e.getDocumentId());
                    if (g5Var == null) {
                        cacheType = g11Var.getCacheType();
                        g5Var = org.telegram.ui.Components.g5.m(i14, q01Var2.e.getDocumentId(), null, cacheType);
                        uz0Var.l3.put(q01Var2.e.getDocumentId(), g5Var);
                    }
                    q01Var2.setDrawable(g5Var);
                }
                q01Var2.d(contains, false);
                return;
            }
            return;
        }
        q01 q01Var3 = (q01) view;
        q01Var3.c = i3;
        ImageReceiver imageReceiver = q01Var3.n;
        ArrayList arrayList4 = g11Var.C1;
        if (arrayList4 == null || i3 < 0 || i3 >= arrayList4.size()) {
            ArrayList arrayList5 = g11Var.D1;
            if (arrayList5 == null || i3 < (i11 = this.c) || i3 - i11 >= arrayList5.size()) {
                return;
            } else {
                n0Var = (dh.n0) g11Var.D1.get(i3 - this.c);
            }
        } else {
            n0Var = (dh.n0) g11Var.C1.get(i3);
        }
        if (q01Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(q01Var3);
            q01Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            q01Var3.h.P();
        }
        q01Var3.h.H0(uz0Var);
        q01Var3.y = n0Var;
        q01Var3.E = false;
        q01Var3.d(g11Var.K.contains(n0Var), false);
        q01Var3.b = false;
        q01Var3.invalidate();
        if (i13 == 13) {
            q01Var3.setDrawable(org.telegram.messenger.i6.g(n0Var.f));
        } else if (n0Var.b || n0Var.f == null) {
            q01Var3.s = false;
            q01Var3.e = new org.telegram.ui.Components.p5(n0Var.g, (Paint.FontMetricsInt) null);
            q01Var3.d = null;
            q01Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.g5 g5Var2 = (org.telegram.ui.Components.g5) uz0Var.l3.get(q01Var3.e.getDocumentId());
            if (g5Var2 == null) {
                cacheType2 = g11Var.getCacheType();
                g5Var2 = org.telegram.ui.Components.g5.m(i14, q01Var3.e.getDocumentId(), null, cacheType2);
                uz0Var.l3.put(q01Var3.e.getDocumentId(), g5Var2);
            }
            q01Var3.setDrawable(g5Var2);
        } else {
            q01Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(i14).r.get(n0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f, null);
                if (org.telegram.messenger.lc.e(8200)) {
                    dh.n0 n0Var3 = n0Var;
                    q01Var3.h.u0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", n0Var3, 0);
                    n0Var = n0Var3;
                } else {
                    q01Var3.h.r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", n0Var, 0);
                }
                org.telegram.messenger.li.b0(i14);
                org.telegram.messenger.li.m1(imageReceiver, org.telegram.messenger.ac.b(tL_availableReaction.around_animation), dh.j0.a());
            } else {
                q01Var3.h.f();
                imageReceiver.f();
            }
            q01Var3.e = null;
            q01Var3.d = null;
            q01Var3.setDrawable(null);
            p01 p01Var2 = q01Var3.K;
            if (p01Var2 != null) {
                p01Var2.setVisibility(8);
                q01Var3.K.setImageReceiver(null);
            }
            if (tL_availableReaction == null && n0Var.b) {
                q01Var3.setDrawable(org.telegram.messenger.i6.g(n0Var.f));
            }
        }
        if (!org.telegram.messenger.h10.i(i14).q() && i13 == 14 && n0Var.b && n0Var.d) {
            q01Var3.b();
            q01Var3.K.setVisibility(0);
            q01Var3.setEmojicon(null);
            return;
        }
        if (n0Var.e) {
            q01Var3.setEmojicon(n0Var.f);
        } else {
            q01Var3.setEmojicon(null);
        }
        p01 p01Var3 = q01Var3.K;
        if (p01Var3 != null) {
            p01Var3.setVisibility(4);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View q01Var;
        g11 g11Var = this.s;
        if (i3 == 6) {
            q01Var = new m01(g11Var, g11Var.getContext(), g11Var.a0 == 6);
        } else if (i3 == 7) {
            q01Var = new org.telegram.ui.Components.sm(g11Var.getContext(), 25);
            q01Var.setTag("searchbox");
        } else {
            q01Var = new q01(g11Var, g11Var.getContext());
        }
        if (g11.c(g11Var)) {
            q01Var.setScaleX(0.0f);
            q01Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.bj0(q01Var);
    }
}
