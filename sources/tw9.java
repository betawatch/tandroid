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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tw9 extends n39 {
    public final /* synthetic */ tx9 c;

    public tw9(tx9 tx9Var) {
        this.c = tx9Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 2 || i == 1 || i == 3 || i == 8;
    }

    @Override // w39
    public final int b() {
        return this.c.v0;
    }

    @Override // w39
    public final long c(int i) {
        return Math.abs(((Long) this.c.w0.get(i)).longValue());
    }

    @Override // w39
    public final int d(int i) {
        tx9 tx9Var = this.c;
        if (i == tx9Var.a) {
            return 7;
        }
        if (i >= tx9Var.b && i < tx9Var.c) {
            return 1;
        }
        if (i >= tx9Var.d && i < tx9Var.e) {
            return 1;
        }
        if (i >= tx9Var.F && i < tx9Var.G) {
            return 1;
        }
        if (i >= tx9Var.r && i < tx9Var.s) {
            return 3;
        }
        if (tx9Var.z0.indexOfKey(i) >= 0) {
            return 4;
        }
        if (tx9Var.A0.indexOfKey(i) >= 0) {
            return 5;
        }
        if (i == tx9Var.w) {
            return 6;
        }
        if (tx9Var.x0.indexOfKey(i) >= 0 || i == tx9Var.f || i == tx9Var.E || i == tx9Var.n || i == tx9Var.h || i == tx9Var.y) {
            return 0;
        }
        return i == tx9Var.x ? 8 : 3;
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        boolean z;
        TLRPC.Document document;
        int i2;
        boolean z2;
        gm gmVar;
        int cacheType;
        int cacheType2;
        h04 h04Var;
        ?? r3;
        int i3;
        ?? r11;
        boolean z3;
        String a0;
        h19 h19Var;
        int cacheType3;
        int i4;
        String str;
        tx9 tx9Var = this.c;
        ArrayList arrayList = tx9Var.H0;
        ArrayList arrayList2 = tx9Var.L0;
        ArrayList arrayList3 = tx9Var.G0;
        SparseIntArray sparseIntArray = tx9Var.x0;
        boolean z4 = tx9Var.O0;
        ArrayList arrayList4 = tx9Var.E0;
        int i5 = tx9Var.a0;
        ArrayList arrayList5 = tx9Var.N0;
        rw9 rw9Var = tx9Var.i0;
        HashSet hashSet = tx9Var.L;
        int i6 = tx9Var.W;
        ArrayList arrayList6 = tx9Var.F0;
        int i7 = s49Var.f;
        View view = s49Var.a;
        if (i7 == 8) {
            dx9 dx9Var = (dx9) view;
            dx9Var.c = i;
            dx9Var.M = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = tx9Var.W1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (i7 == 6) {
            TextView textView = (TextView) view;
            if (tx9Var.Q0 != null) {
                long intValue = r0.intValue() * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i8 = calendar.get(6);
                    int i9 = calendar.get(1);
                    calendar.setTimeInMillis(intValue);
                    str = (calendar.get(6) == i8 && i9 == calendar.get(1)) ? k96.a0(null, null, 2131743870, k96.D0().o0().format(new Date(intValue))) : Math.abs(System.currentTimeMillis() - intValue) < 31536000000L ? k96.D0().v0().format(new Date(intValue)) : k96.D0().h0().format(new Date(intValue));
                    i4 = 1;
                } catch (Exception e) {
                    i4 = 1;
                    fa4.g(e, true);
                    str = "LOC_ERR";
                }
                Object[] objArr = new Object[i4];
                objArr[0] = str;
                textView.setText(k96.a0("EmojiStatusExpireHint", null, 2131751153, objArr));
                return;
            }
            return;
        }
        if (i7 == 0) {
            zw9 zw9Var = (zw9) view;
            if (i == tx9Var.y) {
                zw9Var.a(k96.M0(2131745456, null), false);
                zw9Var.c.setVisibility(8);
                return;
            }
            if (i == tx9Var.f) {
                zw9Var.a(k96.M0(2131746168, null), false);
                zw9Var.c.setVisibility(8);
                return;
            }
            if (i == tx9Var.E) {
                zw9Var.a(k96.M0(2131744639, null), false);
                zw9Var.c.setVisibility(8);
                return;
            }
            zw9Var.c.setVisibility(8);
            if (i == tx9Var.h) {
                zw9Var.a(k96.M0(2131746908, null), false);
                return;
            }
            if (i == tx9Var.n) {
                zw9Var.a(k96.M0(2131751163, null), false);
                return;
            }
            int i10 = sparseIntArray.get(i);
            if (i10 < 0) {
                zw9Var.a(null, false);
                return;
            }
            h04 h04Var2 = (h04) arrayList5.get(i10);
            if (h04Var2.d != null) {
                hq6.d0(i6).n0(h04Var2.d, false);
                h04Var2.d = null;
            }
            zw9Var.a(h04Var2.b.title, (i5 == 5 || i5 == 7 || i5 == 6 || h04Var2.e || y6c.h(i6).p()) ? false : true);
            return;
        }
        if (i7 == 1) {
            dx9 dx9Var2 = (dx9) view;
            dx9Var2.c = i;
            ImageReceiver imageReceiver = dx9Var2.n;
            int i11 = tx9Var.b;
            if (i < i11 || i >= tx9Var.c) {
                int i12 = tx9Var.F;
                h19Var = (i < i12 || i >= tx9Var.G) ? (h19) tx9Var.I0.get(i - tx9Var.d) : (h19) tx9Var.K0.get(i - i12);
            } else {
                h19Var = (h19) tx9Var.J0.get(i - i11);
            }
            if (i5 == 13) {
                dx9Var2.b = false;
                dx9Var2.E = true;
                dx9Var2.y = h19Var;
                dx9Var2.setDrawable(vu3.g(h19Var.f));
                dx9Var2.d(tx9Var.K.contains(h19Var), false);
                return;
            }
            dx9Var2.a(rw9Var);
            dx9Var2.E = true;
            dx9Var2.y = h19Var;
            dx9Var2.d(tx9Var.K.contains(h19Var), false);
            dx9Var2.b = false;
            if (h19Var.b || h19Var.f == null) {
                dx9Var2.s = false;
                dx9Var2.e = new gm(h19Var.g, (Paint.FontMetricsInt) null);
                dx9Var2.d = null;
                dx9Var2.h.f();
                imageReceiver.f();
                Drawable drawable = (Drawable) rw9Var.l3.get(dx9Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = tx9Var.getCacheType();
                    if (cacheType3 == 3 && h19Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = vl.m(i6, dx9Var2.e.getDocumentId(), null, cacheType3);
                    rw9Var.l3.put(dx9Var2.e.getDocumentId(), drawable);
                }
                dx9Var2.setDrawable(drawable);
            } else {
                dx9Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i6).r.get(h19Var.f);
                if (tL_availableReaction != null) {
                    kcb f = uo3.f(tL_availableReaction.activate_animation, bkb.l6, 0.2f, null);
                    boolean e2 = e66.e(8200);
                    ImageReceiver imageReceiver2 = dx9Var2.h;
                    TLRPC.Document document2 = tL_availableReaction.select_animation;
                    if (e2) {
                        h19 h19Var2 = h19Var;
                        imageReceiver2.Y(gl5.b(document2), "60_60_pcache", gl5.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f, 0L, "tgs", h19Var2, 0);
                        h19Var = h19Var2;
                    } else {
                        imageReceiver2.Z(gl5.b(document2), "60_60_firstframe", null, null, f, 0L, "tgs", h19Var, 0);
                    }
                    hq6.d0(i6);
                    hq6.n1(imageReceiver, gl5.b(tL_availableReaction.around_animation), d19.a());
                } else {
                    dx9Var2.h.f();
                    imageReceiver.f();
                }
                dx9Var2.e = null;
                dx9Var2.d = null;
                dx9Var2.setDrawable(null);
                cx9 cx9Var = dx9Var2.K;
                if (cx9Var != null) {
                    cx9Var.setVisibility(8);
                    dx9Var2.K.setImageReceiver(null);
                }
            }
            if (!y6c.h(i6).p() && i5 == 14 && h19Var.b && h19Var.d) {
                dx9Var2.b();
                dx9Var2.K.setVisibility(0);
                dx9Var2.setEmojicon(null);
                return;
            }
            if (h19Var.e) {
                dx9Var2.setEmojicon(h19Var.f);
            } else {
                dx9Var2.setEmojicon(null);
            }
            cx9 cx9Var2 = dx9Var2.K;
            if (cx9Var2 != null) {
                cx9Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i7 == 4) {
            yw9 yw9Var = (yw9) view;
            int i13 = tx9Var.z0.get(i);
            h04 h04Var3 = (i13 < 0 || i13 >= arrayList5.size()) ? null : (h04) arrayList5.get(i13);
            if (i13 == -1) {
                tx9Var.H = yw9Var;
                yw9Var.a.setText("+" + ((arrayList4.size() - 40) + (z4 ? 1 : 0) + 1));
                return;
            }
            yw9 yw9Var2 = tx9Var.H;
            if (h04Var3 == null) {
                if (yw9Var2 == yw9Var) {
                    tx9Var.H = null;
                    return;
                }
                return;
            } else {
                if (yw9Var2 == yw9Var) {
                    tx9Var.H = null;
                }
                TextView textView2 = yw9Var.a;
                StringBuilder sb = new StringBuilder("+");
                sb.append(h04Var3.c.size() - 23);
                textView2.setText(sb.toString());
                return;
            }
        }
        if (i7 == 5) {
            xw9 xw9Var = (xw9) view;
            int i14 = tx9Var.A0.get(i);
            if (i14 < 0 || i14 >= arrayList5.size() || (h04Var = (h04) arrayList5.get(i14)) == null) {
                return;
            }
            String str2 = h04Var.b.title;
            boolean z5 = (h04Var.e || y6c.h(i6).p()) ? false : true;
            boolean z6 = h04Var.f;
            wg wgVar = new wg((Object) this, (Object) h04Var, i14, (byte) 15);
            ah8 ah8Var = xw9Var.c;
            FrameLayout frameLayout = xw9Var.a;
            xw9Var.d = str2;
            if (z5) {
                i3 = 8;
                frameLayout.setVisibility(8);
                r3 = 0;
                ah8Var.setVisibility(0);
                r11 = 0;
                ah8Var.b(k96.a0("UnlockPremiumEmojiPack", null, 2131743623, str2), wgVar, false);
            } else {
                r3 = 0;
                i3 = 8;
                r11 = 0;
                ah8Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(wgVar);
            }
            if (z6) {
                a0 = k96.M0(2131754359, r11);
                z3 = true;
            } else {
                z3 = true;
                Object[] objArr2 = new Object[1];
                objArr2[r3] = xw9Var.d;
                a0 = k96.a0("AddStickersCount", r11, 2131754385, objArr2);
            }
            xw9Var.b.c(a0, r3, z3);
            frameLayout.setContentDescription(a0);
            ValueAnimator valueAnimator2 = xw9Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                xw9Var.e = r11;
            }
            frameLayout.setEnabled(!z6);
            frameLayout.setAlpha(z6 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = xw9Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                xw9Var.n = null;
            }
            Boolean bool = xw9Var.h;
            if (bool == null || bool.booleanValue() != z5) {
                xw9Var.h = Boolean.valueOf(z5);
                float f2 = z5 ? 1.0f : 0.0f;
                xw9Var.f = f2;
                frameLayout.setAlpha(1.0f - f2);
                ah8Var.setAlpha(xw9Var.f);
                ah8Var.setScaleX(xw9Var.f);
                ah8Var.setScaleY(xw9Var.f);
                ah8Var.setVisibility(xw9Var.h.booleanValue() ? 0 : i3);
                return;
            }
            return;
        }
        if (i7 == 7 || i7 == 9) {
            return;
        }
        dx9 dx9Var3 = (dx9) view;
        dx9Var3.w = null;
        dx9Var3.x = null;
        dx9Var3.a = false;
        dx9Var3.c = i;
        dx9Var3.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
        int size = ((i5 == 4 && tx9Var.R) || i5 == 6) ? arrayList3.size() : (i5 == 4 || i5 == 3) ? arrayList4.size() : (arrayList4.size() <= 40 || tx9Var.D0) ? arrayList4.size() + (z4 ? 1 : 0) : 40;
        if (z4) {
            if (i == (tx9Var.a != -1 ? 1 : 0) + (tx9Var.w != -1 ? 1 : 0)) {
                z2 = hashSet.contains(null);
                dx9Var3.a = true;
                dx9Var3.setPadding(gl.L(5.0f), gl.L(5.0f), gl.L(5.0f), gl.L(5.0f));
                dx9Var3.e = null;
                dx9Var3.d = null;
                dx9Var3.R = false;
                ImageReceiver imageReceiver3 = dx9Var3.h;
                if (imageReceiver3 != null) {
                    imageReceiver3.f();
                }
                gmVar = dx9Var3.e;
                if (gmVar == null) {
                    vl vlVar = (vl) rw9Var.l3.get(gmVar.getDocumentId());
                    if (vlVar == null) {
                        if (dx9Var3.e.document != null) {
                            cacheType2 = tx9Var.getCacheType();
                            vlVar = vl.l(i6, cacheType2, dx9Var3.e.document);
                        } else {
                            cacheType = tx9Var.getCacheType();
                            vlVar = vl.m(i6, dx9Var3.e.getDocumentId(), null, cacheType);
                        }
                        rw9Var.l3.put(dx9Var3.e.getDocumentId(), vlVar);
                    }
                    dx9Var3.setDrawable(vlVar);
                } else {
                    dx9Var3.setDrawable(null);
                }
                dx9Var3.d(z2, false);
            }
        }
        if (i5 == 13) {
            if ((i - (tx9Var.a != -1 ? 1 : 0)) - (tx9Var.w != -1 ? 1 : 0) < arrayList.size()) {
                String str3 = (String) arrayList.get(((i - (tx9Var.a != -1 ? 1 : 0)) - (tx9Var.w != -1 ? 1 : 0)) - (z4 ? 1 : 0));
                dx9Var3.b = false;
                dx9Var3.E = false;
                dx9Var3.y = h19.b(str3);
                dx9Var3.setDrawable(vu3.g(str3));
                dx9Var3.d(tx9Var.K.contains(dx9Var3.y), false);
                return;
            }
        }
        int i15 = tx9Var.a;
        int i16 = i - (i15 != -1 ? 1 : 0);
        int i17 = tx9Var.w;
        if (i16 - (i17 != -1 ? 1 : 0) < size) {
            int i18 = ((i - (i15 != -1 ? 1 : 0)) - (i17 != -1 ? 1 : 0)) - (z4 ? 1 : 0);
            if (i5 == 4 && tx9Var.R) {
                dx9Var3.c((TLRPC.Document) arrayList3.get(i18), rw9Var);
            } else {
                if (i5 == 6) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList3.get(i18);
                    dx9Var3.c(document3, rw9Var);
                    if (document3 != null && hashSet.contains(Long.valueOf(document3.id))) {
                        z = true;
                    }
                } else {
                    gm gmVar2 = (gm) arrayList4.get(i18);
                    dx9Var3.e = gmVar2;
                    dx9Var3.d = gmVar2 == null ? null : gmVar2.document;
                    z = gmVar2 != null && hashSet.contains(Long.valueOf(gmVar2.getDocumentId()));
                    dx9Var3.R = false;
                    ImageReceiver imageReceiver4 = dx9Var3.h;
                    if (imageReceiver4 != null) {
                        imageReceiver4.f();
                    }
                }
                z2 = z;
            }
            z = false;
            z2 = z;
        } else {
            if (arrayList6.isEmpty() || (i2 = i - tx9Var.r) < 0 || i2 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (tb4.f(i - (tx9Var.a != -1 ? 1 : 0), tx9Var.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (tb4.f(i - (tx9Var.a != -1 ? 1 : 0), tx9Var.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            gm gmVar3 = (gm) arrayList2.get(tb4.f(i - (tx9Var.a != -1 ? 1 : 0), tx9Var.w != -1 ? 1 : 0, size, 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            dx9Var3.e = gmVar3;
                            dx9Var3.d = gmVar3 == null ? null : gmVar3.document;
                            z = gmVar3 != null && hashSet.contains(Long.valueOf(gmVar3.getDocumentId()));
                            dx9Var3.R = false;
                            ImageReceiver imageReceiver5 = dx9Var3.h;
                            if (imageReceiver5 != null) {
                                imageReceiver5.f();
                            }
                        }
                    }
                }
                for (int i19 = 0; i19 < sparseIntArray.size(); i19++) {
                    int keyAt = sparseIntArray.keyAt(i19);
                    int valueAt = sparseIntArray.valueAt(i19);
                    h04 h04Var4 = valueAt >= 0 ? (h04) arrayList5.get(valueAt) : null;
                    if (h04Var4 != null) {
                        boolean z7 = h04Var4.h;
                        ArrayList arrayList7 = h04Var4.c;
                        int size2 = z7 ? arrayList7.size() : Math.min(arrayList7.size(), 24);
                        int i20 = (i - keyAt) - 1;
                        if (i20 >= 0 && i20 < size2 && (document = (TLRPC.Document) h04Var4.c.get(i20)) != null) {
                            if (tx9Var.R) {
                                dx9Var3.c(document, tx9Var.j0);
                            } else {
                                dx9Var3.R = false;
                                ImageReceiver imageReceiver6 = dx9Var3.h;
                                if (imageReceiver6 != null) {
                                    imageReceiver6.f();
                                }
                                dx9Var3.e = new gm(document, (Paint.FontMetricsInt) null);
                            }
                            dx9Var3.d = document;
                        }
                    }
                }
                gm gmVar4 = dx9Var3.e;
                if (gmVar4 != null && hashSet.contains(Long.valueOf(gmVar4.getDocumentId()))) {
                    z = true;
                }
                z = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i - tx9Var.r);
                TLRPC.Document document4 = tL_starGiftUnique.getDocument();
                dx9Var3.e = new gm(document4, (Paint.FontMetricsInt) null);
                dx9Var3.d = document4;
                dx9Var3.w = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    dx9Var3.x = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z = dx9Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                dx9Var3.R = false;
                ImageReceiver imageReceiver7 = dx9Var3.h;
                if (imageReceiver7 != null) {
                    imageReceiver7.f();
                }
            }
            z2 = z;
        }
        gmVar = dx9Var3.e;
        if (gmVar == null) {
        }
        dx9Var3.d(z2, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        tx9 tx9Var = this.c;
        int i2 = tx9Var.a0;
        wjb wjbVar = tx9Var.a1;
        if (i == 0) {
            view = new zw9(tx9Var, tx9Var.getContext(), i2 == 6);
        } else if (i == 2) {
            view = new ImageView(tx9Var.getContext());
        } else if (i == 3 || i == 1 || i == 8) {
            dx9 dx9Var = new dx9(tx9Var, tx9Var.getContext());
            if (i == 8) {
                dx9Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(dx9Var);
                dx9Var.h = imageReceiver;
                dx9Var.r = imageReceiver;
                imageReceiver.g0(tx9Var.O);
                tx9Var.P = dx9Var;
                dx9Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            }
            view = dx9Var;
        } else if (i == 4) {
            Context context = tx9Var.getContext();
            yw9 yw9Var = new yw9(context);
            TextView textView = new TextView(context);
            yw9Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            int v = tx9Var.h1 ? bkb.v(tx9Var.g1, bkb.p1(0.4f, bkb.w0(null, bkb.c6, false))) : bm2.o(bkb.w0(null, bkb.Kf, false), 99);
            if (tx9Var.h1) {
                textView.setBackground(bkb.b0(gl.L(11.0f), v));
            } else {
                ShapeDrawable b0 = bkb.b0(gl.L(11.0f), v);
                vkb g = zkb.g(bkb.Kf, 99);
                textView.setBackground(b0);
                zkb.j(textView, b0, g, null, null);
            }
            textView.setTypeface(gl.o());
            textView.setPadding(gl.L(4.0f), gl.L(1.66f), gl.L(4.0f), gl.L(2.0f));
            yw9Var.addView(textView, nme.e(-2, -2, 17));
            view = yw9Var;
        } else if (i == 5) {
            xw9 xw9Var = new xw9(tx9Var.getContext());
            ri riVar = new ri(xw9Var.getContext(), false, false, false, (byte) 3);
            xw9Var.b = riVar;
            riVar.b(0.3f, 250L, s33.h);
            riVar.setTextSize(gl.L(14.0f));
            riVar.setTypeface(gl.o());
            zkb.U(riVar, bkb.Ii, wjbVar);
            riVar.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(xw9Var.getContext());
            xw9Var.a = frameLayout;
            int i3 = bkb.Ei;
            ff0 e = sjb.e(bkb.v0(i3, wjbVar), 8.0f);
            vkb M = zkb.M(i3);
            vkb e2 = zkb.e(i3);
            frameLayout.setBackground(e);
            zkb.j(frameLayout, e, M, e2, wjbVar);
            frameLayout.addView(riVar, nme.e(-1, -2, 17));
            xw9Var.addView(frameLayout, nme.c(-1.0f, -1));
            ah8 ah8Var = new ah8(wjbVar, xw9Var.getContext(), false);
            xw9Var.c = ah8Var;
            ah8Var.setIcon(R.raw.unlock_icon);
            xw9Var.addView(ah8Var, nme.c(-1.0f, -1));
            view = xw9Var;
        } else if (i == 6) {
            px8 px8Var = new px8(tx9Var.getContext(), (byte) 1);
            px8Var.setTextSize(1, 13.0f);
            if (i2 == 3) {
                px8Var.setText(k96.M0(2131745456, null));
            } else if (i2 == 0 || i2 == 12 || i2 == 9 || i2 == 10) {
                px8Var.setText(k96.M0(2131751164, null));
            } else {
                px8Var.setText(k96.M0(2131746187, null));
            }
            px8Var.setGravity(17);
            zkb.X(px8Var, bkb.x6, wjbVar);
            view = px8Var;
        } else if (i == 7) {
            View wh4Var = new wh4(tx9Var.getContext(), 52, (byte) 0);
            wh4Var.setTag("searchbox");
            view = wh4Var;
        } else {
            view = new dx9(tx9Var, tx9Var.getContext());
        }
        if (tx9Var.g()) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new y29(view);
    }
}
