package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t01 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ t11 c;

    public t01(t11 t11Var) {
        this.c = t11Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.u0;
    }

    @Override // v4.g0
    public final long c(int i7) {
        return Math.abs(((Long) this.c.v0.get(i7)).longValue());
    }

    @Override // v4.g0
    public final int d(int i7) {
        t11 t11Var = this.c;
        if (i7 == t11Var.a) {
            return 7;
        }
        if (i7 >= t11Var.b && i7 < t11Var.c) {
            return 1;
        }
        if (i7 >= t11Var.d && i7 < t11Var.e) {
            return 1;
        }
        if (i7 >= t11Var.E && i7 < t11Var.F) {
            return 1;
        }
        if (i7 >= t11Var.r && i7 < t11Var.s) {
            return 3;
        }
        if (t11Var.y0.indexOfKey(i7) >= 0) {
            return 4;
        }
        if (t11Var.z0.indexOfKey(i7) >= 0) {
            return 5;
        }
        if (i7 == t11Var.w) {
            return 6;
        }
        if (t11Var.w0.indexOfKey(i7) >= 0 || i7 == t11Var.f || i7 == t11Var.D || i7 == t11Var.n || i7 == t11Var.h || i7 == t11Var.y) {
            return 0;
        }
        return i7 == t11Var.x ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x07ad, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L308;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07f9  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.animation.ValueAnimator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        int size;
        boolean z9;
        TLRPC.Document document;
        int i10;
        boolean z10;
        org.telegram.ui.Components.q5 q5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.tw twVar;
        int i11;
        ?? r92;
        ?? r12;
        boolean z11;
        String a02;
        ch.o0 o0Var;
        int cacheType3;
        int i12;
        String str;
        t11 t11Var = this.c;
        ArrayList arrayList = t11Var.G0;
        ArrayList arrayList2 = t11Var.K0;
        ArrayList arrayList3 = t11Var.F0;
        SparseIntArray sparseIntArray = t11Var.w0;
        boolean z12 = t11Var.N0;
        ArrayList arrayList4 = t11Var.D0;
        int i13 = t11Var.W;
        ArrayList arrayList5 = t11Var.M0;
        r01 r01Var = t11Var.h0;
        HashSet hashSet = t11Var.K;
        ArrayList arrayList6 = t11Var.E0;
        int i14 = t11Var.V;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 8) {
            d11 d11Var = (d11) view;
            d11Var.c = i7;
            d11Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = t11Var.V1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (t11Var.P0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i16 = calendar.get(6);
                    int i17 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i16 && i17 == calendar.get(1)) ? org.telegram.messenger.id.a0(null, null, 2131744111, org.telegram.messenger.id.E0().p0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.id.E0().w0().format(new Date(intValue)) : org.telegram.messenger.id.E0().h0().format(new Date(intValue));
                    i12 = 1;
                } catch (Exception e10) {
                    i12 = 1;
                    org.telegram.messenger.a8.g(e10, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i12];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.id.a0("EmojiStatusExpireHint", null, 2131751165, objArr));
                return;
            }
            return;
        }
        if (i15 == 0) {
            z01 z01Var = (z01) view;
            if (i7 == t11Var.y) {
                z01Var.a(org.telegram.messenger.id.M0(2131745648, null), false);
                z01Var.c.setVisibility(8);
                return;
            }
            if (i7 == t11Var.f) {
                z01Var.a(org.telegram.messenger.id.M0(2131746361, null), false);
                z01Var.c.setVisibility(8);
                return;
            }
            if (i7 == t11Var.D) {
                z01Var.a(org.telegram.messenger.id.M0(2131744876, null), false);
                z01Var.c.setVisibility(8);
                return;
            }
            z01Var.c.setVisibility(8);
            if (i7 == t11Var.h) {
                z01Var.a(org.telegram.messenger.id.M0(2131747101, null), false);
                return;
            }
            if (i7 == t11Var.n) {
                z01Var.a(org.telegram.messenger.id.M0(2131751175, null), false);
                return;
            }
            int i18 = sparseIntArray.get(i7);
            if (i18 < 0) {
                z01Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.tw twVar2 = (org.telegram.ui.Components.tw) arrayList5.get(i18);
            if (twVar2.d != null) {
                org.telegram.messenger.ui.b0(i14).m0(twVar2.d, false);
                twVar2.d = null;
            }
            z01Var.a(twVar2.b.title, (i13 == 5 || i13 == 7 || i13 == 6 || twVar2.e || org.telegram.messenger.p10.i(i14).q()) ? false : true);
            return;
        }
        if (i15 == 1) {
            d11 d11Var2 = (d11) view;
            d11Var2.c = i7;
            ImageReceiver imageReceiver = d11Var2.n;
            int i19 = t11Var.b;
            if (i7 < i19 || i7 >= t11Var.c) {
                int i20 = t11Var.E;
                o0Var = (i7 < i20 || i7 >= t11Var.F) ? (ch.o0) t11Var.H0.get(i7 - t11Var.d) : (ch.o0) t11Var.J0.get(i7 - i20);
            } else {
                o0Var = (ch.o0) t11Var.I0.get(i7 - i19);
            }
            if (i13 == 13) {
                d11Var2.b = false;
                d11Var2.D = true;
                d11Var2.y = o0Var;
                d11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f));
                d11Var2.d(t11Var.J.contains(o0Var), false);
                return;
            }
            d11Var2.a(r01Var);
            d11Var2.D = true;
            d11Var2.y = o0Var;
            d11Var2.d(t11Var.J.contains(o0Var), false);
            d11Var2.b = false;
            if (o0Var.b || o0Var.f == null) {
                d11Var2.s = false;
                d11Var2.e = new org.telegram.ui.Components.q5(o0Var.g, (Paint.FontMetricsInt) null);
                d11Var2.d = null;
                d11Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) r01Var.k3.get(d11Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = t11Var.getCacheType();
                    if (cacheType3 == 3 && o0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.h5.m(i14, d11Var2.e.getDocumentId(), null, cacheType3);
                    r01Var.k3.put(d11Var2.e.getDocumentId(), drawable);
                }
                d11Var2.setDrawable(drawable);
            } else {
                d11Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i14).r.get(o0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.m6.m6, 0.2f, null);
                    if (org.telegram.messenger.sc.e(8200)) {
                        ch.o0 o0Var2 = o0Var;
                        d11Var2.h.u0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    } else {
                        d11Var2.h.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", o0Var, 0);
                    }
                    org.telegram.messenger.ui.b0(i14);
                    org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
                } else {
                    d11Var2.h.f();
                    imageReceiver.f();
                }
                d11Var2.e = null;
                d11Var2.d = null;
                d11Var2.setDrawable(null);
                c11 c11Var = d11Var2.J;
                if (c11Var != null) {
                    c11Var.setVisibility(8);
                    d11Var2.J.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.p10.i(i14).q() && i13 == 14 && o0Var.b && o0Var.d) {
                d11Var2.b();
                d11Var2.J.setVisibility(0);
                d11Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                d11Var2.setEmojicon(o0Var.f);
            } else {
                d11Var2.setEmojicon(null);
            }
            c11 c11Var2 = d11Var2.J;
            if (c11Var2 != null) {
                c11Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            y01 y01Var = (y01) view;
            int i21 = t11Var.y0.get(i7);
            org.telegram.ui.Components.tw twVar3 = (i21 < 0 || i21 >= arrayList5.size()) ? null : (org.telegram.ui.Components.tw) arrayList5.get(i21);
            if (i21 == -1) {
                t11Var.G = y01Var;
                y01Var.a.setText("+" + ((arrayList4.size() - 40) + (z12 ? 1 : 0) + 1));
                return;
            }
            if (twVar3 == null) {
                if (t11Var.G == y01Var) {
                    t11Var.G = null;
                    return;
                }
                return;
            } else {
                if (t11Var.G == y01Var) {
                    t11Var.G = null;
                }
                TextView textView2 = y01Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(twVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            x01 x01Var = (x01) view;
            int i22 = t11Var.z0.get(i7);
            if (i22 < 0 || i22 >= arrayList5.size() || (twVar = (org.telegram.ui.Components.tw) arrayList5.get(i22)) == null) {
                return;
            }
            String str2 = twVar.b.title;
            boolean z13 = (twVar.e || org.telegram.messenger.p10.i(i14).q()) ? false : true;
            boolean z14 = twVar.f;
            bi.la laVar = new bi.la(this, twVar, i22, 18);
            ug.p0 p0Var = x01Var.c;
            FrameLayout frameLayout = x01Var.a;
            x01Var.d = str2;
            if (z13) {
                i11 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                r12 = 0;
                p0Var.b(org.telegram.messenger.id.a0("UnlockPremiumEmojiPack", null, 2131743862, str2), laVar, false);
            } else {
                i11 = 8;
                r92 = 0;
                r12 = 0;
                p0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(laVar);
            }
            if (z14) {
                a02 = org.telegram.messenger.id.M0(2131754362, r12);
                z11 = true;
            } else {
                z11 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = x01Var.d;
                a02 = org.telegram.messenger.id.a0("AddStickersCount", r12, 2131754388, objArr2);
            }
            x01Var.b.c(a02, r92, z11);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = x01Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                x01Var.e = r12;
            }
            frameLayout.setEnabled(!z14);
            frameLayout.setAlpha(z14 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = x01Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                x01Var.n = null;
            }
            Boolean bool = x01Var.h;
            if (bool == null || bool.booleanValue() != z13) {
                x01Var.h = Boolean.valueOf(z13);
                float f11 = z13 ? 1.0f : 0.0f;
                x01Var.f = f11;
                frameLayout.setAlpha(1.0f - f11);
                p0Var.setAlpha(x01Var.f);
                p0Var.setScaleX(x01Var.f);
                p0Var.setScaleY(x01Var.f);
                p0Var.setVisibility(x01Var.h.booleanValue() ? 0 : i11);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        d11 d11Var3 = (d11) view;
        d11Var3.w = null;
        d11Var3.x = null;
        d11Var3.a = false;
        d11Var3.c = i7;
        d11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        if ((i13 == 4 && t11Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || t11Var.C0) ? arrayList4.size() + (z12 ? 1 : 0) : 40;
        }
        if (z12) {
            if (i7 == (t11Var.a != -1 ? 1 : 0) + (t11Var.w != -1 ? 1 : 0)) {
                z10 = hashSet.contains(null);
                d11Var3.a = true;
                d11Var3.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                d11Var3.e = null;
                d11Var3.d = null;
                d11Var3.Q = false;
                ImageReceiver imageReceiver2 = d11Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                q5Var = d11Var3.e;
                if (q5Var == null) {
                    org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) r01Var.k3.get(q5Var.getDocumentId());
                    if (h5Var == null) {
                        if (d11Var3.e.document != null) {
                            cacheType2 = t11Var.getCacheType();
                            h5Var = org.telegram.ui.Components.h5.l(i14, cacheType2, d11Var3.e.document);
                        } else {
                            cacheType = t11Var.getCacheType();
                            h5Var = org.telegram.ui.Components.h5.m(i14, d11Var3.e.getDocumentId(), null, cacheType);
                        }
                        r01Var.k3.put(d11Var3.e.getDocumentId(), h5Var);
                    }
                    d11Var3.setDrawable(h5Var);
                } else {
                    d11Var3.setDrawable(null);
                }
                d11Var3.d(z10, false);
            }
        }
        if (i13 == 13) {
            if ((i7 - (t11Var.a != -1 ? 1 : 0)) - (t11Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i7 - (t11Var.a != -1 ? 1 : 0)) - (t11Var.w != -1 ? 1 : 0)) - (z12 ? 1 : 0));
                d11Var3.b = false;
                d11Var3.D = false;
                d11Var3.y = ch.o0.b(str3);
                d11Var3.setDrawable(org.telegram.messenger.i6.g(str3));
                d11Var3.d(t11Var.J.contains(d11Var3.y), false);
                return;
            }
        }
        int i23 = t11Var.a;
        int i24 = i7 - (i23 != -1 ? 1 : 0);
        int i25 = t11Var.w;
        if (i24 - (i25 != -1 ? 1 : 0) < size) {
            int i26 = ((i7 - (i23 != -1 ? 1 : 0)) - (i25 != -1 ? 1 : 0)) - (z12 ? 1 : 0);
            if (i13 == 4 && t11Var.Q) {
                d11Var3.c((TLRPC.Document) arrayList3.get(i26), r01Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i26);
                    d11Var3.c(document2, r01Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z9 = true;
                    }
                } else {
                    org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) arrayList4.get(i26);
                    d11Var3.e = q5Var2;
                    d11Var3.d = q5Var2 == null ? null : q5Var2.document;
                    z9 = q5Var2 != null && hashSet.contains(Long.valueOf(q5Var2.getDocumentId()));
                    d11Var3.Q = false;
                    ImageReceiver imageReceiver3 = d11Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z10 = z9;
            }
            z9 = false;
            z10 = z9;
        } else {
            if (arrayList6.isEmpty() || (i10 = i7 - t11Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i7 - (t11Var.a != -1 ? 1 : 0)) - (t11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i7 - (t11Var.a != -1 ? 1 : 0)) - (t11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.q5 q5Var3 = (org.telegram.ui.Components.q5) arrayList2.get(((((i7 - (t11Var.a != -1 ? 1 : 0)) - (t11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            d11Var3.e = q5Var3;
                            d11Var3.d = q5Var3 == null ? null : q5Var3.document;
                            z9 = q5Var3 != null && hashSet.contains(Long.valueOf(q5Var3.getDocumentId()));
                            d11Var3.Q = false;
                            ImageReceiver imageReceiver4 = d11Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    org.telegram.ui.Components.tw twVar4 = valueAt >= 0 ? (org.telegram.ui.Components.tw) arrayList5.get(valueAt) : null;
                    if (twVar4 != null) {
                        int size2 = twVar4.h ? twVar4.c.size() : Math.min(twVar4.c.size(), 24);
                        int i28 = (i7 - keyAt) - 1;
                        if (i28 >= 0 && i28 < size2 && (document = (TLRPC.Document) twVar4.c.get(i28)) != null) {
                            if (t11Var.Q) {
                                d11Var3.c(document, t11Var.i0);
                            } else {
                                d11Var3.Q = false;
                                ImageReceiver imageReceiver5 = d11Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                d11Var3.e = new org.telegram.ui.Components.q5(document, (Paint.FontMetricsInt) null);
                            }
                            d11Var3.d = document;
                        }
                    }
                }
                z9 = true;
                org.telegram.ui.Components.q5 q5Var4 = d11Var3.e;
                if (q5Var4 != null) {
                }
                z9 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i7 - t11Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                d11Var3.e = new org.telegram.ui.Components.q5(document3, (Paint.FontMetricsInt) null);
                d11Var3.d = document3;
                d11Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    d11Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z9 = d11Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                d11Var3.Q = false;
                ImageReceiver imageReceiver6 = d11Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z10 = z9;
        }
        q5Var = d11Var3.e;
        if (q5Var == null) {
        }
        d11Var3.d(z10, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        t11 t11Var = this.c;
        int i10 = t11Var.W;
        org.telegram.ui.ActionBar.h6 h6Var = t11Var.Z0;
        if (i7 == 0) {
            view = new z01(t11Var, t11Var.getContext(), i10 == 6);
        } else if (i7 == 2) {
            view = new ImageView(t11Var.getContext());
        } else if (i7 == 3 || i7 == 1 || i7 == 8) {
            d11 d11Var = new d11(t11Var, t11Var.getContext());
            if (i7 == 8) {
                d11Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(d11Var);
                d11Var.h = imageReceiver;
                d11Var.r = imageReceiver;
                imageReceiver.w0(t11Var.N);
                t11Var.O = d11Var;
                d11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            view = d11Var;
        } else if (i7 == 4) {
            Context context = t11Var.getContext();
            y01 y01Var = new y01(context);
            TextView textView = new TextView(context);
            y01Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w10 = t11Var.g1 ? org.telegram.ui.ActionBar.m6.w(t11Var.f1, org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.If), 99);
            if (t11Var.g1) {
                textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), w10));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), w10);
                org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.If, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(textView, d02, g10, null, null);
            }
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            y01Var.addView(textView, c8.ha.e(-2, -2, 17));
            view = y01Var;
        } else if (i7 == 5) {
            x01 x01Var = new x01(t11Var.getContext());
            org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(x01Var.getContext(), false, false, false, 4);
            x01Var.b = w3Var;
            w3Var.b(0.3f, 250L, org.telegram.ui.Components.wq.h);
            w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            w3Var.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(w3Var, org.telegram.ui.ActionBar.m6.Gi, h6Var);
            w3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(x01Var.getContext());
            x01Var.a = frameLayout;
            int i11 = org.telegram.ui.ActionBar.m6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 8.0f);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i11);
            frameLayout.setBackground(e10);
            org.telegram.ui.ActionBar.t6.j(frameLayout, e10, M, e11, h6Var);
            frameLayout.addView(w3Var, c8.ha.e(-1, -2, 17));
            x01Var.addView(frameLayout, c8.ha.c(-1.0f, -1));
            ug.p0 p0Var = new ug.p0(x01Var.getContext(), h6Var, false);
            x01Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            x01Var.addView(p0Var, c8.ha.c(-1.0f, -1));
            view = x01Var;
        } else if (i7 == 6) {
            pb0 pb0Var = new pb0(t11Var.getContext(), 4);
            pb0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                pb0Var.setText(org.telegram.messenger.id.M0(2131745648, null));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                pb0Var.setText(org.telegram.messenger.id.M0(2131751176, null));
            } else {
                pb0Var.setText(org.telegram.messenger.id.M0(2131746380, null));
            }
            pb0Var.setGravity(17);
            org.telegram.ui.ActionBar.t6.U(pb0Var, org.telegram.ui.ActionBar.m6.y6, h6Var);
            view = pb0Var;
        } else if (i7 == 7) {
            View v3Var = new org.telegram.ui.Cells.v3(t11Var.getContext(), 52);
            v3Var.setTag("searchbox");
            view = v3Var;
        } else {
            view = new d11(t11Var, t11Var.getContext());
        }
        if (t11.c(t11Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
