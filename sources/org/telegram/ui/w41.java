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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class w41 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ x51 c;

    public w41(x51 x51Var) {
        this.c = x51Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.u0;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return Math.abs(((Long) this.c.v0.get(i10)).longValue());
    }

    @Override // s4.g0
    public final int j(int i10) {
        x51 x51Var = this.c;
        if (i10 == x51Var.a) {
            return 7;
        }
        if (i10 >= x51Var.b && i10 < x51Var.c) {
            return 1;
        }
        if (i10 >= x51Var.d && i10 < x51Var.e) {
            return 1;
        }
        if (i10 >= x51Var.E && i10 < x51Var.F) {
            return 1;
        }
        if (i10 >= x51Var.r && i10 < x51Var.s) {
            return 3;
        }
        if (x51Var.y0.indexOfKey(i10) >= 0) {
            return 4;
        }
        if (x51Var.z0.indexOfKey(i10) >= 0) {
            return 5;
        }
        if (i10 == x51Var.v) {
            return 6;
        }
        if (x51Var.w0.indexOfKey(i10) >= 0 || i10 == x51Var.f || i10 == x51Var.y || i10 == x51Var.n || i10 == x51Var.h || i10 == x51Var.x) {
            return 0;
        }
        return i10 == x51Var.w ? 8 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0724, code lost:
    
        if (r13.contains(java.lang.Long.valueOf(r0.getDocumentId())) != false) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0770  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        int size;
        boolean z10;
        TLRPC.Document document;
        int i11;
        boolean z11;
        org.telegram.ui.Components.a6 a6Var;
        int cacheType;
        int cacheType2;
        org.telegram.ui.Components.fy fyVar;
        int i12;
        ?? r92;
        boolean z12;
        String formatString;
        ah.i1 i1Var;
        int cacheType3;
        x51 x51Var = this.c;
        ArrayList arrayList = x51Var.G0;
        ArrayList arrayList2 = x51Var.K0;
        ArrayList arrayList3 = x51Var.F0;
        SparseIntArray sparseIntArray = x51Var.w0;
        boolean z13 = x51Var.N0;
        ArrayList arrayList4 = x51Var.D0;
        int i13 = x51Var.W;
        ArrayList arrayList5 = x51Var.M0;
        u41 u41Var = x51Var.h0;
        HashSet hashSet = x51Var.K;
        ArrayList arrayList6 = x51Var.E0;
        int i14 = x51Var.V;
        int i15 = b1Var.f;
        View view = b1Var.a;
        if (i15 == 8) {
            g51 g51Var = (g51) view;
            g51Var.c = i10;
            g51Var.L = hashSet.contains(0L);
            return;
        }
        ValueAnimator valueAnimator = x51Var.U1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        boolean z14 = false;
        if (i15 == 6) {
            TextView textView = (TextView) view;
            if (x51Var.P0 != null) {
                textView.setText(LocaleController.formatString("EmojiStatusExpireHint", R.string.EmojiStatusExpireHint, LocaleController.formatStatusExpireDateTime(r3.intValue())));
                return;
            }
            return;
        }
        if (i15 == 0) {
            c51 c51Var = (c51) view;
            if (i10 == x51Var.x) {
                c51Var.a(LocaleController.getString(R.string.SelectTopicIconHint), false);
                c51Var.c.setVisibility(8);
                return;
            }
            if (i10 == x51Var.f) {
                c51Var.a(LocaleController.getString(R.string.RecentlyUsed), false);
                c51Var.c.setVisibility(8);
                return;
            }
            if (i10 == x51Var.y) {
                c51Var.a(LocaleController.getString(R.string.StickerEffects), false);
                c51Var.c.setVisibility(8);
                return;
            }
            c51Var.c.setVisibility(8);
            if (i10 == x51Var.h) {
                c51Var.a(LocaleController.getString(R.string.PopularReactions), false);
                return;
            }
            if (i10 == x51Var.n) {
                c51Var.a(LocaleController.getString(R.string.EmojiPackCollectibles), false);
                return;
            }
            int i16 = sparseIntArray.get(i10);
            if (i16 < 0) {
                c51Var.a(null, false);
                return;
            }
            org.telegram.ui.Components.fy fyVar2 = (org.telegram.ui.Components.fy) arrayList5.get(i16);
            if (fyVar2.d != null) {
                MediaDataController.getInstance(i14).getStickerSet(fyVar2.d, false);
                fyVar2.d = null;
            }
            if (i13 != 5 && i13 != 7 && i13 != 6 && !fyVar2.e && !UserConfig.getInstance(i14).isPremium()) {
                z14 = true;
            }
            c51Var.a(fyVar2.b.title, z14);
            return;
        }
        if (i15 == 1) {
            g51 g51Var2 = (g51) view;
            g51Var2.c = i10;
            ImageReceiver imageReceiver = g51Var2.n;
            int i17 = x51Var.b;
            if (i10 < i17 || i10 >= x51Var.c) {
                int i18 = x51Var.E;
                i1Var = (i10 < i18 || i10 >= x51Var.F) ? (ah.i1) x51Var.H0.get(i10 - x51Var.d) : (ah.i1) x51Var.J0.get(i10 - i18);
            } else {
                i1Var = (ah.i1) x51Var.I0.get(i10 - i17);
            }
            if (i13 == 13) {
                g51Var2.b = false;
                g51Var2.y = true;
                g51Var2.x = i1Var;
                g51Var2.setDrawable(Emoji.getEmojiDrawable(i1Var.f));
                g51Var2.d(x51Var.J.contains(i1Var), false);
                return;
            }
            g51Var2.a(u41Var);
            g51Var2.y = true;
            g51Var2.x = i1Var;
            g51Var2.d(x51Var.J.contains(i1Var), false);
            g51Var2.b = false;
            if (i1Var.b || i1Var.f == null) {
                g51Var2.s = false;
                g51Var2.e = new org.telegram.ui.Components.a6(i1Var.g, (Paint.FontMetricsInt) null);
                g51Var2.d = null;
                g51Var2.h.clearImage();
                imageReceiver.clearImage();
                Drawable drawable = (Drawable) u41Var.b3.get(g51Var2.e.getDocumentId());
                if (drawable == null) {
                    cacheType3 = x51Var.getCacheType();
                    if (cacheType3 == 3 && i1Var.e) {
                        cacheType3 = 27;
                    }
                    drawable = org.telegram.ui.Components.r5.n(i14, g51Var2.e.getDocumentId(), null, cacheType3);
                    u41Var.b3.put(g51Var2.e.getDocumentId(), drawable);
                }
                g51Var2.setDrawable(drawable);
            } else {
                g51Var2.s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i14).getReactionsMap().get(i1Var.f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.h6.m6, 0.2f);
                    if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                        ah.i1 i1Var2 = i1Var;
                        g51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", i1Var2, 0);
                        i1Var = i1Var2;
                    } else {
                        g51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", i1Var, 0);
                    }
                    MediaDataController.getInstance(i14).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.d1.a());
                } else {
                    g51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                g51Var2.e = null;
                g51Var2.d = null;
                g51Var2.setDrawable(null);
                f51 f51Var = g51Var2.J;
                if (f51Var != null) {
                    f51Var.setVisibility(8);
                    g51Var2.J.setImageReceiver(null);
                }
            }
            if (!UserConfig.getInstance(i14).isPremium() && i13 == 14 && i1Var.b && i1Var.d) {
                g51Var2.b();
                g51Var2.J.setVisibility(0);
                g51Var2.setEmojicon(null);
                return;
            }
            if (i1Var.e) {
                g51Var2.setEmojicon(i1Var.f);
            } else {
                g51Var2.setEmojicon(null);
            }
            f51 f51Var2 = g51Var2.J;
            if (f51Var2 != null) {
                f51Var2.setVisibility(4);
                return;
            }
            return;
        }
        if (i15 == 4) {
            b51 b51Var = (b51) view;
            int i19 = x51Var.y0.get(i10);
            org.telegram.ui.Components.fy fyVar3 = (i19 < 0 || i19 >= arrayList5.size()) ? null : (org.telegram.ui.Components.fy) arrayList5.get(i19);
            if (i19 == -1) {
                x51Var.G = b51Var;
                b51Var.a.setText("+" + ((arrayList4.size() - 40) + (z13 ? 1 : 0) + 1));
                return;
            }
            if (fyVar3 == null) {
                if (x51Var.G == b51Var) {
                    x51Var.G = null;
                    return;
                }
                return;
            } else {
                if (x51Var.G == b51Var) {
                    x51Var.G = null;
                }
                TextView textView2 = b51Var.a;
                StringBuilder sb2 = new StringBuilder("+");
                sb2.append(fyVar3.c.size() - 23);
                textView2.setText(sb2.toString());
                return;
            }
        }
        if (i15 == 5) {
            a51 a51Var = (a51) view;
            int i20 = x51Var.z0.get(i10);
            if (i20 < 0 || i20 >= arrayList5.size() || (fyVar = (org.telegram.ui.Components.fy) arrayList5.get(i20)) == null) {
                return;
            }
            String str = fyVar.b.title;
            boolean z15 = (fyVar.e || UserConfig.getInstance(i14).isPremium()) ? false : true;
            boolean z16 = fyVar.f;
            ai.ha haVar = new ai.ha(this, fyVar, i20, 17);
            sg.q0 q0Var = a51Var.c;
            FrameLayout frameLayout = a51Var.a;
            a51Var.d = str;
            if (z15) {
                i12 = 8;
                frameLayout.setVisibility(8);
                r92 = 0;
                q0Var.setVisibility(0);
                q0Var.a(LocaleController.formatString("UnlockPremiumEmojiPack", R.string.UnlockPremiumEmojiPack, str), haVar, false);
            } else {
                i12 = 8;
                r92 = 0;
                q0Var.setVisibility(8);
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(haVar);
            }
            if (z16) {
                formatString = LocaleController.getString(R.string.Added);
                z12 = true;
            } else {
                int i21 = R.string.AddStickersCount;
                z12 = true;
                Object[] objArr = new Object[1];
                objArr[r92] = a51Var.d;
                formatString = LocaleController.formatString("AddStickersCount", i21, objArr);
            }
            a51Var.b.c(formatString, r92, z12);
            frameLayout.setContentDescription(formatString);
            ValueAnimator valueAnimator2 = a51Var.e;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                a51Var.e = null;
            }
            frameLayout.setEnabled(!z16);
            frameLayout.setAlpha(z16 ? 0.6f : 1.0f);
            ValueAnimator valueAnimator3 = a51Var.n;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                a51Var.n = null;
            }
            Boolean bool = a51Var.h;
            if (bool == null || bool.booleanValue() != z15) {
                a51Var.h = Boolean.valueOf(z15);
                float f7 = z15 ? 1.0f : 0.0f;
                a51Var.f = f7;
                frameLayout.setAlpha(1.0f - f7);
                q0Var.setAlpha(a51Var.f);
                q0Var.setScaleX(a51Var.f);
                q0Var.setScaleY(a51Var.f);
                q0Var.setVisibility(a51Var.h.booleanValue() ? 0 : i12);
                return;
            }
            return;
        }
        if (i15 == 7 || i15 == 9) {
            return;
        }
        g51 g51Var3 = (g51) view;
        g51Var3.v = null;
        g51Var3.w = null;
        g51Var3.a = false;
        g51Var3.c = i10;
        g51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        if ((i13 == 4 && x51Var.Q) || i13 == 6) {
            size = arrayList3.size();
        } else if (i13 == 4 || i13 == 3) {
            size = arrayList4.size();
        } else {
            size = 40;
            if (arrayList4.size() <= 40 || x51Var.C0) {
                size = arrayList4.size() + (z13 ? 1 : 0);
            }
        }
        if (z13) {
            if (i10 == (x51Var.a != -1 ? 1 : 0) + (x51Var.v != -1 ? 1 : 0)) {
                z11 = hashSet.contains(null);
                g51Var3.a = true;
                g51Var3.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                g51Var3.e = null;
                g51Var3.d = null;
                g51Var3.Q = false;
                ImageReceiver imageReceiver2 = g51Var3.h;
                if (imageReceiver2 != null) {
                    imageReceiver2.clearImage();
                }
                a6Var = g51Var3.e;
                if (a6Var == null) {
                    org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) u41Var.b3.get(a6Var.getDocumentId());
                    if (r5Var == null) {
                        if (g51Var3.e.document != null) {
                            cacheType2 = x51Var.getCacheType();
                            r5Var = org.telegram.ui.Components.r5.m(i14, cacheType2, g51Var3.e.document);
                        } else {
                            cacheType = x51Var.getCacheType();
                            r5Var = org.telegram.ui.Components.r5.n(i14, g51Var3.e.getDocumentId(), null, cacheType);
                        }
                        u41Var.b3.put(g51Var3.e.getDocumentId(), r5Var);
                    }
                    g51Var3.setDrawable(r5Var);
                } else {
                    g51Var3.setDrawable(null);
                }
                g51Var3.d(z11, false);
            }
        }
        if (i13 == 13) {
            if ((i10 - (x51Var.a != -1 ? 1 : 0)) - (x51Var.v != -1 ? 1 : 0) < arrayList.size()) {
                String str2 = (String) arrayList.get(((i10 - (x51Var.a != -1 ? 1 : 0)) - (x51Var.v != -1 ? 1 : 0)) - (z13 ? 1 : 0));
                g51Var3.b = false;
                g51Var3.y = false;
                g51Var3.x = ah.i1.b(str2);
                g51Var3.setDrawable(Emoji.getEmojiDrawable(str2));
                g51Var3.d(x51Var.J.contains(g51Var3.x), false);
                return;
            }
        }
        int i22 = x51Var.a;
        int i23 = i10 - (i22 != -1 ? 1 : 0);
        int i24 = x51Var.v;
        if (i23 - (i24 != -1 ? 1 : 0) < size) {
            int i25 = ((i10 - (i22 != -1 ? 1 : 0)) - (i24 != -1 ? 1 : 0)) - (z13 ? 1 : 0);
            if (i13 == 4 && x51Var.Q) {
                g51Var3.c((TLRPC.Document) arrayList3.get(i25), u41Var);
            } else {
                if (i13 == 6) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i25);
                    g51Var3.c(document2, u41Var);
                    if (document2 != null && hashSet.contains(Long.valueOf(document2.id))) {
                        z10 = true;
                    }
                } else {
                    org.telegram.ui.Components.a6 a6Var2 = (org.telegram.ui.Components.a6) arrayList4.get(i25);
                    g51Var3.e = a6Var2;
                    g51Var3.d = a6Var2 == null ? null : a6Var2.document;
                    z10 = a6Var2 != null && hashSet.contains(Long.valueOf(a6Var2.getDocumentId()));
                    g51Var3.Q = false;
                    ImageReceiver imageReceiver3 = g51Var3.h;
                    if (imageReceiver3 != null) {
                        imageReceiver3.clearImage();
                    }
                }
                z11 = z10;
            }
            z10 = false;
            z11 = z10;
        } else {
            if (arrayList6.isEmpty() || (i11 = i10 - x51Var.r) < 0 || i11 >= arrayList6.size()) {
                if (!arrayList2.isEmpty()) {
                    if (((((i10 - (x51Var.a != -1 ? 1 : 0)) - (x51Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) >= 0) {
                        if (((((i10 - (x51Var.a != -1 ? 1 : 0)) - (x51Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) < arrayList2.size()) {
                            org.telegram.ui.Components.a6 a6Var3 = (org.telegram.ui.Components.a6) arrayList2.get(((((i10 - (x51Var.a != -1 ? 1 : 0)) - (x51Var.v != -1 ? 1 : 0)) - size) - 1) - (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1));
                            g51Var3.e = a6Var3;
                            g51Var3.d = a6Var3 == null ? null : a6Var3.document;
                            z10 = a6Var3 != null && hashSet.contains(Long.valueOf(a6Var3.getDocumentId()));
                            g51Var3.Q = false;
                            ImageReceiver imageReceiver4 = g51Var3.h;
                            if (imageReceiver4 != null) {
                                imageReceiver4.clearImage();
                            }
                        }
                    }
                }
                for (int i26 = 0; i26 < sparseIntArray.size(); i26++) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    org.telegram.ui.Components.fy fyVar4 = valueAt >= 0 ? (org.telegram.ui.Components.fy) arrayList5.get(valueAt) : null;
                    if (fyVar4 != null) {
                        int size2 = fyVar4.h ? fyVar4.c.size() : Math.min(fyVar4.c.size(), 24);
                        int i27 = (i10 - keyAt) - 1;
                        if (i27 >= 0 && i27 < size2 && (document = (TLRPC.Document) fyVar4.c.get(i27)) != null) {
                            if (x51Var.Q) {
                                g51Var3.c(document, x51Var.i0);
                            } else {
                                g51Var3.Q = false;
                                ImageReceiver imageReceiver5 = g51Var3.h;
                                if (imageReceiver5 != null) {
                                    imageReceiver5.clearImage();
                                }
                                g51Var3.e = new org.telegram.ui.Components.a6(document, (Paint.FontMetricsInt) null);
                            }
                            g51Var3.d = document;
                        }
                    }
                }
                z10 = true;
                org.telegram.ui.Components.a6 a6Var4 = g51Var3.e;
                if (a6Var4 != null) {
                }
                z10 = false;
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList6.get(i10 - x51Var.r);
                TLRPC.Document document3 = tL_starGiftUnique.getDocument();
                g51Var3.e = new org.telegram.ui.Components.a6(document3, (Paint.FontMetricsInt) null);
                g51Var3.d = document3;
                g51Var3.v = tL_starGiftUnique;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                if (stargiftattributebackdrop != null) {
                    g51Var3.w = Integer.valueOf(stargiftattributebackdrop.pattern_color | (-1879048192));
                }
                z10 = g51Var3.e != null && hashSet.contains(Long.valueOf(tL_starGiftUnique.id));
                g51Var3.Q = false;
                ImageReceiver imageReceiver6 = g51Var3.h;
                if (imageReceiver6 != null) {
                    imageReceiver6.clearImage();
                }
            }
            z11 = z10;
        }
        a6Var = g51Var3.e;
        if (a6Var == null) {
        }
        g51Var3.d(z11, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        x51 x51Var = this.c;
        int i11 = x51Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = x51Var.Z0;
        if (i10 == 0) {
            view = new c51(x51Var, x51Var.getContext(), i11 == 6);
        } else if (i10 == 2) {
            view = new ImageView(x51Var.getContext());
        } else if (i10 == 3 || i10 == 1 || i10 == 8) {
            g51 g51Var = new g51(x51Var, x51Var.getContext());
            if (i10 == 8) {
                g51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(g51Var);
                g51Var.h = imageReceiver;
                g51Var.r = imageReceiver;
                imageReceiver.setImageBitmap(x51Var.N);
                x51Var.O = g51Var;
                g51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            view = g51Var;
        } else if (i10 == 4) {
            Context context = x51Var.getContext();
            b51 b51Var = new b51(context);
            TextView textView = new TextView(context);
            b51Var.a = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), x51Var.g1 ? org.telegram.ui.ActionBar.h6.v(x51Var.f1, org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false))) : i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Te, false), 99)));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            b51Var.addView(textView, w7.z5.e(-2, -2, 17));
            view = b51Var;
        } else if (i10 == 5) {
            a51 a51Var = new a51(x51Var.getContext());
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(a51Var.getContext(), false, false, false, 4);
            a51Var.b = t3Var;
            t3Var.b(0.3f, 250L, org.telegram.ui.Components.bs.h);
            t3Var.setTextSize(AndroidUtilities.dp(14.0f));
            t3Var.setTypeface(AndroidUtilities.bold());
            t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
            t3Var.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(a51Var.getContext());
            a51Var.a = frameLayout;
            frameLayout.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
            frameLayout.addView(t3Var, w7.z5.e(-1, -2, 17));
            a51Var.addView(frameLayout, w7.z5.c(-1.0f, -1));
            sg.q0 q0Var = new sg.q0(a51Var.getContext(), d6Var, false);
            a51Var.c = q0Var;
            q0Var.setIcon(R.raw.unlock_icon);
            a51Var.addView(q0Var, w7.z5.c(-1.0f, -1));
            view = a51Var;
        } else if (i10 == 6) {
            kd0 kd0Var = new kd0(x51Var.getContext(), 3);
            kd0Var.setTextSize(1, 13.0f);
            if (i11 == 3) {
                kd0Var.setText(LocaleController.getString(R.string.SelectTopicIconHint));
            } else if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
                kd0Var.setText(LocaleController.getString(R.string.EmojiLongtapHint));
            } else {
                kd0Var.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
            }
            kd0Var.setGravity(17);
            kd0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.y6, d6Var));
            view = kd0Var;
        } else if (i10 == 7) {
            View s3Var = new org.telegram.ui.Cells.s3(x51Var.getContext(), 52);
            s3Var.setTag("searchbox");
            view = s3Var;
        } else {
            view = new g51(x51Var, x51Var.getContext());
        }
        if (x51.c(x51Var)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.sl0(view);
    }
}
