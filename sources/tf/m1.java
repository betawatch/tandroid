package tf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s41;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m1 extends rl0 {
    public ImageView I;
    public TextView J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public String O;
    public final f6 Q;
    public final Context d;
    public final s41 e;
    public final TLRPC.StickerSetCovered[] f;
    public final LongSparseArray h;
    public final LongSparseArray n;
    public int y;
    public final int c = UserConfig.selectedAccount;
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseArray x = new SparseArray();
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public final HashMap D = new HashMap();
    public final HashMap E = new HashMap();
    public final HashMap F = new HashMap();
    public final ArrayList G = new ArrayList();
    public final SparseArray H = new SparseArray();
    public final l1 P = new l1(this);

    public m1(Context context, s41 s41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, f6 f6Var) {
        this.d = context;
        this.e = s41Var;
        this.f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.n = longSparseArray2;
        this.Q = f6Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E(r3 r3Var, int i10, boolean z4) {
        boolean z10;
        r3 r3Var2;
        boolean z11;
        int i11 = this.c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.s.get(i10);
        boolean z12 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i12 >= stickerSetCoveredArr.length) {
                z10 = false;
                break;
            }
            if (stickerSetCoveredArr[i12] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i12].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i12] = null;
                } else if (stickerSetCoveredArr[i12].set.id == stickerSetCovered.set.id) {
                    z10 = true;
                    break;
                }
            }
            i12++;
        }
        int indexOfIgnoreCase = TextUtils.isEmpty(this.O) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.O);
        if (indexOfIgnoreCase >= 0) {
            r3Var2 = r3Var;
            z11 = z4;
            r3Var2.c(stickerSetCovered, z12, z11, indexOfIgnoreCase, this.O.length(), z10);
        } else {
            r3Var2 = r3Var;
            z11 = z4;
            r3Var2.c(stickerSetCovered, z12, z11, 0, 0, z10);
            if (!TextUtils.isEmpty(this.O) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.O) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.O.length();
                r3Var2.C = str;
                r3Var2.D = length;
                r3Var2.f();
            }
        }
        if (z12) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
        }
        long j10 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray = this.h;
        boolean z13 = longSparseArray.indexOfKey(j10) >= 0;
        long j11 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray2 = this.n;
        boolean z14 = longSparseArray2.indexOfKey(j11) >= 0;
        if (z13 || z14) {
            if (z13 && r3Var2.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
                z13 = false;
            } else if (z14 && !r3Var2.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
            }
        }
        r3Var2.b(!z10 && z13, z11);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        r3Var2.setNeedDivider(i10 > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r1 >= r2.length) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r2[r1] != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r2[r1] = r9;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r10.b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r8.h.put(r9.set.id, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r8.e.a.g(r10.getStickerSet(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r10 = r8.H;
        r1 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r2 >= r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r10.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r3.set.id != r9.set.id) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        n(r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, r3 r3Var) {
        int i10 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i10 >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i10] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.c).getStickerSetById(stickerSetCoveredArr[i10].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i10] = null;
                    break;
                } else if (stickerSetCoveredArr[i10].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i10++;
        }
    }

    @Override // f2.o0
    public final int h() {
        return Math.max(1, this.y + 1);
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0 && this.y == 0) {
            return 5;
        }
        if (i10 == h() - 1) {
            return 4;
        }
        Object obj = this.s.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21, types: [org.telegram.tgnet.TLRPC$TL_messages_stickerSet, org.telegram.tgnet.TLRPC$messages_StickerSet] */
    @Override // f2.o0
    public final void l() {
        s41 s41Var;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.w;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.H;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.x;
        sparseArray5.clear();
        this.y = 0;
        ArrayList arrayList5 = this.B;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.C;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.G;
        int i12 = !arrayList7.isEmpty() ? 1 : 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray6 = this.v;
            s41 s41Var2 = this.e;
            if (i13 < size2) {
                s41Var = s41Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                i10 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i11 = i12;
                stickerSetCovered = r62;
            } else {
                s41Var = s41Var2;
                i10 = size;
                int i15 = i13 - size2;
                if (i15 < i12) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i11 = i12;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < size3) {
                        int i18 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i16);
                        int i19 = i16;
                        String str2 = (String) this.F.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.y + i17, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i20 = 0;
                        while (i20 < size4) {
                            String str3 = str;
                            int i21 = this.y + i17;
                            int i22 = size4;
                            int a2 = (i17 / s41Var.a()) + i14;
                            int i23 = i20;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i20);
                            sparseArray3.put(i21, document);
                            ArrayList arrayList9 = arrayList7;
                            int i24 = i17;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.c).getStickerSetById(MediaDataController.getStickerSetId(document));
                            if (stickerSetById != null) {
                                sparseArray6.put(i21, stickerSetById);
                            }
                            sparseIntArray.put(i21, a2);
                            i17 = i24 + 1;
                            i20 = i23 + 1;
                            str = str3;
                            size4 = i22;
                            arrayList7 = arrayList9;
                        }
                        i16 = i19 + 1;
                        size3 = i18;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i17 / s41Var.a());
                    for (int i25 = 0; i25 < ceil; i25++) {
                        sparseArray2.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.y = (s41Var.a() * ceil) + this.y;
                    i14 += ceil;
                    arrayList4 = arrayList5;
                    i13++;
                    size = i10;
                    arrayList6 = arrayList;
                    i12 = i11;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i11 = i12;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i15 - i11);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / s41Var.a());
                sparseArray3.put(this.y, stickerSetCovered);
                if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.y, stickerSetCovered);
                }
                sparseIntArray.put(this.y, i14);
                int size5 = arrayList3.size();
                int i26 = 0;
                while (i26 < size5) {
                    int i27 = i26 + 1;
                    int i28 = ceil2;
                    int i29 = this.y + i27;
                    int a10 = i26 / s41Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i29, arrayList3.get(i26));
                    sparseArray6.put(i29, stickerSetCovered);
                    sparseIntArray.put(i29, a10 + i14 + 1);
                    if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i29, stickerSetCovered);
                    }
                    i26 = i27;
                    ceil2 = i28;
                    arrayList5 = arrayList10;
                }
                int i30 = ceil2;
                arrayList4 = arrayList5;
                int i31 = i30 + 1;
                for (int i32 = 0; i32 < i31; i32++) {
                    sparseArray2.put(i14 + i32, stickerSetCovered);
                }
                this.y = (s41Var.a() * i30) + 1 + this.y;
                i14 += i31;
                i13++;
                size = i10;
                arrayList6 = arrayList;
                i12 = i11;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i13++;
            size = i10;
            arrayList6 = arrayList;
            i12 = i11;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.l();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        SparseArray sparseArray = this.s;
        if (i11 == 0) {
            ((d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.v.get(i10), (String) this.x.get(i10), false, false);
            return;
        }
        if (i11 == 1) {
            ((k3) view).setHeight(0);
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            E((r3) view, i10, false);
            return;
        }
        m8 m8Var = (m8) view;
        Object obj = sparseArray.get(i10);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.O) && this.D.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    m8Var.b(0, stickerSet.title);
                }
                m8Var.d(this.O.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.E.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                m8Var.c(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.O) ? this.O.length() : 0);
            }
            m8Var.d(0, null);
        }
    }

    @Override // f2.o0
    public final void w(f2.l1 l1Var, int i10, List list) {
        if (list.contains(0) && l1Var.f == 3) {
            E((r3) l1Var.a, i10, true);
        } else {
            v(l1Var, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.View] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        f6 f6Var = this.Q;
        Context context = this.d;
        if (i10 == 0) {
            az azVar = new az(3, context, f6Var, false);
            azVar.getImageView().setLayerNum(3);
            frameLayout = azVar;
        } else if (i10 == 1) {
            frameLayout = new k3(context);
        } else if (i10 == 2) {
            frameLayout = new m8(this.d, false, true, this.Q, false);
        } else if (i10 == 3) {
            r3 r3Var = new r3(17, this.d, this.Q, true, true);
            r3Var.setAddOnClickListener(new oh.n(this, 22));
            frameLayout = r3Var;
        } else if (i10 == 4) {
            frameLayout = new View(context);
        } else if (i10 != 5) {
            frameLayout = null;
        } else {
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            this.I = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.I.setImageResource(R.drawable.stickers_empty);
            ImageView imageView2 = this.I;
            int i11 = j6.Le;
            imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(this.I, b6.n(-2, -2));
            linearLayout.addView(new Space(context), b6.n(-1, 15));
            TextView textView = new TextView(context);
            this.J = textView;
            textView.setText(LocaleController.getString(R.string.NoStickersFound));
            this.J.setTextSize(1, 16.0f);
            this.J.setTextColor(j6.v0(i11, f6Var));
            linearLayout.addView(this.J, b6.n(-2, -2));
            linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
            linearLayout.setLayoutParams(b6.c(-1.0f, -1));
            frameLayout = linearLayout;
        }
        return new el0(frameLayout);
    }
}
