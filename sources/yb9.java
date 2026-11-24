// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yb9 extends mz0 {
    public static final /* synthetic */ int f2 = 0;
    public final String S1;
    public final xb9 T1;
    public final HorizontalScrollView U1;
    public final ib9 V1;
    public final ib9 W1;
    public final ib9 X1;
    public final ib9 Y1;
    public final hra Z1;
    public h72 a2;
    public final HashSet b2;
    public boolean c2;
    public vb d2;
    public boolean e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb9(final Context context, String str, final xb9 xb9Var) {
        super(2, (ylb) null, context, false);
        final byte b = 2;
        final byte b2 = 0;
        this.b2 = new HashSet();
        this.E1 = gm.L(12.0f);
        J();
        this.S1 = str;
        this.T1 = xb9Var;
        this.o1.setTitle(J0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(gm.L(11.0f), gm.L(6.0f), gm.L(11.0f), gm.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.U1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        ib9 ib9Var = new ib9(this.J0, context, false);
        this.V1 = ib9Var;
        ib9Var.setSorting(xb9Var.c.p);
        linearLayout.addView(ib9Var, qoe.t(-2, -2, 16, 0, 0, 6, 0));
        ib9Var.setOnClickListener(new r39(this, xb9Var, b));
        ib9 ib9Var2 = new ib9(this.J0, context, false);
        this.W1 = ib9Var2;
        ib9Var2.setValue(jb6.M0(2131750320, null));
        linearLayout.addView(ib9Var2, qoe.t(-2, -2, 16, 0, 0, 6, 0));
        ib9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: wb9
            public final /* synthetic */ yb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                final xb9 xb9Var2 = xb9Var;
                yb9 yb9Var = this.b;
                final byte b4 = 2;
                final byte b5 = 1;
                switch (b3) {
                    case 0:
                        qb9 qb9Var = xb9Var2.c;
                        if (!qb9Var.f.isEmpty()) {
                            final bu5 bu5Var = new bu5(yb9Var.c, yb9Var.J0, yb9Var.W1, false, true, false);
                            bu5Var.t = false;
                            bu5Var.b0 = true;
                            bu5Var.b0(0.0f, gm.L(-8.0f));
                            bu5Var.U = true;
                            bu5Var.p = new bo1(bu5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(qb9Var.f);
                            final byte b6 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b7 = b6;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b7) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i = yb9Var.a;
                            final byte b7 = 0;
                            jac jacVar = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b8 = b7;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList2 = arrayList;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr2 = strArr;
                                    switch (b8) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var2 = xb9Var3.c;
                                            boolean isEmpty = qb9Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj3 = arrayList2.get(i2);
                                                i2++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i3 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var3 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList2.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList2.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b8 = b7;
                                    int i2 = 0;
                                    bu5 bu5Var2 = bu5Var;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b8) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var2 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var2.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var2.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = qb9Var2.f;
                                                    int size = arrayList2.size();
                                                    while (i2 < size) {
                                                        Object obj3 = arrayList2.get(i2);
                                                        i2++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var2.m();
                                            bu5Var2.u();
                                            break;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i3));
                                            qb9 qb9Var3 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var3.k.remove(Integer.valueOf(i3));
                                            } else {
                                                HashSet hashSet2 = qb9Var3.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = qb9Var3.g;
                                                    int size2 = arrayList3.size();
                                                    while (i2 < size2) {
                                                        Object obj4 = arrayList3.get(i2);
                                                        i2++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i3) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i3));
                                                }
                                            }
                                            qb9Var3.m();
                                            bu5Var2.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i2 < size3) {
                                                        Object obj5 = arrayList4.get(i2);
                                                        i2++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var2.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar = yb9Var.J0;
                            Context context2 = context;
                            t34 t34Var = new t34(context2, i, 0, false, jacVar, oacVar, null, ylbVar, (byte) 5);
                            t34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var = new qu3(context2, yb9Var.J0);
                            qu3Var.setTextSize(1, 16.0f);
                            qu3Var.setInputType(573441);
                            qu3Var.setRawInputType(573441);
                            anb.D(qu3Var, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var, 30, cmb.F6, yb9Var.J0);
                            qu3Var.setCursorSize(gm.L(19.0f));
                            qu3Var.setCursorWidth(1.5f);
                            qu3Var.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var, cmb.D8, yb9Var.J0);
                            qu3Var.setBackground(null);
                            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                bu5Var.q(frameLayout, qoe.o(-1, 44));
                                bu5Var.j();
                            }
                            if (!qb9Var.j.isEmpty()) {
                                bu5Var.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 0), false);
                            }
                            bu5Var.p(t34Var);
                            bu5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        qb9 qb9Var2 = xb9Var2.c;
                        if (!qb9Var2.g.isEmpty()) {
                            final bu5 bu5Var2 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.X1, false, true, false);
                            bu5Var2.t = false;
                            bu5Var2.b0 = true;
                            bu5Var2.b0(0.0f, gm.L(-8.0f));
                            bu5Var2.U = true;
                            bu5Var2.p = new bo1(bu5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(qb9Var2.g);
                            final byte b8 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b8;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i2 = yb9Var.a;
                            jac jacVar2 = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i3 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var3 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar2 = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b5;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var2;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i3));
                                            qb9 qb9Var3 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var3.k.remove(Integer.valueOf(i3));
                                            } else {
                                                HashSet hashSet2 = qb9Var3.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = qb9Var3.g;
                                                    int size2 = arrayList3.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList3.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i3) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i3));
                                                }
                                            }
                                            qb9Var3.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar2 = yb9Var.J0;
                            Context context3 = context;
                            t34 t34Var2 = new t34(context3, i2, 0, false, jacVar2, oacVar2, null, ylbVar2, (byte) 6);
                            t34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView2, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var2 = new qu3(context3, yb9Var.J0);
                            qu3Var2.setTextSize(1, 16.0f);
                            qu3Var2.setInputType(573441);
                            qu3Var2.setRawInputType(573441);
                            anb.D(qu3Var2, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var2, 30, cmb.F6, yb9Var.J0);
                            qu3Var2.setCursorSize(gm.L(19.0f));
                            qu3Var2.setCursorWidth(1.5f);
                            qu3Var2.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var2, cmb.D8, yb9Var.J0);
                            qu3Var2.setBackground(null);
                            frameLayout2.addView(qu3Var2, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var2.addTextChangedListener(new qz(strArr2, t34Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                bu5Var2.q(frameLayout2, qoe.o(-1, 44));
                                bu5Var2.j();
                            }
                            if (!qb9Var2.k.isEmpty()) {
                                bu5Var2.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 1), false);
                            }
                            bu5Var2.p(t34Var2);
                            bu5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        qb9 qb9Var3 = xb9Var2.c;
                        if (!qb9Var3.h.isEmpty()) {
                            final bu5 bu5Var3 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.Y1, false, true, false);
                            bu5Var3.t = false;
                            bu5Var3.b0 = true;
                            bu5Var3.b0(0.0f, gm.L(-8.0f));
                            bu5Var3.U = true;
                            bu5Var3.p = new bo1(bu5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(qb9Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b5;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i3 = yb9Var.a;
                            jac jacVar3 = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b4;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar3 = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b4;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var3;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar3 = yb9Var.J0;
                            Context context4 = context;
                            t34 t34Var3 = new t34(context4, i3, 0, false, jacVar3, oacVar3, null, ylbVar3, (byte) 7);
                            t34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView3, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var3 = new qu3(context4, yb9Var.J0);
                            qu3Var3.setTextSize(1, 16.0f);
                            qu3Var3.setInputType(573441);
                            qu3Var3.setRawInputType(573441);
                            anb.D(qu3Var3, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var3, 30, cmb.F6, yb9Var.J0);
                            qu3Var3.setCursorSize(gm.L(19.0f));
                            qu3Var3.setCursorWidth(1.5f);
                            qu3Var3.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var3, cmb.D8, yb9Var.J0);
                            qu3Var3.setBackground(null);
                            frameLayout3.addView(qu3Var3, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var3.addTextChangedListener(new qz(strArr3, t34Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                bu5Var3.q(frameLayout3, qoe.o(-1, 44));
                                bu5Var3.j();
                            }
                            if (!qb9Var3.l.isEmpty()) {
                                bu5Var3.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 2), false);
                            }
                            bu5Var3.p(t34Var3);
                            bu5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        ib9 ib9Var3 = new ib9(this.J0, context, false);
        this.X1 = ib9Var3;
        ib9Var3.setValue(jb6.M0(2131750321, null));
        linearLayout.addView(ib9Var3, qoe.t(-2, -2, 16, 0, 0, 6, 0));
        final byte b3 = 1;
        ib9Var3.setOnClickListener(new View.OnClickListener(this) { // from class: wb9
            public final /* synthetic */ yb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                final xb9 xb9Var2 = xb9Var;
                yb9 yb9Var = this.b;
                final byte b4 = 2;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        qb9 qb9Var = xb9Var2.c;
                        if (!qb9Var.f.isEmpty()) {
                            final bu5 bu5Var = new bu5(yb9Var.c, yb9Var.J0, yb9Var.W1, false, true, false);
                            bu5Var.t = false;
                            bu5Var.b0 = true;
                            bu5Var.b0(0.0f, gm.L(-8.0f));
                            bu5Var.U = true;
                            bu5Var.p = new bo1(bu5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(qb9Var.f);
                            final byte b6 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b6;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i = yb9Var.a;
                            final byte b7 = 0;
                            jac jacVar = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b7;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b7;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar = yb9Var.J0;
                            Context context2 = context;
                            t34 t34Var = new t34(context2, i, 0, false, jacVar, oacVar, null, ylbVar, (byte) 5);
                            t34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var = new qu3(context2, yb9Var.J0);
                            qu3Var.setTextSize(1, 16.0f);
                            qu3Var.setInputType(573441);
                            qu3Var.setRawInputType(573441);
                            anb.D(qu3Var, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var, 30, cmb.F6, yb9Var.J0);
                            qu3Var.setCursorSize(gm.L(19.0f));
                            qu3Var.setCursorWidth(1.5f);
                            qu3Var.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var, cmb.D8, yb9Var.J0);
                            qu3Var.setBackground(null);
                            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                bu5Var.q(frameLayout, qoe.o(-1, 44));
                                bu5Var.j();
                            }
                            if (!qb9Var.j.isEmpty()) {
                                bu5Var.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 0), false);
                            }
                            bu5Var.p(t34Var);
                            bu5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        qb9 qb9Var2 = xb9Var2.c;
                        if (!qb9Var2.g.isEmpty()) {
                            final bu5 bu5Var2 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.X1, false, true, false);
                            bu5Var2.t = false;
                            bu5Var2.b0 = true;
                            bu5Var2.b0(0.0f, gm.L(-8.0f));
                            bu5Var2.U = true;
                            bu5Var2.p = new bo1(bu5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(qb9Var2.g);
                            final byte b8 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b8;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i2 = yb9Var.a;
                            jac jacVar2 = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar2 = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b5;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var2;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar2 = yb9Var.J0;
                            Context context3 = context;
                            t34 t34Var2 = new t34(context3, i2, 0, false, jacVar2, oacVar2, null, ylbVar2, (byte) 6);
                            t34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView2, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var2 = new qu3(context3, yb9Var.J0);
                            qu3Var2.setTextSize(1, 16.0f);
                            qu3Var2.setInputType(573441);
                            qu3Var2.setRawInputType(573441);
                            anb.D(qu3Var2, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var2, 30, cmb.F6, yb9Var.J0);
                            qu3Var2.setCursorSize(gm.L(19.0f));
                            qu3Var2.setCursorWidth(1.5f);
                            qu3Var2.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var2, cmb.D8, yb9Var.J0);
                            qu3Var2.setBackground(null);
                            frameLayout2.addView(qu3Var2, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var2.addTextChangedListener(new qz(strArr2, t34Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                bu5Var2.q(frameLayout2, qoe.o(-1, 44));
                                bu5Var2.j();
                            }
                            if (!qb9Var2.k.isEmpty()) {
                                bu5Var2.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 1), false);
                            }
                            bu5Var2.p(t34Var2);
                            bu5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        qb9 qb9Var3 = xb9Var2.c;
                        if (!qb9Var3.h.isEmpty()) {
                            final bu5 bu5Var3 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.Y1, false, true, false);
                            bu5Var3.t = false;
                            bu5Var3.b0 = true;
                            bu5Var3.b0(0.0f, gm.L(-8.0f));
                            bu5Var3.U = true;
                            bu5Var3.p = new bo1(bu5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(qb9Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b5;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i3 = yb9Var.a;
                            jac jacVar3 = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b4;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar3 = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b4;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var3;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar3 = yb9Var.J0;
                            Context context4 = context;
                            t34 t34Var3 = new t34(context4, i3, 0, false, jacVar3, oacVar3, null, ylbVar3, (byte) 7);
                            t34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView3, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var3 = new qu3(context4, yb9Var.J0);
                            qu3Var3.setTextSize(1, 16.0f);
                            qu3Var3.setInputType(573441);
                            qu3Var3.setRawInputType(573441);
                            anb.D(qu3Var3, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var3, 30, cmb.F6, yb9Var.J0);
                            qu3Var3.setCursorSize(gm.L(19.0f));
                            qu3Var3.setCursorWidth(1.5f);
                            qu3Var3.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var3, cmb.D8, yb9Var.J0);
                            qu3Var3.setBackground(null);
                            frameLayout3.addView(qu3Var3, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var3.addTextChangedListener(new qz(strArr3, t34Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                bu5Var3.q(frameLayout3, qoe.o(-1, 44));
                                bu5Var3.j();
                            }
                            if (!qb9Var3.l.isEmpty()) {
                                bu5Var3.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 2), false);
                            }
                            bu5Var3.p(t34Var3);
                            bu5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        ib9 ib9Var4 = new ib9(this.J0, context, false);
        this.Y1 = ib9Var4;
        ib9Var4.setValue(jb6.M0(2131750313, null));
        linearLayout.addView(ib9Var4, qoe.t(-2, -2, 16, 0, 0, 0, 0));
        ib9Var4.setOnClickListener(new View.OnClickListener(this) { // from class: wb9
            public final /* synthetic */ yb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b;
                final xb9 xb9Var2 = xb9Var;
                yb9 yb9Var = this.b;
                final byte b4 = 2;
                final byte b5 = 1;
                switch (b32) {
                    case 0:
                        qb9 qb9Var = xb9Var2.c;
                        if (!qb9Var.f.isEmpty()) {
                            final bu5 bu5Var = new bu5(yb9Var.c, yb9Var.J0, yb9Var.W1, false, true, false);
                            bu5Var.t = false;
                            bu5Var.b0 = true;
                            bu5Var.b0(0.0f, gm.L(-8.0f));
                            bu5Var.U = true;
                            bu5Var.p = new bo1(bu5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(qb9Var.f);
                            final byte b6 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b6;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i = yb9Var.a;
                            final byte b7 = 0;
                            jac jacVar = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b7;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b7;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar = yb9Var.J0;
                            Context context2 = context;
                            t34 t34Var = new t34(context2, i, 0, false, jacVar, oacVar, null, ylbVar, (byte) 5);
                            t34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var = new qu3(context2, yb9Var.J0);
                            qu3Var.setTextSize(1, 16.0f);
                            qu3Var.setInputType(573441);
                            qu3Var.setRawInputType(573441);
                            anb.D(qu3Var, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var, 30, cmb.F6, yb9Var.J0);
                            qu3Var.setCursorSize(gm.L(19.0f));
                            qu3Var.setCursorWidth(1.5f);
                            qu3Var.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var, cmb.D8, yb9Var.J0);
                            qu3Var.setBackground(null);
                            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                bu5Var.q(frameLayout, qoe.o(-1, 44));
                                bu5Var.j();
                            }
                            if (!qb9Var.j.isEmpty()) {
                                bu5Var.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 0), false);
                            }
                            bu5Var.p(t34Var);
                            bu5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        qb9 qb9Var2 = xb9Var2.c;
                        if (!qb9Var2.g.isEmpty()) {
                            final bu5 bu5Var2 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.X1, false, true, false);
                            bu5Var2.t = false;
                            bu5Var2.b0 = true;
                            bu5Var2.b0(0.0f, gm.L(-8.0f));
                            bu5Var2.U = true;
                            bu5Var2.p = new bo1(bu5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(qb9Var2.g);
                            final byte b8 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b8;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i2 = yb9Var.a;
                            jac jacVar2 = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar2 = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b5;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var2;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar2 = yb9Var.J0;
                            Context context3 = context;
                            t34 t34Var2 = new t34(context3, i2, 0, false, jacVar2, oacVar2, null, ylbVar2, (byte) 6);
                            t34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView2, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var2 = new qu3(context3, yb9Var.J0);
                            qu3Var2.setTextSize(1, 16.0f);
                            qu3Var2.setInputType(573441);
                            qu3Var2.setRawInputType(573441);
                            anb.D(qu3Var2, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var2, 30, cmb.F6, yb9Var.J0);
                            qu3Var2.setCursorSize(gm.L(19.0f));
                            qu3Var2.setCursorWidth(1.5f);
                            qu3Var2.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var2, cmb.D8, yb9Var.J0);
                            qu3Var2.setBackground(null);
                            frameLayout2.addView(qu3Var2, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var2.addTextChangedListener(new qz(strArr2, t34Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                bu5Var2.q(frameLayout2, qoe.o(-1, 44));
                                bu5Var2.j();
                            }
                            if (!qb9Var2.k.isEmpty()) {
                                bu5Var2.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 1), false);
                            }
                            bu5Var2.p(t34Var2);
                            bu5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        qb9 qb9Var3 = xb9Var2.c;
                        if (!qb9Var3.h.isEmpty()) {
                            final bu5 bu5Var3 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.Y1, false, true, false);
                            bu5Var3.t = false;
                            bu5Var3.b0 = true;
                            bu5Var3.b0(0.0f, gm.L(-8.0f));
                            bu5Var3.U = true;
                            bu5Var3.p = new bo1(bu5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(qb9Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: vb9
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b72 = b5;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b72) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 != null) {
                                                return num6.intValue() - num5.intValue();
                                            }
                                            return -1;
                                    }
                                }
                            });
                            int i3 = yb9Var.a;
                            jac jacVar3 = new jac() { // from class: rb9
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // jac
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b82 = b4;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b82) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z3 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (hg9.s(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    z4 = (isEmpty2 || contains2) ? false : true;
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || hg9.s(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                } else {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str5.concat(I33))) {
                                                        str4 = str5;
                                                        z2 = z;
                                                        str5 = str4;
                                                    }
                                                }
                                                str4 = str5;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = intValue3;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    z5 = (isEmpty3 || contains3) ? z : true;
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str5 = str4;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            oac oacVar3 = new oac() { // from class: sb9
                                @Override // oac
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b82 = b4;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var3;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    switch (b82) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (contains) {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (contains2) {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (contains3) {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            break;
                                    }
                                }
                            };
                            ylb ylbVar3 = yb9Var.J0;
                            Context context4 = context;
                            t34 t34Var3 = new t34(context4, i3, 0, false, jacVar3, oacVar3, null, ylbVar3, (byte) 7);
                            t34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            anb.s(imageView3, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var3 = new qu3(context4, yb9Var.J0);
                            qu3Var3.setTextSize(1, 16.0f);
                            qu3Var3.setInputType(573441);
                            qu3Var3.setRawInputType(573441);
                            anb.D(qu3Var3, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var3, 30, cmb.F6, yb9Var.J0);
                            qu3Var3.setCursorSize(gm.L(19.0f));
                            qu3Var3.setCursorWidth(1.5f);
                            qu3Var3.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var3, cmb.D8, yb9Var.J0);
                            qu3Var3.setBackground(null);
                            frameLayout3.addView(qu3Var3, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var3.addTextChangedListener(new qz(strArr3, t34Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                bu5Var3.q(frameLayout3, qoe.o(-1, 44));
                                bu5Var3.j();
                            }
                            if (!qb9Var3.l.isEmpty()) {
                                bu5Var3.b(R.drawable.msg_select, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 2), false);
                            }
                            bu5Var3.p(t34Var3);
                            bu5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        q55 q55Var = new q55(3);
        q55Var.O = new zr1(this, (byte) 14);
        this.n1.setLayoutManager(q55Var);
        this.n1.setOnItemClickListener(new xr8(this, xb9Var, (byte) 7));
        this.n1.setPadding(gm.L(8.0f) + this.u0, 0, gm.L(8.0f) + this.u0, 0);
        this.n1.setOnScrollListener(new so7(this, (byte) 13));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        this.n1.setItemSelectorColorProvider(new i98((byte) 19));
        hra hraVar = new hra(context);
        this.Z1 = hraVar;
        int L = gm.L(20.0f);
        int L2 = gm.L(9.0f);
        hraVar.h = L;
        hraVar.n = L2;
        hraVar.setRoundRadius(gm.L(22.0f));
        hraVar.setFullRect(true);
        gm.k2(new eg9(hraVar, (byte) 8), 12.0f, 12, new ArrayList());
        hraVar.setPivotY(0.0f);
        this.c.addView(hraVar, qoe.e(-1, -2, 55));
        this.d2.O(false);
        xb9Var.d = new ub9(this, b3);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        vb vbVar = new vb(this, r59Var, getContext(), this.a, new vh8(this, (byte) 9), this.J0, (byte) 3);
        this.d2 = vbVar;
        return vbVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        String str = this.S1;
        return str != null ? str : jb6.M0(2131749704, null);
    }

    @Override // mz0
    public final void O0(float f) {
        float y = this.b.getY() + f;
        hra hraVar = this.Z1;
        float measuredHeight = y - hraVar.getMeasuredHeight();
        float l = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + gm.L(8.0f)) / hraVar.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l = Math.min(l, Utilities.l(1.0f - ((measuredHeight - height) / gm.N(128.0f))));
        }
        hraVar.setScaleX(l);
        hraVar.setScaleY(l);
        hraVar.setAlpha(gm.x1(l, 0.5f, 1.0f));
        hraVar.setTranslationY(measuredHeight);
    }

    public final void Y0() {
        int R;
        c6c G;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            r59 r59Var = this.n1;
            if (i >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i);
            if ((childAt instanceof tk4) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.d2.G(R)) != null) {
                if (G.d < 10) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        xb9 xb9Var = this.T1;
        if (z) {
            xb9Var.b.a();
        }
        if (z2) {
            xb9Var.c.l(false);
        }
    }
}
