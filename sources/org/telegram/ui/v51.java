package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v51 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ w61 c;

    public v51(w61 w61Var) {
        this.c = w61Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.r0;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.s0.get(i10)).longValue());
    }

    @Override // f2.p0
    public final int j(int i10) {
        w61 w61Var = this.c;
        if (i10 == w61Var.a) {
            return 7;
        }
        if (i10 >= w61Var.b && i10 < w61Var.c) {
            return 1;
        }
        if (i10 >= w61Var.d && i10 < w61Var.e) {
            return 1;
        }
        if (i10 >= w61Var.B && i10 < w61Var.C) {
            return 1;
        }
        if (i10 >= w61Var.r && i10 < w61Var.s) {
            return 3;
        }
        if (w61Var.v0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (w61Var.w0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == w61Var.v) {
            return 6;
        }
        if (w61Var.t0.indexOfKey(i10) >= 0 || i10 == w61Var.f || i10 == w61Var.y || i10 == w61Var.n || i10 == w61Var.h || i10 == w61Var.x) {
            return 0;
        }
        return i10 == w61Var.w ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0725, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0771  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        int size;
        boolean z4;
        TLRPC.Document document;
        int i11;
        boolean z10;
        org.telegram.ui.Components.u5 u5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.xx xxVar;
        ?? r92;
        boolean z11;
        String formatString;
        ng.q0 q0Var;
        int cacheType3;
        w61 w61Var = this.c;
        ArrayList arrayList = w61Var.D0;
        ArrayList arrayList2 = w61Var.H0;
        ArrayList arrayList3 = w61Var.C0;
        SparseIntArray sparseIntArray = w61Var.t0;
        boolean z12 = w61Var.K0;
        ArrayList arrayList4 = w61Var.A0;
        int i12 = w61Var.T;
        ArrayList arrayList5 = w61Var.J0;
        t51 t51Var = w61Var.e0;
        HashSet hashSet = w61Var.H;
        ArrayList arrayList6 = w61Var.B0;
        int i13 = w61Var.S;
        int i14 = m1Var.f;
        View view = m1Var.a;
        if (i14 == 8) {
            f61 f61Var = (f61) view;
            f61Var.c = i10;
            f61Var.I = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = w61Var.R1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z13 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (w61Var.M0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            b61 b61Var = (b61) view;
            if (i10 == w61Var.x) {
                b61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                b61Var.c.setVisibility(8);
                return;
            }
            if (i10 == w61Var.f) {
                b61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                b61Var.c.setVisibility(8);
                return;
            }
            if (i10 == w61Var.y) {
                b61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                b61Var.c.setVisibility(8);
                return;
            }
            b61Var.c.setVisibility(8);
            if (i10 == w61Var.h) {
                b61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == w61Var.n) {
                b61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                b61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.xx xxVar2 = (org.telegram.ui.Components.xx) arrayList5.get(i15);
            if (xxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(xxVar2.d, false);
                xxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !xxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z13 = true;
            }
            b61Var.a(xxVar2.b.title, z13);
            return;
        }
        if (i14 == 1) {
            f61 f61Var2 = (f61) view;
            f61Var2.c = i10;
            ImageReceiver imageReceiver = f61Var2.n;
            int i16 = w61Var.b;
            if (i10 < i16 || i10 >= w61Var.c) {
                int i17 = w61Var.B;
                q0Var = (i10 < i17 || i10 >= w61Var.C) ? (ng.q0) w61Var.E0.get(i10 - w61Var.d) : (ng.q0) w61Var.G0.get(i10 - i17);
            } else {
                q0Var = (ng.q0) w61Var.F0.get(i10 - i16);
            }
            if (i12 == 13) {
                f61Var2.b = false;
                f61Var2.y = true;
                f61Var2.x = q0Var;
                f61Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
                f61Var2.d(w61Var.G.contains(q0Var), false);
                return;
            }
            f61Var2.a(t51Var);
            f61Var2.y = true;
            f61Var2.x = q0Var;
            f61Var2.d(w61Var.G.contains(q0Var), false);
            f61Var2.b = false;
            if (q0Var.b || q0Var.f == null) {
                f61Var2.s = false;
                f61Var2.e = new org.telegram.ui.Components.u5(q0Var.g, (Paint.FontMetricsInt) null);
                f61Var2.d = null;
                f61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) t51Var.a3.get(f61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = w61Var.getCacheType();
                    if (cacheType3 == 3 && q0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.l5.n(i13, f61Var2.e.getDocumentId(), null, cacheType3);
                    t51Var.a3.put(f61Var2.e.getDocumentId(), drawable);
                }
                f61Var2.setDrawable(drawable);
            } else {
                f61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        ng.q0 q0Var2 = q0Var;
                        f61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    } else {
                        f61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ng.m0.a());
                } else {
                    f61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                f61Var2.e = null;
                f61Var2.d = null;
                f61Var2.setDrawable(null);
                e61 e61Var = f61Var2.G;
                if (e61Var != null) {
                    e61Var.setVisibility(8);
                    f61Var2.G.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && q0Var.b && q0Var.d) {
                f61Var2.b();
                f61Var2.G.setVisibility(0);
                f61Var2.setEmojicon(null);
                return;
            }
            if (q0Var.e) {
                f61Var2.setEmojicon(q0Var.f);
            } else {
                f61Var2.setEmojicon(null);
            }
            e61 e61Var2 = f61Var2.G;
            if (e61Var2 != null) {
                e61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            a61 a61Var = (a61) view;
            int i18 = w61Var.v0.get(i10);
            org.telegram.ui.Components.xx xxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.xx) arrayList5.get(i18);
            if (i18 == -1) {
                w61Var.D = a61Var;
                a61Var.a.setText("+" + ((arrayList4.size() - 40) + (z12 ? 1 : 0) + 1));
                return;
            }
            if (xxVar3 == null) {
                if (w61Var.D == a61Var) {
                    w61Var.D = null;
                    return;
                }
                return;
            } else {
                if (w61Var.D == a61Var) {
                    w61Var.D = null;
                }
                TextView textView2 = a61Var.a;
                StringBuilder sb = new StringBuilder("+");
                sb.append(xxVar3.c.size() - 23);
                textView2.setText(sb.toString());
                return;
            }
        }
        if (i14 == 5) {
            z51 z51Var = (z51) view;
            int i19 = w61Var.w0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (xxVar = (org.telegram.ui.Components.xx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = xxVar.b.title;
            boolean z14 = (xxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z15 = xxVar.f;
            eg.k2 k2Var = new eg.k2(this, xxVar, i19, 19);
            fg.b1 b1Var = z51Var.c;
            FrameLayout frameLayout = z51Var.a;
            z51Var.d = str;
            if (z14) {
                frameLayout.setVisibility(8);
                r92 = 0;
                b1Var.setVisibility(0);
                b1Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), k2Var, false);
            } else {
                r92 = 0;
                b1Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(k2Var);
            }
            if (z15) {
                formatString = LocaleController.getString(R.string.Added);
                z11 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z11 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = z51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            z51Var.b.c(formatString, r92, z11);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = z51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                z51Var.e = null;
            }
            frameLayout.setEnabled(!z15);
            frameLayout.setAlpha(z15 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = z51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                z51Var.n = null;
            }
            Boolean bool = z51Var.h;
            if (bool == null || bool.booleanValue() != z14) {
                z51Var.h = Boolean.valueOf(z14);
                float f10 = z14 ? 1.0f : 0.0f;
                z51Var.f = f10;
                frameLayout.setAlpha(1.0f - f10);
                b1Var.setAlpha(z51Var.f);
                b1Var.setScaleX(z51Var.f);
                b1Var.setScaleY(z51Var.f);
                b1Var.setVisibility(z51Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        f61 f61Var3 = (f61) view;
        f61Var3.v = null;
        f61Var3.w = null;
        f61Var3.a = false;
        f61Var3.c = i10;
        f61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && w61Var.N) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || w61Var.z0) {
                size = arrayList4.size() + (z12 ? 1 : 0);
            }
        }
        if (z12) {
            if (i10 == (w61Var.a != -1 ? 1 : 0) + (w61Var.v != -1 ? 1 : 0)) {
                z10 = hashSet.contains(null);
                f61Var3.a = true;
                f61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                f61Var3.e = null;
                f61Var3.d = null;
                f61Var3.N = false;
                ImageReceiver imageReceiver2 = f61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                u5Var = f61Var3.e;
                if (u5Var == null) {
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) t51Var.a3.get(u5Var.getDocumentId());
                    if (l5Var == null) {
                        if (f61Var3.e.document != null) {
                            cacheType2 = w61Var.getCacheType();
                            l5Var = org.telegram.ui.Components.l5.m(i13, cacheType2, f61Var3.e.document);
                        } else {
                            cacheType = w61Var.getCacheType();
                            l5Var = org.telegram.ui.Components.l5.n(i13, f61Var3.e.getDocumentId(), null, cacheType);
                        }
                        t51Var.a3.put(f61Var3.e.getDocumentId(), l5Var);
                    }
                    f61Var3.setDrawable(l5Var);
                } else {
                    f61Var3.setDrawable(null);
                }
                f61Var3.d(z10, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (w61Var.a != -1 ? 1 : 0)) - (w61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (w61Var.a != -1 ? 1 : 0)) - (w61Var.v != -1 ? 1 : 0)) - (z12 ? 1 : 0));
                f61Var3.b = false;
                f61Var3.y = false;
                f61Var3.x = ng.q0.b(str2);
                f61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                f61Var3.d(w61Var.G.contains(f61Var3.x), false);
                return;
            }
        }
        int i21 = w61Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = w61Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z12 ? 1 : 0);
            if (i12 == 4 && w61Var.N) {
                f61Var3.c((TLRPC.Document) arrayList3.get(i24), t51Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    f61Var3.c(document2, t51Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z4 = true;
                    }
                } else {
                    org.telegram.ui.Components.u5 u5Var2 = (org.telegram.ui.Components.u5) arrayList4.get(i24);
                    f61Var3.e = u5Var2;
                    f61Var3.d = u5Var2 == null ? null : u5Var2.document;
                    z4 = u5Var2 != null && hashSet.contains(Long.valueOf(u5Var2.getDocumentId()));
                    f61Var3.N = false;
                    ImageReceiver imageReceiver3 = f61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z10 = z4;
            }
            z4 = false;
            z10 = z4;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - w61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (w61Var.a != -1 ? 1 : 0)) - (w61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (w61Var.a != -1 ? 1 : 0)) - (w61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.u5 u5Var3 = (org.telegram.ui.Components.u5) arrayList2.get(((((i10 - (w61Var.a != -1 ? 1 : 0)) - (w61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            f61Var3.e = u5Var3;
                            f61Var3.d = u5Var3 == null ? null : u5Var3.document;
                            z4 = u5Var3 != null && hashSet.contains(Long.valueOf(u5Var3.getDocumentId()));
                            f61Var3.N = false;
                            ImageReceiver imageReceiver4 = f61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.xx xxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.xx) arrayList5.get(valueAt) : null;
                    if (xxVar4 != null) {
                        int size2 = xxVar4.h ? xxVar4.c.size() : Math.min(xxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) xxVar4.c.get(i26)) != null) {
                            if (w61Var.N) {
                                f61Var3.c(document, w61Var.f0);
                            } else {
                                f61Var3.N = false;
                                ImageReceiver imageReceiver5 = f61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                f61Var3.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                            }
                            f61Var3.d = document;
                        }
                    }
                }
                z4 = true;
                org.telegram.ui.Components.u5 u5Var4 = f61Var3.e;
                if (u5Var4 != null) {
                }
                z4 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - w61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                f61Var3.e = new org.telegram.ui.Components.u5(document3, (Paint.FontMetricsInt) null);
                f61Var3.d = document3;
                f61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) mh.t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    f61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z4 = f61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                f61Var3.N = false;
                ImageReceiver imageReceiver6 = f61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z10 = z4;
        }
        u5Var = f61Var3.e;
        if (u5Var == null) {
        }
        f61Var3.d(z10, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        w61 w61Var = this.c;
        int i11 = w61Var.T;
        org.telegram.ui.ActionBar.g6 g6Var = w61Var.W0;
        if (i10 == 0) {
            view = new b61(w61Var, w61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(w61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            f61 f61Var = new f61(w61Var, w61Var.getContext());
            if (i10 == 8) {
                f61Var.N = true;
                ImageReceiver imageReceiver = new ImageReceiver(f61Var);
                f61Var.h = imageReceiver;
                f61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(w61Var.K);
                w61Var.L = f61Var;
                f61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = f61Var;
        } else if (i10 == 4) {
            Context context = w61Var.getContext();
            a61 a61Var = new a61(context);
            TextView textView = new TextView(context);
            a61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(11.0f), w61Var.d1 ? org.telegram.ui.ActionBar.k6.v(w61Var.c1, org.telegram.ui.ActionBar.k6.l1(0.4f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            a61Var.addView(textView, k7.c6.e(-2, -2, 17));
            view = a61Var;
        } else if (i10 == 5) {
            z51 z51Var = new z51(w61Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(z51Var.getContext(), false, false, false, 4);
            z51Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.pr.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            t3Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(z51Var.getContext());
            z51Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
            frameLayout.addView(t3Var, k7.c6.e(-1, -2, 17));
            z51Var.addView(frameLayout, k7.c6.c(-1.0f, -1));
            fg.b1 b1Var = new fg.b1(z51Var.getContext(), g6Var, false);
            z51Var.c = b1Var;
            b1Var.setIcon(R.raw.unlock_icon);
            z51Var.addView(b1Var, k7.c6.c(-1.0f, -1));
            view = z51Var;
        } else if (i10 == 6) {
            ym0 ym0Var = new ym0(w61Var.getContext(), 1);
            ym0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                ym0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                ym0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                ym0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            ym0Var.setGravity(17);
            ym0Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var));
            view = ym0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(w61Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new f61(w61Var, w61Var.getContext());
        }
        if (w61.c(w61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
