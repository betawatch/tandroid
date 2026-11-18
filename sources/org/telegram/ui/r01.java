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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r01 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ r11 c;

    public r01(r11 r11Var) {
        this.c = r11Var;
    }

    @Override // org.telegram.ui.Components.bk0
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
        r11 r11Var = this.c;
        if (i7 == r11Var.a) {
            return 7;
        }
        if (i7 >= r11Var.b && i7 < r11Var.c) {
            return 1;
        }
        if (i7 >= r11Var.d && i7 < r11Var.e) {
            return 1;
        }
        if (i7 >= r11Var.F && i7 < r11Var.G) {
            return 1;
        }
        if (i7 >= r11Var.r && i7 < r11Var.s) {
            return 3;
        }
        if (r11Var.z0.indexOfKey(i7) >= 0) {
            return 4;
        }
        if (r11Var.A0.indexOfKey(i7) >= 0) {
            return 5;
        }
        if (i7 == r11Var.w) {
            return 6;
        }
        if (r11Var.x0.indexOfKey(i7) >= 0 || i7 == r11Var.f || i7 == r11Var.E || i7 == r11Var.n || i7 == r11Var.h || i7 == r11Var.y) {
            return 0;
        }
        return i7 == r11Var.x ? 8 : 3;
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
        org.telegram.ui.Components.x5 x5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.fx fxVar;
        int i11;
        ?? r92;
        ?? r12;
        boolean z12;
        String a02;
        ch.p0 p0Var;
        int cacheType3;
        int i12;
        String str;
        r11 r11Var = this.c;
        ArrayList arrayList = r11Var.H0;
        ArrayList arrayList2 = r11Var.L0;
        ArrayList arrayList3 = r11Var.G0;
        SparseIntArray sparseIntArray = r11Var.x0;
        boolean z13 = r11Var.O0;
        ArrayList arrayList4 = r11Var.E0;
        int i13 = r11Var.a0;
        ArrayList arrayList5 = r11Var.N0;
        p01 p01Var = r11Var.i0;
        HashSet hashSet = r11Var.L;
        ArrayList arrayList6 = r11Var.F0;
        int i14 = r11Var.W;
        int i15 = f1Var.f;
        View view = f1Var.a;
        if (i15 == 8) {
            b11 b11Var = (b11) view;
            b11Var.c = i7;
            b11Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = r11Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (r11Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i16 = calendar.get(6);
                    int i17 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i16 && i17 == calendar.get(1)) ? org.telegram.messenger.gd.a0(null, null, 2131743876, org.telegram.messenger.gd.E0().p0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? org.telegram.messenger.gd.E0().w0().format(new Date(intValue)) : org.telegram.messenger.gd.E0().h0().format(new Date(intValue));
                    i12 = 1;
                } catch (Exception e10) {
                    i12 = 1;
                    org.telegram.messenger.a8.g(e10, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i12];
                objArr[0] = str;
                textView.setText(org.telegram.messenger.gd.a0("EmojiStatusExpireHint", null, 2131751154, objArr));
                return;
            }
            return;
        }
        if (i15 == 0) {
            x01 x01Var = (x01) view;
            if (i7 == r11Var.y) {
                x01Var.a(org.telegram.messenger.gd.M0(2131745453, null), false);
                x01Var.c.setVisibility(8);
                return;
            }
            if (i7 == r11Var.f) {
                x01Var.a(org.telegram.messenger.gd.M0(2131746166, null), false);
                x01Var.c.setVisibility(8);
                return;
            }
            if (i7 == r11Var.E) {
                x01Var.a(org.telegram.messenger.gd.M0(2131744641, null), false);
                x01Var.c.setVisibility(8);
                return;
            }
            x01Var.c.setVisibility(8);
            if (i7 == r11Var.h) {
                x01Var.a(org.telegram.messenger.gd.M0(2131746908, null), false);
                return;
            }
            if (i7 == r11Var.n) {
                x01Var.a(org.telegram.messenger.gd.M0(2131751164, null), false);
                return;
            }
            int i18 = sparseIntArray.get(i7);
            if (i18 < 0) {
                x01Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.fx fxVar2 = (org.telegram.ui.Components.fx) arrayList5.get(i18);
            if (fxVar2.d != null) {
                org.telegram.messenger.ri.d0(i14).o0(fxVar2.d, false);
                fxVar2.d = null;
            }
            x01Var.a(fxVar2.b.title, (i13 == 5 || i13 == 7 || i13 == 6 || fxVar2.e || org.telegram.messenger.j10.i(i14).q()) ? false : true);
            return;
        }
        if (i15 == 1) {
            b11 b11Var2 = (b11) view;
            b11Var2.c = i7;
            ImageReceiver imageReceiver = b11Var2.n;
            int i19 = r11Var.b;
            if (i7 < i19 || i7 >= r11Var.c) {
                int i20 = r11Var.F;
                p0Var = (i7 < i20 || i7 >= r11Var.G) ? (ch.p0) r11Var.I0.get(i7 - r11Var.d) : (ch.p0) r11Var.K0.get(i7 - i20);
            } else {
                p0Var = (ch.p0) r11Var.J0.get(i7 - i19);
            }
            if (i13 == 13) {
                b11Var2.b = false;
                b11Var2.E = true;
                b11Var2.y = p0Var;
                b11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
                b11Var2.d(r11Var.K.contains(p0Var), false);
                return;
            }
            b11Var2.a(p01Var);
            b11Var2.E = true;
            b11Var2.y = p0Var;
            b11Var2.d(r11Var.K.contains(p0Var), false);
            b11Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                b11Var2.s = false;
                b11Var2.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
                b11Var2.d = null;
                b11Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) p01Var.l3.get(b11Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = r11Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.o5.m(i14, b11Var2.e.getDocumentId(), null, cacheType3);
                    p01Var.l3.put(b11Var2.e.getDocumentId(), drawable);
                }
                b11Var2.setDrawable(drawable);
            } else {
                b11Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i14).r.get(p0Var.f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.n6.m6, 0.2f, null);
                    if (org.telegram.messenger.pc.e(8200)) {
                        ch.p0 p0Var2 = p0Var;
                        b11Var2.h.u0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        b11Var2.h.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    }
                    org.telegram.messenger.ri.d0(i14);
                    org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    b11Var2.h.f();
                    imageReceiver.f();
                }
                b11Var2.e = null;
                b11Var2.d = null;
                b11Var2.setDrawable(null);
                a11 a11Var = b11Var2.K;
                if (a11Var != null) {
                    a11Var.setVisibility(8);
                    b11Var2.K.setImageReceiver(null);
                }
            }
            if (!org.telegram.messenger.j10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
                b11Var2.b();
                b11Var2.K.setVisibility(0);
                b11Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                b11Var2.setEmojicon(p0Var.f);
            } else {
                b11Var2.setEmojicon(null);
            }
            a11 a11Var2 = b11Var2.K;
            if (a11Var2 != null) {
                a11Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            w01 w01Var = (w01) view;
            int i21 = r11Var.z0.get(i7);
            org.telegram.ui.Components.fx fxVar3 = (i21 < 0 || i21 >= arrayList5.size()) ? null : (org.telegram.ui.Components.fx) arrayList5.get(i21);
            if (i21 == -1) {
                r11Var.H = w01Var;
                w01Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (fxVar3 == null) {
                if (r11Var.H == w01Var) {
                    r11Var.H = null;
                    return;
                }
                return;
            } else {
                if (r11Var.H == w01Var) {
                    r11Var.H = null;
                }
                TextView textView2 = w01Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(fxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            v01 v01Var = (v01) view;
            int i22 = r11Var.A0.get(i7);
            if (i22 < 0 || i22 >= arrayList5.size() || (fxVar = (org.telegram.ui.Components.fx) arrayList5.get(i22)) == null) {
                return;
            }
            String str2 = fxVar.b.title;
            boolean z14 = (fxVar.e || org.telegram.messenger.j10.i(i14).q()) ? false : true;
            boolean z15 = fxVar.f;
            bi.e5 e5Var = new bi.e5(this, fxVar, i22, 21);
            ug.s0 s0Var = v01Var.c;
            FrameLayout frameLayout = v01Var.a;
            v01Var.d = str2;
            if (z14) {
                i11 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                s0Var.setVisibility(0);
                r12 = 0;
                s0Var.b(org.telegram.messenger.gd.a0("UnlockPremiumEmojiPack", null, 2131743625, str2), e5Var, false);
            } else {
                i11 = 8;
                r92 = 0;
                r12 = 0;
                s0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(e5Var);
            }
            if (z15) {
                a02 = org.telegram.messenger.gd.M0(2131754360, r12);
                z12 = true;
            } else {
                z12 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r92] = v01Var.d;
                a02 = org.telegram.messenger.gd.a0("AddStickersCount", r12, 2131754386, objArr2);
            }
            v01Var.b.c(a02, r92, z12);
            frameLayout.setContentDescription(a02);
            ValueAnimator valueAnimator2 = v01Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                v01Var.e = r12;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = v01Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                v01Var.n = null;
            }
            Boolean bool = v01Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                v01Var.h = Boolean.valueOf(z14);
                float f11 = z14 ? 1.0f : 0.0f;
                v01Var.f = f11;
                frameLayout.setAlpha(1.0f - f11);
                s0Var.setAlpha(v01Var.f);
                s0Var.setScaleX(v01Var.f);
                s0Var.setScaleY(v01Var.f);
                s0Var.setVisibility(v01Var.h.booleanValue() ? 0 : i11);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        b11 b11Var3 = (b11) view;
        b11Var3.w = null;
        b11Var3.x = null;
        b11Var3.a = false;
        b11Var3.c = i7;
        b11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        if ((i13 == 4 && r11Var.R) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = (arrayList4.size() <= 40 || r11Var.D0) ? arrayList4.size() + (z13 ? 1 : 0) : 40;
        }
        if (z13) {
            if (i7 == (r11Var.a != -1 ? 1 : 0) + (r11Var.w != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                b11Var3.a = true;
                b11Var3.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                b11Var3.e = null;
                b11Var3.d = null;
                b11Var3.R = false;
                ImageReceiver imageReceiver2 = b11Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.f();
                }
                x5Var = b11Var3.e;
                if (x5Var == null) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) p01Var.l3.get(x5Var.getDocumentId());
                    if (o5Var == null) {
                        if (b11Var3.e.document != null) {
                            cacheType2 = r11Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.l(i14, cacheType2, b11Var3.e.document);
                        } else {
                            cacheType = r11Var.getCacheType();
                            o5Var = org.telegram.ui.Components.o5.m(i14, b11Var3.e.getDocumentId(), null, cacheType);
                        }
                        p01Var.l3.put(b11Var3.e.getDocumentId(), o5Var);
                    }
                    b11Var3.setDrawable(o5Var);
                } else {
                    b11Var3.setDrawable(null);
                }
                b11Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i7 - (r11Var.a != -1 ? 1 : 0)) - (r11Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i7 - (r11Var.a != -1 ? 1 : 0)) - (r11Var.w != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                b11Var3.b = false;
                b11Var3.E = false;
                b11Var3.y = ch.p0.b(str3);
                b11Var3.setDrawable(org.telegram.messenger.j6.g(str3));
                b11Var3.d(r11Var.K.contains(b11Var3.y), false);
                return;
            }
        }
        int i23 = r11Var.a;
        int i24 = i7 - (i23 != -1 ? 1 : 0);
        int i25 = r11Var.w;
        if (i24 - (i25 != -1 ? 1 : 0) < size) {
            int i26 = ((i7 - (i23 != -1 ? 1 : 0)) - (i25 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && r11Var.R) {
                b11Var3.c((TLRPC.Document) arrayList3.get(i26), p01Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i26);
                    b11Var3.c(document2, p01Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) arrayList4.get(i26);
                    b11Var3.e = x5Var2;
                    b11Var3.d = x5Var2 == null ? null : x5Var2.document;
                    z10 = x5Var2 != null && hashSet.contains(Long.valueOf(x5Var2.getDocumentId()));
                    b11Var3.R = false;
                    ImageReceiver imageReceiver3 = b11Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.f();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i10 = i7 - r11Var.r) < 0 || i10 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i7 - (r11Var.a != -1 ? 1 : 0)) - (r11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i7 - (r11Var.a != -1 ? 1 : 0)) - (r11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.x5 x5Var3 = (org.telegram.ui.Components.x5) arrayList2.get(((((i7 - (r11Var.a != -1 ? 1 : 0)) - (r11Var.w != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            b11Var3.e = x5Var3;
                            b11Var3.d = x5Var3 == null ? null : x5Var3.document;
                            z10 = x5Var3 != null && hashSet.contains(Long.valueOf(x5Var3.getDocumentId()));
                            b11Var3.R = false;
                            ImageReceiver imageReceiver4 = b11Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.f();
                            }
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseIntArray.size(); i27++) {
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    org.telegram.ui.Components.fx fxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.fx) arrayList5.get(valueAt) : null;
                    if (fxVar4 != null) {
                        int size2 = fxVar4.h ? fxVar4.c.size() : Math.min(fxVar4.c.size(), 24);
                        int i28 = (i7 - keyAt) - 1;
                        if (i28 >= 0 && i28 < size2 && (document = (TLRPC.Document) fxVar4.c.get(i28)) != null) {
                            if (r11Var.R) {
                                b11Var3.c(document, r11Var.j0);
                            } else {
                                b11Var3.R = false;
                                ImageReceiver imageReceiver5 = b11Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.f();
                                }
                                b11Var3.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                            }
                            b11Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.x5 x5Var4 = b11Var3.e;
                if (x5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i7 - r11Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                b11Var3.e = new org.telegram.ui.Components.x5(document3, (Paint.FontMetricsInt) null);
                b11Var3.d = document3;
                b11Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    b11Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = b11Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                b11Var3.R = false;
                ImageReceiver imageReceiver6 = b11Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.f();
                }
            }
            z11 = z10;
        }
        x5Var = b11Var3.e;
        if (x5Var == null) {
        }
        b11Var3.d(z11, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        r11 r11Var = this.c;
        int i10 = r11Var.a0;
        org.telegram.ui.ActionBar.i6 i6Var = r11Var.a1;
        if (i7 == 0) {
            view = new x01(r11Var, r11Var.getContext(), i10 == 6);
        } else if (i7 == 2) {
            view = new ImageView(r11Var.getContext());
        } else if (i7 == 3 || i7 == 1 || i7 == 8) {
            b11 b11Var = new b11(r11Var, r11Var.getContext());
            if (i7 == 8) {
                b11Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(b11Var);
                b11Var.h = imageReceiver;
                b11Var.r = imageReceiver;
                imageReceiver.w0(r11Var.O);
                r11Var.P = b11Var;
                b11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            view = b11Var;
        } else if (i7 == 4) {
            Context context = r11Var.getContext();
            w01 w01Var = new w01(context);
            TextView textView = new TextView(context);
            w01Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int w10 = r11Var.h1 ? org.telegram.ui.ActionBar.n6.w(r11Var.g1, org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Lf), 99);
            if (r11Var.h1) {
                textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), w10));
            } else {
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), w10);
                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(org.telegram.ui.ActionBar.n6.Lf, 99);
                textView.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, null);
            }
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            w01Var.addView(textView, c8.ma.e(-2, -2, 17));
            view = w01Var;
        } else if (i7 == 5) {
            v01 v01Var = new v01(r11Var.getContext());
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(v01Var.getContext(), false, false, false, 4);
            v01Var.b = x3Var;
            x3Var.b(0.3f, 250L, org.telegram.ui.Components.lr.h);
            x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            x3Var.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.Y(x3Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
            x3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(v01Var.getContext());
            v01Var.a = frameLayout;
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 8.0f);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i11);
            frameLayout.setBackground(e10);
            org.telegram.ui.ActionBar.u6.j(frameLayout, e10, M, e11, i6Var);
            frameLayout.addView(x3Var, c8.ma.e(-1, -2, 17));
            v01Var.addView(frameLayout, c8.ma.c(-1.0f, -1));
            ug.s0 s0Var = new ug.s0(v01Var.getContext(), i6Var, false);
            v01Var.c = s0Var;
            s0Var.setIcon(R.raw.unlock_icon);
            v01Var.addView(s0Var, c8.ma.c(-1.0f, -1));
            view = v01Var;
        } else if (i7 == 6) {
            nb0 nb0Var = new nb0(r11Var.getContext(), 4);
            nb0Var.setTextSize(1, 13.0f);
            if (i10 == 3) {
                nb0Var.setText(org.telegram.messenger.gd.M0(2131745453, null));
            } else if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
                nb0Var.setText(org.telegram.messenger.gd.M0(2131751165, null));
            } else {
                nb0Var.setText(org.telegram.messenger.gd.M0(2131746185, null));
            }
            nb0Var.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(nb0Var, org.telegram.ui.ActionBar.n6.y6, i6Var);
            view = nb0Var;
        } else if (i7 == 7) {
            View w3Var = new org.telegram.ui.Cells.w3(r11Var.getContext(), 52);
            w3Var.setTag("searchbox");
            view = w3Var;
        } else {
            view = new b11(r11Var, r11Var.getContext());
        }
        if (r11.c(r11Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.kj0(view);
    }
}
