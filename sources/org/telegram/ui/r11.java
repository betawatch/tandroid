package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class r11 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static String[] c2;
    public final SparseIntArray A0;
    public boolean A1;
    public final ArrayList B0;
    public String B1;
    public final ArrayList C0;
    public ArrayList C1;
    public boolean D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ArrayList F1;
    public int G;
    public final ArrayList G0;
    public ValueAnimator G1;
    public w01 H;
    public final ArrayList H0;
    public boolean H1;
    public p11 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public vz0 K1;
    public final HashSet L;
    public final ArrayList L0;
    public fi.p5 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public b11 P;
    public boolean P0;
    public int P1;
    public boolean Q;
    public Integer Q0;
    public int Q1;
    public boolean R;
    public boolean R0;
    public long R1;
    public boolean S;
    public List S0;
    public di.ec S1;
    public final ArrayList T;
    public b11 T0;
    public final vz0 T1;
    public boolean U;
    public boolean U0;
    public final vz0 U1;
    public s01 V;
    public float V0;
    public Runnable V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public org.telegram.ui.Components.o5 X0;
    public ValueAnimator X1;
    public h01 Y0;
    public final h2.f Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int a;
    public final int a0;
    public final org.telegram.ui.ActionBar.i6 a1;
    public Integer a2;
    public int b;
    public final m01 b0;
    public float b1;
    public int c;
    public final hi.m5 c0;
    public float c1;
    public int d;
    public final org.telegram.ui.Components.lv[] d0;
    public final org.telegram.ui.ActionBar.h2 d1;
    public int e;
    public org.telegram.ui.Components.lv e0;
    public final int e1;
    public int f;
    public final k01 f0;
    public final q01 f1;
    public final j01 g0;
    public int g1;
    public int h;
    public final hh0 h0;
    public boolean h1;
    public final p01 i0;
    public boolean i1;
    public final f01 j0;
    public ValueAnimator j1;
    public final FrameLayout k0;
    public Drawable k1;
    public final ai.k0 l0;
    public PorterDuffColorFilter l1;
    public final org.telegram.ui.Components.q9 m0;
    public final boolean m1;
    public int n;
    public final View n0;
    public float n1;
    public final org.telegram.ui.Components.jn o0;
    public int o1;
    public final View p0;
    public org.telegram.ui.Components.m5 p1;
    public final r01 q0;
    public Rect q1;
    public int r;
    public final c11 r0;
    public View r1;
    public int s;
    public final g01 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.l5 t0;
    public b11 t1;
    public final View u0;
    public Rect u1;
    public int v0;
    public final OvershootInterpolator v1;
    public int w;
    public final ArrayList w0;
    public ValueAnimator w1;
    public int x;
    public final SparseIntArray x0;
    public boolean x1;
    public int y;
    public final SparseIntArray y0;
    public boolean y1;
    public final SparseIntArray z0;
    public boolean z1;
    public static final List b2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] d2 = new boolean[4];
    public static final HashMap e2 = new HashMap();

    public r11(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this(h2Var, context, z10, num, i7, true, i6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.q9 q9Var) {
        List list;
        org.telegram.messenger.fc b10;
        String str;
        if (q9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(i7).t0[1]);
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            list = b2;
            if (i10 >= size) {
                break;
            }
            if ((arrayList.get(i10) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents);
                Collections.shuffle(arrayList2);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
                    if (document2 != null && list.contains(org.telegram.messenger.fj.V(document2, null, null))) {
                        int i12 = round - 1;
                        if (round <= 0) {
                            round = i12;
                            document = document2;
                            break;
                        } else {
                            round = i12;
                            document = document2;
                        }
                    }
                    i11++;
                }
            }
            if (document != null && round <= 0) {
                break;
            } else {
                i10++;
            }
        }
        if (document == null || round > 0) {
            ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ri.d0(i7).u0(5));
            Collections.shuffle(arrayList3);
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                if (arrayList3.get(i13) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents != null) {
                    ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents);
                    Collections.shuffle(arrayList4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList4.size()) {
                            break;
                        }
                        TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i14);
                        if (document3 != null && list.contains(org.telegram.messenger.fj.V(document3, null, null))) {
                            int i15 = round - 1;
                            if (round <= 0) {
                                round = i15;
                                document = document3;
                                break;
                            } else {
                                round = i15;
                                document = document3;
                            }
                        }
                        i14++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
            }
        }
        if (document != null) {
            org.telegram.messenger.lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.fc.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "36_36_g";
            } else {
                if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.fc.b(document);
                str = "36_36";
            }
            q9Var.setLayerNum(7);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            q9Var.m(b10, str, org.telegram.messenger.fc.c(w10, document), "36_36", d, document);
        }
    }

    public static void a(r11 r11Var, int i7, int i10) {
        org.telegram.ui.ActionBar.l5 l5Var = r11Var.t0;
        g01 g01Var = r11Var.s0;
        View m10 = g01Var.m(i7);
        int L0 = g01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.bz.c()) {
            l5Var.b = g01Var.L0() < i7 ? 0 : 1;
            l5Var.k(i7, i10, false, false);
        } else {
            hi.l1 l1Var = new hi.l1(4, r11Var.i0.getContext(), r11Var);
            l1Var.a = i7;
            l1Var.p = i10;
            g01Var.w0(l1Var);
        }
    }

    public static boolean c(r11 r11Var) {
        if (r11Var.U) {
            return true;
        }
        ValueAnimator valueAnimator = r11Var.W1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i7 = 13;
        int i10 = this.a0;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.o5.f();
            }
            if (i10 != 3 && i10 != 4) {
                i7 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getPremiumStar() {
        if (this.k1 == null) {
            int i7 = this.a0;
            if (i7 == 5 || i7 == 9 || i7 == 10 || i7 == 7) {
                this.k1 = i5.c.g(org.telegram.messenger.t0.b, R.drawable.msg_filled_blocked);
            } else {
                this.k1 = i5.c.g(org.telegram.messenger.t0.b, R.drawable.msg_settings_premium);
            }
            this.k1.setColorFilter(this.l1);
        }
        return this.k1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j3;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.j6.c(str);
        int i7 = 0;
        while (true) {
            if (i7 >= tL_messages_stickerSet.packs.size()) {
                j3 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i7).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.j6.c(tL_messages_stickerSet.packs.get(i7).emoticon), c10)) {
                j3 = tL_messages_stickerSet.packs.get(i7).documents.get(0).longValue();
                break;
            }
            i7++;
        }
        if (j3 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.id == j3) {
                return document;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.o5 o5Var) {
        org.telegram.ui.Components.o5 o5Var2;
        if (this.J && (o5Var2 = this.X0) != o5Var) {
            if (o5Var2 != null) {
                o5Var2.n(this);
            }
            this.X0 = o5Var;
            if (o5Var != null) {
                o5Var.setColorFilter(this.l1);
                this.X0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = d2;
        if (zArr[i7]) {
            return;
        }
        org.telegram.messenger.ri.d0(i7);
        zArr[i7] = true;
        org.telegram.messenger.ri.d0(i7).D(5);
        org.telegram.messenger.ri.d0(i7).N(0, true);
        org.telegram.messenger.ri.d0(i7).C();
        org.telegram.messenger.ri.d0(i7).o0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        org.telegram.messenger.ri.d0(i7).R();
        org.telegram.messenger.ri.d0(i7).x();
        org.telegram.ui.Components.iv0.F3.c(i7, 1, new fi.f(i7, 1));
    }

    public final void A(Long l10) {
        this.L.remove(l10);
        p01 p01Var = this.i0;
        if (p01Var != null) {
            int i7 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < p01Var.getChildCount(); i10++) {
                if (p01Var.getChildAt(i10) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i10);
                    org.telegram.ui.Components.x5 x5Var = b11Var.e;
                    if (x5Var == null || x5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = b11Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            b11Var.f();
                        }
                    } else {
                        b11Var.f();
                    }
                    z10 = true;
                }
            }
            p01Var.invalidate();
            if (z10) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.w0;
                if (i7 >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i7)).longValue();
                if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                    break;
                } else {
                    i7++;
                }
            }
            r01 r01Var = this.q0;
            if (r01Var != null) {
                r01Var.g(i7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bc, code lost:
    
        if (r12 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x087c, code lost:
    
        if (r8 != false) goto L376;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f1 A[LOOP:5: B:123:0x04eb->B:125:0x04f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0af2 A[LOOP:13: B:269:0x0aea->B:271:0x0af2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x02ee A[LOOP:30: B:536:0x02e6->B:538:0x02ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0313 A[LOOP:31: B:541:0x030d->B:543:0x0313, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0405 A[LOOP:2: B:79:0x03ff->B:81:0x0405, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x044c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z10, boolean z11, boolean z12) {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        boolean z13;
        ArrayList arrayList;
        int i7;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList2;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList R;
        int i13;
        int i14;
        ArrayList arrayList4;
        int size;
        int i15;
        ArrayList arrayList5;
        int i16;
        p01 p01Var;
        int i17;
        SparseIntArray sparseIntArray3;
        HashSet hashSet2;
        org.telegram.messenger.ri riVar;
        int i18;
        ArrayList arrayList6;
        TLRPC.StickerSet stickerSet;
        int i19;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList7;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID;
        org.telegram.ui.Components.fx fxVar;
        int i20;
        SparseIntArray sparseIntArray4;
        ArrayList arrayList8;
        int i21;
        SparseIntArray sparseIntArray5;
        SparseIntArray sparseIntArray6;
        TLRPC.StickerSet stickerSet2;
        boolean z15;
        ArrayList arrayList9;
        int i22;
        int i23;
        int i24;
        boolean z16;
        int i25;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList10;
        boolean z17 = !this.Q ? false : z11;
        int i26 = this.W;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i26);
        if (z10 || this.M0 == null) {
            this.M0 = new ArrayList(d02.u0(this.R ? 0 : 5));
        }
        ArrayList arrayList11 = this.M0;
        ArrayList arrayList12 = new ArrayList(d02.t0[1]);
        ArrayList arrayList13 = this.w0;
        ArrayList arrayList14 = new ArrayList(arrayList13);
        this.v0 = 0;
        this.f = -1;
        this.b = -1;
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.h = -1;
        this.n = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        ArrayList arrayList15 = this.E0;
        arrayList15.clear();
        this.L0.clear();
        ArrayList arrayList16 = this.I0;
        arrayList16.clear();
        ArrayList arrayList17 = this.J0;
        arrayList17.clear();
        ArrayList arrayList18 = this.N0;
        arrayList18.clear();
        SparseIntArray sparseIntArray7 = this.x0;
        sparseIntArray7.clear();
        SparseIntArray sparseIntArray8 = this.y0;
        sparseIntArray8.clear();
        SparseIntArray sparseIntArray9 = this.z0;
        sparseIntArray9.clear();
        arrayList13.clear();
        boolean z18 = z17;
        SparseIntArray sparseIntArray10 = this.A0;
        sparseIntArray10.clear();
        org.telegram.messenger.ri riVar2 = d02;
        this.T.clear();
        ArrayList arrayList19 = this.G0;
        arrayList19.clear();
        ArrayList arrayList20 = this.H0;
        arrayList20.clear();
        SparseIntArray sparseIntArray11 = sparseIntArray10;
        ArrayList arrayList21 = this.F0;
        arrayList21.clear();
        boolean isEmpty = arrayList11.isEmpty();
        ArrayList arrayList22 = arrayList12;
        int i27 = this.a0;
        if (isEmpty) {
            sparseIntArray = sparseIntArray8;
        } else {
            sparseIntArray = sparseIntArray8;
        }
        if (i27 != 5 && i27 != 7 && i27 != 8) {
            int i28 = this.v0;
            sparseIntArray2 = sparseIntArray7;
            this.v0 = i28 + 1;
            this.a = i28;
            arrayList13.add(9L);
            z13 = this.O0;
            if (i27 != 5 || i27 == 7) {
                arrayList = arrayList11;
                i7 = z13 ? 1 : 0;
                if (i7 != 0) {
                    this.v0++;
                    arrayList13.add(2L);
                }
                tL_emojiList = org.telegram.messenger.ri.d0(i26).O1;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i10 = 0;
                    while (i10 < tL_emojiList.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.x5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                        i10++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i11 = 0; i11 < arrayList15.size(); i11++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.x5) arrayList15.get(i11)).getDocumentId() * 13) + 43223));
                        this.v0++;
                    }
                }
            } else if (i27 != 4) {
                arrayList = arrayList11;
                i7 = z13 ? 1 : 0;
                if (i27 == 6) {
                    if (i7 != 0) {
                        this.v0++;
                        arrayList13.add(2L);
                    }
                    ArrayList arrayList23 = org.telegram.messenger.ri.d0(i26).n;
                    for (int i29 = 0; i29 < arrayList23.size(); i29++) {
                        arrayList19.add(((TLRPC.TL_availableReaction) arrayList23.get(i29)).activate_animation);
                    }
                    int i30 = 0;
                    while (i30 < arrayList19.size()) {
                        arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i30)).id * 13) + 62425));
                        this.v0++;
                        i30++;
                        arrayList19 = arrayList19;
                    }
                } else if (i27 == 3) {
                    int i31 = this.v0;
                    this.v0 = i31 + 1;
                    this.y = i31;
                    arrayList13.add(12L);
                    int i32 = this.v0;
                    this.v0 = i32 + 1;
                    this.x = i32;
                    arrayList13.add(7L);
                    String str = org.telegram.messenger.j10.i(i26).f0;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i26).r0(str);
                        tL_messages_stickerSet = r02 == null ? org.telegram.messenger.ri.d0(i26).p0(str) : r02;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i7 != 0) {
                            this.v0++;
                            arrayList13.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList24 = tL_messages_stickerSet.documents;
                        if (arrayList24 != null && !arrayList24.isEmpty()) {
                            int i33 = 0;
                            while (i33 < tL_messages_stickerSet.documents.size()) {
                                arrayList15.add(new org.telegram.ui.Components.x5(tL_messages_stickerSet.documents.get(i33), (Paint.FontMetricsInt) null));
                                i33++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i34 = 0; i34 < arrayList15.size(); i34++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.x5) arrayList15.get(i34)).getDocumentId() * 13) + 43223));
                            this.v0++;
                        }
                    }
                }
            } else if (this.R) {
                arrayList19.addAll(org.telegram.messenger.ri.d0(i26).g0[0]);
                i7 = z13 ? 1 : 0;
                int i35 = 0;
                while (i35 < arrayList19.size()) {
                    arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i35)).id * 13) + 62425));
                    this.v0++;
                    i35++;
                    arrayList11 = arrayList11;
                }
                arrayList = arrayList11;
            } else {
                arrayList = arrayList11;
                i7 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.S ? org.telegram.messenger.ri.d0(i26).M1 : org.telegram.messenger.ri.d0(i26).N1;
                if (tL_emojiList3 != null && (arrayList10 = tL_emojiList3.document_id) != null && !arrayList10.isEmpty()) {
                    org.telegram.ui.Components.fx fxVar2 = new org.telegram.ui.Components.fx();
                    fxVar2.f = true;
                    fxVar2.g = false;
                    fxVar2.h = true;
                    fxVar2.e = true;
                    fxVar2.b = new TLRPC.TL_stickerSet();
                    fxVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList18.size();
                    arrayList18.add(fxVar2);
                    int i36 = 0;
                    while (i36 < tL_emojiList3.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.x5(tL_emojiList3.document_id.get(i36).longValue(), (Paint.FontMetricsInt) null));
                        i36++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i37 = 0; i37 < arrayList15.size(); i37++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.x5) arrayList15.get(i37)).getDocumentId() * 13) + 43223));
                        this.v0++;
                    }
                }
            }
            if (this.P0 || i27 == 13 || i27 == 2 || i27 == 11 || i27 == 3 || i27 == 6 || i27 == 8 || i27 == 4 || i27 == 5 || i27 == 7) {
                i12 = 2;
            } else {
                int i38 = this.v0;
                i12 = 2;
                this.v0 = i38 + 1;
                this.w = i38;
                arrayList13.add(6L);
            }
            if ((i27 != 9 || i27 == 10) && (tL_emojiList2 = org.telegram.messenger.ri.d0(i26).P1) != null) {
                HashSet hashSet3 = new HashSet();
                hashSet3.addAll(tL_emojiList2.document_id);
                hashSet = hashSet3;
            } else {
                hashSet = null;
            }
            if (this.S0 == null) {
                this.d = this.v0;
                ArrayList arrayList25 = new ArrayList(this.S0);
                if (i27 == 13 && arrayList25.size() > 8) {
                    arrayList25.subList(8, arrayList25.size()).clear();
                } else if (i27 == 14) {
                    arrayList9 = new ArrayList();
                    int i39 = 0;
                    while (i39 < arrayList25.size()) {
                        if (((ch.p0) arrayList25.get(i39)).e) {
                            arrayList9.add((ch.p0) arrayList25.remove(i39));
                            i39--;
                        }
                        i39++;
                    }
                    if (i27 != 8 || i27 == 11 || i27 == 13) {
                        arrayList16.addAll(arrayList25);
                    } else {
                        for (int i40 = 0; i40 < 16; i40++) {
                            if (!arrayList25.isEmpty()) {
                                arrayList16.add((ch.p0) arrayList25.remove(0));
                            }
                        }
                    }
                    i22 = 0;
                    while (i22 < arrayList16.size()) {
                        arrayList13.add(Long.valueOf((((ch.p0) arrayList16.get(i22)).hashCode() * 13) - 5632));
                        i22++;
                        arrayList20 = arrayList20;
                    }
                    arrayList3 = arrayList20;
                    int size2 = arrayList16.size() + this.v0;
                    this.v0 = size2;
                    this.e = size2;
                    if (!arrayList25.isEmpty() && i27 != 8 && i27 != 11 && i27 != 13) {
                        i24 = 0;
                        while (true) {
                            if (i24 < arrayList25.size()) {
                                z16 = true;
                                break;
                            } else {
                                if (((ch.p0) arrayList25.get(i24)).g != 0) {
                                    z16 = false;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i27 != 14) {
                            if (!z16) {
                                int i41 = this.v0;
                                this.v0 = i41 + 1;
                                this.f = i41;
                                arrayList13.add(4L);
                            } else if (org.telegram.messenger.j10.i(i26).q()) {
                                int i42 = this.v0;
                                this.v0 = i42 + 1;
                                this.h = i42;
                                arrayList13.add(5L);
                            }
                        }
                        this.b = this.v0;
                        arrayList17.addAll(arrayList25);
                        for (i25 = 0; i25 < arrayList17.size(); i25++) {
                            arrayList13.add(Long.valueOf((((ch.p0) arrayList17.get(i25)).h * 13) + (z16 ? 4235 : -3142)));
                        }
                        int size3 = arrayList17.size() + this.v0;
                        this.v0 = size3;
                        this.c = size3;
                    }
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        int i43 = this.v0;
                        this.v0 = i43 + 1;
                        this.E = i43;
                        arrayList13.add(8L);
                        this.F = this.v0;
                        this.K0 = arrayList9;
                        for (i23 = 0; i23 < arrayList9.size(); i23++) {
                            arrayList13.add(Long.valueOf(((ch.p0) arrayList9.get(i23)).c * 19));
                        }
                        int size4 = arrayList9.size() + this.v0;
                        this.v0 = size4;
                        this.G = size4;
                    }
                }
                arrayList9 = null;
                if (i27 != 8) {
                }
                arrayList16.addAll(arrayList25);
                i22 = 0;
                while (i22 < arrayList16.size()) {
                }
                arrayList3 = arrayList20;
                int size22 = arrayList16.size() + this.v0;
                this.v0 = size22;
                this.e = size22;
                if (!arrayList25.isEmpty()) {
                    i24 = 0;
                    while (true) {
                        if (i24 < arrayList25.size()) {
                        }
                        i24++;
                    }
                    if (i27 != 14) {
                    }
                    this.b = this.v0;
                    arrayList17.addAll(arrayList25);
                    while (i25 < arrayList17.size()) {
                    }
                    int size32 = arrayList17.size() + this.v0;
                    this.v0 = size32;
                    this.c = size32;
                }
                if (arrayList9 != null) {
                    int i432 = this.v0;
                    this.v0 = i432 + 1;
                    this.E = i432;
                    arrayList13.add(8L);
                    this.F = this.v0;
                    this.K0 = arrayList9;
                    while (i23 < arrayList9.size()) {
                    }
                    int size42 = arrayList9.size() + this.v0;
                    this.v0 = size42;
                    this.G = size42;
                }
            } else {
                arrayList3 = arrayList20;
                if (i27 == 0 || i27 == 12 || i27 == 9 || i27 == 10) {
                    org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i26);
                    Long[] lArr = d03.G0;
                    ArrayList[] arrayListArr = d03.F0;
                    if (!d03.H0[0]) {
                        d03.N(0, true);
                    } else if (arrayListArr[0] == null || (lArr[0] != null && (System.currentTimeMillis() / 1000) - lArr[0].longValue() > 1800)) {
                        d03.N(0, false);
                    }
                    ArrayList arrayList26 = arrayListArr[0];
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i26).o0((i27 == 0 || i27 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                    if (o02 != null) {
                        if (i7 != 0) {
                            this.v0++;
                            arrayList13.add(2L);
                        }
                        if (i27 == 0 || i27 == 12) {
                            R = org.telegram.messenger.ri.d0(i26).R();
                        } else {
                            org.telegram.messenger.ri d04 = org.telegram.messenger.ri.d0(i26);
                            Long[] lArr2 = d04.G0;
                            ArrayList[] arrayListArr2 = d04.F0;
                            if (d04.H0[i12]) {
                                i14 = i12;
                                if (arrayListArr2[i14] == null || (lArr2[i14] != null && (System.currentTimeMillis() / 1000) - lArr2[i14].longValue() > 1800)) {
                                    d04.N(i14, false);
                                }
                            } else {
                                i14 = i12;
                                d04.N(i14, true);
                            }
                            R = arrayListArr2[i14];
                        }
                        ArrayList<TLRPC.Document> arrayList27 = o02.documents;
                        if (arrayList27 != null && !arrayList27.isEmpty()) {
                            for (int i44 = 0; i44 < Math.min(7, o02.documents.size()); i44++) {
                                arrayList15.add(new org.telegram.ui.Components.x5(o02.documents.get(i44), (Paint.FontMetricsInt) null));
                                if (arrayList15.size() + i7 >= 104) {
                                    break;
                                }
                            }
                        }
                        if ((i27 == 0 || i27 == 12) && arrayList26 != null && !arrayList26.isEmpty()) {
                            int size5 = arrayList26.size();
                            int i45 = 0;
                            while (i45 < size5) {
                                Object obj = arrayList26.get(i45);
                                i45++;
                                Long h = org.telegram.messenger.o10.h((TLRPC.EmojiStatus) obj);
                                if (h != null) {
                                    int i46 = 0;
                                    while (true) {
                                        if (i46 >= arrayList15.size()) {
                                            ArrayList arrayList28 = arrayList26;
                                            int i47 = size5;
                                            arrayList15.add(new org.telegram.ui.Components.x5(h.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i7 >= 104) {
                                                break;
                                            }
                                            arrayList26 = arrayList28;
                                            size5 = i47;
                                        } else if (((org.telegram.ui.Components.x5) arrayList15.get(i46)).getDocumentId() == h.longValue()) {
                                            break;
                                        } else {
                                            i46++;
                                        }
                                    }
                                }
                            }
                        }
                        if (R != null && !R.isEmpty()) {
                            int size6 = R.size();
                            int i48 = 0;
                            while (i48 < size6) {
                                Object obj2 = R.get(i48);
                                i48++;
                                Long h7 = org.telegram.messenger.o10.h((TLRPC.EmojiStatus) obj2);
                                if (h7 != null) {
                                    int i49 = 0;
                                    while (true) {
                                        if (i49 >= arrayList15.size()) {
                                            arrayList15.add(new org.telegram.ui.Components.x5(h7.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i7 >= 104) {
                                                break;
                                            }
                                        } else if (((org.telegram.ui.Components.x5) arrayList15.get(i49)).getDocumentId() == h7.longValue()) {
                                            break;
                                        } else {
                                            i49++;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList15.size() <= 40 - i7 || this.D0) {
                            for (int i50 = 0; i50 < arrayList15.size(); i50++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.x5) arrayList15.get(i50)).getDocumentId() * 13) + 43223));
                                this.v0++;
                            }
                        } else {
                            for (int i51 = 0; i51 < 39 - i7; i51++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.x5) arrayList15.get(i51)).getDocumentId() * 13) + 43223));
                                this.v0++;
                            }
                            arrayList13.add(Long.valueOf(((((arrayList15.size() - 40) + i7) + 1) * 13) - 5531));
                            w01 w01Var = this.H;
                            if (w01Var != null) {
                                TextView textView = w01Var.a;
                                StringBuilder sb2 = new StringBuilder("+");
                                i13 = 1;
                                sb2.append((arrayList15.size() - 40) + i7 + 1);
                                textView.setText(sb2.toString());
                            } else {
                                i13 = 1;
                            }
                            sparseIntArray9.put(this.v0, -1);
                            this.v0 += i13;
                        }
                    }
                }
            }
            arrayList21.clear();
            if (i27 != 0 || i27 == 12 || i27 == 9 || i27 == 10) {
                di.o8 G = di.x8.y(i26, false).G(getDialogId(), true);
                G.a();
                arrayList4 = new ArrayList();
                ArrayList arrayList29 = G.l;
                size = arrayList29.size();
                i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList29.get(i15);
                    i15++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList4.isEmpty()) {
                    int i52 = this.v0;
                    this.v0 = i52 + 1;
                    this.n = i52;
                    arrayList13.add(22L);
                    this.r = this.v0;
                    int size7 = arrayList4.size();
                    int i53 = 0;
                    while (i53 < size7) {
                        Object obj4 = arrayList4.get(i53);
                        i53++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                        arrayList13.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.v0++;
                        arrayList21.add(tL_starGiftUnique);
                    }
                    this.s = this.v0;
                    this.e0.l(true);
                } else {
                    this.e0.l(false);
                }
            }
            if (i27 == 13) {
                String[][] strArr = org.telegram.messenger.k6.f;
                for (int i54 = 0; i54 < 8; i54++) {
                    for (String str2 : strArr[i54]) {
                        arrayList3.add(str2);
                        arrayList13.add(Long.valueOf((r8.hashCode() * 322) + 13334));
                        this.v0++;
                    }
                }
            }
            if (i27 != 8 && i27 != 13 && i27 != 14) {
                i21 = 0;
                while (i21 < arrayList.size()) {
                    ArrayList arrayList30 = arrayList;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList30.get(i21);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null) {
                        if (i27 == 5 || i27 == 7) {
                            if (stickerSet2 != null) {
                                if (stickerSet2.text_color) {
                                    z15 = true;
                                } else {
                                    ArrayList<TLRPC.Document> arrayList31 = tL_messages_stickerSet2.documents;
                                    if (arrayList31 != null && !arrayList31.isEmpty()) {
                                        z15 = org.telegram.messenger.fj.C4(tL_messages_stickerSet2.documents.get(0));
                                    }
                                }
                            }
                            z15 = false;
                        }
                        if ((i27 != 10 && i27 != 9) || tL_messages_stickerSet2.set.channel_emoji_status) {
                            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet2.set;
                            if (stickerSet3.emojis || this.R) {
                                if (!this.C0.contains(Long.valueOf(stickerSet3.id))) {
                                    sparseIntArray6 = sparseIntArray2;
                                    sparseIntArray6.put(this.v0, arrayList18.size());
                                    sparseIntArray5 = sparseIntArray;
                                    sparseIntArray5.put(arrayList18.size(), this.v0);
                                    this.v0++;
                                    arrayList13.add(Long.valueOf((tL_messages_stickerSet2.set.id * 13) + 9211));
                                    org.telegram.ui.Components.fx fxVar3 = new org.telegram.ui.Components.fx();
                                    fxVar3.f = true;
                                    fxVar3.g = false;
                                    fxVar3.h = true;
                                    if (i27 == 4) {
                                        fxVar3.e = false;
                                    } else {
                                        fxVar3.e = !org.telegram.messenger.fj.V3(tL_messages_stickerSet2);
                                    }
                                    fxVar3.b = tL_messages_stickerSet2.set;
                                    fxVar3.c = j(tL_messages_stickerSet2.documents, hashSet);
                                    arrayList18.size();
                                    arrayList18.add(fxVar3);
                                    this.v0 = fxVar3.c.size() + this.v0;
                                    for (int i55 = 0; i55 < fxVar3.c.size(); i55++) {
                                        arrayList13.add(Long.valueOf((((TLRPC.Document) fxVar3.c.get(i55)).id * 13) + 3212));
                                    }
                                    i21++;
                                    sparseIntArray = sparseIntArray5;
                                    arrayList = arrayList30;
                                    sparseIntArray2 = sparseIntArray6;
                                }
                            }
                        }
                    }
                    sparseIntArray5 = sparseIntArray;
                    sparseIntArray6 = sparseIntArray2;
                    i21++;
                    sparseIntArray = sparseIntArray5;
                    arrayList = arrayList30;
                    sparseIntArray2 = sparseIntArray6;
                }
            }
            SparseIntArray sparseIntArray12 = sparseIntArray;
            SparseIntArray sparseIntArray13 = sparseIntArray2;
            if (!this.R || i27 == 8 || i27 == 13) {
                arrayList5 = arrayList18;
                i16 = 14;
            } else {
                i16 = 14;
                if (i27 != 14) {
                    int i56 = 0;
                    while (i56 < arrayList22.size()) {
                        ArrayList arrayList32 = arrayList22;
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList32.get(i56);
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                        int i57 = 0;
                        while (true) {
                            if (i57 >= arrayList18.size()) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    int i58 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    riVar = riVar2;
                                    i18 = i58;
                                    arrayList22 = arrayList32;
                                    stickerSet = stickerSet4;
                                    arrayList6 = arrayList18;
                                    i19 = 10;
                                    TLRPC.TL_messages_stickerSet n02 = riVar.n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (n02 != null) {
                                        ArrayList<TLRPC.Document> arrayList33 = n02.documents;
                                        boolean V3 = org.telegram.messenger.fj.V3(n02);
                                        arrayList7 = arrayList33;
                                        z14 = V3;
                                    } else {
                                        TLRPC.TL_inputStickerSetID b02 = org.telegram.messenger.ri.b0(stickerSetCovered.set);
                                        arrayList7 = new ArrayList<>();
                                        tL_inputStickerSetID = b02;
                                        z14 = true;
                                        if (arrayList7 != null && ((!(i27 == 5 || i27 == 7) || (!arrayList7.isEmpty() && org.telegram.messenger.fj.C4(arrayList7.get(0)))) && (!(i27 == i19 || i27 == 9) || stickerSet.channel_emoji_status))) {
                                            sparseIntArray13.put(this.v0, arrayList6.size());
                                            sparseIntArray3.put(arrayList6.size(), this.v0);
                                            this.v0++;
                                            boolean z19 = z14;
                                            arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                            fxVar = new org.telegram.ui.Components.fx();
                                            fxVar.d = tL_inputStickerSetID;
                                            fxVar.f = this.C0.contains(Long.valueOf(stickerSet.id));
                                            fxVar.g = true;
                                            if (i27 != 4) {
                                                fxVar.e = false;
                                            } else {
                                                fxVar.e = !z19;
                                            }
                                            fxVar.b = stickerSet;
                                            fxVar.c = j(arrayList7, hashSet2);
                                            arrayList6.size();
                                            fxVar.h = this.B0.contains(Long.valueOf(fxVar.b.id));
                                            if (fxVar.c.size() > 24 || fxVar.h) {
                                                this.v0 = fxVar.c.size() + this.v0;
                                                for (i20 = 0; i20 < fxVar.c.size(); i20++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) fxVar.c.get(i20)).id * 13) + 3212));
                                                }
                                            } else {
                                                this.v0 += 24;
                                                for (int i59 = 0; i59 < 23; i59++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) fxVar.c.get(i59)).id * 13) + 3212));
                                                }
                                                arrayList13.add(Long.valueOf(((fxVar.c.size() - 23) * 169) + ((stickerSet.id * 13) - 5531)));
                                                sparseIntArray9.put(this.v0 - 1, arrayList6.size());
                                            }
                                            if (!fxVar.f) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else if (i27 == 4 || i27 == 5 || i27 == 7 || i27 == 6) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else {
                                                sparseIntArray4 = sparseIntArray11;
                                                sparseIntArray4.put(this.v0, arrayList6.size());
                                                this.v0++;
                                                arrayList13.add(Long.valueOf((stickerSet.id * 13) + 3321));
                                                arrayList8 = arrayList6;
                                                arrayList8.add(fxVar);
                                            }
                                            arrayList8 = arrayList6;
                                            arrayList8.add(fxVar);
                                        } else {
                                            sparseIntArray4 = sparseIntArray11;
                                            arrayList8 = arrayList6;
                                        }
                                    }
                                } else {
                                    int i60 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    riVar = riVar2;
                                    i18 = i60;
                                    arrayList22 = arrayList32;
                                    arrayList6 = arrayList18;
                                    stickerSet = stickerSet4;
                                    i19 = 10;
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                        z14 = org.telegram.messenger.fj.U3(stickerSetCovered);
                                    } else {
                                        z14 = false;
                                        arrayList7 = null;
                                    }
                                }
                                tL_inputStickerSetID = null;
                                if (arrayList7 != null) {
                                    sparseIntArray13.put(this.v0, arrayList6.size());
                                    sparseIntArray3.put(arrayList6.size(), this.v0);
                                    this.v0++;
                                    boolean z192 = z14;
                                    arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                    fxVar = new org.telegram.ui.Components.fx();
                                    fxVar.d = tL_inputStickerSetID;
                                    fxVar.f = this.C0.contains(Long.valueOf(stickerSet.id));
                                    fxVar.g = true;
                                    if (i27 != 4) {
                                    }
                                    fxVar.b = stickerSet;
                                    fxVar.c = j(arrayList7, hashSet2);
                                    arrayList6.size();
                                    fxVar.h = this.B0.contains(Long.valueOf(fxVar.b.id));
                                    if (fxVar.c.size() > 24) {
                                    }
                                    this.v0 = fxVar.c.size() + this.v0;
                                    while (i20 < fxVar.c.size()) {
                                    }
                                    if (!fxVar.f) {
                                    }
                                    arrayList8 = arrayList6;
                                    arrayList8.add(fxVar);
                                }
                                sparseIntArray4 = sparseIntArray11;
                                arrayList8 = arrayList6;
                            } else {
                                if (((org.telegram.ui.Components.fx) arrayList18.get(i57)).b.id == stickerSet4.id) {
                                    int i61 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    riVar = riVar2;
                                    i18 = i61;
                                    arrayList22 = arrayList32;
                                    arrayList8 = arrayList18;
                                    sparseIntArray4 = sparseIntArray11;
                                    break;
                                }
                                i57++;
                            }
                        }
                        int i62 = i18 + 1;
                        sparseIntArray11 = sparseIntArray4;
                        riVar2 = riVar;
                        i16 = 14;
                        hashSet = hashSet2;
                        sparseIntArray12 = sparseIntArray3;
                        i56 = i62;
                        arrayList18 = arrayList8;
                    }
                }
                arrayList5 = arrayList18;
            }
            if (i27 != i16 && i27 != 8 && i27 != 13) {
                this.e0.p(arrayList5);
            }
            p01Var = this.i0;
            if (z18) {
                p01Var.setItemAnimator(null);
            } else {
                p01Var.setItemAnimator(this.f1);
            }
            if (z12) {
                i17 = 0;
                this.q0.f();
            } else {
                i17 = 0;
                v4.o.c(new jg.g(this, arrayList14, 5), false).c(this.q0);
            }
            if (p01Var.K1) {
                p01Var.v0(i17);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray7;
        this.a = -1;
        z13 = this.O0;
        if (i27 != 5) {
        }
        arrayList = arrayList11;
        i7 = z13 ? 1 : 0;
        if (i7 != 0) {
        }
        tL_emojiList = org.telegram.messenger.ri.d0(i26).O1;
        if (tL_emojiList != null) {
            i10 = 0;
            while (i10 < tL_emojiList.document_id.size()) {
            }
            while (i11 < arrayList15.size()) {
            }
        }
        if (this.P0) {
        }
        i12 = 2;
        if (i27 != 9) {
        }
        HashSet hashSet32 = new HashSet();
        hashSet32.addAll(tL_emojiList2.document_id);
        hashSet = hashSet32;
        if (this.S0 == null) {
        }
        arrayList21.clear();
        if (i27 != 0) {
        }
        di.o8 G2 = di.x8.y(i26, false).G(getDialogId(), true);
        G2.a();
        arrayList4 = new ArrayList();
        ArrayList arrayList292 = G2.l;
        size = arrayList292.size();
        i15 = 0;
        while (i15 < size) {
        }
        if (arrayList4.isEmpty()) {
        }
        if (i27 == 13) {
        }
        if (i27 != 8) {
            i21 = 0;
            while (i21 < arrayList.size()) {
            }
        }
        SparseIntArray sparseIntArray122 = sparseIntArray;
        SparseIntArray sparseIntArray132 = sparseIntArray2;
        if (this.R) {
        }
        arrayList5 = arrayList18;
        i16 = 14;
        if (i27 != i16) {
            this.e0.p(arrayList5);
        }
        p01Var = this.i0;
        if (z18) {
        }
        if (z12) {
        }
        if (p01Var.K1) {
        }
    }

    public final void C() {
        j01 j01Var = this.g0;
        if (j01Var == null) {
            return;
        }
        if (this.A1) {
            j01Var.clearAnimation();
            j01Var.setVisibility(0);
            j01Var.animate().translationY(0.0f).start();
            return;
        }
        p01 p01Var = this.i0;
        if (p01Var.getChildCount() <= 0) {
            j01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        View childAt = p01Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            j01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        } else {
            j01Var.setVisibility(0);
            j01Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f10) {
        View view = this.n0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.lr.g.getInterpolation(c8.l9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.jn jnVar = this.o0;
        if (jnVar != null) {
            float a10 = c8.l9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            jnVar.setAlpha(a10);
            jnVar.setScaleX(a10);
            jnVar.setScaleY(a10 * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.l9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.l9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.l9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.l9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        float interpolation2 = lrVar.getInterpolation(a11);
        float interpolation3 = lrVar.getInterpolation(a12);
        this.c0.setAlpha(a14);
        this.g0.setAlpha(a14);
        int i7 = 0;
        for (int i10 = 0; i10 < this.e0.b.getChildCount(); i10++) {
            this.e0.b.getChildAt(i10).setAlpha(a14);
        }
        if (this.p1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        m01 m01Var = this.b0;
        m01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (jnVar != null) {
            jnVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.b1 = (interpolation2 * 0.85f) + 0.15f;
        this.c1 = (interpolation3 * 0.925f) + 0.075f;
        m01Var.invalidateOutline();
        if (jnVar != null) {
            jnVar.setAlpha(a14);
        }
        k01 k01Var = this.f0;
        k01Var.setAlpha(a14);
        k01Var.setScaleX(Math.min(this.b1, 1.0f));
        float pivotX = k01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(m01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(m01Var.getHeight(), 2.0d) + Math.pow(m01Var.getWidth() - pivotX, 2.0d)));
        for (int i11 = 0; i11 < this.e0.b.getChildCount(); i11++) {
            View childAt = this.e0.b.getChildAt(i11);
            if (f10 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f10 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float s5 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s5)) {
                s5 = 0.0f;
            }
            childAt.setScaleX(s5);
            childAt.setScaleY(s5);
        }
        while (true) {
            p01 p01Var = this.i0;
            if (i7 >= p01Var.getChildCount()) {
                this.l0.invalidate();
                p01Var.invalidate();
                return;
            }
            View childAt2 = p01Var.getChildAt(i7);
            if (childAt2 instanceof b11) {
                b11 b11Var = (b11) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(s9)) {
                    s9 = 0.0f;
                }
                b11Var.setAnimatedScale(s9);
            }
            i7++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.x0;
        vz0 vz0Var = this.U1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                org.telegram.messenger.g0.r(vz0Var);
                org.telegram.messenger.g0.g3(vz0Var);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.A0) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
            return;
        }
        if (i7 == org.telegram.messenger.ks.C1) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
            return;
        }
        if (i7 == org.telegram.messenger.ks.B0) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
            return;
        }
        if (i7 != org.telegram.messenger.ks.k4) {
            if (i7 == org.telegram.messenger.ks.I3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.j10.i(this.W).e()) {
                org.telegram.messenger.g0.r(vz0Var);
                org.telegram.messenger.g0.g3(vz0Var);
                return;
            }
            return;
        }
        pg.c cVar = new pg.c(0);
        p01 p01Var = this.i0;
        org.telegram.messenger.g0.d0(p01Var, cVar);
        if (p01Var != null) {
            p01Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.m5 m5Var = this.p1;
        if (m5Var != null && (num = this.Z0) != null) {
            Rect bounds = m5Var.getBounds();
            View view = this.r1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.p1.getAlpha();
            View view2 = this.r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.p1.w = (int) (Math.pow(this.b0.getAlpha(), 0.25d) * alpha * this.n1);
            if (this.q1 == null) {
                this.q1 = new Rect();
            }
            float f10 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f10;
            float z10 = com.google.android.gms.internal.vision.e2.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i7 = this.e1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + (!n10 ? org.telegram.messenger.g0.L(i7) : getMeasuredHeight() - (org.telegram.messenger.g0.L(i7) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.m5 m5Var2 = this.p1;
            Rect rect = this.q1;
            int i10 = rect.left;
            Rect rect2 = this.q1;
            m5Var2.setBounds(i10, rect.top, (int) ((rect.width() / scaleY) + i10), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.p1.draw(canvas);
            org.telegram.ui.Components.m5 m5Var3 = this.p1;
            m5Var3.w = alpha;
            m5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        b11 b11Var = this.t1;
        if (b11Var == null || this.u1 == null || b11Var.F == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.t1.F.setAlpha((int) (this.s1 * 255.0f));
        this.t1.F.setBounds(this.u1);
        this.t1.F.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.n1, this.g1, this.o1), PorterDuff.Mode.SRC_IN));
        this.t1.F.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + f() + 16;
    }

    public di.ec getCollectionParticles() {
        if (this.S1 == null) {
            this.S1 = new di.ec(1, 8);
        }
        return this.S1;
    }

    public long getDialogId() {
        return org.telegram.messenger.j10.i(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.H1 ? this.j0 : this.i0).canScrollVertically(1);
        if (canScrollVertically != this.x1) {
            this.x1 = canScrollVertically;
            org.telegram.messenger.n10.n(this.p0.animate(), canScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i7, View view) {
        boolean z10;
        int i10;
        int i11;
        Integer num;
        int i12;
        int i13;
        boolean z11;
        int i14 = this.z0.get(i7);
        Integer num2 = null;
        if (i14 >= 0) {
            ArrayList arrayList = this.N0;
            if (i14 < arrayList.size()) {
                org.telegram.ui.Components.fx fxVar = (org.telegram.ui.Components.fx) arrayList.get(i14);
                if (fxVar.h) {
                    return;
                }
                boolean z12 = i14 + 1 == arrayList.size();
                i12 = this.y0.get(i14);
                this.B0.add(Long.valueOf(fxVar.b.id));
                i10 = 24;
                i11 = fxVar.h ? fxVar.c.size() : Math.min(24, fxVar.c.size());
                num = fxVar.c.size() > 24 ? Integer.valueOf(i12 + 1 + i11) : null;
                fxVar.h = true;
                i13 = fxVar.c.size();
                z11 = z12;
                if (i13 > i11) {
                    num = Integer.valueOf(i12 + 1 + i11);
                    num2 = Integer.valueOf(i13 - i11);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.O1 = view;
                this.P1 = num.intValue();
                this.Q1 = num2.intValue() + num.intValue();
                this.R1 = SystemClock.elapsedRealtime();
                if (z11) {
                    post(new org.telegram.ui.Components.ax(this, num2.intValue() > i10 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i14 != -1 || (z10 = this.D0)) {
            return;
        }
        int i15 = (this.a != -1 ? 1 : 0) + (this.w != -1 ? 1 : 0);
        boolean z13 = this.O0;
        int i16 = i15 + (z13 ? 1 : 0);
        ArrayList arrayList2 = this.E0;
        int size = z10 ? arrayList2.size() : Math.min(38 - (z13 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.D0 = true;
        i10 = 40;
        i11 = size;
        num = null;
        i12 = i16;
        i13 = size2;
        z11 = false;
        if (i13 > i11) {
        }
        B(false, true, true);
        if (num != null) {
        }
    }

    public final void l() {
        int i7 = this.a0;
        if (i7 == 2) {
            return;
        }
        String s5 = a8.p0.s(new StringBuilder("emoji"), (i7 == 0 || i7 == 12 || i7 == 9 || i7 == 10) ? "status" : "reaction", "usehint");
        int i10 = org.telegram.messenger.mp.g1().getInt(s5, 0);
        if (i10 <= 3) {
            org.telegram.messenger.mp.g1().edit().putInt(s5, i10 + 1).apply();
        }
    }

    public final boolean n() {
        int i7 = this.a0;
        return i7 == 5 || i7 == 10 || i7 == 12 || i7 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.L.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.x5 x5Var) {
        l();
        if (x5Var != null) {
            int i7 = this.a0;
            if (i7 == 0 || i7 == 12 || i7 == 9 || i7 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = x5Var.getDocumentId();
            TLRPC.Document document = x5Var.document;
            int i10 = this.W;
            if (document == null) {
                document = org.telegram.ui.Components.o5.e(i10, x5Var.documentId);
            }
            if (!(view instanceof b11)) {
                p(view, Long.valueOf(x5Var.documentId), document, null, null);
                return;
            }
            final b11 b11Var = (b11) view;
            if (b11Var.w == null && (i7 == 0 || i7 == 12 || i7 == 9 || i7 == 10)) {
                org.telegram.messenger.ri.d0(i10).G1(tL_emojiStatus);
            }
            if (i7 != 0 && i7 != 12 && i7 != 9 && i7 != 10 && i7 != 2) {
                p(view, Long.valueOf(x5Var.documentId), document, b11Var.w, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(b11Var.w)) {
                p(view, Long.valueOf(x5Var.documentId), document2, b11Var.w, null);
                return;
            }
            final wt0 wt0Var = new wt0(this, view, x5Var, document2, b11Var, 5);
            if (this.w1 != null || this.p1 == null) {
                wt0Var.run();
                return;
            }
            b11Var.b = true;
            final Rect rect = new Rect();
            m01 m01Var = this.b0;
            int left = m01Var.getLeft();
            p01 p01Var = this.i0;
            rect.set(b11Var.getLeft() + p01Var.getLeft() + left, b11Var.getTop() + p01Var.getTop() + m01Var.getTop(), b11Var.getRight() + p01Var.getLeft() + m01Var.getLeft(), b11Var.getBottom() + p01Var.getTop() + m01Var.getTop());
            Drawable drawable = b11Var.F;
            final org.telegram.ui.Components.o5 m10 = drawable instanceof org.telegram.ui.Components.o5 ? org.telegram.ui.Components.o5.m(i10, ((org.telegram.ui.Components.o5) drawable).h(), null, 7) : null;
            this.t1 = b11Var;
            Rect rect2 = new Rect();
            this.u1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.xz0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.m5 m5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float z10 = org.telegram.ui.Cells.c0.z(floatValue, floatValue, floatValue, 1.0f);
                    r11 r11Var = r11.this;
                    r11Var.n1 = z10;
                    r11Var.s1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    org.telegram.messenger.g0.X1(rect, r11Var.q1, floatValue, r11Var.u1);
                    float scaleX = b11Var.getScaleX() * Math.max(1.0f, r11Var.v1.getInterpolation(c8.l9.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    r11Var.u1.set((int) org.telegram.messenger.n10.w(r11Var.u1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.n10.w(r11Var.u1.height(), 2.0f, scaleX, r11Var.u1.centerY()), (int) com.google.android.gms.internal.vision.e2.c(r11Var.u1.width(), 2.0f, scaleX, r11Var.u1.centerX()), (int) com.google.android.gms.internal.vision.e2.c(r11Var.u1.height(), 2.0f, scaleX, r11Var.u1.centerY()));
                    r11Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        wt0Var.run();
                        if (m10 == null || (m5Var = r11Var.p1) == null) {
                            return;
                        }
                        m5Var.f();
                    }
                }
            });
            this.w1.addListener(new fi.a3(this, zArr, wt0Var, 11));
            this.w1.setInterpolator(org.telegram.ui.Components.lr.h);
            this.w1.setDuration(260L);
            this.w1.start();
            return;
        }
        p(view, null, null, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i7 = this.W;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.A0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.x0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.C1);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.B0);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.k4);
        int i10 = this.a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.I3);
        }
        org.telegram.ui.Components.m5 m5Var = this.p1;
        if (m5Var != null) {
            m5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i7 = this.W;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.A0);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.x0);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.C1);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.B0);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
        int i10 = this.a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.I3);
        }
        org.telegram.ui.Components.m5 m5Var = this.p1;
        if (m5Var != null) {
            m5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (z10 && this.a0 == 6) {
            this.s0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.R0;
        int i11 = this.a0;
        if (z10 && i11 != 3 && i11 != 4) {
            float L = org.telegram.messenger.g0.L(324.0f);
            Point point = org.telegram.messenger.g0.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(L, point.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), TLObject.FLAG_31));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.q.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(h11 h11Var) {
        Integer num = this.a2;
        if (num != null) {
        }
        this.V1 = h11Var;
        boolean z10 = this.R0;
        int i7 = 0;
        p01 p01Var = this.i0;
        if (!z10) {
            h();
            while (i7 < p01Var.getChildCount()) {
                View childAt = p01Var.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i7++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        ValueAnimator valueAnimator2 = this.X1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.X1 = null;
        }
        int i10 = this.a0;
        if (i10 == 3 || i10 == 4 || i10 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W1 = ofFloat;
        ofFloat.addUpdateListener(new uz0(this, i7));
        this.W1.addListener(new ay(this, 28));
        vz0 vz0Var = new vz0(this, i7);
        ch.f0.f = true;
        ch.f0.e = true;
        ch.f0.g = false;
        if (ch.f0.d) {
            ch.f0.d = false;
        }
        ch.f0.c = vz0Var;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 512);
        this.Y1.d();
        this.W1.setDuration(800L);
        p01Var.setLayerType(2, null);
        this.g0.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.c0.setLayerType(2, null);
        org.telegram.ui.Components.jn jnVar = this.o0;
        if (jnVar != null) {
            jnVar.setLayerType(2, null);
        }
        View view = this.n0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.e0.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.Q = z10;
    }

    public void setBackgroundDelegate(s01 s01Var) {
        this.V = s01Var;
    }

    public void setDrawBackground(boolean z10) {
        this.R0 = z10;
        this.b0.setClipToOutline(z10);
        hi.m5 m5Var = this.c0;
        if (z10) {
            m5Var.setVisibility(0);
        } else {
            m5Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            if (z10) {
                return;
            }
            org.telegram.messenger.g0.d0(this.i0, new fi.e(25));
            for (int i7 = 0; i7 < this.e0.b.getChildCount(); i7++) {
                View childAt = this.e0.b.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.e0.b.invalidate();
        }
    }

    public void setExpireDateHint(int i7) {
        if (i7 <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i7);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.S = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        b11 b11Var = this.P;
        if (b11Var != null) {
            b11Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.i1 = z10;
    }

    public void setOnLongPressedListener(p11 p11Var) {
        this.I = p11Var;
    }

    public void setRecentReactions(List<ch.p0> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i7) {
        this.a2 = Integer.valueOf(i7);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l10);
        p01 p01Var = this.i0;
        if (p01Var != null) {
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                if (p01Var.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i7);
                    org.telegram.ui.Components.x5 x5Var = b11Var.e;
                    if (x5Var != null) {
                        b11Var.d(hashSet.contains(Long.valueOf(x5Var.getDocumentId())), true);
                    } else {
                        b11Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            p01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.p0 p0Var) {
        this.K.clear();
        this.K.add(p0Var);
        p01 p01Var = this.i0;
        if (p01Var != null) {
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                if (p01Var.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i7);
                    b11Var.d(this.K.contains(b11Var.y), true);
                }
            }
            p01Var.invalidate();
        }
        f01 f01Var = this.j0;
        if (f01Var != null) {
            for (int i10 = 0; i10 < f01Var.getChildCount(); i10++) {
                if (f01Var.getChildAt(i10) instanceof b11) {
                    b11 b11Var2 = (b11) f01Var.getChildAt(i10);
                    b11Var2.d(this.K.contains(b11Var2.y), true);
                }
            }
            f01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.p0> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.p0) arrayList.get(i7)).g != 0) {
                hashSet2.add(Long.valueOf(((ch.p0) arrayList.get(i7)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        try {
            if (this.m1 && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, this.a1)) != this.g1) {
                this.g1 = w02;
                this.N.setColor(i0.a.o(w02, 30));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.g1, PorterDuff.Mode.SRC_IN);
                this.l1 = porterDuffColorFilter;
                org.telegram.ui.Components.o5 o5Var = this.X0;
                if (o5Var != null) {
                    o5Var.setColorFilter(porterDuffColorFilter);
                }
                p01 p01Var = this.i0;
                if (p01Var != null) {
                    p01Var.invalidate();
                }
                f01 f01Var = this.j0;
                if (f01Var != null) {
                    f01Var.invalidate();
                }
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        vz0 vz0Var = this.K1;
        if (vz0Var != null) {
            org.telegram.messenger.g0.r(vz0Var);
            this.K1 = null;
        }
        fi.p5 p5Var = this.L1;
        if (p5Var != null) {
            org.telegram.messenger.g0.r(p5Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        c11 c11Var = this.r0;
        j01 j01Var = this.g0;
        if (isEmpty) {
            this.z1 = false;
            this.A1 = false;
            z(false, z10);
            if (j01Var != null) {
                j01Var.d(true);
                j01.a(j01Var, false);
            }
            c11Var.E(true);
            this.B1 = null;
        } else {
            boolean z12 = this.z1;
            boolean z13 = !z12;
            this.z1 = true;
            this.A1 = false;
            if (j01Var != null) {
                j01Var.f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                c11Var.E(false);
            } else if (!str.equals(this.B1)) {
                vz0 vz0Var2 = new vz0(this, 1);
                this.K1 = vz0Var2;
                org.telegram.messenger.g0.h3(vz0Var2, 120L);
            }
            this.B1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, c2)) {
                org.telegram.messenger.ri.d0(this.W).O(G0, false);
            }
            c2 = G0;
            fi.p5 p5Var2 = new fi.p5(this, str, z10, z13, G0, 3);
            this.L1 = p5Var2;
            org.telegram.messenger.g0.h3(p5Var2, z11 ? 425L : 0L);
            if (j01Var != null) {
                j01Var.f.b(2);
                j01.a(j01Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u0.getAlpha(), f10 * 0.25f);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new uz0(this, 2));
        this.j1.setDuration(200L);
        this.j1.setInterpolator(org.telegram.ui.Components.lr.f);
        this.j1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.L;
        if (hashSet.contains(l10)) {
            hashSet.remove(l10);
            z11 = false;
        } else {
            hashSet.add(l10);
            z11 = true;
        }
        p01 p01Var = this.i0;
        if (p01Var != null) {
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                if (p01Var.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i7);
                    org.telegram.ui.Components.x5 x5Var = b11Var.e;
                    if (x5Var == null || x5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = b11Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            b11Var.e(z11, z10);
                        }
                    } else {
                        b11Var.e(z11, z10);
                    }
                }
            }
            p01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.m5 m5Var, View view) {
        Integer num;
        this.o1 = (m5Var == null || (num = m5Var.G) == null) ? 0 : num.intValue();
        this.p1 = m5Var;
        this.r1 = view;
        if (this.J && m5Var != null) {
            m5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        p01 p01Var = this.i0;
        int i7 = 0;
        p01Var.setVisibility(0);
        f01 f01Var = this.j0;
        f01Var.setVisibility(0);
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G1 = ofFloat;
        ofFloat.addUpdateListener(new yz0(this, z10, i7));
        this.G1.addListener(new l01(this, z10, i7));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(org.telegram.ui.Components.lr.h);
        this.G1.start();
        org.telegram.messenger.n10.o(((View) p01Var.getParent()).animate().translationY((this.H1 && z11) ? -org.telegram.messenger.g0.L(36.0f) : 0.0f).setUpdateListener(new uz0(this, 1)), org.telegram.ui.Components.lr.f, 160L);
        if (this.H1 && z11) {
            f01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            f01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public r11(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, Integer num, int i7, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this(h2Var, context, z10, num, i7, z11, i6Var, i10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r11(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, Integer num, int i7, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        float f11;
        Integer num2;
        boolean z12;
        Integer num3;
        boolean z13;
        Integer num4;
        boolean z14;
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        int i14 = i7;
        int i15 = i11;
        this.K = new HashSet();
        this.L = new HashSet();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.T = new ArrayList();
        this.W = org.telegram.messenger.j10.t0;
        this.d0 = new org.telegram.ui.Components.lv[2];
        this.w0 = new ArrayList();
        this.x0 = new SparseIntArray();
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new SparseIntArray();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = false;
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = false;
        this.P0 = false;
        this.R0 = true;
        this.W0 = new ImageReceiver(null);
        this.i1 = true;
        this.n1 = 1.0f;
        this.s1 = 1.0f;
        this.v1 = new OvershootInterpolator(2.0f);
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.H1 = false;
        this.I1 = false;
        this.M1 = false;
        this.N1 = false;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1L;
        this.T1 = new vz0(this, 3);
        this.U1 = new vz0(this, 4);
        this.Y1 = new h2.f((int[]) null);
        this.Z1 = new Paint();
        this.a1 = i6Var;
        this.a0 = i14;
        this.O0 = z10;
        this.d1 = h2Var2;
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.P0 = g12.getInt(sb2.toString(), 0) < 3;
        this.g1 = i15;
        this.m1 = i15 == org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var));
        paint2.setColor(i0.a.o(i15, 30));
        this.l1 = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
        this.Z0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(c8.l9.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        int i16 = 6;
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 7) {
            this.e1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new d0(this, i16));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.n0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.G8, i6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, c8.ma.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.p) + (z15 ? -12 : 4), n() ? 0 : this.e1, 0.0f, n() ? this.e1 : 0));
        }
        hi.m5 m5Var = new hi.m5(this, context, i6Var, 15);
        this.c0 = m5Var;
        boolean z16 = i14 == 3 || i14 == 4;
        Integer num5 = valueOf;
        m01 m01Var = new m01(this, context, z16, z16, i6Var, num5);
        Integer num6 = num5;
        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
        this.b0 = m01Var;
        if (!z16) {
            m01Var.setOutlineProvider(new n01(this, num6));
            m01Var.setClipToOutline(true);
            if (z16) {
                m01Var.setElevation(2.0f);
            }
        }
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 15) {
            m01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        m01Var.addView(m5Var, c8.ma.c(-1.0f, -1));
        addView(m01Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 2 || i14 == 7) ? this.e1 + 6 : 0.0f, 0.0f, n() ? this.e1 + 6 : 0.0f));
        if (num6 != null) {
            org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, 23);
            this.o0 = jnVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.G8, i6Var2, PorterDuff.Mode.MULTIPLY);
            jnVar.setBackground(drawable);
            i12 = 3;
            addView(jnVar, c8.ma.d(17, 9.0f, (n() ? 80 : 48) | 3, (num6.intValue() / org.telegram.messenger.g0.p) + (z15 ? -25 : 10), n() ? 0.0f : this.e1 + 5, 0.0f, n() ? this.e1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z17 = (h2Var2 == null || i14 == i12 || i14 == 6 || i14 == 5 || i14 == 7 || i14 == 4 || i14 == 9 || i14 == 10 || !z11) ? false : true;
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                break;
            }
            Integer num7 = num6;
            if (i14 != 4) {
                num3 = num7;
                z13 = true;
            } else {
                num3 = num7;
                z13 = false;
            }
            if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) {
                num4 = num3;
                z14 = true;
            } else {
                num4 = num3;
                z14 = false;
            }
            Integer num8 = num4;
            tr0 tr0Var = z17 ? new tr0(29, this, h2Var2) : null;
            int i18 = i17;
            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
            int i19 = i14;
            int i20 = i13;
            o01 o01Var = new o01(this, context, i6Var3, z13, z14, i19, tr0Var, i15, i7);
            org.telegram.ui.Components.hv hvVar = o01Var.E;
            if (hvVar != null) {
                hvVar.setOnLongClickListener(new t(this, 7));
            }
            o01Var.V = false;
            if (i19 == 4) {
                o01Var.setAnimatedEmojiCacheType(13);
            } else {
                o01Var.setAnimatedEmojiCacheType((i19 == 0 || i19 == 12 || i19 == 2) ? 6 : 5);
            }
            o01Var.P = num8 == null;
            o01Var.setPaddingLeft(i19 == 6 ? 10.0f : 5.0f);
            if (i19 != i20 && i19 != 8 && i19 != 13) {
                this.b0.addView(o01Var, c8.ma.c(36.0f, -1));
            }
            this.d0[i18] = o01Var;
            i15 = i11;
            i14 = i19;
            i13 = i20;
            h2Var2 = h2Var;
            i6Var2 = i6Var3;
            i17 = i18 + 1;
            num6 = num8;
        }
        Integer num9 = num6;
        org.telegram.ui.ActionBar.i6 i6Var4 = i6Var2;
        int i21 = i14;
        int i22 = i13;
        org.telegram.ui.Components.lv[] lvVarArr = this.d0;
        this.e0 = lvVarArr[0];
        lvVarArr[1].setVisibility(8);
        k01 k01Var = new k01(context, num9, 1);
        this.f0 = k01Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, k01Var, i6Var4);
        if (i21 == i22 || i21 == 8 || i21 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.b0.addView(k01Var, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.X3(k01Var, true, f10, true, false);
        p01 p01Var = new p01(this, context, i21);
        this.i0 = p01Var;
        q01 q01Var = new q01();
        this.f1 = q01Var;
        q01Var.c = 220L;
        q01Var.e = 260L;
        q01Var.f = 160L;
        q01Var.g = 160L;
        q01Var.m = false;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        q01Var.i = lrVar;
        q01Var.C = false;
        p01Var.setItemAnimator(q01Var);
        float f12 = f10;
        p01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        r01 r01Var = new r01(this);
        this.q0 = r01Var;
        p01Var.setAdapter(r01Var);
        g01 g01Var = new g01(this, 1);
        this.s0 = g01Var;
        p01Var.setLayoutManager(g01Var);
        g01Var.O = new e01(this, 0);
        hh0 hh0Var = new hh0(context, 7);
        this.h0 = hh0Var;
        ai.k0 k0Var = new ai.k0(this, context);
        this.l0 = k0Var;
        k0Var.addView(p01Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        hh0Var.addView(k0Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        f01 f01Var = new f01(this, context);
        this.j0 = f01Var;
        if (f01Var.getItemAnimator() != null) {
            f11 = 38.0f;
            num2 = num9;
            f01Var.getItemAnimator().n(180L);
            f01Var.getItemAnimator().i = lrVar;
        } else {
            f11 = 38.0f;
            num2 = num9;
        }
        TextView textView = new TextView(context);
        if (i21 == 4) {
            textView.setText(org.telegram.messenger.gd.M0(2131748020, null));
        } else if (i21 == 0 || i21 == 13 || i21 == 12 || i21 == 11 || i21 == 9 || i21 == 10) {
            textView.setText(org.telegram.messenger.gd.M0(2131748021, null));
        } else if (i21 == 1 || i21 == 2) {
            textView.setText(org.telegram.messenger.gd.M0(2131747982, null));
        } else if (i21 == i22) {
            textView.setText(org.telegram.messenger.gd.M0(2131748022, null));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131748011, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Df, i6Var4);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.m0 = q9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        frameLayout.addView(q9Var, c8.ma.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        hh0Var.addView(frameLayout, c8.ma.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        f01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(f11));
        c11 c11Var = new c11(this);
        this.r0 = c11Var;
        f01Var.setAdapter(c11Var);
        g01 g01Var2 = new g01(this, 0);
        f01Var.setLayoutManager(g01Var2);
        g01Var2.O = new e01(this, 1);
        f01Var.setVisibility(8);
        hh0Var.addView(f01Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b0.addView(hh0Var, c8.ma.d(-1, -1.0f, 48, 0.0f, (i21 == 8 || i21 == 13 || i21 == i22) ? 0.0f : (f12 / org.telegram.messenger.g0.p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(p01Var, g01Var);
        this.t0 = l5Var;
        l5Var.r = new ci.h(this, 2);
        l5Var.n = new wz0(this);
        i01 i01Var = new i01(this, i21, context, i6Var4, num);
        p01Var.p1(i01Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        f01Var.p1(i01Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(this, i21, 2);
        p01Var.setOnItemClickListener(ll0Var);
        f01Var.setOnItemClickListener(ll0Var);
        j01 j01Var = new j01(this, context, z11);
        this.g0 = j01Var;
        j01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        j01Var.setVisibility(4);
        hh0Var.addView(j01Var, c8.ma.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        k01 k01Var2 = new k01(context, num2, 0);
        Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
        int i23 = org.telegram.ui.ActionBar.n6.G8;
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.8f, i23);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.k(k01Var2, drawable2, K.a, -1, 2, K.d, i6Var, mode);
        k01Var2.setBackground(drawable2);
        k01Var2.setAlpha(0.0f);
        this.b0.addView(k01Var2, c8.ma.d(-1, 20.0f, 55, 0.0f, (f12 / org.telegram.messenger.g0.p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.p0 = view2;
        Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
        org.telegram.ui.ActionBar.u6.x(this, drawable3, i23, i6Var, mode);
        if (i21 == i22) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.b0.addView(view2, c8.ma.e(-1, 20, 87));
        View view3 = new View(context);
        this.u0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.b0.addView(view3, c8.ma.c(-1.0f, -1));
        int i24 = this.W;
        org.telegram.messenger.ri.d0(i24);
        org.telegram.messenger.ri.d0(i24).D(5);
        if (i21 == i22) {
            org.telegram.messenger.mp.u1(this.W).G0();
        } else if (i21 == 1 || i21 == 11 || i21 == 2 || i21 == 6 || i21 == 13) {
            org.telegram.messenger.ri.d0(i24).C();
        } else if (i21 == 9 || i21 == 10) {
            if (org.telegram.messenger.mp.u1(i24).h7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.ri.d0(i24).d1(5, false, false);
                org.telegram.messenger.mp.u1(i24).h7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.ri.d0(i24).N(2, false);
            org.telegram.messenger.ri.d0(i24).b1();
            org.telegram.messenger.ri.d0(i24).o0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i21 == 0 || i21 == 12) {
            org.telegram.messenger.ri.d0(i24).N(0, true);
            org.telegram.messenger.ri.d0(i24).o0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i21 == 3) {
            org.telegram.messenger.ri.d0(i24).x();
        } else if (i21 == 4) {
            org.telegram.messenger.ri.d0(i24).Y0(0, false, true, false);
            org.telegram.messenger.ri.d0(i24).D(0);
        }
        this.W0.E0(7);
        int i25 = this.a0;
        if (i25 == 3 || i25 == 4 || i25 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.ec.D().p;
            if (((CountDownLatch) b0Var.c) == null) {
                z12 = true;
                b0Var.c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            ch.f0.g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            this.K.add(ch.p0.b(str));
        }
        p01 p01Var = this.i0;
        if (p01Var != null) {
            for (int i10 = 0; i10 < p01Var.getChildCount(); i10++) {
                if (p01Var.getChildAt(i10) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i10);
                    b11Var.d(this.K.contains(b11Var.y), true);
                }
            }
            p01Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(q11 q11Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(b11 b11Var, ch.p0 p0Var) {
    }
}
