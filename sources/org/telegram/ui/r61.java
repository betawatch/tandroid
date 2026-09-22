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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r61 extends org.telegram.ui.Components.kl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ h71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public r61(h71 h71Var) {
        this.s = h71Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        h71 h71Var = this.s;
        int i10 = h71Var.W;
        boolean z11 = h71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = h71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < h71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, h71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = h71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < h71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, h71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = h71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < h71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, h71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = h71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (h71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (h71Var.G1 == z12) {
            return;
        }
        h71Var.G1 = z12;
        ValueAnimator valueAnimator = h71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        h71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new n51(h71Var, z12, i11));
        h71Var.H1.addListener(new a61(h71Var, z12, i11));
        h71Var.H1.setInterpolator(org.telegram.ui.Components.qr.h);
        h71Var.H1.setDuration(100L);
        h71Var.H1.start();
        if (z12) {
            h71.D(h71Var.V, h71Var.l0);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.n;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        h71 h71Var = this.s;
        if (h71Var.W == 14) {
            ArrayList arrayList = h71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < h71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = h71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (h71Var.W == 13 || ((zg.p0) h71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= h71Var.D1.size()) {
            return 4;
        }
        return h71Var.D1.get(i10 - this.h) instanceof e71 ? 6 : 3;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.p0 p0Var;
        int cacheType2;
        int i13;
        int indexOf;
        h71 h71Var = this.s;
        HashSet hashSet = h71Var.K;
        int i14 = h71Var.W;
        int i15 = h71Var.V;
        u51 u51Var = h71Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            m61 m61Var = (m61) view;
            ArrayList arrayList = h71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) h71Var.D1.get(i10 - this.h);
                if (document2 instanceof e71) {
                    CharSequence charSequence = ((e71) document2).a;
                    String str = h71Var.z1;
                    m61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ue, m61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    m61Var.a.setText(charSequence);
                    m61Var.b(false);
                }
            } else if (i10 == this.e) {
                m61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                m61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                m61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            m61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) h71Var.C1.get((i10 - this.c) - 1);
            q61 q61Var = (q61) view;
            q61Var.a(u51Var);
            q61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.i6.m6, 0.2f), 0L, "tgs", document3, 0);
            q61Var.Q = true;
            q61Var.d = document3;
            q61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                q61 q61Var2 = (q61) view;
                q61Var2.a = false;
                q61Var2.c = i10;
                q61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                q61Var2.setDrawable(null);
                ArrayList arrayList2 = h71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = h71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) h71Var.D1.get(i10 - this.h);
                        if (!(document instanceof e71)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    zg.p0 p0Var2 = (zg.p0) h71Var.A1.get(i10);
                    q61Var2.x = p0Var2;
                    long j3 = p0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = h71Var.J.contains(p0Var2);
                        q61Var2.y = true;
                        q61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var2.f));
                        q61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var2.b && p0Var2.d) {
                        q61Var2.b();
                        q61Var2.J.setVisibility(0);
                    } else {
                        p61 p61Var = q61Var2.J;
                        if (p61Var != null) {
                            p61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        q61Var2.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                        q61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l4.longValue(), (Paint.FontMetricsInt) null);
                        q61Var2.e = x5Var;
                        q61Var2.d = x5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) u51Var.d3.get(q61Var2.e.getDocumentId());
                    if (o5Var == null) {
                        cacheType = h71Var.getCacheType();
                        o5Var = org.telegram.ui.Components.o5.n(i15, q61Var2.e.getDocumentId(), null, cacheType);
                        u51Var.d3.put(q61Var2.e.getDocumentId(), o5Var);
                    }
                    q61Var2.setDrawable(o5Var);
                }
                q61Var2.d(contains, false);
                return;
            }
            return;
        }
        q61 q61Var3 = (q61) view;
        q61Var3.c = i10;
        ImageReceiver imageReceiver = q61Var3.n;
        ArrayList arrayList4 = h71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = h71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                p0Var = (zg.p0) h71Var.B1.get(i10 - this.c);
            }
        } else {
            p0Var = (zg.p0) h71Var.A1.get(i10);
        }
        if (q61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(q61Var3);
            q61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            q61Var3.h.onAttachedToWindow();
        }
        q61Var3.h.setParentView(u51Var);
        q61Var3.x = p0Var;
        q61Var3.y = false;
        q61Var3.d(h71Var.J.contains(p0Var), false);
        q61Var3.b = false;
        q61Var3.invalidate();
        if (i14 == 13) {
            q61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
        } else if (p0Var.b || p0Var.f == null) {
            q61Var3.s = false;
            q61Var3.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
            q61Var3.d = null;
            q61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) u51Var.d3.get(q61Var3.e.getDocumentId());
            if (o5Var2 == null) {
                cacheType2 = h71Var.getCacheType();
                o5Var2 = org.telegram.ui.Components.o5.n(i15, q61Var3.e.getDocumentId(), null, cacheType2);
                u51Var.d3.put(q61Var3.e.getDocumentId(), o5Var2);
            }
            q61Var3.setDrawable(o5Var2);
        } else {
            q61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    zg.p0 p0Var3 = p0Var;
                    q61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var3, 0);
                    p0Var = p0Var3;
                } else {
                    q61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
            } else {
                q61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            q61Var3.e = null;
            q61Var3.d = null;
            q61Var3.setDrawable(null);
            p61 p61Var2 = q61Var3.J;
            if (p61Var2 != null) {
                p61Var2.setVisibility(8);
                q61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && p0Var.b) {
                q61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.b && p0Var.d) {
            q61Var3.b();
            q61Var3.J.setVisibility(0);
            q61Var3.setEmojicon(null);
            return;
        }
        if (p0Var.e) {
            q61Var3.setEmojicon(p0Var.f);
        } else {
            q61Var3.setEmojicon(null);
        }
        p61 p61Var3 = q61Var3.J;
        if (p61Var3 != null) {
            p61Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View q61Var;
        h71 h71Var = this.s;
        if (i10 == 6) {
            q61Var = new m61(h71Var, h71Var.getContext(), h71Var.W == 6);
        } else if (i10 == 7) {
            q61Var = new org.telegram.ui.Components.kn(h71Var.getContext(), 25);
            q61Var.setTag("searchbox");
        } else {
            q61Var = new q61(h71Var, h71Var.getContext());
        }
        if (h71.c(h71Var)) {
            q61Var.setScaleX(0.0f);
            q61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vk0(q61Var);
    }
}
