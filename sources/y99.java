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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y99 extends fy0 {
    public static final /* synthetic */ int f2 = 0;
    public final String S1;
    public final x99 T1;
    public final HorizontalScrollView U1;
    public final i99 V1;
    public final i99 W1;
    public final i99 X1;
    public final i99 Y1;
    public final hpa Z1;
    public w52 a2;
    public final HashSet b2;
    public boolean c2;
    public vb d2;
    public boolean e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y99(final Context context, String str, final x99 x99Var) {
        super(2, (wjb) null, context, false);
        final byte b = 2;
        final byte b2 = 0;
        this.b2 = new HashSet();
        this.E1 = gl.L(12.0f);
        K();
        this.S1 = str;
        this.T1 = x99Var;
        this.o1.setTitle(J0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(gl.L(11.0f), gl.L(6.0f), gl.L(11.0f), gl.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.U1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        i99 i99Var = new i99(this.J0, context, false);
        this.V1 = i99Var;
        i99Var.setSorting(x99Var.c.p);
        linearLayout.addView(i99Var, nme.t(-2, -2, 16, 0, 0, 6, 0));
        final byte b3 = 1;
        i99Var.setOnClickListener(new b99(this, x99Var, b3));
        i99 i99Var2 = new i99(this.J0, context, false);
        this.W1 = i99Var2;
        i99Var2.setValue(k96.M0(2131750371, null));
        linearLayout.addView(i99Var2, nme.t(-2, -2, 16, 0, 0, 6, 0));
        i99Var2.setOnClickListener(new View.OnClickListener(this) { // from class: w99
            public final /* synthetic */ y99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                final x99 x99Var2 = x99Var;
                y99 y99Var = this.b;
                final byte b5 = 2;
                final byte b6 = 1;
                switch (b4) {
                    case 0:
                        q99 q99Var = x99Var2.c;
                        if (!q99Var.f.isEmpty()) {
                            final cs5 cs5Var = new cs5(y99Var.c, y99Var.J0, y99Var.W1, false, true, false);
                            cs5Var.t = false;
                            cs5Var.b0 = true;
                            cs5Var.b0(0.0f, gl.L(-8.0f));
                            cs5Var.U = true;
                            cs5Var.p = new en1(cs5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(q99Var.f);
                            final byte b7 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b8 = b7;
                                    x99 x99Var3 = x99Var2;
                                    switch (b8) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i = y99Var.a;
                            final byte b8 = 0;
                            i8c i8cVar = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b9 = b8;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList2 = arrayList;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr2 = strArr;
                                    switch (b9) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var2 = x99Var3.c;
                                            boolean isEmpty = q99Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj3 = arrayList2.get(i2);
                                                i2++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i3 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList3.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var3 = x99Var3.c;
                                            boolean isEmpty2 = q99Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList2.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList2.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b9 = b8;
                                    int i2 = 0;
                                    cs5 cs5Var2 = cs5Var;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b9) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var2 = x99Var3.c;
                                            if (contains) {
                                                q99Var2.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var2.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = q99Var2.f;
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
                                            q99Var2.m();
                                            cs5Var2.u();
                                            break;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i3));
                                            q99 q99Var3 = x99Var3.c;
                                            if (contains2) {
                                                q99Var3.k.remove(Integer.valueOf(i3));
                                            } else {
                                                HashSet hashSet2 = q99Var3.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = q99Var3.g;
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
                                            q99Var3.m();
                                            cs5Var2.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var2.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar = y99Var.J0;
                            Context context2 = context;
                            i24 i24Var = new i24(context2, i, 0, false, i8cVar, n8cVar, null, wjbVar, (byte) 5);
                            i24Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var = new gt3(context2, y99Var.J0);
                            gt3Var.setTextSize(1, 16.0f);
                            gt3Var.setInputType(573441);
                            gt3Var.setRawInputType(573441);
                            zkb.D(gt3Var, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var, 30, bkb.F6, y99Var.J0);
                            gt3Var.setCursorSize(gl.L(19.0f));
                            gt3Var.setCursorWidth(1.5f);
                            gt3Var.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var, bkb.D8, y99Var.J0);
                            gt3Var.setBackground(null);
                            frameLayout.addView(gt3Var, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var.addTextChangedListener(new qy(strArr, i24Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                cs5Var.q(frameLayout, nme.o(-1, 44));
                                cs5Var.j();
                            }
                            if (!q99Var.j.isEmpty()) {
                                cs5Var.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 0), false);
                            }
                            cs5Var.p(i24Var);
                            cs5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        q99 q99Var2 = x99Var2.c;
                        if (!q99Var2.g.isEmpty()) {
                            final cs5 cs5Var2 = new cs5(y99Var.c, y99Var.J0, y99Var.X1, false, true, false);
                            cs5Var2.t = false;
                            cs5Var2.b0 = true;
                            cs5Var2.b0(0.0f, gl.L(-8.0f));
                            cs5Var2.U = true;
                            cs5Var2.p = new en1(cs5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(q99Var2.g);
                            final byte b9 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b9;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i2 = y99Var.a;
                            i8c i8cVar2 = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b6;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i3 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList3.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var3 = x99Var3.c;
                                            boolean isEmpty2 = q99Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar2 = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b6;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var2;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i3));
                                            q99 q99Var3 = x99Var3.c;
                                            if (contains2) {
                                                q99Var3.k.remove(Integer.valueOf(i3));
                                            } else {
                                                HashSet hashSet2 = q99Var3.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = q99Var3.g;
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
                                            q99Var3.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar2 = y99Var.J0;
                            Context context3 = context;
                            i24 i24Var2 = new i24(context3, i2, 0, false, i8cVar2, n8cVar2, null, wjbVar2, (byte) 6);
                            i24Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView2, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var2 = new gt3(context3, y99Var.J0);
                            gt3Var2.setTextSize(1, 16.0f);
                            gt3Var2.setInputType(573441);
                            gt3Var2.setRawInputType(573441);
                            zkb.D(gt3Var2, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var2, 30, bkb.F6, y99Var.J0);
                            gt3Var2.setCursorSize(gl.L(19.0f));
                            gt3Var2.setCursorWidth(1.5f);
                            gt3Var2.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var2, bkb.D8, y99Var.J0);
                            gt3Var2.setBackground(null);
                            frameLayout2.addView(gt3Var2, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var2.addTextChangedListener(new qy(strArr2, i24Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                cs5Var2.q(frameLayout2, nme.o(-1, 44));
                                cs5Var2.j();
                            }
                            if (!q99Var2.k.isEmpty()) {
                                cs5Var2.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 1), false);
                            }
                            cs5Var2.p(i24Var2);
                            cs5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        q99 q99Var3 = x99Var2.c;
                        if (!q99Var3.h.isEmpty()) {
                            final cs5 cs5Var3 = new cs5(y99Var.c, y99Var.J0, y99Var.Y1, false, true, false);
                            cs5Var3.t = false;
                            cs5Var3.b0 = true;
                            cs5Var3.b0(0.0f, gl.L(-8.0f));
                            cs5Var3.U = true;
                            cs5Var3.p = new en1(cs5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(q99Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b6;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i3 = y99Var.a;
                            i8c i8cVar3 = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar3 = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b5;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var3;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar3 = y99Var.J0;
                            Context context4 = context;
                            i24 i24Var3 = new i24(context4, i3, 0, false, i8cVar3, n8cVar3, null, wjbVar3, (byte) 7);
                            i24Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView3, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var3 = new gt3(context4, y99Var.J0);
                            gt3Var3.setTextSize(1, 16.0f);
                            gt3Var3.setInputType(573441);
                            gt3Var3.setRawInputType(573441);
                            zkb.D(gt3Var3, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var3, 30, bkb.F6, y99Var.J0);
                            gt3Var3.setCursorSize(gl.L(19.0f));
                            gt3Var3.setCursorWidth(1.5f);
                            gt3Var3.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var3, bkb.D8, y99Var.J0);
                            gt3Var3.setBackground(null);
                            frameLayout3.addView(gt3Var3, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var3.addTextChangedListener(new qy(strArr3, i24Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                cs5Var3.q(frameLayout3, nme.o(-1, 44));
                                cs5Var3.j();
                            }
                            if (!q99Var3.l.isEmpty()) {
                                cs5Var3.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 2), false);
                            }
                            cs5Var3.p(i24Var3);
                            cs5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        i99 i99Var3 = new i99(this.J0, context, false);
        this.X1 = i99Var3;
        i99Var3.setValue(k96.M0(2131750372, null));
        linearLayout.addView(i99Var3, nme.t(-2, -2, 16, 0, 0, 6, 0));
        i99Var3.setOnClickListener(new View.OnClickListener(this) { // from class: w99
            public final /* synthetic */ y99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                final x99 x99Var2 = x99Var;
                y99 y99Var = this.b;
                final byte b5 = 2;
                final byte b6 = 1;
                switch (b4) {
                    case 0:
                        q99 q99Var = x99Var2.c;
                        if (!q99Var.f.isEmpty()) {
                            final cs5 cs5Var = new cs5(y99Var.c, y99Var.J0, y99Var.W1, false, true, false);
                            cs5Var.t = false;
                            cs5Var.b0 = true;
                            cs5Var.b0(0.0f, gl.L(-8.0f));
                            cs5Var.U = true;
                            cs5Var.p = new en1(cs5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(q99Var.f);
                            final byte b7 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b7;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i = y99Var.a;
                            final byte b8 = 0;
                            i8c i8cVar = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b8;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b8;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar = y99Var.J0;
                            Context context2 = context;
                            i24 i24Var = new i24(context2, i, 0, false, i8cVar, n8cVar, null, wjbVar, (byte) 5);
                            i24Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var = new gt3(context2, y99Var.J0);
                            gt3Var.setTextSize(1, 16.0f);
                            gt3Var.setInputType(573441);
                            gt3Var.setRawInputType(573441);
                            zkb.D(gt3Var, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var, 30, bkb.F6, y99Var.J0);
                            gt3Var.setCursorSize(gl.L(19.0f));
                            gt3Var.setCursorWidth(1.5f);
                            gt3Var.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var, bkb.D8, y99Var.J0);
                            gt3Var.setBackground(null);
                            frameLayout.addView(gt3Var, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var.addTextChangedListener(new qy(strArr, i24Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                cs5Var.q(frameLayout, nme.o(-1, 44));
                                cs5Var.j();
                            }
                            if (!q99Var.j.isEmpty()) {
                                cs5Var.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 0), false);
                            }
                            cs5Var.p(i24Var);
                            cs5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        q99 q99Var2 = x99Var2.c;
                        if (!q99Var2.g.isEmpty()) {
                            final cs5 cs5Var2 = new cs5(y99Var.c, y99Var.J0, y99Var.X1, false, true, false);
                            cs5Var2.t = false;
                            cs5Var2.b0 = true;
                            cs5Var2.b0(0.0f, gl.L(-8.0f));
                            cs5Var2.U = true;
                            cs5Var2.p = new en1(cs5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(q99Var2.g);
                            final byte b9 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b9;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i2 = y99Var.a;
                            i8c i8cVar2 = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b6;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar2 = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b6;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var2;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar2 = y99Var.J0;
                            Context context3 = context;
                            i24 i24Var2 = new i24(context3, i2, 0, false, i8cVar2, n8cVar2, null, wjbVar2, (byte) 6);
                            i24Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView2, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var2 = new gt3(context3, y99Var.J0);
                            gt3Var2.setTextSize(1, 16.0f);
                            gt3Var2.setInputType(573441);
                            gt3Var2.setRawInputType(573441);
                            zkb.D(gt3Var2, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var2, 30, bkb.F6, y99Var.J0);
                            gt3Var2.setCursorSize(gl.L(19.0f));
                            gt3Var2.setCursorWidth(1.5f);
                            gt3Var2.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var2, bkb.D8, y99Var.J0);
                            gt3Var2.setBackground(null);
                            frameLayout2.addView(gt3Var2, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var2.addTextChangedListener(new qy(strArr2, i24Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                cs5Var2.q(frameLayout2, nme.o(-1, 44));
                                cs5Var2.j();
                            }
                            if (!q99Var2.k.isEmpty()) {
                                cs5Var2.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 1), false);
                            }
                            cs5Var2.p(i24Var2);
                            cs5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        q99 q99Var3 = x99Var2.c;
                        if (!q99Var3.h.isEmpty()) {
                            final cs5 cs5Var3 = new cs5(y99Var.c, y99Var.J0, y99Var.Y1, false, true, false);
                            cs5Var3.t = false;
                            cs5Var3.b0 = true;
                            cs5Var3.b0(0.0f, gl.L(-8.0f));
                            cs5Var3.U = true;
                            cs5Var3.p = new en1(cs5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(q99Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b6;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i3 = y99Var.a;
                            i8c i8cVar3 = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar3 = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b5;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var3;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar3 = y99Var.J0;
                            Context context4 = context;
                            i24 i24Var3 = new i24(context4, i3, 0, false, i8cVar3, n8cVar3, null, wjbVar3, (byte) 7);
                            i24Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView3, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var3 = new gt3(context4, y99Var.J0);
                            gt3Var3.setTextSize(1, 16.0f);
                            gt3Var3.setInputType(573441);
                            gt3Var3.setRawInputType(573441);
                            zkb.D(gt3Var3, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var3, 30, bkb.F6, y99Var.J0);
                            gt3Var3.setCursorSize(gl.L(19.0f));
                            gt3Var3.setCursorWidth(1.5f);
                            gt3Var3.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var3, bkb.D8, y99Var.J0);
                            gt3Var3.setBackground(null);
                            frameLayout3.addView(gt3Var3, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var3.addTextChangedListener(new qy(strArr3, i24Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                cs5Var3.q(frameLayout3, nme.o(-1, 44));
                                cs5Var3.j();
                            }
                            if (!q99Var3.l.isEmpty()) {
                                cs5Var3.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 2), false);
                            }
                            cs5Var3.p(i24Var3);
                            cs5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        i99 i99Var4 = new i99(this.J0, context, false);
        this.Y1 = i99Var4;
        i99Var4.setValue(k96.M0(2131750364, null));
        linearLayout.addView(i99Var4, nme.t(-2, -2, 16, 0, 0, 0, 0));
        i99Var4.setOnClickListener(new View.OnClickListener(this) { // from class: w99
            public final /* synthetic */ y99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                final x99 x99Var2 = x99Var;
                y99 y99Var = this.b;
                final byte b5 = 2;
                final byte b6 = 1;
                switch (b4) {
                    case 0:
                        q99 q99Var = x99Var2.c;
                        if (!q99Var.f.isEmpty()) {
                            final cs5 cs5Var = new cs5(y99Var.c, y99Var.J0, y99Var.W1, false, true, false);
                            cs5Var.t = false;
                            cs5Var.b0 = true;
                            cs5Var.b0(0.0f, gl.L(-8.0f));
                            cs5Var.U = true;
                            cs5Var.p = new en1(cs5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(q99Var.f);
                            final byte b7 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b7;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i = y99Var.a;
                            final byte b8 = 0;
                            i8c i8cVar = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b8;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b8;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar = y99Var.J0;
                            Context context2 = context;
                            i24 i24Var = new i24(context2, i, 0, false, i8cVar, n8cVar, null, wjbVar, (byte) 5);
                            i24Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var = new gt3(context2, y99Var.J0);
                            gt3Var.setTextSize(1, 16.0f);
                            gt3Var.setInputType(573441);
                            gt3Var.setRawInputType(573441);
                            zkb.D(gt3Var, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var, 30, bkb.F6, y99Var.J0);
                            gt3Var.setCursorSize(gl.L(19.0f));
                            gt3Var.setCursorWidth(1.5f);
                            gt3Var.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var, bkb.D8, y99Var.J0);
                            gt3Var.setBackground(null);
                            frameLayout.addView(gt3Var, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var.addTextChangedListener(new qy(strArr, i24Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                cs5Var.q(frameLayout, nme.o(-1, 44));
                                cs5Var.j();
                            }
                            if (!q99Var.j.isEmpty()) {
                                cs5Var.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 0), false);
                            }
                            cs5Var.p(i24Var);
                            cs5Var.a0();
                            break;
                        }
                        break;
                    case 1:
                        q99 q99Var2 = x99Var2.c;
                        if (!q99Var2.g.isEmpty()) {
                            final cs5 cs5Var2 = new cs5(y99Var.c, y99Var.J0, y99Var.X1, false, true, false);
                            cs5Var2.t = false;
                            cs5Var2.b0 = true;
                            cs5Var2.b0(0.0f, gl.L(-8.0f));
                            cs5Var2.U = true;
                            cs5Var2.p = new en1(cs5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(q99Var2.g);
                            final byte b9 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b9;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i2 = y99Var.a;
                            i8c i8cVar2 = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b6;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar2 = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b6;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var2;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar2 = y99Var.J0;
                            Context context3 = context;
                            i24 i24Var2 = new i24(context3, i2, 0, false, i8cVar2, n8cVar2, null, wjbVar2, (byte) 6);
                            i24Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView2, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var2 = new gt3(context3, y99Var.J0);
                            gt3Var2.setTextSize(1, 16.0f);
                            gt3Var2.setInputType(573441);
                            gt3Var2.setRawInputType(573441);
                            zkb.D(gt3Var2, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var2, 30, bkb.F6, y99Var.J0);
                            gt3Var2.setCursorSize(gl.L(19.0f));
                            gt3Var2.setCursorWidth(1.5f);
                            gt3Var2.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var2, bkb.D8, y99Var.J0);
                            gt3Var2.setBackground(null);
                            frameLayout2.addView(gt3Var2, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var2.addTextChangedListener(new qy(strArr2, i24Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                cs5Var2.q(frameLayout2, nme.o(-1, 44));
                                cs5Var2.j();
                            }
                            if (!q99Var2.k.isEmpty()) {
                                cs5Var2.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 1), false);
                            }
                            cs5Var2.p(i24Var2);
                            cs5Var2.a0();
                            break;
                        }
                        break;
                    default:
                        q99 q99Var3 = x99Var2.c;
                        if (!q99Var3.h.isEmpty()) {
                            final cs5 cs5Var3 = new cs5(y99Var.c, y99Var.J0, y99Var.Y1, false, true, false);
                            cs5Var3.t = false;
                            cs5Var3.b0 = true;
                            cs5Var3.b0(0.0f, gl.L(-8.0f));
                            cs5Var3.U = true;
                            cs5Var3.p = new en1(cs5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(q99Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: v99
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    byte b82 = b6;
                                    x99 x99Var3 = x99Var2;
                                    switch (b82) {
                                        case 0:
                                            Integer num = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) x99Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 != null) {
                                                return num2.intValue() - num.intValue();
                                            }
                                            return -1;
                                        case 1:
                                            Integer num3 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) x99Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 != null) {
                                                return num4.intValue() - num3.intValue();
                                            }
                                            return -1;
                                        default:
                                            Integer num5 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) x99Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i3 = y99Var.a;
                            i8c i8cVar3 = new i8c() { // from class: r99
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v12, types: [int] */
                                /* JADX WARN: Type inference failed for: r3v14 */
                                /* JADX WARN: Type inference failed for: r3v18 */
                                @Override // i8c
                                public final void a(Object obj, Object obj2) {
                                    String str2;
                                    String str3;
                                    boolean z;
                                    String str4;
                                    byte b92 = b5;
                                    boolean z2 = false;
                                    String str5 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    x99 x99Var3 = x99Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b92) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gl.I3(lowerCase);
                                            q99 q99Var22 = x99Var3.c;
                                            boolean isEmpty = q99Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i22 = 0;
                                            while (i22 < size) {
                                                Object obj3 = arrayList22.get(i22);
                                                i22++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = q99Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) q99Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i32 = k99.b;
                                                    c4c K = c4c.K(k99.class);
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
                                                arrayList32.add(g99.i(k96.M0(2131749994, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gl.I3(lowerCase2);
                                            q99 q99Var32 = x99Var3.c;
                                            boolean isEmpty2 = q99Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                Object obj4 = arrayList22.get(i4);
                                                i4++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = q99Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str3 = str2;
                                                } else {
                                                    str3 = str2;
                                                    str2 = (de9.t(str3, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(str3.concat(I32))) ? " " : str3;
                                                }
                                                Integer num2 = (Integer) q99Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                                int i5 = d99.b;
                                                c4c K2 = c4c.K(d99.class);
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
                                                arrayList4.add(g99.i(k96.M0(2131749999, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gl.I3(lowerCase3);
                                            q99 q99Var4 = x99Var3.c;
                                            boolean isEmpty3 = q99Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i6 = 0;
                                            while (i6 < size3) {
                                                Object obj5 = arrayList22.get(i6);
                                                i6++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = q99Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(I33) || de9.t(str5, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
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
                                                Integer num3 = (Integer) q99Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                ?? intValue3 = num3 == null ? z : num3.intValue();
                                                int i7 = n99.b;
                                                c4c K3 = c4c.K(n99.class);
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
                                                arrayList5.add(g99.i(k96.M0(2131749992, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            n8c n8cVar3 = new n8c() { // from class: s99
                                @Override // n8c
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b92 = b5;
                                    int i22 = 0;
                                    cs5 cs5Var22 = cs5Var3;
                                    x99 x99Var3 = x99Var2;
                                    c4c c4cVar = (c4c) obj;
                                    switch (b92) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c4cVar.H).document.id;
                                            boolean contains = x99Var3.c.j.contains(Long.valueOf(j));
                                            q99 q99Var22 = x99Var3.c;
                                            if (contains) {
                                                q99Var22.j.remove(Long.valueOf(j));
                                            } else {
                                                HashSet hashSet = q99Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = q99Var22.f;
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
                                            q99Var22.m();
                                            cs5Var22.u();
                                            break;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c4cVar.H).backdrop_id;
                                            boolean contains2 = x99Var3.c.k.contains(Integer.valueOf(i32));
                                            q99 q99Var32 = x99Var3.c;
                                            if (contains2) {
                                                q99Var32.k.remove(Integer.valueOf(i32));
                                            } else {
                                                HashSet hashSet2 = q99Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = q99Var32.g;
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
                                            q99Var32.m();
                                            cs5Var22.u();
                                            break;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c4cVar.H).document.id;
                                            boolean contains3 = x99Var3.c.l.contains(Long.valueOf(j3));
                                            q99 q99Var4 = x99Var3.c;
                                            if (contains3) {
                                                q99Var4.l.remove(Long.valueOf(j3));
                                            } else {
                                                HashSet hashSet3 = q99Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = q99Var4.h;
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
                                            q99Var4.m();
                                            cs5Var22.u();
                                            break;
                                    }
                                }
                            };
                            wjb wjbVar3 = y99Var.J0;
                            Context context4 = context;
                            i24 i24Var3 = new i24(context4, i3, 0, false, i8cVar3, n8cVar3, null, wjbVar3, (byte) 7);
                            i24Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            zkb.s(imageView3, bkb.E8, y99Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            gt3 gt3Var3 = new gt3(context4, y99Var.J0);
                            gt3Var3.setTextSize(1, 16.0f);
                            gt3Var3.setInputType(573441);
                            gt3Var3.setRawInputType(573441);
                            zkb.D(gt3Var3, bkb.z6, y99Var.J0);
                            zkb.l(gt3Var3, 30, bkb.F6, y99Var.J0);
                            gt3Var3.setCursorSize(gl.L(19.0f));
                            gt3Var3.setCursorWidth(1.5f);
                            gt3Var3.setHint(k96.M0(2131749993, null));
                            zkb.X(gt3Var3, bkb.D8, y99Var.J0);
                            gt3Var3.setBackground(null);
                            frameLayout3.addView(gt3Var3, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            gt3Var3.addTextChangedListener(new qy(strArr3, i24Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                cs5Var3.q(frameLayout3, nme.o(-1, 44));
                                cs5Var3.j();
                            }
                            if (!q99Var3.l.isEmpty()) {
                                cs5Var3.b(R.drawable.msg_select, k96.M0(2131745478, null), new t99(x99Var2, (byte) 2), false);
                            }
                            cs5Var3.p(i24Var3);
                            cs5Var3.a0();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        r35 r35Var = new r35(3);
        r35Var.O = new nq1(this, (byte) 14);
        this.n1.setLayoutManager(r35Var);
        this.n1.setOnItemClickListener(new kq8(this, x99Var, (byte) 6));
        this.n1.setPadding(gl.L(8.0f) + this.u0, 0, gl.L(8.0f) + this.u0, 0);
        this.n1.setOnScrollListener(new n58(this, (byte) 12));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        this.n1.setItemSelectorColorProvider(new sc8((byte) 18));
        hpa hpaVar = new hpa(context);
        this.Z1 = hpaVar;
        int L = gl.L(20.0f);
        int L2 = gl.L(9.0f);
        hpaVar.h = L;
        hpaVar.n = L2;
        hpaVar.setRoundRadius(gl.L(22.0f));
        hpaVar.setFullRect(true);
        gl.k2(new ae9(hpaVar, (byte) 8), 12.0f, 12, new ArrayList());
        hpaVar.setPivotY(0.0f);
        this.c.addView(hpaVar, nme.e(-1, -2, 55));
        this.d2.O(false);
        x99Var.d = new u99(this, b3);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        vb vbVar = new vb(this, o39Var, getContext(), this.a, new tf8(this, (byte) 9), this.J0, (byte) 3);
        this.d2 = vbVar;
        return vbVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        String str = this.S1;
        return str != null ? str : k96.M0(2131749755, null);
    }

    @Override // fy0
    public final void O0(float f) {
        float y = this.b.getY() + f;
        hpa hpaVar = this.Z1;
        float measuredHeight = y - hpaVar.getMeasuredHeight();
        float l = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + gl.L(8.0f)) / hpaVar.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l = Math.min(l, Utilities.l(1.0f - ((measuredHeight - height) / gl.N(128.0f))));
        }
        hpaVar.setScaleX(l);
        hpaVar.setScaleY(l);
        hpaVar.setAlpha(gl.x1(l, 0.5f, 1.0f));
        hpaVar.setTranslationY(measuredHeight);
    }

    public final void Y0() {
        int R;
        c4c G;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            o39 o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i);
            if ((childAt instanceof pi4) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.d2.G(R)) != null) {
                if (G.d < 10) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        x99 x99Var = this.T1;
        if (z) {
            x99Var.b.a();
        }
        if (z2) {
            x99Var.c.l(false);
        }
    }
}
