package ph;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ny;
import org.telegram.ui.rv0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q3 extends ha {
    public static final /* synthetic */ int c2 = 0;
    public final String P1;
    public final p3 Q1;
    public final HorizontalScrollView R1;
    public final z2 S1;
    public final z2 T1;
    public final z2 U1;
    public final z2 V1;
    public final rh.n2 W1;
    public rh.e1 X1;
    public final HashSet Y1;
    public boolean Z1;
    public o3 a2;
    public boolean b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(final Context context, String str, final p3 p3Var) {
        super(2, context, (p6) null, false);
        final int i10 = 2;
        final int i11 = 0;
        this.Y1 = new HashSet();
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        O();
        this.P1 = str;
        this.Q1 = p3Var;
        this.l1.setTitle(O0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.R1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        z2 z2Var = new z2(context, this.I0);
        this.S1 = z2Var;
        z2Var.setSorting(p3Var.c.p);
        linearLayout.addView(z2Var, b6.t(-2, -2, 16, 0, 0, 6, 0));
        z2Var.setOnClickListener(new rv0(21, this, p3Var));
        z2 z2Var2 = new z2(context, this.I0);
        this.T1 = z2Var2;
        z2Var2.setValue(cd.L0(2131750396, null));
        linearLayout.addView(z2Var2, b6.t(-2, -2, 16, 0, 0, 6, 0));
        z2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ph.n3
            public final /* synthetic */ q3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                final p3 p3Var2 = p3Var;
                q3 q3Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i12) {
                    case 0:
                        h3 h3Var = p3Var2.c;
                        if (!h3Var.f.isEmpty()) {
                            final z60 z60Var = new z60(q3Var.c, q3Var.I0, q3Var.T1, false, true, false);
                            z60Var.t = false;
                            z60Var.Y = true;
                            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var.R = true;
                            z60Var.p = new bi.j(z60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(h3Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i16 = q3Var.a;
                            final int i17 = 0;
                            Context context2 = context;
                            ny nyVar = new ny(context2, i16, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i18 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr2 = strArr;
                                    switch (i18) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var2 = p3Var3.c;
                                            boolean isEmpty = h3Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i19 = 0;
                                            while (i19 < size) {
                                                Object obj3 = arrayList2.get(i19);
                                                i19++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var3 = p3Var3.c;
                                            boolean isEmpty2 = h3Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList2.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList2.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i17) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var2 = p3Var2.c;
                                            HashSet hashSet = h3Var2.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList2 = h3Var2.f;
                                                int size = arrayList2.size();
                                                int i18 = 0;
                                                while (i18 < size) {
                                                    Object obj3 = arrayList2.get(i18);
                                                    i18++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var2.h();
                                            z60Var.u();
                                            break;
                                        case 1:
                                            int i19 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var3 = p3Var2.c;
                                            HashSet hashSet2 = h3Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i19))) {
                                                hashSet2.remove(Integer.valueOf(i19));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = h3Var3.g;
                                                int size2 = arrayList3.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList3.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i19) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i19));
                                            }
                                            h3Var3.h();
                                            z60Var.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 6);
                            nyVar.f3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, q3Var.I0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            a7.E(mtVar, t6.A6, q3Var.I0);
                            a7.m(mtVar, 30, t6.G6, q3Var.I0);
                            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar, t6.E8, q3Var.I0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new ag.u2(14, strArr, nyVar));
                            if (arrayList.size() > 8) {
                                z60Var.r(frameLayout, b6.o(-1, 44));
                                z60Var.k();
                            }
                            if (!h3Var.j.isEmpty()) {
                                z60Var.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 0), false);
                            }
                            z60Var.q(nyVar);
                            z60Var.Z();
                            break;
                        }
                        break;
                    case 1:
                        h3 h3Var2 = p3Var2.c;
                        if (!h3Var2.g.isEmpty()) {
                            final z60 z60Var2 = new z60(q3Var.c, q3Var.I0, q3Var.U1, false, true, false);
                            z60Var2.t = false;
                            z60Var2.Y = true;
                            z60Var2.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var2.R = true;
                            z60Var2.p = new bi.j(z60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(h3Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i19 = q3Var.a;
                            Context context3 = context;
                            ny nyVar2 = new ny(context3, i19, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var3 = p3Var3.c;
                                            boolean isEmpty2 = h3Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i14) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var2.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var3 = p3Var2.c;
                                            HashSet hashSet2 = h3Var3.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList3 = h3Var3.g;
                                                int size2 = arrayList3.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList3.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var3.h();
                                            z60Var2.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var2.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 7);
                            nyVar2.f3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView2, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, q3Var.I0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            a7.E(mtVar2, t6.A6, q3Var.I0);
                            a7.m(mtVar2, 30, t6.G6, q3Var.I0);
                            mtVar2.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar2, t6.E8, q3Var.I0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new ag.u2(15, strArr2, nyVar2));
                            if (arrayList2.size() > 8) {
                                z60Var2.r(frameLayout2, b6.o(-1, 44));
                                z60Var2.k();
                            }
                            if (!h3Var2.k.isEmpty()) {
                                z60Var2.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 1), false);
                            }
                            z60Var2.q(nyVar2);
                            z60Var2.Z();
                            break;
                        }
                        break;
                    default:
                        h3 h3Var3 = p3Var2.c;
                        if (!h3Var3.h.isEmpty()) {
                            final z60 z60Var3 = new z60(q3Var.c, q3Var.I0, q3Var.V1, false, true, false);
                            z60Var3.t = false;
                            z60Var3.Y = true;
                            z60Var3.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var3.R = true;
                            z60Var3.p = new bi.j(z60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(h3Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            Context context4 = context;
                            ny nyVar3 = new ny(context4, q3Var.a, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i13) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var3.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var3.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var3.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 8);
                            nyVar3.f3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView3, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, q3Var.I0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            a7.E(mtVar3, t6.A6, q3Var.I0);
                            a7.m(mtVar3, 30, t6.G6, q3Var.I0);
                            mtVar3.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar3, t6.E8, q3Var.I0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new ag.u2(16, strArr3, nyVar3));
                            if (arrayList3.size() > 8) {
                                z60Var3.r(frameLayout3, b6.o(-1, 44));
                                z60Var3.k();
                            }
                            if (!h3Var3.l.isEmpty()) {
                                z60Var3.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 2), false);
                            }
                            z60Var3.q(nyVar3);
                            z60Var3.Z();
                            break;
                        }
                        break;
                }
            }
        });
        z2 z2Var3 = new z2(context, this.I0);
        this.U1 = z2Var3;
        z2Var3.setValue(cd.L0(2131750397, null));
        linearLayout.addView(z2Var3, b6.t(-2, -2, 16, 0, 0, 6, 0));
        final int i12 = 1;
        z2Var3.setOnClickListener(new View.OnClickListener(this) { // from class: ph.n3
            public final /* synthetic */ q3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                final p3 p3Var2 = p3Var;
                q3 q3Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i122) {
                    case 0:
                        h3 h3Var = p3Var2.c;
                        if (!h3Var.f.isEmpty()) {
                            final z60 z60Var = new z60(q3Var.c, q3Var.I0, q3Var.T1, false, true, false);
                            z60Var.t = false;
                            z60Var.Y = true;
                            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var.R = true;
                            z60Var.p = new bi.j(z60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(h3Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i16 = q3Var.a;
                            final int i17 = 0;
                            Context context2 = context;
                            ny nyVar = new ny(context2, i16, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i17) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 6);
                            nyVar.f3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, q3Var.I0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            a7.E(mtVar, t6.A6, q3Var.I0);
                            a7.m(mtVar, 30, t6.G6, q3Var.I0);
                            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar, t6.E8, q3Var.I0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new ag.u2(14, strArr, nyVar));
                            if (arrayList.size() > 8) {
                                z60Var.r(frameLayout, b6.o(-1, 44));
                                z60Var.k();
                            }
                            if (!h3Var.j.isEmpty()) {
                                z60Var.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 0), false);
                            }
                            z60Var.q(nyVar);
                            z60Var.Z();
                            break;
                        }
                        break;
                    case 1:
                        h3 h3Var2 = p3Var2.c;
                        if (!h3Var2.g.isEmpty()) {
                            final z60 z60Var2 = new z60(q3Var.c, q3Var.I0, q3Var.U1, false, true, false);
                            z60Var2.t = false;
                            z60Var2.Y = true;
                            z60Var2.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var2.R = true;
                            z60Var2.p = new bi.j(z60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(h3Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i19 = q3Var.a;
                            Context context3 = context;
                            ny nyVar2 = new ny(context3, i19, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i14) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var2.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var2.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var2.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 7);
                            nyVar2.f3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView2, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, q3Var.I0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            a7.E(mtVar2, t6.A6, q3Var.I0);
                            a7.m(mtVar2, 30, t6.G6, q3Var.I0);
                            mtVar2.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar2, t6.E8, q3Var.I0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new ag.u2(15, strArr2, nyVar2));
                            if (arrayList2.size() > 8) {
                                z60Var2.r(frameLayout2, b6.o(-1, 44));
                                z60Var2.k();
                            }
                            if (!h3Var2.k.isEmpty()) {
                                z60Var2.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 1), false);
                            }
                            z60Var2.q(nyVar2);
                            z60Var2.Z();
                            break;
                        }
                        break;
                    default:
                        h3 h3Var3 = p3Var2.c;
                        if (!h3Var3.h.isEmpty()) {
                            final z60 z60Var3 = new z60(q3Var.c, q3Var.I0, q3Var.V1, false, true, false);
                            z60Var3.t = false;
                            z60Var3.Y = true;
                            z60Var3.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var3.R = true;
                            z60Var3.p = new bi.j(z60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(h3Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            Context context4 = context;
                            ny nyVar3 = new ny(context4, q3Var.a, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i13) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var3.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var3.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var3.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 8);
                            nyVar3.f3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView3, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, q3Var.I0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            a7.E(mtVar3, t6.A6, q3Var.I0);
                            a7.m(mtVar3, 30, t6.G6, q3Var.I0);
                            mtVar3.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar3, t6.E8, q3Var.I0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new ag.u2(16, strArr3, nyVar3));
                            if (arrayList3.size() > 8) {
                                z60Var3.r(frameLayout3, b6.o(-1, 44));
                                z60Var3.k();
                            }
                            if (!h3Var3.l.isEmpty()) {
                                z60Var3.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 2), false);
                            }
                            z60Var3.q(nyVar3);
                            z60Var3.Z();
                            break;
                        }
                        break;
                }
            }
        });
        z2 z2Var4 = new z2(context, this.I0);
        this.V1 = z2Var4;
        z2Var4.setValue(cd.L0(2131750389, null));
        linearLayout.addView(z2Var4, b6.t(-2, -2, 16, 0, 0, 0, 0));
        z2Var4.setOnClickListener(new View.OnClickListener(this) { // from class: ph.n3
            public final /* synthetic */ q3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i10;
                final p3 p3Var2 = p3Var;
                q3 q3Var = this.b;
                final int i13 = 2;
                final int i14 = 1;
                switch (i122) {
                    case 0:
                        h3 h3Var = p3Var2.c;
                        if (!h3Var.f.isEmpty()) {
                            final z60 z60Var = new z60(q3Var.c, q3Var.I0, q3Var.T1, false, true, false);
                            z60Var.t = false;
                            z60Var.Y = true;
                            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var.R = true;
                            z60Var.p = new bi.j(z60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(h3Var.f);
                            final int i15 = 2;
                            Collections.sort(arrayList, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i16 = q3Var.a;
                            final int i17 = 0;
                            Context context2 = context;
                            ny nyVar = new ny(context2, i16, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i17;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i17) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 6);
                            nyVar.f3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, q3Var.I0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            a7.E(mtVar, t6.A6, q3Var.I0);
                            a7.m(mtVar, 30, t6.G6, q3Var.I0);
                            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar, t6.E8, q3Var.I0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new ag.u2(14, strArr, nyVar));
                            if (arrayList.size() > 8) {
                                z60Var.r(frameLayout, b6.o(-1, 44));
                                z60Var.k();
                            }
                            if (!h3Var.j.isEmpty()) {
                                z60Var.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 0), false);
                            }
                            z60Var.q(nyVar);
                            z60Var.Z();
                            break;
                        }
                        break;
                    case 1:
                        h3 h3Var2 = p3Var2.c;
                        if (!h3Var2.g.isEmpty()) {
                            final z60 z60Var2 = new z60(q3Var.c, q3Var.I0, q3Var.U1, false, true, false);
                            z60Var2.t = false;
                            z60Var2.Y = true;
                            z60Var2.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var2.R = true;
                            z60Var2.p = new bi.j(z60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(h3Var2.g);
                            final int i18 = 0;
                            Collections.sort(arrayList2, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i19 = q3Var.a;
                            Context context3 = context;
                            ny nyVar2 = new ny(context3, i19, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i14;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i14) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var2.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var2.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var2.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 7);
                            nyVar2.f3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView2, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, q3Var.I0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            a7.E(mtVar2, t6.A6, q3Var.I0);
                            a7.m(mtVar2, 30, t6.G6, q3Var.I0);
                            mtVar2.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar2, t6.E8, q3Var.I0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new ag.u2(15, strArr2, nyVar2));
                            if (arrayList2.size() > 8) {
                                z60Var2.r(frameLayout2, b6.o(-1, 44));
                                z60Var2.k();
                            }
                            if (!h3Var2.k.isEmpty()) {
                                z60Var2.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 1), false);
                            }
                            z60Var2.q(nyVar2);
                            z60Var2.Z();
                            break;
                        }
                        break;
                    default:
                        h3 h3Var3 = p3Var2.c;
                        if (!h3Var3.h.isEmpty()) {
                            final z60 z60Var3 = new z60(q3Var.c, q3Var.I0, q3Var.V1, false, true, false);
                            z60Var3.t = false;
                            z60Var3.Y = true;
                            z60Var3.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var3.R = true;
                            z60Var3.p = new bi.j(z60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(h3Var3.h);
                            Collections.sort(arrayList3, new Comparator() { // from class: ph.m3
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) p3Var4.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) p3Var5.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            Context context4 = context;
                            ny nyVar3 = new ny(context4, q3Var.a, 0, false, new j20() { // from class: ph.i3
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v25, types: [int] */
                                /* JADX WARN: Type inference failed for: r2v27 */
                                /* JADX WARN: Type inference failed for: r2v28 */
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj, Object obj2) {
                                    int i182 = i13;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i182) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.c;
                                            boolean isEmpty = h3Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i192 = 0;
                                            while (i192 < size) {
                                                Object obj3 = arrayList22.get(i192);
                                                i192++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    int intValue = num == null ? 0 : num.intValue();
                                                    int i20 = b3.b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.l = lowerCase;
                                                    K.z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        z11 = (isEmpty || contains) ? false : true;
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.c;
                                            boolean isEmpty2 = h3Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj4 = arrayList22.get(i21);
                                                i21++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    int intValue2 = num2 == null ? 0 : num2.intValue();
                                                    int i22 = v2.b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.l = lowerCase2;
                                                    K2.z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        z12 = (isEmpty2 || contains2) ? false : true;
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                break;
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.c;
                                            boolean isEmpty3 = h3Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i23 = 0;
                                            while (i23 < size3) {
                                                Object obj5 = arrayList22.get(i23);
                                                i23++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                    ?? intValue3 = num3 == null ? z13 : num3.intValue();
                                                    int i24 = e3.b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.l = lowerCase3;
                                                    K3.z = intValue3;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        z14 = (isEmpty3 || contains3) ? z13 : true;
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, new o20() { // from class: ph.j3
                                @Override // org.telegram.messenger.o20
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    switch (i13) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.id;
                                            h3 h3Var22 = p3Var2.c;
                                            HashSet hashSet = h3Var22.j;
                                            if (hashSet.contains(Long.valueOf(j10))) {
                                                hashSet.remove(Long.valueOf(j10));
                                            } else if (hashSet.isEmpty()) {
                                                ArrayList arrayList22 = h3Var22.f;
                                                int size = arrayList22.size();
                                                int i182 = 0;
                                                while (i182 < size) {
                                                    Object obj3 = arrayList22.get(i182);
                                                    i182++;
                                                    long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                    if (j11 != j10) {
                                                        hashSet.add(Long.valueOf(j11));
                                                    }
                                                }
                                            } else {
                                                hashSet.add(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var3.u();
                                            break;
                                        case 1:
                                            int i192 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.c;
                                            HashSet hashSet2 = h3Var32.k;
                                            if (hashSet2.contains(Integer.valueOf(i192))) {
                                                hashSet2.remove(Integer.valueOf(i192));
                                            } else if (hashSet2.isEmpty()) {
                                                ArrayList arrayList32 = h3Var32.g;
                                                int size2 = arrayList32.size();
                                                int i20 = 0;
                                                while (i20 < size2) {
                                                    Object obj4 = arrayList32.get(i20);
                                                    i20++;
                                                    int i21 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                    if (i21 != i192) {
                                                        hashSet2.add(Integer.valueOf(i21));
                                                    }
                                                }
                                            } else {
                                                hashSet2.add(Integer.valueOf(i192));
                                            }
                                            h3Var32.h();
                                            z60Var3.u();
                                            break;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.id;
                                            h3 h3Var4 = p3Var2.c;
                                            HashSet hashSet3 = h3Var4.l;
                                            if (hashSet3.contains(Long.valueOf(j12))) {
                                                hashSet3.remove(Long.valueOf(j12));
                                            } else if (hashSet3.isEmpty()) {
                                                ArrayList arrayList4 = h3Var4.h;
                                                int size3 = arrayList4.size();
                                                int i22 = 0;
                                                while (i22 < size3) {
                                                    Object obj5 = arrayList4.get(i22);
                                                    i22++;
                                                    long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                    if (j13 != j12) {
                                                        hashSet3.add(Long.valueOf(j13));
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var3.u();
                                            break;
                                    }
                                }
                            }, null, q3Var.I0, 8);
                            nyVar3.f3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(R.drawable.smiles_inputsearch);
                            a7.t(imageView3, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, q3Var.I0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            a7.E(mtVar3, t6.A6, q3Var.I0);
                            a7.m(mtVar3, 30, t6.G6, q3Var.I0);
                            mtVar3.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar3, t6.E8, q3Var.I0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new ag.u2(16, strArr3, nyVar3));
                            if (arrayList3.size() > 8) {
                                z60Var3.r(frameLayout3, b6.o(-1, 44));
                                z60Var3.k();
                            }
                            if (!h3Var3.l.isEmpty()) {
                                z60Var3.c(R.drawable.msg_select, cd.L0(2131745687, null), new k3(p3Var2, 2), false);
                            }
                            z60Var3.q(nyVar3);
                            z60Var3.Z();
                            break;
                        }
                        break;
                }
            }
        });
        getContext();
        s4.r rVar = new s4.r(3);
        int i13 = 12;
        rVar.O = new jg.h1(this, i13);
        this.k1.setLayoutManager(rVar);
        this.k1.setOnItemClickListener(new org.telegram.ui.web.k0(6, this, p3Var));
        this.k1.setPadding(org.telegram.messenger.i0.L(8.0f) + this.t0, 0, org.telegram.messenger.i0.L(8.0f) + this.t0, 0);
        this.k1.setOnScrollListener(new bu0(this, i13));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        this.k1.setItemSelectorColorProvider(new org.telegram.utils.twidget.t(9));
        rh.n2 n2Var = new rh.n2(context);
        this.W1 = n2Var;
        int L = org.telegram.messenger.i0.L(20.0f);
        int L2 = org.telegram.messenger.i0.L(9.0f);
        n2Var.h = L;
        n2Var.n = L2;
        n2Var.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
        n2Var.setFullRect(true);
        org.telegram.messenger.i0.m2(new h1(n2Var, 10), 12.0f, 12, new ArrayList());
        n2Var.setPivotY(0.0f);
        this.c.addView(n2Var, b6.e(-1, -2, 55));
        this.a2.O(false);
        p3Var.d = new l3(this, i12);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        o3 o3Var = new o3(this, tk0Var, getContext(), this.a, new ag.a(this, 28), this.I0, 0);
        this.a2 = o3Var;
        return o3Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        String str = this.P1;
        return str != null ? str : cd.L0(2131749780, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void T0(float f7) {
        float y3 = this.b.getY() + f7;
        rh.n2 n2Var = this.W1;
        float measuredHeight = y3 - n2Var.getMeasuredHeight();
        float l4 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.i0.L(8.0f)) / n2Var.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l4 = Math.min(l4, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.i0.N(128.0f))));
        }
        n2Var.setScaleX(l4);
        n2Var.setScaleY(l4);
        n2Var.setAlpha(org.telegram.messenger.i0.z1(l4, 0.5f, 1.0f));
        n2Var.setTranslationY(measuredHeight);
    }

    public final void d1() {
        int R;
        a51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            tk0 tk0Var = this.k1;
            if (i10 >= tk0Var.getChildCount()) {
                break;
            }
            View childAt = tk0Var.getChildAt(i10);
            if ((childAt instanceof zz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.a2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        p3 p3Var = this.Q1;
        if (z10) {
            p3Var.b.b();
        }
        if (z11) {
            p3Var.c.g(false);
        }
    }
}
