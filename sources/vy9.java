// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vy9 extends q59 {
    public final /* synthetic */ vz9 c;

    public vy9(vz9 vz9Var) {
        this.c = vz9Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 2 || i == 1 || i == 3 || i == 8;
    }

    @Override // y59
    public final int b() {
        return this.c.v0;
    }

    @Override // y59
    public final long c(int i) {
        return Math.abs(((Long) this.c.w0.get(i)).longValue());
    }

    @Override // y59
    public final int d(int i) {
        vz9 vz9Var = this.c;
        if (i == vz9Var.a) {
            return 7;
        }
        if (i >= vz9Var.b && i < vz9Var.c) {
            return 1;
        }
        if (i >= vz9Var.d && i < vz9Var.e) {
            return 1;
        }
        if (i >= vz9Var.F && i < vz9Var.G) {
            return 1;
        }
        if (i >= vz9Var.r && i < vz9Var.s) {
            return 3;
        }
        if (vz9Var.z0.indexOfKey(i) >= 0) {
            return 4;
        }
        if (vz9Var.A0.indexOfKey(i) >= 0) {
            return 5;
        }
        if (i == vz9Var.w) {
            return 6;
        }
        if (vz9Var.x0.indexOfKey(i) >= 0 || i == vz9Var.f || i == vz9Var.E || i == vz9Var.n || i == vz9Var.h || i == vz9Var.y) {
            return 0;
        }
        return i == vz9Var.x ? 8 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07dd  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.animation.ValueAnimator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        boolean z;
        TLRPC.Document document;
        int i2;
        boolean z2;
        gn gnVar;
        int cacheType;
        int cacheType2;
        s14 s14Var;
        ?? r3;
        int i3;
        ?? r11;
        boolean z3;
        String a0;
        k39 k39Var;
        int cacheType3;
        int i4;
        String str;
        vz9 vz9Var = this.c;
        ArrayList arrayList = vz9Var.H0;
        ArrayList arrayList2 = vz9Var.L0;
        ArrayList arrayList3 = vz9Var.G0;
        SparseIntArray sparseIntArray = vz9Var.x0;
        boolean z4 = vz9Var.O0;
        ArrayList arrayList4 = vz9Var.E0;
        int i5 = vz9Var.a0;
        ArrayList arrayList5 = vz9Var.N0;
        ty9 ty9Var = vz9Var.i0;
        HashSet hashSet = vz9Var.L;
        int i6 = vz9Var.W;
        ArrayList arrayList6 = vz9Var.F0;
        int i7 = u69Var.f;
        View view = u69Var.a;
        if (i7 == 8) {
            fz9 fz9Var = (fz9) view;
            fz9Var.c = i;
            fz9Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = vz9Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i7 == 6) {
            TextView textView = (TextView) view;
            if (vz9Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i8 = calendar.get(6);
                    int i9 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i8 && i9 == calendar.get(1)) ? jb6.a0(null, null, 2131743796, jb6.D0().o0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? jb6.D0().v0().format(new Date(intValue)) : jb6.D0().h0().format(new Date(intValue));
                    i4 = 1;
                } catch (Exception e) {
                    i4 = 1;
                    fc4.g(e, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i4];
                objArr[0] = str;
                textView.setText(jb6.a0("EmojiStatusExpireHint", null, 2131751102, objArr));
                return;
            }
            return;
        }
        if (i7 == 0) {
            bz9 bz9Var = (bz9) view;
            if (i == vz9Var.y) {
                bz9Var.a(jb6.M0(2131745382, null), false);
                bz9Var.c.setVisibility(8);
                return;
            }
            if (i == vz9Var.f) {
                bz9Var.a(jb6.M0(2131746094, null), false);
                bz9Var.c.setVisibility(8);
                return;
            }
            if (i == vz9Var.E) {
                bz9Var.a(jb6.M0(2131744565, null), false);
                bz9Var.c.setVisibility(8);
                return;
            }
            bz9Var.c.setVisibility(8);
            if (i == vz9Var.h) {
                bz9Var.a(jb6.M0(2131746834, null), false);
                return;
            }
            if (i == vz9Var.n) {
                bz9Var.a(jb6.M0(2131751112, null), false);
                return;
            }
            int i10 = sparseIntArray.get(i);
            if (i10 < 0) {
                bz9Var.a(null, false);
                return;
            }
            s14 s14Var2 = (s14) arrayList5.get(i10);
            if (s14Var2.d != null) {
                hs6.d0(i6).n0(s14Var2.d, false);
                s14Var2.d = null;
            }
            bz9Var.a(s14Var2.b.title, (i5 == 5 || i5 == 7 || i5 == 6 || s14Var2.e || z8c.h(i6).p()) ? false : true);
            return;
        }
        if (i7 == 1) {
            fz9 fz9Var2 = (fz9) view;
            fz9Var2.c = i;
            ImageReceiver imageReceiver = fz9Var2.n;
            int i11 = vz9Var.b;
            if (i < i11 || i >= vz9Var.c) {
                int i12 = vz9Var.F;
                k39Var = (i < i12 || i >= vz9Var.G) ? (k39) vz9Var.I0.get(i - vz9Var.d) : (k39) vz9Var.K0.get(i - i12);
            } else {
                k39Var = (k39) vz9Var.J0.get(i - i11);
            }
            if (i5 == 13) {
                fz9Var2.b = false;
                fz9Var2.E = true;
                fz9Var2.y = k39Var;
                fz9Var2.setDrawable(gw3.g(k39Var.f));
                fz9Var2.d(vz9Var.K.contains(k39Var), false);
                return;
            }
            fz9Var2.a(ty9Var);
            fz9Var2.E = true;
            fz9Var2.y = k39Var;
            fz9Var2.d(vz9Var.K.contains(k39Var), false);
            fz9Var2.b = false;
            if (k39Var.b || k39Var.f == null) {
                fz9Var2.s = false;
                fz9Var2.e = new gn(k39Var.g, (Paint.FontMetricsInt) null);
                fz9Var2.d = null;
                fz9Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) ty9Var.l3.get(fz9Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = vz9Var.getCacheType();
                    if (cacheType3 == 3 && k39Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = vm.m(i6, fz9Var2.e.getDocumentId(), null, cacheType3);
                    ty9Var.l3.put(fz9Var2.e.getDocumentId(), drawable);
                }
                fz9Var2.setDrawable(drawable);
            } else {
                fz9Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i6).r.get(k39Var.f);
                if (tL_availableReaction != null) {
                    meb f = eq3.f(tL_availableReaction.activate_animation, cmb.l6, 0.2f, null);
                    boolean e2 = e86.e(8200);
                    ImageReceiver imageReceiver2 = fz9Var2.h;
                    TLRPC.Document document2 = tL_availableReaction.select_animation;
                    if (e2) {
                        k39 k39Var2 = k39Var;
                        imageReceiver2.Y(gn5.b(document2), "60_60_pcache", gn5.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f, 0L, "tgs", k39Var2, 0);
                        k39Var = k39Var2;
                    } else {
                        imageReceiver2.Z(gn5.b(document2), "60_60_firstframe", null, null, f, 0L, "tgs", k39Var, 0);
                    }
                    hs6.d0(i6);
                    hs6.n1(imageReceiver, gn5.b(tL_availableReaction.around_animation), g39.a());
                } else {
                    fz9Var2.h.f();
                    imageReceiver.f();
                }
                fz9Var2.e = null;
                fz9Var2.d = null;
                fz9Var2.setDrawable(null);
                ez9 ez9Var = fz9Var2.K;
                if (ez9Var != null) {
                    ez9Var.setVisibility(8);
                    fz9Var2.K.setImageReceiver(null);
                }
            }
            if (!z8c.h(i6).p() && i5 == 14 && k39Var.b && k39Var.d) {
                fz9Var2.b();
                fz9Var2.K.setVisibility(0);
                fz9Var2.setEmojicon(null);
                return;
            }
            if (k39Var.e) {
                fz9Var2.setEmojicon(k39Var.f);
            } else {
                fz9Var2.setEmojicon(null);
            }
            ez9 ez9Var2 = fz9Var2.K;
            if (ez9Var2 != null) {
                ez9Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i7 == 4) {
            az9 az9Var = (az9) view;
            int i13 = vz9Var.z0.get(i);
            s14 s14Var3 = (i13 < 0 || i13 >= arrayList5.size()) ? null : (s14) arrayList5.get(i13);
            if (i13 == -1) {
                vz9Var.H = az9Var;
                az9Var.a.setText("+" + ((arrayList4.size() - 40) + (z4 ? 1 : 0) + 1));
                return;
            }
            az9 az9Var2 = vz9Var.H;
            if (s14Var3 == null) {
                if (az9Var2 == az9Var) {
                    vz9Var.H = null;
                    return;
                }
                return;
            } else {
                if (az9Var2 == az9Var) {
                    vz9Var.H = null;
                }
                TextView textView2 = az9Var.a;
                StringBuilder sb = new StringBuilder("+");
                sb.append(s14Var3.c.size() - 23);
                textView2.setText(sb.toString());
                return;
            }
        }
        if (i7 == 5) {
            zy9 zy9Var = (zy9) view;
            int i14 = vz9Var.A0.get(i);
            if (i14 < 0 || i14 >= arrayList5.size() || (s14Var = (s14) arrayList5.get(i14)) == null) {
                return;
            }
            String str2 = s14Var.b.title;
            boolean z5 = (s14Var.e || z8c.h(i6).p()) ? false : true;
            boolean z6 = s14Var.f;
            wh whVar = new wh((Object) this, (Object) s14Var, i14, (byte) 15);
            cj8 cj8Var = zy9Var.c;
            FrameLayout frameLayout = zy9Var.a;
            zy9Var.d = str2;
            if (z5) {
                i3 = 8;
                frameLayout.setVisibility(8);
                r3 = 0;
                cj8Var.setVisibility(0);
                r11 = 0;
                cj8Var.b(jb6.a0("UnlockPremiumEmojiPack", null, 2131743549, str2), whVar, false);
            } else {
                r3 = 0;
                i3 = 8;
                r11 = 0;
                cj8Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(whVar);
            }
            if (z6) {
                a0 = jb6.M0(2131754359, r11);
                z3 = true;
            } else {
                z3 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r3] = zy9Var.d;
                a0 = jb6.a0("AddStickersCount", r11, 2131754385, objArr2);
            }
            zy9Var.b.c(a0, r3, z3);
            frameLayout.setContentDescription(a0);
            ValueAnimator valueAnimator2 = zy9Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                zy9Var.e = r11;
            }
            frameLayout.setEnabled(!z6);
            frameLayout.setAlpha(z6 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = zy9Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                zy9Var.n = null;
            }
            Boolean bool = zy9Var.h;
            if (bool == null || bool.booleanValue() != z5) {
                zy9Var.h = Boolean.valueOf(z5);
                float f2 = z5 ? 1.0f : 0.0f;
                zy9Var.f = f2;
                frameLayout.setAlpha(1.0f - f2);
                cj8Var.setAlpha(zy9Var.f);
                cj8Var.setScaleX(zy9Var.f);
                cj8Var.setScaleY(zy9Var.f);
                cj8Var.setVisibility(zy9Var.h.booleanValue() ? 0 : i3);
                return;
            }
            return;
        }
        if (i7 == 7 || i7 == 9) {
            return;
        }
        fz9 fz9Var3 = (fz9) view;
        fz9Var3.w = null;
        fz9Var3.x = null;
        fz9Var3.a = false;
        fz9Var3.c = i;
        fz9Var3.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
        int size = ((i5 == 4 && vz9Var.R) || i5 == 6) ? arrayList3.size() : (i5 == 4 || i5 == 3) ? arrayList4.size() : (arrayList4.size() <= 40 || vz9Var.D0) ? arrayList4.size() + (z4 ? 1 : 0) : 40;
        if (z4) {
            if (i == (vz9Var.a != -1 ? 1 : 0) + (vz9Var.w != -1 ? 1 : 0)) {
                z2 = hashSet.contains(null);
                fz9Var3.a = true;
                fz9Var3.setPadding(gm.L(5.0f), gm.L(5.0f), gm.L(5.0f), gm.L(5.0f));
                fz9Var3.e = null;
                fz9Var3.d = null;
                fz9Var3.R = false;
                ImageReceiver imageReceiver3 = fz9Var3.h;
                if (imageReceiver3 != null) {
                    imageReceiver3.f();
                }
                gnVar = fz9Var3.e;
                if (gnVar == null) {
                    vm vmVar = (vm) ty9Var.l3.get(gnVar.getDocumentId());
                    if (vmVar == null) {
                        if (fz9Var3.e.document != null) {
                            cacheType2 = vz9Var.getCacheType();
                            vmVar = vm.l(i6, cacheType2, fz9Var3.e.document);
                        } else {
                            cacheType = vz9Var.getCacheType();
                            vmVar = vm.m(i6, fz9Var3.e.getDocumentId(), null, cacheType);
                        }
                        ty9Var.l3.put(fz9Var3.e.getDocumentId(), vmVar);
                    }
                    fz9Var3.setDrawable(vmVar);
                } else {
                    fz9Var3.setDrawable(null);
                }
                fz9Var3.d(z2, false);
            }
        }
        if (i5 == 13) {
            if ((i - (vz9Var.a != -1 ? 1 : 0)) - (vz9Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i - (vz9Var.a != -1 ? 1 : 0)) - (vz9Var.w != -1 ? 1 : 0)) - (z4 ? 1 : 0));
                fz9Var3.b = false;
                fz9Var3.E = false;
                fz9Var3.y = k39.b(str3);
                fz9Var3.setDrawable(gw3.g(str3));
                fz9Var3.d(vz9Var.K.contains(fz9Var3.y), false);
                return;
            }
        }
        int i15 = vz9Var.a;
        int i16 = i - (i15 != -1 ? 1 : 0);
        int i17 = vz9Var.w;
        if (i16 - (i17 != -1 ? 1 : 0) < size) {
            int i18 = ((i - (i15 != -1 ? 1 : 0)) - (i17 != -1 ? 1 : 0)) - (z4 ? 1 : 0);
            if (i5 == 4 && vz9Var.R) {
                fz9Var3.c((TLRPC.Document) arrayList3.get(i18), ty9Var);
            } else {
                if (i5 == 6) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList3.get(i18);
                    fz9Var3.c(document3, ty9Var);
                    if (document3 != null && hashSet.contains(Long.valueOf(document3.id))) {
                        z = true;
                    }
                } else {
                    gn gnVar2 = (gn) arrayList4.get(i18);
                    fz9Var3.e = gnVar2;
                    fz9Var3.d = gnVar2 == null ? null : gnVar2.document;
                    z = gnVar2 != null && hashSet.contains(Long.valueOf(gnVar2.getDocumentId()));
                    fz9Var3.R = false;
                    ImageReceiver imageReceiver4 = fz9Var3.h;
                    if (imageReceiver4 != null) {
                        imageReceiver4.f();
                    }
                }
                z2 = z;
            }
            z = false;
            z2 = z;
        } else {
            if (arrayList6.isEmpty() || (i2 = i - vz9Var.r) < 0 || i2 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (td4.f(i - (vz9Var.a != -1 ? 1 : 0), vz9Var.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (td4.f(i - (vz9Var.a != -1 ? 1 : 0), vz9Var.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            gn gnVar3 = (gn) arrayList2.get(td4.f(i - (vz9Var.a != -1 ? 1 : 0), vz9Var.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            fz9Var3.e = gnVar3;
                            fz9Var3.d = gnVar3 == null ? null : gnVar3.document;
                            z = gnVar3 != null && hashSet.contains(Long.valueOf(gnVar3.getDocumentId()));
                            fz9Var3.R = false;
                            ImageReceiver imageReceiver5 = fz9Var3.h;
                            if (imageReceiver5 != null) {
                                imageReceiver5.f();
                            }
                        }
                    }
                }
                for (int i19 = 0; i19 < sparseIntArray.size(); i19++) {
                    int keyAt = sparseIntArray.keyAt(i19);
                    int valueAt = sparseIntArray.valueAt(i19);
                    s14 s14Var4 = valueAt >= 0 ? (s14) arrayList5.get(valueAt) : null;
                    if (s14Var4 != null) {
                        boolean z7 = s14Var4.h;
                        ArrayList arrayList7 = s14Var4.c;
                        int size2 = z7 ? arrayList7.size() : Math.min(arrayList7.size(), 24);
                        int i20 = (i - keyAt) - 1;
                        if (i20 >= 0 && i20 < size2 && (document = (TLRPC.Document) s14Var4.c.get(i20)) != null) {
                            if (vz9Var.R) {
                                fz9Var3.c(document, vz9Var.j0);
                            } else {
                                fz9Var3.R = false;
                                ImageReceiver imageReceiver6 = fz9Var3.h;
                                if (imageReceiver6 != null) {
                                    imageReceiver6.f();
                                }
                                fz9Var3.e = new gn(document, (Paint.FontMetricsInt) null);
                            }
                            fz9Var3.d = document;
                        }
                    }
                }
                gn gnVar4 = fz9Var3.e;
                if (gnVar4 != null && hashSet.contains(Long.valueOf(gnVar4.getDocumentId()))) {
                    z = true;
                }
                z = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i - vz9Var.r);
                TLRPC.Document document4 = tL_starGiftUnique.getDocument();
                fz9Var3.e = new gn(document4, (Paint.FontMetricsInt) null);
                fz9Var3.d = document4;
                fz9Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    fz9Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z = fz9Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                fz9Var3.R = false;
                ImageReceiver imageReceiver7 = fz9Var3.h;
                if (imageReceiver7 != null) {
                    imageReceiver7.f();
                }
            }
            z2 = z;
        }
        gnVar = fz9Var3.e;
        if (gnVar == null) {
        }
        fz9Var3.d(z2, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        vz9 vz9Var = this.c;
        int i2 = vz9Var.a0;
        ylb ylbVar = vz9Var.a1;
        if (i == 0) {
            view = new bz9(vz9Var, vz9Var.getContext(), i2 == 6);
        } else if (i == 2) {
            view = new ImageView(vz9Var.getContext());
        } else if (i == 3 || i == 1 || i == 8) {
            fz9 fz9Var = new fz9(vz9Var, vz9Var.getContext());
            if (i == 8) {
                fz9Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(fz9Var);
                fz9Var.h = imageReceiver;
                fz9Var.r = imageReceiver;
                imageReceiver.g0(vz9Var.O);
                vz9Var.P = fz9Var;
                fz9Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            }
            view = fz9Var;
        } else if (i == 4) {
            Context context = vz9Var.getContext();
            az9 az9Var = new az9(context);
            TextView textView = new TextView(context);
            az9Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int v = vz9Var.h1 ? cmb.v(vz9Var.g1, cmb.p1(0.4f, cmb.w0(null, cmb.c6, false))) : on2.p(cmb.w0(null, cmb.Kf, false), 99);
            if (vz9Var.h1) {
                textView.setBackground(cmb.b0(gm.L(11.0f), v));
            } else {
                ShapeDrawable b0 = cmb.b0(gm.L(11.0f), v);
                wmb g = anb.g(cmb.Kf, 99);
                textView.setBackground(b0);
                anb.j(textView, b0, g, null, null);
            }
            textView.setTypeface(gm.o());
            textView.setPadding(gm.L(4.0f), gm.L(1.66f), gm.L(4.0f), gm.L(2.0f));
            az9Var.addView(textView, qoe.e(-2, -2, 17));
            view = az9Var;
        } else if (i == 5) {
            zy9 zy9Var = new zy9(vz9Var.getContext());
            rj rjVar = new rj(zy9Var.getContext(), false, false, false, (byte) 3);
            zy9Var.b = rjVar;
            rjVar.b(0.3f, 250L, d53.h);
            rjVar.setTextSize(gm.L(14.0f));
            rjVar.setTypeface(gm.o());
            anb.U(rjVar, cmb.Ii, ylbVar);
            rjVar.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(zy9Var.getContext());
            zy9Var.a = frameLayout;
            int i3 = cmb.Ei;
            fg0 e = ulb.e(cmb.v0(i3, ylbVar), 8.0f);
            wmb M = anb.M(i3);
            wmb e2 = anb.e(i3);
            frameLayout.setBackground(e);
            anb.j(frameLayout, e, M, e2, ylbVar);
            frameLayout.addView(rjVar, qoe.e(-1, -2, 17));
            zy9Var.addView(frameLayout, qoe.c(-1.0f, -1));
            cj8 cj8Var = new cj8(ylbVar, zy9Var.getContext(), false);
            zy9Var.c = cj8Var;
            cj8Var.setIcon(R.raw.unlock_icon);
            zy9Var.addView(cj8Var, qoe.c(-1.0f, -1));
            view = zy9Var;
        } else if (i == 6) {
            qz8 qz8Var = new qz8(vz9Var.getContext(), (byte) 1);
            qz8Var.setTextSize(1, 13.0f);
            if (i2 == 3) {
                qz8Var.setText(jb6.M0(2131745382, null));
            } else if (i2 == 0 || i2 == 12 || i2 == 9 || i2 == 10) {
                qz8Var.setText(jb6.M0(2131751113, null));
            } else {
                qz8Var.setText(jb6.M0(2131746113, null));
            }
            qz8Var.setGravity(17);
            anb.X(qz8Var, cmb.x6, ylbVar);
            view = qz8Var;
        } else if (i == 7) {
            View ak4Var = new ak4(vz9Var.getContext(), 52, (byte) 0);
            ak4Var.setTag("searchbox");
            view = ak4Var;
        } else {
            view = new fz9(vz9Var, vz9Var.getContext());
        }
        if (vz9Var.g()) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new b59(view);
    }
}
