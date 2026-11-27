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
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z4b extends c79 {
    public int E;
    public ImageView M;
    public TextView N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public String S;
    public final vnb U;
    public final Context d;
    public final q5c e;
    public final TLRPC.StickerSetCovered[] f;
    public final LongSparseArray h;
    public final LongSparseArray n;
    public final int c = yac.t0;
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray w = new SparseArray();
    public final SparseIntArray x = new SparseIntArray();
    public final SparseArray y = new SparseArray();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final y4b T = new y4b(this);

    public z4b(Context context, q5c q5cVar, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, vnb vnbVar) {
        this.d = context;
        this.e = q5cVar;
        this.f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.n = longSparseArray2;
        this.U = vnbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r0 != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(h94 h94Var, int i, boolean z) {
        boolean z2;
        h94 h94Var2;
        boolean z3;
        int i2 = this.c;
        ls6 d0 = ls6.d0(i2);
        ArrayList arrayList = d0.v0[0];
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.s.get(i);
        boolean z4 = arrayList != null && arrayList.contains(Long.valueOf(stickerSetCovered.set.id));
        int i3 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i3 >= stickerSetCoveredArr.length) {
                z2 = false;
                break;
            }
            if (stickerSetCoveredArr[i3] != null) {
                TLRPC.TL_messages_stickerSet p0 = ls6.d0(i2).p0(stickerSetCoveredArr[i3].set.id);
                if (p0 != null && !p0.set.archived) {
                    stickerSetCoveredArr[i3] = null;
                } else if (stickerSetCoveredArr[i3].set.id == stickerSetCovered.set.id) {
                    z2 = true;
                    break;
                }
            }
            i3++;
        }
        int y1 = TextUtils.isEmpty(this.S) ? -1 : hl.y1(stickerSetCovered.set.title, this.S);
        if (y1 >= 0) {
            h94Var2 = h94Var;
            z3 = z;
            h94Var2.c(stickerSetCovered, z4, z3, y1, this.S.length(), z2);
        } else {
            h94Var2 = h94Var;
            z3 = z;
            h94Var2.c(stickerSetCovered, z4, z3, 0, 0, z2);
            if (!TextUtils.isEmpty(this.S) && hl.y1(stickerSetCovered.set.short_name, this.S) == 0) {
                h94Var2.d(this.S.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z4) {
            d0.f1(stickerSetCovered.set.id);
        }
        long j = stickerSetCovered.set.id;
        LongSparseArray longSparseArray = this.h;
        boolean z5 = longSparseArray.indexOfKey(j) >= 0;
        long j2 = stickerSetCovered.set.id;
        LongSparseArray longSparseArray2 = this.n;
        boolean z6 = longSparseArray2.indexOfKey(j2) >= 0;
        if (z5) {
            if (h94Var2.r) {
                longSparseArray.remove(stickerSetCovered.set.id);
                z5 = false;
            }
            if (z6 && !h94Var2.r) {
                longSparseArray2.remove(stickerSetCovered.set.id);
            }
        }
        h94Var2.b(!z2 && z5, z3);
        d0.q1(stickerSetCovered);
        h94Var2.setNeedDivider(i > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1 >= r2.length) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r2[r1] != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r2[r1] = r8;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r9.b(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r7.h.put(r8.set.id, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r7.e.a.g(r9.getStickerSet(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r9 = r7.L;
        r1 = r9.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r2 >= r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r3 = (org.telegram.tgnet.TLRPC.StickerSetCovered) r9.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r3.set.id != r8.set.id) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        h(r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(TLRPC.StickerSetCovered stickerSetCovered, h94 h94Var) {
        int i = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f;
            if (i >= stickerSetCoveredArr.length) {
                break;
            }
            if (stickerSetCoveredArr[i] != null) {
                TLRPC.TL_messages_stickerSet p0 = ls6.d0(this.c).p0(stickerSetCoveredArr[i].set.id);
                if (p0 != null && !p0.set.archived) {
                    stickerSetCoveredArr[i] = null;
                    break;
                } else if (stickerSetCoveredArr[i].set.id == stickerSetCovered.set.id) {
                    return;
                }
            }
            i++;
        }
    }

    @Override // j79
    public final int b() {
        return Math.max(1, this.E + 1);
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0 && this.E == 0) {
            return 5;
        }
        if (i == b() - 1) {
            return 4;
        }
        Object obj = this.s.get(i);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20, types: [org.telegram.tgnet.TLRPC$TL_messages_stickerSet, org.telegram.tgnet.TLRPC$messages_StickerSet] */
    @Override // j79
    public final void f() {
        q5c q5cVar;
        int i;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.x;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.L;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.y;
        sparseArray5.clear();
        this.E = 0;
        ArrayList arrayList5 = this.F;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.G;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.K;
        int i3 = !arrayList7.isEmpty() ? 1 : 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size + size2 + i3) {
            SparseArray sparseArray6 = this.w;
            q5c q5cVar2 = this.e;
            if (i4 < size2) {
                q5cVar = q5cVar2;
                ?? r6 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i4);
                i = size;
                arrayList3 = r6.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i2 = i3;
                stickerSetCovered = r6;
            } else {
                q5cVar = q5cVar2;
                i = size;
                int i6 = i4 - size2;
                if (i6 < i3) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i2 = i3;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size3) {
                        int i9 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i7);
                        int i10 = i7;
                        String str2 = (String) this.J.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.E + i8, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i11 = 0;
                        while (i11 < size4) {
                            String str3 = str;
                            int i12 = this.E + i8;
                            int i13 = size4;
                            int a = (i8 / q5cVar.a()) + i5;
                            int i14 = i11;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i11);
                            sparseArray3.put(i12, document);
                            ArrayList arrayList9 = arrayList7;
                            int i15 = i8;
                            TLRPC.TL_messages_stickerSet p0 = ls6.d0(this.c).p0(ls6.r0(document));
                            if (p0 != null) {
                                sparseArray6.put(i12, p0);
                            }
                            sparseIntArray.put(i12, a);
                            i8 = i15 + 1;
                            i11 = i14 + 1;
                            str = str3;
                            size4 = i13;
                            arrayList7 = arrayList9;
                        }
                        i7 = i10 + 1;
                        size3 = i9;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i8 / q5cVar.a());
                    for (int i16 = 0; i16 < ceil; i16++) {
                        sparseArray2.put(i5 + i16, Integer.valueOf(i8));
                    }
                    this.E = (q5cVar.a() * ceil) + this.E;
                    i5 += ceil;
                    arrayList4 = arrayList5;
                    i4++;
                    size = i;
                    arrayList6 = arrayList;
                    i3 = i2;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i2 = i3;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i6 - i2);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / q5cVar.a());
                sparseArray3.put(this.E, stickerSetCovered);
                if (i4 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.E, stickerSetCovered);
                }
                sparseIntArray.put(this.E, i5);
                int size5 = arrayList3.size();
                int i17 = 0;
                while (i17 < size5) {
                    int i18 = i17 + 1;
                    int i19 = ceil2;
                    int i20 = this.E + i18;
                    int a2 = i17 / q5cVar.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i20, arrayList3.get(i17));
                    sparseArray6.put(i20, stickerSetCovered);
                    sparseIntArray.put(i20, a2 + i5 + 1);
                    if (i4 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i20, stickerSetCovered);
                    }
                    i17 = i18;
                    ceil2 = i19;
                    arrayList5 = arrayList10;
                }
                int i21 = ceil2;
                arrayList4 = arrayList5;
                int i22 = i21 + 1;
                for (int i23 = 0; i23 < i22; i23++) {
                    sparseArray2.put(i5 + i23, stickerSetCovered);
                }
                this.E = (q5cVar.a() * i21) + 1 + this.E;
                i5 += i22;
                i4++;
                size = i;
                arrayList6 = arrayList;
                i3 = i2;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i4++;
            size = i;
            arrayList6 = arrayList;
            i3 = i2;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.f();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        SparseArray sparseArray = this.s;
        if (i2 == 0) {
            ((x2b) view).d((TLRPC.Document) sparseArray.get(i), null, this.w.get(i), (String) this.y.get(i), false, false);
            return;
        }
        if (i2 == 1) {
            ((t24) view).setHeight(0);
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                E((h94) view, i, false);
                return;
            }
            return;
        }
        t3b t3bVar = (t3b) view;
        Object obj = sparseArray.get(i);
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!TextUtils.isEmpty(this.S) && this.H.containsKey(tL_messages_stickerSet)) {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet != null) {
                    t3bVar.a(0, stickerSet.title);
                }
                t3bVar.c(this.S.length(), tL_messages_stickerSet.set.short_name);
                return;
            }
            Integer num = (Integer) this.I.get(tL_messages_stickerSet);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            if (stickerSet2 != null && num != null) {
                t3bVar.b(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.S) ? this.S.length() : 0);
            }
            t3bVar.c(0, null);
        }
    }

    @Override // j79
    public final void u(f89 f89Var, int i, List list) {
        if (list.contains(0) && f89Var.f == 3) {
            E((h94) f89Var.a, i, true);
        } else {
            t(f89Var, i);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        byte b = 2;
        vnb vnbVar = this.U;
        Context context = this.d;
        if (i == 0) {
            f24 f24Var = new f24(context, false, vnbVar, b);
            f24Var.getImageView().m0(3);
            view = f24Var;
        } else if (i == 1) {
            view = new t24(context);
        } else if (i == 2) {
            view = new t3b(this.d, false, true, this.U, false);
        } else if (i == 3) {
            h94 h94Var = new h94(17, this.U, this.d, true, true);
            h94Var.setAddOnClickListener(new kla(this, (byte) 12));
            view = h94Var;
        } else if (i != 4) {
            view = null;
            if (i == 5) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                ImageView imageView = new ImageView(context);
                this.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.M.setImageResource(R.drawable.stickers_empty);
                ImageView imageView2 = this.M;
                int i2 = aob.Df;
                yob.s(imageView2, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
                linearLayout.addView(this.M, tre.o(-2, -2));
                linearLayout.addView(new Space(context), tre.o(-1, 15));
                TextView textView = new TextView(context);
                this.N = textView;
                textView.setText(ob6.M0(2131747880, null));
                this.N.setTextSize(1, 16.0f);
                yob.X(this.N, i2, vnbVar);
                linearLayout.addView(this.N, tre.o(-2, -2));
                linearLayout.setMinimumHeight(hl.L(112.0f));
                linearLayout.setLayoutParams(tre.c(-1.0f, -1));
                view = linearLayout;
            }
        } else {
            view = new View(context);
        }
        return new n69(view);
    }
}
