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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class s01 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ s11 c;

    public s01(s11 s11Var) {
        this.c = s11Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.v0;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return Math.abs(((Long) this.c.w0.get(i7)).longValue());
    }

    @Override // v4.i0
    public final int d(int i7) {
        s11 s11Var = this.c;
        if (i7 == s11Var.a) {
            return 7;
        }
        if (i7 >= s11Var.b && i7 < s11Var.c) {
            return 1;
        }
        if (i7 >= s11Var.d && i7 < s11Var.e) {
            return 1;
        }
        if (i7 >= s11Var.F && i7 < s11Var.G) {
            return 1;
        }
        if (i7 >= s11Var.r && i7 < s11Var.s) {
            return 3;
        }
        if (s11Var.z0.indexOfKey(i7) >= 0) {
            return 4;
        }
        if (s11Var.A0.indexOfKey(i7) >= 0) {
            return 5;
        }
        if (i7 == s11Var.w) {
            return 6;
        }
        if (s11Var.x0.indexOfKey(i7) >= 0 || i7 == s11Var.f || i7 == s11Var.E || i7 == s11Var.n || i7 == s11Var.h || i7 == s11Var.y) {
            return 0;
        }
        return i7 == s11Var.x ? 8 : 3;
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i10;
        boolean z11;
        org.telegram.ui.Components.y5 y5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.hx hxVar;
        int i11;
        ?? r92;
        ?? r12;
        boolean z12;
        String a02;
        ch.p0 p0Var;
        int cacheType3;
        int i12;
        String str;
        s11 s11Var = this.c;
        ArrayList arrayList = s11Var.H0;
        ArrayList arrayList2 = s11Var.L0;
        ArrayList arrayList3 = s11Var.G0;
        SparseIntArray sparseIntArray = s11Var.x0;
        boolean z13 = s11Var.O0;
        ArrayList arrayList4 = s11Var.E0;
        int i13 = s11Var.a0;
        ArrayList arrayList5 = s11Var.N0;
        q01 q01Var = s11Var.i0;
        HashSet hashSet = s11Var.L;
        ArrayList arrayList6 = s11Var.F0;
        int i14 = s11Var.W;
        int i15 = f1Var.f;
        View view = f1Var.a;
        if (i15 == 8) {
            c11 c11Var = (c11) view;
            c11Var.c = i7;
            c11Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = s11Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (s11Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i16 = calendar.get(6);
                    int i17 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i16 && i17 == calendar.get(1)) ? org.telegram.messenger.hd.a0(null, null, 2131743868, org.telegram.messenger.hd.E0().p0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.hd.E0().w0().format(new Date(intValue)) : org.telegram.messenger.hd.E0().h0().format(new Date(intValue));
                    i12 = 1;
                } catch (Exception e10) {
                    i12 = 1;
                    org.telegram.messenger.a8.g(e10, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i12];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.hd.a0("EmojiStatusExpireHint", null, 2131751153, objArr));
                return;
            }
            return;
        }
        if (i15 == 0) {
            y01 y01Var = (y01) view;
            if (i7 == s11Var.y) {
                y01Var.a(org.telegram.messenger.hd.N0(2131745452, null), false);
                y01Var.c.setVisibility(8);
                return;
            }
            if (i7 == s11Var.f) {
                y01Var.a(org.telegram.messenger.hd.N0(2131746165, null), false);
                y01Var.c.setVisibility(8);
                return;
            }
            if (i7 == s11Var.E) {
                y01Var.a(org.telegram.messenger.hd.N0(2131744633, null), false);
                y01Var.c.setVisibility(8);
                return;
            }
            y01Var.c.setVisibility(8);
            if (i7 == s11Var.h) {
                y01Var.a(org.telegram.messenger.hd.N0(2131746907, null), false);
                return;
            }
            if (i7 == s11Var.n) {
                y01Var.a(org.telegram.messenger.hd.N0(2131751163, null), false);
                return;
            }
            int i18 = sparseIntArray.get(i7);
            if (i18 < 0) {
                y01Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.hx hxVar2 = (org.telegram.ui.Components.hx) arrayList5.get(i18);
            if (hxVar2.d != null) {
                org.telegram.messenger.si.d0(i14).o0(hxVar2.d, false);
                hxVar2.d = null;
            }
            y01Var.a(hxVar2.b.title, (i13 == 5 || i13 == 7 || i13 == 6 || hxVar2.e || org.telegram.messenger.k10.i(i14).q()) ? false : true);
            return;
        }
        if (i15 == 1) {
            c11 c11Var2 = (c11) view;
            c11Var2.c = i7;
            ImageReceiver imageReceiver = c11Var2.n;
            int i19 = s11Var.b;
            if (i7 < i19 || i7 >= s11Var.c) {
                int i20 = s11Var.F;
                p0Var = (i7 < i20 || i7 >= s11Var.G) ? (ch.p0) s11Var.I0.get(i7 - s11Var.d) : (ch.p0) s11Var.K0.get(i7 - i20);
            } else {
                p0Var = (ch.p0) s11Var.J0.get(i7 - i19);
            }
            if (i13 == 13) {
                c11Var2.b = false;
                c11Var2.E = true;
                c11Var2.y = p0Var;
                c11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
                c11Var2.d(s11Var.K.contains(p0Var), false);
                return;
            }
            c11Var2.a(q01Var);
            c11Var2.E = true;
            c11Var2.y = p0Var;
            c11Var2.d(s11Var.K.contains(p0Var), false);
            c11Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                c11Var2.s = false;
                c11Var2.e = new org.telegram.ui.Components.y5(p0Var.g, (Paint.FontMetricsInt) null);
                c11Var2.d = null;
                c11Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) q01Var.l3.get(c11Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = s11Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.p5.m(i14, c11Var2.e.getDocumentId(), null, cacheType3);
                    q01Var.l3.put(c11Var2.e.getDocumentId(), drawable);
                }
                c11Var2.setDrawable(drawable);
            } else {
                c11Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(i14).r.get(p0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.m6.m6, 0.2f, null);
                    if (org.telegram.messenger.qc.e(8200)) {
                        ch.p0 p0Var2 = p0Var;
                        c11Var2.h.u0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        c11Var2.h.r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    }
                    org.telegram.messenger.si.d0(i14);
                    org.telegram.messenger.si.p1(imageReceiver, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    c11Var2.h.f();
                    imageReceiver.f();
                }
                c11Var2.e = null;
                c11Var2.d = null;
                c11Var2.setDrawable(null);
                b11 b11Var = c11Var2.K;
                if (b11Var != null) {
                    b11Var.setVisibility(8);
                    c11Var2.K.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.k10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
                c11Var2.b();
                c11Var2.K.setVisibility(0);
                c11Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                c11Var2.setEmojicon(p0Var.f);
            } else {
                c11Var2.setEmojicon(null);
            }
            b11 b11Var2 = c11Var2.K;
            if (b11Var2 != null) {
                b11Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            x01 x01Var = (x01) view;
            int i21 = s11Var.z0.get(i7);
            org.telegram.ui.Components.hx hxVar3 = (i21 < 0 || i21 >= arrayList5.size()) ? null : (org.telegram.ui.Components.hx) arrayList5.get(i21);
            if (i21 == -1) {
                s11Var.H = x01Var;
                x01Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (hxVar3 == null) {
                if (s11Var.H == x01Var) {
                    s11Var.H = null;
                    return;
                }
                return;
            } else {
                if (s11Var.H == x01Var) {
                    s11Var.H = null;
                }
                TextView textView2 = x01Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(hxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            w01 w01Var = (w01) view;
            int i22 = s11Var.A0.get(i7);
            if (i22 < 0 || i22 >= arrayList5.size() || (hxVar = (org.telegram.ui.Components.hx) arrayList5.get(i22)) == null) {
                return;
            }
            String str2 = hxVar.b.title;
            boolean z14 = (hxVar.e || org.telegram.messenger.k10.i(i14).q()) ? false : true;
            boolean z15 = hxVar.f;
            bi.h5 h5Var = new bi.h5(this, hxVar, i22, 21);
            ug.r0 r0Var = w01Var.c;
            FrameLayout frameLayout = w01Var.a;
            w01Var.d = str2;
            if (z14) {
                i11 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                r0Var.setVisibility(0);
                r12 = 0;
                r0Var.b(org.telegram.messenger.hd.a0("UnlockPremiumEmojiPack", null, 2131743617, str2), h5Var, false);
            } else {
                i11 = 8;
                r92 = 0;
                r12 = 0;
                r0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(h5Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.hd.N0(2131754359, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = w01Var.d;
                a02 = org.telegram.messenger.hd.a0("AddStickersCount", r12, 2131754385, objArr2);
            }
            w01Var.b.c(a02, r92, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = w01Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                w01Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = w01Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                w01Var.n = null;
            }
            Boolean bool = w01Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                w01Var.h = Boolean.valueOf(z14);
                float f11 = z14 ? 1.0f : 0.0f;
                w01Var.f = f11;
                frameLayout.setAlpha(1.0f - f11);
                r0Var.setAlpha(w01Var.f);
                r0Var.setScaleX(w01Var.f);
                r0Var.setScaleY(w01Var.f);
                r0Var.setVisibility(w01Var.h.booleanValue() ? 0 : i11);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        c11 c11Var3 = (c11) view;
        c11Var3.w = null;
        c11Var3.x = null;
        c11Var3.a = false;
        c11Var3.c = i7;
        c11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        if ((i13 == 4 && s11Var.R) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || s11Var.D0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i7 == (s11Var.a != -1 ? 1 : 0) + (s11Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                c11Var3.a = true;
                c11Var3.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                c11Var3.e = null;
                c11Var3.d = null;
                c11Var3.R = false;
                ImageReceiver imageReceiver2 = c11Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                y5Var = c11Var3.e;
                if (y5Var == null) {
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) q01Var.l3.get(y5Var.getDocumentId());
                    if (p5Var == null) {
                        if (c11Var3.e.document != null) {
                            cacheType2 = s11Var.getCacheType();
                            p5Var = org.telegram.ui.Components.p5.l(i14, cacheType2, c11Var3.e.document);
                        } else {
                            cacheType = s11Var.getCacheType();
                            p5Var = org.telegram.ui.Components.p5.m(i14, c11Var3.e.getDocumentId(), null, cacheType);
                        }
                        q01Var.l3.put(c11Var3.e.getDocumentId(), p5Var);
                    }
                    c11Var3.setDrawable(p5Var);
                } else {
                    c11Var3.setDrawable(null);
                }
                c11Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i7 - (s11Var.a != -1 ? 1 : 0)) - (s11Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i7 - (s11Var.a != -1 ? 1 : 0)) - (s11Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                c11Var3.b = false;
                c11Var3.E = false;
                c11Var3.y = ch.p0.b(str3);
                c11Var3.setDrawable(org.telegram.messenger.j6.g(str3));
                c11Var3.d(s11Var.K.contains(c11Var3.y), false);
                return;
            }
        }
        int i23 = s11Var.a;
        int i24 = i7 - (i23 != -1 ? 1 : 0);
        int i25 = s11Var.w;
        if (i24 - (i25 != -1 ? 1 : 0) < size) {
            int i26 = ((i7 - (i23 != -1 ? 1 : 0)) - (i25 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && s11Var.R) {
                c11Var3.c((TLRPC.Document) arrayList3.get(i26), q01Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i26);
                    c11Var3.c(document2, q01Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.y5 y5Var2 = (org.telegram.ui.Components.y5) arrayList4.get(i26);
                    c11Var3.e = y5Var2;
                    c11Var3.d = y5Var2 == null ? null : y5Var2.document;
                    z10 = y5Var2 != null && hashSet.contains(Long.valueOf(y5Var2.getDocumentId()));
                    c11Var3.R = false;
                    ImageReceiver imageReceiver3 = c11Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i10 = i7 - s11Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i7 - (s11Var.a != -1 ? 1 : 0)) - (s11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i7 - (s11Var.a != -1 ? 1 : 0)) - (s11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) arrayList2.get(((((i7 - (s11Var.a != -1 ? 1 : 0)) - (s11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            c11Var3.e = y5Var3;
                            c11Var3.d = y5Var3 == null ? null : y5Var3.document;
                            z10 = y5Var3 != null && hashSet.contains(Long.valueOf(y5Var3.getDocumentId()));
                            c11Var3.R = false;
                            ImageReceiver imageReceiver4 = c11Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    org.telegram.ui.Components.hx hxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.hx) arrayList5.get(valueAt) : null;
                    if (hxVar4 != null) {
                        int size2 = hxVar4.h ? hxVar4.c.size() : Math.min(hxVar4.c.size(), 24);
                        int i28 = (i7 - keyAt) - 1;
                        if (i28 >= 0 && i28 < size2 && (document = (TLRPC.Document) hxVar4.c.get(i28)) != null) {
                            if (s11Var.R) {
                                c11Var3.c(document, s11Var.j0);
                            } else {
                                c11Var3.R = false;
                                ImageReceiver imageReceiver5 = c11Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                c11Var3.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                            }
                            c11Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.y5 y5Var4 = c11Var3.e;
                if (y5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i7 - s11Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                c11Var3.e = new org.telegram.ui.Components.y5(document3, (Paint.FontMetricsInt) null);
                c11Var3.d = document3;
                c11Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    c11Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = c11Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                c11Var3.R = false;
                ImageReceiver imageReceiver6 = c11Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        y5Var = c11Var3.e;
        if (y5Var == null) {
        }
        c11Var3.d(z11, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        s11 s11Var = this.c;
        int i10 = s11Var.a0;
        org.telegram.ui.ActionBar.h6 h6Var = s11Var.a1;
        if (i7 == 0) {
            view = new y01(s11Var, s11Var.getContext(), i10 == 6);
        } else if (i7 == 2) {
            view = new ImageView(s11Var.getContext());
        } else if (i7 == 3 || i7 == 1 || i7 == 8) {
            c11 c11Var = new c11(s11Var, s11Var.getContext());
            if (i7 == 8) {
                c11Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(c11Var);
                c11Var.h = imageReceiver;
                c11Var.r = imageReceiver;
                imageReceiver.w0(s11Var.O);
                s11Var.P = c11Var;
                c11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            view = c11Var;
        } else if (i7 == 4) {
            Context context = s11Var.getContext();
            x01 x01Var = new x01(context);
            TextView textView = new TextView(context);
            x01Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w10 = s11Var.h1 ? org.telegram.ui.ActionBar.m6.w(s11Var.g1, org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Lf), 99);
            if (s11Var.h1) {
                textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), w10));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), w10);
                org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Lf, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(textView, d02, g10, null, null);
            }
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            x01Var.addView(textView, c8.ma.e(-2, -2, 17));
            view = x01Var;
        } else if (i7 == 5) {
            w01 w01Var = new w01(s11Var.getContext());
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(w01Var.getContext(), false, false, false, 4);
            w01Var.b = x3Var;
            x3Var.b(0.3f, 250L, org.telegram.ui.Components.nr.h);
            x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            x3Var.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(x3Var, org.telegram.ui.ActionBar.m6.Ji, h6Var);
            x3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(w01Var.getContext());
            w01Var.a = frameLayout;
            int i11 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 8.0f);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i11);
            frameLayout.setBackground(e10);
            org.telegram.ui.ActionBar.t6.j(frameLayout, e10, M, e11, h6Var);
            frameLayout.addView(x3Var, c8.ma.e(-1, -2, 17));
            w01Var.addView(frameLayout, c8.ma.c(-1.0f, -1));
            ug.r0 r0Var = new ug.r0(w01Var.getContext(), h6Var, false);
            w01Var.c = r0Var;
            r0Var.setIcon(R.raw.unlock_icon);
            w01Var.addView(r0Var, c8.ma.c(-1.0f, -1));
            view = w01Var;
        } else if (i7 == 6) {
            nb0 nb0Var = new nb0(s11Var.getContext(), 4);
            nb0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                nb0Var.setText(org.telegram.messenger.hd.N0(2131745452, null));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                nb0Var.setText(org.telegram.messenger.hd.N0(2131751164, null));
            } else {
                nb0Var.setText(org.telegram.messenger.hd.N0(2131746184, null));
            }
            nb0Var.setGravity(17);
            org.telegram.ui.ActionBar.t6.U(nb0Var, org.telegram.ui.ActionBar.m6.y6, h6Var);
            view = nb0Var;
        } else if (i7 == 7) {
            View w3Var = new org.telegram.ui.Cells.w3(s11Var.getContext(), 52);
            w3Var.setTag("searchbox");
            view = w3Var;
        } else {
            view = new c11(s11Var, s11Var.getContext());
        }
        if (s11.c(s11Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
