package pf;

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
import f2.o1;
import h7.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Cells.p3;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l1 extends yk0 {
    public ImageView H;
    public TextView I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public String N;
    public final c6 P;
    public final Context d;
    public final x31 e;
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
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public final HashMap D = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList F = new ArrayList();
    public final SparseArray G = new SparseArray();
    public final k1 O = new k1(this);

    public l1(Context context, x31 x31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, c6 c6Var) {
        this.d = context;
        this.e = x31Var;
        this.f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.n = longSparseArray2;
        this.P = c6Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        return false;
    }

    public final void E(p3 p3Var, int i10, boolean z10) {
        boolean z11;
        p3 p3Var2;
        boolean z12;
        int i11 = this.c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.s.get(i10);
        boolean z13 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i12 >= stickerSetCoveredArr.length) {
                z11 = false;
                break;
            }
            if (stickerSetCoveredArr[i12] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i12].set.id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i12] = null;
                } else if (stickerSetCoveredArr[i12].set.id == stickerSetCovered.set.id) {
                    z11 = true;
                    break;
                }
            }
            i12++;
        }
        int indexOfIgnoreCase = TextUtils.isEmpty(this.N) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
        if (indexOfIgnoreCase >= 0) {
            p3Var2 = p3Var;
            z12 = z10;
            p3Var2.c(stickerSetCovered, z13, z12, indexOfIgnoreCase, this.N.length(), z11);
        } else {
            p3Var2 = p3Var;
            z12 = z10;
            p3Var2.c(stickerSetCovered, z13, z12, 0, 0, z11);
            if (!TextUtils.isEmpty(this.N) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) == 0) {
                String str = stickerSetCovered.set.short_name;
                int length = this.N.length();
                p3Var2.B = str;
                p3Var2.C = length;
                p3Var2.f();
            }
        }
        if (z13) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
        }
        long j10 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray = this.h;
        boolean z14 = longSparseArray.indexOfKey(j10) >= 0;
        long j11 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray2 = this.n;
        boolean z15 = longSparseArray2.indexOfKey(j11) >= 0;
        if (z14 || z15) {
            if (z14 && p3Var2.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
                z14 = false;
            } else if (z15 && !p3Var2.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
            }
        }
        p3Var2.b(!z11 && z14, z12);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        p3Var2.setNeedDivider(i10 > 0);
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
    
        r10 = r8.G;
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
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, p3 p3Var) {
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

    @Override // f2.q0
    public final int h() {
        return Math.max(1, this.y + 1);
    }

    @Override // f2.q0
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
    @Override // f2.q0
    public final void l() {
        x31 x31Var;
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
        SparseArray sparseArray4 = this.G;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.x;
        sparseArray5.clear();
        this.y = 0;
        ArrayList arrayList5 = this.A;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.B;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.F;
        int i12 = !arrayList7.isEmpty() ? 1 : 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray6 = this.v;
            x31 x31Var2 = this.e;
            if (i13 < size2) {
                x31Var = x31Var2;
                ?? r62 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                i10 = size;
                arrayList3 = r62.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i11 = i12;
                stickerSetCovered = r62;
            } else {
                x31Var = x31Var2;
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
                        String str2 = (String) this.E.get(arrayList8);
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
                            int a2 = (i17 / x31Var.a()) + i14;
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
                    int ceil = (int) Math.ceil(i17 / x31Var.a());
                    for (int i25 = 0; i25 < ceil; i25++) {
                        sparseArray2.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.y = (x31Var.a() * ceil) + this.y;
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
                int ceil2 = (int) Math.ceil(arrayList3.size() / x31Var.a());
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
                    int a3 = i26 / x31Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i29, arrayList3.get(i26));
                    sparseArray6.put(i29, stickerSetCovered);
                    sparseIntArray.put(i29, a3 + i14 + 1);
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
                this.y = (x31Var.a() * i30) + 1 + this.y;
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

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        int i11 = o1Var.f;
        View view = o1Var.a;
        SparseArray sparseArray = this.s;
        if (i11 == 0) {
            ((a8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.v.get(i10), (String) this.x.get(i10), false, false);
            return;
        }
        if (i11 == 1) {
            ((i3) view).setHeight(0);
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            E((p3) view, i10, false);
            return;
        }
        j8 j8Var = (j8) view;
        Object obj = sparseArray.get(i10);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.N) && this.C.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    j8Var.b(0, stickerSet.title);
                }
                j8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.D.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                j8Var.c(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.N) ? this.N.length() : 0);
            }
            j8Var.d(0, null);
        }
    }

    @Override // f2.q0
    public final void w(o1 o1Var, int i10, List list) {
        if (list.contains(0) && o1Var.f == 3) {
            E((p3) o1Var.a, i10, true);
        } else {
            v(o1Var, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.View] */
    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        c6 c6Var = this.P;
        Context context = this.d;
        if (i10 == 0) {
            oy oyVar = new oy(3, context, c6Var, false);
            oyVar.getImageView().setLayerNum(3);
            frameLayout = oyVar;
        } else if (i10 == 1) {
            frameLayout = new i3(context);
        } else if (i10 == 2) {
            frameLayout = new j8(this.d, false, true, this.P, false);
        } else if (i10 == 3) {
            p3 p3Var = new p3(17, this.d, this.P, true, true);
            p3Var.setAddOnClickListener(new c5(this, 18));
            frameLayout = p3Var;
        } else if (i10 == 4) {
            frameLayout = new View(context);
        } else if (i10 != 5) {
            frameLayout = null;
        } else {
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.H.setImageResource(R.drawable.stickers_empty);
            ImageView imageView2 = this.H;
            int i11 = g6.Le;
            imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(this.H, z5.n(-2, -2));
            linearLayout.addView(new Space(context), z5.n(-1, 15));
            TextView textView = new TextView(context);
            this.I = textView;
            textView.setText(LocaleController.getString(R.string.NoStickersFound));
            this.I.setTextSize(1, 16.0f);
            this.I.setTextColor(g6.v0(i11, c6Var));
            linearLayout.addView(this.I, z5.n(-2, -2));
            linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
            linearLayout.setLayoutParams(z5.c(-1.0f, -1));
            frameLayout = linearLayout;
        }
        return new lk0(frameLayout);
    }
}
