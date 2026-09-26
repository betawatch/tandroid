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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z51 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ a71 c;

    public z51(a71 a71Var) {
        this.c = a71Var;
    }

    @Override // org.telegram.ui.Components.vl0
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
        a71 a71Var = this.c;
        if (i10 == a71Var.a) {
            return 7;
        }
        if (i10 >= a71Var.b && i10 < a71Var.c) {
            return 1;
        }
        if (i10 >= a71Var.d && i10 < a71Var.e) {
            return 1;
        }
        if (i10 >= a71Var.E && i10 < a71Var.F) {
            return 1;
        }
        if (i10 >= a71Var.r && i10 < a71Var.s) {
            return 3;
        }
        if (a71Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (a71Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == a71Var.v) {
            return 6;
        }
        if (a71Var.w0.indexOfKey(i10) >= 0 || i10 == a71Var.f || i10 == a71Var.y || i10 == a71Var.n || i10 == a71Var.h || i10 == a71Var.x) {
            return 0;
        }
        return i10 == a71Var.w ? 8 : 3;
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
        org.telegram.ui.Components.yx yxVar;
        ?? r92;
        boolean z12;
        String formatString;
        zg.o0 o0Var;
        int cacheType3;
        a71 a71Var = this.c;
        ArrayList arrayList = a71Var.G0;
        ArrayList arrayList2 = a71Var.K0;
        ArrayList arrayList3 = a71Var.F0;
        SparseIntArray sparseIntArray = a71Var.w0;
        boolean z13 = a71Var.N0;
        ArrayList arrayList4 = a71Var.D0;
        int i12 = a71Var.W;
        ArrayList arrayList5 = a71Var.M0;
        x51 x51Var = a71Var.h0;
        HashSet hashSet = a71Var.K;
        ArrayList arrayList6 = a71Var.E0;
        int i13 = a71Var.V;
        int i14 = c1Var.f;
        View view = c1Var.a;
        if (i14 == 8) {
            j61 j61Var = (j61) view;
            j61Var.c = i10;
            j61Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = a71Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i14 == 6) {
            TextView textView = (TextView) view;
            if (a71Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i14 == 0) {
            f61 f61Var = (f61) view;
            if (i10 == a71Var.x) {
                f61Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                f61Var.c.setVisibility(8);
                return;
            }
            if (i10 == a71Var.f) {
                f61Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                f61Var.c.setVisibility(8);
                return;
            }
            if (i10 == a71Var.y) {
                f61Var.a(LocaleController.getString(R.string.StickerEffects), false);
                f61Var.c.setVisibility(8);
                return;
            }
            f61Var.c.setVisibility(8);
            if (i10 == a71Var.h) {
                f61Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == a71Var.n) {
                f61Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i15 = sparseIntArray.get(i10);
            if (i15 < 0) {
                f61Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.yx yxVar2 = (org.telegram.ui.Components.yx) arrayList5.get(i15);
            if (yxVar2.d != null) {
                MediaDataController.getInstance(i13).getStickerSet(yxVar2.d, false);
                yxVar2.d = null;
            }
            if (i12 != 5 && i12 != 7 && i12 != 6 && !yxVar2.e && !UserConfig.getInstance(i13).isPremium()) {
                z14 = true;
            }
            f61Var.a(yxVar2.b.title, z14);
            return;
        }
        if (i14 == 1) {
            j61 j61Var2 = (j61) view;
            j61Var2.c = i10;
            ImageReceiver imageReceiver = j61Var2.n;
            int i16 = a71Var.b;
            if (i10 < i16 || i10 >= a71Var.c) {
                int i17 = a71Var.E;
                o0Var = (i10 < i17 || i10 >= a71Var.F) ? (zg.o0) a71Var.H0.get(i10 - a71Var.d) : (zg.o0) a71Var.J0.get(i10 - i17);
            } else {
                o0Var = (zg.o0) a71Var.I0.get(i10 - i16);
            }
            if (i12 == 13) {
                j61Var2.b = false;
                j61Var2.y = true;
                j61Var2.x = o0Var;
                j61Var2.setDrawable(Emoji.getEmojiDrawable(o0Var.f));
                j61Var2.d(a71Var.J.contains(o0Var), false);
                return;
            }
            j61Var2.a(x51Var);
            j61Var2.y = true;
            j61Var2.x = o0Var;
            j61Var2.d(a71Var.J.contains(o0Var), false);
            j61Var2.b = false;
            if (o0Var.b || o0Var.f == null) {
                j61Var2.s = false;
                j61Var2.e = new org.telegram.ui.Components.z5(o0Var.g, (Paint.FontMetricsInt) null);
                j61Var2.d = null;
                j61Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) x51Var.d3.get(j61Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = a71Var.getCacheType();
                    if (cacheType3 == 3 && o0Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.q5.n(i13, j61Var2.e.getDocumentId(), null, cacheType3);
                    x51Var.d3.put(j61Var2.e.getDocumentId(), drawable);
                }
                j61Var2.setDrawable(drawable);
            } else {
                j61Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(o0Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        zg.o0 o0Var2 = o0Var;
                        j61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    } else {
                        j61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", o0Var, 0);
                    }
                    MediaDataController.getInstance(i13).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.k0.a());
                } else {
                    j61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                j61Var2.e = null;
                j61Var2.d = null;
                j61Var2.setDrawable(null);
                i61 i61Var = j61Var2.J;
                if (i61Var != null) {
                    i61Var.setVisibility(8);
                    j61Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i13).isPremium() && i12 == 14 && o0Var.b && o0Var.d) {
                j61Var2.b();
                j61Var2.J.setVisibility(0);
                j61Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                j61Var2.setEmojicon(o0Var.f);
            } else {
                j61Var2.setEmojicon(null);
            }
            i61 i61Var2 = j61Var2.J;
            if (i61Var2 != null) {
                i61Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i14 == 4) {
            e61 e61Var = (e61) view;
            int i18 = a71Var.y0.get(i10);
            org.telegram.ui.Components.yx yxVar3 = (i18 < 0 || i18 >= arrayList5.size()) ? null : (org.telegram.ui.Components.yx) arrayList5.get(i18);
            if (i18 == -1) {
                a71Var.G = e61Var;
                e61Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (yxVar3 == null) {
                if (a71Var.G == e61Var) {
                    a71Var.G = null;
                    return;
                }
                return;
            } else {
                if (a71Var.G == e61Var) {
                    a71Var.G = null;
                }
                TextView textView2 = e61Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(yxVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i14 == 5) {
            d61 d61Var = (d61) view;
            int i19 = a71Var.z0.get(i10);
            if (i19 < 0 || i19 >= arrayList5.size() || (yxVar = (org.telegram.ui.Components.yx) arrayList5.get(i19)) == null) {
                return;
            }
            String str = yxVar.b.title;
            boolean z15 = (yxVar.e || UserConfig.getInstance(i13).isPremium()) ? false : true;
            boolean z16 = yxVar.f;
            org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(this, yxVar, i19, 15);
            rg.p0 p0Var = d61Var.c;
            FrameLayout frameLayout = d61Var.a;
            d61Var.d = str;
            if (z15) {
                frameLayout.setVisibility(8);
                r92 = 0;
                p0Var.setVisibility(0);
                p0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), uaVar, false);
            } else {
                r92 = 0;
                p0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(uaVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i20 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = d61Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i20, objArr);
            }
            d61Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = d61Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                d61Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = d61Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                d61Var.n = null;
            }
            Boolean bool = d61Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                d61Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                d61Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                p0Var.setAlpha(d61Var.f);
                p0Var.setScaleX(d61Var.f);
                p0Var.setScaleY(d61Var.f);
                p0Var.setVisibility(d61Var.h.booleanValue() ? 0 : 8);
                return;
            }
            return;
        }
        if (i14 == 7 || i14 == 9) {
            return;
        }
        j61 j61Var3 = (j61) view;
        j61Var3.v = null;
        j61Var3.w = null;
        j61Var3.a = false;
        j61Var3.c = i10;
        j61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i12 == 4 && a71Var.Q) || i12 == 6) {
            size = arrayList3.size();
        } else if (i12 == 4 || i12 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || a71Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (a71Var.a != -1 ? 1 : 0) + (a71Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                j61Var3.a = true;
                j61Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                j61Var3.e = null;
                j61Var3.d = null;
                j61Var3.Q = false;
                ImageReceiver imageReceiver2 = j61Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                z5Var = j61Var3.e;
                if (z5Var == null) {
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) x51Var.d3.get(z5Var.getDocumentId());
                    if (q5Var == null) {
                        if (j61Var3.e.document != null) {
                            cacheType2 = a71Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.m(i13, cacheType2, j61Var3.e.document);
                        } else {
                            cacheType = a71Var.getCacheType();
                            q5Var = org.telegram.ui.Components.q5.n(i13, j61Var3.e.getDocumentId(), null, cacheType);
                        }
                        x51Var.d3.put(j61Var3.e.getDocumentId(), q5Var);
                    }
                    j61Var3.setDrawable(q5Var);
                } else {
                    j61Var3.setDrawable(null);
                }
                j61Var3.d(z11, false);
            }
        }
        if (i12 == 13) {
            if ((i10 - (a71Var.a != -1 ? 1 : 0)) - (a71Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (a71Var.a != -1 ? 1 : 0)) - (a71Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                j61Var3.b = false;
                j61Var3.y = false;
                j61Var3.x = zg.o0.b(str2);
                j61Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                j61Var3.d(a71Var.J.contains(j61Var3.x), false);
                return;
            }
        }
        int i21 = a71Var.a;
        int i22 = i10 - (i21 != -1 ? 1 : 0);
        int i23 = a71Var.v;
        if (i22 - (i23 != -1 ? 1 : 0) < size) {
            int i24 = ((i10 - (i21 != -1 ? 1 : 0)) - (i23 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i12 == 4 && a71Var.Q) {
                j61Var3.c((TLRPC.Document) arrayList3.get(i24), x51Var);
            } else {
                if (i12 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i24);
                    j61Var3.c(document2, x51Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.z5 z5Var2 = (org.telegram.ui.Components.z5) arrayList4.get(i24);
                    j61Var3.e = z5Var2;
                    j61Var3.d = z5Var2 == null ? null : z5Var2.document;
                    z10 = z5Var2 != null && hashSet.contains(Long.valueOf(z5Var2.getDocumentId()));
                    j61Var3.Q = false;
                    ImageReceiver imageReceiver3 = j61Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - a71Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (a71Var.a != -1 ? 1 : 0)) - (a71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (a71Var.a != -1 ? 1 : 0)) - (a71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) arrayList2.get(((((i10 - (a71Var.a != -1 ? 1 : 0)) - (a71Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            j61Var3.e = z5Var3;
                            j61Var3.d = z5Var3 == null ? null : z5Var3.document;
                            z10 = z5Var3 != null && hashSet.contains(Long.valueOf(z5Var3.getDocumentId()));
                            j61Var3.Q = false;
                            ImageReceiver imageReceiver4 = j61Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i25 = 0; i25 < sparseIntArray.size(); i25++) {
                    int keyAt = sparseIntArray.keyAt(i25);
                    int valueAt = sparseIntArray.valueAt(i25);
                    org.telegram.ui.Components.yx yxVar4 = valueAt >= 0 ? (org.telegram.ui.Components.yx) arrayList5.get(valueAt) : null;
                    if (yxVar4 != null) {
                        int size2 = yxVar4.h ? yxVar4.c.size() : Math.min(yxVar4.c.size(), 24);
                        int i26 = (i10 - keyAt) - 1;
                        if (i26 >= 0 && i26 < size2 && (document = (TLRPC.Document) yxVar4.c.get(i26)) != null) {
                            if (a71Var.Q) {
                                j61Var3.c(document, a71Var.i0);
                            } else {
                                j61Var3.Q = false;
                                ImageReceiver imageReceiver5 = j61Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                j61Var3.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                            }
                            j61Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.z5 z5Var4 = j61Var3.e;
                if (z5Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - a71Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                j61Var3.e = new org.telegram.ui.Components.z5(document3, (Paint.FontMetricsInt) null);
                j61Var3.d = document3;
                j61Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    j61Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = j61Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                j61Var3.Q = false;
                ImageReceiver imageReceiver6 = j61Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        z5Var = j61Var3.e;
        if (z5Var == null) {
        }
        j61Var3.d(z11, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        a71 a71Var = this.c;
        int i11 = a71Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = a71Var.Z0;
        if (i10 == 0) {
            view = new f61(a71Var, a71Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(a71Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            j61 j61Var = new j61(a71Var, a71Var.getContext());
            if (i10 == 8) {
                j61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(j61Var);
                j61Var.h = imageReceiver;
                j61Var.r = imageReceiver;
                imageReceiver.setImageBitmap(a71Var.N);
                a71Var.O = j61Var;
                j61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = j61Var;
        } else if (i10 == 4) {
            Context context = a71Var.getContext();
            e61 e61Var = new e61(context);
            TextView textView = new TextView(context);
            e61Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), a71Var.g1 ? org.telegram.ui.ActionBar.h6.v(a71Var.f1, org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false))) : i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            e61Var.addView(textView, w7.y5.e(-2, -2, 17));
            view = e61Var;
        } else if (i10 == 5) {
            d61 d61Var = new d61(a71Var.getContext());
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(d61Var.getContext(), false, false, false, 4);
            d61Var.b = u3Var;
            u3Var.b(0.3f, 250L, org.telegram.ui.Components.rr.h);
            u3Var.setTextSize(AndroidUtilities.dp(14.0f));
            u3Var.setTypeface(AndroidUtilities.bold());
            u3Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
            u3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(d61Var.getContext());
            d61Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
            frameLayout.addView(u3Var, w7.y5.e(-1, -2, 17));
            d61Var.addView(frameLayout, w7.y5.c(-1.0f, -1));
            rg.p0 p0Var = new rg.p0(d61Var.getContext(), d6Var, false);
            d61Var.c = p0Var;
            p0Var.setIcon(R.raw.unlock_icon);
            d61Var.addView(p0Var, w7.y5.c(-1.0f, -1));
            view = d61Var;
        } else if (i10 == 6) {
            zm0 zm0Var = new zm0(a71Var.getContext(), 2);
            zm0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                zm0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                zm0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                zm0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            zm0Var.setGravity(17);
            zm0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, d6Var));
            view = zm0Var;
        } else if (i10 == 7) {
            View t3Var = new org.telegram.ui.Cells.t3(a71Var.getContext(), 52);
            t3Var.setTag("searchbox");
            view = t3Var;
        } else {
            view = new j61(a71Var, a71Var.getContext());
        }
        if (a71.c(a71Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.gl0(view);
    }
}
