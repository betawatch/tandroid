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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y51 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ z61 c;

    public y51(z61 z61Var) {
        this.c = z61Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.u0;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.h0
    public final int j(int i10) {
        z61 z61Var = this.c;
        if (i10 == z61Var.a) {
            return 7;
        }
        if (i10 >= z61Var.b && i10 < z61Var.c) {
            return 1;
        }
        if (i10 >= z61Var.d && i10 < z61Var.e) {
            return 1;
        }
        if (i10 >= z61Var.E && i10 < z61Var.F) {
            return 1;
        }
        if (i10 >= z61Var.r && i10 < z61Var.s) {
            return 3;
        }
        if (z61Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (z61Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == z61Var.v) {
            return 6;
        }
        if (z61Var.w0.indexOfKey(i10) >= 0 || i10 == z61Var.f || i10 == z61Var.y || i10 == z61Var.n || i10 == z61Var.h || i10 == z61Var.x) {
            return 0;
        }
        return i10 == z61Var.w ? 8 : 3;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.z5 z5Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.xx xxVar;
        ?? r92;
        boolean z12;
        String formatString;
        zg.p0 p0Var;
        int cacheType3;
        z61 z61Var = this.c;
        ArrayList arrayList = z61Var.G0;
        ArrayList arrayList2 = z61Var.K0;
        ArrayList arrayList3 = z61Var.F0;
        SparseIntArray sparseIntArray = z61Var.w0;
        boolean z13 = z61Var.N0;
        ArrayList arrayList4 = z61Var.D0;
        int i12 = z61Var.W;
        ArrayList arrayList5 = z61Var.M0;
        w51 w51Var = z61Var.h0;
        HashSet hashSet = z61Var.K;
        ArrayList arrayList6 = z61Var.E0;
        int i13 = z61Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            i61 i61Var = (i61) view;
            i61Var.c = i10;
            i61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = z61Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (z61Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            e61 e61Var = (e61) view;
            if (i10 == z61Var.x) {
                e61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                e61Var.c.setVisibility(8);
                return;
            }
            if (i10 == z61Var.f) {
                e61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                e61Var.c.setVisibility(8);
                return;
            }
            if (i10 == z61Var.y) {
                e61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                e61Var.c.setVisibility(8);
                return;
            }
            e61Var.c.setVisibility(8);
            if (i10 == z61Var.h) {
                e61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == z61Var.n) {
                e61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                e61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.xx xxVar2 = (org.telegram.ui.Components.xx) arrayList5.get(i15);
            if (xxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(xxVar2.d, false);
                xxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !xxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            e61Var.a(xxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            i61 i61Var2 = (i61) view;
            i61Var2.c = i10;
            ImageReceiver imageReceiver = i61Var2.n;
            int i16 = z61Var.b;
            if (i10 < i16 || i10 >= z61Var.c) {
                int i17 = z61Var.E;
                p0Var = (i10 < i17 || i10 >= z61Var.F) ? (zg.p0) z61Var.H0.get(i10 - z61Var.d) : (zg.p0) z61Var.J0.get(i10 - i17);
            } else {
                p0Var = (zg.p0) z61Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                i61Var2.b = false;
                i61Var2.y = true;
                i61Var2.x = p0Var;
                i61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
                i61Var2.d(z61Var.J.contains(p0Var), false);
                return;
            }
            i61Var2.a(w51Var);
            i61Var2.y = true;
            i61Var2.x = p0Var;
            i61Var2.d(z61Var.J.contains(p0Var), false);
            i61Var2.b = false;
            if (p0Var.b || p0Var.f == null) {
                i61Var2.s = false;
                i61Var2.e = new org.telegram.ui.Components.z5(p0Var.g, (Paint.FontMetricsInt) null);
                i61Var2.d = null;
                i61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) w51Var.d3.get(i61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = z61Var.getCacheType();
                    if (cacheType3 == 3 && p0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.q5.n(i13, i61Var2.e.getDocumentId(), null, cacheType3);
                    w51Var.d3.put(i61Var2.e.getDocumentId(), drawable);
                }
                i61Var2.setDrawable(drawable);
            } else {
                i61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(p0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        zg.p0 p0Var2 = p0Var;
                        i61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    } else {
                        i61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                } else {
                    i61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                i61Var2.e = null;
                i61Var2.d = null;
                i61Var2.setDrawable(null);
                h61 h61Var = i61Var2.J;
                if (h61Var != null) {
                    h61Var.setVisibility(8);
                    i61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && p0Var.b && p0Var.d) {
                i61Var2.b();
                i61Var2.J.setVisibility(0);
                i61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                i61Var2.setEmojicon(p0Var.f);
            } else {
                i61Var2.setEmojicon(null);
            }
            h61 h61Var2 = i61Var2.J;
            if (h61Var2 != null) {
                h61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            d61 d61Var = (d61) view;
            int i18 = z61Var.y0.get(i10);
            org.telegram.ui.Components.xx xxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.xx) arrayList5.get(i18);
            if (i18 == -1) {
                z61Var.G = d61Var;
                d61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (xxVar3 == null) {
                if (z61Var.G == d61Var) {
                    z61Var.G = null;
                    return;
                }
                return;
            } else {
                if (z61Var.G == d61Var) {
                    z61Var.G = null;
                }
                TextView textView2 = d61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(xxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            c61 c61Var = (c61) view;
            int i19 = z61Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (xxVar = (org.telegram.ui.Components.xx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = xxVar.b.title;
            boolean z15 = (xxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = xxVar.f;
            org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(this, xxVar, i19, 15);
            rg.p0 p0Var3 = c61Var.c;
            FrameLayout frameLayout = c61Var.a;
            c61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var3.setVisibility(0);
                p0Var3.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), waVar, false);
            } else {
                r92 = 0;
                p0Var3.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(waVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = c61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            c61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = c61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                c61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = c61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                c61Var.n = null;
            }
            Boolean bool = c61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                c61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                c61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var3.setAlpha(c61Var.f);
                p0Var3.setScaleX(c61Var.f);
                p0Var3.setScaleY(c61Var.f);
                p0Var3.setVisibility(c61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        i61 i61Var3 = (i61) view;
        i61Var3.v = null;
        i61Var3.w = null;
        i61Var3.a = false;
        i61Var3.c = i10;
        i61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && z61Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || z61Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (z61Var.a != -1 ? 1 : 0) + (z61Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                i61Var3.a = true;
                i61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                i61Var3.e = null;
                i61Var3.d = null;
                i61Var3.Q = false;
                ImageReceiver imageReceiver2 = i61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                z5Var = i61Var3.e;
                if (z5Var == null) {
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) w51Var.d3.get(z5Var.getDocumentId());
                    if (q5Var == null) {
                        if (i61Var3.e.document != null) {
                            cacheType2 = z61Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.m(i13, cacheType2, i61Var3.e.document);
                        } else {
                            cacheType = z61Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.n(i13, i61Var3.e.getDocumentId(), null, cacheType);
                        }
                        w51Var.d3.put(i61Var3.e.getDocumentId(), q5Var);
                    }
                    i61Var3.setDrawable(q5Var);
                } else {
                    i61Var3.setDrawable(null);
                }
                i61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (z61Var.a != -1 ? 1 : 0)) - (z61Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (z61Var.a != -1 ? 1 : 0)) - (z61Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                i61Var3.b = false;
                i61Var3.y = false;
                i61Var3.x = zg.p0.b(str2);
                i61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                i61Var3.d(z61Var.J.contains(i61Var3.x), false);
                return;
            }
        }
        int i21 = z61Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = z61Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && z61Var.Q) {
                i61Var3.c((TLRPC.Document) arrayList3.get(i24), w51Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    i61Var3.c(document2, w51Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.z5 z5Var2 = (org.telegram.ui.Components.z5) arrayList4.get(i24);
                    i61Var3.e = z5Var2;
                    i61Var3.d = z5Var2 == null ? null : z5Var2.document;
                    z10 = z5Var2 != null && hashSet.contains(Long.valueOf(z5Var2.getDocumentId()));
                    i61Var3.Q = false;
                    ImageReceiver imageReceiver3 = i61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - z61Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (z61Var.a != -1 ? 1 : 0)) - (z61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (z61Var.a != -1 ? 1 : 0)) - (z61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) arrayList2.get(((((i10 - (z61Var.a != -1 ? 1 : 0)) - (z61Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            i61Var3.e = z5Var3;
                            i61Var3.d = z5Var3 == null ? null : z5Var3.document;
                            z10 = z5Var3 != null && hashSet.contains(Long.valueOf(z5Var3.getDocumentId()));
                            i61Var3.Q = false;
                            ImageReceiver imageReceiver4 = i61Var3.h;
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
                            if (z61Var.Q) {
                                i61Var3.c(document, z61Var.i0);
                            } else {
                                i61Var3.Q = false;
                                ImageReceiver imageReceiver5 = i61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                i61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                            }
                            i61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.z5 z5Var4 = i61Var3.e;
                if (z5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - z61Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                i61Var3.e = new org.telegram.ui.Components.z5(document3, (Paint.FontMetricsInt) null);
                i61Var3.d = document3;
                i61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) yh.t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    i61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = i61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                i61Var3.Q = false;
                ImageReceiver imageReceiver6 = i61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        z5Var = i61Var3.e;
        if (z5Var == null) {
        }
        i61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        z61 z61Var = this.c;
        int i11 = z61Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = z61Var.Z0;
        if (i10 == 0) {
            view = new e61(z61Var, z61Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(z61Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            i61 i61Var = new i61(z61Var, z61Var.getContext());
            if (i10 == 8) {
                i61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(i61Var);
                i61Var.h = imageReceiver;
                i61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(z61Var.N);
                z61Var.O = i61Var;
                i61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = i61Var;
        } else if (i10 == 4) {
            Context context = z61Var.getContext();
            d61 d61Var = new d61(context);
            TextView textView = new TextView(context);
            d61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), z61Var.g1 ? org.telegram.ui.ActionBar.h6.v(z61Var.f1, org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            d61Var.addView(textView, w7.x5.e(-2, -2, 17));
            view = d61Var;
        } else if (i10 == 5) {
            c61 c61Var = new c61(z61Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(c61Var.getContext(), false, false, false, 4);
            c61Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.rr.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(c61Var.getContext());
            c61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
            frameLayout.addView(u3Var, w7.x5.e(-1, -2, 17));
            c61Var.addView(frameLayout, w7.x5.c(-1.0f, -1));
            rg.p0 p0Var = new rg.p0(c61Var.getContext(), d6Var, false);
            c61Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            c61Var.addView(p0Var, w7.x5.c(-1.0f, -1));
            view = c61Var;
        } else if (i10 == 6) {
            bn0 bn0Var = new bn0(z61Var.getContext(), 2);
            bn0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                bn0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                bn0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                bn0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            bn0Var.setGravity(17);
            bn0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, d6Var));
            view = bn0Var;
        } else if (i10 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(z61Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new i61(z61Var, z61Var.getContext());
        }
        if (z61.c(z61Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
