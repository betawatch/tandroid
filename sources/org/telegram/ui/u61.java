package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u61 extends org.telegram.ui.Components.pm0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ k71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public u61(k71 k71Var) {
        this.s = k71Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        k71 k71Var = this.s;
        int i10 = k71Var.W;
        boolean z11 = k71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = k71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < k71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, k71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = k71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < k71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, k71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = k71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < k71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, k71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = k71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (k71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (k71Var.G1 == z12) {
            return;
        }
        k71Var.G1 = z12;
        ValueAnimator valueAnimator = k71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        k71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new p51(k71Var, z12, i11));
        k71Var.H1.addListener(new d61(k71Var, z12, i11));
        k71Var.H1.setInterpolator(org.telegram.ui.Components.hs.h);
        k71Var.H1.setDuration(100L);
        k71Var.H1.start();
        if (z12) {
            k71.D(k71Var.V, k71Var.l0);
        }
    }

    @Override // s4.i0
    public final int h() {
        return this.n;
    }

    @Override // s4.i0
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        k71 k71Var = this.s;
        if (k71Var.W == 14) {
            ArrayList arrayList = k71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < k71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = k71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (k71Var.W == 13 || ((zg.n0) k71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= k71Var.D1.size()) {
            return 4;
        }
        return k71Var.D1.get(i10 - this.h) instanceof h71 ? 6 : 3;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.n0 n0Var;
        int cacheType2;
        int i13;
        int indexOf;
        k71 k71Var = this.s;
        HashSet hashSet = k71Var.K;
        int i14 = k71Var.W;
        int i15 = k71Var.V;
        x51 x51Var = k71Var.i0;
        int i16 = d1Var.f;
        View view = d1Var.a;
        if (i16 == 6) {
            p61 p61Var = (p61) view;
            ArrayList arrayList = k71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) k71Var.D1.get(i10 - this.h);
                if (document2 instanceof h71) {
                    CharSequence charSequence = ((h71) document2).a;
                    String str = k71Var.z1;
                    p61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ue, p61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    p61Var.a.setText(charSequence);
                    p61Var.b(false);
                }
            } else if (i10 == this.e) {
                p61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                p61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                p61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            p61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) k71Var.C1.get((i10 - this.c) - 1);
            t61 t61Var = (t61) view;
            t61Var.a(x51Var);
            t61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.i6.m6, 0.2f), 0L, "tgs", document3, 0);
            t61Var.Q = true;
            t61Var.d = document3;
            t61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                t61 t61Var2 = (t61) view;
                t61Var2.a = false;
                t61Var2.c = i10;
                t61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                t61Var2.setDrawable(null);
                ArrayList arrayList2 = k71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = k71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) k71Var.D1.get(i10 - this.h);
                        if (!(document instanceof h71)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    zg.n0 n0Var2 = (zg.n0) k71Var.A1.get(i10);
                    t61Var2.x = n0Var2;
                    long j3 = n0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = k71Var.J.contains(n0Var2);
                        t61Var2.y = true;
                        t61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var2.f));
                        t61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && n0Var2.b && n0Var2.d) {
                        t61Var2.b();
                        t61Var2.J.setVisibility(0);
                    } else {
                        s61 s61Var = t61Var2.J;
                        if (s61Var != null) {
                            s61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        t61Var2.e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                        t61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(l4.longValue(), (Paint.FontMetricsInt) null);
                        t61Var2.e = b6Var;
                        t61Var2.d = b6Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) x51Var.b3.get(t61Var2.e.getDocumentId());
                    if (s5Var == null) {
                        cacheType = k71Var.getCacheType();
                        s5Var = org.telegram.ui.Components.s5.n(i15, t61Var2.e.getDocumentId(), null, cacheType);
                        x51Var.b3.put(t61Var2.e.getDocumentId(), s5Var);
                    }
                    t61Var2.setDrawable(s5Var);
                }
                t61Var2.d(contains, false);
                return;
            }
            return;
        }
        t61 t61Var3 = (t61) view;
        t61Var3.c = i10;
        ImageReceiver imageReceiver = t61Var3.n;
        ArrayList arrayList4 = k71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = k71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                n0Var = (zg.n0) k71Var.B1.get(i10 - this.c);
            }
        } else {
            n0Var = (zg.n0) k71Var.A1.get(i10);
        }
        if (t61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(t61Var3);
            t61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            t61Var3.h.onAttachedToWindow();
        }
        t61Var3.h.setParentView(x51Var);
        t61Var3.x = n0Var;
        t61Var3.y = false;
        t61Var3.d(k71Var.J.contains(n0Var), false);
        t61Var3.b = false;
        t61Var3.invalidate();
        if (i14 == 13) {
            t61Var3.setDrawable(Emoji.getEmojiDrawable(n0Var.f));
        } else if (n0Var.b || n0Var.f == null) {
            t61Var3.s = false;
            t61Var3.e = new org.telegram.ui.Components.b6(n0Var.g, (Paint.FontMetricsInt) null);
            t61Var3.d = null;
            t61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) x51Var.b3.get(t61Var3.e.getDocumentId());
            if (s5Var2 == null) {
                cacheType2 = k71Var.getCacheType();
                s5Var2 = org.telegram.ui.Components.s5.n(i15, t61Var3.e.getDocumentId(), null, cacheType2);
                x51Var.b3.put(t61Var3.e.getDocumentId(), s5Var2);
            }
            t61Var3.setDrawable(s5Var2);
        } else {
            t61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(n0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    zg.n0 n0Var3 = n0Var;
                    t61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", n0Var3, 0);
                    n0Var = n0Var3;
                } else {
                    t61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
            } else {
                t61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            t61Var3.e = null;
            t61Var3.d = null;
            t61Var3.setDrawable(null);
            s61 s61Var2 = t61Var3.J;
            if (s61Var2 != null) {
                s61Var2.setVisibility(8);
                t61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && n0Var.b) {
                t61Var3.setDrawable(Emoji.getEmojiDrawable(n0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && n0Var.b && n0Var.d) {
            t61Var3.b();
            t61Var3.J.setVisibility(0);
            t61Var3.setEmojicon(null);
            return;
        }
        if (n0Var.e) {
            t61Var3.setEmojicon(n0Var.f);
        } else {
            t61Var3.setEmojicon(null);
        }
        s61 s61Var3 = t61Var3.J;
        if (s61Var3 != null) {
            s61Var3.setVisibility(4);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View t61Var;
        k71 k71Var = this.s;
        if (i10 == 6) {
            t61Var = new p61(k71Var, k71Var.getContext(), k71Var.W == 6);
        } else if (i10 == 7) {
            t61Var = new org.telegram.ui.Components.ao(k71Var.getContext(), 25);
            t61Var.setTag("searchbox");
        } else {
            t61Var = new t61(k71Var, k71Var.getContext());
        }
        if (k71.c(k71Var)) {
            t61Var.setScaleX(0.0f);
            t61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.am0(t61Var);
    }
}
