// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w24 extends q59 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final HashMap f = new HashMap();
    public final SparseArray h = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseIntArray r = new SparseIntArray();
    public int s;
    public final /* synthetic */ e34 w;

    public w24(e34 e34Var, Context context) {
        this.w = e34Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.a instanceof r59;
    }

    public final int E(Object obj) {
        Integer num = (Integer) this.f.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int F(int i) {
        int indexOf;
        int i2;
        e34 e34Var = this.w;
        ArrayList arrayList = e34Var.e1;
        Object obj = this.h.get(i);
        if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
            int i3 = e34Var.H1;
            if (i3 >= 0) {
                return i3;
            }
            int i4 = e34Var.G1;
            if (i4 >= 0) {
                return i4;
            }
            return 0;
        }
        if (i == 0) {
            i = 1;
        }
        if (this.d == 0) {
            int measuredWidth = e34Var.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gm.q.x;
            }
            this.d = measuredWidth / gm.L(72.0f);
        }
        int i5 = this.r.get(i, TLObject.FLAG_31);
        if (i5 == Integer.MIN_VALUE) {
            indexOf = arrayList.size() - 1;
            i2 = e34Var.F1;
        } else {
            Object obj2 = this.e.get(i5);
            if (obj2 instanceof String) {
                return "premium".equals(obj2) ? e34Var.J1 : "recent".equals(obj2) ? e34Var.G1 : e34Var.H1;
            }
            indexOf = arrayList.indexOf((TLRPC.TL_messages_stickerSet) obj2);
            i2 = e34Var.F1;
        }
        return indexOf + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        int i;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        Object obj;
        int i2;
        e34 e34Var;
        HashMap hashMap;
        int i3;
        e34 e34Var2 = this.w;
        int i4 = e34Var2.d1;
        if (e34Var2.T2) {
            return;
        }
        int measuredWidth = e34Var2.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = gm.q.x;
        }
        int L = measuredWidth / gm.L(72.0f);
        this.d = L;
        e34Var2.F0.x1(L);
        SparseArray sparseArray = this.e;
        sparseArray.clear();
        HashMap hashMap2 = this.f;
        hashMap2.clear();
        SparseIntArray sparseIntArray = this.r;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.h;
        sparseArray2.clear();
        int i5 = 0;
        this.s = 0;
        ArrayList arrayList2 = e34Var2.e1;
        int i6 = -5;
        int i7 = 0;
        boolean z = false;
        int i8 = -5;
        while (i8 < arrayList2.size()) {
            if (i8 == i6) {
                int i9 = this.s;
                this.s = i9 + 1;
                sparseArray2.put(i9, "search");
                i7++;
                e34Var = e34Var2;
                i2 = i4;
                hashMap = hashMap2;
                i = i8;
            } else {
                if (i8 == -4) {
                    hs6 d0 = hs6.d0(i4);
                    SharedPreferences sharedPreferences = oc7.r1(i4).Y3;
                    ArrayList arrayList3 = d0.t0[i5];
                    if (e34Var2.n1.isEmpty()) {
                        i = i8;
                    } else {
                        int i10 = i8;
                        if (sharedPreferences.getLong("featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList3.get(i5)).set.id) {
                            int i11 = this.s;
                            this.s = i11 + 1;
                            sparseArray2.put(i11, "trend1");
                            int i12 = this.s;
                            this.s = i12 + 1;
                            sparseArray2.put(i12, "trend2");
                            i7 += 2;
                            e34Var = e34Var2;
                            i2 = i4;
                            hashMap = hashMap2;
                            i = i10;
                        } else {
                            i = i10;
                        }
                    }
                    e34Var = e34Var2;
                    i2 = i4;
                } else {
                    i = i8;
                    if (i == -3) {
                        arrayList = e34Var2.l1;
                        hashMap2.put("fav", Integer.valueOf(this.s));
                        obj = "fav";
                    } else if (i == -2) {
                        arrayList = e34Var2.k1;
                        if (!arrayList.isEmpty() && !e34Var2.S2) {
                            z = true;
                        }
                        hashMap2.put("recent", Integer.valueOf(this.s));
                        obj = "recent";
                    } else {
                        if (i != -1) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i);
                            ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet2.documents;
                            if (!z && !e34Var2.S2) {
                                ArrayList<TLRPC.Document> arrayList5 = new ArrayList<>(arrayList4);
                                arrayList5.add(0, new TLRPC.TL_documentEmpty());
                                arrayList4 = arrayList5;
                                z = true;
                            }
                            hashMap2.put(tL_messages_stickerSet2, Integer.valueOf(this.s));
                            ArrayList<TLRPC.Document> arrayList6 = arrayList4;
                            tL_messages_stickerSet = tL_messages_stickerSet2;
                            arrayList = arrayList6;
                            obj = null;
                            i2 = i4;
                            if (i == e34Var2.f1) {
                                e34Var2.g1 = this.s;
                                if (arrayList.isEmpty()) {
                                    sparseArray.put(i7, tL_messages_stickerSet);
                                    int i13 = i7 + 1;
                                    sparseIntArray.put(this.s, i7);
                                    sparseArray.put(i13, tL_messages_stickerSet);
                                    i7 += 2;
                                    sparseIntArray.put(this.s + 1, i13);
                                    int i14 = this.s;
                                    this.s = i14 + 1;
                                    sparseArray2.put(i14, tL_messages_stickerSet);
                                    int i15 = this.s;
                                    this.s = i15 + 1;
                                    sparseArray2.put(i15, "group");
                                    e34Var = e34Var2;
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                e34Var = e34Var2;
                                int ceil = (int) Math.ceil(arrayList.size() / this.d);
                                int i16 = this.s;
                                if (tL_messages_stickerSet != null) {
                                    sparseArray2.put(i16, tL_messages_stickerSet);
                                } else {
                                    sparseArray2.put(i16, arrayList);
                                }
                                sparseIntArray.put(this.s, i7);
                                int i17 = 0;
                                while (i17 < arrayList.size()) {
                                    int i18 = i17 + 1;
                                    int i19 = i18 + this.s;
                                    HashMap hashMap3 = hashMap2;
                                    sparseArray2.put(i19, arrayList.get(i17));
                                    SparseArray sparseArray3 = this.n;
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray3.put(i19, tL_messages_stickerSet);
                                    } else {
                                        sparseArray3.put(i19, obj);
                                    }
                                    sparseIntArray.put(i18 + this.s, (i17 / this.d) + i7 + 1);
                                    i17 = i18;
                                    hashMap2 = hashMap3;
                                }
                                hashMap = hashMap2;
                                int i20 = 0;
                                while (true) {
                                    i3 = ceil + 1;
                                    if (i20 >= i3) {
                                        break;
                                    }
                                    if (tL_messages_stickerSet != null) {
                                        sparseArray.put(i7 + i20, tL_messages_stickerSet);
                                    } else if (i == -1) {
                                        sparseArray.put(i7 + i20, "premium");
                                    } else {
                                        int i21 = i7 + i20;
                                        if (i == -2) {
                                            sparseArray.put(i21, "recent");
                                        } else {
                                            sparseArray.put(i21, "fav");
                                        }
                                    }
                                    i20++;
                                }
                                this.s = (this.d * ceil) + 1 + this.s;
                                i7 += i3;
                            }
                            e34Var = e34Var2;
                        }
                        e34Var = e34Var2;
                        i2 = i4;
                    }
                    tL_messages_stickerSet = null;
                    i2 = i4;
                    if (i == e34Var2.f1) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    e34Var = e34Var2;
                }
                hashMap = hashMap2;
            }
            i8 = i + 1;
            i4 = i2;
            e34Var2 = e34Var;
            hashMap2 = hashMap;
            i5 = 0;
            i6 = -5;
        }
    }

    @Override // y59
    public final int b() {
        int i = this.s;
        if (i != 0) {
            return i + 1;
        }
        return 0;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 4;
        }
        Object obj = this.h.get(i);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return obj instanceof TLRPC.TL_documentEmpty ? 7 : 0;
        }
        if (!(obj instanceof String)) {
            return 2;
        }
        if ("trend1".equals(obj)) {
            return 5;
        }
        return "trend2".equals(obj) ? 6 : 3;
    }

    @Override // y59
    public final void f() {
        G();
        super.f();
    }

    @Override // y59
    public final void q(int i, int i2) {
        G();
        super.q(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final void t(u69 u69Var, int i) {
        e34 e34Var = this.w;
        int i2 = e34Var.d1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        SparseArray sparseArray = this.h;
        if (i3 == 0) {
            TLRPC.Document document = (TLRPC.Document) sparseArray.get(i);
            y0b y0bVar = (y0b) view;
            y0bVar.d(document, null, this.n.get(i), null, false, false);
            y0bVar.setRecent(e34Var.k1.contains(document));
            return;
        }
        ArrayList<TLRPC.Document> arrayList = null;
        if (i3 == 1) {
            j34 j34Var = (j34) view;
            if (i != this.s) {
                j34Var.setHeight(gm.L(82.0f));
                return;
            }
            int i4 = this.r.get(i - 1, TLObject.FLAG_31);
            if (i4 == Integer.MIN_VALUE) {
                j34Var.setHeight(1);
                return;
            }
            Object obj = this.e.get(i4);
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
            } else if (obj instanceof String) {
                arrayList = "recent".equals(obj) ? e34Var.k1 : e34Var.l1;
            }
            if (arrayList == null) {
                j34Var.setHeight(1);
                return;
            } else if (arrayList.isEmpty()) {
                j34Var.setHeight(gm.L(8.0f));
                return;
            } else {
                int height = e34Var.h.getHeight() - (gm.L(82.0f) * ((int) Math.ceil(arrayList.size() / this.d)));
                j34Var.setHeight(height > 0 ? height : (byte) 1);
                return;
            }
        }
        final byte b = 0;
        if (i3 != 2) {
            if (i3 == 3) {
                ((t1b) view).setIsLast(i == this.s - 1);
                return;
            } else {
                if (i3 == 5) {
                    ((w1b) view).b(jb6.M0(hs6.d0(i2).s0 ? 2131750769 : 2131750770, null), R.drawable.msg_close, jb6.M0(2131754898, null), 0, 0);
                    return;
                }
                return;
            }
        }
        w1b w1bVar = (w1b) view;
        w1bVar.setHeaderOnClick(null);
        if (i == e34Var.g1) {
            int i5 = (e34Var.h1 && e34Var.i1 == null) ? 0 : e34Var.i1 != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
            TLRPC.Chat L0 = e34Var.K1 != null ? oc7.r1(i2).L0(Long.valueOf(e34Var.K1.id)) : null;
            w1bVar.a(i5, jb6.a0("CurrentGroupStickers", null, 2131751631, L0 != null ? L0.title : "Group Stickers"));
            return;
        }
        Object obj2 = sparseArray.get(i);
        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                w1bVar.a(0, stickerSet.title);
                if (tL_messages_stickerSet.set.creator && !e34Var.S2) {
                    w1bVar.setEdit(new View.OnClickListener(this) { // from class: u24
                        public final /* synthetic */ w24 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b2 = b;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                            w24 w24Var = this.b;
                            switch (b2) {
                                case 0:
                                    w24Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                    break;
                                default:
                                    w24Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                    break;
                            }
                        }
                    });
                }
                w1bVar.setHeaderOnClick(new View.OnClickListener(this) { // from class: u24
                    public final /* synthetic */ w24 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b2 = r3;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        w24 w24Var = this.b;
                        switch (b2) {
                            case 0:
                                w24Var.w.u1.d(tL_messages_stickerSet2.set, null, true);
                                break;
                            default:
                                w24Var.w.u1.d(tL_messages_stickerSet2.set, null, false);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (obj2 == e34Var.k1) {
            w1bVar.b(jb6.M0(2131746097, null), R.drawable.msg_close, jb6.M0(2131752000, null), 0, 0);
        } else if (obj2 == e34Var.l1) {
            w1bVar.a(0, jb6.M0(2131750778, null));
        } else if (obj2 == e34Var.m1) {
            w1bVar.a(0, jb6.M0(2131746682, null));
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        e34 e34Var = this.w;
        ylb ylbVar = e34Var.a2;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = true;
        Context context = this.c;
        View view = null;
        switch (i) {
            case 0:
                view = new v24(context, z ? 1 : 0, ylbVar, b);
                break;
            case 1:
                view = new j34(context);
                break;
            case 2:
                w1b w1bVar = new w1b(this.c, false, false, e34Var.a2, e34Var.j2);
                w1bVar.setOnIconClickListener(new tf3(this, w1bVar, (byte) 9));
                view = w1bVar;
                break;
            case 3:
                t1b t1bVar = new t1b(context);
                t1bVar.setOrientation(1);
                TextView textView = new TextView(context);
                anb.X(textView, cmb.Nf, null);
                ts2.q(14.0f, 1, 2131749153, textView, null);
                t1bVar.addView(textView, qoe.t(-1, -2, 51, 17, 4, 17, 0));
                TextView textView2 = new TextView(context);
                t1bVar.a = textView2;
                textView2.setPadding(gm.L(17.0f), 0, gm.L(17.0f), 0);
                textView2.setGravity(17);
                td4.x(textView2, cmb.Ii, null, 1, 14.0f);
                textView2.setBackground(ulb.f(cmb.Ei, 4.0f));
                textView2.setText(jb6.M0(2131752053, null).toUpperCase());
                t1bVar.addView(textView2, qoe.t(-2, 28, 51, 17, 10, 14, 8));
                t1bVar.setAddOnClickListener(new View.OnClickListener(this) { // from class: t24
                    public final /* synthetic */ w24 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b;
                        w24 w24Var = this.b;
                        switch (b3) {
                            case 0:
                                e34 e34Var2 = w24Var.w;
                                f24 f24Var = e34Var2.u1;
                                if (f24Var != null) {
                                    f24Var.y(e34Var2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                e34 e34Var3 = w24Var.w;
                                int i2 = e34Var3.d1;
                                ArrayList arrayList = hs6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    oc7.r1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    w24 w24Var2 = e34Var3.z0;
                                    if (w24Var2 != null) {
                                        w24Var2.q(1, 2);
                                    }
                                    e34Var3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                d dVar = w24Var.w.Z1;
                                if (dVar instanceof yv1) {
                                    ((yv1) dVar).na();
                                    break;
                                }
                                break;
                        }
                    }
                });
                t1bVar.setLayoutParams(new g69(-1, -2));
                view = t1bVar;
                break;
            case 4:
                View view2 = new View(context);
                view2.setLayoutParams(new g69(-1, e34Var.c1));
                view = view2;
                break;
            case 5:
                w1b w1bVar2 = new w1b(this.c, false, false, e34Var.a2, e34Var.j2);
                w1bVar2.setOnIconClickListener(new View.OnClickListener(this) { // from class: t24
                    public final /* synthetic */ w24 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        byte b3 = b2;
                        w24 w24Var = this.b;
                        switch (b3) {
                            case 0:
                                e34 e34Var2 = w24Var.w;
                                f24 f24Var = e34Var2.u1;
                                if (f24Var != null) {
                                    f24Var.y(e34Var2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                e34 e34Var3 = w24Var.w;
                                int i2 = e34Var3.d1;
                                ArrayList arrayList = hs6.d0(i2).t0[0];
                                if (!arrayList.isEmpty()) {
                                    oc7.r1(i2).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    w24 w24Var2 = e34Var3.z0;
                                    if (w24Var2 != null) {
                                        w24Var2.q(1, 2);
                                    }
                                    e34Var3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                d dVar = w24Var.w.Z1;
                                if (dVar instanceof yv1) {
                                    ((yv1) dVar).na();
                                    break;
                                }
                                break;
                        }
                    }
                });
                view = w1bVar2;
                break;
            case 6:
                c34 c34Var = new c34(e34Var, false);
                e34Var.G0 = c34Var;
                fv fvVar = new fv(e34Var, context, c34Var);
                fvVar.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
                fvVar.setClipToPadding(false);
                fvVar.i(new as1((byte) 3));
                fvVar.setOnItemClickListener(new u(this, (byte) 26));
                fvVar.setLayoutParams(new g69(-1, gm.L(52.0f)));
                view = fvVar;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int L = gm.L(13.0f);
                int i2 = cmb.Df;
                ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.12f, e34Var.x(i2)));
                wmb K = anb.K(0.12f, i2);
                linearLayout.setBackground(b0);
                anb.j(linearLayout, b0, K, null, ylbVar);
                rve.b(linearLayout, 0.1f, 1.5f);
                final byte b3 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: t24
                    public final /* synthetic */ w24 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        byte b32 = b3;
                        w24 w24Var = this.b;
                        switch (b32) {
                            case 0:
                                e34 e34Var2 = w24Var.w;
                                f24 f24Var = e34Var2.u1;
                                if (f24Var != null) {
                                    f24Var.y(e34Var2.K1.id);
                                    break;
                                }
                                break;
                            case 1:
                                e34 e34Var3 = w24Var.w;
                                int i22 = e34Var3.d1;
                                ArrayList arrayList = hs6.d0(i22).t0[0];
                                if (!arrayList.isEmpty()) {
                                    oc7.r1(i22).Y3.edit().putLong("featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                                    w24 w24Var2 = e34Var3.z0;
                                    if (w24Var2 != null) {
                                        w24Var2.q(1, 2);
                                    }
                                    e34Var3.Y(false);
                                    break;
                                }
                                break;
                            default:
                                d dVar = w24Var.w.Z1;
                                if (dVar instanceof yv1) {
                                    ((yv1) dVar).na();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.menu_sticker_add);
                anb.s(imageView, i2, ylbVar, PorterDuff.Mode.SRC_IN);
                linearLayout.addView(imageView, qoe.t(24, 24, 17, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setGravity(17);
                td4.x(textView3, i2, ylbVar, 1, 11.0f);
                textView3.setText(jb6.M0(2131751690, null));
                linearLayout.addView(textView3, qoe.t(-1, -2, 17, 0, 3, 0, 0));
                frameLayout.addView(linearLayout, qoe.d(-1, -1.0f, nm7.D1, 8.0f, 8.0f, 8.0f, 8.0f));
                view = frameLayout;
                break;
        }
        return new b59(view);
    }
}
