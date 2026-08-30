package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.vx;
import org.telegram.ui.q61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class n1 extends f2.o0 {
    public final TLRPC.TL_inputStickerSetShortName B;
    public TLRPC.TL_messages_stickerSet C;
    public TLRPC.TL_messages_stickerSet D;
    public String E;
    public String F;
    public String[] G;
    public int H;
    public final /* synthetic */ o1 K;
    public int c;
    public boolean w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int x = 0;
    public final SparseIntArray y = new SparseIntArray();
    public final HashSet I = new HashSet();
    public final org.telegram.ui.web.o0 J = new org.telegram.ui.web.o0(this, 14);

    public n1(o1 o1Var) {
        this.K = o1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.B = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str) {
        int i10;
        o1 o1Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        o1 o1Var2;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i11;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12;
        o1 o1Var3;
        HashMap hashMap;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        o1 o1Var4 = this.K;
        l1 l1Var = o1Var4.e;
        y1 y1Var = o1Var4.s;
        this.E = str;
        org.telegram.ui.web.o0 o0Var = this.J;
        int i16 = 1;
        if (str != null) {
            o1Var4.f.c(true);
            l1Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(o0Var);
            AndroidUtilities.runOnUIThread(o0Var, 100L);
            return;
        }
        l1Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        i10 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        this.x = 0;
        ArrayList arrayList3 = this.s;
        arrayList3.clear();
        this.v.clear();
        SparseIntArray sparseIntArray = this.y;
        sparseIntArray.clear();
        ArrayList arrayList4 = this.n;
        arrayList4.clear();
        ArrayList arrayList5 = this.h;
        arrayList5.clear();
        HashMap hashMap2 = this.f;
        hashMap2.clear();
        this.x++;
        boolean z4 = false;
        arrayList3.add(null);
        ArrayList arrayList6 = this.r;
        arrayList6.clear();
        if (o1Var4.a == 1) {
            if (y1Var.C != null && (y1Var.m0(0) || y1Var.m0(1) || y1Var.m0(2) || y1Var.m0(3) || y1Var.m0(4))) {
                arrayList3.add(y1Var.d);
                this.x++;
            }
            ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(2);
            if (recentStickers != null && !recentStickers.isEmpty()) {
                if (this.C == null) {
                    this.C = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.C;
                tL_messages_stickerSet2.documents = recentStickers;
                tL_messages_stickerSet2.set = new TLRPC.TL_stickerSet();
                this.C.set.title = LocaleController.getString(R.string.FavoriteStickers);
                arrayList4.add(this.C);
            }
            ArrayList<TLRPC.Document> recentStickers2 = mediaDataController.getRecentStickers(0);
            if (recentStickers2 != null && !recentStickers2.isEmpty()) {
                if (this.D == null) {
                    this.D = new TLRPC.TL_messages_stickerSet();
                }
                this.D.documents = recentStickers2;
                if (y1Var.B != null) {
                    recentStickers2.add(0, y1Var.e);
                }
                this.D.set = new TLRPC.TL_stickerSet();
                this.D.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList4.add(this.D);
            }
        }
        arrayList4.addAll(mediaDataController.getStickerSets(o1Var4.a == 0 ? 5 : 0));
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i17);
            sparseIntArray.put(this.x, i17);
            arrayList3.add(z4);
            this.x += i16;
            arrayList3.addAll(tL_messages_stickerSet3.documents);
            this.x = tL_messages_stickerSet3.documents.size() + this.x;
            String str2 = tL_messages_stickerSet3 == this.D ? "recent" : tL_messages_stickerSet3 == this.C ? "fav" : tL_messages_stickerSet3;
            int i18 = 0;
            while (i18 < tL_messages_stickerSet3.documents.size()) {
                hashMap2.put(Long.valueOf(tL_messages_stickerSet3.documents.get(i18).id), str2);
                i18++;
                y1Var = y1Var;
                l1Var = l1Var;
            }
            l1 l1Var2 = l1Var;
            y1 y1Var2 = y1Var;
            vx vxVar = new vx();
            vxVar.c = tL_messages_stickerSet3.documents;
            vxVar.b = tL_messages_stickerSet3.set;
            vxVar.f = true;
            vxVar.g = false;
            vxVar.h = true;
            vxVar.e = true;
            if (tL_messages_stickerSet3 == this.C) {
                vxVar.j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet3 == this.D) {
                vxVar.j = R.drawable.msg_emoji_recent;
            }
            arrayList6.add(vxVar);
            arrayList5.add(tL_messages_stickerSet3);
            i17++;
            y1Var = y1Var2;
            l1Var = l1Var2;
            i16 = 1;
            z4 = false;
        }
        l1 l1Var3 = l1Var;
        y1 y1Var3 = y1Var;
        if (o1Var4.a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i19 = 0;
                while (i19 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        i15 = ((org.telegram.ui.ActionBar.g3) y1Var3).currentAccount;
                        tL_messages_stickerSet = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (tL_messages_stickerSet != null) {
                            o1Var2 = o1Var4;
                            arrayList = featuredEmojiSets;
                            i11 = i19;
                            if (tL_messages_stickerSet.set == null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList6.size()) {
                                        TLRPC.StickerSet stickerSet2 = ((vx) arrayList6.get(i20)).b;
                                        if (stickerSet2 != null) {
                                            i14 = i20;
                                            if (stickerSet2.id == tL_messages_stickerSet.set.id) {
                                                break;
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        i20 = i14 + 1;
                                    } else {
                                        arrayList4.add(tL_messages_stickerSet);
                                        arrayList5.add(tL_messages_stickerSet);
                                        sparseIntArray.put(this.x, i17);
                                        i17++;
                                        arrayList3.add(null);
                                        this.x++;
                                        arrayList3.addAll(tL_messages_stickerSet.documents);
                                        this.x = tL_messages_stickerSet.documents.size() + this.x;
                                        for (int i21 = 0; i21 < tL_messages_stickerSet.documents.size(); i21++) {
                                            hashMap2.put(Long.valueOf(tL_messages_stickerSet.documents.get(i21).id), tL_messages_stickerSet);
                                        }
                                        vx vxVar2 = new vx();
                                        vxVar2.c = tL_messages_stickerSet.documents;
                                        vxVar2.b = tL_messages_stickerSet.set;
                                        vxVar2.f = false;
                                        vxVar2.g = true;
                                        vxVar2.h = true;
                                        vxVar2.e = true;
                                        arrayList6.add(vxVar2);
                                    }
                                }
                            }
                        }
                        o1Var2 = o1Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    } else {
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                            tL_messages_stickerSet4.set = stickerSet3;
                            tL_messages_stickerSet4.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            ArrayList<TLRPC.StickerSetCovered> arrayList7 = featuredEmojiSets;
                            int i22 = i19;
                            Long valueOf = Long.valueOf(stickerSet3.id);
                            HashMap hashMap3 = this.e;
                            ArrayList<TLRPC.TL_stickerPack> arrayList8 = (ArrayList) hashMap3.get(valueOf);
                            tL_messages_stickerSet4.packs = arrayList8;
                            if (arrayList8 == null) {
                                HashMap hashMap4 = new HashMap();
                                arrayList = arrayList7;
                                int i23 = 0;
                                while (i23 < tL_messages_stickerSet4.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet4.documents.get(i23);
                                    if (document == null) {
                                        o1Var3 = o1Var4;
                                        hashMap = hashMap4;
                                        i12 = i23;
                                    } else {
                                        i12 = i23;
                                        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                        o1Var3 = o1Var4;
                                        if (parseEmojis != null) {
                                            i13 = i22;
                                            int i24 = 0;
                                            while (i24 < parseEmojis.size()) {
                                                String charSequence = parseEmojis.get(i24).code.toString();
                                                ArrayList arrayList9 = (ArrayList) hashMap4.get(charSequence);
                                                ArrayList<Emoji.EmojiSpanRange> arrayList10 = parseEmojis;
                                                if (arrayList9 == null) {
                                                    arrayList2 = new ArrayList();
                                                    hashMap4.put(charSequence, arrayList2);
                                                } else {
                                                    arrayList2 = arrayList9;
                                                }
                                                HashMap hashMap5 = hashMap4;
                                                i24 = android.support.v4.media.a.g(document.id, arrayList2, i24, 1);
                                                hashMap4 = hashMap5;
                                                parseEmojis = arrayList10;
                                                document = document;
                                            }
                                            hashMap = hashMap4;
                                            i23 = i12 + 1;
                                            i22 = i13;
                                            o1Var4 = o1Var3;
                                            hashMap4 = hashMap;
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                    }
                                    i13 = i22;
                                    i23 = i12 + 1;
                                    i22 = i13;
                                    o1Var4 = o1Var3;
                                    hashMap4 = hashMap;
                                }
                                o1Var2 = o1Var4;
                                i11 = i22;
                                tL_messages_stickerSet4.packs = new ArrayList<>();
                                for (Map.Entry entry : hashMap4.entrySet()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                    tL_stickerPack.emoticon = (String) entry.getKey();
                                    tL_stickerPack.documents = (ArrayList) entry.getValue();
                                    tL_messages_stickerSet4.packs.add(tL_stickerPack);
                                }
                                hashMap3.put(Long.valueOf(tL_messages_stickerSet4.set.id), tL_messages_stickerSet4.packs);
                            } else {
                                o1Var2 = o1Var4;
                                arrayList = arrayList7;
                                i11 = i22;
                            }
                            tL_messages_stickerSet = tL_messages_stickerSet4;
                            if (tL_messages_stickerSet.set == null) {
                            }
                        }
                        o1Var2 = o1Var4;
                        arrayList = featuredEmojiSets;
                        i11 = i19;
                    }
                    i19 = i11 + 1;
                    featuredEmojiSets = arrayList;
                    o1Var4 = o1Var2;
                }
            }
            o1 o1Var5 = o1Var4;
            boolean z10 = false;
            for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                try {
                    z10 = ((TLRPC.TL_messages_stickerSet) arrayList5.get(i25)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (z10) {
                    break;
                }
            }
            if (!z10 && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.B, false)) != null) {
                arrayList5.add(stickerSet);
            }
            o1Var = o1Var5;
        } else {
            o1Var = o1Var4;
        }
        o1Var.r = true;
        if (this.c != arrayList5.size()) {
            HashMap hashMap6 = this.d;
            hashMap6.clear();
            for (int i26 = 0; i26 < arrayList5.size(); i26++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i26);
                if (tL_messages_stickerSet5 != null) {
                    for (int i27 = 0; i27 < tL_messages_stickerSet5.packs.size(); i27++) {
                        String str3 = tL_messages_stickerSet5.packs.get(i27).emoticon;
                        ArrayList arrayList11 = (ArrayList) hashMap6.get(str3);
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                            hashMap6.put(str3, arrayList11);
                        }
                        arrayList11.addAll(tL_messages_stickerSet5.packs.get(i27).documents);
                    }
                }
            }
            this.c = arrayList5.size();
        }
        this.w = false;
        l1Var3.p(arrayList6);
        this.F = null;
        l();
    }

    @Override // f2.o0
    public final int h() {
        return this.x;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.w && i10 == this.x - 1) {
            return 3;
        }
        if (this.y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 < 0) {
            return 2;
        }
        ArrayList arrayList = this.s;
        return (i10 >= arrayList.size() || arrayList.get(i10) != this.K.s.d) ? 2 : 4;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        o1 o1Var = this.K;
        y1 y1Var = o1Var.s;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.w0(-1, (int) y1Var.n));
            return;
        }
        if (i11 == 1) {
            int i12 = this.y.get(i10);
            if (i12 >= 0) {
                ArrayList arrayList = this.n;
                if (i12 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (this.F == null) {
                    m8Var.b(0, str);
                    return;
                }
                int indexOf = str.toLowerCase().indexOf(this.F.toLowerCase());
                if (indexOf < 0) {
                    m8Var.b(0, str);
                    return;
                } else {
                    m8Var.c(str, 0, null, indexOf, this.F.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                k1 k1Var = (k1) view;
                int i13 = this.H;
                if (k1Var.b != i13) {
                    k1Var.b = i13;
                    q61.D(UserConfig.selectedAccount, k1Var.a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        c1 c1Var = (c1) view;
        if (document == y1Var.e) {
            c1Var.setSticker(null);
            int dp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.j6.Me;
            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, y1Var.getThemedColor(i14)));
            Drawable mutate = o1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(y1Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
            nq nqVar = new nq(b02, mutate);
            int dp2 = AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(56.0f);
            nqVar.h = dp2;
            nqVar.n = dp3;
            int dp4 = AndroidUtilities.dp(24.0f);
            int dp5 = AndroidUtilities.dp(24.0f);
            nqVar.e = dp4;
            nqVar.f = dp5;
            nqVar.r = true;
            c1Var.setDrawable(nqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long longValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && longValue == 0) {
            return;
        }
        int i15 = o1Var.a;
        if (i15 != 0) {
            c1Var.a(null, i15 == 1);
            c1Var.setSticker(document);
            return;
        }
        if (document != null) {
            c1Var.setSticker(null);
            c1Var.a(document, o1Var.a == 1);
            return;
        }
        c1Var.setSticker(null);
        boolean z4 = o1Var.a == 1;
        if (c1Var.f == longValue) {
            return;
        }
        org.telegram.ui.Components.l5 l5Var = c1Var.c;
        if (l5Var != null) {
            l5Var.o(c1Var);
        }
        if (longValue == 0) {
            c1Var.a = false;
            c1Var.f = 0L;
            c1Var.c = null;
            return;
        }
        c1Var.a = true;
        c1Var.f = longValue;
        org.telegram.ui.Components.l5 n10 = org.telegram.ui.Components.l5.n(c1Var.b, longValue, null, LiteMode.isEnabled(z4 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13);
        c1Var.c = n10;
        if (c1Var.s) {
            n10.a(c1Var);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View m8Var;
        o1 o1Var = this.K;
        y1 y1Var = o1Var.s;
        if (i10 == 0) {
            m8Var = new View(o1Var.getContext());
        } else if (i10 == 1) {
            Context context = o1Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
            m8Var = new org.telegram.ui.Cells.m8(context, true, false, f6Var, false);
        } else if (i10 == 3) {
            Context context2 = o1Var.getContext();
            boolean z4 = o1Var.a == 0;
            k1 k1Var = new k1(context2);
            k1Var.b = -1;
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
            k1Var.a = p9Var;
            k1Var.addView(p9Var, k7.b6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z4 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            k1Var.addView(textView, k7.b6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            m8Var = k1Var;
        } else if (i10 == 4) {
            w1 w1Var = new w1(y1Var, o1Var.getContext());
            w1Var.e = new w0(y1Var, 2);
            m8Var = w1Var;
        } else {
            m8Var = new c1(o1Var.getContext(), o1Var.b);
        }
        return new el0(m8Var);
    }
}
