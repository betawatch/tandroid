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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s61 extends org.telegram.ui.Components.ll0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ i71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public s61(i71 i71Var) {
        this.s = i71Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        i71 i71Var = this.s;
        int i10 = i71Var.W;
        boolean z11 = i71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = i71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < i71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, i71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = i71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < i71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, i71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = i71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < i71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, i71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = i71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (i71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (i71Var.G1 == z12) {
            return;
        }
        i71Var.G1 = z12;
        ValueAnimator valueAnimator = i71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        i71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new p51(i71Var, z12, i11));
        i71Var.H1.addListener(new b61(i71Var, z12, i11));
        i71Var.H1.setInterpolator(org.telegram.ui.Components.qr.h);
        i71Var.H1.setDuration(100L);
        i71Var.H1.start();
        if (z12) {
            i71.D(i71Var.V, i71Var.l0);
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
        i71 i71Var = this.s;
        if (i71Var.W == 14) {
            ArrayList arrayList = i71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < i71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = i71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (i71Var.W == 13 || ((zg.p0) i71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= i71Var.D1.size()) {
            return 4;
        }
        return i71Var.D1.get(i10 - this.h) instanceof f71 ? 6 : 3;
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
        i71 i71Var = this.s;
        HashSet hashSet = i71Var.K;
        int i14 = i71Var.W;
        int i15 = i71Var.V;
        v51 v51Var = i71Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            n61 n61Var = (n61) view;
            ArrayList arrayList = i71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) i71Var.D1.get(i10 - this.h);
                if (document2 instanceof f71) {
                    CharSequence charSequence = ((f71) document2).a;
                    String str = i71Var.z1;
                    n61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, n61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    n61Var.a.setText(charSequence);
                    n61Var.b(false);
                }
            } else if (i10 == this.e) {
                n61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                n61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                n61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            n61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) i71Var.C1.get((i10 - this.c) - 1);
            r61 r61Var = (r61) view;
            r61Var.a(v51Var);
            r61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", document3, 0);
            r61Var.Q = true;
            r61Var.d = document3;
            r61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                r61 r61Var2 = (r61) view;
                r61Var2.a = false;
                r61Var2.c = i10;
                r61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                r61Var2.setDrawable(null);
                ArrayList arrayList2 = i71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = i71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) i71Var.D1.get(i10 - this.h);
                        if (!(document instanceof f71)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    zg.p0 p0Var2 = (zg.p0) i71Var.A1.get(i10);
                    r61Var2.x = p0Var2;
                    long j3 = p0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = i71Var.J.contains(p0Var2);
                        r61Var2.y = true;
                        r61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var2.f));
                        r61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var2.b && p0Var2.d) {
                        r61Var2.b();
                        r61Var2.J.setVisibility(0);
                    } else {
                        q61 q61Var = r61Var2.J;
                        if (q61Var != null) {
                            q61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        r61Var2.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                        r61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l4.longValue(), (Paint.FontMetricsInt) null);
                        r61Var2.e = x5Var;
                        r61Var2.d = x5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) v51Var.d3.get(r61Var2.e.getDocumentId());
                    if (o5Var == null) {
                        cacheType = i71Var.getCacheType();
                        o5Var = org.telegram.ui.Components.o5.n(i15, r61Var2.e.getDocumentId(), null, cacheType);
                        v51Var.d3.put(r61Var2.e.getDocumentId(), o5Var);
                    }
                    r61Var2.setDrawable(o5Var);
                }
                r61Var2.d(contains, false);
                return;
            }
            return;
        }
        r61 r61Var3 = (r61) view;
        r61Var3.c = i10;
        ImageReceiver imageReceiver = r61Var3.n;
        ArrayList arrayList4 = i71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = i71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                p0Var = (zg.p0) i71Var.B1.get(i10 - this.c);
            }
        } else {
            p0Var = (zg.p0) i71Var.A1.get(i10);
        }
        if (r61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(r61Var3);
            r61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            r61Var3.h.onAttachedToWindow();
        }
        r61Var3.h.setParentView(v51Var);
        r61Var3.x = p0Var;
        r61Var3.y = false;
        r61Var3.d(i71Var.J.contains(p0Var), false);
        r61Var3.b = false;
        r61Var3.invalidate();
        if (i14 == 13) {
            r61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
        } else if (p0Var.b || p0Var.f == null) {
            r61Var3.s = false;
            r61Var3.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
            r61Var3.d = null;
            r61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) v51Var.d3.get(r61Var3.e.getDocumentId());
            if (o5Var2 == null) {
                cacheType2 = i71Var.getCacheType();
                o5Var2 = org.telegram.ui.Components.o5.n(i15, r61Var3.e.getDocumentId(), null, cacheType2);
                v51Var.d3.put(r61Var3.e.getDocumentId(), o5Var2);
            }
            r61Var3.setDrawable(o5Var2);
        } else {
            r61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    zg.p0 p0Var3 = p0Var;
                    r61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var3, 0);
                    p0Var = p0Var3;
                } else {
                    r61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
            } else {
                r61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            r61Var3.e = null;
            r61Var3.d = null;
            r61Var3.setDrawable(null);
            q61 q61Var2 = r61Var3.J;
            if (q61Var2 != null) {
                q61Var2.setVisibility(8);
                r61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && p0Var.b) {
                r61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.b && p0Var.d) {
            r61Var3.b();
            r61Var3.J.setVisibility(0);
            r61Var3.setEmojicon(null);
            return;
        }
        if (p0Var.e) {
            r61Var3.setEmojicon(p0Var.f);
        } else {
            r61Var3.setEmojicon(null);
        }
        q61 q61Var3 = r61Var3.J;
        if (q61Var3 != null) {
            q61Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r61Var;
        i71 i71Var = this.s;
        if (i10 == 6) {
            r61Var = new n61(i71Var, i71Var.getContext(), i71Var.W == 6);
        } else if (i10 == 7) {
            r61Var = new org.telegram.ui.Components.kn(i71Var.getContext(), 25);
            r61Var.setTag("searchbox");
        } else {
            r61Var = new r61(i71Var, i71Var.getContext());
        }
        if (i71.c(i71Var)) {
            r61Var.setScaleX(0.0f);
            r61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.wk0(r61Var);
    }
}
