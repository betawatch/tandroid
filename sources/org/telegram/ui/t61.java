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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t61 extends org.telegram.ui.Components.kl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ j71 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public t61(j71 j71Var) {
        this.s = j71Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z10) {
        j71 j71Var = this.s;
        int i10 = j71Var.W;
        boolean z11 = j71Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = j71Var.A1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < j71Var.A1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, j71Var.A1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = j71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < j71Var.B1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, j71Var.B1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = j71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < j71Var.C1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, j71Var.C1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = j71Var.D1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (j71Var.y1 && this.n == 0) {
            z12 = true;
        }
        if (j71Var.G1 == z12) {
            return;
        }
        j71Var.G1 = z12;
        ValueAnimator valueAnimator = j71Var.H1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        j71Var.H1 = ofFloat;
        ofFloat.addUpdateListener(new p51(j71Var, z12, i11));
        j71Var.H1.addListener(new c61(j71Var, z12, i11));
        j71Var.H1.setInterpolator(org.telegram.ui.Components.pr.h);
        j71Var.H1.setDuration(100L);
        j71Var.H1.start();
        if (z12) {
            j71.D(j71Var.V, j71Var.l0);
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
        j71 j71Var = this.s;
        if (j71Var.W == 14) {
            ArrayList arrayList = j71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < j71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = j71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (j71Var.W == 13 || ((ah.j1) j71Var.A1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= j71Var.D1.size()) {
            return 4;
        }
        return j71Var.D1.get(i10 - this.h) instanceof g71 ? 6 : 3;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        ah.j1 j1Var;
        int cacheType2;
        int i13;
        int indexOf;
        j71 j71Var = this.s;
        HashSet hashSet = j71Var.K;
        int i14 = j71Var.W;
        int i15 = j71Var.V;
        w51 w51Var = j71Var.i0;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 6) {
            o61 o61Var = (o61) view;
            ArrayList arrayList = j71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) j71Var.D1.get(i10 - this.h);
                if (document2 instanceof g71) {
                    CharSequence charSequence = ((g71) document2).a;
                    String str = j71Var.z1;
                    o61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, o61Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    o61Var.a.setText(charSequence);
                    o61Var.b(false);
                }
            } else if (i10 == this.e) {
                o61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                o61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                o61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            o61Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) j71Var.C1.get((i10 - this.c) - 1);
            s61 s61Var = (s61) view;
            s61Var.a(w51Var);
            s61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", document3, 0);
            s61Var.Q = true;
            s61Var.d = document3;
            s61Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                s61 s61Var2 = (s61) view;
                s61Var2.a = false;
                s61Var2.c = i10;
                s61Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                s61Var2.setDrawable(null);
                ArrayList arrayList2 = j71Var.A1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = j71Var.D1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) j71Var.D1.get(i10 - this.h);
                        if (!(document instanceof g71)) {
                            l4 = null;
                        }
                    }
                    document = null;
                    l4 = null;
                } else {
                    ah.j1 j1Var2 = (ah.j1) j71Var.A1.get(i10);
                    s61Var2.x = j1Var2;
                    long j3 = j1Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = j71Var.J.contains(j1Var2);
                        s61Var2.y = true;
                        s61Var2.setDrawable(Emoji.getEmojiDrawable(j1Var2.f));
                        s61Var2.d(contains2, false);
                        return;
                    }
                    l4 = Long.valueOf(j3);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && j1Var2.b && j1Var2.d) {
                        s61Var2.b();
                        s61Var2.J.setVisibility(0);
                    } else {
                        r61 r61Var = s61Var2.J;
                        if (r61Var != null) {
                            r61Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l4 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        s61Var2.e = new org.telegram.ui.Components.z5(document, (Paint.FontMetricsInt) null);
                        s61Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(l4.longValue(), (Paint.FontMetricsInt) null);
                        s61Var2.e = z5Var;
                        s61Var2.d = z5Var.document;
                        contains = hashSet.contains(l4);
                    }
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) w51Var.d3.get(s61Var2.e.getDocumentId());
                    if (q5Var == null) {
                        cacheType = j71Var.getCacheType();
                        q5Var = org.telegram.ui.Components.q5.n(i15, s61Var2.e.getDocumentId(), null, cacheType);
                        w51Var.d3.put(s61Var2.e.getDocumentId(), q5Var);
                    }
                    s61Var2.setDrawable(q5Var);
                }
                s61Var2.d(contains, false);
                return;
            }
            return;
        }
        s61 s61Var3 = (s61) view;
        s61Var3.c = i10;
        ImageReceiver imageReceiver = s61Var3.n;
        ArrayList arrayList4 = j71Var.A1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = j71Var.B1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                j1Var = (ah.j1) j71Var.B1.get(i10 - this.c);
            }
        } else {
            j1Var = (ah.j1) j71Var.A1.get(i10);
        }
        if (s61Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(s61Var3);
            s61Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            s61Var3.h.onAttachedToWindow();
        }
        s61Var3.h.setParentView(w51Var);
        s61Var3.x = j1Var;
        s61Var3.y = false;
        s61Var3.d(j71Var.J.contains(j1Var), false);
        s61Var3.b = false;
        s61Var3.invalidate();
        if (i14 == 13) {
            s61Var3.setDrawable(Emoji.getEmojiDrawable(j1Var.f));
        } else if (j1Var.b || j1Var.f == null) {
            s61Var3.s = false;
            s61Var3.e = new org.telegram.ui.Components.z5(j1Var.g, (Paint.FontMetricsInt) null);
            s61Var3.d = null;
            s61Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) w51Var.d3.get(s61Var3.e.getDocumentId());
            if (q5Var2 == null) {
                cacheType2 = j71Var.getCacheType();
                q5Var2 = org.telegram.ui.Components.q5.n(i15, s61Var3.e.getDocumentId(), null, cacheType2);
                w51Var.d3.put(s61Var3.e.getDocumentId(), q5Var2);
            }
            s61Var3.setDrawable(q5Var2);
        } else {
            s61Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(j1Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    ah.j1 j1Var3 = j1Var;
                    s61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", j1Var3, 0);
                    j1Var = j1Var3;
                } else {
                    s61Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", j1Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ah.e1.a());
            } else {
                s61Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            s61Var3.e = null;
            s61Var3.d = null;
            s61Var3.setDrawable(null);
            r61 r61Var2 = s61Var3.J;
            if (r61Var2 != null) {
                r61Var2.setVisibility(8);
                s61Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && j1Var.b) {
                s61Var3.setDrawable(Emoji.getEmojiDrawable(j1Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && j1Var.b && j1Var.d) {
            s61Var3.b();
            s61Var3.J.setVisibility(0);
            s61Var3.setEmojicon(null);
            return;
        }
        if (j1Var.e) {
            s61Var3.setEmojicon(j1Var.f);
        } else {
            s61Var3.setEmojicon(null);
        }
        r61 r61Var3 = s61Var3.J;
        if (r61Var3 != null) {
            r61Var3.setVisibility(4);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View s61Var;
        j71 j71Var = this.s;
        if (i10 == 6) {
            s61Var = new o61(j71Var, j71Var.getContext(), j71Var.W == 6);
        } else if (i10 == 7) {
            s61Var = new org.telegram.ui.Components.jn(j71Var.getContext(), 25);
            s61Var.setTag("searchbox");
        } else {
            s61Var = new s61(j71Var, j71Var.getContext());
        }
        if (j71.c(j71Var)) {
            s61Var.setScaleX(0.0f);
            s61Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.vk0(s61Var);
    }
}
