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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y01 extends org.telegram.ui.Components.tj0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ n11 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public y01(n11 n11Var) {
        this.s = n11Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 3 || i7 == 4;
    }

    public final void E(boolean z10) {
        n11 n11Var = this.s;
        int i7 = n11Var.a0;
        boolean z11 = n11Var.J;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = n11Var.C1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < n11Var.C1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, n11Var.C1.get(i12))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = n11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < n11Var.D1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, n11Var.D1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = n11Var.E1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < n11Var.E1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, n11Var.E1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = n11Var.F1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        f();
        if (n11Var.A1 && this.n == 0) {
            z12 = true;
        }
        if (n11Var.I1 == z12) {
            return;
        }
        n11Var.I1 = z12;
        ValueAnimator valueAnimator = n11Var.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        n11Var.J1 = ofFloat;
        ofFloat.addUpdateListener(new uz0(n11Var, z12, i10));
        n11Var.J1.addListener(new h01(n11Var, z12, i10));
        n11Var.J1.setInterpolator(org.telegram.ui.Components.er.h);
        n11Var.J1.setDuration(100L);
        n11Var.J1.start();
        if (z12) {
            n11.D(n11Var.W, n11Var.m0);
        }
    }

    @Override // v4.h0
    public final int b() {
        return this.n;
    }

    @Override // v4.h0
    public final int d(int i7) {
        int i10;
        if (i7 == this.e || i7 == this.f) {
            return 6;
        }
        n11 n11Var = this.s;
        if (n11Var.a0 == 14) {
            ArrayList arrayList = n11Var.D1;
            if (arrayList != null && i7 >= (i10 = this.c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i7 > this.c && (i7 - r2) - 1 < n11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = n11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i7 > this.d && (i7 - r5) - 1 < arrayList2.size() && (n11Var.a0 == 13 || ((ch.p0) n11Var.C1.get((i7 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i7 - i11 < 0 || i7 - i11 >= n11Var.F1.size()) {
            return 4;
        }
        return n11Var.F1.get(i7 - this.h) instanceof k11 ? 6 : 3;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        ch.p0 p0Var;
        int cacheType2;
        int i12;
        int indexOf;
        n11 n11Var = this.s;
        HashSet hashSet = n11Var.L;
        int i13 = n11Var.a0;
        int i14 = n11Var.W;
        b01 b01Var = n11Var.j0;
        int i15 = e1Var.f;
        View view = e1Var.a;
        if (i15 == 6) {
            t01 t01Var = (t01) view;
            ArrayList arrayList = n11Var.F1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) n11Var.F1.get(i7 - this.h);
                if (document2 instanceof k11) {
                    CharSequence charSequence = ((k11) document2).a;
                    String str = n11Var.B1;
                    t01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mf, t01Var.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    t01Var.a.setText(charSequence);
                    t01Var.b(false);
                }
            } else if (i7 == this.e) {
                t01Var.a(org.telegram.messenger.hd.M0(2131751196, null), false);
            } else if (i13 == 14) {
                t01Var.a(org.telegram.messenger.hd.M0(2131744876, null), false);
            } else {
                t01Var.a(org.telegram.messenger.hd.M0(2131754756, null), false);
            }
            t01Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) n11Var.E1.get((i7 - this.c) - 1);
            x01 x01Var = (x01) view;
            x01Var.a(b01Var);
            x01Var.h.r0(org.telegram.messenger.gc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.j6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            x01Var.R = true;
            x01Var.d = document3;
            x01Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                x01 x01Var2 = (x01) view;
                x01Var2.a = false;
                x01Var2.c = i7;
                x01Var2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                x01Var2.setDrawable(null);
                ArrayList arrayList2 = n11Var.C1;
                if (arrayList2 == null || i7 < 0 || i7 >= arrayList2.size()) {
                    ArrayList arrayList3 = n11Var.F1;
                    if (arrayList3 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) n11Var.F1.get(i7 - this.h);
                        if (!(document instanceof k11)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ch.p0 p0Var2 = (ch.p0) n11Var.C1.get(i7);
                    x01Var2.y = p0Var2;
                    long j3 = p0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = n11Var.K.contains(p0Var2);
                        x01Var2.E = true;
                        x01Var2.setDrawable(org.telegram.messenger.j6.g(p0Var2.f));
                        x01Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j3);
                    if (i13 == 14 && !org.telegram.messenger.m10.i(i14).q() && p0Var2.b && p0Var2.d) {
                        x01Var2.b();
                        x01Var2.K.setVisibility(0);
                    } else {
                        w01 w01Var = x01Var2.K;
                        if (w01Var != null) {
                            w01Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        x01Var2.e = new org.telegram.ui.Components.p5(document, (Paint.FontMetricsInt) null);
                        x01Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(l10.longValue(), (Paint.FontMetricsInt) null);
                        x01Var2.e = p5Var;
                        x01Var2.d = p5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) b01Var.l3.get(x01Var2.e.getDocumentId());
                    if (g5Var == null) {
                        cacheType = n11Var.getCacheType();
                        g5Var = org.telegram.ui.Components.g5.m(i14, x01Var2.e.getDocumentId(), null, cacheType);
                        b01Var.l3.put(x01Var2.e.getDocumentId(), g5Var);
                    }
                    x01Var2.setDrawable(g5Var);
                }
                x01Var2.d(contains, false);
                return;
            }
            return;
        }
        x01 x01Var3 = (x01) view;
        x01Var3.c = i7;
        ImageReceiver imageReceiver = x01Var3.n;
        ArrayList arrayList4 = n11Var.C1;
        if (arrayList4 == null || i7 < 0 || i7 >= arrayList4.size()) {
            ArrayList arrayList5 = n11Var.D1;
            if (arrayList5 == null || i7 < (i11 = this.c) || i7 - i11 >= arrayList5.size()) {
                return;
            } else {
                p0Var = (ch.p0) n11Var.D1.get(i7 - this.c);
            }
        } else {
            p0Var = (ch.p0) n11Var.C1.get(i7);
        }
        if (x01Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(x01Var3);
            x01Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            x01Var3.h.P();
        }
        x01Var3.h.H0(b01Var);
        x01Var3.y = p0Var;
        x01Var3.E = false;
        x01Var3.d(n11Var.K.contains(p0Var), false);
        x01Var3.b = false;
        x01Var3.invalidate();
        if (i13 == 13) {
            x01Var3.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
        } else if (p0Var.b || p0Var.f == null) {
            x01Var3.s = false;
            x01Var3.e = new org.telegram.ui.Components.p5(p0Var.g, (Paint.FontMetricsInt) null);
            x01Var3.d = null;
            x01Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.g5 g5Var2 = (org.telegram.ui.Components.g5) b01Var.l3.get(x01Var3.e.getDocumentId());
            if (g5Var2 == null) {
                cacheType2 = n11Var.getCacheType();
                g5Var2 = org.telegram.ui.Components.g5.m(i14, x01Var3.e.getDocumentId(), null, cacheType2);
                b01Var.l3.put(x01Var3.e.getDocumentId(), g5Var2);
            }
            x01Var3.setDrawable(g5Var2);
        } else {
            x01Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(i14).r.get(p0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f, null);
                if (org.telegram.messenger.qc.e(8200)) {
                    ch.p0 p0Var3 = p0Var;
                    x01Var3.h.u0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var3, 0);
                    p0Var = p0Var3;
                } else {
                    x01Var3.h.r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                }
                org.telegram.messenger.si.b0(i14);
                org.telegram.messenger.si.m1(imageReceiver, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
            } else {
                x01Var3.h.f();
                imageReceiver.f();
            }
            x01Var3.e = null;
            x01Var3.d = null;
            x01Var3.setDrawable(null);
            w01 w01Var2 = x01Var3.K;
            if (w01Var2 != null) {
                w01Var2.setVisibility(8);
                x01Var3.K.setImageReceiver(null);
            }
            if (tL_availableReaction == null && p0Var.b) {
                x01Var3.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
            }
        }
        if (!org.telegram.messenger.m10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
            x01Var3.b();
            x01Var3.K.setVisibility(0);
            x01Var3.setEmojicon(null);
            return;
        }
        if (p0Var.e) {
            x01Var3.setEmojicon(p0Var.f);
        } else {
            x01Var3.setEmojicon(null);
        }
        w01 w01Var3 = x01Var3.K;
        if (w01Var3 != null) {
            w01Var3.setVisibility(4);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View x01Var;
        n11 n11Var = this.s;
        if (i7 == 6) {
            x01Var = new t01(n11Var, n11Var.getContext(), n11Var.a0 == 6);
        } else if (i7 == 7) {
            x01Var = new org.telegram.ui.Components.bn(n11Var.getContext(), 24);
            x01Var.setTag("searchbox");
        } else {
            x01Var = new x01(n11Var, n11Var.getContext());
        }
        if (n11.c(n11Var)) {
            x01Var.setScaleX(0.0f);
            x01Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.cj0(x01Var);
    }
}
