// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z24 extends q59 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final /* synthetic */ e34 R;
    public final z14 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final Context h;
    public int y;
    public final SparseArray n = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseArray x = new SparseArray();
    public ArrayList F = new ArrayList();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public HashMap I = new HashMap();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final y24 P = new y24(this);
    public int Q = -1;

    public z24(e34 e34Var, Context context) {
        this.R = e34Var;
        this.h = context;
        z14 z14Var = new z14(context, e34Var.d1, new h92(this, (byte) 26), new yu3(this, (byte) 6), e34Var.a2);
        this.c = z14Var;
        z14Var.setPadding(gm.L(10.0f), 0, gm.L(10.0f), gm.L(5.0f));
        z14Var.setClipToPadding(false);
        z14Var.g3.r = false;
        z14Var.setNestedScrollingEnabled(false);
        z14Var.setDrawSelection(false);
        z14Var.setOnTouchListener(new a24(this, (byte) 2));
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 7;
    }

    @Override // y59
    public final int b() {
        int i = this.y;
        if (i != 1) {
            return i + 1;
        }
        return 2;
    }

    @Override // y59
    public final int d(int i) {
        if (this.d != 0 && i == b() - 1) {
            return 8;
        }
        if (i == this.Q) {
            return 7;
        }
        if (i == 0) {
            return 4;
        }
        if (i == 1 && this.y == 1) {
            return 5;
        }
        Object obj = this.r.get(i);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    @Override // y59
    public final void f() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        e34 e34Var = this.R;
        int i5 = e34Var.d1;
        w24 w24Var = e34Var.z0;
        this.Q = -1;
        SparseArray sparseArray = this.n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.x;
        sparseArray3.clear();
        this.y = 0;
        int size = this.H.size() + this.F.size();
        this.c.g3.O(false);
        long j = this.d;
        String str = "";
        SparseArray sparseArray4 = this.s;
        if (j != 0) {
            ArrayList arrayList = this.f;
            int i6 = this.y;
            this.y = i6 + 1;
            sparseArray2.put(i6, "search");
            if (size > 0) {
                int i7 = this.y;
                this.y = i7 + 1;
                this.Q = i7;
                sparseArray2.put(i7, "packs");
                int i8 = this.y;
                this.y = i8 + 1;
                sparseArray2.put(i8, jb6.G(this.e.count, "Stickers", new Object[0]));
                i4 = 3;
            } else {
                i4 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.y, str2);
            }
            int size2 = arrayList.size();
            int i9 = 0;
            int i10 = 0;
            while (i9 < size2) {
                int i11 = this.y + i10;
                int i12 = (i10 / w24Var.d) + i4;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
                sparseArray2.put(i11, document);
                ArrayList arrayList2 = arrayList;
                int i13 = i9;
                TLRPC.TL_messages_stickerSet p0 = hs6.d0(i5).p0(hs6.r0(document));
                if (p0 != null) {
                    sparseArray4.put(i11, p0);
                }
                sparseIntArray.put(i11, i12);
                i10++;
                i9 = i13 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i10 / w24Var.d);
            for (int i14 = 0; i14 < ceil; i14++) {
                sparseArray.put(i4 + i14, Integer.valueOf(i10));
            }
            this.y = (ceil * w24Var.d) + this.y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            boolean z3 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
            int i15 = this.y;
            this.y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.y;
                this.y = i16 + 1;
                this.Q = i16;
                sparseArray2.put(i16, "packs");
                i = 2;
            } else {
                i = 1;
            }
            if (isEmpty) {
                i2 = i5;
                z = isEmpty;
                z2 = z3;
                i3 = size;
            } else {
                int i17 = this.y;
                this.y = i17 + 1;
                sparseArray2.put(i17, jb6.M0(2131744563, null));
                int i18 = i + 1;
                int size3 = this.J.size();
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    i2 = i5;
                    if (i20 >= size3) {
                        break;
                    }
                    ArrayList arrayList4 = (ArrayList) this.J.get(i20);
                    boolean z4 = isEmpty;
                    String str3 = (String) this.I.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.y + i19, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z5 = z3;
                    int i21 = 0;
                    while (i21 < size4) {
                        int i22 = size4;
                        int i23 = this.y + i19;
                        int i24 = size;
                        int i25 = (i19 / w24Var.d) + i18;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i21);
                        sparseArray2.put(i23, document2);
                        String str4 = str;
                        int i26 = i18;
                        TLRPC.TL_messages_stickerSet p02 = hs6.d0(i2).p0(hs6.r0(document2));
                        if (p02 != null) {
                            sparseArray4.put(i23, p02);
                        }
                        sparseIntArray.put(i23, i25);
                        i19++;
                        i21++;
                        size4 = i22;
                        size = i24;
                        arrayList4 = arrayList5;
                        i18 = i26;
                        str = str4;
                    }
                    i20++;
                    i5 = i2;
                    isEmpty = z4;
                    z3 = z5;
                }
                z = isEmpty;
                z2 = z3;
                i3 = size;
                int i27 = i18;
                int ceil2 = (int) Math.ceil(i19 / w24Var.d);
                for (int i28 = 0; i28 < ceil2; i28++) {
                    sparseArray.put(i27 + i28, Integer.valueOf(i19));
                }
                this.y = (w24Var.d * ceil2) + this.y;
                i = i27 + ceil2;
            }
            if (z2) {
                int i29 = this.y;
                this.y = i29 + 1;
                sparseArray2.put(i29, jb6.M0(2131744564, null));
                int i30 = i + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.y, str5);
                }
                int size5 = this.L.size();
                int i31 = 0;
                for (int i32 = 0; i32 < size5; i32++) {
                    int i33 = this.y + i31;
                    int i34 = (i31 / w24Var.d) + i30;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i32);
                    sparseArray2.put(i33, document3);
                    TLRPC.TL_messages_stickerSet p03 = hs6.d0(i2).p0(hs6.r0(document3));
                    if (p03 != null) {
                        sparseArray4.put(i33, p03);
                    }
                    sparseIntArray.put(i33, i34);
                    i31++;
                }
                int ceil3 = (int) Math.ceil(i31 / w24Var.d);
                for (int i35 = 0; i35 < ceil3; i35++) {
                    sparseArray.put(i30 + i35, Integer.valueOf(i31));
                }
                this.y = (ceil3 * w24Var.d) + this.y;
            }
            if (z && !z2 && i3 == 0) {
                this.y = 1;
            }
        }
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r8 != 0) goto L23;
     */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        e34 e34Var = this.R;
        LongSparseArray longSparseArray = e34Var.A1;
        LongSparseArray longSparseArray2 = e34Var.z1;
        int i2 = u69Var.f;
        View view = u69Var.a;
        SparseArray sparseArray = this.r;
        boolean z = true;
        z = true;
        if (i2 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
            y0b y0bVar = (y0b) view;
            y0bVar.d(document, null, this.s.get(i), (String) this.x.get(i), false, false);
            if (!e34Var.k1.contains(document) && !e34Var.l1.contains(document)) {
                z = false;
            }
            y0bVar.setRecent(z);
            return;
        }
        Integer num = null;
        if (i2 == 1) {
            j34 j34Var = (j34) view;
            if (i != this.y) {
                j34Var.setHeight(gm.L(82.0f));
                return;
            }
            int i3 = this.w.get(i - 1, TLObject.FLAG_31);
            if (i3 == Integer.MIN_VALUE) {
                j34Var.setHeight(1);
                return;
            }
            Object obj = this.n.get(i3);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
            } else if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num == null) {
                j34Var.setHeight(1);
                return;
            } else if (num.intValue() == 0) {
                j34Var.setHeight(gm.L(8.0f));
                return;
            } else {
                int height = e34Var.h.getHeight() - (gm.L(82.0f) * ((int) Math.ceil(num.intValue() / e34Var.z0.d)));
                j34Var.setHeight(height > 0 ? height : 1);
                return;
            }
        }
        if (i2 == 2) {
            w1b w1bVar = (w1b) view;
            Object obj2 = sparseArray.get(i);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 instanceof String) {
                    w1bVar.a(0, (String) obj2);
                    w1bVar.c(0, null);
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            if (!TextUtils.isEmpty(this.O) && this.G.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    w1bVar.a(0, stickerSet.title);
                }
                w1bVar.c(this.O.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num2 = (Integer) this.H.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num2 != null) {
                w1bVar.b(stickerSet2.title, 0, null, num2.intValue(), !TextUtils.isEmpty(this.O) ? this.O.length() : 0);
            }
            w1bVar.c(0, null);
            return;
        }
        if (i2 == 3) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i);
            v94 v94Var = (v94) view;
            boolean z2 = longSparseArray2.indexOfKey(stickerSetCovered.set.id) >= 0;
            char c = longSparseArray.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
            if (z2) {
                if (v94Var.r) {
                    longSparseArray2.remove(stickerSetCovered.set.id);
                    z2 = false;
                }
                if (c != 0 && !v94Var.r) {
                    longSparseArray.remove(stickerSetCovered.set.id);
                }
            }
            v94Var.b(z2, false);
            int y1 = TextUtils.isEmpty(this.O) ? -1 : gm.y1(stickerSetCovered.set.title, this.O);
            if (y1 >= 0) {
                v94Var.c(stickerSetCovered, false, false, y1, this.O.length(), false);
                return;
            }
            v94Var.c(stickerSetCovered, false, false, 0, 0, false);
            if (TextUtils.isEmpty(this.O) || gm.y1(stickerSetCovered.set.short_name, this.O) != 0) {
                return;
            }
            v94Var.d(this.O.length(), stickerSetCovered.set.short_name);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        e34 e34Var = this.R;
        ylb ylbVar = e34Var.a2;
        boolean z = true;
        char c = 1;
        Context context = this.h;
        View view = null;
        switch (i) {
            case 0:
                view = new v24(context, z, ylbVar, c == true ? 1 : 0);
                break;
            case 1:
                view = new j34(context);
                break;
            case 2:
                view = new w1b(this.h, false, false, e34Var.a2, e34Var.j2);
                break;
            case 3:
                v94 v94Var = new v94(17, e34Var.a2, this.h, false, true);
                v94Var.setAddOnClickListener(new sf3(this, (byte) 9));
                view = v94Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new g69(-1, e34Var.c1));
                break;
            case 5:
                yd ydVar = new yd((byte) 19, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i2 = cmb.Cf;
                anb.s(imageView, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-gm.L(24.0f));
                ydVar.addView(imageView, qoe.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                td4.v(16.0f, 2131747883, 1, textView, null);
                anb.X(textView, i2, ylbVar);
                ydVar.addView(textView, qoe.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                ydVar.setLayoutParams(new g69(-1, -2));
                view = ydVar;
                break;
            case 7:
                g69 g69Var = new g69(-1, gm.L(79.0f));
                view = this.c;
                view.setLayoutParams(g69Var);
                break;
            case 8:
                view = new View(e34Var.getContext());
                view.setLayoutParams(new g69(-1, gm.L(68.0f)));
                break;
        }
        return new b59(view);
    }
}
