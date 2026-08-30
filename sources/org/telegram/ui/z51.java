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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z51 extends org.telegram.ui.Components.rl0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ q61 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public z51(q61 q61Var) {
        this.s = q61Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 4;
    }

    public final void E(boolean z4) {
        q61 q61Var = this.s;
        int i10 = q61Var.T;
        boolean z10 = q61Var.F;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z11 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = q61Var.x1;
        int i11 = 1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i12 = this.n;
                this.n = i12 + 1;
                this.e = i12;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i13 = 0; i13 < q61Var.x1.size(); i13++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, q61Var.x1.get(i13))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = q61Var.y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i14 = this.n;
                this.n = i14 + 1;
                this.f = i14;
                arrayList.add(2);
                this.c = this.n;
                for (int i15 = 0; i15 < q61Var.y1.size(); i15++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q61Var.y1.get(i15))));
                }
            }
        } else {
            ArrayList arrayList4 = q61Var.z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    this.f = i16;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i17 = 0; i17 < q61Var.z1.size(); i17++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q61Var.z1.get(i17))));
                }
            }
        }
        ArrayList arrayList5 = q61Var.A1;
        if (arrayList5 != null) {
            int i18 = this.n;
            this.h = i18;
            this.n = arrayList5.size() + i18;
        }
        l();
        if (q61Var.v1 && this.n == 0) {
            z11 = true;
        }
        if (q61Var.D1 == z11) {
            return;
        }
        q61Var.D1 = z11;
        ValueAnimator valueAnimator = q61Var.E1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        q61Var.E1 = ofFloat;
        ofFloat.addUpdateListener(new u41(q61Var, z11, i11));
        q61Var.E1.addListener(new i51(q61Var, z11, i11));
        q61Var.E1.setInterpolator(org.telegram.ui.Components.nr.h);
        q61Var.E1.setDuration(100L);
        q61Var.E1.start();
        if (z11) {
            q61.D(q61Var.S, q61Var.i0);
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.n;
    }

    @Override // f2.o0
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f) {
            return 6;
        }
        q61 q61Var = this.s;
        if (q61Var.T == 14) {
            ArrayList arrayList = q61Var.y1;
            if (arrayList != null && i10 >= (i11 = this.c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i10 > this.c && (i10 - r2) - 1 < q61Var.z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = q61Var.x1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i10 > this.d && (i10 - r5) - 1 < arrayList2.size() && (q61Var.T == 13 || ((mg.q0) q61Var.x1.get((i10 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i12 = this.h;
        if (i10 - i12 < 0 || i10 - i12 >= q61Var.A1.size()) {
            return 4;
        }
        return q61Var.A1.get(i10 - this.h) instanceof n61 ? 6 : 3;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        mg.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        q61 q61Var = this.s;
        HashSet hashSet = q61Var.H;
        int i14 = q61Var.T;
        int i15 = q61Var.S;
        b51 b51Var = q61Var.f0;
        int i16 = l1Var.f;
        View view = l1Var.a;
        if (i16 == 6) {
            u51 u51Var = (u51) view;
            ArrayList arrayList = q61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) q61Var.A1.get(i10 - this.h);
                if (document2 instanceof n61) {
                    CharSequence charSequence = ((n61) document2).a;
                    String str = q61Var.w1;
                    u51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, u51Var.f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    u51Var.a.setText(charSequence);
                    u51Var.b(false);
                }
            } else if (i10 == this.e) {
                u51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                u51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                u51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            u51Var.c.setVisibility(8);
            return;
        }
        if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) q61Var.z1.get((i10 - this.c) - 1);
            y51 y51Var = (y51) view;
            y51Var.a(b51Var);
            y51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", document3, 0);
            y51Var.N = true;
            y51Var.d = document3;
            y51Var.e = null;
            return;
        }
        if (i16 != 4) {
            if (i16 == 3) {
                y51 y51Var2 = (y51) view;
                y51Var2.a = false;
                y51Var2.c = i10;
                y51Var2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                y51Var2.setDrawable(null);
                ArrayList arrayList2 = q61Var.x1;
                if (arrayList2 == null || i10 < 0 || i10 >= arrayList2.size()) {
                    ArrayList arrayList3 = q61Var.A1;
                    if (arrayList3 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList3.size()) {
                        document = (TLRPC.Document) q61Var.A1.get(i10 - this.h);
                        if (!(document instanceof n61)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    mg.q0 q0Var2 = (mg.q0) q61Var.x1.get(i10);
                    y51Var2.x = q0Var2;
                    long j10 = q0Var2.g;
                    if (j10 == 0) {
                        boolean contains2 = q61Var.G.contains(q0Var2);
                        y51Var2.y = true;
                        y51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var2.f));
                        y51Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j10);
                    if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var2.b && q0Var2.d) {
                        y51Var2.b();
                        y51Var2.G.setVisibility(0);
                    } else {
                        x51 x51Var = y51Var2.G;
                        if (x51Var != null) {
                            x51Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        y51Var2.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                        y51Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                        y51Var2.e = u5Var;
                        y51Var2.d = u5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) b51Var.a3.get(y51Var2.e.getDocumentId());
                    if (l5Var == null) {
                        cacheType = q61Var.getCacheType();
                        l5Var = org.telegram.ui.Components.l5.n(i15, y51Var2.e.getDocumentId(), null, cacheType);
                        b51Var.a3.put(y51Var2.e.getDocumentId(), l5Var);
                    }
                    y51Var2.setDrawable(l5Var);
                }
                y51Var2.d(contains, false);
                return;
            }
            return;
        }
        y51 y51Var3 = (y51) view;
        y51Var3.c = i10;
        ImageReceiver imageReceiver = y51Var3.n;
        ArrayList arrayList4 = q61Var.x1;
        if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
            ArrayList arrayList5 = q61Var.y1;
            if (arrayList5 == null || i10 < (i12 = this.c) || i10 - i12 >= arrayList5.size()) {
                return;
            } else {
                q0Var = (mg.q0) q61Var.y1.get(i10 - this.c);
            }
        } else {
            q0Var = (mg.q0) q61Var.x1.get(i10);
        }
        if (y51Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(y51Var3);
            y51Var3.h = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            y51Var3.h.onAttachedToWindow();
        }
        y51Var3.h.setParentView(b51Var);
        y51Var3.x = q0Var;
        y51Var3.y = false;
        y51Var3.d(q61Var.G.contains(q0Var), false);
        y51Var3.b = false;
        y51Var3.invalidate();
        if (i14 == 13) {
            y51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
        } else if (q0Var.b || q0Var.f == null) {
            y51Var3.s = false;
            y51Var3.e = new org.telegram.ui.Components.u5(q0Var.g, (Paint.FontMetricsInt) null);
            y51Var3.d = null;
            y51Var3.h.clearImage();
            imageReceiver.clearImage();
            org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) b51Var.a3.get(y51Var3.e.getDocumentId());
            if (l5Var2 == null) {
                cacheType2 = q61Var.getCacheType();
                l5Var2 = org.telegram.ui.Components.l5.n(i15, y51Var3.e.getDocumentId(), null, cacheType2);
                b51Var.a3.put(y51Var3.e.getDocumentId(), l5Var2);
            }
            y51Var3.setDrawable(l5Var2);
        } else {
            y51Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f);
            if (tL_availableReaction != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.m6, 0.2f);
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    mg.q0 q0Var3 = q0Var;
                    y51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var3, 0);
                    q0Var = q0Var3;
                } else {
                    y51Var3.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                }
                MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a());
            } else {
                y51Var3.h.clearImage();
                imageReceiver.clearImage();
            }
            y51Var3.e = null;
            y51Var3.d = null;
            y51Var3.setDrawable(null);
            x51 x51Var2 = y51Var3.G;
            if (x51Var2 != null) {
                x51Var2.setVisibility(8);
                y51Var3.G.setImageReceiver(null);
            }
            if (tL_availableReaction == null && q0Var.b) {
                y51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var.f));
            }
        }
        if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.b && q0Var.d) {
            y51Var3.b();
            y51Var3.G.setVisibility(0);
            y51Var3.setEmojicon(null);
            return;
        }
        if (q0Var.e) {
            y51Var3.setEmojicon(q0Var.f);
        } else {
            y51Var3.setEmojicon(null);
        }
        x51 x51Var3 = y51Var3.G;
        if (x51Var3 != null) {
            x51Var3.setVisibility(4);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View y51Var;
        q61 q61Var = this.s;
        if (i10 == 6) {
            y51Var = new u51(q61Var, q61Var.getContext(), q61Var.T == 6);
        } else if (i10 == 7) {
            y51Var = new org.telegram.ui.Components.hn(q61Var.getContext(), 22);
            y51Var.setTag("searchbox");
        } else {
            y51Var = new y51(q61Var, q61Var.getContext());
        }
        if (q61.c(q61Var)) {
            y51Var.setScaleX(0.0f);
            y51Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.el0(y51Var);
    }
}
