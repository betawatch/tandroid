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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z41 extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ a61 c;

    public z41(a61 a61Var) {
        this.c = a61Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.q0;
    }

    @Override // f2.q0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.r0.get(i10)).longValue());
    }

    @Override // f2.q0
    public final int j(int i10) {
        a61 a61Var = this.c;
        if (i10 == a61Var.a) {
            return 7;
        }
        if (i10 >= a61Var.b && i10 < a61Var.c) {
            return 1;
        }
        if (i10 >= a61Var.d && i10 < a61Var.e) {
            return 1;
        }
        if (i10 >= a61Var.A && i10 < a61Var.B) {
            return 1;
        }
        if (i10 >= a61Var.r && i10 < a61Var.s) {
            return 3;
        }
        if (a61Var.u0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (a61Var.v0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == a61Var.v) {
            return 6;
        }
        if (a61Var.s0.indexOfKey(i10) >= 0 || i10 == a61Var.f || i10 == a61Var.y || i10 == a61Var.n || i10 == a61Var.h || i10 == a61Var.x) {
            return 0;
        }
        return i10 == a61Var.w ? 8 : 3;
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
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.t5 t5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.kx kxVar;
        ?? r92;
        boolean z12;
        String formatString;
        ig.q0 q0Var;
        int cacheType3;
        a61 a61Var = this.c;
        ArrayList arrayList = a61Var.C0;
        ArrayList arrayList2 = a61Var.G0;
        ArrayList arrayList3 = a61Var.B0;
        SparseIntArray sparseIntArray = a61Var.s0;
        boolean z13 = a61Var.J0;
        ArrayList arrayList4 = a61Var.z0;
        int i12 = a61Var.S;
        ArrayList arrayList5 = a61Var.I0;
        x41 x41Var = a61Var.d0;
        HashSet hashSet = a61Var.G;
        ArrayList arrayList6 = a61Var.A0;
        int i13 = a61Var.R;
        int i14 = o1Var.f;
        View view = o1Var.a;
        if (i14 == 8) {
            j51 j51Var = (j51) view;
            j51Var.c = i10;
            j51Var.H = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = a61Var.Q1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (a61Var.L0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            f51 f51Var = (f51) view;
            if (i10 == a61Var.x) {
                f51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                f51Var.c.setVisibility(8);
                return;
            }
            if (i10 == a61Var.f) {
                f51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                f51Var.c.setVisibility(8);
                return;
            }
            if (i10 == a61Var.y) {
                f51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                f51Var.c.setVisibility(8);
                return;
            }
            f51Var.c.setVisibility(8);
            if (i10 == a61Var.h) {
                f51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == a61Var.n) {
                f51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                f51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.kx kxVar2 = (org.telegram.ui.Components.kx) arrayList5.get(i15);
            if (kxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(kxVar2.d, false);
                kxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !kxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            f51Var.a(kxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            j51 j51Var2 = (j51) view;
            j51Var2.c = i10;
            ImageReceiver imageReceiver = j51Var2.n;
            int i16 = a61Var.b;
            if (i10 < i16 || i10 >= a61Var.c) {
                int i17 = a61Var.A;
                q0Var = (i10 < i17 || i10 >= a61Var.B) ? (ig.q0) a61Var.D0.get(i10 - a61Var.d) : (ig.q0) a61Var.F0.get(i10 - i17);
            } else {
                q0Var = (ig.q0) a61Var.E0.get(i10 - i16);
            }
            if (i12 == 13) {
                j51Var2.b = false;
                j51Var2.y = true;
                j51Var2.x = q0Var;
                j51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
                j51Var2.d(a61Var.F.contains(q0Var), false);
                return;
            }
            j51Var2.a(x41Var);
            j51Var2.y = true;
            j51Var2.x = q0Var;
            j51Var2.d(a61Var.F.contains(q0Var), false);
            j51Var2.b = false;
            if (q0Var.b || q0Var.f == null) {
                j51Var2.s = false;
                j51Var2.e = new org.telegram.ui.Components.t5(q0Var.g, (Paint.FontMetricsInt) null);
                j51Var2.d = null;
                j51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) x41Var.Z2.get(j51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = a61Var.getCacheType();
                    if (cacheType3 == 3 && q0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.k5.n(i13, j51Var2.e.getDocumentId(), null, cacheType3);
                    x41Var.Z2.put(j51Var2.e.getDocumentId(), drawable);
                }
                j51Var2.setDrawable(drawable);
            } else {
                j51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.g6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        ig.q0 q0Var2 = q0Var;
                        j51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    } else {
                        j51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ig.m0.a());
                } else {
                    j51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                j51Var2.e = null;
                j51Var2.d = null;
                j51Var2.setDrawable(null);
                i51 i51Var = j51Var2.F;
                if (i51Var != null) {
                    i51Var.setVisibility(8);
                    j51Var2.F.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && q0Var.b && q0Var.d) {
                j51Var2.b();
                j51Var2.F.setVisibility(0);
                j51Var2.setEmojicon(null);
                return;
            }
            if (q0Var.e) {
                j51Var2.setEmojicon(q0Var.f);
            } else {
                j51Var2.setEmojicon(null);
            }
            i51 i51Var2 = j51Var2.F;
            if (i51Var2 != null) {
                i51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            e51 e51Var = (e51) view;
            int i18 = a61Var.u0.get(i10);
            org.telegram.ui.Components.kx kxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.kx) arrayList5.get(i18);
            if (i18 == -1) {
                a61Var.C = e51Var;
                e51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (kxVar3 == null) {
                if (a61Var.C == e51Var) {
                    a61Var.C = null;
                    return;
                }
                return;
            } else {
                if (a61Var.C == e51Var) {
                    a61Var.C = null;
                }
                TextView textView2 = e51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(kxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            d51 d51Var = (d51) view;
            int i19 = a61Var.v0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (kxVar = (org.telegram.ui.Components.kx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = kxVar.b.title;
            boolean z15 = (kxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = kxVar.f;
            gh.v2 v2Var = new gh.v2(this, kxVar, i19, 18);
            ag.s1 s1Var = d51Var.c;
            FrameLayout frameLayout = d51Var.a;
            d51Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                s1Var.setVisibility(0);
                s1Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), v2Var, false);
            } else {
                r92 = 0;
                s1Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(v2Var);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = d51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            d51Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = d51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                d51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = d51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                d51Var.n = null;
            }
            Boolean bool = d51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                d51Var.h = Boolean.valueOf(z15);
                float f10 = z15 ? 1.0f : 0.0f;
                d51Var.f = f10;
                frameLayout.setAlpha(1.0f - f10);
                s1Var.setAlpha(d51Var.f);
                s1Var.setScaleX(d51Var.f);
                s1Var.setScaleY(d51Var.f);
                s1Var.setVisibility(d51Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        j51 j51Var3 = (j51) view;
        j51Var3.v = null;
        j51Var3.w = null;
        j51Var3.a = false;
        j51Var3.c = i10;
        j51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && a61Var.M) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || a61Var.y0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (a61Var.a != -1 ? 1 : 0) + (a61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                j51Var3.a = true;
                j51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                j51Var3.e = null;
                j51Var3.d = null;
                j51Var3.M = false;
                ImageReceiver imageReceiver2 = j51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                t5Var = j51Var3.e;
                if (t5Var == null) {
                    org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) x41Var.Z2.get(t5Var.getDocumentId());
                    if (k5Var == null) {
                        if (j51Var3.e.document != null) {
                            cacheType2 = a61Var.getCacheType();
                            k5Var = org.telegram.ui.Components.k5.m(i13, cacheType2, j51Var3.e.document);
                        } else {
                            cacheType = a61Var.getCacheType();
                            k5Var = org.telegram.ui.Components.k5.n(i13, j51Var3.e.getDocumentId(), null, cacheType);
                        }
                        x41Var.Z2.put(j51Var3.e.getDocumentId(), k5Var);
                    }
                    j51Var3.setDrawable(k5Var);
                } else {
                    j51Var3.setDrawable(null);
                }
                j51Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (a61Var.a != -1 ? 1 : 0)) - (a61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (a61Var.a != -1 ? 1 : 0)) - (a61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                j51Var3.b = false;
                j51Var3.y = false;
                j51Var3.x = ig.q0.b(str2);
                j51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                j51Var3.d(a61Var.F.contains(j51Var3.x), false);
                return;
            }
        }
        int i21 = a61Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = a61Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && a61Var.M) {
                j51Var3.c((TLRPC.Document) arrayList3.get(i24), x41Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    j51Var3.c(document2, x41Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.t5 t5Var2 = (org.telegram.ui.Components.t5) arrayList4.get(i24);
                    j51Var3.e = t5Var2;
                    j51Var3.d = t5Var2 == null ? null : t5Var2.document;
                    z10 = t5Var2 != null && hashSet.contains(Long.valueOf(t5Var2.getDocumentId()));
                    j51Var3.M = false;
                    ImageReceiver imageReceiver3 = j51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - a61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (a61Var.a != -1 ? 1 : 0)) - (a61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (a61Var.a != -1 ? 1 : 0)) - (a61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.t5 t5Var3 = (org.telegram.ui.Components.t5) arrayList2.get(((((i10 - (a61Var.a != -1 ? 1 : 0)) - (a61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            j51Var3.e = t5Var3;
                            j51Var3.d = t5Var3 == null ? null : t5Var3.document;
                            z10 = t5Var3 != null && hashSet.contains(Long.valueOf(t5Var3.getDocumentId()));
                            j51Var3.M = false;
                            ImageReceiver imageReceiver4 = j51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.kx kxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.kx) arrayList5.get(valueAt) : null;
                    if (kxVar4 != null) {
                        int size2 = kxVar4.h ? kxVar4.c.size() : Math.min(kxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) kxVar4.c.get(i26)) != null) {
                            if (a61Var.M) {
                                j51Var3.c(document, a61Var.e0);
                            } else {
                                j51Var3.M = false;
                                ImageReceiver imageReceiver5 = j51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                j51Var3.e = new org.telegram.ui.Components.t5(document, (Paint.FontMetricsInt) null);
                            }
                            j51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.t5 t5Var4 = j51Var3.e;
                if (t5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - a61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                j51Var3.e = new org.telegram.ui.Components.t5(document3, (Paint.FontMetricsInt) null);
                j51Var3.d = document3;
                j51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) hh.u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    j51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = j51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                j51Var3.M = false;
                ImageReceiver imageReceiver6 = j51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        t5Var = j51Var3.e;
        if (t5Var == null) {
        }
        j51Var3.d(z11, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        a61 a61Var = this.c;
        int i11 = a61Var.S;
        org.telegram.ui.ActionBar.c6 c6Var = a61Var.V0;
        if (i10 == 0) {
            view = new f51(a61Var, a61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(a61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            j51 j51Var = new j51(a61Var, a61Var.getContext());
            if (i10 == 8) {
                j51Var.M = true;
                ImageReceiver imageReceiver = new ImageReceiver(j51Var);
                j51Var.h = imageReceiver;
                j51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(a61Var.J);
                a61Var.K = j51Var;
                j51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = j51Var;
        } else if (i10 == 4) {
            Context context = a61Var.getContext();
            e51 e51Var = new e51(context);
            TextView textView = new TextView(context);
            e51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), a61Var.c1 ? org.telegram.ui.ActionBar.g6.v(a61Var.b1, org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false))) : i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            e51Var.addView(textView, h7.z5.e(-2, -2, 17));
            view = e51Var;
        } else if (i10 == 5) {
            d51 d51Var = new d51(a61Var.getContext());
            org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(d51Var.getContext(), false, false, false, 4);
            d51Var.b = r3Var;
            r3Var.b(0.3f, 250L, org.telegram.ui.Components.er.h);
            r3Var.setTextSize(AndroidUtilities.dp(14.0f));
            r3Var.setTypeface(AndroidUtilities.bold());
            r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            r3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(d51Var.getContext());
            d51Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            frameLayout.addView(r3Var, h7.z5.e(-1, -2, 17));
            d51Var.addView(frameLayout, h7.z5.c(-1.0f, -1));
            ag.s1 s1Var = new ag.s1(d51Var.getContext(), c6Var, false);
            d51Var.c = s1Var;
            s1Var.setIcon(R.raw.unlock_icon);
            d51Var.addView(s1Var, h7.z5.c(-1.0f, -1));
            view = d51Var;
        } else if (i10 == 6) {
            qd0 qd0Var = new qd0(a61Var.getContext(), 3);
            qd0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                qd0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                qd0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                qd0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            qd0Var.setGravity(17);
            qd0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
            view = qd0Var;
        } else if (i10 == 7) {
            View q3Var = new org.telegram.ui.Cells.q3(a61Var.getContext(), 52);
            q3Var.setTag("searchbox");
            view = q3Var;
        } else {
            view = new j51(a61Var, a61Var.getContext());
        }
        if (a61.c(a61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
